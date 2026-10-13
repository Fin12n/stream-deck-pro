package Z2;

import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f implements n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public volatile p f12853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public volatile List f12854b;

    public f(List<? extends h> logWriters) {
        t.g(logWriters, "logWriters");
        this.f12853a = b.a();
        this.f12854b = logWriters;
    }

    @Override // Z2.k
    public p a() {
        return this.f12853a;
    }

    @Override // Z2.k
    public List b() {
        return this.f12854b;
    }
}
