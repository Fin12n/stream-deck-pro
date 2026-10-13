package p191w0;

import C6.G;
import H0.c;
import Q6.o;
import R0.C1598l0;
import kotlin.jvm.internal.u;
import p159s0.M;
import p159s0.N;
import p183v0.f;
import p183v0.n;
import p183v0.p;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.C0;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: renamed from: w0.a0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3049a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f35794a = new f(0.16f, 0.12f, 0.08f, 0.12f);

    /* JADX INFO: renamed from: w0.a0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ U0 f35795a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f35796b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(U0 u8, o oVar) {
            super(2);
            this.f35795a = u8;
            this.f35796b = oVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1066563262, i8, -1, "androidx.compose.material3.MaterialTheme.<anonymous> (MaterialTheme.kt:71)");
            }
            P0.a(this.f35795a.a(), this.f35796b, interfaceC3163l, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.a0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C3089v f35797a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ y0 f35798b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ U0 f35799c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ o f35800d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ int f35801e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ int f35802f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3089v c3089v, y0 y0Var, U0 u8, o oVar, int i8, int i9) {
            super(2);
            this.f35797a = c3089v;
            this.f35798b = y0Var;
            this.f35799c = u8;
            this.f35800d = oVar;
            this.f35801e = i8;
            this.f35802f = i9;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC3049a0.a(this.f35797a, this.f35798b, this.f35799c, this.f35800d, interfaceC3163l, F0.a(this.f35801e | 1), this.f35802f);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(C3089v c3089v, y0 y0Var, U0 u8, o oVar, InterfaceC3163l interfaceC3163l, int i8, int i9) {
        C3089v c3089vA;
        int i10;
        y0 y0VarB;
        U0 u0C;
        U0 u9;
        y0 y0Var2;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-2127166334);
        if ((i8 & 6) == 0) {
            if ((i9 & 1) == 0) {
                c3089vA = c3089v;
                int i11 = interfaceC3163lP.R(c3089vA) ? 4 : 2;
                i10 = i11 | i8;
            } else {
                c3089vA = c3089v;
            }
            i10 = i11 | i8;
        } else {
            c3089vA = c3089v;
            i10 = i8;
        }
        if ((i8 & 48) == 0) {
            if ((i9 & 2) == 0) {
                y0VarB = y0Var;
                int i12 = interfaceC3163lP.R(y0VarB) ? 32 : 16;
                i10 |= i12;
            } else {
                y0VarB = y0Var;
            }
            i10 |= i12;
        } else {
            y0VarB = y0Var;
        }
        if ((i8 & 384) == 0) {
            if ((i9 & 4) == 0) {
                u0C = u8;
                int i13 = interfaceC3163lP.R(u0C) ? 256 : 128;
                i10 |= i13;
            } else {
                u0C = u8;
            }
            i10 |= i13;
        } else {
            u0C = u8;
        }
        if ((i9 & 8) != 0) {
            i10 |= 3072;
        } else if ((i8 & 3072) == 0) {
            i10 |= interfaceC3163lP.l(oVar) ? 2048 : 1024;
        }
        if ((i10 & 1171) == 1170 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
            y0Var2 = y0VarB;
            u9 = u0C;
        } else {
            interfaceC3163lP.o();
            if ((i8 & 1) == 0 || interfaceC3163lP.F()) {
                if ((i9 & 1) != 0) {
                    c3089vA = Z.f35786a.a(interfaceC3163lP, 6);
                    i10 &= -15;
                }
                if ((i9 & 2) != 0) {
                    y0VarB = Z.f35786a.b(interfaceC3163lP, 6);
                    i10 &= -113;
                }
                if ((i9 & 4) != 0) {
                    u0C = Z.f35786a.c(interfaceC3163lP, 6);
                    i10 &= -897;
                }
            } else {
                interfaceC3163lP.z();
                if ((i9 & 1) != 0) {
                    i10 &= -15;
                }
                if ((i9 & 2) != 0) {
                    i10 &= -113;
                }
                if ((i9 & 4) != 0) {
                    i10 &= -897;
                }
            }
            int i14 = i10;
            U0 u10 = u0C;
            interfaceC3163lP.Q();
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2127166334, i14, -1, "androidx.compose.material3.MaterialTheme (MaterialTheme.kt:60)");
            }
            AbstractC3182v.b(new C0[]{AbstractC3091w.g().c(c3089vA), p046f0.G.a().c(n.e(false, 0.0f, 0L, interfaceC3163lP, 0, 7)), p.d().c(Y.f35785b), z0.c().c(y0VarB), N.b().c(c(c3089vA, interfaceC3163lP, i14 & 14)), V0.b().c(u10)}, c.b(interfaceC3163lP, -1066563262, true, new a(u10, oVar)), interfaceC3163lP, 48);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            y0 y0Var3 = y0VarB;
            u9 = u10;
            y0Var2 = y0Var3;
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(c3089vA, y0Var2, u9, oVar, i8, i9));
        }
    }

    public static final M c(C3089v c3089v, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(1866455512);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1866455512, i8, -1, "androidx.compose.material3.rememberTextSelectionColors (MaterialTheme.kt:126)");
        }
        long jB = c3089v.B();
        interfaceC3163l.f(-314518050);
        boolean zJ = interfaceC3163l.j(jB);
        Object objG = interfaceC3163l.g();
        if (zJ || objG == InterfaceC3163l.f38803a.a()) {
            M m8 = new M(jB, C1598l0.o(jB, 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            interfaceC3163l.H(m8);
            objG = m8;
        }
        M m9 = (M) objG;
        interfaceC3163l.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return m9;
    }
}
