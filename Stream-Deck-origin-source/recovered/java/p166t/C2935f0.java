package p166t;

import A.AbstractC0890p0;
import A.C0864c0;
import A.C0868e0;
import D6.iIQ.BmWxZhjGfw;
import F1.c;
import G.InterfaceC0950i;
import H.AbstractC0986j0;
import H.AbstractC0995o;
import H.AbstractC1016z;
import H.C0980g0;
import H.C0999q;
import H.InterfaceC1014y;
import H.Z0;
import Y4.a;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.CaptureResult;
import android.hardware.camera2.TotalCaptureResult;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import p198x.A;
import p198x.B;
import p198x.n;

/* JADX INFO: renamed from: t.f0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2935f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2984w f33660a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f33661b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f33662c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Z0 f33663d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Executor f33664e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final ScheduledExecutorService f33665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f33666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f33667h = 1;

    /* JADX INFO: renamed from: t.f0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2984w f33668a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final n f33669b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f33670c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f33671d = false;

        public a(C2984w c2984w, int i8, n nVar) {
            this.f33668a = c2984w;
            this.f33670c = i8;
            this.f33669b = nVar;
        }

        public static /* synthetic */ Object e(a aVar, F1.c.a aVar2) {
            aVar.f33668a.z().y(aVar2);
            aVar.f33669b.b();
            return "AePreCapture";
        }

        @Override // p166t.C2935f0.e
        public Y4.a a(TotalCaptureResult totalCaptureResult) {
            if (this.f33668a.P() || !C2935f0.e(this.f33670c, totalCaptureResult)) {
                return K.n.p(Boolean.FALSE);
            }
            AbstractC0890p0.a("Camera2CapturePipeline", "Trigger AE");
            this.f33671d = true;
            return K.d.b(F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.d0
                @Override // F1.c.InterfaceC0112c
                public final Object a(c.a aVar) {
                    return C2935f0.a.e(this.f33640a, aVar);
                }
            })).e(new p142q.a() { // from class: t.e0
                @Override // p142q.a
                public final Object apply(Object obj) {
                    return Boolean.TRUE;
                }
            }, J.a.a());
        }

        @Override // p166t.C2935f0.e
        public boolean b() {
            return this.f33670c == 0;
        }

        @Override // p166t.C2935f0.e
        public void c() {
            if (this.f33671d) {
                AbstractC0890p0.a("Camera2CapturePipeline", "cancel TriggerAePreCapture");
                this.f33668a.z().h(false, true);
                this.f33669b.a();
            }
        }
    }

    /* JADX INFO: renamed from: t.f0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b implements e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2984w f33672a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f33673b = false;

        public b(C2984w c2984w) {
            this.f33672a = c2984w;
        }

        @Override // p166t.C2935f0.e
        public Y4.a a(TotalCaptureResult totalCaptureResult) {
            Integer num;
            int iIntValue;
            Y4.a aVarP = K.n.p(Boolean.TRUE);
            if (totalCaptureResult != null && (num = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_MODE)) != null && ((iIntValue = num.intValue()) == 1 || iIntValue == 2)) {
                AbstractC0890p0.a("Camera2CapturePipeline", "TriggerAf? AF mode auto");
                Integer num2 = (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AF_STATE);
                if (num2 != null && num2.intValue() == 0) {
                    AbstractC0890p0.a("Camera2CapturePipeline", "Trigger AF");
                    this.f33673b = true;
                    this.f33672a.z().z(null, false);
                }
            }
            return aVarP;
        }

        @Override // p166t.C2935f0.e
        public boolean b() {
            return true;
        }

        @Override // p166t.C2935f0.e
        public void c() {
            if (this.f33673b) {
                AbstractC0890p0.a("Camera2CapturePipeline", "cancel TriggerAF");
                this.f33672a.z().h(true, false);
            }
        }
    }

    /* JADX INFO: renamed from: t.f0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c implements InterfaceC0950i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f33674a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final d f33675b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f33676c;

        public c(d dVar, Executor executor, int i8) {
            this.f33675b = dVar;
            this.f33674a = executor;
            this.f33676c = i8;
        }

        public static /* synthetic */ Object c(c cVar, F1.c.a aVar) {
            cVar.f33675b.j();
            aVar.c(null);
            return "invokePostCaptureFuture";
        }

        public static /* synthetic */ Void d(TotalCaptureResult totalCaptureResult) {
            return null;
        }

        @Override // G.InterfaceC0950i
        public Y4.a b() {
            return F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.g0
                @Override // F1.c.InterfaceC0112c
                public final Object a(c.a aVar) {
                    return C2935f0.c.c(this.f33711a, aVar);
                }
            });
        }

        @Override // G.InterfaceC0950i
        public Y4.a a() {
            AbstractC0890p0.a("Camera2CapturePipeline", BmWxZhjGfw.Xljyml);
            return K.d.b(this.f33675b.k(this.f33676c)).e(new p142q.a() { // from class: t.h0
                @Override // p142q.a
                public final Object apply(Object obj) {
                    return C2935f0.c.d((TotalCaptureResult) obj);
                }
            }, this.f33674a);
        }
    }

    /* JADX INFO: renamed from: t.f0$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static final long f33677j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static final long f33678k;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f33679a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f33680b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f33681c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C2984w f33682d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final n f33683e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f33684f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public long f33685g = f33677j;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final List f33686h = new ArrayList();

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final e f33687i = new a();

        /* JADX INFO: renamed from: t.f0$d$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements e {
            public a() {
            }

            @Override // p166t.C2935f0.e
            public Y4.a a(TotalCaptureResult totalCaptureResult) {
                ArrayList arrayList = new ArrayList();
                Iterator it = d.this.f33686h.iterator();
                while (it.hasNext()) {
                    arrayList.add(((e) it.next()).a(totalCaptureResult));
                }
                return K.n.x(K.n.k(arrayList), new p142q.a() { // from class: t.o0
                    @Override // p142q.a
                    public final Object apply(Object obj) {
                        return Boolean.valueOf(((List) obj).contains(Boolean.TRUE));
                    }
                }, J.a.a());
            }

            @Override // p166t.C2935f0.e
            public boolean b() {
                Iterator it = d.this.f33686h.iterator();
                while (it.hasNext()) {
                    if (((e) it.next()).b()) {
                        return true;
                    }
                }
                return false;
            }

            @Override // p166t.C2935f0.e
            public void c() {
                Iterator it = d.this.f33686h.iterator();
                while (it.hasNext()) {
                    ((e) it.next()).c();
                }
            }
        }

        /* JADX INFO: renamed from: t.f0$d$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class b extends AbstractC0995o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ F1.c.a f33689a;

            public b(F1.c.a aVar) {
                this.f33689a = aVar;
            }

            @Override // H.AbstractC0995o
            public void a(int i8) {
                this.f33689a.f(new C0868e0(3, "Capture request is cancelled because camera is closed", null));
            }

            @Override // H.AbstractC0995o
            public void b(int i8, InterfaceC1014y interfaceC1014y) {
                this.f33689a.c(null);
            }

            @Override // H.AbstractC0995o
            public void c(int i8, C0999q c0999q) {
                this.f33689a.f(new C0868e0(2, "Capture request failed with reason " + c0999q.a(), null));
            }
        }

        static {
            TimeUnit timeUnit = TimeUnit.SECONDS;
            f33677j = timeUnit.toNanos(1L);
            f33678k = timeUnit.toNanos(5L);
        }

        public d(int i8, Executor executor, ScheduledExecutorService scheduledExecutorService, C2984w c2984w, boolean z8, n nVar) {
            this.f33679a = i8;
            this.f33680b = executor;
            this.f33681c = scheduledExecutorService;
            this.f33682d = c2984w;
            this.f33684f = z8;
            this.f33683e = nVar;
        }

        public static /* synthetic */ Y4.a a(d dVar, int i8, TotalCaptureResult totalCaptureResult) {
            if (!dVar.f33682d.P() && C2935f0.e(i8, totalCaptureResult)) {
                dVar.l(f33678k);
            }
            return dVar.f33687i.a(totalCaptureResult);
        }

        public static /* synthetic */ Y4.a d(d dVar, Boolean bool) {
            dVar.getClass();
            return Boolean.TRUE.equals(bool) ? C2935f0.i(dVar.f33685g, dVar.f33681c, dVar.f33682d, new f.a() { // from class: t.n0
                @Override // p166t.C2935f0.f.a
                public final boolean a(TotalCaptureResult totalCaptureResult) {
                    return C2935f0.d(totalCaptureResult, false);
                }
            }) : K.n.p(null);
        }

        public static /* synthetic */ Object e(d dVar, C0980g0.a aVar, F1.c.a aVar2) {
            dVar.getClass();
            aVar.c(dVar.new b(aVar2));
            return "submitStillCapture";
        }

        public void f(e eVar) {
            this.f33686h.add(eVar);
        }

        public final void g(C0980g0.a aVar) {
            p158s.a.C0723a c0723a = new p158s.a.C0723a();
            c0723a.f(CaptureRequest.CONTROL_AE_MODE, 3);
            aVar.e(c0723a.c());
        }

        public final void h(C0980g0.a aVar, C0980g0 c0980g0) {
            int i8;
            if (this.f33679a != 3 || this.f33684f) {
                i8 = (c0980g0.k() == -1 || c0980g0.k() == 5) ? 2 : -1;
            } else {
                i8 = 4;
            }
            if (i8 != -1) {
                aVar.t(i8);
            }
            AbstractC0890p0.a("Camera2CapturePipeline", "applyStillCaptureTemplate: templateToModify = " + i8);
        }

        public Y4.a i(final List list, final int i8) {
            K.d dVarF = K.d.b(k(i8)).f(new K.a() { // from class: t.i0
                @Override // K.a
                public final a apply(Object obj) {
                    return this.f33728a.m(list, i8);
                }
            }, this.f33680b);
            dVarF.a(new Runnable() { // from class: t.j0
                @Override // java.lang.Runnable
                public final void run() {
                    this.f33766a.j();
                }
            }, this.f33680b);
            return dVarF;
        }

        public void j() {
            this.f33687i.c();
        }

        public Y4.a k(final int i8) {
            Y4.a aVarP = K.n.p(null);
            if (this.f33686h.isEmpty()) {
                return aVarP;
            }
            return K.d.b(this.f33687i.b() ? C2935f0.j(this.f33682d, null) : K.n.p(null)).f(new K.a() { // from class: t.l0
                @Override // K.a
                public final a apply(Object obj) {
                    return C2935f0.d.a(this.f33785a, i8, (TotalCaptureResult) obj);
                }
            }, this.f33680b).f(new K.a() { // from class: t.m0
                @Override // K.a
                public final a apply(Object obj) {
                    return C2935f0.d.d(this.f33790a, (Boolean) obj);
                }
            }, this.f33680b);
        }

        public final void l(long j8) {
            this.f33685g = j8;
        }

        public Y4.a m(List list, int i8) {
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                C0980g0 c0980g0 = (C0980g0) it.next();
                final C0980g0.a aVarJ = C0980g0.a.j(c0980g0);
                InterfaceC1014y interfaceC1014yA = null;
                if (c0980g0.k() == 5 && !this.f33682d.L().d() && !this.f33682d.L().c()) {
                    androidx.camera.core.d dVarG = this.f33682d.L().g();
                    if (dVarG != null) {
                        if (this.f33682d.L().h(dVarG)) {
                            interfaceC1014yA = AbstractC1016z.a(dVarG.e1());
                        } else {
                            AbstractC0890p0.c("Camera2CapturePipeline", "Failed to enqueue image to image writer");
                        }
                        if (interfaceC1014yA == null) {
                            dVarG.close();
                        }
                    } else {
                        AbstractC0890p0.a("Camera2CapturePipeline", "ZSL capture skipped due to no valid buffer image");
                    }
                }
                if (interfaceC1014yA != null) {
                    aVarJ.n(interfaceC1014yA);
                } else {
                    h(aVarJ, c0980g0);
                }
                if (this.f33683e.c(i8)) {
                    g(aVarJ);
                }
                arrayList.add(F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.k0
                    @Override // F1.c.InterfaceC0112c
                    public final Object a(c.a aVar) {
                        return C2935f0.d.e(this.f33778a, aVarJ, aVar);
                    }
                }));
                arrayList2.add(aVarJ.h());
            }
            this.f33682d.d0(arrayList2);
            return K.n.k(arrayList);
        }
    }

    /* JADX INFO: renamed from: t.f0$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e {
        Y4.a a(TotalCaptureResult totalCaptureResult);

        boolean b();

        void c();
    }

    /* JADX INFO: renamed from: t.f0$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class f implements C2984w.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public F1.c.a f33691a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Y4.a f33692b = F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.p0
            @Override // F1.c.InterfaceC0112c
            public final Object a(c.a aVar) {
                return C2935f0.f.b(this.f33821a, aVar);
            }
        });

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final a f33693c;

        /* JADX INFO: renamed from: t.f0$f$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public interface a {
            boolean a(TotalCaptureResult totalCaptureResult);
        }

        public f(a aVar) {
            this.f33693c = aVar;
        }

        public static /* synthetic */ Object b(f fVar, F1.c.a aVar) {
            fVar.f33691a = aVar;
            return "waitFor3AResult";
        }

        @Override // p166t.C2984w.c
        public boolean a(TotalCaptureResult totalCaptureResult) {
            a aVar = this.f33693c;
            if (aVar != null && !aVar.a(totalCaptureResult)) {
                return false;
            }
            this.f33691a.c(totalCaptureResult);
            return true;
        }

        public Y4.a c() {
            return this.f33692b;
        }
    }

    /* JADX INFO: renamed from: t.f0$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class g implements e {

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final long f33694f = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2984w f33695a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f33696b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final ScheduledExecutorService f33697c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final C0864c0.i f33698d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final A f33699e;

        public g(C2984w c2984w, Executor executor, ScheduledExecutorService scheduledExecutorService, A a8) {
            this.f33695a = c2984w;
            this.f33696b = executor;
            this.f33697c = scheduledExecutorService;
            this.f33699e = a8;
            C0864c0.i iVarB = c2984w.B();
            Objects.requireNonNull(iVarB);
            this.f33698d = iVarB;
        }

        public static /* synthetic */ void d(g gVar, AtomicReference atomicReference, F1.c.a aVar) {
            gVar.getClass();
            AbstractC0890p0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: invoking applyScreenFlashUi");
            gVar.f33698d.a(System.currentTimeMillis() + TimeUnit.SECONDS.toMillis(3L), (C0864c0.j) atomicReference.get());
            aVar.c(null);
        }

        public static /* synthetic */ Y4.a h(final g gVar, Void r8) {
            gVar.getClass();
            return F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.r0
                @Override // F1.c.InterfaceC0112c
                public final Object a(c.a aVar) {
                    return C2935f0.g.l(this.f33853a, aVar);
                }
            });
        }

        public static /* synthetic */ Object j(final g gVar, final AtomicReference atomicReference, final F1.c.a aVar) {
            gVar.getClass();
            J.a.d().execute(new Runnable() { // from class: t.s0
                @Override // java.lang.Runnable
                public final void run() {
                    C2935f0.g.d(this.f33859a, atomicReference, aVar);
                }
            });
            return "OnScreenFlashStart";
        }

        public static /* synthetic */ void k(F1.c.a aVar) {
            AbstractC0890p0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: UI change applied");
            aVar.c(null);
        }

        public static /* synthetic */ Object l(g gVar, F1.c.a aVar) {
            if (!gVar.f33699e.a()) {
                aVar.c(null);
                return "EnableTorchInternal";
            }
            AbstractC0890p0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture: enable torch");
            gVar.f33695a.x(2);
            aVar.c(null);
            return "EnableTorchInternal";
        }

        public static /* synthetic */ Object n(AtomicReference atomicReference, final F1.c.a aVar) {
            atomicReference.set(new C0864c0.j() { // from class: t.u0
                @Override // A.C0864c0.j
                public final void a() {
                    C2935f0.g.k(aVar);
                }
            });
            return "OnScreenFlashUiApplied";
        }

        public static /* synthetic */ Y4.a p(g gVar, Y4.a aVar, Object obj) {
            gVar.getClass();
            return K.n.r(TimeUnit.SECONDS.toMillis(3L), gVar.f33697c, null, true, aVar);
        }

        @Override // p166t.C2935f0.e
        public Y4.a a(TotalCaptureResult totalCaptureResult) {
            AbstractC0890p0.a("Camera2CapturePipeline", "ScreenFlashTask#preCapture");
            final AtomicReference atomicReference = new AtomicReference();
            final Y4.a aVarA = F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.w0
                @Override // F1.c.InterfaceC0112c
                public final Object a(c.a aVar) {
                    return C2935f0.g.n(atomicReference, aVar);
                }
            });
            return K.d.b(F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.x0
                @Override // F1.c.InterfaceC0112c
                public final Object a(c.a aVar) {
                    return C2935f0.g.j(this.f33918a, atomicReference, aVar);
                }
            })).f(new K.a() { // from class: t.y0
                @Override // K.a
                public final a apply(Object obj) {
                    return this.f33937a.f33695a.z().n(true);
                }
            }, this.f33696b).f(new K.a() { // from class: t.z0
                @Override // K.a
                public final a apply(Object obj) {
                    return C2935f0.g.h(this.f33967a, (Void) obj);
                }
            }, this.f33696b).f(new K.a() { // from class: t.A0
                @Override // K.a
                public final a apply(Object obj) {
                    return C2935f0.g.p(this.f33311a, aVarA, obj);
                }
            }, this.f33696b).f(new K.a() { // from class: t.B0
                @Override // K.a
                public final a apply(Object obj) {
                    return this.f33315a.f33695a.z().x();
                }
            }, this.f33696b).f(new K.a() { // from class: t.C0
                @Override // K.a
                public final a apply(Object obj) {
                    C2935f0.g gVar = this.f33318a;
                    return C2935f0.i(C2935f0.g.f33694f, gVar.f33697c, gVar.f33695a, new C2935f0.f.a() { // from class: t.t0
                        @Override // p166t.C2935f0.f.a
                        public final boolean a(TotalCaptureResult totalCaptureResult2) {
                            return C2935f0.d(totalCaptureResult2, false);
                        }
                    });
                }
            }, this.f33696b).e(new p142q.a() { // from class: t.D0
                @Override // p142q.a
                public final Object apply(Object obj) {
                    return Boolean.FALSE;
                }
            }, J.a.a());
        }

        @Override // p166t.C2935f0.e
        public boolean b() {
            return false;
        }

        @Override // p166t.C2935f0.e
        public void c() {
            AbstractC0890p0.a("Camera2CapturePipeline", "ScreenFlashTask#postCapture");
            if (this.f33699e.a()) {
                this.f33695a.x(0);
            }
            this.f33695a.z().n(false).a(new Runnable() { // from class: t.q0
                @Override // java.lang.Runnable
                public final void run() {
                    Log.d("Camera2CapturePipeline", "enableExternalFlashAeMode disabled");
                }
            }, this.f33696b);
            this.f33695a.z().h(false, true);
            ScheduledExecutorService scheduledExecutorServiceD = J.a.d();
            final C0864c0.i iVar = this.f33698d;
            Objects.requireNonNull(iVar);
            scheduledExecutorServiceD.execute(new Runnable() { // from class: t.v0
                @Override // java.lang.Runnable
                public final void run() {
                    iVar.clear();
                }
            });
        }
    }

    /* JADX INFO: renamed from: t.f0$h */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class h implements e {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final long f33700g = TimeUnit.SECONDS.toNanos(2);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final C2984w f33701a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f33702b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f33703c = false;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final Executor f33704d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ScheduledExecutorService f33705e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final boolean f33706f;

        public h(C2984w c2984w, int i8, Executor executor, ScheduledExecutorService scheduledExecutorService, boolean z8) {
            this.f33701a = c2984w;
            this.f33702b = i8;
            this.f33704d = executor;
            this.f33705e = scheduledExecutorService;
            this.f33706f = z8;
        }

        public static /* synthetic */ Y4.a d(h hVar, Void r8) {
            return hVar.f33706f ? hVar.f33701a.z().x() : K.n.p(null);
        }

        public static /* synthetic */ Object e(h hVar, F1.c.a aVar) {
            hVar.f33701a.I().b(aVar, 2);
            return "TorchOn";
        }

        @Override // p166t.C2935f0.e
        public Y4.a a(TotalCaptureResult totalCaptureResult) {
            AbstractC0890p0.a("Camera2CapturePipeline", "TorchTask#preCapture: isFlashRequired = " + C2935f0.e(this.f33702b, totalCaptureResult));
            if (C2935f0.e(this.f33702b, totalCaptureResult)) {
                if (this.f33701a.P()) {
                    AbstractC0890p0.a("Camera2CapturePipeline", "Low-light boost already on, not turn on");
                } else {
                    if (!this.f33701a.S()) {
                        AbstractC0890p0.a("Camera2CapturePipeline", "Turn on torch");
                        this.f33703c = true;
                        return K.d.b(F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.E0
                            @Override // F1.c.InterfaceC0112c
                            public final Object a(c.a aVar) {
                                return C2935f0.h.e(this.f33329a, aVar);
                            }
                        })).f(new K.a() { // from class: t.F0
                            @Override // K.a
                            public final a apply(Object obj) {
                                return C2935f0.h.d(this.f33333a, (Void) obj);
                            }
                        }, this.f33704d).f(new K.a() { // from class: t.G0
                            @Override // K.a
                            public final a apply(Object obj) {
                                C2935f0.h hVar = this.f33336a;
                                return C2935f0.i(C2935f0.h.f33700g, hVar.f33705e, hVar.f33701a, new C2935f0.f.a() { // from class: t.I0
                                    @Override // p166t.C2935f0.f.a
                                    public final boolean a(TotalCaptureResult totalCaptureResult2) {
                                        return C2935f0.d(totalCaptureResult2, true);
                                    }
                                });
                            }
                        }, this.f33704d).e(new p142q.a() { // from class: t.H0
                            @Override // p142q.a
                            public final Object apply(Object obj) {
                                return Boolean.FALSE;
                            }
                        }, J.a.a());
                    }
                    AbstractC0890p0.a("Camera2CapturePipeline", "Torch already on, not turn on");
                }
            }
            return K.n.p(Boolean.FALSE);
        }

        @Override // p166t.C2935f0.e
        public boolean b() {
            return this.f33702b == 0;
        }

        @Override // p166t.C2935f0.e
        public void c() {
            if (this.f33703c) {
                this.f33701a.I().b(null, 0);
                AbstractC0890p0.a("Camera2CapturePipeline", "Turning off torch");
                if (this.f33706f) {
                    this.f33701a.z().h(false, true);
                }
            }
        }
    }

    public C2935f0(C2984w c2984w, p174u.n nVar, Z0 z8, Executor executor, ScheduledExecutorService scheduledExecutorService) {
        this.f33660a = c2984w;
        Integer num = (Integer) nVar.a(CameraCharacteristics.INFO_SUPPORTED_HARDWARE_LEVEL);
        this.f33666g = num != null && num.intValue() == 2;
        this.f33664e = executor;
        this.f33665f = scheduledExecutorService;
        this.f33663d = z8;
        this.f33661b = new B(z8);
        this.f33662c = p198x.g.a(new C2923b0(nVar));
    }

    public static boolean d(TotalCaptureResult totalCaptureResult, boolean z8) {
        if (totalCaptureResult == null) {
            return false;
        }
        return AbstractC0986j0.a(new C2940h(totalCaptureResult), z8);
    }

    public static boolean e(int i8, TotalCaptureResult totalCaptureResult) {
        AbstractC0890p0.a("Camera2CapturePipeline", "isFlashRequired: flashMode = " + i8);
        if (i8 != 0) {
            if (i8 != 1) {
                if (i8 == 2) {
                    return false;
                }
                if (i8 != 3) {
                    throw new AssertionError(i8);
                }
            }
            return true;
        }
        Integer num = totalCaptureResult != null ? (Integer) totalCaptureResult.get(CaptureResult.CONTROL_AE_STATE) : null;
        AbstractC0890p0.a("Camera2CapturePipeline", "isFlashRequired: aeState = " + num);
        return num != null && num.intValue() == 4;
    }

    public static Y4.a i(long j8, ScheduledExecutorService scheduledExecutorService, C2984w c2984w, f.a aVar) {
        return K.n.r(TimeUnit.NANOSECONDS.toMillis(j8), scheduledExecutorService, null, true, j(c2984w, aVar));
    }

    public static Y4.a j(final C2984w c2984w, f.a aVar) {
        final f fVar = new f(aVar);
        c2984w.t(fVar);
        Y4.a aVarC = fVar.c();
        aVarC.a(new Runnable() { // from class: t.c0
            @Override // java.lang.Runnable
            public final void run() {
                c2984w.T(fVar);
            }
        }, c2984w.f33886c);
        return aVarC;
    }

    public d b(int i8, int i9, int i10) {
        int i11;
        n nVar = new n(this.f33663d);
        d dVar = new d(this.f33667h, this.f33664e, this.f33665f, this.f33660a, this.f33666g, nVar);
        if (i8 == 0) {
            dVar.f(new b(this.f33660a));
        }
        if (i9 != 3) {
            if (this.f33662c) {
                if (f(i10)) {
                    i11 = i9;
                    dVar.f(new h(this.f33660a, i11, this.f33664e, this.f33665f, (this.f33661b.a() || this.f33660a.O()) ? false : true));
                } else {
                    i11 = i9;
                    dVar.f(new a(this.f33660a, i11, nVar));
                }
            }
            AbstractC0890p0.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i8 + ", flashMode = " + i11 + ", flashType = " + i10 + ", pipeline tasks = " + dVar.f33686h);
            return dVar;
        }
        dVar.f(new g(this.f33660a, this.f33664e, this.f33665f, new A(this.f33663d)));
        i11 = i9;
        AbstractC0890p0.a("Camera2CapturePipeline", "createPipeline: captureMode = " + i8 + ", flashMode = " + i11 + ", flashType = " + i10 + ", pipeline tasks = " + dVar.f33686h);
        return dVar;
    }

    public InterfaceC0950i c(int i8, int i9, int i10) {
        return new c(b(i8, i9, i10), this.f33664e, i9);
    }

    public final boolean f(int i8) {
        return this.f33661b.a() || this.f33667h == 3 || i8 == 1;
    }

    public void g(int i8) {
        this.f33667h = i8;
    }

    public Y4.a h(List list, int i8, int i9, int i10) {
        return K.n.s(b(i8, i9, i10).i(list, i9));
    }
}
