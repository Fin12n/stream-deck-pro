package p062g7;

import Z6.u;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class J {
    public static final int a(String str, int i8, int i9, int i10) {
        return (int) H.c(str, i8, i9, i10);
    }

    public static final String c(String str, String str2) {
        String strD = H.d(str);
        return strD == null ? str2 : strD;
    }

    public static final boolean d(String str, boolean z8) {
        String strD = H.d(str);
        return strD != null ? Boolean.parseBoolean(strD) : z8;
    }

    public static /* synthetic */ int e(String str, int i8, int i9, int i10, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            i9 = 1;
        }
        if ((i11 & 8) != 0) {
            i10 = Integer.MAX_VALUE;
        }
        return H.b(str, i8, i9, i10);
    }

    public static /* synthetic */ long f(String str, long j8, long j9, long j10, int i8, Object obj) {
        if ((i8 & 4) != 0) {
            j9 = 1;
        }
        long j11 = j9;
        if ((i8 & 8) != 0) {
            j10 = Long.MAX_VALUE;
        }
        return H.c(str, j8, j11, j10);
    }

    public static final long b(String str, long j8, long j9, long j10) {
        String strD = H.d(str);
        if (strD == null) {
            return j8;
        }
        Long lO = u.o(strD);
        if (lO != null) {
            long jLongValue = lO.longValue();
            if (j9 <= jLongValue && jLongValue <= j10) {
                return jLongValue;
            }
            throw new IllegalStateException(("System property '" + str + "' should be in range " + j9 + ".." + j10 + hJroAgFztiMK.LBnC + jLongValue + '\'').toString());
        }
        throw new IllegalStateException(("System property '" + str + "' has unrecognized value '" + strD + '\'').toString());
    }
}
