package p103l3;

import java.util.ArrayList;
import p004a3.C1705k;
import p076i3.q;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class J {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29156a = c.a.a("nm", "hd", "it");

    public static q a(c cVar, C1705k c1705k) {
        ArrayList arrayList = new ArrayList();
        String strG = null;
        boolean zT = false;
        while (cVar.o()) {
            int iA = cVar.A(f29156a);
            if (iA == 0) {
                strG = cVar.G();
            } else if (iA == 1) {
                zT = cVar.t();
            } else if (iA != 2) {
                cVar.R();
            } else {
                cVar.c();
                while (cVar.o()) {
                    p076i3.c cVarA = AbstractC2656h.a(cVar, c1705k);
                    if (cVarA != null) {
                        arrayList.add(cVarA);
                    }
                }
                cVar.j();
            }
        }
        return new q(strG, arrayList, zT);
    }
}
