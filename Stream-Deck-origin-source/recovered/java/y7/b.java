package y7;

import com.revenuecat.purchases.common.UtilsKt;
import java.util.Arrays;
import java.util.logging.Logger;
import kotlin.jvm.internal.O;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class b {
    public static final String b(long j8) {
        String str;
        if (j8 <= -999500000) {
            str = ((j8 - ((long) 500000000)) / ((long) 1000000000)) + " s ";
        } else if (j8 <= -999500) {
            str = ((j8 - ((long) 500000)) / ((long) UtilsKt.MICROS_MULTIPLIER)) + " ms";
        } else if (j8 <= 0) {
            str = ((j8 - ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j8 < 999500) {
            str = ((j8 + ((long) 500)) / ((long) 1000)) + " µs";
        } else if (j8 < 999500000) {
            str = ((j8 + ((long) 500000)) / ((long) UtilsKt.MICROS_MULTIPLIER)) + " ms";
        } else {
            str = ((j8 + ((long) 500000000)) / ((long) 1000000000)) + " s ";
        }
        O o8 = O.f28784a;
        String str2 = String.format("%6s", Arrays.copyOf(new Object[]{str}, 1));
        t.f(str2, "format(format, *args)");
        return str2;
    }

    public static final void c(a aVar, d dVar, String str) {
        Logger loggerA = e.f38467h.a();
        StringBuilder sb = new StringBuilder();
        sb.append(dVar.f());
        sb.append(' ');
        O o8 = O.f28784a;
        String str2 = String.format("%-22s", Arrays.copyOf(new Object[]{str}, 1));
        t.f(str2, "format(format, *args)");
        sb.append(str2);
        sb.append(": ");
        sb.append(aVar.b());
        loggerA.fine(sb.toString());
    }
}
