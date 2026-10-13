package io.sentry.cache;

import io.sentry.InterfaceC2524m0;
import io.sentry.J2;
import io.sentry.Q;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h implements Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f27023a;

    public h(J2 j8) {
        this.f27023a = j8;
    }

    public static Object i(J2 j8, String str, Class cls) {
        return j(j8, str, cls, null);
    }

    public static Object j(J2 j8, String str, Class cls, InterfaceC2524m0 interfaceC2524m0) {
        return d.c(j8, ".options-cache", str, cls, interfaceC2524m0);
    }

    public final void a(String str) {
        d.a(this.f27023a, ".options-cache", str);
    }

    @Override // io.sentry.Q
    public void b(Map map) {
        k(map, "tags.json");
    }

    @Override // io.sentry.Q
    public void c(io.sentry.protocol.o oVar) {
        if (oVar == null) {
            a("sdk-version.json");
        } else {
            k(oVar, "sdk-version.json");
        }
    }

    @Override // io.sentry.Q
    public void d(String str) {
        if (str == null) {
            a("dist.json");
        } else {
            k(str, "dist.json");
        }
    }

    @Override // io.sentry.Q
    public void e(Double d8) {
        if (d8 == null) {
            a("replay-error-sample-rate.json");
        } else {
            k(d8.toString(), "replay-error-sample-rate.json");
        }
    }

    @Override // io.sentry.Q
    public void f(String str) {
        if (str == null) {
            a("environment.json");
        } else {
            k(str, "environment.json");
        }
    }

    @Override // io.sentry.Q
    public void g(String str) {
        if (str == null) {
            a("proguard-uuid.json");
        } else {
            k(str, "proguard-uuid.json");
        }
    }

    @Override // io.sentry.Q
    public void h(String str) {
        if (str == null) {
            a("release.json");
        } else {
            k(str, "release.json");
        }
    }

    public final void k(Object obj, String str) {
        d.d(this.f27023a, obj, ".options-cache", str);
    }
}
