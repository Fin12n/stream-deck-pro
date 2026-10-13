package p117n;

import U1.I;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.util.AttributeSet;
import android.widget.ImageView;
import p003a2.e;
import p054g.j;
import p072i.a;

/* JADX INFO: renamed from: n.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2714p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final ImageView f30418a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public V f30419b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public V f30420c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public V f30421d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30422e = 0;

    public C2714p(ImageView imageView) {
        this.f30418a = imageView;
    }

    public final boolean a(Drawable drawable) {
        if (this.f30421d == null) {
            this.f30421d = new V();
        }
        V v8 = this.f30421d;
        v8.a();
        ColorStateList colorStateListA = e.a(this.f30418a);
        if (colorStateListA != null) {
            v8.f30337d = true;
            v8.f30334a = colorStateListA;
        }
        PorterDuff.Mode modeB = e.b(this.f30418a);
        if (modeB != null) {
            v8.f30336c = true;
            v8.f30335b = modeB;
        }
        if (!v8.f30337d && !v8.f30336c) {
            return false;
        }
        C2708j.i(drawable, v8, this.f30418a.getDrawableState());
        return true;
    }

    public void b() {
        if (this.f30418a.getDrawable() != null) {
            this.f30418a.getDrawable().setLevel(this.f30422e);
        }
    }

    public void c() {
        Drawable drawable = this.f30418a.getDrawable();
        if (drawable != null) {
            H.a(drawable);
        }
        if (drawable != null) {
            if (l() && a(drawable)) {
                return;
            }
            V v8 = this.f30420c;
            if (v8 != null) {
                C2708j.i(drawable, v8, this.f30418a.getDrawableState());
                return;
            }
            V v9 = this.f30419b;
            if (v9 != null) {
                C2708j.i(drawable, v9, this.f30418a.getDrawableState());
            }
        }
    }

    public ColorStateList d() {
        V v8 = this.f30420c;
        if (v8 != null) {
            return v8.f30334a;
        }
        return null;
    }

    public PorterDuff.Mode e() {
        V v8 = this.f30420c;
        if (v8 != null) {
            return v8.f30335b;
        }
        return null;
    }

    public boolean f() {
        return !(this.f30418a.getBackground() instanceof RippleDrawable);
    }

    public void g(AttributeSet attributeSet, int i8) {
        int iM;
        X xU = X.u(this.f30418a.getContext(), attributeSet, j.f22600P, i8, 0);
        ImageView imageView = this.f30418a;
        I.G(imageView, imageView.getContext(), j.f22600P, attributeSet, xU.q(), i8, 0);
        try {
            Drawable drawable = this.f30418a.getDrawable();
            if (drawable == null && (iM = xU.m(j.f22604Q, -1)) != -1 && (drawable = a.b(this.f30418a.getContext(), iM)) != null) {
                this.f30418a.setImageDrawable(drawable);
            }
            if (drawable != null) {
                H.a(drawable);
            }
            if (xU.r(j.f22608R)) {
                e.c(this.f30418a, xU.c(j.f22608R));
            }
            if (xU.r(j.f22612S)) {
                e.d(this.f30418a, H.c(xU.j(j.f22612S, -1), null));
            }
        } finally {
            xU.w();
        }
    }

    public void h(Drawable drawable) {
        this.f30422e = drawable.getLevel();
    }

    public void i(int i8) {
        if (i8 != 0) {
            Drawable drawableB = a.b(this.f30418a.getContext(), i8);
            if (drawableB != null) {
                H.a(drawableB);
            }
            this.f30418a.setImageDrawable(drawableB);
        } else {
            this.f30418a.setImageDrawable(null);
        }
        c();
    }

    public void j(ColorStateList colorStateList) {
        if (this.f30420c == null) {
            this.f30420c = new V();
        }
        V v8 = this.f30420c;
        v8.f30334a = colorStateList;
        v8.f30337d = true;
        c();
    }

    public void k(PorterDuff.Mode mode) {
        if (this.f30420c == null) {
            this.f30420c = new V();
        }
        V v8 = this.f30420c;
        v8.f30335b = mode;
        v8.f30336c = true;
        c();
    }

    public final boolean l() {
        return this.f30419b != null;
    }
}
