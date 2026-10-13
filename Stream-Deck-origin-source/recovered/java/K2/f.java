package K2;

import android.content.Context;
import android.util.Log;
import androidx.window.extensions.layout.WindowLayoutComponent;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p044e7.InterfaceC2260f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f4581a = a.f4582a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final boolean f4583b = false;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f4582a = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final String f4584c = K.b(f.class).d();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C6.j f4585d = C6.k.b(C0165a.f4587a);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static g f4586e = b.f4553a;

        /* JADX INFO: renamed from: K2.f$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0165a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0165a f4587a = new C0165a();

            public C0165a() {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final L2.a invoke() {
                WindowLayoutComponent windowLayoutComponentG;
                try {
                    ClassLoader loader = f.class.getClassLoader();
                    e eVar = loader != null ? new e(loader, new I2.d(loader)) : null;
                    if (eVar == null || (windowLayoutComponentG = eVar.g()) == null) {
                        return null;
                    }
                    M2.a.C0183a c0183a = M2.a.f5118b;
                    t.f(loader, "loader");
                    return c0183a.a(windowLayoutComponentG, new I2.d(loader));
                } catch (Throwable unused) {
                    if (a.f4583b) {
                        Log.d(a.f4584c, "Failed to load WindowExtensions");
                    }
                    return null;
                }
            }
        }

        public final L2.a c() {
            return (L2.a) f4585d.getValue();
        }

        public final f d(Context context) {
            t.g(context, "context");
            L2.a aVarC = c();
            if (aVarC == null) {
                aVarC = androidx.window.layout.adapter.sidecar.b.f15441c.a(context);
            }
            return f4586e.a(new i(m.f4604b, aVarC));
        }
    }

    InterfaceC2260f a(Context context);
}
