package p128o1;

import D6.r;
import W6.n;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: o1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2740e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2739d f30796a = new C2739d("", null, null, 6, null);

    public static final boolean f(int i8, int i9, int i10, int i11) {
        if (i8 <= i10 && i11 <= i9) {
            if (i9 == i11) {
                if ((i10 == i11) == (i8 == i9)) {
                }
            }
            return true;
        }
        return false;
    }

    public static final C2739d g() {
        return f30796a;
    }

    public static final List h(List list, int i8, int i9) {
        if (i8 > i9) {
            throw new IllegalArgumentException(("start (" + i8 + ") should be less than or equal to end (" + i9 + ')').toString());
        }
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = list.get(i10);
            C2739d.b bVar = (C2739d.b) obj;
            if (l(i8, i9, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C2739d.b bVar2 = (C2739d.b) arrayList.get(i11);
            arrayList2.add(new C2739d.b(bVar2.e(), Math.max(i8, bVar2.f()) - i8, Math.min(i9, bVar2.d()) - i8, bVar2.g()));
        }
        if (arrayList2.isEmpty()) {
            return null;
        }
        return arrayList2;
    }

    public static final List i(C2739d c2739d, int i8, int i9) {
        List listB;
        if (i8 == i9 || (listB = c2739d.b()) == null) {
            return null;
        }
        if (i8 == 0 && i9 >= c2739d.i().length()) {
            return listB;
        }
        ArrayList arrayList = new ArrayList(listB.size());
        int size = listB.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = listB.get(i10);
            C2739d.b bVar = (C2739d.b) obj;
            if (l(i8, i9, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C2739d.b bVar2 = (C2739d.b) arrayList.get(i11);
            arrayList2.add(new C2739d.b(bVar2.e(), n.k(bVar2.f(), i8, i9) - i8, n.k(bVar2.d(), i8, i9) - i8, bVar2.g()));
        }
        return arrayList2;
    }

    public static final List j(C2739d c2739d, int i8, int i9) {
        List listE;
        if (i8 == i9 || (listE = c2739d.e()) == null) {
            return null;
        }
        if (i8 == 0 && i9 >= c2739d.i().length()) {
            return listE;
        }
        ArrayList arrayList = new ArrayList(listE.size());
        int size = listE.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = listE.get(i10);
            C2739d.b bVar = (C2739d.b) obj;
            if (l(i8, i9, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C2739d.b bVar2 = (C2739d.b) arrayList.get(i11);
            arrayList2.add(new C2739d.b(bVar2.e(), n.k(bVar2.f(), i8, i9) - i8, n.k(bVar2.d(), i8, i9) - i8));
        }
        return arrayList2;
    }

    public static final List k(C2739d c2739d, int i8, int i9) {
        List listG;
        if (i8 == i9 || (listG = c2739d.g()) == null) {
            return null;
        }
        if (i8 == 0 && i9 >= c2739d.i().length()) {
            return listG;
        }
        ArrayList arrayList = new ArrayList(listG.size());
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            Object obj = listG.get(i10);
            C2739d.b bVar = (C2739d.b) obj;
            if (l(i8, i9, bVar.f(), bVar.d())) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        int size2 = arrayList.size();
        for (int i11 = 0; i11 < size2; i11++) {
            C2739d.b bVar2 = (C2739d.b) arrayList.get(i11);
            arrayList2.add(new C2739d.b(bVar2.e(), n.k(bVar2.f(), i8, i9) - i8, n.k(bVar2.d(), i8, i9) - i8));
        }
        return arrayList2;
    }

    public static final boolean l(int i8, int i9, int i10, int i11) {
        return Math.max(i8, i10) < Math.min(i9, i11) || f(i8, i9, i10, i11) || f(i10, i11, i8, i9);
    }

    public static final List m(C2739d c2739d, t tVar) {
        int length = c2739d.i().length();
        List listE = c2739d.e();
        if (listE == null) {
            listE = r.n();
        }
        ArrayList arrayList = new ArrayList();
        int size = listE.size();
        int i8 = 0;
        int i9 = 0;
        while (i8 < size) {
            C2739d.b bVar = (C2739d.b) listE.get(i8);
            t tVar2 = (t) bVar.a();
            int iB = bVar.b();
            int iC = bVar.c();
            if (iB != i9) {
                arrayList.add(new C2739d.b(tVar, i9, iB));
            }
            arrayList.add(new C2739d.b(tVar.l(tVar2), iB, iC));
            i8++;
            i9 = iC;
        }
        if (i9 != length) {
            arrayList.add(new C2739d.b(tVar, i9, length));
        }
        if (arrayList.isEmpty()) {
            arrayList.add(new C2739d.b(tVar, 0, 0));
        }
        return arrayList;
    }

    public static final C2739d n(C2739d c2739d, int i8, int i9) {
        String strSubstring;
        if (i8 != i9) {
            strSubstring = c2739d.i().substring(i8, i9);
            t.f(strSubstring, "this as java.lang.String…ing(startIndex, endIndex)");
        } else {
            strSubstring = "";
        }
        return new C2739d(strSubstring, k(c2739d, i8, i9), null, null, 12, null);
    }
}
