'use client';

import React, { useState, useEffect } from 'react';

export function AnimatedNumber({
  value,
  duration = 750,
  prefix = '',
  suffix = '',
}: {
  value: number;
  duration?: number;
  prefix?: string;
  suffix?: string;
}) {
  const [displayValue, setDisplayValue] = useState(0);

  useEffect(() => {
    let startTimestamp: number | null = null;
    const startValue = 0;
    const endValue = value || 0;

    const step = (timestamp: number) => {
      if (!startTimestamp) startTimestamp = timestamp;
      const progress = Math.min((timestamp - startTimestamp) / duration, 1);
      const easeProgress = 1 - Math.pow(1 - progress, 3);
      const current = Math.floor(startValue + (endValue - startValue) * easeProgress);
      setDisplayValue(current);

      if (progress < 1) {
        window.requestAnimationFrame(step);
      }
    };

    const animId = window.requestAnimationFrame(step);
    return () => window.cancelAnimationFrame(animId);
  }, [value, duration]);

  return (
    <span>
      {prefix}
      {displayValue}
      {suffix}
    </span>
  );
}

export function AnimatedTextWithNumbers({ text }: { text: string }) {
  if (!text) return null;
  const parts = text.split(/(\d+)/);
  return (
    <span>
      {parts.map((part, i) => {
        if (/^\d+$/.test(part)) {
          const num = parseInt(part, 10);
          return <AnimatedNumber key={i} value={num} duration={750} />;
        }
        return <span key={i}>{part}</span>;
      })}
    </span>
  );
}
