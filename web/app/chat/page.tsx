'use client';

import React from 'react';
import Link from 'next/link';
import { Navbar } from '@/components/Navbar';
import { Footer } from '@/components/Footer';
import { Clock, ArrowLeft, ArrowRight } from 'lucide-react';

export default function ChatPage() {
  return (
    <div className="min-h-screen bg-black text-white flex flex-col font-sans selection:bg-violet-500/30 selection:text-violet-400">
      {/* Navbar */}
      <Navbar />

      {/* Main Content Area */}
      <main className="flex-1 max-w-7xl w-full mx-auto px-4 sm:px-6 lg:px-8 py-8 space-y-8">
        {/* Module Header */}
        <div className="border-b border-zinc-800/80 pb-6">
          <div className="flex items-center space-x-2">
            <span className="px-2.5 py-1 rounded-md bg-amber-500/10 text-amber-400 border border-amber-500/20 font-mono text-xs font-semibold">
              IN PROGRESS
            </span>
            <span className="text-zinc-500 text-xs font-mono">•</span>
            <span className="text-zinc-400 text-xs font-mono">Stream Inactive</span>
          </div>
          <h1 className="text-3xl font-display font-extrabold text-white tracking-tight mt-2">
            Live Chat Telemetry Stream
          </h1>
          <p className="text-sm text-zinc-400 max-w-2xl font-sans mt-1">
            Real-time chat log stream monitoring Public, Global, PM Chat, and Clan communications from active J2ME clients.
          </p>
        </div>

        {/* Temporarily Disabled / In Progress State */}
        <div className="py-20 text-center border border-dashed border-zinc-800 rounded-2xl p-8 bg-zinc-950/60 space-y-4">
          <div className="w-14 h-14 rounded-2xl bg-amber-500/10 border border-amber-500/20 flex items-center justify-center mx-auto text-amber-400">
            <Clock className="w-7 h-7" />
          </div>
          <div className="space-y-2">
            <h2 className="text-lg font-display font-bold text-white">
              Live Chat Stream In Progress
            </h2>
            <p className="text-xs text-zinc-400 max-w-md mx-auto font-sans leading-relaxed">
              The Live Chat Telemetry Stream is temporarily disabled. Telemetry ingestion and chat console access are paused.
            </p>
          </div>
          <div className="pt-2 flex items-center justify-center gap-3">
            <Link
              href="/"
              className="inline-flex items-center space-x-2 px-4 py-2 rounded-xl bg-zinc-900 border border-zinc-800 hover:border-violet-500/40 text-xs text-zinc-300 hover:text-white transition-all font-mono"
            >
              <ArrowLeft className="w-3.5 h-3.5" />
              <span>Back to Dashboard</span>
            </Link>
            <Link
              href="/io"
              className="inline-flex items-center space-x-2 px-4 py-2 rounded-xl bg-violet-500/10 border border-violet-500/30 text-violet-400 hover:bg-violet-500/20 text-xs transition-all font-mono font-semibold"
            >
              <span>Launch Player IO</span>
              <ArrowRight className="w-3.5 h-3.5" />
            </Link>
          </div>
        </div>
      </main>

      {/* Footer */}
      <Footer />
    </div>
  );
}
