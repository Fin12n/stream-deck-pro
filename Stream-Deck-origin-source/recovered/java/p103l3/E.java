package p103l3;

import p004a3.C1705k;
import p067h3.b;
import p067h3.l;
import p076i3.m;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29150a = c.a.a("nm", "c", "o", "tr", "hd");

    public static m a(c cVar, C1705k c1705k) {
        String strG = null;
        b bVarF = null;
        b bVarF2 = null;
        l lVarG = null;
        boolean zT = false;
        while (cVar.o()) {
            int iA = cVar.A(f29150a);
            if (iA == 0) {
                strG = cVar.G();
            } else if (iA == 1) {
                bVarF = AbstractC2652d.f(cVar, c1705k, false);
            } else if (iA == 2) {
                bVarF2 = AbstractC2652d.f(cVar, c1705k, false);
            } else if (iA == 3) {
                lVarG = AbstractC2651c.g(cVar, c1705k);
            } else if (iA != 4) {
                cVar.R();
            } else {
                zT = cVar.t();
            }
        }
        return new m(strG, bVarF, bVarF2, lVarG, zT);
    }
}
