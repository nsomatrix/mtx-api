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
    <div className="min-h-screen bg-black text-white flex flex-col font-sans selection:bg-violet-500/30 selection:text-violet-400">
      {/* Industry Standard Responsive Navbar */}
      <Navbar playerCount={players.length} />

      {/* Main Platform Body */}
      <main className="flex-1 max-w-7xl w-full mx-auto px-4 sm:px-6 lg:px-8 py-8 space-y-12">
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
      <Footer />
    </div>
  );
}
