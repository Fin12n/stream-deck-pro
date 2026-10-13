package p143q0;

import A1.r;
import A1.t;
import C6.G;
import Q0.f;
import Q0.h;
import Q0.i;
import Q0.m;
import Q6.k;
import R0.B0;
import R0.F0;
import R0.InterfaceC1586f0;
import R0.R0;
import T0.g;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2248t;
import p038e1.InterfaceC2247s;
import p128o1.B;
import p128o1.C2739d;
import p128o1.E;
import p128o1.F;
import p128o1.H;
import p168t1.AbstractC3009n;
import p168t1.C;
import p168t1.y;
import p168t1.z;
import p176u1.C3029m;
import p176u1.C3036u;
import p176u1.D;
import p176u1.M;
import p176u1.O;
import p176u1.V;
import p176u1.W;
import p184v1.e;
import p216z1.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f31419a = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: q0.I$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0673a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C3029m f31420a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f31421b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ J f31422c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0673a(C3029m c3029m, k kVar, J j8) {
                super(1);
                this.f31420a = c3029m;
                this.f31421b = kVar;
                this.f31422c = j8;
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                invoke((List) obj);
                return G.f1419a;
            }

            public final void invoke(List list) {
                I.f31419a.f(list, this.f31420a, this.f31421b, (V) this.f31422c.f28779a);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2247s f31423a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC2247s interfaceC2247s) {
                super(1);
                this.f31423a = interfaceC2247s;
            }

            public final void b(float[] fArr) {
                AbstractC2248t.d(this.f31423a).C(this.f31423a, fArr);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((B0) obj).o());
                return G.f1419a;
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final W a(long j8, W w8) {
            int iB = w8.a().b(p128o1.G.n(j8));
            int iB2 = w8.a().b(p128o1.G.i(j8));
            int iMin = Math.min(iB, iB2);
            int iMax = Math.max(iB, iB2);
            C2739d.a aVar = new C2739d.a(w8.b());
            aVar.b(new B(0L, 0L, (C) null, (y) null, (z) null, (AbstractC3009n) null, (String) null, 0L, (p216z1.a) null, (o) null, (e) null, 0L, p216z1.k.f39019b.d(), (R0) null, (p128o1.y) null, (g) null, 61439, (AbstractC2633k) null), iMin, iMax);
            return new W(aVar.j(), w8.a());
        }

        public final void b(InterfaceC1586f0 interfaceC1586f0, M m8, D d8, E e8, F0 f8) throws Throwable {
            int iB;
            int iB2;
            if (!p128o1.G.h(m8.g()) && (iB = d8.b(p128o1.G.l(m8.g()))) != (iB2 = d8.b(p128o1.G.k(m8.g())))) {
                interfaceC1586f0.e(e8.z(iB, iB2), f8);
            }
            F.f30757a.a(interfaceC1586f0, e8);
        }

        public final C6.u c(E e8, long j8, t tVar, E e9) {
            E eL = e8.l(j8, tVar, e9);
            return new C6.u(Integer.valueOf(r.g(eL.B())), Integer.valueOf(r.f(eL.B())), eL);
        }

        public final void d(M m8, E e8, E e9, InterfaceC2247s interfaceC2247s, V v8, boolean z8, D d8) {
            h hVarD;
            if (z8) {
                int iB = d8.b(p128o1.G.k(m8.g()));
                if (iB < e9.l().j().length()) {
                    hVarD = e9.d(iB);
                } else {
                    hVarD = iB != 0 ? e9.d(iB - 1) : new h(0.0f, 0.0f, 1.0f, r.f(J.b(e8.j(), e8.a(), e8.b(), null, 0, 24, null)));
                }
                long jS = interfaceC2247s.S(Q0.g.a(hVarD.i(), hVarD.l()));
                v8.c(i.b(Q0.g.a(f.o(jS), f.p(jS)), m.a(hVarD.n(), hVarD.h())));
            }
        }

        public final void e(V v8, C3029m c3029m, k kVar) {
            kVar.invoke(M.d(c3029m.f(), null, 0L, null, 3, null));
            v8.a();
        }

        public final void f(List list, C3029m c3029m, k kVar, V v8) {
            M mB = c3029m.b(list);
            if (v8 != null) {
                v8.d(null, mB);
            }
            kVar.invoke(mB);
        }

        public final V g(O o8, M m8, C3029m c3029m, C3036u c3036u, k kVar, k kVar2) {
            return h(o8, m8, c3029m, c3036u, kVar, kVar2);
        }

        public final V h(O o8, M m8, C3029m c3029m, C3036u c3036u, k kVar, k kVar2) {
            J j8 = new J();
            V vD = o8.d(m8, c3036u, new C0673a(c3029m, kVar, j8), kVar2);
            j8.f28779a = vD;
            return vD;
        }

        public final void i(long j8, X x8, C3029m c3029m, D d8, k kVar) {
            kVar.invoke(M.d(c3029m.f(), null, H.a(d8.a(X.e(x8, j8, false, 2, null))), null, 5, null));
        }

        public final void j(V v8, M m8, D d8, X x8) {
            InterfaceC2247s interfaceC2247sB;
            InterfaceC2247s interfaceC2247sC = x8.c();
            if (interfaceC2247sC == null || !interfaceC2247sC.y() || (interfaceC2247sB = x8.b()) == null) {
                return;
            }
            v8.e(m8, d8, x8.f(), new b(interfaceC2247sC), p159s0.C.b(interfaceC2247sC), interfaceC2247sC.O(interfaceC2247sB, false));
        }

        public a() {
        }
    }
}
