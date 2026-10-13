package F7;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import org.bouncycastle.jsse.BCSSLParameters;
import org.bouncycastle.jsse.BCSSLSocket;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2442a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j.a f2443b = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements j.a {
        @Override // F7.j.a
        public boolean a(SSLSocket sslSocket) {
            t.g(sslSocket, "sslSocket");
            E7.c.f2290e.b();
            return false;
        }

        @Override // F7.j.a
        public k b(SSLSocket sslSocket) {
            t.g(sslSocket, "sslSocket");
            return new g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j.a a() {
            return g.f2443b;
        }

        public b() {
        }
    }

    @Override // F7.k
    public boolean a(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return false;
    }

    @Override // F7.k
    public boolean b() {
        return E7.c.f2290e.b();
    }

    @Override // F7.k
    public String c(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        String applicationProtocol = ((BCSSLSocket) sslSocket).getApplicationProtocol();
        if (applicationProtocol == null ? true : t.c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // F7.k
    public void d(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        if (a(sslSocket)) {
            BCSSLSocket bCSSLSocket = (BCSSLSocket) sslSocket;
            BCSSLParameters parameters = bCSSLSocket.getParameters();
            parameters.setApplicationProtocols((String[]) E7.h.f2311a.b(protocols).toArray(new String[0]));
            bCSSLSocket.setParameters(parameters);
        }
    }
}
