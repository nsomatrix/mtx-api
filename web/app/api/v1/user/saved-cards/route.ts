import { NextResponse } from 'next/server';
import { getUserSavedTargets, saveUserTargetCard, removeUserTargetCard } from '@/lib/store';

export async function GET(request: Request) {
  try {
    const { searchParams } = new URL(request.url);
    const userId = searchParams.get('userId');
    if (!userId) {
      return NextResponse.json({ error: 'Missing userId parameter' }, { status: 400 });
    }
    const targets = getUserSavedTargets(userId);
    return NextResponse.json({ targets });
  } catch (error: any) {
    return NextResponse.json({ error: error.message || 'Failed to fetch targets' }, { status: 500 });
  }
}

export async function POST(request: Request) {
  try {
    const body = await request.json();
    const { userId, player } = body;
    if (!userId || !player || !player.name) {
      return NextResponse.json({ error: 'Invalid payload. userId and player required.' }, { status: 400 });
    }
    const updated = saveUserTargetCard(userId, player);
    return NextResponse.json({ success: true, targets: updated });
  } catch (error: any) {
    return NextResponse.json({ error: error.message || 'Failed to save target' }, { status: 500 });
  }
}

export async function DELETE(request: Request) {
  try {
    const { searchParams } = new URL(request.url);
    const userId = searchParams.get('userId');
    const name = searchParams.get('name');
    if (!userId || !name) {
      return NextResponse.json({ error: 'Missing userId or name parameter' }, { status: 400 });
    }
    const updated = removeUserTargetCard(userId, name);
    return NextResponse.json({ success: true, targets: updated });
  } catch (error: any) {
    return NextResponse.json({ error: error.message || 'Failed to remove target' }, { status: 500 });
  }
}
