package p117n;

import L1.c;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import p054g.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class T {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f30320a = new ThreadLocal();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int[] f30321b = {-16842910};

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f30322c = {R.attr.state_focused};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f30323d = {R.attr.state_activated};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int[] f30324e = {R.attr.state_pressed};

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int[] f30325f = {R.attr.state_checked};

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int[] f30326g = {R.attr.state_selected};

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int[] f30327h = {-16842919, -16842908};

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int[] f30328i = new int[0];

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int[] f30329j = new int[1];

    public static void a(View view, Context context) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(j.f22765y0);
        try {
            if (!typedArrayObtainStyledAttributes.hasValue(j.f22553D0)) {
                Log.e("ThemeUtils", "View " + view.getClass() + " is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
            }
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static int b(Context context, int i8) {
        ColorStateList colorStateListE = e(context, i8);
        if (colorStateListE != null && colorStateListE.isStateful()) {
            return colorStateListE.getColorForState(f30321b, colorStateListE.getDefaultColor());
        }
        TypedValue typedValueF = f();
        context.getTheme().resolveAttribute(R.attr.disabledAlpha, typedValueF, true);
        return d(context, i8, typedValueF.getFloat());
    }

    public static int c(Context context, int i8) {
        int[] iArr = f30329j;
        iArr[0] = i8;
        X xT = X.t(context, null, iArr);
        try {
            return xT.b(0, 0);
        } finally {
            xT.w();
        }
    }

    public static int d(Context context, int i8, float f8) {
        int iC = c(context, i8);
        return c.f(iC, Math.round(Color.alpha(iC) * f8));
    }

    public static ColorStateList e(Context context, int i8) {
        int[] iArr = f30329j;
        iArr[0] = i8;
        X xT = X.t(context, null, iArr);
        try {
            return xT.c(0);
        } finally {
            xT.w();
        }
    }

    public static TypedValue f() {
        ThreadLocal threadLocal = f30320a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }
}
