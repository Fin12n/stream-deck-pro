package p103l3;

import p004a3.C1705k;
import p067h3.a;
import p067h3.b;
import p067h3.k;
import p112m3.c;

/* JADX INFO: renamed from: l3.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2650b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29162a = c.a.a("a");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.a f29163b = c.a.a("fc", "sc", "sw", "t");

    public static k a(c cVar, C1705k c1705k) {
        cVar.x();
        k kVarB = null;
        while (cVar.o()) {
            if (cVar.A(f29162a) != 0) {
                cVar.Y();
                cVar.R();
            } else {
                kVarB = b(cVar, c1705k);
            }
        }
        cVar.u();
        return kVarB == null ? new k(null, null, null, null) : kVarB;
    }

    public static k b(c cVar, C1705k c1705k) {
        cVar.x();
        a aVarC = null;
        a aVarC2 = null;
        b bVarE = null;
        b bVarE2 = null;
        while (cVar.o()) {
            int iA = cVar.A(f29163b);
            if (iA == 0) {
                aVarC = AbstractC2652d.c(cVar, c1705k);
            } else if (iA == 1) {
                aVarC2 = AbstractC2652d.c(cVar, c1705k);
            } else if (iA == 2) {
                bVarE = AbstractC2652d.e(cVar, c1705k);
            } else if (iA != 3) {
                cVar.Y();
                cVar.R();
            } else {
                bVarE2 = AbstractC2652d.e(cVar, c1705k);
            }
        }
        cVar.u();
        return new k(aVarC, aVarC2, bVarE, bVarE2);
    }
}
