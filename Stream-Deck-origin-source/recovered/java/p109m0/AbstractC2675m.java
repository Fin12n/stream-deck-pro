package p109m0;

import D6.r;
import W6.i;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: m0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2675m {
    public static final List a(q qVar, A a8, C2671i c2671i) {
        if (!c2671i.d() && a8.isEmpty()) {
            return r.n();
        }
        ArrayList arrayList = new ArrayList();
        i iVar = c2671i.d() ? new i(c2671i.c(), Math.min(c2671i.b(), qVar.d() - 1)) : i.f11513e.a();
        int size = a8.size();
        for (int i8 = 0; i8 < size; i8++) {
            A.a aVar = (A.a) a8.get(i8);
            int iA = r.a(qVar, aVar.getKey(), aVar.getIndex());
            int iS = iVar.s();
            if ((iA > iVar.t() || iS > iA) && iA >= 0 && iA < qVar.d()) {
                arrayList.add(Integer.valueOf(iA));
            }
        }
        int iS2 = iVar.s();
        int iT = iVar.t();
        if (iS2 <= iT) {
            while (true) {
                arrayList.add(Integer.valueOf(iS2));
                if (iS2 == iT) {
                    break;
                }
                iS2++;
            }
        }
        return arrayList;
    }
}
