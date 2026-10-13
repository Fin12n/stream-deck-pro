package A5;

import Z6.w;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f847a;

    public /* synthetic */ j(String str) {
        this.f847a = str;
    }

    public static final /* synthetic */ j a(String str) {
        return new j(str);
    }

    public static String b(String value) {
        t.g(value, "value");
        if (w.b0(value)) {
            throw new IllegalArgumentException("Qualifier value must not be blank");
        }
        return value;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof j) && t.c(str, ((j) obj).g());
    }

    public static final boolean d(String str, String str2) {
        return t.c(str, str2);
    }

    public static int e(String str) {
        return str.hashCode();
    }

    public static String f(String str) {
        return "qualifier(" + str + ")";
    }

    public boolean equals(Object obj) {
        return c(this.f847a, obj);
    }

    public final /* synthetic */ String g() {
        return this.f847a;
    }

    public int hashCode() {
        return e(this.f847a);
    }

    public String toString() {
        return f(this.f847a);
    }
}
