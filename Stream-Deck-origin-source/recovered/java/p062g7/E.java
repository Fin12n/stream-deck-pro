package p062g7;

import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class E {
    public static Object a(Object obj) {
        return obj;
    }

    public static final boolean c(Object obj) {
        return obj == AbstractC2365d.f23837a;
    }

    public static final D b(Object obj) {
        if (obj != AbstractC2365d.f23837a) {
            t.e(obj, "null cannot be cast to non-null type S of kotlinx.coroutines.internal.SegmentOrClosed");
            return (D) obj;
        }
        throw new IllegalStateException(WaYxBuDSBD.YoOM);
    }
}
