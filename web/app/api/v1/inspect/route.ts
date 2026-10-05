import { NextResponse } from 'next/server';
import { popInspectQueue, pushInspectQueue, touchModClientHeartbeat } from '@/lib/store';
import { checkRateLimit, getClientIp, rateLimitResponse } from '@/lib/rateLimit';
import { verifyAuthToken } from '@/lib/authVerify';

export const runtime = 'edge';
export const dynamic = 'force-dynamic';

const NO_CACHE_HEADERS = {
  'Cache-Control': 'no-store, max-age=0, must-revalidate',
  'Pragma': 'no-cache',
};

export async function GET(request: Request) {
  const ip = getClientIp(request);
  const rate = checkRateLimit(ip, 60, 60000);
  if (rate.isLimited) {
    return rateLimitResponse(rate.resetMs);
  }

  try {
    await touchModClientHeartbeat();
    const target = await popInspectQueue();
    return NextResponse.json(
      {
        status: 200,
        target: target,
      },
      {
        status: 200,
        headers: NO_CACHE_HEADERS,
      }
    );
  } catch (err: any) {
    console.error('[MTX-API-INSPECT] GET error:', err);
    return NextResponse.json(
      {
        status: 500,
        target: null,
        error: err.message,
      },
      {
        status: 500,
        headers: NO_CACHE_HEADERS,
      }
    );
  }
}

export async function POST(request: Request) {
  const ip = getClientIp(request);
  // Rate limit: Max 20 inspect requests per minute per IP
  const rate = checkRateLimit(ip, 20, 60000);
  if (rate.isLimited) {
    return rateLimitResponse(rate.resetMs);
  }

  try {
    const body = await request.json();
    if (!body || !body.name || typeof body.name !== 'string' || !body.name.trim()) {
      return NextResponse.json(
        { status: 400, error: 'Valid player name string required' },
        { status: 400, headers: NO_CACHE_HEADERS }
      );
    }

    const targetName = body.name.trim();

    // Sensitive / Destructive Action Guard
    if (targetName === '__CLEAR__') {
      const auth = await verifyAuthToken(request);
      if (!auth.valid) {
        return NextResponse.json(
          { status: 401, error: `Unauthorized: ${auth.error || 'Authentication required for clear action'}` },
          { status: 401, headers: NO_CACHE_HEADERS }
        );
      }

      const { clearAllPlayers } = await import('@/lib/store');
      await clearAllPlayers();
      return NextResponse.json(
        {
          status: 200,
          message: 'All player profiles and pending inspect queues successfully cleared',
          target: null,
        },
        { status: 200, headers: NO_CACHE_HEADERS }
      );
    }

    await pushInspectQueue(targetName);

    console.log(`[MTX-API-REST] Remote inspect fetch queued for target: "${targetName}"`);

    return NextResponse.json(
      {
        status: 200,
        message: `Remote inspect fetch queued for "${targetName}"`,
        target: targetName,
      },
      { status: 200, headers: NO_CACHE_HEADERS }
    );
  } catch (error: any) {
    return NextResponse.json(
      { status: 500, error: 'Failed to process inspect request' },
      { status: 500, headers: NO_CACHE_HEADERS }
    );
  }
}
