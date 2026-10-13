package p052f6;

import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public SecureRandom f22257b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TrustManager f22258c;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public String f22260e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f22256a = new ArrayList();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public List f22259d = C2310a.f22030a.a();

    public final x a() throws NoSuchAlgorithmException, KeyStoreException {
        SecureRandom secureRandom = this.f22257b;
        if (secureRandom == null) {
            secureRandom = new SecureRandom();
        }
        List list = this.f22256a;
        TrustManager trustManager = this.f22258c;
        X509TrustManager x509TrustManagerB = trustManager instanceof X509TrustManager ? (X509TrustManager) trustManager : null;
        if (x509TrustManagerB == null) {
            x509TrustManagerB = z.b();
        }
        return new x(secureRandom, list, x509TrustManagerB, this.f22259d, this.f22260e);
    }

    public final List b() {
        return this.f22256a;
    }

    public final List c() {
        return this.f22259d;
    }

    public final SecureRandom d() {
        return this.f22257b;
    }

    public final String e() {
        return this.f22260e;
    }

    public final TrustManager f() {
        return this.f22258c;
    }

    public final void g(List list) {
        t.g(list, "<set-?>");
        this.f22259d = list;
    }

    public final void h(SecureRandom secureRandom) {
        this.f22257b = secureRandom;
    }

    public final void i(String str) {
        this.f22260e = str;
    }

    public final void j(TrustManager trustManager) {
        if (trustManager == null || (trustManager instanceof X509TrustManager)) {
            this.f22258c = trustManager;
            return;
        }
        throw new IllegalStateException(("Failed to set [trustManager]: " + trustManager + ". Only [X509TrustManager] supported.").toString());
    }
}
