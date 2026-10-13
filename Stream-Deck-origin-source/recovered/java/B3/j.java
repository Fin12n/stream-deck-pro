package B3;

import C6.o;
import C6.v;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p215z0.AbstractC3169o;
import p215z0.InterfaceC3163l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class j {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f1189a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f1190b;

        static {
            int[] iArr = new int[KnownHost.Device.KeypadOrientationOption.values().length];
            try {
                iArr[KnownHost.Device.KeypadOrientationOption.FIXED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f1189a = iArr;
            int[] iArr2 = new int[KnownHost.Device.Appearance.values().length];
            try {
                iArr2[KnownHost.Device.Appearance.LIGHT.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[KnownHost.Device.Appearance.DARK.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            f1190b = iArr2;
        }
    }

    public static final V3.h.a a(i.a eventDisconnect, String str, String str2) {
        t.g(eventDisconnect, "$this$eventDisconnect");
        String strB = V3.c.b.DISCONNECT.b();
        if (str2 == null) {
            str2 = "-1";
        }
        o oVarA = v.a("device_id", str2);
        if (str == null) {
            str = "-1";
        }
        return new V3.h.a(strB, new o[]{oVarA, v.a("workstation_id", str)}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.i b(String trackingTitle, String str, String str2) {
        t.g(trackingTitle, "trackingTitle");
        String strB = V3.c.b.VIRTUAL_DEVICE_SETTING_CHANGED.b();
        o oVarA = v.a("selection", trackingTitle);
        if (str == null) {
            str = "-1";
        }
        o oVarA2 = v.a("device_id", str);
        if (str2 == null) {
            str2 = "-1";
        }
        return new V3.i(new V3.h.a(strB, new o[]{oVarA, oVarA2, v.a("workstation_id", str2)}, (V3.a) null, 4, (AbstractC2633k) null));
    }

    public static final int c(KnownHost.Device.KeypadOrientationOption keypadOrientationOption, InterfaceC3163l interfaceC3163l, int i8) {
        int iA;
        t.g(keypadOrientationOption, "<this>");
        interfaceC3163l.f(-2143589059);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-2143589059, i8, -1, "com.elgato.streamdeck.settings.<get-animation> (SettingsViewModel.kt:158)");
        }
        if (a.f1189a[keypadOrientationOption.ordinal()] == 1) {
            interfaceC3163l.f(1306659208);
            iA = I3.f.b((p014b4.c) interfaceC3163l.e(p014b4.b.a()));
            interfaceC3163l.N();
        } else {
            interfaceC3163l.f(1306659270);
            iA = I3.f.a((p014b4.c) interfaceC3163l.e(p014b4.b.a()));
            interfaceC3163l.N();
        }
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        interfaceC3163l.N();
        return iA;
    }

    public static final int d(KnownHost.Device.Appearance appearance) {
        t.g(appearance, "<this>");
        int i8 = a.f1190b[appearance.ordinal()];
        if (i8 != 1) {
            return i8 != 2 ? p194w3.b.f37018f0 : p194w3.b.f37012d0;
        }
        return p194w3.b.f37015e0;
    }

    public static final int e(KnownHost.Device.KeypadOrientationOption keypadOrientationOption) {
        t.g(keypadOrientationOption, "<this>");
        return a.f1189a[keypadOrientationOption.ordinal()] == 1 ? p194w3.b.f37042n0 : p194w3.b.f37039m0;
    }
}
