package O3;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f7556a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f7557b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f7558c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Throwable f7559d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Function0 f7560e;

    public a(String title, String message, String str, Throwable th, Function0 function0) {
        t.g(title, "title");
        t.g(message, "message");
        this.f7556a = title;
        this.f7557b = message;
        this.f7558c = str;
        this.f7559d = th;
        this.f7560e = function0;
    }

    public final Throwable a() {
        return this.f7559d;
    }

    public final String b() {
        return this.f7557b;
    }

    public final Function0 c() {
        return this.f7560e;
    }

    public final String d() {
        return this.f7556a;
    }

    public final String e() {
        return this.f7558c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return t.c(this.f7556a, aVar.f7556a) && t.c(this.f7557b, aVar.f7557b) && t.c(this.f7558c, aVar.f7558c) && t.c(this.f7559d, aVar.f7559d) && t.c(this.f7560e, aVar.f7560e);
    }

    public int hashCode() {
        int iHashCode = ((this.f7556a.hashCode() * 31) + this.f7557b.hashCode()) * 31;
        String str = this.f7558c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Throwable th = this.f7559d;
        int iHashCode3 = (iHashCode2 + (th == null ? 0 : th.hashCode())) * 31;
        Function0 function0 = this.f7560e;
        return iHashCode3 + (function0 != null ? function0.hashCode() : 0);
    }

    public String toString() {
        return "ErrorAlertViewData(title=" + this.f7556a + ", message=" + this.f7557b + ", trackingTitle=" + this.f7558c + ", cause=" + this.f7559d + ", onDismiss=" + this.f7560e + ")";
    }

    public /* synthetic */ a(String str, String str2, String str3, Throwable th, Function0 function0, int i8, AbstractC2633k abstractC2633k) {
        this(str, str2, (i8 & 4) != 0 ? null : str3, (i8 & 8) != 0 ? null : th, (i8 & 16) != 0 ? null : function0);
    }
}
