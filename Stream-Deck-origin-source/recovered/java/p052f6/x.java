package p052f6;

import java.security.SecureRandom;
import java.util.List;
import javax.net.ssl.X509TrustManager;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SecureRandom f22251a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f22252b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X509TrustManager f22253c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f22254d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f22255e;

    public x(SecureRandom random, List<C2311b> certificates, X509TrustManager trustManager, List<C2314e> cipherSuites, String str) {
        t.g(random, "random");
        t.g(certificates, "certificates");
        t.g(trustManager, "trustManager");
        t.g(cipherSuites, "cipherSuites");
        this.f22251a = random;
        this.f22252b = certificates;
        this.f22253c = trustManager;
        this.f22254d = cipherSuites;
        this.f22255e = str;
    }

    public final List a() {
        return this.f22252b;
    }

    public final List b() {
        return this.f22254d;
    }

    public final SecureRandom c() {
        return this.f22251a;
    }

    public final String d() {
        return this.f22255e;
    }

    public final X509TrustManager e() {
        return this.f22253c;
    }
}
