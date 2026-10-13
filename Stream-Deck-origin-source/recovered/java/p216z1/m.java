package p216z1;

import C1.b;
import R0.AbstractC1582d0;
import R0.AbstractC1602n0;
import R0.C1598l0;
import kotlin.jvm.functions.Function0;
import p128o1.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class m {
    public static final n b(n nVar, n nVar2, float f8) {
        boolean z8 = nVar instanceof c;
        if (z8 || (nVar2 instanceof c)) {
            return (z8 && (nVar2 instanceof c)) ? n.f39032a.a((AbstractC1582d0) C.d(((c) nVar).e(), ((c) nVar2).e(), f8), b.a(nVar.c(), nVar2.c(), f8)) : (n) C.d(nVar, nVar2, f8);
        }
        return n.f39032a.b(AbstractC1602n0.g(nVar.d(), nVar2.d(), f8));
    }

    public static final long c(long j8, float f8) {
        return (Float.isNaN(f8) || f8 >= 1.0f) ? j8 : C1598l0.o(j8, C1598l0.r(j8) * f8, 0.0f, 0.0f, 0.0f, 14, null);
    }

    public static final float d(float f8, Function0 function0) {
        return Float.isNaN(f8) ? ((Number) function0.invoke()).floatValue() : f8;
    }
}
