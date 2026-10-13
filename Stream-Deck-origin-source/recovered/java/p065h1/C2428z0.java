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
import android.graphics.RecordingCanvas;
import android.graphics.RenderNode;
import android.os.Build;
import androidx.compose.ui.graphics.a;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: renamed from: h1.z0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2428z0 implements InterfaceC2379a0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AndroidComposeView f24383a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public O0 f24385c;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final RenderNode f24384b = AbstractC2426y0.a("Compose");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f24386d = a.f14661a.a();

    public C2428z0(AndroidComposeView androidComposeView) {
        this.f24383a = androidComposeView;
    }

    @Override // p065h1.InterfaceC2379a0
    public boolean A() {
        return this.f24384b.hasDisplayList();
    }

    @Override // p065h1.InterfaceC2379a0
    public void B(Outline outline) {
        this.f24384b.setOutline(outline);
    }

    @Override // p065h1.InterfaceC2379a0
    public void C(C1588g0 c1588g0, H0 h8, k kVar) {
        RecordingCanvas recordingCanvasBeginRecording = this.f24384b.beginRecording();
        Canvas canvasA = c1588g0.a().a();
        c1588g0.a().z(recordingCanvasBeginRecording);
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
        this.f24384b.endRecording();
    }

    @Override // p065h1.InterfaceC2379a0
    public boolean D() {
        return this.f24384b.getClipToBounds();
    }

    @Override // p065h1.InterfaceC2379a0
    public int E() {
        return this.f24384b.getTop();
    }

    @Override // p065h1.InterfaceC2379a0
    public void F(int i8) {
        this.f24384b.setAmbientShadowColor(i8);
    }

    @Override // p065h1.InterfaceC2379a0
    public boolean G() {
        return this.f24384b.getClipToOutline();
    }

    @Override // p065h1.InterfaceC2379a0
    public void H(boolean z8) {
        this.f24384b.setClipToOutline(z8);
    }

    @Override // p065h1.InterfaceC2379a0
    public boolean I(boolean z8) {
        return this.f24384b.setHasOverlappingRendering(z8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void J(int i8) {
        this.f24384b.setSpotShadowColor(i8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void K(Matrix matrix) {
        this.f24384b.getMatrix(matrix);
    }

    @Override // p065h1.InterfaceC2379a0
    public float L() {
        return this.f24384b.getElevation();
    }

    @Override // p065h1.InterfaceC2379a0
    public int a() {
        return this.f24384b.getLeft();
    }

    @Override // p065h1.InterfaceC2379a0
    public void b(float f8) {
        this.f24384b.setAlpha(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public float c() {
        return this.f24384b.getAlpha();
    }

    @Override // p065h1.InterfaceC2379a0
    public int d() {
        return this.f24384b.getRight();
    }

    @Override // p065h1.InterfaceC2379a0
    public void e(int i8) {
        this.f24384b.offsetLeftAndRight(i8);
    }

    @Override // p065h1.InterfaceC2379a0
    public int f() {
        return this.f24384b.getHeight();
    }

    @Override // p065h1.InterfaceC2379a0
    public int g() {
        return this.f24384b.getWidth();
    }

    @Override // p065h1.InterfaceC2379a0
    public void h(float f8) {
        this.f24384b.setRotationY(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void i(float f8) {
        this.f24384b.setRotationZ(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void j(float f8) {
        this.f24384b.setTranslationY(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void k(float f8) {
        this.f24384b.setScaleY(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void l(int i8) {
        RenderNode renderNode = this.f24384b;
        a.C0362a c0362a = a.f14661a;
        if (a.e(i8, c0362a.c())) {
            renderNode.setUseCompositingLayer(true, null);
            renderNode.setHasOverlappingRendering(true);
        } else if (a.e(i8, c0362a.b())) {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(false);
        } else {
            renderNode.setUseCompositingLayer(false, null);
            renderNode.setHasOverlappingRendering(true);
        }
        this.f24386d = i8;
    }

    @Override // p065h1.InterfaceC2379a0
    public int m() {
        return this.f24384b.getBottom();
    }

    @Override // p065h1.InterfaceC2379a0
    public void n(Canvas canvas) {
        canvas.drawRenderNode(this.f24384b);
    }

    @Override // p065h1.InterfaceC2379a0
    public void o(float f8) {
        this.f24384b.setPivotX(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void p(float f8) {
        this.f24384b.setScaleX(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void q(boolean z8) {
        this.f24384b.setClipToBounds(z8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void r(O0 o8) {
        this.f24385c = o8;
        if (Build.VERSION.SDK_INT >= 31) {
            A0.f24068a.a(this.f24384b, o8);
        }
    }

    @Override // p065h1.InterfaceC2379a0
    public void s(float f8) {
        this.f24384b.setTranslationX(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public boolean t(int i8, int i9, int i10, int i11) {
        return this.f24384b.setPosition(i8, i9, i10, i11);
    }

    @Override // p065h1.InterfaceC2379a0
    public void u() {
        this.f24384b.discardDisplayList();
    }

    @Override // p065h1.InterfaceC2379a0
    public void v(float f8) {
        this.f24384b.setCameraDistance(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void w(float f8) {
        this.f24384b.setRotationX(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void x(float f8) {
        this.f24384b.setPivotY(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void y(float f8) {
        this.f24384b.setElevation(f8);
    }

    @Override // p065h1.InterfaceC2379a0
    public void z(int i8) {
        this.f24384b.offsetTopAndBottom(i8);
    }
}
