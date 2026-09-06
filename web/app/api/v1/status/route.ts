import { NextResponse } from 'next/server';
import { getModClientStatus, getAllPlayers } from '@/lib/store';

export const dynamic = 'force-dynamic';

const NO_CACHE_HEADERS = {
  'Cache-Control': 'no-store, max-age=0, must-revalidate',
  'Pragma': 'no-cache',
};

export async function GET() {
  const modStatus = getModClientStatus(20000); // 20s threshold
  const players = getAllPlayers();

  return NextResponse.json(
    {
      status: 200,
      modClientOnline: modStatus.isOnline,
      lastSeenMsAgo: modStatus.lastSeenMsAgo,
      playerCount: players.length,
    },
    {
      status: 200,
      headers: NO_CACHE_HEADERS,
    }
  );
}
