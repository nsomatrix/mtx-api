'use client';

import React from 'react';
import { PlayerProfile } from '@/lib/store';
import { Activity, RefreshCw, X, ChevronRight } from 'lucide-react';
import { AnimatedNumber } from './AnimatedNumber';

export interface PlayerCardProps {
  player: PlayerProfile;
  remainingCooldownSecs: number;
  isRefreshing: boolean;
  onSelectStats: (player: PlayerProfile) => void;
  onSelectEquipment: (player: PlayerProfile) => void;
  onRefresh: (player: PlayerProfile) => void;
  onDismiss: (playerName: string) => void;
  cleanSchoolName: (school: string) => string;
  formatGender: (gender?: string) => string;
}

export function PlayerCard({
  player: p,
  remainingCooldownSecs,
  isRefreshing,
  onSelectStats,
  onSelectEquipment,
  onRefresh,
  onDismiss,
  cleanSchoolName,
  formatGender,
}: PlayerCardProps) {
  const hpPercent = p.maxHp > 0 ? Math.min(100, Math.round((p.hp / p.maxHp) * 100)) : 0;
  const mpPercent = p.maxMp > 0 ? Math.min(100, Math.round((p.mp / p.maxMp) * 100)) : 0;
  const schoolName = cleanSchoolName(p.school);

  return (
    <div
      onClick={() => onSelectStats(p)}
      className="group p-5 rounded-2xl bg-zinc-900/80 border border-zinc-800/80 hover:border-violet-500/50 hover:bg-zinc-900 transition-all cursor-pointer space-y-4 flex flex-col justify-between relative overflow-hidden"
    >
      <div>
        {/* Top Header: Name, Level & Action buttons */}
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
                <span>
                  <span className="text-zinc-300 font-medium">{formatGender(p.gender)}</span>
                </span>
                {p.clan || p.giaToc ? (
                  <span className="text-purple-400 font-medium ml-2">
                    • Clan: {p.clan || p.giaToc}
                  </span>
                ) : (
                  <span className="text-zinc-500 font-normal ml-2">• Clan: None</span>
                )}
              </p>
            </div>
          </div>

          <div className="flex items-center space-x-1" onClick={(e) => e.stopPropagation()}>
            {/* Refresh Button for Card with 1-min Cooldown */}
            <button
              type="button"
              disabled={remainingCooldownSecs > 0 || isRefreshing}
              onClick={() => onRefresh(p)}
              className={`p-1.5 rounded-lg transition-colors border-0 outline-none flex items-center space-x-1 text-[11px] font-mono ${
                remainingCooldownSecs > 0
                  ? 'bg-zinc-800/80 text-zinc-500 cursor-not-allowed'
                  : 'text-violet-400 hover:bg-violet-500/10'
              }`}
              title={
                remainingCooldownSecs > 0
                  ? `Refresh cooldown: ${remainingCooldownSecs}s remaining`
                  : 'Refresh live stats'
              }
            >
              <RefreshCw className={`w-3.5 h-3.5 ${isRefreshing ? 'animate-spin text-violet-400' : ''}`} />
              {remainingCooldownSecs > 0 && <span className="font-bold text-amber-400">{remainingCooldownSecs}s</span>}
            </button>

            {/* Dismiss Button */}
            <button
              type="button"
              onClick={() => onDismiss(p.name)}
              className="p-1.5 rounded-lg text-zinc-400 hover:text-rose-400 hover:bg-rose-500/10 transition-colors border-0 outline-none"
              title="Dismiss player profile"
            >
              <X className="w-4 h-4" />
            </button>
          </div>
        </div>

        {/* HP / MP Gauges */}
        <div className="space-y-2 pt-3 border-t border-zinc-800/60 mt-3 font-mono text-[11px]">
          <div>
            <div className="flex justify-between text-zinc-400 mb-1">
              <span className="text-rose-400 flex items-center">
                <Activity className="w-3 h-3 mr-1" /> HP
              </span>
              <span>
                <AnimatedNumber value={p.hp} /> / <AnimatedNumber value={p.maxHp} />
              </span>
            </div>
            <div className="h-1.5 w-full bg-zinc-800 rounded-full overflow-hidden">
              <div
                className="h-full bg-gradient-to-r from-rose-500 to-rose-400 rounded-full transition-all duration-500"
                style={{ width: `${hpPercent}%` }}
              />
            </div>
          </div>

          <div>
            <div className="flex justify-between text-zinc-400 mb-1">
              <span className="text-cyan-400 flex items-center">
                <Activity className="w-3 h-3 mr-1" /> MP
              </span>
              <span>
                <AnimatedNumber value={p.mp} /> / <AnimatedNumber value={p.maxMp} />
              </span>
            </div>
            <div className="h-1.5 w-full bg-zinc-800 rounded-full overflow-hidden">
              <div
                className="h-full bg-gradient-to-r from-cyan-500 to-cyan-400 rounded-full transition-all duration-500"
                style={{ width: `${mpPercent}%` }}
              />
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
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={p.critical} />
            </span>
          </div>

          <div className="flex items-center justify-between py-1.5 px-3 rounded-xl bg-zinc-950/80 border border-zinc-800/80">
            <span className="text-[11px] text-zinc-400 font-sans font-medium">Reduce Pain</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={p.reducePain} />
            </span>
          </div>
        </div>
      </div>

      {/* Footer Controls */}
      <div
        className="pt-3 flex items-center justify-between text-xs font-medium border-t border-zinc-800/60 gap-2"
        onClick={(e) => e.stopPropagation()}
      >
        <button
          onClick={() => onSelectStats(p)}
          className="flex-1 py-2 px-3 rounded-xl bg-zinc-900 border border-zinc-800 text-zinc-300 hover:text-white hover:bg-zinc-800 transition-all flex items-center justify-between text-[11px] border-0 outline-none"
        >
          <span>View Stats</span>
          <ChevronRight className="w-3.5 h-3.5 text-zinc-400" />
        </button>

        <button
          onClick={() => onSelectEquipment(p)}
          className="py-2 px-3 rounded-xl bg-violet-500/10 text-violet-400 hover:bg-violet-500/20 transition-all border border-violet-500/20 flex items-center space-x-1.5 text-[11px] font-bold outline-none"
        >
          <span>View Equipment</span>
        </button>
      </div>
    </div>
  );
}
