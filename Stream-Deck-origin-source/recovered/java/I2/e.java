package I2;

import android.util.Log;
import androidx.window.extensions.WindowExtensionsProvider;
import kotlin.jvm.internal.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f3742a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final String f3743b = K.b(e.class).d();

    public final int a() {
        try {
            return WindowExtensionsProvider.getWindowExtensions().getVendorApiLevel();
        } catch (NoClassDefFoundError unused) {
            if (c.f3734a.a() != j.LOG) {
                return 0;
            }
            Log.d(f3743b, "Embedding extension version not found");
            return 0;
        } catch (UnsupportedOperationException unused2) {
            if (c.f3734a.a() != j.LOG) {
                return 0;
            }
            Log.d(f3743b, "Stub Extension");
            return 0;
        }
    }
}
