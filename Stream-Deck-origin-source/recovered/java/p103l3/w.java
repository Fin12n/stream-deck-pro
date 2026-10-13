package p103l3;

import android.graphics.Rect;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p004a3.C1705k;
import p004a3.K;
import p010b0.D;
import p010b0.m;
import p058g3.d;
import p058g3.h;
import p085j3.e;
import p112m3.c;
import p121n3.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29207a = c.a.a("w", "h", "ip", "op", "fr", "v", "layers", "assets", "fonts", "chars", "markers");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static c.a f29208b = c.a.a("id", "layers", "w", "h", "p", "u");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final c.a f29209c = c.a.a("list");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final c.a f29210d = c.a.a("cm", "tm", "dr");

    /* JADX WARN: Failed to find 'out' block for switch in B:6:0x0044. Please report as an issue. */
    public static C1705k a(c cVar) {
        cVar = cVar;
        float fE = j.e();
        m mVar = new m();
        ArrayList arrayList = new ArrayList();
        HashMap map = new HashMap();
        HashMap map2 = new HashMap();
        HashMap map3 = new HashMap();
        ArrayList arrayList2 = new ArrayList();
        D d8 = new D();
        C1705k c1705k = new C1705k();
        cVar.x();
        float fNextDouble = 0.0f;
        float fNextDouble2 = 0.0f;
        float fNextDouble3 = 0.0f;
        int iNextInt = 0;
        int iNextInt2 = 0;
        while (cVar.o()) {
            switch (cVar.A(f29207a)) {
                case 0:
                    iNextInt = cVar.nextInt();
                    break;
                case 1:
                    iNextInt2 = cVar.nextInt();
                    break;
                case 2:
                    fNextDouble = (float) cVar.nextDouble();
                    fE = fE;
                    break;
                case 3:
                    fNextDouble2 = ((float) cVar.nextDouble()) - 0.01f;
                    fE = fE;
                    break;
                case 4:
                    fNextDouble3 = (float) cVar.nextDouble();
                    fE = fE;
                    break;
                case 5:
                    String[] strArrSplit = cVar.G().split("\\.");
                    if (!j.j(Integer.parseInt(strArrSplit[0]), Integer.parseInt(strArrSplit[1]), Integer.parseInt(strArrSplit[2]), 4, 4, 0)) {
                        c1705k.a("Lottie only supports bodymovin >= 4.4.0");
                    }
                    break;
                case 6:
                    e(cVar, c1705k, arrayList, mVar);
                    break;
                case 7:
                    b(cVar, c1705k, map, map2);
                    break;
                case 8:
                    d(cVar, map3);
                    break;
                case 9:
                    c(cVar, c1705k, d8);
                    break;
                case 10:
                    f(cVar, arrayList2);
                    break;
                default:
                    cVar.Y();
                    cVar.R();
                    break;
            }
        }
        float f8 = fE;
        c1705k.t(new Rect(0, 0, (int) (iNextInt * f8), (int) (iNextInt2 * f8)), fNextDouble, fNextDouble2, fNextDouble3, arrayList, mVar, map, map2, j.e(), d8, map3, arrayList2);
        return c1705k;
    }

    public static void b(c cVar, C1705k c1705k, Map map, Map map2) {
        cVar.c();
        while (cVar.o()) {
            ArrayList arrayList = new ArrayList();
            m mVar = new m();
            cVar.x();
            int iNextInt = 0;
            int iNextInt2 = 0;
            String strG = null;
            String strG2 = null;
            String strG3 = null;
            while (cVar.o()) {
                int iA = cVar.A(f29208b);
                if (iA == 0) {
                    strG = cVar.G();
                } else if (iA == 1) {
                    cVar.c();
                    while (cVar.o()) {
                        e eVarB = v.b(cVar, c1705k);
                        mVar.i(eVarB.e(), eVarB);
                        arrayList.add(eVarB);
                    }
                    cVar.j();
                } else if (iA == 2) {
                    iNextInt = cVar.nextInt();
                } else if (iA == 3) {
                    iNextInt2 = cVar.nextInt();
                } else if (iA == 4) {
                    strG2 = cVar.G();
                } else if (iA != 5) {
                    cVar.Y();
                    cVar.R();
                } else {
                    strG3 = cVar.G();
                }
            }
            cVar.u();
            if (strG2 != null) {
                K k8 = new K(iNextInt, iNextInt2, strG, strG2, strG3);
                map2.put(k8.e(), k8);
            } else {
                map.put(strG, arrayList);
            }
        }
        cVar.j();
    }

    public static void c(c cVar, C1705k c1705k, D d8) {
        cVar.c();
        while (cVar.o()) {
            d dVarA = AbstractC2661m.a(cVar, c1705k);
            d8.i(dVarA.hashCode(), dVarA);
        }
        cVar.j();
    }

    public static void d(c cVar, Map map) {
        cVar.x();
        while (cVar.o()) {
            if (cVar.A(f29209c) != 0) {
                cVar.Y();
                cVar.R();
            } else {
                cVar.c();
                while (cVar.o()) {
                    p058g3.c cVarA = AbstractC2662n.a(cVar);
                    map.put(cVarA.b(), cVarA);
                }
                cVar.j();
            }
        }
        cVar.u();
    }

    public static void e(c cVar, C1705k c1705k, List list, m mVar) {
        cVar.c();
        int i8 = 0;
        while (cVar.o()) {
            e eVarB = v.b(cVar, c1705k);
            if (eVarB.g() == e.a.IMAGE) {
                i8++;
            }
            list.add(eVarB);
            mVar.i(eVarB.e(), eVarB);
            if (i8 > 4) {
                p121n3.d.c("You have " + i8 + " images. Lottie should primarily be used with shapes. If you are using Adobe Illustrator, convert the Illustrator layers to shape layers.");
            }
        }
        cVar.j();
    }

    public static void f(c cVar, List list) {
        cVar.c();
        while (cVar.o()) {
            cVar.x();
            float fNextDouble = 0.0f;
            String strG = null;
            float fNextDouble2 = 0.0f;
            while (cVar.o()) {
                int iA = cVar.A(f29210d);
                if (iA == 0) {
                    strG = cVar.G();
                } else if (iA == 1) {
                    fNextDouble = (float) cVar.nextDouble();
                } else if (iA != 2) {
                    cVar.Y();
                    cVar.R();
                } else {
                    fNextDouble2 = (float) cVar.nextDouble();
                }
            }
            cVar.u();
            list.add(new h(strG, fNextDouble, fNextDouble2));
        }
        cVar.j();
    }
}
