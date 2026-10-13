package p052f6;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum s {
    DecryptionFailed_RESERVED(21),
    CloseNotify(0),
    UnexpectedMessage(10),
    BadRecordMac(20),
    RecordOverflow(22),
    DecompressionFailure(30),
    HandshakeFailure(40),
    NoCertificate_RESERVED(41),
    BadCertificate(42),
    UnsupportedCertificate(43),
    CertificateRevoked(44),
    CertificateExpired(45),
    CertificateUnknown(46),
    IllegalParameter(47),
    UnknownCa(48),
    AccessDenied(49),
    DecodeError(50),
    DecryptError(51),
    ExportRestriction_RESERVED(60),
    ProtocolVersion(70),
    InsufficientSecurity(71),
    InternalError(80),
    UserCanceled(90),
    NoRenegotiation(100),
    UnsupportedExtension(110);


    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f22138b = new a(null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final s[] f22139c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f22163a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final s a(int i8) {
            s sVar = (i8 < 0 || i8 >= 256) ? null : s.f22139c[i8];
            if (sVar != null) {
                return sVar;
            }
            throw new IllegalArgumentException("Invalid TLS record type code: " + i8);
        }

        public a() {
        }
    }

    static {
        s sVar;
        s[] sVarArr = new s[256];
        for (int i8 = 0; i8 < 256; i8++) {
            s[] sVarArrValues = values();
            int length = sVarArrValues.length;
            int i9 = 0;
            while (true) {
                if (i9 >= length) {
                    sVar = null;
                    break;
                }
                sVar = sVarArrValues[i9];
                if (sVar.f22163a == i8) {
                    break;
                } else {
                    i9++;
                }
            }
            sVarArr[i8] = sVar;
        }
        f22139c = sVarArr;
    }

    s(int i8) {
        this.f22163a = i8;
    }

    public final int c() {
        return this.f22163a;
    }
}
