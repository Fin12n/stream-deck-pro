package p010b0;

import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15596a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f15597b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f15598c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15599d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15600e;

    public /* synthetic */ f(AbstractC2633k abstractC2633k) {
        this();
    }

    public final boolean a(int i8) {
        return b(i8) >= 0;
    }

    public final int b(int i8) {
        int iHashCode = Integer.hashCode(i8) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f15599d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        while (true) {
            long[] jArr = this.f15596a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j8;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f15597b[iNumberOfTrailingZeros] == i8) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
    }

    public final int d() {
        return this.f15599d;
    }

    public final int e() {
        return this.f15600e;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[LOOP:0: B:14:0x0027->B:26:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        if (fVar.e() != e()) {
            return false;
        }
        int[] iArr = this.f15597b;
        int[] iArr2 = this.f15598c;
        long[] jArr = this.f15596a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            if (iArr2[i11] != fVar.c(iArr[i11])) {
                                return false;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 == 8) {
                        if (i8 != length) {
                            i8++;
                        }
                    }
                } else if (i8 != length) {
                    i8++;
                }
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f15600e == 0;
    }

    public int hashCode() {
        int[] iArr = this.f15597b;
        int[] iArr2 = this.f15598c;
        long[] jArr = this.f15596a;
        int length = jArr.length - 2;
        if (length < 0) {
            return 0;
        }
        int i8 = 0;
        int iHashCode = 0;
        while (true) {
            long j8 = jArr[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        int i11 = (i8 << 3) + i10;
                        int i12 = iArr[i11];
                        iHashCode += Integer.hashCode(iArr2[i11]) ^ Integer.hashCode(i12);
                    }
                    j8 >>= 8;
                }
                if (i9 != 8) {
                    return iHashCode;
                }
            }
            if (i8 == length) {
                return iHashCode;
            }
            i8++;
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0070 A[DONT_INVERT, PHI: r8
      0x0070: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:19:0x006e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:21:0x0072 A[LOOP:0: B:9:0x0023->B:21:0x0072, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:25:0x0075 A[EDGE_INSN: B:25:0x0075->B:22:0x0075 BREAK  A[LOOP:0: B:9:0x0023->B:21:0x0072], SYNTHETIC] */
    public String toString() {
        if (f()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int[] iArr = this.f15597b;
        int[] iArr2 = this.f15598c;
        long[] jArr = this.f15596a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            int i9 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i8 != length) {
                        break;
                        break;
                    }
                    i8++;
                } else {
                    int i10 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i11 = 0; i11 < i10; i11++) {
                        if ((255 & j8) < 128) {
                            int i12 = (i8 << 3) + i11;
                            int i13 = iArr[i12];
                            int i14 = iArr2[i12];
                            sb.append(i13);
                            sb.append(com.amazon.a.a.o.b.f.f16778b);
                            sb.append(i14);
                            i9++;
                            if (i9 < this.f15600e) {
                                sb.append(',');
                                sb.append(' ');
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i10 != 8) {
                        break;
                    }
                    if (i8 != length) {
                        break;
                    }
                    i8++;
                }
            }
        }
        sb.append('}');
        String string = sb.toString();
        t.f(string, "s.append('}').toString()");
        return string;
    }

    public f() {
        this.f15596a = z.f15651a;
        this.f15597b = j.a();
        this.f15598c = j.a();
    }

    public final int c(int i8) {
        int iB = b(i8);
        if (iB >= 0) {
            return this.f15598c[iB];
        }
        throw new NoSuchElementException(GOKsbdzhLhXAMt.uOvAOVFkaxpeLu + i8);
    }
}
