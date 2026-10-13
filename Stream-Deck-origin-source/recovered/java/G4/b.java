package G4;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f2762a;

    public b(Context context) {
        this.f2762a = context;
    }

    public ApplicationInfo a(String str, int i8) {
        return this.f2762a.getPackageManager().getApplicationInfo(str, i8);
    }

    public CharSequence b(String str) {
        Context context = this.f2762a;
        return context.getPackageManager().getApplicationLabel(context.getPackageManager().getApplicationInfo(str, 0));
    }

    public PackageInfo c(String str, int i8) {
        return this.f2762a.getPackageManager().getPackageInfo(str, i8);
    }
}
