package p111m2;

import U1.B;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationSet;
import android.view.animation.AnimationUtils;
import android.view.animation.Transformation;
import io.sentry.exception.uXy.SZCvugJaXc;

/* JADX INFO: renamed from: m2.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2687l {
    public static int a(ComponentCallbacksC2681f componentCallbacksC2681f, boolean z8, boolean z9) {
        if (z9) {
            return z8 ? componentCallbacksC2681f.J() : componentCallbacksC2681f.K();
        }
        return z8 ? componentCallbacksC2681f.u() : componentCallbacksC2681f.y();
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071 A[Catch: RuntimeException -> 0x0077, TRY_LEAVE, TryCatch #0 {RuntimeException -> 0x0077, blocks: (B:32:0x006b, B:34:0x0071), top: B:45:0x006b }] */
    public static a b(Context context, ComponentCallbacksC2681f componentCallbacksC2681f, boolean z8, boolean z9) {
        Animator animatorLoadAnimator;
        int iF = componentCallbacksC2681f.F();
        int iA = a(componentCallbacksC2681f, z8, z9);
        componentCallbacksC2681f.t1(0, 0, 0, 0);
        ViewGroup viewGroup = componentCallbacksC2681f.f29845H;
        if (viewGroup != null && viewGroup.getTag(p102l2.b.f29138c) != null) {
            componentCallbacksC2681f.f29845H.setTag(p102l2.b.f29138c, null);
        }
        ViewGroup viewGroup2 = componentCallbacksC2681f.f29845H;
        if (viewGroup2 != null && viewGroup2.getLayoutTransition() != null) {
            return null;
        }
        Animation animationO0 = componentCallbacksC2681f.o0(iF, z8, iA);
        if (animationO0 != null) {
            return new a(animationO0);
        }
        Animator animatorP0 = componentCallbacksC2681f.p0(iF, z8, iA);
        if (animatorP0 != null) {
            return new a(animatorP0);
        }
        if (iA == 0 && iF != 0) {
            iA = d(context, iF, z8);
        }
        if (iA != 0) {
            boolean zEquals = "anim".equals(context.getResources().getResourceTypeName(iA));
            if (zEquals) {
                try {
                    Animation animationLoadAnimation = AnimationUtils.loadAnimation(context, iA);
                    if (animationLoadAnimation != null) {
                        return new a(animationLoadAnimation);
                    }
                } catch (Resources.NotFoundException e8) {
                    throw e8;
                } catch (RuntimeException unused) {
                    try {
                        animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                        if (animatorLoadAnimator != null) {
                            return new a(animatorLoadAnimator);
                        }
                    } catch (RuntimeException e9) {
                        if (zEquals) {
                            throw e9;
                        }
                        Animation animationLoadAnimation2 = AnimationUtils.loadAnimation(context, iA);
                        if (animationLoadAnimation2 != null) {
                            return new a(animationLoadAnimation2);
                        }
                    }
                }
            } else {
                animatorLoadAnimator = AnimatorInflater.loadAnimator(context, iA);
                if (animatorLoadAnimator != null) {
                    return new a(animatorLoadAnimator);
                }
            }
        }
        return null;
    }

    public static int c(Context context, int i8) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(R.style.Animation.Activity, new int[]{i8});
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        return resourceId;
    }

    public static int d(Context context, int i8, boolean z8) {
        if (i8 == 4097) {
            return z8 ? p102l2.a.f29134e : p102l2.a.f29135f;
        }
        if (i8 == 8194) {
            return z8 ? p102l2.a.f29130a : p102l2.a.f29131b;
        }
        if (i8 == 8197) {
            return z8 ? c(context, R.attr.activityCloseEnterAnimation) : c(context, R.attr.activityCloseExitAnimation);
        }
        if (i8 == 4099) {
            return z8 ? p102l2.a.f29132c : p102l2.a.f29133d;
        }
        if (i8 != 4100) {
            return -1;
        }
        return z8 ? c(context, R.attr.activityOpenEnterAnimation) : c(context, R.attr.activityOpenExitAnimation);
    }

    /* JADX INFO: renamed from: m2.l$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Animation f29930a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Animator f29931b;

        public a(Animation animation) {
            this.f29930a = animation;
            this.f29931b = null;
            if (animation == null) {
                throw new IllegalStateException("Animation cannot be null");
            }
        }

        public a(Animator animator) {
            this.f29930a = null;
            this.f29931b = animator;
            if (animator == null) {
                throw new IllegalStateException(SZCvugJaXc.zGV);
            }
        }
    }

    /* JADX INFO: renamed from: m2.l$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends AnimationSet implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final ViewGroup f29932a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final View f29933b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f29934c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f29935d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f29936e;

        public b(Animation animation, ViewGroup viewGroup, View view) {
            super(false);
            this.f29936e = true;
            this.f29932a = viewGroup;
            this.f29933b = view;
            addAnimation(animation);
            viewGroup.post(this);
        }

        @Override // android.view.animation.AnimationSet, android.view.animation.Animation
        public boolean getTransformation(long j8, Transformation transformation) {
            this.f29936e = true;
            if (this.f29934c) {
                return !this.f29935d;
            }
            if (!super.getTransformation(j8, transformation)) {
                this.f29934c = true;
                B.a(this.f29932a, this);
            }
            return true;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f29934c || !this.f29936e) {
                this.f29932a.endViewTransition(this.f29933b);
                this.f29935d = true;
            } else {
                this.f29936e = false;
                this.f29932a.post(this);
            }
        }

        @Override // android.view.animation.Animation
        public boolean getTransformation(long j8, Transformation transformation, float f8) {
            this.f29936e = true;
            if (this.f29934c) {
                return !this.f29935d;
            }
            if (!super.getTransformation(j8, transformation, f8)) {
                this.f29934c = true;
                B.a(this.f29932a, this);
            }
            return true;
        }
    }
}
