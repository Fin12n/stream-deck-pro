package P3;

import Z6.w;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f8878a;

    public /* synthetic */ b(String str) {
        this.f8878a = str;
    }

    public static final /* synthetic */ b a(String str) {
        return new b(str);
    }

    public static String b(String rawValue) {
        t.g(rawValue, "rawValue");
        if (w.b0(rawValue)) {
            throw new IllegalStateException("DeviceID must not be blank");
        }
        return rawValue;
    }

    public static boolean c(String str, Object obj) {
        return (obj instanceof b) && t.c(str, ((b) obj).g());
    }

    public static final boolean d(String str, String str2) {
        return t.c(str, str2);
    }

    public static int e(String str) {
        return str.hashCode();
    }

    public static String f(String str) {
        return "DeviceID(rawValue=" + str + ")";
    }

    public boolean equals(Object obj) {
        return c(this.f8878a, obj);
    }

    public final /* synthetic */ String g() {
        return this.f8878a;
    }

    public int hashCode() {
        return e(this.f8878a);
    }

    public String toString() {
        return f(this.f8878a);
    }
}
