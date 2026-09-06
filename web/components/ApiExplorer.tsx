'use client';

import React, { useState } from 'react';
import { Code2, ExternalLink, Copy, Check } from 'lucide-react';
import { copyToClipboard } from '@/lib/copy';

export function ApiExplorer() {
  const [copiedEndpoint, setCopiedEndpoint] = useState<string | null>(null);

  const endpoints = [
    {
      method: 'GET',
      path: '/api/v1/players',
      description: 'Fetches player profiles stored in memory/serverless cache.',
      badgeColor: 'bg-violet-500/10 text-violet-400 border-violet-500/20',
    },
    {
      method: 'POST',
      path: '/api/v1/players',
      description: 'Stream incoming character profile telemetry directly from game client.',
      badgeColor: 'bg-pink-500/10 text-pink-400 border-pink-500/20',
    },
    {
      method: 'GET',
      path: '/api/v1/inspect',
      description: 'Polled automatically by background client to fetch pending inspect targets.',
      badgeColor: 'bg-violet-500/10 text-violet-400 border-violet-500/20',
    },
    {
      method: 'POST',
      path: '/api/v1/inspect',
      description: 'Queues a character name for remote profile inspection.',
      badgeColor: 'bg-pink-500/10 text-pink-400 border-pink-500/20',
    },
    {
      method: 'GET',
      path: '/api/v1/chat',
      description: 'Fetches real-time chat message logs streamed from active clients.',
      badgeColor: 'bg-violet-500/10 text-violet-400 border-violet-500/20',
    },
    {
      method: 'POST',
      path: '/api/v1/chat',
      description: 'Streams live Public, Global, PM, and Clan chat telemetry from J2ME mod client.',
      badgeColor: 'bg-pink-500/10 text-pink-400 border-pink-500/20',
    },
  ];

  const copyUrl = async (path: string) => {
    const fullUrl = `${window.location.origin}${path}`;
    const success = await copyToClipboard(fullUrl);
    if (success) {
      setCopiedEndpoint(path);
      setTimeout(() => setCopiedEndpoint(null), 2000);
    }
  };

  return (
    <section className="space-y-6 pt-6 border-t border-zinc-800/80">
      <div className="flex items-center space-x-3">
        <div className="w-8 h-8 rounded-lg bg-violet-500/10 border border-violet-500/20 flex items-center justify-center text-violet-400">
          <Code2 className="w-4 h-4" />
        </div>
        <div>
          <h2 className="text-lg font-display font-bold text-white">Developer REST API Directory</h2>
          <p className="text-xs text-zinc-400 font-sans">Live HTTP REST endpoints for client integration.</p>
        </div>
      </div>

      <div className="grid grid-cols-1 md:grid-cols-2 gap-4 font-mono text-xs">
        {endpoints.map((ep) => (
          <div key={ep.path + ep.method} className="p-4 rounded-xl bg-zinc-900/60 border border-zinc-800 flex flex-col justify-between space-y-3">
            <div>
              <div className="flex items-center justify-between mb-2">
                <div className="flex items-center space-x-2">
                  <span className={`px-2 py-0.5 rounded text-[10px] font-bold border ${ep.badgeColor}`}>
                    {ep.method}
                  </span>
                  <span className="text-white font-semibold">{ep.path}</span>
                </div>
                <button
                  onClick={() => copyUrl(ep.path)}
                  className="p-1 rounded text-zinc-500 hover:text-white transition-colors"
                  title="Copy Full URL"
                >
                  {copiedEndpoint === ep.path ? <Check className="w-3.5 h-3.5 text-violet-400" /> : <Copy className="w-3.5 h-3.5" />}
                </button>
              </div>
              <p className="text-zinc-400 font-sans text-xs">{ep.description}</p>
            </div>
            {ep.method === 'GET' && (
              <a
                href={ep.path}
                target="_blank"
                rel="noopener noreferrer"
                className="inline-flex items-center space-x-1 text-[11px] text-violet-400 hover:underline font-sans"
              >
                <span>Test Endpoint</span>
                <ExternalLink className="w-3 h-3" />
              </a>
            )}
          </div>
        ))}
      </div>
    </section>
  );
}
