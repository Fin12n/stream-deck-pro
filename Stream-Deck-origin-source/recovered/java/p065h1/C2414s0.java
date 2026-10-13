package p065h1;

import android.view.MotionEvent;

/* JADX INFO: renamed from: h1.s0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2414s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2414s0 f24326a = new C2414s0();

    public final boolean a(MotionEvent motionEvent, int i8) {
        float rawX = motionEvent.getRawX(i8);
        if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
            return false;
        }
        float rawY = motionEvent.getRawY(i8);
        return (Float.isInfinite(rawY) || Float.isNaN(rawY)) ? false : true;
    }
}
