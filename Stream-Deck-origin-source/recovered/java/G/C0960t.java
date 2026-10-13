package G;

import A.AbstractC0882l0;
import A.AbstractC0890p0;
import A.C0868e0;
import A.InterfaceC0880k0;
import H.A0;
import H.AbstractC0994n0;
import H.AbstractC0995o;
import H.AbstractC0997p;
import H.B0;
import Q.C1571u;
import android.util.Size;
import android.view.Surface;
import java.util.List;
import java.util.Objects;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: renamed from: G.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C0960t {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public androidx.camera.core.f f2578b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.camera.core.f f2579c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.camera.core.f f2580d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public P.a f2581e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public c f2582f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Q f2577a = null;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public E f2583g = null;

    /* JADX INFO: renamed from: G.t$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends AbstractC0995o {
        public a() {
        }

        public static /* synthetic */ void e(a aVar) {
            Q q8 = C0960t.this.f2577a;
            if (q8 != null) {
                q8.p();
            }
        }

        @Override // H.AbstractC0995o
        public void d(int i8) {
            J.a.d().execute(new Runnable() { // from class: G.s
                @Override // java.lang.Runnable
                public final void run() {
                    C0960t.a.e(this.f2576a);
                }
            });
        }
    }

    /* JADX INFO: renamed from: G.t$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public AbstractC0995o f2588b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public AbstractC0994n0 f2589c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AbstractC0994n0 f2590d;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public AbstractC0995o f2587a = new a();

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public AbstractC0994n0 f2591e = null;

        /* JADX INFO: renamed from: G.t$c$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a extends AbstractC0995o {
            public a() {
            }
        }

        public static c n(Size size, int i8, List list, boolean z8, InterfaceC0880k0 interfaceC0880k0, F f8) {
            return new C0943b(size, i8, list, z8, interfaceC0880k0, f8, new C1571u(), new C1571u());
        }

        public AbstractC0995o a() {
            return this.f2587a;
        }

        public abstract C1571u b();

        public abstract InterfaceC0880k0 c();

        public abstract int d();

        public abstract List e();

        public abstract F f();

        public AbstractC0994n0 g() {
            return this.f2591e;
        }

        public abstract C1571u h();

        public AbstractC0995o i() {
            return this.f2588b;
        }

        public AbstractC0994n0 j() {
            return this.f2590d;
        }

        public abstract Size k();

        public AbstractC0994n0 l() {
            AbstractC0994n0 abstractC0994n0 = this.f2589c;
            Objects.requireNonNull(abstractC0994n0);
            return abstractC0994n0;
        }

        public abstract boolean m();

        public void o(AbstractC0995o abstractC0995o) {
            this.f2587a = abstractC0995o;
        }

        public void p(Surface surface, Size size, int i8) {
            this.f2591e = new B0(surface, size, i8);
        }

        public void q(AbstractC0995o abstractC0995o) {
            this.f2588b = abstractC0995o;
        }

        public void s(Surface surface) {
            T1.f.j(this.f2589c == null, "The surface is already set.");
            this.f2589c = new B0(surface, k(), d());
        }

        public void r(Surface surface) {
            T1.f.j(this.f2590d == null, vHKCAgr.iNxpLH);
            this.f2590d = new B0(surface, k(), d());
        }
    }

    public static /* synthetic */ void a(C0960t c0960t, A0 a8) {
        c0960t.getClass();
        try {
            androidx.camera.core.d dVarH = a8.h();
            if (dVarH != null) {
                c0960t.k(dVarH);
                return;
            }
            Q q8 = c0960t.f2577a;
            if (q8 != null) {
                c0960t.p(X.a.c(q8.e(), new C0868e0(2, "Failed to acquire latest image", null)));
            }
        } catch (IllegalStateException e8) {
            Q q9 = c0960t.f2577a;
            if (q9 != null) {
                c0960t.p(X.a.c(q9.e(), new C0868e0(2, "Failed to acquire latest image", e8)));
            }
        }
    }

    public static /* synthetic */ void b(C0960t c0960t, Q q8) {
        c0960t.l(q8);
        c0960t.f2583g.b(q8);
    }

    public static /* synthetic */ void d(androidx.camera.core.f fVar) {
        if (fVar != null) {
            fVar.d();
        }
    }

    public static /* synthetic */ void e(C0960t c0960t, A0 a8) {
        c0960t.getClass();
        try {
            androidx.camera.core.d dVarH = a8.h();
            if (dVarH != null) {
                c0960t.m(dVarH);
            }
        } catch (IllegalStateException e8) {
            AbstractC0890p0.d("CaptureNode", "Failed to acquire latest image of postview", e8);
        }
    }

    public static /* synthetic */ void f(androidx.camera.core.f fVar) {
        if (fVar != null) {
            fVar.d();
        }
    }

    public static A0 h(InterfaceC0880k0 interfaceC0880k0, int i8, int i9, int i10) {
        return interfaceC0880k0 != null ? interfaceC0880k0.a(i8, i9, i10, 4, 0L) : AbstractC0882l0.a(i8, i9, i10, 4);
    }

    public int i() {
        I.w.b();
        T1.f.j(this.f2578b != null, "The ImageReader is not initialized.");
        return this.f2578b.c();
    }

    public final void j(androidx.camera.core.d dVar) {
        Q q8;
        Q q9;
        I.w.b();
        P.a aVar = this.f2581e;
        Objects.requireNonNull(aVar);
        aVar.a().accept(P.b.c(this.f2577a, dVar));
        Q q10 = this.f2577a;
        c cVar = this.f2582f;
        boolean z8 = cVar != null && cVar.e().size() > 1;
        if (z8 && (q9 = this.f2577a) != null) {
            q9.k().s(dVar.getFormat(), true);
        }
        if (!z8 || ((q8 = this.f2577a) != null && q8.k().q())) {
            this.f2577a = null;
        }
        q10.s();
    }

    public void k(androidx.camera.core.d dVar) {
        I.w.b();
        if (this.f2577a == null) {
            AbstractC0890p0.l("CaptureNode", "Discarding ImageProxy which was inadvertently acquired: " + dVar);
            dVar.close();
            return;
        }
        if (((Integer) dVar.e1().b().d(this.f2577a.j())) != null) {
            j(dVar);
        } else {
            AbstractC0890p0.l("CaptureNode", "Discarding ImageProxy which was acquired for aborted request");
            dVar.close();
        }
    }

    public void l(Q q8) {
        I.w.b();
        T1.f.j(q8.i().size() == 1, "only one capture stage is supported.");
        T1.f.j(i() > 0, "Too many acquire images. Close image to be able to process next.");
        this.f2577a = q8;
        K.n.j(q8.a(), new b(q8), J.a.a());
    }

    public final void m(androidx.camera.core.d dVar) {
        if (this.f2577a == null) {
            AbstractC0890p0.l("CaptureNode", "Postview image is closed due to request completed or aborted");
            dVar.close();
        } else {
            P.a aVar = this.f2581e;
            Objects.requireNonNull(aVar);
            aVar.d().accept(P.b.c(this.f2577a, dVar));
        }
    }

    public void n() {
        I.w.b();
        c cVar = this.f2582f;
        Objects.requireNonNull(cVar);
        androidx.camera.core.f fVar = this.f2578b;
        Objects.requireNonNull(fVar);
        o(cVar, fVar, this.f2579c, this.f2580d);
    }

    public final void o(c cVar, final androidx.camera.core.f fVar, final androidx.camera.core.f fVar2, final androidx.camera.core.f fVar3) {
        cVar.l().d();
        cVar.l().k().a(new Runnable() { // from class: G.o
            @Override // java.lang.Runnable
            public final void run() {
                fVar.d();
            }
        }, J.a.d());
        if (cVar.g() != null) {
            cVar.g().d();
            cVar.g().k().a(new Runnable() { // from class: G.p
                @Override // java.lang.Runnable
                public final void run() {
                    C0960t.f(fVar3);
                }
            }, J.a.d());
        }
        if (cVar.e().size() <= 1 || cVar.j() == null) {
            return;
        }
        cVar.j().d();
        cVar.j().k().a(new Runnable() { // from class: G.q
            @Override // java.lang.Runnable
            public final void run() {
                C0960t.d(fVar2);
            }
        }, J.a.d());
    }

    public void p(X.a aVar) {
        I.w.b();
        Q q8 = this.f2577a;
        if (q8 == null || q8.e() != aVar.b()) {
            return;
        }
        this.f2577a.n(aVar.a());
    }

    public final void q(A0 a8) {
        a8.i(new A0.a() { // from class: G.r
            @Override // H.A0.a
            public final void a(A0 a9) {
                C0960t.a(this.f2575a, a9);
            }
        }, J.a.d());
    }

    public void r(androidx.camera.core.b.a aVar) {
        I.w.b();
        T1.f.j(this.f2578b != null, "The ImageReader is not initialized.");
        this.f2578b.e(aVar);
    }

    public P.a s(c cVar) {
        A0 a8;
        androidx.camera.core.e eVar;
        T1.a aVar;
        AbstractC0995o abstractC0995oB;
        A0 a9;
        T1.f.j(this.f2582f == null && this.f2578b == null, "CaptureNode does not support recreation yet.");
        this.f2582f = cVar;
        Size sizeK = cVar.k();
        int iD = cVar.d();
        boolean zM = cVar.m();
        AbstractC0995o aVar2 = new a();
        boolean z8 = cVar.e().size() > 1;
        if (zM) {
            cVar.c();
            E e8 = new E(h(null, sizeK.getWidth(), sizeK.getHeight(), iD));
            this.f2583g = e8;
            a8 = e8;
            eVar = null;
            aVar = new T1.a() { // from class: G.l
                @Override // T1.a
                public final void accept(Object obj) {
                    C0960t.b(this.f2569a, (Q) obj);
                }
            };
            abstractC0995oB = null;
        } else {
            cVar.c();
            if (z8) {
                androidx.camera.core.e eVar2 = new androidx.camera.core.e(sizeK.getWidth(), sizeK.getHeight(), 256, 4);
                AbstractC0995o abstractC0995oB2 = AbstractC0997p.b(aVar2, eVar2.o());
                eVar = new androidx.camera.core.e(sizeK.getWidth(), sizeK.getHeight(), 32, 4);
                abstractC0995oB = AbstractC0997p.b(aVar2, eVar.o());
                aVar2 = abstractC0995oB2;
                a9 = eVar2;
            } else {
                androidx.camera.core.e eVar3 = new androidx.camera.core.e(sizeK.getWidth(), sizeK.getHeight(), iD, 4);
                aVar2 = AbstractC0997p.b(aVar2, eVar3.o());
                abstractC0995oB = null;
                eVar = null;
                a9 = eVar3;
            }
            aVar = new T1.a() { // from class: G.k
                @Override // T1.a
                public final void accept(Object obj) {
                    this.f2568a.l((Q) obj);
                }
            };
            a8 = a9;
        }
        cVar.o(aVar2);
        if (z8 && abstractC0995oB != null) {
            cVar.q(abstractC0995oB);
        }
        Surface surface = a8.getSurface();
        Objects.requireNonNull(surface);
        cVar.s(surface);
        this.f2578b = new androidx.camera.core.f(a8);
        q(a8);
        F f8 = cVar.f();
        if (f8 != null) {
            cVar.c();
            A0 a0H = h(null, f8.b().getWidth(), f8.b().getHeight(), f8.a());
            a0H.i(new A0.a() { // from class: G.m
                @Override // H.A0.a
                public final void a(A0 a10) {
                    C0960t.e(this.f2570a, a10);
                }
            }, J.a.d());
            this.f2580d = new androidx.camera.core.f(a0H);
            cVar.p(a0H.getSurface(), f8.b(), f8.a());
        }
        if (z8 && eVar != null) {
            cVar.r(eVar.getSurface());
            this.f2579c = new androidx.camera.core.f(eVar);
            q(eVar);
        }
        cVar.h().a(aVar);
        cVar.b().a(new T1.a() { // from class: G.n
            @Override // T1.a
            public final void accept(Object obj) {
                this.f2571a.p((X.a) obj);
            }
        });
        P.a aVarE = P.a.e(cVar.d(), cVar.e());
        this.f2581e = aVarE;
        return aVarE;
    }

    /* JADX INFO: renamed from: G.t$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Q f2585a;

        public b(Q q8) {
            this.f2585a = q8;
        }

        @Override // K.c
        public void b(Throwable th) {
            I.w.b();
            if (this.f2585a == C0960t.this.f2577a) {
                AbstractC0890p0.l("CaptureNode", "request aborted, id=" + C0960t.this.f2577a.e());
                if (C0960t.this.f2583g != null) {
                    C0960t.this.f2583g.c();
                }
                C0960t.this.f2577a = null;
            }
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
        }
    }
}
