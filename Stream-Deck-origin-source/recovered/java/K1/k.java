package K1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.TypedValue;
import org.xmlpull.v1.XmlPullParser;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {
    public static boolean a(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, boolean z8) {
        return !h(xmlPullParser, str) ? z8 : typedArray.getBoolean(i8, z8);
    }

    public static int b(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, int i9) {
        return !h(xmlPullParser, str) ? i9 : typedArray.getColor(i8, i9);
    }

    public static ColorStateList c(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i8) {
        if (!h(xmlPullParser, str)) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        typedArray.getValue(i8, typedValue);
        int i9 = typedValue.type;
        if (i9 != 2) {
            return (i9 < 28 || i9 > 31) ? c.d(typedArray.getResources(), typedArray.getResourceId(i8, 0), theme) : d(typedValue);
        }
        throw new UnsupportedOperationException("Failed to resolve attribute at index " + i8 + ": " + typedValue);
    }

    public static ColorStateList d(TypedValue typedValue) {
        return ColorStateList.valueOf(typedValue.data);
    }

    public static d e(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i8, int i9) {
        if (h(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i8, typedValue);
            int i10 = typedValue.type;
            if (i10 >= 28 && i10 <= 31) {
                return d.b(typedValue.data);
            }
            d dVarG = d.g(typedArray.getResources(), typedArray.getResourceId(i8, 0), theme);
            if (dVarG != null) {
                return dVarG;
            }
        }
        return d.b(i9);
    }

    public static float f(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, float f8) {
        return !h(xmlPullParser, str) ? f8 : typedArray.getFloat(i8, f8);
    }

    public static int g(TypedArray typedArray, XmlPullParser xmlPullParser, String str, int i8, int i9) {
        return !h(xmlPullParser, str) ? i9 : typedArray.getInt(i8, i9);
    }

    public static boolean h(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    public static TypedArray i(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
