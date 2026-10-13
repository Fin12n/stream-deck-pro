package p103l3;

import p004a3.C1705k;
import p067h3.b;
import p067h3.f;
import p067h3.m;
import p076i3.l;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class D {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29149a = c.a.a("nm", "p", "s", "r", "hd");

    public static l a(c cVar, C1705k c1705k) {
        String strG = null;
        m mVarB = null;
        f fVarI = null;
        b bVarE = null;
        boolean zT = false;
        while (cVar.o()) {
            int iA = cVar.A(f29149a);
            if (iA == 0) {
                strG = cVar.G();
            } else if (iA == 1) {
                mVarB = AbstractC2649a.b(cVar, c1705k);
            } else if (iA == 2) {
                fVarI = AbstractC2652d.i(cVar, c1705k);
            } else if (iA == 3) {
                bVarE = AbstractC2652d.e(cVar, c1705k);
            } else if (iA != 4) {
                cVar.R();
            } else {
                zT = cVar.t();
            }
        }
        return new l(strG, mVarB, fVarI, bVarE, zT);
    }
}
