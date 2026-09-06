import { NextResponse } from 'next/server';

interface RateLimitStore {
  [ip: string]: number[];
}

const globalRateStore = globalThis as unknown as { _rateLimitStore?: RateLimitStore };
if (!globalRateStore._rateLimitStore) {
  globalRateStore._rateLimitStore = {};
}

/**
 * Industry-standard Sliding Window Rate Limiter
 * @param ip Client IP or Identifier
 * @param limit Max allowed requests within window
 * @param windowMs Window duration in milliseconds
 */
export function checkRateLimit(ip: string, limit: number = 30, windowMs: number = 60000): { isLimited: boolean; remaining: number; resetMs: number } {
  const now = Date.now();
  const store = globalRateStore._rateLimitStore!;
  
  if (!store[ip]) {
    store[ip] = [];
  }

  // Filter timestamps within the current sliding window
  store[ip] = store[ip].filter(timestamp => now - timestamp < windowMs);

  if (store[ip].length >= limit) {
    const oldest = store[ip][0];
    const resetMs = Math.ceil((oldest + windowMs - now) / 1000);
    return { isLimited: true, remaining: 0, resetMs };
  }

  store[ip].push(now);
  return { isLimited: false, remaining: limit - store[ip].length, resetMs: 60 };
}

export function getClientIp(request: Request): string {
  const forwarded = request.headers.get('x-forwarded-for');
  if (forwarded) {
    return forwarded.split(',')[0].trim();
  }
  const realIp = request.headers.get('x-real-ip');
  if (realIp) {
    return realIp.trim();
  }
  return '127.0.0.1';
}

export function rateLimitResponse(resetMs: number) {
  return NextResponse.json(
    {
      status: 429,
      error: 'Too Many Requests',
      message: `Rate limit exceeded. Please retry in ${resetMs} seconds.`
    },
    {
      status: 429,
      headers: {
        'Retry-After': String(resetMs),
        'Cache-Control': 'no-store, max-age=0, must-revalidate',
      }
    }
  );
}
