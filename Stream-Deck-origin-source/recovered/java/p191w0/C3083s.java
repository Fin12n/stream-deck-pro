package p191w0;

import C6.G;
import C6.r;
import D6.z;
import G6.d;
import I6.l;
import J0.v;
import Q0.f;
import Q6.o;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.J;
import p037e0.C2205a;
import p037e0.l0;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p073i0.c;
import p073i0.e;
import p073i0.g;
import p073i0.h;
import p073i0.j;
import p073i0.k;
import p073i0.p;
import p073i0.q;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.K;
import p215z0.g1;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: renamed from: w0.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3083s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f36368a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f36369b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f36370c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f36371d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f36372e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f36373f;

    /* JADX INFO: renamed from: w0.s$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36374a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f36375b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v f36376c;

        /* JADX INFO: renamed from: w0.s$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0811a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v f36377a;

            public C0811a(v vVar) {
                this.f36377a = vVar;
            }

            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(j jVar, d dVar) {
                if (jVar instanceof g) {
                    this.f36377a.add(jVar);
                } else if (jVar instanceof h) {
                    this.f36377a.remove(((h) jVar).a());
                } else if (jVar instanceof p073i0.d) {
                    this.f36377a.add(jVar);
                } else if (jVar instanceof e) {
                    this.f36377a.remove(((e) jVar).a());
                } else if (jVar instanceof p) {
                    this.f36377a.add(jVar);
                } else if (jVar instanceof q) {
                    this.f36377a.remove(((q) jVar).a());
                } else if (jVar instanceof p073i0.o) {
                    this.f36377a.remove(((p073i0.o) jVar).a());
                } else if (jVar instanceof p073i0.b) {
                    this.f36377a.add(jVar);
                } else if (jVar instanceof c) {
                    this.f36377a.remove(((c) jVar).a());
                } else if (jVar instanceof p073i0.a) {
                    this.f36377a.remove(((p073i0.a) jVar).a());
                }
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, v vVar, d dVar) {
            super(2, dVar);
            this.f36375b = kVar;
            this.f36376c = vVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f36375b, this.f36376c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f36374a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2260f interfaceC2260fC = this.f36375b.c();
                C0811a c0811a = new C0811a(this.f36376c);
                this.f36374a = 1;
                if (interfaceC2260fC.collect(c0811a, this) == objF) {
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

    /* JADX INFO: renamed from: w0.s$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36378a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2205a f36379b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f36380c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f36381d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C3083s f36382e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j f36383f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2205a c2205a, float f8, boolean z8, C3083s c3083s, j jVar, d dVar) {
            super(2, dVar);
            this.f36379b = c2205a;
            this.f36380c = f8;
            this.f36381d = z8;
            this.f36382e = c3083s;
            this.f36383f = jVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new b(this.f36379b, this.f36380c, this.f36381d, this.f36382e, this.f36383f, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (r7.t(r1, r6) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:30:0x00af, code lost:
        
            if (p191w0.H.d(r7, r1, r3, r4, r6) == r0) goto L31;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x00b1, code lost:
        
            return r0;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f36378a;
            if (i8 == 0) {
                r.b(obj);
                if (!A1.h.t(((A1.h) this.f36379b.k()).w(), this.f36380c)) {
                    if (this.f36381d) {
                        float fW = ((A1.h) this.f36379b.k()).w();
                        j bVar = null;
                        if (A1.h.t(fW, this.f36382e.f36369b)) {
                            bVar = new p(f.f9082b.c(), null);
                        } else if (A1.h.t(fW, this.f36382e.f36371d)) {
                            bVar = new g();
                        } else if (A1.h.t(fW, this.f36382e.f36370c)) {
                            bVar = new p073i0.d();
                        } else if (A1.h.t(fW, this.f36382e.f36372e)) {
                            bVar = new p073i0.b();
                        }
                        C2205a c2205a = this.f36379b;
                        float f8 = this.f36380c;
                        j jVar = this.f36383f;
                        this.f36378a = 2;
                    } else {
                        C2205a c2205a2 = this.f36379b;
                        A1.h hVarD = A1.h.d(this.f36380c);
                        this.f36378a = 1;
                    }
                }
            } else {
                if (i8 != 1 && i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    public /* synthetic */ C3083s(float f8, float f9, float f10, float f11, float f12, float f13, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, f12, f13);
    }

    public final q1 e(boolean z8, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        float f8;
        C2205a c2205a;
        interfaceC3163l.f(-1421890746);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1421890746, i8, -1, "androidx.compose.material3.CardElevation.animateElevation (Card.kt:662)");
        }
        interfaceC3163l.f(-748208142);
        Object objG = interfaceC3163l.g();
        InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
        if (objG == aVar.a()) {
            objG = g1.f();
            interfaceC3163l.H(objG);
        }
        v vVar = (v) objG;
        interfaceC3163l.N();
        interfaceC3163l.f(-748208053);
        boolean z9 = true;
        boolean z10 = (((i8 & 112) ^ 48) > 32 && interfaceC3163l.R(kVar)) || (i8 & 48) == 32;
        Object objG2 = interfaceC3163l.g();
        if (z10 || objG2 == aVar.a()) {
            objG2 = new a(kVar, vVar, null);
            interfaceC3163l.H(objG2);
        }
        interfaceC3163l.N();
        K.d(kVar, (o) objG2, interfaceC3163l, (i8 >> 3) & 14);
        j jVar = (j) z.u0(vVar);
        if (!z8) {
            f8 = this.f36373f;
        } else if (jVar instanceof p) {
            f8 = this.f36369b;
        } else if (jVar instanceof g) {
            f8 = this.f36371d;
        } else if (jVar instanceof p073i0.d) {
            f8 = this.f36370c;
        } else {
            f8 = jVar instanceof p073i0.b ? this.f36372e : this.f36368a;
        }
        interfaceC3163l.f(-748206009);
        Object objG3 = interfaceC3163l.g();
        if (objG3 == aVar.a()) {
            Object c2205a2 = new C2205a(A1.h.d(f8), l0.b(A1.h.f432b), null, null, 12, null);
            interfaceC3163l.H(c2205a2);
            objG3 = c2205a2;
        }
        C2205a c2205a3 = (C2205a) objG3;
        interfaceC3163l.N();
        A1.h hVarD = A1.h.d(f8);
        interfaceC3163l.f(-748205925);
        boolean zL = interfaceC3163l.l(c2205a3) | interfaceC3163l.h(f8) | ((((i8 & 14) ^ 6) > 4 && interfaceC3163l.c(z8)) || (i8 & 6) == 4);
        if ((((i8 & 896) ^ 384) <= 256 || !interfaceC3163l.R(this)) && (i8 & 384) != 256) {
            z9 = false;
        }
        boolean zL2 = zL | z9 | interfaceC3163l.l(jVar);
        Object objG4 = interfaceC3163l.g();
        if (zL2 || objG4 == aVar.a()) {
            c2205a = c2205a3;
            Object bVar = new b(c2205a, f8, z8, this, jVar, null);
            interfaceC3163l.H(bVar);
            objG4 = bVar;
        } else {
            c2205a = c2205a3;
        }
        interfaceC3163l.N();
        K.d(hVarD, (o) objG4, interfaceC3163l, 0);
        q1 q1VarG = c2205a.g();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarG;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3083s)) {
            return false;
        }
        C3083s c3083s = (C3083s) obj;
        return A1.h.t(this.f36368a, c3083s.f36368a) && A1.h.t(this.f36369b, c3083s.f36369b) && A1.h.t(this.f36370c, c3083s.f36370c) && A1.h.t(this.f36371d, c3083s.f36371d) && A1.h.t(this.f36373f, c3083s.f36373f);
    }

    public final q1 f(boolean z8, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1763481333);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1763481333, i8, -1, "androidx.compose.material3.CardElevation.shadowElevation (Card.kt:651)");
        }
        interfaceC3163l.f(-1409178619);
        if (kVar != null) {
            interfaceC3163l.N();
            q1 q1VarE = e(z8, kVar, interfaceC3163l, i8 & 1022);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return q1VarE;
        }
        interfaceC3163l.f(-1409178567);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = l1.e(A1.h.d(this.f36368a), null, 2, null);
            interfaceC3163l.H(objG);
        }
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG;
        interfaceC3163l.N();
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return interfaceC3164l0;
    }

    public final float g(boolean z8) {
        return z8 ? this.f36368a : this.f36373f;
    }

    public int hashCode() {
        return (((((((A1.h.u(this.f36368a) * 31) + A1.h.u(this.f36369b)) * 31) + A1.h.u(this.f36370c)) * 31) + A1.h.u(this.f36371d)) * 31) + A1.h.u(this.f36373f);
    }

    public C3083s(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.f36368a = f8;
        this.f36369b = f9;
        this.f36370c = f10;
        this.f36371d = f11;
        this.f36372e = f12;
        this.f36373f = f13;
    }
}
