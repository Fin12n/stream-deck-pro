package p191w0;

import C6.G;
import C6.r;
import D6.z;
import G6.d;
import I6.l;
import J0.v;
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

/* JADX INFO: renamed from: w0.w0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3092w0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f36655a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f36656b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f36657c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f36658d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f36659e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float f36660f;

    /* JADX INFO: renamed from: w0.w0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36661a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f36662b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v f36663c;

        /* JADX INFO: renamed from: w0.w0$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0816a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v f36664a;

            public C0816a(v vVar) {
                this.f36664a = vVar;
            }

            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(j jVar, d dVar) {
                if (jVar instanceof g) {
                    this.f36664a.add(jVar);
                } else if (jVar instanceof h) {
                    this.f36664a.remove(((h) jVar).a());
                } else if (jVar instanceof p073i0.d) {
                    this.f36664a.add(jVar);
                } else if (jVar instanceof e) {
                    this.f36664a.remove(((e) jVar).a());
                } else if (jVar instanceof p) {
                    this.f36664a.add(jVar);
                } else if (jVar instanceof q) {
                    this.f36664a.remove(((q) jVar).a());
                } else if (jVar instanceof p073i0.o) {
                    this.f36664a.remove(((p073i0.o) jVar).a());
                } else if (jVar instanceof p073i0.b) {
                    this.f36664a.add(jVar);
                } else if (jVar instanceof c) {
                    this.f36664a.remove(((c) jVar).a());
                } else if (jVar instanceof p073i0.a) {
                    this.f36664a.remove(((p073i0.a) jVar).a());
                }
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, v vVar, d dVar) {
            super(2, dVar);
            this.f36662b = kVar;
            this.f36663c = vVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f36662b, this.f36663c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f36661a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2260f interfaceC2260fC = this.f36662b.c();
                C0816a c0816a = new C0816a(this.f36663c);
                this.f36661a = 1;
                if (interfaceC2260fC.collect(c0816a, this) == objF) {
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

    /* JADX INFO: renamed from: w0.w0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36665a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2205a f36666b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f36667c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f36668d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j f36669e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ InterfaceC3164l0 f36670f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2205a c2205a, float f8, boolean z8, j jVar, InterfaceC3164l0 interfaceC3164l0, d dVar) {
            super(2, dVar);
            this.f36666b = c2205a;
            this.f36667c = f8;
            this.f36668d = z8;
            this.f36669e = jVar;
            this.f36670f = interfaceC3164l0;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new b(this.f36666b, this.f36667c, this.f36668d, this.f36669e, this.f36670f, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0044, code lost:
        
            if (r6.t(r1, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0059, code lost:
        
            if (p191w0.H.d(r1, r3, r6, r4, r5) == r0) goto L19;
         */
        /* JADX WARN: Code restructure failed: missing block: B:19:0x005b, code lost:
        
            return r0;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f36665a;
            if (i8 == 0) {
                r.b(obj);
                if (!A1.h.t(((A1.h) this.f36666b.k()).w(), this.f36667c)) {
                    if (this.f36668d) {
                        j jVarD = C3092w0.d(this.f36670f);
                        C2205a c2205a = this.f36666b;
                        float f8 = this.f36667c;
                        j jVar = this.f36669e;
                        this.f36665a = 2;
                    } else {
                        C2205a c2205a2 = this.f36666b;
                        A1.h hVarD = A1.h.d(this.f36667c);
                        this.f36665a = 1;
                    }
                }
                return G.f1419a;
            }
            if (i8 != 1 && i8 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            C3092w0.e(this.f36670f, this.f36669e);
            return G.f1419a;
        }
    }

    public /* synthetic */ C3092w0(float f8, float f9, float f10, float f11, float f12, float f13, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, f12, f13);
    }

    public static final j d(InterfaceC3164l0 interfaceC3164l0) {
        return (j) interfaceC3164l0.getValue();
    }

    public static final void e(InterfaceC3164l0 interfaceC3164l0, j jVar) {
        interfaceC3164l0.setValue(jVar);
    }

    public final q1 c(boolean z8, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        float f8;
        C2205a c2205a;
        interfaceC3163l.f(664514136);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(664514136, i8, -1, "androidx.compose.material3.SelectableChipElevation.animateElevation (Chip.kt:2259)");
        }
        interfaceC3163l.f(-699454716);
        Object objG = interfaceC3163l.g();
        InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
        if (objG == aVar.a()) {
            objG = g1.f();
            interfaceC3163l.H(objG);
        }
        v vVar = (v) objG;
        interfaceC3163l.N();
        interfaceC3163l.f(-699454638);
        Object objG2 = interfaceC3163l.g();
        if (objG2 == aVar.a()) {
            objG2 = l1.e(null, null, 2, null);
            interfaceC3163l.H(objG2);
        }
        InterfaceC3164l0 interfaceC3164l0 = (InterfaceC3164l0) objG2;
        interfaceC3163l.N();
        interfaceC3163l.f(-699454548);
        boolean z9 = true;
        boolean z10 = (((i8 & 112) ^ 48) > 32 && interfaceC3163l.R(kVar)) || (i8 & 48) == 32;
        Object objG3 = interfaceC3163l.g();
        if (z10 || objG3 == aVar.a()) {
            objG3 = new a(kVar, vVar, null);
            interfaceC3163l.H(objG3);
        }
        interfaceC3163l.N();
        K.d(kVar, (o) objG3, interfaceC3163l, (i8 >> 3) & 14);
        j jVar = (j) z.u0(vVar);
        if (!z8) {
            f8 = this.f36660f;
        } else if (jVar instanceof p) {
            f8 = this.f36656b;
        } else if (jVar instanceof g) {
            f8 = this.f36658d;
        } else if (jVar instanceof p073i0.d) {
            f8 = this.f36657c;
        } else {
            f8 = jVar instanceof p073i0.b ? this.f36659e : this.f36655a;
        }
        interfaceC3163l.f(-699452563);
        Object objG4 = interfaceC3163l.g();
        if (objG4 == aVar.a()) {
            Object c2205a2 = new C2205a(A1.h.d(f8), l0.b(A1.h.f432b), null, null, 12, null);
            interfaceC3163l.H(c2205a2);
            objG4 = c2205a2;
        }
        C2205a c2205a3 = (C2205a) objG4;
        interfaceC3163l.N();
        A1.h hVarD = A1.h.d(f8);
        interfaceC3163l.f(-699452479);
        boolean zL = interfaceC3163l.l(c2205a3) | interfaceC3163l.h(f8);
        if ((((i8 & 14) ^ 6) <= 4 || !interfaceC3163l.c(z8)) && (i8 & 6) != 4) {
            z9 = false;
        }
        boolean zL2 = zL | z9 | interfaceC3163l.l(jVar);
        Object objG5 = interfaceC3163l.g();
        if (zL2 || objG5 == aVar.a()) {
            c2205a = c2205a3;
            Object bVar = new b(c2205a, f8, z8, jVar, interfaceC3164l0, null);
            interfaceC3163l.H(bVar);
            objG5 = bVar;
        } else {
            c2205a = c2205a3;
        }
        interfaceC3163l.N();
        K.d(hVarD, (o) objG5, interfaceC3163l, 0);
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
        if (obj == null || !(obj instanceof C3092w0)) {
            return false;
        }
        C3092w0 c3092w0 = (C3092w0) obj;
        return A1.h.t(this.f36655a, c3092w0.f36655a) && A1.h.t(this.f36656b, c3092w0.f36656b) && A1.h.t(this.f36657c, c3092w0.f36657c) && A1.h.t(this.f36658d, c3092w0.f36658d) && A1.h.t(this.f36660f, c3092w0.f36660f);
    }

    public final q1 f(boolean z8, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-1888175651);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1888175651, i8, -1, "androidx.compose.material3.SelectableChipElevation.shadowElevation (Chip.kt:2251)");
        }
        q1 q1VarC = c(z8, kVar, interfaceC3163l, i8 & 1022);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarC;
    }

    public final float g(boolean z8) {
        return z8 ? this.f36655a : this.f36660f;
    }

    public int hashCode() {
        return (((((((A1.h.u(this.f36655a) * 31) + A1.h.u(this.f36656b)) * 31) + A1.h.u(this.f36657c)) * 31) + A1.h.u(this.f36658d)) * 31) + A1.h.u(this.f36660f);
    }

    public C3092w0(float f8, float f9, float f10, float f11, float f12, float f13) {
        this.f36655a = f8;
        this.f36656b = f9;
        this.f36657c = f10;
        this.f36658d = f11;
        this.f36659e = f12;
        this.f36660f = f13;
    }
}
