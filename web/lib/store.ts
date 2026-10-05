import {
  getFirestoreDoc,
  setFirestoreDoc,
  deleteFirestoreDoc,
  listFirestoreCollection,
} from './firestoreRest';

export interface ItemOption {
  id: number;
  param: number;
  text: string;
}

export interface EquipmentItem {
  tab: number; // 1 = Equipment 1, 2 = Equipment 2
  slotIndex: number;
  type: number; // 0=Cord, 1=Weapon, 2=Coat, 3=Necklace, 4=Gloves, 5=Ring, 6=Pants, 7=Jade, 8=Shoes, 9=Charm
  name: string;
  upgrade: number; // e.g. 12 (+12)
  reqLevel: number;
  rarity?: number;
  rarityDesc?: string;
  isBound?: boolean;
  durability?: number;
  sockets?: number;
  expiresIn?: string;
  options?: ItemOption[];
}

export interface PlayerProfile {
  name: string;
  level: number;
  class: string;
  school: string;
  gender?: string;
  clan?: string;
  giaToc?: string;
  clanRank?: number;
  hp: number;
  maxHp: number;
  mp: number;
  maxMp: number;
  speed: number;
  attackMin: number;
  attackMax: number;
  antiFire: number;
  antiIce: number;
  antiWind: number;
  reducePain: number;
  accurate: number;
  dodge: number;
  critical: number;
  counterStrike: number;
  antiChakra: number;
  antiChakraBack: number;
  str?: number;
  dex?: number;
  vit?: number;
  int?: number;
  unassignedPotentials?: number;
  unassignedSkills?: number;
  exp?: number;
  pk?: number;
  equipment?: EquipmentItem[];
  lastUpdated: string;
  status?: string;
  online?: boolean;
  error?: string;
}

function getPlayerDocKey(name: string): string {
  return encodeURIComponent(name.trim().toLowerCase());
}

/**
 * Touch the mod client activity timestamp whenever an active mod client
 * polls inspect targets or posts profile payloads.
 */
export async function touchModClientHeartbeat() {
  const now = Date.now();
  await setFirestoreDoc('system/heartbeat', {
    lastActive: now,
    lastUpdated: new Date().toISOString(),
  });
}

/**
 * Returns whether a mod client is currently active based on the last heartbeat.
 * Default max age: 20 seconds.
 */
export async function getModClientStatus(maxAgeMs = 20000) {
  const data = await getFirestoreDoc<{ lastActive?: number }>('system/heartbeat');
  const lastActive = data && typeof data.lastActive === 'number' ? data.lastActive : 0;
  const isOnline = lastActive > 0 && Date.now() - lastActive < maxAgeMs;
  return {
    isOnline,
    lastSeenMsAgo: lastActive > 0 ? Date.now() - lastActive : null,
  };
}

export async function getAllPlayers(): Promise<PlayerProfile[]> {
  // 1. Fetch individual documents from the `players` collection
  let players = await listFirestoreCollection<PlayerProfile>('players');

  // 2. Backward compatibility fallback: check legacy system/players document if collection is empty
  if (players.length === 0) {
    const legacyData = await getFirestoreDoc<{ players?: PlayerProfile[] }>('system/players');
    if (legacyData && Array.isArray(legacyData.players) && legacyData.players.length > 0) {
      players = legacyData.players;
      // Auto-migrate legacy players into individual collection documents
      for (const p of players) {
        if (p && p.name) {
          await setFirestoreDoc(`players/${getPlayerDocKey(p.name)}`, p);
        }
      }
    }
  }

  // Sort by lastUpdated descending
  return players.sort((a, b) => new Date(b.lastUpdated || 0).getTime() - new Date(a.lastUpdated || 0).getTime());
}

export async function getPlayerByName(name: string): Promise<PlayerProfile | null> {
  const key = getPlayerDocKey(name);
  const doc = await getFirestoreDoc<PlayerProfile>(`players/${key}`);
  if (doc && doc.name) return doc;

  const all = await getAllPlayers();
  return all.find((p) => p.name.toLowerCase() === name.toLowerCase()) || null;
}

export async function saveOrUpdatePlayer(
  playerData: Partial<PlayerProfile> & { name: string }
): Promise<PlayerProfile> {
  const name = playerData.name.trim();
  const docKey = getPlayerDocKey(name);

  // Fetch existing profile if available
  const existing = await getPlayerByName(name);
  const isOffline = playerData.status === 'OFFLINE' || playerData.online === false || !!playerData.error;

  const updatedPlayer: PlayerProfile = {
    name,
    level: playerData.level !== undefined ? playerData.level : existing ? existing.level : 1,
    class: playerData.class || (existing ? existing.class : 'Unknown'),
    school: playerData.school || (existing ? existing.school : 'Unknown'),
    gender: playerData.gender !== undefined ? playerData.gender : existing ? existing.gender : '',
    clan: playerData.clan !== undefined ? playerData.clan : playerData.giaToc !== undefined ? playerData.giaToc : existing ? existing.clan : '',
    giaToc: playerData.giaToc !== undefined ? playerData.giaToc : playerData.clan !== undefined ? playerData.clan : existing ? existing.giaToc : '',
    clanRank: playerData.clanRank !== undefined ? playerData.clanRank : existing ? existing.clanRank : 0,
    hp: playerData.hp !== undefined ? playerData.hp : existing ? existing.hp : 0,
    maxHp: playerData.maxHp !== undefined ? playerData.maxHp : existing ? existing.maxHp : 0,
    mp: playerData.mp !== undefined ? playerData.mp : existing ? existing.mp : 0,
    maxMp: playerData.maxMp !== undefined ? playerData.maxMp : existing ? existing.maxMp : 0,
    speed: playerData.speed !== undefined ? playerData.speed : existing ? existing.speed : 0,
    attackMin: playerData.attackMin !== undefined ? playerData.attackMin : existing ? existing.attackMin : 0,
    attackMax: playerData.attackMax !== undefined ? playerData.attackMax : existing ? existing.attackMax : 0,
    antiFire: playerData.antiFire !== undefined ? playerData.antiFire : existing ? existing.antiFire : 0,
    antiIce: playerData.antiIce !== undefined ? playerData.antiIce : existing ? existing.antiIce : 0,
    antiWind: playerData.antiWind !== undefined ? playerData.antiWind : existing ? existing.antiWind : 0,
    reducePain: playerData.reducePain !== undefined ? playerData.reducePain : existing ? existing.reducePain : 0,
    accurate: playerData.accurate !== undefined ? playerData.accurate : existing ? existing.accurate : 0,
    dodge: playerData.dodge !== undefined ? playerData.dodge : existing ? existing.dodge : 0,
    critical: playerData.critical !== undefined ? playerData.critical : existing ? existing.critical : 0,
    counterStrike: playerData.counterStrike !== undefined ? playerData.counterStrike : existing ? existing.counterStrike : 0,
    antiChakra: playerData.antiChakra !== undefined ? playerData.antiChakra : existing ? existing.antiChakra : 0,
    antiChakraBack: playerData.antiChakraBack !== undefined ? playerData.antiChakraBack : existing ? existing.antiChakraBack : 0,
    str: playerData.str !== undefined ? playerData.str : existing ? existing.str : 0,
    dex: playerData.dex !== undefined ? playerData.dex : existing ? existing.dex : 0,
    vit: playerData.vit !== undefined ? playerData.vit : existing ? existing.vit : 0,
    int: playerData.int !== undefined ? playerData.int : existing ? existing.int : 0,
    unassignedPotentials: playerData.unassignedPotentials !== undefined ? playerData.unassignedPotentials : existing ? existing.unassignedPotentials : 0,
    unassignedSkills: playerData.unassignedSkills !== undefined ? playerData.unassignedSkills : existing ? existing.unassignedSkills : 0,
    exp: playerData.exp !== undefined ? playerData.exp : existing ? existing.exp : 0,
    pk: playerData.pk !== undefined ? playerData.pk : existing ? existing.pk : 0,
    equipment: playerData.equipment || (existing ? existing.equipment : []),
    lastUpdated: new Date().toISOString(),
    status: isOffline ? 'OFFLINE' : playerData.status || 'ONLINE',
    online: isOffline ? false : playerData.online ?? true,
    error: playerData.error,
  };

  // 1. Save to individual player document
  await setFirestoreDoc(`players/${docKey}`, updatedPlayer);

  // 2. Sync to system/players single document for real-time legacy snapshot listeners
  const allPlayers = await getAllPlayers();
  await setFirestoreDoc('system/players', {
    players: JSON.parse(JSON.stringify(allPlayers)),
    lastUpdated: new Date().toISOString(),
  });

  return updatedPlayer;
}

export async function deletePlayerByName(name: string): Promise<boolean> {
  const docKey = getPlayerDocKey(name);
  const deleted = await deleteFirestoreDoc(`players/${docKey}`);

  // Sync system/players
  const allPlayers = await getAllPlayers();
  await setFirestoreDoc('system/players', {
    players: JSON.parse(JSON.stringify(allPlayers)),
    lastUpdated: new Date().toISOString(),
  });

  return deleted;
}

export async function clearAllPlayers() {
  const players = await getAllPlayers();
  await Promise.all(players.map((p) => deleteFirestoreDoc(`players/${getPlayerDocKey(p.name)}`)));
  await setFirestoreDoc('system/players', { players: [], lastUpdated: new Date().toISOString() });
  await setFirestoreDoc('system/inspect_queue', { queue: [] });
}

// Queue functions for J2ME inspect triggers
export async function pushInspectQueue(targetName: string) {
  const data = await getFirestoreDoc<{ queue?: string[] }>('system/inspect_queue');
  let currentQueue: string[] = data && Array.isArray(data.queue) ? data.queue : [];
  if (!currentQueue.includes(targetName)) {
    currentQueue.push(targetName);
    await setFirestoreDoc('system/inspect_queue', { queue: currentQueue });
  }
}

export async function popInspectQueue(): Promise<string | null> {
  let target: string | null = null;
  const data = await getFirestoreDoc<{ queue?: string[] }>('system/inspect_queue');
  if (data && Array.isArray(data.queue) && data.queue.length > 0) {
    const currentQueue = [...data.queue];
    target = currentQueue.shift() || null;
    await setFirestoreDoc('system/inspect_queue', { queue: currentQueue });
  }
  return target;
}
