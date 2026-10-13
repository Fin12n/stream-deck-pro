package p111m2;

import java.lang.reflect.InvocationTargetException;
import p010b0.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f29943a = new C();

    public static boolean b(ClassLoader classLoader, String str) {
        try {
            return ComponentCallbacksC2681f.class.isAssignableFrom(c(classLoader, str));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static Class c(ClassLoader classLoader, String str) throws ClassNotFoundException {
        C c8 = f29943a;
        C c9 = (C) c8.get(classLoader);
        if (c9 == null) {
            c9 = new C();
            c8.put(classLoader, c9);
        }
        Class cls = (Class) c9.get(str);
        if (cls != null) {
            return cls;
        }
        Class<?> cls2 = Class.forName(str, false, classLoader);
        c9.put(str, cls2);
        return cls2;
    }

    public static Class d(ClassLoader classLoader, String str) {
        try {
            return c(classLoader, str);
        } catch (ClassCastException e8) {
            throw new ComponentCallbacksC2681f.i("Unable to instantiate fragment " + str + ": make sure class is a valid subclass of Fragment", e8);
        } catch (ClassNotFoundException e9) {
            throw new ComponentCallbacksC2681f.i("Unable to instantiate fragment " + str + ": make sure class name exists", e9);
        }
    }

    public ComponentCallbacksC2681f a(ClassLoader classLoader, String str) {
        try {
            return (ComponentCallbacksC2681f) d(classLoader, str).getConstructor(null).newInstance(null);
        } catch (IllegalAccessException e8) {
            throw new ComponentCallbacksC2681f.i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e8);
        } catch (InstantiationException e9) {
            throw new ComponentCallbacksC2681f.i("Unable to instantiate fragment " + str + ": make sure class name exists, is public, and has an empty constructor that is public", e9);
        } catch (NoSuchMethodException e10) {
            throw new ComponentCallbacksC2681f.i("Unable to instantiate fragment " + str + ": could not find Fragment constructor", e10);
        } catch (InvocationTargetException e11) {
            throw new ComponentCallbacksC2681f.i("Unable to instantiate fragment " + str + ": calling Fragment constructor caused an exception", e11);
        }
    }
}
