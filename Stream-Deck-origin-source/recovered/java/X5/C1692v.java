package X5;

import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: X5.v, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1692v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f11962b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C1692v f11963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C1692v f11964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C1692v f11965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C1692v f11966f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C1692v f11967g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C1692v f11968h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C1692v f11969i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final List f11970j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11971a;

    /* JADX INFO: renamed from: X5.v$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final List a() {
            return C1692v.f11970j;
        }

        public final C1692v b() {
            return C1692v.f11963c;
        }

        public final C1692v c() {
            return C1692v.f11968h;
        }

        public final C1692v d() {
            return C1692v.f11964d;
        }

        public a() {
        }
    }

    static {
        C1692v c1692v = new C1692v("GET");
        f11963c = c1692v;
        C1692v c1692v2 = new C1692v("POST");
        f11964d = c1692v2;
        C1692v c1692v3 = new C1692v("PUT");
        f11965e = c1692v3;
        C1692v c1692v4 = new C1692v("PATCH");
        f11966f = c1692v4;
        C1692v c1692v5 = new C1692v("DELETE");
        f11967g = c1692v5;
        C1692v c1692v6 = new C1692v("HEAD");
        f11968h = c1692v6;
        C1692v c1692v7 = new C1692v("OPTIONS");
        f11969i = c1692v7;
        f11970j = D6.r.q(c1692v, c1692v2, c1692v3, c1692v4, c1692v5, c1692v6, c1692v7);
    }

    public C1692v(String value) {
        kotlin.jvm.internal.t.g(value, "value");
        this.f11971a = value;
    }

    public final String e() {
        return this.f11971a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1692v) && kotlin.jvm.internal.t.c(this.f11971a, ((C1692v) obj).f11971a);
    }

    public int hashCode() {
        return this.f11971a.hashCode();
    }

    public String toString() {
        return "HttpMethod(value=" + this.f11971a + ')';
    }
}
