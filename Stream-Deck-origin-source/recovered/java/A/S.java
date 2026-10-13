package A;

import H.AbstractC0994n0;
import H.C1011w0;
import H.InterfaceC0984i0;
import H.InterfaceC1015y0;
import H.InterfaceC1017z0;
import H.c1;
import H.g1;
import H.u1;
import H.v1;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.OnePixelShiftQuirk;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class S extends T0 {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final d f120A = new d();

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final Boolean f121B = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Object f122r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public V f123s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Executor f124t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public a f125u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public Rect f126v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Matrix f127w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c1.b f128x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public AbstractC0994n0 f129y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public c1.c f130z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        default Size a() {
            return null;
        }

        void c(androidx.camera.core.d dVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @Retention(RetentionPolicy.SOURCE)
    public @interface b {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements u1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H.O0 f131a;

        public c() {
            this(H.O0.i0());
        }

        public static c d(InterfaceC0984i0 interfaceC0984i0) {
            return new c(H.O0.j0(interfaceC0984i0));
        }

        @Override // A.K
        public H.N0 a() {
            return this.f131a;
        }

        public S c() {
            C1011w0 c1011w0B = b();
            InterfaceC1017z0.k(c1011w0B);
            return new S(c1011w0B);
        }

        @Override // H.u1.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1011w0 b() {
            return new C1011w0(H.T0.h0(this.f131a));
        }

        public c f(v1.b bVar) {
            a().L(u1.f3222G, bVar);
            return this;
        }

        public c g(Size size) {
            a().L(InterfaceC1017z0.f3291r, size);
            return this;
        }

        public c h(J j8) {
            if (!Objects.equals(J.f88d, j8)) {
                throw new UnsupportedOperationException("ImageAnalysis currently only supports SDR");
            }
            a().L(InterfaceC1015y0.f3285l, j8);
            return this;
        }

        public c i(T.c cVar) {
            a().L(InterfaceC1017z0.f3294u, cVar);
            return this;
        }

        public c j(int i8) {
            a().L(u1.f3216A, Integer.valueOf(i8));
            return this;
        }

        public c k(int i8) {
            if (i8 == -1) {
                i8 = 0;
            }
            a().L(InterfaceC1017z0.f3286m, Integer.valueOf(i8));
            return this;
        }

        public c l(Class cls) {
            a().L(L.q.f4795N, cls);
            if (a().f(L.q.f4794M, null) == null) {
                m(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public c m(String str) {
            a().L(L.q.f4794M, str);
            return this;
        }

        public c(H.O0 o8) {
            this.f131a = o8;
            Class cls = (Class) o8.f(L.q.f4795N, null);
            if (cls == null || cls.equals(S.class)) {
                f(v1.b.IMAGE_ANALYSIS);
                l(S.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Size f132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final J f133b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final T.c f134c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C1011w0 f135d;

        static {
            Size size = new Size(640, 480);
            f132a = size;
            J j8 = J.f88d;
            f133b = j8;
            T.c cVarA = new T.c.a().d(T.a.f9781c).f(new T.d(P.d.f8831c, 1)).a();
            f134c = cVarA;
            f135d = new c().g(size).j(1).k(0).i(cVarA).h(j8).b();
        }

        public C1011w0 a() {
            return f135d;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    @Retention(RetentionPolicy.SOURCE)
    public @interface e {
    }

    public S(C1011w0 c1011w0) {
        super(c1011w0);
        this.f122r = new Object();
    }

    public static /* synthetic */ void d0(androidx.camera.core.f fVar, androidx.camera.core.f fVar2) {
        fVar.d();
        if (fVar2 != null) {
            fVar2.d();
        }
    }

    public static /* synthetic */ void e0(S s8, V v8, c1 c1Var, c1.g gVar) {
        if (s8.i() == null) {
            return;
        }
        s8.h0();
        v8.f();
        c1.b bVarI0 = s8.i0(s8.k(), (C1011w0) s8.l(), (g1) T1.f.g(s8.g()));
        s8.f128x = bVarI0;
        s8.a0(M.a(new Object[]{bVarI0.p()}));
        s8.K();
    }

    public static /* synthetic */ List g0(Size size, List list, int i8) {
        ArrayList arrayList = new ArrayList(list);
        if (arrayList.contains(size)) {
            arrayList.remove(size);
            arrayList.add(0, size);
        }
        return arrayList;
    }

    @Override // A.T0
    public u1.b D(InterfaceC0984i0 interfaceC0984i0) {
        return c.d(interfaceC0984i0);
    }

    @Override // A.T0
    public u1 O(H.I i8, u1.b bVar) {
        final Size sizeA;
        synchronized (this.f122r) {
            try {
                a aVar = this.f125u;
                sizeA = aVar != null ? aVar.a() : null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (sizeA == null) {
            return bVar.b();
        }
        if (i8.l(((Integer) bVar.a().f(InterfaceC1017z0.f3287n, 0)).intValue()) % 180 == 90) {
            sizeA = new Size(sizeA.getHeight(), sizeA.getWidth());
        }
        u1 u1VarB = bVar.b();
        InterfaceC0984i0.a aVar2 = InterfaceC1017z0.f3290q;
        if (!u1VarB.e(aVar2)) {
            bVar.a().L(aVar2, sizeA);
        }
        u1 u1VarB2 = bVar.b();
        InterfaceC0984i0.a aVar3 = InterfaceC1017z0.f3294u;
        if (u1VarB2.e(aVar3)) {
            T.c cVar = (T.c) e().f(aVar3, null);
            T.c.a aVar4 = cVar == null ? new T.c.a() : T.c.a.b(cVar);
            if (cVar == null || cVar.d() == null) {
                aVar4.f(new T.d(sizeA, 1));
            }
            if (cVar == null) {
                aVar4.e(new T.b() { // from class: A.O
                    @Override // T.b
                    public final List a(List list, int i9) {
                        return S.g0(sizeA, list, i9);
                    }
                });
            }
            bVar.a().L(aVar3, aVar4.a());
        }
        return bVar.b();
    }

    @Override // A.T0
    public g1 R(InterfaceC0984i0 interfaceC0984i0) {
        this.f128x.g(interfaceC0984i0);
        a0(M.a(new Object[]{this.f128x.p()}));
        return g().i().d(interfaceC0984i0).a();
    }

    @Override // A.T0
    public g1 S(g1 g1Var, g1 g1Var2) {
        AbstractC0890p0.a("ImageAnalysis", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + g1Var + ", secondaryStreamSpec " + g1Var2);
        c1.b bVarI0 = i0(k(), (C1011w0) l(), g1Var);
        this.f128x = bVarI0;
        a0(M.a(new Object[]{bVarI0.p()}));
        return g1Var;
    }

    @Override // A.T0
    public void T() {
        h0();
        synchronized (this.f122r) {
            this.f123s.i();
            this.f123s = null;
        }
    }

    @Override // A.T0
    public void X(Matrix matrix) {
        super.X(matrix);
        synchronized (this.f122r) {
            try {
                V v8 = this.f123s;
                if (v8 != null) {
                    v8.u(matrix);
                }
                this.f127w = matrix;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A.T0
    public void Y(Rect rect) {
        super.Y(rect);
        synchronized (this.f122r) {
            try {
                V v8 = this.f123s;
                if (v8 != null) {
                    v8.v(rect);
                }
                this.f126v = rect;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void h0() {
        I.w.b();
        c1.c cVar = this.f130z;
        if (cVar != null) {
            cVar.b();
            this.f130z = null;
        }
        AbstractC0994n0 abstractC0994n0 = this.f129y;
        if (abstractC0994n0 != null) {
            abstractC0994n0.d();
            this.f129y = null;
        }
    }

    public c1.b i0(String str, C1011w0 c1011w0, g1 g1Var) {
        final V v8;
        I.w.b();
        Size sizeF = g1Var.f();
        Executor executor = (Executor) T1.f.g(c1011w0.b0(J.a.b()));
        boolean z8 = true;
        int iK0 = j0() == 1 ? k0() : 4;
        c1011w0.h0();
        final androidx.camera.core.f fVar = new androidx.camera.core.f(AbstractC0882l0.a(sizeF.getWidth(), sizeF.getHeight(), p(), iK0));
        synchronized (this.f122r) {
            p0();
            v8 = this.f123s;
        }
        boolean zN0 = i() != null ? n0(i()) : false;
        int height = zN0 ? sizeF.getHeight() : sizeF.getWidth();
        int width = zN0 ? sizeF.getWidth() : sizeF.getHeight();
        int i8 = m0() == 2 ? 1 : 35;
        boolean z9 = p() == 35 && m0() == 2;
        boolean z10 = p() == 35 && m0() == 3;
        if (p() != 35 || ((i() == null || t(i()) == 0) && !Boolean.TRUE.equals(l0()))) {
            z8 = false;
        }
        final androidx.camera.core.f fVar2 = (z9 || (z8 && !z10)) ? new androidx.camera.core.f(AbstractC0882l0.a(height, width, i8, fVar.l())) : null;
        if (fVar2 != null) {
            v8.s(fVar2);
        }
        r0();
        fVar.i(v8, executor);
        c1.b bVarQ = c1.b.q(c1011w0, g1Var.f());
        if (g1Var.d() != null) {
            bVarQ.g(g1Var.d());
        }
        AbstractC0994n0 abstractC0994n0 = this.f129y;
        if (abstractC0994n0 != null) {
            abstractC0994n0.d();
        }
        H.B0 b8 = new H.B0(fVar.getSurface(), sizeF, p());
        this.f129y = b8;
        b8.k().a(new Runnable() { // from class: A.P
            @Override // java.lang.Runnable
            public final void run() {
                S.d0(fVar, fVar2);
            }
        }, J.a.d());
        bVarQ.x(g1Var.g());
        b(bVarQ, g1Var);
        bVarQ.n(this.f129y, g1Var.b(), null, -1);
        c1.c cVar = this.f130z;
        if (cVar != null) {
            cVar.b();
        }
        c1.c cVar2 = new c1.c(new c1.d() { // from class: A.Q
            @Override // H.c1.d
            public final void a(c1 c1Var, c1.g gVar) {
                S.e0(this.f114a, v8, c1Var, gVar);
            }
        });
        this.f130z = cVar2;
        bVarQ.r(cVar2);
        return bVarQ;
    }

    public int j0() {
        return ((C1011w0) l()).f0(0);
    }

    public int k0() {
        return ((C1011w0) l()).g0(6);
    }

    public Boolean l0() {
        return ((C1011w0) l()).i0(f121B);
    }

    @Override // A.T0
    public u1 m(boolean z8, v1 v1Var) {
        d dVar = f120A;
        InterfaceC0984i0 interfaceC0984i0A = v1Var.a(dVar.a().O(), 1);
        if (z8) {
            interfaceC0984i0A = InterfaceC0984i0.p(interfaceC0984i0A, dVar.a());
        }
        if (interfaceC0984i0A == null) {
            return null;
        }
        return D(interfaceC0984i0A).b();
    }

    public int m0() {
        return ((C1011w0) l()).j0(1);
    }

    public final boolean n0(H.J j8) {
        return o0() && t(j8) % 180 != 0;
    }

    public boolean o0() {
        return ((C1011w0) l()).k0(Boolean.FALSE).booleanValue();
    }

    public final void p0() {
        a aVar;
        synchronized (this.f122r) {
            try {
                C1011w0 c1011w0 = (C1011w0) l();
                if (c1011w0.f0(0) == 1) {
                    this.f123s = new W();
                } else {
                    this.f123s = new androidx.camera.core.c(c1011w0.b0(J.a.b()));
                }
                this.f123s.q(m0());
                this.f123s.r(o0());
                H.J jI = i();
                Boolean boolL0 = l0();
                boolean zA = jI != null ? jI.r().o().a(OnePixelShiftQuirk.class) : false;
                V v8 = this.f123s;
                if (boolL0 != null) {
                    zA = boolL0.booleanValue();
                }
                v8.p(zA);
                if (jI != null) {
                    this.f123s.t(t(jI));
                }
                Rect rect = this.f126v;
                if (rect != null) {
                    this.f123s.v(rect);
                }
                Matrix matrix = this.f127w;
                if (matrix != null) {
                    this.f123s.u(matrix);
                }
                Executor executor = this.f124t;
                if (executor != null && (aVar = this.f125u) != null) {
                    this.f123s.o(executor, aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void q0(Executor executor, final a aVar) {
        synchronized (this.f122r) {
            try {
                V v8 = this.f123s;
                if (v8 != null) {
                    v8.o(executor, new a() { // from class: A.N
                        @Override // A.S.a
                        public final void c(androidx.camera.core.d dVar) {
                            aVar.c(dVar);
                        }
                    });
                }
                if (this.f125u == null) {
                    I();
                }
                this.f124t = executor;
                this.f125u = aVar;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void r0() {
        synchronized (this.f122r) {
            try {
                H.J jI = i();
                if (jI != null) {
                    this.f123s.t(t(jI));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "ImageAnalysis:" + r();
    }
}
