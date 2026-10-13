package p166t;

import A.AbstractC0890p0;
import A.C0864c0;
import A.C0883m;
import F1.c;
import H.AbstractC0995o;
import H.C0980g0;
import H.C0999q;
import H.F;
import H.InterfaceC0984i0;
import H.InterfaceC1014y;
import H.Z0;
import H.c1;
import H.m1;
import K.d;
import Y4.a;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Build;
import android.util.ArrayMap;
import android.util.Rational;
import com.revenuecat.purchases.subscriberattributes.caching.tU.ajyWhveMDgQ;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.atomic.AtomicLong;
import p174u.n;
import p179u4.eubL.OjEsfyJYzbPn;
import p198x.C3098a;
import p214z.g;
import p214z.l;

/* JADX INFO: renamed from: t.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2984w implements F {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public int f33882A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public long f33883B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final a f33884C;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final b f33885b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f33886c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Object f33887d = new Object();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final n f33888e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final F.d f33889f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final c1.b f33890g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2992y1 f33891h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j2 f33892i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final g2 f33893j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final H1 f33894k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C2969q1 f33895l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l2 f33896m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final g f33897n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final C2935f0 f33898o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final i2 f33899p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f33900q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public C0864c0.i f33901r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public volatile int f33902s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public volatile int f33903t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public volatile boolean f33904u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public volatile int f33905v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final C3098a f33906w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f33907x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final AtomicLong f33908y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public volatile Y4.a f33909z;

    /* JADX INFO: renamed from: t.w$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends AbstractC0995o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Set f33910a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Map f33911b = new ArrayMap();

        @Override // H.AbstractC0995o
        public void a(final int i8) {
            for (final AbstractC0995o abstractC0995o : this.f33910a) {
                try {
                    ((Executor) this.f33911b.get(abstractC0995o)).execute(new Runnable() { // from class: t.v
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC0995o.a(i8);
                        }
                    });
                } catch (RejectedExecutionException e8) {
                    AbstractC0890p0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCancelled.", e8);
                }
            }
        }

        @Override // H.AbstractC0995o
        public void b(final int i8, final InterfaceC1014y interfaceC1014y) {
            for (final AbstractC0995o abstractC0995o : this.f33910a) {
                try {
                    ((Executor) this.f33911b.get(abstractC0995o)).execute(new Runnable() { // from class: t.u
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC0995o.b(i8, interfaceC1014y);
                        }
                    });
                } catch (RejectedExecutionException e8) {
                    AbstractC0890p0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureCompleted.", e8);
                }
            }
        }

        @Override // H.AbstractC0995o
        public void c(final int i8, final C0999q c0999q) {
            for (final AbstractC0995o abstractC0995o : this.f33910a) {
                try {
                    ((Executor) this.f33911b.get(abstractC0995o)).execute(new Runnable() { // from class: t.t
                        @Override // java.lang.Runnable
                        public final void run() {
                            abstractC0995o.c(i8, c0999q);
                        }
                    });
                } catch (RejectedExecutionException e8) {
                    AbstractC0890p0.d("Camera2CameraControlImp", "Executor rejected to invoke onCaptureFailed.", e8);
                }
            }
        }

        public void h(Executor executor, AbstractC0995o abstractC0995o) {
            this.f33910a.add(abstractC0995o);
            this.f33911b.put(abstractC0995o, executor);
        }

        public void i(AbstractC0995o abstractC0995o) {
            this.f33910a.remove(abstractC0995o);
            this.f33911b.remove(abstractC0995o);
        }
    }

    /* JADX INFO: renamed from: t.w$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends CameraCaptureSession.CaptureCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Set f33912a = new HashSet();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Executor f33913b;

        public b(Executor executor) {
            this.f33913b = executor;
        }

        public static /* synthetic */ void a(b bVar, TotalCaptureResult totalCaptureResult) {
            bVar.getClass();
            HashSet hashSet = new HashSet();
            for (c cVar : bVar.f33912a) {
                if (cVar.a(totalCaptureResult)) {
                    hashSet.add(cVar);
                }
            }
            if (hashSet.isEmpty()) {
                return;
            }
            bVar.f33912a.removeAll(hashSet);
        }

        public void b(c cVar) {
            this.f33912a.add(cVar);
        }

        public void c(c cVar) {
            this.f33912a.remove(cVar);
        }

        @Override // android.hardware.camera2.CameraCaptureSession.CaptureCallback
        public void onCaptureCompleted(CameraCaptureSession cameraCaptureSession, CaptureRequest captureRequest, final TotalCaptureResult totalCaptureResult) {
            this.f33913b.execute(new Runnable() { // from class: t.x
                @Override // java.lang.Runnable
                public final void run() {
                    C2984w.b.a(this.f33916a, totalCaptureResult);
                }
            });
        }
    }

    /* JADX INFO: renamed from: t.w$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface c {
        boolean a(TotalCaptureResult totalCaptureResult);
    }

    public C2984w(n nVar, ScheduledExecutorService scheduledExecutorService, Executor executor, F.d dVar, Z0 z8) {
        c1.b bVar = new c1.b();
        this.f33890g = bVar;
        this.f33900q = 0;
        this.f33902s = 0;
        this.f33904u = false;
        this.f33905v = 2;
        this.f33907x = true;
        this.f33908y = new AtomicLong(0L);
        this.f33909z = K.n.p(null);
        this.f33882A = 1;
        this.f33883B = 0L;
        a aVar = new a();
        this.f33884C = aVar;
        this.f33888e = nVar;
        this.f33889f = dVar;
        this.f33886c = executor;
        this.f33899p = new i2(executor);
        b bVar2 = new b(executor);
        this.f33885b = bVar2;
        bVar.y(this.f33882A);
        bVar.j(C2921a1.e(bVar2));
        bVar.j(aVar);
        this.f33895l = new C2969q1(this, nVar, executor);
        this.f33891h = new C2992y1(this, scheduledExecutorService, executor, z8);
        this.f33892i = new j2(this, nVar, executor);
        this.f33893j = new g2(this, nVar, executor);
        this.f33903t = nVar.c();
        this.f33894k = new H1(this, nVar, executor);
        this.f33896m = new p2(nVar, executor);
        this.f33906w = new C3098a(z8);
        this.f33897n = new g(this, executor);
        this.f33898o = new C2935f0(this, nVar, z8, executor, scheduledExecutorService);
    }

    public static int F(n nVar, int i8) {
        int[] iArr = (int[]) nVar.a(CameraCharacteristics.CONTROL_AE_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (Q(i8, iArr)) {
            return i8;
        }
        return Q(1, iArr) ? 1 : 0;
    }

    public static boolean Q(int i8, int[] iArr) {
        for (int i9 : iArr) {
            if (i8 == i9) {
                return true;
            }
        }
        return false;
    }

    public static boolean R(TotalCaptureResult totalCaptureResult, long j8) {
        Long l8;
        if (totalCaptureResult.getRequest() == null) {
            return false;
        }
        Object tag = totalCaptureResult.getRequest().getTag();
        return (tag instanceof m1) && (l8 = (Long) ((m1) tag).d("CameraControlSessionUpdateId")) != null && l8.longValue() >= j8;
    }

    public static /* synthetic */ void j() {
    }

    public static /* synthetic */ void k() {
    }

    public static /* synthetic */ Object p(final C2984w c2984w, final F1.c.a aVar) {
        c2984w.f33886c.execute(new Runnable() { // from class: t.o
            @Override // java.lang.Runnable
            public final void run() {
                C2984w c2984w2 = this.f33805a;
                K.n.t(c2984w2.g0(c2984w2.f0()), aVar);
            }
        });
        return "updateSessionConfigAsync";
    }

    public static /* synthetic */ boolean s(long j8, F1.c.a aVar, TotalCaptureResult totalCaptureResult) {
        if (!R(totalCaptureResult, j8)) {
            return false;
        }
        aVar.c(null);
        return true;
    }

    public H1 A() {
        return this.f33894k;
    }

    public C0864c0.i B() {
        return this.f33901r;
    }

    public c1 C() {
        this.f33890g.y(this.f33882A);
        this.f33890g.t(D());
        this.f33890g.o("CameraControlSessionUpdateId", Long.valueOf(this.f33883B));
        return this.f33890g.p();
    }

    public InterfaceC0984i0 D() {
        p158s.a.C0723a c0723a = new p158s.a.C0723a();
        CaptureRequest.Key key = CaptureRequest.CONTROL_MODE;
        InterfaceC0984i0.c cVar = InterfaceC0984i0.c.REQUIRED;
        c0723a.g(key, 1, cVar);
        this.f33891h.g(c0723a);
        this.f33892i.a(c0723a);
        int iA = this.f33891h.s() ? 5 : 1;
        if (this.f33904u) {
            iA = 6;
        } else if (S()) {
            c0723a.g(CaptureRequest.FLASH_MODE, 2, cVar);
            if (Build.VERSION.SDK_INT >= 35) {
                if (this.f33902s == 1) {
                    c0723a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f33903t), cVar);
                } else if (this.f33902s == 2) {
                    c0723a.g(CaptureRequest.FLASH_STRENGTH_LEVEL, Integer.valueOf(this.f33888e.c()), cVar);
                }
            }
        } else {
            int i8 = this.f33905v;
            if (i8 == 0) {
                iA = this.f33906w.a(2);
            } else if (i8 == 1) {
                iA = 3;
            } else if (i8 == 2) {
                iA = 1;
            }
        }
        c0723a.g(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(E(iA)), cVar);
        c0723a.g(CaptureRequest.CONTROL_AWB_MODE, Integer.valueOf(H(1)), cVar);
        this.f33895l.c(c0723a);
        this.f33897n.i(c0723a);
        return c0723a.c();
    }

    public int E(int i8) {
        return F(this.f33888e, i8);
    }

    public int G(int i8) {
        int[] iArr = (int[]) this.f33888e.a(CameraCharacteristics.CONTROL_AF_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (Q(i8, iArr)) {
            return i8;
        }
        if (Q(4, iArr)) {
            return 4;
        }
        return Q(1, iArr) ? 1 : 0;
    }

    public final int H(int i8) {
        int[] iArr = (int[]) this.f33888e.a(CameraCharacteristics.CONTROL_AWB_AVAILABLE_MODES);
        if (iArr == null) {
            return 0;
        }
        if (Q(i8, iArr)) {
            return i8;
        }
        return Q(1, iArr) ? 1 : 0;
    }

    public g2 I() {
        return this.f33893j;
    }

    public int J() {
        int i8;
        synchronized (this.f33887d) {
            i8 = this.f33900q;
        }
        return i8;
    }

    public j2 K() {
        return this.f33892i;
    }

    public l2 L() {
        return this.f33896m;
    }

    public void M() {
        synchronized (this.f33887d) {
            this.f33900q++;
        }
    }

    public final boolean N() {
        return J() > 0;
    }

    public boolean O() {
        int iA = this.f33899p.a();
        AbstractC0890p0.a("Camera2CameraControlImp", "isInVideoUsage: mVideoUsageControl value = " + iA);
        return iA > 0;
    }

    public boolean P() {
        return this.f33904u;
    }

    public boolean S() {
        return this.f33902s != 0;
    }

    public void T(c cVar) {
        this.f33885b.c(cVar);
    }

    public void U(final AbstractC0995o abstractC0995o) {
        this.f33886c.execute(new Runnable() { // from class: t.s
            @Override // java.lang.Runnable
            public final void run() {
                this.f33857a.f33884C.i(abstractC0995o);
            }
        });
    }

    public final void V() {
        C0980g0.a aVar = new C0980g0.a();
        aVar.t(this.f33882A);
        aVar.u(true);
        p158s.a.C0723a c0723a = new p158s.a.C0723a();
        c0723a.f(CaptureRequest.CONTROL_AE_MODE, Integer.valueOf(E(1)));
        c0723a.f(CaptureRequest.FLASH_MODE, 0);
        aVar.e(c0723a.c());
        d0(Collections.singletonList(aVar.h()));
    }

    public void W() {
        b0(1);
    }

    public void Y(boolean z8) {
        this.f33907x = z8;
    }

    public void Z(boolean z8) {
        this.f33894k.f(z8);
    }

    @Override // H.F
    public void a() {
        this.f33896m.a();
    }

    public void a0(Rational rational) {
        this.f33891h.u(rational);
    }

    @Override // H.F
    public void b(c1.b bVar) {
        this.f33896m.b(bVar);
    }

    public void b0(int i8) {
        this.f33882A = i8;
        this.f33891h.v(i8);
        this.f33898o.g(this.f33882A);
    }

    @Override // H.F
    public Y4.a c(final List list, final int i8, final int i9) {
        if (N()) {
            final int iY = y();
            return d.b(K.n.s(this.f33909z)).f(new K.a() { // from class: t.p
                @Override // K.a
                public final a apply(Object obj) {
                    return this.f33816a.f33898o.h(list, i8, iY, i9);
                }
            }, this.f33886c);
        }
        AbstractC0890p0.l("Camera2CameraControlImp", "Camera is not active.");
        return K.n.n(new C0883m("Camera is not active."));
    }

    public void c0(boolean z8) {
        this.f33896m.f(z8);
    }

    @Override // H.F
    public void d(int i8) {
        if (!N()) {
            AbstractC0890p0.l("Camera2CameraControlImp", "Camera is not active.");
            return;
        }
        this.f33905v = i8;
        AbstractC0890p0.a("Camera2CameraControlImp", "setFlashMode: mFlashMode = " + this.f33905v);
        l2 l2Var = this.f33896m;
        boolean z8 = true;
        if (this.f33905v != 1 && this.f33905v != 0) {
            z8 = false;
        }
        l2Var.e(z8);
        this.f33909z = e0();
    }

    public void d0(List list) {
        this.f33889f.b(list);
    }

    @Override // H.F
    public Y4.a e(final int i8, final int i9) {
        if (N()) {
            final int iY = y();
            return d.b(K.n.s(this.f33909z)).f(new K.a() { // from class: t.q
                @Override // K.a
                public final a apply(Object obj) {
                    return K.n.p(this.f33840a.f33898o.c(i8, iY, i9));
                }
            }, this.f33886c);
        }
        AbstractC0890p0.l("Camera2CameraControlImp", "Camera is not active.");
        return K.n.n(new C0883m("Camera is not active."));
    }

    public Y4.a e0() {
        return K.n.s(F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.m
            @Override // F1.c.InterfaceC0112c
            public final Object a(c.a aVar) {
                return C2984w.p(this.f33789a, aVar);
            }
        }));
    }

    @Override // H.F
    public InterfaceC0984i0 f() {
        return this.f33897n.n();
    }

    public long f0() {
        this.f33883B = this.f33908y.getAndIncrement();
        this.f33889f.a();
        return this.f33883B;
    }

    @Override // H.F
    public void g(C0864c0.i iVar) {
        this.f33901r = iVar;
    }

    public final Y4.a g0(final long j8) {
        return F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.r
            @Override // F1.c.InterfaceC0112c
            public final Object a(c.a aVar) {
                return C2984w.o(this.f33851a, j8, aVar);
            }
        });
    }

    @Override // H.F
    public void h(InterfaceC0984i0 interfaceC0984i0) {
        this.f33897n.g(l.a.e(interfaceC0984i0).d()).a(new Runnable() { // from class: t.l
            @Override // java.lang.Runnable
            public final void run() {
                C2984w.j();
            }
        }, J.a.a());
    }

    @Override // H.F
    public void i() {
        this.f33897n.j().a(new Runnable() { // from class: t.n
            @Override // java.lang.Runnable
            public final void run() {
                C2984w.k();
            }
        }, J.a.a());
    }

    public void t(c cVar) {
        this.f33885b.b(cVar);
    }

    public void u(final Executor executor, final AbstractC0995o abstractC0995o) {
        this.f33886c.execute(new Runnable() { // from class: t.k
            @Override // java.lang.Runnable
            public final void run() {
                this.f33775a.f33884C.h(executor, abstractC0995o);
            }
        });
    }

    public void v() {
        synchronized (this.f33887d) {
            try {
                int i8 = this.f33900q;
                if (i8 == 0) {
                    throw new IllegalStateException("Decrementing use count occurs more times than incrementing");
                }
                this.f33900q = i8 - 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void w(boolean z8) {
        if (this.f33904u == z8) {
            return;
        }
        if (z8 && S()) {
            V();
            this.f33902s = 0;
            this.f33893j.c();
        }
        this.f33904u = z8;
        f0();
    }

    public void x(int i8) {
        if (this.f33904u) {
            return;
        }
        this.f33902s = i8;
        if (i8 == 0) {
            V();
        }
        f0();
    }

    public int y() {
        return this.f33905v;
    }

    public C2992y1 z() {
        return this.f33891h;
    }

    public void X(boolean z8) {
        AbstractC0890p0.a(ajyWhveMDgQ.xFYLnTWcUvAlD, "setActive: isActive = " + z8);
        this.f33891h.t(z8);
        this.f33892i.f(z8);
        this.f33894k.d(z8);
        this.f33893j.f(z8);
        this.f33895l.b(z8);
        this.f33897n.o(z8);
        if (z8) {
            return;
        }
        this.f33901r = null;
        this.f33899p.b();
    }

    public static /* synthetic */ Object o(C2984w c2984w, final long j8, final F1.c.a aVar) {
        c2984w.getClass();
        c2984w.t(new c() { // from class: t.j
            @Override // p166t.C2984w.c
            public final boolean a(TotalCaptureResult totalCaptureResult) {
                return C2984w.s(j8, aVar, totalCaptureResult);
            }
        });
        return OjEsfyJYzbPn.kHjaxDBbSxow + j8;
    }
}
