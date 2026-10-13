package p101l1;

import C6.G;
import V0.d;
import W0.a;
import W0.c;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.util.Xml;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final b.a a(Resources.Theme theme, Resources resources, XmlResourceParser xmlResourceParser, int i8) throws XmlPullParserException, IOException {
        AttributeSet attributeSetAsAttributeSet = Xml.asAttributeSet(xmlResourceParser);
        a aVar = new a(xmlResourceParser, 0, 2, null);
        d.a aVarA = c.a(aVar, resources, theme, attributeSetAsAttributeSet);
        int iG = 0;
        while (!c.d(xmlResourceParser)) {
            iG = c.g(aVar, resources, attributeSetAsAttributeSet, theme, aVarA, iG);
            xmlResourceParser.next();
        }
        return new b.a(aVarA.f(), i8);
    }

    public static final d b(d.b bVar, int i8, InterfaceC3163l interfaceC3163l, int i9) throws XmlPullParserException, IOException {
        interfaceC3163l.f(44534090);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(44534090, i9, -1, "androidx.compose.ui.res.vectorResource (VectorResources.android.kt:47)");
        }
        Context context = (Context) interfaceC3163l.e(AndroidCompositionLocals_androidKt.g());
        Resources resourcesA = e.a(interfaceC3163l, 0);
        Resources.Theme theme = context.getTheme();
        Object[] objArr = {Integer.valueOf(i8), resourcesA, theme, resourcesA.getConfiguration()};
        interfaceC3163l.f(-568225417);
        boolean zR = false;
        for (int i10 = 0; i10 < 4; i10++) {
            zR |= interfaceC3163l.R(objArr[i10]);
        }
        Object objG = interfaceC3163l.g();
        if (zR || objG == InterfaceC3163l.f38803a.a()) {
            objG = c(bVar, theme, resourcesA, i8);
            interfaceC3163l.H(objG);
        }
        interfaceC3163l.N();
        d dVar = (d) objG;
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return dVar;
    }

    public static final d c(d.b bVar, Resources.Theme theme, Resources resources, int i8) throws XmlPullParserException, IOException {
        TypedValue typedValue = new TypedValue();
        resources.getValue(i8, typedValue, true);
        XmlResourceParser xml = resources.getXml(i8);
        c.j(xml);
        G g8 = G.f1419a;
        return a(theme, resources, xml, typedValue.changingConfigurations).b();
    }
}
