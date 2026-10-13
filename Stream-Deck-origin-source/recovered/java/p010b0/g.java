package p010b0;

import com.amazon.a.a.o.b.f;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p019c0.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15601a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int[] f15602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f15603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15605e;

    public /* synthetic */ g(AbstractC2633k abstractC2633k) {
        this();
    }

    public final boolean a(int i8) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i8) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f15604d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f15601a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j8;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f15602b[iNumberOfTrailingZeros] == i8) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        return iNumberOfTrailingZeros >= 0;
    }

    public final Object b(int i8) {
        int iNumberOfTrailingZeros;
        int iHashCode = Integer.hashCode(i8) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f15604d;
        int i12 = (i9 >>> 7) & i11;
        int i13 = 0;
        loop0: while (true) {
            long[] jArr = this.f15601a;
            int i14 = i12 >> 3;
            int i15 = (i12 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j8;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i12) & i11;
                if (this.f15602b[iNumberOfTrailingZeros] == i8) {
                    break loop0;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                iNumberOfTrailingZeros = -1;
                break;
            }
            i13 += 8;
            i12 = (i12 + i13) & i11;
        }
        if (iNumberOfTrailingZeros >= 0) {
            return this.f15603c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final int c() {
        return this.f15604d;
    }

    public final int d() {
        return this.f15605e;
    }

    public final boolean e() {
        return this.f15605e == 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        if (gVar.d() != d()) {
            return false;
        }
        int[] iArr = this.f15602b;
        Object[] objArr = this.f15603c;
        long[] jArr = this.f15601a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) == -9187201950435737472L) {
                    if (i8 != length) {
                        break;
                        break;
                    }
                    i8++;
                } else {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128) {
                            int i11 = (i8 << 3) + i10;
                            int i12 = iArr[i11];
                            Object obj2 = objArr[i11];
                            if (obj2 == null) {
                                if (gVar.b(i12) != null || !gVar.a(i12)) {
                                    return false;
                                }
                            } else if (!t.c(obj2, gVar.b(i12))) {
                                return false;
                            }
                        }
                        j8 >>= 8;
                    }
                    if (i9 != 8) {
                        break;
                    }
                    if (i8 != length) {
                        break;
                    }
                    i8++;
                }
            }
        }
        return true;
    }

    public int hashCode() {
        int[] iArr = this.f15602b;
        Object[] objArr = this.f15603c;
        long[] jArr = this.f15601a;
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
                        Object obj = objArr[i11];
                        iHashCode += (obj != null ? obj.hashCode() : 0) ^ Integer.hashCode(i12);
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

    /* JADX WARN: Code duplicated, block: B:23:0x0074 A[DONT_INVERT, PHI: r8
      0x0074: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:22:0x0072] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076 A[LOOP:0: B:9:0x0023->B:24:0x0076, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0079 A[EDGE_INSN: B:28:0x0079->B:25:0x0079 BREAK  A[LOOP:0: B:9:0x0023->B:24:0x0076], SYNTHETIC] */
    public String toString() {
        if (e()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        int[] iArr = this.f15602b;
        Object[] objArr = this.f15603c;
        long[] jArr = this.f15601a;
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
                            Object obj = objArr[i12];
                            sb.append(i13);
                            sb.append(f.f16778b);
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            i9++;
                            if (i9 < this.f15605e) {
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

    public g() {
        this.f15601a = z.f15651a;
        this.f15602b = j.a();
        this.f15603c = a.f16028c;
    }
}
