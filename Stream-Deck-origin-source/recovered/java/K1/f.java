package K1;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.LinearGradient;
import android.graphics.RadialGradient;
import android.graphics.Shader;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static a a(a aVar, int i8, int i9, boolean z8, int i10) {
        if (aVar != null) {
            return aVar;
        }
        return z8 ? new a(i8, i10, i9) : new a(i8, i9);
    }

    public static Shader b(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException {
        String name = xmlPullParser.getName();
        if (!name.equals("gradient")) {
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid gradient color tag " + name);
        }
        TypedArray typedArrayI = k.i(resources, theme, attributeSet, G1.f.f2663A);
        float f8 = k.f(typedArrayI, xmlPullParser, "startX", G1.f.f2672J, 0.0f);
        float f9 = k.f(typedArrayI, xmlPullParser, "startY", G1.f.f2673K, 0.0f);
        float f10 = k.f(typedArrayI, xmlPullParser, "endX", G1.f.f2674L, 0.0f);
        float f11 = k.f(typedArrayI, xmlPullParser, "endY", G1.f.f2675M, 0.0f);
        float f12 = k.f(typedArrayI, xmlPullParser, "centerX", G1.f.f2667E, 0.0f);
        float f13 = k.f(typedArrayI, xmlPullParser, "centerY", G1.f.f2668F, 0.0f);
        int iG = k.g(typedArrayI, xmlPullParser, "type", G1.f.f2666D, 0);
        int iB = k.b(typedArrayI, xmlPullParser, "startColor", G1.f.f2664B, 0);
        boolean zH = k.h(xmlPullParser, "centerColor");
        int iB2 = k.b(typedArrayI, xmlPullParser, "centerColor", G1.f.f2671I, 0);
        int iB3 = k.b(typedArrayI, xmlPullParser, "endColor", G1.f.f2665C, 0);
        int iG2 = k.g(typedArrayI, xmlPullParser, "tileMode", G1.f.f2670H, 0);
        float f14 = k.f(typedArrayI, xmlPullParser, "gradientRadius", G1.f.f2669G, 0.0f);
        typedArrayI.recycle();
        a aVarA = a(c(resources, xmlPullParser, attributeSet, theme), iB, iB3, zH, iB2);
        if (iG != 1) {
            return iG != 2 ? new LinearGradient(f8, f9, f10, f11, aVarA.f4525a, aVarA.f4526b, d(iG2)) : new SweepGradient(f12, f13, aVarA.f4525a, aVarA.f4526b);
        }
        if (f14 > 0.0f) {
            return new RadialGradient(f12, f13, f14, aVarA.f4525a, aVarA.f4526b, d(iG2));
        }
        throw new XmlPullParserException("<gradient> tag requires 'gradientRadius' attribute with radial type");
    }

    public static a c(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) throws XmlPullParserException, IOException {
        int depth;
        int depth2 = xmlPullParser.getDepth() + 1;
        ArrayList arrayList = new ArrayList(20);
        ArrayList arrayList2 = new ArrayList(20);
        while (true) {
            int next = xmlPullParser.next();
            if (next == 1 || ((depth = xmlPullParser.getDepth()) < depth2 && next == 3)) {
                break;
            }
            if (next == 2 && depth <= depth2 && xmlPullParser.getName().equals("item")) {
                TypedArray typedArrayI = k.i(resources, theme, attributeSet, G1.f.f2676N);
                boolean zHasValue = typedArrayI.hasValue(G1.f.f2677O);
                boolean zHasValue2 = typedArrayI.hasValue(G1.f.f2678P);
                if (!zHasValue || !zHasValue2) {
                    throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'color' attribute and a 'offset' attribute!");
                }
                int color = typedArrayI.getColor(G1.f.f2677O, 0);
                float f8 = typedArrayI.getFloat(G1.f.f2678P, 0.0f);
                typedArrayI.recycle();
                arrayList2.add(Integer.valueOf(color));
                arrayList.add(Float.valueOf(f8));
            }
        }
        if (arrayList2.size() > 0) {
            return new a(arrayList2, arrayList);
        }
        return null;
    }

    public static Shader.TileMode d(int i8) {
        if (i8 != 1) {
            return i8 != 2 ? Shader.TileMode.CLAMP : Shader.TileMode.MIRROR;
        }
        return Shader.TileMode.REPEAT;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f4525a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float[] f4526b;

        public a(List list, List list2) {
            int size = list.size();
            this.f4525a = new int[size];
            this.f4526b = new float[size];
            for (int i8 = 0; i8 < size; i8++) {
                this.f4525a[i8] = ((Integer) list.get(i8)).intValue();
                this.f4526b[i8] = ((Float) list2.get(i8)).floatValue();
            }
        }

        public a(int i8, int i9) {
            this.f4525a = new int[]{i8, i9};
            this.f4526b = new float[]{0.0f, 1.0f};
        }

        public a(int i8, int i9, int i10) {
            this.f4525a = new int[]{i8, i9, i10};
            this.f4526b = new float[]{0.0f, 0.5f, 1.0f};
        }
    }
}
