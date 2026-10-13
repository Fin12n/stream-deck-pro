package E7;

import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.NoSuchProviderException;
import java.security.Provider;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import org.bouncycastle.jsse.provider.BouncyCastleJsseProvider;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f2290e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f2291f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Provider f2292d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final c a() {
            AbstractC2633k abstractC2633k = null;
            if (b()) {
                return new c(abstractC2633k);
            }
            return null;
        }

        public final boolean b() {
            return c.f2291f;
        }

        public a() {
        }
    }

    static {
        a aVar = new a(null);
        f2290e = aVar;
        boolean z8 = false;
        try {
            Class.forName("org.bouncycastle.jsse.provider.BouncyCastleJsseProvider", false, aVar.getClass().getClassLoader());
            z8 = true;
        } catch (ClassNotFoundException unused) {
        }
        f2291f = z8;
    }

    public /* synthetic */ c(AbstractC2633k abstractC2633k) {
        this();
    }

    @Override // E7.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        super.e(sslSocket, str, protocols);
    }

    @Override // E7.h
    public String h(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return super.h(sslSocket);
    }

    @Override // E7.h
    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS", this.f2292d);
        t.f(sSLContext, "getInstance(\"TLS\", provider)");
        return sSLContext;
    }

    @Override // E7.h
    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException, NoSuchProviderException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance("PKIX", "BCJSSE");
        trustManagerFactory.init((KeyStore) null);
        TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
        t.d(trustManagers);
        if (trustManagers.length == 1) {
            TrustManager trustManager = trustManagers[0];
            if (trustManager instanceof X509TrustManager) {
                t.e(trustManager, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager");
                return (X509TrustManager) trustManager;
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Unexpected default trust managers: ");
        String string = Arrays.toString(trustManagers);
        t.f(string, "toString(this)");
        sb.append(string);
        throw new IllegalStateException(sb.toString().toString());
    }

    public c() {
        this.f2292d = new BouncyCastleJsseProvider();
    }
}
