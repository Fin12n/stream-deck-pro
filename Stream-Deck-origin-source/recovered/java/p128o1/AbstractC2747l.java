package p128o1;

import Q6.k;
import java.util.List;

/* JADX INFO: renamed from: o1.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2747l {
    public static final int a(List list, int i8) {
        byte b8;
        int size = list.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            o oVar = (o) list.get(i10);
            if (oVar.f() > i8) {
                b8 = 1;
            } else {
                b8 = oVar.b() <= i8 ? (byte) -1 : (byte) 0;
            }
            if (b8 < 0) {
                i9 = i10 + 1;
            } else {
                if (b8 <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static final int b(List list, int i8) {
        byte b8;
        int size = list.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            o oVar = (o) list.get(i10);
            if (oVar.g() > i8) {
                b8 = 1;
            } else {
                b8 = oVar.c() <= i8 ? (byte) -1 : (byte) 0;
            }
            if (b8 < 0) {
                i9 = i10 + 1;
            } else {
                if (b8 <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static final int c(List list, float f8) {
        byte b8;
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            o oVar = (o) list.get(i9);
            if (oVar.h() > f8) {
                b8 = 1;
            } else {
                b8 = oVar.a() <= f8 ? (byte) -1 : (byte) 0;
            }
            if (b8 < 0) {
                i8 = i9 + 1;
            } else {
                if (b8 <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final void d(List list, long j8, k kVar) {
        int size = list.size();
        for (int iA = a(list, G.l(j8)); iA < size; iA++) {
            o oVar = (o) list.get(iA);
            if (oVar.f() >= G.k(j8)) {
                return;
            }
            if (oVar.f() != oVar.b()) {
                kVar.invoke(oVar);
            }
        }
    }
}
