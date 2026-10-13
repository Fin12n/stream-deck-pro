package I2;

import C6.G;
import android.app.Activity;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ClassLoader f3736a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InvocationHandler {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X6.d f3737a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Q6.k f3738b;

        public a(X6.d clazz, Q6.k consumer) {
            t.g(clazz, "clazz");
            t.g(consumer, "consumer");
            this.f3737a = clazz;
            this.f3738b = consumer;
        }

        public final void a(Object parameter) {
            t.g(parameter, "parameter");
            this.f3738b.invoke(parameter);
        }

        public final boolean b(Method method, Object[] objArr) {
            return t.c(method.getName(), "accept") && objArr != null && objArr.length == 1;
        }

        public final boolean c(Method method, Object[] objArr) {
            return t.c(method.getName(), "equals") && method.getReturnType().equals(Boolean.TYPE) && objArr != null && objArr.length == 1;
        }

        public final boolean d(Method method, Object[] objArr) {
            return t.c(method.getName(), "hashCode") && method.getReturnType().equals(Integer.TYPE) && objArr == null;
        }

        public final boolean e(Method method, Object[] objArr) {
            return t.c(method.getName(), "toString") && method.getReturnType().equals(String.class) && objArr == null;
        }

        @Override // java.lang.reflect.InvocationHandler
        public Object invoke(Object obj, Method method, Object[] objArr) {
            t.g(obj, "obj");
            t.g(method, "method");
            if (b(method, objArr)) {
                a(X6.e.a(this.f3737a, objArr != null ? objArr[0] : null));
                return G.f1419a;
            }
            if (c(method, objArr)) {
                return Boolean.valueOf(obj == (objArr != null ? objArr[0] : null));
            }
            if (d(method, objArr)) {
                return Integer.valueOf(this.f3738b.hashCode());
            }
            if (e(method, objArr)) {
                return this.f3738b.toString();
            }
            throw new UnsupportedOperationException("Unexpected method call object:" + obj + ", method: " + method + ", args: " + objArr);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void d();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Method f3739a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f3740b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Object f3741c;

        public c(Method method, Object obj, Object obj2) {
            this.f3739a = method;
            this.f3740b = obj;
            this.f3741c = obj2;
        }

        @Override // I2.d.b
        public void d() throws IllegalAccessException, InvocationTargetException {
            this.f3739a.invoke(this.f3740b, this.f3741c);
        }
    }

    public d(ClassLoader loader) {
        t.g(loader, "loader");
        this.f3736a = loader;
    }

    public final Object a(X6.d dVar, Q6.k kVar) {
        Object objNewProxyInstance = Proxy.newProxyInstance(this.f3736a, new Class[]{d()}, new a(dVar, kVar));
        t.f(objNewProxyInstance, "newProxyInstance(loader,…onsumerClass()), handler)");
        return objNewProxyInstance;
    }

    public final Class b() {
        try {
            return d();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final b c(Object obj, X6.d clazz, String addMethodName, String removeMethodName, Activity activity, Q6.k consumer) throws IllegalAccessException, InvocationTargetException {
        t.g(obj, "obj");
        t.g(clazz, "clazz");
        t.g(addMethodName, "addMethodName");
        t.g(removeMethodName, "removeMethodName");
        t.g(activity, "activity");
        t.g(consumer, "consumer");
        Object objA = a(clazz, consumer);
        obj.getClass().getMethod(addMethodName, Activity.class, d()).invoke(obj, activity, objA);
        return new c(obj.getClass().getMethod(removeMethodName, d()), obj, objA);
    }

    public final Class d() throws ClassNotFoundException {
        Class<?> clsLoadClass = this.f3736a.loadClass("java.util.function.Consumer");
        t.f(clsLoadClass, "loader.loadClass(\"java.util.function.Consumer\")");
        return clsLoadClass;
    }
}
