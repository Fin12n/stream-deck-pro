package p117n;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.MultiAutoCompleteTextView;
import p072i.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class r extends MultiAutoCompleteTextView {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f30426d = {R.attr.popupBackground};

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2702d f30427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f30428b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final C2710l f30429c;

    public r(Context context) {
        this(context, null);
    }

    public void a(C2710l c2710l) {
        KeyListener keyListener = getKeyListener();
        if (c2710l.b(keyListener)) {
            boolean zIsFocusable = super.isFocusable();
            boolean zIsClickable = super.isClickable();
            boolean zIsLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener keyListenerA = c2710l.a(keyListener);
            if (keyListenerA == keyListener) {
                return;
            }
            super.setKeyListener(keyListenerA);
            super.setRawInputType(inputType);
            super.setFocusable(zIsFocusable);
            super.setClickable(zIsClickable);
            super.setLongClickable(zIsLongClickable);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2702d c2702d = this.f30427a;
        if (c2702d != null) {
            c2702d.b();
        }
        B b8 = this.f30428b;
        if (b8 != null) {
            b8.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2702d c2702d = this.f30427a;
        if (c2702d != null) {
            return c2702d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2702d c2702d = this.f30427a;
        if (c2702d != null) {
            return c2702d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f30428b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f30428b.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return this.f30429c.d(AbstractC2712n.a(super.onCreateInputConnection(editorInfo), editorInfo, this), editorInfo);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2702d c2702d = this.f30427a;
        if (c2702d != null) {
            c2702d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C2702d c2702d = this.f30427a;
        if (c2702d != null) {
            c2702d.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30428b;
        if (b8 != null) {
            b8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30428b;
        if (b8 != null) {
            b8.p();
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundResource(int i8) {
        setDropDownBackgroundDrawable(a.b(getContext(), i8));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        this.f30429c.e(z8);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f30429c.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2702d c2702d = this.f30427a;
        if (c2702d != null) {
            c2702d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2702d c2702d = this.f30427a;
        if (c2702d != null) {
            c2702d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f30428b.w(colorStateList);
        this.f30428b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f30428b.x(mode);
        this.f30428b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        B b8 = this.f30428b;
        if (b8 != null) {
            b8.q(context, i8);
        }
    }

    public r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p054g.a.f22387q);
    }

    public r(Context context, AttributeSet attributeSet, int i8) {
        super(U.b(context), attributeSet, i8);
        T.a(this, getContext());
        X xU = X.u(getContext(), attributeSet, f30426d, i8, 0);
        if (xU.r(0)) {
            setDropDownBackgroundDrawable(xU.f(0));
        }
        xU.w();
        C2702d c2702d = new C2702d(this);
        this.f30427a = c2702d;
        c2702d.e(attributeSet, i8);
        B b8 = new B(this);
        this.f30428b = b8;
        b8.m(attributeSet, i8);
        b8.b();
        C2710l c2710l = new C2710l(this);
        this.f30429c = c2710l;
        c2710l.c(attributeSet, i8);
        a(c2710l);
    }
}
