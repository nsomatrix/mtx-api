'use client';

import React, { useState, useEffect } from 'react';
import { createPortal } from 'react-dom';
import { PlayerProfile } from '@/lib/store';
import { X } from 'lucide-react';
import { AnimatedNumber, AnimatedTextWithNumbers } from './AnimatedNumber';

export interface EquipmentModalProps {
  player: PlayerProfile | null;
  onClose: () => void;
}

const SLOT_NAMES: { [key: number]: string } = {
  0: 'Cord',
  1: 'Weapon',
  2: 'Coat / Top Armor',
  3: 'Necklace',
  4: 'Gloves',
  5: 'Ring',
  6: 'Pants / Bottom Armor',
  7: 'Jade / Amulet',
  8: 'Shoes',
  9: 'Charm',
  10: 'Fashion Costume',
  11: 'Mask',
  12: 'Clan Aura / Armor',
  13: 'Medal',
  18: 'Fashion Costume',
  27: 'Mask / Accessory',
  29: 'Mount Gear: Coronet',
  30: 'Mount Gear: Armor',
  31: 'Mount Gear: Saddle',
  32: 'Mount Gear: Bridle',
};

const getUpgradeStyle = (upgrade: number) => {
  if (upgrade <= 0) {
    return { badge: 'bg-sky-500/5 text-sky-400/60 border border-sky-500/20', title: 'text-zinc-300' };
  } else if (upgrade === 1) {
    return { badge: 'bg-sky-500/10 text-sky-400 border border-sky-500/30', title: 'text-sky-300' };
  } else if (upgrade === 2) {
    return { badge: 'bg-blue-500/15 text-blue-400 border border-blue-500/40', title: 'text-blue-300' };
  } else if (upgrade === 3) {
    return {
      badge: 'bg-blue-500/20 text-blue-400 font-extrabold border border-blue-500/60 shadow-[0_0_8px_rgba(59,130,246,0.2)]',
      title: 'text-blue-400 font-bold',
    };
  } else if (upgrade === 4) {
    return { badge: 'bg-violet-500/10 text-violet-300 border border-violet-500/30', title: 'text-violet-300' };
  } else if (upgrade === 5) {
    return { badge: 'bg-violet-500/15 text-violet-400 border border-violet-500/40', title: 'text-violet-300' };
  } else if (upgrade === 6) {
    return { badge: 'bg-violet-500/20 text-violet-400 font-extrabold border border-violet-500/50', title: 'text-violet-400' };
  } else if (upgrade === 7) {
    return {
      badge: 'bg-green-500/25 text-green-400 font-extrabold border border-green-500/60 shadow-[0_0_8px_rgba(34,197,94,0.25)]',
      title: 'text-green-400 font-bold',
    };
  } else if (upgrade === 8) {
    return { badge: 'bg-amber-500/10 text-amber-300 border border-amber-500/30', title: 'text-amber-300' };
  } else if (upgrade === 9) {
    return { badge: 'bg-amber-500/15 text-amber-400 border border-amber-500/40', title: 'text-amber-300' };
  } else if (upgrade === 10) {
    return { badge: 'bg-amber-600/20 text-amber-400 font-extrabold border border-amber-600/50', title: 'text-amber-400' };
  } else if (upgrade === 11) {
    return {
      badge: 'bg-amber-700/25 text-amber-500 font-extrabold border border-amber-600/60 shadow-[0_0_8px_rgba(217,119,6,0.25)]',
      title: 'text-amber-400 font-bold',
    };
  } else if (upgrade === 12) {
    return { badge: 'bg-purple-500/10 text-purple-300 border border-purple-500/30', title: 'text-purple-300' };
  } else if (upgrade === 13) {
    return { badge: 'bg-purple-500/15 text-purple-400 border border-purple-500/40', title: 'text-purple-300' };
  } else if (upgrade === 14) {
    return {
      badge: 'bg-purple-500/25 text-purple-400 font-extrabold border border-purple-500/60 shadow-[0_0_10px_rgba(168,85,247,0.3)]',
      title: 'text-purple-300 font-bold',
    };
  } else if (upgrade === 15) {
    return {
      badge: 'bg-rose-500/20 text-rose-400 font-extrabold border border-rose-500/50 shadow-[0_0_10px_rgba(244,63,94,0.3)]',
      title: 'text-rose-400 font-bold',
    };
  } else {
    return {
      badge: 'bg-red-500/30 text-red-400 font-extrabold border border-red-500/70 shadow-[0_0_14px_rgba(239,68,68,0.4)] animate-pulse',
      title: 'text-red-400 font-extrabold',
    };
  }
};

export function EquipmentModal({ player, onClose }: EquipmentModalProps) {
  const [mounted, setMounted] = useState(false);
  const [equipmentTab, setEquipmentTab] = useState<1 | 2>(1);

  useEffect(() => {
    setMounted(true);
  }, []);

  if (!mounted || !player) return null;

  return createPortal(
    <div className="fixed inset-0 z-[9999] flex items-center justify-center p-3 sm:p-4 bg-black/85 backdrop-blur-md animate-fade-in">
      <div className="bg-zinc-900 border border-zinc-800 rounded-2xl w-full max-w-lg max-h-[88vh] overflow-y-auto p-4 sm:p-6 space-y-4 shadow-2xl font-sans text-white">
        <div className="flex items-center justify-between border-b border-zinc-800 pb-4">
          <div className="flex items-center space-x-3">
            <div className="w-10 h-10 rounded-xl bg-violet-500/10 border border-violet-500/20 flex items-center justify-center text-violet-400 font-mono font-bold text-sm shrink-0">
              <AnimatedNumber value={player.level} />
            </div>
            <div>
              <div className="flex items-center space-x-2">
                <h3 className="text-lg font-display font-bold text-white">{player.name}</h3>
                <span className="px-2 py-0.5 rounded text-[10px] font-mono bg-violet-500/10 text-violet-400 border border-violet-500/20">
                  {player.class}
                </span>
              </div>
              <p className="text-xs text-zinc-400 font-sans mt-0.5">Equipped Items Overview</p>
            </div>
          </div>
          <button
            onClick={onClose}
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
          const currentEquip = (player.equipment || []).filter((e) => e.tab === equipmentTab);
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
                const isMount = item.type === 33;

                return (
                  <div key={idx} className="p-3 hover:bg-zinc-900/60 transition-colors space-y-2">
                    <div className="flex items-start justify-between">
                      <div className="space-y-0.5">
                        <div className="flex items-center space-x-2 flex-wrap gap-y-1">
                          <span className={`text-xs font-semibold ${style.title}`}>{item.name}</span>
                          {item.upgrade > 0 && !isMount && (
                            <span className={`px-1.5 py-0.2 rounded text-[10px] font-mono ${style.badge}`}>
                              +<AnimatedNumber value={item.upgrade} />
                            </span>
                          )}
                          {item.isBound && (
                            <span className="px-1.5 py-0.2 rounded text-[9px] font-mono bg-zinc-800 text-zinc-400 border border-zinc-700">
                              Bound
                            </span>
                          )}
                        </div>
                        <p className="text-[10px] font-mono text-zinc-500">
                          {slotName} • Req Lvl <AnimatedNumber value={item.reqLevel} />
                          {item.durability !== undefined && item.durability > 0 ? (
                            <> • <AnimatedNumber value={item.durability} /> Durability</>
                          ) : item.sockets ? (
                            <> • <AnimatedNumber value={item.sockets} /> Sockets</>
                          ) : (
                            ''
                          )}
                          {item.expiresIn && item.expiresIn !== 'Permanent' ? ` • Exp: ${item.expiresIn}` : ''}
                        </p>
                      </div>
                    </div>

                    {item.options && item.options.length > 0 && (
                      <div className="pt-2 border-t border-zinc-800/60 grid grid-cols-1 sm:grid-cols-2 gap-1 text-[11px] font-mono text-emerald-400">
                        {item.options.map((opt, oIdx) => (
                          <div key={oIdx} className="flex items-center space-x-1">
                            <span className="text-zinc-600">•</span>
                            <span>
                              <AnimatedTextWithNumbers text={opt.text} />
                            </span>
                          </div>
                        ))}
                      </div>
                    )}
                  </div>
                );
              })}
            </div>
          );
        })()}

        <div className="pt-3 border-t border-zinc-800 flex justify-end">
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
