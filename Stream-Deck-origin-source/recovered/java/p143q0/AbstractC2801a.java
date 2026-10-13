package p143q0;

import C6.G;
import L0.i;
import Q0.f;
import Q0.l;
import Q6.k;
import Q6.o;
import Q6.p;
import R0.C1600m0;
import R0.InterfaceC1621x0;
import T0.h;
import androidx.compose.ui.draw.a;
import kotlin.jvm.internal.u;
import p082j0.X;
import p159s0.AbstractC2879a;
import p159s0.EnumC2886h;
import p159s0.InterfaceC2889k;
import p159s0.M;
import p159s0.N;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: renamed from: q0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2801a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float f31551a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f31552b;

    /* JADX INFO: renamed from: q0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0685a implements InterfaceC2889k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f31553a;

        public C0685a(long j8) {
            this.f31553a = j8;
        }

        @Override // p159s0.InterfaceC2889k
        public final long a() {
            return this.f31553a;
        }
    }

    /* JADX INFO: renamed from: q0.a$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f31554a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f31555b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(o oVar, i iVar) {
            super(2);
            this.f31554a = oVar;
            this.f31555b = iVar;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 11) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1458480226, i8, -1, "androidx.compose.foundation.text.CursorHandle.<anonymous> (AndroidCursorHandle.android.kt:47)");
            }
            if (this.f31554a == null) {
                interfaceC3163l.f(1275643845);
                AbstractC2801a.b(this.f31555b, interfaceC3163l, 0);
                interfaceC3163l.N();
            } else {
                interfaceC3163l.f(1275643915);
                this.f31554a.invoke(interfaceC3163l, 0);
                interfaceC3163l.N();
            }
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

    /* JADX INFO: renamed from: q0.a$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f31556a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f31557b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f31558c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f31559d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(long j8, i iVar, o oVar, int i8) {
            super(2);
            this.f31556a = j8;
            this.f31557b = iVar;
            this.f31558c = oVar;
            this.f31559d = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC2801a.a(this.f31556a, this.f31557b, this.f31558c, interfaceC3163l, F0.a(this.f31559d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: q0.a$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ i f31560a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f31561b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(i iVar, int i8) {
            super(2);
            this.f31560a = iVar;
            this.f31561b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            AbstractC2801a.b(this.f31560a, interfaceC3163l, F0.a(this.f31561b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: q0.a$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f31562a = new e();

        /* JADX INFO: renamed from: q0.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0686a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f31563a;

            /* JADX INFO: renamed from: q0.a$e$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0687a extends u implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ float f31564a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1621x0 f31565b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ C1600m0 f31566c;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0687a(float f8, InterfaceC1621x0 interfaceC1621x0, C1600m0 c1600m0) {
                    super(1);
                    this.f31564a = f8;
                    this.f31565b = interfaceC1621x0;
                    this.f31566c = c1600m0;
                }

                public final void b(T0.c cVar) {
                    cVar.v1();
                    float f8 = this.f31564a;
                    InterfaceC1621x0 interfaceC1621x0 = this.f31565b;
                    C1600m0 c1600m0 = this.f31566c;
                    T0.d dVarK0 = cVar.K0();
                    long jD = dVarK0.d();
                    dVarK0.c().k();
                    h hVarA = dVarK0.a();
                    h.i(hVarA, f8, 0.0f, 2, null);
                    hVarA.h(45.0f, f.f9082b.c());
                    T0.f.j1(cVar, interfaceC1621x0, 0L, 0.0f, null, c1600m0, 0, 46, null);
                    dVarK0.c().x();
                    dVarK0.b(jD);
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((T0.c) obj);
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0686a(long j8) {
                super(1);
                this.f31563a = j8;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final O0.i invoke(O0.e eVar) {
                float fI = l.i(eVar.d()) / 2.0f;
                return eVar.e(new C0687a(fI, AbstractC2879a.d(eVar, fI), C1600m0.a.b(C1600m0.f9420b, this.f31563a, 0, 2, null)));
            }
        }

        public e() {
            super(3);
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(-2126899193);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-2126899193, i8, -1, "androidx.compose.foundation.text.drawCursorHandle.<anonymous> (AndroidCursorHandle.android.kt:62)");
            }
            long jB = ((M) interfaceC3163l.e(N.b())).b();
            i.a aVar = i.f4836a;
            interfaceC3163l.f(-1739374137);
            boolean zJ = interfaceC3163l.j(jB);
            Object objG = interfaceC3163l.g();
            if (zJ || objG == InterfaceC3163l.f38803a.a()) {
                objG = new C0686a(jB);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            i iVarJ = iVar.j(a.c(aVar, (k) objG));
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return iVarJ;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    static {
        float fM = A1.h.m(25);
        f31551a = fM;
        f31552b = A1.h.m(A1.h.m(fM * 2.0f) / 2.4142137f);
    }

    public static final void a(long j8, i iVar, o oVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-5185995);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.j(j8) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i8 & 112) == 0) {
            i9 |= interfaceC3163lP.R(iVar) ? 32 : 16;
        }
        if ((i8 & 896) == 0) {
            i9 |= interfaceC3163lP.l(oVar) ? 256 : 128;
        }
        if ((i9 & 731) == 146 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-5185995, i9, -1, "androidx.compose.foundation.text.CursorHandle (AndroidCursorHandle.android.kt:42)");
            }
            interfaceC3163lP.f(-1739374713);
            boolean zJ = interfaceC3163lP.j(j8);
            Object objG = interfaceC3163lP.g();
            if (zJ || objG == InterfaceC3163l.f38803a.a()) {
                objG = new C0685a(j8);
                interfaceC3163lP.H(objG);
            }
            interfaceC3163lP.N();
            AbstractC2879a.a((InterfaceC2889k) objG, EnumC2886h.TopMiddle, H0.c.b(interfaceC3163lP, -1458480226, true, new b(oVar, iVar)), interfaceC3163lP, 432);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new c(j8, iVar, oVar, i8));
        }
    }

    public static final void b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(694251107);
        if ((i8 & 14) == 0) {
            i9 = (interfaceC3163lP.R(iVar) ? 4 : 2) | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 11) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(694251107, i9, -1, "androidx.compose.foundation.text.DefaultCursorHandle (AndroidCursorHandle.android.kt:57)");
            }
            X.a(c(androidx.compose.foundation.layout.f.m(iVar, f31552b, f31551a)), interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new d(iVar, i8));
        }
    }

    public static final i c(i iVar) {
        return L0.h.b(iVar, null, e.f31562a, 1, null);
    }
}
