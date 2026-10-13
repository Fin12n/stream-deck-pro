package p219z4;

import G4.c;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class Q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Object f39107a = new Object();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static boolean f39108b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static String f39109c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static int f39110d;

    public static int a(Context context) {
        b(context);
        return f39110d;
    }

    public static void b(Context context) {
        synchronized (f39107a) {
            try {
                if (f39108b) {
                    return;
                }
                f39108b = true;
                try {
                    Bundle bundle = c.a(context).a(context.getPackageName(), 128).metaData;
                    if (bundle == null) {
                        return;
                    }
                    f39109c = bundle.getString("com.google.app.id");
                    f39110d = bundle.getInt("com.google.android.gms.version");
                } catch (PackageManager.NameNotFoundException e8) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e8);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
