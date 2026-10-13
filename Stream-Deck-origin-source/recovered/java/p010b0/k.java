package p010b0;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15613a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f15614b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15615c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15616d;

    public /* synthetic */ k(AbstractC2633k abstractC2633k) {
        this();
    }

    public static /* synthetic */ String d(k kVar, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
        }
        if ((i9 & 1) != 0) {
            charSequence = ", ";
        }
        if ((i9 & 2) != 0) {
            charSequence2 = "";
        }
        if ((i9 & 4) != 0) {
            charSequence3 = "";
        }
        if ((i9 & 8) != 0) {
            i8 = -1;
        }
        if ((i9 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence5 = charSequence4;
        CharSequence charSequence6 = charSequence3;
        return kVar.c(charSequence, charSequence2, charSequence6, i8, charSequence5);
    }

    public final boolean a(long j8) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int b() {
        return this.f15615c;
    }

    public final String c(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence truncated) {
        int i9;
        t.g(separator, "separator");
        t.g(prefix, "prefix");
        t.g(postfix, "postfix");
        t.g(truncated, "truncated");
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        long[] jArr = this.f15614b;
        long[] jArr2 = this.f15613a;
        int length = jArr2.length - 2;
        if (length < 0) {
            sb.append(postfix);
            break;
        }
        int i10 = 0;
        int i11 = 0;
        loop0: while (true) {
            long j8 = jArr2[i10];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i12 = 8;
                int i13 = 8 - ((~(i10 - length)) >>> 31);
                int i14 = 0;
                while (i14 < i13) {
                    if ((j8 & 255) < 128) {
                        long j9 = jArr[(i10 << 3) + i14];
                        if (i11 == i8) {
                            sb.append(truncated);
                            break loop0;
                        }
                        if (i11 != 0) {
                            sb.append(separator);
                        }
                        sb.append(j9);
                        i11++;
                    }
                    j8 >>= i12;
                    i14++;
                    i12 = i12;
                    i10 = i10;
                }
                int i15 = i10;
                if (i13 == i12) {
                    i9 = i15;
                }
                sb.append(postfix);
                break;
            }
            i9 = i10;
            if (i9 == length) {
                sb.append(postfix);
                break;
            }
            i10 = i9 + 1;
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0058 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005a A[LOOP:0: B:14:0x0021->B:26:0x005a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x005d A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        if (kVar.f15616d != this.f15616d) {
            return false;
        }
        long[] jArr = this.f15614b;
        long[] jArr2 = this.f15613a;
        int length = jArr2.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr2[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128 && !kVar.a(jArr[(i8 << 3) + i10])) {
                            return false;
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

    public int hashCode() {
        long[] jArr = this.f15614b;
        long[] jArr2 = this.f15613a;
        int length = jArr2.length - 2;
        if (length < 0) {
            return 0;
        }
        int i8 = 0;
        int iHashCode = 0;
        while (true) {
            long j8 = jArr2[i8];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8 - ((~(i8 - length)) >>> 31);
                for (int i10 = 0; i10 < i9; i10++) {
                    if ((255 & j8) < 128) {
                        iHashCode += Long.hashCode(jArr[(i8 << 3) + i10]);
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

    public String toString() {
        return d(this, null, "[", "]", 0, null, 25, null);
    }

    public k() {
        this.f15613a = z.f15651a;
        this.f15614b = l.a();
    }
}
