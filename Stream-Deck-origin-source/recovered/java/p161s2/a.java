package p161s2;

import androidx.lifecycle.S;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3182v;
import p215z0.B0;
import p215z0.C0;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f32876a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final B0 f32877b = AbstractC3182v.d(null, C0735a.f32879a, 1, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f32878c = 0;

    /* JADX INFO: renamed from: s2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0735a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0735a f32879a = new C0735a();

        public C0735a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final S invoke() {
            return null;
        }
    }

    public final S a(InterfaceC3163l interfaceC3163l, int i8) {
        interfaceC3163l.f(-584162872);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-584162872, i8, -1, "androidx.lifecycle.viewmodel.compose.LocalViewModelStoreOwner.<get-current> (LocalViewModelStoreOwner.kt:38)");
        }
        S sA = (S) interfaceC3163l.e(f32877b);
        if (sA == null) {
            sA = b.a(interfaceC3163l, 0);
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return sA;
    }

    public final C0 b(S viewModelStoreOwner) {
        t.g(viewModelStoreOwner, "viewModelStoreOwner");
        return f32877b.c(viewModelStoreOwner);
    }
}
