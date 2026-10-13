package P3;

import Z6.w;
import com.elgato.streamdeck.vsd2.Endpoint;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.streamdeck.vsd2.StaticHost;
import com.elgato.vsd2.Messages;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import java.util.Date;
import kotlin.jvm.internal.t;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {
    public static final Endpoint a(String host, int i8, Endpoint.Source source) {
        t.g(host, "host");
        t.g(source, "source");
        GeneratedMessageLite generatedMessageLiteBuild = Endpoint.newBuilder().setHost(host).setPort(i8).setSource(source).build();
        t.f(generatedMessageLiteBuild, "build(...)");
        return (Endpoint) generatedMessageLiteBuild;
    }

    public static final Messages.Size b(int i8, int i9) {
        GeneratedMessageLite generatedMessageLiteBuild = Messages.Size.newBuilder().g(i8).f(i9).build();
        t.f(generatedMessageLiteBuild, "build(...)");
        return (Messages.Size) generatedMessageLiteBuild;
    }

    public static final Timestamp c(long j8) {
        GeneratedMessageLite generatedMessageLiteBuild = Timestamp.newBuilder().g(j8 / 1000).f((int) ((j8 % 1000) * 1000000)).build();
        t.f(generatedMessageLiteBuild, "build(...)");
        return (Timestamp) generatedMessageLiteBuild;
    }

    public static final Timestamp d() {
        return c(new Date().getTime());
    }

    public static final String e(KnownHost.Device device) {
        t.g(device, "<this>");
        String rawID = device.getRawID();
        t.f(rawID, "getRawID(...)");
        return b.b(rawID);
    }

    public static final String g(StaticHost staticHost) {
        t.g(staticHost, "<this>");
        String rawID = staticHost.getRawID();
        t.f(rawID, "getRawID(...)");
        return i.b(rawID);
    }

    public static final String h(KnownHost.Device device) {
        t.g(device, "<this>");
        String rawID = device.getRawID();
        t.d(rawID);
        if (w.b0(rawID)) {
            rawID = null;
        }
        if (rawID != null) {
            return b.b(rawID);
        }
        return null;
    }

    public static final String i(KnownHost knownHost) {
        t.g(knownHost, "<this>");
        String rawID = knownHost.getRawID();
        t.d(rawID);
        if (w.b0(rawID)) {
            rawID = null;
        }
        if (rawID != null) {
            return i.b(rawID);
        }
        return null;
    }

    public static final String j(KnownHost.Device device) {
        t.g(device, "<this>");
        String rawWorkstationID = device.getRawWorkstationID();
        t.d(rawWorkstationID);
        if (w.b0(rawWorkstationID)) {
            rawWorkstationID = null;
        }
        if (rawWorkstationID != null) {
            return i.b(rawWorkstationID);
        }
        return null;
    }

    public static final String k(KnownHost.Device device) {
        t.g(device, "<this>");
        String rawWorkstationID = device.getRawWorkstationID();
        t.f(rawWorkstationID, "getRawWorkstationID(...)");
        return i.b(rawWorkstationID);
    }

    public static final boolean l(KnownHost.Device device) {
        t.g(device, "<this>");
        String rawID = device.getRawID();
        return rawID == null || w.b0(rawID);
    }

    public static final Messages.KeypadConfig m(KnownHost.Device device) {
        t.g(device, "<this>");
        GeneratedMessageLite generatedMessageLiteBuild = Messages.KeypadConfig.newBuilder().h(true).l(false).g(true).f(Messages.c.LZFSE).f(Messages.c.LZF).f(Messages.c.LZ4).i(b(device.getIconWidth(), device.getIconHeight())).k(b(device.getKeypadColumns(), device.getKeypadRows())).build();
        t.f(generatedMessageLiteBuild, "build(...)");
        return (Messages.KeypadConfig) generatedMessageLiteBuild;
    }

    public static final Messages.UpdateKeypadConfig n(KnownHost.Device device) {
        t.g(device, "<this>");
        GeneratedMessageLite generatedMessageLiteBuild = Messages.UpdateKeypadConfig.newBuilder().f(true).h(b(device.getKeypadColumns(), device.getKeypadRows())).g(b(device.getIconWidth(), device.getIconHeight())).build();
        t.f(generatedMessageLiteBuild, "build(...)");
        return (Messages.UpdateKeypadConfig) generatedMessageLiteBuild;
    }

    public static final KnownHost.Device.Builder o(KnownHost.Device.Builder builder) {
        t.g(builder, "<this>");
        KnownHost.Device.Builder defaultFaceplate = builder.setIconWidth(144).setIconHeight(144).setKeypadColumns(5).setKeypadRows(3).setLastCustomKeypadColumns(8).setLastCustomKeypadRows(8).setIsCustomLayout(false).setKeypadRotation(KnownHost.Device.KeypadOrientationOption.DYNAMIC).setAppearance(KnownHost.Device.Appearance.SYSTEM).setDefaultFaceplate("elgato");
        t.f(defaultFaceplate, "setDefaultFaceplate(...)");
        return defaultFaceplate;
    }

    public static final String f(KnownHost knownHost) {
        t.g(knownHost, "<this>");
        String rawID = knownHost.getRawID();
        t.f(rawID, QhsKALGiniuQ.zwkXW);
        return i.b(rawID);
    }
}
