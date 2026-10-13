package p011b1;

import android.view.MotionEvent;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f15658a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f15659b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final MotionEvent f15660c;

    public B(long j8, List<C> list, MotionEvent motionEvent) {
        this.f15658a = j8;
        this.f15659b = list;
        this.f15660c = motionEvent;
    }

    public final MotionEvent a() {
        return this.f15660c;
    }

    public final List b() {
        return this.f15659b;
    }
}
