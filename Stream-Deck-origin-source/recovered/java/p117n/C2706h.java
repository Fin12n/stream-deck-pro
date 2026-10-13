package p117n;

import M1.a;
import U1.I;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CheckedTextView;
import p003a2.b;
import p054g.j;

/* JADX INFO: renamed from: n.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2706h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CheckedTextView f30383a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f30384b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f30385c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30386d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30387e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30388f;

    public C2706h(CheckedTextView checkedTextView) {
        this.f30383a = checkedTextView;
    }

    public void a() {
        Drawable drawableA = b.a(this.f30383a);
        if (drawableA != null) {
            if (this.f30386d || this.f30387e) {
                Drawable drawableMutate = a.i(drawableA).mutate();
                if (this.f30386d) {
                    a.g(drawableMutate, this.f30384b);
                }
                if (this.f30387e) {
                    a.h(drawableMutate, this.f30385c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f30383a.getDrawableState());
                }
                this.f30383a.setCheckMarkDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.f30384b;
    }

    public PorterDuff.Mode c() {
        return this.f30385c;
    }

    public void d(AttributeSet attributeSet, int i8) {
        int iM;
        int iM2;
        X xU = X.u(this.f30383a.getContext(), attributeSet, j.f22601P0, i8, 0);
        CheckedTextView checkedTextView = this.f30383a;
        I.G(checkedTextView, checkedTextView.getContext(), j.f22601P0, attributeSet, xU.q(), i8, 0);
        try {
            if (xU.r(j.f22609R0) && (iM2 = xU.m(j.f22609R0, 0)) != 0) {
                try {
                    CheckedTextView checkedTextView2 = this.f30383a;
                    checkedTextView2.setCheckMarkDrawable(p072i.a.b(checkedTextView2.getContext(), iM2));
                } catch (Resources.NotFoundException unused) {
                    if (xU.r(j.f22605Q0)) {
                        CheckedTextView checkedTextView3 = this.f30383a;
                        checkedTextView3.setCheckMarkDrawable(p072i.a.b(checkedTextView3.getContext(), iM));
                    }
                }
            } else if (xU.r(j.f22605Q0) && (iM = xU.m(j.f22605Q0, 0)) != 0) {
                CheckedTextView checkedTextView4 = this.f30383a;
                checkedTextView4.setCheckMarkDrawable(p072i.a.b(checkedTextView4.getContext(), iM));
            }
            if (xU.r(j.f22613S0)) {
                b.b(this.f30383a, xU.c(j.f22613S0));
            }
            if (xU.r(j.f22617T0)) {
                b.c(this.f30383a, H.c(xU.j(j.f22617T0, -1), null));
            }
        } finally {
            xU.w();
        }
    }

    public void e() {
        if (this.f30388f) {
            this.f30388f = false;
        } else {
            this.f30388f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.f30384b = colorStateList;
        this.f30386d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f30385c = mode;
        this.f30387e = true;
        a();
    }
}
