package p101l1;

import R0.InterfaceC1621x0;
import U0.b;
import V0.d;
import V0.q;
import Z6.w;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.TypedValue;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import kotlin.jvm.internal.t;
import org.xmlpull.v1.XmlPullParserException;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final InterfaceC1621x0 b(CharSequence charSequence, Resources resources, int i8) {
        try {
            return a.a(InterfaceC1621x0.f9447a, resources, i8);
        } catch (Exception e8) {
            throw new d("Error attempting to load resource: " + ((Object) charSequence), e8);
        }
    }

    public static final d c(Resources.Theme theme, Resources resources, int i8, int i9, InterfaceC3163l interfaceC3163l, int i10) throws XmlPullParserException, IOException {
        interfaceC3163l.f(21855625);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(21855625, i10, -1, "androidx.compose.ui.res.loadVectorResource (PainterResources.android.kt:86)");
        }
        b bVar = (b) interfaceC3163l.e(AndroidCompositionLocals_androidKt.h());
        b.C0634b c0634b = new b.C0634b(theme, i8);
        b.a aVarB = bVar.b(c0634b);
        if (aVarB == null) {
            XmlResourceParser xml = resources.getXml(i8);
            if (!t.c(W0.c.j(xml).getName(), "vector")) {
                throw new IllegalArgumentException("Only VectorDrawables and rasterized asset types are supported ex. PNG, JPG, WEBP");
            }
            aVarB = g.a(theme, resources, xml, i9);
            bVar.d(c0634b, aVarB);
        }
        d dVarB = aVarB.b();
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return dVarB;
    }

    public static final b d(int i8, InterfaceC3163l interfaceC3163l, int i9) {
        b bVarG;
        interfaceC3163l.f(473971343);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(473971343, i9, -1, "androidx.compose.ui.res.painterResource (PainterResources.android.kt:56)");
        }
        Context context = (Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g());
        Resources resourcesA = e.a(interfaceC3163l, 0);
        interfaceC3163l.f(-492369756);
        Object objG = interfaceC3163l.g();
        InterfaceC3163l.a aVar = InterfaceC3163l.f38803a;
        if (objG == aVar.a()) {
            objG = new TypedValue();
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        TypedValue typedValue = (TypedValue) objG;
        resourcesA.getValue(i8, typedValue, true);
        CharSequence charSequence = typedValue.string;
        if (charSequence == null || !w.Q(charSequence, ".xml", false, 2, null)) {
            interfaceC3163l.f(-738265172);
            Object objValueOf = Integer.valueOf(i8);
            Object theme = context.getTheme();
            interfaceC3163l.f(1618982084);
            boolean zR = interfaceC3163l.R(objValueOf) | interfaceC3163l.R(charSequence) | interfaceC3163l.R(theme);
            Object objG2 = interfaceC3163l.g();
            if (zR || objG2 == aVar.a()) {
                objG2 = b(charSequence, resourcesA, i8);
                interfaceC3163l.H(objG2);
            }
            interfaceC3163l.N();
            BitmapPainter bitmapPainter = new BitmapPainter((InterfaceC1621x0) objG2, 0L, 0L, 6, null);
            interfaceC3163l.N();
            bVarG = bitmapPainter;
        } else {
            interfaceC3163l.f(-738265327);
            bVarG = q.g(c(context.getTheme(), resourcesA, i8, typedValue.changingConfigurations, interfaceC3163l, ((i9 << 6) & 896) | 72), interfaceC3163l, 0);
            interfaceC3163l.N();
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return bVarG;
    }
}
