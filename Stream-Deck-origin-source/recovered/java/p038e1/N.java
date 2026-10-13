package p038e1;

import A1.c;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface N {
    default int a(InterfaceC2244o interfaceC2244o, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            List list2 = (List) list.get(i9);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(new C2237h((InterfaceC2243n) list2.get(i10), EnumC2245p.Max, EnumC2246q.Width));
            }
            arrayList.add(arrayList2);
        }
        return d(new r(interfaceC2244o, interfaceC2244o.getLayoutDirection()), arrayList, c.b(0, 0, 0, i8, 7, null)).g();
    }

    default int b(InterfaceC2244o interfaceC2244o, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            List list2 = (List) list.get(i9);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(new C2237h((InterfaceC2243n) list2.get(i10), EnumC2245p.Min, EnumC2246q.Width));
            }
            arrayList.add(arrayList2);
        }
        return d(new r(interfaceC2244o, interfaceC2244o.getLayoutDirection()), arrayList, c.b(0, 0, 0, i8, 7, null)).g();
    }

    default int c(InterfaceC2244o interfaceC2244o, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            List list2 = (List) list.get(i9);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(new C2237h((InterfaceC2243n) list2.get(i10), EnumC2245p.Max, EnumC2246q.Height));
            }
            arrayList.add(arrayList2);
        }
        return d(new r(interfaceC2244o, interfaceC2244o.getLayoutDirection()), arrayList, c.b(0, i8, 0, 0, 13, null)).f();
    }

    I d(J j8, List list, long j9);

    default int e(InterfaceC2244o interfaceC2244o, List list, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i9 = 0; i9 < size; i9++) {
            List list2 = (List) list.get(i9);
            ArrayList arrayList2 = new ArrayList(list2.size());
            int size2 = list2.size();
            for (int i10 = 0; i10 < size2; i10++) {
                arrayList2.add(new C2237h((InterfaceC2243n) list2.get(i10), EnumC2245p.Min, EnumC2246q.Height));
            }
            arrayList.add(arrayList2);
        }
        return d(new r(interfaceC2244o, interfaceC2244o.getLayoutDirection()), arrayList, c.b(0, i8, 0, 0, 13, null)).f();
    }
}
