package p117n;

import android.content.res.TypedArray;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import p054g.j;
import p084j2.a;

/* JADX INFO: renamed from: n.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C2710l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final EditText f30411a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f30412b;

    public C2710l(EditText editText) {
        this.f30411a = editText;
        this.f30412b = new a(editText, false);
    }

    public KeyListener a(KeyListener keyListener) {
        return b(keyListener) ? this.f30412b.a(keyListener) : keyListener;
    }

    public boolean b(KeyListener keyListener) {
        return !(keyListener instanceof NumberKeyListener);
    }

    public void c(AttributeSet attributeSet, int i8) {
        TypedArray typedArrayObtainStyledAttributes = this.f30411a.getContext().obtainStyledAttributes(attributeSet, j.f22675g0, i8, 0);
        try {
            boolean z8 = typedArrayObtainStyledAttributes.hasValue(j.f22745u0) ? typedArrayObtainStyledAttributes.getBoolean(j.f22745u0, true) : true;
            typedArrayObtainStyledAttributes.recycle();
            e(z8);
        } catch (Throwable th) {
            typedArrayObtainStyledAttributes.recycle();
            throw th;
        }
    }

    public InputConnection d(InputConnection inputConnection, EditorInfo editorInfo) {
        return this.f30412b.b(inputConnection, editorInfo);
    }

    public void e(boolean z8) {
        this.f30412b.c(z8);
    }
}
