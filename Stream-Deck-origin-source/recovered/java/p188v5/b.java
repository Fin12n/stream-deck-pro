package p188v5;

import N4.C1082a7;
import N4.C1147g0;
import N4.C1261p7;
import N4.C1317u9;
import N4.C1339w9;
import N4.C9;
import N4.EnumC1202k7;
import N4.EnumC1214l7;
import N4.EnumC1306t9;
import N4.M9;
import N4.N9;
import N4.Q9;
import N4.X6;
import N4.Y6;
import N4.Z6;
import android.util.SparseArray;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import p140p5.C2799i;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final SparseArray f35126a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final SparseArray f35127b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final AtomicReference f35128c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Map f35129d;

    static {
        SparseArray sparseArray = new SparseArray();
        f35126a = sparseArray;
        SparseArray sparseArray2 = new SparseArray();
        f35127b = sparseArray2;
        f35128c = new AtomicReference();
        sparseArray.put(-1, EnumC1202k7.FORMAT_UNKNOWN);
        sparseArray.put(1, EnumC1202k7.FORMAT_CODE_128);
        sparseArray.put(2, EnumC1202k7.FORMAT_CODE_39);
        sparseArray.put(4, EnumC1202k7.FORMAT_CODE_93);
        sparseArray.put(8, EnumC1202k7.FORMAT_CODABAR);
        sparseArray.put(16, EnumC1202k7.FORMAT_DATA_MATRIX);
        sparseArray.put(32, EnumC1202k7.FORMAT_EAN_13);
        sparseArray.put(64, EnumC1202k7.FORMAT_EAN_8);
        sparseArray.put(128, EnumC1202k7.FORMAT_ITF);
        sparseArray.put(256, EnumC1202k7.FORMAT_QR_CODE);
        sparseArray.put(512, EnumC1202k7.FORMAT_UPC_A);
        sparseArray.put(1024, EnumC1202k7.FORMAT_UPC_E);
        sparseArray.put(2048, EnumC1202k7.FORMAT_PDF417);
        sparseArray.put(4096, EnumC1202k7.FORMAT_AZTEC);
        sparseArray2.put(0, EnumC1214l7.TYPE_UNKNOWN);
        sparseArray2.put(1, EnumC1214l7.TYPE_CONTACT_INFO);
        sparseArray2.put(2, EnumC1214l7.TYPE_EMAIL);
        sparseArray2.put(3, EnumC1214l7.TYPE_ISBN);
        sparseArray2.put(4, EnumC1214l7.TYPE_PHONE);
        sparseArray2.put(5, EnumC1214l7.TYPE_PRODUCT);
        sparseArray2.put(6, EnumC1214l7.TYPE_SMS);
        sparseArray2.put(7, EnumC1214l7.TYPE_TEXT);
        sparseArray2.put(8, EnumC1214l7.TYPE_URL);
        sparseArray2.put(9, EnumC1214l7.TYPE_WIFI);
        sparseArray2.put(10, EnumC1214l7.TYPE_GEO);
        sparseArray2.put(11, EnumC1214l7.TYPE_CALENDAR_EVENT);
        sparseArray2.put(12, EnumC1214l7.TYPE_DRIVER_LICENSE);
        HashMap map = new HashMap();
        f35129d = map;
        map.put(1, EnumC1306t9.CODE_128);
        map.put(2, EnumC1306t9.CODE_39);
        map.put(4, EnumC1306t9.CODE_93);
        map.put(8, EnumC1306t9.CODABAR);
        map.put(16, EnumC1306t9.DATA_MATRIX);
        map.put(32, EnumC1306t9.EAN_13);
        map.put(64, EnumC1306t9.EAN_8);
        map.put(128, EnumC1306t9.ITF);
        map.put(256, EnumC1306t9.QR_CODE);
        map.put(512, EnumC1306t9.UPC_A);
        map.put(1024, EnumC1306t9.UPC_E);
        map.put(2048, EnumC1306t9.PDF417);
        map.put(4096, EnumC1306t9.AZTEC);
    }

    public static EnumC1202k7 a(int i8) {
        EnumC1202k7 enumC1202k7 = (EnumC1202k7) f35126a.get(i8);
        return enumC1202k7 == null ? EnumC1202k7.FORMAT_UNKNOWN : enumC1202k7;
    }

    public static EnumC1214l7 b(int i8) {
        EnumC1214l7 enumC1214l7 = (EnumC1214l7) f35127b.get(i8);
        return enumC1214l7 == null ? EnumC1214l7.TYPE_UNKNOWN : enumC1214l7;
    }

    public static C1339w9 c(p156r5.b bVar) {
        int iA = bVar.a();
        C1147g0 c1147g0 = new C1147g0();
        if (iA == 0) {
            c1147g0.f(f35129d.values());
        } else {
            for (Map.Entry entry : f35129d.entrySet()) {
                if ((((Integer) entry.getKey()).intValue() & iA) != 0) {
                    c1147g0.e((EnumC1306t9) entry.getValue());
                }
            }
        }
        C1317u9 c1317u9 = new C1317u9();
        c1317u9.b(c1147g0.g());
        return c1317u9.c();
    }

    public static String d() {
        return true != f() ? "play-services-mlkit-barcode-scanning" : "barcode-scanning";
    }

    public static void e(N9 n9, final Y6 y8) {
        n9.f(new M9() { // from class: v5.a
            @Override // N4.M9
            public final C9 zza() {
                C1082a7 c1082a7 = new C1082a7();
                X6 x8 = b.f() ? X6.TYPE_THICK : X6.TYPE_THIN;
                Y6 y9 = y8;
                c1082a7.e(x8);
                C1261p7 c1261p7 = new C1261p7();
                c1261p7.b(y9);
                c1082a7.h(c1261p7.c());
                return Q9.a(c1082a7);
            }
        }, Z6.ON_DEVICE_BARCODE_LOAD);
    }

    public static boolean f() {
        AtomicReference atomicReference = f35128c;
        if (atomicReference.get() != null) {
            return ((Boolean) atomicReference.get()).booleanValue();
        }
        boolean zB = n.b(C2799i.c().b());
        atomicReference.set(Boolean.valueOf(zB));
        return zB;
    }
}
