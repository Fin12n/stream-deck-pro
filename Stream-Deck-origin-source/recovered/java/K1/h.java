package K1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4527a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final WeakHashMap f4528b = new WeakHashMap(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Object f4529c = new Object();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static Drawable a(Resources resources, int i8, Resources.Theme theme) {
            return resources.getDrawable(i8, theme);
        }

        public static Drawable b(Resources resources, int i8, int i9, Resources.Theme theme) {
            return resources.getDrawableForDensity(i8, i9, theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static int a(Resources resources, int i8, Resources.Theme theme) {
            return resources.getColor(i8, theme);
        }

        public static ColorStateList b(Resources resources, int i8, Resources.Theme theme) {
            return resources.getColorStateList(i8, theme);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ColorStateList f4530a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Configuration f4531b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f4532c;

        public c(ColorStateList colorStateList, Configuration configuration, Resources.Theme theme) {
            this.f4530a = colorStateList;
            this.f4531b = configuration;
            this.f4532c = theme == null ? 0 : theme.hashCode();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Resources f4533a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Resources.Theme f4534b;

        public d(Resources resources, Resources.Theme theme) {
            this.f4533a = resources;
            this.f4534b = theme;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && d.class == obj.getClass()) {
                d dVar = (d) obj;
                if (this.f4533a.equals(dVar.f4533a) && T1.d.a(this.f4534b, dVar.f4534b)) {
                    return true;
                }
            }
            return false;
        }

        public int hashCode() {
            return T1.d.b(this.f4533a, this.f4534b);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class e {
        public static Handler e(Handler handler) {
            return handler == null ? new Handler(Looper.getMainLooper()) : handler;
        }

        public final void c(final int i8, Handler handler) {
            e(handler).post(new Runnable() { // from class: K1.j
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4540a.f(i8);
                }
            });
        }

        public final void d(final Typeface typeface, Handler handler) {
            e(handler).post(new Runnable() { // from class: K1.i
                @Override // java.lang.Runnable
                public final void run() {
                    this.f4538a.g(typeface);
                }
            });
        }

        public abstract void f(int i8);

        public abstract void g(Typeface typeface);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final Object f4535a = new Object();

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public static Method f4536b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public static boolean f4537c;

            /* JADX WARN: Code duplicated, block: B:31:0x0027 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            public static void a(Resources.Theme theme) {
                Method method;
                synchronized (f4535a) {
                    if (f4537c) {
                        method = f4536b;
                        if (method != null) {
                            method.invoke(theme, null);
                        }
                    } else {
                        try {
                            Method declaredMethod = Resources.Theme.class.getDeclaredMethod("rebase", null);
                            f4536b = declaredMethod;
                            declaredMethod.setAccessible(true);
                        } catch (NoSuchMethodException e8) {
                            Log.i("ResourcesCompat", "Failed to retrieve rebase() method", e8);
                        }
                        f4537c = true;
                        method = f4536b;
                        if (method != null) {
                            try {
                                method.invoke(theme, null);
                            } catch (IllegalAccessException | InvocationTargetException e9) {
                                Log.i("ResourcesCompat", "Failed to invoke rebase() method via reflection", e9);
                                f4536b = null;
                            }
                        }
                    }
                    throw th;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static class b {
            public static void a(Resources.Theme theme) {
                theme.rebase();
            }
        }

        public static void a(Resources.Theme theme) {
            if (Build.VERSION.SDK_INT >= 29) {
                b.a(theme);
            } else {
                a.a(theme);
            }
        }
    }

    public static void a(d dVar, int i8, ColorStateList colorStateList, Resources.Theme theme) {
        synchronized (f4529c) {
            try {
                WeakHashMap weakHashMap = f4528b;
                SparseArray sparseArray = (SparseArray) weakHashMap.get(dVar);
                if (sparseArray == null) {
                    sparseArray = new SparseArray();
                    weakHashMap.put(dVar, sparseArray);
                }
                sparseArray.append(i8, new c(colorStateList, dVar.f4533a.getConfiguration(), theme));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003c, code lost:
    
        if (r2.f4532c == r5.hashCode()) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ColorStateList b(d dVar, int i8) {
        c cVar;
        synchronized (f4529c) {
            try {
                SparseArray sparseArray = (SparseArray) f4528b.get(dVar);
                if (sparseArray != null && sparseArray.size() > 0 && (cVar = (c) sparseArray.get(i8)) != null) {
                    if (cVar.f4531b.equals(dVar.f4533a.getConfiguration())) {
                        Resources.Theme theme = dVar.f4534b;
                        if (theme != null || cVar.f4532c != 0) {
                            if (theme != null) {
                            }
                        }
                        return cVar.f4530a;
                    }
                    sparseArray.remove(i8);
                }
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static ColorStateList c(Resources resources, int i8, Resources.Theme theme) {
        d dVar = new d(resources, theme);
        ColorStateList colorStateListB = b(dVar, i8);
        if (colorStateListB != null) {
            return colorStateListB;
        }
        ColorStateList colorStateListJ = j(resources, i8, theme);
        if (colorStateListJ == null) {
            return b.b(resources, i8, theme);
        }
        a(dVar, i8, colorStateListJ, theme);
        return colorStateListJ;
    }

    public static Drawable d(Resources resources, int i8, Resources.Theme theme) {
        return a.a(resources, i8, theme);
    }

    public static Drawable e(Resources resources, int i8, int i9, Resources.Theme theme) {
        return a.b(resources, i8, i9, theme);
    }

    public static Typeface f(Context context, int i8) {
        if (context.isRestricted()) {
            return null;
        }
        return l(context, i8, new TypedValue(), 0, null, null, false, false);
    }

    public static Typeface g(Context context, int i8, TypedValue typedValue, int i9, e eVar) {
        if (context.isRestricted()) {
            return null;
        }
        return l(context, i8, typedValue, i9, eVar, null, true, false);
    }

    public static void h(Context context, int i8, e eVar, Handler handler) {
        T1.f.g(eVar);
        if (context.isRestricted()) {
            eVar.c(-4, handler);
        } else {
            l(context, i8, new TypedValue(), 0, eVar, handler, false, false);
        }
    }

    public static TypedValue i() {
        ThreadLocal threadLocal = f4527a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList j(Resources resources, int i8, Resources.Theme theme) {
        if (k(resources, i8)) {
            return null;
        }
        try {
            return K1.c.a(resources, resources.getXml(i8), theme);
        } catch (Exception e8) {
            Log.w("ResourcesCompat", "Failed to inflate ColorStateList, leaving it to the framework", e8);
            return null;
        }
    }

    public static boolean k(Resources resources, int i8) {
        TypedValue typedValueI = i();
        resources.getValue(i8, typedValueI, true);
        int i9 = typedValueI.type;
        return i9 >= 28 && i9 <= 31;
    }

    public static Typeface l(Context context, int i8, TypedValue typedValue, int i9, e eVar, Handler handler, boolean z8, boolean z9) {
        Resources resources = context.getResources();
        resources.getValue(i8, typedValue, true);
        Typeface typefaceM = m(context, resources, typedValue, i8, i9, eVar, handler, z8, z9);
        if (typefaceM != null || eVar != null || z9) {
            return typefaceM;
        }
        throw new Resources.NotFoundException("Font resource ID #0x" + Integer.toHexString(i8) + " could not be retrieved.");
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00b3  */
    public static Typeface m(Context context, Resources resources, TypedValue typedValue, int i8, int i9, e eVar, Handler handler, boolean z8, boolean z9) {
        CharSequence charSequence = typedValue.string;
        if (charSequence == null) {
            throw new Resources.NotFoundException("Resource \"" + resources.getResourceName(i8) + "\" (" + Integer.toHexString(i8) + ") is not a Font: " + typedValue);
        }
        String string = charSequence.toString();
        if (!string.startsWith("res/")) {
            if (eVar != null) {
                eVar.c(-3, handler);
            }
            return null;
        }
        Typeface typefaceF = L1.j.f(resources, i8, string, typedValue.assetCookie, i9);
        if (typefaceF != null) {
            if (eVar != null) {
                eVar.d(typefaceF, handler);
            }
            return typefaceF;
        }
        if (z9) {
            return null;
        }
        try {
            if (!string.toLowerCase().endsWith(".xml")) {
                Typeface typefaceD = L1.j.d(context, resources, i8, string, typedValue.assetCookie, i9);
                if (eVar != null) {
                    if (typefaceD != null) {
                        eVar.d(typefaceD, handler);
                        return typefaceD;
                    }
                    eVar.c(-3, handler);
                }
                return typefaceD;
            }
            K1.e.b bVarB = K1.e.b(resources.getXml(i8), resources);
            if (bVarB == null) {
                Log.e("ResourcesCompat", "Failed to find font-family tag");
                if (eVar != null) {
                    eVar.c(-3, handler);
                }
                return null;
            }
            try {
                return L1.j.c(context, bVarB, resources, i8, string, typedValue.assetCookie, i9, eVar, handler, z8);
            } catch (IOException e8) {
                e = e8;
                string = string;
                Log.e("ResourcesCompat", "Failed to read xml resource " + string, e);
                if (eVar != null) {
                    eVar.c(-3, handler);
                }
                return null;
            } catch (XmlPullParserException e9) {
                e = e9;
                string = string;
                Log.e("ResourcesCompat", "Failed to parse xml resource " + string, e);
                if (eVar != null) {
                    eVar.c(-3, handler);
                }
                return null;
            }
        } catch (IOException e10) {
            e = e10;
        } catch (XmlPullParserException e11) {
            e = e11;
        }
    }
}
