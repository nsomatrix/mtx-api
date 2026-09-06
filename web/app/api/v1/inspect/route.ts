import { NextResponse } from 'next/server';
import { popInspectQueue, pushInspectQueue, touchModClientHeartbeat } from '@/lib/store';
import { checkRateLimit, getClientIp, rateLimitResponse } from '@/lib/rateLimit';

export const dynamic = 'force-dynamic';

const NO_CACHE_HEADERS = {
  'Cache-Control': 'no-store, max-age=0, must-revalidate',
  'Pragma': 'no-cache',
};

export async function GET() {
  touchModClientHeartbeat();
  const target = popInspectQueue();
  return NextResponse.json(
    {
      status: 200,
      target: target
    },
    {
      status: 200,
      headers: NO_CACHE_HEADERS
    }
  );
}

export async function POST(request: Request) {
  const ip = getClientIp(request);
  // Rate limit: Max 10 inspect fetch requests per minute per IP
  const rate = checkRateLimit(ip, 10, 60000);
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
    pushInspectQueue(targetName);

    console.log(`[MTX-API-REST] Remote inspect fetch queued for target: "${targetName}"`);

    return NextResponse.json(
      {
        status: 200,
        message: `Remote inspect fetch queued for "${targetName}"`,
        target: targetName
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
