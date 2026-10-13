package io.sentry.android.replay;

import C6.G;
import android.view.View;
import io.sentry.InterfaceC2480b0;
import io.sentry.J2;
import io.sentry.util.C2569a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class y implements f, io.sentry.android.replay.d {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final a f26954k = new a(null);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f26955l = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J2 f26956a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f26957b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final io.sentry.android.replay.util.i f26958c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f26959d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AtomicBoolean f26960e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ArrayList f26961f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C2569a f26962g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public s f26963h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public ScheduledFuture f26964i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C6.j f26965j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26966a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r8) {
            kotlin.jvm.internal.t.g(r8, "r");
            StringBuilder sb = new StringBuilder();
            sb.append("SentryWindowRecorder-");
            int i8 = this.f26966a;
            this.f26966a = i8 + 1;
            sb.append(i8);
            Thread thread = new Thread(r8, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26967a = new c();

        public c() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService invoke() {
            return Executors.newSingleThreadScheduledExecutor(new b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f26968a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(1);
            this.f26968a = view;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(WeakReference it) {
            kotlin.jvm.internal.t.g(it, "it");
            return Boolean.valueOf(kotlin.jvm.internal.t.c(it.get(), this.f26968a));
        }
    }

    public y(J2 options, t tVar, io.sentry.android.replay.util.i mainLooperHandler, ScheduledExecutorService replayExecutor) {
        kotlin.jvm.internal.t.g(options, "options");
        kotlin.jvm.internal.t.g(mainLooperHandler, "mainLooperHandler");
        kotlin.jvm.internal.t.g(replayExecutor, "replayExecutor");
        this.f26956a = options;
        this.f26957b = tVar;
        this.f26958c = mainLooperHandler;
        this.f26959d = replayExecutor;
        this.f26960e = new AtomicBoolean(false);
        this.f26961f = new ArrayList();
        this.f26962g = new C2569a();
        this.f26965j = C6.k.b(c.f26967a);
    }

    public static final void o(y this$0) {
        kotlin.jvm.internal.t.g(this$0, "this$0");
        s sVar = this$0.f26963h;
        if (sVar != null) {
            sVar.i();
        }
    }

    @Override // io.sentry.android.replay.d
    public void b(View root, boolean z8) throws Exception {
        kotlin.jvm.internal.t.g(root, "root");
        InterfaceC2480b0 interfaceC2480b0A = this.f26962g.a();
        try {
            if (z8) {
                this.f26961f.add(new WeakReference(root));
                s sVar = this.f26963h;
                if (sVar != null) {
                    sVar.h(root);
                    G g8 = G.f1419a;
                }
            } else {
                s sVar2 = this.f26963h;
                if (sVar2 != null) {
                    sVar2.v(root);
                }
                D6.w.L(this.f26961f, new d(root));
                WeakReference weakReference = (WeakReference) D6.z.u0(this.f26961f);
                View view = weakReference != null ? (View) weakReference.get() : null;
                if (view == null || kotlin.jvm.internal.t.c(root, view)) {
                    G g9 = G.f1419a;
                } else {
                    s sVar3 = this.f26963h;
                    if (sVar3 != null) {
                        sVar3.h(view);
                        G g10 = G.f1419a;
                    }
                }
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

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        stop();
        ScheduledExecutorService capturer = j();
        kotlin.jvm.internal.t.f(capturer, "capturer");
        io.sentry.android.replay.util.g.d(capturer, this.f26956a);
    }

    @Override // io.sentry.android.replay.f
    public void h() {
        s sVar = this.f26963h;
        if (sVar != null) {
            sVar.u();
        }
    }

    @Override // io.sentry.android.replay.f
    public void h1(u recorderConfig) {
        kotlin.jvm.internal.t.g(recorderConfig, "recorderConfig");
        if (this.f26960e.getAndSet(true)) {
            return;
        }
        this.f26963h = new s(recorderConfig, this.f26956a, this.f26958c, this.f26959d, this.f26957b);
        ScheduledExecutorService capturer = j();
        kotlin.jvm.internal.t.f(capturer, "capturer");
        this.f26964i = io.sentry.android.replay.util.g.e(capturer, this.f26956a, "WindowRecorder.capture", 100L, 1000 / ((long) recorderConfig.b()), TimeUnit.MILLISECONDS, new Runnable() { // from class: io.sentry.android.replay.x
            @Override // java.lang.Runnable
            public final void run() {
                y.o(this.f26953a);
            }
        });
    }

    @Override // io.sentry.android.replay.f
    public void i() {
        s sVar = this.f26963h;
        if (sVar != null) {
            sVar.t();
        }
    }

    public final ScheduledExecutorService j() {
        return (ScheduledExecutorService) this.f26965j.getValue();
    }

    @Override // io.sentry.android.replay.f
    public void stop() throws Exception {
        InterfaceC2480b0 interfaceC2480b0A = this.f26962g.a();
        try {
            for (WeakReference weakReference : this.f26961f) {
                s sVar = this.f26963h;
                if (sVar != null) {
                    sVar.v((View) weakReference.get());
                }
            }
            this.f26961f.clear();
            G g8 = G.f1419a;
            O6.a.a(interfaceC2480b0A, null);
            s sVar2 = this.f26963h;
            if (sVar2 != null) {
                sVar2.m();
            }
            this.f26963h = null;
            ScheduledFuture scheduledFuture = this.f26964i;
            if (scheduledFuture != null) {
                scheduledFuture.cancel(false);
            }
            this.f26964i = null;
            this.f26960e.set(false);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                O6.a.a(interfaceC2480b0A, th);
                throw th2;
            }
        }
    }

    public /* synthetic */ y(J2 j8, t tVar, io.sentry.android.replay.util.i iVar, ScheduledExecutorService scheduledExecutorService, int i8, AbstractC2633k abstractC2633k) {
        this(j8, (i8 & 2) != 0 ? null : tVar, iVar, scheduledExecutorService);
    }
}
