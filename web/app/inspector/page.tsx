'use client';

import React, { useState } from 'react';
import { Navbar } from '@/components/Navbar';
import { Footer } from '@/components/Footer';
import { PlayerInspectorModule } from '@/components/PlayerInspectorModule';

export default function InspectorPage() {
  const [activeTab, setActiveTab] = useState('inspector');

  return (
    <div className="min-h-screen bg-black text-white flex flex-col font-sans selection:bg-violet-500/30 selection:text-violet-400">
      {/* Industry Standard Responsive Navbar */}
      <Navbar
        activeTab={activeTab}
        onTabChange={setActiveTab}
        playerCount={0}
      />

      {/* Main Content Area */}
      <main className="flex-1 max-w-7xl w-full mx-auto px-4 sm:px-6 lg:px-8 py-8 space-y-8">
        {/* Dedicated Module Header */}
        <div className="border-b border-zinc-800/80 pb-6">
          <div className="flex items-center space-x-2">
            <span className="px-2.5 py-1 rounded-md bg-violet-500/10 text-violet-400 border border-violet-500/20 font-mono text-xs font-semibold">
              MODULE 01
            </span>
            <span className="text-zinc-500 text-xs font-mono">•</span>
            <span className="text-zinc-400 text-xs font-mono">REST Telemetry & Live Sync</span>
          </div>
          <h1 className="text-3xl font-display font-extrabold text-white tracking-tight mt-2">
            Player Inspector Engine
          </h1>
          <p className="text-sm text-zinc-400 max-w-2xl font-sans mt-1">
            Dedicated operational environment for requesting remote character inspections and viewing profile stats in real time.
          </p>
        </div>

        {/* Dedicated Player Inspector Component (Clean On-Demand Session) */}
        <PlayerInspectorModule />
      </main>

      {/* Footer */}
      <Footer />
    </div>
  );
}
