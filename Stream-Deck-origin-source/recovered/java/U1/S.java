package U1;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.animation.Interpolator;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final WeakReference f10044a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ T f10045a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f10046b;

        public a(T t8, View view) {
            this.f10045a = t8;
            this.f10046b = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f10045a.a(this.f10046b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f10045a.b(this.f10046b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            this.f10045a.c(this.f10046b);
        }
    }

    public S(View view) {
        this.f10044a = new WeakReference(view);
    }

    public S b(float f8) {
        View view = (View) this.f10044a.get();
        if (view != null) {
            view.animate().alpha(f8);
        }
        return this;
    }

    public void c() {
        View view = (View) this.f10044a.get();
        if (view != null) {
            view.animate().cancel();
        }
    }

    public long d() {
        View view = (View) this.f10044a.get();
        if (view != null) {
            return view.animate().getDuration();
        }
        return 0L;
    }

    public S e(long j8) {
        View view = (View) this.f10044a.get();
        if (view != null) {
            view.animate().setDuration(j8);
        }
        return this;
    }

    public S f(Interpolator interpolator) {
        View view = (View) this.f10044a.get();
        if (view != null) {
            view.animate().setInterpolator(interpolator);
        }
        return this;
    }

    public S g(T t8) {
        View view = (View) this.f10044a.get();
        if (view != null) {
            h(view, t8);
        }
        return this;
    }

    public final void h(View view, T t8) {
        if (t8 != null) {
            view.animate().setListener(new a(t8, view));
        } else {
            view.animate().setListener(null);
        }
    }

    public S i(long j8) {
        View view = (View) this.f10044a.get();
        if (view != null) {
            view.animate().setStartDelay(j8);
        }
        return this;
    }

    public S j(final V v8) {
        final View view = (View) this.f10044a.get();
        if (view != null) {
            view.animate().setUpdateListener(v8 != null ? new ValueAnimator.AnimatorUpdateListener() { // from class: U1.Q
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    v8.a(view);
                }
            } : null);
        }
        return this;
    }

    public void k() {
        View view = (View) this.f10044a.get();
        if (view != null) {
            view.animate().start();
        }
    }

    public S l(float f8) {
        View view = (View) this.f10044a.get();
        if (view != null) {
            view.animate().translationY(f8);
        }
        return this;
    }
}
