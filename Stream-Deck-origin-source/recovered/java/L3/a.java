package L3;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f4961a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f4962b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f4963c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f4964d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f4965e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f4966f;

    public a(String title, String message, String str, String str2, String str3, String str4) {
        t.g(title, "title");
        t.g(message, "message");
        this.f4961a = title;
        this.f4962b = message;
        this.f4963c = str;
        this.f4964d = str2;
        this.f4965e = str3;
        this.f4966f = str4;
    }

    public final String a() {
        return this.f4964d;
    }

    public final String b() {
        return this.f4963c;
    }

    public final String c() {
        return this.f4962b;
    }

    public final String d() {
        return this.f4961a;
    }

    public final String e() {
        return this.f4965e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.c(this.f4961a, aVar.f4961a) && t.c(this.f4962b, aVar.f4962b) && t.c(this.f4963c, aVar.f4963c) && t.c(this.f4964d, aVar.f4964d) && t.c(this.f4965e, aVar.f4965e) && t.c(this.f4966f, aVar.f4966f);
    }

    public final String f() {
        return this.f4966f;
    }

    public int hashCode() {
        int iHashCode = ((this.f4961a.hashCode() * 31) + this.f4962b.hashCode()) * 31;
        String str = this.f4963c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f4964d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f4965e;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f4966f;
        return iHashCode4 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "AlertDetails(title=" + this.f4961a + ", message=" + this.f4962b + ", doNotShowAgainActionTitle=" + this.f4963c + ", dismissActionTitle=" + this.f4964d + ", updateActionTitle=" + this.f4965e + ", updateURL=" + this.f4966f + ")";
    }
}
