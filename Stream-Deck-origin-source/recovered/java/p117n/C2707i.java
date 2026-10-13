package p117n;

import M1.a;
import U1.I;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import p003a2.c;
import p054g.j;

/* JADX INFO: renamed from: n.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2707i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final CompoundButton f30389a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ColorStateList f30390b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f30391c = null;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f30392d = false;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30393e = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f30394f;

    public C2707i(CompoundButton compoundButton) {
        this.f30389a = compoundButton;
    }

    public void a() {
        Drawable drawableA = c.a(this.f30389a);
        if (drawableA != null) {
            if (this.f30392d || this.f30393e) {
                Drawable drawableMutate = a.i(drawableA).mutate();
                if (this.f30392d) {
                    a.g(drawableMutate, this.f30390b);
                }
                if (this.f30393e) {
                    a.h(drawableMutate, this.f30391c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(this.f30389a.getDrawableState());
                }
                this.f30389a.setButtonDrawable(drawableMutate);
            }
        }
    }

    public ColorStateList b() {
        return this.f30390b;
    }

    public PorterDuff.Mode c() {
        return this.f30391c;
    }

    public void d(AttributeSet attributeSet, int i8) {
        int iM;
        int iM2;
        X xU = X.u(this.f30389a.getContext(), attributeSet, j.f22621U0, i8, 0);
        CompoundButton compoundButton = this.f30389a;
        I.G(compoundButton, compoundButton.getContext(), j.f22621U0, attributeSet, xU.q(), i8, 0);
        try {
            if (xU.r(j.f22629W0) && (iM2 = xU.m(j.f22629W0, 0)) != 0) {
                try {
                    CompoundButton compoundButton2 = this.f30389a;
                    compoundButton2.setButtonDrawable(p072i.a.b(compoundButton2.getContext(), iM2));
                } catch (Resources.NotFoundException unused) {
                    if (xU.r(j.f22625V0)) {
                        CompoundButton compoundButton3 = this.f30389a;
                        compoundButton3.setButtonDrawable(p072i.a.b(compoundButton3.getContext(), iM));
                    }
                }
            } else if (xU.r(j.f22625V0) && (iM = xU.m(j.f22625V0, 0)) != 0) {
                CompoundButton compoundButton4 = this.f30389a;
                compoundButton4.setButtonDrawable(p072i.a.b(compoundButton4.getContext(), iM));
            }
            if (xU.r(j.f22633X0)) {
                c.b(this.f30389a, xU.c(j.f22633X0));
            }
            if (xU.r(j.f22637Y0)) {
                c.c(this.f30389a, H.c(xU.j(j.f22637Y0, -1), null));
            }
        } finally {
            xU.w();
        }
    }

    public void e() {
        if (this.f30394f) {
            this.f30394f = false;
        } else {
            this.f30394f = true;
            a();
        }
    }

    public void f(ColorStateList colorStateList) {
        this.f30390b = colorStateList;
        this.f30392d = true;
        a();
    }

    public void g(PorterDuff.Mode mode) {
        this.f30391c = mode;
        this.f30393e = true;
        a();
    }
}
