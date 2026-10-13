package F7;

import java.util.List;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i implements k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f2448a = new b(null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final j.a f2449b = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements j.a {
        @Override // F7.j.a
        public boolean a(SSLSocket sslSocket) {
            t.g(sslSocket, "sslSocket");
            return E7.d.f2293e.c() && Conscrypt.isConscrypt(sslSocket);
        }

        @Override // F7.j.a
        public k b(SSLSocket sslSocket) {
            t.g(sslSocket, "sslSocket");
            return new i();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j.a a() {
            return i.f2449b;
        }

        public b() {
        }
    }

    @Override // F7.k
    public boolean a(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return Conscrypt.isConscrypt(sslSocket);
    }

    @Override // F7.k
    public boolean b() {
        return E7.d.f2293e.c();
    }

    @Override // F7.k
    public String c(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        if (a(sslSocket)) {
            return Conscrypt.getApplicationProtocol(sslSocket);
        }
        return null;
    }

    @Override // F7.k
    public void d(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        if (a(sslSocket)) {
            Conscrypt.setUseSessionTickets(sslSocket, true);
            Conscrypt.setApplicationProtocols(sslSocket, (String[]) E7.h.f2311a.b(protocols).toArray(new String[0]));
        }
    }
}
