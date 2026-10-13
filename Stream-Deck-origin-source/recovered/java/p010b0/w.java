package p010b0;

import com.amazon.a.a.o.b.f;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p019c0.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15640a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15641b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int[] f15642c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15643d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15644e;

    public /* synthetic */ w(AbstractC2633k abstractC2633k) {
        this();
    }

    public final int a(Object obj) {
        int i8 = 0;
        int iHashCode = (obj != null ? obj.hashCode() : 0) * (-862048943);
        int i9 = iHashCode ^ (iHashCode << 16);
        int i10 = i9 & 127;
        int i11 = this.f15643d;
        int i12 = i9 >>> 7;
        while (true) {
            int i13 = i12 & i11;
            long[] jArr = this.f15640a;
            int i14 = i13 >> 3;
            int i15 = (i13 & 7) << 3;
            long j8 = ((jArr[i14 + 1] << (64 - i15)) & ((-i15) >> 63)) | (jArr[i14] >>> i15);
            long j9 = (((long) i10) * 72340172838076673L) ^ j8;
            for (long j10 = (~j9) & (j9 - 72340172838076673L) & (-9187201950435737472L); j10 != 0; j10 &= j10 - 1) {
                int iNumberOfTrailingZeros = ((Long.numberOfTrailingZeros(j10) >> 3) + i13) & i11;
                if (t.c(this.f15641b[iNumberOfTrailingZeros], obj)) {
                    return iNumberOfTrailingZeros;
                }
            }
            if ((j8 & ((~j8) << 6) & (-9187201950435737472L)) != 0) {
                return -1;
            }
            i8 += 8;
            i12 = i13 + i8;
        }
    }

    public final int b(Object obj) {
        int iA = a(obj);
        if (iA >= 0) {
            return this.f15642c[iA];
        }
        throw new NoSuchElementException("There is no key " + obj + " in the map");
    }

    public final int c() {
        return this.f15643d;
    }

    public final int d(Object obj, int i8) {
        int iA = a(obj);
        return iA >= 0 ? this.f15642c[iA] : i8;
    }

    public final int e() {
        return this.f15644e;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x0062 A[LOOP:0: B:14:0x0027->B:26:0x0062, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0065 A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof w)) {
            return false;
        }
        w wVar = (w) obj;
        if (wVar.e() != e()) {
            return false;
        }
        Object[] objArr = this.f15641b;
        int[] iArr = this.f15642c;
        long[] jArr = this.f15640a;
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
                            if (iArr[i11] != wVar.b(objArr[i11])) {
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
        return this.f15644e == 0;
    }

    public final boolean g() {
        return this.f15644e != 0;
    }

    public int hashCode() {
        Object[] objArr = this.f15641b;
        int[] iArr = this.f15642c;
        long[] jArr = this.f15640a;
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
                        iHashCode += Integer.hashCode(iArr[i11]) ^ (obj != null ? obj.hashCode() : 0);
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
        if (f()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder();
        sb.append('{');
        Object[] objArr = this.f15641b;
        int[] iArr = this.f15642c;
        long[] jArr = this.f15640a;
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
                            int i13 = iArr[i12];
                            if (obj == this) {
                                obj = "(this)";
                            }
                            sb.append(obj);
                            sb.append(f.f16778b);
                            sb.append(i13);
                            i9++;
                            if (i9 < this.f15644e) {
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

    public w() {
        this.f15640a = z.f15651a;
        this.f15641b = a.f16028c;
        this.f15642c = j.a();
    }
}
