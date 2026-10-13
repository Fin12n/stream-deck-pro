package L1;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class l extends k {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Class f4952g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Constructor f4953h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Method f4954i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Method f4955j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Method f4956k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final Method f4957l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Method f4958m;

    public l() {
        Class clsT;
        Constructor constructorU;
        Method methodQ;
        Method methodR;
        Method methodV;
        Method methodP;
        Method methodS;
        try {
            clsT = t();
            constructorU = u(clsT);
            methodQ = q(clsT);
            methodR = r(clsT);
            methodV = v(clsT);
            methodP = p(clsT);
            methodS = s(clsT);
        } catch (ClassNotFoundException | NoSuchMethodException e8) {
            Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class " + e8.getClass().getName(), e8);
            clsT = null;
            constructorU = null;
            methodQ = null;
            methodR = null;
            methodV = null;
            methodP = null;
            methodS = null;
        }
        this.f4952g = clsT;
        this.f4953h = constructorU;
        this.f4954i = methodQ;
        this.f4955j = methodR;
        this.f4956k = methodV;
        this.f4957l = methodP;
        this.f4958m = methodS;
    }

    @Override // L1.k, L1.o
    public Typeface a(Context context, K1.e.c cVar, Resources resources, int i8) {
        if (!o()) {
            return super.a(context, cVar, resources, i8);
        }
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        K1.e.d[] dVarArrA = cVar.a();
        int length = dVarArrA.length;
        int i9 = 0;
        while (i9 < length) {
            K1.e.d dVar = dVarArrA[i9];
            Context context2 = context;
            if (!l(context2, objJ, dVar.a(), dVar.c(), dVar.e(), dVar.f() ? 1 : 0, FontVariationAxis.fromFontVariationSettings(dVar.d()))) {
                k(objJ);
                return null;
            }
            i9++;
            context = context2;
        }
        if (n(objJ)) {
            return h(objJ);
        }
        return null;
    }

    @Override // L1.o
    public Typeface b(Context context, CancellationSignal cancellationSignal, Q1.g.b[] bVarArr, int i8) {
        Typeface typefaceH;
        Object obj;
        if (bVarArr.length < 1) {
            return null;
        }
        if (!o()) {
            Q1.g.b bVarF = f(bVarArr, i8);
            try {
                ParcelFileDescriptor parcelFileDescriptorOpenFileDescriptor = context.getContentResolver().openFileDescriptor(bVarF.d(), "r", cancellationSignal);
                if (parcelFileDescriptorOpenFileDescriptor == null) {
                    if (parcelFileDescriptorOpenFileDescriptor != null) {
                        parcelFileDescriptorOpenFileDescriptor.close();
                    }
                    return null;
                }
                try {
                    Typeface typefaceBuild = new Typeface.Builder(parcelFileDescriptorOpenFileDescriptor.getFileDescriptor()).setWeight(bVarF.e()).setItalic(bVarF.f()).build();
                    parcelFileDescriptorOpenFileDescriptor.close();
                    return typefaceBuild;
                } catch (Throwable th) {
                    try {
                        parcelFileDescriptorOpenFileDescriptor.close();
                        throw th;
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                        throw th;
                    }
                }
            } catch (IOException unused) {
                return null;
            }
        }
        Map mapF = p.f(context, bVarArr, cancellationSignal);
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        int length = bVarArr.length;
        int i9 = 0;
        boolean z8 = false;
        while (i9 < length) {
            Q1.g.b bVar = bVarArr[i9];
            ByteBuffer byteBuffer = (ByteBuffer) mapF.get(bVar.d());
            if (byteBuffer == null) {
                obj = objJ;
            } else {
                boolean zM = m(objJ, byteBuffer, bVar.c(), bVar.e(), bVar.f() ? 1 : 0);
                obj = objJ;
                if (!zM) {
                    k(obj);
                    return null;
                }
                z8 = true;
            }
            i9++;
            objJ = obj;
            z8 = z8;
        }
        Object obj2 = objJ;
        if (!z8) {
            k(obj2);
            return null;
        }
        if (n(obj2) && (typefaceH = h(obj2)) != null) {
            return Typeface.create(typefaceH, i8);
        }
        return null;
    }

    @Override // L1.o
    public Typeface c(Context context, Resources resources, int i8, String str, int i9) {
        if (!o()) {
            return super.c(context, resources, i8, str, i9);
        }
        Object objJ = j();
        if (objJ == null) {
            return null;
        }
        if (!l(context, objJ, str, 0, -1, -1, null)) {
            k(objJ);
            return null;
        }
        if (n(objJ)) {
            return h(objJ);
        }
        return null;
    }

    public Typeface h(Object obj) {
        try {
            Object objNewInstance = Array.newInstance((Class<?>) this.f4952g, 1);
            Array.set(objNewInstance, 0, obj);
            return (Typeface) this.f4958m.invoke(null, objNewInstance, -1, -1);
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return null;
        }
    }

    public final Object j() {
        try {
            return this.f4953h.newInstance(null);
        } catch (IllegalAccessException | InstantiationException | InvocationTargetException unused) {
            return null;
        }
    }

    public final void k(Object obj) {
        try {
            this.f4957l.invoke(obj, null);
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    public final boolean l(Context context, Object obj, String str, int i8, int i9, int i10, FontVariationAxis[] fontVariationAxisArr) {
        try {
            return ((Boolean) this.f4954i.invoke(obj, context.getAssets(), str, 0, Boolean.FALSE, Integer.valueOf(i8), Integer.valueOf(i9), Integer.valueOf(i10), fontVariationAxisArr)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean m(Object obj, ByteBuffer byteBuffer, int i8, int i9, int i10) {
        try {
            return ((Boolean) this.f4955j.invoke(obj, byteBuffer, Integer.valueOf(i8), null, Integer.valueOf(i9), Integer.valueOf(i10))).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean n(Object obj) {
        try {
            return ((Boolean) this.f4956k.invoke(obj, null)).booleanValue();
        } catch (IllegalAccessException | InvocationTargetException unused) {
            return false;
        }
    }

    public final boolean o() {
        if (this.f4954i == null) {
            Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
        }
        return this.f4954i != null;
    }

    public Method p(Class cls) {
        return cls.getMethod("abortCreation", null);
    }

    public Method q(Class cls) {
        Class cls2 = Boolean.TYPE;
        Class cls3 = Integer.TYPE;
        return cls.getMethod("addFontFromAssetManager", AssetManager.class, String.class, cls3, cls2, cls3, cls3, cls3, FontVariationAxis[].class);
    }

    public Method r(Class cls) {
        Class cls2 = Integer.TYPE;
        return cls.getMethod("addFontFromBuffer", ByteBuffer.class, cls2, FontVariationAxis[].class, cls2, cls2);
    }

    public Method s(Class cls) throws NoSuchMethodException {
        Class<?> cls2 = Array.newInstance((Class<?>) cls, 1).getClass();
        Class cls3 = Integer.TYPE;
        Method declaredMethod = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", cls2, cls3, cls3);
        declaredMethod.setAccessible(true);
        return declaredMethod;
    }

    public Class t() {
        return Class.forName("android.graphics.FontFamily");
    }

    public Constructor u(Class cls) {
        return cls.getConstructor(null);
    }

    public Method v(Class cls) {
        return cls.getMethod("freeze", null);
    }
}
