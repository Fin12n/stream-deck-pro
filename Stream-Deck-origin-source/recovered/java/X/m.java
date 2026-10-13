package X;

import A.AbstractC0890p0;
import A.AbstractC0895s0;
import A.C0864c0;
import A.C0903w0;
import A.S0;
import A.V0;
import H.I;
import H.J;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.hardware.display.DisplayManager;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Rational;
import android.util.Size;
import android.view.Display;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.camera.view.internal.compat.quirk.SurfaceViewNotCroppedByParentQuirk;
import androidx.camera.view.internal.compat.quirk.SurfaceViewStretchedQuirk;
import androidx.lifecycle.AbstractC1737u;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import java.util.concurrent.atomic.AtomicReference;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m extends FrameLayout {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final c f11581o = c.PERFORMANCE;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public c f11582a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public n f11583b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final s f11584c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final f f11585d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f11586e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final androidx.lifecycle.x f11587f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final AtomicReference f11588g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public o f11589h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Y.a f11590i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public I f11591j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public MotionEvent f11592k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final b f11593l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final View.OnLayoutChangeListener f11594m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final C0903w0.c f11595n;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements C0903w0.c {
        public a() {
        }

        public static /* synthetic */ void c(a aVar, X.e eVar, J j8) {
            if (i.a(m.this.f11588g, eVar, null)) {
                eVar.i(e.IDLE);
            }
            eVar.f();
            j8.b().c(eVar);
        }

        public static /* synthetic */ void d(a aVar, J j8, S0 s8, S0.h hVar) {
            m mVar;
            n nVar;
            aVar.getClass();
            AbstractC0890p0.a("PreviewView", "Preview transformation info updated. " + hVar);
            m.this.f11585d.r(hVar, s8.p(), j8.r().i() == 0);
            if (hVar.d() == -1 || ((nVar = (mVar = m.this).f11583b) != null && (nVar instanceof w))) {
                m.this.f11586e = true;
            } else {
                mVar.f11586e = false;
            }
            m.this.d();
        }

        @Override // A.C0903w0.c
        public void a(final S0 s8) {
            n wVar;
            if (!I.w.d()) {
                I1.a.e(m.this.getContext()).execute(new Runnable() { // from class: X.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        m.this.f11595n.a(s8);
                    }
                });
                return;
            }
            AbstractC0890p0.a("PreviewView", "Surface requested by Preview.");
            final J jM = s8.m();
            m.this.f11591j = jM.r();
            m.this.f11589h.c(jM.r().h());
            s8.u(I1.a.e(m.this.getContext()), new S0.i() { // from class: X.k
                @Override // A.S0.i
                public final void a(S0.h hVar) {
                    m.a.d(this.f11575a, jM, s8, hVar);
                }
            });
            m mVar = m.this;
            if (!m.e(mVar.f11583b, s8, mVar.f11582a)) {
                m mVar2 = m.this;
                if (m.f(s8, mVar2.f11582a)) {
                    m mVar3 = m.this;
                    wVar = new D(mVar3, mVar3.f11585d);
                } else {
                    m mVar4 = m.this;
                    wVar = new w(mVar4, mVar4.f11585d);
                }
                mVar2.f11583b = wVar;
            }
            I iR = jM.r();
            m mVar5 = m.this;
            final X.e eVar = new X.e(iR, mVar5.f11587f, mVar5.f11583b);
            m.this.f11588g.set(eVar);
            jM.b().b(I1.a.e(m.this.getContext()), eVar);
            m.this.f11583b.g(s8, new n.a() { // from class: X.l
                @Override // X.n.a
                public final void a() {
                    m.a.c(this.f11578a, eVar, jM);
                }
            });
            m mVar6 = m.this;
            if (mVar6.indexOfChild(mVar6.f11584c) == -1) {
                m mVar7 = m.this;
                mVar7.addView(mVar7.f11584c);
            }
            m.this.getClass();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum c {
        PERFORMANCE(0),
        COMPATIBLE(1);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11601a;

        c(int i8) {
            this.f11601a = i8;
        }

        public static c b(int i8) {
            for (c cVar : values()) {
                if (cVar.f11601a == i8) {
                    return cVar;
                }
            }
            throw new IllegalArgumentException("Unknown implementation mode id " + i8);
        }

        public int c() {
            return this.f11601a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum d {
        FILL_START(0),
        FILL_CENTER(1),
        FILL_END(2),
        FIT_START(3),
        FIT_CENTER(4),
        FIT_END(5);


        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f11609a;

        d(int i8) {
            this.f11609a = i8;
        }

        public static d b(int i8) {
            for (d dVar : values()) {
                if (dVar.f11609a == i8) {
                    return dVar;
                }
            }
            throw new IllegalArgumentException("Unknown scale type id " + i8);
        }

        public int c() {
            return this.f11609a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum e {
        IDLE,
        STREAMING
    }

    public m(Context context) {
        this(context, null);
    }

    public static /* synthetic */ void a(m mVar, View view, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15) {
        mVar.getClass();
        if (i10 - i8 == i14 - i12 && i11 - i9 == i15 - i13) {
            return;
        }
        mVar.d();
        mVar.b(true);
    }

    public static boolean e(n nVar, S0 s8, c cVar) {
        return (nVar instanceof w) && !f(s8, cVar);
    }

    private DisplayManager getDisplayManager() {
        Context context = getContext();
        if (context == null) {
            return null;
        }
        return (DisplayManager) context.getSystemService("display");
    }

    private C0864c0.i getScreenFlashInternal() {
        return this.f11584c.getScreenFlash();
    }

    private int getViewPortScaleType() {
        int iOrdinal = getScaleType().ordinal();
        if (iOrdinal == 0) {
            return 0;
        }
        int i8 = 1;
        if (iOrdinal != 1) {
            i8 = 2;
            if (iOrdinal != 2) {
                i8 = 3;
                if (iOrdinal != 3 && iOrdinal != 4 && iOrdinal != 5) {
                    throw new IllegalStateException("Unexpected scale type: " + getScaleType());
                }
            }
        }
        return i8;
    }

    private void setScreenFlashUiInfo(C0864c0.i iVar) {
        AbstractC0890p0.a("PreviewView", "setScreenFlashUiInfo: mCameraController is null!");
    }

    public final void b(boolean z8) {
        I.w.b();
        getViewPort();
    }

    public V0 c(int i8) {
        I.w.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return new V0.a(new Rational(getWidth(), getHeight()), i8).c(getViewPortScaleType()).b(getLayoutDirection()).a();
    }

    public void d() {
        I.w.b();
        if (this.f11583b != null) {
            i();
            this.f11583b.h();
        }
        this.f11589h.b(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public void g() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.registerDisplayListener(this.f11593l, new Handler(Looper.getMainLooper()));
    }

    public Bitmap getBitmap() {
        I.w.b();
        n nVar = this.f11583b;
        if (nVar == null) {
            return null;
        }
        return nVar.a();
    }

    public AbstractC1664a getController() {
        I.w.b();
        return null;
    }

    public Display getDefaultDisplay() {
        if (getDisplay() == null) {
            return null;
        }
        Display display = getDisplayManager().getDisplay(0);
        return display != null ? display : getDisplay();
    }

    public c getImplementationMode() {
        I.w.b();
        return this.f11582a;
    }

    public AbstractC0895s0 getMeteringPointFactory() {
        I.w.b();
        return this.f11589h;
    }

    public AbstractC1737u getPreviewStreamState() {
        return this.f11587f;
    }

    public d getScaleType() {
        I.w.b();
        return this.f11585d.g();
    }

    public C0864c0.i getScreenFlash() {
        return getScreenFlashInternal();
    }

    public Matrix getSensorToViewTransform() {
        I.w.b();
        if (getWidth() == 0 || getHeight() == 0) {
            return null;
        }
        return this.f11585d.h(new Size(getWidth(), getHeight()), getLayoutDirection());
    }

    public C0903w0.c getSurfaceProvider() {
        I.w.b();
        return this.f11595n;
    }

    public V0 getViewPort() {
        I.w.b();
        Display defaultDisplay = getDefaultDisplay();
        if (defaultDisplay == null) {
            return null;
        }
        return c(defaultDisplay.getRotation());
    }

    public void h() {
        DisplayManager displayManager = getDisplayManager();
        if (displayManager == null) {
            return;
        }
        displayManager.unregisterDisplayListener(this.f11593l);
    }

    public void i() {
        Display defaultDisplay;
        I i8;
        if (!this.f11586e || (defaultDisplay = getDefaultDisplay()) == null || (i8 = this.f11591j) == null) {
            return;
        }
        this.f11585d.o(i8.l(defaultDisplay.getRotation()), defaultDisplay.getRotation());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode()) {
            g();
        }
        addOnLayoutChangeListener(this.f11594m);
        n nVar = this.f11583b;
        if (nVar != null) {
            nVar.d();
        }
        b(true);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeOnLayoutChangeListener(this.f11594m);
        n nVar = this.f11583b;
        if (nVar != null) {
            nVar.e();
        }
        if (isInEditMode()) {
            return;
        }
        h();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public boolean performClick() {
        this.f11592k = null;
        return super.performClick();
    }

    public void setController(AbstractC1664a abstractC1664a) {
        I.w.b();
        b(false);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public void setImplementationMode(c cVar) {
        I.w.b();
        this.f11582a = cVar;
        c cVar2 = c.PERFORMANCE;
    }

    public void setScaleType(d dVar) {
        I.w.b();
        this.f11585d.q(dVar);
        d();
        b(false);
    }

    public void setScreenFlashOverlayColor(int i8) {
        this.f11584c.setBackgroundColor(i8);
    }

    public void setScreenFlashWindow(Window window) {
        I.w.b();
        this.f11584c.setScreenFlashWindow(window);
        setScreenFlashUiInfo(getScreenFlashInternal());
    }

    public m(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public m(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public static boolean f(S0 s8, c cVar) {
        boolean z8;
        boolean zEquals = s8.m().r().j().equals(RaiWHuj.lpIULGWFXm);
        if (Z.b.b(SurfaceViewStretchedQuirk.class) == null && Z.b.b(SurfaceViewNotCroppedByParentQuirk.class) == null) {
            z8 = false;
        } else {
            z8 = true;
        }
        if (zEquals || z8) {
            return true;
        }
        int iOrdinal = cVar.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal == 1) {
            return true;
        }
        throw new IllegalArgumentException("Invalid implementation mode: " + cVar);
    }

    public p001a0.a getOutputTransform() {
        Matrix matrixJ;
        I.w.b();
        try {
            matrixJ = this.f11585d.j(new Size(getWidth(), getHeight()), getLayoutDirection());
        } catch (IllegalStateException unused) {
            matrixJ = null;
        }
        Rect rectI = this.f11585d.i();
        String str = yOZfxp.ngXaiyq;
        if (matrixJ != null && rectI != null) {
            matrixJ.preConcat(I.x.b(rectI));
            if (this.f11583b instanceof D) {
                matrixJ.postConcat(getMatrix());
            } else if (!getMatrix().isIdentity()) {
                AbstractC0890p0.l(str, "PreviewView needs to be in COMPATIBLE mode for the transform to work correctly.");
            }
            return new p001a0.a(matrixJ, new Size(rectI.width(), rectI.height()));
        }
        AbstractC0890p0.a(str, "Transform info is not ready");
        return null;
    }

    public m(Context context, AttributeSet attributeSet, int i8, int i9) {
        super(context, attributeSet, i8, i9);
        c cVar = f11581o;
        this.f11582a = cVar;
        f fVar = new f();
        this.f11585d = fVar;
        this.f11586e = true;
        this.f11587f = new androidx.lifecycle.x(e.IDLE);
        this.f11588g = new AtomicReference();
        this.f11589h = new o(fVar);
        this.f11593l = new b();
        this.f11594m = new View.OnLayoutChangeListener() { // from class: X.g
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
                m.a(this.f11571a, view, i10, i11, i12, i13, i14, i15, i16, i17);
            }
        };
        this.f11595n = new a();
        I.w.b();
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, p.f11621a, i8, i9);
        U1.I.G(this, context, p.f11621a, attributeSet, typedArrayObtainStyledAttributes, i8, i9);
        try {
            setScaleType(d.b(typedArrayObtainStyledAttributes.getInteger(p.f11623c, fVar.g().c())));
            setImplementationMode(c.b(typedArrayObtainStyledAttributes.getInteger(p.f11622b, cVar.c())));
            typedArrayObtainStyledAttributes.recycle();
            this.f11590i = new Y.a(context, new Y.a.b() { // from class: X.h
            });
            if (getBackground() == null) {
                setBackgroundColor(I1.a.b(getContext(), R.color.black));
            }
            s sVar = new s(context);
            this.f11584c = sVar;
            sVar.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements DisplayManager.DisplayListener {
        public b() {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayChanged(int i8) {
            Display defaultDisplay = m.this.getDefaultDisplay();
            if (defaultDisplay == null || defaultDisplay.getDisplayId() != i8) {
                return;
            }
            m.this.d();
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayAdded(int i8) {
        }

        @Override // android.hardware.display.DisplayManager.DisplayListener
        public void onDisplayRemoved(int i8) {
        }
    }
}
