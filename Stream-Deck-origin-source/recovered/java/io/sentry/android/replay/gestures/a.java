package io.sentry.android.replay.gestures;

import C6.G;
import D6.w;
import Q6.k;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2480b0;
import io.sentry.J2;
import io.sentry.android.replay.A;
import io.sentry.android.replay.d;
import io.sentry.android.replay.util.h;
import io.sentry.util.C2569a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class a implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f26798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final c f26799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final ArrayList f26800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final C2569a f26801d;

    /* JADX INFO: renamed from: io.sentry.android.replay.gestures.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0597a extends h {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final J2 f26802b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final c f26803c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0597a(J2 options, c cVar, Window.Callback callback) {
            super(callback);
            t.g(options, "options");
            this.f26802b = options;
            this.f26803c = cVar;
        }

        @Override // io.sentry.android.replay.util.h, android.view.Window.Callback
        public boolean dispatchTouchEvent(MotionEvent motionEvent) {
            if (motionEvent != null) {
                MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
                t.f(motionEventObtainNoHistory, "obtainNoHistory(event)");
                try {
                    c cVar = this.f26803c;
                    if (cVar != null) {
                        cVar.b(motionEventObtainNoHistory);
                    }
                } catch (Throwable th) {
                    try {
                        this.f26802b.getLogger().b(EnumC2596z2.ERROR, "Error dispatching touch event", th);
                    } finally {
                        motionEventObtainNoHistory.recycle();
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f26804a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(1);
            this.f26804a = view;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            t.g(it, "it");
            return Boolean.valueOf(t.c(it.get(), this.f26804a));
        }
    }

    public a(J2 options, c touchRecorderCallback) {
        t.g(options, "options");
        t.g(touchRecorderCallback, "touchRecorderCallback");
        this.f26798a = options;
        this.f26799b = touchRecorderCallback;
        this.f26800c = new ArrayList();
        this.f26801d = new C2569a();
    }

    public final void a(View view) {
        Window windowA = A.a(view);
        if (windowA == null) {
            this.f26798a.getLogger().c(EnumC2596z2.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        Window.Callback callback = windowA.getCallback();
        if (callback instanceof C0597a) {
            return;
        }
        windowA.setCallback(new C0597a(this.f26798a, this.f26799b, callback));
    }

    @Override // io.sentry.android.replay.d
    public void b(View root, boolean z8) throws Exception {
        t.g(root, "root");
        InterfaceC2480b0 interfaceC2480b0A = this.f26801d.a();
        try {
            if (z8) {
                this.f26800c.add(new WeakReference(root));
                a(root);
                G g8 = G.f1419a;
            } else {
                d(root);
                w.L(this.f26800c, new b(root));
            }
            O6.a.a(interfaceC2480b0A, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                O6.a.a(interfaceC2480b0A, th);
                throw th2;
            }
        }
    }

    public final void c() throws Exception {
        InterfaceC2480b0 interfaceC2480b0A = this.f26801d.a();
        try {
            Iterator it = this.f26800c.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    t.f(view, "get()");
                    d(view);
                }
            }
            this.f26800c.clear();
            G g8 = G.f1419a;
            O6.a.a(interfaceC2480b0A, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                O6.a.a(interfaceC2480b0A, th);
                throw th2;
            }
        }
    }

    public final void d(View view) {
        Window windowA = A.a(view);
        if (windowA == null) {
            this.f26798a.getLogger().c(EnumC2596z2.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowA.getCallback();
        if (callback instanceof C0597a) {
            windowA.setCallback(((C0597a) callback).f26893a);
        }
    }
}
