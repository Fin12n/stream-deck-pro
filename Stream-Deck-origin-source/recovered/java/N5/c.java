package N5;

import X5.C1685n;
import X5.InterfaceC1684m;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p141p6.c f7485a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f7486b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final U5.c f7487c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final byte[] f7488d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1684m f7489e;

    public c(p141p6.c expires, Map<String, String> varyKeys, U5.c response, byte[] body) {
        t.g(expires, "expires");
        t.g(varyKeys, "varyKeys");
        t.g(response, "response");
        t.g(body, "body");
        this.f7485a = expires;
        this.f7486b = varyKeys;
        this.f7487c = response;
        this.f7488d = body;
        InterfaceC1684m.a aVar = InterfaceC1684m.f11856a;
        C1685n c1685n = new C1685n(0, 1, null);
        c1685n.d(response.a());
        this.f7489e = c1685n.o();
    }

    public final byte[] a() {
        return this.f7488d;
    }

    public final p141p6.c b() {
        return this.f7485a;
    }

    public final U5.c c() {
        return this.f7487c;
    }

    public final InterfaceC1684m d() {
        return this.f7489e;
    }

    public final Map e() {
        return this.f7486b;
    }

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof c)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        return t.c(this.f7486b, ((c) obj).f7486b);
    }

    public final U5.c f() {
        return new H5.e(this.f7487c.g1().d(), this.f7487c.g1().f(), this.f7487c, this.f7488d).g();
    }

    public int hashCode() {
        return this.f7486b.hashCode();
    }
}
