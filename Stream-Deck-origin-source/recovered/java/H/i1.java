package H;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f3055a;

    public i1() {
        this.f3055a = new ArrayList();
    }

    public static void b(List list, int i8, int[] iArr, int i9) {
        if (i9 >= iArr.length) {
            list.add((int[]) iArr.clone());
            return;
        }
        for (int i10 = 0; i10 < i8; i10++) {
            int i11 = 0;
            while (true) {
                if (i11 >= i9) {
                    iArr[i9] = i10;
                    b(list, i8, iArr, i9 + 1);
                    break;
                } else if (i10 == iArr[i11]) {
                    break;
                } else {
                    i11++;
                }
            }
        }
    }

    public boolean a(j1 j1Var) {
        return this.f3055a.add(j1Var);
    }

    public final List c(int i8) {
        ArrayList arrayList = new ArrayList();
        b(arrayList, i8, new int[i8], 0);
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:27:0x007e A[RETURN] */
    public List d(List list) {
        int i8;
        boolean zJ;
        if (list.isEmpty()) {
            return new ArrayList();
        }
        if (list.size() != this.f3055a.size()) {
            return null;
        }
        List listC = c(this.f3055a.size());
        j1[] j1VarArr = new j1[list.size()];
        Iterator it = listC.iterator();
        do {
            i8 = 0;
            if (it.hasNext()) {
                int[] iArr = (int[]) it.next();
                zJ = true;
                while (i8 < this.f3055a.size()) {
                    if (iArr[i8] < list.size()) {
                        zJ &= ((j1) this.f3055a.get(i8)).j((j1) list.get(iArr[i8]));
                        if (!zJ) {
                            break;
                        }
                        j1VarArr[iArr[i8]] = (j1) this.f3055a.get(i8);
                    }
                    i8++;
                }
            }
            if (i8 != 0) {
                return Arrays.asList(j1VarArr);
            }
            return null;
        } while (!zJ);
        i8 = 1;
        if (i8 != 0) {
            return Arrays.asList(j1VarArr);
        }
        return null;
    }

    public i1(j1... j1VarArr) {
        ArrayList arrayList = new ArrayList();
        this.f3055a = arrayList;
        Collections.addAll(arrayList, j1VarArr);
    }
}
