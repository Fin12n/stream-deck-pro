package io.sentry.android.replay.capture;

import C6.G;
import D6.w;
import I0.mIk.efuWFSeiT;
import M6.eLZq.eGwOBWCdOTaKus;
import android.view.MotionEvent;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import com.amazon.device.simplesignin.model.request.wwj.WaYxBuDSBD;
import io.sentry.AbstractC2519l;
import io.sentry.EnumC2596z2;
import io.sentry.J2;
import io.sentry.K2;
import io.sentry.X;
import io.sentry.transport.p;
import java.util.Date;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedDeque;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.K;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import kotlin.jvm.internal.x;
import p116m7.kKPq.toqHM;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class a implements io.sentry.android.replay.capture.h {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f26657b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final X f26658c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f26659d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final ScheduledExecutorService f26660e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q6.k f26661f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final C6.j f26662g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final io.sentry.android.replay.gestures.b f26663h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final AtomicBoolean f26664i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public io.sentry.android.replay.h f26665j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final T6.c f26666k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final T6.c f26667l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final AtomicLong f26668m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final T6.c f26669n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final T6.c f26670o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final T6.c f26671p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final T6.c f26672q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Deque f26673r;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final /* synthetic */ X6.l[] f26655t = {K.d(new x(a.class, "recorderConfig", "getRecorderConfig()Lio/sentry/android/replay/ScreenshotRecorderConfig;", 0)), K.d(new x(a.class, "segmentTimestamp", "getSegmentTimestamp()Ljava/util/Date;", 0)), K.d(new x(a.class, WaYxBuDSBD.trWLo, "getScreenAtStart()Ljava/lang/String;", 0)), K.d(new x(a.class, "currentReplayId", "getCurrentReplayId()Lio/sentry/protocol/SentryId;", 0)), K.d(new x(a.class, "currentSegment", "getCurrentSegment()I", 0)), K.d(new x(a.class, "replayType", "getReplayType()Lio/sentry/SentryReplayEvent$ReplayType;", 0))};

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final C0589a f26654s = new C0589a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f26656u = 8;

    /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0589a {
        public /* synthetic */ C0589a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C0589a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements ThreadFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f26674a;

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable r8) {
            t.g(r8, "r");
            StringBuilder sb = new StringBuilder();
            sb.append("SentryReplayPersister-");
            int i8 = this.f26674a;
            this.f26674a = i8 + 1;
            sb.append(i8);
            Thread thread = new Thread(r8, sb.toString());
            thread.setDaemon(true);
            return thread;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final c f26675a = new c();

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
    public static final class d implements T6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f26676a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f26677b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f26678c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f26679d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class RunnableC0590a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f26680a;

            public RunnableC0590a(Function0 function0) {
                this.f26680a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f26680a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f26681a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f26682b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f26683c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f26684d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f26681a = str;
                this.f26682b = obj;
                this.f26683c = obj2;
                this.f26684d = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m226invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m226invoke() throws Exception {
                Object obj = this.f26682b;
                io.sentry.android.replay.u uVar = (io.sentry.android.replay.u) this.f26683c;
                if (uVar == null) {
                    return;
                }
                io.sentry.android.replay.h hVarQ = this.f26684d.q();
                if (hVarQ != null) {
                    hVarQ.w0("config.height", String.valueOf(uVar.c()));
                }
                io.sentry.android.replay.h hVarQ2 = this.f26684d.q();
                if (hVarQ2 != null) {
                    hVarQ2.w0("config.width", String.valueOf(uVar.d()));
                }
                io.sentry.android.replay.h hVarQ3 = this.f26684d.q();
                if (hVarQ3 != null) {
                    hVarQ3.w0("config.frame-rate", String.valueOf(uVar.b()));
                }
                io.sentry.android.replay.h hVarQ4 = this.f26684d.q();
                if (hVarQ4 != null) {
                    hVarQ4.w0("config.bit-rate", String.valueOf(uVar.a()));
                }
            }
        }

        public d(Object obj, a aVar, String str, a aVar2) {
            this.f26677b = aVar;
            this.f26678c = str;
            this.f26679d = aVar2;
            this.f26676a = new AtomicReference(obj);
        }

        @Override // T6.c
        public Object a(Object obj, X6.l property) {
            t.g(property, "property");
            return this.f26676a.get();
        }

        @Override // T6.c
        public void b(Object obj, X6.l property, Object obj2) {
            t.g(property, "property");
            Object andSet = this.f26676a.getAndSet(obj2);
            if (t.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f26678c, andSet, obj2, this.f26679d));
        }

        public final void c(Function0 function0) {
            if (this.f26677b.f26657b.getThreadChecker().b()) {
                io.sentry.android.replay.util.g.h(this.f26677b.s(), this.f26677b.f26657b, "CaptureStrategy.runInBackground", new RunnableC0590a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th) {
                this.f26677b.f26657b.getLogger().b(EnumC2596z2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements T6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f26685a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f26686b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f26687c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f26688d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f26689e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$e$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class RunnableC0591a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f26690a;

            public RunnableC0591a(Function0 function0) {
                this.f26690a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f26690a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f26691a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f26692b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f26693c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f26694d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f26695e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f26691a = str;
                this.f26692b = obj;
                this.f26693c = obj2;
                this.f26694d = aVar;
                this.f26695e = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m227invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m227invoke() throws Exception {
                Object obj = this.f26693c;
                io.sentry.android.replay.h hVarQ = this.f26694d.q();
                if (hVarQ != null) {
                    hVarQ.w0(this.f26695e, String.valueOf(obj));
                }
            }
        }

        public e(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f26686b = aVar;
            this.f26687c = str;
            this.f26688d = aVar2;
            this.f26689e = str2;
            this.f26685a = new AtomicReference(obj);
        }

        @Override // T6.c
        public Object a(Object obj, X6.l property) {
            t.g(property, "property");
            return this.f26685a.get();
        }

        @Override // T6.c
        public void b(Object obj, X6.l property, Object obj2) {
            t.g(property, "property");
            Object andSet = this.f26685a.getAndSet(obj2);
            if (t.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f26687c, andSet, obj2, this.f26688d, this.f26689e));
        }

        private final void c(Function0 function0) {
            if (this.f26686b.f26657b.getThreadChecker().b()) {
                io.sentry.android.replay.util.g.h(this.f26686b.s(), this.f26686b.f26657b, eGwOBWCdOTaKus.nCuSwUUrCoyKJeZ, new RunnableC0591a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th) {
                this.f26686b.f26657b.getLogger().b(EnumC2596z2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements T6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f26696a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f26697b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f26698c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f26699d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f26700e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$f$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class RunnableC0592a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f26701a;

            public RunnableC0592a(Function0 function0) {
                this.f26701a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f26701a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f26702a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f26703b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f26704c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f26705d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f26706e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f26702a = str;
                this.f26703b = obj;
                this.f26704c = obj2;
                this.f26705d = aVar;
                this.f26706e = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m228invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m228invoke() throws Exception {
                Object obj = this.f26704c;
                io.sentry.android.replay.h hVarQ = this.f26705d.q();
                if (hVarQ != null) {
                    hVarQ.w0(this.f26706e, String.valueOf(obj));
                }
            }
        }

        public f(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f26697b = aVar;
            this.f26698c = str;
            this.f26699d = aVar2;
            this.f26700e = str2;
            this.f26696a = new AtomicReference(obj);
        }

        private final void c(Function0 function0) {
            if (this.f26697b.f26657b.getThreadChecker().b()) {
                io.sentry.android.replay.util.g.h(this.f26697b.s(), this.f26697b.f26657b, "CaptureStrategy.runInBackground", new RunnableC0592a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th) {
                this.f26697b.f26657b.getLogger().b(EnumC2596z2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
            }
        }

        @Override // T6.c
        public Object a(Object obj, X6.l property) {
            t.g(property, "property");
            return this.f26696a.get();
        }

        @Override // T6.c
        public void b(Object obj, X6.l property, Object obj2) {
            t.g(property, "property");
            Object andSet = this.f26696a.getAndSet(obj2);
            if (t.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f26698c, andSet, obj2, this.f26699d, this.f26700e));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g implements T6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f26707a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f26708b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f26709c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f26710d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f26711e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$g$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class RunnableC0593a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f26712a;

            public RunnableC0593a(Function0 function0) {
                this.f26712a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f26712a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f26713a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f26714b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f26715c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f26716d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f26717e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f26713a = str;
                this.f26714b = obj;
                this.f26715c = obj2;
                this.f26716d = aVar;
                this.f26717e = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m229invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m229invoke() throws Exception {
                Object obj = this.f26715c;
                io.sentry.android.replay.h hVarQ = this.f26716d.q();
                if (hVarQ != null) {
                    hVarQ.w0(this.f26717e, String.valueOf(obj));
                }
            }
        }

        public g(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f26708b = aVar;
            this.f26709c = str;
            this.f26710d = aVar2;
            this.f26711e = str2;
            this.f26707a = new AtomicReference(obj);
        }

        private final void c(Function0 function0) {
            if (this.f26708b.f26657b.getThreadChecker().b()) {
                io.sentry.android.replay.util.g.h(this.f26708b.s(), this.f26708b.f26657b, "CaptureStrategy.runInBackground", new RunnableC0593a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th) {
                this.f26708b.f26657b.getLogger().b(EnumC2596z2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
            }
        }

        @Override // T6.c
        public Object a(Object obj, X6.l property) {
            t.g(property, "property");
            return this.f26707a.get();
        }

        @Override // T6.c
        public void b(Object obj, X6.l property, Object obj2) {
            t.g(property, "property");
            Object andSet = this.f26707a.getAndSet(obj2);
            if (t.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f26709c, andSet, obj2, this.f26710d, this.f26711e));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h implements T6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f26718a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f26719b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f26720c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f26721d;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$h$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class RunnableC0594a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f26722a;

            public RunnableC0594a(Function0 function0) {
                this.f26722a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f26722a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f26723a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f26724b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f26725c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f26726d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar) {
                super(0);
                this.f26723a = str;
                this.f26724b = obj;
                this.f26725c = obj2;
                this.f26726d = aVar;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m230invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m230invoke() throws Exception {
                Object obj = this.f26724b;
                Date date = (Date) this.f26725c;
                io.sentry.android.replay.h hVarQ = this.f26726d.q();
                if (hVarQ != null) {
                    hVarQ.w0("segment.timestamp", date == null ? null : AbstractC2519l.g(date));
                }
            }
        }

        public h(Object obj, a aVar, String str, a aVar2) {
            this.f26719b = aVar;
            this.f26720c = str;
            this.f26721d = aVar2;
            this.f26718a = new AtomicReference(obj);
        }

        private final void c(Function0 function0) {
            if (this.f26719b.f26657b.getThreadChecker().b()) {
                io.sentry.android.replay.util.g.h(this.f26719b.s(), this.f26719b.f26657b, "CaptureStrategy.runInBackground", new RunnableC0594a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th) {
                this.f26719b.f26657b.getLogger().b(EnumC2596z2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
            }
        }

        @Override // T6.c
        public Object a(Object obj, X6.l property) {
            t.g(property, "property");
            return this.f26718a.get();
        }

        @Override // T6.c
        public void b(Object obj, X6.l property, Object obj2) {
            t.g(property, "property");
            Object andSet = this.f26718a.getAndSet(obj2);
            if (t.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f26720c, andSet, obj2, this.f26721d));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i implements T6.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final AtomicReference f26727a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ a f26728b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f26729c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ a f26730d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f26731e;

        /* JADX INFO: renamed from: io.sentry.android.replay.capture.a$i$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class RunnableC0595a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ Function0 f26732a;

            public RunnableC0595a(Function0 function0) {
                this.f26732a = function0;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f26732a.invoke();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ String f26733a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Object f26734b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f26735c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ a f26736d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ String f26737e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String str, Object obj, Object obj2, a aVar, String str2) {
                super(0);
                this.f26733a = str;
                this.f26734b = obj;
                this.f26735c = obj2;
                this.f26736d = aVar;
                this.f26737e = str2;
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Object invoke() throws Exception {
                m231invoke();
                return G.f1419a;
            }

            /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
            public final void m231invoke() throws Exception {
                Object obj = this.f26735c;
                io.sentry.android.replay.h hVarQ = this.f26736d.q();
                if (hVarQ != null) {
                    hVarQ.w0(this.f26737e, String.valueOf(obj));
                }
            }
        }

        public i(Object obj, a aVar, String str, a aVar2, String str2) {
            this.f26728b = aVar;
            this.f26729c = str;
            this.f26730d = aVar2;
            this.f26731e = str2;
            this.f26727a = new AtomicReference(obj);
        }

        private final void c(Function0 function0) {
            if (this.f26728b.f26657b.getThreadChecker().b()) {
                io.sentry.android.replay.util.g.h(this.f26728b.s(), this.f26728b.f26657b, "CaptureStrategy.runInBackground", new RunnableC0595a(function0));
                return;
            }
            try {
                function0.invoke();
            } catch (Throwable th) {
                this.f26728b.f26657b.getLogger().b(EnumC2596z2.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
            }
        }

        @Override // T6.c
        public Object a(Object obj, X6.l property) {
            t.g(property, "property");
            return this.f26727a.get();
        }

        @Override // T6.c
        public void b(Object obj, X6.l property, Object obj2) {
            t.g(property, "property");
            Object andSet = this.f26727a.getAndSet(obj2);
            if (t.c(andSet, obj2)) {
                return;
            }
            c(new b(this.f26729c, andSet, obj2, this.f26730d, this.f26731e));
        }
    }

    public a(J2 options, X x8, p dateProvider, ScheduledExecutorService replayExecutor, Q6.k kVar) {
        t.g(options, "options");
        t.g(dateProvider, "dateProvider");
        t.g(replayExecutor, "replayExecutor");
        this.f26657b = options;
        this.f26658c = x8;
        this.f26659d = dateProvider;
        this.f26660e = replayExecutor;
        this.f26661f = kVar;
        this.f26662g = C6.k.b(c.f26675a);
        this.f26663h = new io.sentry.android.replay.gestures.b(dateProvider);
        this.f26664i = new AtomicBoolean(false);
        this.f26666k = new d(null, this, "", this);
        this.f26667l = new h(null, this, "segment.timestamp", this);
        this.f26668m = new AtomicLong();
        this.f26669n = new i(null, this, "replay.screen-at-start", this, "replay.screen-at-start");
        this.f26670o = new e(io.sentry.protocol.u.f27472b, this, "replay.id", this, "replay.id");
        String str = toqHM.qwgTYUB;
        this.f26671p = new f(-1, this, str, this, str);
        this.f26672q = new g(null, this, "replay.type", this, "replay.type");
        this.f26673r = new ConcurrentLinkedDeque();
    }

    public static /* synthetic */ io.sentry.android.replay.capture.h.c p(a aVar, long j8, Date date, io.sentry.protocol.u uVar, int i8, int i9, int i10, K2.b bVar, io.sentry.android.replay.h hVar, int i11, int i12, String str, List list, Deque deque, int i13, Object obj) {
        if (obj == null) {
            return aVar.o(j8, date, uVar, i8, i9, i10, (i13 & 64) != 0 ? aVar.w() : bVar, (i13 & 128) != 0 ? aVar.f26665j : hVar, (i13 & 256) != 0 ? aVar.t().b() : i11, (i13 & 512) != 0 ? aVar.t().a() : i12, (i13 & 1024) != 0 ? aVar.x() : str, (i13 & 2048) != 0 ? null : list, (i13 & 4096) != 0 ? aVar.f26673r : deque);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createSegmentInternal");
    }

    public void A(io.sentry.protocol.u uVar) {
        t.g(uVar, "<set-?>");
        this.f26670o.b(this, f26655t[3], uVar);
    }

    public final void B(io.sentry.android.replay.u uVar) {
        t.g(uVar, "<set-?>");
        this.f26666k.b(this, f26655t[0], uVar);
    }

    public final void D(String str) {
        this.f26669n.b(this, f26655t[2], str);
    }

    @Override // io.sentry.android.replay.capture.h
    public void b(MotionEvent event) {
        t.g(event, "event");
        List listA = this.f26663h.a(event, t());
        if (listA != null) {
            w.E(this.f26673r, listA);
        }
    }

    @Override // io.sentry.android.replay.capture.h
    public void c(io.sentry.android.replay.u recorderConfig) {
        t.g(recorderConfig, "recorderConfig");
        B(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public void d(io.sentry.android.replay.u recorderConfig, int i8, io.sentry.protocol.u replayId, K2.b bVar) {
        io.sentry.android.replay.h hVar;
        t.g(recorderConfig, "recorderConfig");
        t.g(replayId, "replayId");
        Q6.k kVar = this.f26661f;
        if (kVar == null || (hVar = (io.sentry.android.replay.h) kVar.invoke(replayId)) == null) {
            hVar = new io.sentry.android.replay.h(this.f26657b, replayId);
        }
        this.f26665j = hVar;
        A(replayId);
        l(i8);
        if (bVar == null) {
            bVar = this instanceof m ? K2.b.SESSION : K2.b.BUFFER;
        }
        C(bVar);
        B(recorderConfig);
        j(AbstractC2519l.c());
        this.f26668m.set(this.f26659d.getCurrentTimeMillis());
    }

    @Override // io.sentry.android.replay.capture.h
    public io.sentry.protocol.u e() {
        return (io.sentry.protocol.u) this.f26670o.a(this, f26655t[3]);
    }

    @Override // io.sentry.android.replay.capture.h
    public void h() {
        j(AbstractC2519l.c());
    }

    @Override // io.sentry.android.replay.capture.h
    public void i() {
    }

    @Override // io.sentry.android.replay.capture.h
    public void j(Date date) {
        this.f26667l.b(this, f26655t[1], date);
    }

    @Override // io.sentry.android.replay.capture.h
    public void l(int i8) {
        this.f26671p.b(this, f26655t[4], Integer.valueOf(i8));
    }

    @Override // io.sentry.android.replay.capture.h
    public int m() {
        return ((Number) this.f26671p.a(this, f26655t[4])).intValue();
    }

    public final io.sentry.android.replay.h q() {
        return this.f26665j;
    }

    public final Deque r() {
        return this.f26673r;
    }

    public final ScheduledExecutorService s() {
        Object value = this.f26662g.getValue();
        t.f(value, "<get-persistingExecutor>(...)");
        return (ScheduledExecutorService) value;
    }

    @Override // io.sentry.android.replay.capture.h
    public void stop() throws Exception {
        io.sentry.android.replay.h hVar = this.f26665j;
        if (hVar != null) {
            hVar.close();
        }
        l(-1);
        this.f26668m.set(0L);
        j(null);
        io.sentry.protocol.u EMPTY_ID = io.sentry.protocol.u.f27472b;
        t.f(EMPTY_ID, "EMPTY_ID");
        A(EMPTY_ID);
    }

    public final io.sentry.android.replay.u t() {
        return (io.sentry.android.replay.u) this.f26666k.a(this, f26655t[0]);
    }

    public final ScheduledExecutorService u() {
        return this.f26660e;
    }

    public final AtomicLong v() {
        return this.f26668m;
    }

    public K2.b w() {
        return (K2.b) this.f26672q.a(this, f26655t[5]);
    }

    public final String x() {
        return (String) this.f26669n.a(this, f26655t[2]);
    }

    public Date y() {
        return (Date) this.f26667l.a(this, f26655t[1]);
    }

    public final AtomicBoolean z() {
        return this.f26664i;
    }

    public void C(K2.b bVar) {
        t.g(bVar, ZWZaxQrCHfNe.VoWgTmyiq);
        this.f26672q.b(this, f26655t[5], bVar);
    }

    public final io.sentry.android.replay.capture.h.c o(long j8, Date currentSegmentTimestamp, io.sentry.protocol.u replayId, int i8, int i9, int i10, K2.b bVar, io.sentry.android.replay.h hVar, int i11, int i12, String str, List list, Deque events) {
        t.g(currentSegmentTimestamp, "currentSegmentTimestamp");
        t.g(replayId, "replayId");
        t.g(bVar, efuWFSeiT.RlJiy);
        t.g(events, "events");
        return io.sentry.android.replay.capture.h.f26766a.c(this.f26658c, this.f26657b, j8, currentSegmentTimestamp, replayId, i8, i9, i10, bVar, hVar, i11, i12, str, list, events);
    }

    public /* synthetic */ a(J2 j8, X x8, p pVar, ScheduledExecutorService scheduledExecutorService, Q6.k kVar, int i8, AbstractC2633k abstractC2633k) {
        this(j8, x8, pVar, scheduledExecutorService, (i8 & 16) != 0 ? null : kVar);
    }
}
