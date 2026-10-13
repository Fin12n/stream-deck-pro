package p117n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import p003a2.h;
import p054g.a;

/* JADX INFO: renamed from: n.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2705g extends CheckedTextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2706h f30379a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2702d f30380b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f30381c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2711m f30382d;

    public C2705g(Context context) {
        this(context, null);
    }

    private C2711m getEmojiTextViewHelper() {
        if (this.f30382d == null) {
            this.f30382d = new C2711m(this);
        }
        return this.f30382d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        B b8 = this.f30381c;
        if (b8 != null) {
            b8.b();
        }
        C2702d c2702d = this.f30380b;
        if (c2702d != null) {
            c2702d.b();
        }
        C2706h c2706h = this.f30379a;
        if (c2706h != null) {
            c2706h.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2702d c2702d = this.f30380b;
        if (c2702d != null) {
            return c2702d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2702d c2702d = this.f30380b;
        if (c2702d != null) {
            return c2702d.d();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C2706h c2706h = this.f30379a;
        if (c2706h != null) {
            return c2706h.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C2706h c2706h = this.f30379a;
        if (c2706h != null) {
            return c2706h.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f30381c.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f30381c.k();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        return AbstractC2712n.a(super.onCreateInputConnection(editorInfo), editorInfo, this);
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2702d c2702d = this.f30380b;
        if (c2702d != null) {
            c2702d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C2702d c2702d = this.f30380b;
        if (c2702d != null) {
            c2702d.g(i8);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C2706h c2706h = this.f30379a;
        if (c2706h != null) {
            c2706h.e();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30381c;
        if (b8 != null) {
            b8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30381c;
        if (b8 != null) {
            b8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2702d c2702d = this.f30380b;
        if (c2702d != null) {
            c2702d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2702d c2702d = this.f30380b;
        if (c2702d != null) {
            c2702d.j(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C2706h c2706h = this.f30379a;
        if (c2706h != null) {
            c2706h.f(colorStateList);
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C2706h c2706h = this.f30379a;
        if (c2706h != null) {
            c2706h.g(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f30381c.w(colorStateList);
        this.f30381c.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f30381c.x(mode);
        this.f30381c.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        B b8 = this.f30381c;
        if (b8 != null) {
            b8.q(context, i8);
        }
    }

    public C2705g(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f22390t);
    }

    public C2705g(Context context, AttributeSet attributeSet, int i8) {
        super(U.b(context), attributeSet, i8);
        T.a(this, getContext());
        B b8 = new B(this);
        this.f30381c = b8;
        b8.m(attributeSet, i8);
        b8.b();
        C2702d c2702d = new C2702d(this);
        this.f30380b = c2702d;
        c2702d.e(attributeSet, i8);
        C2706h c2706h = new C2706h(this);
        this.f30379a = c2706h;
        c2706h.d(attributeSet, i8);
        getEmojiTextViewHelper().b(attributeSet, i8);
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i8) {
        setCheckMarkDrawable(p072i.a.b(getContext(), i8));
    }
}
