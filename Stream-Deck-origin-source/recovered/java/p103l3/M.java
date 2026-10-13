package p103l3;

import p004a3.C1705k;
import p067h3.b;
import p076i3.t;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class M {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29160a = c.a.a("s", "e", "o", "nm", "m", "hd");

    public static t a(c cVar, C1705k c1705k) {
        String strG = null;
        t.a aVarB = null;
        b bVarF = null;
        b bVarF2 = null;
        b bVarF3 = null;
        boolean zT = false;
        while (cVar.o()) {
            int iA = cVar.A(f29160a);
            if (iA == 0) {
                bVarF = AbstractC2652d.f(cVar, c1705k, false);
            } else if (iA == 1) {
                bVarF2 = AbstractC2652d.f(cVar, c1705k, false);
            } else if (iA == 2) {
                bVarF3 = AbstractC2652d.f(cVar, c1705k, false);
            } else if (iA == 3) {
                strG = cVar.G();
            } else if (iA == 4) {
                aVarB = t.a.b(cVar.nextInt());
            } else if (iA != 5) {
                cVar.R();
            } else {
                zT = cVar.t();
            }
        }
        return new t(strG, aVarB, bVarF, bVarF2, bVarF3, zT);
    }
}
