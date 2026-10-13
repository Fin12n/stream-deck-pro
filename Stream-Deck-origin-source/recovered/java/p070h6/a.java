package p070h6;

import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import kotlin.jvm.internal.AbstractC2633k;
import p052f6.A;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public enum a {
    NONE((byte) 0, "", ""),
    MD5((byte) 1, "MD5", "HmacMD5"),
    SHA1((byte) 2, "SHA-1", "HmacSHA1"),
    SHA224((byte) 3, "SHA-224", "HmacSHA224"),
    SHA256((byte) 4, "SHA-256", "HmacSHA256"),
    SHA384((byte) 5, "SHA-384", "HmacSHA384"),
    f24483k((byte) 6, WaYxBuDSBD.SSls, "HmacSHA512"),
    INTRINSIC((byte) 8, "INTRINSIC", "Intrinsic");


    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C0563a f24476d = new C0563a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final byte f24486a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f24487b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f24488c;

    /* JADX INFO: renamed from: h6.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0563a {
        public /* synthetic */ C0563a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0563a() {
        }

        public final a a(byte b8) throws A {
            a aVar;
            a[] aVarArrValues = a.values();
            int length = aVarArrValues.length;
            int i8 = 0;
            while (true) {
                if (i8 < length) {
                    aVar = aVarArrValues[i8];
                    if (aVar.b() == b8) {
                        break;
                    }
                    i8++;
                } else {
                    aVar = null;
                    break;
                }
            }
            if (aVar != null) {
                return aVar;
            }
            throw new A(jULK.RjlDCmEND + ((int) b8), null, 2, null);
        }
    }

    a(byte b8, String str, String str2) {
        this.f24486a = b8;
        this.f24487b = str;
        this.f24488c = str2;
    }

    public final byte b() {
        return this.f24486a;
    }

    public final String c() {
        return this.f24488c;
    }

    public final String d() {
        return this.f24487b;
    }
}
