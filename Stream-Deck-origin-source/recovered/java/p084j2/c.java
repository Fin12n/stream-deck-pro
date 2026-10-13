package p084j2;

import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.TextView;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends InputConnectionWrapper {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final TextView f28137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f28138b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public boolean a(InputConnection inputConnection, Editable editable, int i8, int i9, boolean z8) {
            return androidx.emoji2.text.c.h(inputConnection, editable, i8, i9, z8);
        }

        public void b(EditorInfo editorInfo) {
            if (androidx.emoji2.text.c.k()) {
                androidx.emoji2.text.c.c().x(editorInfo);
            }
        }
    }

    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        this(textView, inputConnection, editorInfo, new a());
    }

    public final Editable b() {
        return this.f28137a.getEditableText();
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i8, int i9) {
        return this.f28138b.a(this, b(), i8, i9, false) || super.deleteSurroundingText(i8, i9);
    }

    @Override // android.view.inputmethod.InputConnectionWrapper, android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i8, int i9) {
        return this.f28138b.a(this, b(), i8, i9, true) || super.deleteSurroundingTextInCodePoints(i8, i9);
    }

    public c(TextView textView, InputConnection inputConnection, EditorInfo editorInfo, a aVar) {
        super(inputConnection, false);
        this.f28137a = textView;
        this.f28138b = aVar;
        aVar.b(editorInfo);
    }
}
