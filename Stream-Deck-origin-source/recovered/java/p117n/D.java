package p117n;

import U1.I;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import p054g.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class D {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final RectF f30185l = new RectF();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static ConcurrentHashMap f30186m = new ConcurrentHashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f30187a = 0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f30188b = false;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f30189c = -1.0f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f30190d = -1.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public float f30191e = -1.0f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int[] f30192f = new int[0];

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30193g = false;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public TextPaint f30194h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final TextView f30195i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Context f30196j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final d f30197k;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public static StaticLayout a(CharSequence charSequence, Layout.Alignment alignment, int i8, int i9, TextView textView, TextPaint textPaint, d dVar) {
            StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(charSequence, 0, charSequence.length(), textPaint, i8);
            StaticLayout.Builder hyphenationFrequency = builderObtain.setAlignment(alignment).setLineSpacing(textView.getLineSpacingExtra(), textView.getLineSpacingMultiplier()).setIncludePad(textView.getIncludeFontPadding()).setBreakStrategy(textView.getBreakStrategy()).setHyphenationFrequency(textView.getHyphenationFrequency());
            if (i9 == -1) {
                i9 = Integer.MAX_VALUE;
            }
            hyphenationFrequency.setMaxLines(i9);
            try {
                dVar.a(builderObtain, textView);
            } catch (ClassCastException unused) {
                Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
            }
            return builderObtain.build();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends d {
        @Override // n.D.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection((TextDirectionHeuristic) D.m(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends b {
        @Override // n.D.b, n.D.d
        public void a(StaticLayout.Builder builder, TextView textView) {
            builder.setTextDirection(textView.getTextDirectionHeuristic());
        }

        @Override // n.D.d
        public boolean b(TextView textView) {
            return textView.isHorizontallyScrollable();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {
        public abstract void a(StaticLayout.Builder builder, TextView textView);

        public boolean b(TextView textView) {
            return ((Boolean) D.m(textView, "getHorizontallyScrolling", Boolean.FALSE)).booleanValue();
        }
    }

    public D(TextView textView) {
        this.f30195i = textView;
        this.f30196j = textView.getContext();
        if (Build.VERSION.SDK_INT >= 29) {
            this.f30197k = new c();
        } else {
            this.f30197k = new b();
        }
    }

    public static Method k(String str) {
        try {
            Method declaredMethod = (Method) f30186m.get(str);
            if (declaredMethod != null || (declaredMethod = TextView.class.getDeclaredMethod(str, null)) == null) {
                return declaredMethod;
            }
            declaredMethod.setAccessible(true);
            f30186m.put(str, declaredMethod);
            return declaredMethod;
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to retrieve TextView#" + str + "() method", e8);
            return null;
        }
    }

    public static Object m(Object obj, String str, Object obj2) {
        try {
            return k(str).invoke(obj, null);
        } catch (Exception e8) {
            Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#" + str + "() method", e8);
            return obj2;
        }
    }

    public void a() {
        if (n()) {
            if (this.f30188b) {
                if (this.f30195i.getMeasuredHeight() <= 0 || this.f30195i.getMeasuredWidth() <= 0) {
                    return;
                }
                int measuredWidth = this.f30197k.b(this.f30195i) ? 1048576 : (this.f30195i.getMeasuredWidth() - this.f30195i.getTotalPaddingLeft()) - this.f30195i.getTotalPaddingRight();
                int height = (this.f30195i.getHeight() - this.f30195i.getCompoundPaddingBottom()) - this.f30195i.getCompoundPaddingTop();
                if (measuredWidth <= 0 || height <= 0) {
                    return;
                }
                RectF rectF = f30185l;
                synchronized (rectF) {
                    try {
                        rectF.setEmpty();
                        rectF.right = measuredWidth;
                        rectF.bottom = height;
                        float fE = e(rectF);
                        if (fE != this.f30195i.getTextSize()) {
                            t(0, fE);
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            this.f30188b = true;
        }
    }

    public final int[] b(int[] iArr) {
        int length = iArr.length;
        if (length != 0) {
            Arrays.sort(iArr);
            ArrayList arrayList = new ArrayList();
            for (int i8 : iArr) {
                if (i8 > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i8)) < 0) {
                    arrayList.add(Integer.valueOf(i8));
                }
            }
            if (length != arrayList.size()) {
                int size = arrayList.size();
                int[] iArr2 = new int[size];
                for (int i9 = 0; i9 < size; i9++) {
                    iArr2[i9] = ((Integer) arrayList.get(i9)).intValue();
                }
                return iArr2;
            }
        }
        return iArr;
    }

    public final void c() {
        this.f30187a = 0;
        this.f30190d = -1.0f;
        this.f30191e = -1.0f;
        this.f30189c = -1.0f;
        this.f30192f = new int[0];
        this.f30188b = false;
    }

    public StaticLayout d(CharSequence charSequence, Layout.Alignment alignment, int i8, int i9) {
        return a.a(charSequence, alignment, i8, i9, this.f30195i, this.f30194h, this.f30197k);
    }

    public final int e(RectF rectF) {
        int length = this.f30192f.length;
        if (length == 0) {
            throw new IllegalStateException("No available text sizes to choose from.");
        }
        int i8 = 1;
        int i9 = length - 1;
        int i10 = 0;
        while (i8 <= i9) {
            int i11 = (i8 + i9) / 2;
            if (x(this.f30192f[i11], rectF)) {
                int i12 = i11 + 1;
                i10 = i8;
                i8 = i12;
            } else {
                i10 = i11 - 1;
                i9 = i10;
            }
        }
        return this.f30192f[i10];
    }

    public int f() {
        return Math.round(this.f30191e);
    }

    public int g() {
        return Math.round(this.f30190d);
    }

    public int h() {
        return Math.round(this.f30189c);
    }

    public int[] i() {
        return this.f30192f;
    }

    public int j() {
        return this.f30187a;
    }

    public void l(int i8) {
        TextPaint textPaint = this.f30194h;
        if (textPaint == null) {
            this.f30194h = new TextPaint();
        } else {
            textPaint.reset();
        }
        this.f30194h.set(this.f30195i.getPaint());
        this.f30194h.setTextSize(i8);
    }

    public boolean n() {
        return y() && this.f30187a != 0;
    }

    public void o(AttributeSet attributeSet, int i8) {
        int resourceId;
        TypedArray typedArrayObtainStyledAttributes = this.f30196j.obtainStyledAttributes(attributeSet, j.f22675g0, i8, 0);
        TextView textView = this.f30195i;
        I.G(textView, textView.getContext(), j.f22675g0, attributeSet, typedArrayObtainStyledAttributes, i8, 0);
        if (typedArrayObtainStyledAttributes.hasValue(j.f22700l0)) {
            this.f30187a = typedArrayObtainStyledAttributes.getInt(j.f22700l0, 0);
        }
        float dimension = typedArrayObtainStyledAttributes.hasValue(j.f22695k0) ? typedArrayObtainStyledAttributes.getDimension(j.f22695k0, -1.0f) : -1.0f;
        float dimension2 = typedArrayObtainStyledAttributes.hasValue(j.f22685i0) ? typedArrayObtainStyledAttributes.getDimension(j.f22685i0, -1.0f) : -1.0f;
        float dimension3 = typedArrayObtainStyledAttributes.hasValue(j.f22680h0) ? typedArrayObtainStyledAttributes.getDimension(j.f22680h0, -1.0f) : -1.0f;
        if (typedArrayObtainStyledAttributes.hasValue(j.f22690j0) && (resourceId = typedArrayObtainStyledAttributes.getResourceId(j.f22690j0, 0)) > 0) {
            TypedArray typedArrayObtainTypedArray = typedArrayObtainStyledAttributes.getResources().obtainTypedArray(resourceId);
            v(typedArrayObtainTypedArray);
            typedArrayObtainTypedArray.recycle();
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!y()) {
            this.f30187a = 0;
            return;
        }
        if (this.f30187a == 1) {
            if (!this.f30193g) {
                DisplayMetrics displayMetrics = this.f30196j.getResources().getDisplayMetrics();
                if (dimension2 == -1.0f) {
                    dimension2 = TypedValue.applyDimension(2, 12.0f, displayMetrics);
                }
                if (dimension3 == -1.0f) {
                    dimension3 = TypedValue.applyDimension(2, 112.0f, displayMetrics);
                }
                if (dimension == -1.0f) {
                    dimension = 1.0f;
                }
                z(dimension2, dimension3, dimension);
            }
            u();
        }
    }

    public void p(int i8, int i9, int i10, int i11) {
        if (y()) {
            DisplayMetrics displayMetrics = this.f30196j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(i11, i8, displayMetrics), TypedValue.applyDimension(i11, i9, displayMetrics), TypedValue.applyDimension(i11, i10, displayMetrics));
            if (u()) {
                a();
            }
        }
    }

    public void q(int[] iArr, int i8) {
        if (y()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArrCopyOf = new int[length];
                if (i8 == 0) {
                    iArrCopyOf = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = this.f30196j.getResources().getDisplayMetrics();
                    for (int i9 = 0; i9 < length; i9++) {
                        iArrCopyOf[i9] = Math.round(TypedValue.applyDimension(i8, iArr[i9], displayMetrics));
                    }
                }
                this.f30192f = b(iArrCopyOf);
                if (!w()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                this.f30193g = false;
            }
            if (u()) {
                a();
            }
        }
    }

    public void r(int i8) {
        if (y()) {
            if (i8 == 0) {
                c();
                return;
            }
            if (i8 != 1) {
                throw new IllegalArgumentException("Unknown auto-size text type: " + i8);
            }
            DisplayMetrics displayMetrics = this.f30196j.getResources().getDisplayMetrics();
            z(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
            if (u()) {
                a();
            }
        }
    }

    public final void s(float f8) {
        if (f8 != this.f30195i.getPaint().getTextSize()) {
            this.f30195i.getPaint().setTextSize(f8);
            boolean zIsInLayout = this.f30195i.isInLayout();
            if (this.f30195i.getLayout() != null) {
                this.f30188b = false;
                try {
                    Method methodK = k("nullLayouts");
                    if (methodK != null) {
                        methodK.invoke(this.f30195i, null);
                    }
                } catch (Exception e8) {
                    Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", e8);
                }
                if (zIsInLayout) {
                    this.f30195i.forceLayout();
                } else {
                    this.f30195i.requestLayout();
                }
                this.f30195i.invalidate();
            }
        }
    }

    public void t(int i8, float f8) {
        Context context = this.f30196j;
        s(TypedValue.applyDimension(i8, f8, (context == null ? Resources.getSystem() : context.getResources()).getDisplayMetrics()));
    }

    public final boolean u() {
        if (y() && this.f30187a == 1) {
            if (!this.f30193g || this.f30192f.length == 0) {
                int iFloor = ((int) Math.floor((this.f30191e - this.f30190d) / this.f30189c)) + 1;
                int[] iArr = new int[iFloor];
                for (int i8 = 0; i8 < iFloor; i8++) {
                    iArr[i8] = Math.round(this.f30190d + (i8 * this.f30189c));
                }
                this.f30192f = b(iArr);
            }
            this.f30188b = true;
        } else {
            this.f30188b = false;
        }
        return this.f30188b;
    }

    public final void v(TypedArray typedArray) {
        int length = typedArray.length();
        int[] iArr = new int[length];
        if (length > 0) {
            for (int i8 = 0; i8 < length; i8++) {
                iArr[i8] = typedArray.getDimensionPixelSize(i8, -1);
            }
            this.f30192f = b(iArr);
            w();
        }
    }

    public final boolean w() {
        int[] iArr = this.f30192f;
        int length = iArr.length;
        boolean z8 = length > 0;
        this.f30193g = z8;
        if (z8) {
            this.f30187a = 1;
            this.f30190d = iArr[0];
            this.f30191e = iArr[length - 1];
            this.f30189c = -1.0f;
        }
        return z8;
    }

    public final boolean x(int i8, RectF rectF) {
        CharSequence transformation;
        CharSequence text = this.f30195i.getText();
        TransformationMethod transformationMethod = this.f30195i.getTransformationMethod();
        if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, this.f30195i)) != null) {
            text = transformation;
        }
        int maxLines = this.f30195i.getMaxLines();
        l(i8);
        StaticLayout staticLayoutD = d(text, (Layout.Alignment) m(this.f30195i, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL), Math.round(rectF.right), maxLines);
        return (maxLines == -1 || (staticLayoutD.getLineCount() <= maxLines && staticLayoutD.getLineEnd(staticLayoutD.getLineCount() - 1) == text.length())) && ((float) staticLayoutD.getHeight()) <= rectF.bottom;
    }

    public final boolean y() {
        return !(this.f30195i instanceof C2709k);
    }

    public final void z(float f8, float f9, float f10) {
        if (f8 <= 0.0f) {
            throw new IllegalArgumentException("Minimum auto-size text size (" + f8 + "px) is less or equal to (0px)");
        }
        if (f9 <= f8) {
            throw new IllegalArgumentException("Maximum auto-size text size (" + f9 + "px) is less or equal to minimum auto-size text size (" + f8 + "px)");
        }
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("The auto-size step granularity (" + f10 + "px) is less or equal to (0px)");
        }
        this.f30187a = 1;
        this.f30190d = f8;
        this.f30191e = f9;
        this.f30189c = f10;
        this.f30193g = false;
    }
}
