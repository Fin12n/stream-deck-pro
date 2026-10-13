package p082j0;

import C6.G;
import L0.h;
import L0.i;
import Q6.k;
import Q6.p;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2401l0;
import p065h1.C2403m0;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h0 {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {
        public a() {
            super(1);
        }

        public final void b(C2403m0 c2403m0) {
            c2403m0.b("imePadding");
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((C2403m0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements p {
        public b() {
            super(3);
        }

        public final i b(i iVar, InterfaceC3163l interfaceC3163l, int i8) {
            interfaceC3163l.f(359872873);
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(359872873, i8, -1, "androidx.compose.foundation.layout.windowInsetsPadding.<anonymous> (WindowInsetsPadding.android.kt:249)");
            }
            e0 e0VarC = e0.f27950x.c(interfaceC3163l, 8);
            interfaceC3163l.f(1157296644);
            boolean zR = interfaceC3163l.R(e0VarC);
            Object objG = interfaceC3163l.g();
            if (zR || objG == InterfaceC3163l.f38803a.a()) {
                objG = new C2617v(e0VarC.d());
                interfaceC3163l.H(objG);
            }
            interfaceC3163l.N();
            C2617v c2617v = (C2617v) objG;
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
            interfaceC3163l.N();
            return c2617v;
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return b((i) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
        }
    }

    public static final i a(i iVar) {
        return h.a(iVar, AbstractC2401l0.c() ? new a() : AbstractC2401l0.a(), new b());
    }
}
