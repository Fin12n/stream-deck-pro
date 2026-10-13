package p183v0;

import A1.h;
import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import Q6.o;
import R0.C1598l0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p017b7.J;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p046f0.E;
import p046f0.F;
import p073i0.j;
import p073i0.k;
import p073i0.p;
import p073i0.q;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e implements E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f34967a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f34968b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final q1 f34969c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34970a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f34971b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f34972c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ m f34973d;

        /* JADX INFO: renamed from: v0.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0791a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m f34974a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ J f34975b;

            public C0791a(m mVar, J j8) {
                this.f34974a = mVar;
                this.f34975b = j8;
            }

            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(j jVar, d dVar) {
                if (jVar instanceof p) {
                    this.f34974a.e((p) jVar, this.f34975b);
                } else if (jVar instanceof q) {
                    this.f34974a.g(((q) jVar).a());
                } else if (jVar instanceof p073i0.o) {
                    this.f34974a.g(((p073i0.o) jVar).a());
                } else {
                    this.f34974a.h(jVar, this.f34975b);
                }
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, m mVar, d dVar) {
            super(2, dVar);
            this.f34972c = kVar;
            this.f34973d = mVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            a aVar = new a(this.f34972c, this.f34973d, dVar);
            aVar.f34971b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f34970a;
            if (i8 == 0) {
                r.b(obj);
                J j8 = (J) this.f34971b;
                InterfaceC2260f interfaceC2260fC = this.f34972c.c();
                C0791a c0791a = new C0791a(this.f34973d, j8);
                this.f34970a = 1;
                if (interfaceC2260fC.collect(c0791a, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    public /* synthetic */ e(boolean z8, float f8, q1 q1Var, AbstractC2633k abstractC2633k) {
        this(z8, f8, q1Var);
    }

    @Override // p046f0.E
    public final F a(k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(988743187);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(988743187, i8, -1, "androidx.compose.material.ripple.Ripple.rememberUpdatedInstance (Ripple.kt:115)");
        }
        o oVar = (o) interfaceC3163l.e(p.d());
        interfaceC3163l.f(-1524341038);
        long jY = ((C1598l0) this.f34969c.getValue()).y() != C1598l0.f9405b.e() ? ((C1598l0) this.f34969c.getValue()).y() : oVar.a(interfaceC3163l, 0);
        interfaceC3163l.N();
        m mVarB = b(kVar, this.f34967a, this.f34968b, g1.p(C1598l0.g(jY), interfaceC3163l, 0), g1.p(oVar.b(interfaceC3163l, 0), interfaceC3163l, 0), interfaceC3163l, (i8 & 14) | ((i8 << 12) & 458752));
        K.e(mVarB, kVar, new a(kVar, mVarB, null), interfaceC3163l, ((i8 << 3) & 112) | 520);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return mVarB;
    }

    public abstract m b(k kVar, boolean z8, float f8, q1 q1Var, q1 q1Var2, InterfaceC3163l interfaceC3163l, int i8);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f34967a == eVar.f34967a && h.t(this.f34968b, eVar.f34968b) && t.c(this.f34969c, eVar.f34969c);
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.f34967a) * 31) + h.u(this.f34968b)) * 31) + this.f34969c.hashCode();
    }

    public e(boolean z8, float f8, q1 q1Var) {
        this.f34967a = z8;
        this.f34968b = f8;
        this.f34969c = q1Var;
    }
}
