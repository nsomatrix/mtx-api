'use client';

import React, { useState, useEffect, useCallback, useRef } from 'react';
import {
  MessageSquare,
  RefreshCw,
  Trash2,
  Send,
  MessageCircle,
  Globe,
  Users,
  User,
  ArrowRight,
  ChevronDown,
  AlertTriangle,
  X,
  Check,
} from 'lucide-react';
import { ChatMessage } from '@/lib/store';

export function LiveChatModule() {
  const [messages, setMessages] = useState<ChatMessage[]>([]);
  const [selectedChannel, setSelectedChannel] = useState<string>('ALL');
  const [loading, setLoading] = useState(false);
  const [autoRefresh, setAutoRefresh] = useState(true);
  const [showClearModal, setShowClearModal] = useState(false);

  // Outbound Web Chat Dispatch State
  const [outboundChannel, setOutboundChannel] = useState<'MAP' | 'WORLD' | 'PRIVATE' | 'CLAN'>('MAP');
  const [isChannelDropdownOpen, setIsChannelDropdownOpen] = useState(false);
  const dropdownRef = useRef<HTMLDivElement>(null);

  const [outboundRecipient, setOutboundRecipient] = useState('');
  const [outboundMessage, setOutboundMessage] = useState('');
  const [sending, setSending] = useState(false);
  const [sendStatus, setSendStatus] = useState<string | null>(null);

  const fetchChatMessages = useCallback(async () => {
    try {
      const res = await fetch('/api/v1/chat');
      if (res.ok) {
        const data = await res.json();
        const incoming: ChatMessage[] = data.messages || [];
        // Atomic single source of truth: direct state update from server
        setMessages(incoming);
      }
    } catch (e) {
      console.error('Error fetching chat messages:', e);
    }
  }, []);

  useEffect(() => {
    fetchChatMessages();
  }, [fetchChatMessages]);

  useEffect(() => {
    if (!autoRefresh) return;
    const interval = setInterval(fetchChatMessages, 3000);
    return () => clearInterval(interval);
  }, [autoRefresh, fetchChatMessages]);

  // Industry Standard: Refetch immediately when tab visibility changes or window gains focus
  useEffect(() => {
    const handleVisibilityOrFocus = () => {
      if (typeof document !== 'undefined' && document.visibilityState === 'visible') {
        fetchChatMessages();
      }
    };

    window.addEventListener('focus', handleVisibilityOrFocus);
    document.addEventListener('visibilitychange', handleVisibilityOrFocus);
    return () => {
      window.removeEventListener('focus', handleVisibilityOrFocus);
      document.removeEventListener('visibilitychange', handleVisibilityOrFocus);
    };
  }, [fetchChatMessages]);

  // Click outside listener for custom channel dropdown
  useEffect(() => {
    function handleClickOutside(event: MouseEvent) {
      if (dropdownRef.current && !dropdownRef.current.contains(event.target as Node)) {
        setIsChannelDropdownOpen(false);
      }
    }
    document.addEventListener('mousedown', handleClickOutside);
    return () => document.removeEventListener('mousedown', handleClickOutside);
  }, []);

  const handleConfirmClearHistory = async () => {
    setShowClearModal(false);
    setLoading(true);
    try {
      const res = await fetch('/api/v1/chat', { method: 'DELETE' });
      if (res.ok) {
        setMessages([]);
        if (typeof window !== 'undefined') {
          try {
            localStorage.removeItem('mtx_chat_telemetry_cache');
          } catch (e) {}
        }
      }
    } catch (e) {
      console.error('Error clearing chat history:', e);
    } finally {
      setLoading(false);
    }
  };

  const handleSendOutboundMessage = async (e: React.FormEvent) => {
    e.preventDefault();
    if (!outboundMessage.trim()) return;
    if (outboundChannel === 'PRIVATE' && !outboundRecipient.trim()) {
      setSendStatus('Recipient required for PM');
      setTimeout(() => setSendStatus(null), 3000);
      return;
    }

    setSending(true);
    setSendStatus(null);
    try {
      const res = await fetch('/api/v1/chat/send', {
        method: 'POST',
        headers: { 'Content-Type': 'application/json' },
        body: JSON.stringify({
          channel: outboundChannel,
          recipient: outboundRecipient.trim(),
          message: outboundMessage.trim(),
        }),
      });

      if (res.ok) {
        setOutboundMessage('');
        setSendStatus('Dispatched to game!');
        fetchChatMessages();
        setTimeout(() => setSendStatus(null), 4000);
      } else {
        const data = await res.json();
        setSendStatus(`Failed: ${data.error || 'Server error'}`);
        setTimeout(() => setSendStatus(null), 4000);
      }
    } catch (err: any) {
      setSendStatus(`Error: ${err.message}`);
      setTimeout(() => setSendStatus(null), 4000);
    } finally {
      setSending(false);
    }
  };

  const getChannelBadge = (channel: ChatMessage['channel']) => {
    switch (channel) {
      case 'MAP':
        return (
          <span className="px-2 py-0.5 text-[10px] font-mono font-bold bg-violet-500/10 text-violet-400 border border-violet-500/20 rounded flex items-center space-x-1 shrink-0">
            <MessageCircle className="w-3 h-3" />
            <span>PUBLIC</span>
          </span>
        );
      case 'WORLD':
        return (
          <span className="px-2 py-0.5 text-[10px] font-mono font-bold bg-amber-500/10 text-amber-400 border border-amber-500/20 rounded flex items-center space-x-1 shrink-0">
            <Globe className="w-3 h-3" />
            <span>GLOBAL</span>
          </span>
        );
      case 'PRIVATE':
        return (
          <span className="px-2 py-0.5 text-[10px] font-mono font-bold bg-purple-500/10 text-purple-400 border border-purple-500/20 rounded flex items-center space-x-1 shrink-0">
            <User className="w-3 h-3" />
            <span>PM</span>
          </span>
        );
      case 'CLAN':
        return (
          <span className="px-2 py-0.5 text-[10px] font-mono font-bold bg-cyan-500/10 text-cyan-400 border border-cyan-500/20 rounded flex items-center space-x-1 shrink-0">
            <Users className="w-3 h-3" />
            <span>CLAN</span>
          </span>
        );
      default:
        return null;
    }
  };

  const formatTime = (isoString: string) => {
    try {
      const date = new Date(isoString);
      return date.toLocaleTimeString([], { hour: '2-digit', minute: '2-digit', second: '2-digit' });
    } catch (e) {
      return '';
    }
  };

  const filteredMessages = selectedChannel === 'ALL'
    ? messages
    : messages.filter((m) => m.channel === selectedChannel);

  const channels = [
    { id: 'ALL', label: 'All Channels' },
    { id: 'MAP', label: 'Public' },
    { id: 'WORLD', label: 'Global' },
    { id: 'PRIVATE', label: 'PM' },
    { id: 'CLAN', label: 'Clan' },
  ];

  const outboundChannelOptions: { id: 'MAP' | 'WORLD' | 'PRIVATE' | 'CLAN'; label: string; icon: React.ReactNode; color: string }[] = [
    { id: 'MAP', label: 'PUBLIC CHAT', icon: <MessageCircle className="w-3.5 h-3.5" />, color: 'text-violet-400' },
    { id: 'WORLD', label: 'GLOBAL CHAT', icon: <Globe className="w-3.5 h-3.5" />, color: 'text-amber-400' },
    { id: 'PRIVATE', label: 'PM CHAT', icon: <User className="w-3.5 h-3.5" />, color: 'text-purple-400' },
    { id: 'CLAN', label: 'CLAN CHAT', icon: <Users className="w-3.5 h-3.5" />, color: 'text-cyan-400' },
  ];

  const currentOutboundOption = outboundChannelOptions.find((o) => o.id === outboundChannel) || outboundChannelOptions[0];

  const getChannelPlaceholder = () => {
    switch (outboundChannel) {
      case 'MAP':
        return 'Type public chat message';
      case 'WORLD':
        return 'Type global chat message';
      case 'PRIVATE':
        return 'Type PM chat message';
      case 'CLAN':
        return 'Type clan chat message';
      default:
        return 'Type message';
    }
  };

  return (
    <div className="space-y-4 max-w-full overflow-hidden">
      {/* Module Controls Bar */}
      <div className="p-3 sm:p-4 rounded-xl bg-zinc-900/60 border border-zinc-800/80 backdrop-blur-xl flex flex-col gap-3">
        {/* Top Controls Header */}
        <div className="flex items-center justify-between gap-2">
          <div className="flex items-center space-x-2 min-w-0">
            <MessageSquare className="w-4 h-4 text-violet-400 shrink-0" />
            <span className="font-mono text-xs font-bold text-zinc-200 truncate">CHAT CONSOLE</span>
          </div>

          <div className="flex items-center space-x-2 shrink-0">
            <button
              onClick={() => setAutoRefresh(!autoRefresh)}
              className={`flex items-center space-x-1.5 px-2.5 py-1 rounded-lg text-[11px] font-mono border transition-all outline-none border-0 ${
                autoRefresh
                  ? 'bg-violet-500/10 text-violet-400 border-violet-500/20'
                  : 'bg-zinc-900 text-zinc-500 border-zinc-800'
              }`}
            >
              <span
                className={`w-1.5 h-1.5 rounded-full ${autoRefresh ? 'bg-violet-400 animate-pulse' : 'bg-zinc-600'}`}
              />
              <span className="hidden xs:inline">{autoRefresh ? 'LIVE' : 'PAUSED'}</span>
            </button>

            <button
              onClick={fetchChatMessages}
              className="p-1.5 rounded-lg bg-zinc-800/80 text-zinc-300 hover:text-white border border-zinc-700/50 transition-colors outline-none"
              title="Refresh Messages"
            >
              <RefreshCw className={`w-3.5 h-3.5 ${loading ? 'animate-spin' : ''}`} />
            </button>

            <button
              onClick={() => setShowClearModal(true)}
              className="p-1.5 rounded-lg bg-red-500/10 text-red-400 hover:bg-red-500/20 border border-red-500/20 transition-colors outline-none"
              title="Clear Chat Logs"
            >
              <Trash2 className="w-3.5 h-3.5" />
            </button>
          </div>
        </div>

        {/* Scrollable Channel Filter Bar */}
        <div className="flex items-center gap-1.5 overflow-x-auto pb-1 no-scrollbar -mx-1 px-1">
          {channels.map((ch) => (
            <button
              key={ch.id}
              onClick={() => setSelectedChannel(ch.id)}
              className={`px-3 py-1.5 rounded-xl text-xs font-mono whitespace-nowrap transition-all shrink-0 border-0 outline-none ${
                selectedChannel === ch.id
                  ? 'bg-violet-500/15 text-violet-400 font-bold border border-violet-500/30 shadow-[0_0_10px_rgba(119,68,255,0.15)]'
                  : 'text-zinc-400 hover:text-white hover:bg-zinc-800/60 border border-transparent'
              }`}
            >
              {ch.label}
            </button>
          ))}
        </div>
      </div>

      {/* Live Stream Terminal Box */}
      <div className="rounded-xl bg-zinc-950 border border-zinc-800/80 overflow-hidden shadow-2xl flex flex-col">
        {/* Terminal Sub-header */}
        <div className="px-3 py-2.5 bg-zinc-900/80 border-b border-zinc-800/80 flex items-center justify-between text-xs font-mono">
          <span className="text-zinc-400 text-[11px] uppercase tracking-wider font-semibold">FEED TELEMETRY</span>
          <span className="text-zinc-500 text-[11px]">{filteredMessages.length} LOGS</span>
        </div>

        {/* Message Log Feed */}
        <div className="p-3 sm:p-4 max-h-[420px] overflow-y-auto space-y-2 font-mono text-xs">
          {filteredMessages.length === 0 ? (
            <div className="py-12 text-center space-y-2">
              <div className="w-10 h-10 rounded-full bg-zinc-900 border border-zinc-800 flex items-center justify-center mx-auto text-zinc-600">
                <MessageSquare className="w-5 h-5" />
              </div>
              <p className="text-zinc-400 text-xs font-sans">No chat messages intercepted yet</p>
              <p className="text-zinc-600 text-[11px] max-w-xs mx-auto font-mono">
                Messages from the J2ME mod client stream here in real time.
              </p>
            </div>
          ) : (
            filteredMessages.map((msg) => (
              <div
                key={msg.id}
                className="p-2.5 sm:p-3 rounded-lg bg-zinc-900/40 border border-zinc-800/60 hover:border-zinc-700/80 transition-all flex flex-col gap-1 min-w-0"
              >
                {/* Meta Row: Badge + Time + Sender info */}
                <div className="flex items-center justify-between gap-2 flex-wrap min-w-0">
                  <div className="flex items-center space-x-2 min-w-0 flex-wrap">
                    {getChannelBadge(msg.channel)}
                    <span className="text-white font-bold truncate max-w-[120px] sm:max-w-[180px]">{msg.sender}</span>
                    {msg.recipient && (
                      <span className="flex items-center space-x-1 text-purple-400 text-[11px] truncate">
                        <ArrowRight className="w-3 h-3 text-zinc-600 inline shrink-0" />
                        <span className="font-semibold">{msg.recipient}</span>
                      </span>
                    )}
                  </div>
                  <span className="text-zinc-500 text-[10px] shrink-0 font-mono">{formatTime(msg.timestamp)}</span>
                </div>

                {/* Message text content */}
                <p className="text-zinc-300 text-xs break-words whitespace-pre-wrap font-sans leading-relaxed pt-0.5">
                  {msg.message}
                </p>
              </div>
            ))
          )}
        </div>

        {/* Outbound Web Chat Command Bar */}
        <form onSubmit={handleSendOutboundMessage} className="p-3 bg-zinc-900/90 border-t border-zinc-800/80 space-y-2.5">
          <div className="flex items-center justify-between gap-2 text-xs font-mono">
            <div className="flex items-center space-x-1.5 min-w-0">
              <Send className="w-3 h-3 text-violet-400 shrink-0" />
              <span className="font-semibold text-zinc-300 truncate text-[11px]">OUTBOUND COMMAND DISPATCH</span>
            </div>
            {sendStatus && (
              <span className="text-[10px] text-violet-400 bg-violet-500/10 px-2 py-0.5 rounded border border-violet-500/20 shrink-0 animate-pulse font-mono">
                {sendStatus}
              </span>
            )}
          </div>

          <div className="flex flex-col sm:flex-row items-stretch gap-2">
            {/* Custom Theme Component Dropdown (No Native OS Select) */}
            <div className="flex items-center gap-2 w-full sm:w-auto">
              <div className="relative flex-1 sm:flex-none" ref={dropdownRef}>
                <button
                  type="button"
                  onClick={() => setIsChannelDropdownOpen(!isChannelDropdownOpen)}
                  className="w-full sm:w-auto px-3 py-2 rounded-xl bg-zinc-950 border border-zinc-800/90 text-xs font-mono font-bold flex items-center justify-between space-x-2.5 hover:border-zinc-700 transition-all cursor-pointer outline-none select-none"
                >
                  <div className={`flex items-center space-x-1.5 ${currentOutboundOption.color}`}>
                    {currentOutboundOption.icon}
                    <span>{currentOutboundOption.label}</span>
                  </div>
                  <ChevronDown className={`w-3.5 h-3.5 text-zinc-400 transition-transform ${isChannelDropdownOpen ? 'rotate-180' : ''}`} />
                </button>

                {/* Popover Dropdown Menu */}
                {isChannelDropdownOpen && (
                  <div className="absolute bottom-full mb-1 left-0 z-50 w-full sm:w-48 bg-zinc-950 border border-zinc-800 rounded-2xl shadow-2xl p-1.5 space-y-1 font-mono text-xs animate-fade-in backdrop-blur-xl">
                    {outboundChannelOptions.map((option) => {
                      const isSelected = option.id === outboundChannel;
                      return (
                        <button
                          key={option.id}
                          type="button"
                          onClick={() => {
                            setOutboundChannel(option.id);
                            setIsChannelDropdownOpen(false);
                          }}
                          className={`w-full flex items-center justify-between px-3 py-2 rounded-xl text-xs transition-colors border-0 outline-none ${
                            isSelected
                              ? 'bg-zinc-900 font-bold ' + option.color
                              : 'text-zinc-400 hover:text-white hover:bg-zinc-900/60'
                          }`}
                        >
                          <div className="flex items-center space-x-2">
                            {option.icon}
                            <span>{option.label}</span>
                          </div>
                          {isSelected && <Check className="w-3.5 h-3.5" />}
                        </button>
                      );
                    })}
                  </div>
                )}
              </div>

              {outboundChannel === 'PRIVATE' && (
                <input
                  type="text"
                  placeholder="Recipient"
                  value={outboundRecipient}
                  onChange={(e) => setOutboundRecipient(e.target.value)}
                  className="w-28 sm:w-36 px-3 py-2 rounded-xl bg-zinc-950 border border-zinc-800 text-xs font-mono text-purple-300 placeholder-zinc-600 focus:outline-none focus:border-purple-500/50 shrink-0"
                />
              )}
            </div>

            {/* Input & Dispatch Button Row */}
            <div className="flex items-center gap-2 flex-1 min-w-0">
              <input
                type="text"
                placeholder={getChannelPlaceholder()}
                value={outboundMessage}
                onChange={(e) => setOutboundMessage(e.target.value)}
                className="flex-1 min-w-0 px-3 py-2 rounded-xl bg-zinc-950 border border-zinc-800 text-xs font-mono text-zinc-200 placeholder-zinc-600 focus:outline-none focus:border-violet-500/50"
              />

              <button
                type="submit"
                disabled={sending || !outboundMessage.trim()}
                className="px-4 py-2 rounded-xl bg-violet-500/20 text-violet-300 hover:bg-violet-500/30 border border-violet-500/30 text-xs font-mono font-semibold flex items-center justify-center space-x-1.5 transition-all shrink-0 disabled:opacity-40 disabled:cursor-not-allowed outline-none"
              >
                <Send className={`w-3.5 h-3.5 ${sending ? 'animate-bounce' : ''}`} />
                <span className="hidden sm:inline">SEND</span>
              </button>
            </div>
          </div>
        </form>
      </div>

      {/* Cyberpunk Custom Confirmation Modal for Clearing Chat History */}
      {showClearModal && (
        <div className="fixed inset-0 z-50 flex items-center justify-center p-4 bg-black/85 backdrop-blur-md animate-fade-in">
          <div className="relative w-full max-w-sm bg-zinc-950 border border-zinc-800/90 rounded-2xl shadow-2xl overflow-hidden p-6 space-y-4">
            <div className="flex items-start space-x-3">
              <div className="w-10 h-10 rounded-xl bg-rose-500/10 border border-rose-500/30 flex items-center justify-center text-rose-400 shrink-0">
                <AlertTriangle className="w-5 h-5" />
              </div>
              <div className="space-y-1 min-w-0">
                <h3 className="text-base font-bold text-white font-display">Clear Telemetry Logs</h3>
                <p className="text-xs text-zinc-400 font-sans leading-relaxed">
                  Are you sure you want to clear all intercepted chat history? This action cannot be undone.
                </p>
              </div>
            </div>

            <div className="pt-2 flex items-center justify-end space-x-2 font-mono text-xs">
              <button
                type="button"
                onClick={() => setShowClearModal(false)}
                className="px-4 py-2 rounded-xl bg-zinc-900 border border-zinc-800 text-zinc-400 hover:text-white transition-colors outline-none"
              >
                Cancel
              </button>
              <button
                type="button"
                onClick={handleConfirmClearHistory}
                className="px-4 py-2 rounded-xl bg-rose-500 text-white font-bold hover:bg-rose-600 transition-colors shadow-[0_0_15px_rgba(244,63,94,0.2)] outline-none"
              >
                Confirm Clear
              </button>
            </div>
          </div>
        </div>
      )}
    </div>
  );
}
