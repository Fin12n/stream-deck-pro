package p009b;

import android.window.BackEvent;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: b.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1738a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1738a f15491a = new C1738a();

    public final BackEvent a(float f8, float f9, float f10, int i8) {
        return new BackEvent(f8, f9, f10, i8);
    }

    public final float b(BackEvent backEvent) {
        t.g(backEvent, "backEvent");
        return backEvent.getProgress();
    }

    public final int c(BackEvent backEvent) {
        t.g(backEvent, "backEvent");
        return backEvent.getSwipeEdge();
    }

    public final float d(BackEvent backEvent) {
        t.g(backEvent, "backEvent");
        return backEvent.getTouchX();
    }

    public final float e(BackEvent backEvent) {
        t.g(backEvent, "backEvent");
        return backEvent.getTouchY();
    }
}
