package p168t1;

import android.content.Context;
import android.os.Build;

/* JADX INFO: renamed from: t1.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3000e {
    public static final C2999d a(Context context) {
        return new C2999d(Build.VERSION.SDK_INT >= 31 ? context.getResources().getConfiguration().fontWeightAdjustment : 0);
    }
}
