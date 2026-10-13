package p052f6;

import D6.C0933m;
import Z6.c;
import Z6.w;
import java.nio.charset.Charset;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f22075a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f22076b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final byte[] f22077c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f22078d;

    static {
        Charset charset = c.f12941b;
        byte[] bytes = "master secret".getBytes(charset);
        t.f(bytes, "this as java.lang.String).getBytes(charset)");
        f22075a = bytes;
        byte[] bytes2 = "key expansion".getBytes(charset);
        t.f(bytes2, "this as java.lang.String).getBytes(charset)");
        f22076b = bytes2;
        byte[] bytes3 = "client finished".getBytes(charset);
        t.f(bytes3, "this as java.lang.String).getBytes(charset)");
        f22077c = bytes3;
        byte[] bytes4 = "server finished".getBytes(charset);
        t.f(bytes4, "this as java.lang.String).getBytes(charset)");
        f22078d = bytes4;
    }

    public static final byte[] a(byte[] bArr, C2314e suite) {
        t.g(bArr, "<this>");
        t.g(suite, "suite");
        return C0933m.n(bArr, (suite.l() * 2) + (suite.j() * 2), (suite.l() * 2) + (suite.j() * 2) + suite.e());
    }

    public static final SecretKeySpec b(byte[] bArr, C2314e suite) {
        t.g(bArr, "<this>");
        t.g(suite, "suite");
        return new SecretKeySpec(bArr, suite.l() * 2, suite.j(), w.S0(suite.h(), "/", null, 2, null));
    }

    public static final SecretKeySpec c(byte[] bArr, C2314e suite) {
        t.g(bArr, "<this>");
        t.g(suite, "suite");
        return new SecretKeySpec(bArr, 0, suite.l(), suite.f().c());
    }

    public static final byte[] d() {
        return f22077c;
    }

    public static final byte[] e() {
        return f22078d;
    }

    public static final byte[] f(SecretKey masterSecret, byte[] seed, int i8, int i9, int i10) {
        t.g(masterSecret, "masterSecret");
        t.g(seed, "seed");
        return j.a(masterSecret, f22076b, seed, (i9 * 2) + (i8 * 2) + (i10 * 2));
    }

    public static final SecretKeySpec g(SecretKey preMasterSecret, byte[] clientRandom, byte[] serverRandom) {
        t.g(preMasterSecret, "preMasterSecret");
        t.g(clientRandom, "clientRandom");
        t.g(serverRandom, "serverRandom");
        return new SecretKeySpec(j.a(preMasterSecret, f22075a, C0933m.x(clientRandom, serverRandom), 48), preMasterSecret.getAlgorithm());
    }

    public static final byte[] h(byte[] bArr, C2314e suite) {
        t.g(bArr, "<this>");
        t.g(suite, "suite");
        return C0933m.n(bArr, (suite.l() * 2) + (suite.j() * 2) + suite.e(), (suite.l() * 2) + (suite.j() * 2) + (suite.e() * 2));
    }

    public static final SecretKeySpec i(byte[] bArr, C2314e suite) {
        t.g(bArr, "<this>");
        t.g(suite, "suite");
        return new SecretKeySpec(bArr, (suite.l() * 2) + suite.j(), suite.j(), w.S0(suite.h(), "/", null, 2, null));
    }

    public static final SecretKeySpec j(byte[] bArr, C2314e suite) {
        t.g(bArr, "<this>");
        t.g(suite, "suite");
        return new SecretKeySpec(bArr, suite.l(), suite.l(), suite.f().c());
    }
}
