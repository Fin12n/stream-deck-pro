package p103l3;

import p112m3.c;

/* JADX INFO: renamed from: l3.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2662n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29188a = c.a.a("fFamily", "fName", "fStyle", "ascent");

    public static p058g3.c a(c cVar) {
        cVar.x();
        String strG = null;
        String strG2 = null;
        float fNextDouble = 0.0f;
        String strG3 = null;
        while (cVar.o()) {
            int iA = cVar.A(f29188a);
            if (iA == 0) {
                strG = cVar.G();
            } else if (iA == 1) {
                strG3 = cVar.G();
            } else if (iA == 2) {
                strG2 = cVar.G();
            } else if (iA != 3) {
                cVar.Y();
                cVar.R();
            } else {
                fNextDouble = (float) cVar.nextDouble();
            }
        }
        cVar.u();
        return new p058g3.c(strG, strG3, strG2, fNextDouble);
    }
}
