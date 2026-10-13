package F7;

import java.lang.reflect.Method;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p179u4.eubL.OjEsfyJYzbPn;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2444d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Method f2445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Method f2446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Method f2447c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final h a() throws NoSuchMethodException {
            Method method;
            Method method2;
            Method method3 = null;
            try {
                Class<?> cls = Class.forName("dalvik.system.CloseGuard");
                Method method4 = cls.getMethod(com.amazon.a.a.o.b.au, null);
                method2 = cls.getMethod(OjEsfyJYzbPn.ymFKQIIneY, String.class);
                method = cls.getMethod("warnIfOpen", null);
                method3 = method4;
            } catch (Exception unused) {
                method = null;
                method2 = null;
            }
            return new h(method3, method2, method);
        }

        public a() {
        }
    }

    public h(Method method, Method method2, Method method3) {
        this.f2445a = method;
        this.f2446b = method2;
        this.f2447c = method3;
    }

    public final Object a(String closer) {
        t.g(closer, "closer");
        Method method = this.f2445a;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(null, null);
                Method method2 = this.f2446b;
                t.d(method2);
                method2.invoke(objInvoke, closer);
                return objInvoke;
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public final boolean b(Object obj) {
        if (obj == null) {
            return false;
        }
        try {
            Method method = this.f2447c;
            t.d(method);
            method.invoke(obj, null);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
