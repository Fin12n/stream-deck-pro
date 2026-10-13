package A0;

import C6.G;
import C6.v;
import D6.z;
import java.util.List;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.B;
import p215z0.C3147d;
import p215z0.C3154g0;
import p215z0.C3156h0;
import p215z0.E0;
import p215z0.G0;
import p215z0.InterfaceC3149e;
import p215z0.T0;
import p215z0.U;
import p215z0.W0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final int d(W0 w8) {
        int iA0 = w8.a0();
        int iC0 = w8.c0();
        while (iC0 >= 0 && !w8.r0(iC0)) {
            iC0 = w8.F0(iC0);
        }
        int iJ0 = iC0 + 1;
        int iD0 = 0;
        while (iJ0 < iA0) {
            if (w8.m0(iA0, iJ0)) {
                if (w8.r0(iJ0)) {
                    iD0 = 0;
                }
                iJ0++;
            } else {
                iD0 += w8.r0(iJ0) ? 1 : w8.D0(iJ0);
                iJ0 += w8.j0(iJ0);
            }
        }
        return iD0;
    }

    public static final int e(W0 w8, C3147d c3147d, InterfaceC3149e interfaceC3149e) {
        int iG = w8.G(c3147d);
        AbstractC3169o.U(w8.a0() < iG);
        f(w8, interfaceC3149e, iG);
        int iD = d(w8);
        while (w8.a0() < iG) {
            if (w8.l0(iG)) {
                if (w8.q0()) {
                    interfaceC3149e.d(w8.B0(w8.a0()));
                    iD = 0;
                }
                w8.c1();
            } else {
                iD += w8.V0();
            }
        }
        AbstractC3169o.U(w8.a0() == iG);
        return iD;
    }

    public static final void f(W0 w8, InterfaceC3149e interfaceC3149e, int i8) {
        while (!w8.n0(i8)) {
            w8.W0();
            if (w8.r0(w8.c0())) {
                interfaceC3149e.g();
            }
            w8.T();
        }
    }

    public static final void g(B b8, AbstractC3173q abstractC3173q, C3156h0 c3156h0, W0 w8) {
        T0 t8 = new T0();
        W0 w0K = t8.K();
        try {
            w0K.I();
            w0K.d1(126665345, c3156h0.c());
            W0.t0(w0K, 0, 1, null);
            w0K.h1(c3156h0.f());
            List listA0 = w8.A0(c3156h0.a(), 1, w0K);
            w0K.V0();
            w0K.T();
            w0K.U();
            w0K.L();
            C3154g0 c3154g0 = new C3154g0(t8);
            E0.a aVar = E0.f38529h;
            if (aVar.b(t8, listA0)) {
                a aVar2 = new a(b8, c3156h0);
                W0 w0K2 = t8.K();
                try {
                    aVar.a(w0K2, listA0, aVar2);
                    G g8 = G.f1419a;
                    w0K2.L();
                } catch (Throwable th) {
                    w0K2.L();
                    throw th;
                }
            }
            abstractC3173q.l(c3156h0, c3154g0);
        } catch (Throwable th2) {
            w0K.L();
            throw th2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements G0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B f406a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3156h0 f407b;

        public a(B b8, C3156h0 c3156h0) {
            this.f406a = b8;
            this.f407b = c3156h0;
        }

        @Override // p215z0.G0
        public U c(E0 e8, Object obj) {
            U uC;
            B b8 = this.f406a;
            Object obj2 = null;
            G0 g8 = b8 instanceof G0 ? (G0) b8 : null;
            if (g8 == null || (uC = g8.c(e8, obj)) == null) {
                uC = U.IGNORED;
            }
            if (uC != U.IGNORED) {
                return uC;
            }
            C3156h0 c3156h0 = this.f407b;
            List listD = c3156h0.d();
            if (obj != null) {
                B0.b bVar = new B0.b();
                bVar.add(bVar);
                obj2 = bVar;
            }
            c3156h0.h(z.C0(listD, v.a(e8, obj2)));
            return U.SCHEDULED;
        }

        @Override // p215z0.G0
        public void a(Object obj) {
        }

        @Override // p215z0.G0
        public void j(E0 e8) {
        }
    }
}
