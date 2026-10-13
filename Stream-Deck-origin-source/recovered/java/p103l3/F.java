package p103l3;

import io.jentz.winter.js.HRHLwtyqJWz;
import p004a3.C1705k;
import p067h3.b;
import p076i3.n;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29151a = c.a.a("nm", HRHLwtyqJWz.UoMiS, "hd");

    public static n a(c cVar, C1705k c1705k) {
        boolean zT = false;
        String strG = null;
        b bVarF = null;
        while (cVar.o()) {
            int iA = cVar.A(f29151a);
            if (iA == 0) {
                strG = cVar.G();
            } else if (iA == 1) {
                bVarF = AbstractC2652d.f(cVar, c1705k, true);
            } else if (iA != 2) {
                cVar.R();
            } else {
                zT = cVar.t();
            }
        }
        if (zT) {
            return null;
        }
        return new n(strG, bVarF);
    }
}
