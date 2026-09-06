import type { Metadata, Viewport } from 'next';
import './globals.css';
import { AuthProvider } from '@/context/AuthContext';
import { StatusProvider } from '@/context/StatusContext';
import { AuthGuard } from '@/components/AuthGuard';

export const metadata: Metadata = {
  title: 'mtx-api — NSO Core Access - RestAPI',
  description: 'Real-time player inspector and REST API synchronization portal for Ninja School Online.',
};

export const viewport: Viewport = {
  width: 'device-width',
  initialScale: 1,
  maximumScale: 1,
};

export default function RootLayout({
  children,
}: {
  children: React.ReactNode;
}) {
  return (
    <html lang="en" className="dark">
      <body className="bg-black text-white min-h-screen antialiased">
        <AuthProvider>
          <StatusProvider>
            <AuthGuard>{children}</AuthGuard>
          </StatusProvider>
        </AuthProvider>
      </body>
    </html>
  );
}
