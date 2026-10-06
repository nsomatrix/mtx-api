'use client';

import React, { useState, useEffect } from 'react';
import { createPortal } from 'react-dom';
import { PlayerProfile } from '@/lib/store';
import { Radio, X, Activity, Zap, Copy, Check } from 'lucide-react';
import { copyToClipboard } from '@/lib/copy';
import { AnimatedNumber } from './AnimatedNumber';

export interface PlayerStatsModalProps {
  player: PlayerProfile | null;
  onClose: () => void;
  cleanSchoolName: (school: string) => string;
  formatGender: (gender?: string) => string;
}

export function PlayerStatsModal({
  player,
  onClose,
  cleanSchoolName,
  formatGender,
}: PlayerStatsModalProps) {
  const [mounted, setMounted] = useState(false);
  const [copied, setCopied] = useState(false);

  useEffect(() => {
    setMounted(true);
  }, []);

  if (!mounted || !player) return null;

  const handleCopyJson = async () => {
    const jsonStr = JSON.stringify(player, null, 2);
    const success = await copyToClipboard(jsonStr);
    if (success) {
      setCopied(true);
      setTimeout(() => setCopied(false), 2000);
    }
  };

  return createPortal(
    <div className="fixed inset-0 z-[9999] flex items-center justify-center p-3 sm:p-4 bg-black/85 backdrop-blur-md animate-fade-in">
      <div className="bg-zinc-900 border border-zinc-800 rounded-2xl w-full max-w-lg max-h-[88vh] overflow-y-auto p-4 sm:p-6 space-y-4 sm:space-y-6 shadow-2xl font-sans">
        {/* Modal Header */}
        <div className="flex items-center justify-between border-b border-zinc-800 pb-4">
          <div className="flex items-center space-x-3 min-w-0">
            <div className="w-10 h-10 rounded-xl bg-violet-500/10 border border-violet-500/20 flex items-center justify-center text-violet-400 font-mono font-bold text-sm shrink-0">
              {player.level}
            </div>
            <div className="min-w-0">
              <div className="flex items-center space-x-2">
                <h3 className="text-base sm:text-lg font-display font-bold text-white truncate">
                  {player.name}
                </h3>
                <span className="flex items-center space-x-1 px-1.5 py-0.5 rounded text-[9px] font-mono bg-violet-500/20 text-violet-400 border border-violet-500/30 shrink-0">
                  <Radio className="w-2.5 h-2.5 text-violet-400" />
                  <span>LIVE</span>
                </span>
              </div>
              <div className="space-y-0.5 mt-0.5">
                <p className="text-xs text-zinc-400 font-mono truncate">
                  {player.class} •{' '}
                  <span className="text-violet-400 font-medium">{cleanSchoolName(player.school)}</span>
                </p>
                <p className="text-xs font-mono text-zinc-400 truncate">
                  <span className="text-zinc-200 font-semibold">{formatGender(player.gender)}</span>
                  {player.clan || player.giaToc ? (
                    <span className="text-purple-400 font-semibold ml-2">
                      • Clan: {player.clan || player.giaToc}
                    </span>
                  ) : (
                    <span className="text-zinc-500 font-normal ml-2">• Clan: None</span>
                  )}
                </p>
              </div>
            </div>
          </div>
          <button
            onClick={onClose}
            className="p-1.5 rounded-lg text-zinc-400 hover:text-white hover:bg-zinc-800 transition-colors shrink-0 border-0 outline-none"
          >
            <X className="w-5 h-5" />
          </button>
        </div>

        {/* Health & Mana Points */}
        <div className="space-y-2 font-mono text-xs">
          <div className="flex items-center justify-between p-3 bg-black/60 rounded-xl border border-rose-500/20">
            <span className="text-rose-400 font-sans flex items-center space-x-1.5 font-semibold">
              <Activity className="w-4 h-4" />
              <span>HP</span>
            </span>
            <span className="text-sm font-bold text-white">
              <AnimatedNumber value={player.hp} /> / <AnimatedNumber value={player.maxHp} />
            </span>
          </div>
          <div className="flex items-center justify-between p-3 bg-black/60 rounded-xl border border-cyan-500/20">
            <span className="text-cyan-400 font-sans flex items-center space-x-1.5 font-semibold">
              <Zap className="w-4 h-4" />
              <span>MP</span>
            </span>
            <span className="text-sm font-bold text-white">
              <AnimatedNumber value={player.mp} /> / <AnimatedNumber value={player.maxMp} />
            </span>
          </div>
        </div>

        {/* Stats Panel */}
        <div className="bg-zinc-950 rounded-2xl border border-zinc-800 overflow-hidden divide-y divide-zinc-800/80 text-xs font-mono shadow-2xl">
          {player.exp !== undefined && (
            <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
              <span className="text-zinc-400 font-sans font-medium">Total EXP</span>
              <span className="text-emerald-400 font-extrabold">
                <AnimatedNumber value={player.exp} />
              </span>
            </div>
          )}

          {player.str !== undefined && (
            <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
              <span className="text-zinc-400 font-sans font-medium">STR / DEX / VIT / INT</span>
              <span className="text-amber-400 font-extrabold">
                {player.str} / {player.dex} / {player.vit} / {player.int}
              </span>
            </div>
          )}

          {player.unassignedPotentials !== undefined && (
            <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
              <span className="text-zinc-400 font-sans font-medium">Potentials / Skills Unassigned</span>
              <span className="text-amber-400 font-extrabold">
                {player.unassignedPotentials} / {player.unassignedSkills}
              </span>
            </div>
          )}

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Attack Damage</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.attackMin} /> - <AnimatedNumber value={player.attackMax} />
            </span>
          </div>

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Speed</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.speed} />
            </span>
          </div>

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Critical Strike</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.critical} />
            </span>
          </div>

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Accurate Point</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.accurate} />
            </span>
          </div>

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Dodge Ability</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.dodge} />
            </span>
          </div>

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Anti Fire</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.antiFire} />
            </span>
          </div>

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Anti Ice</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.antiIce} />
            </span>
          </div>

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Anti Wind</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.antiWind} />
            </span>
          </div>

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Reduce Pain</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.reducePain} />
            </span>
          </div>

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Counter Strike</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.counterStrike} />
            </span>
          </div>

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Anti Chakra</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.antiChakra} />
            </span>
          </div>

          <div className="flex items-center justify-between px-4 py-2.5 bg-zinc-900/60 hover:bg-zinc-900 transition-colors">
            <span className="text-zinc-400 font-sans font-medium">Anti Chakra Back</span>
            <span className="text-violet-400 font-extrabold">
              <AnimatedNumber value={player.antiChakraBack} />
            </span>
          </div>
        </div>

        {/* Footer Action Row */}
        <div className="pt-4 border-t border-zinc-800 flex items-center justify-between">
          <button
            onClick={handleCopyJson}
            className="flex items-center space-x-2 px-3.5 py-2 rounded-xl border border-zinc-800 bg-black text-xs text-zinc-400 hover:text-white font-mono transition-colors border-0 outline-none"
          >
            {copied ? <Check className="w-3.5 h-3.5 text-violet-400" /> : <Copy className="w-3.5 h-3.5" />}
            <span>{copied ? 'Copied JSON!' : 'Copy Raw Payload'}</span>
          </button>

          <button
            onClick={onClose}
            className="px-4 py-2 rounded-xl bg-zinc-800 text-white text-xs font-semibold hover:bg-zinc-700 transition-colors border-0 outline-none"
          >
            Close
          </button>
        </div>
      </div>
    </div>,
    document.body
  );
}
