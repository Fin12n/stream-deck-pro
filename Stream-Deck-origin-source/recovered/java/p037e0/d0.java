package p037e0;

import C6.G;
import C6.r;
import H.FL.dCqzKmEghGTQ;
import Q6.k;
import Q6.o;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.C2635m;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3150e0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f20154a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ j0 f20155b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(o oVar, j0 j0Var) {
            super(1);
            this.f20154a = oVar;
            this.f20155b = j0Var;
        }

        public final void b(C2212h c2212h) {
            this.f20154a.invoke(c2212h.e(), this.f20155b.b().invoke(c2212h.g()));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2212h) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f20156a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f20157b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f20158c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f20159d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f20160e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f20161f;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f20160e = obj;
            this.f20161f |= Integer.MIN_VALUE;
            return d0.c(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f20163a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f20164b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2208d f20165c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ AbstractC2221q f20166d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C2215k f20167e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ float f20168f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ k f20169g;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ C2215k f20170a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C2215k c2215k) {
                super(0);
                this.f20170a = c2215k;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m191invoke() {
                this.f20170a.D(false);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() {
                m191invoke();
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(J j8, Object obj, InterfaceC2208d interfaceC2208d, AbstractC2221q abstractC2221q, C2215k c2215k, float f8, k kVar) {
            super(1);
            this.f20163a = j8;
            this.f20164b = obj;
            this.f20165c = interfaceC2208d;
            this.f20166d = abstractC2221q;
            this.f20167e = c2215k;
            this.f20168f = f8;
            this.f20169g = kVar;
        }

        public final void b(long j8) {
            J j9 = this.f20163a;
            C2212h c2212h = new C2212h(this.f20164b, this.f20165c.c(), this.f20166d, j8, this.f20165c.g(), j8, true, new a(this.f20167e));
            d0.m(c2212h, j8, this.f20168f, this.f20165c, this.f20167e, this.f20169g);
            j9.f28779a = c2212h;
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).longValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2215k f20171a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(C2215k c2215k) {
            super(0);
            this.f20171a = c2215k;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m192invoke() {
            this.f20171a.D(false);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m192invoke();
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f20172a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ float f20173b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2208d f20174c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C2215k f20175d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ k f20176e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(J j8, float f8, InterfaceC2208d interfaceC2208d, C2215k c2215k, k kVar) {
            super(1);
            this.f20172a = j8;
            this.f20173b = f8;
            this.f20174c = interfaceC2208d;
            this.f20175d = c2215k;
            this.f20176e = kVar;
        }

        public final void b(long j8) {
            Object obj = this.f20172a.f28779a;
            t.d(obj);
            d0.m((C2212h) obj, j8, this.f20173b, this.f20174c, this.f20175d, this.f20176e);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((Number) obj).longValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f20179a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(k kVar) {
            super(1);
            this.f20179a = kVar;
        }

        public final Object b(long j8) {
            return this.f20179a.invoke(Long.valueOf(j8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).longValue());
        }
    }

    public static final Object b(float f8, float f9, float f10, InterfaceC2213i interfaceC2213i, o oVar, G6.d dVar) {
        Object objD = d(l0.i(C2635m.f28814a), I6.b.c(f8), I6.b.c(f9), I6.b.c(f10), interfaceC2213i, oVar, dVar);
        return objD == H6.c.f() ? objD : G.f1419a;
    }

    public static final Object d(j0 j0Var, Object obj, Object obj2, Object obj3, InterfaceC2213i interfaceC2213i, o oVar, G6.d dVar) {
        AbstractC2221q abstractC2221qG;
        if (obj3 == null || (abstractC2221qG = (AbstractC2221q) j0Var.a().invoke(obj3)) == null) {
            abstractC2221qG = r.g((AbstractC2221q) j0Var.a().invoke(obj));
        }
        AbstractC2221q abstractC2221q = abstractC2221qG;
        Object objF = f(new C2215k(j0Var, obj, abstractC2221q, 0L, 0L, false, 56, null), new e0(interfaceC2213i, j0Var, obj, obj2, abstractC2221q), 0L, new a(oVar, j0Var), dVar, 2, null);
        return objF == H6.c.f() ? objF : G.f1419a;
    }

    public static /* synthetic */ Object e(float f8, float f9, float f10, InterfaceC2213i interfaceC2213i, o oVar, G6.d dVar, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            f10 = 0.0f;
        }
        if ((i8 & 8) != 0) {
            interfaceC2213i = AbstractC2214j.g(0.0f, 0.0f, null, 7, null);
        }
        return b(f8, f9, f10, interfaceC2213i, oVar, dVar);
    }

    public static /* synthetic */ Object f(C2215k c2215k, InterfaceC2208d interfaceC2208d, long j8, k kVar, G6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            j8 = Long.MIN_VALUE;
        }
        long j9 = j8;
        if ((i8 & 4) != 0) {
            kVar = c.f20162a;
        }
        return c(c2215k, interfaceC2208d, j9, kVar, dVar);
    }

    public static final Object g(C2215k c2215k, InterfaceC2227x interfaceC2227x, boolean z8, k kVar, G6.d dVar) {
        Object objC = c(c2215k, new C2226w(interfaceC2227x, c2215k.o(), c2215k.getValue(), c2215k.s()), z8 ? c2215k.e() : Long.MIN_VALUE, kVar, dVar);
        return objC == H6.c.f() ? objC : G.f1419a;
    }

    public static /* synthetic */ Object h(C2215k c2215k, InterfaceC2227x interfaceC2227x, boolean z8, k kVar, G6.d dVar, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        if ((i8 & 4) != 0) {
            kVar = g.f20177a;
        }
        return g(c2215k, interfaceC2227x, z8, kVar, dVar);
    }

    public static final Object i(C2215k c2215k, Object obj, InterfaceC2213i interfaceC2213i, boolean z8, k kVar, G6.d dVar) {
        Object objC = c(c2215k, new e0(interfaceC2213i, c2215k.o(), c2215k.getValue(), obj, c2215k.s()), z8 ? c2215k.e() : Long.MIN_VALUE, kVar, dVar);
        return objC == H6.c.f() ? objC : G.f1419a;
    }

    public static /* synthetic */ Object j(C2215k c2215k, Object obj, InterfaceC2213i interfaceC2213i, boolean z8, k kVar, G6.d dVar, int i8, Object obj2) {
        if ((i8 & 2) != 0) {
            interfaceC2213i = AbstractC2214j.g(0.0f, 0.0f, null, 7, null);
        }
        InterfaceC2213i interfaceC2213i2 = interfaceC2213i;
        if ((i8 & 4) != 0) {
            z8 = false;
        }
        boolean z9 = z8;
        if ((i8 & 8) != 0) {
            kVar = h.f20178a;
        }
        return i(c2215k, obj, interfaceC2213i2, z9, kVar, dVar);
    }

    public static final Object k(InterfaceC2208d interfaceC2208d, k kVar, G6.d dVar) {
        return interfaceC2208d.a() ? J.a(kVar, dVar) : AbstractC3150e0.c(new i(kVar), dVar);
    }

    public static final void l(C2212h c2212h, long j8, long j9, InterfaceC2208d interfaceC2208d, C2215k c2215k, k kVar) {
        c2212h.j(j8);
        c2212h.l(interfaceC2208d.f(j9));
        c2212h.m(interfaceC2208d.d(j9));
        if (interfaceC2208d.e(j9)) {
            c2212h.i(c2212h.c());
            c2212h.k(false);
        }
        o(c2212h, c2215k);
        kVar.invoke(c2212h);
    }

    public static final void m(C2212h c2212h, long j8, float f8, InterfaceC2208d interfaceC2208d, C2215k c2215k, k kVar) {
        l(c2212h, j8, f8 == 0.0f ? interfaceC2208d.b() : (long) ((j8 - c2212h.d()) / f8), interfaceC2208d, c2215k, kVar);
    }

    public static final float n(G6.g gVar) {
        L0.k kVar = (L0.k) gVar.A(L0.k.f4851K);
        float fA0 = kVar != null ? kVar.A0() : 1.0f;
        if (fA0 >= 0.0f) {
            return fA0;
        }
        throw new IllegalStateException("negative scale factor");
    }

    public static final void o(C2212h c2212h, C2215k c2215k) {
        c2215k.E(c2212h.e());
        r.f(c2215k.s(), c2212h.g());
        c2215k.B(c2212h.b());
        c2215k.C(c2212h.c());
        c2215k.D(c2212h.h());
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0130  */
    /* JADX WARN: Code duplicated, block: B:62:0x0139  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public static final Object c(C2215k c2215k, InterfaceC2208d interfaceC2208d, long j8, k kVar, G6.d dVar) {
        b bVar;
        J j9;
        C2215k c2215k2;
        C2215k c2215k3;
        J j10;
        k kVar2;
        C2212h c2212h;
        C2212h c2212h2;
        f fVar;
        InterfaceC2208d interfaceC2208d2 = interfaceC2208d;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f20161f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f20161f = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f20160e;
        Object objF = H6.c.f();
        int i9 = bVar2.f20161f;
        if (i9 == 0) {
            r.b(obj);
            Object objF2 = interfaceC2208d2.f(0L);
            AbstractC2221q abstractC2221qD = interfaceC2208d2.d(0L);
            j9 = new J();
            if (j8 == Long.MIN_VALUE) {
                try {
                    c2215k2 = c2215k;
                    try {
                        d dVar2 = new d(j9, objF2, interfaceC2208d2, abstractC2221qD, c2215k2, n(bVar2.getContext()), kVar);
                        j10 = j9;
                        try {
                            bVar2.f20156a = c2215k2;
                            bVar2.f20157b = interfaceC2208d2;
                            bVar2.f20158c = kVar;
                            bVar2.f20159d = j10;
                            bVar2.f20161f = 1;
                            if (k(interfaceC2208d2, dVar2, bVar2) != objF) {
                                c2215k3 = c2215k2;
                                kVar2 = kVar;
                                j9 = j10;
                            }
                            return objF;
                        } catch (CancellationException e8) {
                            e = e8;
                            c2215k3 = c2215k2;
                            j9 = j10;
                            c2212h = (C2212h) j9.f28779a;
                            if (c2212h != null) {
                                c2212h.k(false);
                            }
                            c2212h2 = (C2212h) j9.f28779a;
                            if (c2212h2 != null && c2212h2.c() == c2215k3.e()) {
                                c2215k3.D(false);
                            }
                            throw e;
                        }
                    } catch (CancellationException e9) {
                        e = e9;
                        c2215k3 = c2215k2;
                        c2212h = (C2212h) j9.f28779a;
                        if (c2212h != null) {
                            c2212h.k(false);
                        }
                        c2212h2 = (C2212h) j9.f28779a;
                        if (c2212h2 != null) {
                            c2215k3.D(false);
                        }
                        throw e;
                    }
                } catch (CancellationException e10) {
                    e = e10;
                    c2215k2 = c2215k;
                }
            } else {
                j10 = j9;
                try {
                    C2212h c2212h3 = new C2212h(objF2, interfaceC2208d2.c(), abstractC2221qD, j8, interfaceC2208d2.g(), j8, true, new e(c2215k));
                    m(c2212h3, j8, n(bVar2.getContext()), interfaceC2208d2, c2215k, kVar);
                    j10.f28779a = c2212h3;
                    c2215k3 = c2215k;
                    interfaceC2208d2 = interfaceC2208d;
                    kVar2 = kVar;
                    j9 = j10;
                } catch (CancellationException e11) {
                    e = e11;
                    c2215k3 = c2215k;
                    j9 = j10;
                    c2212h = (C2212h) j9.f28779a;
                    if (c2212h != null) {
                        c2212h.k(false);
                    }
                    c2212h2 = (C2212h) j9.f28779a;
                    if (c2212h2 != null) {
                        c2215k3.D(false);
                    }
                    throw e;
                }
            }
        } else {
            if (i9 != 1 && i9 != 2) {
                throw new IllegalStateException(dCqzKmEghGTQ.NORjaXx);
            }
            j9 = (J) bVar2.f20159d;
            kVar2 = (k) bVar2.f20158c;
            interfaceC2208d2 = (InterfaceC2208d) bVar2.f20157b;
            c2215k3 = (C2215k) bVar2.f20156a;
            try {
                r.b(obj);
            } catch (CancellationException e12) {
                e = e12;
                c2212h = (C2212h) j9.f28779a;
                if (c2212h != null) {
                    c2212h.k(false);
                }
                c2212h2 = (C2212h) j9.f28779a;
                if (c2212h2 != null) {
                    c2215k3.D(false);
                }
                throw e;
            }
        }
        do {
            Object obj2 = j9.f28779a;
            t.d(obj2);
            if (!((C2212h) obj2).h()) {
                return G.f1419a;
            }
            J j11 = j9;
            k kVar3 = kVar2;
            InterfaceC2208d interfaceC2208d3 = interfaceC2208d2;
            C2215k c2215k4 = c2215k3;
            try {
                fVar = new f(j11, n(bVar2.getContext()), interfaceC2208d3, c2215k4, kVar3);
                j9 = j11;
                interfaceC2208d2 = interfaceC2208d3;
                c2215k3 = c2215k4;
                kVar2 = kVar3;
                bVar2.f20156a = c2215k3;
                bVar2.f20157b = interfaceC2208d2;
                bVar2.f20158c = kVar2;
                bVar2.f20159d = j9;
                bVar2.f20161f = 2;
            } catch (CancellationException e13) {
                e = e13;
                j9 = j11;
                c2215k3 = c2215k4;
                c2212h = (C2212h) j9.f28779a;
                if (c2212h != null) {
                    c2212h.k(false);
                }
                c2212h2 = (C2212h) j9.f28779a;
                if (c2212h2 != null) {
                    c2215k3.D(false);
                }
                throw e;
            }
        } while (k(interfaceC2208d2, fVar, bVar2) != objF);
        return objF;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f20162a = new c();

        public c() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2212h) obj);
            return G.f1419a;
        }

        public final void b(C2212h c2212h) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f20177a = new g();

        public g() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2212h) obj);
            return G.f1419a;
        }

        public final void b(C2212h c2212h) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f20178a = new h();

        public h() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2212h) obj);
            return G.f1419a;
        }

        public final void b(C2212h c2212h) {
        }
    }
}
