package io.sentry.android.core.internal.gestures;

import android.content.Context;
import android.view.MotionEvent;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import io.sentry.EnumC2596z2;
import io.sentry.J2;
import io.sentry.k3;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class h extends j {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Window.Callback f26378b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final g f26379c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final GestureDetectorCompat f26380d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J2 f26381e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final b f26382f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements b {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        default MotionEvent a(MotionEvent motionEvent) {
            return MotionEvent.obtain(motionEvent);
        }
    }

    public h(Window.Callback callback, Context context, g gVar, J2 j8) {
        this(callback, new GestureDetectorCompat(context, gVar), gVar, j8, new a());
    }

    public Window.Callback a() {
        return this.f26378b;
    }

    public final void b(MotionEvent motionEvent) {
        this.f26380d.a(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            this.f26379c.k(motionEvent);
        }
    }

    public void c() {
        this.f26379c.m(k3.CANCELLED);
    }

    @Override // io.sentry.android.core.internal.gestures.j, android.view.Window.Callback
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (motionEvent != null) {
            MotionEvent motionEventA = this.f26382f.a(motionEvent);
            try {
                b(motionEventA);
            } catch (Throwable th) {
                try {
                    if (this.f26381e != null) {
                        this.f26381e.getLogger().b(EnumC2596z2.ERROR, "Error dispatching touch event", th);
                    }
                } finally {
                    motionEventA.recycle();
                }
            }
        }
        return super.dispatchTouchEvent(motionEvent);
    }

    public h(Window.Callback callback, GestureDetectorCompat gestureDetectorCompat, g gVar, J2 j8, b bVar) {
        super(callback);
        this.f26378b = callback;
        this.f26379c = gVar;
        this.f26381e = j8;
        this.f26380d = gestureDetectorCompat;
        this.f26382f = bVar;
    }
}
