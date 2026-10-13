package p166t;

import A.AbstractC0890p0;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Executor f33762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f33763b;

    public i2(Executor executor) {
        t.g(executor, "executor");
        this.f33762a = executor;
        this.f33763b = new AtomicInteger(0);
    }

    public final int a() {
        return this.f33763b.get();
    }

    public final void b() {
        this.f33763b.set(0);
        AbstractC0890p0.a("VideoUsageControl", "resetDirectly: mVideoUsage reset!");
    }
}
