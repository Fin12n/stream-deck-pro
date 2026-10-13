package O4;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: renamed from: O4.k5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C1449k5 implements Closeable {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final Map f8292h = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8293a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f8294b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public double f8295c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f8296d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public long f8297e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public long f8298f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public long f8299g;

    public C1449k5(String str) {
        this.f8298f = 2147483647L;
        this.f8299g = -2147483648L;
        this.f8293a = str;
    }

    public static C1449k5 t(String str) {
        K5.a();
        if (!K5.b()) {
            return C1435i5.f8261i;
        }
        Map map = f8292h;
        if (map.get("detectorTaskWithResource#run") == null) {
            map.put("detectorTaskWithResource#run", new C1449k5("detectorTaskWithResource#run"));
        }
        return (C1449k5) map.get("detectorTaskWithResource#run");
    }

    public final void b() {
        this.f8294b = 0;
        this.f8295c = 0.0d;
        this.f8296d = 0L;
        this.f8298f = 2147483647L;
        this.f8299g = -2147483648L;
    }

    public C1449k5 c() {
        this.f8296d = SystemClock.elapsedRealtimeNanos() / 1000;
        return this;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        long j8 = this.f8296d;
        if (j8 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        o(j8);
    }

    public void j(long j8) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j9 = this.f8297e;
        if (j9 != 0 && jElapsedRealtimeNanos - j9 >= 1000000) {
            b();
        }
        this.f8297e = jElapsedRealtimeNanos;
        this.f8294b++;
        this.f8295c += j8;
        this.f8298f = Math.min(this.f8298f, j8);
        this.f8299g = Math.max(this.f8299g, j8);
        if (this.f8294b % 50 == 0) {
            String.format(Locale.US, "[%s] cur=%dus, counts=%d, min=%dus, max=%dus, avg=%dus", this.f8293a, Long.valueOf(j8), Integer.valueOf(this.f8294b), Long.valueOf(this.f8298f), Long.valueOf(this.f8299g), Integer.valueOf((int) (this.f8295c / ((double) this.f8294b))));
            K5.a();
        }
        if (this.f8294b % 500 == 0) {
            b();
        }
    }

    public void o(long j8) {
        j((SystemClock.elapsedRealtimeNanos() / 1000) - j8);
    }
}
