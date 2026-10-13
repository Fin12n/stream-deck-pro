package p191w0;

import A1.h;
import C6.G;
import C6.r;
import D6.z;
import G6.d;
import H6.c;
import I6.l;
import J0.v;
import Q0.f;
import Q6.o;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.J;
import p037e0.C2205a;
import p037e0.l0;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p073i0.e;
import p073i0.g;
import p073i0.j;
import p073i0.k;
import p073i0.p;
import p073i0.q;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.K;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: renamed from: w0.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3076o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f36282a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f36283b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f36284c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final float f36285d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f36286e;

    /* JADX INFO: renamed from: w0.o$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36291a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C2205a f36292b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f36293c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f36294d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ C3076o f36295e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ j f36296f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2205a c2205a, float f8, boolean z8, C3076o c3076o, j jVar, d dVar) {
            super(2, dVar);
            this.f36292b = c2205a;
            this.f36293c = f8;
            this.f36294d = z8;
            this.f36295e = c3076o;
            this.f36296f = jVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new b(this.f36292b, this.f36293c, this.f36294d, this.f36295e, this.f36296f, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        
            if (r7.t(r1, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x009d, code lost:
        
            if (p191w0.H.d(r7, r1, r3, r4, r6) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x009f, code lost:
        
            return r0;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f36291a;
            if (i8 == 0) {
                r.b(obj);
                if (!h.t(((h) this.f36292b.k()).w(), this.f36293c)) {
                    if (this.f36294d) {
                        float fW = ((h) this.f36292b.k()).w();
                        j dVar = null;
                        if (h.t(fW, this.f36295e.f36283b)) {
                            dVar = new p(f.f9082b.c(), null);
                        } else if (h.t(fW, this.f36295e.f36285d)) {
                            dVar = new g();
                        } else if (h.t(fW, this.f36295e.f36284c)) {
                            dVar = new p073i0.d();
                        }
                        C2205a c2205a = this.f36292b;
                        float f8 = this.f36293c;
                        j jVar = this.f36296f;
                        this.f36291a = 2;
                    } else {
                        C2205a c2205a2 = this.f36292b;
                        h hVarD = h.d(this.f36293c);
                        this.f36291a = 1;
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

    public /* synthetic */ C3076o(float f8, float f9, float f10, float f11, float f12, AbstractC2633k abstractC2633k) {
        this(f8, f9, f10, f11, f12);
    }

    public final q1 d(boolean z8, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        float f8;
        C2205a c2205a;
        interfaceC3163l.f(-1312510462);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1312510462, i8, -1, "androidx.compose.material3.ButtonElevation.animateElevation (Button.kt:895)");
        }
        interfaceC3163l.f(-719928578);
        Object objG = interfaceC3163l.g();
        InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
        if (objG == aVar.a()) {
            objG = g1.f();
            interfaceC3163l.H(objG);
        }
        v vVar = (v) objG;
        interfaceC3163l.N();
        interfaceC3163l.f(-719928489);
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
            f8 = this.f36286e;
        } else if (jVar instanceof p) {
            f8 = this.f36283b;
        } else if (jVar instanceof g) {
            f8 = this.f36285d;
        } else {
            f8 = jVar instanceof p073i0.d ? this.f36284c : this.f36282a;
        }
        interfaceC3163l.f(-719926909);
        Object objG3 = interfaceC3163l.g();
        if (objG3 == aVar.a()) {
            Object c2205a2 = new C2205a(h.d(f8), l0.b(h.f432b), null, null, 12, null);
            interfaceC3163l.H(c2205a2);
            objG3 = c2205a2;
        }
        C2205a c2205a3 = (C2205a) objG3;
        interfaceC3163l.N();
        h hVarD = h.d(f8);
        interfaceC3163l.f(-719926825);
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

    public final q1 e(boolean z8, k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-2045116089);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-2045116089, i8, -1, "androidx.compose.material3.ButtonElevation.shadowElevation (Button.kt:887)");
        }
        q1 q1VarD = d(z8, kVar, interfaceC3163l, i8 & 1022);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return q1VarD;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3076o)) {
            return false;
        }
        C3076o c3076o = (C3076o) obj;
        return h.t(this.f36282a, c3076o.f36282a) && h.t(this.f36283b, c3076o.f36283b) && h.t(this.f36284c, c3076o.f36284c) && h.t(this.f36285d, c3076o.f36285d) && h.t(this.f36286e, c3076o.f36286e);
    }

    public final float f(boolean z8) {
        return z8 ? this.f36282a : this.f36286e;
    }

    public int hashCode() {
        return (((((((h.u(this.f36282a) * 31) + h.u(this.f36283b)) * 31) + h.u(this.f36284c)) * 31) + h.u(this.f36285d)) * 31) + h.u(this.f36286e);
    }

    /* JADX INFO: renamed from: w0.o$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f36287a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f36288b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ v f36289c;

        /* JADX INFO: renamed from: w0.o$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0810a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ v f36290a;

            public C0810a(v vVar) {
                this.f36290a = vVar;
            }

            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(j jVar, d dVar) {
                if (jVar instanceof g) {
                    this.f36290a.add(jVar);
                } else if (jVar instanceof p073i0.h) {
                    this.f36290a.remove(((p073i0.h) jVar).a());
                } else if (jVar instanceof p073i0.d) {
                    this.f36290a.add(jVar);
                } else if (jVar instanceof e) {
                    this.f36290a.remove(((e) jVar).a());
                } else if (jVar instanceof p) {
                    this.f36290a.add(jVar);
                } else if (jVar instanceof q) {
                    this.f36290a.remove(((q) jVar).a());
                } else if (jVar instanceof p073i0.o) {
                    this.f36290a.remove(((p073i0.o) jVar).a());
                }
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(k kVar, v vVar, d dVar) {
            super(2, dVar);
            this.f36288b = kVar;
            this.f36289c = vVar;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f36288b, this.f36289c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f36287a;
            if (i8 != 0) {
                if (i8 == 1) {
                    r.b(obj);
                } else {
                    throw new IllegalStateException(WaYxBuDSBD.vkVffVggtWs);
                }
            } else {
                r.b(obj);
                InterfaceC2260f interfaceC2260fC = this.f36288b.c();
                C0810a c0810a = new C0810a(this.f36289c);
                this.f36287a = 1;
                if (interfaceC2260fC.collect(c0810a, this) == objF) {
                    return objF;
                }
            }
            return G.f1419a;
        }
    }

    public C3076o(float f8, float f9, float f10, float f11, float f12) {
        this.f36282a = f8;
        this.f36283b = f9;
        this.f36284c = f10;
        this.f36285d = f11;
        this.f36286e = f12;
    }
}
