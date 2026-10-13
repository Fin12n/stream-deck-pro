package u7;

import java.net.InetSocketAddress;
import java.net.Proxy;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3041a f34543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Proxy f34544b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final InetSocketAddress f34545c;

    public D(C3041a address, Proxy proxy, InetSocketAddress socketAddress) {
        kotlin.jvm.internal.t.g(address, "address");
        kotlin.jvm.internal.t.g(proxy, "proxy");
        kotlin.jvm.internal.t.g(socketAddress, "socketAddress");
        this.f34543a = address;
        this.f34544b = proxy;
        this.f34545c = socketAddress;
    }

    public final C3041a a() {
        return this.f34543a;
    }

    public final Proxy b() {
        return this.f34544b;
    }

    public final boolean c() {
        return this.f34543a.k() != null && this.f34544b.type() == Proxy.Type.HTTP;
    }

    public final InetSocketAddress d() {
        return this.f34545c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof D)) {
            return false;
        }
        D d8 = (D) obj;
        return kotlin.jvm.internal.t.c(d8.f34543a, this.f34543a) && kotlin.jvm.internal.t.c(d8.f34544b, this.f34544b) && kotlin.jvm.internal.t.c(d8.f34545c, this.f34545c);
    }

    public int hashCode() {
        return ((((527 + this.f34543a.hashCode()) * 31) + this.f34544b.hashCode()) * 31) + this.f34545c.hashCode();
    }

    public String toString() {
        return "Route{" + this.f34545c + '}';
    }
}
