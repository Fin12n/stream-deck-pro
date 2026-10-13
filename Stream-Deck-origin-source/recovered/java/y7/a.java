package y7;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f38456a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f38457b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public d f38458c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public long f38459d;

    public a(String name, boolean z8) {
        t.g(name, "name");
        this.f38456a = name;
        this.f38457b = z8;
        this.f38459d = -1L;
    }

    public final boolean a() {
        return this.f38457b;
    }

    public final String b() {
        return this.f38456a;
    }

    public final long c() {
        return this.f38459d;
    }

    public final d d() {
        return this.f38458c;
    }

    public final void e(d queue) {
        t.g(queue, "queue");
        d dVar = this.f38458c;
        if (dVar == queue) {
            return;
        }
        if (dVar != null) {
            throw new IllegalStateException("task is in multiple queues");
        }
        this.f38458c = queue;
    }

    public abstract long f();

    public final void g(long j8) {
        this.f38459d = j8;
    }

    public String toString() {
        return this.f38456a;
    }

    public /* synthetic */ a(String str, boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? true : z8);
    }
}
