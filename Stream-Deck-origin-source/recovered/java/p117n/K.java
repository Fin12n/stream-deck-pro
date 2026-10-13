package p117n;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;
import p108m.f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class K implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f30224a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f30225b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f30226c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final View f30227d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Runnable f30228e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Runnable f30229f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f30230g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30231h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int[] f30232i = new int[2];

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = K.this.f30227d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            K.this.e();
        }
    }

    public K(View view) {
        this.f30227d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f30224a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f30225b = tapTimeout;
        this.f30226c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    public static boolean h(View view, float f8, float f9, float f10) {
        float f11 = -f10;
        return f8 >= f11 && f9 >= f11 && f8 < ((float) (view.getRight() - view.getLeft())) + f10 && f9 < ((float) (view.getBottom() - view.getTop())) + f10;
    }

    public final void a() {
        Runnable runnable = this.f30229f;
        if (runnable != null) {
            this.f30227d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f30228e;
        if (runnable2 != null) {
            this.f30227d.removeCallbacks(runnable2);
        }
    }

    public abstract f b();

    public boolean c() {
        f fVarB = b();
        if (fVarB == null || fVarB.a()) {
            return true;
        }
        fVarB.b();
        return true;
    }

    public boolean d() {
        f fVarB = b();
        if (fVarB == null || !fVarB.a()) {
            return true;
        }
        fVarB.dismiss();
        return true;
    }

    public void e() {
        a();
        View view = this.f30227d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f30230g = true;
        }
    }

    public final boolean f(MotionEvent motionEvent) {
        I i8;
        View view = this.f30227d;
        f fVarB = b();
        if (fVarB != null && fVarB.a() && (i8 = (I) fVarB.j()) != null && i8.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(i8, motionEventObtainNoHistory);
            boolean zE = i8.e(motionEventObtainNoHistory, this.f30231h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z8 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zE && z8) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d  */
    public final boolean g(MotionEvent motionEvent) {
        View view = this.f30227d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f30231h = motionEvent.getPointerId(0);
            if (this.f30228e == null) {
                this.f30228e = new a();
            }
            view.postDelayed(this.f30228e, this.f30225b);
            if (this.f30229f == null) {
                this.f30229f = new b();
            }
            view.postDelayed(this.f30229f, this.f30226c);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f30231h);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f30224a)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    public final boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f30232i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    public final boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f30232i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z8;
        boolean z9 = this.f30230g;
        if (z9) {
            z8 = f(motionEvent) || !d();
        } else {
            z8 = g(motionEvent) && c();
            if (z8) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f30227d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f30230g = z8;
        return z8 || z9;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f30230g = false;
        this.f30231h = -1;
        Runnable runnable = this.f30228e;
        if (runnable != null) {
            this.f30227d.removeCallbacks(runnable);
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }
}
