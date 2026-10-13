package X5;

import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: X5.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1693w {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f11972d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1693w f11973e = new C1693w("HTTP", 2, 0);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1693w f11974f = new C1693w("HTTP", 1, 1);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1693w f11975g = new C1693w("HTTP", 1, 0);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1693w f11976h = new C1693w("SPDY", 3, 0);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1693w f11977i = new C1693w("QUIC", 1, 0);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11978a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11979b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11980c;

    /* JADX INFO: renamed from: X5.w$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final C1693w a(String name, int i8, int i9) {
            kotlin.jvm.internal.t.g(name, "name");
            if (kotlin.jvm.internal.t.c(name, "HTTP") && i8 == 1 && i9 == 0) {
                return b();
            }
            if (kotlin.jvm.internal.t.c(name, "HTTP") && i8 == 1 && i9 == 1) {
                return c();
            }
            return (kotlin.jvm.internal.t.c(name, "HTTP") && i8 == 2 && i9 == 0) ? d() : new C1693w(name, i8, i9);
        }

        public final C1693w b() {
            return C1693w.f11975g;
        }

        public final C1693w c() {
            return C1693w.f11974f;
        }

        public final C1693w d() {
            return C1693w.f11973e;
        }

        public final C1693w e() {
            return C1693w.f11977i;
        }

        public final C1693w f() {
            return C1693w.f11976h;
        }

        public final C1693w g(CharSequence value) {
            kotlin.jvm.internal.t.g(value, "value");
            List listA0 = Z6.w.A0(value, new String[]{"/", "."}, false, 0, 6, null);
            if (listA0.size() == 3) {
                return a((String) listA0.get(0), Integer.parseInt((String) listA0.get(1)), Integer.parseInt((String) listA0.get(2)));
            }
            throw new IllegalStateException(("Failed to parse HttpProtocolVersion. Expected format: protocol/major.minor, but actual: " + ((Object) value)).toString());
        }

        public a() {
        }
    }

    public C1693w(String name, int i8, int i9) {
        kotlin.jvm.internal.t.g(name, "name");
        this.f11978a = name;
        this.f11979b = i8;
        this.f11980c = i9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1693w)) {
            return false;
        }
        C1693w c1693w = (C1693w) obj;
        return kotlin.jvm.internal.t.c(this.f11978a, c1693w.f11978a) && this.f11979b == c1693w.f11979b && this.f11980c == c1693w.f11980c;
    }

    public int hashCode() {
        return (((this.f11978a.hashCode() * 31) + Integer.hashCode(this.f11979b)) * 31) + Integer.hashCode(this.f11980c);
    }

    public String toString() {
        return this.f11978a + '/' + this.f11979b + com.amazon.a.a.o.c.a.b.f16789a + this.f11980c;
    }
}
