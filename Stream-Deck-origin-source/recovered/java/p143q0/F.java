package p143q0;

import A1.d;
import S6.c;
import java.util.List;
import kotlin.jvm.internal.t;
import p128o1.C2739d;
import p128o1.I;
import p168t1.AbstractC3009n;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {
    public static final int a(float f8) {
        return c.d((float) Math.ceil(f8));
    }

    public static final E b(E e8, C2739d c2739d, I i8, d dVar, AbstractC3009n.b bVar, boolean z8, int i9, int i10, int i11, List list) {
        boolean z9;
        int i12;
        int i13;
        int i14;
        List list2;
        if (t.c(e8.k(), c2739d) && t.c(e8.j(), i8)) {
            z9 = z8;
            if (e8.i() == z9) {
                i12 = i9;
                if (p216z1.t.e(e8.g(), i12)) {
                    i13 = i10;
                    if (e8.d() == i13) {
                        i14 = i11;
                        if (e8.e() == i14 && t.c(e8.a(), dVar)) {
                            list2 = list;
                            if (t.c(e8.h(), list2)) {
                                bVar = bVar;
                                if (e8.b() == bVar) {
                                    return e8;
                                }
                            } else {
                                bVar = bVar;
                            }
                        } else {
                            bVar = bVar;
                            list2 = list;
                        }
                    } else {
                        bVar = bVar;
                        i14 = i11;
                        list2 = list;
                    }
                } else {
                    bVar = bVar;
                    i13 = i10;
                    i14 = i11;
                    list2 = list;
                }
            }
            return new E(c2739d, i8, i13, i14, z9, i12, dVar, bVar, list2, null);
        }
        z9 = z8;
        i12 = i9;
        i13 = i10;
        i14 = i11;
        list2 = list;
        return new E(c2739d, i8, i13, i14, z9, i12, dVar, bVar, list2, null);
    }

    public static /* synthetic */ E c(E e8, C2739d c2739d, I i8, d dVar, AbstractC3009n.b bVar, boolean z8, int i9, int i10, int i11, List list, int i12, Object obj) {
        if ((i12 & 32) != 0) {
            z8 = true;
        }
        if ((i12 & 64) != 0) {
            i9 = p216z1.t.f39054a.a();
        }
        if ((i12 & 128) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        if ((i12 & 256) != 0) {
            i11 = 1;
        }
        return b(e8, c2739d, i8, dVar, bVar, z8, i9, i10, i11, list);
    }
}
