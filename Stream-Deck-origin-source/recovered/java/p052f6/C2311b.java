package p052f6;

import java.security.PrivateKey;
import java.security.cert.X509Certificate;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: f6.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2311b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final X509Certificate[] f22039a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PrivateKey f22040b;

    public C2311b(X509Certificate[] certificateChain, PrivateKey key) {
        t.g(certificateChain, "certificateChain");
        t.g(key, "key");
        this.f22039a = certificateChain;
        this.f22040b = key;
    }

    public final X509Certificate[] a() {
        return this.f22039a;
    }

    public final PrivateKey b() {
        return this.f22040b;
    }
}
