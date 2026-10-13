package C7;

import C6.G;
import J7.A;
import J7.C;
import J7.C1032c;
import J7.C1034e;
import J7.D;
import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import kotlin.jvm.internal.AbstractC2633k;
import u7.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final a f1616o = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1617a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f1618b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public long f1619c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f1620d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f1621e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f1622f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final ArrayDeque f1623g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f1624h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final c f1625i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final b f1626j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f1627k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final d f1628l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public C7.b f1629m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public IOException f1630n;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class c implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final long f1636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f1637b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final C1034e f1638c = new C1034e();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C1034e f1639d = new C1034e();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public t f1640e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f1641f;

        public c(long j8, boolean z8) {
            this.f1636a = j8;
            this.f1637b = z8;
        }

        @Override // J7.C
        public long K0(C1034e sink, long j8) throws IOException {
            IOException iOExceptionI;
            boolean z8;
            long jK0;
            kotlin.jvm.internal.t.g(sink, "sink");
            long j9 = 0;
            if (j8 < 0) {
                throw new IllegalArgumentException(("byteCount < 0: " + j8).toString());
            }
            while (true) {
                i iVar = i.this;
                synchronized (iVar) {
                    iVar.m().v();
                    try {
                        if (iVar.h() == null || this.f1637b) {
                            iOExceptionI = null;
                        } else {
                            iOExceptionI = iVar.i();
                            if (iOExceptionI == null) {
                                C7.b bVarH = iVar.h();
                                kotlin.jvm.internal.t.d(bVarH);
                                iOExceptionI = new n(bVarH);
                            }
                        }
                        if (this.f1641f) {
                            throw new IOException("stream closed");
                        }
                        z8 = false;
                        if (this.f1639d.size() > j9) {
                            C1034e c1034e = this.f1639d;
                            jK0 = c1034e.K0(sink, Math.min(j8, c1034e.size()));
                            iVar.A(iVar.l() + jK0);
                            long jL = iVar.l() - iVar.k();
                            if (iOExceptionI == null && jL >= iVar.g().k1().c() / 2) {
                                iVar.g().m2(iVar.j(), jL);
                                iVar.z(iVar.l());
                            }
                        } else {
                            if (!this.f1637b && iOExceptionI == null) {
                                iVar.D();
                                z8 = true;
                            }
                            jK0 = -1;
                        }
                        iVar.m().C();
                        G g8 = G.f1419a;
                    } catch (Throwable th) {
                        iVar.m().C();
                        throw th;
                    }
                    throw th;
                }
                if (!z8) {
                    if (jK0 != -1) {
                        return jK0;
                    }
                    if (iOExceptionI == null) {
                        return -1L;
                    }
                    throw iOExceptionI;
                }
                j9 = 0;
            }
        }

        public final boolean b() {
            return this.f1641f;
        }

        public final boolean c() {
            return this.f1637b;
        }

        @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            long size;
            i iVar = i.this;
            synchronized (iVar) {
                this.f1641f = true;
                size = this.f1639d.size();
                this.f1639d.b();
                kotlin.jvm.internal.t.e(iVar, "null cannot be cast to non-null type java.lang.Object");
                iVar.notifyAll();
                G g8 = G.f1419a;
            }
            if (size > 0) {
                v(size);
            }
            i.this.b();
        }

        public final void j(J7.g source, long j8) throws EOFException {
            boolean z8;
            boolean z9;
            kotlin.jvm.internal.t.g(source, "source");
            i iVar = i.this;
            if (v7.d.f35186h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            long j9 = j8;
            while (j9 > 0) {
                synchronized (i.this) {
                    z8 = this.f1637b;
                    z9 = this.f1639d.size() + j9 > this.f1636a;
                    G g8 = G.f1419a;
                }
                if (z9) {
                    source.skip(j9);
                    i.this.f(C7.b.FLOW_CONTROL_ERROR);
                    return;
                }
                if (z8) {
                    source.skip(j9);
                    return;
                }
                long jK0 = source.K0(this.f1638c, j9);
                if (jK0 == -1) {
                    throw new EOFException();
                }
                j9 -= jK0;
                i iVar2 = i.this;
                synchronized (iVar2) {
                    try {
                        if (this.f1641f) {
                            this.f1638c.b();
                        } else {
                            boolean z10 = this.f1639d.size() == 0;
                            this.f1639d.M(this.f1638c);
                            if (z10) {
                                kotlin.jvm.internal.t.e(iVar2, "null cannot be cast to non-null type java.lang.Object");
                                iVar2.notifyAll();
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            v(j8);
        }

        public final void o(boolean z8) {
            this.f1637b = z8;
        }

        @Override // J7.C
        public D r() {
            return i.this.m();
        }

        public final void t(t tVar) {
            this.f1640e = tVar;
        }

        public final void v(long j8) {
            i iVar = i.this;
            if (!v7.d.f35186h || !Thread.holdsLock(iVar)) {
                i.this.g().g2(j8);
                return;
            }
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class d extends C1032c {
        public d() {
        }

        @Override // J7.C1032c
        public void B() {
            i.this.f(C7.b.CANCEL);
            i.this.g().a2();
        }

        public final void C() throws IOException {
            if (w()) {
                throw x(null);
            }
        }

        @Override // J7.C1032c
        public IOException x(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }
    }

    public i(int i8, f connection, boolean z8, boolean z9, t tVar) {
        kotlin.jvm.internal.t.g(connection, "connection");
        this.f1617a = i8;
        this.f1618b = connection;
        this.f1622f = connection.o1().c();
        ArrayDeque arrayDeque = new ArrayDeque();
        this.f1623g = arrayDeque;
        this.f1625i = new c(connection.k1().c(), z9);
        this.f1626j = new b(z8);
        this.f1627k = new d();
        this.f1628l = new d();
        if (tVar == null) {
            if (!t()) {
                throw new IllegalStateException("remotely-initiated streams should have headers");
            }
        } else {
            if (t()) {
                throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
            }
            arrayDeque.add(tVar);
        }
    }

    public final void A(long j8) {
        this.f1619c = j8;
    }

    public final void B(long j8) {
        this.f1621e = j8;
    }

    public final synchronized t C() {
        Object objRemoveFirst;
        this.f1627k.v();
        while (this.f1623g.isEmpty() && this.f1629m == null) {
            try {
                D();
            } catch (Throwable th) {
                this.f1627k.C();
                throw th;
            }
        }
        this.f1627k.C();
        if (this.f1623g.isEmpty()) {
            IOException iOException = this.f1630n;
            if (iOException != null) {
                throw iOException;
            }
            C7.b bVar = this.f1629m;
            kotlin.jvm.internal.t.d(bVar);
            throw new n(bVar);
        }
        objRemoveFirst = this.f1623g.removeFirst();
        kotlin.jvm.internal.t.f(objRemoveFirst, "headersQueue.removeFirst()");
        return (t) objRemoveFirst;
    }

    public final void D() throws InterruptedIOException {
        try {
            kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type java.lang.Object");
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    public final D E() {
        return this.f1628l;
    }

    public final void a(long j8) {
        this.f1622f += j8;
        if (j8 > 0) {
            kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void b() {
        boolean z8;
        boolean zU;
        if (v7.d.f35186h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                z8 = !this.f1625i.c() && this.f1625i.b() && (this.f1626j.j() || this.f1626j.c());
                zU = u();
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (z8) {
            d(C7.b.CANCEL, null);
        } else {
            if (zU) {
                return;
            }
            this.f1618b.Z1(this.f1617a);
        }
    }

    public final void c() throws IOException {
        if (this.f1626j.c()) {
            throw new IOException("stream closed");
        }
        if (this.f1626j.j()) {
            throw new IOException("stream finished");
        }
        if (this.f1629m != null) {
            IOException iOException = this.f1630n;
            if (iOException != null) {
                throw iOException;
            }
            C7.b bVar = this.f1629m;
            kotlin.jvm.internal.t.d(bVar);
            throw new n(bVar);
        }
    }

    public final void d(C7.b rstStatusCode, IOException iOException) {
        kotlin.jvm.internal.t.g(rstStatusCode, "rstStatusCode");
        if (e(rstStatusCode, iOException)) {
            this.f1618b.k2(this.f1617a, rstStatusCode);
        }
    }

    public final boolean e(C7.b bVar, IOException iOException) {
        if (v7.d.f35186h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            if (this.f1629m != null) {
                return false;
            }
            this.f1629m = bVar;
            this.f1630n = iOException;
            kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
            if (this.f1625i.c() && this.f1626j.j()) {
                return false;
            }
            G g8 = G.f1419a;
            this.f1618b.Z1(this.f1617a);
            return true;
        }
    }

    public final void f(C7.b errorCode) {
        kotlin.jvm.internal.t.g(errorCode, "errorCode");
        if (e(errorCode, null)) {
            this.f1618b.l2(this.f1617a, errorCode);
        }
    }

    public final f g() {
        return this.f1618b;
    }

    public final synchronized C7.b h() {
        return this.f1629m;
    }

    public final IOException i() {
        return this.f1630n;
    }

    public final int j() {
        return this.f1617a;
    }

    public final long k() {
        return this.f1620d;
    }

    public final long l() {
        return this.f1619c;
    }

    public final d m() {
        return this.f1627k;
    }

    public final A n() {
        synchronized (this) {
            try {
                if (!this.f1624h && !t()) {
                    throw new IllegalStateException("reply before requesting the sink");
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return this.f1626j;
    }

    public final b o() {
        return this.f1626j;
    }

    public final c p() {
        return this.f1625i;
    }

    public final long q() {
        return this.f1622f;
    }

    public final long r() {
        return this.f1621e;
    }

    public final d s() {
        return this.f1628l;
    }

    public final boolean t() {
        return this.f1618b.T0() == ((this.f1617a & 1) == 1);
    }

    public final synchronized boolean u() {
        try {
            if (this.f1629m != null) {
                return false;
            }
            if (this.f1625i.c() || this.f1625i.b()) {
                if ((this.f1626j.j() || this.f1626j.c()) && this.f1624h) {
                    return false;
                }
            }
            return true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public final D v() {
        return this.f1627k;
    }

    public final void w(J7.g source, int i8) {
        kotlin.jvm.internal.t.g(source, "source");
        if (!v7.d.f35186h || !Thread.holdsLock(this)) {
            this.f1625i.j(source, i8);
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
    }

    public final void x(t headers, boolean z8) {
        boolean zU;
        kotlin.jvm.internal.t.g(headers, "headers");
        if (v7.d.f35186h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        synchronized (this) {
            try {
                if (this.f1624h && z8) {
                    this.f1625i.t(headers);
                } else {
                    this.f1624h = true;
                    this.f1623g.add(headers);
                }
                if (z8) {
                    this.f1625i.o(true);
                }
                zU = u();
                kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type java.lang.Object");
                notifyAll();
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (zU) {
            return;
        }
        this.f1618b.Z1(this.f1617a);
    }

    public final synchronized void y(C7.b errorCode) {
        kotlin.jvm.internal.t.g(errorCode, "errorCode");
        if (this.f1629m == null) {
            this.f1629m = errorCode;
            kotlin.jvm.internal.t.e(this, "null cannot be cast to non-null type java.lang.Object");
            notifyAll();
        }
    }

    public final void z(long j8) {
        this.f1620d = j8;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b implements A {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f1631a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final C1034e f1632b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public t f1633c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f1634d;

        public b(boolean z8) {
            this.f1631a = z8;
            this.f1632b = new C1034e();
        }

        @Override // J7.A
        public void I1(C1034e source, long j8) throws IOException {
            kotlin.jvm.internal.t.g(source, "source");
            i iVar = i.this;
            if (!v7.d.f35186h || !Thread.holdsLock(iVar)) {
                this.f1632b.I1(source, j8);
                while (this.f1632b.size() >= 16384) {
                    b(false);
                }
            } else {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
        }

        public final void b(boolean z8) throws IOException {
            long jMin;
            boolean z9;
            i iVar = i.this;
            synchronized (iVar) {
                try {
                    iVar.s().v();
                    while (iVar.r() >= iVar.q() && !this.f1631a && !this.f1634d && iVar.h() == null) {
                        try {
                            iVar.D();
                        } catch (Throwable th) {
                            iVar.s().C();
                            throw th;
                        }
                    }
                    iVar.s().C();
                    iVar.c();
                    jMin = Math.min(iVar.q() - iVar.r(), this.f1632b.size());
                    iVar.B(iVar.r() + jMin);
                    z9 = z8 && jMin == this.f1632b.size();
                    G g8 = G.f1419a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            i.this.s().v();
            try {
                i.this.g().h2(i.this.j(), z9, this.f1632b, jMin);
            } finally {
                i.this.s().C();
            }
        }

        public final boolean c() {
            return this.f1634d;
        }

        @Override // J7.A, java.io.Closeable, java.lang.AutoCloseable
        public void close() throws IOException {
            i iVar = i.this;
            if (v7.d.f35186h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                if (this.f1634d) {
                    return;
                }
                boolean z8 = iVar2.h() == null;
                G g8 = G.f1419a;
                if (!i.this.o().f1631a) {
                    boolean z9 = this.f1632b.size() > 0;
                    if (this.f1633c != null) {
                        while (this.f1632b.size() > 0) {
                            b(false);
                        }
                        f fVarG = i.this.g();
                        int iJ = i.this.j();
                        t tVar = this.f1633c;
                        kotlin.jvm.internal.t.d(tVar);
                        fVarG.i2(iJ, z8, v7.d.O(tVar));
                    } else if (z9) {
                        while (this.f1632b.size() > 0) {
                            b(true);
                        }
                    } else if (z8) {
                        i.this.g().h2(i.this.j(), true, null, 0L);
                    }
                }
                synchronized (i.this) {
                    this.f1634d = true;
                    G g9 = G.f1419a;
                }
                i.this.g().flush();
                i.this.b();
            }
        }

        @Override // J7.A, java.io.Flushable
        public void flush() throws IOException {
            i iVar = i.this;
            if (v7.d.f35186h && Thread.holdsLock(iVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + iVar);
            }
            i iVar2 = i.this;
            synchronized (iVar2) {
                iVar2.c();
                G g8 = G.f1419a;
            }
            while (this.f1632b.size() > 0) {
                b(false);
                i.this.g().flush();
            }
        }

        public final boolean j() {
            return this.f1631a;
        }

        @Override // J7.A
        public D r() {
            return i.this.s();
        }

        public /* synthetic */ b(i iVar, boolean z8, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? false : z8);
        }
    }
}
