package L1;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.util.Log;
import java.io.File;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Class f4947b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Constructor f4948c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static Method f4949d = null;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static Method f4950e = null;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static boolean f4951f = false;

    public static boolean g(Object obj, String str, int i8, boolean z8) throws NoSuchMethodException {
        i();
        try {
            return ((Boolean) f4949d.invoke(obj, str, Integer.valueOf(i8), Boolean.valueOf(z8))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    private static Typeface h(Object obj) throws NoSuchMethodException {
        i();
        try {
            Object objNewInstance = Array.newInstance((Class<?>) f4947b, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) f4950e.invoke(null, objNewInstance);
        } catch (IllegalAccessException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    public static void i() throws NoSuchMethodException {
        Method method;
        Class<?> cls;
        Method method2;
        if (f4951f) {
            return;
        }
        f4951f = true;
        Constructor<?> constructor = null;
        try {
            cls = Class.forName("android.graphics.FontFamily");
            Constructor<?> constructor2 = cls.getConstructor(null);
            method2 = cls.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
            method = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(cls, 1).getClass());
            constructor = constructor2;
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi21Impl", e8.getClass().getName(), e8);
            method = null;
            cls = null;
            method2 = null;
        }
        f4948c = constructor;
        f4947b = cls;
        f4949d = method2;
        f4950e = method;
    }

    private static Object j() throws NoSuchMethodException {
        i();
        try {
            return f4948c.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException e8) {
            throw new RuntimeException(e8);
        }
    }

    @Override // L1.o
    public Typeface a(Context context, K1.e.c cVar, Resources resources, int i8) throws NoSuchMethodException {
        Object objJ = j();
        for (K1.e.d dVar : cVar.a()) {
            File fileD = p.d(context);
            if (fileD == null) {
                return null;
            }
            try {
                if (!p.b(fileD, resources, dVar.b())) {
                    return null;
                }
                if (!g(objJ, fileD.getPath(), dVar.e(), dVar.f())) {
                    return null;
                }
                fileD.delete();
            } catch (RuntimeException unused) {
                return null;
            } finally {
                fileD.delete();
            }
        }
        return h(objJ);
    }
}
