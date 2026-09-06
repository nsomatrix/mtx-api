import fs from 'fs';
import path from 'path';
import os from 'os';

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

// In-memory global store to preserve state across warm Vercel Lambdas
const globalStore = globalThis as unknown as {
  _matrixPlayersStore?: PlayerProfile[];
  _pendingInspectQueue?: string[];
  _matrixChatStore?: ChatMessage[];
  _pendingOutboundChatQueue?: ChatMessage[];
  _userSavedTargetsStore?: Record<string, PlayerProfile[]>;
  _lastModClientActivityTimestamp?: number;
};

if (!globalStore._matrixPlayersStore) {
  globalStore._matrixPlayersStore = [];
}
if (!globalStore._pendingInspectQueue) {
  globalStore._pendingInspectQueue = [];
}
if (!globalStore._matrixChatStore) {
  globalStore._matrixChatStore = [];
}
if (!globalStore._userSavedTargetsStore) {
  globalStore._userSavedTargetsStore = {};
}
if (!globalStore._lastModClientActivityTimestamp) {
  globalStore._lastModClientActivityTimestamp = 0;
}

/**
 * Touch the mod client activity timestamp whenever an active mod client
 * polls inspect targets or posts telemetry/chat payloads.
 */
export function touchModClientHeartbeat() {
  globalStore._lastModClientActivityTimestamp = Date.now();
}

/**
 * Returns whether a mod client is currently active based on the last heartbeat.
 * Default max age: 20 seconds.
 */
export function getModClientStatus(maxAgeMs = 20000) {
  const lastActive = globalStore._lastModClientActivityTimestamp || 0;
  const isOnline = lastActive > 0 && (Date.now() - lastActive < maxAgeMs);
  return {
    isOnline,
    lastSeenMsAgo: lastActive > 0 ? Date.now() - lastActive : null,
  };
}

function getDataFilePath(): string {
  if (process.env.VERCEL || process.env.NODE_ENV === 'production') {
    return path.join(os.tmpdir(), 'players.json');
  }
  return path.join(process.cwd(), 'data', 'players.json');
}

function getUserTargetsFilePath(): string {
  if (process.env.VERCEL || process.env.NODE_ENV === 'production') {
    return path.join(os.tmpdir(), 'user_targets.json');
  }
  return path.join(process.cwd(), 'data', 'user_targets.json');
}

function getChatFilePath(): string {
  if (process.env.VERCEL || process.env.NODE_ENV === 'production') {
    return path.join(os.tmpdir(), 'chat.json');
  }
  return path.join(process.cwd(), 'data', 'chat.json');
}

/**
 * OS-level atomic JSON file write helper (POSIX atomic rename).
 * Writes to a temporary file first, then performs an atomic renameSync.
 */
function safeAtomicWriteJson(filePath: string, data: any) {
  try {
    const dir = path.dirname(filePath);
    if (!fs.existsSync(dir)) {
      fs.mkdirSync(dir, { recursive: true });
    }
    const tempPath = `${filePath}.${Date.now()}.${Math.random().toString(36).substring(2, 7)}.tmp`;
    fs.writeFileSync(tempPath, JSON.stringify(data, null, 2), 'utf8');
    fs.renameSync(tempPath, filePath);
  } catch (e) {
    console.warn(`[STORE] Atomic file write warning for ${filePath}:`, e);
  }
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

  if (valid.length !== players.length) {
    saveAllPlayers(valid);
  }
  return valid;
}

export function getAllPlayers(): PlayerProfile[] {
  const filePath = getDataFilePath();
  let loaded: PlayerProfile[] = globalStore._matrixPlayersStore || [];
  try {
    if (fs.existsSync(filePath)) {
      const raw = fs.readFileSync(filePath, 'utf8');
      const parsed = JSON.parse(raw);
      if (Array.isArray(parsed)) {
        loaded = parsed;
        globalStore._matrixPlayersStore = parsed;
      }
    }
  } catch (e) {
    console.warn('[STORE] Error reading player file, using in-memory store:', e);
  }
  return pruneExpiredPlayers(loaded);
}

export function saveAllPlayers(players: PlayerProfile[]) {
  globalStore._matrixPlayersStore = players;
  safeAtomicWriteJson(getDataFilePath(), players);
}

export function clearAllPlayers() {
  globalStore._pendingInspectQueue = [];
  saveAllPlayers([]);
}

// Queue functions for J2ME inspect triggers
export function pushInspectQueue(targetName: string) {
  if (!globalStore._pendingInspectQueue) {
    globalStore._pendingInspectQueue = [];
  }
  if (!globalStore._pendingInspectQueue.includes(targetName)) {
    globalStore._pendingInspectQueue.push(targetName);
  }
}

export function popInspectQueue(): string | null {
  if (!globalStore._pendingInspectQueue || globalStore._pendingInspectQueue.length === 0) {
    return null;
  }
  return globalStore._pendingInspectQueue.shift() || null;
}

export function saveOrUpdatePlayer(playerData: Partial<PlayerProfile> & { name: string }): PlayerProfile {
  let players = getAllPlayers();
  const index = players.findIndex(p => p.name.toLowerCase() === playerData.name.toLowerCase());
  const existing = index >= 0 ? players[index] : null;

  const isOffline = playerData.status === 'OFFLINE' || playerData.online === false || !!playerData.error;

  const updatedPlayer: PlayerProfile = {
    name: playerData.name,
    level: playerData.level !== undefined ? playerData.level : (existing ? existing.level : 0),
    class: playerData.class || (existing ? existing.class : 'Unknown'),
    school: playerData.school || (existing ? existing.school : 'Unknown'),
    gender: playerData.gender !== undefined ? playerData.gender : (existing ? existing.gender : ''),
    clan: playerData.clan !== undefined ? playerData.clan : (playerData.giaToc !== undefined ? playerData.giaToc : (existing ? existing.clan : '')),
    giaToc: playerData.giaToc !== undefined ? playerData.giaToc : (playerData.clan !== undefined ? playerData.clan : (existing ? existing.giaToc : '')),
    hp: playerData.hp !== undefined ? playerData.hp : (existing ? existing.hp : 0),
    maxHp: playerData.maxHp !== undefined ? playerData.maxHp : (existing ? existing.maxHp : 0),
    mp: playerData.mp !== undefined ? playerData.mp : (existing ? existing.mp : 0),
    maxMp: playerData.maxMp !== undefined ? playerData.maxMp : (existing ? existing.maxMp : 0),
    speed: playerData.speed !== undefined ? playerData.speed : (existing ? existing.speed : 0),
    attackMin: playerData.attackMin !== undefined ? playerData.attackMin : (existing ? existing.attackMin : 0),
    attackMax: playerData.attackMax !== undefined ? playerData.attackMax : (existing ? existing.attackMax : 0),
    antiFire: playerData.antiFire !== undefined ? playerData.antiFire : (existing ? existing.antiFire : 0),
    antiIce: playerData.antiIce !== undefined ? playerData.antiIce : (existing ? existing.antiIce : 0),
    antiWind: playerData.antiWind !== undefined ? playerData.antiWind : (existing ? existing.antiWind : 0),
    reducePain: playerData.reducePain !== undefined ? playerData.reducePain : (existing ? existing.reducePain : 0),
    accurate: playerData.accurate !== undefined ? playerData.accurate : (existing ? existing.accurate : 0),
    dodge: playerData.dodge !== undefined ? playerData.dodge : (existing ? existing.dodge : 0),
    critical: playerData.critical !== undefined ? playerData.critical : (existing ? existing.critical : 0),
    counterStrike: playerData.counterStrike !== undefined ? playerData.counterStrike : (existing ? existing.counterStrike : 0),
    antiChakra: playerData.antiChakra !== undefined ? playerData.antiChakra : (existing ? existing.antiChakra : 0),
    antiChakraBack: playerData.antiChakraBack !== undefined ? playerData.antiChakraBack : (existing ? existing.antiChakraBack : 0),
    equipment: playerData.equipment || (existing ? existing.equipment : []),
    lastUpdated: new Date().toISOString(),
    status: isOffline ? 'OFFLINE' : (playerData.status || 'ONLINE'),
    online: isOffline ? false : (playerData.online ?? true),
    error: playerData.error
  };

  if (index >= 0) {
    players[index] = updatedPlayer;
  } else {
    players.unshift(updatedPlayer);
  }

  saveAllPlayers(players);
  return updatedPlayer;
}

export function deletePlayerByName(name: string): boolean {
  let players = getAllPlayers();
  const initialCount = players.length;
  players = players.filter(p => p.name.toLowerCase() !== name.toLowerCase());
  if (players.length !== initialCount) {
    saveAllPlayers(players);
    return true;
  }
  return false;
}

// Chat Store Functions (Atomic JSON File Persistence + Ephemeral Memory Cache)
export function getAllChatMessages(): ChatMessage[] {
  const filePath = getChatFilePath();
  let loaded: ChatMessage[] = globalStore._matrixChatStore || [];
  try {
    if (fs.existsSync(filePath)) {
      const raw = fs.readFileSync(filePath, 'utf8');
      const parsed = JSON.parse(raw);
      if (Array.isArray(parsed)) {
        loaded = parsed;
        globalStore._matrixChatStore = parsed;
      }
    }
  } catch (e) {
    console.warn('[STORE] Error reading chat file, using in-memory store:', e);
  }
  return loaded;
}

export function saveAllChatMessages(messages: ChatMessage[]) {
  globalStore._matrixChatStore = messages;
  safeAtomicWriteJson(getChatFilePath(), messages);
}

export function saveChatMessage(data: {
  channel: string;
  sender: string;
  recipient?: string;
  message: string;
}): ChatMessage {
  let messages = getAllChatMessages();

  const validChannel = (['MAP', 'WORLD', 'PRIVATE', 'CLAN'].includes(data.channel?.toUpperCase())
    ? data.channel.toUpperCase()
    : 'MAP') as ChatMessage['channel'];

  const cleanMessage = data.message.trim();
  const cleanSender = data.sender || 'UNKNOWN';
  const cleanRecipient = data.recipient ? data.recipient.trim() : undefined;

  // Deduplication check: ignore if exact same channel, sender, recipient, and message received within 1500ms
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

  // Maintain latest 500 live messages in memory & disk buffer
  if (messages.length > 500) {
    messages = messages.slice(0, 500);
  }

  saveAllChatMessages(messages);
  return msg;
}

export function clearAllChatMessages() {
  globalStore._matrixChatStore = [];
  globalStore._pendingOutboundChatQueue = [];
  saveAllChatMessages([]);
}

export function queueOutboundChatMessage(data: {
  channel: string;
  recipient?: string;
  message: string;
}): ChatMessage {
  if (!globalStore._pendingOutboundChatQueue) {
    globalStore._pendingOutboundChatQueue = [];
  }

  // First save to historical chat stream as WEB_CONSOLE
  const msg = saveChatMessage({
    channel: data.channel,
    sender: 'WEB_CONSOLE',
    recipient: data.recipient,
    message: data.message,
  });

  globalStore._pendingOutboundChatQueue.push(msg);
  return msg;
}

export function popPendingOutboundChatMessages(): ChatMessage[] {
  if (!globalStore._pendingOutboundChatQueue) {
    globalStore._pendingOutboundChatQueue = [];
    return [];
  }
  return globalStore._pendingOutboundChatQueue.splice(0);
}

// User-Isolated Saved Targets Persistence
function loadUserTargetsMap(): Record<string, PlayerProfile[]> {
  const filePath = getUserTargetsFilePath();
  let map: Record<string, PlayerProfile[]> = globalStore._userSavedTargetsStore || {};
  try {
    if (fs.existsSync(filePath)) {
      const raw = fs.readFileSync(filePath, 'utf8');
      const parsed = JSON.parse(raw);
      if (parsed && typeof parsed === 'object') {
        map = parsed;
        globalStore._userSavedTargetsStore = map;
      }
    }
  } catch (e) {
    console.warn('[STORE] Error loading user targets file:', e);
  }
  return map;
}

function saveUserTargetsMap(map: Record<string, PlayerProfile[]>) {
  globalStore._userSavedTargetsStore = map;
  safeAtomicWriteJson(getUserTargetsFilePath(), map);
}

export function getUserSavedTargets(userId: string): PlayerProfile[] {
  if (!userId) return [];
  const map = loadUserTargetsMap();
  return map[userId] || [];
}

export function saveUserTargetCard(userId: string, player: PlayerProfile): PlayerProfile[] {
  if (!userId) return [];
  const map = loadUserTargetsMap();
  const current = map[userId] || [];
  const exists = current.some((p) => p.name.toLowerCase() === player.name.toLowerCase());
  let updated: PlayerProfile[];
  if (exists) {
    updated = current.map((p) => (p.name.toLowerCase() === player.name.toLowerCase() ? player : p));
  } else {
    updated = [player, ...current];
  }
  map[userId] = updated;
  saveUserTargetsMap(map);
  return updated;
}

export function removeUserTargetCard(userId: string, playerName: string): PlayerProfile[] {
  if (!userId) return [];
  const map = loadUserTargetsMap();
  const current = map[userId] || [];
  const updated = current.filter((p) => p.name.toLowerCase() !== playerName.toLowerCase());
  map[userId] = updated;
  saveUserTargetsMap(map);
  return updated;
}
