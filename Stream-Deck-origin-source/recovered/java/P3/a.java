package P3;

import Z6.w;
import com.elgato.streamdeck.vsd2.AppMetrics;
import com.elgato.streamdeck.vsd2.AppSettings;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class a {
    public static final AppMetrics.Builder a(AppMetrics.Builder builder, long j8) {
        t.g(builder, "<this>");
        AppMetrics.Builder connectionDurationSeconds = builder.setConnectionDurationSeconds(builder.getConnectionDurationSeconds() + j8);
        t.f(connectionDurationSeconds, "setConnectionDurationSeconds(...)");
        return connectionDurationSeconds;
    }

    public static final String b(AppSettings appSettings) {
        t.g(appSettings, "<this>");
        String lastOpenedDeviceRawID = appSettings.getLastOpenedDeviceRawID();
        if (lastOpenedDeviceRawID == null || w.b0(lastOpenedDeviceRawID)) {
            lastOpenedDeviceRawID = null;
        }
        if (lastOpenedDeviceRawID != null) {
            return b.b(lastOpenedDeviceRawID);
        }
        return null;
    }
}
