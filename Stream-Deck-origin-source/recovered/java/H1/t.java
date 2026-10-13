package H1;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t implements Iterable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ArrayList f3501a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f3502b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        Intent j();
    }

    public t(Context context) {
        this.f3502b = context;
    }

    public static t s(Context context) {
        return new t(context);
    }

    public t c(Intent intent) {
        this.f3501a.add(intent);
        return this;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this.f3501a.iterator();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public t m(Activity activity) {
        Intent intentJ = activity instanceof a ? ((a) activity).j() : null;
        if (intentJ == null) {
            intentJ = h.a(activity);
        }
        if (intentJ != null) {
            ComponentName component = intentJ.getComponent();
            if (component == null) {
                component = intentJ.resolveActivity(this.f3502b.getPackageManager());
            }
            o(component);
            c(intentJ);
        }
        return this;
    }

    public t o(ComponentName componentName) {
        int size = this.f3501a.size();
        try {
            Intent intentB = h.b(this.f3502b, componentName);
            while (intentB != null) {
                this.f3501a.add(size, intentB);
                intentB = h.b(this.f3502b, intentB.getComponent());
            }
            return this;
        } catch (PackageManager.NameNotFoundException e8) {
            Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
            throw new IllegalArgumentException(e8);
        }
    }

    public void t() {
        u(null);
    }

    public void u(Bundle bundle) {
        if (this.f3501a.isEmpty()) {
            throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
        }
        Intent[] intentArr = (Intent[]) this.f3501a.toArray(new Intent[0]);
        intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
        if (I1.a.f(this.f3502b, intentArr, bundle)) {
            return;
        }
        Intent intent = new Intent(intentArr[intentArr.length - 1]);
        intent.addFlags(268435456);
        this.f3502b.startActivity(intent);
    }
}
