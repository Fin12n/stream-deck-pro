package F7;

import android.net.ssl.SSLSockets;
import android.os.Build;
import java.io.IOException;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C0115a f2426a = new C0115a(null);

    /* JADX INFO: renamed from: F7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0115a {
        public /* synthetic */ C0115a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final k a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return E7.h.f2311a.h() && Build.VERSION.SDK_INT >= 29;
        }

        public C0115a() {
        }
    }

    @Override // F7.k
    public boolean a(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return SSLSockets.isSupportedSocket(sslSocket);
    }

    @Override // F7.k
    public boolean b() {
        return f2426a.b();
    }

    @Override // F7.k
    public String c(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        String applicationProtocol = sslSocket.getApplicationProtocol();
        if (applicationProtocol == null ? true : t.c(applicationProtocol, "")) {
            return null;
        }
        return applicationProtocol;
    }

    @Override // F7.k
    public void d(SSLSocket sslSocket, String str, List protocols) throws IOException {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        try {
            SSLSockets.setUseSessionTickets(sslSocket, true);
            SSLParameters sSLParameters = sslSocket.getSSLParameters();
            sSLParameters.setApplicationProtocols((String[]) E7.h.f2311a.b(protocols).toArray(new String[0]));
            sslSocket.setSSLParameters(sSLParameters);
        } catch (IllegalArgumentException e8) {
            throw new IOException("Android internal error", e8);
        }
    }
}
