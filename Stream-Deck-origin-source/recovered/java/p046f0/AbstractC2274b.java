package p046f0;

import A1.b;
import A1.h;
import C6.G;
import L0.i;
import Q6.k;
import Q6.p;
import W6.n;
import android.content.Context;
import android.os.Build;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.u;
import p038e1.I;
import p038e1.J;
import p038e1.a0;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: renamed from: f0.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2274b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f21422a;

    /* JADX INFO: renamed from: f0.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f21423a = new a();

        /* JADX INFO: renamed from: f0.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0505a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a0 f21424a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f21425b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0505a(a0 a0Var, int i8) {
                super(1);
                this.f21424a = a0Var;
                this.f21425b = i8;
            }

            public final void b(a0.a aVar) {
                a0 a0Var = this.f21424a;
                a0.a.r(aVar, a0Var, ((-this.f21425b) / 2) - ((a0Var.y0() - this.f21424a.v0()) / 2), ((-this.f21425b) / 2) - ((this.f21424a.h0() - this.f21424a.k0()) / 2), 0.0f, null, 12, null);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a0.a) obj);
                return G.f1419a;
            }
        }

        public a() {
            super(3);
        }

        public final I b(J j8, p038e1.G g8, long j9) {
            a0 a0VarJ = g8.J(j9);
            int iV0 = j8.V0(h.m(AbstractC2286n.b() * 2));
            return J.X0(j8, n.d(a0VarJ.v0() - iV0, 0), n.d(a0VarJ.k0() - iV0, 0), null, new C0505a(a0VarJ, iV0), 4, null);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((J) obj, (p038e1.G) obj2, ((b) obj3).s());
        }
    }

    /* JADX INFO: renamed from: f0.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0506b extends u implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0506b f21426a = new C0506b();

        /* JADX INFO: renamed from: f0.b$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a0 f21427a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ int f21428b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(a0 a0Var, int i8) {
                super(1);
                this.f21427a = a0Var;
                this.f21428b = i8;
            }

            public final void b(a0.a aVar) {
                a0 a0Var = this.f21427a;
                int i8 = this.f21428b;
                a0.a.f(aVar, a0Var, i8 / 2, i8 / 2, 0.0f, 4, null);
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((a0.a) obj);
                return G.f1419a;
            }
        }

        public C0506b() {
            super(3);
        }

        public final I b(J j8, p038e1.G g8, long j9) {
            a0 a0VarJ = g8.J(j9);
            int iV0 = j8.V0(h.m(AbstractC2286n.b() * 2));
            return J.X0(j8, a0VarJ.y0() + iV0, a0VarJ.h0() + iV0, null, new a(a0VarJ, iV0), 4, null);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((J) obj, (p038e1.G) obj2, ((b) obj3).s());
        }
    }

    static {
        f21422a = Build.VERSION.SDK_INT >= 31 ? androidx.compose.ui.layout.b.a(androidx.compose.ui.layout.b.a(i.f4836a, a.f21423a), C0506b.f21426a) : i.f4836a;
    }

    public static final S b(InterfaceC3163l interfaceC3163l, int i8) {
        S s8;
        interfaceC3163l.f(-1476348564);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-1476348564, i8, -1, "androidx.compose.foundation.rememberOverscrollEffect (AndroidOverscroll.android.kt:64)");
        }
        Context context = (Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g());
        P p8 = (P) interfaceC3163l.e(Q.a());
        if (p8 != null) {
            interfaceC3163l.f(511388516);
            boolean zR = interfaceC3163l.R(context) | interfaceC3163l.R(p8);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new C2273a(context, p8);
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            s8 = (S) objG;
        } else {
            s8 = O.f21336a;
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return s8;
    }
}
