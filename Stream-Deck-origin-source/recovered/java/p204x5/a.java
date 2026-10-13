package p204x5;

import android.os.SystemClock;
import java.util.LinkedList;
import java.util.concurrent.TimeUnit;
import p219z4.AbstractC3207p;
import p219z4.C3200i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C3200i f37401c = new C3200i("StreamingFormatChecker", "");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final LinkedList f37402a = new LinkedList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f37403b = -1;

    public void a(p196w5.a aVar) {
        if (aVar.e() != -1) {
            return;
        }
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        this.f37402a.add(Long.valueOf(jElapsedRealtime));
        if (this.f37402a.size() > 5) {
            this.f37402a.removeFirst();
        }
        if (this.f37402a.size() != 5 || jElapsedRealtime - ((Long) AbstractC3207p.k((Long) this.f37402a.peekFirst())).longValue() >= 5000) {
            return;
        }
        long j8 = this.f37403b;
        if (j8 == -1 || jElapsedRealtime - j8 >= TimeUnit.SECONDS.toMillis(5L)) {
            this.f37403b = jElapsedRealtime;
            f37401c.f("StreamingFormatChecker", "ML Kit has detected that you seem to pass camera frames to the detector as a Bitmap object. This is inefficient. Please use YUV_420_888 format for camera2 API or NV21 format for (legacy) camera API and directly pass down the byte array to ML Kit.");
        }
    }
}
