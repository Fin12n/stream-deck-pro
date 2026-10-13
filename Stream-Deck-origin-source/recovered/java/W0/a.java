package W0;

import K1.d;
import K1.k;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final XmlPullParser f10786a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f10787b;

    public a(XmlPullParser xmlPullParser, int i8) {
        this.f10786a = xmlPullParser;
        this.f10787b = i8;
    }

    public final float a(TypedArray typedArray, int i8, float f8) {
        float dimension = typedArray.getDimension(i8, f8);
        l(typedArray.getChangingConfigurations());
        return dimension;
    }

    public final float b(TypedArray typedArray, int i8, float f8) {
        float f9 = typedArray.getFloat(i8, f8);
        l(typedArray.getChangingConfigurations());
        return f9;
    }

    public final int c(TypedArray typedArray, int i8, int i9) {
        int i10 = typedArray.getInt(i8, i9);
        l(typedArray.getChangingConfigurations());
        return i10;
    }

    public final boolean d(TypedArray typedArray, String str, int i8, boolean z8) {
        boolean zA = k.a(typedArray, this.f10786a, str, i8, z8);
        l(typedArray.getChangingConfigurations());
        return zA;
    }

    public final ColorStateList e(TypedArray typedArray, Resources.Theme theme, String str, int i8) {
        ColorStateList colorStateListC = k.c(typedArray, this.f10786a, theme, str, i8);
        l(typedArray.getChangingConfigurations());
        return colorStateListC;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.c(this.f10786a, aVar.f10786a) && this.f10787b == aVar.f10787b;
    }

    public final d f(TypedArray typedArray, Resources.Theme theme, String str, int i8, int i9) {
        d dVarE = k.e(typedArray, this.f10786a, theme, str, i8, i9);
        l(typedArray.getChangingConfigurations());
        return dVarE;
    }

    public final float g(TypedArray typedArray, String str, int i8, float f8) {
        float f9 = k.f(typedArray, this.f10786a, str, i8, f8);
        l(typedArray.getChangingConfigurations());
        return f9;
    }

    public final int h(TypedArray typedArray, String str, int i8, int i9) {
        int iG = k.g(typedArray, this.f10786a, str, i8, i9);
        l(typedArray.getChangingConfigurations());
        return iG;
    }

    public int hashCode() {
        return (this.f10786a.hashCode() * 31) + Integer.hashCode(this.f10787b);
    }

    public final String i(TypedArray typedArray, int i8) {
        String string = typedArray.getString(i8);
        l(typedArray.getChangingConfigurations());
        return string;
    }

    public final XmlPullParser j() {
        return this.f10786a;
    }

    public final TypedArray k(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, iArr);
        l(typedArrayI.getChangingConfigurations());
        return typedArrayI;
    }

    public final void l(int i8) {
        this.f10787b = i8 | this.f10787b;
    }

    public String toString() {
        return "AndroidVectorParser(xmlParser=" + this.f10786a + ", config=" + this.f10787b + ')';
    }

    public /* synthetic */ a(XmlPullParser xmlPullParser, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(xmlPullParser, (i9 & 2) != 0 ? 0 : i8);
    }
}
