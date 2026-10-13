package p218z3;

import Z6.w;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Locale;
import kotlin.jvm.internal.t;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    /* JADX WARN: Code duplicated, block: B:10:0x0031  */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    public static /* synthetic */ KnownHost.Device b(String str, String str2, String str3, String str4, int i8, int i9, KnownHost.Device.KeypadOrientationOption keypadOrientationOption, KnownHost.Device.Appearance appearance, String str5, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = null;
        }
        if ((i10 & 2) != 0) {
            if (str != null) {
                String lowerCase = w.W0(str).toString().toLowerCase(Locale.ROOT);
                t.f(lowerCase, "toLowerCase(...)");
                str2 = "some-device-" + lowerCase;
                if (str2 == null) {
                    str2 = "some-device";
                }
            } else {
                str2 = "some-device";
            }
        }
        if ((i10 & 4) != 0) {
            str3 = "test456";
        }
        if ((i10 & 8) != 0) {
            if (str != null) {
                str4 = "Stream Deck Mobile (" + str + ")";
                if (str4 == null) {
                    str4 = "Stream Deck Mobile";
                }
            } else {
                str4 = "Stream Deck Mobile";
            }
        }
        if ((i10 & 16) != 0) {
            i8 = 3;
        }
        if ((i10 & 32) != 0) {
            i9 = 5;
        }
        if ((i10 & 64) != 0) {
            keypadOrientationOption = KnownHost.Device.KeypadOrientationOption.DYNAMIC;
        }
        if ((i10 & 128) != 0) {
            appearance = KnownHost.Device.Appearance.SYSTEM;
        }
        if ((i10 & 256) != 0) {
            str5 = "Le Faceplàte";
        }
        String str6 = str5;
        KnownHost.Device.Appearance appearance2 = appearance;
        KnownHost.Device.KeypadOrientationOption keypadOrientationOption2 = keypadOrientationOption;
        int i11 = i9;
        int i12 = i8;
        String str7 = str4;
        return a(str, str2, str3, str7, i12, i11, keypadOrientationOption2, appearance2, str6);
    }

    public static final KnownHost.Device a(String str, String id, String workstationId, String str2, int i8, int i9, KnownHost.Device.KeypadOrientationOption orientation, KnownHost.Device.Appearance appearance, String customFaceplateName) {
        t.g(id, "id");
        t.g(workstationId, "workstationId");
        t.g(str2, jULK.fFWkERuFyvu);
        t.g(orientation, "orientation");
        t.g(appearance, "appearance");
        t.g(customFaceplateName, "customFaceplateName");
        GeneratedMessageLite generatedMessageLiteBuild = KnownHost.Device.newBuilder().setRawID(id).setDisplayName(str2).setRawWorkstationID(workstationId).setKeypadColumns(i9).setKeypadRows(i8).setKeypadRotation(orientation).setAppearance(appearance).setCustomFaceplate(customFaceplateName).build();
        t.f(generatedMessageLiteBuild, "build(...)");
        return (KnownHost.Device) generatedMessageLiteBuild;
    }
}
