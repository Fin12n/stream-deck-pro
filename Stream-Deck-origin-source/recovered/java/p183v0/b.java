package p183v0;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.l;
import J0.x;
import Q0.f;
import Q6.o;
import R0.C1598l0;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1789i;
import p017b7.J;
import p073i0.p;
import p215z0.L0;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends m implements L0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f34958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final q1 f34959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final q1 f34960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final x f34961f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34962a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ g f34963b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f34964c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p f34965d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(g gVar, b bVar, p pVar, d dVar) {
            super(2, dVar);
            this.f34963b = gVar;
            this.f34964c = bVar;
            this.f34965d = pVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f34963b, this.f34964c, this.f34965d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f34962a;
            try {
                if (i8 == 0) {
                    r.b(obj);
                    g gVar = this.f34963b;
                    this.f34962a = 1;
                    if (gVar.d(this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                this.f34964c.f34961f.remove(this.f34965d);
                return G.f1419a;
            } catch (Throwable th) {
                this.f34964c.f34961f.remove(this.f34965d);
                throw th;
            }
        }
    }

    public /* synthetic */ b(boolean z8, float f8, q1 q1Var, q1 q1Var2, AbstractC2633k abstractC2633k) {
        this(z8, f8, q1Var, q1Var2);
    }

    @Override // p046f0.F
    public void a(T0.c cVar) {
        long jY = ((C1598l0) this.f34959d.getValue()).y();
        cVar.v1();
        f(cVar, this.f34958c, jY);
        j(cVar, jY);
    }

    @Override // p215z0.L0
    public void b() {
        this.f34961f.clear();
    }

    @Override // p215z0.L0
    public void c() {
        this.f34961f.clear();
    }

    @Override // p183v0.m
    public void e(p pVar, J j8) {
        Iterator it = this.f34961f.entrySet().iterator();
        while (it.hasNext()) {
            ((g) ((Map.Entry) it.next()).getValue()).h();
        }
        g gVar = new g(this.f34957b ? f.d(pVar.a()) : null, this.f34958c, this.f34957b, null);
        this.f34961f.put(pVar, gVar);
        AbstractC1789i.d(j8, null, null, new a(gVar, this, pVar, null), 3, null);
    }

    @Override // p183v0.m
    public void g(p pVar) {
        g gVar = (g) this.f34961f.get(pVar);
        if (gVar != null) {
            gVar.h();
        }
    }

    public final void j(T0.f fVar, long j8) {
        long j9;
        Iterator it = this.f34961f.entrySet().iterator();
        while (it.hasNext()) {
            g gVar = (g) ((Map.Entry) it.next()).getValue();
            float fD = ((f) this.f34960e.getValue()).d();
            if (fD == 0.0f) {
                j9 = j8;
            } else {
                j9 = j8;
                gVar.e(fVar, C1598l0.o(j9, fD, 0.0f, 0.0f, 0.0f, 14, null));
            }
            j8 = j9;
        }
    }

    public b(boolean z8, float f8, q1 q1Var, q1 q1Var2) {
        super(z8, q1Var2);
        this.f34957b = z8;
        this.f34958c = f8;
        this.f34959d = q1Var;
        this.f34960e = q1Var2;
        this.f34961f = g1.h();
    }

    @Override // p215z0.L0
    public void d() {
    }
}
