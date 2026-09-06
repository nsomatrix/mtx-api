'use client';

import React, { createContext, useContext, useEffect, useState } from 'react';
import {
  User,
  signInWithEmailAndPassword,
  createUserWithEmailAndPassword,
  updateProfile,
  signOut,
  onAuthStateChanged,
} from 'firebase/auth';
import { auth, isFirebaseConfigured } from '@/lib/firebase';

interface AuthContextType {
  user: User | null;
  loading: boolean;
  isConfigured: boolean;
  signInWithUsernameOrEmail: (usernameOrEmail: string, pass: string) => Promise<void>;
  signUpWithUsername: (username: string, pass: string) => Promise<void>;
  logout: () => Promise<void>;
}

const AuthContext = createContext<AuthContextType>({
  user: null,
  loading: true,
  isConfigured: false,
  signInWithUsernameOrEmail: async () => {},
  signUpWithUsername: async () => {},
  logout: async () => {},
});

// Convert plain username (e.g. "ninja123") into Firebase compatible identifier
const formatToFirebaseEmail = (input: string): string => {
  const trimmed = input.trim();
  if (trimmed.includes('@')) return trimmed;
  // Sanitize username to ensure 100% valid RFC 5322 compliance
  const cleanUsername = trimmed.toLowerCase().replace(/[^a-z0-9_.-]/g, '');
  return `${cleanUsername}@mtx.api`;
};

export const AuthProvider = ({ children }: { children: React.ReactNode }) => {
  const [user, setUser] = useState<User | null>(null);
  const [loading, setLoading] = useState<boolean>(true);
  const configured = isFirebaseConfigured();

  useEffect(() => {
    if (!auth) {
      setLoading(false);
      return;
    }

    const unsubscribe = onAuthStateChanged(auth, (currentUser) => {
      setUser(currentUser);
      setLoading(false);
    });

    return () => unsubscribe();
  }, []);

  const signInWithUsernameOrEmail = async (identifier: string, pass: string) => {
    if (!auth) {
      throw new Error('Firebase Authentication is not configured.');
    }
    const formattedEmail = formatToFirebaseEmail(identifier);
    await signInWithEmailAndPassword(auth, formattedEmail, pass);
  };

  const signUpWithUsername = async (username: string, pass: string) => {
    if (!auth) {
      throw new Error('Firebase Authentication is not configured.');
    }
    const cleanUsername = username.trim();
    if (!cleanUsername) {
      throw new Error('Please enter a username.');
    }
    const formattedEmail = formatToFirebaseEmail(cleanUsername);
    const res = await createUserWithEmailAndPassword(auth, formattedEmail, pass);
    if (res.user) {
      await updateProfile(res.user, { displayName: cleanUsername });
    }
  };

  const logout = async () => {
    if (!auth) return;
    await signOut(auth);
  };

  return (
    <AuthContext.Provider
      value={{
        user,
        loading,
        isConfigured: configured,
        signInWithUsernameOrEmail,
        signUpWithUsername,
        logout,
      }}
    >
      {children}
    </AuthContext.Provider>
  );
};

export const useAuth = () => useContext(AuthContext);
