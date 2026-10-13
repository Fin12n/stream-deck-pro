package p191w0;

import C6.G;
import H0.c;
import Q6.o;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: renamed from: w0.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3096z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3096z f36716a = new C3096z();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static o f36717b = c.c(-1187811352, false, a.f36719a);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static o f36718c = c.c(163832305, false, b.f36720a);

    /* JADX INFO: renamed from: w0.z$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f36719a = new a();

        public a() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-1187811352, i8, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda-1.<anonymous> (ModalBottomSheet.android.kt:146)");
            }
            C3070l.f36205a.a(null, 0.0f, 0.0f, null, 0L, interfaceC3163l, 196608, 31);
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

    /* JADX INFO: renamed from: w0.z$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f36720a = new b();

        public b() {
            super(2);
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            if ((i8 & 3) == 2 && interfaceC3163l.s()) {
                interfaceC3163l.z();
                return;
            }
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(163832305, i8, -1, "androidx.compose.material3.ComposableSingletons$ModalBottomSheet_androidKt.lambda-2.<anonymous> (ModalBottomSheet.android.kt:556)");
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

    public final o a() {
        return f36717b;
    }

    public final o b() {
        return f36718c;
    }
}
