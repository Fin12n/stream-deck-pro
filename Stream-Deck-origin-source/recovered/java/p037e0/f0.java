package p037e0;

import C6.G;
import C6.r;
import I6.l;
import J0.v;
import Q6.k;
import Q6.o;
import e0.f0.d;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p215z0.AbstractC3150e0;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3162k0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.P0;
import p215z0.Z0;
import p215z0.g1;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h0 f20192a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f20193b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InterfaceC3164l0 f20194c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3164l0 f20195d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC3162k0 f20196e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3162k0 f20197f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final InterfaceC3164l0 f20198g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final v f20199h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final v f20200i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final InterfaceC3164l0 f20201j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public long f20202k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final q1 f20203l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f20204a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20205b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC3164l0 f20206c = l1.e(null, null, 2, null);

        /* JADX INFO: renamed from: e0.f0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public final class C0468a implements q1 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final d f20208a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public k f20209b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public k f20210c;

            public C0468a(d dVar, k kVar, k kVar2) {
                this.f20208a = dVar;
                this.f20209b = kVar;
                this.f20210c = kVar2;
            }

            public final void A(b bVar) {
                Object objInvoke = this.f20210c.invoke(bVar.c());
                if (!f0.this.r()) {
                    this.f20208a.P(objInvoke, (E) this.f20209b.invoke(bVar));
                } else {
                    this.f20208a.O(this.f20210c.invoke(bVar.a()), objInvoke, (E) this.f20209b.invoke(bVar));
                }
            }

            public final d c() {
                return this.f20208a;
            }

            public final k e() {
                return this.f20210c;
            }

            @Override // p215z0.q1
            public Object getValue() {
                A(f0.this.l());
                return this.f20208a.getValue();
            }

            public final k o() {
                return this.f20209b;
            }

            public final void q(k kVar) {
                this.f20210c = kVar;
            }

            public final void s(k kVar) {
                this.f20209b = kVar;
            }
        }

        public a(j0 j0Var, String str) {
            this.f20204a = j0Var;
            this.f20205b = str;
        }

        public final q1 a(k kVar, k kVar2) {
            C0468a c0468aB = b();
            if (c0468aB == null) {
                f0 f0Var = f0.this;
                c0468aB = new C0468a(f0Var.new d(kVar2.invoke(f0Var.h()), AbstractC2216l.i(this.f20204a, kVar2.invoke(f0.this.h())), this.f20204a, this.f20205b), kVar, kVar2);
                f0 f0Var2 = f0.this;
                c(c0468aB);
                f0Var2.d(c0468aB.c());
            }
            f0 f0Var3 = f0.this;
            c0468aB.q(kVar2);
            c0468aB.s(kVar);
            c0468aB.A(f0Var3.l());
            return c0468aB;
        }

        public final C0468a b() {
            return (C0468a) this.f20206c.getValue();
        }

        public final void c(C0468a c0468a) {
            this.f20206c.setValue(c0468a);
        }

        public final void d() {
            C0468a c0468aB = b();
            if (c0468aB != null) {
                f0 f0Var = f0.this;
                c0468aB.c().O(c0468aB.e().invoke(f0Var.l().a()), c0468aB.e().invoke(f0Var.l().c()), (E) c0468aB.o().invoke(f0Var.l()));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        Object a();

        default boolean b(Object obj, Object obj2) {
            return t.c(obj, a()) && t.c(obj2, c());
        }

        Object c();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f20212a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Object f20213b;

        public c(Object obj, Object obj2) {
            this.f20212a = obj;
            this.f20213b = obj2;
        }

        @Override // e0.f0.b
        public Object a() {
            return this.f20212a;
        }

        @Override // e0.f0.b
        public Object c() {
            return this.f20213b;
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.c(a(), bVar.a()) && t.c(c(), bVar.c());
        }

        public int hashCode() {
            Object objA = a();
            int iHashCode = (objA != null ? objA.hashCode() : 0) * 31;
            Object objC = c();
            return iHashCode + (objC != null ? objC.hashCode() : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class d implements q1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final j0 f20214a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f20215b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final InterfaceC3164l0 f20216c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final InterfaceC3164l0 f20218e;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final InterfaceC3164l0 f20222i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public AbstractC2221q f20223j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final E f20224k;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final InterfaceC3164l0 f20217d = l1.e(AbstractC2214j.g(0.0f, 0.0f, null, 7, null), null, 2, null);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final InterfaceC3164l0 f20219f = l1.e(Boolean.TRUE, null, 2, null);

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final InterfaceC3162k0 f20220g = Z0.a(0);

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final InterfaceC3164l0 f20221h = l1.e(Boolean.FALSE, null, 2, null);

        public d(Object obj, AbstractC2221q abstractC2221q, j0 j0Var, String str) {
            Object objInvoke;
            this.f20214a = j0Var;
            this.f20215b = str;
            this.f20216c = l1.e(obj, null, 2, null);
            this.f20218e = l1.e(new e0(e(), j0Var, obj, A(), abstractC2221q), null, 2, null);
            this.f20222i = l1.e(obj, null, 2, null);
            this.f20223j = abstractC2221q;
            Float f8 = (Float) x0.h().get(j0Var);
            if (f8 != null) {
                float fFloatValue = f8.floatValue();
                AbstractC2221q abstractC2221q2 = (AbstractC2221q) j0Var.a().invoke(obj);
                int iB = abstractC2221q2.b();
                for (int i8 = 0; i8 < iB; i8++) {
                    abstractC2221q2.e(i8, fFloatValue);
                }
                objInvoke = this.f20214a.b().invoke(abstractC2221q2);
            } else {
                objInvoke = null;
            }
            this.f20224k = AbstractC2214j.g(0.0f, 0.0f, objInvoke, 3, null);
        }

        public static /* synthetic */ void N(d dVar, Object obj, boolean z8, int i8, Object obj2) {
            if ((i8 & 1) != 0) {
                obj = dVar.getValue();
            }
            if ((i8 & 2) != 0) {
                z8 = false;
            }
            dVar.M(obj, z8);
        }

        public final Object A() {
            return this.f20216c.getValue();
        }

        public final boolean B() {
            return ((Boolean) this.f20219f.getValue()).booleanValue();
        }

        public final void C(long j8, float f8) {
            long jB;
            if (f8 > 0.0f) {
                float fS = (j8 - s()) / f8;
                if (Float.isNaN(fS)) {
                    throw new IllegalStateException(("Duration scale adjusted time is NaN. Duration scale: " + f8 + ",playTimeNanos: " + j8 + ", offsetTimeNanos: " + s()).toString());
                }
                jB = (long) fS;
            } else {
                jB = c().b();
            }
            L(c().f(jB));
            this.f20223j = c().d(jB);
            if (c().e(jB)) {
                H(true);
                J(0L);
            }
        }

        public final void D() {
            I(true);
        }

        public final void E(long j8) {
            L(c().f(j8));
            this.f20223j = c().d(j8);
        }

        public final void F(e0 e0Var) {
            this.f20218e.setValue(e0Var);
        }

        public final void G(E e8) {
            this.f20217d.setValue(e8);
        }

        public final void H(boolean z8) {
            this.f20219f.setValue(Boolean.valueOf(z8));
        }

        public final void I(boolean z8) {
            this.f20221h.setValue(Boolean.valueOf(z8));
        }

        public final void J(long j8) {
            this.f20220g.v(j8);
        }

        public final void K(Object obj) {
            this.f20216c.setValue(obj);
        }

        public void L(Object obj) {
            this.f20222i.setValue(obj);
        }

        public final void M(Object obj, boolean z8) {
            E e8 = (!z8 || (e() instanceof a0)) ? e() : this.f20224k;
            F(new e0(e8, this.f20214a, obj, A(), this.f20223j));
            f0.this.s();
        }

        public final void O(Object obj, Object obj2, E e8) {
            K(obj2);
            G(e8);
            if (t.c(c().h(), obj) && t.c(c().g(), obj2)) {
                return;
            }
            N(this, obj, false, 2, null);
        }

        public final void P(Object obj, E e8) {
            if (!t.c(A(), obj) || q()) {
                K(obj);
                G(e8);
                N(this, null, !B(), 1, null);
                H(false);
                J(f0.this.k());
                I(false);
            }
        }

        public final e0 c() {
            return (e0) this.f20218e.getValue();
        }

        public final E e() {
            return (E) this.f20217d.getValue();
        }

        @Override // p215z0.q1
        public Object getValue() {
            return this.f20222i.getValue();
        }

        public final long o() {
            return c().b();
        }

        public final boolean q() {
            return ((Boolean) this.f20221h.getValue()).booleanValue();
        }

        public final long s() {
            return this.f20220g.a();
        }

        public String toString() {
            return "current value: " + getValue() + ", target: " + A() + ", spec: " + e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f20226a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f20227b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ f0 f20229a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ float f20230b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(f0 f0Var, float f8) {
                super(1);
                this.f20229a = f0Var;
                this.f20230b = f8;
            }

            public final void b(long j8) {
                if (this.f20229a.r()) {
                    return;
                }
                this.f20229a.t(j8, this.f20230b);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b(((Number) obj).longValue());
                return G.f1419a;
            }
        }

        public e(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            e eVar = f0.this.new e(dVar);
            eVar.f20227b = obj;
            return eVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((e) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            J j8;
            a aVar;
            Object objF = H6.c.f();
            int i8 = this.f20226a;
            if (i8 == 0) {
                r.b(obj);
                j8 = (J) this.f20227b;
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j8 = (J) this.f20227b;
                r.b(obj);
            }
            do {
                aVar = new a(f0.this, d0.n(j8.getCoroutineContext()));
                this.f20227b = j8;
                this.f20226a = 1;
            } while (AbstractC3150e0.c(aVar, this) != objF);
            return objF;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f20232b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f20233c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Object obj, int i8) {
            super(2);
            this.f20232b = obj;
            this.f20233c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f0.this.f(this.f20232b, interfaceC3163l, F0.a(this.f20233c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Function0 {
        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Long invoke() {
            v vVar = f0.this.f20199h;
            int size = vVar.size();
            long jMax = 0;
            for (int i8 = 0; i8 < size; i8++) {
                jMax = Math.max(jMax, ((d) vVar.get(i8)).o());
            }
            v vVar2 = f0.this.f20200i;
            int size2 = vVar2.size();
            for (int i9 = 0; i9 < size2; i9++) {
                jMax = Math.max(jMax, ((f0) vVar2.get(i9)).o());
            }
            return Long.valueOf(jMax);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f20236b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f20237c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(Object obj, int i8) {
            super(2);
            this.f20236b = obj;
            this.f20237c = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            f0.this.G(this.f20236b, interfaceC3163l, F0.a(this.f20237c | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public f0(h0 h0Var, String str) {
        this.f20192a = h0Var;
        this.f20193b = str;
        this.f20194c = l1.e(h(), null, 2, null);
        this.f20195d = l1.e(new c(h(), h()), null, 2, null);
        this.f20196e = Z0.a(0L);
        this.f20197f = Z0.a(Long.MIN_VALUE);
        this.f20198g = l1.e(Boolean.TRUE, null, 2, null);
        this.f20199h = g1.f();
        this.f20200i = g1.f();
        this.f20201j = l1.e(Boolean.FALSE, null, 2, null);
        this.f20203l = g1.d(new g());
        h0Var.d(this);
    }

    public final void A(long j8) {
        this.f20196e.v(j8);
    }

    public final void B(boolean z8) {
        this.f20201j.setValue(Boolean.valueOf(z8));
    }

    public final void C(b bVar) {
        this.f20195d.setValue(bVar);
    }

    public final void D(long j8) {
        this.f20197f.v(j8);
    }

    public final void E(Object obj) {
        this.f20194c.setValue(obj);
    }

    public final void F(boolean z8) {
        this.f20198g.setValue(Boolean.valueOf(z8));
    }

    public final void G(Object obj, InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-583974681);
        int i9 = (i8 & 14) == 0 ? (interfaceC3163lP.R(obj) ? 4 : 2) | i8 : i8;
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.R(this) ? 32 : 16;
        }
        if ((i9 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-583974681, i9, -1, "androidx.compose.animation.core.Transition.updateTarget (Transition.kt:608)");
            }
            if (!r() && !t.c(n(), obj)) {
                C(new c(n(), obj));
                if (!t.c(h(), n())) {
                    h0 h0Var = this.f20192a;
                    if (!(h0Var instanceof S)) {
                        throw new IllegalStateException("Can only update the current state with MutableTransitionState");
                    }
                    ((S) h0Var).e(n());
                }
                E(obj);
                if (!q()) {
                    F(true);
                }
                v vVar = this.f20199h;
                int size = vVar.size();
                for (int i10 = 0; i10 < size; i10++) {
                    ((d) vVar.get(i10)).D();
                }
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new h(obj, i8));
        }
    }

    public final boolean d(d dVar) {
        return this.f20199h.add(dVar);
    }

    public final boolean e(f0 f0Var) {
        return this.f20200i.add(f0Var);
    }

    public final void f(Object obj, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1493585151);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(obj) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.R(this) ? 32 : 16;
        }
        if ((i9 & 91) == 18 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1493585151, i9, -1, "androidx.compose.animation.core.Transition.animateTo (Transition.kt:639)");
            }
            if (!r()) {
                G(obj, interfaceC3163lP, i9 & 126);
                if (!t.c(obj, h()) || q() || p()) {
                    interfaceC3163lP.f(1951115890);
                    boolean zR = interfaceC3163lP.R(this);
                    Object objG = interfaceC3163lP.g();
                    if (zR || objG == InterfaceC3163l.f38803a.a()) {
                        objG = new e(null);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    K.d(this, (o) objG, interfaceC3163lP, ((i9 >> 3) & 14) | 64);
                }
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new f(obj, i8));
        }
    }

    public final List g() {
        return this.f20199h;
    }

    public final Object h() {
        return this.f20192a.a();
    }

    public final String i() {
        return this.f20193b;
    }

    public final long j() {
        return this.f20202k;
    }

    public final long k() {
        return this.f20196e.a();
    }

    public final b l() {
        return (b) this.f20195d.getValue();
    }

    public final long m() {
        return this.f20197f.a();
    }

    public final Object n() {
        return this.f20194c.getValue();
    }

    public final long o() {
        return ((Number) this.f20203l.getValue()).longValue();
    }

    public final boolean p() {
        return ((Boolean) this.f20198g.getValue()).booleanValue();
    }

    public final boolean q() {
        return m() != Long.MIN_VALUE;
    }

    public final boolean r() {
        return ((Boolean) this.f20201j.getValue()).booleanValue();
    }

    public final void s() {
        F(true);
        if (r()) {
            v vVar = this.f20199h;
            int size = vVar.size();
            long jMax = 0;
            for (int i8 = 0; i8 < size; i8++) {
                d dVar = (d) vVar.get(i8);
                jMax = Math.max(jMax, dVar.o());
                dVar.E(this.f20202k);
            }
            F(false);
        }
    }

    public final void t(long j8, float f8) {
        if (m() == Long.MIN_VALUE) {
            v(j8);
        }
        F(false);
        A(j8 - m());
        v vVar = this.f20199h;
        int size = vVar.size();
        boolean z8 = true;
        for (int i8 = 0; i8 < size; i8++) {
            d dVar = (d) vVar.get(i8);
            if (!dVar.B()) {
                dVar.C(k(), f8);
            }
            if (!dVar.B()) {
                z8 = false;
            }
        }
        v vVar2 = this.f20200i;
        int size2 = vVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            f0 f0Var = (f0) vVar2.get(i9);
            if (!t.c(f0Var.n(), f0Var.h())) {
                f0Var.t(k(), f8);
            }
            if (!t.c(f0Var.n(), f0Var.h())) {
                z8 = false;
            }
        }
        if (z8) {
            u();
        }
    }

    public String toString() {
        List listG = g();
        int size = listG.size();
        String str = "Transition animation values: ";
        for (int i8 = 0; i8 < size; i8++) {
            str = str + ((d) listG.get(i8)) + ", ";
        }
        return str;
    }

    public final void u() {
        D(Long.MIN_VALUE);
        h0 h0Var = this.f20192a;
        if (h0Var instanceof S) {
            ((S) h0Var).e(n());
        }
        A(0L);
        this.f20192a.c(false);
    }

    public final void v(long j8) {
        D(j8);
        this.f20192a.c(true);
    }

    public final void w(a aVar) {
        d dVarC;
        a.C0468a c0468aB = aVar.b();
        if (c0468aB == null || (dVarC = c0468aB.c()) == null) {
            return;
        }
        x(dVarC);
    }

    public final void x(d dVar) {
        this.f20199h.remove(dVar);
    }

    public final boolean y(f0 f0Var) {
        return this.f20200i.remove(f0Var);
    }

    public final void z(Object obj, Object obj2, long j8) {
        D(Long.MIN_VALUE);
        this.f20192a.c(false);
        if (!r() || !t.c(h(), obj) || !t.c(n(), obj2)) {
            if (!t.c(h(), obj)) {
                h0 h0Var = this.f20192a;
                if (h0Var instanceof S) {
                    ((S) h0Var).e(obj);
                }
            }
            E(obj2);
            B(true);
            C(new c(obj, obj2));
        }
        v vVar = this.f20200i;
        int size = vVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            f0 f0Var = (f0) vVar.get(i8);
            t.e(f0Var, "null cannot be cast to non-null type androidx.compose.animation.core.Transition<kotlin.Any>");
            if (f0Var.r()) {
                f0Var.z(f0Var.h(), f0Var.n(), j8);
            }
        }
        v vVar2 = this.f20199h;
        int size2 = vVar2.size();
        for (int i9 = 0; i9 < size2; i9++) {
            ((d) vVar2.get(i9)).E(j8);
        }
        this.f20202k = j8;
    }

    public /* synthetic */ f0(h0 h0Var, String str, int i8, AbstractC2633k abstractC2633k) {
        this(h0Var, (i8 & 2) != 0 ? null : str);
    }

    public f0(Object obj, String str) {
        this(new S(obj), str);
    }

    public /* synthetic */ f0(S s8, String str, int i8, AbstractC2633k abstractC2633k) {
        this(s8, (i8 & 2) != 0 ? null : str);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public f0(S s8, String str) {
        this((h0) s8, str);
        t.e(s8, "null cannot be cast to non-null type androidx.compose.animation.core.TransitionState<S of androidx.compose.animation.core.Transition>");
    }
}
