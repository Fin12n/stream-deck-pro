package P3;

import com.google.protobuf.Timestamp;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final int a(Timestamp timestamp) {
        t.g(timestamp, "timestamp");
        return (int) Math.max(0L, (f.d().getSeconds() - timestamp.getSeconds()) / ((long) 86400));
    }
}
