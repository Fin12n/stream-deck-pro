package X3;

import C6.v;
import D6.M;
import M6.eLZq.eGwOBWCdOTaKus;
import Z.JTT.ryTuoS;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f11660e = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11661a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11662b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f11663c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final String f11664d;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }

        public final b a(Context context, String str) {
            PackageInfo packageInfo;
            String str2;
            String strValueOf;
            t.g(context, "context");
            try {
                packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 0);
            } catch (PackageManager.NameNotFoundException unused) {
                packageInfo = null;
            }
            if (str == null) {
                try {
                    ApplicationInfo applicationInfo = context.getPackageManager().getApplicationInfo(context.getPackageName(), 0);
                    t.f(applicationInfo, "getApplicationInfo(...)");
                    str = context.getPackageManager().getApplicationLabel(applicationInfo).toString();
                } catch (PackageManager.NameNotFoundException unused2) {
                    str = context.getPackageName();
                }
            }
            t.d(str);
            String packageName = context.getPackageName();
            t.f(packageName, "getPackageName(...)");
            if (packageInfo == null || (str2 = packageInfo.versionName) == null) {
                str2 = eGwOBWCdOTaKus.WbgMnmmXHSgu;
            }
            if (packageInfo == null || (strValueOf = String.valueOf(J1.a.a(packageInfo))) == null) {
                strValueOf = "0";
            }
            return new b(str, packageName, str2, strValueOf);
        }
    }

    public b(String applicationName, String packageName, String appVersionString, String appBuildNumber) {
        t.g(applicationName, "applicationName");
        t.g(packageName, "packageName");
        t.g(appVersionString, "appVersionString");
        t.g(appBuildNumber, "appBuildNumber");
        this.f11661a = applicationName;
        this.f11662b = packageName;
        this.f11663c = appVersionString;
        this.f11664d = appBuildNumber;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.c(this.f11661a, bVar.f11661a) && t.c(this.f11662b, bVar.f11662b) && t.c(this.f11663c, bVar.f11663c) && t.c(this.f11664d, bVar.f11664d);
    }

    public int hashCode() {
        return (((((this.f11661a.hashCode() * 31) + this.f11662b.hashCode()) * 31) + this.f11663c.hashCode()) * 31) + this.f11664d.hashCode();
    }

    public String toString() {
        return "AppContext(applicationName=" + this.f11661a + ", packageName=" + this.f11662b + ", appVersionString=" + this.f11663c + ", appBuildNumber=" + this.f11664d + ")";
    }

    public final Map a() {
        i.b bVar = i.Companion;
        return M.j(v.a("application_name", bVar.g(this.f11661a)), v.a("package", bVar.g(this.f11662b)), v.a("$app_version_string", bVar.g(this.f11663c)), v.a(ryTuoS.SeuttEhYUKmsvi, bVar.g(this.f11664d)));
    }
}
