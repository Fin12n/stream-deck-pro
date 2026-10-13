package G3;

import P2.Lsk.mHPawN;
import com.elgato.streamdeck.vsd2.AppMetrics;
import com.google.protobuf.Timestamp;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d {
    public static final String b(AppMetrics appMetrics) {
        String str;
        Timestamp installedAt = appMetrics.getInstalledAt();
        t.f(installedAt, "getInstalledAt(...)");
        int iA = P3.h.a(installedAt);
        if (appMetrics.hasLastReviewRequest()) {
            Timestamp lastReviewRequest = appMetrics.getLastReviewRequest();
            t.f(lastReviewRequest, "getLastReviewRequest(...)");
            str = "Last review " + P3.h.a(lastReviewRequest) + mHPawN.rTDeX + appMetrics.getLastReviewRequestVersion() + ").";
        } else {
            str = "No review request, yet.";
        }
        return "Installation " + iA + "d ago. " + str + " " + appMetrics.getConnectionDurationSeconds() + "s of Keypad usage.";
    }
}
