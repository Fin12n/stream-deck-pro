package p117n;

import U1.A;
import U1.C1642d;
import U1.I;
import Z1.c;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import p003a2.h;
import p003a2.i;

/* JADX INFO: renamed from: n.k, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2709k extends EditText implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2702d f30404a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f30405b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f30406c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final i f30407d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final C2710l f30408e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f30409f;

    /* JADX INFO: renamed from: n.k$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a {
        public a() {
        }

        public TextClassifier a() {
            return C2709k.super.getTextClassifier();
        }

        public void b(TextClassifier textClassifier) {
            C2709k.super.setTextClassifier(textClassifier);
        }
    }

    public C2709k(Context context) {
        this(context, null);
    }

    private a getSuperCaller() {
        if (this.f30409f == null) {
            this.f30409f = new a();
        }
        return this.f30409f;
    }

    @Override // U1.A
    public C1642d a(C1642d c1642d) {
        return this.f30407d.a(this, c1642d);
    }

    public void d(C2710l c2710l) {
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
        C2702d c2702d = this.f30404a;
        if (c2702d != null) {
            c2702d.b();
        }
        B b8 = this.f30405b;
        if (b8 != null) {
            b8.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2702d c2702d = this.f30404a;
        if (c2702d != null) {
            return c2702d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2702d c2702d = this.f30404a;
        if (c2702d != null) {
            return c2702d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f30405b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f30405b.k();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return getSuperCaller().a();
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] strArrP;
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f30405b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        InputConnection inputConnectionA = AbstractC2712n.a(inputConnectionOnCreateInputConnection, editorInfo, this);
        if (inputConnectionA != null && Build.VERSION.SDK_INT <= 30 && (strArrP = I.p(this)) != null) {
            Z1.a.c(editorInfo, strArrP);
            inputConnectionA = c.c(this, inputConnectionA, editorInfo);
        }
        return this.f30408e.d(inputConnectionA, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 < 30 || i8 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (AbstractC2720w.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i8) {
        if (AbstractC2720w.b(this, i8)) {
            return true;
        }
        return super.onTextContextMenuItem(i8);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2702d c2702d = this.f30404a;
        if (c2702d != null) {
            c2702d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C2702d c2702d = this.f30404a;
        if (c2702d != null) {
            c2702d.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30405b;
        if (b8 != null) {
            b8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30405b;
        if (b8 != null) {
            b8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        this.f30408e.e(z8);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.f30408e.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2702d c2702d = this.f30404a;
        if (c2702d != null) {
            c2702d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2702d c2702d = this.f30404a;
        if (c2702d != null) {
            c2702d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f30405b.w(colorStateList);
        this.f30405b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f30405b.x(mode);
        this.f30405b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        B b8 = this.f30405b;
        if (b8 != null) {
            b8.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        getSuperCaller().b(textClassifier);
    }

    public C2709k(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p054g.a.f22357C);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return super.getText();
    }

    public C2709k(Context context, AttributeSet attributeSet, int i8) {
        super(U.b(context), attributeSet, i8);
        T.a(this, getContext());
        C2702d c2702d = new C2702d(this);
        this.f30404a = c2702d;
        c2702d.e(attributeSet, i8);
        B b8 = new B(this);
        this.f30405b = b8;
        b8.m(attributeSet, i8);
        b8.b();
        this.f30406c = new A(this);
        this.f30407d = new i();
        C2710l c2710l = new C2710l(this);
        this.f30408e = c2710l;
        c2710l.c(attributeSet, i8);
        d(c2710l);
    }
}
