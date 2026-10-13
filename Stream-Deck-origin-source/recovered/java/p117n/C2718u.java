package p117n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.RadioButton;
import p054g.a;

/* JADX INFO: renamed from: n.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2718u extends RadioButton {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2707i f30435a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2702d f30436b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f30437c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2711m f30438d;

    public C2718u(Context context) {
        this(context, null);
    }

    private C2711m getEmojiTextViewHelper() {
        if (this.f30438d == null) {
            this.f30438d = new C2711m(this);
        }
        return this.f30438d;
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2702d c2702d = this.f30436b;
        if (c2702d != null) {
            c2702d.b();
        }
        B b8 = this.f30437c;
        if (b8 != null) {
            b8.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2702d c2702d = this.f30436b;
        if (c2702d != null) {
            return c2702d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2702d c2702d = this.f30436b;
        if (c2702d != null) {
            return c2702d.d();
        }
        return null;
    }

    public ColorStateList getSupportButtonTintList() {
        C2707i c2707i = this.f30435a;
        if (c2707i != null) {
            return c2707i.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportButtonTintMode() {
        C2707i c2707i = this.f30435a;
        if (c2707i != null) {
            return c2707i.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f30437c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f30437c.k();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2702d c2702d = this.f30436b;
        if (c2702d != null) {
            c2702d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C2702d c2702d = this.f30436b;
        if (c2702d != null) {
            c2702d.g(i8);
        }
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(Drawable drawable) {
        super.setButtonDrawable(drawable);
        C2707i c2707i = this.f30435a;
        if (c2707i != null) {
            c2707i.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30437c;
        if (b8 != null) {
            b8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30437c;
        if (b8 != null) {
            b8.p();
        }
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2702d c2702d = this.f30436b;
        if (c2702d != null) {
            c2702d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2702d c2702d = this.f30436b;
        if (c2702d != null) {
            c2702d.j(mode);
        }
    }

    public void setSupportButtonTintList(ColorStateList colorStateList) {
        C2707i c2707i = this.f30435a;
        if (c2707i != null) {
            c2707i.f(colorStateList);
        }
    }

    public void setSupportButtonTintMode(PorterDuff.Mode mode) {
        C2707i c2707i = this.f30435a;
        if (c2707i != null) {
            c2707i.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f30437c.w(colorStateList);
        this.f30437c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f30437c.x(mode);
        this.f30437c.b();
    }

    public C2718u(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f22363I);
    }

    public C2718u(Context context, AttributeSet attributeSet, int i8) {
        super(U.b(context), attributeSet, i8);
        T.a(this, getContext());
        C2707i c2707i = new C2707i(this);
        this.f30435a = c2707i;
        c2707i.d(attributeSet, i8);
        C2702d c2702d = new C2702d(this);
        this.f30436b = c2702d;
        c2702d.e(attributeSet, i8);
        B b8 = new B(this);
        this.f30437c = b8;
        b8.m(attributeSet, i8);
        getEmojiTextViewHelper().b(attributeSet, i8);
    }

    @Override // android.widget.CompoundButton
    public void setButtonDrawable(int i8) {
        setButtonDrawable(p072i.a.b(getContext(), i8));
    }
}
