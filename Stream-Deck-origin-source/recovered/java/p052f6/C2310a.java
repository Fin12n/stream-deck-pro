package p052f6;

import D6.r;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.ArrayList;
import java.util.List;
import p070h6.a;
import p070h6.g;

/* JADX INFO: renamed from: f6.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2310a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2310a f22030a = new C2310a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final C2314e f22031b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final C2314e f22032c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final C2314e f22033d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2314e f22034e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final C2314e f22035f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final C2314e f22036g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2314e f22037h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final List f22038i;

    public final List a() {
        return f22038i;
    }

    static {
        p pVar = p.RSA;
        a aVar = a.SHA256;
        g gVar = g.RSA;
        C2314e c2314e = new C2314e((short) 156, "TLS_RSA_WITH_AES_128_GCM_SHA256", "AES128-GCM-SHA256", pVar, "AES/GCM/NoPadding", 128, 4, 12, 16, "AEAD", 0, aVar, gVar, null, 8192, null);
        f22031b = c2314e;
        p pVar2 = p.ECDHE;
        a aVar2 = a.SHA384;
        g gVar2 = g.ECDSA;
        C2314e c2314e2 = new C2314e((short) -16340, "TLS_ECDHE_ECDSA_WITH_AES_256_GCM_SHA384", "ECDHE-ECDSA-AES256-GCM-SHA384", pVar2, "AES/GCM/NoPadding", 256, 4, 12, 16, "AEAD", 0, aVar2, gVar2, null, 8192, null);
        f22032c = c2314e2;
        int i8 = 128;
        int i9 = 4;
        int i10 = 12;
        int i11 = 16;
        int i12 = 0;
        C2314e c2314e3 = new C2314e((short) -16341, "TLS_ECDHE_ECDSA_WITH_AES_128_GCM_SHA256", "ECDHE-ECDSA-AES128-GCM-SHA256", pVar2, "AES/GCM/NoPadding", i8, i9, i10, i11, "AEAD", i12, aVar, gVar2, null, 8192, null);
        f22033d = c2314e3;
        C2314e c2314e4 = new C2314e((short) -16336, "TLS_ECDHE_RSA_WITH_AES_256_GCM_SHA384", "ECDHE-RSA-AES256-GCM-SHA384", pVar2, "AES/GCM/NoPadding", 256, 4, 12, 16, "AEAD", 0, aVar2, gVar, null, 8192, null);
        f22034e = c2314e4;
        C2314e c2314e5 = new C2314e((short) -16337, "TLS_ECDHE_RSA_WITH_AES_128_GCM_SHA256", "ECDHE-RSA-AES128-GCM-SHA256", pVar2, "AES/GCM/NoPadding", i8, i9, i10, i11, "AEAD", i12, aVar, gVar, null, 8192, null);
        f22035f = c2314e5;
        EnumC2316g enumC2316g = EnumC2316g.CBC;
        C2314e c2314e6 = new C2314e((short) 53, "TLS_RSA_WITH_AES_256_CBC_SHA", uYOhHhTXuF.RyWCm, pVar, "AES/CBC/NoPadding", 256, 16, 48, 20, "HmacSHA1", 160, aVar, gVar, enumC2316g);
        f22036g = c2314e6;
        C2314e c2314e7 = new C2314e((short) 47, "TLS_RSA_WITH_AES_128_CBC_SHA", "AES-128-CBC-SHA", pVar, "AES/CBC/NoPadding", 128, 16, 48, 20, "HmacSHA1", 160, aVar, gVar, enumC2316g);
        f22037h = c2314e7;
        List listQ = r.q(c2314e2, c2314e4, c2314e3, c2314e5, c2314e, c2314e6, c2314e7);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listQ) {
            if (AbstractC2315f.a((C2314e) obj)) {
                arrayList.add(obj);
            }
        }
        f22038i = arrayList;
    }
}
