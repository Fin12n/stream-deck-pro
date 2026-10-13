package K6;

import D6.C0934n;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: K6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0173a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0173a f4724a = new C0173a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final Method f4725b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final Method f4726c;

        static {
            Method method;
            Method method2;
            Method[] methods = Throwable.class.getMethods();
            t.d(methods);
            int length = methods.length;
            int i8 = 0;
            while (true) {
                method = null;
                if (i8 >= length) {
                    method2 = null;
                    break;
                }
                method2 = methods[i8];
                if (t.c(method2.getName(), "addSuppressed")) {
                    Class<?>[] parameterTypes = method2.getParameterTypes();
                    t.f(parameterTypes, "getParameterTypes(...)");
                    if (t.c(C0934n.l0(parameterTypes), Throwable.class)) {
                        break;
                    }
                }
                i8++;
            }
            f4725b = method2;
            for (Method method3 : methods) {
                if (t.c(method3.getName(), "getSuppressed")) {
                    method = method3;
                    break;
                }
            }
            f4726c = method;
        }
    }

    public void a(Throwable cause, Throwable exception) throws IllegalAccessException, InvocationTargetException {
        t.g(cause, "cause");
        t.g(exception, "exception");
        Method method = C0173a.f4725b;
        if (method != null) {
            method.invoke(cause, exception);
        }
    }

    public U6.c b() {
        return new U6.b();
    }
}
