package p010b0;

import kotlin.jvm.internal.t;
import p019c0.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class E {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f15576a = new Object();

    public static final Object c(D d8, int i8) {
        Object obj;
        t.g(d8, "<this>");
        int iA = a.a(d8.f15573b, d8.f15575d, i8);
        if (iA < 0 || (obj = d8.f15574c[iA]) == f15576a) {
            return null;
        }
        return obj;
    }

    public static final void d(D d8) {
        int i8 = d8.f15575d;
        int[] iArr = d8.f15573b;
        Object[] objArr = d8.f15574c;
        int i9 = 0;
        for (int i10 = 0; i10 < i8; i10++) {
            Object obj = objArr[i10];
            if (obj != f15576a) {
                if (i10 != i9) {
                    iArr[i9] = iArr[i10];
                    objArr[i9] = obj;
                    objArr[i10] = null;
                }
                i9++;
            }
        }
        d8.f15572a = false;
        d8.f15575d = i9;
    }
}
