package p010b0;

import C6.A;
import D6.C0933m;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t extends w {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15637f;

    public t() {
        this(0, 1, null);
    }

    public final void h() {
        if (this.f15643d <= 8 || Long.compareUnsigned(A.b(A.b(this.f15644e) * 32), A.b(A.b(this.f15643d) * 25)) > 0) {
            p(z.c(this.f15643d));
        } else {
            p(z.c(this.f15643d));
        }
    }

    public final int i(int i8) {
        int i9 = this.f15643d;
        int i10 = i8 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f15640a;
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

    public final int j(Object obj) {
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 >>> 7;
        int i10 = i8 & 127;
        int i11 = this.f15643d;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f15640a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = i10;
            int i16 = i10;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
                if (kotlin.jvm.internal.t.c(this.f15641b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int i17 = i(i9);
                if (this.f15637f == 0 && ((this.f15640a[i17 >> 3] >> ((i17 & 7) << 3)) & 255) != 254) {
                    h();
                    i17 = i(i9);
                }
                this.f15644e++;
                int i18 = this.f15637f;
                long[] jArr2 = this.f15640a;
                int i19 = i17 >> 3;
                long j12 = jArr2[i19];
                int i20 = (i17 & 7) << 3;
                this.f15637f = i18 - (((j12 >> i20) & 255) == 128 ? 1 : 0);
                jArr2[i19] = (j12 & (~(255 << i20))) | (j9 << i20);
                int i21 = this.f15643d;
                int i22 = ((i17 - 7) & i21) + (i21 & 7);
                int i23 = i22 >> 3;
                int i24 = (i22 & 7) << 3;
                jArr2[i23] = ((~(255 << i24)) & jArr2[i23]) | (j9 << i24);
                return ~i17;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
            i10 = i16;
        }
    }

    public final void k() {
        this.f15637f = z.a(c()) - this.f15644e;
    }

    public final void l(int i8) {
        long[] jArr;
        if (i8 == 0) {
            jArr = z.f15651a;
        } else {
            long[] jArr2 = new long[((i8 + 15) & (-8)) >> 3];
            C0933m.v(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f15640a = jArr;
        int i9 = i8 >> 3;
        long j8 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j8)) | j8;
        k();
    }

    public final void m(int i8) {
        int iMax = i8 > 0 ? Math.max(7, z.d(i8)) : 0;
        this.f15643d = iMax;
        l(iMax);
        this.f15641b = new Object[iMax];
        this.f15642c = new int[iMax];
    }

    public final int n(Object obj, int i8, int i9) {
        int iJ = j(obj);
        if (iJ < 0) {
            iJ = ~iJ;
        } else {
            i9 = this.f15642c[iJ];
        }
        this.f15641b[iJ] = obj;
        this.f15642c[iJ] = i8;
        return i9;
    }

    public final void o(int i8) {
        this.f15644e--;
        long[] jArr = this.f15640a;
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        int i11 = this.f15643d;
        int i12 = ((i8 - 7) & i11) + (i11 & 7);
        int i13 = i12 >> 3;
        int i14 = (i12 & 7) << 3;
        jArr[i13] = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        this.f15641b[i8] = null;
    }

    public final void p(int i8) {
        int i9;
        long[] jArr = this.f15640a;
        Object[] objArr = this.f15641b;
        int[] iArr = this.f15642c;
        int i10 = this.f15643d;
        m(i8);
        Object[] objArr2 = this.f15641b;
        int[] iArr2 = this.f15642c;
        int i11 = 0;
        while (i11 < i10) {
            if (((jArr[i11 >> 3] >> ((i11 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i11];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i12 = iHashCode ^ (iHashCode << 16);
                int i13 = i(i12 >>> 7);
                long j8 = i12 & 127;
                long[] jArr2 = this.f15640a;
                int i14 = i13 >> 3;
                int i15 = (i13 & 7) << 3;
                i9 = i11;
                jArr2[i14] = (jArr2[i14] & (~(255 << i15))) | (j8 << i15);
                int i16 = this.f15643d;
                int i17 = ((i13 - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = (jArr2[i18] & (~(255 << i19))) | (j8 << i19);
                objArr2[i13] = obj;
                iArr2[i13] = iArr[i9];
            } else {
                i9 = i11;
            }
            i11 = i9 + 1;
        }
    }

    public final void q(Object obj, int i8) {
        int iJ = j(obj);
        if (iJ < 0) {
            iJ = ~iJ;
        }
        this.f15641b[iJ] = obj;
        this.f15642c[iJ] = i8;
    }

    public /* synthetic */ t(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public t(int i8) {
        super(null);
        if (i8 >= 0) {
            m(z.e(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
