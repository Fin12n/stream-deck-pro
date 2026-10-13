package p205x6;

import C6.C0920i;
import kotlin.jvm.internal.t;
import p213y6.a;
import p213y6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class o {
    public static final void a(n nVar, a dst, int i8) throws Throwable {
        t.g(nVar, "<this>");
        t.g(dst, "dst");
        boolean z8 = true;
        a aVarB = g.b(nVar, 1);
        if (aVarB != null) {
            do {
                try {
                    int iMin = Math.min(i8, aVarB.k() - aVarB.i());
                    f.a(aVarB, dst, iMin);
                    i8 -= iMin;
                    if (i8 <= 0) {
                        g.a(nVar, aVarB);
                        break;
                    }
                    try {
                        aVarB = g.c(nVar, aVarB);
                    } catch (Throwable th) {
                        th = th;
                        z8 = false;
                        if (z8) {
                            g.a(nVar, aVarB);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } while (aVarB != null);
        }
        if (i8 <= 0) {
            return;
        }
        y.a(i8);
        throw new C0920i();
    }

    public static final void b(n nVar, byte[] dst, int i8, int i9) {
        t.g(nVar, "<this>");
        t.g(dst, "dst");
        boolean z8 = true;
        a aVarB = g.b(nVar, 1);
        if (aVarB != null) {
            do {
                try {
                    int iMin = Math.min(i9, aVarB.k() - aVarB.i());
                    f.b(aVarB, dst, i8, iMin);
                    i9 -= iMin;
                    i8 += iMin;
                    if (i9 <= 0) {
                        g.a(nVar, aVarB);
                        break;
                    }
                    try {
                        aVarB = g.c(nVar, aVarB);
                    } catch (Throwable th) {
                        th = th;
                        z8 = false;
                        if (z8) {
                            g.a(nVar, aVarB);
                        }
                        throw th;
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } while (aVarB != null);
        }
        if (i9 <= 0) {
            return;
        }
        y.a(i9);
        throw new C0920i();
    }

    public static /* synthetic */ void c(n nVar, byte[] bArr, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = bArr.length - i8;
        }
        b(nVar, bArr, i8, i9);
    }
}
