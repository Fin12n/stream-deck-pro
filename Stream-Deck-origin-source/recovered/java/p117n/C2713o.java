package p117n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import p054g.a;

/* JADX INFO: renamed from: n.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2713o extends ImageButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2702d f30415a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2714p f30416b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f30417c;

    public C2713o(Context context) {
        this(context, null);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2702d c2702d = this.f30415a;
        if (c2702d != null) {
            c2702d.b();
        }
        C2714p c2714p = this.f30416b;
        if (c2714p != null) {
            c2714p.c();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2702d c2702d = this.f30415a;
        if (c2702d != null) {
            return c2702d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2702d c2702d = this.f30415a;
        if (c2702d != null) {
            return c2702d.d();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        C2714p c2714p = this.f30416b;
        if (c2714p != null) {
            return c2714p.d();
        }
        return null;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C2714p c2714p = this.f30416b;
        if (c2714p != null) {
            return c2714p.e();
        }
        return null;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return this.f30416b.f() && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2702d c2702d = this.f30415a;
        if (c2702d != null) {
            c2702d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C2702d c2702d = this.f30415a;
        if (c2702d != null) {
            c2702d.g(i8);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C2714p c2714p = this.f30416b;
        if (c2714p != null) {
            c2714p.c();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C2714p c2714p = this.f30416b;
        if (c2714p != null && drawable != null && !this.f30417c) {
            c2714p.h(drawable);
        }
        super.setImageDrawable(drawable);
        C2714p c2714p2 = this.f30416b;
        if (c2714p2 != null) {
            c2714p2.c();
            if (this.f30417c) {
                return;
            }
            this.f30416b.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i8) {
        super.setImageLevel(i8);
        this.f30417c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i8) {
        this.f30416b.i(i8);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C2714p c2714p = this.f30416b;
        if (c2714p != null) {
            c2714p.c();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2702d c2702d = this.f30415a;
        if (c2702d != null) {
            c2702d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2702d c2702d = this.f30415a;
        if (c2702d != null) {
            c2702d.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C2714p c2714p = this.f30416b;
        if (c2714p != null) {
            c2714p.j(colorStateList);
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C2714p c2714p = this.f30416b;
        if (c2714p != null) {
            c2714p.k(mode);
        }
    }

    public C2713o(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f22358D);
    }

    public C2713o(Context context, AttributeSet attributeSet, int i8) {
        super(U.b(context), attributeSet, i8);
        this.f30417c = false;
        T.a(this, getContext());
        C2702d c2702d = new C2702d(this);
        this.f30415a = c2702d;
        c2702d.e(attributeSet, i8);
        C2714p c2714p = new C2714p(this);
        this.f30416b = c2714p;
        c2714p.g(attributeSet, i8);
    }
}
