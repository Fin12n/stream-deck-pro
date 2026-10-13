package io.sentry.util;

import java.io.Serializable;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x implements Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final AtomicLong f27740b = new AtomicLong(8682522807148012L);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicLong f27741a;

    public x() {
        this(f() ^ System.nanoTime());
    }

    public static long a(long j8) {
        return (j8 ^ 25214903917L) & 281474976710655L;
    }

    public static long f() {
        AtomicLong atomicLong;
        long j8;
        long j9;
        do {
            atomicLong = f27740b;
            j8 = atomicLong.get();
            j9 = 1181783497276652981L * j8;
        } while (!atomicLong.compareAndSet(j8, j9));
        return j9;
    }

    public final int b(int i8) {
        long j8;
        long j9;
        AtomicLong atomicLong = this.f27741a;
        do {
            j8 = atomicLong.get();
            j9 = ((25214903917L * j8) + 11) & 281474976710655L;
        } while (!atomicLong.compareAndSet(j8, j9));
        return (int) (j9 >>> (48 - i8));
    }

    public void c(byte[] bArr) {
        int length = bArr.length;
        int i8 = 0;
        while (i8 < length) {
            int iE = e();
            int iMin = Math.min(length - i8, 4);
            while (true) {
                int i9 = iMin - 1;
                if (iMin > 0) {
                    bArr[i8] = (byte) iE;
                    iE >>= 8;
                    i8++;
                    iMin = i9;
                }
            }
        }
    }

    public double d() {
        return ((((long) b(26)) << 27) + ((long) b(27))) * 1.1102230246251565E-16d;
    }

    public int e() {
        return b(32);
    }

    public x(long j8) {
        this.f27741a = new AtomicLong(a(j8));
    }
}
