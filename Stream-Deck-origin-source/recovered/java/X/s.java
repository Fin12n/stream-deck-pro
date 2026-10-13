package X;

import A.AbstractC0890p0;
import A.C0864c0;
import T0.Vl.PCRzgdeK;
import android.animation.Animator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class s extends View {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Window f11626a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C0864c0.i f11627b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements C0864c0.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f11628a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public ValueAnimator f11629b;

        public a() {
        }

        @Override // A.C0864c0.i
        public void a(long j8, final C0864c0.j jVar) {
            AbstractC0890p0.a("ScreenFlashView", "ScreenFlash#apply");
            this.f11628a = s.this.getBrightness();
            s.this.setBrightness(1.0f);
            ValueAnimator valueAnimator = this.f11629b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            s sVar = s.this;
            Objects.requireNonNull(jVar);
            this.f11629b = sVar.e(new Runnable() { // from class: X.r
                @Override // java.lang.Runnable
                public final void run() {
                    jVar.a();
                }
            });
        }

        @Override // A.C0864c0.i
        public void clear() {
            AbstractC0890p0.a("ScreenFlashView", "ScreenFlash#clear");
            ValueAnimator valueAnimator = this.f11629b;
            if (valueAnimator != null) {
                valueAnimator.cancel();
                this.f11629b = null;
            }
            s.this.setAlpha(0.0f);
            s.this.setBrightness(this.f11628a);
        }
    }

    public s(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(s sVar, ValueAnimator valueAnimator) {
        sVar.getClass();
        AbstractC0890p0.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
        sVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public float getBrightness() {
        Window window = this.f11626a;
        if (window != null) {
            return window.getAttributes().screenBrightness;
        }
        AbstractC0890p0.c("ScreenFlashView", "setBrightness: mScreenFlashWindow is null!");
        return Float.NaN;
    }

    private void setScreenFlashUiInfo(C0864c0.i iVar) {
        AbstractC0890p0.a("ScreenFlashView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public final ValueAnimator e(Runnable runnable) {
        AbstractC0890p0.a("ScreenFlashView", "animateToFullOpacity");
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        valueAnimatorOfFloat.setDuration(getVisibilityRampUpAnimationDurationMillis());
        valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: X.q
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                s.a(this.f11624a, valueAnimator);
            }
        });
        valueAnimatorOfFloat.addListener(new b(runnable));
        valueAnimatorOfFloat.start();
        return valueAnimatorOfFloat;
    }

    public final void f(Window window) {
        StringBuilder sb = new StringBuilder();
        sb.append("updateScreenFlash: is new window null = ");
        sb.append(window == null);
        sb.append(",  is new window same as previous = ");
        sb.append(window == this.f11626a);
        AbstractC0890p0.a("ScreenFlashView", sb.toString());
        if (this.f11626a != window) {
            this.f11627b = window == null ? null : new a();
        }
    }

    public C0864c0.i getScreenFlash() {
        return this.f11627b;
    }

    public long getVisibilityRampUpAnimationDurationMillis() {
        return 1000L;
    }

    public void setController(AbstractC1664a abstractC1664a) {
        I.w.b();
    }

    public void setScreenFlashWindow(Window window) {
        I.w.b();
        f(window);
        this.f11626a = window;
        setScreenFlashUiInfo(getScreenFlash());
    }

    public s(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBrightness(float f8) {
        Window window = this.f11626a;
        String str = PCRzgdeK.ODXidTJagTzcR;
        if (window == null) {
            AbstractC0890p0.c(str, "setBrightness: mScreenFlashWindow is null!");
            return;
        }
        if (Float.isNaN(f8)) {
            AbstractC0890p0.c(str, "setBrightness: value is NaN!");
            return;
        }
        WindowManager.LayoutParams attributes = this.f11626a.getAttributes();
        attributes.screenBrightness = f8;
        this.f11626a.setAttributes(attributes);
        AbstractC0890p0.a(str, "Brightness set to " + attributes.screenBrightness);
    }

    public s(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public s(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        setBackgroundColor(-1);
        setAlpha(0.0f);
        setElevation(Float.MAX_VALUE);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Animator.AnimatorListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Runnable f11631a;

        public b(Runnable runnable) {
            this.f11631a = runnable;
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            AbstractC0890p0.a("ScreenFlashView", "ScreenFlash#apply: onAnimationEnd");
            Runnable runnable = this.f11631a;
            if (runnable != null) {
                runnable.run();
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
        }
    }
}
