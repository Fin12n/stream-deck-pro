package p122n4;

import android.app.job.JobInfo;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import p032d4.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class f {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public p147q4.a f30583a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f30584b = new HashMap();

        public a a(d dVar, b bVar) {
            this.f30584b.put(dVar, bVar);
            return this;
        }

        public f b() {
            if (this.f30583a == null) {
                throw new NullPointerException("missing required property: clock");
            }
            if (this.f30584b.keySet().size() < d.values().length) {
                throw new IllegalStateException("Not all priorities have been configured");
            }
            Map map = this.f30584b;
            this.f30584b = new HashMap();
            return f.d(this.f30583a, map);
        }

        public a c(p147q4.a aVar) {
            this.f30583a = aVar;
            return this;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static abstract class a {
            public abstract b a();

            public abstract a b(long j8);

            public abstract a c(Set set);

            public abstract a d(long j8);
        }

        public static a a() {
            return new n4.c.b().c(Collections.EMPTY_SET);
        }

        public abstract long b();

        public abstract Set c();

        public abstract long d();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c {
        NETWORK_UNMETERED,
        DEVICE_IDLE,
        f30587c
    }

    public static a b() {
        return new a();
    }

    public static f d(p147q4.a aVar, Map map) {
        return new p122n4.b(aVar, map);
    }

    public static f f(p147q4.a aVar) {
        return b().a(d.DEFAULT, b.a().b(30000L).d(86400000L).a()).a(d.HIGHEST, b.a().b(1000L).d(86400000L).a()).a(d.VERY_LOW, b.a().b(86400000L).d(86400000L).c(i(c.DEVICE_IDLE)).a()).c(aVar).b();
    }

    public static Set i(Object... objArr) {
        return Collections.unmodifiableSet(new HashSet(Arrays.asList(objArr)));
    }

    public final long a(int i8, long j8) {
        int i9 = i8 - 1;
        return (long) (Math.pow(3.0d, i9) * j8 * Math.max(1.0d, Math.log(10000.0d) / Math.log((j8 > 1 ? j8 : 2L) * ((long) i9))));
    }

    public JobInfo.Builder c(JobInfo.Builder builder, d dVar, long j8, int i8) {
        builder.setMinimumLatency(g(dVar, j8, i8));
        j(builder, ((b) h().get(dVar)).c());
        return builder;
    }

    public abstract p147q4.a e();

    public long g(d dVar, long j8, int i8) {
        long jA = j8 - e().a();
        b bVar = (b) h().get(dVar);
        return Math.min(Math.max(a(i8, bVar.b()), jA), bVar.d());
    }

    public abstract Map h();

    public final void j(JobInfo.Builder builder, Set set) {
        if (set.contains(c.NETWORK_UNMETERED)) {
            builder.setRequiredNetworkType(2);
        } else {
            builder.setRequiredNetworkType(1);
        }
        if (set.contains(c.f30587c)) {
            builder.setRequiresCharging(true);
        }
        if (set.contains(c.DEVICE_IDLE)) {
            builder.setRequiresDeviceIdle(true);
        }
    }
}
