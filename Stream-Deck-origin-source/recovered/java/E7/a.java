package E7;

import D6.r;
import F7.i;
import F7.j;
import F7.k;
import android.os.Build;
import android.security.NetworkSecurityPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a extends h {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C0106a f2281e = new C0106a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final boolean f2282f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2283d;

    /* JADX INFO: renamed from: E7.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0106a {
        public /* synthetic */ C0106a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final h a() {
            if (b()) {
                return new a();
            }
            return null;
        }

        public final boolean b() {
            return a.f2282f;
        }

        public C0106a() {
        }
    }

    static {
        f2282f = h.f2311a.h() && Build.VERSION.SDK_INT >= 29;
    }

    public a() {
        List listS = r.s(F7.a.f2426a.a(), new j(F7.f.f2434f.d()), new j(i.f2448a.a()), new j(F7.g.f2442a.a()));
        ArrayList arrayList = new ArrayList();
        for (Object obj : listS) {
            if (((k) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.f2283d = arrayList;
    }

    @Override // E7.h
    public H7.c c(X509TrustManager trustManager) {
        t.g(trustManager, "trustManager");
        F7.b bVarA = F7.b.f2427d.a(trustManager);
        return bVarA != null ? bVarA : super.c(trustManager);
    }

    @Override // E7.h
    public void e(SSLSocket sslSocket, String str, List protocols) {
        Object next;
        t.g(sslSocket, "sslSocket");
        t.g(protocols, "protocols");
        Iterator it = this.f2283d.iterator();
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
    public String h(SSLSocket sslSocket) {
        Object next;
        t.g(sslSocket, "sslSocket");
        Iterator it = this.f2283d.iterator();
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
    public boolean j(String hostname) {
        t.g(hostname, "hostname");
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(hostname);
    }
}
