package E7;

import Z6.u;
import java.util.List;
import javax.net.ssl.SSLParameters;
import javax.net.ssl.SSLSocket;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class f extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f2306d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final boolean f2307e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final f a() {
            if (b()) {
                return new f();
            }
            return null;
        }

        public final boolean b() {
            return f.f2307e;
        }

        public a() {
        }
    }

    static {
        String property = System.getProperty("java.specification.version");
        Integer numM = property != null ? u.m(property) : null;
        boolean z8 = false;
        if (numM == null) {
            try {
                SSLSocket.class.getMethod("getApplicationProtocol", null);
                z8 = true;
            } catch (NoSuchMethodException unused) {
            }
        } else if (numM.intValue() >= 9) {
            z8 = true;
        }
        f2307e = z8;
    }

    @Override // E7.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        SSLParameters sSLParameters = sslSocket.getSSLParameters();
        sSLParameters.setApplicationProtocols((String[]) h.f2311a.b(protocols).toArray(new String[0]));
        sslSocket.setSSLParameters(sSLParameters);
    }

    @Override // E7.h
    public String h(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        try {
            String applicationProtocol = sslSocket.getApplicationProtocol();
            if (applicationProtocol == null ? true : t.c(applicationProtocol, "")) {
                return null;
            }
            return applicationProtocol;
        } catch (UnsupportedOperationException unused) {
            return null;
        }
    }
}
