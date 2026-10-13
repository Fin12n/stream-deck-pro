package p046f0;

import A1.s;
import A1.z;
import C6.G;
import C6.r;
import I6.l;
import L0.i;
import Q0.f;
import Q0.g;
import Q0.m;
import Q6.k;
import Q6.o;
import R0.AbstractC1602n0;
import R0.F;
import R0.InterfaceC1586f0;
import android.content.Context;
import android.graphics.Canvas;
import android.widget.EdgeEffect;
import java.util.List;
import kotlin.jvm.internal.u;
import p002a1.e;
import p011b1.I;
import p011b1.InterfaceC1755c;
import p011b1.S;
import p011b1.y;
import p038e1.U;
import p055g0.x;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p215z0.InterfaceC3160j0;
import p215z0.X0;

/* JADX INFO: renamed from: f0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2273a implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final P f21375a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public f f21376b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EdgeEffect f21377c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final EdgeEffect f21378d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final EdgeEffect f21379e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EdgeEffect f21380f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f21381g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final EdgeEffect f21382h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final EdgeEffect f21383i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final EdgeEffect f21384j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final EdgeEffect f21385k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f21386l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final InterfaceC3160j0 f21387m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f21388n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f21389o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public long f21390p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final k f21391q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public y f21392r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final i f21393s;

    /* JADX INFO: renamed from: f0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0503a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21394a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f21395b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21396c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21398e;

        public C0503a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21396c = obj;
            this.f21398e |= Integer.MIN_VALUE;
            return C2273a.this.d(0L, null, this);
        }
    }

    /* JADX INFO: renamed from: f0.a$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f21400b;

        /* JADX INFO: renamed from: f0.a$b$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0504a extends I6.k implements o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f21402b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f21403c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ C2273a f21404d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0504a(C2273a c2273a, G6.d dVar) {
                super(2, dVar);
                this.f21404d = c2273a;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                C0504a c0504a = new C0504a(this.f21404d, dVar);
                c0504a.f21403c = obj;
                return c0504a;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
                return ((C0504a) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:26:0x009b  */
            /* JADX WARN: Code duplicated, block: B:29:0x00b1 A[LOOP:1: B:25:0x0099->B:29:0x00b1, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:44:0x00b5 A[EDGE_INSN: B:44:0x00b5->B:31:0x00b5 BREAK  A[LOOP:1: B:25:0x0099->B:29:0x00b1], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0066 -> B:18:0x0069). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // I6.a
            public final java.lang.Object invokeSuspend(java.lang.Object r14) {
                /*
                    Method dump skipped, instruction units count: 234
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: p046f0.C2273a.b.C0504a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = C2273a.this.new b(dVar);
            bVar.f21400b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i8, G6.d dVar) {
            return ((b) create(i8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f21399a;
            if (i8 == 0) {
                r.b(obj);
                I i9 = (I) this.f21400b;
                C0504a c0504a = new C0504a(C2273a.this, null);
                this.f21399a = 1;
                if (x.c(i9, c0504a, this) == objF) {
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

    /* JADX INFO: renamed from: f0.a$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {
        public c() {
            super(1);
        }

        public final void b(long j8) {
            boolean zF = Q0.l.f(s.c(j8), C2273a.this.f21390p);
            C2273a.this.f21390p = s.c(j8);
            if (!zF) {
                C2273a.this.f21377c.setSize(A1.r.g(j8), A1.r.f(j8));
                C2273a.this.f21378d.setSize(A1.r.g(j8), A1.r.f(j8));
                C2273a.this.f21379e.setSize(A1.r.f(j8), A1.r.g(j8));
                C2273a.this.f21380f.setSize(A1.r.f(j8), A1.r.g(j8));
                C2273a.this.f21382h.setSize(A1.r.g(j8), A1.r.f(j8));
                C2273a.this.f21383i.setSize(A1.r.g(j8), A1.r.f(j8));
                C2273a.this.f21384j.setSize(A1.r.f(j8), A1.r.g(j8));
                C2273a.this.f21385k.setSize(A1.r.f(j8), A1.r.g(j8));
            }
            if (zF) {
                return;
            }
            C2273a.this.A();
            C2273a.this.t();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b(((A1.r) obj).j());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: f0.a$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {
        public d() {
            super(1);
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("overscroll");
            c2403m0.c(C2273a.this);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    public C2273a(Context context, P p8) {
        this.f21375a = p8;
        C2290s c2290s = C2290s.f21497a;
        EdgeEffect edgeEffectA = c2290s.a(context, null);
        this.f21377c = edgeEffectA;
        EdgeEffect edgeEffectA2 = c2290s.a(context, null);
        this.f21378d = edgeEffectA2;
        EdgeEffect edgeEffectA3 = c2290s.a(context, null);
        this.f21379e = edgeEffectA3;
        EdgeEffect edgeEffectA4 = c2290s.a(context, null);
        this.f21380f = edgeEffectA4;
        List listQ = D6.r.q(edgeEffectA3, edgeEffectA, edgeEffectA4, edgeEffectA2);
        this.f21381g = listQ;
        this.f21382h = c2290s.a(context, null);
        this.f21383i = c2290s.a(context, null);
        this.f21384j = c2290s.a(context, null);
        this.f21385k = c2290s.a(context, null);
        int size = listQ.size();
        for (int i8 = 0; i8 < size; i8++) {
            ((EdgeEffect) listQ.get(i8)).setColor(AbstractC1602n0.j(this.f21375a.b()));
        }
        this.f21386l = -1;
        this.f21387m = X0.a(0);
        this.f21388n = true;
        this.f21390p = Q0.l.f9103b.b();
        c cVar = new c();
        this.f21391q = cVar;
        this.f21393s = U.a(S.c(i.f4836a.j(AbstractC2274b.f21422a), G.f1419a, new b(null)), cVar).j(new r(this, AbstractC2401l0.c() ? new d() : AbstractC2401l0.a()));
    }

    public final void A() {
        if (this.f21388n && this.f21386l == z()) {
            G(z() + 1);
        }
    }

    public final float B(long j8, long j9) {
        float fO = f.o(j9) / Q0.l.i(this.f21390p);
        float fP = f.p(j8) / Q0.l.g(this.f21390p);
        C2290s c2290s = C2290s.f21497a;
        return c2290s.b(this.f21378d) == 0.0f ? (-c2290s.d(this.f21378d, -fP, 1 - fO)) * Q0.l.g(this.f21390p) : f.p(j8);
    }

    public final float C(long j8, long j9) {
        float fP = f.p(j9) / Q0.l.g(this.f21390p);
        float fO = f.o(j8) / Q0.l.i(this.f21390p);
        C2290s c2290s = C2290s.f21497a;
        return c2290s.b(this.f21379e) == 0.0f ? c2290s.d(this.f21379e, fO, 1 - fP) * Q0.l.i(this.f21390p) : f.o(j8);
    }

    public final float D(long j8, long j9) {
        float fP = f.p(j9) / Q0.l.g(this.f21390p);
        float fO = f.o(j8) / Q0.l.i(this.f21390p);
        C2290s c2290s = C2290s.f21497a;
        return c2290s.b(this.f21380f) == 0.0f ? (-c2290s.d(this.f21380f, -fO, fP)) * Q0.l.i(this.f21390p) : f.o(j8);
    }

    public final float E(long j8, long j9) {
        float fO = f.o(j9) / Q0.l.i(this.f21390p);
        float fP = f.p(j8) / Q0.l.g(this.f21390p);
        C2290s c2290s = C2290s.f21497a;
        return c2290s.b(this.f21377c) == 0.0f ? c2290s.d(this.f21377c, fP, fO) * Q0.l.g(this.f21390p) : f.p(j8);
    }

    public final boolean F(long j8) {
        boolean zIsFinished;
        if (this.f21379e.isFinished() || f.o(j8) >= 0.0f) {
            zIsFinished = false;
        } else {
            C2290s.f21497a.e(this.f21379e, f.o(j8));
            zIsFinished = this.f21379e.isFinished();
        }
        if (!this.f21380f.isFinished() && f.o(j8) > 0.0f) {
            C2290s.f21497a.e(this.f21380f, f.o(j8));
            zIsFinished = zIsFinished || this.f21380f.isFinished();
        }
        if (!this.f21377c.isFinished() && f.p(j8) < 0.0f) {
            C2290s.f21497a.e(this.f21377c, f.p(j8));
            zIsFinished = zIsFinished || this.f21377c.isFinished();
        }
        if (this.f21378d.isFinished() || f.p(j8) <= 0.0f) {
            return zIsFinished;
        }
        C2290s.f21497a.e(this.f21378d, f.p(j8));
        return zIsFinished || this.f21378d.isFinished();
    }

    public final void G(int i8) {
        this.f21387m.p(i8);
    }

    public final boolean H() {
        boolean z8;
        long jB = m.b(this.f21390p);
        C2290s c2290s = C2290s.f21497a;
        if (c2290s.b(this.f21379e) == 0.0f) {
            z8 = false;
        } else {
            C(f.f9082b.c(), jB);
            z8 = true;
        }
        if (c2290s.b(this.f21380f) != 0.0f) {
            D(f.f9082b.c(), jB);
            z8 = true;
        }
        if (c2290s.b(this.f21377c) != 0.0f) {
            E(f.f9082b.c(), jB);
            z8 = true;
        }
        if (c2290s.b(this.f21378d) == 0.0f) {
            return z8;
        }
        B(f.f9082b.c(), jB);
        return true;
    }

    @Override // p046f0.S
    public i a() {
        return this.f21393s;
    }

    @Override // p046f0.S
    public boolean b() {
        List list = this.f21381g;
        int size = list.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!(C2290s.f21497a.b((EdgeEffect) list.get(i8)) == 0.0f)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x003f  */
    /* JADX WARN: Code duplicated, block: B:57:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x012b  */
    /* JADX WARN: Code duplicated, block: B:61:0x0133  */
    /* JADX WARN: Code duplicated, block: B:62:0x0137  */
    /* JADX WARN: Code duplicated, block: B:64:0x013a A[ADDED_TO_REGION] */
    @Override // p046f0.S
    public long c(long j8, int i8, k kVar) {
        float fE;
        boolean z8;
        boolean z9;
        float fC;
        if (Q0.l.k(this.f21390p)) {
            return ((f) kVar.invoke(f.d(j8))).x();
        }
        boolean z10 = true;
        if (!this.f21389o) {
            H();
            this.f21389o = true;
        }
        f fVar = this.f21376b;
        long jX = fVar != null ? fVar.x() : m.b(this.f21390p);
        float f8 = 0.0f;
        if (f.p(j8) == 0.0f) {
            fE = 0.0f;
        } else {
            C2290s c2290s = C2290s.f21497a;
            if (c2290s.b(this.f21377c) != 0.0f) {
                fE = E(j8, jX);
                if (c2290s.b(this.f21377c) == 0.0f) {
                    this.f21377c.onRelease();
                }
            } else if (c2290s.b(this.f21378d) == 0.0f) {
                fE = 0.0f;
            } else {
                fE = B(j8, jX);
                if (c2290s.b(this.f21378d) == 0.0f) {
                    this.f21378d.onRelease();
                }
            }
        }
        if (f.o(j8) != 0.0f) {
            C2290s c2290s2 = C2290s.f21497a;
            if (c2290s2.b(this.f21379e) != 0.0f) {
                fC = C(j8, jX);
                if (c2290s2.b(this.f21379e) == 0.0f) {
                    this.f21379e.onRelease();
                }
            } else if (c2290s2.b(this.f21380f) != 0.0f) {
                fC = D(j8, jX);
                if (c2290s2.b(this.f21380f) == 0.0f) {
                    this.f21380f.onRelease();
                }
            }
            f8 = fC;
        }
        long jA = g.a(f8, fE);
        if (!f.l(jA, f.f9082b.c())) {
            A();
        }
        long jS = f.s(j8, jA);
        long jX2 = ((f) kVar.invoke(f.d(jS))).x();
        long jS2 = f.s(jS, jX2);
        boolean z11 = false;
        if (e.e(i8, e.f13022a.a())) {
            if (f.o(jS2) > 0.5f) {
                C(jS2, jX);
            } else {
                if (f.o(jS2) < -0.5f) {
                    D(jS2, jX);
                } else {
                    z8 = false;
                }
                if (f.p(jS2) > 0.5f) {
                    E(jS2, jX);
                } else {
                    if (f.p(jS2) < -0.5f) {
                        B(jS2, jX);
                    } else {
                        z9 = false;
                    }
                    if (!z8 && !z9) {
                        z10 = false;
                    }
                    z11 = z10;
                }
                z9 = true;
                if (!z8) {
                    z10 = false;
                }
                z11 = z10;
            }
            z8 = true;
            if (f.p(jS2) > 0.5f) {
                E(jS2, jX);
            } else {
                if (f.p(jS2) < -0.5f) {
                    B(jS2, jX);
                } else {
                    z9 = false;
                }
                if (!z8) {
                    z10 = false;
                }
                z11 = z10;
            }
            z9 = true;
            if (!z8) {
                z10 = false;
            }
            z11 = z10;
        }
        if (F(j8) || z11) {
            A();
        }
        return f.t(jA, jX2);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0083  */
    /* JADX WARN: Code duplicated, block: B:31:0x008b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0098  */
    /* JADX WARN: Code duplicated, block: B:35:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:42:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:44:0x00db  */
    /* JADX WARN: Code duplicated, block: B:47:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:48:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:59:0x014a  */
    /* JADX WARN: Code duplicated, block: B:61:0x0152  */
    /* JADX WARN: Code duplicated, block: B:64:0x016a  */
    /* JADX WARN: Code duplicated, block: B:65:0x017a  */
    /* JADX WARN: Code duplicated, block: B:67:0x0182  */
    /* JADX WARN: Code duplicated, block: B:70:0x019e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0055, code lost:
    
        if (r13.invoke(r11, r0) == r1) goto L54;
     */
    @Override // p046f0.S
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object d(long j8, o oVar, G6.d dVar) {
        C0503a c0503a;
        float fH;
        C2290s c2290s;
        float fI;
        C2290s c2290s2;
        long jK;
        C2273a c2273a;
        long jK2;
        if (dVar instanceof C0503a) {
            c0503a = (C0503a) dVar;
            int i8 = c0503a.f21398e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0503a.f21398e = i8 - Integer.MIN_VALUE;
            } else {
                c0503a = new C0503a(dVar);
            }
        } else {
            c0503a = new C0503a(dVar);
        }
        Object objInvoke = c0503a.f21396c;
        Object objF = H6.c.f();
        int i9 = c0503a.f21398e;
        if (i9 != 0) {
            if (i9 == 1) {
                r.b(objInvoke);
                return G.f1419a;
            }
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            jK = c0503a.f21395b;
            c2273a = (C2273a) c0503a.f21394a;
            r.b(objInvoke);
            jK2 = A1.y.k(jK, ((A1.y) objInvoke).o());
            c2273a.f21389o = false;
            if (A1.y.h(jK2) > 0.0f) {
                C2290s.f21497a.c(c2273a.f21379e, S6.c.d(A1.y.h(jK2)));
            } else if (A1.y.h(jK2) < 0.0f) {
                C2290s.f21497a.c(c2273a.f21380f, -S6.c.d(A1.y.h(jK2)));
            }
            if (A1.y.i(jK2) > 0.0f) {
                C2290s.f21497a.c(c2273a.f21377c, S6.c.d(A1.y.i(jK2)));
            } else if (A1.y.i(jK2) < 0.0f) {
                C2290s.f21497a.c(c2273a.f21378d, -S6.c.d(A1.y.i(jK2)));
            }
            if (!A1.y.g(jK2, A1.y.f471b.a())) {
                c2273a.A();
            }
            c2273a.t();
            return G.f1419a;
        }
        r.b(objInvoke);
        if (Q0.l.k(this.f21390p)) {
            Object objB = A1.y.b(j8);
            c0503a.f21398e = 1;
        } else {
            if (A1.y.h(j8) > 0.0f) {
                C2290s c2290s3 = C2290s.f21497a;
                if (c2290s3.b(this.f21379e) != 0.0f) {
                    c2290s3.c(this.f21379e, S6.c.d(A1.y.h(j8)));
                    fH = A1.y.h(j8);
                } else if (A1.y.h(j8) < 0.0f) {
                    c2290s = C2290s.f21497a;
                    if (c2290s.b(this.f21380f) == 0.0f) {
                        fH = 0.0f;
                    } else {
                        c2290s.c(this.f21380f, -S6.c.d(A1.y.h(j8)));
                        fH = A1.y.h(j8);
                    }
                } else {
                    fH = 0.0f;
                }
            } else if (A1.y.h(j8) < 0.0f) {
                c2290s = C2290s.f21497a;
                if (c2290s.b(this.f21380f) == 0.0f) {
                    fH = 0.0f;
                } else {
                    c2290s.c(this.f21380f, -S6.c.d(A1.y.h(j8)));
                    fH = A1.y.h(j8);
                }
            } else {
                fH = 0.0f;
            }
            if (A1.y.i(j8) > 0.0f) {
                C2290s c2290s4 = C2290s.f21497a;
                if (c2290s4.b(this.f21377c) != 0.0f) {
                    c2290s4.c(this.f21377c, S6.c.d(A1.y.i(j8)));
                    fI = A1.y.i(j8);
                } else if (A1.y.i(j8) < 0.0f) {
                    c2290s2 = C2290s.f21497a;
                    if (c2290s2.b(this.f21378d) == 0.0f) {
                        fI = 0.0f;
                    } else {
                        c2290s2.c(this.f21378d, -S6.c.d(A1.y.i(j8)));
                        fI = A1.y.i(j8);
                    }
                } else {
                    fI = 0.0f;
                }
            } else if (A1.y.i(j8) < 0.0f) {
                c2290s2 = C2290s.f21497a;
                if (c2290s2.b(this.f21378d) == 0.0f) {
                    fI = 0.0f;
                } else {
                    c2290s2.c(this.f21378d, -S6.c.d(A1.y.i(j8)));
                    fI = A1.y.i(j8);
                }
            } else {
                fI = 0.0f;
            }
            long jA = z.a(fH, fI);
            if (!A1.y.g(jA, A1.y.f471b.a())) {
                A();
            }
            jK = A1.y.k(j8, jA);
            Object objB2 = A1.y.b(jK);
            c0503a.f21394a = this;
            c0503a.f21395b = jK;
            c0503a.f21398e = 2;
            objInvoke = oVar.invoke(objB2, c0503a);
            if (objInvoke != objF) {
                c2273a = this;
                jK2 = A1.y.k(jK, ((A1.y) objInvoke).o());
                c2273a.f21389o = false;
                if (A1.y.h(jK2) > 0.0f) {
                    C2290s.f21497a.c(c2273a.f21379e, S6.c.d(A1.y.h(jK2)));
                } else if (A1.y.h(jK2) < 0.0f) {
                    C2290s.f21497a.c(c2273a.f21380f, -S6.c.d(A1.y.h(jK2)));
                }
                if (A1.y.i(jK2) > 0.0f) {
                    C2290s.f21497a.c(c2273a.f21377c, S6.c.d(A1.y.i(jK2)));
                } else if (A1.y.i(jK2) < 0.0f) {
                    C2290s.f21497a.c(c2273a.f21378d, -S6.c.d(A1.y.i(jK2)));
                }
                if (!A1.y.g(jK2, A1.y.f471b.a())) {
                    c2273a.A();
                }
                c2273a.t();
                return G.f1419a;
            }
        }
        return objF;
    }

    public final void t() {
        List list = this.f21381g;
        int size = list.size();
        boolean z8 = false;
        for (int i8 = 0; i8 < size; i8++) {
            EdgeEffect edgeEffect = (EdgeEffect) list.get(i8);
            edgeEffect.onRelease();
            z8 = edgeEffect.isFinished() || z8;
        }
        if (z8) {
            A();
        }
    }

    public final boolean u(T0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(180.0f);
        canvas.translate(-Q0.l.i(this.f21390p), (-Q0.l.g(this.f21390p)) + fVar.E0(this.f21375a.a().a()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean v(T0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.rotate(270.0f);
        canvas.translate(-Q0.l.g(this.f21390p), fVar.E0(this.f21375a.a().c(fVar.getLayoutDirection())));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final void w(T0.f fVar) {
        boolean zV;
        if (Q0.l.k(this.f21390p)) {
            return;
        }
        InterfaceC1586f0 interfaceC1586f0C = fVar.K0().c();
        this.f21386l = z();
        Canvas canvasD = F.d(interfaceC1586f0C);
        C2290s c2290s = C2290s.f21497a;
        if (c2290s.b(this.f21384j) != 0.0f) {
            x(fVar, this.f21384j, canvasD);
            this.f21384j.finish();
        }
        if (this.f21379e.isFinished()) {
            zV = false;
        } else {
            zV = v(fVar, this.f21379e, canvasD);
            c2290s.d(this.f21384j, c2290s.b(this.f21379e), 0.0f);
        }
        if (c2290s.b(this.f21382h) != 0.0f) {
            u(fVar, this.f21382h, canvasD);
            this.f21382h.finish();
        }
        if (!this.f21377c.isFinished()) {
            zV = y(fVar, this.f21377c, canvasD) || zV;
            c2290s.d(this.f21382h, c2290s.b(this.f21377c), 0.0f);
        }
        if (c2290s.b(this.f21385k) != 0.0f) {
            v(fVar, this.f21385k, canvasD);
            this.f21385k.finish();
        }
        if (!this.f21380f.isFinished()) {
            zV = x(fVar, this.f21380f, canvasD) || zV;
            c2290s.d(this.f21385k, c2290s.b(this.f21380f), 0.0f);
        }
        if (c2290s.b(this.f21383i) != 0.0f) {
            y(fVar, this.f21383i, canvasD);
            this.f21383i.finish();
        }
        if (!this.f21378d.isFinished()) {
            boolean z8 = u(fVar, this.f21378d, canvasD) || zV;
            c2290s.d(this.f21383i, c2290s.b(this.f21378d), 0.0f);
            zV = z8;
        }
        if (zV) {
            A();
        }
    }

    public final boolean x(T0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        int iD = S6.c.d(Q0.l.i(this.f21390p));
        float fB = this.f21375a.a().b(fVar.getLayoutDirection());
        canvas.rotate(90.0f);
        canvas.translate(0.0f, (-iD) + fVar.E0(fB));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final boolean y(T0.f fVar, EdgeEffect edgeEffect, Canvas canvas) {
        int iSave = canvas.save();
        canvas.translate(0.0f, fVar.E0(this.f21375a.a().d()));
        boolean zDraw = edgeEffect.draw(canvas);
        canvas.restoreToCount(iSave);
        return zDraw;
    }

    public final int z() {
        return this.f21387m.f();
    }
}
