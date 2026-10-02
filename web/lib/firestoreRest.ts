/**
 * Firestore REST API Client for Cloudflare Workers & Edge Runtimes
 * Uses 100% native fetch with zero WebSocket/gRPC streams to prevent Cloudflare Error 1101 crashes.
 */

const PROJECT_ID =
  process.env.NEXT_PUBLIC_FIREBASE_PROJECT_ID ||
  process.env.FIREBASE_PROJECT_ID ||
  'nsomatrix-core';

const BASE_URL = `https://firestore.googleapis.com/v1/projects/${PROJECT_ID}/databases/(default)/documents`;

function toFirestoreValue(val: any): any {
  if (val === null || val === undefined) return { nullValue: null };
  if (typeof val === 'boolean') return { booleanValue: val };
  if (typeof val === 'number') {
    return Number.isInteger(val) ? { integerValue: val.toString() } : { doubleValue: val };
  }
  if (typeof val === 'string') return { stringValue: val };
  if (Array.isArray(val)) {
    return { arrayValue: { values: val.map(toFirestoreValue) } };
  }
  if (typeof val === 'object') {
    const fields: Record<string, any> = {};
    for (const [k, v] of Object.entries(val)) {
      if (v !== undefined) {
        fields[k] = toFirestoreValue(v);
      }
    }
    return { mapValue: { fields } };
  }
  return { stringValue: String(val) };
}

function fromFirestoreValue(val: any): any {
  if (!val) return null;
  if ('nullValue' in val) return null;
  if ('booleanValue' in val) return val.booleanValue;
  if ('integerValue' in val) return Number(val.integerValue);
  if ('doubleValue' in val) return Number(val.doubleValue);
  if ('stringValue' in val) return val.stringValue;
  if ('arrayValue' in val) {
    return Array.isArray(val.arrayValue.values)
      ? val.arrayValue.values.map(fromFirestoreValue)
      : [];
  }
  if ('mapValue' in val) {
    const fields = val.mapValue.fields || {};
    const res: Record<string, any> = {};
    for (const [k, v] of Object.entries(fields)) {
      res[k] = fromFirestoreValue(v);
    }
    return res;
  }
  return null;
}

export async function getFirestoreDoc<T = Record<string, any>>(docPath: string): Promise<T | null> {
  try {
    const res = await fetch(`${BASE_URL}/${docPath}`, {
      headers: { Accept: 'application/json' },
    });
    if (!res.ok) return null;
    const data = (await res.json()) as any;
    if (!data || !data.fields) return null;
    const result: Record<string, any> = {};
    for (const [k, v] of Object.entries(data.fields)) {
      result[k] = fromFirestoreValue(v);
    }
    return result as T;
  } catch (e) {
    console.warn(`[FirestoreREST] getDoc error for ${docPath}:`, e);
    return null;
  }
}

export async function setFirestoreDoc(docPath: string, data: Record<string, any>): Promise<boolean> {
  try {
    const fields: Record<string, any> = {};
    for (const [k, v] of Object.entries(data)) {
      if (v !== undefined) {
        fields[k] = toFirestoreValue(v);
      }
    }
    const res = await fetch(`${BASE_URL}/${docPath}`, {
      method: 'PATCH',
      headers: {
        'Content-Type': 'application/json',
        Accept: 'application/json',
      },
      body: JSON.stringify({ fields }),
    });
    return res.ok;
  } catch (e) {
    console.warn(`[FirestoreREST] setDoc error for ${docPath}:`, e);
    return false;
  }
}
