package p176u1;

import D6.z;
import android.R;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Log;
import android.view.KeyEvent;
import android.view.inputmethod.CompletionInfo;
import android.view.inputmethod.CorrectionInfo;
import android.view.inputmethod.ExtractedText;
import android.view.inputmethod.ExtractedTextRequest;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputContentInfo;
import java.util.ArrayList;
import java.util.List;
import p128o1.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class I implements InputConnection {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3037v f34361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f34362b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f34363c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public M f34364d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f34365e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public boolean f34366f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f34367g = new ArrayList();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f34368h = true;

    public I(M m8, InterfaceC3037v interfaceC3037v, boolean z8) {
        this.f34361a = interfaceC3037v;
        this.f34362b = z8;
        this.f34364d = m8;
    }

    public final void b(InterfaceC3027k interfaceC3027k) {
        c();
        try {
            this.f34367g.add(interfaceC3027k);
        } finally {
            d();
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean beginBatchEdit() {
        boolean z8 = this.f34368h;
        return z8 ? c() : z8;
    }

    public final boolean c() {
        this.f34363c++;
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean clearMetaKeyStates(int i8) {
        boolean z8 = this.f34368h;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public void closeConnection() {
        this.f34367g.clear();
        this.f34363c = 0;
        this.f34368h = false;
        this.f34361a.e(this);
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCompletion(CompletionInfo completionInfo) {
        boolean z8 = this.f34368h;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitContent(InputContentInfo inputContentInfo, int i8, Bundle bundle) {
        boolean z8 = this.f34368h;
        if (z8) {
            return false;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitCorrection(CorrectionInfo correctionInfo) {
        boolean z8 = this.f34368h;
        return z8 ? this.f34362b : z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean commitText(CharSequence charSequence, int i8) {
        boolean z8 = this.f34368h;
        if (z8) {
            b(new C3018b(String.valueOf(charSequence), i8));
        }
        return z8;
    }

    public final boolean d() {
        int i8 = this.f34363c - 1;
        this.f34363c = i8;
        if (i8 == 0 && !this.f34367g.isEmpty()) {
            this.f34361a.d(z.U0(this.f34367g));
            this.f34367g.clear();
        }
        return this.f34363c > 0;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingText(int i8, int i9) {
        boolean z8 = this.f34368h;
        if (!z8) {
            return z8;
        }
        b(new C3025i(i8, i9));
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean deleteSurroundingTextInCodePoints(int i8, int i9) {
        boolean z8 = this.f34368h;
        if (!z8) {
            return z8;
        }
        b(new C3026j(i8, i9));
        return true;
    }

    public final void e(int i8) {
        sendKeyEvent(new KeyEvent(0, i8));
        sendKeyEvent(new KeyEvent(1, i8));
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean endBatchEdit() {
        return d();
    }

    public final void f(M m8) {
        this.f34364d = m8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean finishComposingText() {
        boolean z8 = this.f34368h;
        if (!z8) {
            return z8;
        }
        b(new C3032p());
        return true;
    }

    public final void g(M m8, InterfaceC3038w interfaceC3038w) {
        if (this.f34368h) {
            f(m8);
            if (this.f34366f) {
                interfaceC3038w.updateExtractedText(this.f34365e, AbstractC3040y.a(m8));
            }
            G gF = m8.f();
            int iL = gF != null ? G.l(gF.r()) : -1;
            G gF2 = m8.f();
            interfaceC3038w.a(G.l(m8.g()), G.k(m8.g()), iL, gF2 != null ? G.k(gF2.r()) : -1);
        }
    }

    @Override // android.view.inputmethod.InputConnection
    public int getCursorCapsMode(int i8) {
        return TextUtils.getCapsMode(this.f34364d.h(), G.l(this.f34364d.g()), i8);
    }

    @Override // android.view.inputmethod.InputConnection
    public ExtractedText getExtractedText(ExtractedTextRequest extractedTextRequest, int i8) {
        boolean z8 = (i8 & 1) != 0;
        this.f34366f = z8;
        if (z8) {
            this.f34365e = extractedTextRequest != null ? extractedTextRequest.token : 0;
        }
        return AbstractC3040y.a(this.f34364d);
    }

    @Override // android.view.inputmethod.InputConnection
    public Handler getHandler() {
        return null;
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getSelectedText(int i8) {
        if (G.h(this.f34364d.g())) {
            return null;
        }
        return N.a(this.f34364d).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextAfterCursor(int i8, int i9) {
        return N.b(this.f34364d, i8).toString();
    }

    @Override // android.view.inputmethod.InputConnection
    public CharSequence getTextBeforeCursor(int i8, int i9) {
        return N.c(this.f34364d, i8).toString();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.inputmethod.InputConnection
    public boolean performContextMenuAction(int i8) {
        boolean z8 = this.f34368h;
        if (z8) {
            z8 = false;
            switch (i8) {
                case R.id.selectAll:
                    b(new L(0, this.f34364d.h().length()));
                    break;
                case R.id.cut:
                    e(277);
                    break;
                case R.id.copy:
                    e(278);
                    break;
                case R.id.paste:
                    e(279);
                    break;
            }
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performEditorAction(int i8) {
        int iA;
        boolean z8 = this.f34368h;
        if (!z8) {
            return z8;
        }
        if (i8 != 0) {
            switch (i8) {
                case 2:
                    iA = C3035t.f34463b.c();
                    break;
                case 3:
                    iA = C3035t.f34463b.g();
                    break;
                case 4:
                    iA = C3035t.f34463b.h();
                    break;
                case 5:
                    iA = C3035t.f34463b.d();
                    break;
                case 6:
                    iA = C3035t.f34463b.b();
                    break;
                case 7:
                    iA = C3035t.f34463b.f();
                    break;
                default:
                    Log.w("RecordingIC", "IME sends unsupported Editor Action: " + i8);
                    iA = C3035t.f34463b.a();
                    break;
            }
        } else {
            iA = C3035t.f34463b.a();
        }
        this.f34361a.c(iA);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean performPrivateCommand(String str, Bundle bundle) {
        boolean z8 = this.f34368h;
        if (z8) {
            return true;
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean reportFullscreenMode(boolean z8) {
        return false;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean requestCursorUpdates(int i8) {
        boolean z8;
        boolean z9;
        boolean z10;
        boolean z11;
        boolean z12 = this.f34368h;
        if (!z12) {
            return z12;
        }
        boolean z13 = false;
        boolean z14 = (i8 & 1) != 0;
        boolean z15 = (i8 & 2) != 0;
        int i9 = Build.VERSION.SDK_INT;
        if (i9 >= 33) {
            boolean z16 = (i8 & 16) != 0;
            boolean z17 = (i8 & 8) != 0;
            boolean z18 = (i8 & 4) != 0;
            if (i9 >= 34 && (i8 & 32) != 0) {
                z13 = true;
            }
            if (z16 || z17 || z18 || z13) {
                z9 = z13;
                z8 = z18;
                z11 = z17;
                z10 = z16;
            } else if (i9 >= 34) {
                z10 = true;
                z11 = true;
                z8 = true;
                z9 = true;
            } else {
                z9 = z13;
                z10 = true;
                z11 = true;
                z8 = true;
            }
        } else {
            z8 = false;
            z9 = false;
            z10 = true;
            z11 = true;
        }
        this.f34361a.b(z14, z15, z10, z11, z8, z9);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean sendKeyEvent(KeyEvent keyEvent) {
        boolean z8 = this.f34368h;
        if (!z8) {
            return z8;
        }
        this.f34361a.a(keyEvent);
        return true;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingRegion(int i8, int i9) {
        boolean z8 = this.f34368h;
        if (z8) {
            b(new J(i8, i9));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setComposingText(CharSequence charSequence, int i8) {
        boolean z8 = this.f34368h;
        if (z8) {
            b(new K(String.valueOf(charSequence), i8));
        }
        return z8;
    }

    @Override // android.view.inputmethod.InputConnection
    public boolean setSelection(int i8, int i9) {
        boolean z8 = this.f34368h;
        if (!z8) {
            return z8;
        }
        b(new L(i8, i9));
        return true;
    }
}
