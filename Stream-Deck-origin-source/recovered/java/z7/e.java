package z7;

import C6.C0918g;
import C6.G;
import D6.w;
import J7.C1032c;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import kotlin.jvm.internal.t;
import u7.B;
import u7.C3041a;
import u7.C3047g;
import u7.InterfaceC3045e;
import u7.InterfaceC3046f;
import u7.p;
import u7.r;
import u7.u;
import u7.x;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class e implements InterfaceC3045e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f39305a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final z f39306b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f39307c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final g f39308d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final r f39309e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final c f39310f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicBoolean f39311g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public Object f39312h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public d f39313i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public f f39314j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f39315k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public z7.c f39316l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f39317m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f39318n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f39319o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public volatile boolean f39320p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public volatile z7.c f39321q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public volatile f f39322r;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC3046f f39323a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public volatile AtomicInteger f39324b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f39325c;

        public a(e eVar, InterfaceC3046f responseCallback) {
            t.g(responseCallback, "responseCallback");
            this.f39325c = eVar;
            this.f39323a = responseCallback;
            this.f39324b = new AtomicInteger(0);
        }

        public final void a(ExecutorService executorService) {
            t.g(executorService, "executorService");
            p pVarQ = this.f39325c.l().q();
            if (v7.d.f35186h && Thread.holdsLock(pVarQ)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + pVarQ);
            }
            try {
                try {
                    executorService.execute(this);
                } catch (RejectedExecutionException e8) {
                    InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                    interruptedIOException.initCause(e8);
                    this.f39325c.w(interruptedIOException);
                    this.f39323a.b(this.f39325c, interruptedIOException);
                    this.f39325c.l().q().e(this);
                }
            } catch (Throwable th) {
                this.f39325c.l().q().e(this);
                throw th;
            }
        }

        public final e b() {
            return this.f39325c;
        }

        public final AtomicInteger c() {
            return this.f39324b;
        }

        public final String d() {
            return this.f39325c.r().j().h();
        }

        public final void e(a other) {
            t.g(other, "other");
            this.f39324b = other.f39324b;
        }

        @Override // java.lang.Runnable
        public void run() {
            boolean z8;
            Throwable th;
            IOException e8;
            x xVarL;
            String str = "OkHttp " + this.f39325c.x();
            e eVar = this.f39325c;
            Thread threadCurrentThread = Thread.currentThread();
            String name = threadCurrentThread.getName();
            threadCurrentThread.setName(str);
            try {
                eVar.f39310f.v();
                try {
                    try {
                        z8 = true;
                        try {
                            this.f39323a.a(eVar, eVar.s());
                            xVarL = eVar.l();
                        } catch (IOException e9) {
                            e8 = e9;
                            if (z8) {
                                E7.h.f2311a.g().k("Callback failure for " + eVar.F(), 4, e8);
                            } else {
                                this.f39323a.b(eVar, e8);
                            }
                            xVarL = eVar.l();
                        } catch (Throwable th2) {
                            th = th2;
                            eVar.cancel();
                            if (!z8) {
                                IOException iOException = new IOException("canceled due to " + th);
                                C0918g.a(iOException, th);
                                this.f39323a.b(eVar, iOException);
                            }
                            throw th;
                        }
                    } catch (Throwable th3) {
                        eVar.l().q().e(this);
                        throw th3;
                    }
                } catch (IOException e10) {
                    z8 = false;
                    e8 = e10;
                } catch (Throwable th4) {
                    z8 = false;
                    th = th4;
                }
                xVarL.q().e(this);
                threadCurrentThread.setName(name);
            } catch (Throwable th5) {
                threadCurrentThread.setName(name);
                throw th5;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends WeakReference {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f39326a;

        public final Object a() {
            return this.f39326a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(e eVar, Object obj) {
            super(eVar);
            t.g(eVar, WaYxBuDSBD.jzo);
            this.f39326a = obj;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends C1032c {
        public c() {
        }

        @Override // J7.C1032c
        public void B() {
            e.this.cancel();
        }
    }

    public e(x client, z originalRequest, boolean z8) {
        t.g(client, "client");
        t.g(originalRequest, "originalRequest");
        this.f39305a = client;
        this.f39306b = originalRequest;
        this.f39307c = z8;
        this.f39308d = client.m().b();
        this.f39309e = client.s().a(this);
        c cVar = new c();
        cVar.g(client.h(), TimeUnit.MILLISECONDS);
        this.f39310f = cVar;
        this.f39311g = new AtomicBoolean();
        this.f39319o = true;
    }

    public final boolean B() {
        d dVar = this.f39313i;
        t.d(dVar);
        return dVar.e();
    }

    public final void C(f fVar) {
        this.f39322r = fVar;
    }

    public final void D() {
        if (this.f39315k) {
            throw new IllegalStateException("Check failed.");
        }
        this.f39315k = true;
        this.f39310f.w();
    }

    public final IOException E(IOException iOException) {
        if (this.f39315k || !this.f39310f.w()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final String F() {
        StringBuilder sb = new StringBuilder();
        sb.append(c() ? "canceled " : "");
        sb.append(this.f39307c ? "web socket" : "call");
        sb.append(" to ");
        sb.append(x());
        return sb.toString();
    }

    @Override // u7.InterfaceC3045e
    public boolean c() {
        return this.f39320p;
    }

    @Override // u7.InterfaceC3045e
    public void cancel() {
        if (this.f39320p) {
            return;
        }
        this.f39320p = true;
        z7.c cVar = this.f39321q;
        if (cVar != null) {
            cVar.b();
        }
        f fVar = this.f39322r;
        if (fVar != null) {
            fVar.d();
        }
        this.f39309e.g(this);
    }

    public final void d(f connection) {
        t.g(connection, "connection");
        if (!v7.d.f35186h || Thread.holdsLock(connection)) {
            if (this.f39314j != null) {
                throw new IllegalStateException("Check failed.");
            }
            this.f39314j = connection;
            connection.n().add(new b(this, this.f39312h));
            return;
        }
        throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + connection);
    }

    public final IOException e(IOException iOException) {
        Socket socketZ;
        boolean z8 = v7.d.f35186h;
        if (z8 && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        f fVar = this.f39314j;
        if (fVar != null) {
            if (z8 && Thread.holdsLock(fVar)) {
                throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + fVar);
            }
            synchronized (fVar) {
                socketZ = z();
            }
            if (this.f39314j == null) {
                if (socketZ != null) {
                    v7.d.n(socketZ);
                }
                this.f39309e.l(this, fVar);
            } else if (socketZ != null) {
                throw new IllegalStateException("Check failed.");
            }
        }
        IOException iOExceptionE = E(iOException);
        if (iOException == null) {
            this.f39309e.d(this);
            return iOExceptionE;
        }
        r rVar = this.f39309e;
        t.d(iOExceptionE);
        rVar.e(this, iOExceptionE);
        return iOExceptionE;
    }

    public final void f() {
        this.f39312h = E7.h.f2311a.g().i("response.body().close()");
        this.f39309e.f(this);
    }

    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public e clone() {
        return new e(this.f39305a, this.f39306b, this.f39307c);
    }

    public final C3041a h(u uVar) {
        SSLSocketFactory sSLSocketFactoryN;
        HostnameVerifier hostnameVerifierX;
        C3047g c3047gK;
        if (uVar.i()) {
            sSLSocketFactoryN = this.f39305a.N();
            hostnameVerifierX = this.f39305a.x();
            c3047gK = this.f39305a.k();
        } else {
            sSLSocketFactoryN = null;
            hostnameVerifierX = null;
            c3047gK = null;
        }
        return new C3041a(uVar.h(), uVar.l(), this.f39305a.r(), this.f39305a.M(), sSLSocketFactoryN, hostnameVerifierX, c3047gK, this.f39305a.I(), this.f39305a.H(), this.f39305a.G(), this.f39305a.n(), this.f39305a.J());
    }

    public final void i(z request, boolean z8) {
        t.g(request, "request");
        if (this.f39316l != null) {
            throw new IllegalStateException("Check failed.");
        }
        synchronized (this) {
            if (this.f39318n) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
            if (this.f39317m) {
                throw new IllegalStateException("Check failed.");
            }
            G g8 = G.f1419a;
        }
        if (z8) {
            this.f39313i = new d(this.f39308d, h(request.j()), this, this.f39309e);
        }
    }

    public final void k(boolean z8) {
        z7.c cVar;
        synchronized (this) {
            if (!this.f39319o) {
                throw new IllegalStateException("released");
            }
            G g8 = G.f1419a;
        }
        if (z8 && (cVar = this.f39321q) != null) {
            cVar.d();
        }
        this.f39316l = null;
    }

    public final x l() {
        return this.f39305a;
    }

    public final f m() {
        return this.f39314j;
    }

    public final r n() {
        return this.f39309e;
    }

    public final boolean p() {
        return this.f39307c;
    }

    public final z7.c q() {
        return this.f39316l;
    }

    public final z r() {
        return this.f39306b;
    }

    public final B s() {
        ArrayList arrayList = new ArrayList();
        w.E(arrayList, this.f39305a.z());
        arrayList.add(new A7.j(this.f39305a));
        arrayList.add(new A7.a(this.f39305a.p()));
        arrayList.add(new x7.a(this.f39305a.g()));
        arrayList.add(z7.a.f39272a);
        if (!this.f39307c) {
            w.E(arrayList, this.f39305a.C());
        }
        arrayList.add(new A7.b(this.f39307c));
        try {
            try {
                B bA = new A7.g(this, arrayList, 0, null, this.f39306b, this.f39305a.l(), this.f39305a.K(), this.f39305a.P()).a(this.f39306b);
                if (c()) {
                    v7.d.m(bA);
                    throw new IOException("Canceled");
                }
                w(null);
                return bA;
            } catch (IOException e8) {
                IOException iOExceptionW = w(e8);
                t.e(iOExceptionW, "null cannot be cast to non-null type kotlin.Throwable");
                throw iOExceptionW;
            }
        } catch (Throwable th) {
            if (0 == 0) {
                w(null);
            }
            throw th;
        }
    }

    @Override // u7.InterfaceC3045e
    public void t(InterfaceC3046f responseCallback) {
        t.g(responseCallback, "responseCallback");
        if (!this.f39311g.compareAndSet(false, true)) {
            throw new IllegalStateException("Already Executed");
        }
        f();
        this.f39305a.q().a(new a(this, responseCallback));
    }

    public final z7.c u(A7.g chain) throws IOException {
        t.g(chain, "chain");
        synchronized (this) {
            if (!this.f39319o) {
                throw new IllegalStateException("released");
            }
            if (this.f39318n) {
                throw new IllegalStateException("Check failed.");
            }
            if (this.f39317m) {
                throw new IllegalStateException("Check failed.");
            }
            G g8 = G.f1419a;
        }
        d dVar = this.f39313i;
        t.d(dVar);
        z7.c cVar = new z7.c(this, this.f39309e, dVar, dVar.a(this.f39305a, chain));
        this.f39316l = cVar;
        this.f39321q = cVar;
        synchronized (this) {
            this.f39317m = true;
            this.f39318n = true;
        }
        if (this.f39320p) {
            throw new IOException("Canceled");
        }
        return cVar;
    }

    /* JADX WARN: Code duplicated, block: B:16:0x001f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0021 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:19:0x0025 A[Catch: all -> 0x0017, TryCatch #0 {all -> 0x0017, blocks: (B:8:0x0012, B:17:0x0021, B:19:0x0025, B:20:0x0027, B:22:0x002c, B:27:0x0035, B:29:0x0039, B:34:0x0042, B:14:0x001b), top: B:46:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:25:0x0032  */
    public final IOException v(z7.c exchange, boolean z8, boolean z9, IOException iOException) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        t.g(exchange, "exchange");
        if (t.c(exchange, this.f39321q)) {
            synchronized (this) {
                z10 = false;
                if (z8) {
                    try {
                        if (this.f39317m) {
                            if (z8) {
                                this.f39317m = false;
                            }
                            if (z9) {
                                this.f39318n = false;
                            }
                            z12 = this.f39317m;
                            if (z12) {
                                z13 = false;
                            } else {
                                z13 = false;
                            }
                            if (!z12) {
                                z10 = true;
                            }
                            z11 = z10;
                            z10 = z13;
                        } else if (z9 || !this.f39318n) {
                            z11 = false;
                        } else {
                            if (z8) {
                                this.f39317m = false;
                            }
                            if (z9) {
                                this.f39318n = false;
                            }
                            z12 = this.f39317m;
                            if (z12 || this.f39318n) {
                                z13 = false;
                            } else {
                                z13 = true;
                            }
                            if (!z12 && !this.f39318n && !this.f39319o) {
                                z10 = true;
                            }
                            z11 = z10;
                            z10 = z13;
                        }
                        G g8 = G.f1419a;
                    } catch (Throwable th) {
                        throw th;
                    }
                } else {
                    if (z9) {
                    }
                    z11 = false;
                    G g9 = G.f1419a;
                }
            }
            if (z10) {
                this.f39321q = null;
                f fVar = this.f39314j;
                if (fVar != null) {
                    fVar.s();
                }
            }
            if (z11) {
                return e(iOException);
            }
        }
        return iOException;
    }

    public final IOException w(IOException iOException) {
        boolean z8;
        synchronized (this) {
            try {
                z8 = false;
                if (this.f39319o) {
                    this.f39319o = false;
                    if (!this.f39317m && !this.f39318n) {
                        z8 = true;
                    }
                }
                G g8 = G.f1419a;
            } catch (Throwable th) {
                throw th;
            }
        }
        return z8 ? e(iOException) : iOException;
    }

    public final String x() {
        return this.f39306b.j().n();
    }

    public final Socket z() {
        f fVar = this.f39314j;
        t.d(fVar);
        if (v7.d.f35186h && !Thread.holdsLock(fVar)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + fVar);
        }
        List listN = fVar.n();
        Iterator it = listN.iterator();
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            }
            if (t.c(((Reference) it.next()).get(), this)) {
                break;
            }
            i8++;
        }
        if (i8 == -1) {
            throw new IllegalStateException("Check failed.");
        }
        listN.remove(i8);
        this.f39314j = null;
        if (listN.isEmpty()) {
            fVar.C(System.nanoTime());
            if (this.f39308d.c(fVar)) {
                return fVar.E();
            }
        }
        return null;
    }
}
