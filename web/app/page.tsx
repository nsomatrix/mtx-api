'use client';

import React, { useState, useEffect, useCallback } from 'react';
import { PlayerProfile } from '@/lib/store';
import { db } from '@/lib/firebase';
import { doc, onSnapshot } from 'firebase/firestore';
import { Navbar } from '@/components/Navbar';
import { Footer } from '@/components/Footer';
import { PlatformHero } from '@/components/PlatformHero';
import { ModuleGrid } from '@/components/ModuleGrid';
import { ApiExplorer } from '@/components/ApiExplorer';
import { BHBG } from '@/components/BHBG';

export default function Home() {
  const [players, setPlayers] = useState<PlayerProfile[]>([]);

  // Fallback REST fetch if Firebase client is not active
  const fetchPlayers = useCallback(async () => {
    try {
      const res = await fetch('/api/v1/players');
      if (res.ok) {
        const data = await res.json();
        setPlayers(data.players || []);
      }
    } catch (e) {
      console.error('Error fetching player profiles:', e);
    }
  }, []);

  // Real-Time BaaS WebSocket Listener (0 Cloudflare Worker requests)
  useEffect(() => {
    if (db) {
      const unsub = onSnapshot(
        doc(db, 'system', 'players'),
        (snap) => {
          if (snap.exists()) {
            const data = snap.data();
            if (Array.isArray(data.players)) {
              setPlayers(data.players);
            }
          }
        },
        (err) => {
          console.warn('[Dashboard] Realtime players listener warning:', err);
        }
      );
      return () => unsub();
    } else {
      fetchPlayers();
      const interval = setInterval(fetchPlayers, 20000);
      return () => clearInterval(interval);
    }
  }, [fetchPlayers]);

  return (
    <div className="relative min-h-screen bg-black text-white flex flex-col font-sans selection:bg-violet-500/30 selection:text-violet-400">
      {/* 3D Ambient Space Background */}
      <div className="fixed inset-0 z-0 pointer-events-none opacity-30 overflow-hidden">
        <BHBG />
        <div className="absolute inset-0 bg-gradient-to-b from-black/30 via-black/60 to-black pointer-events-none" />
      </div>

      {/* Industry Standard Responsive Navbar */}
      <Navbar playerCount={players.length} />

      {/* Main Platform Body */}
      <main className="relative z-10 flex-1 max-w-7xl w-full mx-auto px-4 sm:px-6 lg:px-8 py-8 space-y-12">
        {/* Platform Hero Overview */}
        <PlatformHero
          activeModuleCount={1}
          totalTargetCount={players.length}
        />

        {/* Operational Platform Modules Suite */}
        <ModuleGrid targetCount={players.length} />

        {/* REST API Directory */}
        <ApiExplorer />
      </main>

      {/* Industry Standard Responsive Footer */}
      <div className="relative z-10">
        <Footer />
      </div>
    </div>
  );
}
