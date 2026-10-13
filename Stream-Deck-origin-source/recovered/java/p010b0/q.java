package p010b0;

import C6.A;
import D6.C0933m;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class q extends g {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15634f;

    public q() {
        this(0, 1, null);
    }

    public final void f() {
        if (this.f15604d <= 8 || Long.compareUnsigned(A.b(A.b(this.f15605e) * 32), A.b(A.b(this.f15604d) * 25)) > 0) {
            l(z.c(this.f15604d));
        } else {
            l(z.c(this.f15604d));
        }
    }

    public final int g(int i8) {
        int iHashCode = Integer.hashCode(i8) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 >>> 7;
        int i11 = i9 & 127;
        int i12 = this.f15604d;
        int i13 = i10 & i12;
        int i14 = 0;
        while (true) {
            long[] jArr = this.f15601a;
            int i15 = i13 >> 3;
            int i16 = (i13 & 7) << 3;
            int i17 = 1;
            long j8 = ((jArr[i15 + 1] << (64 - i16)) & ((-i16) >> 63)) | (jArr[i15] >>> i16);
            long j9 = i11;
            int i18 = i14;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L);
            while (j11 != 0) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i13) & i12;
                int i19 = i17;
                if (this.f15602b[iNumberOfTrailingZeros] == i8) {
                    return iNumberOfTrailingZeros;
                }
                j11 &= j11 - 1;
                i17 = i19;
            }
            int i20 = i17;
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int iH = h(i10);
                if (this.f15634f == 0 && ((this.f15601a[iH >> 3] >> ((iH & 7) << 3)) & 255) != 254) {
                    f();
                    iH = h(i10);
                }
                this.f15605e++;
                int i21 = this.f15634f;
                long[] jArr2 = this.f15601a;
                int i22 = iH >> 3;
                long j12 = jArr2[i22];
                int i23 = (iH & 7) << 3;
                this.f15634f = i21 - (((j12 >> i23) & 255) == 128 ? i20 : 0);
                jArr2[i22] = (j12 & (~(255 << i23))) | (j9 << i23);
                int i24 = this.f15604d;
                int i25 = ((iH - 7) & i24) + (i24 & 7);
                int i26 = i25 >> 3;
                int i27 = (i25 & 7) << 3;
                jArr2[i26] = ((~(255 << i27)) & jArr2[i26]) | (j9 << i27);
                return iH;
            }
            i14 = i18 + 8;
            i13 = (i13 + i14) & i12;
        }
    }

    public final int h(int i8) {
        int i9 = this.f15604d;
        int i10 = i8 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f15601a;
            int i12 = i10 >> 3;
            int i13 = (i10 & 7) << 3;
            long j8 = ((jArr[i12 + 1] << (64 - i13)) & ((-i13) >> 63)) | (jArr[i12] >>> i13);
            long j9 = j8 & ((~j8) << 7) & (-9187201950435737472L);
            if (j9 != 0) {
                return (i10 + (Long.numberOfTrailingZeros(j9) >> 3)) & i9;
            }
            i11 += 8;
            i10 = (i10 + i11) & i9;
        }
    }

    public final void i() {
        this.f15634f = z.a(c()) - this.f15605e;
    }

    public final void j(int i8) {
        long[] jArr;
        if (i8 == 0) {
            jArr = z.f15651a;
        } else {
            long[] jArr2 = new long[((i8 + 15) & (-8)) >> 3];
            C0933m.v(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f15601a = jArr;
        int i9 = i8 >> 3;
        long j8 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j8)) | j8;
        i();
    }

    public final void k(int i8) {
        int iMax = i8 > 0 ? Math.max(7, z.d(i8)) : 0;
        this.f15604d = iMax;
        j(iMax);
        this.f15602b = new int[iMax];
        this.f15603c = new Object[iMax];
    }

    public final void l(int i8) {
        q qVar = this;
        long[] jArr = qVar.f15601a;
        int[] iArr = qVar.f15602b;
        Object[] objArr = qVar.f15603c;
        int i9 = qVar.f15604d;
        k(i8);
        int[] iArr2 = qVar.f15602b;
        Object[] objArr2 = qVar.f15603c;
        int i10 = 0;
        while (i10 < i9) {
            if (((jArr[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128) {
                int i11 = iArr[i10];
                int iHashCode = Integer.hashCode(i11) * (-862048943);
                int i12 = iHashCode ^ (iHashCode << 16);
                int iH = qVar.h(i12 >>> 7);
                long j8 = i12 & 127;
                long[] jArr2 = qVar.f15601a;
                int i13 = iH >> 3;
                int i14 = (iH & 7) << 3;
                jArr2[i13] = (jArr2[i13] & (~(255 << i14))) | (j8 << i14);
                int i15 = qVar.f15604d;
                int i16 = ((iH - 7) & i15) + (i15 & 7);
                int i17 = i16 >> 3;
                int i18 = (i16 & 7) << 3;
                jArr2[i17] = ((~(255 << i18)) & jArr2[i17]) | (j8 << i18);
                iArr2[iH] = i11;
                objArr2[iH] = objArr[i10];
            }
            i10++;
            qVar = this;
            jArr = jArr;
        }
    }

    public final void m(int i8, Object obj) {
        int iG = g(i8);
        this.f15602b[iG] = i8;
        this.f15603c[iG] = obj;
    }

    public /* synthetic */ q(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public q(int i8) {
        super(null);
        if (i8 >= 0) {
            k(z.e(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
