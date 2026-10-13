package io.sentry.android.replay;

import C6.G;
import Z.JTT.ryTuoS;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.C2491e;
import io.sentry.C2588x2;
import io.sentry.EnumC2515k;
import io.sentry.EnumC2596z2;
import io.sentry.F0;
import io.sentry.H;
import io.sentry.InterfaceC2447a0;
import io.sentry.InterfaceC2480b0;
import io.sentry.InterfaceC2509i1;
import io.sentry.InterfaceC2513j1;
import io.sentry.InterfaceC2516k0;
import io.sentry.InterfaceC2549q1;
import io.sentry.J2;
import io.sentry.L2;
import io.sentry.M;
import io.sentry.V;
import io.sentry.X;
import io.sentry.util.C2569a;
import io.sentry.util.C2576h;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class ReplayIntegration implements InterfaceC2516k0, Closeable, t, io.sentry.android.replay.gestures.c, InterfaceC2513j1, ComponentCallbacks, M.b, io.sentry.transport.A.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f26607a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final io.sentry.transport.p f26608b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Function0 f26609c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Q6.k f26610d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Q6.k f26611e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public J2 f26612f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public X f26613g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public io.sentry.android.replay.f f26614h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public io.sentry.android.replay.gestures.a f26615i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C6.j f26616j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C6.j f26617k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C6.j f26618l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicBoolean f26619m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicBoolean f26620n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public io.sentry.android.replay.capture.h f26621o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public InterfaceC2509i1 f26622p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Q6.k f26623q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public io.sentry.android.replay.util.i f26624r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public Function0 f26625s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final C2569a f26626t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final l f26627u;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements io.sentry.hints.c {
        @Override // io.sentry.hints.c
        public boolean a() {
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26628a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r8) {
            kotlin.jvm.internal.t.g(r8, "r");
            StringBuilder sb = new StringBuilder();
            sb.append("SentryReplayIntegration-");
            int i8 = this.f26628a;
            this.f26628a = i8 + 1;
            sb.append(i8);
            Thread thread = new Thread(r8, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends kotlin.jvm.internal.u implements Q6.k {
        public c() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Date) obj);
            return G.f1419a;
        }

        public final void b(Date date) {
            kotlin.jvm.internal.t.g(date, kDsnNkYbBsI.dAWtiiI);
            io.sentry.android.replay.capture.h hVar = ReplayIntegration.this.f26621o;
            if (hVar != null) {
                io.sentry.android.replay.capture.h hVar2 = ReplayIntegration.this.f26621o;
                Integer numValueOf = hVar2 != null ? Integer.valueOf(hVar2.m()) : null;
                kotlin.jvm.internal.t.d(numValueOf);
                hVar.l(numValueOf.intValue() + 1);
            }
            io.sentry.android.replay.capture.h hVar3 = ReplayIntegration.this.f26621o;
            if (hVar3 == null) {
                return;
            }
            hVar3.j(date);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends kotlin.jvm.internal.u implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Bitmap f26630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f26631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ ReplayIntegration f26632c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Bitmap bitmap, J j8, ReplayIntegration replayIntegration) {
            super(2);
            this.f26630a = bitmap;
            this.f26631b = j8;
            this.f26632c = replayIntegration;
        }

        public final void b(h onScreenshotRecorded, long j8) throws Exception {
            kotlin.jvm.internal.t.g(onScreenshotRecorded, "$this$onScreenshotRecorded");
            onScreenshotRecorded.v(this.f26630a, j8, (String) this.f26631b.f28779a);
            this.f26632c.j0();
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) throws Exception {
            b((h) obj, ((Number) obj2).longValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final e f26633a = new e();

        public e() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final io.sentry.util.x invoke() {
            return new io.sentry.util.x();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f26634a = new f();

        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final ScheduledExecutorService invoke() {
            return Executors.newSingleThreadScheduledExecutor(new b());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final g f26635a = new g();

        public g() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final o invoke() {
            return o.f26837e.b();
        }
    }

    public ReplayIntegration(Context context, io.sentry.transport.p dateProvider, Function0 function0, Q6.k kVar, Q6.k kVar2) {
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(dateProvider, "dateProvider");
        this.f26607a = context;
        this.f26608b = dateProvider;
        this.f26609c = function0;
        this.f26610d = kVar;
        this.f26611e = kVar2;
        this.f26616j = C6.k.b(e.f26633a);
        this.f26617k = C6.k.b(g.f26635a);
        this.f26618l = C6.k.b(f.f26634a);
        this.f26619m = new AtomicBoolean(false);
        this.f26620n = new AtomicBoolean(false);
        F0 f0B = F0.b();
        kotlin.jvm.internal.t.f(f0B, "getInstance()");
        this.f26622p = f0B;
        this.f26624r = new io.sentry.android.replay.util.i(null, 1, null);
        this.f26626t = new C2569a();
        this.f26627u = new l();
    }

    public static final void H0(ReplayIntegration this$0) throws IllegalAccessException, IOException, InvocationTargetException {
        kotlin.jvm.internal.t.g(this$0, "this$0");
        J2 j8 = this$0.f26612f;
        if (j8 == null) {
            kotlin.jvm.internal.t.t("options");
            j8 = null;
        }
        String str = (String) io.sentry.cache.s.x(j8, "replay.json", String.class);
        if (str == null) {
            w0(this$0, null, 1, null);
            return;
        }
        io.sentry.protocol.u uVar = new io.sentry.protocol.u(str);
        if (kotlin.jvm.internal.t.c(uVar, io.sentry.protocol.u.f27472b)) {
            w0(this$0, null, 1, null);
            return;
        }
        h.a aVar = h.f26811k;
        J2 j9 = this$0.f26612f;
        if (j9 == null) {
            kotlin.jvm.internal.t.t("options");
            j9 = null;
        }
        io.sentry.android.replay.c cVarC = aVar.c(j9, uVar, this$0.f26611e);
        if (cVarC == null) {
            w0(this$0, null, 1, null);
            return;
        }
        J2 j10 = this$0.f26612f;
        if (j10 == null) {
            kotlin.jvm.internal.t.t("options");
            j10 = null;
        }
        Object objY = io.sentry.cache.s.y(j10, "breadcrumbs.json", List.class, new C2491e.a());
        List list = objY instanceof List ? (List) objY : null;
        io.sentry.android.replay.capture.h.a aVar2 = io.sentry.android.replay.capture.h.f26766a;
        X x8 = this$0.f26613g;
        J2 j11 = this$0.f26612f;
        if (j11 == null) {
            kotlin.jvm.internal.t.t("options");
            j11 = null;
        }
        io.sentry.android.replay.capture.h.c cVarC2 = aVar2.c(x8, j11, cVarC.b(), cVarC.h(), uVar, cVarC.d(), cVarC.e().c(), cVarC.e().d(), cVarC.f(), cVarC.a(), cVarC.e().b(), cVarC.e().a(), cVarC.g(), list, new LinkedList(cVarC.c()));
        if (cVarC2 instanceof io.sentry.android.replay.capture.h.c.a) {
            H hint = io.sentry.util.m.e(new a());
            X x9 = this$0.f26613g;
            kotlin.jvm.internal.t.f(hint, "hint");
            ((io.sentry.android.replay.capture.h.c.a) cVarC2).a(x9, hint);
        }
        this$0.r0(str);
    }

    public static final void V0(J screen, V it) {
        kotlin.jvm.internal.t.g(screen, "$screen");
        kotlin.jvm.internal.t.g(it, "it");
        String strD = it.D();
        screen.f28779a = strD != null ? Z6.w.O0(strD, com.amazon.a.a.o.c.a.b.f16789a, null, 2, null) : null;
    }

    public static /* synthetic */ void w0(ReplayIntegration replayIntegration, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = "";
        }
        replayIntegration.r0(str);
    }

    public final void A0() {
        J2 j8 = this.f26612f;
        J2 j9 = null;
        if (j8 == null) {
            kotlin.jvm.internal.t.t("options");
            j8 = null;
        }
        InterfaceC2447a0 executorService = j8.getExecutorService();
        kotlin.jvm.internal.t.f(executorService, "options.executorService");
        J2 j10 = this.f26612f;
        if (j10 == null) {
            kotlin.jvm.internal.t.t("options");
        } else {
            j9 = j10;
        }
        io.sentry.android.replay.util.g.g(executorService, j9, "ReplayIntegration.finalize_previous_replay", new Runnable() { // from class: io.sentry.android.replay.j
            @Override // java.lang.Runnable
            public final void run() throws IllegalAccessException, IOException, InvocationTargetException {
                ReplayIntegration.H0(this.f26832a);
            }
        });
    }

    public final io.sentry.util.x J0() {
        return (io.sentry.util.x) this.f26616j.getValue();
    }

    public final ScheduledExecutorService L0() {
        return (ScheduledExecutorService) this.f26618l.getValue();
    }

    public io.sentry.protocol.u O0() {
        io.sentry.protocol.u uVarE;
        io.sentry.android.replay.capture.h hVar = this.f26621o;
        if (hVar != null && (uVarE = hVar.e()) != null) {
            return uVarE;
        }
        io.sentry.protocol.u EMPTY_ID = io.sentry.protocol.u.f27472b;
        kotlin.jvm.internal.t.f(EMPTY_ID, "EMPTY_ID");
        return EMPTY_ID;
    }

    public final o Q0() {
        return (o) this.f26617k.getValue();
    }

    public boolean T0() {
        return this.f26627u.a().compareTo(m.STARTED) >= 0 && this.f26627u.a().compareTo(m.STOPPED) < 0;
    }

    public final void a1() throws Exception {
        InterfaceC2480b0 interfaceC2480b0A = this.f26626t.a();
        try {
            if (this.f26619m.get()) {
                l lVar = this.f26627u;
                m mVar = m.PAUSED;
                if (lVar.b(mVar)) {
                    io.sentry.android.replay.f fVar = this.f26614h;
                    if (fVar != null) {
                        fVar.i();
                    }
                    io.sentry.android.replay.capture.h hVar = this.f26621o;
                    if (hVar != null) {
                        hVar.i();
                    }
                    this.f26627u.d(mVar);
                    G g8 = G.f1419a;
                    O6.a.a(interfaceC2480b0A, null);
                    return;
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

    @Override // io.sentry.android.replay.gestures.c
    public void b(MotionEvent event) {
        io.sentry.android.replay.capture.h hVar;
        kotlin.jvm.internal.t.g(event, "event");
        if (this.f26619m.get() && this.f26627u.c() && (hVar = this.f26621o) != null) {
            hVar.b(event);
        }
    }

    @Override // io.sentry.InterfaceC2513j1
    public void c(Boolean bool) {
        if (this.f26619m.get() && T0()) {
            io.sentry.protocol.u uVar = io.sentry.protocol.u.f27472b;
            io.sentry.android.replay.capture.h hVar = this.f26621o;
            J2 j8 = null;
            if (uVar.equals(hVar != null ? hVar.e() : null)) {
                J2 j9 = this.f26612f;
                if (j9 == null) {
                    kotlin.jvm.internal.t.t("options");
                } else {
                    j8 = j9;
                }
                j8.getLogger().c(EnumC2596z2.DEBUG, "Replay id is not set, not capturing for event", new Object[0]);
                return;
            }
            io.sentry.android.replay.capture.h hVar2 = this.f26621o;
            if (hVar2 != null) {
                hVar2.k(kotlin.jvm.internal.t.c(bool, Boolean.TRUE), new c());
            }
            io.sentry.android.replay.capture.h hVar3 = this.f26621o;
            this.f26621o = hVar3 != null ? hVar3.f() : null;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws Exception {
        io.sentry.transport.A aM;
        InterfaceC2480b0 interfaceC2480b0A = this.f26626t.a();
        try {
            if (this.f26619m.get() && this.f26627u.b(m.CLOSED)) {
                J2 j8 = this.f26612f;
                if (j8 == null) {
                    kotlin.jvm.internal.t.t("options");
                    j8 = null;
                }
                j8.getConnectionStatusProvider().d(this);
                X x8 = this.f26613g;
                if (x8 != null && (aM = x8.m()) != null) {
                    aM.A0(this);
                }
                J2 j9 = this.f26612f;
                if (j9 == null) {
                    kotlin.jvm.internal.t.t("options");
                    j9 = null;
                }
                if (j9.getSessionReplay().q()) {
                    try {
                        this.f26607a.unregisterComponentCallbacks(this);
                    } catch (Throwable unused) {
                    }
                }
                stop();
                io.sentry.android.replay.f fVar = this.f26614h;
                if (fVar != null) {
                    fVar.close();
                }
                this.f26614h = null;
                Q0().close();
                ScheduledExecutorService replayExecutor = L0();
                kotlin.jvm.internal.t.f(replayExecutor, "replayExecutor");
                J2 j10 = this.f26612f;
                if (j10 == null) {
                    kotlin.jvm.internal.t.t("options");
                    j10 = null;
                }
                io.sentry.android.replay.util.g.d(replayExecutor, j10);
                this.f26627u.d(m.CLOSED);
                G g8 = G.f1419a;
                O6.a.a(interfaceC2480b0A, null);
                return;
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

    public final void g1() {
        if (this.f26614h instanceof io.sentry.android.replay.d) {
            CopyOnWriteArrayList copyOnWriteArrayListO = Q0().o();
            io.sentry.android.replay.f fVar = this.f26614h;
            kotlin.jvm.internal.t.e(fVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            copyOnWriteArrayListO.add((io.sentry.android.replay.d) fVar);
        }
        Q0().o().add(this.f26615i);
    }

    @Override // io.sentry.InterfaceC2513j1
    public void h() throws Exception {
        this.f26620n.set(false);
        i1();
    }

    @Override // io.sentry.InterfaceC2513j1
    public void i() throws Exception {
        this.f26620n.set(true);
        a1();
    }

    @Override // io.sentry.M.b
    public void j(M.a status) throws Exception {
        kotlin.jvm.internal.t.g(status, "status");
        if (this.f26621o instanceof io.sentry.android.replay.capture.m) {
            if (status == M.a.DISCONNECTED) {
                a1();
            } else {
                i1();
            }
        }
    }

    public final void j0() throws Exception {
        X x8;
        X x9;
        io.sentry.transport.A aM;
        io.sentry.transport.A aM2;
        if (this.f26621o instanceof io.sentry.android.replay.capture.m) {
            J2 j8 = this.f26612f;
            if (j8 == null) {
                kotlin.jvm.internal.t.t("options");
                j8 = null;
            }
            if (j8.getConnectionStatusProvider().b() == M.a.DISCONNECTED || !(((x8 = this.f26613g) == null || (aM2 = x8.m()) == null || !aM2.A(EnumC2515k.All)) && ((x9 = this.f26613g) == null || (aM = x9.m()) == null || !aM.A(EnumC2515k.Replay)))) {
                a1();
            }
        }
    }

    public void k1(InterfaceC2509i1 converter) {
        kotlin.jvm.internal.t.g(converter, "converter");
        this.f26622p = converter;
    }

    @Override // io.sentry.InterfaceC2516k0
    public void o(X scopes, J2 options) {
        io.sentry.android.replay.f yVar;
        io.sentry.android.replay.gestures.a aVar;
        kotlin.jvm.internal.t.g(scopes, "scopes");
        kotlin.jvm.internal.t.g(options, "options");
        this.f26612f = options;
        if (!options.getSessionReplay().o() && !options.getSessionReplay().p()) {
            options.getLogger().c(EnumC2596z2.INFO, "Session replay is disabled, no sample rate specified", new Object[0]);
            return;
        }
        this.f26613g = scopes;
        Function0 function0 = this.f26609c;
        if (function0 == null || (yVar = (io.sentry.android.replay.f) function0.invoke()) == null) {
            io.sentry.android.replay.util.i iVar = this.f26624r;
            ScheduledExecutorService replayExecutor = L0();
            kotlin.jvm.internal.t.f(replayExecutor, "replayExecutor");
            yVar = new y(options, this, iVar, replayExecutor);
        }
        this.f26614h = yVar;
        Function0 function1 = this.f26625s;
        if (function1 == null || (aVar = (io.sentry.android.replay.gestures.a) function1.invoke()) == null) {
            aVar = new io.sentry.android.replay.gestures.a(options, this);
        }
        this.f26615i = aVar;
        this.f26619m.set(true);
        options.getConnectionStatusProvider().c(this);
        io.sentry.transport.A aM = scopes.m();
        if (aM != null) {
            aM.t(this);
        }
        if (options.getSessionReplay().q()) {
            try {
                this.f26607a.registerComponentCallbacks(this);
            } catch (Throwable th) {
                options.getLogger().b(EnumC2596z2.INFO, "ComponentCallbacks is not available, orientation changes won't be handled by Session replay", th);
            }
        }
        io.sentry.util.o.a("Replay");
        C2588x2.c().b("maven:io.sentry:sentry-android-replay", "8.3.0");
        A0();
    }

    public final void o1() {
        if (this.f26614h instanceof io.sentry.android.replay.d) {
            CopyOnWriteArrayList copyOnWriteArrayListO = Q0().o();
            io.sentry.android.replay.f fVar = this.f26614h;
            kotlin.jvm.internal.t.e(fVar, "null cannot be cast to non-null type io.sentry.android.replay.OnRootViewsChangedListener");
            copyOnWriteArrayListO.remove((io.sentry.android.replay.d) fVar);
        }
        Q0().o().remove(this.f26615i);
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration newConfig) {
        u uVarB;
        io.sentry.android.replay.f fVar;
        kotlin.jvm.internal.t.g(newConfig, "newConfig");
        if (this.f26619m.get() && T0()) {
            io.sentry.android.replay.f fVar2 = this.f26614h;
            if (fVar2 != null) {
                fVar2.stop();
            }
            Q6.k kVar = this.f26610d;
            if (kVar == null || (uVarB = (u) kVar.invoke(Boolean.TRUE)) == null) {
                u.a aVar = u.f26873g;
                Context context = this.f26607a;
                J2 j8 = this.f26612f;
                if (j8 == null) {
                    kotlin.jvm.internal.t.t("options");
                    j8 = null;
                }
                L2 sessionReplay = j8.getSessionReplay();
                kotlin.jvm.internal.t.f(sessionReplay, "options.sessionReplay");
                uVarB = aVar.b(context, sessionReplay);
            }
            io.sentry.android.replay.capture.h hVar = this.f26621o;
            if (hVar != null) {
                hVar.c(uVarB);
            }
            io.sentry.android.replay.f fVar3 = this.f26614h;
            if (fVar3 != null) {
                fVar3.h1(uVarB);
            }
            if (this.f26627u.a() != m.PAUSED || (fVar = this.f26614h) == null) {
                return;
            }
            fVar.i();
        }
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    public final void r0(String str) {
        File[] fileArrListFiles;
        J2 j8 = this.f26612f;
        if (j8 == null) {
            kotlin.jvm.internal.t.t("options");
            j8 = null;
        }
        String cacheDirPath = j8.getCacheDirPath();
        if (cacheDirPath == null || (fileArrListFiles = new File(cacheDirPath).listFiles()) == null) {
            return;
        }
        kotlin.jvm.internal.t.f(fileArrListFiles, "listFiles()");
        for (File file : fileArrListFiles) {
            String name = file.getName();
            kotlin.jvm.internal.t.f(name, "name");
            if (Z6.v.H(name, "replay_", false, 2, null)) {
                String string = O0().toString();
                kotlin.jvm.internal.t.f(string, "replayId.toString()");
                if (!Z6.w.M(name, string, false, 2, null) && (Z6.w.b0(str) || !Z6.w.M(name, str, false, 2, null))) {
                    C2576h.a(file);
                }
            }
        }
    }

    @Override // io.sentry.InterfaceC2513j1
    public void start() throws Exception {
        u uVarB;
        io.sentry.android.replay.capture.h fVar;
        J2 j8;
        io.sentry.android.replay.capture.h hVar;
        J2 j9;
        InterfaceC2480b0 interfaceC2480b0A = this.f26626t.a();
        try {
            if (!this.f26619m.get()) {
                O6.a.a(interfaceC2480b0A, null);
                return;
            }
            l lVar = this.f26627u;
            m mVar = m.STARTED;
            if (!lVar.b(mVar)) {
                J2 j10 = this.f26612f;
                if (j10 == null) {
                    kotlin.jvm.internal.t.t("options");
                    j10 = null;
                }
                j10.getLogger().c(EnumC2596z2.DEBUG, "Session replay is already being recorded, not starting a new one", new Object[0]);
                O6.a.a(interfaceC2480b0A, null);
                return;
            }
            io.sentry.util.x xVarJ0 = J0();
            J2 j11 = this.f26612f;
            if (j11 == null) {
                kotlin.jvm.internal.t.t("options");
                j11 = null;
            }
            boolean zA = io.sentry.android.replay.util.k.a(xVarJ0, j11.getSessionReplay().k());
            if (!zA) {
                J2 j12 = this.f26612f;
                if (j12 == null) {
                    kotlin.jvm.internal.t.t("options");
                    j12 = null;
                }
                if (!j12.getSessionReplay().p()) {
                    J2 j13 = this.f26612f;
                    if (j13 == null) {
                        kotlin.jvm.internal.t.t("options");
                        j13 = null;
                    }
                    j13.getLogger().c(EnumC2596z2.INFO, "Session replay is not started, full session was not sampled and onErrorSampleRate is not specified", new Object[0]);
                    O6.a.a(interfaceC2480b0A, null);
                    return;
                }
            }
            Q6.k kVar = this.f26610d;
            if (kVar == null || (uVarB = (u) kVar.invoke(Boolean.FALSE)) == null) {
                u.a aVar = u.f26873g;
                Context context = this.f26607a;
                J2 j14 = this.f26612f;
                if (j14 == null) {
                    kotlin.jvm.internal.t.t("options");
                    j14 = null;
                }
                L2 sessionReplay = j14.getSessionReplay();
                kotlin.jvm.internal.t.f(sessionReplay, "options.sessionReplay");
                uVarB = aVar.b(context, sessionReplay);
            }
            u uVar = uVarB;
            Q6.k kVar2 = this.f26623q;
            if (kVar2 == null || (hVar = (io.sentry.android.replay.capture.h) kVar2.invoke(Boolean.valueOf(zA))) == null) {
                if (zA) {
                    J2 j15 = this.f26612f;
                    if (j15 == null) {
                        kotlin.jvm.internal.t.t("options");
                        j9 = null;
                    } else {
                        j9 = j15;
                    }
                    X x8 = this.f26613g;
                    io.sentry.transport.p pVar = this.f26608b;
                    ScheduledExecutorService replayExecutor = L0();
                    kotlin.jvm.internal.t.f(replayExecutor, "replayExecutor");
                    fVar = new io.sentry.android.replay.capture.m(j9, x8, pVar, replayExecutor, this.f26611e);
                } else {
                    J2 j16 = this.f26612f;
                    if (j16 == null) {
                        kotlin.jvm.internal.t.t("options");
                        j8 = null;
                    } else {
                        j8 = j16;
                    }
                    X x9 = this.f26613g;
                    io.sentry.transport.p pVar2 = this.f26608b;
                    io.sentry.util.x xVarJ1 = J0();
                    ScheduledExecutorService replayExecutor2 = L0();
                    kotlin.jvm.internal.t.f(replayExecutor2, "replayExecutor");
                    fVar = new io.sentry.android.replay.capture.f(j8, x9, pVar2, xVarJ1, replayExecutor2, this.f26611e);
                }
                hVar = fVar;
            }
            io.sentry.android.replay.capture.h hVar2 = hVar;
            this.f26621o = hVar2;
            io.sentry.android.replay.capture.h.b.a(hVar2, uVar, 0, null, null, 14, null);
            io.sentry.android.replay.f fVar2 = this.f26614h;
            if (fVar2 != null) {
                fVar2.h1(uVar);
            }
            g1();
            this.f26627u.d(mVar);
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

    @Override // io.sentry.InterfaceC2513j1
    public void stop() throws Exception {
        InterfaceC2480b0 interfaceC2480b0A = this.f26626t.a();
        try {
            if (this.f26619m.get()) {
                l lVar = this.f26627u;
                m mVar = m.STOPPED;
                if (lVar.b(mVar)) {
                    o1();
                    io.sentry.android.replay.f fVar = this.f26614h;
                    if (fVar != null) {
                        fVar.stop();
                    }
                    io.sentry.android.replay.gestures.a aVar = this.f26615i;
                    if (aVar != null) {
                        aVar.c();
                    }
                    io.sentry.android.replay.capture.h hVar = this.f26621o;
                    if (hVar != null) {
                        hVar.stop();
                    }
                    this.f26621o = null;
                    this.f26627u.d(mVar);
                    G g8 = G.f1419a;
                    O6.a.a(interfaceC2480b0A, null);
                    return;
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

    @Override // io.sentry.transport.A.b
    public void t(io.sentry.transport.A rateLimiter) throws Exception {
        kotlin.jvm.internal.t.g(rateLimiter, "rateLimiter");
        if (this.f26621o instanceof io.sentry.android.replay.capture.m) {
            if (rateLimiter.A(EnumC2515k.All) || rateLimiter.A(EnumC2515k.Replay)) {
                a1();
            } else {
                i1();
            }
        }
    }

    @Override // io.sentry.android.replay.t
    public void v(Bitmap bitmap) {
        kotlin.jvm.internal.t.g(bitmap, "bitmap");
        final J j8 = new J();
        X x8 = this.f26613g;
        if (x8 != null) {
            x8.u(new InterfaceC2549q1() { // from class: io.sentry.android.replay.k
                @Override // io.sentry.InterfaceC2549q1
                public final void a(V v8) {
                    ReplayIntegration.V0(j8, v8);
                }
            });
        }
        io.sentry.android.replay.capture.h hVar = this.f26621o;
        if (hVar != null) {
            hVar.g(bitmap, new d(bitmap, j8, this));
        }
    }

    @Override // io.sentry.InterfaceC2513j1
    public InterfaceC2509i1 y() {
        return this.f26622p;
    }

    public final void i1() throws Exception {
        X x8;
        X x9;
        io.sentry.transport.A aM;
        io.sentry.transport.A aM2;
        InterfaceC2480b0 interfaceC2480b0A = this.f26626t.a();
        try {
            if (this.f26619m.get()) {
                l lVar = this.f26627u;
                m mVar = m.RESUMED;
                if (lVar.b(mVar)) {
                    if (!this.f26620n.get()) {
                        J2 j8 = this.f26612f;
                        if (j8 == null) {
                            kotlin.jvm.internal.t.t(ryTuoS.qPL);
                            j8 = null;
                        }
                        if (j8.getConnectionStatusProvider().b() != M.a.DISCONNECTED && (((x8 = this.f26613g) == null || (aM2 = x8.m()) == null || !aM2.A(EnumC2515k.All)) && ((x9 = this.f26613g) == null || (aM = x9.m()) == null || !aM.A(EnumC2515k.Replay)))) {
                            io.sentry.android.replay.capture.h hVar = this.f26621o;
                            if (hVar != null) {
                                hVar.h();
                            }
                            io.sentry.android.replay.f fVar = this.f26614h;
                            if (fVar != null) {
                                fVar.h();
                            }
                            this.f26627u.d(mVar);
                            G g8 = G.f1419a;
                            O6.a.a(interfaceC2480b0A, null);
                            return;
                        }
                    }
                    O6.a.a(interfaceC2480b0A, null);
                    return;
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

    public /* synthetic */ ReplayIntegration(Context context, io.sentry.transport.p pVar, Function0 function0, Q6.k kVar, Q6.k kVar2, int i8, AbstractC2633k abstractC2633k) {
        this(context, pVar, (i8 & 4) != 0 ? null : function0, (i8 & 8) != 0 ? null : kVar, (i8 & 16) != 0 ? null : kVar2);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, io.sentry.transport.p dateProvider) {
        this(io.sentry.android.replay.util.c.a(context), dateProvider, null, null, null);
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(dateProvider, "dateProvider");
    }

    public /* synthetic */ ReplayIntegration(Context context, io.sentry.transport.p pVar, Function0 function0, Q6.k kVar, Q6.k kVar2, Q6.k kVar3, io.sentry.android.replay.util.i iVar, Function0 function1, int i8, AbstractC2633k abstractC2633k) {
        this(context, pVar, function0, kVar, kVar2, (i8 & 32) != 0 ? null : kVar3, (i8 & 64) != 0 ? null : iVar, (i8 & 128) != 0 ? null : function1);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ReplayIntegration(Context context, io.sentry.transport.p dateProvider, Function0 function0, Q6.k kVar, Q6.k kVar2, Q6.k kVar3, io.sentry.android.replay.util.i iVar, Function0 function1) {
        this(io.sentry.android.replay.util.c.a(context), dateProvider, function0, kVar, kVar2);
        kotlin.jvm.internal.t.g(context, "context");
        kotlin.jvm.internal.t.g(dateProvider, "dateProvider");
        this.f26623q = kVar3;
        this.f26624r = iVar == null ? new io.sentry.android.replay.util.i(null, 1, null) : iVar;
        this.f26625s = function1;
    }
}
