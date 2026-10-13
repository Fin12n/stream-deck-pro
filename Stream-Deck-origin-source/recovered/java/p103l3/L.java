package p103l3;

import java.util.ArrayList;
import java.util.Collections;
import p004a3.C1705k;
import p067h3.a;
import p067h3.b;
import p067h3.d;
import p076i3.s;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class L {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29158a = c.a.a("nm", "c", "w", "o", "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.a f29159b = c.a.a("n", "v");

    /* JADX WARN: Multi-variable type inference failed */
    public static s a(c cVar, C1705k c1705k) {
        ArrayList arrayList = new ArrayList();
        String strG = null;
        s.b bVar = null;
        s.c cVar2 = null;
        Object obj = null;
        a aVarC = null;
        b bVarE = null;
        String str = null;
        float fNextDouble = 0.0f;
        boolean zT = false;
        d dVar = null;
        while (cVar.o()) {
            switch (cVar.A(f29158a)) {
                case 0:
                    strG = cVar.G();
                    break;
                case 1:
                    aVarC = AbstractC2652d.c(cVar, c1705k);
                    break;
                case 2:
                    bVarE = AbstractC2652d.e(cVar, c1705k);
                    break;
                case 3:
                    dVar = AbstractC2652d.h(cVar, c1705k);
                    break;
                case 4:
                    bVar = s.b.values()[cVar.nextInt() - 1];
                    break;
                case 5:
                    cVar2 = s.c.values()[cVar.nextInt() - 1];
                    break;
                case 6:
                    fNextDouble = (float) cVar.nextDouble();
                    break;
                case 7:
                    zT = cVar.t();
                    break;
                case 8:
                    cVar.c();
                    while (cVar.o()) {
                        cVar.x();
                        String strG2 = str;
                        Object objE = strG2;
                        while (cVar.o()) {
                            int iA = cVar.A(f29159b);
                            if (iA == 0) {
                                strG2 = cVar.G();
                            } else if (iA != 1) {
                                cVar.Y();
                                cVar.R();
                            } else {
                                objE = AbstractC2652d.e(cVar, c1705k);
                            }
                        }
                        cVar.u();
                        strG2.getClass();
                        switch (strG2) {
                            case "d":
                            case "g":
                                c1705k.v(true);
                                arrayList.add(objE);
                                break;
                            case "o":
                                obj = objE;
                                break;
                        }
                        str = null;
                    }
                    cVar.j();
                    if (arrayList.size() == 1) {
                        arrayList.add((b) arrayList.get(0));
                    }
                    break;
                default:
                    cVar.R();
                    continue;
            }
            str = null;
        }
        if (dVar == null) {
            dVar = new d(Collections.singletonList(new p130o3.a(100)));
        }
        if (bVar == null) {
            bVar = s.b.BUTT;
        }
        if (cVar2 == null) {
            cVar2 = s.c.MITER;
        }
        return new s(strG, obj, arrayList, aVarC, dVar, bVarE, bVar, cVar2, fNextDouble, zT);
    }
}
