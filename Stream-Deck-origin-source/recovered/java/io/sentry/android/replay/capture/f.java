package io.sentry.android.replay.capture;

import C6.G;
import D6.r;
import D6.w;
import D6.z;
import Q6.o;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import io.sentry.AbstractC2519l;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2549q1;
import io.sentry.J2;
import io.sentry.K2;
import io.sentry.V;
import io.sentry.X;
import io.sentry.transport.p;
import io.sentry.util.C2576h;
import io.sentry.util.x;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f extends io.sentry.android.replay.capture.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public static final a f26751A = new a(null);

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f26752B = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final J2 f26753v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final X f26754w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f26755x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final x f26756y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final List f26757z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Q6.k f26759b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Q6.k kVar) {
            super(1);
            this.f26759b = kVar;
        }

        public final void b(h.c segment) throws InterruptedException {
            t.g(segment, "segment");
            f fVar = f.this;
            fVar.M(fVar.f26757z);
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, f.this.f26754w, null, 2, null);
                Q6.k kVar = this.f26759b;
                Date dateF0 = aVar.c().f0();
                t.f(dateF0, "segment.replay.timestamp");
                kVar.invoke(dateF0);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) throws InterruptedException {
            b((h.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Q6.k {
        public c() {
            super(1);
        }

        public final void b(h.c segment) {
            t.g(segment, "segment");
            if (segment instanceof h.c.a) {
                f.this.f26757z.add(segment);
                f fVar = f.this;
                fVar.l(fVar.m() + 1);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((h.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.k {
        public d() {
            super(1);
        }

        public final void b(h.c segment) {
            t.g(segment, "segment");
            if (segment instanceof h.c.a) {
                f.this.f26757z.add(segment);
                f fVar = f.this;
                fVar.l(fVar.m() + 1);
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((h.c) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ long f26762a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ f f26763b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ F f26764c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j8, f fVar, F f8) {
            super(1);
            this.f26762a = j8;
            this.f26763b = fVar;
            this.f26764c = f8;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(h.c.a it) {
            t.g(it, "it");
            if (it.c().f0().getTime() >= this.f26762a) {
                return Boolean.FALSE;
            }
            f fVar = this.f26763b;
            fVar.l(fVar.m() - 1);
            this.f26763b.Q(it.c().g0());
            this.f26764c.f28775a = true;
            return Boolean.TRUE;
        }
    }

    public /* synthetic */ f(J2 j8, X x8, p pVar, x xVar, ScheduledExecutorService scheduledExecutorService, Q6.k kVar, int i8, AbstractC2633k abstractC2633k) {
        this(j8, x8, pVar, xVar, scheduledExecutorService, (i8 & 32) != 0 ? null : kVar);
    }

    public static final void N(f this$0, V it) {
        t.g(this$0, "this$0");
        t.g(it, "it");
        it.g(this$0.e());
    }

    public static final void R(f this$0, o store, long j8) {
        t.g(this$0, "this$0");
        t.g(store, "$store");
        io.sentry.android.replay.h hVarQ = this$0.q();
        if (hVarQ != null) {
            store.invoke(hVarQ, Long.valueOf(j8));
        }
        long currentTimeMillis = this$0.f26755x.getCurrentTimeMillis() - this$0.f26753v.getSessionReplay().c();
        io.sentry.android.replay.h hVarQ2 = this$0.q();
        this$0.D(hVarQ2 != null ? hVarQ2.A0(currentTimeMillis) : null);
        this$0.S(this$0.f26757z, currentTimeMillis);
    }

    public static final void T(File file) {
        C2576h.a(file);
    }

    public final void M(List list) throws InterruptedException {
        h.c.a aVar = (h.c.a) w.N(list);
        while (aVar != null) {
            h.c.a.b(aVar, this.f26754w, null, 2, null);
            aVar = (h.c.a) w.N(list);
            Thread.sleep(100L);
        }
    }

    public final void O(String str, final Q6.k kVar) {
        Date dateD;
        List listI0;
        long jC = this.f26753v.getSessionReplay().c();
        long currentTimeMillis = this.f26755x.getCurrentTimeMillis();
        io.sentry.android.replay.h hVarQ = q();
        if (hVarQ == null || (listI0 = hVarQ.i0()) == null || !(!listI0.isEmpty())) {
            dateD = AbstractC2519l.d(currentTimeMillis - jC);
        } else {
            io.sentry.android.replay.h hVarQ2 = q();
            t.d(hVarQ2);
            dateD = AbstractC2519l.d(((io.sentry.android.replay.i) z.i0(hVarQ2.i0())).c());
        }
        t.f(dateD, "if (cache?.frames?.isNot…ReplayDuration)\n        }");
        final int iM = m();
        final long time = currentTimeMillis - dateD.getTime();
        final io.sentry.protocol.u uVarE = e();
        final int iC = t().c();
        final int iD = t().d();
        final Date date = dateD;
        io.sentry.android.replay.util.g.h(u(), this.f26753v, "BufferCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.b
            @Override // java.lang.Runnable
            public final void run() {
                f.P(this.f26738a, time, date, uVarE, iM, iC, iD, kVar);
            }
        });
    }

    public final void Q(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f26753v.getLogger().c(EnumC2596z2.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th) {
            this.f26753v.getLogger().a(EnumC2596z2.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    public final void S(List list, long j8) {
        F f8 = new F();
        w.L(list, new e(j8, this, f8));
        if (f8.f28775a) {
            int i8 = 0;
            for (Object obj : list) {
                int i9 = i8 + 1;
                if (i8 < 0) {
                    r.x();
                }
                ((h.c.a) obj).d(i8);
                i8 = i9;
            }
        }
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void b(MotionEvent event) {
        t.g(event, "event");
        super.b(event);
        h.a.f(h.f26766a, r(), this.f26755x.getCurrentTimeMillis() - this.f26753v.getSessionReplay().c(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void c(io.sentry.android.replay.u recorderConfig) {
        t.g(recorderConfig, "recorderConfig");
        O("configuration_changed", new c());
        super.c(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public h f() {
        if (z().get()) {
            this.f26753v.getLogger().c(EnumC2596z2.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        m mVar = new m(this.f26753v, this.f26754w, this.f26755x, u(), null, 16, null);
        mVar.d(t(), m(), e(), K2.b.BUFFER);
        return mVar;
    }

    @Override // io.sentry.android.replay.capture.h
    public void g(Bitmap bitmap, final o store) {
        t.g(store, "store");
        final long currentTimeMillis = this.f26755x.getCurrentTimeMillis();
        io.sentry.android.replay.util.g.h(u(), this.f26753v, "BufferCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.e
            @Override // java.lang.Runnable
            public final void run() {
                f.R(this.f26748a, store, currentTimeMillis);
            }
        });
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void i() {
        O("pause", new d());
        super.i();
    }

    @Override // io.sentry.android.replay.capture.h
    public void k(boolean z8, Q6.k onSegmentSent) {
        t.g(onSegmentSent, "onSegmentSent");
        if (!io.sentry.android.replay.util.k.a(this.f26756y, this.f26753v.getSessionReplay().g())) {
            this.f26753v.getLogger().c(EnumC2596z2.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        X x8 = this.f26754w;
        if (x8 != null) {
            x8.u(new InterfaceC2549q1() { // from class: io.sentry.android.replay.capture.d
                @Override // io.sentry.InterfaceC2549q1
                public final void a(V v8) {
                    f.N(this.f26747a, v8);
                }
            });
        }
        if (!z8) {
            O("capture_replay", new b(onSegmentSent));
        } else {
            z().set(true);
            this.f26753v.getLogger().c(EnumC2596z2.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.h hVarQ = q();
        final File fileR0 = hVarQ != null ? hVarQ.r0() : null;
        io.sentry.android.replay.util.g.h(u(), this.f26753v, "BufferCaptureStrategy.stop", new Runnable() { // from class: io.sentry.android.replay.capture.c
            @Override // java.lang.Runnable
            public final void run() {
                f.T(fileR0);
            }
        });
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(J2 options, X x8, p dateProvider, x random, ScheduledExecutorService executor, Q6.k kVar) {
        super(options, x8, dateProvider, executor, kVar);
        t.g(options, "options");
        t.g(dateProvider, "dateProvider");
        t.g(random, "random");
        t.g(executor, "executor");
        this.f26753v = options;
        this.f26754w = x8;
        this.f26755x = dateProvider;
        this.f26756y = random;
        this.f26757z = new ArrayList();
    }

    public static final void P(f fVar, long j8, Date currentSegmentTimestamp, io.sentry.protocol.u replayId, int i8, int i9, int i10, Q6.k onSegmentCreated) {
        t.g(fVar, ajyWhveMDgQ.KlHeKSVQkk);
        t.g(currentSegmentTimestamp, "$currentSegmentTimestamp");
        t.g(replayId, "$replayId");
        t.g(onSegmentCreated, "$onSegmentCreated");
        onSegmentCreated.invoke(io.sentry.android.replay.capture.a.p(fVar, j8, currentSegmentTimestamp, replayId, i8, i9, i10, null, null, 0, 0, null, null, null, 8128, null));
    }
}
