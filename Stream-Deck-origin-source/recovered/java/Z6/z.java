package Z6;

import C6.C0920i;
import C6.D;
import M6.eLZq.eGwOBWCdOTaKus;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class z {
    public static final byte a(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        C6.w wVarB = b(str);
        if (wVarB != null) {
            return wVarB.m();
        }
        u.l(str);
        throw new C0920i();
    }

    public static final C6.w b(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return c(str, 10);
    }

    public static final C6.w c(String str, int i8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        C6.y yVarF = f(str, i8);
        if (yVarF == null) {
            return null;
        }
        int iJ = yVarF.j();
        if (Integer.compareUnsigned(iJ, C6.y.b(255)) > 0) {
            return null;
        }
        return C6.w.a(C6.w.b((byte) iJ));
    }

    public static final int d(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        C6.y yVarE = e(str);
        if (yVarE != null) {
            return yVarE.j();
        }
        u.l(str);
        throw new C0920i();
    }

    public static final C6.y e(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return f(str, 10);
    }

    public static final C6.y f(String str, int i8) {
        int i9;
        kotlin.jvm.internal.t.g(str, "<this>");
        C1694a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i10 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.t.h(cCharAt, 48) < 0) {
            i9 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i9 = 0;
        }
        int iB = C6.y.b(i8);
        int iDivideUnsigned = 119304647;
        while (i9 < length) {
            int iB2 = C1694a.b(str.charAt(i9), i8);
            if (iB2 < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i10, iDivideUnsigned) > 0) {
                if (iDivideUnsigned == 119304647) {
                    iDivideUnsigned = Integer.divideUnsigned(-1, iB);
                    if (Integer.compareUnsigned(i10, iDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            int iB3 = C6.y.b(i10 * iB);
            int iB4 = C6.y.b(C6.y.b(iB2) + iB3);
            if (Integer.compareUnsigned(iB4, iB3) < 0) {
                return null;
            }
            i9++;
            i10 = iB4;
        }
        return C6.y.a(i10);
    }

    public static final long g(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        C6.A aH = h(str);
        if (aH != null) {
            return aH.m();
        }
        u.l(str);
        throw new C0920i();
    }

    public static final C6.A i(String str, int i8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        C1694a.a(i8);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i9 = 0;
        char cCharAt = str.charAt(0);
        if (kotlin.jvm.internal.t.h(cCharAt, 48) < 0) {
            i9 = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long jB = C6.A.b(i8);
        long j8 = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i9 < length) {
            int iB = C1694a.b(str.charAt(i9), i8);
            if (iB < 0) {
                return null;
            }
            if (Long.compareUnsigned(j8, jDivideUnsigned) > 0) {
                if (jDivideUnsigned == 512409557603043100L) {
                    jDivideUnsigned = Long.divideUnsigned(-1L, jB);
                    if (Long.compareUnsigned(j8, jDivideUnsigned) > 0) {
                    }
                }
                return null;
            }
            long jB2 = C6.A.b(j8 * jB);
            long jB3 = C6.A.b(C6.A.b(((long) C6.y.b(iB)) & 4294967295L) + jB2);
            if (Long.compareUnsigned(jB3, jB2) < 0) {
                return null;
            }
            i9++;
            j8 = jB3;
        }
        return C6.A.a(j8);
    }

    public static final short j(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        D dK = k(str);
        if (dK != null) {
            return dK.j();
        }
        u.l(str);
        throw new C0920i();
    }

    public static final D k(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        return l(str, 10);
    }

    public static final D l(String str, int i8) {
        kotlin.jvm.internal.t.g(str, "<this>");
        C6.y yVarF = f(str, i8);
        if (yVarF == null) {
            return null;
        }
        int iJ = yVarF.j();
        if (Integer.compareUnsigned(iJ, C6.y.b(65535)) > 0) {
            return null;
        }
        return D.a(D.b((short) iJ));
    }

    public static final C6.A h(String str) {
        kotlin.jvm.internal.t.g(str, eGwOBWCdOTaKus.MWU);
        return i(str, 10);
    }
}
