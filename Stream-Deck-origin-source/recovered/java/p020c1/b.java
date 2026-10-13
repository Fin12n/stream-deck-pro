package p020c1;

import java.util.Arrays;
import kotlin.jvm.internal.t;
import p011b1.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f16032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long[] f16033b = new long[2];

    public final boolean a(long j8) {
        if (d(j8)) {
            return false;
        }
        k(this.f16032a, j8);
        return true;
    }

    public final boolean b(long j8) {
        return a(j8);
    }

    public final void c() {
        this.f16032a = 0;
    }

    public final boolean d(long j8) {
        int i8 = this.f16032a;
        for (int i9 = 0; i9 < i8; i9++) {
            if (this.f16033b[i9] == j8) {
                return true;
            }
        }
        return false;
    }

    public final long e(int i8) {
        return y.b(this.f16033b[i8]);
    }

    public final int f() {
        return this.f16032a;
    }

    public final boolean g() {
        return this.f16032a == 0;
    }

    public final boolean h(long j8) {
        int i8 = this.f16032a;
        for (int i9 = 0; i9 < i8; i9++) {
            if (j8 == e(i9)) {
                j(i9);
                return true;
            }
        }
        return false;
    }

    public final boolean i(long j8) {
        return h(j8);
    }

    public final boolean j(int i8) {
        int i9 = this.f16032a;
        if (i8 >= i9) {
            return false;
        }
        int i10 = i9 - 1;
        while (i8 < i10) {
            long[] jArr = this.f16033b;
            int i11 = i8 + 1;
            jArr[i8] = jArr[i11];
            i8 = i11;
        }
        this.f16032a--;
        return true;
    }

    public final void k(int i8, long j8) {
        long[] jArr = this.f16033b;
        if (i8 >= jArr.length) {
            long[] jArrCopyOf = Arrays.copyOf(jArr, Math.max(i8 + 1, jArr.length * 2));
            t.f(jArrCopyOf, "copyOf(this, newSize)");
            this.f16033b = jArrCopyOf;
        }
        this.f16033b[i8] = j8;
        if (i8 >= this.f16032a) {
            this.f16032a = i8 + 1;
        }
    }
}
