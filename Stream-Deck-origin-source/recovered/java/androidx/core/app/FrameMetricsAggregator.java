package androidx.core.app;

import android.app.Activity;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.SparseIntArray;
import android.view.FrameMetrics;
import android.view.Window;
import java.lang.ref.WeakReference;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f15038a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends b {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static HandlerThread f15039e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static Handler f15040f;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15041a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public SparseIntArray[] f15042b = new SparseIntArray[9];

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ArrayList f15043c = new ArrayList();

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Window.OnFrameMetricsAvailableListener f15044d = new WindowOnFrameMetricsAvailableListenerC0368a();

        /* JADX INFO: renamed from: androidx.core.app.FrameMetricsAggregator$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class WindowOnFrameMetricsAvailableListenerC0368a implements Window.OnFrameMetricsAvailableListener {
            public WindowOnFrameMetricsAvailableListenerC0368a() {
            }

            @Override // android.view.Window.OnFrameMetricsAvailableListener
            public void onFrameMetricsAvailable(Window window, FrameMetrics frameMetrics, int i8) {
                a aVar = a.this;
                if ((aVar.f15041a & 1) != 0) {
                    aVar.f(aVar.f15042b[0], frameMetrics.getMetric(8));
                }
                a aVar2 = a.this;
                if ((aVar2.f15041a & 2) != 0) {
                    aVar2.f(aVar2.f15042b[1], frameMetrics.getMetric(1));
                }
                a aVar3 = a.this;
                if ((aVar3.f15041a & 4) != 0) {
                    aVar3.f(aVar3.f15042b[2], frameMetrics.getMetric(3));
                }
                a aVar4 = a.this;
                if ((aVar4.f15041a & 8) != 0) {
                    aVar4.f(aVar4.f15042b[3], frameMetrics.getMetric(4));
                }
                a aVar5 = a.this;
                if ((aVar5.f15041a & 16) != 0) {
                    aVar5.f(aVar5.f15042b[4], frameMetrics.getMetric(5));
                }
                a aVar6 = a.this;
                if ((aVar6.f15041a & 64) != 0) {
                    aVar6.f(aVar6.f15042b[6], frameMetrics.getMetric(7));
                }
                a aVar7 = a.this;
                if ((aVar7.f15041a & 32) != 0) {
                    aVar7.f(aVar7.f15042b[5], frameMetrics.getMetric(6));
                }
                a aVar8 = a.this;
                if ((aVar8.f15041a & 128) != 0) {
                    aVar8.f(aVar8.f15042b[7], frameMetrics.getMetric(0));
                }
                a aVar9 = a.this;
                if ((aVar9.f15041a & 256) != 0) {
                    aVar9.f(aVar9.f15042b[8], frameMetrics.getMetric(2));
                }
            }
        }

        public a(int i8) {
            this.f15041a = i8;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public void a(Activity activity) {
            if (f15039e == null) {
                HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                f15039e = handlerThread;
                handlerThread.start();
                f15040f = new Handler(f15039e.getLooper());
            }
            for (int i8 = 0; i8 <= 8; i8++) {
                SparseIntArray[] sparseIntArrayArr = this.f15042b;
                if (sparseIntArrayArr[i8] == null && (this.f15041a & (1 << i8)) != 0) {
                    sparseIntArrayArr[i8] = new SparseIntArray();
                }
            }
            activity.getWindow().addOnFrameMetricsAvailableListener(this.f15044d, f15040f);
            this.f15043c.add(new WeakReference(activity));
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] b() {
            return this.f15042b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] c(Activity activity) {
            for (WeakReference weakReference : this.f15043c) {
                if (weakReference.get() == activity) {
                    this.f15043c.remove(weakReference);
                    break;
                }
            }
            activity.getWindow().removeOnFrameMetricsAvailableListener(this.f15044d);
            return this.f15042b;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] d() {
            SparseIntArray[] sparseIntArrayArr = this.f15042b;
            this.f15042b = new SparseIntArray[9];
            return sparseIntArrayArr;
        }

        @Override // androidx.core.app.FrameMetricsAggregator.b
        public SparseIntArray[] e() {
            for (int size = this.f15043c.size() - 1; size >= 0; size--) {
                WeakReference weakReference = (WeakReference) this.f15043c.get(size);
                Activity activity = (Activity) weakReference.get();
                if (weakReference.get() != null) {
                    activity.getWindow().removeOnFrameMetricsAvailableListener(this.f15044d);
                    this.f15043c.remove(size);
                }
            }
            return this.f15042b;
        }

        public void f(SparseIntArray sparseIntArray, long j8) {
            if (sparseIntArray != null) {
                int i8 = (int) ((500000 + j8) / 1000000);
                if (j8 >= 0) {
                    sparseIntArray.put(i8, sparseIntArray.get(i8) + 1);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public abstract void a(Activity activity);

        public abstract SparseIntArray[] b();

        public abstract SparseIntArray[] c(Activity activity);

        public abstract SparseIntArray[] d();

        public abstract SparseIntArray[] e();
    }

    public FrameMetricsAggregator() {
        this(1);
    }

    public void a(Activity activity) {
        this.f15038a.a(activity);
    }

    public SparseIntArray[] b() {
        return this.f15038a.b();
    }

    public SparseIntArray[] c(Activity activity) {
        return this.f15038a.c(activity);
    }

    public SparseIntArray[] d() {
        return this.f15038a.d();
    }

    public SparseIntArray[] e() {
        return this.f15038a.e();
    }

    public FrameMetricsAggregator(int i8) {
        this.f15038a = new a(i8);
    }
}
