package p117n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;
import p003a2.h;
import p054g.a;

/* JADX INFO: renamed from: n.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2703e extends Button {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2702d f30372a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f30373b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C2711m f30374c;

    public C2703e(Context context) {
        this(context, null);
    }

    private C2711m getEmojiTextViewHelper() {
        if (this.f30374c == null) {
            this.f30374c = new C2711m(this);
        }
        return this.f30374c;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2702d c2702d = this.f30372a;
        if (c2702d != null) {
            c2702d.b();
        }
        B b8 = this.f30373b;
        if (b8 != null) {
            b8.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (d0.f30371c) {
            return super.getAutoSizeMaxTextSize();
        }
        B b8 = this.f30373b;
        if (b8 != null) {
            return b8.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (d0.f30371c) {
            return super.getAutoSizeMinTextSize();
        }
        B b8 = this.f30373b;
        if (b8 != null) {
            return b8.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (d0.f30371c) {
            return super.getAutoSizeStepGranularity();
        }
        B b8 = this.f30373b;
        if (b8 != null) {
            return b8.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (d0.f30371c) {
            return super.getAutoSizeTextAvailableSizes();
        }
        B b8 = this.f30373b;
        return b8 != null ? b8.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (d0.f30371c) {
            return super.getAutoSizeTextType() == 1 ? 1 : 0;
        }
        B b8 = this.f30373b;
        if (b8 != null) {
            return b8.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.m(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2702d c2702d = this.f30372a;
        if (c2702d != null) {
            return c2702d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2702d c2702d = this.f30372a;
        if (c2702d != null) {
            return c2702d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f30373b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f30373b.k();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(Button.class.getName());
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(Button.class.getName());
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        B b8 = this.f30373b;
        if (b8 != null) {
            b8.o(z8, i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        B b8 = this.f30373b;
        if (b8 == null || d0.f30371c || !b8.l()) {
            return;
        }
        this.f30373b.c();
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) {
        if (d0.f30371c) {
            super.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
            return;
        }
        B b8 = this.f30373b;
        if (b8 != null) {
            b8.t(i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i8) {
        if (d0.f30371c) {
            super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
            return;
        }
        B b8 = this.f30373b;
        if (b8 != null) {
            b8.u(iArr, i8);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i8) {
        if (d0.f30371c) {
            super.setAutoSizeTextTypeWithDefaults(i8);
            return;
        }
        B b8 = this.f30373b;
        if (b8 != null) {
            b8.v(i8);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2702d c2702d = this.f30372a;
        if (c2702d != null) {
            c2702d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C2702d c2702d = this.f30372a;
        if (c2702d != null) {
            c2702d.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(h.n(this, callback));
    }

    public void setEmojiCompatEnabled(boolean z8) {
        getEmojiTextViewHelper().d(z8);
    }

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    public void setSupportAllCaps(boolean z8) {
        B b8 = this.f30373b;
        if (b8 != null) {
            b8.s(z8);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2702d c2702d = this.f30372a;
        if (c2702d != null) {
            c2702d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2702d c2702d = this.f30372a;
        if (c2702d != null) {
            c2702d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f30373b.w(colorStateList);
        this.f30373b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f30373b.x(mode);
        this.f30373b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        B b8 = this.f30373b;
        if (b8 != null) {
            b8.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextSize(int i8, float f8) {
        if (d0.f30371c) {
            super.setTextSize(i8, f8);
            return;
        }
        B b8 = this.f30373b;
        if (b8 != null) {
            b8.A(i8, f8);
        }
    }

    public C2703e(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, a.f22388r);
    }

    public C2703e(Context context, AttributeSet attributeSet, int i8) {
        super(U.b(context), attributeSet, i8);
        T.a(this, getContext());
        C2702d c2702d = new C2702d(this);
        this.f30372a = c2702d;
        c2702d.e(attributeSet, i8);
        B b8 = new B(this);
        this.f30373b = b8;
        b8.m(attributeSet, i8);
        b8.b();
        getEmojiTextViewHelper().b(attributeSet, i8);
    }
}
