package p070h6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum c {
    sect163k1(1, 163),
    sect163r1(2, 163),
    sect163r2(3, 163),
    sect193r1(4, 193),
    sect193r2(5, 193),
    sect233k1(6, 233),
    sect233r1(7, 233),
    sect239k1(8, 239),
    sect283k1(9, 283),
    sect283r1(10, 283),
    sect409k1(11, 409),
    sect409r1(12, 409),
    sect571k1(13, 571),
    sect571r1(14, 571),
    secp160k1(15, 160),
    secp160r1(16, 160),
    secp160r2(17, 160),
    secp192k1(18, 192),
    secp192r1(19, 192),
    secp224k1(20, 224),
    secp224r1(21, 224),
    secp256k1(22, 256),
    secp256r1(23, 256),
    secp384r1(24, 384),
    secp521r1(25, 521);


    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f24497c = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f24521a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f24522b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final c a(short s8) {
            for (c cVar : c.values()) {
                if (cVar.b() == s8) {
                    return cVar;
                }
            }
            return null;
        }

        public a() {
        }
    }

    c(short s8, int i8) {
        this.f24521a = s8;
        this.f24522b = i8;
    }

    public final short b() {
        return this.f24521a;
    }

    public final int c() {
        return this.f24522b;
    }
}
