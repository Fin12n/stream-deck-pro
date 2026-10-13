package p084j2;

import T1.f;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final b f28129a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f28130b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f28131c;

    /* JADX INFO: renamed from: j2.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class C0613a extends b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final EditText f28132a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final g f28133b;

        public C0613a(EditText editText, boolean z8) {
            this.f28132a = editText;
            g gVar = new g(editText, z8);
            this.f28133b = gVar;
            editText.addTextChangedListener(gVar);
            editText.setEditableFactory(p084j2.b.getInstance());
        }

        @Override // j2.a.b
        public KeyListener a(KeyListener keyListener) {
            if (keyListener instanceof e) {
                return keyListener;
            }
            if (keyListener == null) {
                return null;
            }
            return keyListener instanceof NumberKeyListener ? keyListener : new e(keyListener);
        }

        @Override // j2.a.b
        public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
            return inputConnection instanceof c ? inputConnection : new c(this.f28132a, inputConnection, editorInfo);
        }

        @Override // j2.a.b
        public void c(boolean z8) {
            this.f28133b.c(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public abstract KeyListener a(KeyListener keyListener);

        public abstract InputConnection b(InputConnection inputConnection, EditorInfo editorInfo);

        public abstract void c(boolean z8);
    }

    public a(EditText editText) {
        this(editText, true);
    }

    public KeyListener a(KeyListener keyListener) {
        return this.f28129a.a(keyListener);
    }

    public InputConnection b(InputConnection inputConnection, EditorInfo editorInfo) {
        if (inputConnection == null) {
            return null;
        }
        return this.f28129a.b(inputConnection, editorInfo);
    }

    public void c(boolean z8) {
        this.f28129a.c(z8);
    }

    public a(EditText editText, boolean z8) {
        this.f28130b = Integer.MAX_VALUE;
        this.f28131c = 0;
        f.h(editText, "editText cannot be null");
        this.f28129a = new C0613a(editText, z8);
    }
}
