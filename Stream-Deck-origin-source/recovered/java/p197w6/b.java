package p197w6;

import D6.iIQ.BmWxZhjGfw;
import java.nio.charset.CharsetDecoder;
import java.nio.charset.CharsetEncoder;
import kotlin.jvm.internal.t;
import p205x6.j;
import p205x6.k;
import p205x6.n;
import p205x6.s;
import p213y6.a;
import p213y6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final String a(CharsetDecoder charsetDecoder, n input, int i8) {
        t.g(charsetDecoder, "<this>");
        t.g(input, "input");
        StringBuilder sb = new StringBuilder((int) Math.min(i8, g(input)));
        a.a(charsetDecoder, input, sb, i8);
        String string = sb.toString();
        t.f(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static /* synthetic */ String b(CharsetDecoder charsetDecoder, n nVar, int i8, int i9, Object obj) {
        if ((i9 & 2) != 0) {
            i8 = Integer.MAX_VALUE;
        }
        return a(charsetDecoder, nVar, i8);
    }

    public static /* synthetic */ k d(CharsetEncoder charsetEncoder, CharSequence charSequence, int i8, int i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            i8 = 0;
        }
        if ((i10 & 4) != 0) {
            i9 = charSequence.length();
        }
        return c(charsetEncoder, charSequence, i8, i9);
    }

    public static final int e(CharsetEncoder charsetEncoder, s sVar) {
        a aVarD = g.d(sVar, 1, null);
        int i8 = 1;
        int iG = 0;
        while (true) {
            try {
                int iG2 = aVarD.g() - aVarD.k();
                i8 = a.e(charsetEncoder, aVarD) ? 0 : i8 + 1;
                iG += iG2 - (aVarD.g() - aVarD.k());
                if (i8 <= 0) {
                    sVar.c();
                    return iG;
                }
                aVarD = g.d(sVar, 1, aVarD);
            } catch (Throwable th) {
                sVar.c();
                throw th;
            }
        }
    }

    public static final int f(CharsetEncoder charsetEncoder, s destination, CharSequence input, int i8, int i9) {
        int i10;
        t.g(charsetEncoder, "<this>");
        t.g(destination, "destination");
        t.g(input, "input");
        if (i8 >= i9) {
            return 0;
        }
        a aVarD = g.d(destination, 1, null);
        int iG = 0;
        while (true) {
            try {
                int iG2 = aVarD.g() - aVarD.k();
                int iF = a.f(charsetEncoder, input, i8, i9, aVarD);
                if (iF < 0) {
                    throw new IllegalStateException("Check failed.");
                }
                i8 += iF;
                iG += iG2 - (aVarD.g() - aVarD.k());
                if (i8 >= i9) {
                    i10 = 0;
                } else {
                    i10 = iF == 0 ? 8 : 1;
                }
                if (i10 <= 0) {
                    destination.c();
                    return iG + e(charsetEncoder, destination);
                }
                aVarD = g.d(destination, i10, aVarD);
            } catch (Throwable th) {
                destination.c();
                throw th;
            }
        }
    }

    public static final long g(n nVar) {
        t.g(nVar, "<this>");
        return nVar instanceof k ? nVar.o1() : Math.max(nVar.o1(), 16L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final k c(CharsetEncoder charsetEncoder, CharSequence charSequence, int i8, int i9) {
        t.g(charsetEncoder, "<this>");
        t.g(charSequence, BmWxZhjGfw.HLcccdeBR);
        j jVar = new j(null, 1, 0 == true ? 1 : 0);
        try {
            f(charsetEncoder, jVar, charSequence, i8, i9);
            return jVar.M1();
        } catch (Throwable th) {
            jVar.T0();
            throw th;
        }
    }
}
