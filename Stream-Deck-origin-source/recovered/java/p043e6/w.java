package p043e6;

import java.lang.reflect.InvocationTargetException;
import java.net.SocketAddress;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class w extends o {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f20893b = new a(0 == true ? 1 : 0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Class f20894c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SocketAddress f20895a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final Class b() {
            Class cls = w.f20894c;
            if (cls != null) {
                return cls;
            }
            throw new IllegalStateException("Unix domain sockets are unsupported before Java 16.");
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static {
        Class<?> cls = null;
        try {
            cls = Class.forName("java.net.UnixDomainSocketAddress");
        } catch (ClassNotFoundException unused) {
        }
        f20894c = cls;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SocketAddress address) {
        super(null);
        t.g(address, "address");
        this.f20895a = address;
        if (!t.c(a().getClass().getName(), "java.net.UnixDomainSocketAddress")) {
            throw new IllegalStateException("address should be java.net.UnixDomainSocketAddress");
        }
    }

    @Override // p043e6.o
    public SocketAddress a() {
        return this.f20895a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!t.c(w.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        t.e(obj, "null cannot be cast to non-null type io.ktor.network.sockets.UnixSocketAddress");
        return t.c(a(), ((w) obj).a());
    }

    public int hashCode() {
        return a().hashCode();
    }

    public String toString() {
        return a().toString();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public w(String path) throws IllegalAccessException, InvocationTargetException {
        t.g(path, "path");
        Object objInvoke = f20893b.b().getMethod("of", String.class).invoke(null, path);
        t.e(objInvoke, "null cannot be cast to non-null type java.net.SocketAddress");
        this((SocketAddress) objInvoke);
    }
}
