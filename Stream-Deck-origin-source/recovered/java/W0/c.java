package W0;

import A1.h;
import K1.k;
import R0.AbstractC1582d0;
import R0.AbstractC1584e0;
import R0.AbstractC1602n0;
import R0.C1598l0;
import R0.J0;
import R0.U0;
import R0.V0;
import R0.W0;
import R0.X;
import V0.d;
import V0.o;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Shader;
import android.util.AttributeSet;
import android.util.TypedValue;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import com.elgato.streamdeck.vsd2.KnownHost;
import java.io.IOException;
import java.util.List;
import kotlin.jvm.internal.t;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f10826a = 0;

    public static final d.a a(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet) throws XmlPullParserException {
        long jE;
        int iZ;
        ColorStateList colorStateListE;
        b bVar = b.f10800a;
        TypedArray typedArrayK = aVar.k(resources, theme, attributeSet, bVar.F());
        boolean zD = aVar.d(typedArrayK, "autoMirrored", bVar.a(), false);
        float fG = aVar.g(typedArrayK, "viewportWidth", bVar.H(), 0.0f);
        float fG2 = aVar.g(typedArrayK, "viewportHeight", bVar.G(), 0.0f);
        if (fG <= 0.0f) {
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<VectorGraphic> tag requires viewportWidth > 0");
        }
        if (fG2 <= 0.0f) {
            throw new XmlPullParserException(typedArrayK.getPositionDescription() + "<VectorGraphic> tag requires viewportHeight > 0");
        }
        float fA = aVar.a(typedArrayK, bVar.I(), 0.0f);
        float fA2 = aVar.a(typedArrayK, bVar.n(), 0.0f);
        if (typedArrayK.hasValue(bVar.D())) {
            TypedValue typedValue = new TypedValue();
            typedArrayK.getValue(bVar.D(), typedValue);
            jE = (typedValue.type == 2 || (colorStateListE = aVar.e(typedArrayK, theme, "tint", bVar.D())) == null) ? C1598l0.f9405b.e() : AbstractC1602n0.b(colorStateListE.getDefaultColor());
        } else {
            jE = C1598l0.f9405b.e();
        }
        long j8 = jE;
        int iC = aVar.c(typedArrayK, bVar.E(), -1);
        if (iC == -1) {
            iZ = X.f9354a.z();
        } else if (iC == 3) {
            iZ = X.f9354a.B();
        } else if (iC == 5) {
            iZ = X.f9354a.z();
        } else if (iC != 9) {
            switch (iC) {
                case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
                    iZ = X.f9354a.q();
                    break;
                case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
                    iZ = X.f9354a.v();
                    break;
                case 16:
                    iZ = X.f9354a.t();
                    break;
                default:
                    iZ = X.f9354a.z();
                    break;
            }
        } else {
            iZ = X.f9354a.y();
        }
        int i8 = iZ;
        float fM = h.m(fA / resources.getDisplayMetrics().density);
        float fM2 = h.m(fA2 / resources.getDisplayMetrics().density);
        typedArrayK.recycle();
        return new d.a(null, fM, fM2, fG, fG2, j8, i8, zD, 1, null);
    }

    public static final int b(int i8, int i9) {
        if (i8 == 0) {
            return V0.f9341a.a();
        }
        if (i8 != 1) {
            return i8 != 2 ? i9 : V0.f9341a.c();
        }
        return V0.f9341a.b();
    }

    public static final int c(int i8, int i9) {
        if (i8 == 0) {
            return W0.f9346a.b();
        }
        if (i8 != 1) {
            return i8 != 2 ? i9 : W0.f9346a.a();
        }
        return W0.f9346a.c();
    }

    public static final boolean d(XmlPullParser xmlPullParser) {
        return xmlPullParser.getEventType() == 1 || (xmlPullParser.getDepth() < 1 && xmlPullParser.getEventType() == 3);
    }

    public static final AbstractC1582d0 e(K1.d dVar) {
        if (!dVar.i()) {
            return null;
        }
        Shader shaderF = dVar.f();
        return shaderF != null ? AbstractC1584e0.a(shaderF) : new U0(AbstractC1602n0.b(dVar.e()), null);
    }

    public static final void f(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar2) {
        b bVar = b.f10800a;
        TypedArray typedArrayK = aVar.k(resources, theme, attributeSet, bVar.b());
        String strI = aVar.i(typedArrayK, bVar.c());
        if (strI == null) {
            strI = "";
        }
        List listA = o.a(aVar.i(typedArrayK, bVar.d()));
        typedArrayK.recycle();
        d.a.b(aVar2, strI, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, listA, 254, null);
    }

    public static final int g(a aVar, Resources resources, AttributeSet attributeSet, Resources.Theme theme, d.a aVar2, int i8) throws XmlPullParserException {
        int eventType = aVar.j().getEventType();
        if (eventType != 2) {
            if (eventType != 3 || !t.c("group", aVar.j().getName())) {
                return i8;
            }
            int i9 = i8 + 1;
            for (int i10 = 0; i10 < i9; i10++) {
                aVar2.g();
            }
            return 0;
        }
        String name = aVar.j().getName();
        if (name == null) {
            return i8;
        }
        int iHashCode = name.hashCode();
        if (iHashCode == -1649314686) {
            if (!name.equals("clip-path")) {
                return i8;
            }
            f(aVar, resources, theme, attributeSet, aVar2);
            return i8 + 1;
        }
        if (iHashCode == 3433509) {
            if (!name.equals("path")) {
                return i8;
            }
            i(aVar, resources, theme, attributeSet, aVar2);
            return i8;
        }
        if (iHashCode != 98629247 || !name.equals("group")) {
            return i8;
        }
        h(aVar, resources, theme, attributeSet, aVar2);
        return i8;
    }

    public static final void h(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar2) {
        b bVar = b.f10800a;
        TypedArray typedArrayK = aVar.k(resources, theme, attributeSet, bVar.e());
        float fG = aVar.g(typedArrayK, "rotation", bVar.i(), 0.0f);
        float fB = aVar.b(typedArrayK, bVar.g(), 0.0f);
        float fB2 = aVar.b(typedArrayK, bVar.h(), 0.0f);
        float fG2 = aVar.g(typedArrayK, "scaleX", bVar.j(), 1.0f);
        float fG3 = aVar.g(typedArrayK, "scaleY", bVar.k(), 1.0f);
        float fG4 = aVar.g(typedArrayK, "translateX", bVar.l(), 0.0f);
        float fG5 = aVar.g(typedArrayK, "translateY", bVar.m(), 0.0f);
        String strI = aVar.i(typedArrayK, bVar.f());
        if (strI == null) {
            strI = "";
        }
        typedArrayK.recycle();
        aVar2.a(strI, fG, fB, fB2, fG2, fG3, fG4, fG5, o.e());
    }

    public static final XmlPullParser j(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        int next = xmlPullParser.next();
        while (next != 2 && next != 1) {
            next = xmlPullParser.next();
        }
        if (next == 2) {
            return xmlPullParser;
        }
        throw new XmlPullParserException("No start tag found");
    }

    public static final void i(a aVar, Resources resources, Resources.Theme theme, AttributeSet attributeSet, d.a aVar2) {
        b bVar = b.f10800a;
        TypedArray typedArrayK = aVar.k(resources, theme, attributeSet, bVar.o());
        if (!k.h(aVar.j(), yOZfxp.RlCVjanewzPJ)) {
            throw new IllegalArgumentException("No path data available");
        }
        String strI = aVar.i(typedArrayK, bVar.r());
        if (strI == null) {
            strI = "";
        }
        String str = strI;
        List listA = o.a(aVar.i(typedArrayK, bVar.s()));
        K1.d dVarF = aVar.f(typedArrayK, theme, "fillColor", bVar.q(), 0);
        float fG = aVar.g(typedArrayK, "fillAlpha", bVar.p(), 1.0f);
        int iB = b(aVar.h(typedArrayK, "strokeLineCap", bVar.v(), -1), V0.f9341a.a());
        int iC = c(aVar.h(typedArrayK, "strokeLineJoin", bVar.w(), -1), W0.f9346a.a());
        float fG2 = aVar.g(typedArrayK, "strokeMiterLimit", bVar.x(), 1.0f);
        K1.d dVarF2 = aVar.f(typedArrayK, theme, "strokeColor", bVar.u(), 0);
        float fG3 = aVar.g(typedArrayK, "strokeAlpha", bVar.t(), 1.0f);
        float fG4 = aVar.g(typedArrayK, "strokeWidth", bVar.y(), 1.0f);
        float fG5 = aVar.g(typedArrayK, "trimPathEnd", bVar.z(), 1.0f);
        float fG6 = aVar.g(typedArrayK, "trimPathOffset", bVar.B(), 0.0f);
        float fG7 = aVar.g(typedArrayK, "trimPathStart", bVar.C(), 0.0f);
        int iH = aVar.h(typedArrayK, "fillType", bVar.A(), f10826a);
        typedArrayK.recycle();
        aVar2.c(listA, iH == 0 ? J0.f9308a.b() : J0.f9308a.a(), str, e(dVarF), fG, e(dVarF2), fG3, fG4, iB, iC, fG2, fG7, fG5, fG6);
    }
}
