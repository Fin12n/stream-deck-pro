package I6;

import java.lang.reflect.Method;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final i f3787a = new i();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f3788b = new a(null, null, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static a f3789c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Method f3790a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f3791b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Method f3792c;

        public a(Method method, Method method2, Method method3) {
            this.f3790a = method;
            this.f3791b = method2;
            this.f3792c = method3;
        }
    }

    public final a a(I6.a aVar) {
        try {
            a aVar2 = new a(Class.class.getDeclaredMethod("getModule", null), aVar.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", null), aVar.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", null));
            f3789c = aVar2;
            return aVar2;
        } catch (Exception unused) {
            a aVar3 = f3788b;
            f3789c = aVar3;
            return aVar3;
        }
    }

    public final String b(I6.a continuation) {
        t.g(continuation, "continuation");
        a aVarA = f3789c;
        if (aVarA == null) {
            aVarA = a(continuation);
        }
        if (aVarA == f3788b) {
            return null;
        }
        Method method = aVarA.f3790a;
        Object objInvoke = method != null ? method.invoke(continuation.getClass(), null) : null;
        if (objInvoke == null) {
            return null;
        }
        Method method2 = aVarA.f3791b;
        Object objInvoke2 = method2 != null ? method2.invoke(objInvoke, null) : null;
        if (objInvoke2 == null) {
            return null;
        }
        Method method3 = aVarA.f3792c;
        Object objInvoke3 = method3 != null ? method3.invoke(objInvoke2, null) : null;
        if (objInvoke3 instanceof String) {
            return (String) objInvoke3;
        }
        return null;
    }
}
