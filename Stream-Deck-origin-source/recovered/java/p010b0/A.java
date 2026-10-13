package p010b0;

import Q6.k;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long[] f15563a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object[] f15564b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f15565c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f15566d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {
        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(Object obj) {
            return obj == A.this ? "(this)" : String.valueOf(obj);
        }
    }

    public /* synthetic */ A(AbstractC2633k abstractC2633k) {
        this();
    }

    public static /* synthetic */ String f(A a8, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i8, CharSequence charSequence4, k kVar, int i9, Object obj) {
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
        if ((i9 & 32) != 0) {
            kVar = null;
        }
        CharSequence charSequence5 = charSequence4;
        k kVar2 = kVar;
        return a8.e(charSequence, charSequence2, charSequence3, i8, charSequence5, kVar2);
    }

    public final boolean a(Object obj) {
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
        return iNumberOfTrailingZeros >= 0;
    }

    public final int b() {
        return this.f15565c;
    }

    public final int c() {
        return this.f15566d;
    }

    public final boolean d() {
        return this.f15566d == 0;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005c A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x005e A[LOOP:0: B:14:0x0025->B:26:0x005e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0061 A[SYNTHETIC] */
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof A)) {
            return false;
        }
        A a8 = (A) obj;
        if (a8.c() != c()) {
            return false;
        }
        Object[] objArr = this.f15564b;
        long[] jArr = this.f15563a;
        int length = jArr.length - 2;
        if (length >= 0) {
            int i8 = 0;
            while (true) {
                long j8 = jArr[i8];
                if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                    int i9 = 8 - ((~(i8 - length)) >>> 31);
                    for (int i10 = 0; i10 < i9; i10++) {
                        if ((255 & j8) < 128 && !a8.a(objArr[(i8 << 3) + i10])) {
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
        Object[] objArr = this.f15564b;
        long[] jArr = this.f15563a;
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
                        Object obj = objArr[(i8 << 3) + i10];
                        iHashCode += obj != null ? obj.hashCode() : 0;
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
        return f(this, null, "[", "]", 0, null, new a(), 25, null);
    }

    public A() {
        this.f15563a = z.f15651a;
        this.f15564b = p019c0.a.f16028c;
    }

    public final String e(CharSequence separator, CharSequence prefix, CharSequence postfix, int i8, CharSequence charSequence, k kVar) {
        t.g(separator, "separator");
        t.g(prefix, "prefix");
        t.g(postfix, "postfix");
        t.g(charSequence, ajyWhveMDgQ.DtRDuAI);
        StringBuilder sb = new StringBuilder();
        sb.append(prefix);
        Object[] objArr = this.f15564b;
        long[] jArr = this.f15563a;
        int length = jArr.length - 2;
        if (length < 0) {
            sb.append(postfix);
            break;
        }
        int i9 = 0;
        int i10 = 0;
        loop0: while (true) {
            long j8 = jArr[i9];
            if ((((~j8) << 7) & j8 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i11 = 8;
                int i12 = 8 - ((~(i9 - length)) >>> 31);
                int i13 = 0;
                while (i13 < i12) {
                    if ((j8 & 255) < 128) {
                        Object obj = objArr[(i9 << 3) + i13];
                        if (i10 == i8) {
                            sb.append(charSequence);
                            break loop0;
                        }
                        if (i10 != 0) {
                            sb.append(separator);
                        }
                        if (kVar == null) {
                            sb.append(obj);
                        } else {
                            sb.append((CharSequence) kVar.invoke(obj));
                        }
                        i10++;
                    }
                    j8 >>= i11;
                    i13++;
                    i11 = i11;
                }
                if (i12 == i11) {
                }
                sb.append(postfix);
                break;
            }
            if (i9 == length) {
                sb.append(postfix);
                break;
            }
            i9++;
        }
        String string = sb.toString();
        t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }
}
