package p103l3;

import android.graphics.PointF;
import p004a3.C1705k;
import p067h3.b;
import p067h3.e;
import p067h3.g;
import p067h3.i;
import p067h3.l;
import p067h3.m;
import p112m3.c;
import p130o3.a;
import p130o3.d;

/* JADX INFO: renamed from: l3.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2651c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29164a = c.a.a("a", "p", "s", "rz", "r", "o", "so", "eo", "sk", "sa");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.a f29165b = c.a.a("k");

    public static boolean a(e eVar) {
        if (eVar != null) {
            return eVar.c() && ((PointF) ((a) eVar.b().get(0)).f30872b).equals(0.0f, 0.0f);
        }
        return true;
    }

    public static boolean b(m mVar) {
        if (mVar != null) {
            return !(mVar instanceof i) && mVar.c() && ((PointF) ((a) mVar.b().get(0)).f30872b).equals(0.0f, 0.0f);
        }
        return true;
    }

    public static boolean c(b bVar) {
        if (bVar != null) {
            return bVar.c() && ((Float) ((a) bVar.b().get(0)).f30872b).floatValue() == 0.0f;
        }
        return true;
    }

    public static boolean d(g gVar) {
        if (gVar != null) {
            return gVar.c() && ((d) ((a) gVar.b().get(0)).f30872b).a(1.0f, 1.0f);
        }
        return true;
    }

    public static boolean e(b bVar) {
        if (bVar != null) {
            return bVar.c() && ((Float) ((a) bVar.b().get(0)).f30872b).floatValue() == 0.0f;
        }
        return true;
    }

    public static boolean f(b bVar) {
        if (bVar != null) {
            return bVar.c() && ((Float) ((a) bVar.b().get(0)).f30872b).floatValue() == 0.0f;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0069  */
    /* JADX WARN: Code duplicated, block: B:23:0x0086  */
    /* JADX WARN: Code duplicated, block: B:25:0x0094  */
    public static l g(c cVar, C1705k c1705k) {
        b bVarF;
        C1705k c1705k2 = c1705k;
        Float fValueOf = Float.valueOf(0.0f);
        boolean z8 = cVar.y() == c.b.BEGIN_OBJECT;
        if (z8) {
            cVar.x();
        }
        b bVar = null;
        e eVarA = null;
        m mVarB = null;
        g gVarJ = null;
        b bVarF2 = null;
        b bVarF3 = null;
        p067h3.d dVarH = null;
        b bVarF4 = null;
        b bVarF5 = null;
        while (cVar.o()) {
            switch (cVar.A(f29164a)) {
                case 0:
                    cVar.x();
                    while (cVar.o()) {
                        if (cVar.A(f29165b) != 0) {
                            cVar.Y();
                            cVar.R();
                        } else {
                            eVarA = AbstractC2649a.a(cVar, c1705k);
                        }
                    }
                    cVar.u();
                    c1705k2 = c1705k;
                    break;
                case 1:
                    mVarB = AbstractC2649a.b(cVar, c1705k);
                    c1705k2 = c1705k;
                    break;
                case 2:
                    gVarJ = AbstractC2652d.j(cVar, c1705k);
                    c1705k2 = c1705k;
                    break;
                case 3:
                    c1705k2.a("Lottie doesn't support 3D layers.");
                    bVarF = AbstractC2652d.f(cVar, c1705k2, false);
                    if (bVarF.b().isEmpty()) {
                        bVarF.b().add(new a(c1705k2, fValueOf, fValueOf, null, 0.0f, Float.valueOf(c1705k2.f())));
                    } else if (((a) bVarF.b().get(0)).f30872b == null) {
                        bVarF.b().set(0, new a(c1705k, fValueOf, fValueOf, null, 0.0f, Float.valueOf(c1705k.f())));
                    }
                    c1705k2 = c1705k;
                    bVar = bVarF;
                    break;
                case 4:
                    bVarF = AbstractC2652d.f(cVar, c1705k2, false);
                    if (bVarF.b().isEmpty()) {
                        bVarF.b().add(new a(c1705k2, fValueOf, fValueOf, null, 0.0f, Float.valueOf(c1705k2.f())));
                    } else if (((a) bVarF.b().get(0)).f30872b == null) {
                        bVarF.b().set(0, new a(c1705k, fValueOf, fValueOf, null, 0.0f, Float.valueOf(c1705k.f())));
                    }
                    c1705k2 = c1705k;
                    bVar = bVarF;
                    break;
                case 5:
                    dVarH = AbstractC2652d.h(cVar, c1705k);
                    break;
                case 6:
                    bVarF4 = AbstractC2652d.f(cVar, c1705k2, false);
                    break;
                case 7:
                    bVarF5 = AbstractC2652d.f(cVar, c1705k2, false);
                    break;
                case 8:
                    bVarF2 = AbstractC2652d.f(cVar, c1705k2, false);
                    break;
                case 9:
                    bVarF3 = AbstractC2652d.f(cVar, c1705k2, false);
                    break;
                default:
                    cVar.Y();
                    cVar.R();
                    break;
            }
        }
        if (z8) {
            cVar.u();
        }
        e eVar = a(eVarA) ? null : eVarA;
        if (b(mVarB)) {
            mVarB = null;
        }
        return new l(eVar, mVarB, d(gVarJ) ? null : gVarJ, c(bVar) ? null : bVar, dVarH, bVarF4, bVarF5, f(bVarF2) ? null : bVarF2, e(bVarF3) ? null : bVarF3);
    }
}
