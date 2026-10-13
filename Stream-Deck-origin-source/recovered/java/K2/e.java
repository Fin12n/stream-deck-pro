package K2;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import androidx.window.extensions.WindowExtensionsProvider;
import androidx.window.extensions.core.util.function.Consumer;
import androidx.window.extensions.layout.WindowLayoutComponent;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p027d.LrLN.vHKCAgr;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f4574a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final I2.d f4575b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final H2.a f4576c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {
        public a() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0060  */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            boolean z8;
            Class clsF = e.this.f();
            Method getBoundsMethod = clsF.getMethod("getBounds", null);
            Method getTypeMethod = clsF.getMethod("getType", null);
            Method getStateMethod = clsF.getMethod("getState", null);
            P2.a aVar = P2.a.f8877a;
            t.f(getBoundsMethod, "getBoundsMethod");
            if (aVar.b(getBoundsMethod, K.b(Rect.class)) && aVar.d(getBoundsMethod)) {
                t.f(getTypeMethod, "getTypeMethod");
                Class cls = Integer.TYPE;
                if (aVar.b(getTypeMethod, K.b(cls)) && aVar.d(getTypeMethod)) {
                    t.f(getStateMethod, "getStateMethod");
                    if (aVar.b(getStateMethod, K.b(cls)) && aVar.d(getStateMethod)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                } else {
                    z8 = false;
                }
            } else {
                z8 = false;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Function0 {
        public b() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x0045  */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            boolean z8;
            Class clsB = e.this.f4575b.b();
            if (clsB == null) {
                return Boolean.FALSE;
            }
            Class clsH = e.this.h();
            Method addListenerMethod = clsH.getMethod("addWindowLayoutInfoListener", Activity.class, clsB);
            Method removeListenerMethod = clsH.getMethod("removeWindowLayoutInfoListener", clsB);
            P2.a aVar = P2.a.f8877a;
            t.f(addListenerMethod, "addListenerMethod");
            if (aVar.d(addListenerMethod)) {
                t.f(removeListenerMethod, "removeListenerMethod");
                if (aVar.d(removeListenerMethod)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else {
                z8 = false;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {
        public c() {
            super(0);
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0038  */
        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            boolean z8;
            Class clsH = e.this.h();
            Method addListenerMethod = clsH.getMethod("addWindowLayoutInfoListener", Context.class, Consumer.class);
            Method removeListenerMethod = clsH.getMethod("removeWindowLayoutInfoListener", Consumer.class);
            P2.a aVar = P2.a.f8877a;
            t.f(addListenerMethod, "addListenerMethod");
            if (aVar.d(addListenerMethod)) {
                t.f(removeListenerMethod, "removeListenerMethod");
                if (aVar.d(removeListenerMethod)) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } else {
                z8 = false;
            }
            return Boolean.valueOf(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Function0 {
        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() throws NoSuchMethodException, ClassNotFoundException {
            Method getWindowLayoutComponentMethod = e.this.f4576c.c().getMethod("getWindowLayoutComponent", null);
            Class clsH = e.this.h();
            P2.a aVar = P2.a.f8877a;
            t.f(getWindowLayoutComponentMethod, "getWindowLayoutComponentMethod");
            return Boolean.valueOf(aVar.d(getWindowLayoutComponentMethod) && aVar.c(getWindowLayoutComponentMethod, clsH));
        }
    }

    public e(ClassLoader loader, I2.d consumerAdapter) {
        t.g(loader, "loader");
        t.g(consumerAdapter, "consumerAdapter");
        this.f4574a = loader;
        this.f4575b = consumerAdapter;
        this.f4576c = new H2.a(loader);
    }

    public final boolean e() {
        if (!n()) {
            return false;
        }
        int iA = I2.e.f3742a.a();
        if (iA == 1) {
            return i();
        }
        if (2 > iA || iA > Integer.MAX_VALUE) {
            return false;
        }
        return j();
    }

    public final Class f() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f4574a.loadClass("androidx.window.extensions.layout.FoldingFeature");
        t.f(clsLoadClass, "loader.loadClass(FOLDING_FEATURE_CLASS)");
        return clsLoadClass;
    }

    public final WindowLayoutComponent g() {
        if (!e()) {
            return null;
        }
        try {
            return WindowExtensionsProvider.getWindowExtensions().getWindowLayoutComponent();
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }

    public final boolean i() {
        return l();
    }

    public final boolean j() {
        return i() && m();
    }

    public final boolean k() {
        return P2.a.e("FoldingFeature class is not valid", new a());
    }

    public final boolean l() {
        return P2.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Activity.class.getName() + ", java.util.function.Consumer) is not valid", new b());
    }

    public final boolean m() {
        return P2.a.e("WindowLayoutComponent#addWindowLayoutInfoListener(" + Context.class.getName() + ", androidx.window.extensions.core.util.function.Consumer) is not valid", new c());
    }

    public final boolean n() {
        return this.f4576c.f() && o() && k();
    }

    public final boolean o() {
        return P2.a.e("WindowExtensions#getWindowLayoutComponent is not valid", new d());
    }

    public final Class h() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f4574a.loadClass("androidx.window.extensions.layout.WindowLayoutComponent");
        t.f(clsLoadClass, vHKCAgr.zYycvXiCwhTP);
        return clsLoadClass;
    }
}
