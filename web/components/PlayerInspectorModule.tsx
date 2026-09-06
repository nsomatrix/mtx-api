'use client';

import React, { useState, useEffect, useRef } from 'react';
import { createPortal } from 'react-dom';
import { PlayerProfile } from '@/lib/store';
import { useAuth } from '@/context/AuthContext';
import { copyToClipboard } from '@/lib/copy';
import {
  getSavedTargets,
  saveTarget,
  removeTarget,
  isTargetSaved,
  getRemainingCooldownSeconds,
  setRefreshCooldown,
  fetchSavedTargetsFromCloud,
  subscribeToRealtimeCloudTargets,
} from '@/lib/userStore';
import {
  Search,
  RefreshCw,
  X,
  Activity,
  Zap,
  Copy,
  Check,
  ChevronRight,
  Clock,
  Shield,
  Radio,
  Loader2,
  Download,
  Sparkles,
  AlertTriangle,
  Bookmark,
  BookmarkCheck,
  Star,
  Users,
} from 'lucide-react';

function AnimatedNumber({ value, duration = 750, prefix = '', suffix = '' }: { value: number; duration?: number; prefix?: string; suffix?: string }) {
  const [displayValue, setDisplayValue] = useState(0);

  useEffect(() => {
    let startTimestamp: number | null = null;
    const startValue = 0;
    const endValue = value || 0;

    const step = (timestamp: number) => {
      if (!startTimestamp) startTimestamp = timestamp;
      const progress = Math.min((timestamp - startTimestamp) / duration, 1);
      const easeProgress = 1 - Math.pow(1 - progress, 3);
      const current = Math.floor(startValue + (endValue - startValue) * easeProgress);
      setDisplayValue(current);

      if (progress < 1) {
        window.requestAnimationFrame(step);
      }
    };

    const animId = window.requestAnimationFrame(step);
    return () => window.cancelAnimationFrame(animId);
  }, [value, duration]);

  return <span>{prefix}{displayValue}{suffix}</span>;
}

export function PlayerInspectorModule() {
  const { user } = useAuth();
  const userId = user?.uid || user?.email || 'anonymous';
  const [mounted, setMounted] = useState(false);

  useEffect(() => {
    setMounted(true);
  }, []);

  const [sessionPlayers, setSessionPlayers] = useState<PlayerProfile[]>([]);
  const [savedPlayers, setSavedPlayers] = useState<PlayerProfile[]>([]);
  const [activeTab, setActiveTab] = useState<'session' | 'saved'>('session');

  const [targetName, setTargetName] = useState('');
  const [fetching, setFetching] = useState(false);
  const [refreshingTarget, setRefreshingTarget] = useState<string | null>(null);
  const [fetchMsg, setFetchMsg] = useState<{ type: 'success' | 'info' | 'loading' | 'error'; text: string } | null>(null);
  const [searchQuery, setSearchQuery] = useState('');
  const [selectedPlayer, setSelectedPlayer] = useState<PlayerProfile | null>(null);
  const [equipmentPlayer, setEquipmentPlayer] = useState<PlayerProfile | null>(null);
  const [equipmentTab, setEquipmentTab] = useState<1 | 2>(1);
  const [copied, setCopied] = useState(false);

  // Cooldown timer state mapping player name -> remaining seconds
  const [cooldowns, setCooldowns] = useState<Record<string, number>>({});

  // Lock background page scrolling when a player details or equipment modal card is open
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

  const SLOT_NAMES: { [key: number]: string } = {
    0: 'Weapon',
    1: 'Coat / Armor',
    2: 'Ring',
    3: 'Necklace',
    4: 'Headgear',
    5: 'Gloves',
    6: 'Pants',
    7: 'Jade / Amulet',
    8: 'Shoes',
    9: 'Charm',
    29: 'Mount',
    30: 'Fashion',
    31: 'Bijuu',
    32: 'Clan Badge',
    33: 'Artifact',
  };

  // Real-time multi-device cross-platform cloud synchronization
  useEffect(() => {
    if (!userId) return;

    // 1. Instant local cache load (0ms UI latency)
    setSavedPlayers(getSavedTargets(userId));

    // 2. Fetch initial cloud targets from Server API & Firestore
    fetchSavedTargetsFromCloud(userId).then((cloudTargets) => {
      if (cloudTargets) setSavedPlayers(cloudTargets);
    });

    // 3. Real-time Firestore WebSocket listener across devices
    const unsubscribeSnapshot = subscribeToRealtimeCloudTargets(userId, (cloudTargets) => {
      if (cloudTargets) setSavedPlayers(cloudTargets);
    });

    // 4. Server API polling sync fallback for non-websocket environments
    const syncInterval = setInterval(() => {
      fetchSavedTargetsFromCloud(userId).then((cloudTargets) => {
        if (cloudTargets) setSavedPlayers(cloudTargets);
      });
    }, 4000);

    return () => {
      unsubscribeSnapshot();
      clearInterval(syncInterval);
    };
  }, [userId]);

  // Live timer interval to tick down cooldowns every 1 second
  useEffect(() => {
    const timer = setInterval(() => {
      if (!userId) return;
      const updated: Record<string, number> = {};
      let changed = false;

      savedPlayers.forEach((p) => {
        const secs = getRemainingCooldownSeconds(userId, p.name);
        if (secs !== (cooldowns[p.name.toLowerCase()] || 0)) {
          updated[p.name.toLowerCase()] = secs;
          changed = true;
        }
      });

      sessionPlayers.forEach((p) => {
        const secs = getRemainingCooldownSeconds(userId, p.name);
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
  }, [userId, savedPlayers, sessionPlayers, cooldowns]);

  const getUpgradeStyle = (upgrade: number) => {
    if (upgrade <= 0) {
      return { badge: 'bg-sky-500/5 text-sky-400/60 border border-sky-500/20', title: 'text-zinc-300' };
    } else if (upgrade === 1) {
      return { badge: 'bg-sky-500/10 text-sky-400 border border-sky-500/30', title: 'text-sky-300' };
    } else if (upgrade === 2) {
      return { badge: 'bg-blue-500/15 text-blue-400 border border-blue-500/40', title: 'text-blue-300' };
    } else if (upgrade === 3) {
      return { badge: 'bg-blue-500/20 text-blue-400 font-extrabold border border-blue-500/60 shadow-[0_0_8px_rgba(59,130,246,0.2)]', title: 'text-blue-400 font-bold' };
    } else if (upgrade === 4) {
      return { badge: 'bg-violet-500/10 text-violet-300 border border-violet-500/30', title: 'text-violet-300' };
    } else if (upgrade === 5) {
      return { badge: 'bg-violet-500/15 text-violet-400 border border-violet-500/40', title: 'text-violet-300' };
    } else if (upgrade === 6) {
      return { badge: 'bg-violet-500/20 text-violet-400 font-extrabold border border-violet-500/50', title: 'text-violet-400' };
    } else if (upgrade === 7) {
      return { badge: 'bg-green-500/25 text-green-400 font-extrabold border border-green-500/60 shadow-[0_0_8px_rgba(34,197,94,0.25)]', title: 'text-green-400 font-bold' };
    } else if (upgrade === 8) {
      return { badge: 'bg-amber-500/10 text-amber-300 border border-amber-500/30', title: 'text-amber-300' };
    } else if (upgrade === 9) {
      return { badge: 'bg-amber-500/15 text-amber-400 border border-amber-500/40', title: 'text-amber-300' };
    } else if (upgrade === 10) {
      return { badge: 'bg-amber-600/20 text-amber-400 font-extrabold border border-amber-600/50', title: 'text-amber-400' };
    } else if (upgrade === 11) {
      return { badge: 'bg-amber-700/25 text-amber-500 font-extrabold border border-amber-600/60 shadow-[0_0_8px_rgba(217,119,6,0.25)]', title: 'text-amber-400 font-bold' };
    } else if (upgrade === 12) {
      return { badge: 'bg-purple-500/10 text-purple-300 border border-purple-500/30', title: 'text-purple-300' };
    } else if (upgrade === 13) {
      return { badge: 'bg-purple-500/15 text-purple-400 border border-purple-500/40', title: 'text-purple-300' };
    } else if (upgrade === 14) {
      return { badge: 'bg-purple-500/25 text-purple-400 font-extrabold border border-purple-500/60 shadow-[0_0_10px_rgba(168,85,247,0.3)]', title: 'text-purple-300 font-bold' };
    } else if (upgrade === 15) {
      return { badge: 'bg-rose-500/20 text-rose-400 font-extrabold border border-rose-500/50 shadow-[0_0_10px_rgba(244,63,94,0.3)]', title: 'text-rose-400 font-bold' };
    } else {
      return { badge: 'bg-red-500/30 text-red-400 font-extrabold border border-red-500/70 shadow-[0_0_14px_rgba(239,68,68,0.4)] animate-pulse', title: 'text-red-400 font-extrabold' };
    }
  };

  const pollIntervalRef = useRef<NodeJS.Timeout | null>(null);

  const stopPolling = () => {
    if (pollIntervalRef.current) {
      clearInterval(pollIntervalRef.current);
      pollIntervalRef.current = null;
    }
  };

  const MAX_LIVE_CARDS = 4;

  const handleToggleBookmark = (player: PlayerProfile) => {
    if (!userId) return;
    const isSaved = isTargetSaved(userId, player.name);
    if (isSaved) {
      if (refreshingTarget?.toLowerCase() === player.name.toLowerCase()) {
        setRefreshingTarget(null);
      }
      const updated = removeTarget(userId, player.name);
      setSavedPlayers(updated);
      setFetchMsg({ type: 'info', text: `Removed "${player.name}" from your saved targets.` });
    } else {
      const updated = saveTarget(userId, player);
      setSavedPlayers(updated);
      setFetchMsg({ type: 'success', text: `Saved "${player.name}" to your account targets!` });
    }
  };

  const handleDismissPlayer = async (playerName: string) => {
    if (refreshingTarget?.toLowerCase() === playerName.toLowerCase()) {
      setRefreshingTarget(null);
    }
    setSessionPlayers((prev) => prev.filter((p) => p.name.toLowerCase() !== playerName.toLowerCase()));
    if (selectedPlayer?.name.toLowerCase() === playerName.toLowerCase()) setSelectedPlayer(null);
    if (equipmentPlayer?.name.toLowerCase() === playerName.toLowerCase()) setEquipmentPlayer(null);
    try {
      await fetch(`/api/v1/players?name=${encodeURIComponent(playerName)}`, { method: 'DELETE' });
    } catch (err) {
      // Ignore network errors
    }
  };

  // Trigger on-demand inspect for saved card with 1-minute cooldown enforcement
  const handleRefreshTarget = async (player: PlayerProfile) => {
    const cleanName = player.name.trim();
    if (!cleanName) return;

    // Check remaining cooldown
    const remainingSecs = getRemainingCooldownSeconds(userId, cleanName);
    if (remainingSecs > 0) {
      setFetchMsg({
        type: 'error',
        text: `Refresh cooldown active for "${cleanName}". Please wait ${remainingSecs}s to prevent API abuse.`,
      });
      return;
    }

    setRefreshingTarget(cleanName);
    setFetchMsg({ type: 'loading', text: `Refreshing live stats for "${cleanName}"` });

    // Set 60-second cooldown immediately
    setRefreshCooldown(userId, cleanName);
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
        return;
      }

      // Poll REST endpoint for updated stats
      const startTime = Date.now();
      const pollTarget = async () => {
        try {
          const checkRes = await fetch(`/api/v1/players?q=${encodeURIComponent(cleanName)}`);
          if (checkRes.ok) {
            const checkData = await checkRes.json();
            const found = (checkData.players || []).find(
              (p: PlayerProfile) => p.name.toLowerCase() === cleanName.toLowerCase()
            );

            if (found) {
              // Update saved targets list
              const updatedSaved = saveTarget(userId, found);
              setSavedPlayers(updatedSaved);

              // Update session list if present
              setSessionPlayers((prev) => {
                const idx = prev.findIndex((p) => p.name.toLowerCase() === found.name.toLowerCase());
                if (idx >= 0) {
                  const copy = [...prev];
                  copy[idx] = found;
                  return copy;
                }
                return prev;
              });

              setFetchMsg({ type: 'success', text: `Updated live profile for "${found.name}"!` });
              setRefreshingTarget(null);
              return true;
            }
          }
        } catch (err) {
          console.warn('Refresh poll error:', err);
        }

        if (Date.now() - startTime > 15000) {
          setFetchMsg({
            type: 'info',
            text: `Refresh queued for "${cleanName}". Stats will update when player is active.`,
          });
          setRefreshingTarget(null);
          return true;
        }
        return false;
      };

      const pollTimer = setInterval(async () => {
        const done = await pollTarget();
        if (done) clearInterval(pollTimer);
      }, 1500);
    } catch (err) {
      setFetchMsg({ type: 'error', text: 'Network connection failed.' });
      setRefreshingTarget(null);
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
        text: `Session limit reached (${MAX_LIVE_CARDS} max). Clear session to inspect additional targets.`,
      });
      return;
    }

    stopPolling();
    setFetching(true);
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
        return;
      }

      setFetchMsg({ type: 'loading', text: `Waiting for game client to inspect "${cleanName}"` });

      const startTime = Date.now();
      const pollTarget = async () => {
        try {
          const checkRes = await fetch(`/api/v1/players?q=${encodeURIComponent(cleanName)}`);
          if (checkRes.ok) {
            const checkData = await checkRes.json();
            const found = (checkData.players || []).find(
              (p: PlayerProfile) => p.name.toLowerCase() === cleanName.toLowerCase()
            );

            if (found) {
              stopPolling();
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
                  text: `Player "${found.name}" is OFFLINE: ${found.error || 'They are not online at this moment.'}`,
                });
              } else {
                setFetchMsg({ type: 'success', text: `Successfully retrieved profile for "${found.name}"!` });
              }
              setFetching(false);
              setTargetName('');
              return true;
            }
          }
        } catch (err) {
          console.warn('Target poll error:', err);
        }

        if (Date.now() - startTime > 15000) {
          stopPolling();
          setFetchMsg({
            type: 'info',
            text: `Inspection queued for "${cleanName}". Profile will update when the player is online.`,
          });
          setFetching(false);
          return true;
        }
        return false;
      };

      const done = await pollTarget();
      if (!done) {
        pollIntervalRef.current = setInterval(pollTarget, 1500);
      }
    } catch (err) {
      setFetchMsg({ type: 'error', text: 'Unable to connect to service. Please try again.' });
      setFetching(false);
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
    fetch('/api/v1/inspect', {
      method: 'POST',
      headers: { 'Content-Type': 'application/json' },
      body: JSON.stringify({ name: '__CLEAR__' }),
    }).catch(() => {});
    setSessionPlayers([]);
    setFetchMsg(null);
  };

  const handleCopyJson = async (player: PlayerProfile) => {
    const jsonStr = JSON.stringify(player, null, 2);
    const success = await copyToClipboard(jsonStr);
    if (success) {
      setCopied(true);
      setTimeout(() => setCopied(false), 2000);
    }
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

  const displayedList = activeTab === 'session' ? sessionPlayers : savedPlayers;

  const filteredPlayers = displayedList.filter((p) =>
    p.name.toLowerCase().includes(searchQuery.toLowerCase()) ||
    cleanSchoolName(p.school).toLowerCase().includes(searchQuery.toLowerCase()) ||
    p.class.toLowerCase().includes(searchQuery.toLowerCase()) ||
    (p.gender || '').toLowerCase().includes(searchQuery.toLowerCase()) ||
    (p.clan || p.giaToc || '').toLowerCase().includes(searchQuery.toLowerCase())
  );

  return (
    <div id="player-inspector-module" className="space-y-6 pt-2 sm:pt-4">
      {/* Module Header Bar */}
      <div className="flex flex-col md:flex-row md:items-center justify-between gap-4 p-4 sm:p-6 rounded-2xl bg-zinc-900/60 border border-zinc-800/80">
        <div className="space-y-1">
          <div className="flex flex-wrap items-center gap-2">
            <h3 className="text-base sm:text-lg font-display font-extrabold text-white">
              Player Inspector Module
            </h3>
            <span className="px-2 py-0.5 rounded text-[10px] font-mono bg-violet-500/10 text-violet-400 border border-violet-500/20">
              REST TELEMETRY
            </span>
            {sessionPlayers.length > 0 && (
              <span className="flex items-center space-x-1 px-2 py-0.5 rounded text-[10px] font-mono bg-violet-500/20 text-violet-300 border border-violet-500/30">
                <Radio className="w-3 h-3 text-violet-400" />
                <span>SESSION ({sessionPlayers.length}/{MAX_LIVE_CARDS})</span>
              </span>
            )}
            {savedPlayers.length > 0 && (
              <span className="flex items-center space-x-1 px-2 py-0.5 rounded text-[10px] font-mono bg-amber-500/15 text-amber-400 border border-amber-500/30">
                <Bookmark className="w-3 h-3 text-amber-400" />
                <span>SAVED TARGETS ({savedPlayers.length})</span>
              </span>
            )}
          </div>
          <p className="text-xs text-zinc-400 font-sans">
            Enter any player name to trigger on-demand character inspection or view your saved target vault.
          </p>
        </div>

        {/* Fetch Target Input Form */}
        <form onSubmit={handleFetch} className="flex flex-col sm:flex-row items-stretch sm:items-center gap-2.5 w-full md:w-auto">
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
          <button onClick={() => setFetchMsg(null)} className="hover:opacity-75 shrink-0 p-0.5 rounded-lg border-0 outline-none">
            <X className="w-4 h-4" />
          </button>
        </div>
      )}

      {/* Primary Tab Switcher: Session Cards vs Saved Targets */}
      <div className="flex flex-col sm:flex-row items-stretch sm:items-center justify-between gap-3 p-1.5 bg-zinc-950 rounded-2xl border border-zinc-800">
        <div className="flex items-center gap-1 w-full sm:w-auto">
          <button
            type="button"
            onClick={() => setActiveTab('session')}
            className={`flex-1 sm:flex-initial flex items-center justify-center space-x-2 px-4 py-2.5 rounded-xl text-xs font-bold transition-all border-0 outline-none select-none ${
              activeTab === 'session'
                ? 'bg-zinc-800 text-violet-400 shadow-sm'
                : 'text-zinc-400 hover:text-white'
            }`}
          >
            <Radio className="w-3.5 h-3.5" />
            <span>Active Session ({sessionPlayers.length})</span>
          </button>

          <button
            type="button"
            onClick={() => setActiveTab('saved')}
            className={`flex-1 sm:flex-initial flex items-center justify-center space-x-2 px-4 py-2.5 rounded-xl text-xs font-bold transition-all border-0 outline-none select-none ${
              activeTab === 'saved'
                ? 'bg-zinc-800 text-amber-400 shadow-sm'
                : 'text-zinc-400 hover:text-white'
            }`}
          >
            <Bookmark className="w-3.5 h-3.5" />
            <span>My Saved Targets ({savedPlayers.length})</span>
          </button>
        </div>

        {/* Search Bar & Action Controls */}
        <div className="flex items-center gap-2 w-full sm:w-auto">
          <form onSubmit={handleSearchSubmit} className="relative flex-1 sm:w-[260px]">
            <Search className="absolute left-3 top-1/2 -translate-y-1/2 w-3.5 h-3.5 text-zinc-500" />
            <input
              type="text"
              value={searchQuery}
              onChange={(e) => setSearchQuery(e.target.value)}
              placeholder="Search target cards"
              className="w-full pl-8 pr-3 py-2 rounded-xl bg-zinc-900 border border-zinc-800 focus:border-violet-500 focus:outline-none text-xs text-white font-mono placeholder:text-zinc-600"
            />
          </form>

          {activeTab === 'session' && sessionPlayers.length > 0 && (
            <button
              type="button"
              onClick={handleClearSession}
              className="flex items-center justify-center space-x-1.5 px-3 py-2 rounded-xl bg-zinc-900 border border-zinc-800 text-xs text-zinc-400 hover:text-white transition-colors border-0 outline-none shrink-0"
              title="Clear active session cards"
            >
              <RefreshCw className="w-3.5 h-3.5" />
              <span className="hidden sm:inline">Clear</span>
            </button>
          )}
        </div>
      </div>

      {/* Cards Grid Container */}
      {filteredPlayers.length === 0 ? (
        <div className="py-16 text-center border border-dashed border-zinc-800/80 rounded-2xl p-8 bg-zinc-950/40 text-xs text-zinc-500 font-mono space-y-3">
          <div className="w-12 h-12 rounded-2xl bg-zinc-900 border border-zinc-800 flex items-center justify-center mx-auto text-zinc-400">
            {activeTab === 'saved' ? (
              <Bookmark className="w-6 h-6 text-amber-400" />
            ) : (
              <Shield className="w-6 h-6 text-violet-400" />
            )}
          </div>
          <div className="space-y-1">
            <p className="text-sm font-semibold text-zinc-300 font-sans">
              {activeTab === 'saved' ? 'No Saved Targets in Vault' : 'No Active Inspection Targets'}
            </p>
            <p className="text-zinc-500 max-w-sm mx-auto font-sans">
              {activeTab === 'saved'
                ? 'Save any player card by clicking the star bookmark icon to store them permanently under your account.'
                : 'Enter a Ninja character name above and click Fetch to inspect player profile.'}
            </p>
          </div>
        </div>
      ) : (
        <div className="grid grid-cols-1 sm:grid-cols-2 lg:grid-cols-3 gap-4">
          {filteredPlayers.map((p) => {
            const hpPercent = p.maxHp > 0 ? Math.min(100, Math.round((p.hp / p.maxHp) * 100)) : 0;
            const mpPercent = p.maxMp > 0 ? Math.min(100, Math.round((p.mp / p.maxMp) * 100)) : 0;
            const schoolName = cleanSchoolName(p.school);
            const isSaved = isTargetSaved(userId, p.name);
            const remainingSecs = cooldowns[p.name.toLowerCase()] || 0;
            const isRefreshingThis = refreshingTarget?.toLowerCase() === p.name.toLowerCase();

            return (
              <div
                key={p.name}
                onClick={() => setSelectedPlayer(p)}
                className="group p-5 rounded-2xl bg-zinc-900/80 border border-zinc-800/80 hover:border-violet-500/50 hover:bg-zinc-900 transition-all cursor-pointer space-y-4 flex flex-col justify-between relative overflow-hidden"
              >
                <div>
                  {/* Top Header: Name, Level & Bookmark / Dismiss buttons */}
                  <div className="flex items-start justify-between">
                    <div>
                      <div className="flex items-center space-x-2">
                        <h4 className="font-display font-bold text-base text-white group-hover:text-violet-400 transition-colors">
                          {p.name}
                        </h4>
                        {p.online === false || p.status === 'OFFLINE' ? (
                          <span className="px-2 py-0.5 rounded text-[10px] font-mono bg-rose-500/20 text-rose-400 border border-rose-500/30 font-bold">
                            OFFLINE
                          </span>
                        ) : (
                          <span className="px-2 py-0.5 rounded text-[10px] font-mono bg-violet-500/10 text-violet-400 border border-violet-500/20">
                            Lvl {p.level}
                          </span>
                        )}
                      </div>
                      <div className="space-y-0.5 mt-1">
                        <p className="text-xs text-zinc-400 font-sans">
                          {p.class} • <span className="text-zinc-300 font-medium">{schoolName}</span>
                        </p>
                        <p className="text-[11px] font-mono text-zinc-400">
                          <span><span className="text-zinc-300 font-medium">{formatGender(p.gender)}</span></span>
                          {p.clan || p.giaToc ? (
                            <span className="text-purple-400 font-medium ml-2">
                              • Clan: {p.clan || p.giaToc}
                            </span>
                          ) : (
                            <span className="text-zinc-500 font-normal ml-2">
                              • Clan: None
                            </span>
                          )}
                        </p>
                      </div>
                    </div>

                    <div className="flex items-center space-x-1" onClick={(e) => e.stopPropagation()}>
                      {/* Bookmark Toggle Button */}
                      <button
                        type="button"
                        onClick={() => handleToggleBookmark(p)}
                        className={`p-1.5 rounded-lg transition-colors border-0 outline-none ${
                          isSaved
                            ? 'text-amber-400 hover:bg-amber-500/10'
                            : 'text-zinc-500 hover:text-amber-400 hover:bg-zinc-800'
                        }`}
                        title={isSaved ? 'Remove from saved targets' : 'Bookmark to account'}
                      >
                        {isSaved ? <Star className="w-4 h-4 fill-amber-400 text-amber-400" /> : <Star className="w-4 h-4" />}
                      </button>

                      {/* Refresh Button for Card with 1-min Cooldown */}
                      <button
                        type="button"
                        disabled={remainingSecs > 0 || isRefreshingThis}
                        onClick={() => handleRefreshTarget(p)}
                        className={`p-1.5 rounded-lg transition-colors border-0 outline-none flex items-center space-x-1 text-[11px] font-mono ${
                          remainingSecs > 0
                            ? 'bg-zinc-800/80 text-zinc-500 cursor-not-allowed'
                            : 'text-violet-400 hover:bg-violet-500/10'
                        }`}
                        title={remainingSecs > 0 ? `Refresh cooldown: ${remainingSecs}s remaining` : 'Refresh live stats'}
                      >
                        <RefreshCw className={`w-3.5 h-3.5 ${isRefreshingThis ? 'animate-spin text-violet-400' : ''}`} />
                        {remainingSecs > 0 && <span className="font-bold text-amber-400">{remainingSecs}s</span>}
                      </button>

                      {/* Dismiss Button */}
                      {activeTab === 'session' && (
                        <button
                          type="button"
                          onClick={() => handleDismissPlayer(p.name)}
                          className="p-1.5 rounded-lg text-zinc-400 hover:text-rose-400 hover:bg-rose-500/10 transition-colors border-0 outline-none"
                          title="Dismiss player profile"
                        >
                          <X className="w-4 h-4" />
                        </button>
                      )}
                    </div>
                  </div>

                  {/* HP / MP Gauges */}
                  <div className="space-y-2 pt-3 border-t border-zinc-800/60 mt-3 font-mono text-[11px]">
                    <div>
                      <div className="flex justify-between text-zinc-400 mb-1">
                        <span className="text-rose-400 flex items-center">
                          <Activity className="w-3 h-3 mr-1" /> HP
                        </span>
                        <span>{p.hp} / {p.maxHp}</span>
                      </div>
                      <div className="w-full bg-black rounded-full h-1.5 overflow-hidden border border-zinc-800">
                        <div className="bg-rose-500 h-full rounded-full transition-all duration-500" style={{ width: `${hpPercent}%` }} />
                      </div>
                    </div>

                    <div>
                      <div className="flex justify-between text-zinc-400 mb-1">
                        <span className="text-cyan-400 flex items-center">
                          <Zap className="w-3 h-3 mr-1" /> MP
                        </span>
                        <span>{p.mp} / {p.maxMp}</span>
                      </div>
                      <div className="w-full bg-black rounded-full h-1.5 overflow-hidden border border-zinc-800">
                        <div className="bg-cyan-500 h-full rounded-full transition-all duration-500" style={{ width: `${mpPercent}%` }} />
                      </div>
                    </div>
                  </div>

                  {/* Key Stats Grid */}
                  <div className="space-y-1.5 mt-3 pt-3 border-t border-zinc-800/80 font-mono text-[11px]">
                    <div className="flex items-center justify-between py-1.5 px-3 rounded-xl bg-zinc-950/80 border border-zinc-800/80">
                      <span className="text-[11px] text-zinc-400 font-sans font-medium">Attack DMG</span>
                      <span className="text-violet-400 font-extrabold">
                        <AnimatedNumber value={p.attackMin} /> - <AnimatedNumber value={p.attackMax} />
                      </span>
                    </div>

                    <div className="flex items-center justify-between py-1.5 px-3 rounded-xl bg-zinc-950/80 border border-zinc-800/80">
                      <span className="text-[11px] text-zinc-400 font-sans font-medium">Critical Strike</span>
                      <span className="text-violet-400 font-extrabold"><AnimatedNumber value={p.critical} /></span>
                    </div>

                    <div className="flex items-center justify-between py-1.5 px-3 rounded-xl bg-zinc-950/80 border border-zinc-800/80">
                      <span className="text-[11px] text-zinc-400 font-sans font-medium">Reduce Pain</span>
                      <span className="text-violet-400 font-extrabold"><AnimatedNumber value={p.reducePain} /></span>
                    </div>
                  </div>
                </div>

                {/* Footer Controls */}
                <div className="pt-3 flex items-center justify-between text-xs font-medium border-t border-zinc-800/60 gap-2" onClick={(e) => e.stopPropagation()}>
                  <button
                    onClick={() => setSelectedPlayer(p)}
                    className="flex-1 py-2 px-3 rounded-xl bg-zinc-900 border border-zinc-800 text-zinc-300 hover:text-white hover:bg-zinc-800 transition-all flex items-center justify-between text-[11px] border-0 outline-none"
                  >
                    <span>View Stats</span>
                    <ChevronRight className="w-3.5 h-3.5 text-zinc-400" />
                  </button>

                  <button
                    onClick={() => {
                      setEquipmentPlayer(p);
                      setEquipmentTab(1);
                    }}
                    className="py-2 px-3 rounded-xl bg-violet-500/10 text-violet-400 hover:bg-violet-500/20 transition-all border border-violet-500/20 flex items-center space-x-1.5 text-[11px] font-bold outline-none"
                  >
                    <span>View Equipment</span>
                  </button>
                </div>
              </div>
            );
          })}
        </div>
      )}

      {/* 18-Attribute Modal Detail Dialog */}
      {mounted && selectedPlayer && createPortal(
        <div className="fixed inset-0 z-[9999] flex items-center justify-center p-3 sm:p-4 bg-black/85 backdrop-blur-md animate-fade-in">
          <div className="bg-zinc-900 border border-zinc-800 rounded-2xl w-full max-w-lg max-h-[88vh] overflow-y-auto p-4 sm:p-6 space-y-4 sm:space-y-6 shadow-2xl font-sans">
            {/* Modal Header */}
            <div className="flex flex-col sm:flex-row sm:items-center justify-between gap-3 border-b border-zinc-800 pb-4">
              <div className="flex items-center space-x-3 min-w-0">
                <div className="w-10 h-10 rounded-xl bg-violet-500/10 border border-violet-500/20 flex items-center justify-center text-violet-400 font-mono font-bold text-sm shrink-0">
                  {selectedPlayer.level}
                </div>
                <div className="min-w-0">
                  <div className="flex items-center space-x-2">
                    <h3 className="text-base sm:text-lg font-display font-bold text-white truncate">{selectedPlayer.name}</h3>
                    <span className="flex items-center space-x-1 px-1.5 py-0.5 rounded text-[9px] font-mono bg-violet-500/20 text-violet-400 border border-violet-500/30 shrink-0">
                      <Radio className="w-2.5 h-2.5 text-violet-400" />
                      <span>LIVE</span>
                    </span>
                  </div>
                  <div className="space-y-0.5 mt-0.5">
                    <p className="text-xs text-zinc-400 font-mono truncate">
                      {selectedPlayer.class} • <span className="text-violet-400 font-medium">{cleanSchoolName(selectedPlayer.school)}</span>
                    </p>
                    <p className="text-xs font-mono text-zinc-400 truncate">
                      <span className="text-zinc-200 font-semibold">{formatGender(selectedPlayer.gender)}</span>
                      {selectedPlayer.clan || selectedPlayer.giaToc ? (
                        <span className="text-purple-400 font-semibold ml-2">
                          • Clan: {selectedPlayer.clan || selectedPlayer.giaToc}
                        </span>
                      ) : (
                        <span className="text-zinc-500 font-normal ml-2">
                          • Clan: None
                        </span>
                      )}
                    </p>
                  </div>
                </div>
              </div>
              <div className="flex items-center justify-between sm:justify-end space-x-2 w-full sm:w-auto">
                <button
                  onClick={() => handleToggleBookmark(selectedPlayer)}
                  className={`px-3 py-1.5 rounded-xl border text-xs font-bold transition-all flex items-center space-x-1.5 border-0 outline-none ${
                    isTargetSaved(userId, selectedPlayer.name)
                      ? 'bg-amber-500/20 text-amber-400 border-amber-500/30'
                      : 'bg-zinc-800 text-zinc-400 hover:text-amber-400'
                  }`}
                >
                  <Star className="w-3.5 h-3.5 fill-current" />
                  <span>{isTargetSaved(userId, selectedPlayer.name) ? 'Saved' : 'Save'}</span>
                </button>
                <button onClick={() => setSelectedPlayer(null)} className="p-1.5 rounded-lg text-zinc-400 hover:text-white hover:bg-zinc-800 transition-colors shrink-0 border-0 outline-none">
                  <X className="w-5 h-5" />
                </button>
              </div>
            </div>

            {/* Health & Mana Points */}
            <div className="space-y-2 font-mono text-xs">
              <div className="flex items-center justify-between p-3 bg-black/60 rounded-xl border border-rose-500/20">
                <span className="text-rose-400 font-sans flex items-center space-x-1.5 font-semibold">
                  <Activity className="w-4 h-4" />
                  <span>HP</span>
                </span>
                <span className="text-sm font-bold text-white">
                  <AnimatedNumber value={selectedPlayer.hp} /> / <AnimatedNumber value={selectedPlayer.maxHp} />
                </span>
              </div>
              <div className="flex items-center justify-between p-3 bg-black/60 rounded-xl border border-cyan-500/20">
                <span className="text-cyan-400 font-sans flex items-center space-x-1.5 font-semibold">
                  <Zap className="w-4 h-4" />
                  <span>MP</span>
                </span>
                <span className="text-sm font-bold text-white">
                  <AnimatedNumber value={selectedPlayer.mp} /> / <AnimatedNumber value={selectedPlayer.maxMp} />
                </span>
              </div>
            </div>

            {/* Stats Panel */}
            <div className="bg-zinc-950 rounded-2xl border border-zinc-800 overflow-hidden divide-y divide-zinc-800/80 text-xs font-mono shadow-2xl">
              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Attack Min</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.attackMin} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Attack Max</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.attackMax} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Speed</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.speed} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Critical Strike</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.critical} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Accurate Point</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.accurate} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Dodge Ability</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.dodge} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Anti Fire</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.antiFire} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Anti Ice</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.antiIce} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Anti Wind</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.antiWind} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Reduce Pain</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.reducePain} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Counter Strike</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.counterStrike} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Anti Chakra</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.antiChakra} /></span>
              </div>

              <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
                <span className="text-zinc-400 font-sans font-medium">Anti Chakra Back</span>
                <span className="text-violet-400 font-extrabold"><AnimatedNumber value={selectedPlayer.antiChakraBack} /></span>
              </div>
            </div>

            {/* Footer Action Row */}
            <div className="pt-4 border-t border-zinc-800 flex items-center justify-between">
              <button
                onClick={() => handleCopyJson(selectedPlayer)}
                className="flex items-center space-x-2 px-3.5 py-2 rounded-xl border border-zinc-800 bg-black text-xs text-zinc-400 hover:text-white font-mono transition-colors border-0 outline-none"
              >
                {copied ? <Check className="w-3.5 h-3.5 text-violet-400" /> : <Copy className="w-3.5 h-3.5" />}
                <span>{copied ? 'Copied JSON!' : 'Copy Raw Payload'}</span>
              </button>

              <button
                onClick={() => setSelectedPlayer(null)}
                className="px-4 py-2 rounded-xl bg-zinc-800 text-white text-xs font-semibold hover:bg-zinc-700 transition-colors border-0 outline-none"
              >
                Close
              </button>
            </div>
          </div>
        </div>,
        document.body
      )}

      {/* Equipment Box Modal */}
      {mounted && equipmentPlayer && createPortal(
        <div className="fixed inset-0 z-[9999] flex items-center justify-center p-3 sm:p-4 bg-black/85 backdrop-blur-md animate-fade-in">
          <div className="bg-zinc-900 border border-zinc-800 rounded-2xl w-full max-w-lg max-h-[88vh] overflow-y-auto p-4 sm:p-6 space-y-4 shadow-2xl font-sans text-white">
            <div className="flex items-center justify-between border-b border-zinc-800 pb-4">
              <div className="flex items-center space-x-3">
                <div className="w-10 h-10 rounded-xl bg-violet-500/10 border border-violet-500/20 flex items-center justify-center text-violet-400 font-mono font-bold text-sm shrink-0">
                  {equipmentPlayer.level}
                </div>
                <div>
                  <div className="flex items-center space-x-2">
                    <h3 className="text-lg font-display font-bold text-white">{equipmentPlayer.name}</h3>
                    <span className="px-2 py-0.5 rounded text-[10px] font-mono bg-violet-500/10 text-violet-400 border border-violet-500/20">
                      {equipmentPlayer.class}
                    </span>
                  </div>
                  <p className="text-xs text-zinc-400 font-sans mt-0.5">Equipped Items Overview</p>
                </div>
              </div>
              <button
                onClick={() => setEquipmentPlayer(null)}
                className="p-1.5 rounded-lg text-zinc-400 hover:text-white hover:bg-zinc-800 transition-colors border-0 outline-none"
              >
                <X className="w-5 h-5" />
              </button>
            </div>

            <div className="flex rounded-xl overflow-hidden border border-zinc-800 bg-black divide-x divide-zinc-800">
              <button
                onClick={() => setEquipmentTab(1)}
                className={`flex-1 py-2.5 px-4 text-xs font-bold transition-all text-center border-0 outline-none ${
                  equipmentTab === 1
                    ? 'bg-violet-500/10 text-violet-400 border-b-2 border-violet-500'
                    : 'text-zinc-400 hover:text-white hover:bg-zinc-900/60'
                }`}
              >
                Equipment 1
              </button>
              <button
                onClick={() => setEquipmentTab(2)}
                className={`flex-1 py-2.5 px-4 text-xs font-bold transition-all text-center border-0 outline-none ${
                  equipmentTab === 2
                    ? 'bg-violet-500/10 text-violet-400 border-b-2 border-violet-500'
                    : 'text-zinc-400 hover:text-white hover:bg-zinc-900/60'
                }`}
              >
                Equipment 2
              </button>
            </div>

            {(() => {
              const currentEquip = (equipmentPlayer.equipment || []).filter((e) => e.tab === equipmentTab);
              if (currentEquip.length === 0) {
                return (
                  <div className="py-10 text-center bg-black/60 border border-zinc-800 rounded-xl p-6 text-xs text-zinc-400 space-y-1">
                    <p className="font-bold text-white">No Items Equipped</p>
                    <p className="text-[11px] text-zinc-500">
                      No gear items present in Equipment {equipmentTab} tab.
                    </p>
                  </div>
                );
              }

              return (
                <div className="rounded-xl border border-zinc-800 bg-zinc-950 divide-y divide-zinc-800/80 overflow-hidden shadow-2xl">
                  {currentEquip.map((item, idx) => {
                    const slotName = SLOT_NAMES[item.type] || 'Slot';
                    const style = getUpgradeStyle(item.upgrade || 0);
                    return (
                      <div key={idx} className="flex items-center justify-between p-3 hover:bg-zinc-900/60 transition-colors">
                        <div className="space-y-0.5">
                          <div className="flex items-center space-x-2">
                            <span className={`text-xs font-semibold ${style.title}`}>{item.name}</span>
                            {item.upgrade > 0 && (
                              <span className={`px-1.5 py-0.2 rounded text-[10px] font-mono ${style.badge}`}>
                                +{item.upgrade}
                              </span>
                            )}
                          </div>
                          <p className="text-[10px] font-mono text-zinc-500">
                            {slotName} • Req Lvl {item.reqLevel}
                          </p>
                        </div>
                      </div>
                    );
                  })}
                </div>
              );
            })()}

            <div className="pt-3 border-t border-zinc-800 flex justify-end">
              <button
                onClick={() => setEquipmentPlayer(null)}
                className="px-4 py-2 rounded-xl bg-zinc-800 text-white text-xs font-semibold hover:bg-zinc-700 transition-colors border-0 outline-none"
              >
                Close
              </button>
            </div>
          </div>
        </div>,
        document.body
      )}
    </div>
  );
}
