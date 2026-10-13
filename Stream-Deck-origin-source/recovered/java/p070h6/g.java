package p070h6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum g {
    ANON((byte) 0),
    RSA((byte) 1),
    DSA((byte) 2),
    ECDSA((byte) 3),
    ED25519((byte) 7),
    ED448((byte) 8);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24530b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f24538a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final g a(byte b8) {
            for (g gVar : g.values()) {
                if (gVar.b() == b8) {
                    return gVar;
                }
            }
            return null;
        }

        public a() {
        }
    }

    g(byte b8) {
        this.f24538a = b8;
    }

    public final byte b() {
        return this.f24538a;
    }
}
