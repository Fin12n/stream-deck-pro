package p103l3;

import p004a3.C1705k;
import p076i3.a;
import p112m3.c;

/* JADX INFO: renamed from: l3.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2653e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29166a = c.a.a("ef");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c.a f29167b = c.a.a("ty", "v");

    public static a a(c cVar, C1705k c1705k) {
        cVar.x();
        a aVar = null;
        while (true) {
            boolean z8 = false;
            while (true) {
                if (!cVar.o()) {
                    cVar.u();
                    return aVar;
                }
                int iA = cVar.A(f29167b);
                if (iA != 0) {
                    if (iA != 1) {
                        cVar.Y();
                        cVar.R();
                    } else if (z8) {
                        aVar = new a(AbstractC2652d.e(cVar, c1705k));
                    } else {
                        cVar.R();
                    }
                } else if (cVar.nextInt() == 0) {
                    z8 = true;
                }
            }
        }
    }

    public static a b(c cVar, C1705k c1705k) {
        a aVar = null;
        while (cVar.o()) {
            if (cVar.A(f29166a) != 0) {
                cVar.Y();
                cVar.R();
            } else {
                cVar.c();
                while (cVar.o()) {
                    a aVarA = a(cVar, c1705k);
                    if (aVarA != null) {
                        aVar = aVarA;
                    }
                }
                cVar.j();
            }
        }
        return aVar;
    }
}
