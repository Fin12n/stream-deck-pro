package x7;

import A7.f;
import A7.h;
import J7.A;
import J7.C;
import J7.C1034e;
import J7.D;
import J7.InterfaceC1035f;
import J7.g;
import J7.p;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.AbstractC2633k;
import p179u4.eubL.OjEsfyJYzbPn;
import u7.B;
import u7.C3043c;
import u7.InterfaceC3045e;
import u7.r;
import u7.t;
import u7.v;
import u7.y;
import u7.z;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements v {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C0843a f37449b = new C0843a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3043c f37450a;

    /* JADX INFO: renamed from: x7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0843a {
        public /* synthetic */ C0843a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final t c(t tVar, t tVar2) {
            t.a aVar = new t.a();
            int size = tVar.size();
            for (int i8 = 0; i8 < size; i8++) {
                String strM = tVar.m(i8);
                String strU = tVar.u(i8);
                if ((!Z6.v.v("Warning", strM, true) || !Z6.v.H(strU, "1", false, 2, null)) && (d(strM) || !e(strM) || tVar2.c(strM) == null)) {
                    aVar.c(strM, strU);
                }
            }
            int size2 = tVar2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                String strM2 = tVar2.m(i9);
                if (!d(strM2) && e(strM2)) {
                    aVar.c(strM2, tVar2.u(i9));
                }
            }
            return aVar.d();
        }

        public final boolean d(String str) {
            return Z6.v.v("Content-Length", str, true) || Z6.v.v("Content-Encoding", str, true) || Z6.v.v("Content-Type", str, true);
        }

        public final B f(B b8) {
            return (b8 != null ? b8.b() : null) != null ? b8.r0().b(null).c() : b8;
        }

        public C0843a() {
        }

        public final boolean e(String str) {
            return (Z6.v.v("Connection", str, true) || Z6.v.v(ajyWhveMDgQ.OwkDkaidESzyz, str, true) || Z6.v.v("Proxy-Authenticate", str, true) || Z6.v.v("Proxy-Authorization", str, true) || Z6.v.v(OjEsfyJYzbPn.JYpRFjxahGBtxL, str, true) || Z6.v.v("Trailers", str, true) || Z6.v.v("Transfer-Encoding", str, true) || Z6.v.v("Upgrade", str, true)) ? false : true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements C {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f37451a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f37452b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ x7.b f37453c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1035f f37454d;

        public b(g gVar, x7.b bVar, InterfaceC1035f interfaceC1035f) {
            this.f37452b = gVar;
            this.f37453c = bVar;
            this.f37454d = interfaceC1035f;
        }

        @Override // J7.C
        public long K0(C1034e sink, long j8) throws IOException {
            kotlin.jvm.internal.t.g(sink, "sink");
            try {
                long jK0 = this.f37452b.K0(sink, j8);
                if (jK0 != -1) {
                    sink.i0(this.f37454d.l(), sink.size() - jK0, jK0);
                    this.f37454d.o0();
                    return jK0;
                }
                if (!this.f37451a) {
                    this.f37451a = true;
                    this.f37454d.close();
                }
                return -1L;
            } catch (IOException e8) {
                if (this.f37451a) {
                    throw e8;
                }
                this.f37451a = true;
                this.f37453c.a();
                throw e8;
            }
        }

        @Override // J7.C, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            if (!this.f37451a && !v7.d.s(this, 100, TimeUnit.MILLISECONDS)) {
                this.f37451a = true;
                this.f37453c.a();
            }
            this.f37452b.close();
        }

        @Override // J7.C
        public D r() {
            return this.f37452b.r();
        }
    }

    public a(C3043c c3043c) {
        this.f37450a = c3043c;
    }

    @Override // u7.v
    public B a(v.a chain) throws IllegalAccessException, InvocationTargetException {
        r rVarN;
        u7.C cB;
        u7.C cB2;
        u7.C cB3;
        kotlin.jvm.internal.t.g(chain, "chain");
        InterfaceC3045e interfaceC3045eCall = chain.call();
        C3043c c3043c = this.f37450a;
        B bC = c3043c != null ? c3043c.c(chain.b()) : null;
        c cVarB = new c.b(System.currentTimeMillis(), chain.b(), bC).b();
        z zVarB = cVarB.b();
        B bA = cVarB.a();
        C3043c c3043c2 = this.f37450a;
        if (c3043c2 != null) {
            c3043c2.Y(cVarB);
        }
        z7.e eVar = interfaceC3045eCall instanceof z7.e ? (z7.e) interfaceC3045eCall : null;
        if (eVar == null || (rVarN = eVar.n()) == null) {
            rVarN = r.f34806b;
        }
        if (bC != null && bA == null && (cB3 = bC.b()) != null) {
            v7.d.m(cB3);
        }
        if (zVarB == null && bA == null) {
            B bC2 = new B.a().r(chain.b()).p(y.HTTP_1_1).g(504).m("Unsatisfiable Request (only-if-cached)").b(v7.d.f35181c).s(-1L).q(System.currentTimeMillis()).c();
            rVarN.A(interfaceC3045eCall, bC2);
            return bC2;
        }
        if (zVarB == null) {
            kotlin.jvm.internal.t.d(bA);
            B bC3 = bA.r0().d(f37449b.f(bA)).c();
            rVarN.b(interfaceC3045eCall, bC3);
            return bC3;
        }
        if (bA != null) {
            rVarN.a(interfaceC3045eCall, bA);
        } else if (this.f37450a != null) {
            rVarN.c(interfaceC3045eCall);
        }
        try {
            B bA2 = chain.a(zVarB);
            if (bA2 == null && bC != null && (cB2 = bC.b()) != null) {
                v7.d.m(cB2);
            }
            if (bA != null) {
                if (bA2 != null && bA2.t() == 304) {
                    B.a aVarR0 = bA.r0();
                    C0843a c0843a = f37449b;
                    B bC4 = aVarR0.k(c0843a.c(bA.Y(), bA2.Y())).s(bA2.L0()).q(bA2.H0()).d(c0843a.f(bA)).n(c0843a.f(bA2)).c();
                    u7.C cB4 = bA2.b();
                    kotlin.jvm.internal.t.d(cB4);
                    cB4.close();
                    C3043c c3043c3 = this.f37450a;
                    kotlin.jvm.internal.t.d(c3043c3);
                    c3043c3.A();
                    this.f37450a.i0(bA, bC4);
                    rVarN.b(interfaceC3045eCall, bC4);
                    return bC4;
                }
                u7.C cB5 = bA.b();
                if (cB5 != null) {
                    v7.d.m(cB5);
                }
            }
            kotlin.jvm.internal.t.d(bA2);
            B.a aVarR1 = bA2.r0();
            C0843a c0843a2 = f37449b;
            B bC5 = aVarR1.d(c0843a2.f(bA)).n(c0843a2.f(bA2)).c();
            if (this.f37450a != null) {
                if (A7.e.b(bC5) && c.f37455c.a(bC5, zVarB)) {
                    B b8 = b(this.f37450a.t(bC5), bC5);
                    if (bA != null) {
                        rVarN.c(interfaceC3045eCall);
                    }
                    return b8;
                }
                if (f.f867a.a(zVarB.h())) {
                    try {
                        this.f37450a.v(zVarB);
                    } catch (IOException unused) {
                    }
                }
            }
            return bC5;
        } catch (Throwable th) {
            if (bC != null && (cB = bC.b()) != null) {
                v7.d.m(cB);
            }
            throw th;
        }
    }

    public final B b(x7.b bVar, B b8) {
        if (bVar == null) {
            return b8;
        }
        A aB = bVar.b();
        u7.C cB = b8.b();
        kotlin.jvm.internal.t.d(cB);
        b bVar2 = new b(cB.c(), bVar, p.c(aB));
        return b8.r0().b(new h(B.A(b8, "Content-Type", null, 2, null), b8.b().b(), p.d(bVar2))).c();
    }
}
