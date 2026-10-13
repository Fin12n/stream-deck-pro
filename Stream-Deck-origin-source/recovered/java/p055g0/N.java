package p055g0;

import Q6.k;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;
import p215z0.g1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class N {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ q1 f22844a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(q1 q1Var) {
            super(1);
            this.f22844a = q1Var;
        }

        public final Float b(float f8) {
            return (Float) ((k) this.f22844a.getValue()).invoke(Float.valueOf(f8));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Number) obj).floatValue());
        }
    }

    public static final M a(k kVar) {
        return new C2333n(kVar);
    }

    public static final M b(k kVar, InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-180460798);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-180460798, i8, -1, "androidx.compose.foundation.gestures.rememberScrollableState (ScrollableState.kt:143)");
        }
        q1 q1VarP = g1.p(kVar, interfaceC3163l, i8 & 14);
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        if (objG == InterfaceC3163l.f38803a.a()) {
            objG = a(new a(q1VarP));
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        M m8 = (M) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return m8;
    }
}
