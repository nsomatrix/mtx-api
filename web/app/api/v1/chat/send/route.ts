import { NextResponse } from 'next/server';
import { queueOutboundChatMessage, popPendingOutboundChatMessages } from '@/lib/store';
import { checkRateLimit, getClientIp, rateLimitResponse } from '@/lib/rateLimit';

export const dynamic = 'force-dynamic';

const NO_CACHE_HEADERS = {
  'Cache-Control': 'no-store, max-age=0, must-revalidate',
  'Pragma': 'no-cache',
};

export async function GET() {
  const pending = popPendingOutboundChatMessages();
  return NextResponse.json(
    {
      status: 200,
      count: pending.length,
      pending: pending,
    },
    { status: 200, headers: NO_CACHE_HEADERS }
  );
}

export async function POST(request: Request) {
  const ip = getClientIp(request);
  const rate = checkRateLimit(ip, 60, 60000);
  if (rate.isLimited) {
    return rateLimitResponse(rate.resetMs);
  }

  try {
    const body = await request.json();

    if (!body || !body.message || typeof body.message !== 'string' || !body.message.trim()) {
      return NextResponse.json(
        { status: 400, error: 'Missing or empty message field' },
        { status: 400, headers: NO_CACHE_HEADERS }
      );
    }

    const channel = (body.channel || 'MAP').toUpperCase();
    if (!['MAP', 'WORLD', 'PRIVATE', 'CLAN'].includes(channel)) {
      return NextResponse.json(
        { status: 400, error: 'Invalid chat channel. Must be MAP, WORLD, PRIVATE, or CLAN' },
        { status: 400, headers: NO_CACHE_HEADERS }
      );
    }

    if (channel === 'PRIVATE' && (!body.recipient || !body.recipient.trim())) {
      return NextResponse.json(
        { status: 400, error: 'Recipient is required for PRIVATE messages' },
        { status: 400, headers: NO_CACHE_HEADERS }
      );
    }

    const queued = queueOutboundChatMessage({
      channel,
      recipient: body.recipient?.trim(),
      message: body.message.trim(),
    });

    console.log(`[MTX-API-CHAT-SEND] Queued outbound chat [${channel}] -> "${queued.message}"`);

    return NextResponse.json(
      {
        status: 200,
        message: 'Outbound chat message queued for game dispatch',
        queued: queued,
      },
      { status: 200, headers: NO_CACHE_HEADERS }
    );
  } catch (error: any) {
    console.error('[MTX-API-CHAT-SEND] Error queueing outbound message:', error);
    return NextResponse.json(
      { status: 500, error: 'Internal Server Error', details: error.message },
      { status: 500, headers: NO_CACHE_HEADERS }
    );
  }
}
