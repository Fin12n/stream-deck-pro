package androidx.lifecycle;

import D6.C0934n;
import D6.C0937q;
import android.app.Application;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final List f15241a = D6.r.q(Application.class, F.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final List f15242b = C0937q.e(F.class);

    public static final Constructor c(Class modelClass, List signature) {
        kotlin.jvm.internal.t.g(modelClass, "modelClass");
        kotlin.jvm.internal.t.g(signature, "signature");
        Constructor<?>[] constructors = modelClass.getConstructors();
        kotlin.jvm.internal.t.f(constructors, "modelClass.constructors");
        for (Constructor<?> constructor : constructors) {
            Class<?>[] parameterTypes = constructor.getParameterTypes();
            kotlin.jvm.internal.t.f(parameterTypes, "constructor.parameterTypes");
            List listR0 = C0934n.r0(parameterTypes);
            if (kotlin.jvm.internal.t.c(signature, listR0)) {
                kotlin.jvm.internal.t.e(constructor, "null cannot be cast to non-null type java.lang.reflect.Constructor<T of androidx.lifecycle.SavedStateViewModelFactoryKt.findMatchingConstructor>");
                return constructor;
            }
            if (signature.size() == listR0.size() && listR0.containsAll(signature)) {
                throw new UnsupportedOperationException("Class " + modelClass.getSimpleName() + " must have parameters in the proper order: " + signature);
            }
        }
        return null;
    }

    public static final O d(Class modelClass, Constructor constructor, Object... params) {
        kotlin.jvm.internal.t.g(modelClass, "modelClass");
        kotlin.jvm.internal.t.g(constructor, "constructor");
        kotlin.jvm.internal.t.g(params, "params");
        try {
            return (O) constructor.newInstance(Arrays.copyOf(params, params.length));
        } catch (IllegalAccessException e8) {
            throw new RuntimeException("Failed to access " + modelClass, e8);
        } catch (InstantiationException e9) {
            throw new RuntimeException("A " + modelClass + " cannot be instantiated.", e9);
        } catch (InvocationTargetException e10) {
            throw new RuntimeException("An exception happened in constructor of " + modelClass, e10.getCause());
        }
    }
}
