package p166t;

import A.AbstractC0890p0;
import A.AbstractC0902w;
import A.C0903w0;
import A.C0904x;
import A.G;
import A.T0;
import F1.c;
import H.AbstractC0977f;
import H.AbstractC0994n0;
import H.B;
import H.B0;
import H.C0970b0;
import H.C0980g0;
import H.E;
import H.F;
import H.I;
import H.J;
import H.L0;
import H.R0;
import H.c1;
import H.g1;
import H.t1;
import H.u1;
import H.v1;
import T0.Vl.PCRzgdeK;
import Y4.a;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.media.CamcorderProfile;
import android.os.Handler;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Rational;
import android.util.Size;
import android.view.Surface;
import androidx.camera.camera2.internal.compat.quirk.LegacyCameraSurfaceCleanupQuirk;
import com.elgato.streamdeck.vsd2.connection.Cjvi.LYdqVGvOGMNr;
import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import p174u.AbstractC3016a;
import p174u.n;
import p174u.t;
import p180u5.FCkZ.BpgIURjN;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class T implements J {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f33473A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f33474B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public K1 f33475C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final C2957m1 f33476D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final S1.b f33477E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final Set f33478F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public B f33479G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public final Object f33480H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f33481I;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final C2963o1 f33482V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public final n f33483W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public final p182v.e f33484X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public final R1 f33485Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public final h f33486Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final t1 f33487a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final t f33488b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Executor f33489c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final ScheduledExecutorService f33490d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public volatile i f33491e = i.INITIALIZED;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final L0 f33492f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final X0 f33493g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final C2984w f33494h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final j f33495i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Y f33496j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CameraDevice f33497k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f33498l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public InterfaceC2948j1 f33499m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final AtomicInteger f33500n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public Y4.a f33501o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public F1.c.a f33502p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Map f33503q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f33504r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final e f33505s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final f f33506t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final B.a f33507u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C0970b0 f33508v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final G f33509w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final boolean f33510x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final boolean f33511y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f33512z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements InterfaceC2937g {
        public a() {
        }

        @Override // p166t.InterfaceC2937g
        public CamcorderProfile a(int i8, int i9) {
            return CamcorderProfile.get(i8, i9);
        }

        @Override // p166t.InterfaceC2937g
        public boolean b(int i8, int i9) {
            return CamcorderProfile.hasProfile(i8, i9);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F1.c.a f33514a;

        public b(F1.c.a aVar) {
            this.f33514a = aVar;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            T.this.Z("openCameraConfigAndClose camera closed");
            this.f33514a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            T.this.Z("openCameraConfigAndClose camera disconnected");
            this.f33514a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i8) {
            T.this.Z("openCameraConfigAndClose camera error " + i8);
            this.f33514a.c(null);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(final CameraDevice cameraDevice) {
            T.this.Z("openCameraConfigAndClose camera opened");
            Y4.a aVarW = T.this.W(cameraDevice);
            Objects.requireNonNull(cameraDevice);
            aVarW.a(new Runnable() { // from class: t.U
                @Override // java.lang.Runnable
                public final void run() {
                    cameraDevice.close();
                }
            }, T.this.f33489c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2948j1 f33518a;

        public d(InterfaceC2948j1 interfaceC2948j1) {
            this.f33518a = interfaceC2948j1;
        }

        @Override // K.c
        public void b(Throwable th) {
            if (th instanceof AbstractC0994n0.a) {
                c1 c1VarB0 = T.this.b0(((AbstractC0994n0.a) th).a());
                if (c1VarB0 != null) {
                    T.this.w0(c1VarB0);
                    return;
                }
                return;
            }
            if (th instanceof CancellationException) {
                T.this.Z("Unable to configure camera cancelled");
                return;
            }
            i iVar = T.this.f33491e;
            i iVar2 = i.OPENED;
            if (iVar == iVar2) {
                T.this.D0(iVar2, AbstractC0902w.a.b(4, th));
            }
            AbstractC0890p0.d("Camera2CameraImpl", "Unable to configure camera " + T.this, th);
            T t8 = T.this;
            if (t8.f33499m == this.f33518a) {
                t8.A0(false);
            }
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
            if (T.this.f33507u.c() == 2 && T.this.f33491e == i.OPENED) {
                T.this.C0(i.CONFIGURED);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class e extends CameraManager.AvailabilityCallback implements C0970b0.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f33520a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f33521b = true;

        public e(String str) {
            this.f33520a = str;
        }

        @Override // H.C0970b0.c
        public void a() {
            if (T.this.f33491e == i.PENDING_OPEN || T.this.f33491e == i.OPENING_WITH_ERROR) {
                T.this.L0(false);
            }
        }

        public boolean b() {
            return this.f33521b;
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraAvailable(String str) {
            if (this.f33520a.equals(str)) {
                this.f33521b = true;
                if (T.this.f33491e == i.PENDING_OPEN || T.this.f33491e == i.OPENING_WITH_ERROR) {
                    T.this.L0(false);
                }
            }
        }

        @Override // android.hardware.camera2.CameraManager.AvailabilityCallback
        public void onCameraUnavailable(String str) {
            if (this.f33520a.equals(str)) {
                this.f33521b = false;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class f implements C0970b0.b {
        public f() {
        }

        @Override // H.C0970b0.b
        public void a() {
            if (T.this.f33491e == i.OPENED) {
                T.this.u0();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class g implements F.d {
        public g() {
        }

        @Override // H.F.d
        public void a() {
            T.this.M0();
        }

        @Override // H.F.d
        public void b(List list) {
            T.this.F0((List) T1.f.g(list));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum i {
        RELEASED,
        RELEASING,
        INITIALIZED,
        PENDING_OPEN,
        OPENING_WITH_ERROR,
        CLOSING,
        f33536g,
        REOPENING,
        OPENING,
        OPENED,
        CONFIGURED
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class j extends CameraDevice.StateCallback {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Executor f33542a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final ScheduledExecutorService f33543b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public b f33544c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ScheduledFuture f33545d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f33546e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final long f33548a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public long f33549b = -1;

            public a(long j8) {
                this.f33548a = j8;
            }

            public boolean a() {
                if (b() < d()) {
                    return true;
                }
                e();
                return false;
            }

            public long b() {
                long jUptimeMillis = SystemClock.uptimeMillis();
                if (this.f33549b == -1) {
                    this.f33549b = jUptimeMillis;
                }
                return jUptimeMillis - this.f33549b;
            }

            public int c() {
                if (!j.this.f()) {
                    return 700;
                }
                long jB = b();
                if (jB <= 120000) {
                    return 1000;
                }
                return jB <= 300000 ? 2000 : 4000;
            }

            public int d() {
                if (!j.this.f()) {
                    long j8 = this.f33548a;
                    return j8 > 0 ? Math.min((int) j8, ModuleDescriptor.MODULE_VERSION) : ModuleDescriptor.MODULE_VERSION;
                }
                long j9 = this.f33548a;
                if (j9 > 0) {
                    return Math.min((int) j9, 1800000);
                }
                return 1800000;
            }

            public void e() {
                this.f33549b = -1L;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class b implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Executor f33551a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public boolean f33552b = false;

            public b(Executor executor) {
                this.f33551a = executor;
            }

            public static /* synthetic */ void a(b bVar) {
                if (bVar.f33552b) {
                    return;
                }
                T1.f.i(T.this.f33491e == i.REOPENING || T.this.f33491e == i.f33536g);
                if (j.this.f()) {
                    T.this.K0(true);
                } else {
                    T.this.L0(true);
                }
            }

            public void b() {
                this.f33552b = true;
            }

            @Override // java.lang.Runnable
            public void run() {
                this.f33551a.execute(new Runnable() { // from class: t.X
                    @Override // java.lang.Runnable
                    public final void run() {
                        T.j.b.a(this.f33566a);
                    }
                });
            }
        }

        public j(Executor executor, ScheduledExecutorService scheduledExecutorService, long j8) {
            this.f33542a = executor;
            this.f33543b = scheduledExecutorService;
            this.f33546e = new a(j8);
        }

        public boolean a() {
            if (this.f33545d == null) {
                return false;
            }
            T.this.Z("Cancelling scheduled re-open: " + this.f33544c);
            this.f33544c.b();
            this.f33544c = null;
            this.f33545d.cancel(false);
            this.f33545d = null;
            return true;
        }

        public final void b(CameraDevice cameraDevice, int i8) {
            T1.f.j(T.this.f33491e == i.OPENING || T.this.f33491e == i.OPENED || T.this.f33491e == i.CONFIGURED || T.this.f33491e == i.REOPENING || T.this.f33491e == i.f33536g, "Attempt to handle open error from non open state: " + T.this.f33491e);
            if (i8 == 1 || i8 == 2 || i8 == 4) {
                AbstractC0890p0.a("Camera2CameraImpl", String.format("Attempt to reopen camera[%s] after error[%s]", cameraDevice.getId(), T.f0(i8)));
                c(i8);
                return;
            }
            AbstractC0890p0.c("Camera2CameraImpl", "Error observed on open (or opening) camera device " + cameraDevice.getId() + ": " + T.f0(i8) + " closing camera.");
            T.this.D0(i.CLOSING, AbstractC0902w.a.a(i8 == 3 ? 5 : 6));
            T.this.U(false);
        }

        public final void c(int i8) {
            int i9 = 1;
            T1.f.j(T.this.f33498l != 0, "Can only reopen camera device after error if the camera device is actually in an error state.");
            if (i8 == 1) {
                i9 = 2;
            } else if (i8 != 2) {
                i9 = 3;
            }
            T.this.D0(i.REOPENING, AbstractC0902w.a.a(i9));
            T.this.U(false);
        }

        public void d() {
            this.f33546e.e();
        }

        public boolean f() {
            T t8 = T.this;
            if (!t8.f33481I) {
                return false;
            }
            int i8 = t8.f33498l;
            return i8 == 1 || i8 == 2;
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onClosed(CameraDevice cameraDevice) {
            T.this.Z("CameraDevice.onClosed()");
            T1.f.j(T.this.f33497k == null, "Unexpected onClose callback on camera device: " + cameraDevice);
            int iOrdinal = T.this.f33491e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                T1.f.i(T.this.n0());
                T.this.X();
                return;
            }
            if (iOrdinal != 6 && iOrdinal != 7) {
                throw new IllegalStateException("Camera closed while in state: " + T.this.f33491e);
            }
            T t8 = T.this;
            if (t8.f33498l == 0) {
                t8.L0(false);
                return;
            }
            t8.Z("Camera closed due to error: " + T.f0(T.this.f33498l));
            e();
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onDisconnected(CameraDevice cameraDevice) {
            T.this.Z("CameraDevice.onDisconnected()");
            onError(cameraDevice, 1);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onError(CameraDevice cameraDevice, int i8) {
            T t8 = T.this;
            t8.f33497k = cameraDevice;
            t8.f33498l = i8;
            t8.f33486Z.b();
            int iOrdinal = T.this.f33491e.ordinal();
            if (iOrdinal != 1) {
                switch (iOrdinal) {
                    case 5:
                        break;
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                        AbstractC0890p0.a("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will attempt recovering from error.", cameraDevice.getId(), T.f0(i8), T.this.f33491e.name()));
                        b(cameraDevice, i8);
                        return;
                    default:
                        throw new IllegalStateException("onError() should not be possible from state: " + T.this.f33491e);
                }
            }
            AbstractC0890p0.c("Camera2CameraImpl", String.format("CameraDevice.onError(): %s failed with %s while in %s state. Will finish closing camera.", cameraDevice.getId(), T.f0(i8), T.this.f33491e.name()));
            T.this.U(false);
        }

        @Override // android.hardware.camera2.CameraDevice.StateCallback
        public void onOpened(CameraDevice cameraDevice) {
            T.this.Z("CameraDevice.onOpened()");
            T t8 = T.this;
            t8.f33497k = cameraDevice;
            t8.f33498l = 0;
            d();
            int iOrdinal = T.this.f33491e.ordinal();
            if (iOrdinal == 1 || iOrdinal == 5) {
                T1.f.i(T.this.n0());
                T.this.f33497k.close();
                T.this.f33497k = null;
            } else {
                if (iOrdinal != 6 && iOrdinal != 7 && iOrdinal != 8) {
                    throw new IllegalStateException("onOpened() should not be possible from state: " + T.this.f33491e);
                }
                T.this.C0(i.OPENED);
                C0970b0 c0970b0 = T.this.f33508v;
                String id = cameraDevice.getId();
                T t9 = T.this;
                if (c0970b0.j(id, t9.f33507u.g(t9.f33497k.getId()))) {
                    T.this.u0();
                }
            }
        }

        public void e() {
            T1.f.i(this.f33544c == null);
            T1.f.i(this.f33545d == null);
            if (!this.f33546e.a()) {
                AbstractC0890p0.c(PCRzgdeK.fCHx, "Camera reopening attempted for " + this.f33546e.d() + "ms without success.");
                T.this.E0(i.PENDING_OPEN, null, false);
                return;
            }
            this.f33544c = new b(this.f33542a);
            T.this.Z("Attempting camera re-open in " + this.f33546e.c() + "ms: " + this.f33544c + " activeResuming = " + T.this.f33481I);
            this.f33545d = this.f33543b.schedule(this.f33544c, (long) this.f33546e.c(), TimeUnit.MILLISECONDS);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class k {
        public static k a(String str, Class cls, c1 c1Var, u1 u1Var, Size size, g1 g1Var, List list) {
            return new C2928d(str, cls, c1Var, u1Var, size, g1Var, list);
        }

        public static k b(T0 t8, boolean z8) {
            return a(T.i0(t8), t8.getClass(), z8 ? t8.z() : t8.x(), t8.l(), t8.h(), t8.g(), T.e0(t8));
        }

        public abstract List c();

        public abstract c1 d();

        public abstract g1 e();

        public abstract Size f();

        public abstract u1 g();

        public abstract String h();

        public abstract Class i();
    }

    public T(Context context, t tVar, String str, Y y8, B.a aVar, C0970b0 c0970b0, Executor executor, Handler handler, C2963o1 c2963o1, long j8, G g8) throws C0904x {
        L0 l8 = new L0();
        this.f33492f = l8;
        this.f33498l = 0;
        this.f33500n = new AtomicInteger(0);
        this.f33503q = new LinkedHashMap();
        this.f33504r = 0;
        this.f33512z = false;
        this.f33473A = false;
        this.f33474B = true;
        this.f33478F = new HashSet();
        this.f33479G = E.a();
        this.f33480H = new Object();
        this.f33481I = false;
        this.f33486Z = new h(this, null);
        this.f33488b = tVar;
        this.f33507u = aVar;
        this.f33508v = c0970b0;
        ScheduledExecutorService scheduledExecutorServiceE = J.a.e(handler);
        this.f33490d = scheduledExecutorServiceE;
        Executor executorF = J.a.f(executor);
        this.f33489c = executorF;
        this.f33495i = new j(executorF, scheduledExecutorServiceE, j8);
        this.f33487a = new t1(str);
        l8.m(J.a.CLOSED);
        X0 x8 = new X0(c0970b0);
        this.f33493g = x8;
        C2957m1 c2957m1 = new C2957m1(executorF);
        this.f33476D = c2957m1;
        this.f33482V = c2963o1;
        this.f33509w = g8;
        try {
            n nVarC = tVar.c(str);
            this.f33483W = nVarC;
            C2984w c2984w = new C2984w(nVarC, scheduledExecutorServiceE, executorF, new g(), y8.o());
            this.f33494h = c2984w;
            this.f33496j = y8;
            y8.y(c2984w);
            y8.B(x8.a());
            this.f33484X = p182v.e.a(nVarC);
            this.f33499m = p0();
            this.f33477E = new S1.b(executorF, scheduledExecutorServiceE, handler, c2957m1, y8.o(), p190w.e.c());
            this.f33510x = p198x.c.a(y8.o());
            this.f33511y = y8.o().a(LegacyCameraSurfaceCleanupQuirk.class);
            e eVar = new e(str);
            this.f33505s = eVar;
            f fVar = new f();
            this.f33506t = fVar;
            c0970b0.g(this, executorF, fVar, eVar);
            tVar.g(executorF, eVar);
            this.f33485Y = new R1(context, str, tVar, new a(), D.a.f1667b);
        } catch (p174u.e e8) {
            throw Y0.a(e8);
        }
    }

    public static /* synthetic */ void A(T t8, boolean z8) {
        t8.f33481I = z8;
        if (z8) {
            if (t8.f33491e == i.PENDING_OPEN || t8.f33491e == i.OPENING_WITH_ERROR) {
                t8.K0(false);
            }
        }
    }

    public static /* synthetic */ void D(T t8, String str, c1 c1Var, u1 u1Var, g1 g1Var, List list) {
        t8.getClass();
        t8.Z("Use case " + str + " ACTIVE");
        t8.f33487a.q(str, c1Var, u1Var, g1Var, list);
        t8.f33487a.u(str, c1Var, u1Var, g1Var, list);
        t8.M0();
    }

    public static /* synthetic */ void E(T t8, String str, c1 c1Var, u1 u1Var, g1 g1Var, List list) {
        t8.getClass();
        t8.Z("Use case " + str + " RESET");
        t8.f33487a.u(str, c1Var, u1Var, g1Var, list);
        t8.S();
        t8.A0(false);
        t8.M0();
        if (t8.f33491e == i.OPENED) {
            t8.u0();
        }
    }

    public static /* synthetic */ Object F(final T t8, final F1.c.a aVar) {
        t8.f33489c.execute(new Runnable() { // from class: t.D
            @Override // java.lang.Runnable
            public final void run() {
                K.n.t(this.f33320a.x0(), aVar);
            }
        });
        return "Release[request=" + t8.f33500n.getAndIncrement() + "]";
    }

    public static /* synthetic */ void H(T t8) {
        t8.Z("Camera is removed. Updating state and cleaning up.");
        i iVar = t8.f33491e;
        i iVar2 = i.RELEASING;
        if (iVar == iVar2 || t8.f33491e == i.RELEASED) {
            return;
        }
        AbstractC0902w.a aVarA = AbstractC0902w.a.a(8);
        t8.f33493g.c(J.a.CLOSED, aVarA);
        t8.D0(iVar2, aVarA);
        t8.f33495i.a();
        t8.f33486Z.a();
        if (t8.f33497k != null) {
            t8.U(false);
        } else {
            t8.c0();
        }
    }

    public static /* synthetic */ void J(T t8, List list) {
        t8.getClass();
        try {
            t8.I0(list);
        } finally {
            t8.f33494h.v();
        }
    }

    public static List e0(T0 t8) {
        if (t8.i() == null) {
            return null;
        }
        return U.g.n0(t8);
    }

    public static String g0(K1 k8) {
        return k8.f() + k8.hashCode();
    }

    public static String i0(T0 t8) {
        return t8.r() + t8.hashCode();
    }

    public static /* synthetic */ Object s(T t8, F1.c.a aVar) {
        t8.getClass();
        try {
            ArrayList arrayList = new ArrayList(t8.f33487a.g().c().c());
            arrayList.add(t8.f33476D.c());
            arrayList.add(t8.new b(aVar));
            t8.f33488b.f(t8.f33496j.e(), t8.f33489c, U0.a(arrayList));
            return "configAndCloseTask";
        } catch (RuntimeException | p174u.e e8) {
            t8.a0("Unable to open camera for configAndClose: " + e8.getMessage(), e8);
            aVar.f(e8);
            return "configAndCloseTask";
        }
    }

    public static /* synthetic */ Object t(final T t8, final F1.c.a aVar) {
        t8.getClass();
        try {
            t8.f33489c.execute(new Runnable() { // from class: t.I
                @Override // java.lang.Runnable
                public final void run() {
                    aVar.c(Boolean.valueOf(this.f33351a.k0()));
                }
            });
            return "isMeteringRepeatingAttached";
        } catch (RejectedExecutionException unused) {
            aVar.f(new RuntimeException("Unable to check if MeteringRepeating is attached. Camera executor shut down."));
            return "isMeteringRepeatingAttached";
        }
    }

    public static /* synthetic */ void u(T t8) {
        if (t8.j0()) {
            t8.B0(g0(t8.f33475C), t8.f33475C.h(), t8.f33475C.i(), null, Collections.singletonList(v1.b.METERING_REPEATING));
        }
    }

    public static /* synthetic */ void v(T t8) {
        t8.f33473A = false;
        t8.f33512z = false;
        t8.Z("OpenCameraConfigAndClose is done, state: " + t8.f33491e);
        int iOrdinal = t8.f33491e.ordinal();
        if (iOrdinal == 1 || iOrdinal == 5) {
            T1.f.i(t8.n0());
            t8.c0();
            return;
        }
        if (iOrdinal != 7) {
            t8.Z("OpenCameraConfigAndClose finished while in state: " + t8.f33491e);
            return;
        }
        if (t8.f33498l == 0) {
            t8.L0(false);
            return;
        }
        t8.Z("OpenCameraConfigAndClose in error: " + f0(t8.f33498l));
        t8.f33495i.e();
    }

    public static /* synthetic */ void w(Surface surface, SurfaceTexture surfaceTexture) {
        surface.release();
        surfaceTexture.release();
    }

    public static /* synthetic */ void x(T t8, String str) {
        t8.getClass();
        t8.Z("Use case " + str + " INACTIVE");
        t8.f33487a.t(str);
        t8.M0();
    }

    public static /* synthetic */ void y(T t8, String str, c1 c1Var, u1 u1Var, g1 g1Var, List list) {
        t8.getClass();
        t8.Z("Use case " + str + " UPDATED");
        t8.f33487a.u(str, c1Var, u1Var, g1Var, list);
        t8.M0();
    }

    public static /* synthetic */ Y4.a z(C2945i1 c2945i1, AbstractC0994n0 abstractC0994n0, Void r8) {
        c2945i1.close();
        abstractC0994n0.d();
        return c2945i1.d(false);
    }

    public void A0(boolean z8) {
        T1.f.i(this.f33499m != null);
        Z("Resetting Capture Session");
        InterfaceC2948j1 interfaceC2948j1 = this.f33499m;
        c1 c1VarG = interfaceC2948j1.g();
        List listE = interfaceC2948j1.e();
        InterfaceC2948j1 interfaceC2948j1P0 = p0();
        this.f33499m = interfaceC2948j1P0;
        interfaceC2948j1P0.a(c1VarG);
        this.f33499m.f(listE);
        if (this.f33491e.ordinal() != 9) {
            Z("Skipping Capture Session state check due to current camera state: " + this.f33491e + " and previous session status: " + interfaceC2948j1.h());
        } else if (this.f33510x && interfaceC2948j1.h()) {
            Z("Close camera before creating new session");
            C0(i.f33536g);
        }
        if (this.f33511y && interfaceC2948j1.h()) {
            Z("ConfigAndClose is required when close the camera.");
            this.f33512z = true;
        }
        y0(interfaceC2948j1, z8);
    }

    public final void B0(final String str, final c1 c1Var, final u1 u1Var, final g1 g1Var, final List list) {
        this.f33489c.execute(new Runnable() { // from class: t.Q
            @Override // java.lang.Runnable
            public final void run() {
                T.E(this.f33415a, str, c1Var, u1Var, g1Var, list);
            }
        });
    }

    public void C0(i iVar) {
        D0(iVar, null);
    }

    public void D0(i iVar, AbstractC0902w.a aVar) {
        E0(iVar, aVar, true);
    }

    public void E0(i iVar, AbstractC0902w.a aVar, boolean z8) {
        J.a aVar2;
        Z("Transitioning camera internal state: " + this.f33491e + " --> " + iVar);
        H0(iVar, aVar);
        this.f33491e = iVar;
        switch (iVar) {
            case RELEASED:
                aVar2 = J.a.RELEASED;
                break;
            case RELEASING:
                aVar2 = J.a.RELEASING;
                break;
            case INITIALIZED:
                aVar2 = J.a.CLOSED;
                break;
            case PENDING_OPEN:
                aVar2 = J.a.PENDING_OPEN;
                break;
            case OPENING_WITH_ERROR:
            case CLOSING:
            case f33536g:
                aVar2 = J.a.CLOSING;
                break;
            case REOPENING:
            case OPENING:
                aVar2 = J.a.OPENING;
                break;
            case OPENED:
                aVar2 = J.a.OPEN;
                break;
            case CONFIGURED:
                aVar2 = J.a.CONFIGURED;
                break;
            default:
                throw new IllegalStateException("Unknown state: " + iVar);
        }
        this.f33508v.e(this, aVar2, z8);
        this.f33492f.m(aVar2);
        this.f33493g.c(aVar2, aVar);
    }

    public void F0(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            C0980g0 c0980g0 = (C0980g0) it.next();
            C0980g0.a aVarJ = C0980g0.a.j(c0980g0);
            if (c0980g0.k() == 5 && c0980g0.d() != null) {
                aVarJ.n(c0980g0.d());
            }
            if (!c0980g0.i().isEmpty() || !c0980g0.m() || T(aVarJ)) {
                arrayList.add(aVarJ.h());
            }
        }
        Z("Issue capture request");
        this.f33499m.f(arrayList);
    }

    public final Collection G0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(k.b((T0) it.next(), this.f33474B));
        }
        return arrayList;
    }

    public void H0(i iVar, AbstractC0902w.a aVar) {
        if (E2.a.d()) {
            E2.a.f("CX:C2State[" + this + "]", iVar.ordinal());
            if (aVar != null) {
                this.f33504r++;
            }
            if (this.f33504r > 0) {
                E2.a.f("CX:C2StateErrorCode[" + this + "]", aVar != null ? aVar.d() : 0);
            }
        }
    }

    public final void I0(Collection collection) {
        Size sizeF;
        boolean zIsEmpty = this.f33487a.h().isEmpty();
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        Rational rational = null;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (!this.f33487a.o(kVar.h())) {
                this.f33487a.r(kVar.h(), kVar.d(), kVar.g(), kVar.e(), kVar.c());
                arrayList.add(kVar.h());
                if (kVar.i() == C0903w0.class && (sizeF = kVar.f()) != null) {
                    rational = new Rational(sizeF.getWidth(), sizeF.getHeight());
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Z("Use cases [" + TextUtils.join(", ", arrayList) + "] now ATTACHED");
        if (zIsEmpty) {
            this.f33494h.X(true);
            this.f33494h.M();
        }
        S();
        O0();
        N0();
        M0();
        A0(false);
        if (this.f33491e == i.OPENED) {
            u0();
        } else {
            v0();
        }
        if (rational != null) {
            this.f33494h.a0(rational);
        }
    }

    public final void J0(Collection collection) {
        ArrayList arrayList = new ArrayList();
        Iterator it = collection.iterator();
        boolean z8 = false;
        while (it.hasNext()) {
            k kVar = (k) it.next();
            if (this.f33487a.o(kVar.h())) {
                this.f33487a.p(kVar.h());
                arrayList.add(kVar.h());
                if (kVar.i() == C0903w0.class) {
                    z8 = true;
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        Z("Use cases [" + TextUtils.join(", ", arrayList) + "] now DETACHED for camera");
        if (z8) {
            this.f33494h.a0(null);
        }
        S();
        if (this.f33487a.i().isEmpty()) {
            this.f33494h.c0(false);
            this.f33494h.Z(false);
        } else {
            O0();
            N0();
        }
        if (this.f33487a.h().isEmpty()) {
            this.f33494h.v();
            A0(false);
            this.f33494h.X(false);
            this.f33499m = p0();
            V();
            return;
        }
        M0();
        A0(false);
        if (this.f33491e == i.OPENED) {
            u0();
        }
    }

    public void K0(boolean z8) {
        Z("Attempting to force open the camera.");
        if (this.f33508v.i(this)) {
            t0(z8);
        } else {
            Z("No cameras available. Waiting for available camera before opening camera.");
            C0(i.PENDING_OPEN);
        }
    }

    public void L0(boolean z8) {
        Z("Attempting to open the camera.");
        if (this.f33505s.b() && this.f33508v.i(this)) {
            t0(z8);
        } else {
            Z("No cameras available. Waiting for available camera before opening camera.");
            C0(i.PENDING_OPEN);
        }
    }

    public void M0() {
        c1.h hVarE = this.f33487a.e();
        if (!hVarE.f()) {
            this.f33494h.W();
            this.f33499m.a(this.f33494h.C());
            return;
        }
        this.f33494h.b0(hVarE.c().p());
        hVarE.b(this.f33494h.C());
        this.f33499m.a(hVarE.c());
    }

    public final void N0() {
        if (this.f33496j.x()) {
            c1.h hVarE = this.f33487a.e();
            if (hVarE.f()) {
                if (((Integer) hVarE.c().e().getUpper()).intValue() > 30) {
                    this.f33494h.Z(true);
                } else {
                    this.f33494h.Z(false);
                }
            }
        }
    }

    public final void O0() {
        Iterator it = this.f33487a.i().iterator();
        boolean zB = false;
        while (it.hasNext()) {
            zB |= ((u1) it.next()).B(false);
        }
        this.f33494h.c0(zB);
    }

    public final void R() {
        K1 k8 = this.f33475C;
        if (k8 != null) {
            String strG0 = g0(k8);
            t1 t1Var = this.f33487a;
            c1 c1VarH = this.f33475C.h();
            u1 u1VarI = this.f33475C.i();
            v1.b bVar = v1.b.METERING_REPEATING;
            t1Var.r(strG0, c1VarH, u1VarI, null, Collections.singletonList(bVar));
            this.f33487a.q(strG0, this.f33475C.h(), this.f33475C.i(), null, Collections.singletonList(bVar));
        }
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0066  */
    public final void S() {
        c1 c1VarC = this.f33487a.g().c();
        int size = c1VarC.k().i().size();
        int size2 = c1VarC.o().size();
        boolean z8 = false;
        if (k0()) {
            boolean z9 = size != 1 || size2 == 1;
            if (z9 || m0(this.f33475C)) {
                z0();
                if (z9) {
                    z8 = true;
                }
            } else {
                z8 = true;
            }
        } else if (size != 0 || size2 <= 0) {
            z8 = true;
        } else {
            if (this.f33475C == null) {
                this.f33475C = new K1(this.f33496j.u(), this.f33482V, new K1.c() { // from class: t.C
                    @Override // t.K1.c
                    public final void a() {
                        T.u(this.f33317a);
                    }
                });
            }
            if (!m0(this.f33475C)) {
                R();
                z8 = true;
            }
        }
        this.f33494h.Y(z8);
        if (z8) {
            return;
        }
        AbstractC0890p0.c("Camera2CameraImpl", "The repeating surface is missing, CameraControl and ImageCapture may encounter issues due to the absence of repeating surface. Please add a UseCase (Preview or ImageAnalysis) that can provide a repeating surface for CameraControl and ImageCapture to function properly.");
    }

    public final boolean T(C0980g0.a aVar) {
        if (!aVar.l().isEmpty()) {
            AbstractC0890p0.l("Camera2CameraImpl", "The capture config builder already has surface inside.");
            return false;
        }
        Iterator it = this.f33487a.f().iterator();
        while (it.hasNext()) {
            C0980g0 c0980g0K = ((c1) it.next()).k();
            List listI = c0980g0K.i();
            if (!listI.isEmpty()) {
                if (c0980g0K.h() != 0) {
                    aVar.s(c0980g0K.h());
                }
                if (c0980g0K.l() != 0) {
                    aVar.v(c0980g0K.l());
                }
                Iterator it2 = listI.iterator();
                while (it2.hasNext()) {
                    aVar.f((AbstractC0994n0) it2.next());
                }
            }
        }
        if (!aVar.l().isEmpty()) {
            return true;
        }
        AbstractC0890p0.l("Camera2CameraImpl", "Unable to find a repeating surface to attach to CaptureConfig");
        return false;
    }

    public void U(boolean z8) {
        T1.f.j(this.f33491e == i.CLOSING || this.f33491e == i.RELEASING || (this.f33491e == i.REOPENING && this.f33498l != 0), "closeCamera should only be called in a CLOSING, RELEASING or REOPENING (with error) state. Current state: " + this.f33491e + " (error: " + f0(this.f33498l) + ")");
        A0(z8);
        this.f33499m.b();
    }

    public final void V() {
        Z("Closing camera.");
        boolean z8 = true;
        switch (this.f33491e.ordinal()) {
            case 3:
            case 4:
                T1.f.i(this.f33497k == null);
                C0(i.INITIALIZED);
                break;
            case 5:
            default:
                Z("close() ignored due to being in state: " + this.f33491e);
                break;
            case 6:
            case 7:
            case 8:
                if (!this.f33495i.a() && !this.f33486Z.c()) {
                    z8 = false;
                }
                this.f33486Z.a();
                C0(i.CLOSING);
                if (z8) {
                    T1.f.i(n0());
                    X();
                }
                break;
            case 9:
            case 10:
                C0(i.CLOSING);
                U(false);
                break;
        }
    }

    public final Y4.a W(CameraDevice cameraDevice) {
        final C2945i1 c2945i1 = new C2945i1(this.f33484X);
        final SurfaceTexture surfaceTexture = new SurfaceTexture(0);
        surfaceTexture.setDefaultBufferSize(640, 480);
        final Surface surface = new Surface(surfaceTexture);
        final B0 b8 = new B0(surface);
        b8.k().a(new Runnable() { // from class: t.G
            @Override // java.lang.Runnable
            public final void run() {
                T.w(surface, surfaceTexture);
            }
        }, J.a.a());
        c1.b bVar = new c1.b();
        bVar.h(b8);
        bVar.y(1);
        Z("Start configAndClose.");
        return K.d.b(K.n.z(c2945i1.c(bVar.p(), cameraDevice, this.f33477E.a()))).f(new K.a() { // from class: t.H
            @Override // K.a
            public final a apply(Object obj) {
                return T.z(c2945i1, b8, (Void) obj);
            }
        }, this.f33489c);
    }

    public final void X() {
        T1.f.i(this.f33491e == i.RELEASING || this.f33491e == i.CLOSING);
        T1.f.i(this.f33503q.isEmpty());
        if (!this.f33512z) {
            c0();
            return;
        }
        if (this.f33473A) {
            Z("Ignored since configAndClose is processing");
            return;
        }
        if (!this.f33505s.b()) {
            this.f33512z = false;
            c0();
            Z("Ignore configAndClose and finish the close flow directly since camera is unavailable.");
        } else {
            Z("Open camera to configAndClose");
            Y4.a aVarS0 = s0();
            this.f33473A = true;
            aVarS0.a(new Runnable() { // from class: t.z
                @Override // java.lang.Runnable
                public final void run() {
                    T.v(this.f33966a);
                }
            }, this.f33489c);
        }
    }

    public final CameraDevice.StateCallback Y() {
        ArrayList arrayList = new ArrayList(this.f33487a.g().c().c());
        arrayList.add(this.f33476D.c());
        arrayList.add(this.f33495i);
        return U0.a(arrayList);
    }

    public void Z(String str) {
        a0(str, null);
    }

    @Override // H.J
    public Y4.a a() {
        return F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.N
            @Override // F1.c.InterfaceC0112c
            public final Object a(c.a aVar) {
                return T.F(this.f33396a, aVar);
            }
        });
    }

    public final void a0(String str, Throwable th) {
        AbstractC0890p0.b("Camera2CameraImpl", String.format("{%s} %s", toString(), str), th);
    }

    @Override // H.J
    public R0 b() {
        return this.f33492f;
    }

    public c1 b0(AbstractC0994n0 abstractC0994n0) {
        for (c1 c1Var : this.f33487a.h()) {
            if (c1Var.o().contains(abstractC0994n0)) {
                return c1Var;
            }
        }
        return null;
    }

    public void c0() {
        T1.f.i(this.f33491e == i.RELEASING || this.f33491e == i.CLOSING);
        T1.f.i(this.f33503q.isEmpty());
        this.f33497k = null;
        if (this.f33491e == i.CLOSING) {
            C0(i.INITIALIZED);
            return;
        }
        this.f33488b.h(this.f33505s);
        C0(i.RELEASED);
        F1.c.a aVar = this.f33502p;
        if (aVar != null) {
            aVar.c(null);
            this.f33502p = null;
        }
    }

    @Override // A.T0.c
    public void d(T0 t8) {
        T1.f.g(t8);
        final String strI0 = i0(t8);
        this.f33489c.execute(new Runnable() { // from class: t.L
            @Override // java.lang.Runnable
            public final void run() {
                T.x(this.f33378a, strI0);
            }
        });
    }

    public final int d0() {
        synchronized (this.f33480H) {
            try {
                return this.f33507u.c() == 2 ? 1 : 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A.T0.c
    public void f(T0 t8) {
        T1.f.g(t8);
        B0(i0(t8), this.f33474B ? t8.z() : t8.x(), t8.l(), t8.g(), e0(t8));
    }

    @Override // H.J
    public F g() {
        return this.f33494h;
    }

    @Override // H.J
    public B h() {
        return this.f33479G;
    }

    public final Y4.a h0() {
        if (this.f33501o == null) {
            if (this.f33491e != i.RELEASED) {
                this.f33501o = F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.E
                    @Override // F1.c.InterfaceC0112c
                    public final Object a(c.a aVar) {
                        return T.K(this.f33328a, aVar);
                    }
                });
            } else {
                this.f33501o = K.n.p(null);
            }
        }
        return this.f33501o;
    }

    @Override // A.T0.c
    public void i(T0 t8) {
        T1.f.g(t8);
        final String strI0 = i0(t8);
        final c1 c1VarZ = this.f33474B ? t8.z() : t8.x();
        final u1 u1VarL = t8.l();
        final g1 g1VarG = t8.g();
        final List listE0 = e0(t8);
        this.f33489c.execute(new Runnable() { // from class: t.K
            @Override // java.lang.Runnable
            public final void run() {
                T.y(this.f33356a, strI0, c1VarZ, u1VarL, g1VarG, listE0);
            }
        });
    }

    @Override // A.T0.c
    public void j(T0 t8) {
        T1.f.g(t8);
        final String strI0 = i0(t8);
        final c1 c1VarZ = this.f33474B ? t8.z() : t8.x();
        final u1 u1VarL = t8.l();
        final g1 g1VarG = t8.g();
        final List listE0 = e0(t8);
        this.f33489c.execute(new Runnable() { // from class: t.M
            @Override // java.lang.Runnable
            public final void run() {
                T.D(this.f33387a, strI0, c1VarZ, u1VarL, g1VarG, listE0);
            }
        });
    }

    public boolean j0() {
        try {
            return ((Boolean) F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.F
                @Override // F1.c.InterfaceC0112c
                public final Object a(c.a aVar) {
                    return T.t(this.f33332a, aVar);
                }
            }).get()).booleanValue();
        } catch (InterruptedException | ExecutionException e8) {
            throw new RuntimeException("Unable to check if MeteringRepeating is attached.", e8);
        }
    }

    @Override // H.J
    public void k(B b8) {
        if (b8 == null) {
            b8 = E.a();
        }
        b8.M(null);
        this.f33479G = b8;
        synchronized (this.f33480H) {
        }
    }

    public final boolean k0() {
        K1 k8 = this.f33475C;
        if (k8 == null) {
            return false;
        }
        return this.f33487a.o(g0(k8));
    }

    @Override // H.J
    public void l(final boolean z8) {
        this.f33489c.execute(new Runnable() { // from class: t.S
            @Override // java.lang.Runnable
            public final void run() {
                T.A(this.f33463a, z8);
            }
        });
    }

    public final boolean l0() {
        G g8 = this.f33509w;
        return (g8 == null || g8.p0()) ? false : true;
    }

    @Override // H.J
    public void m(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        this.f33494h.M();
        q0(new ArrayList(arrayList));
        final ArrayList arrayList2 = new ArrayList(G0(arrayList));
        try {
            this.f33489c.execute(new Runnable() { // from class: t.J
                @Override // java.lang.Runnable
                public final void run() {
                    T.J(this.f33354a, arrayList2);
                }
            });
        } catch (RejectedExecutionException e8) {
            a0("Unable to attach use cases.", e8);
            this.f33494h.v();
        }
    }

    public final boolean m0(K1 k8) {
        T1.f.g(k8);
        return !o0(k8) || l0();
    }

    @Override // H.J
    public void n(Collection collection) {
        ArrayList arrayList = new ArrayList(collection);
        if (arrayList.isEmpty()) {
            return;
        }
        final ArrayList arrayList2 = new ArrayList(G0(arrayList));
        r0(new ArrayList(arrayList));
        this.f33489c.execute(new Runnable() { // from class: t.P
            @Override // java.lang.Runnable
            public final void run() {
                this.f33406a.J0(arrayList2);
            }
        });
    }

    public boolean n0() {
        return this.f33503q.isEmpty();
    }

    @Override // H.J
    public void o() {
        this.f33489c.execute(new Runnable() { // from class: t.A
            @Override // java.lang.Runnable
            public final void run() {
                T.H(this.f33310a);
            }
        });
    }

    public final boolean o0(K1 k8) {
        ArrayList arrayList = new ArrayList();
        int iD0 = d0();
        for (t1.b bVar : this.f33487a.j()) {
            if (bVar.c() == null || bVar.c().get(0) != v1.b.METERING_REPEATING) {
                if (bVar.e() == null || bVar.c() == null) {
                    AbstractC0890p0.l("Camera2CameraImpl", "Invalid stream spec or capture types in " + bVar);
                    return false;
                }
                c1 c1VarD = bVar.d();
                u1 u1VarF = bVar.f();
                for (AbstractC0994n0 abstractC0994n0 : c1VarD.o()) {
                    arrayList.add(AbstractC0977f.a(this.f33485Y.a0(iD0, u1VarF.u(), abstractC0994n0.h(), u1VarF.N()), u1VarF.u(), abstractC0994n0.h(), bVar.e().b(), bVar.c(), bVar.e().d(), bVar.e().g(), bVar.e().c(), u1VarF.X()));
                }
            }
        }
        T1.f.g(k8);
        HashMap map = new HashMap();
        map.put(k8.i(), Collections.singletonList(k8.e()));
        try {
            this.f33485Y.K(iD0, arrayList, map, false, false, false, false);
            Z("Surface combination with metering repeating supported!");
            return true;
        } catch (IllegalArgumentException e8) {
            a0("Surface combination with metering repeating  not supported!", e8);
            return false;
        }
    }

    public final InterfaceC2948j1 p0() {
        C2945i1 c2945i1;
        synchronized (this.f33480H) {
            G g8 = this.f33509w;
            if (g8 != null) {
                p214z.j.a(g8);
            }
            c2945i1 = new C2945i1(this.f33484X, this.f33496j.o(), null);
        }
        return c2945i1;
    }

    @Override // H.J
    public void q(boolean z8) {
        this.f33474B = z8;
    }

    public final void q0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            String strI0 = i0(t8);
            if (!this.f33478F.contains(strI0)) {
                this.f33478F.add(strI0);
                t8.P();
                t8.N();
            }
        }
    }

    @Override // H.J
    public I r() {
        return this.f33496j;
    }

    public final void r0(List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            T0 t8 = (T0) it.next();
            String strI0 = i0(t8);
            if (this.f33478F.contains(strI0)) {
                t8.Q();
                this.f33478F.remove(strI0);
            }
        }
    }

    public final Y4.a s0() {
        return F1.c.a(new F1.c.InterfaceC0112c() { // from class: t.B
            @Override // F1.c.InterfaceC0112c
            public final Object a(c.a aVar) {
                return T.s(this.f33314a, aVar);
            }
        });
    }

    public final void t0(boolean z8) {
        if (!z8) {
            this.f33495i.d();
        }
        this.f33495i.a();
        this.f33486Z.a();
        Z("Opening camera.");
        C0(i.OPENING);
        try {
            this.f33488b.f(this.f33496j.e(), this.f33489c, Y());
        } catch (SecurityException e8) {
            Z("Unable to open camera due to " + e8.getMessage());
            C0(i.REOPENING);
            this.f33495i.e();
        } catch (RuntimeException e9) {
            a0("Unexpected error occurred when opening camera.", e9);
            D0(i.OPENING_WITH_ERROR, AbstractC0902w.a.a(6));
        } catch (p174u.e e10) {
            Z("Unable to open camera due to " + e10.getMessage());
            if (e10.d() != 10001) {
                this.f33486Z.d();
            } else {
                D0(i.INITIALIZED, AbstractC0902w.a.b(7, e10));
            }
        }
    }

    public String toString() {
        return String.format(Locale.US, "Camera@%x[id=%s]", Integer.valueOf(hashCode()), this.f33496j.e());
    }

    public void u0() {
        T1.f.i(this.f33491e == i.OPENED);
        c1.h hVarG = this.f33487a.g();
        if (!hVarG.f()) {
            Z("Unable to create capture session due to conflicting configurations");
            return;
        }
        if (!this.f33508v.j(this.f33497k.getId(), this.f33507u.g(this.f33497k.getId()))) {
            Z("Unable to create capture session in camera operating mode = " + this.f33507u.c());
            return;
        }
        HashMap map = new HashMap();
        N1.m(this.f33487a.h(), this.f33487a.i(), map);
        this.f33499m.i(map);
        InterfaceC2948j1 interfaceC2948j1 = this.f33499m;
        K.n.j(interfaceC2948j1.c(hVarG.c(), (CameraDevice) T1.f.g(this.f33497k), this.f33477E.a()), new d(interfaceC2948j1), this.f33489c);
    }

    public final void v0() {
        int iOrdinal = this.f33491e.ordinal();
        if (iOrdinal == 2 || iOrdinal == 3 || iOrdinal == 4) {
            K0(false);
            return;
        }
        if (iOrdinal != 5) {
            Z("open() ignored due to being in state: " + this.f33491e);
            return;
        }
        C0(i.REOPENING);
        if (n0() || this.f33473A || this.f33498l != 0) {
            return;
        }
        T1.f.j(this.f33497k != null, "Camera Device should be open if session close is not complete");
        C0(i.OPENED);
        u0();
    }

    public void w0(final c1 c1Var) {
        ScheduledExecutorService scheduledExecutorServiceD = J.a.d();
        final c1.d dVarD = c1Var.d();
        if (dVarD != null) {
            a0("Posting surface closed", new Throwable());
            scheduledExecutorServiceD.execute(new Runnable() { // from class: t.O
                @Override // java.lang.Runnable
                public final void run() {
                    dVarD.a(c1Var, c1.g.SESSION_ERROR_SURFACE_NEEDS_RESET);
                }
            });
        }
    }

    public final Y4.a x0() {
        Y4.a aVarH0 = h0();
        boolean z8 = true;
        switch (this.f33491e.ordinal()) {
            case 1:
            case 5:
            case 6:
            case 7:
            case 8:
                if (!this.f33495i.a() && !this.f33486Z.c()) {
                    z8 = false;
                }
                this.f33486Z.a();
                C0(i.RELEASING);
                if (z8) {
                    T1.f.i(n0());
                    X();
                }
                break;
            case 2:
            case 3:
            case 4:
                T1.f.i(this.f33497k == null);
                C0(i.RELEASING);
                T1.f.i(n0());
                X();
                break;
            case 9:
            case 10:
                C0(i.RELEASING);
                U(false);
                break;
            default:
                Z("release() ignored due to being in state: " + this.f33491e);
                break;
        }
        return aVarH0;
    }

    public Y4.a y0(InterfaceC2948j1 interfaceC2948j1, boolean z8) {
        interfaceC2948j1.close();
        Y4.a aVarD = interfaceC2948j1.d(z8);
        Z("Releasing session in state " + this.f33491e.name());
        this.f33503q.put(interfaceC2948j1, aVarD);
        K.n.j(aVarD, new c(interfaceC2948j1), J.a.a());
        return aVarD;
    }

    public final void z0() {
        if (this.f33475C != null) {
            this.f33487a.s(this.f33475C.f() + this.f33475C.hashCode());
            this.f33487a.t(this.f33475C.f() + this.f33475C.hashCode());
            this.f33475C.c();
            this.f33475C = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public a f33525a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final ScheduledFuture f33527a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final AtomicBoolean f33528b = new AtomicBoolean(false);

            public a() {
                this.f33527a = T.this.f33490d.schedule(new Runnable() { // from class: t.V
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33561a.d();
                    }
                }, 2000L, TimeUnit.MILLISECONDS);
            }

            public void c() {
                this.f33528b.set(true);
                this.f33527a.cancel(true);
            }

            public final void d() {
                if (this.f33528b.getAndSet(true)) {
                    return;
                }
                T.this.f33489c.execute(new Runnable() { // from class: t.W
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f33564a.e();
                    }
                });
            }

            public final void e() {
                if (T.this.f33491e == i.OPENING) {
                    T.this.Z("Camera onError timeout, reopen it.");
                    T.this.C0(i.REOPENING);
                    T.this.f33495i.e();
                } else {
                    T.this.Z("Camera skip reopen at state: " + T.this.f33491e);
                }
            }

            public boolean f() {
                return this.f33528b.get();
            }
        }

        public h() {
            this.f33525a = null;
        }

        public void a() {
            a aVar = this.f33525a;
            if (aVar != null) {
                aVar.c();
            }
            this.f33525a = null;
        }

        public void b() {
            T.this.Z("Camera receive onErrorCallback");
            a();
        }

        public boolean c() {
            a aVar = this.f33525a;
            return (aVar == null || aVar.f()) ? false : true;
        }

        public void d() {
            if (T.this.f33491e != i.OPENING) {
                T.this.Z("Don't need the onError timeout handler.");
                return;
            }
            T.this.Z("Camera waiting for onError.");
            a();
            this.f33525a = new a();
        }

        public /* synthetic */ h(T t8, a aVar) {
            this();
        }
    }

    public static /* synthetic */ Object K(T t8, F1.c.a aVar) {
        T1.f.j(t8.f33502p == null, "Camera can only be released once, so release completer should be null on creation.");
        t8.f33502p = aVar;
        return "Release[camera=" + t8 + LYdqVGvOGMNr.EXkwdT;
    }

    public static String f0(int i8) {
        if (i8 == 0) {
            return BpgIURjN.uTkRBPADbOwJHHs;
        }
        if (i8 == 1) {
            return "ERROR_CAMERA_IN_USE";
        }
        if (i8 == 2) {
            return "ERROR_MAX_CAMERAS_IN_USE";
        }
        if (i8 == 3) {
            return "ERROR_CAMERA_DISABLED";
        }
        if (i8 != 4) {
            return i8 != 5 ? "UNKNOWN ERROR" : "ERROR_CAMERA_SERVICE";
        }
        return "ERROR_CAMERA_DEVICE";
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements K.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2948j1 f33516a;

        public c(InterfaceC2948j1 interfaceC2948j1) {
            this.f33516a = interfaceC2948j1;
        }

        @Override // K.c
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(Void r8) {
            T.this.f33503q.remove(this.f33516a);
            int iOrdinal = T.this.f33491e.ordinal();
            if (iOrdinal != 1 && iOrdinal != 5) {
                if (iOrdinal != 6 && (iOrdinal != 7 || T.this.f33498l == 0)) {
                    return;
                } else {
                    T.this.Z("Camera reopen required. Checking if the current camera can be closed safely.");
                }
            }
            if (T.this.n0()) {
                T t8 = T.this;
                if (t8.f33497k != null) {
                    t8.Z("closing camera");
                    AbstractC3016a.a(T.this.f33497k);
                    T.this.f33497k = null;
                }
            }
        }

        @Override // K.c
        public void b(Throwable th) {
        }
    }
}
