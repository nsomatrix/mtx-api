import { NextResponse } from 'next/server';

interface RateLimitStore {
  [ip: string]: number[];
}

const globalRateStore = globalThis as unknown as {
  _rateLimitStore?: RateLimitStore;
  _lastCleanupTime?: number;
};

if (!globalRateStore._rateLimitStore) {
  globalRateStore._rateLimitStore = {};
  globalRateStore._lastCleanupTime = Date.now();
}

/**
 * Periodically purge stale IP entries older than 5 minutes to avoid memory leaks.
 */
function cleanupStaleIps(windowMs: number) {
  const now = Date.now();
  const lastCleanup = globalRateStore._lastCleanupTime || 0;
  if (now - lastCleanup < 60000) return; // Clean up at most once per minute

  globalRateStore._lastCleanupTime = now;
  const store = globalRateStore._rateLimitStore;
  if (!store) return;

  for (const ip of Object.keys(store)) {
    store[ip] = store[ip].filter((timestamp) => now - timestamp < windowMs);
    if (store[ip].length === 0) {
      delete store[ip];
    }
  }
}

/**
 * Industry-standard Sliding Window Rate Limiter
 * @param ip Client IP or Identifier
 * @param limit Max allowed requests within window
 * @param windowMs Window duration in milliseconds
 */
export function checkRateLimit(
  ip: string,
  limit: number = 30,
  windowMs: number = 60000
): { isLimited: boolean; remaining: number; resetMs: number } {
  const now = Date.now();
  cleanupStaleIps(windowMs);

  const store = globalRateStore._rateLimitStore!;

  if (!store[ip]) {
    store[ip] = [];
  }

  // Filter timestamps within the current sliding window
  store[ip] = store[ip].filter((timestamp) => now - timestamp < windowMs);

  if (store[ip].length >= limit) {
    const oldest = store[ip][0];
    const resetMs = Math.max(1, Math.ceil((oldest + windowMs - now) / 1000));
    return { isLimited: true, remaining: 0, resetMs };
  }

  store[ip].push(now);
  return { isLimited: false, remaining: limit - store[ip].length, resetMs: 60 };
}

/**
 * Extract trusted client IP addressing Cloudflare Edge & Proxy headers safely.
 */
export function getClientIp(request: Request): string {
  // 1. Cloudflare Edge connecting IP (highest priority in Cloudflare Workers)
  const cfIp = request.headers.get('cf-connecting-ip');
  if (cfIp) return cfIp.trim();

  // 2. Standard X-Real-IP
  const realIp = request.headers.get('x-real-ip');
  if (realIp) return realIp.trim();

  // 3. X-Forwarded-For (last address appended by proxy)
  const forwarded = request.headers.get('x-forwarded-for');
  if (forwarded) {
    const parts = forwarded.split(',');
    return parts[parts.length - 1].trim();
  }

  return '127.0.0.1';
}

export function rateLimitResponse(resetMs: number) {
  return NextResponse.json(
    {
      status: 429,
      error: 'Too Many Requests',
      message: `Rate limit exceeded. Please retry in ${resetMs} seconds.`,
    },
    {
      status: 429,
      headers: {
        'Retry-After': String(resetMs),
        'Cache-Control': 'no-store, max-age=0, must-revalidate',
      },
    }
  );
}
