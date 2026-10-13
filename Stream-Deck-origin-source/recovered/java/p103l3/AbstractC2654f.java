package p103l3;

import p004a3.C1705k;
import p067h3.f;
import p067h3.m;
import p076i3.b;
import p090k.zI.jULK;
import p112m3.c;

/* JADX INFO: renamed from: l3.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2654f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29168a = c.a.a("nm", "p", "s", "hd", jULK.LqlWJulQ);

    public static b a(c cVar, C1705k c1705k, int i8) {
        boolean z8 = i8 == 3;
        boolean zT = false;
        String strG = null;
        m mVarB = null;
        f fVarI = null;
        while (cVar.o()) {
            int iA = cVar.A(f29168a);
            if (iA == 0) {
                strG = cVar.G();
            } else if (iA == 1) {
                mVarB = AbstractC2649a.b(cVar, c1705k);
            } else if (iA == 2) {
                fVarI = AbstractC2652d.i(cVar, c1705k);
            } else if (iA == 3) {
                zT = cVar.t();
            } else if (iA != 4) {
                cVar.Y();
                cVar.R();
            } else {
                z8 = cVar.nextInt() == 3;
            }
        }
        return new b(strG, mVarB, fVarI, z8, zT);
    }
}
