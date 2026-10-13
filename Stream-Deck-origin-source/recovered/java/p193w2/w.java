package p193w2;

import A2.h;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class w implements h.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f36909a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final File f36910b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Callable f36911c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final h.c f36912d;

    public w(String str, File file, Callable<InputStream> callable, h.c mDelegate) {
        t.g(mDelegate, "mDelegate");
        this.f36909a = str;
        this.f36910b = file;
        this.f36911c = callable;
        this.f36912d = mDelegate;
    }

    @Override // A2.h.c
    public h a(h.b configuration) {
        t.g(configuration, "configuration");
        return new v(configuration.f485a, this.f36909a, this.f36910b, this.f36911c, configuration.f487c.f483a, this.f36912d.a(configuration));
    }
}
