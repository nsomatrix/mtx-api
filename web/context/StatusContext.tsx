'use client';

import React, { createContext, useContext, useEffect, useState, useCallback } from 'react';
import { db } from '@/lib/firebase';
import { doc, onSnapshot } from 'firebase/firestore';

interface StatusContextType {
  modClientOnline: boolean;
  playerCount: number;
  lastSeenMsAgo: number | null;
  loading: boolean;
  refetchStatus: () => Promise<void>;
}

const StatusContext = createContext<StatusContextType>({
  modClientOnline: false,
  playerCount: 0,
  lastSeenMsAgo: null,
  loading: true,
  refetchStatus: async () => {},
});

export const StatusProvider = ({ children }: { children: React.ReactNode }) => {
  const [modClientOnline, setModClientOnline] = useState<boolean>(false);
  const [playerCount, setPlayerCount] = useState<number>(0);
  const [lastSeenMsAgo, setLastSeenMsAgo] = useState<number | null>(null);
  const [loading, setLoading] = useState<boolean>(true);
  const [lastHeartbeatTimestamp, setLastHeartbeatTimestamp] = useState<number>(0);

  // Fallback REST fetch (only used if Firestore is not initialized)
  const fetchStatus = useCallback(async () => {
    try {
      const res = await fetch('/api/v1/status');
      if (res.ok) {
        const data = await res.json();
        setModClientOnline(!!data.modClientOnline);
        if (typeof data.playerCount === 'number') {
          setPlayerCount(data.playerCount);
        }
        if (data.lastSeenMsAgo !== undefined) {
          setLastSeenMsAgo(data.lastSeenMsAgo);
        }
      }
    } catch {
      // Keep last known status on transient network glitch
    } finally {
      setLoading(false);
    }
  }, []);

  // Real-Time BaaS WebSocket Listener (0 Cloudflare Worker requests)
  useEffect(() => {
    if (!db) {
      // Fallback to throttled polling if Firebase SDK is unavailable
      fetchStatus();
      const interval = setInterval(fetchStatus, 20000);
      return () => clearInterval(interval);
    }

    setLoading(false);

    // 1. Live Heartbeat Listener via Firestore WebSocket
    const unsubHeartbeat = onSnapshot(
      doc(db, 'system', 'heartbeat'),
      (snap) => {
        if (snap.exists()) {
          const data = snap.data();
          if (typeof data.lastActive === 'number') {
            setLastHeartbeatTimestamp(data.lastActive);
          }
        }
      },
      (err) => {
        console.warn('[Status] Firestore realtime heartbeat warning:', err);
      }
    );

    // 2. Live Player Count Listener via Firestore WebSocket
    const unsubPlayers = onSnapshot(
      doc(db, 'system', 'players'),
      (snap) => {
        if (snap.exists()) {
          const data = snap.data();
          if (Array.isArray(data.players)) {
            setPlayerCount(data.players.length);
          }
        }
      },
      (err) => {
        console.warn('[Status] Firestore realtime player count warning:', err);
      }
    );

    return () => {
      unsubHeartbeat();
      unsubPlayers();
    };
  }, [fetchStatus]);

  // Pure local in-memory ticker (Calculates online status with 0 network calls)
  useEffect(() => {
    const updateLiveness = () => {
      if (lastHeartbeatTimestamp > 0) {
        const diff = Date.now() - lastHeartbeatTimestamp;
        setModClientOnline(diff < 45000); // 45s threshold
        setLastSeenMsAgo(diff);
      }
    };

    updateLiveness();
    const ticker = setInterval(updateLiveness, 1000);
    return () => clearInterval(ticker);
  }, [lastHeartbeatTimestamp]);

  // Tab visibility focus handler (Immediate refresh on focus)
  useEffect(() => {
    const handleFocus = () => {
      if (typeof document !== 'undefined' && document.visibilityState === 'visible') {
        if (!db) fetchStatus();
      }
    };
    window.addEventListener('focus', handleFocus);
    document.addEventListener('visibilitychange', handleFocus);
    return () => {
      window.removeEventListener('focus', handleFocus);
      document.removeEventListener('visibilitychange', handleFocus);
    };
  }, [fetchStatus]);

  return (
    <StatusContext.Provider
      value={{
        modClientOnline,
        playerCount,
        lastSeenMsAgo,
        loading,
        refetchStatus: fetchStatus,
      }}
    >
      {children}
    </StatusContext.Provider>
  );
};

export const useStatus = () => useContext(StatusContext);
