'use client';

import React, { useState, useEffect, useCallback } from 'react';
import { PlayerProfile } from '@/lib/store';
import { Navbar } from '@/components/Navbar';
import { Footer } from '@/components/Footer';
import { PlatformHero } from '@/components/PlatformHero';
import { ModuleGrid } from '@/components/ModuleGrid';
import { ApiExplorer } from '@/components/ApiExplorer';

export default function Home() {
  const [players, setPlayers] = useState<PlayerProfile[]>([]);

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

  useEffect(() => {
    fetchPlayers();
    const interval = setInterval(fetchPlayers, 5000);
    return () => clearInterval(interval);
  }, [fetchPlayers]);

  return (
    <div className="min-h-screen bg-black text-white flex flex-col font-sans selection:bg-violet-500/30 selection:text-violet-400">
      {/* Industry Standard Responsive Navbar */}
      <Navbar playerCount={players.length} />

      {/* Main Platform Body */}
      <main className="flex-1 max-w-7xl w-full mx-auto px-4 sm:px-6 lg:px-8 py-8 space-y-12">
        {/* Platform Hero Overview */}
        <PlatformHero
          activeModuleCount={2}
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
