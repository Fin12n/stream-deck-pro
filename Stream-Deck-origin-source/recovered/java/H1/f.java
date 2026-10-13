package H1;

import U1.AbstractC1652n;
import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.D;
import androidx.lifecycle.InterfaceC1733p;
import p010b0.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f extends Activity implements InterfaceC1733p, AbstractC1652n.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C f3335a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.lifecycle.r f3336b = new androidx.lifecycle.r(this);

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyEvent(KeyEvent event) {
        kotlin.jvm.internal.t.g(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.t.f(decorView, "window.decorView");
        if (AbstractC1652n.a(decorView, event)) {
            return true;
        }
        return AbstractC1652n.b(this, decorView, this, event);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public boolean dispatchKeyShortcutEvent(KeyEvent event) {
        kotlin.jvm.internal.t.g(event, "event");
        View decorView = getWindow().getDecorView();
        kotlin.jvm.internal.t.f(decorView, "window.decorView");
        if (AbstractC1652n.a(decorView, event)) {
            return true;
        }
        return super.dispatchKeyShortcutEvent(event);
    }

    @Override // U1.AbstractC1652n.a
    public boolean o(KeyEvent event) {
        kotlin.jvm.internal.t.g(event, "event");
        return super.dispatchKeyEvent(event);
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        D.f15213b.c(this);
    }

    @Override // android.app.Activity
    public void onSaveInstanceState(Bundle outState) {
        kotlin.jvm.internal.t.g(outState, "outState");
        this.f3336b.n(AbstractC1726i.b.CREATED);
        super.onSaveInstanceState(outState);
    }

    @Override // androidx.lifecycle.InterfaceC1733p
    public AbstractC1726i w() {
        return this.f3336b;
    }

    public final boolean x(String[] strArr) {
        return !y(strArr);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0033, code lost:
    
        if (r4.equals("--list-dumpables") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x003c, code lost:
    
        if (r4.equals("--dump-dumpable") == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0043, code lost:
    
        if (android.os.Build.VERSION.SDK_INT < 33) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0045, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0046, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean y(String[] strArr) {
        if (strArr != null && strArr.length != 0) {
            String str = strArr[0];
            switch (str.hashCode()) {
                case -645125871:
                    if (str.equals("--translation") && Build.VERSION.SDK_INT >= 31) {
                        return true;
                    }
                    break;
                case 100470631:
                    break;
                case 472614934:
                    break;
                case 1159329357:
                    return str.equals("--contentcapture") && Build.VERSION.SDK_INT >= 29;
                case 1455016274:
                    if (str.equals("--autofill")) {
                        return true;
                    }
                    break;
            }
        }
        return false;
    }
}
