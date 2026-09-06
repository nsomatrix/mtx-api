'use client';

import React, { useState, useEffect } from 'react';
import { createPortal } from 'react-dom';
import { X, Lock, User as UserIcon, LogIn, AlertCircle, Eye, EyeOff, Loader2, Key, UserPlus } from 'lucide-react';
import { useAuth } from '@/context/AuthContext';
import { BHBG } from './BHBG';

interface AuthModalProps {
  isOpen: boolean;
  onClose: () => void;
}

export function AuthModal({ isOpen, onClose }: AuthModalProps) {
  const { signInWithUsernameOrEmail, signUpWithUsername } = useAuth();
  const [mounted, setMounted] = useState(false);
  const [tab, setTab] = useState<'signin' | 'signup'>('signin');
  const [username, setUsername] = useState('');
  const [password, setPassword] = useState('');
  const [showPassword, setShowPassword] = useState(false);
  const [error, setError] = useState<string | null>(null);
  const [loading, setLoading] = useState(false);

  useEffect(() => {
    setMounted(true);
  }, []);

  // Lock background page scrolling when modal is open
  useEffect(() => {
    if (isOpen) {
      document.body.style.overflow = 'hidden';
    } else {
      document.body.style.overflow = '';
    }

    return () => {
      document.body.style.overflow = '';
    };
  }, [isOpen]);

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
  }, [isOpen]);

  if (!isOpen || !mounted) return null;

  const handleSubmit = async (e: React.FormEvent) => {
    e.preventDefault();
    setError(null);
    setLoading(true);

    try {
      if (tab === 'signin') {
        await signInWithUsernameOrEmail(username, password);
      } else {
        if (password.length < 6) {
          throw new Error('Password must be at least 6 characters.');
        }
        await signUpWithUsername(username, password);
      }
      onClose();
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
      setLoading(false);
    }
  };

  return createPortal(
    <div
      ref={containerRef}
      className="fixed inset-0 z-[9999] h-[100dvh] w-full bg-black/80 backdrop-blur-md overflow-y-auto flex flex-col items-center justify-center p-4 sm:p-6 pb-[calc(1rem+env(safe-area-inset-bottom))] animate-fade-in will-change-[height]"
    >
      <BHBG />
      <div className="relative my-auto w-full max-w-[360px] shrink-0 bg-zinc-950/95 border border-zinc-800/90 backdrop-blur-2xl rounded-2xl shadow-[0_0_50px_rgba(119,68,255,0.18)] overflow-hidden">
        {/* Glowing top border accent */}
        <div className="h-1 w-full bg-violet-600"></div>

        {/* Modal Header */}
        <div className="p-4 sm:p-5 pb-3 flex items-center justify-between border-b border-zinc-900/80">
          <div className="flex items-center space-x-3 min-w-0">
            <div className="w-9 h-9 rounded-xl bg-violet-500/10 border border-violet-500/30 flex items-center justify-center text-violet-400 shadow-[0_0_15px_rgba(119,68,255,0.2)] shrink-0">
              <Key className="w-4 h-4" />
            </div>
            <div className="min-w-0">
              <h3 className="text-sm font-bold text-white font-mono tracking-wide uppercase truncate">
                {tab === 'signin' ? 'Portal Access' : 'Register Operator'}
              </h3>
              <p className="text-[11px] text-zinc-400 truncate">CORE SECURITY</p>
            </div>
          </div>
          <button
            onClick={onClose}
            className="p-1.5 rounded-lg text-zinc-400 hover:text-white hover:bg-zinc-900 transition-colors border-0 outline-none focus:outline-none"
          >
            <X className="w-4 h-4" />
          </button>
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

        {/* Form Container */}
        <div className="p-4 sm:p-5 pt-3 space-y-3">
          {/* Error Message */}
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
              disabled={loading}
              className="w-full h-9.5 flex items-center justify-center space-x-2 py-2 px-4 rounded-lg bg-violet-600 hover:bg-violet-500 text-white text-xs font-bold font-mono tracking-wider uppercase transition-all disabled:opacity-50 mt-1 border-0 outline-none focus:outline-none"
            >
              {loading ? (
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
    </div>,
    document.body
  );
}
