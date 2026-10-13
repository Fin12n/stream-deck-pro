package p205x6;

import kotlin.jvm.internal.t;
import p213y6.a;
import p221z6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class h {
    public static final a a(a aVar) {
        t.g(aVar, "<this>");
        a aVarB = aVar.B();
        a aVarC = aVar.C();
        return aVarC == null ? aVarB : b(aVarC, aVarB, aVarB);
    }

    public static final a b(a aVar, a aVar2, a aVar3) {
        while (true) {
            a aVarB = aVar.B();
            aVar3.H(aVarB);
            aVar = aVar.C();
            if (aVar == null) {
                return aVar2;
            }
            aVar3 = aVarB;
        }
    }

    public static final a c(a aVar) {
        t.g(aVar, "<this>");
        while (true) {
            a aVarC = aVar.C();
            if (aVarC == null) {
                return aVar;
            }
            aVar = aVarC;
        }
    }

    public static final void d(a aVar, g pool) {
        t.g(pool, "pool");
        while (aVar != null) {
            a aVarA = aVar.A();
            aVar.F(pool);
            aVar = aVarA;
        }
    }

    public static final long e(a aVar) {
        t.g(aVar, "<this>");
        return f(aVar, 0L);
    }

    public static final long f(a aVar, long j8) {
        do {
            j8 += (long) (aVar.k() - aVar.i());
            aVar = aVar.C();
        } while (aVar != null);
        return j8;
    }
}
