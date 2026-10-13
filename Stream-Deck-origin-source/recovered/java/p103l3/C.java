package p103l3;

import Z.JTT.ryTuoS;
import p004a3.C1705k;
import p067h3.b;
import p067h3.m;
import p076i3.k;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29148a = c.a.a("nm", "sy", "pt", "p", ryTuoS.gvdtpigLxJa, "or", "os", "ir", "is", "hd", "d");

    public static k a(c cVar, C1705k c1705k, int i8) {
        boolean zT = false;
        boolean z8 = i8 == 3;
        String strG = null;
        k.a aVarB = null;
        b bVarF = null;
        m mVarB = null;
        b bVarF2 = null;
        b bVarE = null;
        b bVarE2 = null;
        b bVarF3 = null;
        b bVarF4 = null;
        while (cVar.o()) {
            switch (cVar.A(f29148a)) {
                case 0:
                    strG = cVar.G();
                    break;
                case 1:
                    aVarB = k.a.b(cVar.nextInt());
                    break;
                case 2:
                    bVarF = AbstractC2652d.f(cVar, c1705k, false);
                    break;
                case 3:
                    mVarB = AbstractC2649a.b(cVar, c1705k);
                    break;
                case 4:
                    bVarF2 = AbstractC2652d.f(cVar, c1705k, false);
                    break;
                case 5:
                    bVarE2 = AbstractC2652d.e(cVar, c1705k);
                    break;
                case 6:
                    bVarF4 = AbstractC2652d.f(cVar, c1705k, false);
                    break;
                case 7:
                    bVarE = AbstractC2652d.e(cVar, c1705k);
                    break;
                case 8:
                    bVarF3 = AbstractC2652d.f(cVar, c1705k, false);
                    break;
                case 9:
                    zT = cVar.t();
                    break;
                case 10:
                    z8 = cVar.nextInt() == 3;
                    break;
                default:
                    cVar.Y();
                    cVar.R();
                    break;
            }
        }
        return new k(strG, aVarB, bVarF, mVarB, bVarF2, bVarE, bVarE2, bVarF3, bVarF4, zT, z8);
    }
}
