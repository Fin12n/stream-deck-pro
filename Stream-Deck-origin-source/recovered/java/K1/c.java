package K1;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final ThreadLocal f4510a = new ThreadLocal();

    public static ColorStateList a(Resources resources, XmlPullParser xmlPullParser, Resources.Theme theme) throws XmlPullParserException, IOException {
        int next;
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlPullParser);
        do {
            next = xmlPullParser.next();
            if (next == 2) {
                break;
            }
        } while (next != 1);
        if (next == 2) {
            return b(resources, xmlPullParser, attributeSetAsAttributeSet, theme);
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static ColorStateList b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (name.equals("selector")) {
            return e(resources, xmlPullParser, attributeSet, theme);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid color state list tag " + name);
    }

    public static TypedValue c() {
        ThreadLocal threadLocal = f4510a;
        TypedValue typedValue = (TypedValue) threadLocal.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        threadLocal.set(typedValue2);
        return typedValue2;
    }

    public static ColorStateList d(Resources resources, int i8, Resources.Theme theme) {
        try {
            return a(resources, resources.getXml(i8), theme);
        } catch (Exception e8) {
            Log.e("CSLCompat", "Failed to inflate ColorStateList.", e8);
            return null;
        }
    }

    public static ColorStateList e(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int color;
        int i8 = 1;
        int depth2 = xmlPullParser.getDepth() + 1;
        int[][] iArr = new int[20][];
        int[] iArrA = new int[20];
        int i9 = 0;
        while (true) {
            int next = xmlPullParser.next();
            if (next == i8 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayH = h(resources, theme, attributeSet, G1.f.f2680b);
                int resourceId = typedArrayH.getResourceId(G1.f.f2681c, -1);
                if (resourceId == -1 || f(resources, resourceId)) {
                    color = typedArrayH.getColor(G1.f.f2681c, -65281);
                } else {
                    try {
                        color = a(resources, resources.getXml(resourceId), theme).getDefaultColor();
                    } catch (Exception unused) {
                        color = typedArrayH.getColor(G1.f.f2681c, -65281);
                    }
                }
                float f8 = 1.0f;
                if (typedArrayH.hasValue(G1.f.f2682d)) {
                    f8 = typedArrayH.getFloat(G1.f.f2682d, 1.0f);
                } else if (typedArrayH.hasValue(G1.f.f2684f)) {
                    f8 = typedArrayH.getFloat(G1.f.f2684f, 1.0f);
                }
                float f9 = (Build.VERSION.SDK_INT < 31 || !typedArrayH.hasValue(G1.f.f2683e)) ? typedArrayH.getFloat(G1.f.f2685g, -1.0f) : typedArrayH.getFloat(G1.f.f2683e, -1.0f);
                typedArrayH.recycle();
                int attributeCount = attributeSet.getAttributeCount();
                int[] iArr2 = new int[attributeCount];
                int i10 = 0;
                for (int i11 = 0; i11 < attributeCount; i11++) {
                    int attributeNameResource = attributeSet.getAttributeNameResource(i11);
                    if (attributeNameResource != 16843173 && attributeNameResource != 16843551 && attributeNameResource != G1.a.f2604a && attributeNameResource != G1.a.f2605b) {
                        int i12 = i10 + 1;
                        if (!attributeSet.getAttributeBooleanValue(i11, false)) {
                            attributeNameResource = -attributeNameResource;
                        }
                        iArr2[i10] = attributeNameResource;
                        i10 = i12;
                    }
                }
                int[] iArrTrimStateSet = StateSet.trimStateSet(iArr2, i10);
                iArrA = g.a(iArrA, i9, g(color, f8, f9));
                iArr = (int[][]) g.b(iArr, i9, iArrTrimStateSet);
                i9++;
            }
            i8 = 1;
        }
        int[] iArr3 = new int[i9];
        int[][] iArr4 = new int[i9][];
        System.arraycopy(iArrA, 0, iArr3, 0, i9);
        System.arraycopy(iArr, 0, iArr4, 0, i9);
        return new ColorStateList(iArr4, iArr3);
    }

    public static boolean f(Resources resources, int i8) {
        TypedValue typedValueC = c();
        resources.getValue(i8, typedValueC, true);
        int i9 = typedValueC.type;
        return i9 >= 28 && i9 <= 31;
    }

    public static int g(int i8, float f8, float f9) {
        boolean z8 = f9 >= 0.0f && f9 <= 100.0f;
        if (f8 == 1.0f && !z8) {
            return i8;
        }
        int iA = O1.a.a((int) ((Color.alpha(i8) * f8) + 0.5f), 0, 255);
        if (z8) {
            a aVarC = a.c(i8);
            i8 = a.m(aVarC.j(), aVarC.i(), f9);
        }
        return (i8 & 16777215) | (iA << 24);
    }

    public static TypedArray h(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        return theme == null ? resources.obtainAttributes(attributeSet, iArr) : theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }
}
