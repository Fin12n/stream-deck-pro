package io.sentry.android.replay;

import D6.C0937q;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.PixelCopy;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import io.sentry.EnumC2596z2;
import io.sentry.J2;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class s implements ViewTreeObserver.OnDrawListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final u f26853a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f26854b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.sentry.android.replay.util.i f26855c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f26856d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final t f26857e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public WeakReference f26858f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C6.j f26859g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C6.j f26860h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Bitmap f26861i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C6.j f26862j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C6.j f26863k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final AtomicBoolean f26864l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f26865m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f26866n;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Canvas f26868b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Canvas canvas) {
            super(1);
            this.f26868b = canvas;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(io.sentry.android.replay.viewhierarchy.b node) {
            C6.o oVarA;
            Integer numI;
            kotlin.jvm.internal.t.g(node, "node");
            if (node.c() && node.e() > 0 && node.b() > 0) {
                if (node.d() == null) {
                    return Boolean.FALSE;
                }
                if (node instanceof io.sentry.android.replay.viewhierarchy.b.c) {
                    List listE = C0937q.e(node.d());
                    s sVar = s.this;
                    oVarA = C6.v.a(listE, Integer.valueOf(sVar.n(sVar.f26861i, node.d())));
                } else {
                    if (node instanceof io.sentry.android.replay.viewhierarchy.b.d) {
                        io.sentry.android.replay.viewhierarchy.b.d dVar = (io.sentry.android.replay.viewhierarchy.b.d) node;
                        io.sentry.android.replay.util.m mVarJ = dVar.j();
                        oVarA = C6.v.a(io.sentry.android.replay.util.n.c(dVar.j(), node.d(), dVar.k(), dVar.l()), Integer.valueOf(((mVarJ == null || (numI = mVarJ.g()) == null) && (numI = dVar.i()) == null) ? -16777216 : numI.intValue()));
                    } else {
                        oVarA = C6.v.a(C0937q.e(node.d()), -16777216);
                    }
                }
                List list = (List) oVarA.a();
                s.this.p().setColor(((Number) oVarA.b()).intValue());
                Canvas canvas = this.f26868b;
                s sVar2 = s.this;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    canvas.drawRoundRect(new RectF((Rect) it.next()), 10.0f, 10.0f, sVar2.p());
                }
            }
            return Boolean.TRUE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f26869a = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Paint invoke() {
            return new Paint();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Function0 {
        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Matrix invoke() {
            Matrix matrix = new Matrix();
            s sVar = s.this;
            matrix.preScale(sVar.o().e(), sVar.o().f());
            return matrix;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f26871a = new d();

        public d() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Bitmap invoke() {
            Bitmap bitmapCreateBitmap = Bitmap.createBitmap(1, 1, Bitmap.Config.RGB_565);
            kotlin.jvm.internal.t.f(bitmapCreateBitmap, "createBitmap(\n          ….Config.RGB_565\n        )");
            return bitmapCreateBitmap;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends kotlin.jvm.internal.u implements Function0 {
        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Canvas invoke() {
            return new Canvas(s.this.r());
        }
    }

    public s(u config, J2 options, io.sentry.android.replay.util.i mainLooperHandler, ScheduledExecutorService recorder, t tVar) {
        kotlin.jvm.internal.t.g(config, "config");
        kotlin.jvm.internal.t.g(options, "options");
        kotlin.jvm.internal.t.g(mainLooperHandler, "mainLooperHandler");
        kotlin.jvm.internal.t.g(recorder, "recorder");
        this.f26853a = config;
        this.f26854b = options;
        this.f26855c = mainLooperHandler;
        this.f26856d = recorder;
        this.f26857e = tVar;
        C6.l lVar = C6.l.NONE;
        this.f26859g = C6.k.a(lVar, b.f26869a);
        this.f26860h = C6.k.a(lVar, d.f26871a);
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(config.d(), config.c(), Bitmap.Config.RGB_565);
        kotlin.jvm.internal.t.f(bitmapCreateBitmap, "createBitmap(\n        co…tmap.Config.RGB_565\n    )");
        this.f26861i = bitmapCreateBitmap;
        this.f26862j = C6.k.a(lVar, new e());
        this.f26863k = C6.k.a(lVar, new c());
        this.f26864l = new AtomicBoolean(false);
        this.f26865m = new AtomicBoolean(true);
        this.f26866n = new AtomicBoolean(false);
    }

    public static final void j(final s this$0, Window window, final View view) {
        kotlin.jvm.internal.t.g(this$0, "this$0");
        try {
            this$0.f26864l.set(false);
            PixelCopy.request(window, this$0.f26861i, new PixelCopy.OnPixelCopyFinishedListener() { // from class: io.sentry.android.replay.q
                @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
                public final void onPixelCopyFinished(int i8) {
                    s.k(this.f26849a, view, i8);
                }
            }, this$0.f26855c.a());
        } catch (Throwable th) {
            this$0.f26854b.getLogger().b(EnumC2596z2.WARNING, "Failed to capture replay recording", th);
            this$0.f26866n.set(false);
        }
    }

    public static final void k(final s this$0, View view, int i8) {
        kotlin.jvm.internal.t.g(this$0, "this$0");
        if (i8 != 0) {
            this$0.f26854b.getLogger().c(EnumC2596z2.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i8));
            this$0.f26866n.set(false);
        } else if (this$0.f26864l.get()) {
            this$0.f26854b.getLogger().c(EnumC2596z2.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
            this$0.f26866n.set(false);
        } else {
            final io.sentry.android.replay.viewhierarchy.b bVarA = io.sentry.android.replay.viewhierarchy.b.f26927m.a(view, null, 0, this$0.f26854b);
            io.sentry.android.replay.util.n.h(view, bVarA, this$0.f26854b);
            io.sentry.android.replay.util.g.h(this$0.f26856d, this$0.f26854b, "screenshot_recorder.mask", new Runnable() { // from class: io.sentry.android.replay.r
                @Override // java.lang.Runnable
                public final void run() {
                    s.l(this.f26851a, bVarA);
                }
            });
        }
    }

    public static final void l(s this$0, io.sentry.android.replay.viewhierarchy.b viewHierarchy) {
        kotlin.jvm.internal.t.g(this$0, "this$0");
        kotlin.jvm.internal.t.g(viewHierarchy, "$viewHierarchy");
        Canvas canvas = new Canvas(this$0.f26861i);
        canvas.setMatrix(this$0.q());
        viewHierarchy.h(this$0.new a(canvas));
        t tVar = this$0.f26857e;
        if (tVar != null) {
            tVar.v(this$0.f26861i);
        }
        this$0.f26866n.set(true);
        this$0.f26864l.set(false);
    }

    public final void h(View root) {
        kotlin.jvm.internal.t.g(root, "root");
        WeakReference weakReference = this.f26858f;
        v(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f26858f;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f26858f = new WeakReference(root);
        io.sentry.android.replay.util.n.a(root, this);
        this.f26864l.set(true);
    }

    public final void i() {
        if (!this.f26865m.get()) {
            this.f26854b.getLogger().c(EnumC2596z2.DEBUG, "ScreenshotRecorder is paused, not capturing screenshot", new Object[0]);
            return;
        }
        if (!this.f26864l.get() && this.f26866n.get()) {
            this.f26854b.getLogger().c(EnumC2596z2.DEBUG, "Content hasn't changed, repeating last known frame", new Object[0]);
            t tVar = this.f26857e;
            if (tVar != null) {
                tVar.v(this.f26861i);
                return;
            }
            return;
        }
        WeakReference weakReference = this.f26858f;
        final View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.f26854b.getLogger().c(EnumC2596z2.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
            return;
        }
        final Window windowA = A.a(view);
        if (windowA == null) {
            this.f26854b.getLogger().c(EnumC2596z2.DEBUG, "Window is invalid, not capturing screenshot", new Object[0]);
        } else {
            this.f26855c.b(new Runnable() { // from class: io.sentry.android.replay.p
                @Override // java.lang.Runnable
                public final void run() {
                    s.j(this.f26846a, windowA, view);
                }
            });
        }
    }

    public final void m() {
        WeakReference weakReference = this.f26858f;
        v(weakReference != null ? (View) weakReference.get() : null);
        WeakReference weakReference2 = this.f26858f;
        if (weakReference2 != null) {
            weakReference2.clear();
        }
        this.f26861i.recycle();
        this.f26865m.set(false);
    }

    public final int n(Bitmap bitmap, Rect rect) {
        Rect rect2 = new Rect(rect);
        RectF rectF = new RectF(rect2);
        q().mapRect(rectF);
        rectF.round(rect2);
        s().drawBitmap(bitmap, rect2, new Rect(0, 0, 1, 1), (Paint) null);
        return r().getPixel(0, 0);
    }

    public final u o() {
        return this.f26853a;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public void onDraw() {
        WeakReference weakReference = this.f26858f;
        View view = weakReference != null ? (View) weakReference.get() : null;
        if (view == null || view.getWidth() <= 0 || view.getHeight() <= 0 || !view.isShown()) {
            this.f26854b.getLogger().c(EnumC2596z2.DEBUG, "Root view is invalid, not capturing screenshot", new Object[0]);
        } else {
            this.f26864l.set(true);
        }
    }

    public final Paint p() {
        return (Paint) this.f26859g.getValue();
    }

    public final Matrix q() {
        return (Matrix) this.f26863k.getValue();
    }

    public final Bitmap r() {
        return (Bitmap) this.f26860h.getValue();
    }

    public final Canvas s() {
        return (Canvas) this.f26862j.getValue();
    }

    public final void t() {
        this.f26865m.set(false);
        WeakReference weakReference = this.f26858f;
        v(weakReference != null ? (View) weakReference.get() : null);
    }

    public final void u() {
        View view;
        WeakReference weakReference = this.f26858f;
        if (weakReference != null && (view = (View) weakReference.get()) != null) {
            io.sentry.android.replay.util.n.a(view, this);
        }
        this.f26865m.set(true);
    }

    public final void v(View view) {
        if (view != null) {
            io.sentry.android.replay.util.n.f(view, this);
        }
    }
}
