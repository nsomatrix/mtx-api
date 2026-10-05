import { jwtVerify, createRemoteJWKSet } from 'jose';

export interface VerifiedAuthResult {
  valid: boolean;
  uid?: string;
  email?: string;
  isDev?: boolean;
  error?: string;
}

const FIREBASE_JWKS = createRemoteJWKSet(
  new URL('https://www.googleapis.com/service_accounts/v1/jwk/securetoken@system.gserviceaccount.com')
);

export async function verifyAuthToken(request: Request): Promise<VerifiedAuthResult> {
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

  // 4. Operator Secret passed via Bearer header
  if (expectedOperatorSecret && token === expectedOperatorSecret) {
    return { valid: true, uid: 'system_operator' };
  }

  // 5. Standard Firebase JWT Cryptographic Signature & Claims Validation
  try {
    const projectId =
      process.env.NEXT_PUBLIC_FIREBASE_PROJECT_ID ||
      process.env.FIREBASE_PROJECT_ID ||
      'nsomatrix-core';
    const expectedIssuer = `https://securetoken.google.com/${projectId}`;

    const { payload } = await jwtVerify(token, FIREBASE_JWKS, {
      issuer: expectedIssuer,
      audience: projectId,
    });

    const uid = (payload.sub || payload.user_id || payload.uid) as string;
    if (!uid) {
      return { valid: false, error: 'Missing subject UID in token payload' };
    }

    return {
      valid: true,
      uid,
      email: payload.email as string | undefined,
    };
  } catch (err: any) {
    return {
      valid: false,
      error: err?.message || 'Invalid or unverified JWT signature',
    };
  }
}
