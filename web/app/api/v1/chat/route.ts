import { NextResponse } from 'next/server';
import { getAllChatMessages, saveChatMessage, clearAllChatMessages, touchModClientHeartbeat } from '@/lib/store';
import { checkRateLimit, getClientIp, rateLimitResponse } from '@/lib/rateLimit';

export const dynamic = 'force-dynamic';

const NO_CACHE_HEADERS = {
  'Cache-Control': 'no-store, max-age=0, must-revalidate',
  'Pragma': 'no-cache',
};

export async function GET(request: Request) {
  const { searchParams } = new URL(request.url);
  const channel = searchParams.get('channel')?.toUpperCase();

  let messages = getAllChatMessages();

  if (channel && channel !== 'ALL') {
    messages = messages.filter((m) => m.channel === channel);
  }

  return NextResponse.json(
    {
      status: 200,
      count: messages.length,
      messages: messages,
    },
    {
      status: 200,
      headers: NO_CACHE_HEADERS,
    }
  );
}

export async function POST(request: Request) {
  touchModClientHeartbeat();
  const ip = getClientIp(request);
  const rate = checkRateLimit(ip, 120, 60000);
  if (rate.isLimited) {
    return rateLimitResponse(rate.resetMs);
  }

  try {
    const body = await request.json();

    if (!body || !body.message || typeof body.message !== 'string' || !body.message.trim()) {
      return NextResponse.json(
        { status: 400, error: 'Missing or empty chat message' },
        { status: 400, headers: NO_CACHE_HEADERS }
      );
    }

    const saved = saveChatMessage({
      channel: body.channel || 'MAP',
      sender: body.sender || 'CLIENT',
      recipient: body.recipient,
      message: body.message.trim(),
    });

    console.log(`[MTX-API-CHAT] Chat logged [${saved.channel}] ${saved.sender}: "${saved.message}"`);

    return NextResponse.json(
      {
        status: 201,
        message: 'Chat message logged successfully',
        chat: saved,
      },
      { status: 201, headers: NO_CACHE_HEADERS }
    );
  } catch (error: any) {
    console.error('[MTX-API-CHAT] Error processing POST chat message:', error);
    return NextResponse.json(
      { status: 500, error: 'Internal Server Error', details: error.message },
      { status: 500, headers: NO_CACHE_HEADERS }
    );
  }
}

export async function DELETE() {
  clearAllChatMessages();
  return NextResponse.json(
    {
      status: 200,
      message: 'Chat history successfully cleared',
    },
    { status: 200, headers: NO_CACHE_HEADERS }
  );
}
