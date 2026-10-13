package p065h1;

import Q6.k;
import R0.C1588g0;
import R0.E;
import R0.H0;
import R0.InterfaceC1586f0;
import R0.O0;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.view.DisplayListCanvas;
import android.view.RenderNode;
import androidx.compose.ui.platform.AndroidComposeView;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: h1.x0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2424x0 implements InterfaceC2379a0 {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static boolean f24370l;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f24372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RenderNode f24373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f24374c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24375d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f24376e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f24377f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f24378g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public O0 f24379h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f24380i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final a f24368j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f24369k = 8;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static boolean f24371m = true;

    /* JADX INFO: renamed from: h1.x0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public C2424x0(AndroidComposeView androidComposeView) {
        this.f24372a = androidComposeView;
        RenderNode renderNodeCreate = RenderNode.create("Compose", androidComposeView);
        this.f24373b = renderNodeCreate;
        this.f24374c = androidx.compose.ui.graphics.a.f14661a.a();
        if (f24371m) {
            renderNodeCreate.setScaleX(renderNodeCreate.getScaleX());
            renderNodeCreate.setScaleY(renderNodeCreate.getScaleY());
            renderNodeCreate.setTranslationX(renderNodeCreate.getTranslationX());
            renderNodeCreate.setTranslationY(renderNodeCreate.getTranslationY());
            renderNodeCreate.setElevation(renderNodeCreate.getElevation());
            renderNodeCreate.setRotation(renderNodeCreate.getRotation());
            renderNodeCreate.setRotationX(renderNodeCreate.getRotationX());
            renderNodeCreate.setRotationY(renderNodeCreate.getRotationY());
            renderNodeCreate.setCameraDistance(renderNodeCreate.getCameraDistance());
            renderNodeCreate.setPivotX(renderNodeCreate.getPivotX());
            renderNodeCreate.setPivotY(renderNodeCreate.getPivotY());
            renderNodeCreate.setClipToOutline(renderNodeCreate.getClipToOutline());
            renderNodeCreate.setClipToBounds(false);
            renderNodeCreate.setAlpha(renderNodeCreate.getAlpha());
            renderNodeCreate.isValid();
            renderNodeCreate.setLeftTopRightBottom(0, 0, 0, 0);
            renderNodeCreate.offsetLeftAndRight(0);
            renderNodeCreate.offsetTopAndBottom(0);
            R(renderNodeCreate);
            M();
            renderNodeCreate.setLayerType(0);
            renderNodeCreate.setHasOverlappingRendering(renderNodeCreate.hasOverlappingRendering());
            f24371m = false;
        }
        if (f24370l) {
            throw new NoClassDefFoundError();
        }
    }

    @Override // p065h1.InterfaceC2379a0
    public boolean A() {
        return this.f24373b.isValid();
    }

    @Override // p065h1.InterfaceC2379a0
    public void B(Outline outline) {
        this.f24373b.setOutline(outline);
    }

    @Override // p065h1.InterfaceC2379a0
    public void C(C1588g0 c1588g0, H0 h8, k kVar) {
        DisplayListCanvas displayListCanvasStart = this.f24373b.start(g(), f());
        Canvas canvasA = c1588g0.a().a();
        c1588g0.a().z((Canvas) displayListCanvasStart);
        E eA = c1588g0.a();
        if (h8 != null) {
            eA.k();
            InterfaceC1586f0.m(eA, h8, 0, 2, null);
        }
        kVar.invoke(eA);
        if (h8 != null) {
            eA.x();
        }
        c1588g0.a().z(canvasA);
        this.f24373b.end(displayListCanvasStart);
    }

    @Override // p065h1.InterfaceC2379a0
    public boolean D() {
        return this.f24380i;
    }

    @Override // p065h1.InterfaceC2379a0
    public int E() {
        return this.f24376e;
    }

    @Override // p065h1.InterfaceC2379a0
    public void F(int i8) {
        D0.f24090a.c(this.f24373b, i8);
    }

    @Override // p065h1.InterfaceC2379a0
    public boolean G() {
        return this.f24373b.getClipToOutline();
    }

    @Override // p065h1.InterfaceC2379a0
    public void H(boolean z8) {
        this.f24373b.setClipToOutline(z8);
    }

    @Override // p065h1.InterfaceC2379a0
    public boolean I(boolean z8) {
        return this.f24373b.setHasOverlappingRendering(z8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void J(int i8) {
        D0.f24090a.d(this.f24373b, i8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void K(Matrix matrix) {
        this.f24373b.getMatrix(matrix);
    }

    @Override // p065h1.InterfaceC2379a0
    public float L() {
        return this.f24373b.getElevation();
    }

    public final void M() {
        C0.f24088a.a(this.f24373b);
    }

    public void N(int i8) {
        this.f24378g = i8;
    }

    public void O(int i8) {
        this.f24375d = i8;
    }

    public void P(int i8) {
        this.f24377f = i8;
    }

    public void Q(int i8) {
        this.f24376e = i8;
    }

    public final void R(RenderNode renderNode) {
        D0 d8 = D0.f24090a;
        d8.c(renderNode, d8.a(renderNode));
        d8.d(renderNode, d8.b(renderNode));
    }

    @Override // p065h1.InterfaceC2379a0
    public int a() {
        return this.f24375d;
    }

    @Override // p065h1.InterfaceC2379a0
    public void b(float f8) {
        this.f24373b.setAlpha(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public float c() {
        return this.f24373b.getAlpha();
    }

    @Override // p065h1.InterfaceC2379a0
    public int d() {
        return this.f24377f;
    }

    @Override // p065h1.InterfaceC2379a0
    public void e(int i8) {
        O(a() + i8);
        P(d() + i8);
        this.f24373b.offsetLeftAndRight(i8);
    }

    @Override // p065h1.InterfaceC2379a0
    public int f() {
        return m() - E();
    }

    @Override // p065h1.InterfaceC2379a0
    public int g() {
        return d() - a();
    }

    @Override // p065h1.InterfaceC2379a0
    public void h(float f8) {
        this.f24373b.setRotationY(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void i(float f8) {
        this.f24373b.setRotation(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void j(float f8) {
        this.f24373b.setTranslationY(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void k(float f8) {
        this.f24373b.setScaleY(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void l(int i8) {
        androidx.compose.ui.graphics.a.C0362a c0362a = androidx.compose.ui.graphics.a.f14661a;
        if (androidx.compose.ui.graphics.a.e(i8, c0362a.c())) {
            this.f24373b.setLayerType(2);
            this.f24373b.setHasOverlappingRendering(true);
        } else if (androidx.compose.ui.graphics.a.e(i8, c0362a.b())) {
            this.f24373b.setLayerType(0);
            this.f24373b.setHasOverlappingRendering(false);
        } else {
            this.f24373b.setLayerType(0);
            this.f24373b.setHasOverlappingRendering(true);
        }
        this.f24374c = i8;
    }

    @Override // p065h1.InterfaceC2379a0
    public int m() {
        return this.f24378g;
    }

    @Override // p065h1.InterfaceC2379a0
    public void n(Canvas canvas) {
        t.e(canvas, "null cannot be cast to non-null type android.view.DisplayListCanvas");
        ((DisplayListCanvas) canvas).drawRenderNode(this.f24373b);
    }

    @Override // p065h1.InterfaceC2379a0
    public void o(float f8) {
        this.f24373b.setPivotX(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void p(float f8) {
        this.f24373b.setScaleX(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void q(boolean z8) {
        this.f24380i = z8;
        this.f24373b.setClipToBounds(z8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void r(O0 o8) {
        this.f24379h = o8;
    }

    @Override // p065h1.InterfaceC2379a0
    public void s(float f8) {
        this.f24373b.setTranslationX(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public boolean t(int i8, int i9, int i10, int i11) {
        O(i8);
        Q(i9);
        P(i10);
        N(i11);
        return this.f24373b.setLeftTopRightBottom(i8, i9, i10, i11);
    }

    @Override // p065h1.InterfaceC2379a0
    public void u() {
        M();
    }

    @Override // p065h1.InterfaceC2379a0
    public void v(float f8) {
        this.f24373b.setCameraDistance(-f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void w(float f8) {
        this.f24373b.setRotationX(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void x(float f8) {
        this.f24373b.setPivotY(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void y(float f8) {
        this.f24373b.setElevation(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void z(int i8) {
        Q(E() + i8);
        N(m() + i8);
        this.f24373b.offsetTopAndBottom(i8);
    }
}
