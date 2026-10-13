package p010b0;

import C6.A;
import D6.C0933m;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class v extends A {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15639e;

    public v() {
        this(0, 1, null);
    }

    public final boolean g(Object obj) {
        int iC = c();
        this.f15564b[j(obj)] = obj;
        return c() != iC;
    }

    public final void h() {
        if (this.f15565c <= 8 || Long.compareUnsigned(A.b(A.b(this.f15566d) * 32), A.b(A.b(this.f15565c) * 25)) > 0) {
            r(z.c(this.f15565c));
        } else {
            r(z.c(this.f15565c));
        }
    }

    public final void i() {
        this.f15566d = 0;
        long[] jArr = this.f15563a;
        if (jArr != z.f15651a) {
            C0933m.v(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f15563a;
            int i8 = this.f15565c;
            int i9 = i8 >> 3;
            long j8 = 255 << ((i8 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j8)) | j8;
        }
        C0933m.s(this.f15564b, null, 0, this.f15565c);
        l();
    }

    public final int j(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f15565c;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f15563a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = i10;
            int i16 = i10;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
                if (t.c(this.f15564b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int iK = k(i9);
                if (this.f15639e == 0 && ((this.f15563a[iK >> 3] >> ((iK & 7) << 3)) & 255) != 254) {
                    h();
                    iK = k(i9);
                }
                this.f15566d++;
                int i17 = this.f15639e;
                long[] jArr2 = this.f15563a;
                int i18 = iK >> 3;
                long j12 = jArr2[i18];
                int i19 = (iK & 7) << 3;
                this.f15639e = i17 - (((j12 >> i19) & 255) == 128 ? 1 : 0);
                jArr2[i18] = (j12 & (~(255 << i19))) | (j9 << i19);
                int i20 = this.f15565c;
                int i21 = ((iK - 7) & i20) + (i20 & 7);
                int i22 = i21 >> 3;
                int i23 = (i21 & 7) << 3;
                jArr2[i22] = ((~(255 << i23)) & jArr2[i22]) | (j9 << i23);
                return iK;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
        }
    }

    public final int k(int i8) {
        int i9 = this.f15565c;
        int i10 = i8 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f15563a;
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

    public final void l() {
        this.f15639e = z.a(b()) - this.f15566d;
    }

    public final void m(int i8) {
        long[] jArr;
        if (i8 == 0) {
            jArr = z.f15651a;
        } else {
            long[] jArr2 = new long[((i8 + 15) & (-8)) >> 3];
            C0933m.v(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f15563a = jArr;
        int i9 = i8 >> 3;
        long j8 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j8)) | j8;
        l();
    }

    public final void n(int i8) {
        int iMax = i8 > 0 ? Math.max(7, z.d(i8)) : 0;
        this.f15565c = iMax;
        m(iMax);
        this.f15564b = new Object[iMax];
    }

    public final void o(Object obj) {
        this.f15564b[j(obj)] = obj;
    }

    public final boolean p(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f15565c;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f15563a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (((long) i9) * 72340172838076673L) ^ j8;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (t.c(this.f15564b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i12 += 8;
            i11 = (i11 + i12) & i10;
        }
        boolean z8 = iNumberOfTrailingZeros >= 0;
        if (z8) {
            q(iNumberOfTrailingZeros);
        }
        return z8;
    }

    public final void q(int i8) {
        this.f15566d--;
        long[] jArr = this.f15563a;
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        int i11 = this.f15565c;
        int i12 = ((i8 - 7) & i11) + (i11 & 7);
        int i13 = i12 >> 3;
        int i14 = (i12 & 7) << 3;
        jArr[i13] = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        this.f15564b[i8] = null;
    }

    public final void r(int i8) {
        long[] jArr = this.f15563a;
        Object[] objArr = this.f15564b;
        int i9 = this.f15565c;
        n(i8);
        Object[] objArr2 = this.f15564b;
        for (int i10 = 0; i10 < i9; i10++) {
            if (((jArr[i10 >> 3] >> ((i10 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i10];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i11 = iHashCode ^ (iHashCode << 16);
                int iK = k(i11 >>> 7);
                long j8 = i11 & 127;
                long[] jArr2 = this.f15563a;
                int i12 = iK >> 3;
                int i13 = (iK & 7) << 3;
                jArr2[i12] = (jArr2[i12] & (~(255 << i13))) | (j8 << i13);
                int i14 = this.f15565c;
                int i15 = ((iK - 7) & i14) + (i14 & 7);
                int i16 = i15 >> 3;
                int i17 = (i15 & 7) << 3;
                jArr2[i16] = ((~(255 << i17)) & jArr2[i16]) | (j8 << i17);
                objArr2[iK] = obj;
            }
        }
    }

    public /* synthetic */ v(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public v(int i8) {
        super(null);
        if (i8 >= 0) {
            n(z.e(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
