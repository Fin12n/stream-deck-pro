package p091k0;

import D6.r;
import D6.z;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class g {
    public static final t a(List list, u uVar, List list2, int i8, int i9, int i10) {
        int index = ((t) z.i0(list)).getIndex();
        int size = list2.size();
        int iIntValue = -1;
        int iIntValue2 = -1;
        int i11 = 0;
        while (i11 < size && ((Number) list2.get(i11)).intValue() <= index) {
            iIntValue = ((Number) list2.get(i11)).intValue();
            i11++;
            iIntValue2 = ((Number) ((i11 < 0 || i11 > r.p(list2)) ? -1 : list2.get(i11))).intValue();
        }
        int size2 = list.size();
        int offset = Integer.MIN_VALUE;
        int offset2 = Integer.MIN_VALUE;
        int i12 = -1;
        for (int i13 = 0; i13 < size2; i13++) {
            t tVar = (t) list.get(i13);
            if (tVar.getIndex() == iIntValue) {
                offset = tVar.getOffset();
                i12 = i13;
            } else if (tVar.getIndex() == iIntValue2) {
                offset2 = tVar.getOffset();
            }
        }
        if (iIntValue == -1) {
            return null;
        }
        t tVarB = uVar.b(iIntValue);
        tVarB.o(true);
        int iMax = offset != Integer.MIN_VALUE ? Math.max(-i8, offset) : -i8;
        if (offset2 != Integer.MIN_VALUE) {
            iMax = Math.min(iMax, offset2 - tVarB.k());
        }
        tVarB.n(iMax, i9, i10);
        if (i12 != -1) {
            list.set(i12, tVarB);
            return tVarB;
        }
        list.add(0, tVarB);
        return tVarB;
    }
}
