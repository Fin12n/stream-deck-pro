package p103l3;

import p004a3.C1705k;
import p067h3.d;
import p067h3.h;
import p076i3.i;
import p112m3.c;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class x {
    public static i a(c cVar, C1705k c1705k) {
        cVar.x();
        i.a aVar = null;
        h hVarK = null;
        d dVarH = null;
        boolean zT = false;
        while (cVar.o()) {
            String strF0 = cVar.F0();
            strF0.getClass();
            switch (strF0) {
                case "o":
                    dVarH = AbstractC2652d.h(cVar, c1705k);
                    break;
                case "pt":
                    hVarK = AbstractC2652d.k(cVar, c1705k);
                    break;
                case "inv":
                    zT = cVar.t();
                    break;
                case "mode":
                    String strG = cVar.G();
                    strG.getClass();
                    switch (strG) {
                        case "a":
                            aVar = i.a.MASK_MODE_ADD;
                            break;
                        case "i":
                            c1705k.a("Animation contains intersect masks. They are not supported but will be treated like add masks.");
                            aVar = i.a.MASK_MODE_INTERSECT;
                            break;
                        case "n":
                            aVar = i.a.MASK_MODE_NONE;
                            break;
                        case "s":
                            aVar = i.a.MASK_MODE_SUBTRACT;
                            break;
                        default:
                            p121n3.d.c("Unknown mask mode " + strF0 + ". Defaulting to Add.");
                            aVar = i.a.MASK_MODE_ADD;
                            break;
                    }
                    break;
                default:
                    cVar.R();
                    break;
            }
        }
        cVar.u();
        return new i(aVar, hVarK, dVarH, zT);
    }
}
