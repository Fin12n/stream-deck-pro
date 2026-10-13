package U6;

import java.io.Serializable;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f10243a = new a(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c f10244b = K6.b.f4727a.b();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends c implements Serializable {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        @Override // U6.c
        public int b(int i8) {
            return c.f10244b.b(i8);
        }

        @Override // U6.c
        public byte[] c(byte[] array) {
            t.g(array, "array");
            return c.f10244b.c(array);
        }

        @Override // U6.c
        public byte[] d(byte[] array, int i8, int i9) {
            t.g(array, "array");
            return c.f10244b.d(array, i8, i9);
        }

        @Override // U6.c
        public int e() {
            return c.f10244b.e();
        }

        @Override // U6.c
        public int f(int i8) {
            return c.f10244b.f(i8);
        }

        @Override // U6.c
        public int g(int i8, int i9) {
            return c.f10244b.g(i8, i9);
        }

        @Override // U6.c
        public long h() {
            return c.f10244b.h();
        }

        @Override // U6.c
        public long i(long j8, long j9) {
            return c.f10244b.i(j8, j9);
        }

        public a() {
        }
    }

    public abstract int b(int i8);

    public byte[] c(byte[] array) {
        t.g(array, "array");
        return d(array, 0, array.length);
    }

    public byte[] d(byte[] array, int i8, int i9) {
        t.g(array, "array");
        if (i8 < 0 || i8 > array.length || i9 < 0 || i9 > array.length) {
            throw new IllegalArgumentException(("fromIndex (" + i8 + ") or toIndex (" + i9 + ") are out of range: 0.." + array.length + com.amazon.a.a.o.c.a.b.f16789a).toString());
        }
        if (i8 > i9) {
            throw new IllegalArgumentException(("fromIndex (" + i8 + ") must be not greater than toIndex (" + i9 + ").").toString());
        }
        int i10 = (i9 - i8) / 4;
        for (int i11 = 0; i11 < i10; i11++) {
            int iE = e();
            array[i8] = (byte) iE;
            array[i8 + 1] = (byte) (iE >>> 8);
            array[i8 + 2] = (byte) (iE >>> 16);
            array[i8 + 3] = (byte) (iE >>> 24);
            i8 += 4;
        }
        int i12 = i9 - i8;
        int iB = b(i12 * 8);
        for (int i13 = 0; i13 < i12; i13++) {
            array[i8 + i13] = (byte) (iB >>> (i13 * 8));
        }
        return array;
    }

    public int e() {
        return b(32);
    }

    public int f(int i8) {
        return g(0, i8);
    }

    public int g(int i8, int i9) {
        int iE;
        int i10;
        int iB;
        d.c(i8, i9);
        int i11 = i9 - i8;
        if (i11 > 0 || i11 == Integer.MIN_VALUE) {
            if (((-i11) & i11) == i11) {
                iB = b(d.e(i11));
            } else {
                do {
                    iE = e() >>> 1;
                    i10 = iE % i11;
                } while ((iE - i10) + (i11 - 1) < 0);
                iB = i10;
            }
            return i8 + iB;
        }
        while (true) {
            int iE2 = e();
            if (i8 <= iE2 && iE2 < i9) {
                return iE2;
            }
        }
    }

    public long h() {
        return (((long) e()) << 32) + ((long) e());
    }

    public long i(long j8, long j9) {
        long jH;
        long j10;
        long jB;
        int iE;
        d.d(j8, j9);
        long j11 = j9 - j8;
        if (j11 > 0) {
            if (((-j11) & j11) == j11) {
                int i8 = (int) j11;
                int i9 = (int) (j11 >>> 32);
                if (i8 != 0) {
                    iE = b(d.e(i8));
                } else if (i9 == 1) {
                    iE = e();
                } else {
                    jB = (((long) b(d.e(i9))) << 32) + (((long) e()) & 4294967295L);
                }
                jB = ((long) iE) & 4294967295L;
            } else {
                do {
                    jH = h() >>> 1;
                    j10 = jH % j11;
                } while ((jH - j10) + (j11 - 1) < 0);
                jB = j10;
            }
            return j8 + jB;
        }
        while (true) {
            long jH2 = h();
            if (j8 <= jH2 && jH2 < j9) {
                return jH2;
            }
        }
    }
}
