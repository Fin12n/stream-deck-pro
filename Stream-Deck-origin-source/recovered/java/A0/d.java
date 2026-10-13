package A0;

import C6.C0920i;
import C6.G;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.K;
import p043e6.dT.GIGvBf;
import p179u4.eubL.OjEsfyJYzbPn;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.C3147d;
import p215z0.C3154g0;
import p215z0.C3156h0;
import p215z0.C3168n0;
import p215z0.E0;
import p215z0.G0;
import p215z0.InterfaceC3149e;
import p215z0.InterfaceC3159j;
import p215z0.InterfaceC3171p;
import p215z0.K0;
import p215z0.L0;
import p215z0.M0;
import p215z0.T0;
import p215z0.W0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f374a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f375b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class A extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final A f376c = new A();

        /* JADX WARN: Illegal instructions before constructor call */
        public A() {
            int i8 = 0;
            super(i8, i8, 3, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            w8.W0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class B extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final B f377c = new B();

        /* JADX WARN: Illegal instructions before constructor call */
        public B() {
            int i8 = 1;
            super(0, i8, i8, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            w8.j1(eVar.a(s.a(0)));
        }

        @Override // A0.d
        public String f(int i8) {
            return s.b(i8, s.a(0)) ? "data" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C f378c = new C();

        public C() {
            super(0, 2, 1, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            ((Q6.o) eVar.a(s.a(1))).invoke(interfaceC3149e.b(), eVar.a(s.a(0)));
        }

        @Override // A0.d
        public String f(int i8) {
            if (s.b(i8, s.a(0))) {
                return "value";
            }
            return s.b(i8, s.a(1)) ? "block" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class D extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final D f379c = new D();

        /* JADX WARN: Illegal instructions before constructor call */
        public D() {
            int i8 = 1;
            super(i8, i8, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            Object objA = eVar.a(s.a(0));
            int iB = eVar.b(p.a(0));
            if (objA instanceof M0) {
                k8.e(((M0) objA).a());
            }
            Object objS0 = w8.S0(iB, objA);
            if (objS0 instanceof M0) {
                k8.d(((M0) objS0).a());
            } else if (objS0 instanceof E0) {
                ((E0) objS0).x();
            }
        }

        @Override // A0.d
        public String e(int i8) {
            return p.b(i8, p.a(0)) ? "groupSlotIndex" : super.e(i8);
        }

        @Override // A0.d
        public String f(int i8) {
            return s.b(i8, s.a(0)) ? GIGvBf.tUSldTVvXQPKb : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class E extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final E f380c = new E();

        public E() {
            super(1, 0, 2, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            int iB = eVar.b(p.a(0));
            for (int i8 = 0; i8 < iB; i8++) {
                interfaceC3149e.g();
            }
        }

        @Override // A0.d
        public String e(int i8) {
            return p.b(i8, p.a(0)) ? "count" : super.e(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class F extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final F f381c = new F();

        /* JADX WARN: Illegal instructions before constructor call */
        public F() {
            int i8 = 0;
            super(i8, i8, 3, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            Object objB = interfaceC3149e.b();
            kotlin.jvm.internal.t.e(objB, "null cannot be cast to non-null type androidx.compose.runtime.ComposeNodeLifecycleCallback");
            ((InterfaceC3159j) objB).p();
        }
    }

    /* JADX INFO: renamed from: A0.d$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0907a extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0907a f382c = new C0907a();

        public C0907a() {
            super(1, 0, 2, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            w8.E(eVar.b(p.a(0)));
        }

        @Override // A0.d
        public String e(int i8) {
            return p.b(i8, p.a(0)) ? "distance" : super.e(i8);
        }
    }

    /* JADX INFO: renamed from: A0.d$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0908b extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0908b f383c = new C0908b();

        public C0908b() {
            super(0, 2, 1, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            H0.d dVar = (H0.d) eVar.a(s.a(1));
            int iA = dVar != null ? dVar.a() : 0;
            a aVar = (a) eVar.a(s.a(0));
            if (iA > 0) {
                interfaceC3149e = new C3168n0(interfaceC3149e, iA);
            }
            aVar.b(interfaceC3149e, w8, k8);
        }

        @Override // A0.d
        public String f(int i8) {
            if (s.b(i8, s.a(0))) {
                return "changes";
            }
            return s.b(i8, s.a(1)) ? "effectiveNodeIndex" : super.f(i8);
        }
    }

    /* JADX INFO: renamed from: A0.d$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0909c extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0909c f384c = new C0909c();

        public C0909c() {
            super(0, 2, 1, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            int iA = ((H0.d) eVar.a(s.a(0))).a();
            List list = (List) eVar.a(s.a(1));
            int size = list.size();
            for (int i8 = 0; i8 < size; i8++) {
                Object obj = list.get(i8);
                kotlin.jvm.internal.t.e(interfaceC3149e, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
                int i9 = iA + i8;
                interfaceC3149e.c(i9, obj);
                interfaceC3149e.h(i9, obj);
            }
        }

        @Override // A0.d
        public String f(int i8) {
            if (s.b(i8, s.a(0))) {
                return "effectiveNodeIndex";
            }
            return s.b(i8, s.a(1)) ? "nodes" : super.f(i8);
        }
    }

    /* JADX INFO: renamed from: A0.d$d, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0000d extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0000d f385c = new C0000d();

        public C0000d() {
            super(0, 4, 1, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) throws Throwable {
            C3156h0 c3156h0 = (C3156h0) eVar.a(s.a(2));
            C3156h0 c3156h1 = (C3156h0) eVar.a(s.a(3));
            AbstractC3173q abstractC3173q = (AbstractC3173q) eVar.a(s.a(1));
            C3154g0 c3154g0M = (C3154g0) eVar.a(s.a(0));
            if (c3154g0M == null && (c3154g0M = abstractC3173q.m(c3156h0)) == null) {
                AbstractC3169o.v("Could not resolve state for movable content");
                throw new C0920i();
            }
            List listY0 = w8.y0(1, c3154g0M.a(), 2);
            E0.a aVar = E0.f38529h;
            p215z0.B b8 = c3156h1.b();
            kotlin.jvm.internal.t.e(b8, OjEsfyJYzbPn.XTmqGB);
            aVar.a(w8, listY0, (G0) b8);
        }

        @Override // A0.d
        public String f(int i8) {
            if (s.b(i8, s.a(0))) {
                return "resolvedState";
            }
            if (s.b(i8, s.a(1))) {
                return "resolvedCompositionContext";
            }
            if (s.b(i8, s.a(2))) {
                return "from";
            }
            return s.b(i8, s.a(3)) ? "to" : super.f(i8);
        }
    }

    /* JADX INFO: renamed from: A0.d$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0910e extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0910e f386c = new C0910e();

        /* JADX WARN: Illegal instructions before constructor call */
        public C0910e() {
            int i8 = 0;
            super(i8, i8, 3, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            AbstractC3169o.w(w8, k8);
        }
    }

    /* JADX INFO: renamed from: A0.d$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0911f extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C0911f f387c = new C0911f();

        public C0911f() {
            super(0, 2, 1, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            H0.d dVar = (H0.d) eVar.a(s.a(0));
            C3147d c3147d = (C3147d) eVar.a(s.a(1));
            kotlin.jvm.internal.t.e(interfaceC3149e, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            dVar.b(f.e(w8, c3147d, interfaceC3149e));
        }

        @Override // A0.d
        public String f(int i8) {
            if (s.b(i8, s.a(0))) {
                return "effectiveNodeIndexOut";
            }
            return s.b(i8, s.a(1)) ? "anchor" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final g f388c = new g();

        /* JADX WARN: Illegal instructions before constructor call */
        public g() {
            int i8 = 1;
            super(0, i8, i8, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            kotlin.jvm.internal.t.e(interfaceC3149e, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            for (Object obj : (Object[]) eVar.a(s.a(0))) {
                interfaceC3149e.d(obj);
            }
        }

        @Override // A0.d
        public String f(int i8) {
            return s.b(i8, s.a(0)) ? "nodes" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final h f389c = new h();

        public h() {
            super(0, 2, 1, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            ((Q6.k) eVar.a(s.a(0))).invoke((InterfaceC3171p) eVar.a(s.a(1)));
        }

        @Override // A0.d
        public String f(int i8) {
            if (s.b(i8, s.a(0))) {
                return "anchor";
            }
            return s.b(i8, s.a(1)) ? "composition" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final i f390c = new i();

        /* JADX WARN: Illegal instructions before constructor call */
        public i() {
            int i8 = 0;
            super(i8, i8, 3, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            w8.T();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final j f391c = new j();

        /* JADX WARN: Illegal instructions before constructor call */
        public j() {
            int i8 = 0;
            super(i8, i8, 3, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            kotlin.jvm.internal.t.e(interfaceC3149e, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            f.f(w8, interfaceC3149e, 0);
            w8.T();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final k f392c = new k();

        /* JADX WARN: Illegal instructions before constructor call */
        public k() {
            int i8 = 1;
            super(0, i8, i8, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            w8.W((C3147d) eVar.a(s.a(0)));
        }

        @Override // A0.d
        public String f(int i8) {
            return s.b(i8, s.a(0)) ? "anchor" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final l f393c = new l();

        /* JADX WARN: Illegal instructions before constructor call */
        public l() {
            int i8 = 0;
            super(i8, i8, 3, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            w8.V(0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final m f394c = new m();

        public m() {
            super(1, 2, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            Object objInvoke = ((Function0) eVar.a(s.a(0))).invoke();
            C3147d c3147d = (C3147d) eVar.a(s.a(1));
            int iB = eVar.b(p.a(0));
            kotlin.jvm.internal.t.e(interfaceC3149e, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            w8.o1(c3147d, objInvoke);
            interfaceC3149e.h(iB, objInvoke);
            interfaceC3149e.d(objInvoke);
        }

        @Override // A0.d
        public String e(int i8) {
            return p.b(i8, p.a(0)) ? "insertIndex" : super.e(i8);
        }

        @Override // A0.d
        public String f(int i8) {
            if (s.b(i8, s.a(0))) {
                return "factory";
            }
            return s.b(i8, s.a(1)) ? "groupAnchor" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final n f395c = new n();

        public n() {
            super(0, 2, 1, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            T0 t8 = (T0) eVar.a(s.a(1));
            C3147d c3147d = (C3147d) eVar.a(s.a(0));
            w8.I();
            w8.v0(t8, c3147d.d(t8), false);
            w8.U();
        }

        @Override // A0.d
        public String f(int i8) {
            if (s.b(i8, s.a(0))) {
                return "anchor";
            }
            return s.b(i8, s.a(1)) ? "from" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final o f396c = new o();

        public o() {
            super(0, 3, 1, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            T0 t8 = (T0) eVar.a(s.a(1));
            C3147d c3147d = (C3147d) eVar.a(s.a(0));
            c cVar = (c) eVar.a(s.a(2));
            W0 w0K = t8.K();
            try {
                cVar.d(interfaceC3149e, w0K, k8);
                G g8 = G.f1419a;
                w0K.L();
                w8.I();
                w8.v0(t8, c3147d.d(t8), false);
                w8.U();
            } catch (Throwable th) {
                w0K.L();
                throw th;
            }
        }

        @Override // A0.d
        public String f(int i8) {
            if (s.b(i8, s.a(0))) {
                return "anchor";
            }
            if (s.b(i8, s.a(1))) {
                return "from";
            }
            return s.b(i8, s.a(2)) ? "fixups" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final q f397c = new q();

        public q() {
            super(1, 0, 2, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            w8.w0(eVar.b(p.a(0)));
        }

        @Override // A0.d
        public String e(int i8) {
            return p.b(i8, p.a(0)) ? com.amazon.device.iap.internal.c.b.as : super.e(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final r f398c = new r();

        public r() {
            super(3, 0, 2, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            interfaceC3149e.f(eVar.b(p.a(0)), eVar.b(p.a(1)), eVar.b(p.a(2)));
        }

        @Override // A0.d
        public String e(int i8) {
            if (p.b(i8, p.a(0))) {
                return "from";
            }
            if (p.b(i8, p.a(1))) {
                return "to";
            }
            return p.b(i8, p.a(2)) ? "count" : super.e(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class t extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final t f399c = new t();

        /* JADX WARN: Illegal instructions before constructor call */
        public t() {
            int i8 = 1;
            super(i8, i8, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            C3147d c3147d = (C3147d) eVar.a(s.a(0));
            int iB = eVar.b(p.a(0));
            interfaceC3149e.g();
            kotlin.jvm.internal.t.e(interfaceC3149e, "null cannot be cast to non-null type androidx.compose.runtime.Applier<kotlin.Any?>");
            interfaceC3149e.c(iB, w8.C0(c3147d));
        }

        @Override // A0.d
        public String e(int i8) {
            return p.b(i8, p.a(0)) ? "insertIndex" : super.e(i8);
        }

        @Override // A0.d
        public String f(int i8) {
            return s.b(i8, s.a(0)) ? "groupAnchor" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class u extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final u f400c = new u();

        public u() {
            super(0, 3, 1, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            f.g((p215z0.B) eVar.a(s.a(0)), (AbstractC3173q) eVar.a(s.a(1)), (C3156h0) eVar.a(s.a(2)), w8);
        }

        @Override // A0.d
        public String f(int i8) {
            if (s.b(i8, s.a(0))) {
                return "composition";
            }
            if (s.b(i8, s.a(1))) {
                return "parentCompositionContext";
            }
            return s.b(i8, s.a(2)) ? "reference" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class v extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final v f401c = new v();

        /* JADX WARN: Illegal instructions before constructor call */
        public v() {
            int i8 = 1;
            super(0, i8, i8, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            k8.e((L0) eVar.a(s.a(0)));
        }

        @Override // A0.d
        public String f(int i8) {
            return s.b(i8, s.a(0)) ? "value" : super.f(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class w extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final w f402c = new w();

        /* JADX WARN: Illegal instructions before constructor call */
        public w() {
            int i8 = 0;
            super(i8, i8, 3, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            AbstractC3169o.Q(w8, k8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class x extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final x f403c = new x();

        /* JADX WARN: Illegal instructions before constructor call */
        public x() {
            int i8 = 2;
            super(i8, 0, i8, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            interfaceC3149e.a(eVar.b(p.a(0)), eVar.b(p.a(1)));
        }

        @Override // A0.d
        public String e(int i8) {
            if (p.b(i8, p.a(0))) {
                return "removeIndex";
            }
            return p.b(i8, p.a(1)) ? "count" : super.e(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class y extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final y f404c = new y();

        /* JADX WARN: Illegal instructions before constructor call */
        public y() {
            int i8 = 0;
            super(i8, i8, 3, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            w8.O0();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class z extends d {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final z f405c = new z();

        /* JADX WARN: Illegal instructions before constructor call */
        public z() {
            int i8 = 1;
            super(0, i8, i8, null);
        }

        @Override // A0.d
        public void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8) {
            k8.a((Function0) eVar.a(s.a(0)));
        }

        @Override // A0.d
        public String f(int i8) {
            return s.b(i8, s.a(0)) ? "effect" : super.f(i8);
        }
    }

    public /* synthetic */ d(int i8, int i9, AbstractC2633k abstractC2633k) {
        this(i8, i9);
    }

    public abstract void a(e eVar, InterfaceC3149e interfaceC3149e, W0 w8, K0 k8);

    public final int b() {
        return this.f374a;
    }

    public final String c() {
        String strD = K.b(getClass()).d();
        return strD == null ? "" : strD;
    }

    public final int d() {
        return this.f375b;
    }

    public String e(int i8) {
        return "IntParameter(" + i8 + ')';
    }

    public String f(int i8) {
        return "ObjectParameter(" + i8 + ')';
    }

    public String toString() {
        return c();
    }

    public d(int i8, int i9) {
        this.f374a = i8;
        this.f375b = i9;
    }

    public /* synthetic */ d(int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9, null);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p {
        public static final boolean b(int i8, int i9) {
            return i8 == i9;
        }

        public static int a(int i8) {
            return i8;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class s {
        public static final boolean b(int i8, int i9) {
            return i8 == i9;
        }

        public static int a(int i8) {
            return i8;
        }
    }
}
