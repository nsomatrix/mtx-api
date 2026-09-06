import { NextResponse } from 'next/server';
import { getAllPlayers, saveOrUpdatePlayer, clearAllPlayers, deletePlayerByName, touchModClientHeartbeat } from '@/lib/store';
import { checkRateLimit, getClientIp, rateLimitResponse } from '@/lib/rateLimit';

export const dynamic = 'force-dynamic';

const NO_CACHE_HEADERS = {
  'Cache-Control': 'no-store, max-age=0, must-revalidate',
  'Pragma': 'no-cache',
};

export async function GET(request: Request) {
  const { searchParams } = new URL(request.url);
  const query = searchParams.get('q')?.toLowerCase();
  const school = searchParams.get('school');
  const className = searchParams.get('class');

  let players = getAllPlayers();

  if (query) {
    players = players.filter(p => p.name.toLowerCase().includes(query));
  }
  if (school && school !== 'All') {
    players = players.filter(p => p.school.toLowerCase() === school.toLowerCase());
  }
  if (className && className !== 'All') {
    players = players.filter(p => p.class.toLowerCase() === className.toLowerCase());
  }

  return NextResponse.json(
    {
      status: 200,
      count: players.length,
      players: players
    },
    {
      status: 200,
      headers: NO_CACHE_HEADERS
    }
  );
}

export async function POST(request: Request) {
  touchModClientHeartbeat();
  const ip = getClientIp(request);
  // Rate limit: Max 120 requests per minute per IP (handles up to 4 live accounts @ 5s interval safely)
  const rate = checkRateLimit(ip, 120, 60000);
  if (rate.isLimited) {
    return rateLimitResponse(rate.resetMs);
  }

  try {
    const body = await request.json();

    if (!body || !body.name || typeof body.name !== 'string' || !body.name.trim()) {
      return NextResponse.json(
        { status: 400, error: 'Missing or invalid character name attribute' },
        { status: 400, headers: NO_CACHE_HEADERS }
      );
    }

    const saved = saveOrUpdatePlayer({
      name: body.name.trim(),
      level: Number(body.level) || 1,
      class: body.class || 'Unknown',
      school: body.school || 'Unknown',
      gender: body.gender || '',
      clan: body.clan !== undefined ? body.clan : (body.giaToc !== undefined ? body.giaToc : ''),
      giaToc: body.giaToc !== undefined ? body.giaToc : (body.clan !== undefined ? body.clan : ''),
      hp: Number(body.hp) || 0,
      maxHp: Number(body.maxHp) || 0,
      mp: Number(body.mp) || 0,
      maxMp: Number(body.maxMp) || 0,
      speed: Number(body.speed) || 0,
      attackMin: Number(body.attackMin) || 0,
      attackMax: Number(body.attackMax) || 0,
      antiFire: Number(body.antiFire) || 0,
      antiIce: Number(body.antiIce) || 0,
      antiWind: Number(body.antiWind) || 0,
      reducePain: Number(body.reducePain) || 0,
      accurate: Number(body.accurate) || 0,
      dodge: Number(body.dodge) || 0,
      critical: Number(body.critical) || 0,
      counterStrike: Number(body.counterStrike) || 0,
      antiChakra: Number(body.antiChakra) || 0,
      antiChakraBack: Number(body.antiChakraBack) || 0,
      equipment: Array.isArray(body.equipment) ? body.equipment : [],
      status: body.status,
      online: body.online,
      error: body.error,
    });

    console.log(`[MTX-API-REST] Live inspection payload received for player: ${saved.name} (Lvl ${saved.level})`);

    return NextResponse.json(
      {
        status: 201,
        message: 'Player stats successfully stored',
        player: saved
      },
      { status: 201, headers: NO_CACHE_HEADERS }
    );
  } catch (error: any) {
    console.error('[MTX-API-REST] Error processing POST player stats:', error);
    return NextResponse.json(
      { status: 500, error: 'Internal Server Error', details: error.message },
      { status: 500, headers: NO_CACHE_HEADERS }
    );
  }
}

export async function DELETE(request: Request) {
  const { searchParams } = new URL(request.url);
  const name = searchParams.get('name');

  if (name) {
    const deleted = deletePlayerByName(name);
    return NextResponse.json(
      {
        status: 200,
        success: deleted,
        message: deleted ? `Player ${name} successfully dismissed` : `Player ${name} not found`
      },
      { status: 200, headers: NO_CACHE_HEADERS }
    );
  }

  clearAllPlayers();
  return NextResponse.json(
    {
      status: 200,
      message: 'All player profiles and pending inspect queues successfully cleared'
    },
    { status: 200, headers: NO_CACHE_HEADERS }
  );
}
