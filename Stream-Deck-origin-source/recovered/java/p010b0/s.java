package p010b0;

import C6.A;
import D6.C0933m;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class s extends k {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15636e;

    public s() {
        this(0, 1, null);
    }

    public final void e() {
        if (this.f15615c <= 8 || Long.compareUnsigned(A.b(A.b(this.f15616d) * 32), A.b(A.b(this.f15615c) * 25)) > 0) {
            n(z.c(this.f15615c));
        } else {
            n(z.c(this.f15615c));
        }
    }

    public final int f(long j8) {
        int iHashCode = Long.hashCode(j8) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f15615c;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f15613a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j9 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j10 = i10;
            int i16 = i13;
            long j11 = j9 ^ (j10 * 72340172838076673L);
            for (long j12 = (~j11) & (j11 - 72340172838076673L) & (-9187201950435737472L); j12 != 0; j12 &= j12 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j12) >> 3) + i12) & i11;
                if (this.f15614b[iNumberOfTrailingZeros] == j8) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j9) << 6) & j9 & (-9187201950435737472L)) != 0) {
                int iG = g(i9);
                if (this.f15636e == 0 && ((this.f15613a[iG >> 3] >> ((iG & 7) << 3)) & 255) != 254) {
                    e();
                    iG = g(i9);
                }
                this.f15616d++;
                int i17 = this.f15636e;
                long[] jArr2 = this.f15613a;
                int i18 = iG >> 3;
                long j13 = jArr2[i18];
                int i19 = (iG & 7) << 3;
                this.f15636e = i17 - (((j13 >> i19) & 255) == 128 ? 1 : 0);
                jArr2[i18] = (j13 & (~(255 << i19))) | (j10 << i19);
                int i20 = this.f15615c;
                int i21 = ((iG - 7) & i20) + (i20 & 7);
                int i22 = i21 >> 3;
                int i23 = (i21 & 7) << 3;
                jArr2[i22] = ((~(255 << i23)) & jArr2[i22]) | (j10 << i23);
                return iG;
            }
            i13 = i16 + 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final int g(int i8) {
        int i9 = this.f15615c;
        int i10 = i8 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f15613a;
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

    public final void h() {
        this.f15636e = z.a(b()) - this.f15616d;
    }

    public final void i(int i8) {
        long[] jArr;
        if (i8 == 0) {
            jArr = z.f15651a;
        } else {
            long[] jArr2 = new long[((i8 + 15) & (-8)) >> 3];
            C0933m.v(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f15613a = jArr;
        int i9 = i8 >> 3;
        long j8 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j8)) | j8;
        h();
    }

    public final void j(int i8) {
        int iMax = i8 > 0 ? Math.max(7, z.d(i8)) : 0;
        this.f15615c = iMax;
        i(iMax);
        this.f15614b = new long[iMax];
    }

    public final void k(long j8) {
        this.f15614b[f(j8)] = j8;
    }

    public final boolean l(long j8) {
        int iNumberOfTrailingZeros;
        int iHashCode = Long.hashCode(j8) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f15615c;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f15613a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j9 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j10 = (((long) i9) * 72340172838076673L) ^ j9;
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j11) >> 3) + i11) & i10;
                if (this.f15614b[iNumberOfTrailingZeros] == j8) {
                    break loop0;
                }
            }
            if ((j9 & ((~j9) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        boolean z8 = iNumberOfTrailingZeros >= 0;
        if (z8) {
            m(iNumberOfTrailingZeros);
        }
        return z8;
    }

    public final void m(int i8) {
        this.f15616d--;
        long[] jArr = this.f15613a;
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        int i11 = this.f15615c;
        int i12 = ((i8 - 7) & i11) + (i11 & 7);
        int i13 = i12 >> 3;
        int i14 = (i12 & 7) << 3;
        jArr[i13] = (jArr[i13] & (~(255 << i14))) | (254 << i14);
    }

    public final void n(int i8) {
        s sVar = this;
        long[] jArr = sVar.f15613a;
        long[] jArr2 = sVar.f15614b;
        int i9 = sVar.f15615c;
        j(i8);
        long[] jArr3 = sVar.f15614b;
        int i10 = 0;
        while (i10 < i9) {
            if (((jArr[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128) {
                long j8 = jArr2[i10];
                int iHashCode = Long.hashCode(j8) * (-862048943);
                int i11 = iHashCode ^ (iHashCode << 16);
                int iG = sVar.g(i11 >>> 7);
                long j9 = i11 & 127;
                long[] jArr4 = sVar.f15613a;
                int i12 = iG >> 3;
                int i13 = (iG & 7) << 3;
                jArr4[i12] = (jArr4[i12] & (~(255 << i13))) | (j9 << i13);
                int i14 = sVar.f15615c;
                int i15 = ((iG - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr4[i16] = ((~(255 << i17)) & jArr4[i16]) | (j9 << i17);
                jArr3[iG] = j8;
            }
            i10++;
            sVar = this;
            jArr = jArr;
        }
    }

    public /* synthetic */ s(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public s(int i8) {
        super(null);
        if (i8 >= 0) {
            j(z.e(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
