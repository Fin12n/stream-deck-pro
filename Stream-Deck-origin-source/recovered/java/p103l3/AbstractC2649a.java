package p103l3;

import java.util.ArrayList;
import p004a3.C1705k;
import p067h3.b;
import p067h3.e;
import p067h3.i;
import p067h3.m;
import p112m3.c;
import p121n3.j;
import p130o3.a;

/* JADX INFO: renamed from: l3.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2649a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29161a = c.a.a("k", "x", "y");

    public static e a(c cVar, C1705k c1705k) {
        ArrayList arrayList = new ArrayList();
        if (cVar.y() == c.b.BEGIN_ARRAY) {
            cVar.c();
            while (cVar.o()) {
                arrayList.add(z.a(cVar, c1705k));
            }
            cVar.j();
            u.b(arrayList);
        } else {
            arrayList.add(new a(s.e(cVar, j.e())));
        }
        return new e(arrayList);
    }

    public static m b(c cVar, C1705k c1705k) {
        cVar.x();
        e eVarA = null;
        b bVarE = null;
        boolean z8 = false;
        b bVarE2 = null;
        while (cVar.y() != c.b.END_OBJECT) {
            int iA = cVar.A(f29161a);
            if (iA == 0) {
                eVarA = a(cVar, c1705k);
            } else if (iA != 1) {
                if (iA != 2) {
                    cVar.Y();
                    cVar.R();
                } else if (cVar.y() == c.b.STRING) {
                    cVar.R();
                    z8 = true;
                } else {
                    bVarE = AbstractC2652d.e(cVar, c1705k);
                }
            } else if (cVar.y() == c.b.STRING) {
                cVar.R();
                z8 = true;
            } else {
                bVarE2 = AbstractC2652d.e(cVar, c1705k);
            }
        }
        cVar.u();
        if (z8) {
            c1705k.a("Lottie doesn't support expressions.");
        }
        return eVarA != null ? eVarA : new i(bVarE2, bVarE);
    }
}
