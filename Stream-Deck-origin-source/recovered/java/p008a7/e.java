package p008a7;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class e {
    public static final double a(double d8, d sourceUnit, d targetUnit) {
        t.g(sourceUnit, "sourceUnit");
        t.g(targetUnit, "targetUnit");
        long jConvert = targetUnit.b().convert(1L, sourceUnit.b());
        return jConvert > 0 ? d8 * jConvert : d8 / sourceUnit.b().convert(1L, targetUnit.b());
    }

    public static final long b(long j8, d sourceUnit, d targetUnit) {
        t.g(sourceUnit, "sourceUnit");
        t.g(targetUnit, "targetUnit");
        return targetUnit.b().convert(j8, sourceUnit.b());
    }

    public static final long c(long j8, d sourceUnit, d targetUnit) {
        t.g(sourceUnit, "sourceUnit");
        t.g(targetUnit, "targetUnit");
        return targetUnit.b().convert(j8, sourceUnit.b());
    }
}
