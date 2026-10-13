package p109m0;

import B0.d;

/* JADX INFO: renamed from: m0.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2667e {
    public static final int b(d dVar, int i8) {
        int iS = dVar.s() - 1;
        int i9 = 0;
        while (i9 < iS) {
            int i10 = ((iS - i9) / 2) + i9;
            int iB = ((InterfaceC2666d.a) dVar.r()[i10]).b();
            if (iB != i8) {
                if (iB < i8) {
                    i9 = i10 + 1;
                    if (i8 < ((InterfaceC2666d.a) dVar.r()[i9]).b()) {
                    }
                } else {
                    iS = i10 - 1;
                }
            }
            return i10;
        }
        return i9;
    }
}
