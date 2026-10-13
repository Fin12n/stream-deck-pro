package p004a3;

import java.util.HashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f13215a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1704j f13216b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final J f13217c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f13218d;

    public X(C1704j c1704j) {
        this.f13215a = new HashMap();
        this.f13218d = true;
        this.f13216b = c1704j;
        this.f13217c = null;
    }

    public String b(String str, String str2) {
        return a(str2);
    }

    public final String c(String str, String str2) {
        if (this.f13218d && this.f13215a.containsKey(str2)) {
            return (String) this.f13215a.get(str2);
        }
        String strB = b(str, str2);
        if (this.f13218d) {
            this.f13215a.put(str2, strB);
        }
        return strB;
    }

    public X(J j8) {
        this.f13215a = new HashMap();
        this.f13218d = true;
        this.f13217c = j8;
        this.f13216b = null;
    }

    public String a(String str) {
        return str;
    }
}
