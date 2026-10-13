package U1;

import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B implements ViewTreeObserver.OnPreDrawListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f10009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewTreeObserver f10010b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Runnable f10011c;

    public B(View view, Runnable runnable) {
        this.f10009a = view;
        this.f10010b = view.getViewTreeObserver();
        this.f10011c = runnable;
    }

    public static B a(View view, Runnable runnable) {
        if (view == null) {
            throw new NullPointerException("view == null");
        }
        if (runnable == null) {
            throw new NullPointerException("runnable == null");
        }
        B b8 = new B(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(b8);
        view.addOnAttachStateChangeListener(b8);
        return b8;
    }

    public void b() {
        if (this.f10010b.isAlive()) {
            this.f10010b.removeOnPreDrawListener(this);
        } else {
            this.f10009a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f10009a.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.ViewTreeObserver.OnPreDrawListener
    public boolean onPreDraw() {
        b();
        this.f10011c.run();
        return true;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
        this.f10010b = view.getViewTreeObserver();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        b();
    }
}
