package p065h1;

import android.view.ViewConfiguration;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class O implements R0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ViewConfiguration f24147a;

    public O(ViewConfiguration viewConfiguration) {
        this.f24147a = viewConfiguration;
    }

    @Override // p065h1.R0
    public long a() {
        return ViewConfiguration.getDoubleTapTimeout();
    }

    @Override // p065h1.R0
    public long b() {
        return 40L;
    }

    @Override // p065h1.R0
    public long c() {
        return ViewConfiguration.getLongPressTimeout();
    }

    @Override // p065h1.R0
    public float e() {
        return this.f24147a.getScaledMaximumFlingVelocity();
    }

    @Override // p065h1.R0
    public float f() {
        return this.f24147a.getScaledTouchSlop();
    }
}
