package J5;

import java.net.Proxy;
import java.net.SocketAddress;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f4342a;

        static {
            int[] iArr = new int[Proxy.Type.values().length];
            try {
                iArr[Proxy.Type.SOCKS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Proxy.Type.HTTP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f4342a = iArr;
        }
    }

    public static final l a(Proxy proxy) {
        t.g(proxy, "<this>");
        Proxy.Type type = proxy.type();
        int i8 = type == null ? -1 : a.f4342a[type.ordinal()];
        if (i8 != 1) {
            return i8 != 2 ? l.UNKNOWN : l.HTTP;
        }
        return l.SOCKS;
    }

    public static final SocketAddress b(Proxy proxy) {
        t.g(proxy, "<this>");
        SocketAddress socketAddressAddress = proxy.address();
        t.f(socketAddressAddress, "address()");
        return socketAddressAddress;
    }
}
