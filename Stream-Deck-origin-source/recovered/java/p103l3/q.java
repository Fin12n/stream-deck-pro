package p103l3;

import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import java.util.ArrayList;
import java.util.Collections;
import p004a3.C1705k;
import p067h3.b;
import p067h3.d;
import p076i3.f;
import p076i3.g;
import p076i3.s;
import p112m3.c;
import p130o3.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29192a = c.a.a("nm", cFAYKUlMj.iZoiMsEU, "o", "t", "s", "e", uYOhHhTXuF.aZBvqYAlUP, "lc", "lj", "ml", "hd", "d");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.a f29193b = c.a.a("p", "k");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c.a f29194c = c.a.a("n", "v");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0027. Please report as an issue. */
    public static f a(c cVar, C1705k c1705k) {
        d dVar;
        ArrayList arrayList = new ArrayList();
        g gVar = null;
        String strG = null;
        p067h3.c cVarG = null;
        p067h3.f fVarI = null;
        p067h3.f fVarI2 = null;
        b bVarE = null;
        s.b bVar = null;
        s.c cVar2 = null;
        b bVar2 = null;
        float fNextDouble = 0.0f;
        boolean zT = false;
        d dVarH = null;
        while (cVar.o()) {
            g gVar2 = gVar;
            switch (cVar.A(f29192a)) {
                case 0:
                    strG = cVar.G();
                    gVar = gVar2;
                    break;
                case 1:
                    dVar = dVarH;
                    cVar.x();
                    int iNextInt = -1;
                    while (cVar.o()) {
                        int iA = cVar.A(f29193b);
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
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 2:
                    dVarH = AbstractC2652d.h(cVar, c1705k);
                    gVar = gVar2;
                    break;
                case 3:
                    dVar = dVarH;
                    gVar = cVar.nextInt() == 1 ? g.LINEAR : g.RADIAL;
                    dVarH = dVar;
                    break;
                case 4:
                    fVarI = AbstractC2652d.i(cVar, c1705k);
                    gVar = gVar2;
                    break;
                case 5:
                    fVarI2 = AbstractC2652d.i(cVar, c1705k);
                    gVar = gVar2;
                    break;
                case 6:
                    bVarE = AbstractC2652d.e(cVar, c1705k);
                    gVar = gVar2;
                    break;
                case 7:
                    dVar = dVarH;
                    bVar = s.b.values()[cVar.nextInt() - 1];
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 8:
                    dVar = dVarH;
                    cVar2 = s.c.values()[cVar.nextInt() - 1];
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 9:
                    dVar = dVarH;
                    fNextDouble = (float) cVar.nextDouble();
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                case 10:
                    zT = cVar.t();
                    gVar = gVar2;
                    break;
                case 11:
                    cVar.c();
                    while (cVar.o()) {
                        cVar.x();
                        String strG2 = null;
                        b bVarE2 = null;
                        while (cVar.o()) {
                            int iA2 = cVar.A(f29194c);
                            if (iA2 != 0) {
                                d dVar2 = dVarH;
                                if (iA2 != 1) {
                                    cVar.Y();
                                    cVar.R();
                                } else {
                                    bVarE2 = AbstractC2652d.e(cVar, c1705k);
                                }
                                dVarH = dVar2;
                            } else {
                                strG2 = cVar.G();
                            }
                        }
                        d dVar3 = dVarH;
                        cVar.u();
                        if (strG2.equals("o")) {
                            bVar2 = bVarE2;
                        } else {
                            if (strG2.equals("d") || strG2.equals("g")) {
                                c1705k.v(true);
                                arrayList.add(bVarE2);
                            }
                            dVarH = dVar3;
                        }
                        dVarH = dVar3;
                    }
                    dVar = dVarH;
                    cVar.j();
                    if (arrayList.size() == 1) {
                        arrayList.add((b) arrayList.get(0));
                    }
                    gVar = gVar2;
                    dVarH = dVar;
                    break;
                default:
                    cVar.Y();
                    cVar.R();
                    gVar = gVar2;
                    break;
            }
        }
        d dVar4 = dVarH;
        return new f(strG, gVar, cVarG, dVar4 == null ? new d(Collections.singletonList(new a(100))) : dVar4, fVarI, fVarI2, bVarE, bVar, cVar2, fNextDouble, arrayList, bVar2, zT);
    }
}
