package p066h2;

import T1.f;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextWatcher;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i extends SpannableStringBuilder {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Class f24401a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f24402b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a implements TextWatcher, SpanWatcher {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Object f24403a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final AtomicInteger f24404b = new AtomicInteger(0);

        public a(Object obj) {
            this.f24403a = obj;
        }

        public final void a() {
            this.f24404b.incrementAndGet();
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            ((TextWatcher) this.f24403a).afterTextChanged(editable);
        }

        public final boolean b(Object obj) {
            return obj instanceof e;
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            ((TextWatcher) this.f24403a).beforeTextChanged(charSequence, i8, i9, i10);
        }

        public final void c() {
            this.f24404b.decrementAndGet();
        }

        @Override // android.text.SpanWatcher
        public void onSpanAdded(Spannable spannable, Object obj, int i8, int i9) {
            if (this.f24404b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f24403a).onSpanAdded(spannable, obj, i8, i9);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanChanged(Spannable spannable, Object obj, int i8, int i9, int i10, int i11) {
            if (this.f24404b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f24403a).onSpanChanged(spannable, obj, i8, i9, i10, i11);
            }
        }

        @Override // android.text.SpanWatcher
        public void onSpanRemoved(Spannable spannable, Object obj, int i8, int i9) {
            if (this.f24404b.get() <= 0 || !b(obj)) {
                ((SpanWatcher) this.f24403a).onSpanRemoved(spannable, obj, i8, i9);
            }
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
            ((TextWatcher) this.f24403a).onTextChanged(charSequence, i8, i9, i10);
        }
    }

    public i(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.f24402b = new ArrayList();
        f.h(cls, "watcherClass cannot be null");
        this.f24401a = cls;
    }

    public static i c(Class cls, CharSequence charSequence) {
        return new i(cls, charSequence);
    }

    public void a() {
        b();
    }

    public final void b() {
        for (int i8 = 0; i8 < this.f24402b.size(); i8++) {
            ((a) this.f24402b.get(i8)).a();
        }
    }

    public void d() {
        i();
        e();
    }

    public final void e() {
        for (int i8 = 0; i8 < this.f24402b.size(); i8++) {
            ((a) this.f24402b.get(i8)).onTextChanged(this, 0, length(), length());
        }
    }

    public final a f(Object obj) {
        for (int i8 = 0; i8 < this.f24402b.size(); i8++) {
            a aVar = (a) this.f24402b.get(i8);
            if (aVar.f24403a == obj) {
                return aVar;
            }
        }
        return null;
    }

    public final boolean g(Class cls) {
        return this.f24401a == cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanEnd(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanFlags(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int getSpanStart(Object obj) {
        a aVarF;
        if (h(obj) && (aVarF = f(obj)) != null) {
            obj = aVarF;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public Object[] getSpans(int i8, int i9, Class cls) {
        if (!g(cls)) {
            return super.getSpans(i8, i9, cls);
        }
        a[] aVarArr = (a[]) super.getSpans(i8, i9, a.class);
        Object[] objArr = (Object[]) Array.newInstance((Class<?>) cls, aVarArr.length);
        for (int i10 = 0; i10 < aVarArr.length; i10++) {
            objArr[i10] = aVarArr[i10].f24403a;
        }
        return objArr;
    }

    public final boolean h(Object obj) {
        return obj != null && g(obj.getClass());
    }

    public final void i() {
        for (int i8 = 0; i8 < this.f24402b.size(); i8++) {
            ((a) this.f24402b.get(i8)).c();
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public int nextSpanTransition(int i8, int i9, Class cls) {
        if (cls == null || g(cls)) {
            cls = a.class;
        }
        return super.nextSpanTransition(i8, i9, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void removeSpan(Object obj) {
        a aVarF;
        if (h(obj)) {
            aVarF = f(obj);
            if (aVarF != null) {
                obj = aVarF;
            }
        } else {
            aVarF = null;
        }
        super.removeSpan(obj);
        if (aVarF != null) {
            this.f24402b.remove(aVarF);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public void setSpan(Object obj, int i8, int i9, int i10) {
        if (h(obj)) {
            a aVar = new a(obj);
            this.f24402b.add(aVar);
            obj = aVar;
        }
        super.setSpan(obj, i8, i9, i10);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public CharSequence subSequence(int i8, int i9) {
        return new i(this.f24401a, this, i8, i9);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder delete(int i8, int i9) {
        super.delete(i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i8, CharSequence charSequence) {
        super.insert(i8, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i8, int i9, CharSequence charSequence) {
        b();
        super.replace(i8, i9, charSequence);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder insert(int i8, CharSequence charSequence, int i9, int i10) {
        super.insert(i8, charSequence, i9, i10);
        return this;
    }

    public i(Class cls, CharSequence charSequence, int i8, int i9) {
        super(charSequence, i8, i9);
        this.f24402b = new ArrayList();
        f.h(cls, "watcherClass cannot be null");
        this.f24401a = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public SpannableStringBuilder replace(int i8, int i9, CharSequence charSequence, int i10, int i11) {
        b();
        super.replace(i8, i9, charSequence, i10, i11);
        i();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(char c8) {
        super.append(c8);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public SpannableStringBuilder append(CharSequence charSequence, int i8, int i9) {
        super.append(charSequence, i8, i9);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public SpannableStringBuilder append(CharSequence charSequence, Object obj, int i8) {
        super.append(charSequence, obj, i8);
        return this;
    }
}
