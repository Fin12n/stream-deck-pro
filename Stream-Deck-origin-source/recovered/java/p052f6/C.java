package p052f6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum C {
    HelloRequest(0),
    ClientHello(1),
    ServerHello(2),
    Certificate(11),
    ServerKeyExchange(12),
    CertificateRequest(13),
    ServerDone(14),
    CertificateVerify(15),
    ClientKeyExchange(16),
    Finished(20);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21964b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C[] f21965c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21977a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final C a(int i8) {
            C c8 = (i8 < 0 || i8 >= 256) ? null : C.f21965c[i8];
            if (c8 != null) {
                return c8;
            }
            throw new IllegalArgumentException("Invalid TLS handshake type code: " + i8);
        }

        public a() {
        }
    }

    static {
        C c8;
        C[] cArr = new C[256];
        for (int i8 = 0; i8 < 256; i8++) {
            C[] cArrValues = values();
            int length = cArrValues.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    c8 = null;
                    break;
                }
                c8 = cArrValues[i9];
                if (c8.f21977a == i8) {
                    break;
                } else {
                    i9++;
                }
            }
            cArr[i8] = c8;
        }
        f21965c = cArr;
    }

    C(int i8) {
        this.f21977a = i8;
    }

    public final int c() {
        return this.f21977a;
    }
}
