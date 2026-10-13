package Y5;

import java.io.Closeable;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final e f12492a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Z5.b f12493b;

    public g(e headers, Z5.b builder) {
        t.g(headers, "headers");
        t.g(builder, "builder");
        this.f12492a = headers;
        this.f12493b = builder;
    }

    public final e b() {
        return this.f12492a;
    }

    public final void c() {
        this.f12493b.o();
        this.f12492a.h();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        c();
    }
}
