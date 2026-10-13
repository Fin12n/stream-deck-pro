package p195w4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import p219z4.AbstractC3207p;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class k {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static k f37105b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37106a;

    public k(Context context) {
        this.f37106a = context.getApplicationContext();
    }

    public static k a(Context context) {
        AbstractC3207p.k(context);
        synchronized (k.class) {
            try {
                if (f37105b == null) {
                    z.a(context);
                    f37105b = new k(context);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return f37105b;
    }

    public static final v b(PackageInfo packageInfo, v... vVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr != null) {
            if (signatureArr.length != 1) {
                Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
                return null;
            }
            w wVar = new w(packageInfo.signatures[0].toByteArray());
            for (int i8 = 0; i8 < vVarArr.length; i8++) {
                if (vVarArr[i8].equals(wVar)) {
                    return vVarArr[i8];
                }
            }
        }
        return null;
    }

    public static final boolean c(PackageInfo packageInfo, boolean z8) {
        PackageInfo packageInfo2;
        if (!z8) {
            packageInfo2 = packageInfo;
        } else if (packageInfo != null) {
            if ("com.android.vending".equals(packageInfo.packageName) || "com.google.android.gms".equals(packageInfo.packageName)) {
                ApplicationInfo applicationInfo = packageInfo.applicationInfo;
                z8 = (applicationInfo == null || (applicationInfo.flags & 129) == 0) ? false : true;
            }
            packageInfo2 = packageInfo;
        } else {
            packageInfo2 = null;
        }
        if (packageInfo != null && packageInfo2.signatures != null) {
            if ((z8 ? b(packageInfo2, y.f37118a) : b(packageInfo2, y.f37118a[0])) != null) {
                return true;
            }
        }
        return false;
    }
}
