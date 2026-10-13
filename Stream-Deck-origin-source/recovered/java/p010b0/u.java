package p010b0;

import C6.A;
import D6.C0933m;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class u extends y {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15638f;

    public u() {
        this(0, 1, null);
    }

    public final void g() {
        if (this.f15649d <= 8 || Long.compareUnsigned(A.b(A.b(this.f15650e) * 32), A.b(A.b(this.f15649d) * 25)) > 0) {
            p(z.c(this.f15649d));
        } else {
            p(z.c(this.f15649d));
        }
    }

    public final void h() {
        this.f15650e = 0;
        long[] jArr = this.f15646a;
        if (jArr != z.f15651a) {
            C0933m.v(jArr, -9187201950435737472L, 0, 0, 6, null);
            long[] jArr2 = this.f15646a;
            int i8 = this.f15649d;
            int i9 = i8 >> 3;
            long j8 = 255 << ((i8 & 7) << 3);
            jArr2[i9] = (jArr2[i9] & (~j8)) | j8;
        }
        C0933m.s(this.f15648c, null, 0, this.f15649d);
        C0933m.s(this.f15647b, null, 0, this.f15649d);
        k();
    }

    public final int i(int i8) {
        int i9 = this.f15649d;
        int i10 = i8 & i9;
        int i11 = 0;
        while (true) {
            long[] jArr = this.f15646a;
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
        int i11 = this.f15649d;
        int i12 = i9 & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f15646a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = i10;
            int i16 = i10;
            long j10 = j8 ^ (j9 * 72340172838076673L);
            for (long j11 = (~j10) & (j10 - 72340172838076673L) & (-9187201950435737472L); j11 != 0; j11 &= j11 - 1) {
                int iNumberOfTrailingZeros = (i12 + (Long.numberOfTrailingZeros(j11) >> 3)) & i11;
                if (t.c(this.f15647b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((((~j8) << 6) & j8 & (-9187201950435737472L)) != 0) {
                int i17 = i(i9);
                if (this.f15638f == 0 && ((this.f15646a[i17 >> 3] >> ((i17 & 7) << 3)) & 255) != 254) {
                    g();
                    i17 = i(i9);
                }
                this.f15650e++;
                int i18 = this.f15638f;
                long[] jArr2 = this.f15646a;
                int i19 = i17 >> 3;
                long j12 = jArr2[i19];
                int i20 = (i17 & 7) << 3;
                this.f15638f = i18 - (((j12 >> i20) & 255) == 128 ? 1 : 0);
                jArr2[i19] = (j12 & (~(255 << i20))) | (j9 << i20);
                int i21 = this.f15649d;
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
        this.f15638f = z.a(c()) - this.f15650e;
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
        this.f15646a = jArr;
        int i9 = i8 >> 3;
        long j8 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j8)) | j8;
        k();
    }

    public final void m(int i8) {
        int iMax = i8 > 0 ? Math.max(7, z.d(i8)) : 0;
        this.f15649d = iMax;
        l(iMax);
        this.f15647b = new Object[iMax];
        this.f15648c = new Object[iMax];
    }

    public final Object n(Object obj) {
        int iNumberOfTrailingZeros;
        int i8 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f15649d;
        int i12 = i9 >>> 7;
        loop0: while (true) {
            int i13 = i12 & i11;
            long[] jArr = this.f15646a;
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j8;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i13) & i11;
                if (t.c(this.f15647b[iNumberOfTrailingZeros], obj)) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i8 += 8;
            i12 = i13 + i8;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return o(iNumberOfTrailingZeros);
        }
        return null;
    }

    public final Object o(int i8) {
        this.f15650e--;
        long[] jArr = this.f15646a;
        int i9 = i8 >> 3;
        int i10 = (i8 & 7) << 3;
        jArr[i9] = (jArr[i9] & (~(255 << i10))) | (254 << i10);
        int i11 = this.f15649d;
        int i12 = ((i8 - 7) & i11) + (i11 & 7);
        int i13 = i12 >> 3;
        int i14 = (i12 & 7) << 3;
        jArr[i13] = (jArr[i13] & (~(255 << i14))) | (254 << i14);
        this.f15647b[i8] = null;
        Object[] objArr = this.f15648c;
        Object obj = objArr[i8];
        objArr[i8] = null;
        return obj;
    }

    public final void p(int i8) {
        int i9;
        long[] jArr = this.f15646a;
        Object[] objArr = this.f15647b;
        Object[] objArr2 = this.f15648c;
        int i10 = this.f15649d;
        m(i8);
        Object[] objArr3 = this.f15647b;
        Object[] objArr4 = this.f15648c;
        int i11 = 0;
        while (i11 < i10) {
            if (((jArr[i11 >> 3] >> ((i11 & 7) << 3)) & 255) < 128) {
                Object obj = objArr[i11];
                int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
                int i12 = iHashCode ^ (iHashCode << 16);
                int i13 = i(i12 >>> 7);
                long j8 = i12 & 127;
                long[] jArr2 = this.f15646a;
                int i14 = i13 >> 3;
                int i15 = (i13 & 7) << 3;
                i9 = i11;
                jArr2[i14] = (jArr2[i14] & (~(255 << i15))) | (j8 << i15);
                int i16 = this.f15649d;
                int i17 = ((i13 - 7) & i16) + (i16 & 7);
                int i18 = i17 >> 3;
                int i19 = (i17 & 7) << 3;
                jArr2[i18] = (jArr2[i18] & (~(255 << i19))) | (j8 << i19);
                objArr3[i13] = obj;
                objArr4[i13] = objArr2[i9];
            } else {
                i9 = i11;
            }
            i11 = i9 + 1;
        }
    }

    public final void q(Object obj, Object obj2) {
        int iJ = j(obj);
        if (iJ < 0) {
            iJ = ~iJ;
        }
        this.f15647b[iJ] = obj;
        this.f15648c[iJ] = obj2;
    }

    public /* synthetic */ u(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public u(int i8) {
        super(null);
        if (i8 >= 0) {
            m(z.e(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
