package p010b0;

import com.amazon.a.a.o.b.f;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p019c0.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15646a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15647b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Object[] f15648c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15649d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15650e;

    public /* synthetic */ y(AbstractC2633k abstractC2633k) {
        this();
    }

    public final boolean a(Object obj) {
        int iNumberOfTrailingZeros;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i8 = iHashCode ^ (iHashCode << 16);
        int i9 = i8 & 127;
        int i10 = this.f15649d;
        int i11 = (i8 >>> 7) & i10;
        int i12 = 0;
        loop0: while (true) {
            long[] jArr = this.f15646a;
            int i13 = i11 >> 3;
            int i14 = (i11 & 7) << 3;
            long j8 = ((jArr[i13 + 1] << (64 - i14)) & ((-i14) >> 63)) | (jArr[i13] >>> i14);
            long j9 = (((long) i9) * 72340172838076673L) ^ j8;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i11) & i10;
                if (t.c(this.f15647b[iNumberOfTrailingZeros], obj)) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final Object b(Object obj) {
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
            return this.f15648c[iNumberOfTrailingZeros];
        }
        return null;
    }

    public final int c() {
        return this.f15649d;
    }

    public final int d() {
        return this.f15650e;
    }

    public final boolean e() {
        return this.f15650e == 0;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0073 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:33:0x0075 A[LOOP:0: B:14:0x0027->B:33:0x0075, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:35:0x0078 A[EDGE_INSN: B:35:0x0078->B:34:0x0078 BREAK  A[LOOP:0: B:14:0x0027->B:33:0x0075], SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof y)) {
            return false;
        }
        y yVar = (y) obj;
        if (yVar.d() != d()) {
            return false;
        }
        Object[] objArr = this.f15647b;
        Object[] objArr2 = this.f15648c;
        long[] jArr = this.f15646a;
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
                            Object obj2 = objArr[i11];
                            Object obj3 = objArr2[i11];
                            if (obj3 == null) {
                                if (yVar.b(obj2) != null || !yVar.a(obj2)) {
                                    return false;
                                }
                            } else if (!t.c(obj3, yVar.b(obj2))) {
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

    public final boolean f() {
        return this.f15650e != 0;
    }

    public int hashCode() {
        Object[] objArr = this.f15647b;
        Object[] objArr2 = this.f15648c;
        long[] jArr = this.f15646a;
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
                        Object obj = objArr[i11];
                        Object obj2 = objArr2[i11];
                        iHashCode += (obj2 != null ? obj2.hashCode() : 0) ^ (obj != null ? obj.hashCode() : 0);
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

    /* JADX WARN: Code duplicated, block: B:26:0x007a A[DONT_INVERT, PHI: r8
      0x007a: PHI (r8v2 int) = (r8v1 int), (r8v3 int) binds: [B:10:0x0031, B:25:0x0078] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x007c A[LOOP:0: B:9:0x0023->B:27:0x007c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:31:0x007f A[EDGE_INSN: B:31:0x007f->B:28:0x007f BREAK  A[LOOP:0: B:9:0x0023->B:27:0x007c], SYNTHETIC] */
    public String toString() {
        if (e()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Object[] objArr = this.f15647b;
        Object[] objArr2 = this.f15648c;
        long[] jArr = this.f15646a;
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
                            Object obj = objArr[i12];
                            Object obj2 = objArr2[i12];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append(f.f16778b);
                            if (obj2 == this) {
                                obj2 = "(this)";
                            }
                            sb.append(obj2);
                            i9++;
                            if (i9 < this.f15650e) {
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

    public y() {
        this.f15646a = z.f15651a;
        Object[] objArr = a.f16028c;
        this.f15647b = objArr;
        this.f15648c = objArr;
    }
}
