package Z2;

import V.ocy.SVzBK;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final k f12847a;

    public a(k config) {
        t.g(config, "config");
        this.f12847a = config;
    }

    public k a() {
        return this.f12847a;
    }

    public final void b(p severity, String str, Throwable th, String message) {
        t.g(severity, "severity");
        t.g(str, SVzBK.tOdSv);
        t.g(message, "message");
        for (h hVar : a().b()) {
            if (hVar.a(str, severity)) {
                hVar.b(severity, message, str, th);
            }
        }
    }
}
