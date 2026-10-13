package p052f6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum E {
    ChangeCipherSpec(20),
    f21984e(21),
    Handshake(22),
    ApplicationData(23);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f21981b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final E[] f21982c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f21988a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final E a(int i8) {
            E e8 = (i8 < 0 || i8 >= 256) ? null : E.f21982c[i8];
            if (e8 != null) {
                return e8;
            }
            throw new IllegalArgumentException("Invalid TLS record type code: " + i8);
        }

        public a() {
        }
    }

    E(int i8) {
        this.f21988a = i8;
    }

    public final int c() {
        return this.f21988a;
    }

    static {
        E e8;
        E[] eArr = new E[256];
        for (int i8 = 0; i8 < 256; i8++) {
            E[] eArrValues = values();
            int length = eArrValues.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    e8 = null;
                    break;
                }
                e8 = eArrValues[i9];
                if (e8.f21988a == i8) {
                    break;
                } else {
                    i9++;
                }
            }
            eArr[i8] = e8;
        }
        f21982c = eArr;
    }
}
