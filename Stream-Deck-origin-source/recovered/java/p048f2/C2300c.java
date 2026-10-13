package p048f2;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: f2.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2300c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AtomicInteger f21578a;

    public C2300c(int i8) {
        this.f21578a = new AtomicInteger(i8);
    }

    public final int a() {
        return this.f21578a.decrementAndGet();
    }

    public final int b() {
        return this.f21578a.get();
    }

    public final int c() {
        return this.f21578a.getAndIncrement();
    }

    public final int d() {
        return this.f21578a.incrementAndGet();
    }

    public /* synthetic */ C2300c(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 0 : i8);
    }
}
