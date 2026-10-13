package Q3;

import D6.C0938s;
import D6.r;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {
    public static final d a(d dVar, boolean z8, int i8, int i9) {
        t.g(dVar, "<this>");
        List listE = dVar.e();
        ArrayList arrayList = new ArrayList(C0938s.y(listE, 10));
        int i10 = 0;
        for (Object obj : listE) {
            int i11 = i10 + 1;
            if (i10 < 0) {
                r.x();
            }
            a aVarC = (a) obj;
            if (z8) {
                int iD = i10 / dVar.d();
                int iD2 = i10 % dVar.d();
                if (iD > i8 - 1 || iD2 > i9 - 1) {
                    if (!aVarC.i()) {
                        aVarC = a.c(aVarC, 0, null, null, null, null, true, 31, null);
                    }
                } else if (aVarC.i()) {
                    aVarC = a.c(aVarC, 0, null, null, null, null, false, 31, null);
                }
            } else if (aVarC.i()) {
                aVarC = a.c(aVarC, 0, null, null, null, null, false, 31, null);
            }
            arrayList.add(aVarC);
            i10 = i11;
        }
        return d.b(dVar, 0, 0, arrayList, 3, null);
    }

    public static /* synthetic */ d b(d dVar, boolean z8, int i8, int i9, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z8 = true;
        }
        if ((i10 & 2) != 0) {
            i8 = 2;
        }
        if ((i10 & 4) != 0) {
            i9 = 3;
        }
        return a(dVar, z8, i8, i9);
    }
}
