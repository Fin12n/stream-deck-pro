package p103l3;

import com.elgato.streamdeck.vsd2.KnownHost;
import p004a3.C1705k;
import p112m3.c;
import p121n3.d;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: renamed from: l3.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2656h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c.a f29170a = c.a.a("ty", "d");

    public static p076i3.c a(c cVar, C1705k c1705k) {
        p076i3.c cVarA;
        String strG;
        cVar.x();
        byte b8 = 2;
        int iNextInt = 2;
        while (true) {
            cVarA = null;
            if (cVar.o()) {
                int iA = cVar.A(f29170a);
                if (iA != 0) {
                    if (iA != 1) {
                        cVar.Y();
                        cVar.R();
                    } else {
                        iNextInt = cVar.nextInt();
                    }
                } else {
                    strG = cVar.G();
                    break;
                }
            } else {
                strG = null;
                break;
            }
        }
        if (strG == null) {
            return null;
        }
        switch (strG.hashCode()) {
            case 3239:
                b8 = !strG.equals("el") ? (byte) -1 : (byte) 0;
                break;
            case 3270:
                b8 = !strG.equals("fl") ? (byte) -1 : (byte) 1;
                break;
            case 3295:
                if (!strG.equals("gf")) {
                    b8 = -1;
                }
                break;
            case 3307:
                b8 = !strG.equals("gr") ? (byte) -1 : (byte) 3;
                break;
            case 3308:
                b8 = !strG.equals("gs") ? (byte) -1 : (byte) 4;
                break;
            case 3488:
                b8 = !strG.equals("mm") ? (byte) -1 : (byte) 5;
                break;
            case 3633:
                b8 = !strG.equals("rc") ? (byte) -1 : (byte) 6;
                break;
            case 3634:
                b8 = !strG.equals("rd") ? (byte) -1 : (byte) 7;
                break;
            case 3646:
                b8 = !strG.equals("rp") ? (byte) -1 : (byte) 8;
                break;
            case 3669:
                b8 = !strG.equals("sh") ? (byte) -1 : (byte) 9;
                break;
            case 3679:
                b8 = !strG.equals("sr") ? (byte) -1 : (byte) 10;
                break;
            case 3681:
                b8 = !strG.equals("st") ? (byte) -1 : (byte) 11;
                break;
            case 3705:
                b8 = !strG.equals("tm") ? (byte) -1 : (byte) 12;
                break;
            case 3710:
                b8 = !strG.equals("tr") ? (byte) -1 : (byte) 13;
                break;
            default:
                b8 = -1;
                break;
        }
        switch (b8) {
            case 0:
                cVarA = AbstractC2654f.a(cVar, c1705k, iNextInt);
                break;
            case 1:
                cVarA = I.a(cVar, c1705k);
                break;
            case 2:
                cVarA = p.a(cVar, c1705k);
                break;
            case 3:
                cVarA = J.a(cVar, c1705k);
                break;
            case 4:
                cVarA = q.a(cVar, c1705k);
                break;
            case 5:
                cVarA = y.a(cVar);
                c1705k.a("Animation contains merge paths. Merge paths are only supported on KitKat+ and must be manually enabled by calling enableMergePathsForKitKatAndAbove().");
                break;
            case 6:
                cVarA = D.a(cVar, c1705k);
                break;
            case 7:
                cVarA = F.a(cVar, c1705k);
                break;
            case 8:
                cVarA = E.a(cVar, c1705k);
                break;
            case 9:
                cVarA = K.a(cVar, c1705k);
                break;
            case 10:
                cVarA = C.a(cVar, c1705k, iNextInt);
                break;
            case 11:
                cVarA = L.a(cVar, c1705k);
                break;
            case 12:
                cVarA = M.a(cVar, c1705k);
                break;
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
                cVarA = AbstractC2651c.g(cVar, c1705k);
                break;
            default:
                d.c(BpgIURjN.fMX + strG);
                break;
        }
        while (cVar.o()) {
            cVar.R();
        }
        cVar.u();
        return cVarA;
    }
}
