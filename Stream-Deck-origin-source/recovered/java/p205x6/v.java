package p205x6;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v {
    public static final void a(s sVar, int i8) {
        t.g(sVar, "<this>");
        int iL0 = sVar.L0();
        if (sVar.H0() - iL0 <= 4) {
            b(sVar, i8);
        } else {
            sVar.V0(iL0 + 4);
            sVar.J0().putInt(iL0, i8);
        }
    }

    public static final void b(s sVar, int i8) {
        f.h(sVar.Q0(4), i8);
        sVar.c();
    }

    public static final void c(s sVar, long j8) {
        t.g(sVar, "<this>");
        int iL0 = sVar.L0();
        if (sVar.H0() - iL0 <= 8) {
            d(sVar, j8);
        } else {
            sVar.V0(iL0 + 8);
            sVar.J0().putLong(iL0, j8);
        }
    }

    public static final void d(s sVar, long j8) {
        f.i(sVar.Q0(8), j8);
        sVar.c();
    }

    public static final void e(s sVar, short s8) {
        t.g(sVar, "<this>");
        int iL0 = sVar.L0();
        if (sVar.H0() - iL0 <= 2) {
            f(sVar, s8);
        } else {
            sVar.V0(iL0 + 2);
            sVar.J0().putShort(iL0, s8);
        }
    }

    public static final void f(s sVar, short s8) {
        f.j(sVar.Q0(2), s8);
        sVar.c();
    }
}
