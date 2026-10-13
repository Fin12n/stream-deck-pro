package p010b0;

import java.util.ConcurrentModificationException;
import kotlin.jvm.internal.t;
import p019c0.a;

/* JADX INFO: renamed from: b0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1751d {
    public static final void a(C1749b c1749b, int i8) {
        t.g(c1749b, "<this>");
        c1749b.E(new int[i8]);
        c1749b.D(new Object[i8]);
    }

    public static final int b(C1749b c1749b, int i8) {
        t.g(c1749b, "<this>");
        try {
            return a.a(c1749b.s(), c1749b.u(), i8);
        } catch (IndexOutOfBoundsException unused) {
            throw new ConcurrentModificationException();
        }
    }

    public static final int c(C1749b c1749b, Object obj, int i8) {
        t.g(c1749b, "<this>");
        int iU = c1749b.u();
        if (iU == 0) {
            return -1;
        }
        int iB = b(c1749b, i8);
        if (iB < 0 || t.c(obj, c1749b.o()[iB])) {
            return iB;
        }
        int i9 = iB + 1;
        while (i9 < iU && c1749b.s()[i9] == i8) {
            if (t.c(obj, c1749b.o()[i9])) {
                return i9;
            }
            i9++;
        }
        for (int i10 = iB - 1; i10 >= 0 && c1749b.s()[i10] == i8; i10--) {
            if (t.c(obj, c1749b.o()[i10])) {
                return i10;
            }
        }
        return ~i9;
    }

    public static final int d(C1749b c1749b) {
        t.g(c1749b, "<this>");
        return c(c1749b, null, 0);
    }
}
