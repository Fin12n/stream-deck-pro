package p011b1;

import Q0.f;
import Q6.k;
import android.view.MotionEvent;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class L {
    public static final void a(long j8, k kVar) {
        MotionEvent motionEventObtain = MotionEvent.obtain(j8, j8, 3, 0.0f, 0.0f, 0);
        motionEventObtain.setSource(0);
        kVar.invoke(motionEventObtain);
        motionEventObtain.recycle();
    }

    public static final void b(C1766n c1766n, long j8, k kVar) {
        d(c1766n, j8, kVar, true);
    }

    public static final void c(C1766n c1766n, long j8, k kVar) {
        d(c1766n, j8, kVar, false);
    }

    public static final void d(C1766n c1766n, long j8, k kVar, boolean z8) {
        MotionEvent motionEventE = c1766n.e();
        if (motionEventE == null) {
            throw new IllegalArgumentException("The PointerEvent receiver cannot have a null MotionEvent.");
        }
        int action = motionEventE.getAction();
        if (z8) {
            motionEventE.setAction(3);
        }
        motionEventE.offsetLocation(-f.o(j8), -f.p(j8));
        kVar.invoke(motionEventE);
        motionEventE.offsetLocation(f.o(j8), f.p(j8));
        motionEventE.setAction(action);
    }
}
