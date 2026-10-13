package p103l3;

import java.util.ArrayList;
import p004a3.C1705k;
import p058g3.d;
import p076i3.q;
import p112m3.c;

/* JADX INFO: renamed from: l3.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2661m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29186a = c.a.a("ch", "size", "w", "style", "fFamily", "data");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.a f29187b = c.a.a("shapes");

    public static d a(c cVar, C1705k c1705k) {
        ArrayList arrayList = new ArrayList();
        cVar.x();
        double dNextDouble = 0.0d;
        String strG = null;
        String strG2 = null;
        char cCharAt = 0;
        double dNextDouble2 = 0.0d;
        while (cVar.o()) {
            int iA = cVar.A(f29186a);
            if (iA == 0) {
                cCharAt = cVar.G().charAt(0);
            } else if (iA == 1) {
                dNextDouble2 = cVar.nextDouble();
            } else if (iA == 2) {
                dNextDouble = cVar.nextDouble();
            } else if (iA == 3) {
                strG = cVar.G();
            } else if (iA == 4) {
                strG2 = cVar.G();
            } else if (iA != 5) {
                cVar.Y();
                cVar.R();
            } else {
                cVar.x();
                while (cVar.o()) {
                    if (cVar.A(f29187b) != 0) {
                        cVar.Y();
                        cVar.R();
                    } else {
                        cVar.c();
                        while (cVar.o()) {
                            arrayList.add((q) AbstractC2656h.a(cVar, c1705k));
                        }
                        cVar.j();
                    }
                }
                cVar.u();
            }
        }
        cVar.u();
        return new d(arrayList, cCharAt, dNextDouble2, dNextDouble, strG, strG2);
    }
}
