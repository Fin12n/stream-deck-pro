package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.C2479b;
import io.sentry.C2557s2;
import io.sentry.EnumC2596z2;
import io.sentry.ILogger;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ViewHierarchyEventProcessor implements io.sentry.C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final SentryAndroidOptions f26272a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.android.core.internal.util.h f26273b = new io.sentry.android.core.internal.util.h(io.sentry.android.core.internal.util.b.a(), 2000, 3);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.f26272a = (SentryAndroidOptions) io.sentry.util.u.c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.o.a("ViewHierarchy");
        }
    }

    public static /* synthetic */ void a(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, ILogger iLogger) {
        try {
            atomicReference.set(f(view, list));
            countDownLatch.countDown();
        } catch (Throwable th) {
            iLogger.b(EnumC2596z2.ERROR, "Failed to process view hierarchy.", th);
        }
    }

    public static void d(View view, io.sentry.protocol.H h8, List list) {
        if (view instanceof ViewGroup) {
            Iterator it = list.iterator();
            if (it.hasNext()) {
                p063h.s.a(it.next());
                throw null;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = viewGroup.getChildAt(i8);
                if (childAt != null) {
                    io.sentry.protocol.H hG = g(childAt);
                    arrayList.add(hG);
                    d(childAt, hG, list);
                }
            }
            h8.m(arrayList);
        }
    }

    public static io.sentry.protocol.G e(Activity activity, final List list, io.sentry.util.thread.a aVar, ILogger iLogger) {
        final ILogger iLogger2;
        Throwable th;
        if (activity == null) {
            iLogger.c(EnumC2596z2.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            iLogger.c(EnumC2596z2.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            iLogger.c(EnumC2596z2.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
            if (!aVar.b()) {
                final CountDownLatch countDownLatch = new CountDownLatch(1);
                final AtomicReference atomicReference = new AtomicReference(null);
                iLogger2 = iLogger;
                try {
                    activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.C0
                        @Override // java.lang.Runnable
                        public final void run() {
                            ViewHierarchyEventProcessor.a(atomicReference, viewPeekDecorView, list, countDownLatch, iLogger2);
                        }
                    });
                    if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                        return (io.sentry.protocol.G) atomicReference.get();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    th = th;
                    iLogger2.b(EnumC2596z2.ERROR, "Failed to process view hierarchy.", th);
                }
                return null;
            }
            try {
                return f(viewPeekDecorView, list);
            } catch (Throwable th3) {
                th = th3;
                iLogger2 = iLogger;
            }
        } catch (Throwable th4) {
            th = th4;
            iLogger2 = iLogger;
        }
        th = th;
        iLogger2.b(EnumC2596z2.ERROR, "Failed to process view hierarchy.", th);
        return null;
    }

    public static io.sentry.protocol.G f(View view, List list) {
        ArrayList arrayList = new ArrayList(1);
        io.sentry.protocol.G g8 = new io.sentry.protocol.G("android_view_system", arrayList);
        io.sentry.protocol.H hG = g(view);
        arrayList.add(hG);
        d(view, hG, list);
        return g8;
    }

    public static io.sentry.protocol.H g(View view) {
        io.sentry.protocol.H h8 = new io.sentry.protocol.H();
        h8.p(io.sentry.android.core.internal.util.e.a(view));
        try {
            h8.o(io.sentry.android.core.internal.gestures.i.b(view));
        } catch (Throwable unused) {
        }
        h8.t(Double.valueOf(view.getX()));
        h8.u(Double.valueOf(view.getY()));
        h8.s(Double.valueOf(view.getWidth()));
        h8.n(Double.valueOf(view.getHeight()));
        h8.l(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            h8.r("visible");
        } else if (visibility == 4) {
            h8.r("invisible");
        } else if (visibility == 8) {
            h8.r("gone");
        }
        return h8;
    }

    @Override // io.sentry.C
    public C2557s2 c(C2557s2 c2557s2, io.sentry.H h8) {
        io.sentry.protocol.G gE;
        if (c2557s2.y0()) {
            if (!this.f26272a.isAttachViewHierarchy()) {
                this.f26272a.getLogger().c(EnumC2596z2.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return c2557s2;
            }
            if (!io.sentry.util.m.i(h8)) {
                boolean zA = this.f26273b.a();
                this.f26272a.getBeforeViewHierarchyCaptureCallback();
                if (!zA && (gE = e(C2451a0.c().b(), this.f26272a.getViewHierarchyExporters(), this.f26272a.getThreadChecker(), this.f26272a.getLogger())) != null) {
                    h8.o(C2479b.c(gE));
                }
            }
        }
        return c2557s2;
    }

    @Override // io.sentry.C
    public io.sentry.protocol.B j(io.sentry.protocol.B b8, io.sentry.H h8) {
        return b8;
    }
}
