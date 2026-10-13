package N3;

import C6.v;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class n {
    public static final V3.i a(m.a eventSuccessfulScan, String workstationID) {
        t.g(eventSuccessfulScan, "$this$eventSuccessfulScan");
        t.g(workstationID, "workstationID");
        return new V3.i(new V3.h.a(V3.c.b.QR_SCAN_SUCCESS.b(), new C6.o[]{v.a("workstation_id", workstationID)}, (V3.a) null, 4, (AbstractC2633k) null));
    }
}
