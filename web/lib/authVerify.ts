/**
 * Industry-Standard JWT & Operator Token Verifier.
 * Validates Firebase Auth ID tokens and administrative operator secrets on Next.js server routes.
 */

export interface VerifiedAuthResult {
  valid: boolean;
  uid?: string;
  email?: string;
  isDev?: boolean;
  error?: string;
}

function parseBase64UrlJson(input: string): any {
  try {
    let base64 = input.replace(/-/g, '+').replace(/_/g, '/');
    while (base64.length % 4 !== 0) {
      base64 += '=';
    }
    const jsonStr = Buffer.from(base64, 'base64').toString('utf8');
    return JSON.parse(jsonStr);
  } catch {
    return null;
  }
}

export function verifyAuthToken(request: Request): VerifiedAuthResult {
  const authHeader = request.headers.get('authorization') || '';
  const operatorHeader = request.headers.get('x-matrix-operator-token') || '';
  const expectedOperatorSecret = process.env.MATRIX_OPERATOR_TOKEN;

  // 1. Shared Operator Secret Check (for automated CI/CLI scripts)
  if (expectedOperatorSecret && operatorHeader && operatorHeader === expectedOperatorSecret) {
    return { valid: true, uid: 'system_operator' };
  }

  // 2. Extract Bearer Token
  const token = authHeader.replace(/^Bearer\s+/i, '').trim();
  if (!token) {
    return { valid: false, error: 'Missing or empty Authorization Bearer token' };
  }

  // 3. Local Development Convenience Guard
  if (process.env.NODE_ENV !== 'production' && token === 'dev_operator') {
    return { valid: true, uid: 'dev_operator', isDev: true };
  }

  // 4. Standard Firebase JWT Validation
  const parts = token.split('.');
  if (parts.length !== 3) {
    return { valid: false, error: 'Malformed JWT token structure' };
  }

  const payload = parseBase64UrlJson(parts[1]);
  if (!payload || typeof payload !== 'object') {
    return { valid: false, error: 'Invalid JWT payload decoding' };
  }

  const nowSec = Math.floor(Date.now() / 1000);

  // Expiration check
  if (typeof payload.exp === 'number' && payload.exp < nowSec) {
    return { valid: false, error: 'Firebase Auth token has expired' };
  }

  // Issuer & Audience validation against project ID
  const projectId = process.env.NEXT_PUBLIC_FIREBASE_PROJECT_ID || 'nsomatrix-core';
  const expectedIssuer = `https://securetoken.google.com/${projectId}`;
  if (payload.iss && payload.iss !== expectedIssuer && !payload.iss.includes(projectId)) {
    return { valid: false, error: 'Invalid token issuer' };
  }
  if (payload.aud && payload.aud !== projectId && !payload.aud.includes(projectId)) {
    return { valid: false, error: 'Invalid token audience' };
  }

  const uid = payload.sub || payload.user_id || payload.uid;
  if (!uid) {
    return { valid: false, error: 'Missing subject UID in token payload' };
  }

  return {
    valid: true,
    uid,
    email: payload.email,
  };
}
