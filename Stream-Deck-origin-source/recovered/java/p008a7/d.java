package p008a7;

import J6.a;
import J6.b;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum d {
    NANOSECONDS(TimeUnit.NANOSECONDS),
    MICROSECONDS(TimeUnit.MICROSECONDS),
    MILLISECONDS(TimeUnit.MILLISECONDS),
    SECONDS(TimeUnit.SECONDS),
    MINUTES(TimeUnit.MINUTES),
    HOURS(TimeUnit.HOURS),
    DAYS(TimeUnit.DAYS);


    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ a f13461j = b.a(a());

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TimeUnit f13462a;

    d(TimeUnit timeUnit) {
        this.f13462a = timeUnit;
    }

    public final TimeUnit b() {
        return this.f13462a;
    }
}
