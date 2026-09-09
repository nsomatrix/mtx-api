import { ChatMessage } from './store';
import { db } from './firebase';
import {
  collection,
  query,
  orderBy,
  limit as firestoreLimit,
  onSnapshot,
} from 'firebase/firestore';

export type SyncMode = 'REALTIME' | 'DELTA' | 'CONNECTING' | 'OFFLINE';

export interface ChatSyncStatus {
  mode: SyncMode;
  label: string;
}

const STORAGE_CACHE_KEY = 'mtx_chat_telemetry_cache';

export function getCachedChatMessages(): ChatMessage[] {
  if (typeof window === 'undefined') return [];
  try {
    const raw = localStorage.getItem(STORAGE_CACHE_KEY);
    if (!raw) return [];
    const parsed = JSON.parse(raw);
    return Array.isArray(parsed) ? parsed : [];
  } catch (e) {
    return [];
  }
}

export function saveCachedChatMessages(messages: ChatMessage[]) {
  if (typeof window === 'undefined') return;
  try {
    localStorage.setItem(STORAGE_CACHE_KEY, JSON.stringify(messages.slice(0, 300)));
  } catch (e) {}
}

export function clearCachedChatMessages() {
  if (typeof window === 'undefined') return;
  try {
    localStorage.removeItem(STORAGE_CACHE_KEY);
  } catch (e) {}
}

/**
 * Dual-Engine Real-Time Telemetry Subscription.
 * Engine 1: Native Firebase Firestore WebSocket Push (0ms latency, push updates).
 * Engine 2: Cursor-based Delta Polling Fallback (transfers only new messages, ultra-lightweight).
 */
export function subscribeToChatTelemetry(
  onUpdate: (messages: ChatMessage[]) => void,
  onStatusChange?: (status: ChatSyncStatus) => void
): () => void {
  let isUnmounted = false;
  let unsubscribeFirestore: (() => void) | null = null;
  let pollingInterval: NodeJS.Timeout | null = null;
  let inMemoryMessages: ChatMessage[] = getCachedChatMessages();
  let latestTimestamp: string | null = inMemoryMessages[0]?.timestamp || null;

  // Immediately notify UI with cached messages if available
  if (inMemoryMessages.length > 0) {
    onUpdate(inMemoryMessages);
  }

  const mergeMessages = (incoming: ChatMessage[]): ChatMessage[] => {
    const map = new Map<string, ChatMessage>();
    // First existing
    inMemoryMessages.forEach((m) => map.set(m.id, m));
    // Then incoming
    incoming.forEach((m) => map.set(m.id, m));
    const merged = Array.from(map.values()).sort(
      (a, b) => new Date(b.timestamp).getTime() - new Date(a.timestamp).getTime()
    );
    const trimmed = merged.slice(0, 500);
    inMemoryMessages = trimmed;
    if (trimmed[0]?.timestamp) {
      latestTimestamp = trimmed[0].timestamp;
    }
    saveCachedChatMessages(trimmed);
    return trimmed;
  };

  const startDeltaPolling = () => {
    if (pollingInterval || isUnmounted) return;
    onStatusChange?.({ mode: 'DELTA', label: 'HTTP DELTA STREAM' });

    const poll = async () => {
      if (isUnmounted) return;
      try {
        const url = latestTimestamp
          ? `/api/v1/chat?since=${encodeURIComponent(latestTimestamp)}`
          : `/api/v1/chat?limit=100`;

        const res = await fetch(url);
        if (res.ok) {
          const data = await res.json();
          const incoming: ChatMessage[] = data.messages || [];
          if (incoming.length > 0) {
            const updated = mergeMessages(incoming);
            onUpdate(updated);
          }
        }
      } catch (err) {
        console.warn('[ChatStore] Delta poll error:', err);
      }
    };

    // Initial fetch to sync up
    poll();
    pollingInterval = setInterval(poll, 2500);
  };

  // Attempt Engine 1: Firebase Firestore Real-Time WebSocket Push
  if (db) {
    try {
      onStatusChange?.({ mode: 'CONNECTING', label: 'CONNECTING FIREBASE...' });
      const q = query(
        collection(db, 'telemetry_chat'),
        orderBy('timestamp', 'desc'),
        firestoreLimit(100)
      );

      unsubscribeFirestore = onSnapshot(
        q,
        (snapshot) => {
          if (isUnmounted) return;
          const liveList: ChatMessage[] = [];
          snapshot.forEach((doc) => {
            const d = doc.data() as ChatMessage;
            if (d && d.message) {
              liveList.push({
                id: doc.id || d.id,
                channel: ((d.channel || 'MAP').toUpperCase()) as ChatMessage['channel'],
                sender: d.sender || 'UNKNOWN',
                recipient: d.recipient,
                message: d.message,
                timestamp: d.timestamp || new Date().toISOString(),
              });
            }
          });

          if (liveList.length > 0) {
            const updated = mergeMessages(liveList);
            onUpdate(updated);
          }
          onStatusChange?.({ mode: 'REALTIME', label: 'REAL-TIME (WS)' });
        },
        (error) => {
          console.warn('[ChatStore] Firestore subscription fallback to polling:', error.message);
          // Graceful fallback to Engine 2
          startDeltaPolling();
        }
      );
    } catch (e) {
      console.warn('[ChatStore] Failed to initialize Firestore listener, falling back to delta polling:', e);
      startDeltaPolling();
    }
  } else {
    // Engine 2: Fallback Delta Poller
    startDeltaPolling();
  }

  return () => {
    isUnmounted = true;
    if (unsubscribeFirestore) {
      unsubscribeFirestore();
    }
    if (pollingInterval) {
      clearInterval(pollingInterval);
    }
  };
}

export async function sendOutboundChat(
  payload: { channel: string; recipient?: string; message: string },
  authToken?: string | null
): Promise<{ success: boolean; error?: string; queued?: ChatMessage }> {
  try {
    const headers: Record<string, string> = {
      'Content-Type': 'application/json',
    };
    if (authToken) {
      headers['Authorization'] = `Bearer ${authToken}`;
    }

    const res = await fetch('/api/v1/chat/send', {
      method: 'POST',
      headers,
      body: JSON.stringify(payload),
    });

    const data = await res.json();
    if (res.ok) {
      return { success: true, queued: data.queued };
    } else {
      return { success: false, error: data.error || 'Failed to dispatch command' };
    }
  } catch (e: any) {
    return { success: false, error: e.message || 'Network error' };
  }
}

export async function clearChatTelemetry(
  authToken?: string | null
): Promise<{ success: boolean; error?: string }> {
  try {
    const headers: Record<string, string> = {};
    if (authToken) {
      headers['Authorization'] = `Bearer ${authToken}`;
    }

    const res = await fetch('/api/v1/chat', {
      method: 'DELETE',
      headers,
    });

    const data = await res.json();
    if (res.ok) {
      clearCachedChatMessages();
      return { success: true };
    } else {
      return { success: false, error: data.error || 'Failed to clear logs' };
    }
  } catch (e: any) {
    return { success: false, error: e.message || 'Network error' };
  }
}

/**
 * Explicit manual telemetry refresh that safely merges latest incoming records
 * into local cache without wiping or truncating multi-channel state.
 */
export async function fetchLatestTelemetry(): Promise<ChatMessage[]> {
  const current = getCachedChatMessages();
  try {
    const res = await fetch('/api/v1/chat?limit=100');
    if (res.ok) {
      const data = await res.json();
      const incoming: ChatMessage[] = data.messages || [];
      const map = new Map<string, ChatMessage>();
      current.forEach((m) => map.set(m.id, m));
      incoming.forEach((m) => {
        const normalized: ChatMessage = {
          ...m,
          channel: ((m.channel || 'MAP').toUpperCase()) as ChatMessage['channel'],
        };
        map.set(normalized.id, normalized);
      });
      const merged = Array.from(map.values()).sort(
        (a, b) => new Date(b.timestamp).getTime() - new Date(a.timestamp).getTime()
      );
      const trimmed = merged.slice(0, 500);
      saveCachedChatMessages(trimmed);
      return trimmed;
    }
  } catch (err) {
    console.warn('[ChatStore] Manual fetch warning:', err);
  }
  return current;
}

