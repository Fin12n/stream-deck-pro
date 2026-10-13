package C3;

import com.elgato.streamdeck.vsd2.KnownHost;
import java.util.Locale;
import kotlin.jvm.internal.t;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {
    public static final String a(b bVar, boolean z8, InterfaceC3163l interfaceC3163l, int i8) {
        String strD;
        interfaceC3163l.f(1122856509);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(1122856509, i8, -1, "com.elgato.streamdeck.settings.faceplate.a11yLabel (Faceplate.kt:143)");
        }
        interfaceC3163l.f(826289263);
        if (bVar == null) {
            strD = null;
        } else {
            strD = d(bVar);
            interfaceC3163l.f(826289269);
            if (strD == null) {
                strD = p101l1.f.b(p194w3.b.f37038m, interfaceC3163l, 0);
            }
            interfaceC3163l.N();
        }
        interfaceC3163l.N();
        interfaceC3163l.f(826289248);
        if (strD == null) {
            strD = p101l1.f.b(p194w3.b.f36998Y, interfaceC3163l, 0);
        }
        interfaceC3163l.N();
        if (z8) {
            strD = strD + ", " + p101l1.f.b(p194w3.b.f37011d, interfaceC3163l, 0);
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return strD;
    }

    public static final String b(KnownHost.Device device, boolean z8) {
        String defaultFaceplate;
        t.g(device, "<this>");
        if (device.hasCustomFaceplate()) {
            defaultFaceplate = device.getCustomFaceplate();
        } else {
            defaultFaceplate = device.hasDefaultFaceplate() ? device.getDefaultFaceplate() : null;
        }
        String str = z8 ? defaultFaceplate : null;
        return str == null ? new b.h().b() : str;
    }

    public static final String c(KnownHost.Device device, boolean z8) {
        t.g(device, "<this>");
        if (!z8) {
            return d(new b.h());
        }
        if (!device.hasDefaultFaceplate()) {
            return null;
        }
        b.d dVar = b.f1260f;
        String defaultFaceplate = device.getDefaultFaceplate();
        t.f(defaultFaceplate, "getDefaultFaceplate(...)");
        return d(dVar.a(defaultFaceplate));
    }

    public static final String d(b bVar) {
        t.g(bVar, "<this>");
        if (bVar instanceof b.e) {
            return null;
        }
        String strB = bVar.b();
        if (strB.length() <= 0) {
            return strB;
        }
        StringBuilder sb = new StringBuilder();
        String strValueOf = String.valueOf(strB.charAt(0));
        t.e(strValueOf, "null cannot be cast to non-null type java.lang.String");
        String upperCase = strValueOf.toUpperCase(Locale.ROOT);
        t.f(upperCase, "toUpperCase(...)");
        sb.append((Object) upperCase);
        String strSubstring = strB.substring(1);
        t.f(strSubstring, "substring(...)");
        sb.append(strSubstring);
        return sb.toString();
    }
}
