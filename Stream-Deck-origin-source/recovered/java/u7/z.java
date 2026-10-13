package u7;

import D6.M;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f34918a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f34919b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final t f34920c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A f34921d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f34922e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public C3044d f34923f;

    public z(u url, String method, t headers, A a8, Map<Class<?>, ? extends Object> tags) {
        kotlin.jvm.internal.t.g(url, "url");
        kotlin.jvm.internal.t.g(method, "method");
        kotlin.jvm.internal.t.g(headers, "headers");
        kotlin.jvm.internal.t.g(tags, "tags");
        this.f34918a = url;
        this.f34919b = method;
        this.f34920c = headers;
        this.f34921d = a8;
        this.f34922e = tags;
    }

    public final A a() {
        return this.f34921d;
    }

    public final C3044d b() {
        C3044d c3044d = this.f34923f;
        if (c3044d != null) {
            return c3044d;
        }
        C3044d c3044dB = C3044d.f34601n.b(this.f34920c);
        this.f34923f = c3044dB;
        return c3044dB;
    }

    public final Map c() {
        return this.f34922e;
    }

    public final String d(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        return this.f34920c.c(name);
    }

    public final List e(String name) {
        kotlin.jvm.internal.t.g(name, "name");
        return this.f34920c.y(name);
    }

    public final t f() {
        return this.f34920c;
    }

    public final boolean g() {
        return this.f34918a.i();
    }

    public final String h() {
        return this.f34919b;
    }

    public final a i() {
        return new a(this);
    }

    public final u j() {
        return this.f34918a;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request{method=");
        sb.append(this.f34919b);
        sb.append(", url=");
        sb.append(this.f34918a);
        if (this.f34920c.size() != 0) {
            sb.append(", headers=[");
            int i8 = 0;
            for (Object obj : this.f34920c) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    D6.r.x();
                }
                C6.o oVar = (C6.o) obj;
                String str = (String) oVar.a();
                String str2 = (String) oVar.b();
                if (i8 > 0) {
                    sb.append(", ");
                }
                sb.append(str);
                sb.append(':');
                sb.append(str2);
                i8 = i9;
            }
            sb.append(']');
        }
        if (!this.f34922e.isEmpty()) {
            sb.append(", tags=");
            sb.append(this.f34922e);
        }
        sb.append('}');
        String string = sb.toString();
        kotlin.jvm.internal.t.f(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public u f34924a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public String f34925b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t.a f34926c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public A f34927d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Map f34928e;

        public a() {
            this.f34928e = new LinkedHashMap();
            this.f34925b = "GET";
            this.f34926c = new t.a();
        }

        public a a(String name, String value) {
            kotlin.jvm.internal.t.g(name, "name");
            kotlin.jvm.internal.t.g(value, "value");
            this.f34926c.a(name, value);
            return this;
        }

        public z b() {
            u uVar = this.f34924a;
            if (uVar != null) {
                return new z(uVar, this.f34925b, this.f34926c.d(), this.f34927d, v7.d.V(this.f34928e));
            }
            throw new IllegalStateException("url == null");
        }

        public a c(String name, String value) {
            kotlin.jvm.internal.t.g(name, "name");
            kotlin.jvm.internal.t.g(value, "value");
            this.f34926c.h(name, value);
            return this;
        }

        public a d(t headers) {
            kotlin.jvm.internal.t.g(headers, "headers");
            this.f34926c = headers.s();
            return this;
        }

        public a e(String method, A a8) {
            kotlin.jvm.internal.t.g(method, "method");
            if (method.length() <= 0) {
                throw new IllegalArgumentException("method.isEmpty() == true");
            }
            if (a8 == null) {
                if (A7.f.e(method)) {
                    throw new IllegalArgumentException(("method " + method + " must have a request body.").toString());
                }
            } else if (!A7.f.b(method)) {
                throw new IllegalArgumentException(("method " + method + " must not have a request body.").toString());
            }
            this.f34925b = method;
            this.f34927d = a8;
            return this;
        }

        public a f(String name) {
            kotlin.jvm.internal.t.g(name, "name");
            this.f34926c.g(name);
            return this;
        }

        public a g(String url) {
            kotlin.jvm.internal.t.g(url, "url");
            if (Z6.v.F(url, "ws:", true)) {
                StringBuilder sb = new StringBuilder();
                sb.append("http:");
                String strSubstring = url.substring(3);
                kotlin.jvm.internal.t.f(strSubstring, "this as java.lang.String).substring(startIndex)");
                sb.append(strSubstring);
                url = sb.toString();
            } else if (Z6.v.F(url, "wss:", true)) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append("https:");
                String strSubstring2 = url.substring(4);
                kotlin.jvm.internal.t.f(strSubstring2, "this as java.lang.String).substring(startIndex)");
                sb2.append(strSubstring2);
                url = sb2.toString();
            }
            return h(u.f34818k.d(url));
        }

        public a h(u url) {
            kotlin.jvm.internal.t.g(url, "url");
            this.f34924a = url;
            return this;
        }

        public a(z request) {
            Map mapY;
            kotlin.jvm.internal.t.g(request, "request");
            this.f34928e = new LinkedHashMap();
            this.f34924a = request.j();
            this.f34925b = request.h();
            this.f34927d = request.a();
            if (request.c().isEmpty()) {
                mapY = new LinkedHashMap();
            } else {
                mapY = M.y(request.c());
            }
            this.f34928e = mapY;
            this.f34926c = request.f().s();
        }
    }
}
