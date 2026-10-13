package p103l3;

import android.graphics.Path;
import java.util.Collections;
import p004a3.C1705k;
import p067h3.d;
import p067h3.f;
import p076i3.e;
import p076i3.g;
import p112m3.c;
import p130o3.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29190a = c.a.a("nm", "g", "o", "t", "s", "e", "r", "hd");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.a f29191b = c.a.a("p", "k");

    public static e a(c cVar, C1705k c1705k) {
        d dVar = null;
        Path.FillType fillType = Path.FillType.WINDING;
        String strG = null;
        g gVar = null;
        p067h3.c cVarG = null;
        f fVarI = null;
        f fVarI2 = null;
        boolean zT = false;
        while (cVar.o()) {
            switch (cVar.A(f29190a)) {
                case 0:
                    strG = cVar.G();
                    break;
                case 1:
                    cVar.x();
                    int iNextInt = -1;
                    while (cVar.o()) {
                        int iA = cVar.A(f29191b);
                        if (iA == 0) {
                            iNextInt = cVar.nextInt();
                        } else if (iA != 1) {
                            cVar.Y();
                            cVar.R();
                        } else {
                            cVarG = AbstractC2652d.g(cVar, c1705k, iNextInt);
                        }
                    }
                    cVar.u();
                    break;
                case 2:
                    dVar = AbstractC2652d.h(cVar, c1705k);
                    break;
                case 3:
                    gVar = cVar.nextInt() == 1 ? g.LINEAR : g.RADIAL;
                    break;
                case 4:
                    fVarI = AbstractC2652d.i(cVar, c1705k);
                    break;
                case 5:
                    fVarI2 = AbstractC2652d.i(cVar, c1705k);
                    break;
                case 6:
                    fillType = cVar.nextInt() == 1 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD;
                    break;
                case 7:
                    zT = cVar.t();
                    break;
                default:
                    cVar.Y();
                    cVar.R();
                    break;
            }
        }
        if (dVar == null) {
            dVar = new d(Collections.singletonList(new a(100)));
        }
        return new e(strG, gVar, fillType, cVarG, dVar, fVarI, fVarI2, null, null, zT);
    }
}
