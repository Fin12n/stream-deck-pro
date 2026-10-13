package A5;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class k {
    public static final String a(X6.d dVar) {
        t.g(dVar, "<this>");
        String strB = dVar.b();
        if (strB != null) {
            return j.b(strB);
        }
        throw new IllegalArgumentException("Class must not be local or from an anonymous type");
    }

    public static final String b(String value) {
        t.g(value, "value");
        return j.b(value);
    }
}
