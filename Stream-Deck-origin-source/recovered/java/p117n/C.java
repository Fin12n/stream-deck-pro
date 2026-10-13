package p117n;

import L1.j;
import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import p003a2.h;
import p063h.s;
import p181u6.GfRt.QhsKALGiniuQ;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C extends TextView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2702d f30175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B f30176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final A f30177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public C2711m f30178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f30179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public a f30180f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Future f30181g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a(int[] iArr, int i8);

        int[] b();

        TextClassifier c();

        int d();

        void e(TextClassifier textClassifier);

        void f(int i8);

        void g(int i8, int i9, int i10, int i11);

        int h();

        int i();

        void j(int i8);

        int k();

        void l(int i8);

        void m(int i8, float f8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c extends b {
        public c() {
            super();
        }

        @Override // n.C.a
        public void f(int i8) {
            C.super.setLastBaselineToBottomHeight(i8);
        }

        @Override // n.C.a
        public void j(int i8) {
            C.super.setFirstBaselineToTopHeight(i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d extends c {
        public d() {
            super();
        }

        @Override // n.C.b, n.C.a
        public void m(int i8, float f8) {
            C.super.setLineHeight(i8, f8);
        }
    }

    public C(Context context) {
        this(context, null);
    }

    private C2711m getEmojiTextViewHelper() {
        if (this.f30178d == null) {
            this.f30178d = new C2711m(this);
        }
        return this.f30178d;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        C2702d c2702d = this.f30175a;
        if (c2702d != null) {
            c2702d.b();
        }
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.b();
        }
    }

    @Override // android.widget.TextView
    public int getAutoSizeMaxTextSize() {
        if (d0.f30371c) {
            return getSuperCaller().d();
        }
        B b8 = this.f30176b;
        if (b8 != null) {
            return b8.e();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeMinTextSize() {
        if (d0.f30371c) {
            return getSuperCaller().i();
        }
        B b8 = this.f30176b;
        if (b8 != null) {
            return b8.f();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int getAutoSizeStepGranularity() {
        if (d0.f30371c) {
            return getSuperCaller().k();
        }
        B b8 = this.f30176b;
        if (b8 != null) {
            return b8.g();
        }
        return -1;
    }

    @Override // android.widget.TextView
    public int[] getAutoSizeTextAvailableSizes() {
        if (d0.f30371c) {
            return getSuperCaller().b();
        }
        B b8 = this.f30176b;
        return b8 != null ? b8.h() : new int[0];
    }

    @Override // android.widget.TextView
    public int getAutoSizeTextType() {
        if (d0.f30371c) {
            return getSuperCaller().h() == 1 ? 1 : 0;
        }
        B b8 = this.f30176b;
        if (b8 != null) {
            return b8.i();
        }
        return 0;
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return h.m(super.getCustomSelectionActionModeCallback());
    }

    @Override // android.widget.TextView
    public int getFirstBaselineToTopHeight() {
        return h.a(this);
    }

    @Override // android.widget.TextView
    public int getLastBaselineToBottomHeight() {
        return h.b(this);
    }

    public a getSuperCaller() {
        if (this.f30180f == null) {
            if (Build.VERSION.SDK_INT >= 34) {
                this.f30180f = new d();
            } else {
                this.f30180f = new c();
            }
        }
        return this.f30180f;
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2702d c2702d = this.f30175a;
        if (c2702d != null) {
            return c2702d.c();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2702d c2702d = this.f30175a;
        if (c2702d != null) {
            return c2702d.d();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f30176b.j();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f30176b.k();
    }

    @Override // android.widget.TextView
    public CharSequence getText() {
        r();
        return super.getText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        return getSuperCaller().c();
    }

    public S1.b.a getTextMetricsParamsCompat() {
        return h.d(this);
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection inputConnectionOnCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.f30176b.r(this, inputConnectionOnCreateInputConnection, editorInfo);
        return AbstractC2712n.a(inputConnectionOnCreateInputConnection, editorInfo, this);
    }

    @Override // android.widget.TextView, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.o(z8, i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onMeasure(int i8, int i9) {
        r();
        super.onMeasure(i8, i9);
    }

    @Override // android.widget.TextView
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        super.onTextChanged(charSequence, i8, i9, i10);
        B b8 = this.f30176b;
        if (b8 == null || d0.f30371c || !b8.l()) {
            return;
        }
        this.f30176b.c();
    }

    public final void r() {
        Future future = this.f30181g;
        if (future != null) {
            try {
                this.f30181g = null;
                s.a(future.get());
                h.k(this, null);
            } catch (InterruptedException | ExecutionException unused) {
            }
        }
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z8) {
        super.setAllCaps(z8);
        getEmojiTextViewHelper().c(z8);
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithConfiguration(int i8, int i9, int i10, int i11) {
        if (d0.f30371c) {
            getSuperCaller().g(i8, i9, i10, i11);
            return;
        }
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.t(i8, i9, i10, i11);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeUniformWithPresetSizes(int[] iArr, int i8) {
        if (d0.f30371c) {
            getSuperCaller().a(iArr, i8);
            return;
        }
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.u(iArr, i8);
        }
    }

    @Override // android.widget.TextView
    public void setAutoSizeTextTypeWithDefaults(int i8) {
        if (d0.f30371c) {
            getSuperCaller().l(i8);
            return;
        }
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.v(i8);
        }
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2702d c2702d = this.f30175a;
        if (c2702d != null) {
            c2702d.f(drawable);
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i8) {
        super.setBackgroundResource(i8);
        C2702d c2702d = this.f30175a;
        if (c2702d != null) {
            c2702d.g(i8);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelativeWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesWithIntrinsicBounds(drawable, drawable2, drawable3, drawable4);
        B b8 = this.f30176b;
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

    @Override // android.widget.TextView
    public void setFilters(InputFilter[] inputFilterArr) {
        super.setFilters(getEmojiTextViewHelper().a(inputFilterArr));
    }

    @Override // android.widget.TextView
    public void setFirstBaselineToTopHeight(int i8) {
        getSuperCaller().j(i8);
    }

    @Override // android.widget.TextView
    public void setLastBaselineToBottomHeight(int i8) {
        getSuperCaller().f(i8);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i8) {
        h.i(this, i8);
    }

    public void setPrecomputedText(S1.b bVar) {
        h.k(this, bVar);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2702d c2702d = this.f30175a;
        if (c2702d != null) {
            c2702d.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2702d c2702d = this.f30175a;
        if (c2702d != null) {
            c2702d.j(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.f30176b.w(colorStateList);
        this.f30176b.b();
    }

    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.f30176b.x(mode);
        this.f30176b.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i8) {
        super.setTextAppearance(context, i8);
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.q(context, i8);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        getSuperCaller().e(textClassifier);
    }

    public void setTextFuture(Future<S1.b> future) {
        this.f30181g = future;
        if (future != null) {
            requestLayout();
        }
    }

    public void setTextMetricsParamsCompat(S1.b.a aVar) {
        h.l(this, aVar);
    }

    @Override // android.widget.TextView
    public void setTextSize(int i8, float f8) {
        if (d0.f30371c) {
            super.setTextSize(i8, f8);
            return;
        }
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.A(i8, f8);
        }
    }

    @Override // android.widget.TextView
    public void setTypeface(Typeface typeface, int i8) {
        if (this.f30179e) {
            return;
        }
        Typeface typefaceA = (typeface == null || i8 <= 0) ? null : j.a(getContext(), typeface, i8);
        this.f30179e = true;
        if (typefaceA != null) {
            typeface = typefaceA;
        }
        try {
            super.setTypeface(typeface, i8);
        } finally {
            this.f30179e = false;
        }
    }

    public C(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.textViewStyle);
    }

    @Override // android.widget.TextView
    public void setLineHeight(int i8, float f8) {
        if (Build.VERSION.SDK_INT >= 34) {
            getSuperCaller().m(i8, f8);
        } else {
            h.j(this, i8, f8);
        }
    }

    public C(Context context, AttributeSet attributeSet, int i8) {
        super(U.b(context), attributeSet, i8);
        this.f30179e = false;
        this.f30180f = null;
        T.a(this, getContext());
        C2702d c2702d = new C2702d(this);
        this.f30175a = c2702d;
        c2702d.e(attributeSet, i8);
        B b8 = new B(this);
        this.f30176b = b8;
        b8.m(attributeSet, i8);
        b8.b();
        this.f30177c = new A(this);
        getEmojiTextViewHelper().b(attributeSet, i8);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30 && i8 < 33 && onCheckIsTextEditor()) {
            ((InputMethodManager) getContext().getSystemService(QhsKALGiniuQ.trMfQEXW)).isActive(this);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelativeWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesRelativeWithIntrinsicBounds(i8 != 0 ? p072i.a.b(context, i8) : null, i9 != 0 ? p072i.a.b(context, i9) : null, i10 != 0 ? p072i.a.b(context, i10) : null, i11 != 0 ? p072i.a.b(context, i11) : null);
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.p();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesWithIntrinsicBounds(int i8, int i9, int i10, int i11) {
        Context context = getContext();
        setCompoundDrawablesWithIntrinsicBounds(i8 != 0 ? p072i.a.b(context, i8) : null, i9 != 0 ? p072i.a.b(context, i9) : null, i10 != 0 ? p072i.a.b(context, i10) : null, i11 != 0 ? p072i.a.b(context, i11) : null);
        B b8 = this.f30176b;
        if (b8 != null) {
            b8.p();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements a {
        public b() {
        }

        @Override // n.C.a
        public void a(int[] iArr, int i8) {
            C.super.setAutoSizeTextTypeUniformWithPresetSizes(iArr, i8);
        }

        @Override // n.C.a
        public int[] b() {
            return C.super.getAutoSizeTextAvailableSizes();
        }

        @Override // n.C.a
        public TextClassifier c() {
            return C.super.getTextClassifier();
        }

        @Override // n.C.a
        public int d() {
            return C.super.getAutoSizeMaxTextSize();
        }

        @Override // n.C.a
        public void e(TextClassifier textClassifier) {
            C.super.setTextClassifier(textClassifier);
        }

        @Override // n.C.a
        public void g(int i8, int i9, int i10, int i11) {
            C.super.setAutoSizeTextTypeUniformWithConfiguration(i8, i9, i10, i11);
        }

        @Override // n.C.a
        public int h() {
            return C.super.getAutoSizeTextType();
        }

        @Override // n.C.a
        public int i() {
            return C.super.getAutoSizeMinTextSize();
        }

        @Override // n.C.a
        public int k() {
            return C.super.getAutoSizeStepGranularity();
        }

        @Override // n.C.a
        public void l(int i8) {
            C.super.setAutoSizeTextTypeWithDefaults(i8);
        }

        @Override // n.C.a
        public void m(int i8, float f8) {
        }
    }
}
