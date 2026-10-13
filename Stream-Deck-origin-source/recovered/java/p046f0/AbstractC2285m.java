package p046f0;

import Z0.c;
import Z0.d;
import Z0.g;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import p056g1.AbstractC2345i;
import p056g1.InterfaceC2344h;

/* JADX INFO: renamed from: f0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2285m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final long f21488a = ViewConfiguration.getTapTimeout();

    public static final long a() {
        return f21488a;
    }

    public static final boolean b(KeyEvent keyEvent) {
        return c.e(d.b(keyEvent), c.f12836a.b()) && d(keyEvent);
    }

    public static final boolean c(InterfaceC2344h interfaceC2344h) {
        return e((View) AbstractC2345i.a(interfaceC2344h, AndroidCompositionLocals_androidKt.j()));
    }

    public static final boolean d(KeyEvent keyEvent) {
        int iB = g.b(d.a(keyEvent));
        return iB == 23 || iB == 66 || iB == 160;
    }

    public static final boolean e(View view) {
        ViewParent parent = view.getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    public static final boolean f(KeyEvent keyEvent) {
        return c.e(d.b(keyEvent), c.f12836a.a()) && d(keyEvent);
    }
}
