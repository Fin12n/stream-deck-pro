package p103l3;

import p004a3.C1705k;
import p067h3.h;
import p076i3.r;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class K {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c.a f29157a = c.a.a("nm", "ind", "ks", "hd");

    public static r a(c cVar, C1705k c1705k) {
        String strG = null;
        int iNextInt = 0;
        boolean zT = false;
        h hVarK = null;
        while (cVar.o()) {
            int iA = cVar.A(f29157a);
            if (iA == 0) {
                strG = cVar.G();
            } else if (iA == 1) {
                iNextInt = cVar.nextInt();
            } else if (iA == 2) {
                hVarK = AbstractC2652d.k(cVar, c1705k);
            } else if (iA != 3) {
                cVar.R();
            } else {
                zT = cVar.t();
            }
        }
        return new r(strG, iNextInt, hVarK, zT);
    }
}
