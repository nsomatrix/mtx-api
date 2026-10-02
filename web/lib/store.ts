import { getFirestoreDoc, setFirestoreDoc } from './firestoreRest';

export interface EquipmentItem {
  tab: number; // 1 = Equipment 1, 2 = Equipment 2
  slotIndex: number;
  type: number; // 0=Weapon, 1=Coat, 2=Ring, 3=Necklace, 4=Headgear, 5=Gloves, 6=Pants, 7=Jade, 8=Shoes, 9=Charm
  name: string;
  upgrade: number; // e.g. 12 (+12)
  reqLevel: number;
}

export interface PlayerProfile {
  name: string;
  level: number;
  class: string;
  school: string;
  gender?: string;
  clan?: string;
  giaToc?: string;
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
  equipment?: EquipmentItem[];
  lastUpdated: string;
  status?: string;
  online?: boolean;
  error?: string;
}

export interface ChatMessage {
  id: string;
  channel: 'MAP' | 'WORLD' | 'PRIVATE' | 'CLAN';
  sender: string;
  recipient?: string;
  message: string;
  timestamp: string;
}

const AUTO_CLEAR_MS = 30 * 60 * 1000; // Auto clear after 30 minutes
export const CHAT_RETENTION_MS = 7 * 24 * 60 * 60 * 1000; // 7-Day Retention Window

// Safe module-level closure cache
let matrixPlayersCache: PlayerProfile[] = [];
let pendingInspectQueueCache: string[] = [];
let matrixChatCache: ChatMessage[] = [];
let pendingOutboundChatQueueCache: ChatMessage[] = [];
let userSavedTargetsCache: Record<string, PlayerProfile[]> = {};
let lastModClientActivityTimestamp = 0;

/**
 * Touch the mod client activity timestamp whenever an active mod client
 * polls inspect targets or posts telemetry/chat payloads.
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

/**
 * Automatically prunes profiles older than 30 minutes (1,800,000 ms).
 */
export function pruneExpiredPlayers(players: PlayerProfile[]): PlayerProfile[] {
  const now = Date.now();
  const valid = players.filter((p) => {
    if (!p.lastUpdated) return false;
    const time = new Date(p.lastUpdated).getTime();
    return !isNaN(time) && now - time < AUTO_CLEAR_MS;
  });

  return valid;
}

export async function getAllPlayers(): Promise<PlayerProfile[]> {
  let loaded: PlayerProfile[] = matrixPlayersCache || [];
  const data = await getFirestoreDoc<{ players?: PlayerProfile[] }>('system/players');
  if (data && Array.isArray(data.players)) {
    loaded = data.players;
    matrixPlayersCache = loaded;
  }
  return pruneExpiredPlayers(loaded);
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
    equipment: playerData.equipment || (existing ? existing.equipment : []),
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

export async function getAllChatMessages(
  channel?: string,
  sinceTimestamp?: string,
  limit: number = 1500
): Promise<ChatMessage[]> {
  let loaded: ChatMessage[] = matrixChatCache || [];
  const data = await getFirestoreDoc<{ messages?: ChatMessage[] }>('telemetry_chat/live_stream');
  if (data && Array.isArray(data.messages)) {
    loaded = data.messages;
    matrixChatCache = loaded;
  }

  const now = Date.now();
  let results = loaded.filter((m) => {
    const t = new Date(m.timestamp).getTime();
    return !isNaN(t) && now - t < CHAT_RETENTION_MS;
  });

  if (sinceTimestamp) {
    const sinceMs = new Date(sinceTimestamp).getTime();
    if (!isNaN(sinceMs)) {
      results = results.filter((m) => {
        const msgMs = new Date(m.timestamp).getTime();
        return !isNaN(msgMs) && msgMs > sinceMs;
      });
    }
  }

  if (channel && channel !== 'ALL') {
    results = results.filter((m) => m.channel === channel.toUpperCase());
  }

  if (limit > 0 && results.length > limit) {
    results = results.slice(0, limit);
  }

  return results;
}

export async function saveAllChatMessages(messages: ChatMessage[]) {
  matrixChatCache = messages;
  await setFirestoreDoc('telemetry_chat/live_stream', {
    messages: JSON.parse(JSON.stringify(messages)),
    lastUpdated: new Date().toISOString(),
  });
}

export async function saveChatMessage(data: {
  channel: string;
  sender: string;
  recipient?: string;
  message: string;
}): Promise<ChatMessage> {
  let messages = await getAllChatMessages();

  const validChannel = (['MAP', 'WORLD', 'PRIVATE', 'CLAN'].includes(data.channel?.toUpperCase())
    ? data.channel.toUpperCase()
    : 'MAP') as ChatMessage['channel'];

  const cleanMessage = data.message.trim();
  const cleanSender = data.sender || 'UNKNOWN';
  const cleanRecipient = data.recipient ? data.recipient.trim() : undefined;

  const nowMs = Date.now();
  const duplicate = messages.find((m) => {
    if (m.channel !== validChannel || m.sender !== cleanSender || m.message !== cleanMessage) {
      return false;
    }
    if (cleanRecipient && m.recipient !== cleanRecipient) {
      return false;
    }
    const msgTime = new Date(m.timestamp).getTime();
    return !isNaN(msgTime) && nowMs - msgTime < 1500;
  });

  if (duplicate) {
    return duplicate;
  }

  const msg: ChatMessage = {
    id: `msg_${nowMs}_${Math.random().toString(36).substring(2, 7)}`,
    channel: validChannel,
    sender: cleanSender,
    recipient: cleanRecipient,
    message: cleanMessage,
    timestamp: new Date().toISOString(),
  };

  messages.unshift(msg);

  if (messages.length > 2000) {
    messages = messages.slice(0, 2000);
  }

  await saveAllChatMessages(messages);
  return msg;
}

export async function clearAllChatMessages() {
  matrixChatCache = [];
  pendingOutboundChatQueueCache = [];
  await saveAllChatMessages([]);
  await setFirestoreDoc('system/pending_chat', { queue: [] });
}

export async function queueOutboundChatMessage(data: {
  channel: string;
  recipient?: string;
  message: string;
}): Promise<ChatMessage> {
  const msg = await saveChatMessage({
    channel: data.channel,
    sender: 'WEB_CONSOLE',
    recipient: data.recipient,
    message: data.message,
  });

  const docData = await getFirestoreDoc<{ queue?: ChatMessage[] }>('system/pending_chat');
  let pending: ChatMessage[] = docData && Array.isArray(docData.queue) ? docData.queue : [];
  pending.push(msg);
  await setFirestoreDoc('system/pending_chat', { queue: pending });
  return msg;
}

export async function popPendingOutboundChatMessages(): Promise<ChatMessage[]> {
  let pending: ChatMessage[] = [];
  const docData = await getFirestoreDoc<{ queue?: ChatMessage[] }>('system/pending_chat');
  if (docData && Array.isArray(docData.queue) && docData.queue.length > 0) {
    pending = docData.queue;
    await setFirestoreDoc('system/pending_chat', { queue: [] });
  }
  if (pending.length === 0 && pendingOutboundChatQueueCache.length > 0) {
    pending = [...pendingOutboundChatQueueCache];
    pendingOutboundChatQueueCache = [];
  }
  return pending;
}

export async function getUserSavedTargets(userId: string): Promise<PlayerProfile[]> {
  if (!userId) return [];
  const docData = await getFirestoreDoc<{ savedTargets?: PlayerProfile[] }>(`users/${userId}`);
  if (docData && Array.isArray(docData.savedTargets)) {
    return docData.savedTargets;
  }
  return userSavedTargetsCache[userId] || [];
}

export async function saveUserTargetCard(userId: string, player: PlayerProfile): Promise<PlayerProfile[]> {
  if (!userId) return [];
  const current = await getUserSavedTargets(userId);
  const exists = current.some((p) => p.name.toLowerCase() === player.name.toLowerCase());
  let updated: PlayerProfile[];
  if (exists) {
    updated = current.map((p) => (p.name.toLowerCase() === player.name.toLowerCase() ? player : p));
  } else {
    updated = [player, ...current];
  }
  userSavedTargetsCache[userId] = updated;

  await setFirestoreDoc(`users/${userId}`, {
    savedTargets: JSON.parse(JSON.stringify(updated)),
    lastUpdated: new Date().toISOString(),
  });
  return updated;
}

export async function removeUserTargetCard(userId: string, playerName: string): Promise<PlayerProfile[]> {
  if (!userId) return [];
  const current = await getUserSavedTargets(userId);
  const updated = current.filter((p) => p.name.toLowerCase() !== playerName.toLowerCase());
  userSavedTargetsCache[userId] = updated;

  await setFirestoreDoc(`users/${userId}`, {
    savedTargets: JSON.parse(JSON.stringify(updated)),
    lastUpdated: new Date().toISOString(),
  });
  return updated;
}
