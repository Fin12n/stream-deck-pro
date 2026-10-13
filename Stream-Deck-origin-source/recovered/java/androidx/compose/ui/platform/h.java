package androidx.compose.ui.platform;

import A1.n;
import A1.r;
import C6.G;
import Q0.m;
import Q6.k;
import Q6.o;
import R0.AbstractC1602n0;
import R0.B0;
import R0.C1588g0;
import R0.E;
import R0.H0;
import R0.InterfaceC1586f0;
import R0.N0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p056g1.g0;
import p065h1.C2387e0;
import p065h1.C2411q0;
import p065h1.C2420v0;
import p065h1.T0;
import p065h1.U0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class h extends View implements g0 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final c f14993p = new c(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f14994q = 8;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final o f14995r = b.f15016a;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final ViewOutlineProvider f14996s = new a();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static Method f14997t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static Field f14998u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static boolean f14999v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static boolean f15000w;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f15001a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2387e0 f15002b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public k f15003c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f15004d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2420v0 f15005e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f15006f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Rect f15007g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15008h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15009i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final C1588g0 f15010j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C2411q0 f15011k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public long f15012l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15013m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final long f15014n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15015o;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            t.e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.ViewLayer");
            Outline outlineD = ((h) view).f15005e.d();
            t.d(outlineD);
            outline.set(outlineD);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f15016a = new b();

        public b() {
            super(2);
        }

        public final void b(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((View) obj, (Matrix) obj2);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public final boolean a() {
            return h.f14999v;
        }

        public final boolean b() {
            return h.f15000w;
        }

        public final void c(boolean z8) {
            h.f15000w = z8;
        }

        public final void d(View view) {
            try {
                if (!a()) {
                    h.f14999v = true;
                    h.f14997t = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                    h.f14998u = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    Method method = h.f14997t;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = h.f14998u;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = h.f14998u;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = h.f14997t;
                if (method2 != null) {
                    method2.invoke(view, null);
                }
            } catch (Throwable unused) {
                c(true);
            }
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final d f15017a = new d();

        public static final long a(View view) {
            return view.getUniqueDrawingId();
        }
    }

    public h(AndroidComposeView androidComposeView, C2387e0 c2387e0, k kVar, Function0 function0) {
        super(androidComposeView.getContext());
        this.f15001a = androidComposeView;
        this.f15002b = c2387e0;
        this.f15003c = kVar;
        this.f15004d = function0;
        this.f15005e = new C2420v0(androidComposeView.getDensity());
        this.f15010j = new C1588g0();
        this.f15011k = new C2411q0(f14995r);
        this.f15012l = androidx.compose.ui.graphics.f.f14706b.a();
        this.f15013m = true;
        setWillNotDraw(false);
        c2387e0.addView(this);
        this.f15014n = View.generateViewId();
    }

    private final H0 getManualClipPath() {
        if (!getClipToOutline() || this.f15005e.e()) {
            return null;
        }
        return this.f15005e.c();
    }

    private final void setInvalidated(boolean z8) {
        if (z8 != this.f15008h) {
            this.f15008h = z8;
            this.f15001a.k0(this, z8);
        }
    }

    @Override // p056g1.g0
    public void a(float[] fArr) {
        B0.k(fArr, this.f15011k.b(this));
    }

    @Override // p056g1.g0
    public boolean b(long j8) {
        float fO = Q0.f.o(j8);
        float fP = Q0.f.p(j8);
        if (this.f15006f) {
            return 0.0f <= fO && fO < ((float) getWidth()) && 0.0f <= fP && fP < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f15005e.f(j8);
        }
        return true;
    }

    @Override // p056g1.g0
    public long c(long j8, boolean z8) {
        if (!z8) {
            return B0.f(this.f15011k.b(this), j8);
        }
        float[] fArrA = this.f15011k.a(this);
        return fArrA != null ? B0.f(fArrA, j8) : Q0.f.f9082b.a();
    }

    @Override // p056g1.g0
    public void d(long j8) {
        int iG = r.g(j8);
        int iF = r.f(j8);
        if (iG == getWidth() && iF == getHeight()) {
            return;
        }
        float f8 = iG;
        setPivotX(androidx.compose.ui.graphics.f.f(this.f15012l) * f8);
        float f9 = iF;
        setPivotY(androidx.compose.ui.graphics.f.g(this.f15012l) * f9);
        this.f15005e.i(m.a(f8, f9));
        w();
        layout(getLeft(), getTop(), getLeft() + iG, getTop() + iF);
        v();
        this.f15011k.c();
    }

    @Override // p056g1.g0
    public void destroy() {
        setInvalidated(false);
        this.f15001a.r0();
        this.f15003c = null;
        this.f15004d = null;
        this.f15001a.p0(this);
        this.f15002b.removeViewInLayout(this);
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        boolean z8;
        C1588g0 c1588g0 = this.f15010j;
        Canvas canvasA = c1588g0.a().a();
        c1588g0.a().z(canvas);
        E eA = c1588g0.a();
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z8 = false;
        } else {
            eA.k();
            this.f15005e.a(eA);
            z8 = true;
        }
        k kVar = this.f15003c;
        if (kVar != null) {
            kVar.invoke(eA);
        }
        if (z8) {
            eA.x();
        }
        c1588g0.a().z(canvasA);
        setInvalidated(false);
    }

    @Override // p056g1.g0
    public void e(androidx.compose.ui.graphics.d dVar, A1.t tVar, A1.d dVar2) {
        Function0 function0;
        int iM = dVar.m() | this.f15015o;
        if ((iM & 4096) != 0) {
            long jS0 = dVar.S0();
            this.f15012l = jS0;
            setPivotX(androidx.compose.ui.graphics.f.f(jS0) * getWidth());
            setPivotY(androidx.compose.ui.graphics.f.g(this.f15012l) * getHeight());
        }
        if ((iM & 1) != 0) {
            setScaleX(dVar.A());
        }
        if ((iM & 2) != 0) {
            setScaleY(dVar.m1());
        }
        if ((iM & 4) != 0) {
            setAlpha(dVar.c());
        }
        if ((iM & 8) != 0) {
            setTranslationX(dVar.P0());
        }
        if ((iM & 16) != 0) {
            setTranslationY(dVar.C0());
        }
        if ((iM & 32) != 0) {
            setElevation(dVar.o());
        }
        if ((iM & 1024) != 0) {
            setRotation(dVar.j0());
        }
        if ((iM & 256) != 0) {
            setRotationX(dVar.U0());
        }
        if ((iM & 512) != 0) {
            setRotationY(dVar.b0());
        }
        if ((iM & 2048) != 0) {
            setCameraDistancePx(dVar.N0());
        }
        boolean z8 = false;
        boolean z9 = getManualClipPath() != null;
        boolean z10 = dVar.f() && dVar.q() != N0.a();
        if ((iM & 24576) != 0) {
            this.f15006f = dVar.f() && dVar.q() == N0.a();
            v();
            setClipToOutline(z10);
        }
        boolean zH = this.f15005e.h(dVar.q(), dVar.c(), z10, dVar.o(), tVar, dVar2);
        if (this.f15005e.b()) {
            w();
        }
        boolean z11 = getManualClipPath() != null;
        if (z9 != z11 || (z11 && zH)) {
            invalidate();
        }
        if (!this.f15009i && getElevation() > 0.0f && (function0 = this.f15004d) != null) {
            function0.invoke();
        }
        if ((iM & 7963) != 0) {
            this.f15011k.c();
        }
        int i8 = Build.VERSION.SDK_INT;
        if ((iM & 64) != 0) {
            T0.f24163a.a(this, AbstractC1602n0.j(dVar.e()));
        }
        if ((iM & 128) != 0) {
            T0.f24163a.b(this, AbstractC1602n0.j(dVar.t()));
        }
        if (i8 >= 31 && (131072 & iM) != 0) {
            U0.f24164a.a(this, dVar.n());
        }
        if ((32768 & iM) != 0) {
            int iG = dVar.g();
            androidx.compose.ui.graphics.a.C0362a c0362a = androidx.compose.ui.graphics.a.f14661a;
            if (androidx.compose.ui.graphics.a.e(iG, c0362a.c())) {
                setLayerType(2, null);
            } else {
                if (androidx.compose.ui.graphics.a.e(iG, c0362a.b())) {
                    setLayerType(0, null);
                } else {
                    setLayerType(0, null);
                }
                this.f15013m = z8;
            }
            z8 = true;
            this.f15013m = z8;
        }
        this.f15015o = dVar.m();
    }

    @Override // p056g1.g0
    public void f(InterfaceC1586f0 interfaceC1586f0) {
        boolean z8 = getElevation() > 0.0f;
        this.f15009i = z8;
        if (z8) {
            interfaceC1586f0.y();
        }
        this.f15002b.a(interfaceC1586f0, this, getDrawingTime());
        if (this.f15009i) {
            interfaceC1586f0.l();
        }
    }

    @Override // p056g1.g0
    public void g(Q0.d dVar, boolean z8) {
        if (!z8) {
            B0.g(this.f15011k.b(this), dVar);
            return;
        }
        float[] fArrA = this.f15011k.a(this);
        if (fArrA != null) {
            B0.g(fArrA, dVar);
        } else {
            dVar.g(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    public final C2387e0 getContainer() {
        return this.f15002b;
    }

    public long getLayerId() {
        return this.f15014n;
    }

    public final AndroidComposeView getOwnerView() {
        return this.f15001a;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT >= 29) {
            return d.a(this.f15001a);
        }
        return -1L;
    }

    @Override // p056g1.g0
    public void h(float[] fArr) {
        float[] fArrA = this.f15011k.a(this);
        if (fArrA != null) {
            B0.k(fArr, fArrA);
        }
    }

    @Override // android.view.View
    public boolean hasOverlappingRendering() {
        return this.f15013m;
    }

    @Override // p056g1.g0
    public void i(long j8) {
        int iJ = n.j(j8);
        if (iJ != getLeft()) {
            offsetLeftAndRight(iJ - getLeft());
            this.f15011k.c();
        }
        int iK = n.k(j8);
        if (iK != getTop()) {
            offsetTopAndBottom(iK - getTop());
            this.f15011k.c();
        }
    }

    @Override // android.view.View, p056g1.g0
    public void invalidate() {
        if (this.f15008h) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.f15001a.invalidate();
    }

    @Override // p056g1.g0
    public void j() {
        if (!this.f15008h || f15000w) {
            return;
        }
        f14993p.d(this);
        setInvalidated(false);
    }

    @Override // p056g1.g0
    public void k(k kVar, Function0 function0) {
        this.f15002b.addView(this);
        this.f15006f = false;
        this.f15009i = false;
        this.f15012l = androidx.compose.ui.graphics.f.f14706b.a();
        this.f15003c = kVar;
        this.f15004d = function0;
    }

    public final void setCameraDistancePx(float f8) {
        setCameraDistance(f8 * getResources().getDisplayMetrics().densityDpi);
    }

    public final boolean u() {
        return this.f15008h;
    }

    public final void v() {
        Rect rect;
        if (this.f15006f) {
            Rect rect2 = this.f15007g;
            if (rect2 == null) {
                this.f15007g = new Rect(0, 0, getWidth(), getHeight());
            } else {
                t.d(rect2);
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f15007g;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void w() {
        setOutlineProvider(this.f15005e.d() != null ? f14996s : null);
    }

    @Override // android.view.View
    public void forceLayout() {
    }

    @Override // android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
    }
}
