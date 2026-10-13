package Z6;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class t extends s {
    public static Double j(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        try {
            if (m.f12981b.d(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }

    public static Float k(String str) {
        kotlin.jvm.internal.t.g(str, "<this>");
        try {
            if (m.f12981b.d(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
        } catch (NumberFormatException unused) {
        }
        return null;
    }
}
