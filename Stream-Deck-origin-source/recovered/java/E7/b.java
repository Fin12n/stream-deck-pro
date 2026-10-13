package E7;

import D6.r;
import F7.i;
import F7.j;
import F7.k;
import F7.l;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.security.cert.TrustAnchor;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b extends h {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final a f2284f = new a(null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final boolean f2285g;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2286d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final F7.h f2287e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final h a() {
            if (b()) {
                return new b();
            }
            return null;
        }

        public final boolean b() {
            return b.f2285g;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: E7.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0107b implements H7.e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final X509TrustManager f2288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Method f2289b;

        public C0107b(X509TrustManager trustManager, Method findByIssuerAndSignatureMethod) {
            t.g(trustManager, "trustManager");
            t.g(findByIssuerAndSignatureMethod, "findByIssuerAndSignatureMethod");
            this.f2288a = trustManager;
            this.f2289b = findByIssuerAndSignatureMethod;
        }

        @Override // H7.e
        public X509Certificate a(X509Certificate cert) {
            t.g(cert, "cert");
            try {
                Object objInvoke = this.f2289b.invoke(this.f2288a, cert);
                t.e(objInvoke, "null cannot be cast to non-null type java.security.cert.TrustAnchor");
                return ((TrustAnchor) objInvoke).getTrustedCert();
            } catch (IllegalAccessException e8) {
                throw new AssertionError("unable to get issues and signature", e8);
            } catch (InvocationTargetException unused) {
                return null;
            }
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0107b)) {
                return false;
            }
            C0107b c0107b = (C0107b) obj;
            return t.c(this.f2288a, c0107b.f2288a) && t.c(this.f2289b, c0107b.f2289b);
        }

        public int hashCode() {
            return (this.f2288a.hashCode() * 31) + this.f2289b.hashCode();
        }

        public String toString() {
            return "CustomTrustRootIndex(trustManager=" + this.f2288a + ", findByIssuerAndSignatureMethod=" + this.f2289b + ')';
        }
    }

    static {
        boolean z8 = false;
        if (h.f2311a.h() && Build.VERSION.SDK_INT < 30) {
            z8 = true;
        }
        f2285g = z8;
    }

    public b() {
        List listS = r.s(l.a.b(l.f2452j, null, 1, null), new j(F7.f.f2434f.d()), new j(i.f2448a.a()), new j(F7.g.f2442a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (((k) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f2286d = arrayList;
        this.f2287e = F7.h.f2444d.a();
    }

    @Override // E7.h
    public H7.c c(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        F7.b bVarA = F7.b.f2427d.a(trustManager);
        return bVarA != null ? bVarA : super.c(trustManager);
    }

    @Override // E7.h
    public H7.e d(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        try {
            Method method = trustManager.getClass().getDeclaredMethod("findTrustAnchorByIssuerAndSignature", X509Certificate.class);
            method.setAccessible(true);
            t.f(method, "method");
            return new C0107b(trustManager, method);
        } catch (NoSuchMethodException unused) {
            return super.d(trustManager);
        }
    }

    @Override // E7.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        Iterator it = this.f2286d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).a(sslSocket));
        k kVar = (k) next;
        if (kVar != null) {
            kVar.d(sslSocket, str, protocols);
        }
    }

    @Override // E7.h
    public void f(Socket socket, InetSocketAddress address, int i8) throws IOException {
        t.g(socket, "socket");
        t.g(address, "address");
        socket.connect(address, i8);
    }

    @Override // E7.h
    public String h(SSLSocket sslSocket) {
        Object next;
        t.g(sslSocket, "sslSocket");
        Iterator it = this.f2286d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((k) next).a(sslSocket));
        k kVar = (k) next;
        if (kVar != null) {
            return kVar.c(sslSocket);
        }
        return null;
    }

    @Override // E7.h
    public Object i(String closer) {
        t.g(closer, "closer");
        return this.f2287e.a(closer);
    }

    @Override // E7.h
    public boolean j(String hostname) {
        t.g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }

    @Override // E7.h
    public void m(String message, Object obj) {
        t.g(message, "message");
        if (this.f2287e.b(obj)) {
            return;
        }
        h.l(this, message, 5, null, 4, null);
    }
}
