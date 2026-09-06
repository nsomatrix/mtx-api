'use client';

import React from 'react';
import { Shield } from 'lucide-react';
import { useStatus } from '@/context/StatusContext';

export function Footer() {
  const { modClientOnline } = useStatus();

  return (
    <footer className="w-full border-t border-zinc-800/80 bg-black text-zinc-400 font-sans text-xs">
      <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 py-6 flex flex-col sm:flex-row items-center justify-between gap-4">
        {/* Logo & Brand & Version */}
        <div className="flex items-center space-x-2">
          <div className="w-6 h-6 rounded-md bg-violet-500/10 border border-violet-500/20 flex items-center justify-center text-violet-400">
            <Shield className="w-3.5 h-3.5" />
          </div>
          <span className="font-display font-bold text-sm text-white tracking-tight">mtx-api</span>
          <span className="px-1.5 py-0.5 text-[9px] font-mono bg-violet-500/10 text-violet-400 rounded border border-violet-500/20">
            v1.0
          </span>
        </div>

        {/* Copyright */}
        <div className="font-mono text-[11px] text-zinc-500">
          © {new Date().getFullYear()} mtx-api.
        </div>

        {/* Live API & Mod Client Status */}
        <div className="flex items-center space-x-2 px-2.5 py-1 rounded-md bg-zinc-900 border border-zinc-800 text-[10px] font-mono">
          {modClientOnline ? (
            <>
              <span className="h-1.5 w-1.5 rounded-full bg-violet-400 animate-pulse"></span>
              <span className="text-violet-400 font-medium">All Systems Functional</span>
            </>
          ) : (
            <>
              <span className="h-1.5 w-1.5 rounded-full bg-rose-500 shadow-[0_0_6px_rgba(244,63,94,0.6)]"></span>
              <span className="text-rose-400 font-medium">Client Disconnected</span>
            </>
          )}
        </div>
      </div>
    </footer>
  );
}
