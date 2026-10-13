package p103l3;

import p076i3.j;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29211a = c.a.a("nm", "mm", "hd");

    public static j a(c cVar) {
        String strG = null;
        boolean zT = false;
        j.a aVarB = null;
        while (cVar.o()) {
            int iA = cVar.A(f29211a);
            if (iA == 0) {
                strG = cVar.G();
            } else if (iA == 1) {
                aVarB = j.a.b(cVar.nextInt());
            } else if (iA != 2) {
                cVar.Y();
                cVar.R();
            } else {
                zT = cVar.t();
            }
        }
        return new j(strG, aVarB, zT);
    }
}
