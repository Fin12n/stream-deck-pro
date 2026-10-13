package p211y4;

import android.app.Activity;
import android.content.ContextWrapper;
import p111m2.ActivityC2686k;
import p219z4.AbstractC3207p;

/* JADX INFO: renamed from: y4.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class C3105f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38379a;

    public C3105f(Activity activity) {
        AbstractC3207p.l(activity, "Activity must not be null");
        this.f38379a = activity;
    }

    public final Activity a() {
        return (Activity) this.f38379a;
    }

    public final ActivityC2686k b() {
        return (ActivityC2686k) this.f38379a;
    }

    public final boolean c() {
        return this.f38379a instanceof Activity;
    }

    public final boolean d() {
        return this.f38379a instanceof ActivityC2686k;
    }

    public C3105f(ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
