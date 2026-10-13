package K2;

import D6.r;
import U1.c0;
import android.app.Activity;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Point;
import android.graphics.Rect;
import android.inputmethodservice.InputMethodService;
import android.os.Build;
import android.util.Log;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.WindowManager;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m implements l {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f4604b = new m();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f4605c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final ArrayList f4606d;

    static {
        String simpleName = m.class.getSimpleName();
        t.f(simpleName, "WindowMetricsCalculatorC…at::class.java.simpleName");
        f4605c = simpleName;
        f4606d = r.h(Integer.valueOf(c0.m.g()), Integer.valueOf(c0.m.f()), Integer.valueOf(c0.m.a()), Integer.valueOf(c0.m.c()), Integer.valueOf(c0.m.i()), Integer.valueOf(c0.m.e()), Integer.valueOf(c0.m.j()), Integer.valueOf(c0.m.b()));
    }

    @Override // K2.l
    public k a(Context context) {
        t.g(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return O2.c.f7554a.c(context);
        }
        Context contextA = O2.b.f7553a.a(context);
        if (contextA instanceof Activity) {
            return b((Activity) contextA);
        }
        if (!(contextA instanceof InputMethodService)) {
            throw new IllegalArgumentException(context + " is not a UiContext");
        }
        Object systemService = context.getSystemService("window");
        t.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        Display defaultDisplay = ((WindowManager) systemService).getDefaultDisplay();
        t.f(defaultDisplay, "wm.defaultDisplay");
        Point pointH = h(defaultDisplay);
        return new k(new Rect(0, 0, pointH.x, pointH.y), null, 2, null);
    }

    public k b(Activity activity) throws Exception {
        Rect rectD;
        c0 c0VarA;
        t.g(activity, "activity");
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            rectD = O2.c.f7554a.a(activity);
        } else {
            rectD = i8 >= 29 ? d(activity) : c(activity);
        }
        if (i8 >= 30) {
            c0VarA = e(activity);
        } else {
            c0VarA = new c0.b().a();
            t.f(c0VarA, "{\n            WindowInse…ilder().build()\n        }");
        }
        return new k(new I2.b(rectD), c0VarA);
    }

    public final Rect c(Activity activity) {
        t.g(activity, "activity");
        Rect rect = new Rect();
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            if (O2.a.f7552a.a(activity)) {
                Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
                t.e(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke);
            } else {
                Object objInvoke2 = obj.getClass().getDeclaredMethod("getAppBounds", null).invoke(obj, null);
                t.e(objInvoke2, "null cannot be cast to non-null type android.graphics.Rect");
                rect.set((Rect) objInvoke2);
            }
        } catch (IllegalAccessException e8) {
            Log.w(f4605c, e8);
            i(activity, rect);
        } catch (NoSuchFieldException e9) {
            Log.w(f4605c, e9);
            i(activity, rect);
        } catch (NoSuchMethodException e10) {
            Log.w(f4605c, e10);
            i(activity, rect);
        } catch (InvocationTargetException e11) {
            Log.w(f4605c, e11);
            i(activity, rect);
        }
        Display currentDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        currentDisplay.getRealSize(point);
        O2.a aVar = O2.a.f7552a;
        if (!aVar.a(activity)) {
            int iG = g(activity);
            int i8 = rect.bottom;
            if (i8 + iG == point.y) {
                rect.bottom = i8 + iG;
            } else {
                int i9 = rect.right;
                if (i9 + iG == point.x) {
                    rect.right = i9 + iG;
                } else if (rect.left == iG) {
                    rect.left = 0;
                }
            }
        }
        if ((rect.width() < point.x || rect.height() < point.y) && !aVar.a(activity)) {
            t.f(currentDisplay, "currentDisplay");
            DisplayCutout displayCutoutF = f(currentDisplay);
            if (displayCutoutF != null) {
                int i10 = rect.left;
                O2.d dVar = O2.d.f7555a;
                if (i10 == dVar.b(displayCutoutF)) {
                    rect.left = 0;
                }
                if (point.x - rect.right == dVar.c(displayCutoutF)) {
                    rect.right += dVar.c(displayCutoutF);
                }
                if (rect.top == dVar.d(displayCutoutF)) {
                    rect.top = 0;
                }
                if (point.y - rect.bottom == dVar.a(displayCutoutF)) {
                    rect.bottom += dVar.a(displayCutoutF);
                }
            }
        }
        return rect;
    }

    public final Rect d(Activity activity) {
        t.g(activity, "activity");
        Configuration configuration = activity.getResources().getConfiguration();
        try {
            Field declaredField = Configuration.class.getDeclaredField("windowConfiguration");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(configuration);
            Object objInvoke = obj.getClass().getDeclaredMethod("getBounds", null).invoke(obj, null);
            t.e(objInvoke, "null cannot be cast to non-null type android.graphics.Rect");
            return new Rect((Rect) objInvoke);
        } catch (IllegalAccessException e8) {
            Log.w(f4605c, e8);
            return c(activity);
        } catch (NoSuchFieldException e9) {
            Log.w(f4605c, e9);
            return c(activity);
        } catch (NoSuchMethodException e10) {
            Log.w(f4605c, e10);
            return c(activity);
        } catch (InvocationTargetException e11) {
            Log.w(f4605c, e11);
            return c(activity);
        }
    }

    public final c0 e(Context context) throws Exception {
        t.g(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return O2.c.f7554a.b(context);
        }
        throw new Exception("Incompatible SDK version");
    }

    public final DisplayCutout f(Display display) {
        try {
            Constructor<?> constructor = Class.forName("android.view.DisplayInfo").getConstructor(null);
            constructor.setAccessible(true);
            Object objNewInstance = constructor.newInstance(null);
            Method declaredMethod = display.getClass().getDeclaredMethod("getDisplayInfo", objNewInstance.getClass());
            declaredMethod.setAccessible(true);
            declaredMethod.invoke(display, objNewInstance);
            Field declaredField = objNewInstance.getClass().getDeclaredField("displayCutout");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(objNewInstance);
            if (obj instanceof DisplayCutout) {
                return (DisplayCutout) obj;
            }
        } catch (ClassNotFoundException e8) {
            Log.w(f4605c, e8);
        } catch (IllegalAccessException e9) {
            Log.w(f4605c, e9);
        } catch (InstantiationException e10) {
            Log.w(f4605c, e10);
        } catch (NoSuchFieldException e11) {
            Log.w(f4605c, e11);
        } catch (NoSuchMethodException e12) {
            Log.w(f4605c, e12);
        } catch (InvocationTargetException e13) {
            Log.w(f4605c, e13);
        }
        return null;
    }

    public final int g(Context context) {
        Resources resources = context.getResources();
        int identifier = resources.getIdentifier("navigation_bar_height", "dimen", "android");
        if (identifier > 0) {
            return resources.getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public final Point h(Display display) {
        t.g(display, "display");
        Point point = new Point();
        display.getRealSize(point);
        return point;
    }

    public final void i(Activity activity, Rect rect) {
        activity.getWindowManager().getDefaultDisplay().getRectSize(rect);
    }
}
