import { getFirestoreDoc, setFirestoreDoc } from './firestoreRest';

export interface ItemOption {
  id: number;
  param: number;
  text: string;
}

export interface EquipmentItem {
  tab: number; // 1 = Equipment 1, 2 = Equipment 2
  slotIndex: number;
  type: number; // 0=Weapon, 1=Coat, 2=Ring, 3=Necklace, 4=Headgear, 5=Gloves, 6=Pants, 7=Jade, 8=Shoes, 9=Charm
  name: string;
  upgrade: number; // e.g. 12 (+12)
  reqLevel: number;
  rarity?: number;
  rarityDesc?: string;
  isBound?: boolean;
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

// Safe module-level closure cache
let matrixPlayersCache: PlayerProfile[] = [];
let pendingInspectQueueCache: string[] = [];
let lastModClientActivityTimestamp = 0;

/**
 * Touch the mod client activity timestamp whenever an active mod client
 * polls inspect targets or posts profile payloads.
 */
export async function touchModClientHeartbeat() {
  const now = Date.now();
  lastModClientActivityTimestamp = now;
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
  let lastActive = lastModClientActivityTimestamp || 0;
  const data = await getFirestoreDoc<{ lastActive?: number }>('system/heartbeat');
  if (data && typeof data.lastActive === 'number' && data.lastActive > lastActive) {
    lastActive = data.lastActive;
    lastModClientActivityTimestamp = lastActive;
  }
  const isOnline = lastActive > 0 && Date.now() - lastActive < maxAgeMs;
  return {
    isOnline,
    lastSeenMsAgo: lastActive > 0 ? Date.now() - lastActive : null,
  };
}

export async function getAllPlayers(): Promise<PlayerProfile[]> {
  let loaded: PlayerProfile[] = matrixPlayersCache || [];
  const data = await getFirestoreDoc<{ players?: PlayerProfile[] }>('system/players');
  if (data && Array.isArray(data.players)) {
    loaded = data.players;
    matrixPlayersCache = loaded;
  }
  return loaded;
}

export async function saveAllPlayers(players: PlayerProfile[]) {
  matrixPlayersCache = players;
  await setFirestoreDoc('system/players', {
    players: JSON.parse(JSON.stringify(players)),
    lastUpdated: new Date().toISOString(),
  });
}

export async function clearAllPlayers() {
  pendingInspectQueueCache = [];
  await saveAllPlayers([]);
  await setFirestoreDoc('system/inspect_queue', { queue: [] });
}

// Queue functions for J2ME inspect triggers
export async function pushInspectQueue(targetName: string) {
  if (!pendingInspectQueueCache.includes(targetName)) {
    pendingInspectQueueCache.push(targetName);
  }
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
  if (!target && pendingInspectQueueCache.length > 0) {
    target = pendingInspectQueueCache.shift() || null;
  }
  return target;
}

export async function saveOrUpdatePlayer(playerData: Partial<PlayerProfile> & { name: string }): Promise<PlayerProfile> {
  let players = await getAllPlayers();
  const index = players.findIndex((p) => p.name.toLowerCase() === playerData.name.toLowerCase());
  const existing = index >= 0 ? players[index] : null;

  const isOffline = playerData.status === 'OFFLINE' || playerData.online === false || !!playerData.error;

  const updatedPlayer: PlayerProfile = {
    name: playerData.name,
    level: playerData.level !== undefined ? playerData.level : existing ? existing.level : 0,
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
    equipment: playerData.equipment || [],
    lastUpdated: new Date().toISOString(),
    status: isOffline ? 'OFFLINE' : playerData.status || 'ONLINE',
    online: isOffline ? false : playerData.online ?? true,
    error: playerData.error,
  };

  if (index >= 0) {
    players[index] = updatedPlayer;
  } else {
    players.unshift(updatedPlayer);
  }

  await saveAllPlayers(players);
  return updatedPlayer;
}

export async function deletePlayerByName(name: string): Promise<boolean> {
  let players = await getAllPlayers();
  const initialCount = players.length;
  players = players.filter((p) => p.name.toLowerCase() !== name.toLowerCase());
  if (players.length !== initialCount) {
    await saveAllPlayers(players);
    return true;
  }
  return false;
}


