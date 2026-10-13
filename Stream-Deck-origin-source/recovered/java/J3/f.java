package J3;

import C6.G;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p191w0.C3070l;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final f f4162a = new f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Q6.p f4163b = H0.c.c(160778517, false, a.f4164a);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f4164a = new a();

        public a() {
            super(3);
        }

        public final void b(Function0 it, InterfaceC3163l interfaceC3163l, int i8) {
            t.g(it, "it");
            if ((i8 & 81) == 16 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(160778517, i8, -1, "com.elgato.streamdeck.ui.components.ComposableSingletons$BottomSheetKt.lambda-1.<anonymous> (BottomSheet.kt:87)");
            }
            C3070l.f36205a.a(null, 0.0f, 0.0f, null, 0L, interfaceC3163l, 196608, 31);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            b((Function0) obj, (InterfaceC3163l) obj2, ((Number) obj3).intValue());
            return G.f1419a;
        }
    }

    public final Q6.p a() {
        return f4163b;
    }
}
