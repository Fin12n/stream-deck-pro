package H2;

import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f3503a;

    /* JADX INFO: renamed from: H2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0128a extends u implements Function0 {
        public C0128a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Class invoke() throws ClassNotFoundException {
            Class<?> clsLoadClass = a.this.f3503a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
            t.f(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
            return clsLoadClass;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            Method getWindowExtensionsMethod = a.this.d().getDeclaredMethod("getWindowExtensions", null);
            Class clsC = a.this.c();
            P2.a aVar = P2.a.f8877a;
            t.f(getWindowExtensionsMethod, "getWindowExtensionsMethod");
            return Boolean.valueOf(aVar.c(getWindowExtensionsMethod, clsC) && aVar.d(getWindowExtensionsMethod));
        }
    }

    public a(ClassLoader loader) {
        t.g(loader, "loader");
        this.f3503a = loader;
    }

    public final Class c() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f3503a.loadClass("androidx.window.extensions.WindowExtensions");
        t.f(clsLoadClass, "loader.loadClass(WindowE….WINDOW_EXTENSIONS_CLASS)");
        return clsLoadClass;
    }

    public final Class d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f3503a.loadClass("androidx.window.extensions.WindowExtensionsProvider");
        t.f(clsLoadClass, "loader.loadClass(WindowE…XTENSIONS_PROVIDER_CLASS)");
        return clsLoadClass;
    }

    public final boolean e() {
        return P2.a.f8877a.a(new C0128a());
    }

    public final boolean f() {
        return e() && P2.a.e("WindowExtensionsProvider#getWindowExtensions is not valid", new b());
    }
}
