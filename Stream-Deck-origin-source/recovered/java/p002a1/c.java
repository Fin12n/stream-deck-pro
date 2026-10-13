package p002a1;

import A1.y;
import C6.r;
import C6.v;
import I6.d;
import L0.i;
import Q0.f;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p047f1.g;
import p047f1.h;
import p056g1.InterfaceC2346j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends i.c implements h, p002a1.a, InterfaceC2346j {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p002a1.a f13005n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p002a1.b f13006o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final g f13007p;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f13008a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f13009b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public long f13010c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f13011d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f13013f;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f13011d = obj;
            this.f13013f |= Integer.MIN_VALUE;
            return c.this.L0(0L, 0L, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f13014a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public long f13015b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f13016c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f13018e;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f13016c = obj;
            this.f13018e |= Integer.MIN_VALUE;
            return c.this.Z(0L, this);
        }
    }

    /* JADX INFO: renamed from: a1.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0328c extends u implements Function0 {
        public C0328c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final J invoke() {
            return c.this.e2();
        }
    }

    public c(p002a1.a aVar, p002a1.b bVar) {
        this.f13005n = aVar;
        this.f13006o = bVar == null ? new p002a1.b() : bVar;
        this.f13007p = p047f1.i.b(v.a(d.a(), this));
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // p002a1.a
    public Object L0(long j8, long j9, G6.d dVar) {
        a aVar;
        c cVar;
        long j10;
        long j11;
        long jO;
        long jA;
        long j12;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f13013f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f13013f = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object objL0 = aVar2.f13011d;
        Object objF = H6.c.f();
        int i9 = aVar2.f13013f;
        if (i9 != 0) {
            if (i9 == 1) {
                j11 = aVar2.f13010c;
                j10 = aVar2.f13009b;
                cVar = (c) aVar2.f13008a;
                r.b(objL0);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j12 = aVar2.f13009b;
                r.b(objL0);
            }
            jA = ((y) objL0).o();
            jO = j12;
            return y.b(y.l(jO, jA));
        }
        r.b(objL0);
        p002a1.a aVar3 = this.f13005n;
        aVar2.f13008a = this;
        aVar2.f13009b = j8;
        aVar2.f13010c = j9;
        aVar2.f13013f = 1;
        objL0 = aVar3.L0(j8, j9, aVar2);
        if (objL0 != objF) {
            cVar = this;
            j10 = j8;
            j11 = j9;
        }
        return objF;
        jO = ((y) objL0).o();
        p002a1.a aVarF2 = cVar.f2();
        if (aVarF2 != null) {
            long jL = y.l(j10, jO);
            long jK = y.k(j11, jO);
            aVar2.f13008a = null;
            aVar2.f13009b = jO;
            aVar2.f13013f = 2;
            objL0 = aVarF2.L0(jL, jK, aVar2);
            if (objL0 != objF) {
                j12 = jO;
                jA = ((y) objL0).o();
                jO = j12;
            }
            return objF;
        }
        jA = y.f471b.a();
        return y.b(y.l(jO, jA));
    }

    @Override // L0.i.c
    public void N1() {
        j2();
    }

    @Override // L0.i.c
    public void O1() {
        h2();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007a, code lost:
    
        if (r11 == r1) goto L27;
     */
    @Override // p002a1.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object Z(long j8, G6.d dVar) {
        b bVar;
        long jA;
        c cVar;
        long j9;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f13018e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f13018e = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objZ = bVar.f13016c;
        Object objF = H6.c.f();
        int i9 = bVar.f13018e;
        if (i9 != 0) {
            if (i9 == 1) {
                j8 = bVar.f13015b;
                cVar = (c) bVar.f13014a;
                r.b(objZ);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j9 = bVar.f13015b;
                r.b(objZ);
            }
            return y.b(y.l(j9, ((y) objZ).o()));
        }
        r.b(objZ);
        p002a1.a aVarF2 = f2();
        if (aVarF2 != null) {
            bVar.f13014a = this;
            bVar.f13015b = j8;
            bVar.f13018e = 1;
            objZ = aVarF2.Z(j8, bVar);
            if (objZ != objF) {
                cVar = this;
            }
        } else {
            jA = y.f471b.a();
            cVar = this;
            long j10 = jA;
            long j11 = j8;
            j9 = j10;
            p002a1.a aVar = cVar.f13005n;
            long jK = y.k(j11, j9);
            bVar.f13014a = null;
            bVar.f13015b = j9;
            bVar.f13018e = 2;
            objZ = aVar.Z(jK, bVar);
        }
        return objF;
        jA = ((y) objZ).o();
        long j12 = jA;
        long j13 = j8;
        j9 = j12;
        p002a1.a aVar2 = cVar.f13005n;
        long jK2 = y.k(j13, j9);
        bVar.f13014a = null;
        bVar.f13015b = j9;
        bVar.f13018e = 2;
        objZ = aVar2.Z(jK2, bVar);
    }

    public final J e2() {
        J jE2;
        c cVarG2 = g2();
        if (cVarG2 != null && (jE2 = cVarG2.e2()) != null) {
            return jE2;
        }
        J jH = this.f13006o.h();
        if (jH != null) {
            return jH;
        }
        throw new IllegalStateException("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
    }

    @Override // p002a1.a
    public long f1(long j8, long j9, int i8) {
        long jF1 = this.f13005n.f1(j8, j9, i8);
        p002a1.a aVarF2 = f2();
        return f.t(jF1, aVarF2 != null ? aVarF2.f1(f.t(j8, jF1), f.s(j9, jF1), i8) : f.f9082b.c());
    }

    public final p002a1.a f2() {
        if (K1()) {
            return (p002a1.a) u(d.a());
        }
        return null;
    }

    public final c g2() {
        if (K1()) {
            return (c) u(d.a());
        }
        return null;
    }

    public final void h2() {
        if (this.f13006o.f() == this) {
            this.f13006o.j(null);
        }
    }

    public final void i2(p002a1.b bVar) {
        h2();
        if (bVar == null) {
            this.f13006o = new p002a1.b();
        } else if (!t.c(bVar, this.f13006o)) {
            this.f13006o = bVar;
        }
        if (K1()) {
            j2();
        }
    }

    public final void j2() {
        this.f13006o.j(this);
        this.f13006o.i(new C0328c());
        this.f13006o.k(D1());
    }

    public final void k2(p002a1.a aVar, p002a1.b bVar) {
        this.f13005n = aVar;
        i2(bVar);
    }

    @Override // p047f1.h
    public g u0() {
        return this.f13007p;
    }

    @Override // p002a1.a
    public long w0(long j8, int i8) {
        p002a1.a aVarF2 = f2();
        long jW0 = aVarF2 != null ? aVarF2.w0(j8, i8) : f.f9082b.c();
        return f.t(jW0, this.f13005n.w0(f.s(j8, jW0), i8));
    }
}
