'use client';

import React, { useState } from 'react';
import { useAuth } from '@/context/AuthContext';
import { Shield, Lock, User as UserIcon, LogIn, AlertCircle, Eye, EyeOff, Loader2, UserPlus } from 'lucide-react';
import { BHBG } from './BHBG';

export function AuthGuard({ children }: { children: React.ReactNode }) {
  const { user, loading, signInWithUsernameOrEmail, signUpWithUsername } = useAuth();
  const [tab, setTab] = useState<'signin' | 'signup'>('signin');
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [showPassword, setShowPassword] = useState(false);
  const [error, setError] = useState<string | null>(null);
  const [isSubmitting, setIsSubmitting] = useState(false);

  const containerRef = React.useRef<HTMLDivElement>(null);

  React.useEffect(() => {
    if (typeof window === 'undefined') return;

    let rAFId: number;

    const updateViewport = () => {
      cancelAnimationFrame(rAFId);
      rAFId = requestAnimationFrame(() => {
        if (window.visualViewport && containerRef.current) {
          containerRef.current.style.height = `${window.visualViewport.height}px`;
        }
      });
    };

    const vv = window.visualViewport;
    if (vv) {
      vv.addEventListener('resize', updateViewport);
      updateViewport();
    }

    return () => {
      cancelAnimationFrame(rAFId);
      if (vv) {
        vv.removeEventListener('resize', updateViewport);
      }
    };
  }, [user]);

  // 1. Loading State Screen
  if (loading) {
    return (
      <div className="min-h-screen w-full bg-black flex flex-col items-center justify-center space-y-4">
        <div className="w-12 h-12 rounded-2xl bg-violet-500/10 border border-violet-500/30 flex items-center justify-center text-violet-400 shadow-[0_0_30px_rgba(119,68,255,0.25)] animate-pulse">
          <Shield className="w-6 h-6" />
        </div>
        <div className="flex items-center space-x-2 text-xs font-mono text-violet-400">
          <Loader2 className="w-4 h-4 animate-spin" />
          <span className="tracking-widest uppercase font-semibold">VERIFYING AUTH ACCESS</span>
        </div>
      </div>
    );
  }

  // 2. Full-Screen Lock Gate for Unauthenticated Visitors
  if (!user) {
    const handleSubmit = async (e: React.FormEvent) => {
      e.preventDefault();
      setError(null);
      setIsSubmitting(true);

      try {
        if (tab === 'signin') {
          await signInWithUsernameOrEmail(username, password);
        } else {
          if (password.length < 6) {
            throw new Error('Password must be at least 6 characters.');
          }
          await signUpWithUsername(username, password);
        }
      } catch (err: any) {
        console.error(err);
        let msg = err.message || 'Authentication failed.';
        if (msg.includes('auth/operation-not-allowed')) {
          msg = 'Email/Password authentication is not enabled in Firebase Console.';
        } else if (msg.includes('auth/email-already-in-use')) {
          msg = 'Username is already taken. Please choose another username.';
        } else if (
          msg.includes('auth/invalid-credential') ||
          msg.includes('auth/wrong-password') ||
          msg.includes('auth/user-not-found')
        ) {
          msg = 'Invalid username or password.';
        } else if (msg.includes('auth/weak-password')) {
          msg = 'Password should be at least 6 characters.';
        }
        setError(msg);
      } finally {
        setIsSubmitting(false);
      }
    };

    return (
      <div
        ref={containerRef}
        className="fixed inset-0 z-[9999] h-[100dvh] w-full bg-black overflow-y-auto flex flex-col items-center justify-center p-4 sm:p-6 pb-[calc(1rem+env(safe-area-inset-bottom))] will-change-[height]"
      >
        {/* Interactive 3D Black Hole Background */}
        <BHBG />

        {/* Lock Screen Card */}
        <div className="relative my-auto w-full max-w-[360px] shrink-0 bg-zinc-950/95 border border-zinc-800/90 backdrop-blur-2xl rounded-2xl shadow-[0_0_50px_rgba(119,68,255,0.18)] overflow-hidden">
          {/* Glowing Top Bar */}
          <div className="h-1 w-full bg-violet-600"></div>

          {/* Card Header */}
          <div className="p-4 sm:p-5 pb-3 flex items-center space-x-3 border-b border-zinc-900/80">
            <div className="w-9 h-9 rounded-xl bg-violet-500/10 border border-violet-500/30 flex items-center justify-center text-violet-400 shadow-[0_0_15px_rgba(119,68,255,0.2)] shrink-0">
              <Shield className="w-4 h-4" />
            </div>
            <div className="min-w-0 flex-1">
              <div className="flex items-center space-x-2">
                <h1 className="text-sm font-bold text-white font-mono tracking-wide uppercase truncate">
                  MTX-API
                </h1>
                <span className="inline-flex items-center space-x-1 px-1.5 py-0.5 rounded-full bg-violet-500/10 border border-violet-500/20 text-[9px] font-mono text-violet-400 uppercase tracking-wider shrink-0">
                  <span className="w-1 h-1 rounded-full bg-violet-400 animate-ping"></span>
                  <span>ONLINE</span>
                </span>
              </div>
              <p className="text-[11px] text-zinc-400 truncate">
                Authentication required
              </p>
            </div>
          </div>

          {/* Tab Selector */}
          <div className="px-4 sm:px-5 pt-3">
            <div className="grid grid-cols-2 p-0.5 bg-zinc-900/90 rounded-lg border border-zinc-800/80 text-xs font-medium">
              <button
                type="button"
                onClick={() => {
                  setTab('signin');
                  setError(null);
                }}
                className={`py-1.5 rounded-md transition-all font-mono text-[11px] uppercase tracking-wider border-0 outline-none focus:outline-none select-none ${
                  tab === 'signin'
                    ? 'bg-zinc-800 text-violet-400 font-bold shadow-sm'
                    : 'text-zinc-400 hover:text-white'
                }`}
              >
                Sign In
              </button>
              <button
                type="button"
                onClick={() => {
                  setTab('signup');
                  setError(null);
                }}
                className={`py-1.5 rounded-md transition-all font-mono text-[11px] uppercase tracking-wider border-0 outline-none focus:outline-none select-none ${
                  tab === 'signup'
                    ? 'bg-zinc-800 text-violet-400 font-bold shadow-sm'
                    : 'text-zinc-400 hover:text-white'
                }`}
              >
                Sign Up
              </button>
            </div>
          </div>

          {/* Form */}
          <div className="p-4 sm:p-5 pt-3 space-y-3">
            {error && (
              <div className="p-2.5 rounded-lg bg-rose-500/10 border border-rose-500/30 text-rose-400 text-[11px] flex items-start space-x-2">
                <AlertCircle className="w-3.5 h-3.5 shrink-0 mt-0.5" />
                <span className="leading-snug">{error}</span>
              </div>
            )}

            <form onSubmit={handleSubmit} className="space-y-3">
              <div>
                <label className="block text-[10px] font-mono text-zinc-400 mb-1 uppercase tracking-wider">
                  {tab === 'signin' ? 'Username' : 'Choose Username'}
                </label>
                <div className="relative">
                  <UserIcon className="absolute left-3 top-2.5 w-3.5 h-3.5 text-zinc-500" />
                  <input
                    type="text"
                    required
                    autoComplete="username"
                    autoCapitalize="none"
                    autoCorrect="off"
                    spellCheck={false}
                    value={username}
                    onChange={(e) => setUsername(e.target.value)}
                    placeholder={tab === 'signin' ? 'Enter username' : 'Choose a username'}
                    className="w-full h-9 pl-8 pr-3 bg-zinc-900/70 border border-zinc-800 rounded-lg text-xs text-white placeholder-zinc-500 focus:outline-none focus:border-violet-500/60 focus:ring-1 focus:ring-violet-500/60 transition-colors"
                  />
                </div>
              </div>

              <div>
                <label className="block text-[10px] font-mono text-zinc-400 mb-1 uppercase tracking-wider">
                  Password
                </label>
                <div className="relative">
                  <Lock className="absolute left-3 top-2.5 w-3.5 h-3.5 text-zinc-500" />
                  <input
                    type={showPassword ? 'text' : 'password'}
                    required
                    autoComplete={tab === 'signin' ? 'current-password' : 'new-password'}
                    autoCapitalize="none"
                    autoCorrect="off"
                    value={password}
                    onChange={(e) => setPassword(e.target.value)}
                    placeholder="••••••••••••"
                    className="w-full h-9 pl-8 pr-8 bg-zinc-900/70 border border-zinc-800 rounded-lg text-xs text-white placeholder-zinc-500 focus:outline-none focus:border-violet-500/60 focus:ring-1 focus:ring-violet-500/60 transition-colors"
                  />
                  <button
                    type="button"
                    onClick={() => setShowPassword(!showPassword)}
                    className="absolute right-2.5 top-2.5 text-zinc-500 hover:text-zinc-300 transition-colors border-0 outline-none focus:outline-none"
                  >
                    {showPassword ? <EyeOff className="w-3.5 h-3.5" /> : <Eye className="w-3.5 h-3.5" />}
                  </button>
                </div>
              </div>

              <button
                type="submit"
                disabled={isSubmitting}
                className="w-full h-9.5 flex items-center justify-center space-x-2 py-2 px-4 rounded-lg bg-violet-600 hover:bg-violet-500 text-white text-xs font-bold font-mono tracking-wider uppercase transition-all disabled:opacity-50 mt-1 border-0 outline-none focus:outline-none"
              >
                {isSubmitting ? (
                  <Loader2 className="w-4 h-4 animate-spin" />
                ) : tab === 'signin' ? (
                  <>
                    <LogIn className="w-3.5 h-3.5" />
                    <span>AUTHENTICATE</span>
                  </>
                ) : (
                  <>
                    <UserPlus className="w-3.5 h-3.5" />
                    <span>GENERATE ACCOUNT</span>
                  </>
                )}
              </button>
            </form>
          </div>
        </div>
      </div>
    );
  }

  // 3. Render Application UI once Authenticated
  return <>{children}</>;
}
