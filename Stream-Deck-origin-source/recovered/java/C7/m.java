package C7;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f1662c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f1663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int[] f1664b = new int[10];

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public final int a(int i8) {
        return this.f1664b[i8];
    }

    public final int b() {
        if ((this.f1663a & 2) != 0) {
            return this.f1664b[1];
        }
        return -1;
    }

    public final int c() {
        if ((this.f1663a & 128) != 0) {
            return this.f1664b[7];
        }
        return 65535;
    }

    public final int d() {
        if ((this.f1663a & 16) != 0) {
            return this.f1664b[4];
        }
        return Integer.MAX_VALUE;
    }

    public final int e(int i8) {
        return (this.f1663a & 32) != 0 ? this.f1664b[5] : i8;
    }

    public final boolean f(int i8) {
        return ((1 << i8) & this.f1663a) != 0;
    }

    public final void g(m other) {
        t.g(other, "other");
        for (int i8 = 0; i8 < 10; i8++) {
            if (other.f(i8)) {
                h(i8, other.a(i8));
            }
        }
    }

    public final m h(int i8, int i9) {
        if (i8 >= 0) {
            int[] iArr = this.f1664b;
            if (i8 < iArr.length) {
                this.f1663a = (1 << i8) | this.f1663a;
                iArr[i8] = i9;
            }
        }
        return this;
    }

    public final int i() {
        return Integer.bitCount(this.f1663a);
    }
}
