package S2;

import android.app.Activity;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Activity f9691a;

    public a(Activity activity) {
        this.f9691a = activity;
    }

    public final boolean a() {
        Activity activity = this.f9691a;
        if (activity != null) {
            return activity.isChangingConfigurations();
        }
        return false;
    }
}
