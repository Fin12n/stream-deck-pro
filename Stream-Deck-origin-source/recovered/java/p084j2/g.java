package p084j2;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.TextWatcher;
import android.widget.EditText;
import androidx.emoji2.text.c;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g implements TextWatcher {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f28150a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f28151b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public c.f f28152c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f28153d = Integer.MAX_VALUE;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f28154e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f28155f = true;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends c.f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Reference f28156a;

        public a(EditText editText) {
            this.f28156a = new WeakReference(editText);
        }

        @Override // androidx.emoji2.text.c.f
        public void b() {
            super.b();
            g.b((EditText) this.f28156a.get(), 1);
        }
    }

    public g(EditText editText, boolean z8) {
        this.f28150a = editText;
        this.f28151b = z8;
    }

    public static void b(EditText editText, int i8) {
        if (i8 == 1 && editText != null && editText.isAttachedToWindow()) {
            Editable editableText = editText.getEditableText();
            int selectionStart = Selection.getSelectionStart(editableText);
            int selectionEnd = Selection.getSelectionEnd(editableText);
            c.c().r(editableText);
            d.b(editableText, selectionStart, selectionEnd);
        }
    }

    public final c.f a() {
        if (this.f28152c == null) {
            this.f28152c = new a(this.f28150a);
        }
        return this.f28152c;
    }

    public void c(boolean z8) {
        if (this.f28155f != z8) {
            if (this.f28152c != null) {
                c.c().w(this.f28152c);
            }
            this.f28155f = z8;
            if (z8) {
                b(this.f28150a, c.c().g());
            }
        }
    }

    public final boolean d() {
        if (this.f28155f) {
            return (this.f28151b || c.k()) ? false : true;
        }
        return true;
    }

    @Override // android.text.TextWatcher
    public void onTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
        if (this.f28150a.isInEditMode() || d() || i9 > i10 || !(charSequence instanceof Spannable)) {
            return;
        }
        int iG = c.c().g();
        if (iG != 0) {
            if (iG == 1) {
                c.c().u((Spannable) charSequence, i8, i8 + i10, this.f28153d, this.f28154e);
                return;
            } else if (iG != 3) {
                return;
            }
        }
        c.c().v(a());
    }

    @Override // android.text.TextWatcher
    public void afterTextChanged(Editable editable) {
    }

    @Override // android.text.TextWatcher
    public void beforeTextChanged(CharSequence charSequence, int i8, int i9, int i10) {
    }
}
