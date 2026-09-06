'use client';

import React, { useState } from 'react';
import { Navbar } from '@/components/Navbar';
import { Footer } from '@/components/Footer';
import { AuthGuard } from '@/components/AuthGuard';
import { Code2, Copy, Check, Terminal, Server } from 'lucide-react';
import { copyToClipboard } from '@/lib/copy';

export default function ApiDocsPage() {
  const [copiedIndex, setCopiedIndex] = useState<string | null>(null);
  const [activeTab, setActiveTab] = useState<'all' | 'players' | 'inspect' | 'chat'>('all');
  const [activeSnippetTabs, setActiveSnippetTabs] = useState<Record<string, 'curl' | 'js' | 'response'>>({});

  const copyCode = async (text: string, id: string) => {
    const success = await copyToClipboard(text);
    if (success) {
      setCopiedIndex(id);
      setTimeout(() => setCopiedIndex(null), 2000);
    }
  };

  const setSnippetTab = (endpointId: string, tab: 'curl' | 'js' | 'response') => {
    setActiveSnippetTabs((prev) => ({ ...prev, [endpointId]: tab }));
  };

  const endpoints = [
    {
      id: 'get-players',
      category: 'players',
      method: 'GET',
      path: '/api/v1/players',
      title: 'Fetch All Saved Target Profiles',
      description: 'Retrieves all player profiles ingested into the telemetry system. Supports fuzzy search filtering via search query.',
      queryParams: [
        { name: 'q', type: 'string', optional: true, description: 'Fuzzy search by character name, school, class, or clan.' },
        { name: 'name', type: 'string', optional: true, description: 'Exact character handle lookup.' }
      ],
      curlSnippet: `curl -X GET "https://your-domain.com/api/v1/players?q=opensource" \\
  -H "Accept: application/json"`,
      jsSnippet: `const response = await fetch('/api/v1/players?q=opensource');
const data = await response.json();
console.log(data.players);`,
      responseJson: `{
  "success": true,
  "count": 1,
  "players": [
    {
      "name": "opensource",
      "level": 98,
      "class": "Ninja Kunai",
      "school": "Ookaza",
      "gender": "Male",
      "clan": "VuaHaitac",
      "hp": 26068,
      "maxHp": 26068,
      "mp": 19242,
      "maxMp": 19336,
      "speed": 9,
      "attackMin": 76616,
      "attackMax": 85128,
      "antiFire": 1835,
      "antiIce": 1789,
      "antiWind": 1324,
      "reducePain": 521,
      "accurate": 1939,
      "dodge": 3283,
      "critical": 730,
      "counterStrike": 366,
      "antiChakra": 280,
      "antiChakraBack": 0,
      "equipment": [
        {
          "tab": 1,
          "slotIndex": 0,
          "type": 0,
          "name": "Assassin Cord",
          "upgrade": 16,
          "reqLevel": 85
        }
      ]
    }
  ]
}`
    },
    {
      id: 'post-players',
      category: 'players',
      method: 'POST',
      path: '/api/v1/players',
      title: 'Ingest Player Telemetry Payload',
      description: 'Streamed directly by the J2ME mod client when a player inspection packet is intercepted.',
      bodyParams: [
        { name: 'name', type: 'string', required: true, description: 'Player handle.' },
        { name: 'level', type: 'number', required: true, description: 'Character level.' },
        { name: 'class', type: 'string', required: true, description: 'Ninja school specialization.' },
        { name: 'school', type: 'string', required: true, description: 'Ninja village / school.' },
        { name: 'gender', type: 'string', required: false, description: 'Character gender (Male / Female).' },
        { name: 'clan', type: 'string', required: false, description: 'Gia Tộc / Clan name.' }
      ],
      curlSnippet: `curl -X POST "https://your-domain.com/api/v1/players" \\
  -H "Content-Type: application/json" \\
  -d '{
    "name": "opensource",
    "level": 98,
    "class": "Ninja Kunai",
    "school": "Ookaza",
    "gender": "Male",
    "clan": "VuaHaitac"
  }'`,
      jsSnippet: `const response = await fetch('/api/v1/players', {
  method: 'POST',
  headers: { 'Content-Type': 'application/json' },
  body: JSON.stringify({
    name: 'opensource',
    level: 98,
    class: 'Ninja Kunai',
    school: 'Ookaza',
    gender: 'Male',
    clan: 'VuaHaitac'
  })
});
const data = await response.json();`,
      responseJson: `{
  "success": true,
  "message": "Player profile saved successfully"
}`
    },
    {
      id: 'get-inspect',
      category: 'inspect',
      method: 'GET',
      path: '/api/v1/inspect',
      title: 'Fetch Pending Remote Inspection Queue',
      description: 'Polled by active J2ME mod client instances to retrieve queued target inspection requests.',
      queryParams: [],
      curlSnippet: `curl -X GET "https://your-domain.com/api/v1/inspect"`,
      jsSnippet: `const response = await fetch('/api/v1/inspect');
const data = await response.json();
console.log(data.target); // Returns target player name or null`,
      responseJson: `{
  "success": true,
  "target": "opensource"
}`
    },
    {
      id: 'post-inspect',
      category: 'inspect',
      method: 'POST',
      path: '/api/v1/inspect',
      title: 'Queue On-Demand Remote Inspection',
      description: 'Triggers an on-demand inspection request. Background mod client will automatically inspect the target character in-game.',
      bodyParams: [
        { name: 'name', type: 'string', required: true, description: 'Target character name to inspect.' }
      ],
      curlSnippet: `curl -X POST "https://your-domain.com/api/v1/inspect" \\
  -H "Content-Type: application/json" \\
  -d '{ "name": "opensource" }'`,
      jsSnippet: `const response = await fetch('/api/v1/inspect', {
  method: 'POST',
  headers: { 'Content-Type': 'application/json' },
  body: JSON.stringify({ name: 'opensource' })
});
const data = await response.json();`,
      responseJson: `{
  "success": true,
  "message": "Target queued for inspection",
  "target": "opensource"
}`
    },
    {
      id: 'get-chat',
      category: 'chat',
      method: 'GET',
      path: '/api/v1/chat',
      title: 'Fetch Real-Time Chat Telemetry Logs',
      description: 'Retrieves active chat logs streamed from J2ME game clients.',
      queryParams: [
        { name: 'channel', type: 'string', optional: true, description: 'Filter by channel: all, global, public, pm, clan.' },
        { name: 'limit', type: 'number', optional: true, description: 'Maximum message count (default: 50).' }
      ],
      curlSnippet: `curl -X GET "https://your-domain.com/api/v1/chat?channel=global&limit=20"`,
      jsSnippet: `const response = await fetch('/api/v1/chat?channel=global&limit=20');
const data = await response.json();
console.log(data.messages);`,
      responseJson: `{
  "success": true,
  "messages": [
    {
      "id": "msg-1724600000",
      "sender": "opensource",
      "content": "Selling Kunai level 90 +16!",
      "channel": "Global",
      "timestamp": 1724600000000
    }
  ]
}`
    },
    {
      id: 'post-chat',
      category: 'chat',
      method: 'POST',
      path: '/api/v1/chat',
      title: 'Stream Chat Telemetry Message',
      description: 'Pushes intercepted game chat packets to the web telemetry dashboard.',
      bodyParams: [
        { name: 'sender', type: 'string', required: true, description: 'Sender character name.' },
        { name: 'content', type: 'string', required: true, description: 'Chat message text.' },
        { name: 'channel', type: 'string', required: true, description: 'Chat channel (Global, Public, PM, Clan).' }
      ],
      curlSnippet: `curl -X POST "https://your-domain.com/api/v1/chat" \\
  -H "Content-Type: application/json" \\
  -d '{
    "sender": "opensource",
    "content": "Selling Kunai level 90 +16!",
    "channel": "Global"
  }'`,
      jsSnippet: `const response = await fetch('/api/v1/chat', {
  method: 'POST',
  headers: { 'Content-Type': 'application/json' },
  body: JSON.stringify({
    sender: 'opensource',
    content: 'Selling Kunai level 90 +16!',
    channel: 'Global'
  })
});
const data = await response.json();`,
      responseJson: `{
  "success": true,
  "message": "Chat telemetry logged"
}`
    }
  ];

  const filteredEndpoints = activeTab === 'all' ? endpoints : endpoints.filter((e) => e.category === activeTab);

  return (
    <AuthGuard>
      <div className="min-h-screen bg-black text-white flex flex-col font-sans selection:bg-violet-500/30 selection:text-violet-400 overflow-x-hidden w-full">
        <Navbar />

        <main className="flex-1 max-w-7xl w-full mx-auto px-3 sm:px-6 lg:px-8 py-4 sm:py-8 space-y-5 sm:space-y-8 min-w-0">
          {/* Mobile-Optimized Glassmorphic Hero Banner */}
          <div className="relative rounded-2xl bg-gradient-to-b from-zinc-900/90 via-zinc-900/50 to-black border border-zinc-800/80 p-4 sm:p-8 overflow-hidden shadow-2xl space-y-3 sm:space-y-4 w-full min-w-0">
            <div className="absolute top-0 right-0 -mt-12 -mr-12 w-72 sm:w-96 h-72 sm:h-96 bg-violet-500/10 rounded-full blur-3xl pointer-events-none" />

            <div className="inline-flex items-center space-x-2 px-2.5 py-1 rounded-full bg-violet-500/10 border border-violet-500/20 text-violet-400 text-[11px] sm:text-xs font-semibold">
              <Code2 className="w-3.5 h-3.5 shrink-0" />
              <span>Developer REST Interface v1.0</span>
            </div>

            <h1 className="text-2xl sm:text-4xl font-display font-extrabold tracking-tight text-white leading-tight">
              mtx-api <span className="text-violet-400">REST Documentation</span>
            </h1>

            <p className="text-xs sm:text-sm text-zinc-400 max-w-3xl leading-relaxed font-sans">
              Complete HTTP API reference for Ninja School Online J2ME mod client telemetry integration. Ingest live character profiles, poll remote inspection queues, and stream chat telemetry.
            </p>

            {/* Mobile Touch-Friendly Category Scroll Filter */}
            <div className="pt-2 sm:pt-4 flex items-center space-x-2 overflow-x-auto no-scrollbar scroll-smooth text-xs font-mono w-full min-w-0">
              {[
                { id: 'all', label: 'All Endpoints' },
                { id: 'players', label: 'Player Profiles (/players)' },
                { id: 'inspect', label: 'Remote Inspection (/inspect)' },
                { id: 'chat', label: 'Chat Telemetry (/chat)' },
              ].map((tab) => (
                <button
                  key={tab.id}
                  onClick={() => setActiveTab(tab.id as any)}
                  className={`px-3 py-1.5 rounded-xl border whitespace-nowrap transition-all text-xs border-0 outline-none shrink-0 ${
                    activeTab === tab.id
                      ? 'bg-violet-500/10 text-violet-400 border border-violet-500/30 font-bold shadow-sm'
                      : 'bg-zinc-900/80 text-zinc-400 border border-zinc-800 hover:text-white'
                  }`}
                >
                  {tab.label}
                </button>
              ))}
            </div>
          </div>

          {/* Responsive Endpoints Cards List */}
          <div className="space-y-5 sm:space-y-6 w-full min-w-0">
            {filteredEndpoints.map((ep) => {
              const currentSnippetTab = activeSnippetTabs[ep.id] || 'curl';
              const paramsList = ep.queryParams || ep.bodyParams || [];

              return (
                <div
                  key={ep.id}
                  id={ep.id}
                  className="rounded-2xl bg-zinc-950 border border-zinc-800/90 overflow-hidden shadow-2xl transition-all w-full min-w-0 max-w-full"
                >
                  {/* Endpoint Header Bar */}
                  <div className="p-3.5 sm:p-5 bg-zinc-900/70 border-b border-zinc-800/80 flex flex-col sm:flex-row sm:items-center sm:justify-between gap-2 sm:gap-4 w-full min-w-0">
                    <div className="flex items-center space-x-2.5 min-w-0 w-full sm:w-auto">
                      <span
                        className={`px-2 py-0.5 rounded text-[10px] sm:text-xs font-mono font-extrabold border shrink-0 ${
                          ep.method === 'GET'
                            ? 'bg-violet-500/10 text-violet-400 border-violet-500/20'
                            : 'bg-blue-500/10 text-blue-400 border-blue-500/20'
                        }`}
                      >
                        {ep.method}
                      </span>
                      <span className="font-mono text-xs sm:text-sm font-bold text-white break-all min-w-0">
                        {ep.path}
                      </span>
                    </div>
                    <span className="text-[11px] sm:text-xs text-zinc-400 font-sans font-medium shrink-0">
                      {ep.title}
                    </span>
                  </div>

                  {/* Body Content */}
                  <div className="p-3.5 sm:p-6 space-y-4 sm:space-y-6 w-full min-w-0">
                    <p className="text-xs sm:text-sm text-zinc-300 font-sans leading-relaxed">
                      {ep.description}
                    </p>

                    {/* Parameters Table: Mobile Stacked Cards + Desktop HTML Table */}
                    {paramsList.length > 0 && (
                      <div className="space-y-2 w-full min-w-0">
                        <h4 className="text-[11px] sm:text-xs font-mono font-bold uppercase tracking-wider text-zinc-400">
                          {ep.queryParams ? 'Query Parameters' : 'Request Body Parameters'}
                        </h4>

                        {/* Mobile Stacked Card View (< 640px) */}
                        <div className="block sm:hidden space-y-2 font-mono text-xs w-full min-w-0">
                          {paramsList.map((param: any) => (
                            <div
                              key={param.name}
                              className="p-3 rounded-xl bg-zinc-900/60 border border-zinc-800/80 space-y-1.5 w-full min-w-0"
                            >
                              <div className="flex items-center justify-between gap-2 w-full min-w-0">
                                <span className="text-violet-400 font-bold text-xs truncate min-w-0">{param.name}</span>
                                <div className="flex items-center space-x-1.5 text-[10px] shrink-0">
                                  <span className="text-zinc-400">{param.type}</span>
                                  {param.required ? (
                                    <span className="px-1.5 py-0.5 rounded bg-rose-500/10 text-rose-400 border border-rose-500/20 font-bold">
                                      Required
                                    </span>
                                  ) : (
                                    <span className="px-1.5 py-0.5 rounded bg-zinc-800 text-zinc-400">
                                      Optional
                                    </span>
                                  )}
                                </div>
                              </div>
                              <p className="text-[11px] text-zinc-400 font-sans leading-normal break-words">
                                {param.description}
                              </p>
                            </div>
                          ))}
                        </div>

                        {/* Desktop Table View (>= 640px) */}
                        <div className="hidden sm:block bg-zinc-900/60 rounded-xl border border-zinc-800/80 overflow-hidden font-mono text-xs w-full">
                          <table className="w-full text-left border-collapse">
                            <thead>
                              <tr className="border-b border-zinc-800 bg-zinc-900 text-zinc-400 font-sans">
                                <th className="p-3 font-semibold">Parameter</th>
                                <th className="p-3 font-semibold">Type</th>
                                <th className="p-3 font-semibold">Requirement</th>
                                <th className="p-3 font-semibold">Description</th>
                              </tr>
                            </thead>
                            <tbody className="divide-y divide-zinc-800/60">
                              {paramsList.map((param: any) => (
                                <tr key={param.name} className="hover:bg-zinc-900/40">
                                  <td className="p-3 text-violet-400 font-bold">{param.name}</td>
                                  <td className="p-3 text-zinc-300">{param.type}</td>
                                  <td className="p-3">
                                    {param.required ? (
                                      <span className="text-rose-400 font-bold text-[11px]">Required</span>
                                    ) : (
                                      <span className="text-zinc-500 text-[11px]">Optional</span>
                                    )}
                                  </td>
                                  <td className="p-3 text-zinc-400 font-sans">{param.description}</td>
                                </tr>
                              ))}
                            </tbody>
                          </table>
                        </div>
                      </div>
                    )}

                    {/* Code Snippets Section: Mobile Segmented Switcher & Desktop Split View */}

                    {/* Mobile Segmented Switcher Header (< 1024px) */}
                    <div className="block lg:hidden space-y-2.5 w-full min-w-0">
                      {/* Segmented Tab Buttons */}
                      <div className="flex items-center gap-1 p-1 bg-zinc-900 rounded-xl border border-zinc-800 text-[10px] sm:text-[11px] font-mono overflow-x-auto max-w-full no-scrollbar w-full">
                        <button
                          onClick={() => setSnippetTab(ep.id, 'curl')}
                          className={`px-2.5 py-1 rounded-lg transition-all whitespace-nowrap ${
                            currentSnippetTab === 'curl'
                              ? 'bg-zinc-800 text-violet-400 font-bold'
                              : 'text-zinc-400 hover:text-white'
                          }`}
                        >
                          cURL
                        </button>
                        <button
                          onClick={() => setSnippetTab(ep.id, 'js')}
                          className={`px-2.5 py-1 rounded-lg transition-all whitespace-nowrap ${
                            currentSnippetTab === 'js'
                              ? 'bg-zinc-800 text-violet-400 font-bold'
                              : 'text-zinc-400 hover:text-white'
                          }`}
                        >
                          JS Fetch
                        </button>
                        <button
                          onClick={() => setSnippetTab(ep.id, 'response')}
                          className={`px-2.5 py-1 rounded-lg transition-all whitespace-nowrap ${
                            currentSnippetTab === 'response'
                              ? 'bg-zinc-800 text-blue-400 font-bold'
                              : 'text-zinc-400 hover:text-white'
                          }`}
                        >
                          200 OK Response
                        </button>
                      </div>

                      {/* Scrollable Code Box Container with Absolute Fixed Copy Button */}
                      <div className="relative w-full min-w-0 max-w-full overflow-hidden rounded-xl bg-black border border-zinc-800 group">
                        <button
                          onClick={() => {
                            const codeToCopy =
                              currentSnippetTab === 'curl'
                                ? ep.curlSnippet
                                : currentSnippetTab === 'js'
                                ? ep.jsSnippet
                                : ep.responseJson;
                            copyCode(codeToCopy, `${ep.id}-${currentSnippetTab}`);
                          }}
                          className="absolute top-2.5 right-2.5 z-10 w-7 h-7 rounded-lg bg-zinc-900/90 hover:bg-zinc-800 border border-zinc-700/60 flex items-center justify-center text-zinc-400 hover:text-white transition-all shadow-md active:scale-95"
                          title="Copy snippet"
                        >
                          {copiedIndex === `${ep.id}-${currentSnippetTab}` ? (
                            <Check className="w-3.5 h-3.5 text-violet-400" />
                          ) : (
                            <Copy className="w-3.5 h-3.5" />
                          )}
                        </button>
                        <pre className="p-3.5 sm:p-4 text-[10px] sm:text-xs font-mono leading-relaxed overflow-x-auto max-h-64 scrollbar-thin text-zinc-300 w-full min-w-0 pr-11">
                          <code>
                            {currentSnippetTab === 'curl'
                              ? ep.curlSnippet
                              : currentSnippetTab === 'js'
                              ? ep.jsSnippet
                              : ep.responseJson}
                          </code>
                        </pre>
                      </div>
                    </div>

                    {/* Desktop Side-by-Side View (>= 1024px) */}
                    <div className="hidden lg:grid grid-cols-2 gap-4 w-full">
                      {/* cURL Example */}
                      <div className="space-y-2 min-w-0">
                        <div className="flex items-center justify-between text-xs font-mono text-zinc-400">
                          <span className="flex items-center space-x-1.5">
                            <Terminal className="w-3.5 h-3.5 text-violet-400" />
                            <span>cURL Request</span>
                          </span>
                        </div>
                        <div className="relative w-full min-w-0 overflow-hidden rounded-xl bg-black border border-zinc-800 group">
                          <button
                            onClick={() => copyCode(ep.curlSnippet, `${ep.id}-curl`)}
                            className="absolute top-2.5 right-2.5 z-10 w-7 h-7 rounded-lg bg-zinc-900/90 hover:bg-zinc-800 border border-zinc-700/60 flex items-center justify-center text-zinc-400 hover:text-white transition-all shadow-md active:scale-95"
                            title="Copy snippet"
                          >
                            {copiedIndex === `${ep.id}-curl` ? (
                              <Check className="w-3.5 h-3.5 text-violet-400" />
                            ) : (
                              <Copy className="w-3.5 h-3.5" />
                            )}
                          </button>
                          <pre className="p-4 text-xs font-mono text-violet-300/90 overflow-x-auto leading-relaxed scrollbar-thin max-h-64 pr-11">
                            <code>{ep.curlSnippet}</code>
                          </pre>
                        </div>
                      </div>

                      {/* Response JSON Example */}
                      <div className="space-y-2 min-w-0">
                        <div className="flex items-center justify-between text-xs font-mono text-zinc-400">
                          <span className="flex items-center space-x-1.5">
                            <Server className="w-3.5 h-3.5 text-blue-400" />
                            <span>200 OK Response Schema</span>
                          </span>
                        </div>
                        <div className="relative w-full min-w-0 overflow-hidden rounded-xl bg-black border border-zinc-800 group">
                          <button
                            onClick={() => copyCode(ep.responseJson, `${ep.id}-json`)}
                            className="absolute top-2.5 right-2.5 z-10 w-7 h-7 rounded-lg bg-zinc-900/90 hover:bg-zinc-800 border border-zinc-700/60 flex items-center justify-center text-zinc-400 hover:text-white transition-all shadow-md active:scale-95"
                            title="Copy snippet"
                          >
                            {copiedIndex === `${ep.id}-json` ? (
                              <Check className="w-3.5 h-3.5 text-violet-400" />
                            ) : (
                              <Copy className="w-3.5 h-3.5" />
                            )}
                          </button>
                          <pre className="p-4 text-xs font-mono text-zinc-300 overflow-x-auto max-h-64 leading-relaxed scrollbar-thin pr-11">
                            <code>{ep.responseJson}</code>
                          </pre>
                        </div>
                      </div>
                    </div>
                  </div>
                </div>
              );
            })}
          </div>
        </main>

        <Footer />
      </div>
    </AuthGuard>
  );
}
