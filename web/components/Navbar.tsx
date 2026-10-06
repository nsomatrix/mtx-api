'use client';

import React, { useState, useEffect, useRef } from 'react';
import Link from 'next/link';
import { usePathname } from 'next/navigation';
import { Shield, Menu, X, Activity, Search, FileText, LogIn, LogOut, User as UserIcon, ChevronDown } from 'lucide-react';
import { useAuth } from '@/context/AuthContext';
import { useStatus } from '@/context/StatusContext';
import { AuthModal } from '@/components/AuthModal';

interface NavbarProps {
  playerCount?: number;
  activeTab?: string;
  onTabChange?: (tab: string) => void;
}

export function Navbar({ playerCount = 0 }: NavbarProps) {
  const [mobileMenuOpen, setMobileMenuOpen] = useState(false);
  const [authModalOpen, setAuthModalOpen] = useState(false);
  const [userDropdownOpen, setUserDropdownOpen] = useState(false);
  const dropdownRef = useRef<HTMLDivElement>(null);
  const pathname = usePathname();
  const { user, logout, loading } = useAuth();
  const { modClientOnline, playerCount: statusPlayerCount } = useStatus();
  const livePlayerCount = playerCount || statusPlayerCount;

  // Close user dropdown when clicking outside
  useEffect(() => {
    function handleClickOutside(event: MouseEvent) {
      if (dropdownRef.current && !dropdownRef.current.contains(event.target as Node)) {
        setUserDropdownOpen(false);
      }
    }
    if (userDropdownOpen) {
      document.addEventListener('mousedown', handleClickOutside);
    }
    return () => {
      document.removeEventListener('mousedown', handleClickOutside);
    };
  }, [userDropdownOpen]);

  // Close menus on Escape key
  useEffect(() => {
    function handleKeyDown(event: KeyboardEvent) {
      if (event.key === 'Escape') {
        setUserDropdownOpen(false);
        setMobileMenuOpen(false);
      }
    }
    window.addEventListener('keydown', handleKeyDown);
    return () => window.removeEventListener('keydown', handleKeyDown);
  }, []);

  const navItems = [
    { id: 'dashboard', label: 'Dashboard', href: '/', icon: Activity, disabled: false },
    { id: 'io', label: 'Player IO', href: '/io', icon: Search, disabled: false },
    { id: 'docs', label: 'API Docs', href: '/docs', icon: FileText, disabled: false },
  ];

  return (
    <>
      <header className="sticky top-0 z-50 w-full border-b border-zinc-800/80 bg-black/80 backdrop-blur-xl">
        <div className="max-w-7xl mx-auto px-4 sm:px-6 lg:px-8 h-16 flex items-center justify-between">
          {/* Left: Brand Logo & Title */}
          <div className="flex items-center space-x-6">
            <Link href="/" className="flex items-center space-x-3 cursor-pointer group">
              <div className="w-9 h-9 rounded-xl bg-violet-500/10 border border-violet-500/30 flex items-center justify-center text-violet-400 shadow-[0_0_15px_rgba(119,68,255,0.2)] group-hover:border-violet-500/50 transition-colors">
                <Shield className="w-5 h-5" />
              </div>
              <div>
                <span className="font-display font-extrabold text-base tracking-tight text-white uppercase group-hover:text-violet-400 transition-colors">
                  mtx-api
                </span>
              </div>
            </Link>

            {/* Desktop Navigation Links */}
            <nav className="hidden md:flex items-center space-x-1 pl-4 border-l border-zinc-800">
              {navItems.map((item) => {
                const Icon = item.icon;
                const isActive = pathname === item.href;

                if (item.disabled) {
                  return (
                    <div
                      key={item.id}
                      className="flex items-center space-x-1.5 px-3 py-2 rounded-lg text-xs font-medium text-zinc-500 cursor-not-allowed select-none opacity-80"
                      title="Connect Telemetry Stream is temporarily disabled (In Progress)"
                    >
                      <Icon className="w-3.5 h-3.5 text-zinc-500" />
                      <span>{item.label}</span>
                      <span className="text-[9px] px-1.5 py-0.5 rounded bg-amber-500/10 text-amber-400 border border-amber-500/20 font-mono">
                        In Progress
                      </span>
                    </div>
                  );
                }

                return (
                  <Link
                    key={item.id}
                    href={item.href}
                    className={`flex items-center space-x-2 px-3 py-2 rounded-lg text-xs font-medium transition-all ${
                      isActive
                        ? 'bg-zinc-900 text-violet-400 font-semibold border border-zinc-800'
                        : 'text-zinc-400 hover:text-white hover:bg-zinc-900/60'
                    }`}
                  >
                    <Icon className="w-3.5 h-3.5" />
                    <span>{item.label}</span>
                  </Link>
                );
              })}
            </nav>
          </div>

          {/* Right: Status Pill & Auth (Desktop) */}
          <div className="hidden md:flex items-center space-x-3">
            <div className="flex items-center space-x-2 px-3 py-1.5 rounded-lg bg-zinc-900/80 border border-zinc-800 text-xs font-mono">
              {modClientOnline ? (
                <>
                  <span className="relative flex h-2 w-2">
                    <span className="animate-ping absolute inline-flex h-full w-full rounded-full bg-violet-400 opacity-75"></span>
                    <span className="relative inline-flex rounded-full h-2 w-2 bg-violet-500"></span>
                  </span>
                  <span className="text-violet-400 font-bold text-[11px] tracking-wide">CLIENT ONLINE</span>
                </>
              ) : (
                <>
                  <span className="relative flex h-2 w-2">
                    <span className="relative inline-flex rounded-full h-2 w-2 bg-rose-500 shadow-[0_0_8px_rgba(244,63,94,0.6)]"></span>
                  </span>
                  <span className="text-zinc-400 font-medium text-[11px] tracking-wide">CLIENT OFFLINE</span>
                </>
              )}
            </div>

            {/* Authentication Action Button / Profile */}
            {loading ? (
              <div className="w-20 h-8 rounded-xl bg-zinc-900 border border-zinc-800 animate-pulse"></div>
            ) : user ? (
              <div className="relative" ref={dropdownRef}>
                <button
                  type="button"
                  onClick={() => setUserDropdownOpen(!userDropdownOpen)}
                  className="flex items-center space-x-2 px-3 py-1.5 rounded-xl bg-zinc-900 border border-zinc-800 hover:border-zinc-700 text-xs text-zinc-300 hover:text-white transition-all cursor-pointer select-none"
                  aria-expanded={userDropdownOpen}
                  aria-haspopup="true"
                >
                  {user.photoURL ? (
                    <img
                      src={user.photoURL}
                      alt={user.displayName || 'User'}
                      className="w-5 h-5 rounded-full border border-violet-500/40 object-cover"
                    />
                  ) : (
                    <div className="w-5 h-5 rounded-full bg-violet-500/20 text-violet-400 flex items-center justify-center text-[10px] font-bold">
                      {(user.displayName || user.email || 'U').charAt(0).toUpperCase()}
                    </div>
                  )}
                  <span className="font-medium max-w-[120px] truncate text-[11px]">
                    {user.displayName || user.email?.split('@')[0]}
                  </span>
                  <ChevronDown
                    className={`w-3.5 h-3.5 text-zinc-500 transition-transform duration-200 ${
                      userDropdownOpen ? 'rotate-180 text-violet-400' : ''
                    }`}
                  />
                </button>

                {/* Dropdown Menu */}
                {userDropdownOpen && (
                  <div className="absolute right-0 mt-2 w-56 bg-zinc-950/95 backdrop-blur-2xl border border-zinc-800/90 rounded-2xl shadow-[0_12px_40px_rgba(0,0,0,0.85)] p-2 z-[100] animate-fade-in divide-y divide-zinc-900">
                    <div className="px-3 py-2.5 mb-1 space-y-0.5">
                      <p className="text-xs font-semibold text-white truncate">
                        {user.displayName || user.email?.split('@')[0] || 'User Profile'}
                      </p>
                      <p className="text-[10px] font-mono text-zinc-400 truncate">{user.email}</p>
                    </div>
                    <div className="pt-1.5">
                      <button
                        type="button"
                        onClick={async (e) => {
                          e.preventDefault();
                          e.stopPropagation();
                          setUserDropdownOpen(false);
                          try {
                            await logout();
                          } catch (err) {
                            console.error('Logout error:', err);
                          }
                        }}
                        className="w-full flex items-center space-x-2.5 px-3 py-2.5 text-xs font-semibold text-rose-400 hover:text-rose-300 hover:bg-rose-500/10 rounded-xl transition-all cursor-pointer group"
                      >
                        <LogOut className="w-4 h-4 text-rose-400 group-hover:-translate-x-0.5 transition-transform" />
                        <span>Sign Out</span>
                      </button>
                    </div>
                  </div>
                )}
              </div>
            ) : (
              <button
                onClick={() => setAuthModalOpen(true)}
                className="flex items-center space-x-1.5 px-3 py-1.5 rounded-xl bg-violet-500/10 border border-violet-500/30 text-violet-400 hover:bg-violet-500/20 hover:border-violet-500/50 text-xs font-mono font-semibold transition-all shadow-[0_0_15px_rgba(119,68,255,0.15)]"
              >
                <LogIn className="w-3.5 h-3.5" />
                <span>SIGN IN</span>
              </button>
            )}
          </div>

          {/* Mobile Hamburger Toggle Button */}
          <div className="flex items-center space-x-2 md:hidden">
            <div className="flex items-center space-x-1.5 px-2.5 py-1 rounded-lg bg-zinc-900 border border-zinc-800 text-[10px] font-mono">
              {modClientOnline ? (
                <>
                  <span className="relative flex h-2 w-2">
                    <span className="animate-ping absolute inline-flex h-full w-full rounded-full bg-violet-400 opacity-75"></span>
                    <span className="relative inline-flex rounded-full h-2 w-2 bg-violet-500"></span>
                  </span>
                  <span className="text-violet-400 font-bold">ONLINE</span>
                </>
              ) : (
                <>
                  <span className="relative flex h-2 w-2">
                    <span className="relative inline-flex rounded-full h-2 w-2 bg-rose-500 shadow-[0_0_8px_rgba(244,63,94,0.6)]"></span>
                  </span>
                  <span className="text-rose-400 font-semibold">OFFLINE</span>
                </>
              )}
            </div>

            <button
              onClick={() => setMobileMenuOpen(!mobileMenuOpen)}
              className="p-2 rounded-lg text-zinc-400 hover:text-white hover:bg-zinc-900 border border-zinc-800/80 transition-colors"
              aria-label="Toggle Navigation Menu"
            >
              {mobileMenuOpen ? <X className="w-5 h-5" /> : <Menu className="w-5 h-5" />}
            </button>
          </div>
        </div>

        {/* Mobile Slide-Down Menu Drawer */}
        {mobileMenuOpen && (
          <div className="md:hidden border-b border-zinc-800 bg-black/95 backdrop-blur-2xl px-4 pt-3 pb-5 space-y-3 animate-fade-in">
            <nav className="space-y-1">
              {navItems.map((item) => {
                const Icon = item.icon;
                const isActive = pathname === item.href;

                if (item.disabled) {
                  return (
                    <div
                      key={item.id}
                      className="w-full flex items-center justify-between px-3.5 py-2.5 rounded-lg text-xs font-medium text-zinc-500 cursor-not-allowed select-none opacity-80"
                    >
                      <div className="flex items-center space-x-2.5">
                        <Icon className="w-4 h-4 text-zinc-500" />
                        <span>{item.label}</span>
                      </div>
                      <span className="text-[10px] px-2 py-0.5 rounded bg-amber-500/10 text-amber-400 border border-amber-500/20 font-mono">
                        In Progress
                      </span>
                    </div>
                  );
                }

                return (
                  <Link
                    key={item.id}
                    href={item.href}
                    onClick={() => setMobileMenuOpen(false)}
                    className={`w-full flex items-center justify-between px-3.5 py-2.5 rounded-lg text-xs font-medium transition-all ${
                      isActive
                        ? 'bg-zinc-900 text-violet-400 font-semibold border border-zinc-800'
                        : 'text-zinc-400 hover:text-white hover:bg-zinc-900/60'
                    }`}
                  >
                    <div className="flex items-center space-x-2.5">
                      <Icon className="w-4 h-4" />
                      <span>{item.label}</span>
                    </div>
                  </Link>
                );
              })}
            </nav>

            <div className="pt-3 border-t border-zinc-800/80 space-y-2">
              {user ? (
                <div className="p-3.5 rounded-2xl bg-zinc-900/90 border border-zinc-800 space-y-3">
                  <div className="flex items-center space-x-3">
                    {user.photoURL ? (
                      <img
                        src={user.photoURL}
                        alt={user.displayName || 'User'}
                        className="w-10 h-10 rounded-full border border-violet-500/40 object-cover"
                      />
                    ) : (
                      <div className="w-10 h-10 rounded-full bg-violet-500/20 text-violet-400 flex items-center justify-center text-sm font-bold border border-violet-500/30">
                        {(user.displayName || user.email || 'U').charAt(0).toUpperCase()}
                      </div>
                    )}
                    <div className="min-w-0 flex-1">
                      <p className="text-xs font-bold text-white truncate">
                        {user.displayName || user.email?.split('@')[0] || 'User Profile'}
                      </p>
                      <p className="text-[11px] font-mono text-zinc-400 truncate">
                        {user.email}
                      </p>
                    </div>
                  </div>
                  <button
                    type="button"
                    onClick={async () => {
                      setMobileMenuOpen(false);
                      try {
                        await logout();
                      } catch (err) {
                        console.error('Logout error:', err);
                      }
                    }}
                    className="w-full flex items-center justify-center space-x-2 py-2.5 px-3 rounded-xl bg-rose-500/10 border border-rose-500/20 text-rose-400 hover:bg-rose-500/20 active:bg-rose-500/30 text-xs font-semibold transition-all cursor-pointer"
                  >
                    <LogOut className="w-4 h-4" />
                    <span>Sign Out</span>
                  </button>
                </div>
              ) : (
                <button
                  type="button"
                  onClick={() => {
                    setMobileMenuOpen(false);
                    setAuthModalOpen(true);
                  }}
                  className="w-full flex items-center justify-center space-x-2 py-3 rounded-xl bg-violet-500/10 border border-violet-500/30 text-violet-400 hover:bg-violet-500/20 active:bg-violet-500/30 text-xs font-mono font-bold transition-all cursor-pointer"
                >
                  <LogIn className="w-4 h-4" />
                  <span>SIGN IN TO PORTAL</span>
                </button>
              )}
            </div>
          </div>
        )}
      </header>

      {/* Auth Modal Component */}
      <AuthModal isOpen={authModalOpen} onClose={() => setAuthModalOpen(false)} />
    </>
  );
}
