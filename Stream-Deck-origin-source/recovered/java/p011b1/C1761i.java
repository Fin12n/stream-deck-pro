package p011b1;

import Q0.f;
import Q0.g;
import android.os.Build;
import android.util.SparseBooleanArray;
import android.util.SparseLongArray;
import android.view.MotionEvent;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: renamed from: b1.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1761i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f15747a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final SparseLongArray f15748b = new SparseLongArray();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final SparseBooleanArray f15749c = new SparseBooleanArray();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f15750d = new ArrayList();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15751e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f15752f = -1;

    public final void a(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 0 && actionMasked != 5) {
            if (actionMasked != 9) {
                return;
            }
            int pointerId = motionEvent.getPointerId(0);
            if (this.f15748b.indexOfKey(pointerId) < 0) {
                SparseLongArray sparseLongArray = this.f15748b;
                long j8 = this.f15747a;
                this.f15747a = 1 + j8;
                sparseLongArray.put(pointerId, j8);
                return;
            }
            return;
        }
        int actionIndex = motionEvent.getActionIndex();
        int pointerId2 = motionEvent.getPointerId(actionIndex);
        if (this.f15748b.indexOfKey(pointerId2) < 0) {
            SparseLongArray sparseLongArray2 = this.f15748b;
            long j9 = this.f15747a;
            this.f15747a = 1 + j9;
            sparseLongArray2.put(pointerId2, j9);
            if (motionEvent.getToolType(actionIndex) == 3) {
                this.f15749c.put(pointerId2, true);
            }
        }
    }

    public final void b(MotionEvent motionEvent) {
        if (motionEvent.getPointerCount() != 1) {
            return;
        }
        int toolType = motionEvent.getToolType(0);
        int source = motionEvent.getSource();
        if (toolType == this.f15751e && source == this.f15752f) {
            return;
        }
        this.f15751e = toolType;
        this.f15752f = source;
        this.f15749c.clear();
        this.f15748b.clear();
    }

    public final B c(MotionEvent motionEvent, O o8) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 3) {
            this.f15748b.clear();
            this.f15749c.clear();
            return null;
        }
        b(motionEvent);
        a(motionEvent);
        boolean z8 = actionMasked == 10 || actionMasked == 7 || actionMasked == 9;
        boolean z9 = actionMasked == 8;
        if (z8) {
            this.f15749c.put(motionEvent.getPointerId(motionEvent.getActionIndex()), true);
        }
        if (actionMasked != 1) {
            actionIndex = actionMasked != 6 ? -1 : motionEvent.getActionIndex();
        } else {
            actionIndex = 0;
        }
        this.f15750d.clear();
        int pointerCount = motionEvent.getPointerCount();
        int i8 = 0;
        while (i8 < pointerCount) {
            this.f15750d.add(d(o8, motionEvent, i8, (z8 || i8 == actionIndex || (z9 && motionEvent.getButtonState() == 0)) ? false : true));
            i8++;
        }
        h(motionEvent);
        return new B(motionEvent.getEventTime(), this.f15750d, motionEvent);
    }

    public final C d(O o8, MotionEvent motionEvent, int i8, boolean z8) {
        long jO;
        int iE;
        long jF = f(motionEvent.getPointerId(i8));
        float pressure = motionEvent.getPressure(i8);
        long jA = g.a(motionEvent.getX(i8), motionEvent.getY(i8));
        long jI = f.i(jA, 0.0f, 0.0f, 3, null);
        if (i8 == 0) {
            jO = g.a(motionEvent.getRawX(), motionEvent.getRawY());
            jA = o8.w(jO);
        } else if (Build.VERSION.SDK_INT >= 29) {
            jO = C1762j.f15753a.a(motionEvent, i8);
            jA = o8.w(jO);
        } else {
            jO = o8.o(jA);
        }
        long j8 = jO;
        long j9 = jA;
        int toolType = motionEvent.getToolType(i8);
        if (toolType == 0) {
            iE = N.f15698a.e();
        } else if (toolType == 1) {
            iE = N.f15698a.d();
        } else if (toolType == 2) {
            iE = N.f15698a.c();
        } else if (toolType != 3) {
            iE = toolType != 4 ? N.f15698a.e() : N.f15698a.a();
        } else {
            iE = N.f15698a.b();
        }
        int i9 = iE;
        ArrayList arrayList = new ArrayList(motionEvent.getHistorySize());
        int historySize = motionEvent.getHistorySize();
        for (int i10 = 0; i10 < historySize; i10++) {
            float historicalX = motionEvent.getHistoricalX(i8, i10);
            float historicalY = motionEvent.getHistoricalY(i8, i10);
            if (!Float.isInfinite(historicalX) && !Float.isNaN(historicalX) && !Float.isInfinite(historicalY) && !Float.isNaN(historicalY)) {
                long jA2 = g.a(historicalX, historicalY);
                arrayList.add(new C1758f(motionEvent.getHistoricalEventTime(i10), jA2, jA2, null));
            }
        }
        return new C(jF, motionEvent.getEventTime(), j8, j9, z8, pressure, i9, this.f15749c.get(motionEvent.getPointerId(i8), false), arrayList, motionEvent.getActionMasked() == 8 ? g.a(motionEvent.getAxisValue(10), (-motionEvent.getAxisValue(9)) + 0.0f) : f.f9082b.c(), jI, null);
    }

    public final void e(int i8) {
        this.f15749c.delete(i8);
        this.f15748b.delete(i8);
    }

    public final long f(int i8) {
        long jValueAt;
        int iIndexOfKey = this.f15748b.indexOfKey(i8);
        if (iIndexOfKey >= 0) {
            jValueAt = this.f15748b.valueAt(iIndexOfKey);
        } else {
            jValueAt = this.f15747a;
            this.f15747a = 1 + jValueAt;
            this.f15748b.put(i8, jValueAt);
        }
        return y.b(jValueAt);
    }

    public final boolean g(MotionEvent motionEvent, int i8) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i9 = 0; i9 < pointerCount; i9++) {
            if (motionEvent.getPointerId(i9) == i8) {
                return true;
            }
        }
        return false;
    }

    public final void h(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1 || actionMasked == 6) {
            int pointerId = motionEvent.getPointerId(motionEvent.getActionIndex());
            if (!this.f15749c.get(pointerId, false)) {
                this.f15748b.delete(pointerId);
                this.f15749c.delete(pointerId);
            }
        }
        if (this.f15748b.size() > motionEvent.getPointerCount()) {
            for (int size = this.f15748b.size() - 1; -1 < size; size--) {
                int iKeyAt = this.f15748b.keyAt(size);
                if (!g(motionEvent, iKeyAt)) {
                    this.f15748b.removeAt(size);
                    this.f15749c.delete(iKeyAt);
                }
            }
        }
    }
}
