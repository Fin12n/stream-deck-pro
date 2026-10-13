package io.sentry.android.replay.capture;

import C6.G;
import E4.JFpq.XRlnZWSrAFn;
import Q6.o;
import Z6.w;
import android.graphics.Bitmap;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import io.sentry.EnumC2596z2;
import io.sentry.InterfaceC2549q1;
import io.sentry.J2;
import io.sentry.K2;
import io.sentry.V;
import io.sentry.X;
import io.sentry.transport.p;
import io.sentry.util.C2576h;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p027d.LrLN.vHKCAgr;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class m extends io.sentry.android.replay.capture.a {

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public static final a f26787y = new a(null);

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public static final int f26788z = 8;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final J2 f26789v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final X f26790w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final p f26791x;

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
        public b() {
            super(1);
        }

        public final void b(h.c segment) {
            t.g(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, m.this.f26790w, null, 2, null);
                m mVar = m.this;
                mVar.l(mVar.m() + 1);
                m.this.j(aVar.c().f0());
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
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
                h.c.a.b((h.c.a) segment, m.this.f26790w, null, 2, null);
                m mVar = m.this;
                mVar.l(mVar.m() + 1);
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

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ File f26795b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file) {
            super(1);
            this.f26795b = file;
        }

        public final void b(h.c segment) {
            t.g(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a.b((h.c.a) segment, m.this.f26790w, null, 2, null);
            }
            C2576h.a(this.f26795b);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((h.c) obj);
            return G.f1419a;
        }
    }

    public /* synthetic */ m(J2 j8, X x8, p pVar, ScheduledExecutorService scheduledExecutorService, Q6.k kVar, int i8, AbstractC2633k abstractC2633k) {
        this(j8, x8, pVar, scheduledExecutorService, (i8 & 16) != 0 ? null : kVar);
    }

    private final void J(String str, final Q6.k kVar) {
        long currentTimeMillis = this.f26791x.getCurrentTimeMillis();
        final Date dateY = y();
        if (dateY == null) {
            return;
        }
        final int iM = m();
        final long time = currentTimeMillis - dateY.getTime();
        final io.sentry.protocol.u uVarE = e();
        final int iC = t().c();
        final int iD = t().d();
        io.sentry.android.replay.util.g.h(u(), this.f26789v, "SessionCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.i
            @Override // java.lang.Runnable
            public final void run() {
                m.K(this.f26773a, time, dateY, uVarE, iM, iC, iD, kVar);
            }
        });
    }

    public static final void N(V it) {
        t.g(it, "it");
        it.g(io.sentry.protocol.u.f27472b);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void c(io.sentry.android.replay.u recorderConfig) {
        t.g(recorderConfig, "recorderConfig");
        J("onConfigurationChanged", new b());
        super.c(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public h f() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.h
    public void g(Bitmap bitmap, final o store) {
        t.g(store, "store");
        final long currentTimeMillis = this.f26791x.getCurrentTimeMillis();
        final int iC = t().c();
        final int iD = t().d();
        io.sentry.android.replay.util.g.h(u(), this.f26789v, "SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.l
            @Override // java.lang.Runnable
            public final void run() {
                m.L(this.f26782a, store, currentTimeMillis, iC, iD);
            }
        });
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void i() {
        J("pause", new c());
        super.i();
    }

    @Override // io.sentry.android.replay.capture.h
    public void k(boolean z8, Q6.k onSegmentSent) {
        t.g(onSegmentSent, "onSegmentSent");
        this.f26789v.getLogger().c(EnumC2596z2.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        z().set(z8);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.h hVarQ = q();
        J("stop", new d(hVarQ != null ? hVarQ.r0() : null));
        X x8 = this.f26790w;
        if (x8 != null) {
            x8.u(new InterfaceC2549q1() { // from class: io.sentry.android.replay.capture.k
                @Override // io.sentry.InterfaceC2549q1
                public final void a(V v8) {
                    m.N(v8);
                }
            });
        }
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(J2 options, X x8, p dateProvider, ScheduledExecutorService executor, Q6.k kVar) {
        super(options, x8, dateProvider, executor, kVar);
        t.g(options, "options");
        t.g(dateProvider, "dateProvider");
        t.g(executor, "executor");
        this.f26789v = options;
        this.f26790w = x8;
        this.f26791x = dateProvider;
    }

    public static final void K(m this$0, long j8, Date currentSegmentTimestamp, io.sentry.protocol.u replayId, int i8, int i9, int i10, Q6.k kVar) {
        t.g(this$0, "this$0");
        t.g(currentSegmentTimestamp, "$currentSegmentTimestamp");
        t.g(replayId, "$replayId");
        t.g(kVar, QhsKALGiniuQ.roposviVmhWWu);
        kVar.invoke(io.sentry.android.replay.capture.a.p(this$0, j8, currentSegmentTimestamp, replayId, i8, i9, i10, null, null, 0, 0, null, null, null, 8128, null));
    }

    public static final void L(m this$0, o store, long j8, int i8, int i9) {
        t.g(this$0, "this$0");
        t.g(store, "$store");
        io.sentry.android.replay.h hVarQ = this$0.q();
        if (hVarQ != null) {
            store.invoke(hVarQ, Long.valueOf(j8));
        }
        Date dateY = this$0.y();
        if (dateY == null) {
            this$0.f26789v.getLogger().c(EnumC2596z2.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (this$0.z().get()) {
            this$0.f26789v.getLogger().c(EnumC2596z2.DEBUG, cFAYKUlMj.DIwTzJW, new Object[0]);
            return;
        }
        long currentTimeMillis = this$0.f26791x.getCurrentTimeMillis();
        if (currentTimeMillis - dateY.getTime() >= this$0.f26789v.getSessionReplay().l()) {
            h.c cVarP = io.sentry.android.replay.capture.a.p(this$0, this$0.f26789v.getSessionReplay().l(), dateY, this$0.e(), this$0.m(), i8, i9, null, null, 0, 0, null, null, null, 8128, null);
            if (cVarP instanceof h.c.a) {
                h.c.a aVar = (h.c.a) cVarP;
                h.c.a.b(aVar, this$0.f26790w, null, 2, null);
                this$0.l(this$0.m() + 1);
                this$0.j(aVar.c().f0());
            }
        }
        if (currentTimeMillis - this$0.v().get() >= this$0.f26789v.getSessionReplay().j()) {
            this$0.f26789v.getReplayController().stop();
            this$0.f26789v.getLogger().c(EnumC2596z2.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    public static final void M(m mVar, V it) {
        t.g(mVar, vHKCAgr.bSjHnZG);
        t.g(it, "it");
        it.g(mVar.e());
        String strD = it.D();
        mVar.D(strD != null ? w.O0(strD, com.amazon.a.a.o.c.a.b.f16789a, null, 2, null) : null);
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void d(io.sentry.android.replay.u uVar, int i8, io.sentry.protocol.u replayId, K2.b bVar) {
        t.g(uVar, XRlnZWSrAFn.pGDXWoxzMTiIHQT);
        t.g(replayId, "replayId");
        super.d(uVar, i8, replayId, bVar);
        X x8 = this.f26790w;
        if (x8 != null) {
            x8.u(new InterfaceC2549q1() { // from class: io.sentry.android.replay.capture.j
                @Override // io.sentry.InterfaceC2549q1
                public final void a(V v8) {
                    m.M(this.f26781a, v8);
                }
            });
        }
    }
}
