package p070h6;

import kotlin.jvm.internal.AbstractC2633k;
import p052f6.A;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum j {
    SERVER_NAME(0),
    MAX_FRAGMENT_LENGTH(1),
    CLIENT_CERTIFICATE_URL(2),
    TRUSTED_CA_KEYS(3),
    TRUNCATED_HMAC(4),
    STATUS_REQUEST(5),
    ELLIPTIC_CURVES(10),
    EC_POINT_FORMAT(11),
    SIGNATURE_ALGORITHMS(13);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f24543b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final short f24554a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final j a(int i8) throws A {
            j jVar;
            j[] jVarArrValues = j.values();
            int length = jVarArrValues.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    jVar = null;
                    break;
                }
                jVar = jVarArrValues[i9];
                if (jVar.b() == ((short) i8)) {
                    break;
                }
                i9++;
            }
            if (jVar != null) {
                return jVar;
            }
            throw new A("Unknown server hello extension type: " + i8, null, 2, null);
        }

        public a() {
        }
    }

    j(short s8) {
        this.f24554a = s8;
    }

    public final short b() {
        return this.f24554a;
    }
}
