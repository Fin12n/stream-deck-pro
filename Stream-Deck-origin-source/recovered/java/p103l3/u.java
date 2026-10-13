package p103l3;

import java.util.ArrayList;
import java.util.List;
import p004a3.C1705k;
import p031d3.i;
import p112m3.c;
import p130o3.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static c.a f29202a = c.a.a("k");

    public static List a(c cVar, C1705k c1705k, float f8, N n8, boolean z8) {
        c cVar2;
        C1705k c1705k2;
        float f9;
        N n9;
        boolean z9;
        ArrayList arrayList = new ArrayList();
        if (cVar.y() == c.b.STRING) {
            c1705k.a("Lottie doesn't support expressions.");
            return arrayList;
        }
        cVar.x();
        while (cVar.o()) {
            if (cVar.A(f29202a) != 0) {
                cVar.R();
            } else if (cVar.y() == c.b.BEGIN_ARRAY) {
                cVar.c();
                if (cVar.y() == c.b.NUMBER) {
                    c cVar3 = cVar;
                    C1705k c1705k3 = c1705k;
                    float f10 = f8;
                    N n10 = n8;
                    boolean z10 = z8;
                    a aVarC = t.c(cVar3, c1705k3, f10, n10, false, z10);
                    cVar2 = cVar3;
                    c1705k2 = c1705k3;
                    f9 = f10;
                    n9 = n10;
                    z9 = z10;
                    arrayList.add(aVarC);
                } else {
                    cVar2 = cVar;
                    c1705k2 = c1705k;
                    f9 = f8;
                    n9 = n8;
                    z9 = z8;
                    while (cVar2.o()) {
                        arrayList.add(t.c(cVar2, c1705k2, f9, n9, true, z9));
                    }
                }
                cVar2.j();
                cVar = cVar2;
                c1705k = c1705k2;
                f8 = f9;
                n8 = n9;
                z8 = z9;
            } else {
                c cVar4 = cVar;
                arrayList.add(t.c(cVar4, c1705k, f8, n8, false, z8));
                cVar = cVar4;
            }
        }
        cVar.u();
        b(arrayList);
        return arrayList;
    }

    public static void b(List list) {
        int i8;
        Object obj;
        int size = list.size();
        int i9 = 0;
        while (true) {
            i8 = size - 1;
            if (i9 >= i8) {
                break;
            }
            a aVar = (a) list.get(i9);
            i9++;
            a aVar2 = (a) list.get(i9);
            aVar.f30878h = Float.valueOf(aVar2.f30877g);
            if (aVar.f30873c == null && (obj = aVar2.f30872b) != null) {
                aVar.f30873c = obj;
                if (aVar instanceof i) {
                    ((i) aVar).j();
                }
            }
        }
        a aVar3 = (a) list.get(i8);
        if ((aVar3.f30872b == null || aVar3.f30873c == null) && list.size() > 1) {
            list.remove(aVar3);
        }
    }
}
