package z7;

import C6.G;
import C7.n;
import java.io.IOException;
import java.net.Socket;
import java.util.List;
import kotlin.jvm.internal.t;
import u7.C3041a;
import u7.D;
import u7.r;
import u7.u;
import u7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f39295a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C3041a f39296b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f39297c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r f39298d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j.b f39299e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public j f39300f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f39301g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f39302h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f39303i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public D f39304j;

    public d(g connectionPool, C3041a address, e call, r eventListener) {
        t.g(connectionPool, "connectionPool");
        t.g(address, "address");
        t.g(call, "call");
        t.g(eventListener, "eventListener");
        this.f39295a = connectionPool;
        this.f39296b = address;
        this.f39297c = call;
        this.f39298d = eventListener;
    }

    public final A7.d a(x client, A7.g chain) {
        t.g(client, "client");
        t.g(chain, "chain");
        try {
            try {
                return c(chain.f(), chain.h(), chain.j(), client.F(), client.L(), !t.c(chain.i().h(), "GET")).w(client, chain);
            } catch (IOException e8) {
                e = e8;
                IOException iOException = e;
                h(iOException);
                throw new i(iOException);
            } catch (i e9) {
                e = e9;
                i iVar = e;
                h(iVar.c());
                throw iVar;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (i e11) {
            e = e11;
        }
    }

    /* JADX WARN: Code duplicated, block: B:56:0x012c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0146  */
    /* JADX WARN: Code duplicated, block: B:76:0x0147 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final f b(int i8, int i9, int i10, int i11, boolean z8) throws IOException {
        List listA;
        f fVar;
        Socket socketZ;
        if (this.f39297c.c()) {
            throw new IOException("Canceled");
        }
        f fVarM = this.f39297c.m();
        if (fVarM != null) {
            synchronized (fVarM) {
                try {
                    socketZ = (fVarM.p() || !g(fVarM.A().a().l())) ? this.f39297c.z() : null;
                    G g8 = G.f1419a;
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.f39297c.m() != null) {
                if (socketZ == null) {
                    return fVarM;
                }
                throw new IllegalStateException("Check failed.");
            }
            if (socketZ != null) {
                v7.d.n(socketZ);
            }
            this.f39298d.l(this.f39297c, fVarM);
        }
        this.f39301g = 0;
        this.f39302h = 0;
        this.f39303i = 0;
        if (this.f39295a.a(this.f39296b, this.f39297c, null, false)) {
            f fVarM2 = this.f39297c.m();
            t.d(fVarM2);
            this.f39298d.k(this.f39297c, fVarM2);
            return fVarM2;
        }
        D dC = this.f39304j;
        try {
            if (dC == null) {
                j.b bVar = this.f39299e;
                if (bVar != null) {
                    t.d(bVar);
                    if (bVar.b()) {
                        j.b bVar2 = this.f39299e;
                        t.d(bVar2);
                        dC = bVar2.c();
                    }
                    fVar = new f(this.f39295a, dC);
                    this.f39297c.C(fVar);
                    fVar.f(i8, i9, i10, i11, z8, this.f39297c, this.f39298d);
                    this.f39297c.C(null);
                    this.f39297c.l().w().a(fVar.A());
                    if (this.f39295a.a(this.f39296b, this.f39297c, listA, true)) {
                        f fVarM3 = this.f39297c.m();
                        t.d(fVarM3);
                        this.f39304j = dC;
                        v7.d.n(fVar.E());
                        this.f39298d.k(this.f39297c, fVarM3);
                        return fVarM3;
                    }
                    synchronized (fVar) {
                        this.f39295a.f(fVar);
                        this.f39297c.d(fVar);
                        G g9 = G.f1419a;
                    }
                    this.f39298d.k(this.f39297c, fVar);
                    return fVar;
                }
                j jVar = this.f39300f;
                if (jVar == null) {
                    jVar = new j(this.f39296b, this.f39297c.l().w(), this.f39297c, this.f39298d);
                    this.f39300f = jVar;
                }
                j.b bVarC = jVar.c();
                this.f39299e = bVarC;
                listA = bVarC.a();
                if (this.f39297c.c()) {
                    throw new IOException("Canceled");
                }
                if (this.f39295a.a(this.f39296b, this.f39297c, listA, false)) {
                    f fVarM4 = this.f39297c.m();
                    t.d(fVarM4);
                    this.f39298d.k(this.f39297c, fVarM4);
                    return fVarM4;
                }
                dC = bVarC.c();
                fVar = new f(this.f39295a, dC);
                this.f39297c.C(fVar);
                fVar.f(i8, i9, i10, i11, z8, this.f39297c, this.f39298d);
                this.f39297c.C(null);
                this.f39297c.l().w().a(fVar.A());
                if (this.f39295a.a(this.f39296b, this.f39297c, listA, true)) {
                    f fVarM5 = this.f39297c.m();
                    t.d(fVarM5);
                    this.f39304j = dC;
                    v7.d.n(fVar.E());
                    this.f39298d.k(this.f39297c, fVarM5);
                    return fVarM5;
                }
                synchronized (fVar) {
                    this.f39295a.f(fVar);
                    this.f39297c.d(fVar);
                    G g10 = G.f1419a;
                    this.f39298d.k(this.f39297c, fVar);
                    return fVar;
                }
            }
            t.d(dC);
            this.f39304j = null;
            fVar.f(i8, i9, i10, i11, z8, this.f39297c, this.f39298d);
            this.f39297c.C(null);
            this.f39297c.l().w().a(fVar.A());
            if (this.f39295a.a(this.f39296b, this.f39297c, listA, true)) {
                f fVarM6 = this.f39297c.m();
                t.d(fVarM6);
                this.f39304j = dC;
                v7.d.n(fVar.E());
                this.f39298d.k(this.f39297c, fVarM6);
                return fVarM6;
            }
            synchronized (fVar) {
                this.f39295a.f(fVar);
                this.f39297c.d(fVar);
                G g11 = G.f1419a;
                this.f39298d.k(this.f39297c, fVar);
                return fVar;
            }
        } catch (Throwable th2) {
            this.f39297c.C(null);
            throw th2;
        }
        listA = null;
        fVar = new f(this.f39295a, dC);
        this.f39297c.C(fVar);
    }

    public final f c(int i8, int i9, int i10, int i11, boolean z8, boolean z9) throws IOException {
        while (true) {
            f fVarB = b(i8, i9, i10, i11, z8);
            boolean z10 = z8;
            int i12 = i11;
            int i13 = i10;
            int i14 = i9;
            int i15 = i8;
            if (fVarB.u(z9)) {
                return fVarB;
            }
            fVarB.z();
            if (this.f39304j == null) {
                j.b bVar = this.f39299e;
                if (bVar != null ? bVar.b() : true) {
                    continue;
                } else {
                    j jVar = this.f39300f;
                    if (!(jVar != null ? jVar.a() : true)) {
                        throw new IOException("exhausted all routes");
                    }
                }
            }
            i8 = i15;
            i9 = i14;
            i10 = i13;
            i11 = i12;
            z8 = z10;
        }
    }

    public final C3041a d() {
        return this.f39296b;
    }

    public final boolean e() {
        j jVar;
        if (this.f39301g == 0 && this.f39302h == 0 && this.f39303i == 0) {
            return false;
        }
        if (this.f39304j != null) {
            return true;
        }
        D dF = f();
        if (dF != null) {
            this.f39304j = dF;
            return true;
        }
        j.b bVar = this.f39299e;
        if ((bVar == null || !bVar.b()) && (jVar = this.f39300f) != null) {
            return jVar.a();
        }
        return true;
    }

    public final D f() {
        f fVarM;
        if (this.f39301g > 1 || this.f39302h > 1 || this.f39303i > 0 || (fVarM = this.f39297c.m()) == null) {
            return null;
        }
        synchronized (fVarM) {
            if (fVarM.q() != 0) {
                return null;
            }
            if (v7.d.j(fVarM.A().a().l(), this.f39296b.l())) {
                return fVarM.A();
            }
            return null;
        }
    }

    public final boolean g(u url) {
        t.g(url, "url");
        u uVarL = this.f39296b.l();
        return url.l() == uVarL.l() && t.c(url.h(), uVarL.h());
    }

    public final void h(IOException e8) {
        t.g(e8, "e");
        this.f39304j = null;
        if ((e8 instanceof n) && ((n) e8).f1665a == C7.b.REFUSED_STREAM) {
            this.f39301g++;
        } else if (e8 instanceof C7.a) {
            this.f39302h++;
        } else {
            this.f39303i++;
        }
    }
}
