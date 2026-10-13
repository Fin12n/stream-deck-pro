package androidx.compose.animation;

import A1.r;
import A1.s;
import A1.t;
import C6.G;
import L0.i;
import Q6.k;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.u;
import p028d0.v;
import p028d0.z;
import p037e0.AbstractC2214j;
import p037e0.E;
import p037e0.f0;
import p037e0.g0;
import p037e0.l0;
import p038e1.I;
import p038e1.J;
import p038e1.X;
import p038e1.a0;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.g1;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final f0 f14231a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public L0.c f14232b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public t f14233c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC3164l0 f14234d = l1.e(r.b(r.f455b.a()), null, 2, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Map f14235e = new LinkedHashMap();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public q1 f14236f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class b extends v {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final f0.a f14238b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final q1 f14239c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a0 f14241a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f14242b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var, long j8) {
                super(1);
                this.f14241a = a0Var;
                this.f14242b = j8;
            }

            public final void b(a0.a aVar) {
                a0.a.h(aVar, this.f14241a, this.f14242b, 0.0f, 2, null);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a0.a) obj);
                return G.f1419a;
            }
        }

        /* JADX INFO: renamed from: androidx.compose.animation.d$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0352b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f14243a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ b f14244b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0352b(d dVar, b bVar) {
                super(1);
                this.f14243a = dVar;
                this.f14244b = bVar;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final E invoke(f0.b bVar) {
                E eB;
                q1 q1Var = (q1) this.f14243a.h().get(bVar.a());
                long j8 = q1Var != null ? ((r) q1Var.getValue()).j() : r.f455b.a();
                q1 q1Var2 = (q1) this.f14243a.h().get(bVar.c());
                long j9 = q1Var2 != null ? ((r) q1Var2.getValue()).j() : r.f455b.a();
                z zVar = (z) this.f14244b.k().getValue();
                return (zVar == null || (eB = zVar.b(j8, j9)) == null) ? AbstractC2214j.g(0.0f, 0.0f, null, 7, null) : eB;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f14245a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(d dVar) {
                super(1);
                this.f14245a = dVar;
            }

            public final long b(Object obj) {
                q1 q1Var = (q1) this.f14245a.h().get(obj);
                return q1Var != null ? ((r) q1Var.getValue()).j() : r.f455b.a();
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                return r.b(b(obj));
            }
        }

        public b(e0.f0.a aVar, q1 q1Var) {
            this.f14238b = aVar;
            this.f14239c = q1Var;
        }

        @Override // p038e1.InterfaceC2253y
        public I c(J j8, p038e1.G g8, long j9) {
            a0 a0VarJ = g8.J(j9);
            q1 q1VarA = this.f14238b.a(new C0352b(d.this, this), new c(d.this));
            d.this.i(q1VarA);
            return J.X0(j8, r.g(((r) q1VarA.getValue()).j()), r.f(((r) q1VarA.getValue()).j()), null, new a(a0VarJ, d.this.g().a(s.a(a0VarJ.y0(), a0VarJ.h0()), ((r) q1VarA.getValue()).j(), t.Ltr)), 4, null);
        }

        public final q1 k() {
            return this.f14239c;
        }
    }

    public d(f0 f0Var, L0.c cVar, t tVar) {
        this.f14231a = f0Var;
        this.f14232b = cVar;
        this.f14233c = tVar;
    }

    public static final boolean e(InterfaceC3164l0 interfaceC3164l0) {
        return ((Boolean) interfaceC3164l0.getValue()).booleanValue();
    }

    public static final void f(InterfaceC3164l0 interfaceC3164l0, boolean z8) {
        interfaceC3164l0.setValue(Boolean.valueOf(z8));
    }

    @Override // e0.f0.b
    public Object a() {
        return this.f14231a.l().a();
    }

    @Override // e0.f0.b
    public Object c() {
        return this.f14231a.l().c();
    }

    public final i d(p028d0.k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163l2;
        i iVar;
        interfaceC3163l.f(93755870);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(93755870, i8, -1, "androidx.compose.animation.AnimatedContentTransitionScopeImpl.createSizeAnimationModifier (AnimatedContent.kt:538)");
        }
        interfaceC3163l.f(1157296644);
        boolean zR = interfaceC3163l.R(this);
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = l1.e(Boolean.FALSE, null, 2, null);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        q1 q1VarP = g1.p(kVar.b(), interfaceC3163l, 0);
        if (kotlin.jvm.internal.t.c(this.f14231a.h(), this.f14231a.n())) {
            f(interfaceC3164l0, false);
        } else if (q1VarP.getValue() != null) {
            f(interfaceC3164l0, true);
        }
        if (e(interfaceC3164l0)) {
            interfaceC3163l2 = interfaceC3163l;
            f0.a aVarB = g0.b(this.f14231a, l0.e(r.f455b), null, interfaceC3163l2, 64, 2);
            interfaceC3163l2.f(1157296644);
            boolean zR2 = interfaceC3163l2.R(aVarB);
            Object objG2 = interfaceC3163l2.g();
            if (zR2 || objG2 == InterfaceC3163l.f38803a.a()) {
                z zVar = (z) q1VarP.getValue();
                objG2 = ((zVar == null || zVar.a()) ? O0.f.b(i.f4836a) : i.f4836a).j(new b(aVarB, q1VarP));
                interfaceC3163l2.H(objG2);
            }
            interfaceC3163l2.N();
            iVar = (i) objG2;
        } else {
            interfaceC3163l2 = interfaceC3163l;
            this.f14236f = null;
            iVar = i.f4836a;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l2.N();
        return iVar;
    }

    public L0.c g() {
        return this.f14232b;
    }

    public final Map h() {
        return this.f14235e;
    }

    public final void i(q1 q1Var) {
        this.f14236f = q1Var;
    }

    public void j(L0.c cVar) {
        this.f14232b = cVar;
    }

    public final void k(t tVar) {
        this.f14233c = tVar;
    }

    public final void l(long j8) {
        this.f14234d.setValue(r.b(j8));
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements X {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f14237b;

        public a(boolean z8) {
            this.f14237b = z8;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.f14237b == ((a) obj).f14237b;
        }

        public int hashCode() {
            return Boolean.hashCode(this.f14237b);
        }

        public final boolean k() {
            return this.f14237b;
        }

        public final void p(boolean z8) {
            this.f14237b = z8;
        }

        public String toString() {
            return "ChildData(isTarget=" + this.f14237b + ')';
        }

        @Override // p038e1.X
        public Object f(A1.d dVar, Object obj) {
            return this;
        }
    }
}
