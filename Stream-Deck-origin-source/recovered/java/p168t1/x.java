package p168t1;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class x {
    public final List a(List list, C c8, int i8) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        int i9 = 0;
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            InterfaceC3008m interfaceC3008m = (InterfaceC3008m) obj;
            if (t.c(interfaceC3008m.b(), c8) && y.f(interfaceC3008m.c(), i8)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(list.size());
        int size2 = list.size();
        for (int i11 = 0; i11 < size2; i11++) {
            Object obj2 = list.get(i11);
            if (y.f(((InterfaceC3008m) obj2).c(), i8)) {
                arrayList2.add(obj2);
            }
        }
        if (!arrayList2.isEmpty()) {
            list = arrayList2;
        }
        C.a aVar = C.f33980b;
        C c9 = null;
        if (c8.compareTo(aVar.d()) < 0) {
            int size3 = list.size();
            C c10 = null;
            for (int i12 = 0; i12 < size3; i12++) {
                C cB = ((InterfaceC3008m) list.get(i12)).b();
                if (cB.compareTo(c8) >= 0) {
                    if (cB.compareTo(c8) <= 0) {
                        c10 = cB;
                        c9 = c10;
                        break;
                    }
                    if (c10 == null || cB.compareTo(c10) < 0) {
                        c10 = cB;
                    }
                } else if (c9 == null || cB.compareTo(c9) > 0) {
                    c9 = cB;
                }
            }
            if (c9 != null) {
                c10 = c9;
            }
            ArrayList arrayList3 = new ArrayList(list.size());
            int size4 = list.size();
            while (i9 < size4) {
                Object obj3 = list.get(i9);
                if (t.c(((InterfaceC3008m) obj3).b(), c10)) {
                    arrayList3.add(obj3);
                }
                i9++;
            }
            return arrayList3;
        }
        if (c8.compareTo(aVar.e()) > 0) {
            int size5 = list.size();
            C c11 = null;
            for (int i13 = 0; i13 < size5; i13++) {
                C cB2 = ((InterfaceC3008m) list.get(i13)).b();
                if (cB2.compareTo(c8) >= 0) {
                    if (cB2.compareTo(c8) <= 0) {
                        c11 = cB2;
                        c9 = c11;
                        break;
                    }
                    if (c11 == null || cB2.compareTo(c11) < 0) {
                        c11 = cB2;
                    }
                } else if (c9 == null || cB2.compareTo(c9) > 0) {
                    c9 = cB2;
                }
            }
            if (c11 == null) {
                c11 = c9;
            }
            ArrayList arrayList4 = new ArrayList(list.size());
            int size6 = list.size();
            while (i9 < size6) {
                Object obj4 = list.get(i9);
                if (t.c(((InterfaceC3008m) obj4).b(), c11)) {
                    arrayList4.add(obj4);
                }
                i9++;
            }
            return arrayList4;
        }
        C cE = aVar.e();
        int size7 = list.size();
        C c12 = null;
        C c13 = null;
        for (int i14 = 0; i14 < size7; i14++) {
            C cB3 = ((InterfaceC3008m) list.get(i14)).b();
            if (cE == null || cB3.compareTo(cE) <= 0) {
                if (cB3.compareTo(c8) >= 0) {
                    if (cB3.compareTo(c8) <= 0) {
                        c12 = cB3;
                        c13 = c12;
                        break;
                    }
                    if (c13 == null || cB3.compareTo(c13) < 0) {
                        c13 = cB3;
                    }
                } else if (c12 == null || cB3.compareTo(c12) > 0) {
                    c12 = cB3;
                }
            }
        }
        if (c13 != null) {
            c12 = c13;
        }
        ArrayList arrayList5 = new ArrayList(list.size());
        int size8 = list.size();
        for (int i15 = 0; i15 < size8; i15++) {
            Object obj5 = list.get(i15);
            if (t.c(((InterfaceC3008m) obj5).b(), c12)) {
                arrayList5.add(obj5);
            }
        }
        if (!arrayList5.isEmpty()) {
            return arrayList5;
        }
        C cE2 = C.f33980b.e();
        int size9 = list.size();
        C c14 = null;
        for (int i16 = 0; i16 < size9; i16++) {
            C cB4 = ((InterfaceC3008m) list.get(i16)).b();
            if (cE2 == null || cB4.compareTo(cE2) >= 0) {
                if (cB4.compareTo(c8) >= 0) {
                    if (cB4.compareTo(c8) <= 0) {
                        c9 = cB4;
                        c14 = c9;
                        break;
                    }
                    if (c14 == null || cB4.compareTo(c14) < 0) {
                        c14 = cB4;
                    }
                } else if (c9 == null || cB4.compareTo(c9) > 0) {
                    c9 = cB4;
                }
            }
        }
        if (c14 != null) {
            c9 = c14;
        }
        ArrayList arrayList6 = new ArrayList(list.size());
        int size10 = list.size();
        while (i9 < size10) {
            Object obj6 = list.get(i9);
            if (t.c(((InterfaceC3008m) obj6).b(), c9)) {
                arrayList6.add(obj6);
            }
            i9++;
        }
        return arrayList6;
    }
}
