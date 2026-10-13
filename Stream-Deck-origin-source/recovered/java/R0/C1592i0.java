package R0;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: renamed from: R0.i0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1592i0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1592i0 f9397a = new C1592i0();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Method f9398b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static Method f9399c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static boolean f9400d;

    public final void a(Canvas canvas, boolean z8) {
        Method method;
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 29) {
            C1594j0.f9401a.a(canvas, z8);
            return;
        }
        if (!f9400d) {
            try {
                if (i8 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    f9398b = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    f9399c = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    f9398b = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    f9399c = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = f9398b;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = f9399c;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            f9400d = true;
        }
        if (z8) {
            try {
                Method method4 = f9398b;
                if (method4 != null) {
                    kotlin.jvm.internal.t.d(method4);
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z8 || (method = f9399c) == null) {
            return;
        }
        kotlin.jvm.internal.t.d(method);
        method.invoke(canvas, null);
    }
}
