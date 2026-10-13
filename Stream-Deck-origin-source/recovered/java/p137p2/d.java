package p137p2;

import C6.InterfaceC0916e;
import C6.q;
import C6.r;
import androidx.lifecycle.InterfaceC1733p;
import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p215z0.AbstractC3182v;
import p215z0.B0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final B0 f31146a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f31147a = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1733p invoke() {
            throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
        }
    }

    static {
        Object objB;
        B0 b8;
        try {
            q.a aVar = q.f1441b;
            ClassLoader classLoader = InterfaceC1733p.class.getClassLoader();
            t.d(classLoader);
            Method method = classLoader.loadClass("androidx.compose.ui.platform.AndroidCompositionLocals_androidKt").getMethod("getLocalLifecycleOwner", null);
            Annotation[] annotations = method.getAnnotations();
            int length = annotations.length;
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    Object objInvoke = method.invoke(null, null);
                    if (objInvoke instanceof B0) {
                        b8 = (B0) objInvoke;
                        break;
                    }
                } else if (!(annotations[i8] instanceof InterfaceC0916e)) {
                    i8++;
                }
                b8 = null;
                break;
            }
            objB = q.b(b8);
        } catch (Throwable th) {
            q.a aVar2 = q.f1441b;
            objB = q.b(r.a(th));
        }
        B0 b0E = (B0) (q.g(objB) ? null : objB);
        if (b0E == null) {
            b0E = AbstractC3182v.e(a.f31147a);
        }
        f31146a = b0E;
    }

    public static final B0 a() {
        return f31146a;
    }
}
