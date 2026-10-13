package p103l3;

import android.graphics.Path;
import java.util.Collections;
import p004a3.C1705k;
import p067h3.a;
import p067h3.d;
import p076i3.p;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29155a = c.a.a("nm", "c", "o", "fillEnabled", "r", "hd");

    public static p a(c cVar, C1705k c1705k) {
        d dVar = null;
        String strG = null;
        a aVarC = null;
        boolean zT = false;
        boolean zT2 = false;
        int iNextInt = 1;
        while (cVar.o()) {
            int iA = cVar.A(f29155a);
            if (iA == 0) {
                strG = cVar.G();
            } else if (iA == 1) {
                aVarC = AbstractC2652d.c(cVar, c1705k);
            } else if (iA == 2) {
                dVar = AbstractC2652d.h(cVar, c1705k);
            } else if (iA == 3) {
                zT = cVar.t();
            } else if (iA == 4) {
                iNextInt = cVar.nextInt();
            } else if (iA != 5) {
                cVar.Y();
                cVar.R();
            } else {
                zT2 = cVar.t();
            }
        }
        if (dVar == null) {
            dVar = new d(Collections.singletonList(new p130o3.a(100)));
        }
        return new p(strG, zT, iNextInt == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD, aVarC, dVar, zT2);
    }
}
