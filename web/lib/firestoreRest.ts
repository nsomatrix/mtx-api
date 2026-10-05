/**
 * Firestore REST API Client for Cloudflare Workers & Edge Runtimes
 * Uses 100% native fetch with zero WebSocket/gRPC streams to prevent Cloudflare Error 1101 crashes.
 */

const PROJECT_ID =
  process.env.NEXT_PUBLIC_FIREBASE_PROJECT_ID ||
  process.env.FIREBASE_PROJECT_ID ||
  'nsomatrix-core';

const API_KEY =
  process.env.NEXT_PUBLIC_FIREBASE_API_KEY ||
  process.env.FIREBASE_API_KEY ||
  '';

const BASE_URL = `https://firestore.googleapis.com/v1/projects/${PROJECT_ID}/databases/(default)/documents`;

function getApiUrl(docPath: string): string {
  const cleanPath = docPath.startsWith('/') ? docPath.slice(1) : docPath;
  const url = `${BASE_URL}/${cleanPath}`;
  return API_KEY ? `${url}?key=${API_KEY}` : url;
}

function getRequestHeaders(authToken?: string, extraHeaders: Record<string, string> = {}): Record<string, string> {
  const headers: Record<string, string> = {
    Accept: 'application/json',
    ...extraHeaders,
  };
  if (authToken) {
    headers['Authorization'] = authToken.startsWith('Bearer ') ? authToken : `Bearer ${authToken}`;
  }
  return headers;
}

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
    return Array.isArray(val.arrayValue?.values)
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

export async function getFirestoreDoc<T = Record<string, any>>(docPath: string, authToken?: string): Promise<T | null> {
  try {
    const res = await fetch(getApiUrl(docPath), {
      headers: getRequestHeaders(authToken),
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

export async function setFirestoreDoc(docPath: string, data: Record<string, any>, authToken?: string): Promise<boolean> {
  try {
    const fields: Record<string, any> = {};
    for (const [k, v] of Object.entries(data)) {
      if (v !== undefined) {
        fields[k] = toFirestoreValue(v);
      }
    }
    const res = await fetch(getApiUrl(docPath), {
      method: 'PATCH',
      headers: getRequestHeaders(authToken, { 'Content-Type': 'application/json' }),
      body: JSON.stringify({ fields }),
    });
    return res.ok;
  } catch (e) {
    console.warn(`[FirestoreREST] setDoc error for ${docPath}:`, e);
    return false;
  }
}

export async function deleteFirestoreDoc(docPath: string, authToken?: string): Promise<boolean> {
  try {
    const res = await fetch(getApiUrl(docPath), {
      method: 'DELETE',
      headers: getRequestHeaders(authToken),
    });
    return res.ok;
  } catch (e) {
    console.warn(`[FirestoreREST] deleteDoc error for ${docPath}:`, e);
    return false;
  }
}

export async function listFirestoreCollection<T = Record<string, any>>(collectionPath: string, authToken?: string): Promise<T[]> {
  try {
    const res = await fetch(getApiUrl(collectionPath), {
      headers: getRequestHeaders(authToken),
    });
    if (!res.ok) return [];
    const data = (await res.json()) as any;
    if (!data || !Array.isArray(data.documents)) return [];
    
    return data.documents.map((doc: any) => {
      const fields = doc.fields || {};
      const resObj: Record<string, any> = {};
      for (const [k, v] of Object.entries(fields)) {
        resObj[k] = fromFirestoreValue(v);
      }
      return resObj as T;
    });
  } catch (e) {
    console.warn(`[FirestoreREST] listCollection error for ${collectionPath}:`, e);
    return [];
  }
}
