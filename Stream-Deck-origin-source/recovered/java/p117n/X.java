package p117n;

import K1.h;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.TypedValue;
import p072i.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f30339a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final TypedArray f30340b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f30341c;

    public X(Context context, TypedArray typedArray) {
        this.f30339a = context;
        this.f30340b = typedArray;
    }

    public static X s(Context context, int i8, int[] iArr) {
        return new X(context, context.obtainStyledAttributes(i8, iArr));
    }

    public static X t(Context context, AttributeSet attributeSet, int[] iArr) {
        return new X(context, context.obtainStyledAttributes(attributeSet, iArr));
    }

    public static X u(Context context, AttributeSet attributeSet, int[] iArr, int i8, int i9) {
        return new X(context, context.obtainStyledAttributes(attributeSet, iArr, i8, i9));
    }

    public boolean a(int i8, boolean z8) {
        return this.f30340b.getBoolean(i8, z8);
    }

    public int b(int i8, int i9) {
        return this.f30340b.getColor(i8, i9);
    }

    public ColorStateList c(int i8) {
        int resourceId;
        ColorStateList colorStateListA;
        return (!this.f30340b.hasValue(i8) || (resourceId = this.f30340b.getResourceId(i8, 0)) == 0 || (colorStateListA = a.a(this.f30339a, resourceId)) == null) ? this.f30340b.getColorStateList(i8) : colorStateListA;
    }

    public int d(int i8, int i9) {
        return this.f30340b.getDimensionPixelOffset(i8, i9);
    }

    public int e(int i8, int i9) {
        return this.f30340b.getDimensionPixelSize(i8, i9);
    }

    public Drawable f(int i8) {
        int resourceId;
        return (!this.f30340b.hasValue(i8) || (resourceId = this.f30340b.getResourceId(i8, 0)) == 0) ? this.f30340b.getDrawable(i8) : a.b(this.f30339a, resourceId);
    }

    public Drawable g(int i8) {
        int resourceId;
        if (!this.f30340b.hasValue(i8) || (resourceId = this.f30340b.getResourceId(i8, 0)) == 0) {
            return null;
        }
        return C2708j.b().d(this.f30339a, resourceId, true);
    }

    public float h(int i8, float f8) {
        return this.f30340b.getFloat(i8, f8);
    }

    public Typeface i(int i8, int i9, h.e eVar) {
        int resourceId = this.f30340b.getResourceId(i8, 0);
        if (resourceId == 0) {
            return null;
        }
        if (this.f30341c == null) {
            this.f30341c = new TypedValue();
        }
        return h.g(this.f30339a, resourceId, this.f30341c, i9, eVar);
    }

    public int j(int i8, int i9) {
        return this.f30340b.getInt(i8, i9);
    }

    public int k(int i8, int i9) {
        return this.f30340b.getInteger(i8, i9);
    }

    public int l(int i8, int i9) {
        return this.f30340b.getLayoutDimension(i8, i9);
    }

    public int m(int i8, int i9) {
        return this.f30340b.getResourceId(i8, i9);
    }

    public String n(int i8) {
        return this.f30340b.getString(i8);
    }

    public CharSequence o(int i8) {
        return this.f30340b.getText(i8);
    }

    public CharSequence[] p(int i8) {
        return this.f30340b.getTextArray(i8);
    }

    public TypedArray q() {
        return this.f30340b;
    }

    public boolean r(int i8) {
        return this.f30340b.hasValue(i8);
    }

    public TypedValue v(int i8) {
        return this.f30340b.peekValue(i8);
    }

    public void w() {
        this.f30340b.recycle();
    }
}
