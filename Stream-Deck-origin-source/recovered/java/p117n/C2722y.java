package p117n;

import M1.a;
import U1.I;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.SeekBar;
import p054g.j;

/* JADX INFO: renamed from: n.y, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2722y extends C2717t {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final SeekBar f30441d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f30442e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public ColorStateList f30443f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public PorterDuff.Mode f30444g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30445h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30446i;

    public C2722y(SeekBar seekBar) {
        super(seekBar);
        this.f30443f = null;
        this.f30444g = null;
        this.f30445h = false;
        this.f30446i = false;
        this.f30441d = seekBar;
    }

    @Override // p117n.C2717t
    public void c(AttributeSet attributeSet, int i8) {
        super.c(attributeSet, i8);
        X xU = X.u(this.f30441d.getContext(), attributeSet, j.f22616T, i8, 0);
        SeekBar seekBar = this.f30441d;
        I.G(seekBar, seekBar.getContext(), j.f22616T, attributeSet, xU.q(), i8, 0);
        Drawable drawableG = xU.g(j.f22620U);
        if (drawableG != null) {
            this.f30441d.setThumb(drawableG);
        }
        j(xU.f(j.f22624V));
        if (xU.r(j.f22632X)) {
            this.f30444g = H.c(xU.j(j.f22632X, -1), this.f30444g);
            this.f30446i = true;
        }
        if (xU.r(j.f22628W)) {
            this.f30443f = xU.c(j.f22628W);
            this.f30445h = true;
        }
        xU.w();
        f();
    }

    public final void f() {
        Drawable drawable = this.f30442e;
        if (drawable != null) {
            if (this.f30445h || this.f30446i) {
                Drawable drawableI = a.i(drawable.mutate());
                this.f30442e = drawableI;
                if (this.f30445h) {
                    a.g(drawableI, this.f30443f);
                }
                if (this.f30446i) {
                    a.h(this.f30442e, this.f30444g);
                }
                if (this.f30442e.isStateful()) {
                    this.f30442e.setState(this.f30441d.getDrawableState());
                }
            }
        }
    }

    public void g(Canvas canvas) {
        if (this.f30442e != null) {
            int max = this.f30441d.getMax();
            if (max > 1) {
                int intrinsicWidth = this.f30442e.getIntrinsicWidth();
                int intrinsicHeight = this.f30442e.getIntrinsicHeight();
                int i8 = intrinsicWidth >= 0 ? intrinsicWidth / 2 : 1;
                int i9 = intrinsicHeight >= 0 ? intrinsicHeight / 2 : 1;
                this.f30442e.setBounds(-i8, -i9, i8, i9);
                float width = ((this.f30441d.getWidth() - this.f30441d.getPaddingLeft()) - this.f30441d.getPaddingRight()) / max;
                int iSave = canvas.save();
                canvas.translate(this.f30441d.getPaddingLeft(), this.f30441d.getHeight() / 2);
                for (int i10 = 0; i10 <= max; i10++) {
                    this.f30442e.draw(canvas);
                    canvas.translate(width, 0.0f);
                }
                canvas.restoreToCount(iSave);
            }
        }
    }

    public void h() {
        Drawable drawable = this.f30442e;
        if (drawable != null && drawable.isStateful() && drawable.setState(this.f30441d.getDrawableState())) {
            this.f30441d.invalidateDrawable(drawable);
        }
    }

    public void i() {
        Drawable drawable = this.f30442e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
    }

    public void j(Drawable drawable) {
        Drawable drawable2 = this.f30442e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
        }
        this.f30442e = drawable;
        if (drawable != null) {
            drawable.setCallback(this.f30441d);
            a.e(drawable, this.f30441d.getLayoutDirection());
            if (drawable.isStateful()) {
                drawable.setState(this.f30441d.getDrawableState());
            }
            f();
        }
        this.f30441d.invalidate();
    }
}
