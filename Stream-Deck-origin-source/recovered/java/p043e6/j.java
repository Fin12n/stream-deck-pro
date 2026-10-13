package p043e6;

import java.net.InetSocketAddress;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j extends o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InetSocketAddress f20846a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(InetSocketAddress address) {
        super(null);
        t.g(address, "address");
        this.f20846a = address;
    }

    @Override // p043e6.o
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public InetSocketAddress a() {
        return this.f20846a;
    }

    public final String c() {
        String hostName = a().getHostName();
        t.f(hostName, "address.hostName");
        return hostName;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(j.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type io.ktor.network.sockets.InetSocketAddress");
        return t.c(a(), ((j) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        String string = a().toString();
        t.f(string, "address.toString()");
        return string;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public j(String hostname, int i8) {
        this(new InetSocketAddress(hostname, i8));
        t.g(hostname, "hostname");
    }
}
