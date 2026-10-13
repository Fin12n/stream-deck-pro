package p191w0;

import A1.h;
import C6.G;
import L0.i;
import Q0.g;
import Q0.l;
import Q0.m;
import Q6.k;
import Q6.o;
import Q6.p;
import R0.V0;
import kotlin.jvm.internal.s;
import kotlin.jvm.internal.u;
import p037e0.AbstractC2214j;
import p037e0.C2225v;
import p037e0.D;
import p037e0.K;
import p037e0.L;
import p037e0.M;
import p037e0.O;
import p037e0.j0;
import p037e0.l0;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p046f0.AbstractC2282j;
import p046f0.Y;
import p065h1.X;
import p110m1.n;
import p110m1.x;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import p215z0.q1;

/* JADX INFO: renamed from: w0.p0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3079p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f36321a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final i f36322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float f36323c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final float f36324d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final float f36325e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2225v f36326f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2225v f36327g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2225v f36328h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final C2225v f36329i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final C2225v f36330j;

    /* JADX INFO: renamed from: w0.p0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f36331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ T0.k f36332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ q1 f36333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ q1 f36334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ q1 f36335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ q1 f36336f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ float f36337g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final /* synthetic */ long f36338h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j8, T0.k kVar, q1 q1Var, q1 q1Var2, q1 q1Var3, q1 q1Var4, float f8, long j9) {
            super(1);
            this.f36331a = j8;
            this.f36332b = kVar;
            this.f36333c = q1Var;
            this.f36334d = q1Var2;
            this.f36335e = q1Var3;
            this.f36336f = q1Var4;
            this.f36337g = f8;
            this.f36338h = j9;
        }

        public final void b(T0.f fVar) {
            AbstractC3079p0.g(fVar, this.f36331a, this.f36332b);
            AbstractC3079p0.h(fVar, ((Number) this.f36335e.getValue()).floatValue() + (((((Number) this.f36333c.getValue()).floatValue() * 216.0f) % 360.0f) - 90.0f) + ((Number) this.f36336f.getValue()).floatValue(), this.f36337g, Math.abs(((Number) this.f36334d.getValue()).floatValue() - ((Number) this.f36335e.getValue()).floatValue()), this.f36338h, this.f36332b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((T0.f) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.p0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f36339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ long f36340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ float f36341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f36342d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f36343e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f36344f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final /* synthetic */ int f36345g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(i iVar, long j8, float f8, long j9, int i8, int i9, int i10) {
            super(2);
            this.f36339a = iVar;
            this.f36340b = j8;
            this.f36341c = f8;
            this.f36342d = j9;
            this.f36343e = i8;
            this.f36344f = i9;
            this.f36345g = i10;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC3079p0.a(this.f36339a, this.f36340b, this.f36341c, this.f36342d, this.f36343e, interfaceC3163l, F0.a(this.f36344f | 1), this.f36345g);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.p0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f36346a = new c();

        public c() {
            super(1);
        }

        public final void b(O.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 0), AbstractC3079p0.f36330j);
            bVar.f(Float.valueOf(290.0f), 666);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((O.b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.p0$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f36347a = new d();

        public d() {
            super(1);
        }

        public final void b(O.b bVar) {
            bVar.d(1332);
            bVar.e(bVar.f(Float.valueOf(0.0f), 666), AbstractC3079p0.f36330j);
            bVar.f(Float.valueOf(290.0f), bVar.b());
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((O.b) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.p0$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f36348a = new e();

        /* JADX INFO: renamed from: w0.p0$e$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a0 f36349a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f36350b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var, int i8) {
                super(1);
                this.f36349a = a0Var;
                this.f36350b = i8;
            }

            public final void b(a0.a aVar) {
                a0.a.f(aVar, this.f36349a, 0, -this.f36350b, 0.0f, 4, null);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a0.a) obj);
                return G.f1419a;
            }
        }

        public e() {
            super(3);
        }

        public final I b(J j8, p038e1.G g8, long j9) {
            int iV0 = j8.V0(AbstractC3079p0.f36321a);
            int i8 = iV0 * 2;
            a0 a0VarJ = g8.J(A1.c.i(j9, 0, i8));
            return J.X0(j8, a0VarJ.y0(), a0VarJ.h0() - i8, null, new a(a0VarJ, iV0), 4, null);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((J) obj, (p038e1.G) obj2, ((A1.b) obj3).s());
        }
    }

    static {
        float fM = h.m(10);
        f36321a = fM;
        f36322b = androidx.compose.foundation.layout.e.k(n.c(androidx.compose.ui.layout.b.a(i.f4836a, e.f36348a), true, f.f36351a), 0.0f, fM, 1, null);
        f36323c = h.m(240);
        f36324d = p207y0.k.f37871a.a();
        p207y0.a aVar = p207y0.a.f37538a;
        f36325e = h.m(aVar.c() - h.m(aVar.b() * 2));
        f36326f = new C2225v(0.2f, 0.0f, 0.8f, 1.0f);
        f36327g = new C2225v(0.4f, 0.0f, 1.0f, 1.0f);
        f36328h = new C2225v(0.0f, 0.0f, 0.65f, 1.0f);
        f36329i = new C2225v(0.1f, 0.0f, 0.45f, 1.0f);
        f36330j = new C2225v(0.4f, 0.0f, 0.2f, 1.0f);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x028c  */
    /* JADX WARN: Code duplicated, block: B:103:0x028f  */
    /* JADX WARN: Code duplicated, block: B:106:0x0299  */
    /* JADX WARN: Code duplicated, block: B:108:0x029f  */
    /* JADX WARN: Code duplicated, block: B:114:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:118:0x02bc  */
    /* JADX WARN: Code duplicated, block: B:121:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:125:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0083  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c7 A[PHI: r1 r4 r9 r11 r13
      0x00c7: PHI (r1v13 L0.i) = (r1v3 L0.i), (r1v16 L0.i) binds: [B:86:0x00f7, B:72:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r4v23 int) = (r4v14 int), (r4v25 int) binds: [B:86:0x00f7, B:72:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r9v10 long) = (r9v2 long), (r9v1 long) binds: [B:86:0x00f7, B:72:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r11v22 float) = (r11v3 float), (r11v2 float) binds: [B:86:0x00f7, B:72:0x00c6] A[DONT_GENERATE, DONT_INLINE]
      0x00c7: PHI (r13v18 long) = (r13v2 long), (r13v1 long) binds: [B:86:0x00f7, B:72:0x00c6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x010c  */
    /* JADX WARN: Code duplicated, block: B:93:0x025c  */
    /* JADX WARN: Code duplicated, block: B:95:0x0262  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    public static final void a(i iVar, long j8, float f8, long j9, int i8, InterfaceC3163l interfaceC3163l, int i9, int i10) {
        i iVar2;
        int i11;
        long jA;
        float fC;
        long jD;
        int i12;
        int i13;
        int i14;
        i iVar3;
        int iB;
        int i15;
        long j10;
        float f9;
        long j11;
        T0.k kVar;
        q1 q1VarB;
        q1 q1VarA;
        q1 q1VarA2;
        q1 q1VarA3;
        boolean z8;
        boolean z9;
        Object objG;
        long j12;
        long j13;
        long j14;
        float f10;
        long j15;
        int i16;
        i iVar4;
        P0 p0V;
        int i17;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-115871647);
        int i18 = i10 & 1;
        if (i18 != 0) {
            i11 = i9 | 6;
            iVar2 = iVar;
        } else if ((i9 & 6) == 0) {
            iVar2 = iVar;
            i11 = (interfaceC3163lP.R(iVar2) ? 4 : 2) | i9;
        } else {
            iVar2 = iVar;
            i11 = i9;
        }
        if ((i9 & 48) == 0) {
            jA = j8;
            i11 |= ((i10 & 2) == 0 && interfaceC3163lP.j(jA)) ? 32 : 16;
        } else {
            jA = j8;
        }
        int i19 = i10 & 4;
        if (i19 == 0) {
            if ((i9 & 384) == 0) {
                fC = f8;
                i11 |= interfaceC3163lP.h(fC) ? 256 : 128;
            }
            if ((i9 & 3072) == 0) {
                jD = j9;
                if ((i10 & 8) == 0 || !interfaceC3163lP.j(jD)) {
                    i17 = 1024;
                } else {
                    i17 = 2048;
                }
                i11 |= i17;
            } else {
                jD = j9;
            }
            i12 = i10 & 16;
            if (i12 != 0) {
                if ((i9 & 24576) == 0) {
                    i13 = i8;
                    if (interfaceC3163lP.i(i13)) {
                        i14 = 16384;
                    } else {
                        i14 = 8192;
                    }
                    i11 |= i14;
                }
                if ((i11 & 9363) == 9362 || !interfaceC3163lP.s()) {
                    interfaceC3163lP.o();
                    if ((i9 & 1) != 0 || interfaceC3163lP.F()) {
                        if (i18 != 0) {
                            iVar3 = i.f4836a;
                        } else {
                            iVar3 = iVar2;
                        }
                        if ((i10 & 2) != 0) {
                            jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                            i11 &= -113;
                        }
                        if (i19 != 0) {
                            fC = C3077o0.f36297a.c();
                        }
                        if ((i10 & 8) != 0) {
                            i11 &= -7169;
                            jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                        }
                        if (i12 != 0) {
                            iB = C3077o0.f36297a.b();
                            i15 = i11;
                        }
                        j10 = jA;
                        f9 = fC;
                        j11 = jD;
                        interfaceC3163lP.Q();
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.W(-115871647, i15, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                        }
                        kVar = new T0.k(((A1.d) interfaceC3163lP.e(X.d())).E0(f9), 0.0f, iB, 0, null, 26, null);
                        int i20 = iB;
                        L lC = M.c(null, interfaceC3163lP, 0, 1);
                        j0 j0VarJ = l0.j(s.f28815a);
                        i iVar5 = iVar3;
                        K kD = AbstractC2214j.d(AbstractC2214j.i(6660, 0, D.e(), 2, null), null, 0L, 6, null);
                        int i21 = L.f20014f;
                        int i22 = K.f20010d;
                        boolean z10 = true;
                        q1VarB = M.b(lC, 0, 5, j0VarJ, kD, null, interfaceC3163lP, i21 | 432 | (i22 << 12), 16);
                        q1VarA = M.a(lC, 0.0f, 286.0f, AbstractC2214j.d(AbstractC2214j.i(1332, 0, D.e(), 2, null), null, 0L, 6, null), null, interfaceC3163lP, i21 | 432 | (i22 << 9), 8);
                        q1VarA2 = M.a(lC, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(c.f36346a), null, 0L, 6, null), null, interfaceC3163lP, i21 | 432 | (i22 << 9), 8);
                        q1VarA3 = M.a(lC, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(d.f36347a), null, 0L, 6, null), null, interfaceC3163lP, i21 | 432 | (i22 << 9), 8);
                        i iVarL = androidx.compose.foundation.layout.f.l(Y.a(iVar5), f36325e);
                        interfaceC3163lP.f(821870113);
                        boolean zL = ((((i15 & 7168) ^ 3072) <= 2048 && interfaceC3163lP.j(j11)) || (i15 & 3072) == 2048) | interfaceC3163lP.l(kVar) | interfaceC3163lP.R(q1VarB) | interfaceC3163lP.R(q1VarA2) | interfaceC3163lP.R(q1VarA3) | interfaceC3163lP.R(q1VarA);
                        if ((i15 & 896) == 256) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        boolean z11 = z8 | zL;
                        if ((((i15 & 112) ^ 48) > 32 || !interfaceC3163lP.j(j10)) && (i15 & 48) != 32) {
                        }
                        z9 = z11 | z10;
                        objG = interfaceC3163lP.g();
                        if (!z9 || objG == InterfaceC3163l.f38803a.a()) {
                            j12 = j10;
                            j13 = j11;
                            objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                            interfaceC3163lP.H(objG);
                        } else {
                            j12 = j10;
                            j13 = j11;
                        }
                        interfaceC3163lP.N();
                        AbstractC2282j.a(iVarL, (k) objG, interfaceC3163lP, 0);
                        if (AbstractC3169o.K()) {
                            AbstractC3169o.V();
                        }
                        j14 = j13;
                        f10 = f9;
                        j15 = j12;
                        i16 = i20;
                        iVar4 = iVar5;
                    } else {
                        interfaceC3163lP.z();
                        if ((i10 & 2) != 0) {
                            i11 &= -113;
                        }
                        if ((i10 & 8) != 0) {
                            i11 &= -7169;
                        }
                        iVar3 = iVar2;
                    }
                    i15 = i11;
                    iB = i13;
                    j10 = jA;
                    f9 = fC;
                    j11 = jD;
                    interfaceC3163lP.Q();
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.W(-115871647, i15, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                    }
                    kVar = new T0.k(((A1.d) interfaceC3163lP.e(X.d())).E0(f9), 0.0f, iB, 0, null, 26, null);
                    int i23 = iB;
                    L lC2 = M.c(null, interfaceC3163lP, 0, 1);
                    j0 j0VarJ2 = l0.j(s.f28815a);
                    i iVar6 = iVar3;
                    K kD2 = AbstractC2214j.d(AbstractC2214j.i(6660, 0, D.e(), 2, null), null, 0L, 6, null);
                    int i24 = L.f20014f;
                    int i25 = K.f20010d;
                    boolean z12 = true;
                    q1VarB = M.b(lC2, 0, 5, j0VarJ2, kD2, null, interfaceC3163lP, i24 | 432 | (i25 << 12), 16);
                    q1VarA = M.a(lC2, 0.0f, 286.0f, AbstractC2214j.d(AbstractC2214j.i(1332, 0, D.e(), 2, null), null, 0L, 6, null), null, interfaceC3163lP, i24 | 432 | (i25 << 9), 8);
                    q1VarA2 = M.a(lC2, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(c.f36346a), null, 0L, 6, null), null, interfaceC3163lP, i24 | 432 | (i25 << 9), 8);
                    q1VarA3 = M.a(lC2, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(d.f36347a), null, 0L, 6, null), null, interfaceC3163lP, i24 | 432 | (i25 << 9), 8);
                    i iVarL2 = androidx.compose.foundation.layout.f.l(Y.a(iVar6), f36325e);
                    interfaceC3163lP.f(821870113);
                    boolean zL2 = ((((i15 & 7168) ^ 3072) <= 2048 && interfaceC3163lP.j(j11)) || (i15 & 3072) == 2048) | interfaceC3163lP.l(kVar) | interfaceC3163lP.R(q1VarB) | interfaceC3163lP.R(q1VarA2) | interfaceC3163lP.R(q1VarA3) | interfaceC3163lP.R(q1VarA);
                    if ((i15 & 896) == 256) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    boolean z13 = z8 | zL2;
                    z12 = ((i15 & 112) ^ 48) > 32 ? false : false;
                    z9 = z13 | z12;
                    objG = interfaceC3163lP.g();
                    if (z9) {
                        j12 = j10;
                        j13 = j11;
                        objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                        interfaceC3163lP.H(objG);
                    } else {
                        j12 = j10;
                        j13 = j11;
                        objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                        interfaceC3163lP.H(objG);
                    }
                    interfaceC3163lP.N();
                    AbstractC2282j.a(iVarL2, (k) objG, interfaceC3163lP, 0);
                    if (AbstractC3169o.K()) {
                        AbstractC3169o.V();
                    }
                    j14 = j13;
                    f10 = f9;
                    j15 = j12;
                    i16 = i23;
                    iVar4 = iVar6;
                } else {
                    interfaceC3163lP.z();
                    iVar4 = iVar2;
                    i16 = i13;
                    j15 = jA;
                    f10 = fC;
                    j14 = jD;
                }
                p0V = interfaceC3163lP.v();
                if (p0V != null) {
                    p0V.a(new b(iVar4, j15, f10, j14, i16, i9, i10));
                }
            }
            i11 |= 24576;
            i13 = i8;
            if ((i11 & 9363) == 9362) {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i18 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i10 & 2) != 0) {
                        jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                        i11 &= -113;
                    }
                    if (i19 != 0) {
                        fC = C3077o0.f36297a.c();
                    }
                    if ((i10 & 8) != 0) {
                        i11 &= -7169;
                        jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                    }
                    if (i12 != 0) {
                        iB = C3077o0.f36297a.b();
                        i15 = i11;
                    } else {
                        i15 = i11;
                        iB = i13;
                    }
                } else {
                    if (i18 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i10 & 2) != 0) {
                        jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                        i11 &= -113;
                    }
                    if (i19 != 0) {
                        fC = C3077o0.f36297a.c();
                    }
                    if ((i10 & 8) != 0) {
                        i11 &= -7169;
                        jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                    }
                    if (i12 != 0) {
                        iB = C3077o0.f36297a.b();
                        i15 = i11;
                    } else {
                        i15 = i11;
                        iB = i13;
                    }
                }
                j10 = jA;
                f9 = fC;
                j11 = jD;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-115871647, i15, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                }
                kVar = new T0.k(((A1.d) interfaceC3163lP.e(X.d())).E0(f9), 0.0f, iB, 0, null, 26, null);
                int i26 = iB;
                L lC3 = M.c(null, interfaceC3163lP, 0, 1);
                j0 j0VarJ3 = l0.j(s.f28815a);
                i iVar7 = iVar3;
                K kD3 = AbstractC2214j.d(AbstractC2214j.i(6660, 0, D.e(), 2, null), null, 0L, 6, null);
                int i27 = L.f20014f;
                int i28 = K.f20010d;
                boolean z14 = true;
                q1VarB = M.b(lC3, 0, 5, j0VarJ3, kD3, null, interfaceC3163lP, i27 | 432 | (i28 << 12), 16);
                q1VarA = M.a(lC3, 0.0f, 286.0f, AbstractC2214j.d(AbstractC2214j.i(1332, 0, D.e(), 2, null), null, 0L, 6, null), null, interfaceC3163lP, i27 | 432 | (i28 << 9), 8);
                q1VarA2 = M.a(lC3, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(c.f36346a), null, 0L, 6, null), null, interfaceC3163lP, i27 | 432 | (i28 << 9), 8);
                q1VarA3 = M.a(lC3, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(d.f36347a), null, 0L, 6, null), null, interfaceC3163lP, i27 | 432 | (i28 << 9), 8);
                i iVarL3 = androidx.compose.foundation.layout.f.l(Y.a(iVar7), f36325e);
                interfaceC3163lP.f(821870113);
                boolean zL3 = ((((i15 & 7168) ^ 3072) <= 2048 && interfaceC3163lP.j(j11)) || (i15 & 3072) == 2048) | interfaceC3163lP.l(kVar) | interfaceC3163lP.R(q1VarB) | interfaceC3163lP.R(q1VarA2) | interfaceC3163lP.R(q1VarA3) | interfaceC3163lP.R(q1VarA);
                if ((i15 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z15 = z8 | zL3;
                if (((i15 & 112) ^ 48) > 32) {
                }
                z9 = z15 | z14;
                objG = interfaceC3163lP.g();
                if (z9) {
                    j12 = j10;
                    j13 = j11;
                    objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                    interfaceC3163lP.H(objG);
                } else {
                    j12 = j10;
                    j13 = j11;
                    objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                AbstractC2282j.a(iVarL3, (k) objG, interfaceC3163lP, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                j14 = j13;
                f10 = f9;
                j15 = j12;
                i16 = i26;
                iVar4 = iVar7;
            } else {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i18 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i10 & 2) != 0) {
                        jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                        i11 &= -113;
                    }
                    if (i19 != 0) {
                        fC = C3077o0.f36297a.c();
                    }
                    if ((i10 & 8) != 0) {
                        i11 &= -7169;
                        jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                    }
                    if (i12 != 0) {
                        iB = C3077o0.f36297a.b();
                        i15 = i11;
                    } else {
                        i15 = i11;
                        iB = i13;
                    }
                } else {
                    if (i18 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i10 & 2) != 0) {
                        jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                        i11 &= -113;
                    }
                    if (i19 != 0) {
                        fC = C3077o0.f36297a.c();
                    }
                    if ((i10 & 8) != 0) {
                        i11 &= -7169;
                        jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                    }
                    if (i12 != 0) {
                        iB = C3077o0.f36297a.b();
                        i15 = i11;
                    } else {
                        i15 = i11;
                        iB = i13;
                    }
                }
                j10 = jA;
                f9 = fC;
                j11 = jD;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-115871647, i15, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                }
                kVar = new T0.k(((A1.d) interfaceC3163lP.e(X.d())).E0(f9), 0.0f, iB, 0, null, 26, null);
                int i29 = iB;
                L lC4 = M.c(null, interfaceC3163lP, 0, 1);
                j0 j0VarJ4 = l0.j(s.f28815a);
                i iVar8 = iVar3;
                K kD4 = AbstractC2214j.d(AbstractC2214j.i(6660, 0, D.e(), 2, null), null, 0L, 6, null);
                int i210 = L.f20014f;
                int i211 = K.f20010d;
                boolean z16 = true;
                q1VarB = M.b(lC4, 0, 5, j0VarJ4, kD4, null, interfaceC3163lP, i210 | 432 | (i211 << 12), 16);
                q1VarA = M.a(lC4, 0.0f, 286.0f, AbstractC2214j.d(AbstractC2214j.i(1332, 0, D.e(), 2, null), null, 0L, 6, null), null, interfaceC3163lP, i210 | 432 | (i211 << 9), 8);
                q1VarA2 = M.a(lC4, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(c.f36346a), null, 0L, 6, null), null, interfaceC3163lP, i210 | 432 | (i211 << 9), 8);
                q1VarA3 = M.a(lC4, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(d.f36347a), null, 0L, 6, null), null, interfaceC3163lP, i210 | 432 | (i211 << 9), 8);
                i iVarL4 = androidx.compose.foundation.layout.f.l(Y.a(iVar8), f36325e);
                interfaceC3163lP.f(821870113);
                boolean zL4 = ((((i15 & 7168) ^ 3072) <= 2048 && interfaceC3163lP.j(j11)) || (i15 & 3072) == 2048) | interfaceC3163lP.l(kVar) | interfaceC3163lP.R(q1VarB) | interfaceC3163lP.R(q1VarA2) | interfaceC3163lP.R(q1VarA3) | interfaceC3163lP.R(q1VarA);
                if ((i15 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z17 = z8 | zL4;
                if (((i15 & 112) ^ 48) > 32) {
                }
                z9 = z17 | z16;
                objG = interfaceC3163lP.g();
                if (z9) {
                    j12 = j10;
                    j13 = j11;
                    objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                    interfaceC3163lP.H(objG);
                } else {
                    j12 = j10;
                    j13 = j11;
                    objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                AbstractC2282j.a(iVarL4, (k) objG, interfaceC3163lP, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                j14 = j13;
                f10 = f9;
                j15 = j12;
                i16 = i29;
                iVar4 = iVar8;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new b(iVar4, j15, f10, j14, i16, i9, i10));
            }
        }
        i11 |= 384;
        fC = f8;
        if ((i9 & 3072) == 0) {
            jD = j9;
            if ((i10 & 8) == 0) {
                i17 = 1024;
            } else {
                i17 = 1024;
            }
            i11 |= i17;
        } else {
            jD = j9;
        }
        i12 = i10 & 16;
        if (i12 != 0) {
            if ((i9 & 24576) == 0) {
                i13 = i8;
                if (interfaceC3163lP.i(i13)) {
                    i14 = 16384;
                } else {
                    i14 = 8192;
                }
                i11 |= i14;
            }
            if ((i11 & 9363) == 9362) {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i18 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i10 & 2) != 0) {
                        jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                        i11 &= -113;
                    }
                    if (i19 != 0) {
                        fC = C3077o0.f36297a.c();
                    }
                    if ((i10 & 8) != 0) {
                        i11 &= -7169;
                        jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                    }
                    if (i12 != 0) {
                        iB = C3077o0.f36297a.b();
                        i15 = i11;
                    } else {
                        i15 = i11;
                        iB = i13;
                    }
                } else {
                    if (i18 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i10 & 2) != 0) {
                        jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                        i11 &= -113;
                    }
                    if (i19 != 0) {
                        fC = C3077o0.f36297a.c();
                    }
                    if ((i10 & 8) != 0) {
                        i11 &= -7169;
                        jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                    }
                    if (i12 != 0) {
                        iB = C3077o0.f36297a.b();
                        i15 = i11;
                    } else {
                        i15 = i11;
                        iB = i13;
                    }
                }
                j10 = jA;
                f9 = fC;
                j11 = jD;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-115871647, i15, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                }
                kVar = new T0.k(((A1.d) interfaceC3163lP.e(X.d())).E0(f9), 0.0f, iB, 0, null, 26, null);
                int i212 = iB;
                L lC5 = M.c(null, interfaceC3163lP, 0, 1);
                j0 j0VarJ5 = l0.j(s.f28815a);
                i iVar9 = iVar3;
                K kD5 = AbstractC2214j.d(AbstractC2214j.i(6660, 0, D.e(), 2, null), null, 0L, 6, null);
                int i213 = L.f20014f;
                int i214 = K.f20010d;
                boolean z18 = true;
                q1VarB = M.b(lC5, 0, 5, j0VarJ5, kD5, null, interfaceC3163lP, i213 | 432 | (i214 << 12), 16);
                q1VarA = M.a(lC5, 0.0f, 286.0f, AbstractC2214j.d(AbstractC2214j.i(1332, 0, D.e(), 2, null), null, 0L, 6, null), null, interfaceC3163lP, i213 | 432 | (i214 << 9), 8);
                q1VarA2 = M.a(lC5, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(c.f36346a), null, 0L, 6, null), null, interfaceC3163lP, i213 | 432 | (i214 << 9), 8);
                q1VarA3 = M.a(lC5, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(d.f36347a), null, 0L, 6, null), null, interfaceC3163lP, i213 | 432 | (i214 << 9), 8);
                i iVarL5 = androidx.compose.foundation.layout.f.l(Y.a(iVar9), f36325e);
                interfaceC3163lP.f(821870113);
                boolean zL5 = ((((i15 & 7168) ^ 3072) <= 2048 && interfaceC3163lP.j(j11)) || (i15 & 3072) == 2048) | interfaceC3163lP.l(kVar) | interfaceC3163lP.R(q1VarB) | interfaceC3163lP.R(q1VarA2) | interfaceC3163lP.R(q1VarA3) | interfaceC3163lP.R(q1VarA);
                if ((i15 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z19 = z8 | zL5;
                if (((i15 & 112) ^ 48) > 32) {
                }
                z9 = z19 | z18;
                objG = interfaceC3163lP.g();
                if (z9) {
                    j12 = j10;
                    j13 = j11;
                    objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                    interfaceC3163lP.H(objG);
                } else {
                    j12 = j10;
                    j13 = j11;
                    objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                AbstractC2282j.a(iVarL5, (k) objG, interfaceC3163lP, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                j14 = j13;
                f10 = f9;
                j15 = j12;
                i16 = i212;
                iVar4 = iVar9;
            } else {
                interfaceC3163lP.o();
                if ((i9 & 1) != 0) {
                    if (i18 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i10 & 2) != 0) {
                        jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                        i11 &= -113;
                    }
                    if (i19 != 0) {
                        fC = C3077o0.f36297a.c();
                    }
                    if ((i10 & 8) != 0) {
                        i11 &= -7169;
                        jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                    }
                    if (i12 != 0) {
                        iB = C3077o0.f36297a.b();
                        i15 = i11;
                    } else {
                        i15 = i11;
                        iB = i13;
                    }
                } else {
                    if (i18 != 0) {
                        iVar3 = i.f4836a;
                    } else {
                        iVar3 = iVar2;
                    }
                    if ((i10 & 2) != 0) {
                        jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                        i11 &= -113;
                    }
                    if (i19 != 0) {
                        fC = C3077o0.f36297a.c();
                    }
                    if ((i10 & 8) != 0) {
                        i11 &= -7169;
                        jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                    }
                    if (i12 != 0) {
                        iB = C3077o0.f36297a.b();
                        i15 = i11;
                    } else {
                        i15 = i11;
                        iB = i13;
                    }
                }
                j10 = jA;
                f9 = fC;
                j11 = jD;
                interfaceC3163lP.Q();
                if (AbstractC3169o.K()) {
                    AbstractC3169o.W(-115871647, i15, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
                }
                kVar = new T0.k(((A1.d) interfaceC3163lP.e(X.d())).E0(f9), 0.0f, iB, 0, null, 26, null);
                int i215 = iB;
                L lC6 = M.c(null, interfaceC3163lP, 0, 1);
                j0 j0VarJ6 = l0.j(s.f28815a);
                i iVar10 = iVar3;
                K kD6 = AbstractC2214j.d(AbstractC2214j.i(6660, 0, D.e(), 2, null), null, 0L, 6, null);
                int i216 = L.f20014f;
                int i217 = K.f20010d;
                boolean z110 = true;
                q1VarB = M.b(lC6, 0, 5, j0VarJ6, kD6, null, interfaceC3163lP, i216 | 432 | (i217 << 12), 16);
                q1VarA = M.a(lC6, 0.0f, 286.0f, AbstractC2214j.d(AbstractC2214j.i(1332, 0, D.e(), 2, null), null, 0L, 6, null), null, interfaceC3163lP, i216 | 432 | (i217 << 9), 8);
                q1VarA2 = M.a(lC6, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(c.f36346a), null, 0L, 6, null), null, interfaceC3163lP, i216 | 432 | (i217 << 9), 8);
                q1VarA3 = M.a(lC6, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(d.f36347a), null, 0L, 6, null), null, interfaceC3163lP, i216 | 432 | (i217 << 9), 8);
                i iVarL6 = androidx.compose.foundation.layout.f.l(Y.a(iVar10), f36325e);
                interfaceC3163lP.f(821870113);
                boolean zL6 = ((((i15 & 7168) ^ 3072) <= 2048 && interfaceC3163lP.j(j11)) || (i15 & 3072) == 2048) | interfaceC3163lP.l(kVar) | interfaceC3163lP.R(q1VarB) | interfaceC3163lP.R(q1VarA2) | interfaceC3163lP.R(q1VarA3) | interfaceC3163lP.R(q1VarA);
                if ((i15 & 896) == 256) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                boolean z111 = z8 | zL6;
                if (((i15 & 112) ^ 48) > 32) {
                }
                z9 = z111 | z110;
                objG = interfaceC3163lP.g();
                if (z9) {
                    j12 = j10;
                    j13 = j11;
                    objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                    interfaceC3163lP.H(objG);
                } else {
                    j12 = j10;
                    j13 = j11;
                    objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                    interfaceC3163lP.H(objG);
                }
                interfaceC3163lP.N();
                AbstractC2282j.a(iVarL6, (k) objG, interfaceC3163lP, 0);
                if (AbstractC3169o.K()) {
                    AbstractC3169o.V();
                }
                j14 = j13;
                f10 = f9;
                j15 = j12;
                i16 = i215;
                iVar4 = iVar10;
            }
            p0V = interfaceC3163lP.v();
            if (p0V != null) {
                p0V.a(new b(iVar4, j15, f10, j14, i16, i9, i10));
            }
        }
        i11 |= 24576;
        i13 = i8;
        if ((i11 & 9363) == 9362) {
            interfaceC3163lP.o();
            if ((i9 & 1) != 0) {
                if (i18 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i10 & 2) != 0) {
                    jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                    i11 &= -113;
                }
                if (i19 != 0) {
                    fC = C3077o0.f36297a.c();
                }
                if ((i10 & 8) != 0) {
                    i11 &= -7169;
                    jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                }
                if (i12 != 0) {
                    iB = C3077o0.f36297a.b();
                    i15 = i11;
                } else {
                    i15 = i11;
                    iB = i13;
                }
            } else {
                if (i18 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i10 & 2) != 0) {
                    jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                    i11 &= -113;
                }
                if (i19 != 0) {
                    fC = C3077o0.f36297a.c();
                }
                if ((i10 & 8) != 0) {
                    i11 &= -7169;
                    jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                }
                if (i12 != 0) {
                    iB = C3077o0.f36297a.b();
                    i15 = i11;
                } else {
                    i15 = i11;
                    iB = i13;
                }
            }
            j10 = jA;
            f9 = fC;
            j11 = jD;
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-115871647, i15, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
            }
            kVar = new T0.k(((A1.d) interfaceC3163lP.e(X.d())).E0(f9), 0.0f, iB, 0, null, 26, null);
            int i218 = iB;
            L lC7 = M.c(null, interfaceC3163lP, 0, 1);
            j0 j0VarJ7 = l0.j(s.f28815a);
            i iVar11 = iVar3;
            K kD7 = AbstractC2214j.d(AbstractC2214j.i(6660, 0, D.e(), 2, null), null, 0L, 6, null);
            int i219 = L.f20014f;
            int i2110 = K.f20010d;
            boolean z112 = true;
            q1VarB = M.b(lC7, 0, 5, j0VarJ7, kD7, null, interfaceC3163lP, i219 | 432 | (i2110 << 12), 16);
            q1VarA = M.a(lC7, 0.0f, 286.0f, AbstractC2214j.d(AbstractC2214j.i(1332, 0, D.e(), 2, null), null, 0L, 6, null), null, interfaceC3163lP, i219 | 432 | (i2110 << 9), 8);
            q1VarA2 = M.a(lC7, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(c.f36346a), null, 0L, 6, null), null, interfaceC3163lP, i219 | 432 | (i2110 << 9), 8);
            q1VarA3 = M.a(lC7, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(d.f36347a), null, 0L, 6, null), null, interfaceC3163lP, i219 | 432 | (i2110 << 9), 8);
            i iVarL7 = androidx.compose.foundation.layout.f.l(Y.a(iVar11), f36325e);
            interfaceC3163lP.f(821870113);
            boolean zL7 = ((((i15 & 7168) ^ 3072) <= 2048 && interfaceC3163lP.j(j11)) || (i15 & 3072) == 2048) | interfaceC3163lP.l(kVar) | interfaceC3163lP.R(q1VarB) | interfaceC3163lP.R(q1VarA2) | interfaceC3163lP.R(q1VarA3) | interfaceC3163lP.R(q1VarA);
            if ((i15 & 896) == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z113 = z8 | zL7;
            if (((i15 & 112) ^ 48) > 32) {
            }
            z9 = z113 | z112;
            objG = interfaceC3163lP.g();
            if (z9) {
                j12 = j10;
                j13 = j11;
                objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                interfaceC3163lP.H(objG);
            } else {
                j12 = j10;
                j13 = j11;
                objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            AbstractC2282j.a(iVarL7, (k) objG, interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            j14 = j13;
            f10 = f9;
            j15 = j12;
            i16 = i218;
            iVar4 = iVar11;
        } else {
            interfaceC3163lP.o();
            if ((i9 & 1) != 0) {
                if (i18 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i10 & 2) != 0) {
                    jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                    i11 &= -113;
                }
                if (i19 != 0) {
                    fC = C3077o0.f36297a.c();
                }
                if ((i10 & 8) != 0) {
                    i11 &= -7169;
                    jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                }
                if (i12 != 0) {
                    iB = C3077o0.f36297a.b();
                    i15 = i11;
                } else {
                    i15 = i11;
                    iB = i13;
                }
            } else {
                if (i18 != 0) {
                    iVar3 = i.f4836a;
                } else {
                    iVar3 = iVar2;
                }
                if ((i10 & 2) != 0) {
                    jA = C3077o0.f36297a.a(interfaceC3163lP, 6);
                    i11 &= -113;
                }
                if (i19 != 0) {
                    fC = C3077o0.f36297a.c();
                }
                if ((i10 & 8) != 0) {
                    i11 &= -7169;
                    jD = C3077o0.f36297a.d(interfaceC3163lP, 6);
                }
                if (i12 != 0) {
                    iB = C3077o0.f36297a.b();
                    i15 = i11;
                } else {
                    i15 = i11;
                    iB = i13;
                }
            }
            j10 = jA;
            f9 = fC;
            j11 = jD;
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-115871647, i15, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:395)");
            }
            kVar = new T0.k(((A1.d) interfaceC3163lP.e(X.d())).E0(f9), 0.0f, iB, 0, null, 26, null);
            int i2111 = iB;
            L lC8 = M.c(null, interfaceC3163lP, 0, 1);
            j0 j0VarJ8 = l0.j(s.f28815a);
            i iVar12 = iVar3;
            K kD8 = AbstractC2214j.d(AbstractC2214j.i(6660, 0, D.e(), 2, null), null, 0L, 6, null);
            int i2112 = L.f20014f;
            int i2113 = K.f20010d;
            boolean z114 = true;
            q1VarB = M.b(lC8, 0, 5, j0VarJ8, kD8, null, interfaceC3163lP, i2112 | 432 | (i2113 << 12), 16);
            q1VarA = M.a(lC8, 0.0f, 286.0f, AbstractC2214j.d(AbstractC2214j.i(1332, 0, D.e(), 2, null), null, 0L, 6, null), null, interfaceC3163lP, i2112 | 432 | (i2113 << 9), 8);
            q1VarA2 = M.a(lC8, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(c.f36346a), null, 0L, 6, null), null, interfaceC3163lP, i2112 | 432 | (i2113 << 9), 8);
            q1VarA3 = M.a(lC8, 0.0f, 290.0f, AbstractC2214j.d(AbstractC2214j.e(d.f36347a), null, 0L, 6, null), null, interfaceC3163lP, i2112 | 432 | (i2113 << 9), 8);
            i iVarL8 = androidx.compose.foundation.layout.f.l(Y.a(iVar12), f36325e);
            interfaceC3163lP.f(821870113);
            boolean zL8 = ((((i15 & 7168) ^ 3072) <= 2048 && interfaceC3163lP.j(j11)) || (i15 & 3072) == 2048) | interfaceC3163lP.l(kVar) | interfaceC3163lP.R(q1VarB) | interfaceC3163lP.R(q1VarA2) | interfaceC3163lP.R(q1VarA3) | interfaceC3163lP.R(q1VarA);
            if ((i15 & 896) == 256) {
                z8 = true;
            } else {
                z8 = false;
            }
            boolean z115 = z8 | zL8;
            if (((i15 & 112) ^ 48) > 32) {
            }
            z9 = z115 | z114;
            objG = interfaceC3163lP.g();
            if (z9) {
                j12 = j10;
                j13 = j11;
                objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                interfaceC3163lP.H(objG);
            } else {
                j12 = j10;
                j13 = j11;
                objG = new a(j13, kVar, q1VarB, q1VarA2, q1VarA3, q1VarA, f9, j12);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            AbstractC2282j.a(iVarL8, (k) objG, interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            j14 = j13;
            f10 = f9;
            j15 = j12;
            i16 = i2111;
            iVar4 = iVar12;
        }
        p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(iVar4, j15, f10, j14, i16, i9, i10));
        }
    }

    public static final void f(T0.f fVar, float f8, float f9, long j8, T0.k kVar) {
        float f10 = 2;
        float f11 = kVar.f() / f10;
        float fI = l.i(fVar.d()) - (f10 * f11);
        T0.f.c0(fVar, j8, f8, f9, false, g.a(f11, f11), m.a(fI, fI), 0.0f, kVar, null, 0, 832, null);
    }

    public static final void g(T0.f fVar, long j8, T0.k kVar) {
        f(fVar, 0.0f, 360.0f, j8, kVar);
    }

    public static final void h(T0.f fVar, float f8, float f9, float f10, long j8, T0.k kVar) {
        f(fVar, f8 + (V0.e(kVar.b(), V0.f9341a.a()) ? 0.0f : ((f9 / h.m(f36325e / 2)) * 57.29578f) / 2.0f), Math.max(f10, 0.1f), j8, kVar);
    }

    /* JADX INFO: renamed from: w0.p0$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f36351a = new f();

        public f() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((x) obj);
            return G.f1419a;
        }

        public final void b(x xVar) {
        }
    }
}
