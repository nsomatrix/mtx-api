'use client';

import React from 'react';
import Link from 'next/link';
import { UserCheck, MessageSquare, ArrowRight, Clock } from 'lucide-react';

interface ModuleGridProps {
  targetCount: number;
}

export function ModuleGrid({ targetCount }: ModuleGridProps) {
  const activeModules = [
    {
      id: 'player-io',
      title: 'Player IO Engine',
      version: 'v1.0 ACTIVE',
      href: '/io',
      icon: UserCheck,
      description: 'Fetch detailed player profiles via remote telemetry requests & stream live character stats.',
      badgeText: `${targetCount} Profiles`,
      actionText: 'Launch Module',
      disabled: false,
    },
    {
      id: 'connect',
      title: 'Connect Telemetry Stream',
      version: 'IN PROGRESS',
      href: '',
      icon: MessageSquare,
      description: 'Monitor real-time Public, Global, PM Chat, and Clan chat logs streamed from active clients.',
      badgeText: 'Telemetry Stream Paused',
      actionText: 'In Progress',
      disabled: true,
    },
  ];

  return (
    <section className="space-y-4">
      {/* Section Header */}
      <div className="flex items-center justify-between">
        <div>
          <h2 className="text-xl font-display font-extrabold text-white tracking-tight">
            Operational Platform Modules
          </h2>
          <p className="text-xs text-zinc-400 font-sans mt-0.5">
            Dedicated module environments available for live execution.
          </p>
        </div>
      </div>

      {/* Grid of Operational Modules */}
      <div className="grid grid-cols-1 md:grid-cols-2 gap-5">
        {activeModules.map((mod) => {
          const Icon = mod.icon;

          if (mod.disabled) {
            return (
              <div
                key={mod.id}
                className="relative rounded-2xl p-6 border bg-zinc-900/40 border-zinc-800/80 cursor-not-allowed select-none opacity-80 flex flex-col justify-between"
              >
                <div>
                  {/* Module Header */}
                  <div className="flex items-start justify-between mb-4">
                    <div className="w-10 h-10 rounded-xl bg-zinc-800/50 border border-zinc-700/50 text-zinc-500 flex items-center justify-center">
                      <Icon className="w-5 h-5" />
                    </div>
                    <span className="px-2 py-0.5 rounded text-[10px] font-mono font-medium border bg-amber-500/10 text-amber-400 border-amber-500/20">
                      {mod.version}
                    </span>
                  </div>

                  {/* Title & Description */}
                  <h3 className="text-base font-display font-bold text-zinc-300">
                    {mod.title}
                  </h3>
                  <p className="text-xs text-zinc-400 mt-2 leading-relaxed font-sans">
                    {mod.description}
                  </p>
                </div>

                {/* Card Footer */}
                <div className="pt-6 mt-4 border-t border-zinc-800/50 flex items-center justify-between text-xs">
                  <span className="font-mono text-[11px] text-zinc-500">{mod.badgeText}</span>
                  <div className="flex items-center space-x-1.5 font-semibold text-xs text-amber-400/90 font-mono">
                    <Clock className="w-3.5 h-3.5" />
                    <span>{mod.actionText}</span>
                  </div>
                </div>
              </div>
            );
          }

          return (
            <Link
              key={mod.id}
              href={mod.href}
              className="group relative rounded-2xl p-6 border bg-zinc-900/80 border-violet-500/30 hover:border-violet-500/60 hover:bg-zinc-900 cursor-pointer shadow-[0_0_25px_rgba(119,68,255,0.12)] transition-all duration-200 flex flex-col justify-between"
            >
              <div>
                {/* Module Header */}
                <div className="flex items-start justify-between mb-4">
                  <div className="w-10 h-10 rounded-xl bg-violet-500/10 border border-violet-500/20 text-violet-400 flex items-center justify-center">
                    <Icon className="w-5 h-5" />
                  </div>
                  <span className="px-2 py-0.5 rounded text-[10px] font-mono font-medium border bg-violet-500/10 text-violet-400 border-violet-500/20">
                    {mod.version}
                  </span>
                </div>

                {/* Title & Description */}
                <h3 className="text-base font-display font-bold text-white group-hover:text-violet-400 transition-colors">
                  {mod.title}
                </h3>
                <p className="text-xs text-zinc-400 mt-2 leading-relaxed font-sans">
                  {mod.description}
                </p>
              </div>

              {/* Card Footer */}
              <div className="pt-6 mt-4 border-t border-zinc-800/50 flex items-center justify-between text-xs">
                <span className="font-mono text-[11px] text-zinc-500">{mod.badgeText}</span>
                <div className="flex items-center space-x-1.5 font-semibold text-xs text-violet-400 group-hover:translate-x-1 transition-transform">
                  <span>{mod.actionText}</span>
                  <ArrowRight className="w-3.5 h-3.5" />
                </div>
              </div>
            </Link>
          );
        })}
      </div>
    </section>
  );
}
