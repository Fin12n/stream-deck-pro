package B7;

import A7.i;
import A7.k;
import J7.A;
import J7.C;
import J7.C1034e;
import J7.D;
import J7.InterfaceC1035f;
import J7.l;
import Z6.v;
import Z6.w;
import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2633k;
import u7.B;
import u7.n;
import u7.t;
import u7.u;
import u7.x;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b implements A7.d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final d f1214h = new d(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f1215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z7.f f1216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J7.g f1217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC1035f f1218d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f1219e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final B7.a f1220f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public t f1221g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public abstract class a implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f1222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1223b;

        public a() {
            this.f1222a = new l(b.this.f1217c.r());
        }

        @Override // J7.C
        public long K0(C1034e sink, long j8) throws IOException {
            kotlin.jvm.internal.t.g(sink, "sink");
            try {
                return b.this.f1217c.K0(sink, j8);
            } catch (IOException e8) {
                b.this.d().z();
                c();
                throw e8;
            }
        }

        public final boolean b() {
            return this.f1223b;
        }

        public final void c() {
            if (b.this.f1219e == 6) {
                return;
            }
            if (b.this.f1219e == 5) {
                b.this.r(this.f1222a);
                b.this.f1219e = 6;
            } else {
                throw new IllegalStateException("state: " + b.this.f1219e);
            }
        }

        public final void j(boolean z8) {
            this.f1223b = z8;
        }

        @Override // J7.C
        public D r() {
            return this.f1222a;
        }
    }

    /* JADX INFO: renamed from: B7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class C0050b implements A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f1225a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1226b;

        public C0050b() {
            this.f1225a = new l(b.this.f1218d.r());
        }

        @Override // J7.A
        public void I1(C1034e source, long j8) {
            kotlin.jvm.internal.t.g(source, "source");
            if (this.f1226b) {
                throw new IllegalStateException("closed");
            }
            if (j8 == 0) {
                return;
            }
            b.this.f1218d.c1(j8);
            b.this.f1218d.I0("\r\n");
            b.this.f1218d.I1(source, j8);
            b.this.f1218d.I0("\r\n");
        }

        @Override // J7.A, java.io.Closeable, java.lang.AutoCloseable
        public synchronized void close() {
            if (this.f1226b) {
                return;
            }
            this.f1226b = true;
            b.this.f1218d.I0("0\r\n\r\n");
            b.this.r(this.f1225a);
            b.this.f1219e = 3;
        }

        @Override // J7.A, java.io.Flushable
        public synchronized void flush() {
            if (this.f1226b) {
                return;
            }
            b.this.f1218d.flush();
        }

        @Override // J7.A
        public D r() {
            return this.f1225a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class c extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final u f1228d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public long f1229e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1230f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ b f1231g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(b bVar, u url) {
            super();
            kotlin.jvm.internal.t.g(url, "url");
            this.f1231g = bVar;
            this.f1228d = url;
            this.f1229e = -1L;
            this.f1230f = true;
        }

        @Override // B7.b.a, J7.C
        public long K0(C1034e sink, long j8) throws IOException {
            kotlin.jvm.internal.t.g(sink, "sink");
            if (j8 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
            }
            if (b()) {
                throw new IllegalStateException("closed");
            }
            if (!this.f1230f) {
                return -1L;
            }
            long j9 = this.f1229e;
            if (j9 == 0 || j9 == -1) {
                o();
                if (!this.f1230f) {
                    return -1L;
                }
            }
            long jK0 = super.K0(sink, Math.min(j8, this.f1229e));
            if (jK0 != -1) {
                this.f1229e -= jK0;
                return jK0;
            }
            this.f1231g.d().z();
            ProtocolException protocolException = new ProtocolException("unexpected end of stream");
            c();
            throw protocolException;
        }

        @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (this.f1230f && !v7.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f1231g.d().z();
                c();
            }
            j(true);
        }

        public final void o() throws ProtocolException {
            if (this.f1229e != -1) {
                this.f1231g.f1217c.n1();
            }
            try {
                this.f1229e = this.f1231g.f1217c.W1();
                String string = w.W0(this.f1231g.f1217c.n1()).toString();
                if (this.f1229e < 0 || (string.length() > 0 && !v.H(string, ";", false, 2, null))) {
                    throw new ProtocolException("expected chunk size and optional extensions but was \"" + this.f1229e + string + '\"');
                }
                if (this.f1229e == 0) {
                    this.f1230f = false;
                    b bVar = this.f1231g;
                    bVar.f1221g = bVar.f1220f.a();
                    x xVar = this.f1231g.f1215a;
                    kotlin.jvm.internal.t.d(xVar);
                    n nVarP = xVar.p();
                    u uVar = this.f1228d;
                    t tVar = this.f1231g.f1221g;
                    kotlin.jvm.internal.t.d(tVar);
                    A7.e.f(nVarP, uVar, tVar);
                    c();
                }
            } catch (NumberFormatException e8) {
                throw new ProtocolException(e8.getMessage());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {
        public /* synthetic */ d(AbstractC2633k abstractC2633k) {
            this();
        }

        public d() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class e extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f1232d;

        public e(long j8) {
            super();
            this.f1232d = j8;
            if (j8 == 0) {
                c();
            }
        }

        @Override // B7.b.a, J7.C
        public long K0(C1034e sink, long j8) throws IOException {
            kotlin.jvm.internal.t.g(sink, "sink");
            if (j8 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
            }
            if (b()) {
                throw new IllegalStateException("closed");
            }
            long j9 = this.f1232d;
            if (j9 == 0) {
                return -1L;
            }
            long jK0 = super.K0(sink, Math.min(j9, j8));
            if (jK0 == -1) {
                b.this.d().z();
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                c();
                throw protocolException;
            }
            long j10 = this.f1232d - jK0;
            this.f1232d = j10;
            if (j10 == 0) {
                c();
            }
            return jK0;
        }

        @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (this.f1232d != 0 && !v7.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                b.this.d().z();
                c();
            }
            j(true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class f implements A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final l f1234a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1235b;

        public f() {
            this.f1234a = new l(b.this.f1218d.r());
        }

        @Override // J7.A
        public void I1(C1034e source, long j8) {
            kotlin.jvm.internal.t.g(source, "source");
            if (this.f1235b) {
                throw new IllegalStateException("closed");
            }
            v7.d.l(source.size(), 0L, j8);
            b.this.f1218d.I1(source, j8);
        }

        @Override // J7.A, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (this.f1235b) {
                return;
            }
            this.f1235b = true;
            b.this.r(this.f1234a);
            b.this.f1219e = 3;
        }

        @Override // J7.A, java.io.Flushable
        public void flush() {
            if (this.f1235b) {
                return;
            }
            b.this.f1218d.flush();
        }

        @Override // J7.A
        public D r() {
            return this.f1234a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class g extends a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1237d;

        public g() {
            super();
        }

        @Override // B7.b.a, J7.C
        public long K0(C1034e sink, long j8) throws IOException {
            kotlin.jvm.internal.t.g(sink, "sink");
            if (j8 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
            }
            if (b()) {
                throw new IllegalStateException("closed");
            }
            if (this.f1237d) {
                return -1L;
            }
            long jK0 = super.K0(sink, j8);
            if (jK0 != -1) {
                return jK0;
            }
            this.f1237d = true;
            c();
            return -1L;
        }

        @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (b()) {
                return;
            }
            if (!this.f1237d) {
                c();
            }
            j(true);
        }
    }

    public b(x xVar, z7.f connection, J7.g source, InterfaceC1035f sink) {
        kotlin.jvm.internal.t.g(connection, "connection");
        kotlin.jvm.internal.t.g(source, "source");
        kotlin.jvm.internal.t.g(sink, "sink");
        this.f1215a = xVar;
        this.f1216b = connection;
        this.f1217c = source;
        this.f1218d = sink;
        this.f1220f = new B7.a(source);
    }

    public final void A(t headers, String requestLine) {
        kotlin.jvm.internal.t.g(headers, "headers");
        kotlin.jvm.internal.t.g(requestLine, "requestLine");
        if (this.f1219e != 0) {
            throw new IllegalStateException(("state: " + this.f1219e).toString());
        }
        this.f1218d.I0(requestLine).I0("\r\n");
        int size = headers.size();
        for (int i8 = 0; i8 < size; i8++) {
            this.f1218d.I0(headers.m(i8)).I0(": ").I0(headers.u(i8)).I0("\r\n");
        }
        this.f1218d.I0("\r\n");
        this.f1219e = 1;
    }

    @Override // A7.d
    public void a() {
        this.f1218d.flush();
    }

    @Override // A7.d
    public A b(z request, long j8) throws ProtocolException {
        kotlin.jvm.internal.t.g(request, "request");
        if (request.a() != null && request.a().c()) {
            throw new ProtocolException("Duplex connections are not supported for HTTP/1");
        }
        if (s(request)) {
            return u();
        }
        if (j8 != -1) {
            return x();
        }
        throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
    }

    @Override // A7.d
    public B.a c(boolean z8) {
        int i8 = this.f1219e;
        if (i8 != 1 && i8 != 2 && i8 != 3) {
            throw new IllegalStateException(("state: " + this.f1219e).toString());
        }
        try {
            k kVarA = k.f883d.a(this.f1220f.b());
            B.a aVarK = new B.a().p(kVarA.f884a).g(kVarA.f885b).m(kVarA.f886c).k(this.f1220f.a());
            if (z8 && kVarA.f885b == 100) {
                return null;
            }
            int i9 = kVarA.f885b;
            if (i9 == 100) {
                this.f1219e = 3;
                return aVarK;
            }
            if (102 > i9 || i9 >= 200) {
                this.f1219e = 4;
                return aVarK;
            }
            this.f1219e = 3;
            return aVarK;
        } catch (EOFException e8) {
            throw new IOException("unexpected end of stream on " + d().A().a().l().n(), e8);
        }
    }

    @Override // A7.d
    public void cancel() {
        d().d();
    }

    @Override // A7.d
    public z7.f d() {
        return this.f1216b;
    }

    @Override // A7.d
    public void e(z request) {
        kotlin.jvm.internal.t.g(request, "request");
        i iVar = i.f880a;
        Proxy.Type type = d().A().b().type();
        kotlin.jvm.internal.t.f(type, "connection.route().proxy.type()");
        A(request.f(), iVar.a(request, type));
    }

    @Override // A7.d
    public void f() {
        this.f1218d.flush();
    }

    @Override // A7.d
    public long g(B response) {
        kotlin.jvm.internal.t.g(response, "response");
        if (!A7.e.b(response)) {
            return 0L;
        }
        if (t(response)) {
            return -1L;
        }
        return v7.d.v(response);
    }

    @Override // A7.d
    public C h(B response) {
        kotlin.jvm.internal.t.g(response, "response");
        if (!A7.e.b(response)) {
            return w(0L);
        }
        if (t(response)) {
            return v(response.J0().j());
        }
        long jV = v7.d.v(response);
        return jV != -1 ? w(jV) : y();
    }

    public final void r(l lVar) {
        D dI = lVar.i();
        lVar.j(D.f4357e);
        dI.a();
        dI.b();
    }

    public final boolean s(z zVar) {
        return v.v("chunked", zVar.d("Transfer-Encoding"), true);
    }

    public final boolean t(B b8) {
        return v.v("chunked", B.A(b8, "Transfer-Encoding", null, 2, null), true);
    }

    public final A u() {
        if (this.f1219e == 1) {
            this.f1219e = 2;
            return new C0050b();
        }
        throw new IllegalStateException(("state: " + this.f1219e).toString());
    }

    public final C v(u uVar) {
        if (this.f1219e == 4) {
            this.f1219e = 5;
            return new c(this, uVar);
        }
        throw new IllegalStateException(("state: " + this.f1219e).toString());
    }

    public final C w(long j8) {
        if (this.f1219e == 4) {
            this.f1219e = 5;
            return new e(j8);
        }
        throw new IllegalStateException(("state: " + this.f1219e).toString());
    }

    public final A x() {
        if (this.f1219e == 1) {
            this.f1219e = 2;
            return new f();
        }
        throw new IllegalStateException(("state: " + this.f1219e).toString());
    }

    public final C y() {
        if (this.f1219e == 4) {
            this.f1219e = 5;
            d().z();
            return new g();
        }
        throw new IllegalStateException(("state: " + this.f1219e).toString());
    }

    public final void z(B response) {
        kotlin.jvm.internal.t.g(response, "response");
        long jV = v7.d.v(response);
        if (jV == -1) {
            return;
        }
        C cW = w(jV);
        v7.d.L(cW, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
        cW.close();
    }
}
