package p183v0;

import C6.G;
import C6.r;
import D6.z;
import G6.d;
import H6.c;
import I6.l;
import Q6.o;
import R0.AbstractC1596k0;
import R0.C1598l0;
import T0.f;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.J;
import p037e0.AbstractC2206b;
import p037e0.C2205a;
import p037e0.InterfaceC2213i;
import p073i0.e;
import p073i0.g;
import p073i0.h;
import p073i0.j;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f35037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final q1 f35038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2205a f35039c = AbstractC2206b.b(0.0f, 0.0f, 2, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f35040d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public j f35041e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35042a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f35044c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2213i f35045d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(float f8, InterfaceC2213i interfaceC2213i, d dVar) {
            super(2, dVar);
            this.f35044c = f8;
            this.f35045d = interfaceC2213i;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return q.this.new a(this.f35044c, this.f35045d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f35042a;
            if (i8 == 0) {
                r.b(obj);
                C2205a c2205a = q.this.f35039c;
                Float fC = I6.b.c(this.f35044c);
                InterfaceC2213i interfaceC2213i = this.f35045d;
                this.f35042a = 1;
                if (C2205a.f(c2205a, fC, interfaceC2213i, null, null, this, 12, null) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f35046a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2213i f35048c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC2213i interfaceC2213i, d dVar) {
            super(2, dVar);
            this.f35048c = interfaceC2213i;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return q.this.new b(this.f35048c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f35046a;
            if (i8 == 0) {
                r.b(obj);
                C2205a c2205a = q.this.f35039c;
                Float fC = I6.b.c(0.0f);
                InterfaceC2213i interfaceC2213i = this.f35048c;
                this.f35046a = 1;
                if (C2205a.f(c2205a, fC, interfaceC2213i, null, null, this, 12, null) == objF) {
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

    public q(boolean z8, q1 q1Var) {
        this.f35037a = z8;
        this.f35038b = q1Var;
    }

    public final void b(f fVar, float f8, long j8) {
        f fVar2;
        float fE0;
        if (Float.isNaN(f8)) {
            fVar2 = fVar;
            fE0 = h.a(fVar2, this.f35037a, fVar.d());
        } else {
            fVar2 = fVar;
            fE0 = fVar.E0(f8);
        }
        float f9 = fE0;
        float fFloatValue = ((Number) this.f35039c.m()).floatValue();
        if (fFloatValue > 0.0f) {
            long jO = C1598l0.o(j8, fFloatValue, 0.0f, 0.0f, 0.0f, 14, null);
            if (!this.f35037a) {
                f.m0(fVar, jO, f9, 0L, 0.0f, null, null, 0, 124, null);
                return;
            }
            float fI = Q0.l.i(fVar2.d());
            float fG = Q0.l.g(fVar2.d());
            int iB = AbstractC1596k0.f9402a.b();
            T0.d dVarK0 = fVar2.K0();
            long jD = dVarK0.d();
            dVarK0.c().k();
            dVarK0.a().c(0.0f, 0.0f, fI, fG, iB);
            f.m0(fVar2, jO, f9, 0L, 0.0f, null, null, 0, 124, null);
            dVarK0.c().x();
            dVarK0.b(jD);
        }
    }

    public final void c(j jVar, J j8) {
        float fA;
        boolean z8 = jVar instanceof g;
        if (z8) {
            this.f35040d.add(jVar);
        } else if (jVar instanceof h) {
            this.f35040d.remove(((h) jVar).a());
        } else if (jVar instanceof p073i0.d) {
            this.f35040d.add(jVar);
        } else if (jVar instanceof e) {
            this.f35040d.remove(((e) jVar).a());
        } else if (jVar instanceof p073i0.b) {
            this.f35040d.add(jVar);
        } else if (jVar instanceof p073i0.c) {
            this.f35040d.remove(((p073i0.c) jVar).a());
        } else if (!(jVar instanceof p073i0.a)) {
            return;
        } else {
            this.f35040d.remove(((p073i0.a) jVar).a());
        }
        j jVar2 = (j) z.u0(this.f35040d);
        if (t.c(this.f35041e, jVar2)) {
            return;
        }
        if (jVar2 != null) {
            if (z8) {
                fA = ((f) this.f35038b.getValue()).c();
            } else if (jVar instanceof p073i0.d) {
                fA = ((f) this.f35038b.getValue()).b();
            } else {
                fA = jVar instanceof p073i0.b ? ((f) this.f35038b.getValue()).a() : 0.0f;
            }
            AbstractC1789i.d(j8, null, null, new a(fA, n.c(jVar2), null), 3, null);
        } else {
            AbstractC1789i.d(j8, null, null, new b(n.d(this.f35041e), null), 3, null);
        }
        this.f35041e = jVar2;
    }
}
