package p159s0;

import C6.m;
import C6.r;
import I6.l;
import Q0.f;
import Q0.g;
import Q0.h;
import Q6.o;
import W6.n;
import kotlin.jvm.internal.u;
import p011b1.I;
import p011b1.S;
import p038e1.InterfaceC2247s;
import p128o1.C2739d;
import p143q0.AbstractC2825z;
import p143q0.E;
import p143q0.EnumC2813m;
import p143q0.G;
import p143q0.V;
import p143q0.X;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;
import p216z1.i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2889k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I f32697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ boolean f32698b;

        public a(I i8, boolean z8) {
            this.f32697a = i8;
            this.f32698b = z8;
        }

        @Override // p159s0.InterfaceC2889k
        public final long a() {
            return this.f32697a.D(this.f32698b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32699a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f32700b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ G f32701c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(G g8, G6.d dVar) {
            super(2, dVar);
            this.f32701c = g8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            b bVar = new b(this.f32701c, dVar);
            bVar.f32700b = obj;
            return bVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i8, G6.d dVar) {
            return ((b) create(i8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f32699a;
            if (i8 == 0) {
                r.b(obj);
                I i9 = (I) this.f32700b;
                G g8 = this.f32701c;
                this.f32699a = 1;
                if (AbstractC2825z.c(i9, g8, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f32702a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f32703b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ I f32704c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f32705d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(boolean z8, i iVar, I i8, int i9) {
            super(2);
            this.f32702a = z8;
            this.f32703b = iVar;
            this.f32704c = i8;
            this.f32705d = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            J.a(this.f32702a, this.f32703b, this.f32704c, interfaceC3163l, F0.a(this.f32705d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f32706a;

        static {
            int[] iArr = new int[EnumC2813m.values().length];
            try {
                iArr[EnumC2813m.Cursor.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC2813m.SelectionStart.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC2813m.SelectionEnd.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f32706a = iArr;
        }
    }

    public static final void a(boolean z8, i iVar, I i8, InterfaceC3163l interfaceC3163l, int i9) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-1344558920);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1344558920, i9, -1, "androidx.compose.foundation.text.selection.TextFieldSelectionHandle (TextFieldSelectionManager.kt:957)");
        }
        Boolean boolValueOf = Boolean.valueOf(z8);
        interfaceC3163lP.f(511388516);
        boolean zR = interfaceC3163lP.R(boolValueOf) | interfaceC3163lP.R(i8);
        Object objG = interfaceC3163lP.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = i8.M(z8);
            interfaceC3163lP.H(objG);
        }
        interfaceC3163lP.N();
        G g8 = (G) objG;
        AbstractC2879a.b(new a(i8, z8), z8, iVar, p128o1.G.m(i8.L().g()), S.c(L0.i.f4836a, g8, new b(g8, null)), interfaceC3163lP, (i9 << 3) & 1008);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(z8, iVar, i8, i9));
        }
    }

    public static final long b(I i8, long j8) {
        int iN;
        X xH;
        E eS;
        C2739d c2739dK;
        f fVarY = i8.y();
        if (fVarY == null) {
            return f.f9082b.b();
        }
        long jX = fVarY.x();
        C2739d c2739dK2 = i8.K();
        if (c2739dK2 == null || c2739dK2.length() == 0) {
            return f.f9082b.b();
        }
        EnumC2813m enumC2813mA = i8.A();
        int i9 = enumC2813mA == null ? -1 : d.f32706a[enumC2813mA.ordinal()];
        if (i9 == -1) {
            return f.f9082b.b();
        }
        if (i9 == 1 || i9 == 2) {
            iN = p128o1.G.n(i8.L().g());
        } else {
            if (i9 != 3) {
                throw new m();
            }
            iN = p128o1.G.i(i8.L().g());
        }
        V vI = i8.I();
        if (vI == null || (xH = vI.h()) == null) {
            return f.f9082b.b();
        }
        V vI2 = i8.I();
        if (vI2 == null || (eS = vI2.s()) == null || (c2739dK = eS.k()) == null) {
            return f.f9082b.b();
        }
        int iK = n.k(i8.G().b(iN), 0, c2739dK.length());
        float fO = f.o(xH.j(jX));
        p128o1.E eF = xH.f();
        int iQ = eF.q(iK);
        float fS = eF.s(iQ);
        float fT = eF.t(iQ);
        float fJ = n.j(fO, Math.min(fS, fT), Math.max(fS, fT));
        if (Math.abs(fO - fJ) > A1.r.g(j8) / 2) {
            return f.f9082b.b();
        }
        float fV = eF.v(iQ);
        return g.a(fJ, ((eF.m(iQ) - fV) / 2) + fV);
    }

    public static final boolean c(I i8, boolean z8) {
        InterfaceC2247s interfaceC2247sG;
        h hVarB;
        V vI = i8.I();
        if (vI == null || (interfaceC2247sG = vI.g()) == null || (hVarB = C.b(interfaceC2247sG)) == null) {
            return false;
        }
        return C.a(hVarB, i8.D(z8));
    }
}
