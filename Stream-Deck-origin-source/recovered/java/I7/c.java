package I7;

import J7.C;
import J7.C1034e;
import J7.n;
import java.io.Closeable;
import java.io.IOException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements Closeable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f3799a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1034e f3800b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Inflater f3801c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final n f3802d;

    public c(boolean z8) {
        this.f3799a = z8;
        C1034e c1034e = new C1034e();
        this.f3800b = c1034e;
        Inflater inflater = new Inflater(true);
        this.f3801c = inflater;
        this.f3802d = new n((C) c1034e, inflater);
    }

    public final void b(C1034e buffer) throws IOException {
        t.g(buffer, "buffer");
        if (this.f3800b.size() != 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (this.f3799a) {
            this.f3801c.reset();
        }
        this.f3800b.M(buffer);
        this.f3800b.writeInt(65535);
        long bytesRead = this.f3801c.getBytesRead() + this.f3800b.size();
        do {
            this.f3802d.b(buffer, Long.MAX_VALUE);
        } while (this.f3801c.getBytesRead() < bytesRead);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f3802d.close();
    }
}
