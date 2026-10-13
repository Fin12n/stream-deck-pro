package p168t1;

import D6.r;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C implements Comparable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f33980b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C f33981c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C f33982d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C f33983e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C f33984f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C f33985g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C f33986h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C f33987i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C f33988j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final C f33989k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final C f33990l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final C f33991m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final C f33992n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C f33993o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final C f33994p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final C f33995q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final C f33996r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C f33997s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final C f33998t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final List f33999u;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34000a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final C a() {
            return C.f33996r;
        }

        public final C b() {
            return C.f33994p;
        }

        public final C c() {
            return C.f33993o;
        }

        public final C d() {
            return C.f33984f;
        }

        public final C e() {
            return C.f33985g;
        }

        public final C f() {
            return C.f33986h;
        }

        public a() {
        }
    }

    static {
        C c8 = new C(100);
        f33981c = c8;
        C c9 = new C(RCHTTPStatusCodes.SUCCESS);
        f33982d = c9;
        C c10 = new C(RCHTTPStatusCodes.UNSUCCESSFUL);
        f33983e = c10;
        C c11 = new C(RCHTTPStatusCodes.BAD_REQUEST);
        f33984f = c11;
        C c12 = new C(500);
        f33985g = c12;
        C c13 = new C(600);
        f33986h = c13;
        C c14 = new C(700);
        f33987i = c14;
        C c15 = new C(800);
        f33988j = c15;
        C c16 = new C(900);
        f33989k = c16;
        f33990l = c8;
        f33991m = c9;
        f33992n = c10;
        f33993o = c11;
        f33994p = c12;
        f33995q = c13;
        f33996r = c14;
        f33997s = c15;
        f33998t = c16;
        f33999u = r.q(c8, c9, c10, c11, c12, c13, c14, c15, c16);
    }

    public C(int i8) {
        this.f34000a = i8;
        if (1 > i8 || i8 >= 1001) {
            throw new IllegalArgumentException(("Font weight can be in range [1, 1000]. Current value: " + i8).toString());
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C) && this.f34000a == ((C) obj).f34000a;
    }

    public int hashCode() {
        return this.f34000a;
    }

    @Override // java.lang.Comparable
    /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
    public int compareTo(C c8) {
        return t.h(this.f34000a, c8.f34000a);
    }

    public final int s() {
        return this.f34000a;
    }

    public String toString() {
        return "FontWeight(weight=" + this.f34000a + ')';
    }
}
