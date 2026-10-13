package X5;

import D6.C0938s;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class O {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f11759c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final O f11760d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final O f11761e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final O f11762f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final O f11763g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final O f11764h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final Map f11765i;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11766a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f11767b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final O a(String name) {
            kotlin.jvm.internal.t.g(name, "name");
            String strC = p115m6.G.c(name);
            O o8 = (O) O.f11759c.b().get(strC);
            return o8 == null ? new O(strC, 0) : o8;
        }

        public final Map b() {
            return O.f11765i;
        }

        public final O c() {
            return O.f11760d;
        }

        public final O d() {
            return O.f11762f;
        }

        public a() {
        }
    }

    static {
        O o8 = new O("http", 80);
        f11760d = o8;
        O o9 = new O("https", 443);
        f11761e = o9;
        O o10 = new O("ws", 80);
        f11762f = o10;
        O o11 = new O("wss", 443);
        f11763g = o11;
        O o12 = new O("socks", 1080);
        f11764h = o12;
        List listQ = D6.r.q(o8, o9, o10, o11, o12);
        LinkedHashMap linkedHashMap = new LinkedHashMap(W6.n.d(D6.L.d(C0938s.y(listQ, 10)), 16));
        for (Object obj : listQ) {
            linkedHashMap.put(((O) obj).f11766a, obj);
        }
        f11765i = linkedHashMap;
    }

    public O(String name, int i8) {
        kotlin.jvm.internal.t.g(name, "name");
        this.f11766a = name;
        this.f11767b = i8;
        for (int i9 = 0; i9 < name.length(); i9++) {
            if (!p115m6.k.a(name.charAt(i9))) {
                throw new IllegalArgumentException("All characters should be lower case");
            }
        }
    }

    public final int d() {
        return this.f11767b;
    }

    public final String e() {
        return this.f11766a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof O)) {
            return false;
        }
        O o8 = (O) obj;
        return kotlin.jvm.internal.t.c(this.f11766a, o8.f11766a) && this.f11767b == o8.f11767b;
    }

    public int hashCode() {
        return (this.f11766a.hashCode() * 31) + Integer.hashCode(this.f11767b);
    }

    public String toString() {
        return "URLProtocol(name=" + this.f11766a + ", defaultPort=" + this.f11767b + ')';
    }
}
