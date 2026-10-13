package F7;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f2450a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public k f2451b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        boolean a(SSLSocket sSLSocket);

        k b(SSLSocket sSLSocket);
    }

    public j(a socketAdapterFactory) {
        t.g(socketAdapterFactory, "socketAdapterFactory");
        this.f2450a = socketAdapterFactory;
    }

    @Override // F7.k
    public boolean a(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return this.f2450a.a(sslSocket);
    }

    @Override // F7.k
    public boolean b() {
        return true;
    }

    @Override // F7.k
    public String c(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        k kVarE = e(sslSocket);
        if (kVarE != null) {
            return kVarE.c(sslSocket);
        }
        return null;
    }

    @Override // F7.k
    public void d(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        k kVarE = e(sslSocket);
        if (kVarE != null) {
            kVarE.d(sslSocket, str, protocols);
        }
    }

    public final synchronized k e(SSLSocket sSLSocket) {
        try {
            if (this.f2451b == null && this.f2450a.a(sSLSocket)) {
                this.f2451b = this.f2450a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.f2451b;
    }
}
