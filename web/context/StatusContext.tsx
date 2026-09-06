'use client';

import React, { createContext, useContext, useEffect, useState, useCallback } from 'react';

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
    } catch (e) {
      // Keep last known status on transient network glitch
    } finally {
      setLoading(false);
    }
  }, []);

  useEffect(() => {
    fetchStatus();
    const interval = setInterval(fetchStatus, 4000);
    return () => clearInterval(interval);
  }, [fetchStatus]);

  // Industry Standard: Refetch when window gains focus or tab becomes visible
  useEffect(() => {
    const handleVisibilityOrFocus = () => {
      if (typeof document !== 'undefined' && document.visibilityState === 'visible') {
        fetchStatus();
      }
    };
    window.addEventListener('focus', handleVisibilityOrFocus);
    document.addEventListener('visibilitychange', handleVisibilityOrFocus);
    return () => {
      window.removeEventListener('focus', handleVisibilityOrFocus);
      document.removeEventListener('visibilitychange', handleVisibilityOrFocus);
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
