package z7;

import J7.A;
import J7.C;
import J7.C1034e;
import J7.k;
import J7.p;
import java.io.IOException;
import java.net.ProtocolException;
import kotlin.jvm.internal.t;
import p211y4.vJ.RaiWHuj;
import u7.B;
import u7.r;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f39277a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final r f39278b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final d f39279c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final A7.d f39280d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f39281e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f39282f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final f f39283g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a extends J7.j {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f39284b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f39285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public long f39286d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f39287e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ c f39288f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(c cVar, A delegate, long j8) {
            super(delegate);
            t.g(delegate, "delegate");
            this.f39288f = cVar;
            this.f39284b = j8;
        }

        private final IOException b(IOException iOException) {
            if (this.f39285c) {
                return iOException;
            }
            this.f39285c = true;
            return this.f39288f.a(this.f39286d, false, true, iOException);
        }

        @Override // J7.j, J7.A, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f39287e) {
                return;
            }
            this.f39287e = true;
            long j8 = this.f39284b;
            if (j8 != -1 && this.f39286d != j8) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                b(null);
            } catch (IOException e8) {
                throw b(e8);
            }
        }

        @Override // J7.j, J7.A, java.io.Flushable
        public void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e8) {
                throw b(e8);
            }
        }

        @Override // J7.j, J7.A
        public void I1(C1034e source, long j8) throws IOException {
            t.g(source, "source");
            if (this.f39287e) {
                throw new IllegalStateException(RaiWHuj.gKHQvwLGJRb);
            }
            long j9 = this.f39284b;
            if (j9 == -1 || this.f39286d + j8 <= j9) {
                try {
                    super.I1(source, j8);
                    this.f39286d += j8;
                    return;
                } catch (IOException e8) {
                    throw b(e8);
                }
            }
            throw new ProtocolException("expected " + this.f39284b + " bytes but received " + (this.f39286d + j8));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b extends k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final long f39289b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f39290c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f39291d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f39292e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f39293f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ c f39294g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(c cVar, C delegate, long j8) {
            super(delegate);
            t.g(delegate, "delegate");
            this.f39294g = cVar;
            this.f39289b = j8;
            this.f39291d = true;
            if (j8 == 0) {
                c(null);
            }
        }

        @Override // J7.k, J7.C
        public long K0(C1034e sink, long j8) throws IOException {
            t.g(sink, "sink");
            if (this.f39293f) {
                throw new IllegalStateException("closed");
            }
            try {
                long jK0 = b().K0(sink, j8);
                if (this.f39291d) {
                    this.f39291d = false;
                    this.f39294g.i().w(this.f39294g.g());
                }
                if (jK0 == -1) {
                    c(null);
                    return -1L;
                }
                long j9 = this.f39290c + jK0;
                long j10 = this.f39289b;
                if (j10 != -1 && j9 > j10) {
                    throw new ProtocolException("expected " + this.f39289b + " bytes but received " + j9);
                }
                this.f39290c = j9;
                if (j9 == j10) {
                    c(null);
                }
                return jK0;
            } catch (IOException e8) {
                throw c(e8);
            }
        }

        public final IOException c(IOException iOException) {
            if (this.f39292e) {
                return iOException;
            }
            this.f39292e = true;
            if (iOException == null && this.f39291d) {
                this.f39291d = false;
                this.f39294g.i().w(this.f39294g.g());
            }
            return this.f39294g.a(this.f39290c, true, false, iOException);
        }

        @Override // J7.k, J7.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            if (this.f39293f) {
                return;
            }
            this.f39293f = true;
            try {
                super.close();
                c(null);
            } catch (IOException e8) {
                throw c(e8);
            }
        }
    }

    public c(e call, r eventListener, d finder, A7.d codec) {
        t.g(call, "call");
        t.g(eventListener, "eventListener");
        t.g(finder, "finder");
        t.g(codec, "codec");
        this.f39277a = call;
        this.f39278b = eventListener;
        this.f39279c = finder;
        this.f39280d = codec;
        this.f39283g = codec.d();
    }

    public final IOException a(long j8, boolean z8, boolean z9, IOException iOException) {
        if (iOException != null) {
            u(iOException);
        }
        if (z9) {
            if (iOException != null) {
                this.f39278b.s(this.f39277a, iOException);
            } else {
                this.f39278b.q(this.f39277a, j8);
            }
        }
        if (z8) {
            if (iOException != null) {
                this.f39278b.x(this.f39277a, iOException);
            } else {
                this.f39278b.v(this.f39277a, j8);
            }
        }
        return this.f39277a.v(this, z9, z8, iOException);
    }

    public final void b() {
        this.f39280d.cancel();
    }

    public final A c(z request, boolean z8) {
        t.g(request, "request");
        this.f39281e = z8;
        u7.A a8 = request.a();
        t.d(a8);
        long jA = a8.a();
        this.f39278b.r(this.f39277a);
        return new a(this, this.f39280d.b(request, jA), jA);
    }

    public final void d() {
        this.f39280d.cancel();
        this.f39277a.v(this, true, true, null);
    }

    public final void e() {
        try {
            this.f39280d.a();
        } catch (IOException e8) {
            this.f39278b.s(this.f39277a, e8);
            u(e8);
            throw e8;
        }
    }

    public final void f() {
        try {
            this.f39280d.f();
        } catch (IOException e8) {
            this.f39278b.s(this.f39277a, e8);
            u(e8);
            throw e8;
        }
    }

    public final e g() {
        return this.f39277a;
    }

    public final f h() {
        return this.f39283g;
    }

    public final r i() {
        return this.f39278b;
    }

    public final d j() {
        return this.f39279c;
    }

    public final boolean k() {
        return this.f39282f;
    }

    public final boolean l() {
        return !t.c(this.f39279c.d().l().h(), this.f39283g.A().a().l().h());
    }

    public final boolean m() {
        return this.f39281e;
    }

    public final I7.d.AbstractC0143d n() {
        this.f39277a.D();
        return this.f39280d.d().x(this);
    }

    public final void o() {
        this.f39280d.d().z();
    }

    public final void p() {
        this.f39277a.v(this, true, false, null);
    }

    public final u7.C q(B response) throws IOException {
        t.g(response, "response");
        try {
            String strA = B.A(response, "Content-Type", null, 2, null);
            long jG = this.f39280d.g(response);
            return new A7.h(strA, jG, p.d(new b(this, this.f39280d.h(response), jG)));
        } catch (IOException e8) {
            this.f39278b.x(this.f39277a, e8);
            u(e8);
            throw e8;
        }
    }

    public final B.a r(boolean z8) {
        try {
            B.a aVarC = this.f39280d.c(z8);
            if (aVarC == null) {
                return aVarC;
            }
            aVarC.l(this);
            return aVarC;
        } catch (IOException e8) {
            this.f39278b.x(this.f39277a, e8);
            u(e8);
            throw e8;
        }
    }

    public final void s(B response) {
        t.g(response, "response");
        this.f39278b.y(this.f39277a, response);
    }

    public final void t() {
        this.f39278b.z(this.f39277a);
    }

    public final void u(IOException iOException) {
        this.f39282f = true;
        this.f39279c.h(iOException);
        this.f39280d.d().H(this.f39277a, iOException);
    }

    public final void v() {
        a(-1L, true, true, null);
    }

    public final void w(z request) {
        t.g(request, "request");
        try {
            this.f39278b.u(this.f39277a);
            this.f39280d.e(request);
            this.f39278b.t(this.f39277a, request);
        } catch (IOException e8) {
            this.f39278b.s(this.f39277a, e8);
            u(e8);
            throw e8;
        }
    }
}
