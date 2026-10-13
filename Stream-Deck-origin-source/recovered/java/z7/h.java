package z7;

import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.jvm.internal.t;
import u7.D;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Set f39359a = new LinkedHashSet();

    public final synchronized void a(D route) {
        t.g(route, "route");
        this.f39359a.remove(route);
    }

    public final synchronized void b(D failedRoute) {
        t.g(failedRoute, "failedRoute");
        this.f39359a.add(failedRoute);
    }

    public final synchronized boolean c(D route) {
        t.g(route, "route");
        return this.f39359a.contains(route);
    }
}
