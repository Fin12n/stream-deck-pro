package P3;

import Z6.w;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8894a;

    public /* synthetic */ i(String str) {
        this.f8894a = str;
    }

    public static final /* synthetic */ i a(String str) {
        return new i(str);
    }

    public static String b(String rawValue) {
        t.g(rawValue, "rawValue");
        if (w.b0(rawValue)) {
            throw new IllegalStateException("WorkstationID must not be blank.");
        }
        return rawValue;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof i) && t.c(str, ((i) obj).g());
    }

    public static final boolean d(String str, String str2) {
        return t.c(str, str2);
    }

    public static int e(String str) {
        return str.hashCode();
    }

    public static String f(String str) {
        return "WorkstationID(rawValue=" + str + ")";
    }

    public boolean equals(Object obj) {
        return c(this.f8894a, obj);
    }

    public final /* synthetic */ String g() {
        return this.f8894a;
    }

    public int hashCode() {
        return e(this.f8894a);
    }

    public String toString() {
        return f(this.f8894a);
    }
}
