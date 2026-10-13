package p109m0;

import C6.G;
import Q6.o;
import android.view.View;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.u;
import p038e1.i0;
import p215z0.AbstractC3169o;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.P0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ B f29308a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f29309b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ i0 f29310c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ int f29311d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B b8, o oVar, i0 i0Var, int i8) {
            super(2);
            this.f29308a = b8;
            this.f29309b = oVar;
            this.f29310c = i0Var;
            this.f29311d = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            D.a(this.f29308a, this.f29309b, this.f29310c, interfaceC3163l, F0.a(this.f29311d | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    public static final void a(B b8, o oVar, i0 i0Var, InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(1113453182);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1113453182, i8, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPrefetcher (LazyLayoutPrefetcher.android.kt:39)");
        }
        View view = (View) interfaceC3163lP.e(AndroidCompositionLocals_androidKt.j());
        int i9 = i0.f20495f;
        interfaceC3163lP.f(1618982084);
        boolean zR = interfaceC3163lP.R(i0Var) | interfaceC3163lP.R(b8) | interfaceC3163lP.R(view);
        Object objG = interfaceC3163lP.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            interfaceC3163lP.H(new C(b8, i0Var, oVar, view));
        }
        interfaceC3163lP.N();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new a(b8, oVar, i0Var, i8));
        }
    }
}
