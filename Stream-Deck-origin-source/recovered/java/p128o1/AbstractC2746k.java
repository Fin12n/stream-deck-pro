package p128o1;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: o1.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2746k {
    public static final List b(List list, int i8, int i9) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            C2739d.b bVar = (C2739d.b) obj;
            if (AbstractC2740e.l(i8, i9, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C2739d.b bVar2 = (C2739d.b) arrayList.get(i11);
            if (i8 > bVar2.f() || bVar2.d() > i9) {
                throw new IllegalArgumentException("placeholder can not overlap with paragraph.");
            }
            arrayList2.add(new C2739d.b(bVar2.e(), bVar2.f() - i8, bVar2.d() - i8));
        }
        return arrayList2;
    }
}
