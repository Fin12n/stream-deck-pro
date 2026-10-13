package p166t;

import A.C0904x;
import p174u.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class Y0 {
    public static C0904x a(e eVar) {
        int iD = eVar.d();
        int i8 = 1;
        if (iD != 1) {
            i8 = 2;
            if (iD != 2) {
                i8 = 3;
                if (iD != 3) {
                    i8 = 4;
                    if (iD != 4) {
                        i8 = 5;
                        if (iD != 5) {
                            i8 = iD != 10001 ? 0 : 6;
                        }
                    }
                }
            }
        }
        return new C0904x(i8, eVar);
    }
}
