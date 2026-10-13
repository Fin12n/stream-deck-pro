package u7;

import java.io.Closeable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class B implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final z f34512a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final y f34513b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34514c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f34515d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final s f34516e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final t f34517f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C f34518g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final B f34519h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final B f34520i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final B f34521j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final long f34522k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final long f34523l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final z7.c f34524m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public C3044d f34525n;

    public B(z request, y protocol, String message, int i8, s sVar, t headers, C c8, B b8, B b9, B b10, long j8, long j9, z7.c cVar) {
        kotlin.jvm.internal.t.g(request, "request");
        kotlin.jvm.internal.t.g(protocol, "protocol");
        kotlin.jvm.internal.t.g(message, "message");
        kotlin.jvm.internal.t.g(headers, "headers");
        this.f34512a = request;
        this.f34513b = protocol;
        this.f34514c = message;
        this.f34515d = i8;
        this.f34516e = sVar;
        this.f34517f = headers;
        this.f34518g = c8;
        this.f34519h = b8;
        this.f34520i = b9;
        this.f34521j = b10;
        this.f34522k = j8;
        this.f34523l = j9;
        this.f34524m = cVar;
    }

    public static /* synthetic */ String A(B b8, String str, String str2, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            str2 = null;
        }
        return b8.z(str, str2);
    }

    public final y A0() {
        return this.f34513b;
    }

    public final long H0() {
        return this.f34523l;
    }

    public final z J0() {
        return this.f34512a;
    }

    public final long L0() {
        return this.f34522k;
    }

    public final t Y() {
        return this.f34517f;
    }

    public final C b() {
        return this.f34518g;
    }

    public final C3044d c() {
        C3044d c3044d = this.f34525n;
        if (c3044d != null) {
            return c3044d;
        }
        C3044d c3044dB = C3044d.f34601n.b(this.f34517f);
        this.f34525n = c3044dB;
        return c3044dB;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        C c8 = this.f34518g;
        if (c8 == null) {
            throw new IllegalStateException("response is not eligible for a body and must not be closed");
        }
        c8.close();
    }

    public final String i0() {
        return this.f34514c;
    }

    public final B j() {
        return this.f34520i;
    }

    public final B j0() {
        return this.f34519h;
    }

    public final List o() {
        String str;
        t tVar = this.f34517f;
        int i8 = this.f34515d;
        if (i8 == 401) {
            str = "WWW-Authenticate";
        } else {
            if (i8 != 407) {
                return D6.r.n();
            }
            str = "Proxy-Authenticate";
        }
        return A7.e.a(tVar, str);
    }

    public final a r0() {
        return new a(this);
    }

    public final int t() {
        return this.f34515d;
    }

    public String toString() {
        return "Response{protocol=" + this.f34513b + ", code=" + this.f34515d + ", message=" + this.f34514c + ", url=" + this.f34512a.j() + '}';
    }

    public final z7.c v() {
        return this.f34524m;
    }

    public final B w0() {
        return this.f34521j;
    }

    public final s y() {
        return this.f34516e;
    }

    public final String z(String name, String str) {
        kotlin.jvm.internal.t.g(name, "name");
        String strC = this.f34517f.c(name);
        return strC == null ? str : strC;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public z f34526a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public y f34527b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f34528c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public String f34529d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public s f34530e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public t.a f34531f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public C f34532g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public B f34533h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public B f34534i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public B f34535j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public long f34536k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public long f34537l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public z7.c f34538m;

        public a() {
            this.f34528c = -1;
            this.f34531f = new t.a();
        }

        public a a(String name, String value) {
            kotlin.jvm.internal.t.g(name, "name");
            kotlin.jvm.internal.t.g(value, "value");
            this.f34531f.a(name, value);
            return this;
        }

        public a b(C c8) {
            this.f34532g = c8;
            return this;
        }

        public B c() {
            int i8 = this.f34528c;
            if (i8 < 0) {
                throw new IllegalStateException(("code < 0: " + this.f34528c).toString());
            }
            z zVar = this.f34526a;
            if (zVar == null) {
                throw new IllegalStateException("request == null");
            }
            y yVar = this.f34527b;
            if (yVar == null) {
                throw new IllegalStateException("protocol == null");
            }
            String str = this.f34529d;
            if (str != null) {
                return new B(zVar, yVar, str, i8, this.f34530e, this.f34531f.d(), this.f34532g, this.f34533h, this.f34534i, this.f34535j, this.f34536k, this.f34537l, this.f34538m);
            }
            throw new IllegalStateException("message == null");
        }

        public a d(B b8) {
            f("cacheResponse", b8);
            this.f34534i = b8;
            return this;
        }

        public final void e(B b8) {
            if (b8 != null && b8.b() != null) {
                throw new IllegalArgumentException("priorResponse.body != null");
            }
        }

        public final void f(String str, B b8) {
            if (b8 != null) {
                if (b8.b() != null) {
                    throw new IllegalArgumentException((str + ".body != null").toString());
                }
                if (b8.j0() != null) {
                    throw new IllegalArgumentException((str + ".networkResponse != null").toString());
                }
                if (b8.j() != null) {
                    throw new IllegalArgumentException((str + ".cacheResponse != null").toString());
                }
                if (b8.w0() == null) {
                    return;
                }
                throw new IllegalArgumentException((str + ".priorResponse != null").toString());
            }
        }

        public a g(int i8) {
            this.f34528c = i8;
            return this;
        }

        public final int h() {
            return this.f34528c;
        }

        public a i(s sVar) {
            this.f34530e = sVar;
            return this;
        }

        public a j(String name, String value) {
            kotlin.jvm.internal.t.g(name, "name");
            kotlin.jvm.internal.t.g(value, "value");
            this.f34531f.h(name, value);
            return this;
        }

        public a k(t headers) {
            kotlin.jvm.internal.t.g(headers, "headers");
            this.f34531f = headers.s();
            return this;
        }

        public final void l(z7.c deferredTrailers) {
            kotlin.jvm.internal.t.g(deferredTrailers, "deferredTrailers");
            this.f34538m = deferredTrailers;
        }

        public a m(String message) {
            kotlin.jvm.internal.t.g(message, "message");
            this.f34529d = message;
            return this;
        }

        public a n(B b8) {
            f("networkResponse", b8);
            this.f34533h = b8;
            return this;
        }

        public a o(B b8) {
            e(b8);
            this.f34535j = b8;
            return this;
        }

        public a p(y protocol) {
            kotlin.jvm.internal.t.g(protocol, "protocol");
            this.f34527b = protocol;
            return this;
        }

        public a q(long j8) {
            this.f34537l = j8;
            return this;
        }

        public a r(z request) {
            kotlin.jvm.internal.t.g(request, "request");
            this.f34526a = request;
            return this;
        }

        public a s(long j8) {
            this.f34536k = j8;
            return this;
        }

        public a(B response) {
            kotlin.jvm.internal.t.g(response, "response");
            this.f34528c = -1;
            this.f34526a = response.J0();
            this.f34527b = response.A0();
            this.f34528c = response.t();
            this.f34529d = response.i0();
            this.f34530e = response.y();
            this.f34531f = response.Y().s();
            this.f34532g = response.b();
            this.f34533h = response.j0();
            this.f34534i = response.j();
            this.f34535j = response.w0();
            this.f34536k = response.L0();
            this.f34537l = response.H0();
            this.f34538m = response.v();
        }
    }
}
