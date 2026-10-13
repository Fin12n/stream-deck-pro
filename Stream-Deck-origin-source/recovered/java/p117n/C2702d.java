package p117n;

import U1.I;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import p054g.j;

/* JADX INFO: renamed from: n.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2702d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final View f30363a;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f30366d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public V f30367e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public V f30368f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30365c = -1;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2708j f30364b = C2708j.b();

    public C2702d(View view) {
        this.f30363a = view;
    }

    public final boolean a(Drawable drawable) {
        if (this.f30368f == null) {
            this.f30368f = new V();
        }
        V v8 = this.f30368f;
        v8.a();
        ColorStateList colorStateListL = I.l(this.f30363a);
        if (colorStateListL != null) {
            v8.f30337d = true;
            v8.f30334a = colorStateListL;
        }
        PorterDuff.Mode modeM = I.m(this.f30363a);
        if (modeM != null) {
            v8.f30336c = true;
            v8.f30335b = modeM;
        }
        if (!v8.f30337d && !v8.f30336c) {
            return false;
        }
        C2708j.i(drawable, v8, this.f30363a.getDrawableState());
        return true;
    }

    public void b() {
        Drawable background = this.f30363a.getBackground();
        if (background != null) {
            if (k() && a(background)) {
                return;
            }
            V v8 = this.f30367e;
            if (v8 != null) {
                C2708j.i(background, v8, this.f30363a.getDrawableState());
                return;
            }
            V v9 = this.f30366d;
            if (v9 != null) {
                C2708j.i(background, v9, this.f30363a.getDrawableState());
            }
        }
    }

    public ColorStateList c() {
        V v8 = this.f30367e;
        if (v8 != null) {
            return v8.f30334a;
        }
        return null;
    }

    public PorterDuff.Mode d() {
        V v8 = this.f30367e;
        if (v8 != null) {
            return v8.f30335b;
        }
        return null;
    }

    public void e(AttributeSet attributeSet, int i8) {
        X xU = X.u(this.f30363a.getContext(), attributeSet, j.f22753v3, i8, 0);
        View view = this.f30363a;
        I.G(view, view.getContext(), j.f22753v3, attributeSet, xU.q(), i8, 0);
        try {
            if (xU.r(j.f22758w3)) {
                this.f30365c = xU.m(j.f22758w3, -1);
                ColorStateList colorStateListF = this.f30364b.f(this.f30363a.getContext(), this.f30365c);
                if (colorStateListF != null) {
                    h(colorStateListF);
                }
            }
            if (xU.r(j.f22763x3)) {
                I.M(this.f30363a, xU.c(j.f22763x3));
            }
            if (xU.r(j.f22768y3)) {
                I.N(this.f30363a, H.c(xU.j(j.f22768y3, -1), null));
            }
        } finally {
            xU.w();
        }
    }

    public void f(Drawable drawable) {
        this.f30365c = -1;
        h(null);
        b();
    }

    public void g(int i8) {
        this.f30365c = i8;
        C2708j c2708j = this.f30364b;
        h(c2708j != null ? c2708j.f(this.f30363a.getContext(), i8) : null);
        b();
    }

    public void h(ColorStateList colorStateList) {
        if (colorStateList != null) {
            if (this.f30366d == null) {
                this.f30366d = new V();
            }
            V v8 = this.f30366d;
            v8.f30334a = colorStateList;
            v8.f30337d = true;
        } else {
            this.f30366d = null;
        }
        b();
    }

    public void i(ColorStateList colorStateList) {
        if (this.f30367e == null) {
            this.f30367e = new V();
        }
        V v8 = this.f30367e;
        v8.f30334a = colorStateList;
        v8.f30337d = true;
        b();
    }

    public void j(PorterDuff.Mode mode) {
        if (this.f30367e == null) {
            this.f30367e = new V();
        }
        V v8 = this.f30367e;
        v8.f30335b = mode;
        v8.f30336c = true;
        b();
    }

    public final boolean k() {
        return this.f30366d != null;
    }
}
