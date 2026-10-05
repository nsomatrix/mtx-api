'use client';

import React, { useState, useEffect, useRef } from 'react';
import { PlayerProfile } from '@/lib/store';
import { db } from '@/lib/firebase';
import { doc, onSnapshot } from 'firebase/firestore';
import {
  Search,
  RefreshCw,
  X,
  Activity,
  Shield,
  Radio,
  Loader2,
  Download,
  Sparkles,
  AlertTriangle,
} from 'lucide-react';
import { PlayerCard } from './player-io/PlayerCard';
import { PlayerStatsModal } from './player-io/PlayerStatsModal';
import { EquipmentModal } from './player-io/EquipmentModal';

const COOLDOWN_KEY_PREFIX = 'mtx_refresh_cooldowns';
const REFRESH_COOLDOWN_MS = 60 * 1000;

function getCooldownSeconds(playerName: string): number {
  if (typeof window === 'undefined' || !playerName) return 0;
  try {
    const raw = localStorage.getItem(COOLDOWN_KEY_PREFIX);
    if (!raw) return 0;
    const cooldowns: Record<string, number> = JSON.parse(raw);
    const expireTime = cooldowns[playerName.toLowerCase()];
    if (!expireTime) return 0;
    const diffMs = expireTime - Date.now();
    return diffMs > 0 ? Math.ceil(diffMs / 1000) : 0;
  } catch {
    return 0;
  }
}

function setCooldownSeconds(playerName: string): void {
  if (typeof window === 'undefined' || !playerName) return;
  try {
    const raw = localStorage.getItem(COOLDOWN_KEY_PREFIX);
    const cooldowns: Record<string, number> = raw ? JSON.parse(raw) : {};
    cooldowns[playerName.toLowerCase()] = Date.now() + REFRESH_COOLDOWN_MS;
    localStorage.setItem(COOLDOWN_KEY_PREFIX, JSON.stringify(cooldowns));
  } catch (e) {
    console.warn('[PlayerIO] Error setting cooldown:', e);
  }
}

export function PlayerIOModule() {
  const [sessionPlayers, setSessionPlayers] = useState<PlayerProfile[]>([]);
  const [targetName, setTargetName] = useState('');
  const [fetching, setFetching] = useState(false);
  const [pendingTargetName, setPendingTargetName] = useState<string | null>(null);
  const [refreshingTarget, setRefreshingTarget] = useState<string | null>(null);
  const [fetchMsg, setFetchMsg] = useState<{ type: 'success' | 'info' | 'loading' | 'error'; text: string } | null>(null);
  const [searchQuery, setSearchQuery] = useState('');
  const [selectedPlayer, setSelectedPlayer] = useState<PlayerProfile | null>(null);
  const [equipmentPlayer, setEquipmentPlayer] = useState<PlayerProfile | null>(null);
  const [cooldowns, setCooldowns] = useState<Record<string, number>>({});

  const timeoutRef = useRef<NodeJS.Timeout | null>(null);
  const fetchStartTimeRef = useRef<number>(0);

  // Lock background page scrolling when a player details or equipment modal is open
  useEffect(() => {
    if (selectedPlayer || equipmentPlayer) {
      document.body.style.overflow = 'hidden';
    } else {
      document.body.style.overflow = '';
    }

    return () => {
      document.body.style.overflow = '';
    };
  }, [selectedPlayer, equipmentPlayer]);

  // Initial REST fetch to populate player cards immediately on page mount
  useEffect(() => {
    fetch('/api/v1/players')
      .then((res) => res.json())
      .then((data) => {
        if (Array.isArray(data.players) && data.players.length > 0) {
          setSessionPlayers((prev) => (prev.length === 0 ? data.players : prev));
        }
      })
      .catch(() => {});
  }, []);

  // Real-Time BaaS WebSocket Listener (0 Cloudflare Edge API Calls)
  useEffect(() => {
    if (!db) return;

    const unsub = onSnapshot(
      doc(db, 'system', 'players'),
      (snap) => {
        if (snap.exists()) {
          const data = snap.data();
          const allPlayers: PlayerProfile[] = Array.isArray(data.players) ? data.players : [];

          // 1. Automatically update existing session cards with fresh data (or populate initial players)
          setSessionPlayers((prev) => {
            if (prev.length === 0) return allPlayers;
            let changed = false;
            const next = prev.map((p) => {
              const fresh = allPlayers.find((ap) => ap.name.toLowerCase() === p.name.toLowerCase());
              if (fresh && fresh.lastUpdated !== p.lastUpdated) {
                changed = true;
                return fresh;
              }
              return p;
            });
            return changed ? next : prev;
          });

          // 2. Automatically update open Modals
          setEquipmentPlayer((prev) => {
            if (!prev) return prev;
            const fresh = allPlayers.find((ap) => ap.name.toLowerCase() === prev.name.toLowerCase());
            return fresh && fresh.lastUpdated !== prev.lastUpdated ? fresh : prev;
          });

          setSelectedPlayer((prev) => {
            if (!prev) return prev;
            const fresh = allPlayers.find((ap) => ap.name.toLowerCase() === prev.name.toLowerCase());
            return fresh && fresh.lastUpdated !== prev.lastUpdated ? fresh : prev;
          });

          // 3. Handle pending inspect target request
          if (pendingTargetName) {
            const found = allPlayers.find(
              (p) => p.name.toLowerCase() === pendingTargetName.toLowerCase()
            );

            const lastUpdatedTime = found && found.lastUpdated ? new Date(found.lastUpdated).getTime() : 0;
            const isFresh = found && (fetchStartTimeRef.current === 0 || lastUpdatedTime >= fetchStartTimeRef.current - 500);

            if (found && isFresh) {
              if (timeoutRef.current) {
                clearTimeout(timeoutRef.current);
                timeoutRef.current = null;
              }

              const isOffline = found.status === 'OFFLINE' || found.online === false || !!found.error;

              setSessionPlayers((prev) => {
                const idx = prev.findIndex((p) => p.name.toLowerCase() === found.name.toLowerCase());
                if (isOffline) {
                  if (idx >= 0) {
                    const updated = [...prev];
                    updated[idx] = { ...updated[idx], online: false, status: 'OFFLINE', error: found.error };
                    return updated;
                  }
                  return prev;
                } else {
                  if (idx >= 0) {
                    const updated = [...prev];
                    updated[idx] = found;
                    return updated;
                  }
                  return [found, ...prev];
                }
              });

              if (isOffline) {
                setFetchMsg({
                  type: 'error',
                  text: `Player "${found.name}" is OFFLINE: ${found.error || 'Not online currently.'}`,
                });
              } else {
                setFetchMsg({ type: 'success', text: `Retrieved live profile for "${found.name}"!` });
              }

              const hasOptions = (found.equipment || []).some((item) => item.options && item.options.length > 0);
              const elapsedMs = fetchStartTimeRef.current > 0 ? Date.now() - fetchStartTimeRef.current : 1000;

              if (hasOptions || elapsedMs >= 1500 || isOffline) {
                setFetching(false);
                setPendingTargetName(null);
                setRefreshingTarget(null);
                setTargetName('');
                fetchStartTimeRef.current = 0;
              }
            }
          }
        }
      },
      (err) => {
        console.warn('[PlayerIO] Firestore realtime players sync warning:', err);
      }
    );

    return () => unsub();
  }, [pendingTargetName]);

  // Cooldown interval timer
  useEffect(() => {
    const timer = setInterval(() => {
      const updated: Record<string, number> = {};
      let changed = false;

      sessionPlayers.forEach((p) => {
        const secs = getCooldownSeconds(p.name);
        if (secs !== (cooldowns[p.name.toLowerCase()] || 0)) {
          updated[p.name.toLowerCase()] = secs;
          changed = true;
        }
      });

      if (changed) {
        setCooldowns((prev) => ({ ...prev, ...updated }));
      }
    }, 1000);

    return () => clearInterval(timer);
  }, [sessionPlayers, cooldowns]);

  const MAX_LIVE_CARDS = 8;

  const handleDismissPlayer = async (playerName: string) => {
    if (refreshingTarget?.toLowerCase() === playerName.toLowerCase()) {
      setRefreshingTarget(null);
    }
    setSessionPlayers((prev) => prev.filter((p) => p.name.toLowerCase() !== playerName.toLowerCase()));
    if (selectedPlayer?.name.toLowerCase() === playerName.toLowerCase()) setSelectedPlayer(null);
    if (equipmentPlayer?.name.toLowerCase() === playerName.toLowerCase()) setEquipmentPlayer(null);
  };

  const handleRefreshTarget = async (player: PlayerProfile) => {
    const cleanName = player.name.trim();
    if (!cleanName) return;

    const remainingSecs = getCooldownSeconds(cleanName);
    if (remainingSecs > 0) {
      setFetchMsg({
        type: 'error',
        text: `Refresh cooldown active for "${cleanName}". Please wait ${remainingSecs}s.`,
      });
      return;
    }

    fetchStartTimeRef.current = Date.now();
    setRefreshingTarget(cleanName);
    setPendingTargetName(cleanName);
    setFetchMsg({ type: 'loading', text: `Refreshing live stats for "${cleanName}"` });

    setCooldownSeconds(cleanName);
    setCooldowns((prev) => ({ ...prev, [cleanName.toLowerCase()]: 60 }));

    try {
      const res = await fetch('/api/v1/inspect', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ name: cleanName }),
      });

      if (!res.ok) {
        const data = await res.json();
        setFetchMsg({ type: 'error', text: data.error || 'Failed to trigger refresh inspection.' });
        setRefreshingTarget(null);
        setPendingTargetName(null);
        fetchStartTimeRef.current = 0;
        return;
      }

      if (timeoutRef.current) clearTimeout(timeoutRef.current);
      timeoutRef.current = setTimeout(() => {
        setFetchMsg({
          type: 'info',
          text: `Refresh queued for "${cleanName}". Profile will update when character is active.`,
        });
        setRefreshingTarget(null);
        setPendingTargetName(null);
        fetchStartTimeRef.current = 0;
      }, 15000);
    } catch {
      setFetchMsg({ type: 'error', text: 'Network connection failed.' });
      setRefreshingTarget(null);
      setPendingTargetName(null);
      fetchStartTimeRef.current = 0;
    }
  };

  const handleFetch = async (e: React.FormEvent) => {
    e.preventDefault();
    const cleanName = targetName.trim();
    if (!cleanName) return;

    const existsAlready = sessionPlayers.some((p) => p.name.toLowerCase() === cleanName.toLowerCase());
    if (!existsAlready && sessionPlayers.length >= MAX_LIVE_CARDS) {
      setFetchMsg({
        type: 'error',
        text: `Session limit reached (${MAX_LIVE_CARDS} max). Clear cards to inspect additional targets.`,
      });
      return;
    }

    fetchStartTimeRef.current = Date.now();
    setFetching(true);
    setPendingTargetName(cleanName);
    setFetchMsg({ type: 'loading', text: `Requesting player info for "${cleanName}"` });

    try {
      const res = await fetch('/api/v1/inspect', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({ name: cleanName }),
      });

      const data = await res.json();
      if (!res.ok) {
        setFetchMsg({ type: 'error', text: data.error || 'Failed to send inspection request' });
        setFetching(false);
        setPendingTargetName(null);
        fetchStartTimeRef.current = 0;
        return;
      }

      setFetchMsg({ type: 'loading', text: `Waiting for game client to inspect "${cleanName}"` });

      if (timeoutRef.current) clearTimeout(timeoutRef.current);
      timeoutRef.current = setTimeout(() => {
        setFetchMsg({
          type: 'info',
          text: `Inspection queued for "${cleanName}". Profile will update when the player is online.`,
        });
        setFetching(false);
        setPendingTargetName(null);
        fetchStartTimeRef.current = 0;
      }, 15000);
    } catch {
      setFetchMsg({ type: 'error', text: 'Unable to connect to service. Please try again.' });
      setFetching(false);
      setPendingTargetName(null);
      fetchStartTimeRef.current = 0;
    }
  };

  const handleSearchSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    const query = searchQuery.trim();
    if (!query) return;

    try {
      const res = await fetch(`/api/v1/players?q=${encodeURIComponent(query)}`);
      if (res.ok) {
        const data = await res.json();
        const results: PlayerProfile[] = data.players || [];
        if (results.length > 0) {
          setSessionPlayers((prev) => {
            const combined = [...prev];
            results.forEach((r) => {
              if (!combined.some((p) => p.name.toLowerCase() === r.name.toLowerCase())) {
                combined.unshift(r);
              }
            });
            return combined;
          });
        }
      }
    } catch (e) {
      console.error('Search lookup error:', e);
    }
  };

  const handleClearSession = () => {
    if (timeoutRef.current) {
      clearTimeout(timeoutRef.current);
      timeoutRef.current = null;
    }
    setSessionPlayers([]);
    setSearchQuery('');
    setFetching(false);
    setPendingTargetName(null);
    setRefreshingTarget(null);
    setTargetName('');
    fetchStartTimeRef.current = 0;
    setFetchMsg(null);
  };

  const cleanSchoolName = (schoolStr: string) => {
    if (!schoolStr) return 'Unknown';
    return schoolStr.replace(/^School:\s*/i, '').trim();
  };

  const formatGender = (genderStr?: string) => {
    if (!genderStr) return 'Male';
    const clean = genderStr.trim().toLowerCase();
    if (clean === 'nữ' || clean === 'female' || clean === '1') return 'Female';
    return 'Male';
  };

  const filteredPlayers = sessionPlayers.filter(
    (p) =>
      p.name.toLowerCase().includes(searchQuery.toLowerCase()) ||
      cleanSchoolName(p.school).toLowerCase().includes(searchQuery.toLowerCase()) ||
      p.class.toLowerCase().includes(searchQuery.toLowerCase()) ||
      (p.gender || '').toLowerCase().includes(searchQuery.toLowerCase()) ||
      (p.clan || p.giaToc || '').toLowerCase().includes(searchQuery.toLowerCase())
  );

  return (
    <div id="player-io-module" className="space-y-6 pt-2 sm:pt-4">
      {/* Module Header Bar */}
      <div className="flex flex-col md:flex-row md:items-center justify-between gap-4 p-4 sm:p-6 rounded-2xl bg-zinc-900/60 border border-zinc-800/80">
        <div className="space-y-1">
          <div className="flex flex-wrap items-center gap-2">
            <h3 className="text-base sm:text-lg font-display font-extrabold text-white">Player IO Engine</h3>
            <span className="px-2 py-0.5 rounded text-[10px] font-mono bg-violet-500/10 text-violet-400 border border-violet-500/20">
              REST TELEMETRY
            </span>
            {sessionPlayers.length > 0 && (
              <span className="flex items-center space-x-1 px-2 py-0.5 rounded text-[10px] font-mono bg-violet-500/20 text-violet-300 border border-violet-500/30">
                <Radio className="w-3 h-3 text-violet-400" />
                <span>
                  ACTIVE IO ({sessionPlayers.length}/{MAX_LIVE_CARDS})
                </span>
              </span>
            )}
          </div>
          <p className="text-xs text-zinc-400 font-sans">
            Enter any player name to trigger on-demand character telemetry and view real-time profile stats.
          </p>
        </div>

        {/* Fetch Target Input Form */}
        <form
          onSubmit={handleFetch}
          className="flex flex-col sm:flex-row items-stretch sm:items-center gap-2.5 w-full md:w-auto"
        >
          <input
            type="text"
            value={targetName}
            onChange={(e) => setTargetName(e.target.value)}
            placeholder="Enter character name"
            className="px-3.5 py-2.5 rounded-xl bg-black border border-zinc-800 focus:border-violet-500 focus:outline-none text-xs text-white font-mono placeholder:text-zinc-600 w-full sm:w-[220px]"
          />
          <button
            type="submit"
            disabled={fetching || !targetName.trim()}
            className="flex items-center justify-center space-x-2 px-4 py-2.5 rounded-xl bg-violet-600 hover:bg-violet-500 text-white font-bold text-xs transition-all disabled:opacity-50 shrink-0 w-full sm:w-auto border-0 outline-none"
          >
            {fetching ? (
              <>
                <Loader2 className="w-4 h-4 animate-spin text-white" />
                <span>Fetching</span>
              </>
            ) : (
              <>
                <Download className="w-4 h-4" />
                <span>Fetch</span>
              </>
            )}
          </button>
        </form>
      </div>

      {/* Dynamic Status Toast Banner */}
      {fetchMsg && (
        <div
          className={`p-3.5 rounded-xl border text-xs font-mono flex items-start sm:items-center justify-between gap-2.5 animate-fade-in ${
            fetchMsg.type === 'success'
              ? 'bg-violet-500/10 border-violet-500/20 text-violet-400'
              : fetchMsg.type === 'error'
              ? 'bg-rose-500/10 border-rose-500/20 text-rose-400'
              : 'bg-cyan-500/10 border-cyan-500/20 text-cyan-400'
          }`}
        >
          <div className="flex items-start sm:items-center space-x-2.5 min-w-0 flex-1">
            {fetchMsg.type === 'success' && <Sparkles className="w-4 h-4 text-violet-400 shrink-0 mt-0.5 sm:mt-0" />}
            {fetchMsg.type === 'loading' && <Loader2 className="w-4 h-4 animate-spin text-cyan-400 shrink-0 mt-0.5 sm:mt-0" />}
            {fetchMsg.type === 'info' && <Radio className="w-4 h-4 text-cyan-400 shrink-0 mt-0.5 sm:mt-0" />}
            {fetchMsg.type === 'error' && <AlertTriangle className="w-4 h-4 text-rose-400 shrink-0 mt-0.5 sm:mt-0" />}
            <span className="break-words leading-relaxed whitespace-normal">{fetchMsg.text}</span>
          </div>
          <button
            onClick={() => setFetchMsg(null)}
            className="hover:opacity-75 shrink-0 p-0.5 rounded-lg border-0 outline-none"
          >
            <X className="w-4 h-4" />
          </button>
        </div>
      )}

      {/* Search & Actions Bar */}
      <div className="flex flex-col sm:flex-row items-stretch sm:items-center justify-between gap-3 p-2 bg-zinc-950 rounded-2xl border border-zinc-800">
        <div className="flex items-center space-x-2 px-2 text-xs font-mono text-zinc-400">
          <Activity className="w-3.5 h-3.5 text-violet-400" />
          <span>Active IO Cards ({sessionPlayers.length})</span>
        </div>

        <div className="flex items-center gap-2 w-full sm:w-auto">
          <form onSubmit={handleSearchSubmit} className="relative flex-1 sm:w-[260px]">
            <Search className="absolute left-3 top-1/2 -translate-y-1/2 w-3.5 h-3.5 text-zinc-500" />
            <input
              type="text"
              value={searchQuery}
              onChange={(e) => setSearchQuery(e.target.value)}
              placeholder="Search IO cards..."
              className="w-full pl-8 pr-3 py-2 rounded-xl bg-zinc-900 border border-zinc-800 focus:border-violet-500 focus:outline-none text-xs text-white font-mono placeholder:text-zinc-600"
            />
          </form>

          {sessionPlayers.length > 0 && (
            <button
              type="button"
              onClick={handleClearSession}
              className="flex items-center justify-center space-x-1.5 px-3 py-2 rounded-xl bg-zinc-900 border border-zinc-800 text-xs text-zinc-400 hover:text-white transition-colors border-0 outline-none shrink-0"
              title="Clear all cards"
            >
              <RefreshCw className="w-3.5 h-3.5" />
              <span className="hidden sm:inline">Clear All</span>
            </button>
          )}
        </div>
      </div>

      {/* Cards Grid Container */}
      {filteredPlayers.length === 0 ? (
        <div className="py-16 text-center border border-dashed border-zinc-800/80 rounded-2xl p-8 bg-zinc-950/40 text-xs text-zinc-500 font-mono space-y-3">
          <div className="w-12 h-12 rounded-2xl bg-zinc-900 border border-zinc-800 flex items-center justify-center mx-auto text-zinc-400">
            <Shield className="w-6 h-6 text-violet-400" />
          </div>
          <div className="space-y-1">
            <p className="text-sm font-semibold text-zinc-300 font-sans">No Active Inspection Targets</p>
            <p className="text-zinc-500 max-w-sm mx-auto font-sans">
              Enter a Ninja character name above and click Fetch to inspect player profile in real-time.
            </p>
          </div>
        </div>
      ) : (
        <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-4">
          {filteredPlayers.map((p) => {
            const remainingSecs = cooldowns[p.name.toLowerCase()] || 0;
            const isRefreshingThis = refreshingTarget?.toLowerCase() === p.name.toLowerCase();

            return (
              <PlayerCard
                key={p.name}
                player={p}
                remainingCooldownSecs={remainingSecs}
                isRefreshing={isRefreshingThis}
                onSelectStats={setSelectedPlayer}
                onSelectEquipment={setEquipmentPlayer}
                onRefresh={handleRefreshTarget}
                onDismiss={handleDismissPlayer}
                cleanSchoolName={cleanSchoolName}
                formatGender={formatGender}
              />
            );
          })}
        </div>
      )}

      {/* Modals */}
      <PlayerStatsModal
        player={selectedPlayer}
        onClose={() => setSelectedPlayer(null)}
        cleanSchoolName={cleanSchoolName}
        formatGender={formatGender}
      />

      <EquipmentModal player={equipmentPlayer} onClose={() => setEquipmentPlayer(null)} />
    </div>
  );
}
