package q7;

import D6.C0934n;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f32007e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final long[] f32008f = new long[0];

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o7.f f32009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Q6.o f32010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f32011c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long[] f32012d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public D(o7.f descriptor, Q6.o readIfAbsent) {
        kotlin.jvm.internal.t.g(descriptor, "descriptor");
        kotlin.jvm.internal.t.g(readIfAbsent, "readIfAbsent");
        this.f32009a = descriptor;
        this.f32010b = readIfAbsent;
        int iF = descriptor.f();
        if (iF <= 64) {
            this.f32011c = iF != 64 ? (-1) << iF : 0L;
            this.f32012d = f32008f;
        } else {
            this.f32011c = 0L;
            this.f32012d = e(iF);
        }
    }

    public final void a(int i8) {
        if (i8 < 64) {
            this.f32011c |= 1 << i8;
        } else {
            b(i8);
        }
    }

    public final void b(int i8) {
        int i9 = (i8 >>> 6) - 1;
        long[] jArr = this.f32012d;
        jArr[i9] = jArr[i9] | (1 << (i8 & 63));
    }

    public final int c() {
        int length = this.f32012d.length;
        int i8 = 0;
        while (i8 < length) {
            int i9 = i8 + 1;
            int i10 = i9 * 64;
            long j8 = this.f32012d[i8];
            while (j8 != -1) {
                int iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
                j8 |= 1 << iNumberOfTrailingZeros;
                int i11 = iNumberOfTrailingZeros + i10;
                if (((Boolean) this.f32010b.invoke(this.f32009a, Integer.valueOf(i11))).booleanValue()) {
                    this.f32012d[i8] = j8;
                    return i11;
                }
            }
            this.f32012d[i8] = j8;
            i8 = i9;
        }
        return -1;
    }

    public final int d() {
        int iNumberOfTrailingZeros;
        int iF = this.f32009a.f();
        do {
            long j8 = this.f32011c;
            if (j8 == -1) {
                if (iF > 64) {
                    return c();
                }
                return -1;
            }
            iNumberOfTrailingZeros = Long.numberOfTrailingZeros(~j8);
            this.f32011c |= 1 << iNumberOfTrailingZeros;
        } while (!((Boolean) this.f32010b.invoke(this.f32009a, Integer.valueOf(iNumberOfTrailingZeros))).booleanValue());
        return iNumberOfTrailingZeros;
    }

    public final long[] e(int i8) {
        long[] jArr = new long[(i8 - 1) >>> 6];
        if ((i8 & 63) != 0) {
            jArr[C0934n.S(jArr)] = (-1) << i8;
        }
        return jArr;
    }
}
