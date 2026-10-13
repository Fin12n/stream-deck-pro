package A;

import G.C0965y;
import G.InterfaceC0964x;
import H.C0973d;
import H.C1013x0;
import H.InterfaceC0984i0;
import H.InterfaceC1015y0;
import H.InterfaceC1017z0;
import H.c1;
import H.e1;
import H.g1;
import H.h1;
import H.u1;
import H.v1;
import android.graphics.Bitmap;
import android.hardware.camera2.CameraCharacteristics;
import android.net.Uri;
import android.util.Log;
import android.util.Pair;
import android.util.Rational;
import android.util.Size;
import androidx.camera.core.internal.compat.quirk.SoftwareJpegEncodingPreferredQuirk;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: A.c0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0864c0 extends T0 {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final c f243D = new c();

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final O.b f244E = new O.b();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public G.X f245A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public c1.c f246B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final InterfaceC0964x f247C;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final H.A0.a f248r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int f249s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final AtomicReference f250t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final int f251u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f252v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public Rational f253w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public L.k f254x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public c1.b f255y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0965y f256z;

    /* JADX INFO: renamed from: A.c0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements InterfaceC0964x {
        public a() {
        }

        @Override // G.InterfaceC0964x
        public Y4.a a(List list) {
            return C0864c0.this.G0(list);
        }

        @Override // G.InterfaceC0964x
        public void b() {
            C0864c0.this.C0();
        }

        @Override // G.InterfaceC0964x
        public void c() {
            C0864c0.this.I0();
        }
    }

    /* JADX INFO: renamed from: A.c0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements u1.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final H.O0 f258a;

        public b() {
            this(H.O0.i0());
        }

        public static b d(InterfaceC0984i0 interfaceC0984i0) {
            return new b(H.O0.j0(interfaceC0984i0));
        }

        @Override // A.K
        public H.N0 a() {
            return this.f258a;
        }

        public C0864c0 c() {
            Integer num = (Integer) a().f(C1013x0.f3272T, null);
            if (num != null) {
                a().L(InterfaceC1015y0.f3283j, num);
            } else if (C0864c0.x0(a())) {
                a().L(InterfaceC1015y0.f3283j, 32);
            } else if (C0864c0.y0(a())) {
                a().L(InterfaceC1015y0.f3283j, 32);
                a().L(InterfaceC1015y0.f3284k, 256);
            } else if (C0864c0.z0(a())) {
                a().L(InterfaceC1015y0.f3283j, 4101);
                a().L(InterfaceC1015y0.f3285l, J.f87c);
            } else {
                a().L(InterfaceC1015y0.f3283j, 256);
            }
            C1013x0 c1013x0B = b();
            InterfaceC1017z0.k(c1013x0B);
            C0864c0 c0864c0 = new C0864c0(c1013x0B);
            Size size = (Size) a().f(InterfaceC1017z0.f3290q, null);
            if (size != null) {
                c0864c0.D0(new Rational(size.getWidth(), size.getHeight()));
            }
            T1.f.h((Executor) a().f(L.i.f4771L, J.a.c()), "The IO executor can't be null");
            H.N0 n0A = a();
            InterfaceC0984i0.a aVar = C1013x0.f3270R;
            if (n0A.e(aVar)) {
                Integer num2 = (Integer) a().h(aVar);
                if (num2 == null || !(num2.intValue() == 0 || num2.intValue() == 1 || num2.intValue() == 3 || num2.intValue() == 2)) {
                    throw new IllegalArgumentException("The flash mode is not allowed to set: " + num2);
                }
                if (num2.intValue() == 3 && a().f(C1013x0.f3279a0, null) == null) {
                    throw new IllegalArgumentException("A ScreenFlash instance is required for FLASH_MODE_SCREEN but was not found. If value from PreviewView.getScreenFlash() is set to ImageCapture.setScreenFlash(), ensure PreviewView.setScreenFlashWindow() is invoked first.");
                }
            }
            return c0864c0;
        }

        @Override // H.u1.b
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public C1013x0 b() {
            return new C1013x0(H.T0.h0(this.f258a));
        }

        public b f(v1.b bVar) {
            a().L(u1.f3222G, bVar);
            return this;
        }

        public b g(J j8) {
            a().L(InterfaceC1015y0.f3285l, j8);
            return this;
        }

        public b h(int i8) {
            a().L(C1013x0.f3273U, Integer.valueOf(i8));
            return this;
        }

        public b i(T.c cVar) {
            a().L(InterfaceC1017z0.f3294u, cVar);
            return this;
        }

        public b j(h1 h1Var) {
            a().L(u1.f3226K, h1Var);
            return this;
        }

        public b k(int i8) {
            a().L(u1.f3216A, Integer.valueOf(i8));
            return this;
        }

        public b l(int i8) {
            if (i8 == -1) {
                i8 = 0;
            }
            a().L(InterfaceC1017z0.f3286m, Integer.valueOf(i8));
            return this;
        }

        public b m(Class cls) {
            a().L(L.q.f4795N, cls);
            if (a().f(L.q.f4794M, null) == null) {
                n(cls.getCanonicalName() + "-" + UUID.randomUUID());
            }
            return this;
        }

        public b n(String str) {
            a().L(L.q.f4794M, str);
            return this;
        }

        public b(H.O0 o8) {
            this.f258a = o8;
            Class cls = (Class) o8.f(L.q.f4795N, null);
            if (cls == null || cls.equals(C0864c0.class)) {
                f(v1.b.IMAGE_CAPTURE);
                m(C0864c0.class);
                return;
            }
            throw new IllegalArgumentException("Invalid target class configuration for " + this + ": " + cls);
        }
    }

    /* JADX INFO: renamed from: A.c0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h1 f259a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final T.c f260b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static final C1013x0 f261c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final J f262d;

        static {
            h1 h1Var = h1.STILL_CAPTURE;
            f259a = h1Var;
            T.c cVarA = new T.c.a().d(T.a.f9781c).f(T.d.f9793c).a();
            f260b = cVarA;
            J j8 = J.f88d;
            f262d = j8;
            f261c = new b().k(4).j(h1Var).l(0).i(cVarA).h(0).g(j8).b();
        }

        public C1013x0 a() {
            return f261c;
        }
    }

    /* JADX INFO: renamed from: A.c0$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d implements InterfaceC0866d0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC0896t f263a;

        public d(InterfaceC0896t interfaceC0896t) {
            this.f263a = interfaceC0896t;
        }

        @Override // A.InterfaceC0866d0
        public Set a() {
            Set setB = b();
            if (setB != null) {
                return setB;
            }
            HashSet hashSet = new HashSet();
            hashSet.add(0);
            if (d()) {
                hashSet.add(1);
            }
            if (c()) {
                hashSet.add(2);
                hashSet.add(3);
            }
            return hashSet;
        }

        public final Set b() {
            InterfaceC0896t interfaceC0896t = this.f263a;
            HashSet hashSet = null;
            if (!(interfaceC0896t instanceof C0973d)) {
                return null;
            }
            InterfaceC0984i0 interfaceC0984i0A = ((C0973d) interfaceC0896t).t().j().a(v1.b.IMAGE_CAPTURE, 1);
            if (interfaceC0984i0A != null) {
                InterfaceC0984i0.a aVar = InterfaceC1017z0.f3293t;
                if (interfaceC0984i0A.e(aVar)) {
                    hashSet = new HashSet();
                    hashSet.add(0);
                    Iterator it = ((List) interfaceC0984i0A.h(aVar)).iterator();
                    while (it.hasNext()) {
                        if (((Integer) ((Pair) it.next()).first).intValue() == 4101) {
                            hashSet.add(1);
                            break;
                        }
                    }
                }
            }
            return hashSet;
        }

        public final boolean c() {
            InterfaceC0896t interfaceC0896t = this.f263a;
            if (!(interfaceC0896t instanceof H.I)) {
                return false;
            }
            H.I i8 = (H.I) interfaceC0896t;
            if (i8.s().contains(3)) {
                return i8.a().contains(32);
            }
            return false;
        }

        public final boolean d() {
            InterfaceC0896t interfaceC0896t = this.f263a;
            if (interfaceC0896t instanceof H.I) {
                return ((H.I) interfaceC0896t).a().contains(4101);
            }
            return false;
        }
    }

    /* JADX INFO: renamed from: A.c0$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface f {
    }

    /* JADX INFO: renamed from: A.c0$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g {
    }

    /* JADX INFO: renamed from: A.c0$h */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class h {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Uri f264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final int f265b;

        public h(Uri uri) {
            this(uri, 256);
        }

        public h(Uri uri, int i8) {
            this.f264a = uri;
            this.f265b = i8;
        }
    }

    /* JADX INFO: renamed from: A.c0$i */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface i {
        void a(long j8, j jVar);

        void clear();
    }

    /* JADX INFO: renamed from: A.c0$j */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface j {
        void a();
    }

    public C0864c0(C1013x0 c1013x0) {
        super(c1013x0);
        this.f248r = new H.A0.a() { // from class: A.Z
            @Override // H.A0.a
            public final void a(H.A0 a8) {
                C0864c0.e0(a8);
            }
        };
        this.f250t = new AtomicReference(null);
        this.f252v = -1;
        this.f253w = null;
        this.f247C = new a();
        C1013x0 c1013x1 = (C1013x0) l();
        if (c1013x1.e(C1013x0.f3269Q)) {
            this.f249s = c1013x1.g0();
        } else {
            this.f249s = 1;
        }
        this.f251u = c1013x1.i0(0);
        this.f254x = L.k.g(c1013x1.l0());
    }

    public static /* synthetic */ void d0(C0864c0 c0864c0, c1 c1Var, c1.g gVar) {
        if (c0864c0.i() == null) {
            return;
        }
        c0864c0.f245A.i();
        c0864c0.n0(true);
        c1.b bVarO0 = c0864c0.o0(c0864c0.k(), (C1013x0) c0864c0.l(), (g1) T1.f.g(c0864c0.g()));
        c0864c0.f255y = bVarO0;
        c0864c0.a0(M.a(new Object[]{bVarO0.p()}));
        c0864c0.K();
        c0864c0.f245A.h();
    }

    public static /* synthetic */ void e0(H.A0 a8) {
        try {
            androidx.camera.core.d dVarH = a8.h();
            try {
                Log.d("ImageCapture", "Discarding ImageProxy which was inadvertently acquired: " + dVarH);
                if (dVarH != null) {
                    dVarH.close();
                }
            } catch (Throwable th) {
                if (dVarH != null) {
                    try {
                        dVarH.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                }
                throw th;
            }
        } catch (IllegalStateException e8) {
            Log.e("ImageCapture", "Failed to acquire latest image.", e8);
        }
    }

    public static /* synthetic */ Void f0(List list) {
        return null;
    }

    private void m0() {
        n0(false);
    }

    public static InterfaceC0866d0 t0(InterfaceC0896t interfaceC0896t) {
        return new d(interfaceC0896t);
    }

    public static boolean w0(List list, int i8) {
        if (list == null) {
            return false;
        }
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (((Integer) ((Pair) it.next()).first).equals(Integer.valueOf(i8))) {
                return true;
            }
        }
        return false;
    }

    public static boolean x0(H.N0 n8) {
        return Objects.equals(n8.f(C1013x0.f3273U, null), 2);
    }

    public static boolean y0(H.N0 n8) {
        return Objects.equals(n8.f(C1013x0.f3273U, null), 3);
    }

    public static boolean z0(H.N0 n8) {
        return Objects.equals(n8.f(C1013x0.f3273U, null), 1);
    }

    public boolean A0() {
        return ((Boolean) l().f(C1013x0.f3281c0, Boolean.FALSE)).booleanValue();
    }

    @Override // A.T0
    public Set B() {
        HashSet hashSet = new HashSet();
        hashSet.add(4);
        return hashSet;
    }

    public final boolean B0() {
        if (i() == null) {
            return false;
        }
        i().h().M(null);
        return false;
    }

    public void C0() {
        synchronized (this.f250t) {
            try {
                if (this.f250t.get() != null) {
                    return;
                }
                this.f250t.set(Integer.valueOf(s0()));
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A.T0
    public u1.b D(InterfaceC0984i0 interfaceC0984i0) {
        return b.d(interfaceC0984i0);
    }

    public void D0(Rational rational) {
        this.f253w = rational;
    }

    public final void E0() {
        F0(this.f254x);
    }

    public final void F0(i iVar) {
        j().g(iVar);
    }

    public Y4.a G0(List list) {
        I.w.b();
        return K.n.x(j().c(list, this.f249s, this.f251u), new p142q.a() { // from class: A.b0
            @Override // p142q.a
            public final Object apply(Object obj) {
                return C0864c0.f0((List) obj);
            }
        }, J.a.a());
    }

    public final void H0() {
        synchronized (this.f250t) {
            try {
                if (this.f250t.get() != null) {
                    return;
                }
                j().d(s0());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void I0() {
        synchronized (this.f250t) {
            try {
                Integer num = (Integer) this.f250t.getAndSet(null);
                if (num == null) {
                    return;
                }
                if (num.intValue() != s0()) {
                    H0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // A.T0
    public void M() {
        T1.f.h(i(), "Attached camera cannot be null");
        if (s0() == 3 && q0() != 0) {
            throw new IllegalArgumentException("Not a front camera despite setting FLASH_MODE_SCREEN in ImageCapture");
        }
    }

    @Override // A.T0
    public void N() {
        AbstractC0890p0.a("ImageCapture", "onCameraControlReady");
        H0();
        E0();
    }

    @Override // A.T0
    public u1 O(H.I i8, u1.b bVar) {
        k0(bVar);
        if (i8.o().a(SoftwareJpegEncodingPreferredQuirk.class)) {
            Boolean bool = Boolean.FALSE;
            H.N0 n0A = bVar.a();
            InterfaceC0984i0.a aVar = C1013x0.f3276X;
            Boolean bool2 = Boolean.TRUE;
            if (bool.equals(n0A.f(aVar, bool2))) {
                AbstractC0890p0.l("ImageCapture", "Device quirk suggests software JPEG encoder, but it has been explicitly disabled.");
            } else {
                AbstractC0890p0.e("ImageCapture", "Requesting software JPEG due to device quirk.");
                bVar.a().L(aVar, bool2);
            }
        }
        boolean zP0 = p0(bVar.a());
        Integer num = (Integer) bVar.a().f(C1013x0.f3272T, null);
        if (num != null) {
            T1.f.b(!B0() || num.intValue() == 256, "Cannot set non-JPEG buffer format with Extensions enabled.");
            bVar.a().L(InterfaceC1015y0.f3283j, Integer.valueOf(zP0 ? 35 : num.intValue()));
        } else if (x0(bVar.a())) {
            bVar.a().L(InterfaceC1015y0.f3283j, 32);
        } else if (y0(bVar.a())) {
            bVar.a().L(InterfaceC1015y0.f3283j, 32);
            bVar.a().L(InterfaceC1015y0.f3284k, 256);
        } else if (z0(bVar.a())) {
            bVar.a().L(InterfaceC1015y0.f3283j, 4101);
            bVar.a().L(InterfaceC1015y0.f3285l, J.f87c);
        } else if (zP0) {
            bVar.a().L(InterfaceC1015y0.f3283j, 35);
        } else {
            List list = (List) bVar.a().f(InterfaceC1017z0.f3293t, null);
            if (list == null || w0(list, 256)) {
                bVar.a().L(InterfaceC1015y0.f3283j, 256);
            } else if (w0(list, 35)) {
                bVar.a().L(InterfaceC1015y0.f3283j, 35);
            }
        }
        return bVar.b();
    }

    @Override // A.T0
    public void Q() {
        g0();
    }

    @Override // A.T0
    public g1 R(InterfaceC0984i0 interfaceC0984i0) {
        this.f255y.g(interfaceC0984i0);
        a0(M.a(new Object[]{this.f255y.p()}));
        return g().i().d(interfaceC0984i0).a();
    }

    @Override // A.T0
    public g1 S(g1 g1Var, g1 g1Var2) {
        AbstractC0890p0.a("ImageCapture", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + g1Var + ", secondaryStreamSpec " + g1Var2);
        c1.b bVarO0 = o0(k(), (C1013x0) l(), g1Var);
        this.f255y = bVarO0;
        a0(M.a(new Object[]{bVarO0.p()}));
        I();
        return g1Var;
    }

    @Override // A.T0
    public void T() {
        g0();
        m0();
        F0(null);
    }

    public final void g0() {
        this.f254x.f();
        G.X x8 = this.f245A;
        if (x8 != null) {
            x8.j();
        }
    }

    public final void k0(u1.b bVar) {
        Set<C.b> setO = o();
        if (setO != null) {
            int iF = 0;
            for (C.b bVar2 : setO) {
                if (bVar2 instanceof E.d) {
                    iF = ((E.d) bVar2).f();
                }
            }
            bVar.a().L(C1013x0.f3273U, Integer.valueOf(iF));
        }
    }

    public final G.F l0(int i8, Size size) {
        v0();
        return null;
    }

    @Override // A.T0
    public u1 m(boolean z8, v1 v1Var) {
        c cVar = f243D;
        InterfaceC0984i0 interfaceC0984i0A = v1Var.a(cVar.a().O(), r0());
        if (z8) {
            interfaceC0984i0A = InterfaceC0984i0.p(interfaceC0984i0A, cVar.a());
        }
        if (interfaceC0984i0A == null) {
            return null;
        }
        return D(interfaceC0984i0A).b();
    }

    public final void n0(boolean z8) {
        G.X x8;
        Log.d("ImageCapture", "clearPipeline");
        I.w.b();
        c1.c cVar = this.f246B;
        if (cVar != null) {
            cVar.b();
            this.f246B = null;
        }
        C0965y c0965y = this.f256z;
        if (c0965y != null) {
            c0965y.a();
            this.f256z = null;
        }
        if (!z8 && (x8 = this.f245A) != null) {
            x8.j();
            this.f245A = null;
        }
        j().a();
    }

    public final c1.b o0(String str, C1013x0 c1013x0, g1 g1Var) {
        I.w.b();
        Log.d("ImageCapture", String.format("createPipeline(cameraId: %s, streamSpec: %s)", str, g1Var));
        Size sizeF = g1Var.f();
        H.J jI = i();
        Objects.requireNonNull(jI);
        boolean z8 = !jI.p();
        if (this.f256z != null) {
            T1.f.i(z8);
            this.f256z.a();
        }
        Set setA = t0(i().c()).a();
        T1.f.b(setA.contains(Integer.valueOf(u0())), "The specified output format (" + u0() + ") is not supported by current configuration. Supported output formats: " + setA);
        CameraCharacteristics cameraCharacteristics = null;
        G.F fL0 = A0() ? l0(c1013x0.u(), sizeF) : null;
        if (i() != null) {
            try {
                Object objM = i().r().m();
                if (objM instanceof CameraCharacteristics) {
                    cameraCharacteristics = (CameraCharacteristics) objM;
                }
            } catch (Exception e8) {
                Log.e("ImageCapture", "getCameraCharacteristics failed", e8);
            }
        }
        CameraCharacteristics cameraCharacteristics2 = cameraCharacteristics;
        n();
        this.f256z = new C0965y(c1013x0, sizeF, cameraCharacteristics2, null, z8, fL0);
        if (this.f245A == null) {
            this.f245A = l().x().a(this.f247C);
        }
        this.f245A.k(this.f256z);
        c1.b bVarF = this.f256z.f(g1Var.f());
        bVarF.x(g1Var.g());
        if (r0() == 2 && !g1Var.h()) {
            j().b(bVarF);
        }
        if (g1Var.d() != null) {
            bVarF.g(g1Var.d());
        }
        c1.c cVar = this.f246B;
        if (cVar != null) {
            cVar.b();
        }
        c1.c cVar2 = new c1.c(new c1.d() { // from class: A.a0
            @Override // H.c1.d
            public final void a(c1 c1Var, c1.g gVar) {
                C0864c0.d0(this.f237a, c1Var, gVar);
            }
        });
        this.f246B = cVar2;
        bVarF.r(cVar2);
        return bVarF;
    }

    public boolean p0(H.N0 n8) {
        boolean z8;
        Boolean bool = Boolean.TRUE;
        InterfaceC0984i0.a aVar = C1013x0.f3276X;
        Boolean bool2 = Boolean.FALSE;
        boolean z9 = false;
        if (bool.equals(n8.f(aVar, bool2))) {
            if (B0()) {
                AbstractC0890p0.l("ImageCapture", "Software JPEG cannot be used with Extensions.");
                z8 = false;
            } else {
                z8 = true;
            }
            Integer num = (Integer) n8.f(C1013x0.f3272T, null);
            if (num == null || num.intValue() == 256) {
                z9 = z8;
            } else {
                AbstractC0890p0.l("ImageCapture", "Software JPEG cannot be used with non-JPEG output buffer format.");
            }
            if (!z9) {
                AbstractC0890p0.l("ImageCapture", "Unable to support software JPEG. Disabling.");
                n8.L(aVar, bool2);
            }
        }
        return z9;
    }

    public final int q0() {
        H.J jI = i();
        if (jI != null) {
            return jI.c().i();
        }
        return -1;
    }

    public int r0() {
        return this.f249s;
    }

    public int s0() {
        int iH0;
        synchronized (this.f250t) {
            iH0 = this.f252v;
            if (iH0 == -1) {
                iH0 = ((C1013x0) l()).h0(2);
            }
        }
        return iH0;
    }

    public String toString() {
        return "ImageCapture:" + r();
    }

    public int u0() {
        return ((Integer) T1.f.g((Integer) l().f(C1013x0.f3273U, 0))).intValue();
    }

    public final e1 v0() {
        i().h().M(null);
        return null;
    }

    /* JADX INFO: renamed from: A.c0$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class e {
        public void b() {
        }

        public void a(int i8) {
        }

        public void c(androidx.camera.core.d dVar) {
        }

        public void d(C0868e0 c0868e0) {
        }

        public void e(Bitmap bitmap) {
        }
    }
}
