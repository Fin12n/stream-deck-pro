package E7;

import D6.C0938s;
import J7.C1034e;
import T0.Vl.PCRzgdeK;
import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.Security;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import u7.x;
import u7.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f2311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static volatile h f2312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Logger f2313c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final List b(List protocols) {
            t.g(protocols, "protocols");
            ArrayList arrayList = new ArrayList();
            for (Object obj : protocols) {
                if (((y) obj) != y.HTTP_1_0) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(C0938s.y(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((y) it.next()).toString());
            }
            return arrayList2;
        }

        public final byte[] c(List protocols) {
            t.g(protocols, "protocols");
            C1034e c1034e = new C1034e();
            for (String str : b(protocols)) {
                c1034e.writeByte(str.length());
                c1034e.I0(str);
            }
            return c1034e.V0();
        }

        public final h d() {
            F7.c.f2430a.b();
            h hVarA = E7.a.f2281e.a();
            if (hVarA != null) {
                return hVarA;
            }
            h hVarA2 = b.f2284f.a();
            t.d(hVarA2);
            return hVarA2;
        }

        public final h e() {
            g gVarA;
            c cVarA;
            d dVarB;
            if (j() && (dVarB = d.f2293e.b()) != null) {
                return dVarB;
            }
            if (i() && (cVarA = c.f2290e.a()) != null) {
                return cVarA;
            }
            if (k() && (gVarA = g.f2308e.a()) != null) {
                return gVarA;
            }
            f fVarA = f.f2306d.a();
            if (fVarA != null) {
                return fVarA;
            }
            h hVarA = e.f2297i.a();
            return hVarA != null ? hVarA : new h();
        }

        public final h f() {
            return h() ? d() : e();
        }

        public final h g() {
            return h.f2312b;
        }

        public final boolean h() {
            return t.c("Dalvik", System.getProperty("java.vm.name"));
        }

        public final boolean i() {
            return t.c("BC", Security.getProviders()[0].getName());
        }

        public final boolean j() {
            return t.c("Conscrypt", Security.getProviders()[0].getName());
        }

        public a() {
        }

        public final boolean k() {
            return t.c(PCRzgdeK.dmHFci, Security.getProviders()[0].getName());
        }
    }

    static {
        a aVar = new a(null);
        f2311a = aVar;
        f2312b = aVar.f();
        f2313c = Logger.getLogger(x.class.getName());
    }

    public static /* synthetic */ void l(h hVar, String str, int i8, Throwable th, int i9, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: log");
        }
        if ((i9 & 2) != 0) {
            i8 = 4;
        }
        if ((i9 & 4) != 0) {
            th = null;
        }
        hVar.k(str, i8, th);
    }

    public void b(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
    }

    public H7.c c(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        return new H7.a(d(trustManager));
    }

    public H7.e d(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        X509Certificate[] acceptedIssuers = trustManager.getAcceptedIssuers();
        t.f(acceptedIssuers, "trustManager.acceptedIssuers");
        return new H7.b((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length));
    }

    public void e(SSLSocket sslSocket, String str, List protocols) {
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
    }

    public void f(Socket socket, InetSocketAddress address, int i8) throws IOException {
        t.g(socket, "socket");
        t.g(address, "address");
        socket.connect(address, i8);
    }

    public final String g() {
        return "OkHttp";
    }

    public String h(SSLSocket sslSocket) {
        t.g(sslSocket, "sslSocket");
        return null;
    }

    public Object i(String closer) {
        t.g(closer, "closer");
        if (f2313c.isLoggable(Level.FINE)) {
            return new Throwable(closer);
        }
        return null;
    }

    public boolean j(String hostname) {
        t.g(hostname, "hostname");
        return true;
    }

    public void k(String message, int i8, Throwable th) {
        t.g(message, "message");
        f2313c.log(i8 == 5 ? Level.WARNING : Level.INFO, message, th);
    }

    public void m(String message, Object obj) {
        t.g(message, "message");
        if (obj == null) {
            message = message + " To see where this was allocated, set the OkHttpClient logger level to FINE: Logger.getLogger(OkHttpClient.class.getName()).setLevel(Level.FINE);";
        }
        k(message, 5, (Throwable) obj);
    }

    public SSLContext n() throws NoSuchAlgorithmException {
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        t.f(sSLContext, "getInstance(\"TLS\")");
        return sSLContext;
    }

    public SSLSocketFactory o(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        try {
            SSLContext sSLContextN = n();
            sSLContextN.init(null, new TrustManager[]{trustManager}, null);
            SSLSocketFactory socketFactory = sSLContextN.getSocketFactory();
            t.f(socketFactory, "newSSLContext().apply {\n…ll)\n      }.socketFactory");
            return socketFactory;
        } catch (GeneralSecurityException e8) {
            throw new AssertionError("No System TLS: " + e8, e8);
        }
    }

    public X509TrustManager p() throws NoSuchAlgorithmException, KeyStoreException {
        TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
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

    public String toString() {
        String simpleName = getClass().getSimpleName();
        t.f(simpleName, "javaClass.simpleName");
        return simpleName;
    }
}
