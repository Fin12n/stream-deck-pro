package G3;

import D6.r;
import android.app.Activity;
import android.app.ActivityManager;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import com.elgato.streamdeck.MainActivity;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ActivityManager f2757a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final PackageManager f2758b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Z2.j f2759c;

    public n(ActivityManager activityManager, PackageManager packageManager) {
        t.g(activityManager, "activityManager");
        t.g(packageManager, "packageManager");
        this.f2757a = activityManager;
        this.f2758b = packageManager;
        this.f2759c = Z2.j.f12858c.d("SceneManager");
    }

    public final boolean a() {
        return b() < 2;
    }

    public final int b() {
        List<ActivityManager.AppTask> appTasks = this.f2757a.getAppTasks();
        t.d(appTasks);
        int i8 = 0;
        if (appTasks != null && appTasks.isEmpty()) {
            return 0;
        }
        Iterator<T> it = appTasks.iterator();
        while (it.hasNext()) {
            ComponentName componentName = ((ActivityManager.AppTask) it.next()).getTaskInfo().baseActivity;
            if (t.c(componentName != null ? componentName.getClassName() : null, MainActivity.class.getName()) && (i8 = i8 + 1) < 0) {
                r.w();
            }
        }
        return i8;
    }

    public final boolean c() {
        return Build.VERSION.SDK_INT >= 32;
    }

    public final boolean d() {
        return b() == 1;
    }

    public final void e(Activity activity) {
        t.g(activity, "activity");
        if (a()) {
            Intent intent = new Intent(activity, (Class<?>) MainActivity.class);
            intent.addFlags(402657280);
            activity.startActivity(intent);
        }
    }
}
