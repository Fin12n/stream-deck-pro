package p205x6;

import C6.C0920i;
import java.io.EOFException;
import kotlin.jvm.internal.t;
import p213y6.a;
import p213y6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class q {
    public static final int a(n nVar) {
        t.g(nVar, "<this>");
        if (nVar.a1() - nVar.i1() <= 4) {
            return b(nVar);
        }
        int iI1 = nVar.i1();
        nVar.c2(iI1 + 4);
        return nVar.g1().getInt(iI1);
    }

    public static final int b(n nVar) throws EOFException {
        a aVarB = g.b(nVar, 4);
        if (aVarB == null) {
            y.a(4);
            throw new C0920i();
        }
        int iC = f.c(aVarB);
        g.a(nVar, aVarB);
        return iC;
    }

    public static final long c(n nVar) {
        t.g(nVar, "<this>");
        if (nVar.a1() - nVar.i1() <= 8) {
            return d(nVar);
        }
        int iI1 = nVar.i1();
        nVar.c2(iI1 + 8);
        return nVar.g1().getLong(iI1);
    }

    public static final long d(n nVar) throws EOFException {
        a aVarB = g.b(nVar, 8);
        if (aVarB == null) {
            y.a(8);
            throw new C0920i();
        }
        long jD = f.d(aVarB);
        g.a(nVar, aVarB);
        return jD;
    }

    public static final short e(n nVar) {
        t.g(nVar, "<this>");
        if (nVar.a1() - nVar.i1() <= 2) {
            return f(nVar);
        }
        int iI1 = nVar.i1();
        nVar.c2(iI1 + 2);
        return nVar.g1().getShort(iI1);
    }

    public static final short f(n nVar) throws EOFException {
        a aVarB = g.b(nVar, 2);
        if (aVarB == null) {
            y.a(2);
            throw new C0920i();
        }
        short sE = f.e(aVarB);
        g.a(nVar, aVarB);
        return sE;
    }
}
