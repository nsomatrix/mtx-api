import { PlayerProfile } from './store';
import { db } from './firebase';
import { doc, getDoc, setDoc, onSnapshot } from 'firebase/firestore';

const STORAGE_KEY_PREFIX = 'mtx_saved_targets_';
const COOLDOWN_KEY_PREFIX = 'mtx_refresh_cooldowns_';
export const REFRESH_COOLDOWN_MS = 60 * 1000; // 1 minute (60,000 ms)

export function getSavedTargets(userId: string): PlayerProfile[] {
  if (typeof window === 'undefined' || !userId) return [];
  try {
    const raw = localStorage.getItem(`${STORAGE_KEY_PREFIX}${userId}`);
    if (!raw) return [];
    const parsed = JSON.parse(raw);
    return Array.isArray(parsed) ? parsed : [];
  } catch (e) {
    console.warn('[UserStore] Error reading local target cache:', e);
    return [];
  }
}

export function updateLocalCache(userId: string, targets: PlayerProfile[]) {
  if (typeof window === 'undefined' || !userId) return;
  try {
    localStorage.setItem(`${STORAGE_KEY_PREFIX}${userId}`, JSON.stringify(targets));
  } catch (e) {
    console.warn('[UserStore] Error writing local target cache:', e);
  }
}

// Background fire-and-forget sync to Server API & Firestore (Dual-Engine Non-blocking)
function syncTargetToCloud(userId: string, targets: PlayerProfile[]) {
  if (!userId) return;

  // 1. Sync to Server REST API for multi-device account state
  fetch('/api/v1/user/saved-cards', {
    method: 'POST',
    headers: { 'Content-Type': 'application/json' },
    body: JSON.stringify({ userId, player: targets[0] || {} }),
  }).catch((err) => console.warn('[UserStore] Server API save warning:', err));

  // 2. Sync to Firebase Firestore if db is active
  if (db) {
    try {
      const cleanTargets = JSON.parse(JSON.stringify(targets));
      const userDocRef = doc(db, 'users', userId);
      setDoc(userDocRef, { savedTargets: cleanTargets, lastUpdated: new Date().toISOString() }, { merge: true }).catch(
        (err) => console.warn('[UserStore] Firestore cloud sync background warning:', err)
      );
    } catch (e) {
      console.warn('[UserStore] Error formatting Firestore payload:', e);
    }
  }
}

// Fetch cross-device target cards from Server API & Firestore
export async function fetchSavedTargetsFromCloud(userId: string): Promise<PlayerProfile[]> {
  if (!userId) return getSavedTargets(userId);

  // 1. Try Server API sync first
  try {
    const res = await fetch(`/api/v1/user/saved-cards?userId=${encodeURIComponent(userId)}`);
    if (res.ok) {
      const data = await res.json();
      if (Array.isArray(data.targets) && data.targets.length > 0) {
        updateLocalCache(userId, data.targets);
        return data.targets as PlayerProfile[];
      }
    }
  } catch (err) {
    console.warn('[UserStore] Server API fetch warning:', err);
  }

  // 2. Fallback / supplementary check with Firestore doc
  if (db) {
    try {
      const userDocRef = doc(db, 'users', userId);
      const snap = await getDoc(userDocRef);
      if (snap.exists()) {
        const data = snap.data();
        if (Array.isArray(data.savedTargets) && data.savedTargets.length > 0) {
          updateLocalCache(userId, data.savedTargets);
          return data.savedTargets as PlayerProfile[];
        }
      }
    } catch (e) {
      console.warn('[UserStore] Firestore fetch warning:', e);
    }
  }

  return getSavedTargets(userId);
}

// Subscribe to real-time cloud updates across devices via Firestore WebSocket
export function subscribeToRealtimeCloudTargets(userId: string, onUpdate: (targets: PlayerProfile[]) => void) {
  if (!userId || !db) return () => {};
  try {
    const userDocRef = doc(db, 'users', userId);
    return onSnapshot(
      userDocRef,
      (snap) => {
        if (snap.exists()) {
          const data = snap.data();
          if (Array.isArray(data.savedTargets)) {
            updateLocalCache(userId, data.savedTargets);
            onUpdate(data.savedTargets as PlayerProfile[]);
          }
        }
      },
      (err) => {
        console.warn('[UserStore] Firestore realtime subscription warning:', err);
      }
    );
  } catch (e) {
    return () => {};
  }
}

// Synchronous Instant UI Save Target (0ms Lag, Non-blocking)
export function saveTarget(userId: string, player: PlayerProfile): PlayerProfile[] {
  if (typeof window === 'undefined' || !userId) return [];
  const current = getSavedTargets(userId);
  const exists = current.some((p) => p.name.toLowerCase() === player.name.toLowerCase());
  let updated: PlayerProfile[];
  if (exists) {
    updated = current.map((p) => (p.name.toLowerCase() === player.name.toLowerCase() ? player : p));
  } else {
    updated = [player, ...current];
  }

  // 1. Instant local update (0ms lag)
  updateLocalCache(userId, updated);

  // 2. Non-blocking background cloud & server API sync
  syncTargetToCloud(userId, updated);

  return updated;
}

// Synchronous Instant UI Remove Target (0ms Lag, Non-blocking)
export function removeTarget(userId: string, playerName: string): PlayerProfile[] {
  if (typeof window === 'undefined' || !userId) return [];
  const current = getSavedTargets(userId);
  const updated = current.filter((p) => p.name.toLowerCase() !== playerName.toLowerCase());

  // 1. Instant local update (0ms lag)
  updateLocalCache(userId, updated);

  // 2. Non-blocking background cloud & server API delete sync
  fetch(`/api/v1/user/saved-cards?userId=${encodeURIComponent(userId)}&name=${encodeURIComponent(playerName)}`, {
    method: 'DELETE',
  }).catch((err) => console.warn('[UserStore] Server API delete warning:', err));

  if (db) {
    try {
      const cleanTargets = JSON.parse(JSON.stringify(updated));
      const userDocRef = doc(db, 'users', userId);
      setDoc(userDocRef, { savedTargets: cleanTargets, lastUpdated: new Date().toISOString() }, { merge: true }).catch(
        (err) => console.warn('[UserStore] Firestore remove warning:', err)
      );
    } catch (e) {}
  }

  return updated;
}

export function isTargetSaved(userId: string, playerName: string): boolean {
  if (typeof window === 'undefined' || !userId || !playerName) return false;
  const current = getSavedTargets(userId);
  return current.some((p) => p.name.toLowerCase() === playerName.toLowerCase());
}

export function getRemainingCooldownSeconds(userId: string, playerName: string): number {
  if (typeof window === 'undefined' || !userId || !playerName) return 0;
  try {
    const raw = localStorage.getItem(`${COOLDOWN_KEY_PREFIX}${userId}`);
    if (!raw) return 0;
    const cooldowns: Record<string, number> = JSON.parse(raw);
    const expireTime = cooldowns[playerName.toLowerCase()];
    if (!expireTime) return 0;
    const diffMs = expireTime - Date.now();
    return diffMs > 0 ? Math.ceil(diffMs / 1000) : 0;
  } catch (e) {
    return 0;
  }
}

export function setRefreshCooldown(userId: string, playerName: string): void {
  if (typeof window === 'undefined' || !userId || !playerName) return;
  try {
    const raw = localStorage.getItem(`${COOLDOWN_KEY_PREFIX}${userId}`);
    const cooldowns: Record<string, number> = raw ? JSON.parse(raw) : {};
    cooldowns[playerName.toLowerCase()] = Date.now() + REFRESH_COOLDOWN_MS;
    localStorage.setItem(`${COOLDOWN_KEY_PREFIX}${userId}`, JSON.stringify(cooldowns));
  } catch (e) {
    console.warn('[UserStore] Error setting cooldown:', e);
  }
}
