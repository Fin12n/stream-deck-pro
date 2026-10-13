package p063h;

import U1.AbstractC1652n;
import U1.AbstractC1653o;
import U1.I;
import U1.InterfaceC1662y;
import U1.S;
import U1.U;
import U1.c0;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.InterfaceC1733p;
import com.pairip.VMRunner;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParser;
import p010b0.C;
import p117n.C2708j;
import p117n.F;
import p117n.X;
import p117n.d0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class g extends p063h.e implements androidx.appcompat.view.menu.e.a, LayoutInflater.Factory2 {

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public static final C f23902v0 = new C();

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public static final boolean f23903w0 = false;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public static final int[] f23904x0 = {R.attr.windowBackground};

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public static final boolean f23905y0 = !"robolectric".equals(Build.FINGERPRINT);

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f23906A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public ViewGroup f23907B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public TextView f23908C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public View f23909D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f23910E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public boolean f23911F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public boolean f23912G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f23913H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public boolean f23914I;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public boolean f23915V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public boolean f23916W;

    /* JADX INFO: renamed from: X, reason: collision with root package name */
    public boolean f23917X;

    /* JADX INFO: renamed from: Y, reason: collision with root package name */
    public q[] f23918Y;

    /* JADX INFO: renamed from: Z, reason: collision with root package name */
    public q f23919Z;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public boolean f23920a0;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public boolean f23921b0;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public boolean f23922c0;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f23923d0;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public Configuration f23924e0;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public int f23925f0;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public int f23926g0;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public int f23927h0;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public boolean f23928i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Object f23929j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public n f23930j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final Context f23931k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public n f23932k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window f23933l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public boolean f23934l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public l f23935m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public int f23936m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final p063h.c f23937n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final Runnable f23938n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public p063h.a f23939o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public boolean f23940o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public MenuInflater f23941p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public Rect f23942p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public CharSequence f23943q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public Rect f23944q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public F f23945r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public p063h.m f23946r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public f f23947s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public p063h.o f23948s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public r f23949t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public OnBackInvokedDispatcher f23950t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public p099l.b f23951u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public OnBackInvokedCallback f23952u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public ActionBarContextView f23953v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public PopupWindow f23954w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Runnable f23955x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public S f23956y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f23957z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            if ((gVar.f23936m0 & 1) != 0) {
                gVar.g0(0);
            }
            g gVar2 = g.this;
            if ((gVar2.f23936m0 & 4096) != 0) {
                gVar2.g0(108);
            }
            g gVar3 = g.this;
            gVar3.f23934l0 = false;
            gVar3.f23936m0 = 0;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements InterfaceC1662y {
        public b() {
        }

        @Override // U1.InterfaceC1662y
        public c0 a(View view, c0 c0Var) {
            int iL = c0Var.l();
            int iD1 = g.this.d1(c0Var, null);
            if (iL != iD1) {
                c0Var = c0Var.q(c0Var.j(), iD1, c0Var.k(), c0Var.i());
            }
            return I.A(view, c0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements Runnable {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a extends U {
            public a() {
            }

            @Override // U1.U, U1.T
            public void b(View view) {
                g.this.f23953v.setAlpha(1.0f);
                g.this.f23956y.g(null);
                g.this.f23956y = null;
            }

            @Override // U1.U, U1.T
            public void c(View view) {
                g.this.f23953v.setVisibility(0);
            }
        }

        public d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g gVar = g.this;
            gVar.f23954w.showAtLocation(gVar.f23953v, 55, 0, 0);
            g.this.h0();
            if (!g.this.S0()) {
                g.this.f23953v.setAlpha(1.0f);
                g.this.f23953v.setVisibility(0);
            } else {
                g.this.f23953v.setAlpha(0.0f);
                g gVar2 = g.this;
                gVar2.f23956y = I.c(gVar2.f23953v).b(1.0f);
                g.this.f23956y.g(new a());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class e extends U {
        public e() {
        }

        @Override // U1.U, U1.T
        public void b(View view) {
            g.this.f23953v.setAlpha(1.0f);
            g.this.f23956y.g(null);
            g.this.f23956y = null;
        }

        @Override // U1.U, U1.T
        public void c(View view) {
            g.this.f23953v.setVisibility(0);
            if (g.this.f23953v.getParent() instanceof View) {
                I.F((View) g.this.f23953v.getParent());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class f implements androidx.appcompat.view.menu.i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z8) {
            g.this.X(eVar);
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackT0 = g.this.t0();
            if (callbackT0 == null) {
                return true;
            }
            callbackT0.onMenuOpened(108, eVar);
            return true;
        }
    }

    /* JADX INFO: renamed from: h.g$g, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0555g implements l.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public l.b.a f23965a;

        /* JADX INFO: renamed from: h.g$g$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a extends U {
            public a() {
            }

            @Override // U1.U, U1.T
            public void b(View view) {
                g.this.f23953v.setVisibility(8);
                g gVar = g.this;
                PopupWindow popupWindow = gVar.f23954w;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (gVar.f23953v.getParent() instanceof View) {
                    I.F((View) g.this.f23953v.getParent());
                }
                g.this.f23953v.k();
                g.this.f23956y.g(null);
                g gVar2 = g.this;
                gVar2.f23956y = null;
                I.F(gVar2.f23907B);
            }
        }

        public C0555g(l.b.a aVar) {
            this.f23965a = aVar;
        }

        @Override // l.b.a
        public boolean a(p099l.b bVar, Menu menu) {
            return this.f23965a.a(bVar, menu);
        }

        @Override // l.b.a
        public boolean b(p099l.b bVar, Menu menu) {
            I.F(g.this.f23907B);
            return this.f23965a.b(bVar, menu);
        }

        @Override // l.b.a
        public void c(p099l.b bVar) {
            this.f23965a.c(bVar);
            g gVar = g.this;
            if (gVar.f23954w != null) {
                gVar.f23933l.getDecorView().removeCallbacks(g.this.f23955x);
            }
            g gVar2 = g.this;
            if (gVar2.f23953v != null) {
                gVar2.h0();
                g gVar3 = g.this;
                gVar3.f23956y = I.c(gVar3.f23953v).b(0.0f);
                g.this.f23956y.g(new a());
            }
            g gVar4 = g.this;
            p063h.c cVar = gVar4.f23937n;
            if (cVar != null) {
                cVar.v(gVar4.f23951u);
            }
            g gVar5 = g.this;
            gVar5.f23951u = null;
            I.F(gVar5.f23907B);
            g.this.b1();
        }

        @Override // l.b.a
        public boolean d(p099l.b bVar, MenuItem menuItem) {
            return this.f23965a.d(bVar, menuItem);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class h {
        public static boolean a(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        public static String b(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class i {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            LocaleList locales = configuration.getLocales();
            LocaleList locales2 = configuration2.getLocales();
            if (locales.equals(locales2)) {
                return;
            }
            configuration3.setLocales(locales2);
            configuration3.locale = configuration2.locale;
        }

        public static P1.g b(Configuration configuration) {
            return P1.g.b(configuration.getLocales().toLanguageTags());
        }

        public static void c(P1.g gVar) {
            LocaleList.setDefault(LocaleList.forLanguageTags(gVar.h()));
        }

        public static void d(Configuration configuration, P1.g gVar) {
            configuration.setLocales(LocaleList.forLanguageTags(gVar.h()));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class j {
        public static void a(Configuration configuration, Configuration configuration2, Configuration configuration3) {
            int i8 = configuration.colorMode & 3;
            int i9 = configuration2.colorMode;
            if (i8 != (i9 & 3)) {
                configuration3.colorMode |= i9 & 3;
            }
            int i10 = configuration.colorMode & 12;
            int i11 = configuration2.colorMode;
            if (i10 != (i11 & 12)) {
                configuration3.colorMode |= i11 & 12;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class k {
        public static OnBackInvokedDispatcher a(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(Object obj, final g gVar) {
            Objects.requireNonNull(gVar);
            OnBackInvokedCallback onBackInvokedCallback = new OnBackInvokedCallback() { // from class: h.j
                public final void onBackInvoked() {
                    gVar.B0();
                }
            };
            p063h.i.a(obj).registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        public static void c(Object obj, Object obj2) {
            p063h.i.a(obj).unregisterOnBackInvokedCallback(p063h.h.a(obj2));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class l extends p099l.i {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f23968b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f23969c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f23970d;

        public l(Window.Callback callback) {
            super(callback);
        }

        public boolean b(Window.Callback callback, KeyEvent keyEvent) {
            try {
                this.f23969c = true;
                return callback.dispatchKeyEvent(keyEvent);
            } finally {
                this.f23969c = false;
            }
        }

        public void c(Window.Callback callback) {
            try {
                this.f23968b = true;
                callback.onContentChanged();
            } finally {
                this.f23968b = false;
            }
        }

        public void d(Window.Callback callback, int i8, Menu menu) {
            try {
                this.f23970d = true;
                callback.onPanelClosed(i8, menu);
            } finally {
                this.f23970d = false;
            }
        }

        @Override // p099l.i, android.view.Window.Callback
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            if (this.f23969c) {
                return a().dispatchKeyEvent(keyEvent);
            }
            return g.this.f0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // p099l.i, android.view.Window.Callback
        public boolean dispatchKeyShortcutEvent(KeyEvent keyEvent) {
            return super.dispatchKeyShortcutEvent(keyEvent) || g.this.E0(keyEvent.getKeyCode(), keyEvent);
        }

        public final ActionMode e(ActionMode.Callback callback) {
            l.f.a aVar = new l.f.a(g.this.f23931k, callback);
            p099l.b bVarV0 = g.this.V0(aVar);
            if (bVarV0 != null) {
                return aVar.e(bVarV0);
            }
            return null;
        }

        @Override // p099l.i, android.view.Window.Callback
        public void onContentChanged() {
            if (this.f23968b) {
                a().onContentChanged();
            }
        }

        @Override // p099l.i, android.view.Window.Callback
        public boolean onCreatePanelMenu(int i8, Menu menu) {
            if (i8 != 0 || (menu instanceof androidx.appcompat.view.menu.e)) {
                return super.onCreatePanelMenu(i8, menu);
            }
            return false;
        }

        @Override // p099l.i, android.view.Window.Callback
        public View onCreatePanelView(int i8) {
            return super.onCreatePanelView(i8);
        }

        @Override // p099l.i, android.view.Window.Callback
        public boolean onMenuOpened(int i8, Menu menu) {
            super.onMenuOpened(i8, menu);
            g.this.H0(i8);
            return true;
        }

        @Override // p099l.i, android.view.Window.Callback
        public void onPanelClosed(int i8, Menu menu) {
            if (this.f23970d) {
                a().onPanelClosed(i8, menu);
            } else {
                super.onPanelClosed(i8, menu);
                g.this.I0(i8);
            }
        }

        @Override // p099l.i, android.view.Window.Callback
        public boolean onPreparePanel(int i8, View view, Menu menu) {
            androidx.appcompat.view.menu.e eVar = menu instanceof androidx.appcompat.view.menu.e ? (androidx.appcompat.view.menu.e) menu : null;
            if (i8 == 0 && eVar == null) {
                return false;
            }
            if (eVar != null) {
                eVar.b0(true);
            }
            boolean zOnPreparePanel = super.onPreparePanel(i8, view, menu);
            if (eVar != null) {
                eVar.b0(false);
            }
            return zOnPreparePanel;
        }

        @Override // p099l.i, android.view.Window.Callback
        public void onProvideKeyboardShortcuts(List list, Menu menu, int i8) {
            androidx.appcompat.view.menu.e eVar;
            q qVarR0 = g.this.r0(0, true);
            if (qVarR0 == null || (eVar = qVarR0.f23989j) == null) {
                super.onProvideKeyboardShortcuts(list, menu, i8);
            } else {
                super.onProvideKeyboardShortcuts(list, eVar, i8);
            }
        }

        @Override // p099l.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        @Override // p099l.i, android.view.Window.Callback
        public ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int i8) {
            return (g.this.z0() && i8 == 0) ? e(callback) : super.onWindowStartingActionMode(callback, i8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class m extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final PowerManager f23972c;

        public m(Context context) {
            super();
            this.f23972c = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        @Override // h.g.n
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return intentFilter;
        }

        @Override // h.g.n
        public int c() {
            return h.a(this.f23972c) ? 2 : 1;
        }

        @Override // h.g.n
        public void d() {
            g.this.R();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public abstract class n {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public BroadcastReceiver f23974a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a extends BroadcastReceiver {
            public a() {
            }

            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context, Intent intent) {
                VMRunner.invoke("kJkcSso8xVhu99Ca", new Object[]{this, context, intent});
            }
        }

        public n() {
        }

        public void a() {
            BroadcastReceiver broadcastReceiver = this.f23974a;
            if (broadcastReceiver != null) {
                try {
                    g.this.f23931k.unregisterReceiver(broadcastReceiver);
                } catch (IllegalArgumentException unused) {
                }
                this.f23974a = null;
            }
        }

        public abstract IntentFilter b();

        public abstract int c();

        public abstract void d();

        public void e() {
            a();
            IntentFilter intentFilterB = b();
            if (intentFilterB == null || intentFilterB.countActions() == 0) {
                return;
            }
            if (this.f23974a == null) {
                this.f23974a = new a();
            }
            g.this.f23931k.registerReceiver(this.f23974a, intentFilterB);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class o extends n {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final p063h.r f23977c;

        public o(p063h.r rVar) {
            super();
            this.f23977c = rVar;
        }

        @Override // h.g.n
        public IntentFilter b() {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.TIME_SET");
            intentFilter.addAction("android.intent.action.TIMEZONE_CHANGED");
            intentFilter.addAction("android.intent.action.TIME_TICK");
            return intentFilter;
        }

        @Override // h.g.n
        public int c() {
            return this.f23977c.d() ? 2 : 1;
        }

        @Override // h.g.n
        public void d() {
            g.this.R();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class p extends ContentFrameLayout {
        public p(Context context) {
            super(context);
        }

        public final boolean b(int i8, int i9) {
            return i8 < -5 || i9 < -5 || i8 > getWidth() + 5 || i9 > getHeight() + 5;
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchKeyEvent(KeyEvent keyEvent) {
            return g.this.f0(keyEvent) || super.dispatchKeyEvent(keyEvent);
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            if (motionEvent.getAction() != 0 || !b((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return super.onInterceptTouchEvent(motionEvent);
            }
            g.this.Z(0);
            return true;
        }

        @Override // android.view.View
        public void setBackgroundResource(int i8) {
            setBackgroundDrawable(p072i.a.b(getContext(), i8));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f23980a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f23981b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f23982c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f23983d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f23984e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f23985f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public ViewGroup f23986g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public View f23987h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public View f23988i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f23989j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public androidx.appcompat.view.menu.c f23990k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public Context f23991l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public boolean f23992m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public boolean f23993n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public boolean f23994o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public boolean f23995p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public boolean f23996q = false;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        public boolean f23997r;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        public Bundle f23998s;

        public q(int i8) {
            this.f23980a = i8;
        }

        public androidx.appcompat.view.menu.j a(androidx.appcompat.view.menu.i.a aVar) {
            if (this.f23989j == null) {
                return null;
            }
            if (this.f23990k == null) {
                androidx.appcompat.view.menu.c cVar = new androidx.appcompat.view.menu.c(this.f23991l, p054g.g.f22512j);
                this.f23990k = cVar;
                cVar.h(aVar);
                this.f23989j.b(this.f23990k);
            }
            return this.f23990k.b(this.f23986g);
        }

        public boolean b() {
            if (this.f23987h == null) {
                return false;
            }
            return this.f23988i != null || this.f23990k.a().getCount() > 0;
        }

        public void c(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.c cVar;
            androidx.appcompat.view.menu.e eVar2 = this.f23989j;
            if (eVar == eVar2) {
                return;
            }
            if (eVar2 != null) {
                eVar2.P(this.f23990k);
            }
            this.f23989j = eVar;
            if (eVar == null || (cVar = this.f23990k) == null) {
                return;
            }
            eVar.b(cVar);
        }

        public void d(Context context) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme themeNewTheme = context.getResources().newTheme();
            themeNewTheme.setTo(context.getTheme());
            themeNewTheme.resolveAttribute(p054g.a.f22371a, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                themeNewTheme.applyStyle(i8, true);
            }
            themeNewTheme.resolveAttribute(p054g.a.f22361G, typedValue, true);
            int i9 = typedValue.resourceId;
            if (i9 != 0) {
                themeNewTheme.applyStyle(i9, true);
            } else {
                themeNewTheme.applyStyle(p054g.i.f22534a, true);
            }
            p099l.d dVar = new p099l.d(context, 0);
            dVar.getTheme().setTo(themeNewTheme);
            this.f23991l = dVar;
            TypedArray typedArrayObtainStyledAttributes = dVar.obtainStyledAttributes(p054g.j.f22765y0);
            this.f23981b = typedArrayObtainStyledAttributes.getResourceId(p054g.j.f22543B0, 0);
            this.f23985f = typedArrayObtainStyledAttributes.getResourceId(p054g.j.f22538A0, 0);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public final class r implements androidx.appcompat.view.menu.i.a {
        public r() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z8) {
            androidx.appcompat.view.menu.e eVarD = eVar.D();
            boolean z9 = eVarD != eVar;
            g gVar = g.this;
            if (z9) {
                eVar = eVarD;
            }
            q qVarK0 = gVar.k0(eVar);
            if (qVarK0 != null) {
                if (!z9) {
                    g.this.a0(qVarK0, z8);
                } else {
                    g.this.W(qVarK0.f23980a, qVarK0, eVarD);
                    g.this.a0(qVarK0, true);
                }
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            Window.Callback callbackT0;
            if (eVar != eVar.D()) {
                return true;
            }
            g gVar = g.this;
            if (!gVar.f23912G || (callbackT0 = gVar.t0()) == null || g.this.f23923d0) {
                return true;
            }
            callbackT0.onMenuOpened(108, eVar);
            return true;
        }
    }

    public g(Activity activity, p063h.c cVar) {
        this(activity, null, cVar, activity);
    }

    public static Configuration l0(Configuration configuration, Configuration configuration2) {
        Configuration configuration3 = new Configuration();
        configuration3.fontScale = 0.0f;
        if (configuration2 != null && configuration.diff(configuration2) != 0) {
            float f8 = configuration.fontScale;
            float f9 = configuration2.fontScale;
            if (f8 != f9) {
                configuration3.fontScale = f9;
            }
            int i8 = configuration.mcc;
            int i9 = configuration2.mcc;
            if (i8 != i9) {
                configuration3.mcc = i9;
            }
            int i10 = configuration.mnc;
            int i11 = configuration2.mnc;
            if (i10 != i11) {
                configuration3.mnc = i11;
            }
            i.a(configuration, configuration2, configuration3);
            int i12 = configuration.touchscreen;
            int i13 = configuration2.touchscreen;
            if (i12 != i13) {
                configuration3.touchscreen = i13;
            }
            int i14 = configuration.keyboard;
            int i15 = configuration2.keyboard;
            if (i14 != i15) {
                configuration3.keyboard = i15;
            }
            int i16 = configuration.keyboardHidden;
            int i17 = configuration2.keyboardHidden;
            if (i16 != i17) {
                configuration3.keyboardHidden = i17;
            }
            int i18 = configuration.navigation;
            int i19 = configuration2.navigation;
            if (i18 != i19) {
                configuration3.navigation = i19;
            }
            int i20 = configuration.navigationHidden;
            int i21 = configuration2.navigationHidden;
            if (i20 != i21) {
                configuration3.navigationHidden = i21;
            }
            int i22 = configuration.orientation;
            int i23 = configuration2.orientation;
            if (i22 != i23) {
                configuration3.orientation = i23;
            }
            int i24 = configuration.screenLayout & 15;
            int i25 = configuration2.screenLayout;
            if (i24 != (i25 & 15)) {
                configuration3.screenLayout |= i25 & 15;
            }
            int i26 = configuration.screenLayout & 192;
            int i27 = configuration2.screenLayout;
            if (i26 != (i27 & 192)) {
                configuration3.screenLayout |= i27 & 192;
            }
            int i28 = configuration.screenLayout & 48;
            int i29 = configuration2.screenLayout;
            if (i28 != (i29 & 48)) {
                configuration3.screenLayout |= i29 & 48;
            }
            int i30 = configuration.screenLayout & 768;
            int i31 = configuration2.screenLayout;
            if (i30 != (i31 & 768)) {
                configuration3.screenLayout |= i31 & 768;
            }
            j.a(configuration, configuration2, configuration3);
            int i32 = configuration.uiMode & 15;
            int i33 = configuration2.uiMode;
            if (i32 != (i33 & 15)) {
                configuration3.uiMode |= i33 & 15;
            }
            int i34 = configuration.uiMode & 48;
            int i35 = configuration2.uiMode;
            if (i34 != (i35 & 48)) {
                configuration3.uiMode |= i35 & 48;
            }
            int i36 = configuration.screenWidthDp;
            int i37 = configuration2.screenWidthDp;
            if (i36 != i37) {
                configuration3.screenWidthDp = i37;
            }
            int i38 = configuration.screenHeightDp;
            int i39 = configuration2.screenHeightDp;
            if (i38 != i39) {
                configuration3.screenHeightDp = i39;
            }
            int i40 = configuration.smallestScreenWidthDp;
            int i41 = configuration2.smallestScreenWidthDp;
            if (i40 != i41) {
                configuration3.smallestScreenWidthDp = i41;
            }
            int i42 = configuration.densityDpi;
            int i43 = configuration2.densityDpi;
            if (i42 != i43) {
                configuration3.densityDpi = i43;
            }
        }
        return configuration3;
    }

    public int A0(Context context, int i8) {
        if (i8 == -100) {
            return -1;
        }
        if (i8 != -1) {
            if (i8 == 0) {
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return p0(context).c();
            }
            if (i8 != 1 && i8 != 2) {
                if (i8 == 3) {
                    return o0(context).c();
                }
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
            }
        }
        return i8;
    }

    @Override // p063h.e
    public void B() {
        Q(true, false);
    }

    public boolean B0() {
        boolean z8 = this.f23920a0;
        this.f23920a0 = false;
        q qVarR0 = r0(0, false);
        if (qVarR0 != null && qVarR0.f23994o) {
            if (!z8) {
                a0(qVarR0, true);
            }
            return true;
        }
        p099l.b bVar = this.f23951u;
        if (bVar != null) {
            bVar.c();
            return true;
        }
        p063h.a aVarR = r();
        return aVarR != null && aVarR.g();
    }

    @Override // p063h.e
    public void C() {
        p063h.a aVarR = r();
        if (aVarR != null) {
            aVarR.r(false);
        }
    }

    public boolean C0(int i8, KeyEvent keyEvent) {
        if (i8 == 4) {
            this.f23920a0 = (keyEvent.getFlags() & 128) != 0;
        } else if (i8 == 82) {
            D0(0, keyEvent);
            return true;
        }
        return false;
    }

    public final boolean D0(int i8, KeyEvent keyEvent) {
        if (keyEvent.getRepeatCount() != 0) {
            return false;
        }
        q qVarR0 = r0(i8, true);
        if (qVarR0.f23994o) {
            return false;
        }
        return N0(qVarR0, keyEvent);
    }

    public boolean E0(int i8, KeyEvent keyEvent) {
        p063h.a aVarR = r();
        if (aVarR != null && aVarR.n(i8, keyEvent)) {
            return true;
        }
        q qVar = this.f23919Z;
        if (qVar != null && M0(qVar, keyEvent.getKeyCode(), keyEvent, 1)) {
            q qVar2 = this.f23919Z;
            if (qVar2 != null) {
                qVar2.f23993n = true;
            }
            return true;
        }
        if (this.f23919Z == null) {
            q qVarR0 = r0(0, true);
            N0(qVarR0, keyEvent);
            boolean zM0 = M0(qVarR0, keyEvent.getKeyCode(), keyEvent, 1);
            qVarR0.f23992m = false;
            if (zM0) {
                return true;
            }
        }
        return false;
    }

    @Override // p063h.e
    public boolean F(int i8) {
        int iP0 = P0(i8);
        if (this.f23916W && iP0 == 108) {
            return false;
        }
        if (this.f23912G && iP0 == 1) {
            this.f23912G = false;
        }
        if (iP0 == 1) {
            X0();
            this.f23916W = true;
            return true;
        }
        if (iP0 == 2) {
            X0();
            this.f23910E = true;
            return true;
        }
        if (iP0 == 5) {
            X0();
            this.f23911F = true;
            return true;
        }
        if (iP0 == 10) {
            X0();
            this.f23914I = true;
            return true;
        }
        if (iP0 == 108) {
            X0();
            this.f23912G = true;
            return true;
        }
        if (iP0 != 109) {
            return this.f23933l.requestFeature(iP0);
        }
        X0();
        this.f23913H = true;
        return true;
    }

    public boolean F0(int i8, KeyEvent keyEvent) {
        if (i8 != 4) {
            if (i8 == 82) {
                G0(0, keyEvent);
                return true;
            }
        } else if (B0()) {
            return true;
        }
        return false;
    }

    @Override // p063h.e
    public void G(int i8) {
        i0();
        ViewGroup viewGroup = (ViewGroup) this.f23907B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.f23931k).inflate(i8, viewGroup);
        this.f23935m.c(this.f23933l.getCallback());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0062  */
    public final boolean G0(int i8, KeyEvent keyEvent) {
        boolean zN0;
        F f8;
        if (this.f23951u != null) {
            return false;
        }
        boolean zF = true;
        q qVarR0 = r0(i8, true);
        if (i8 != 0 || (f8 = this.f23945r) == null || !f8.d() || ViewConfiguration.get(this.f23931k).hasPermanentMenuKey()) {
            boolean z8 = qVarR0.f23994o;
            if (z8 || qVarR0.f23993n) {
                a0(qVarR0, true);
                zF = z8;
            } else if (qVarR0.f23992m) {
                if (qVarR0.f23997r) {
                    qVarR0.f23992m = false;
                    zN0 = N0(qVarR0, keyEvent);
                } else {
                    zN0 = true;
                }
                if (zN0) {
                    K0(qVarR0, keyEvent);
                } else {
                    zF = false;
                }
            } else {
                zF = false;
            }
        } else if (this.f23945r.b()) {
            zF = this.f23945r.f();
        } else if (this.f23923d0 || !N0(qVarR0, keyEvent)) {
            zF = false;
        } else {
            zF = this.f23945r.g();
        }
        if (zF) {
            AudioManager audioManager = (AudioManager) this.f23931k.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
                return zF;
            }
            Log.w("AppCompatDelegate", "Couldn't get audio manager");
        }
        return zF;
    }

    @Override // p063h.e
    public void H(View view) {
        i0();
        ViewGroup viewGroup = (ViewGroup) this.f23907B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.f23935m.c(this.f23933l.getCallback());
    }

    public void H0(int i8) {
        p063h.a aVarR;
        if (i8 != 108 || (aVarR = r()) == null) {
            return;
        }
        aVarR.h(true);
    }

    @Override // p063h.e
    public void I(View view, ViewGroup.LayoutParams layoutParams) {
        i0();
        ViewGroup viewGroup = (ViewGroup) this.f23907B.findViewById(R.id.content);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.f23935m.c(this.f23933l.getCallback());
    }

    public void I0(int i8) {
        if (i8 == 108) {
            p063h.a aVarR = r();
            if (aVarR != null) {
                aVarR.h(false);
                return;
            }
            return;
        }
        if (i8 == 0) {
            q qVarR0 = r0(i8, true);
            if (qVarR0.f23994o) {
                a0(qVarR0, false);
            }
        }
    }

    @Override // p063h.e
    public void J(int i8) {
        if (this.f23925f0 != i8) {
            this.f23925f0 = i8;
            if (this.f23921b0) {
                R();
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:13:0x002c  */
    @Override // p063h.e
    public void K(OnBackInvokedDispatcher onBackInvokedDispatcher) {
        OnBackInvokedCallback onBackInvokedCallback;
        super.K(onBackInvokedDispatcher);
        OnBackInvokedDispatcher onBackInvokedDispatcher2 = this.f23950t0;
        if (onBackInvokedDispatcher2 != null && (onBackInvokedCallback = this.f23952u0) != null) {
            k.c(onBackInvokedDispatcher2, onBackInvokedCallback);
            this.f23952u0 = null;
        }
        if (onBackInvokedDispatcher == null) {
            Object obj = this.f23929j;
            if (!(obj instanceof Activity) || ((Activity) obj).getWindow() == null) {
                this.f23950t0 = onBackInvokedDispatcher;
            } else {
                this.f23950t0 = k.a((Activity) this.f23929j);
            }
        } else {
            this.f23950t0 = onBackInvokedDispatcher;
        }
        b1();
    }

    /* JADX WARN: Code duplicated, block: B:64:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:70:? A[RETURN, SYNTHETIC] */
    public final void K0(q qVar, KeyEvent keyEvent) {
        int i8;
        ViewGroup.LayoutParams layoutParams;
        if (qVar.f23994o || this.f23923d0) {
            return;
        }
        if (qVar.f23980a == 0 && (this.f23931k.getResources().getConfiguration().screenLayout & 15) == 4) {
            return;
        }
        Window.Callback callbackT0 = t0();
        if (callbackT0 != null && !callbackT0.onMenuOpened(qVar.f23980a, qVar.f23989j)) {
            a0(qVar, true);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f23931k.getSystemService("window");
        if (windowManager != null && N0(qVar, keyEvent)) {
            ViewGroup viewGroup = qVar.f23986g;
            if (viewGroup != null && !qVar.f23996q) {
                View view = qVar.f23988i;
                if (view != null && (layoutParams = view.getLayoutParams()) != null && layoutParams.width == -1) {
                    i8 = -1;
                }
                qVar.f23993n = false;
                WindowManager.LayoutParams layoutParams2 = new WindowManager.LayoutParams(i8, -2, qVar.f23983d, qVar.f23984e, 1002, 8519680, -3);
                layoutParams2.gravity = qVar.f23982c;
                layoutParams2.windowAnimations = qVar.f23985f;
                windowManager.addView(qVar.f23986g, layoutParams2);
                qVar.f23994o = true;
                if (qVar.f23980a == 0) {
                    b1();
                }
            }
            if (viewGroup == null) {
                if (!w0(qVar) || qVar.f23986g == null) {
                    return;
                }
            } else if (qVar.f23996q && viewGroup.getChildCount() > 0) {
                qVar.f23986g.removeAllViews();
            }
            if (!v0(qVar) || !qVar.b()) {
                qVar.f23996q = true;
                return;
            }
            ViewGroup.LayoutParams layoutParams3 = qVar.f23987h.getLayoutParams();
            if (layoutParams3 == null) {
                layoutParams3 = new ViewGroup.LayoutParams(-2, -2);
            }
            qVar.f23986g.setBackgroundResource(qVar.f23981b);
            ViewParent parent = qVar.f23987h.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(qVar.f23987h);
            }
            qVar.f23986g.addView(qVar.f23987h, layoutParams3);
            if (!qVar.f23987h.hasFocus()) {
                qVar.f23987h.requestFocus();
            }
            i8 = -2;
            qVar.f23993n = false;
            WindowManager.LayoutParams layoutParams4 = new WindowManager.LayoutParams(i8, -2, qVar.f23983d, qVar.f23984e, 1002, 8519680, -3);
            layoutParams4.gravity = qVar.f23982c;
            layoutParams4.windowAnimations = qVar.f23985f;
            windowManager.addView(qVar.f23986g, layoutParams4);
            qVar.f23994o = true;
            if (qVar.f23980a == 0) {
                b1();
            }
        }
    }

    @Override // p063h.e
    public void L(int i8) {
        this.f23926g0 = i8;
    }

    public final p063h.a L0() {
        return this.f23939o;
    }

    @Override // p063h.e
    public final void M(CharSequence charSequence) {
        this.f23943q = charSequence;
        F f8 = this.f23945r;
        if (f8 != null) {
            f8.setWindowTitle(charSequence);
            return;
        }
        if (L0() != null) {
            L0().s(charSequence);
            return;
        }
        TextView textView = this.f23908C;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    public final boolean M0(q qVar, int i8, KeyEvent keyEvent, int i9) {
        androidx.appcompat.view.menu.e eVar;
        boolean zPerformShortcut = false;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((qVar.f23992m || N0(qVar, keyEvent)) && (eVar = qVar.f23989j) != null) {
            zPerformShortcut = eVar.performShortcut(i8, keyEvent, i9);
        }
        if (zPerformShortcut && (i9 & 1) == 0 && this.f23945r == null) {
            a0(qVar, true);
        }
        return zPerformShortcut;
    }

    public final boolean N0(q qVar, KeyEvent keyEvent) {
        F f8;
        F f9;
        F f10;
        if (this.f23923d0) {
            return false;
        }
        if (qVar.f23992m) {
            return true;
        }
        q qVar2 = this.f23919Z;
        if (qVar2 != null && qVar2 != qVar) {
            a0(qVar2, false);
        }
        Window.Callback callbackT0 = t0();
        if (callbackT0 != null) {
            qVar.f23988i = callbackT0.onCreatePanelView(qVar.f23980a);
        }
        int i8 = qVar.f23980a;
        boolean z8 = i8 == 0 || i8 == 108;
        if (z8 && (f10 = this.f23945r) != null) {
            f10.c();
        }
        if (qVar.f23988i == null) {
            if (z8) {
                L0();
            }
            androidx.appcompat.view.menu.e eVar = qVar.f23989j;
            if (eVar == null || qVar.f23997r) {
                if (eVar == null && (!x0(qVar) || qVar.f23989j == null)) {
                    return false;
                }
                if (z8 && this.f23945r != null) {
                    if (this.f23947s == null) {
                        this.f23947s = new f();
                    }
                    this.f23945r.a(qVar.f23989j, this.f23947s);
                }
                qVar.f23989j.e0();
                if (!callbackT0.onCreatePanelMenu(qVar.f23980a, qVar.f23989j)) {
                    qVar.c(null);
                    if (z8 && (f8 = this.f23945r) != null) {
                        f8.a(null, this.f23947s);
                    }
                    return false;
                }
                qVar.f23997r = false;
            }
            qVar.f23989j.e0();
            Bundle bundle = qVar.f23998s;
            if (bundle != null) {
                qVar.f23989j.Q(bundle);
                qVar.f23998s = null;
            }
            if (!callbackT0.onPreparePanel(0, qVar.f23988i, qVar.f23989j)) {
                if (z8 && (f9 = this.f23945r) != null) {
                    f9.a(null, this.f23947s);
                }
                qVar.f23989j.d0();
                return false;
            }
            boolean z9 = KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1;
            qVar.f23995p = z9;
            qVar.f23989j.setQwertyMode(z9);
            qVar.f23989j.d0();
        }
        qVar.f23992m = true;
        qVar.f23993n = false;
        this.f23919Z = qVar;
        return true;
    }

    public final void O0(boolean z8) {
        F f8 = this.f23945r;
        if (f8 == null || !f8.d() || (ViewConfiguration.get(this.f23931k).hasPermanentMenuKey() && !this.f23945r.e())) {
            q qVarR0 = r0(0, true);
            qVarR0.f23996q = true;
            a0(qVarR0, false);
            K0(qVarR0, null);
            return;
        }
        Window.Callback callbackT0 = t0();
        if (this.f23945r.b() && z8) {
            this.f23945r.f();
            if (this.f23923d0) {
                return;
            }
            callbackT0.onPanelClosed(108, r0(0, true).f23989j);
            return;
        }
        if (callbackT0 == null || this.f23923d0) {
            return;
        }
        if (this.f23934l0 && (this.f23936m0 & 1) != 0) {
            this.f23933l.getDecorView().removeCallbacks(this.f23938n0);
            this.f23938n0.run();
        }
        q qVarR1 = r0(0, true);
        androidx.appcompat.view.menu.e eVar = qVarR1.f23989j;
        if (eVar == null || qVarR1.f23997r || !callbackT0.onPreparePanel(0, qVarR1.f23988i, eVar)) {
            return;
        }
        callbackT0.onMenuOpened(108, qVarR1.f23989j);
        this.f23945r.g();
    }

    public final boolean P(boolean z8) {
        return Q(z8, true);
    }

    public final int P0(int i8) {
        if (i8 == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return 108;
        }
        if (i8 != 9) {
            return i8;
        }
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        return 109;
    }

    public final boolean Q(boolean z8, boolean z9) {
        if (this.f23923d0) {
            return false;
        }
        int iV = V();
        int iA0 = A0(this.f23931k, iV);
        P1.g gVarU = Build.VERSION.SDK_INT < 33 ? U(this.f23931k) : null;
        if (!z9 && gVarU != null) {
            gVarU = q0(this.f23931k.getResources().getConfiguration());
        }
        boolean zA1 = a1(iA0, gVarU, z8);
        if (iV == 0) {
            p0(this.f23931k).e();
        } else {
            n nVar = this.f23930j0;
            if (nVar != null) {
                nVar.a();
            }
        }
        if (iV == 3) {
            o0(this.f23931k).e();
            return zA1;
        }
        n nVar2 = this.f23932k0;
        if (nVar2 != null) {
            nVar2.a();
        }
        return zA1;
    }

    public void Q0(Configuration configuration, P1.g gVar) {
        i.d(configuration, gVar);
    }

    public boolean R() {
        return P(true);
    }

    public void R0(P1.g gVar) {
        i.c(gVar);
    }

    public final void S() {
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) this.f23907B.findViewById(R.id.content);
        View decorView = this.f23933l.getDecorView();
        contentFrameLayout.a(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
        TypedArray typedArrayObtainStyledAttributes = this.f23931k.obtainStyledAttributes(p054g.j.f22765y0);
        typedArrayObtainStyledAttributes.getValue(p054g.j.f22581K0, contentFrameLayout.getMinWidthMajor());
        typedArrayObtainStyledAttributes.getValue(p054g.j.f22585L0, contentFrameLayout.getMinWidthMinor());
        if (typedArrayObtainStyledAttributes.hasValue(p054g.j.f22573I0)) {
            typedArrayObtainStyledAttributes.getValue(p054g.j.f22573I0, contentFrameLayout.getFixedWidthMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(p054g.j.f22577J0)) {
            typedArrayObtainStyledAttributes.getValue(p054g.j.f22577J0, contentFrameLayout.getFixedWidthMinor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(p054g.j.f22565G0)) {
            typedArrayObtainStyledAttributes.getValue(p054g.j.f22565G0, contentFrameLayout.getFixedHeightMajor());
        }
        if (typedArrayObtainStyledAttributes.hasValue(p054g.j.f22569H0)) {
            typedArrayObtainStyledAttributes.getValue(p054g.j.f22569H0, contentFrameLayout.getFixedHeightMinor());
        }
        typedArrayObtainStyledAttributes.recycle();
        contentFrameLayout.requestLayout();
    }

    public final boolean S0() {
        ViewGroup viewGroup;
        return this.f23906A && (viewGroup = this.f23907B) != null && viewGroup.isLaidOut();
    }

    public final void T(Window window) {
        if (this.f23933l != null) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        Window.Callback callback = window.getCallback();
        if (callback instanceof l) {
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        l lVar = new l(callback);
        this.f23935m = lVar;
        window.setCallback(lVar);
        X xT = X.t(this.f23931k, null, f23904x0);
        Drawable drawableG = xT.g(0);
        if (drawableG != null) {
            window.setBackgroundDrawable(drawableG);
        }
        xT.w();
        this.f23933l = window;
        if (Build.VERSION.SDK_INT < 33 || this.f23950t0 != null) {
            return;
        }
        K(null);
    }

    public final boolean T0(ViewParent viewParent) {
        if (viewParent == null) {
            return false;
        }
        View decorView = this.f23933l.getDecorView();
        while (viewParent != null) {
            if (viewParent == decorView || !(viewParent instanceof View) || ((View) viewParent).isAttachedToWindow()) {
                return false;
            }
            viewParent = viewParent.getParent();
        }
        return true;
    }

    public P1.g U(Context context) {
        P1.g gVarQ;
        if (Build.VERSION.SDK_INT >= 33 || (gVarQ = p063h.e.q()) == null) {
            return null;
        }
        P1.g gVarQ0 = q0(context.getApplicationContext().getResources().getConfiguration());
        P1.g gVarB = p063h.p.b(gVarQ, gVarQ0);
        return gVarB.f() ? gVarQ0 : gVarB;
    }

    public boolean U0() {
        if (this.f23950t0 == null) {
            return false;
        }
        q qVarR0 = r0(0, false);
        return (qVarR0 != null && qVarR0.f23994o) || this.f23951u != null;
    }

    public final int V() {
        int i8 = this.f23925f0;
        return i8 != -100 ? i8 : p063h.e.m();
    }

    public p099l.b V0(l.b.a aVar) {
        p063h.c cVar;
        if (aVar == null) {
            throw new IllegalArgumentException("ActionMode callback can not be null.");
        }
        p099l.b bVar = this.f23951u;
        if (bVar != null) {
            bVar.c();
        }
        C0555g c0555g = new C0555g(aVar);
        p063h.a aVarR = r();
        if (aVarR != null) {
            p099l.b bVarT = aVarR.t(c0555g);
            this.f23951u = bVarT;
            if (bVarT != null && (cVar = this.f23937n) != null) {
                cVar.e(bVarT);
            }
        }
        if (this.f23951u == null) {
            this.f23951u = W0(c0555g);
        }
        b1();
        return this.f23951u;
    }

    public void W(int i8, q qVar, Menu menu) {
        if (menu == null) {
            if (qVar == null && i8 >= 0) {
                q[] qVarArr = this.f23918Y;
                if (i8 < qVarArr.length) {
                    qVar = qVarArr[i8];
                }
            }
            if (qVar != null) {
                menu = qVar.f23989j;
            }
        }
        if ((qVar == null || qVar.f23994o) && !this.f23923d0) {
            this.f23935m.d(this.f23933l.getCallback(), i8, menu);
        }
    }

    public p099l.b W0(l.b.a aVar) {
        p099l.b bVarR;
        Context dVar;
        p063h.c cVar;
        h0();
        p099l.b bVar = this.f23951u;
        if (bVar != null) {
            bVar.c();
        }
        if (!(aVar instanceof C0555g)) {
            aVar = new C0555g(aVar);
        }
        p063h.c cVar2 = this.f23937n;
        if (cVar2 == null || this.f23923d0) {
            bVarR = null;
        } else {
            try {
                bVarR = cVar2.r(aVar);
            } catch (AbstractMethodError unused) {
                bVarR = null;
            }
        }
        if (bVarR != null) {
            this.f23951u = bVarR;
        } else {
            if (this.f23953v == null) {
                if (this.f23915V) {
                    TypedValue typedValue = new TypedValue();
                    Resources.Theme theme = this.f23931k.getTheme();
                    theme.resolveAttribute(p054g.a.f22377g, typedValue, true);
                    if (typedValue.resourceId != 0) {
                        Resources.Theme themeNewTheme = this.f23931k.getResources().newTheme();
                        themeNewTheme.setTo(theme);
                        themeNewTheme.applyStyle(typedValue.resourceId, true);
                        dVar = new p099l.d(this.f23931k, 0);
                        dVar.getTheme().setTo(themeNewTheme);
                    } else {
                        dVar = this.f23931k;
                    }
                    this.f23953v = new ActionBarContextView(dVar);
                    PopupWindow popupWindow = new PopupWindow(dVar, (AttributeSet) null, p054g.a.f22380j);
                    this.f23954w = popupWindow;
                    p003a2.g.b(popupWindow, 2);
                    this.f23954w.setContentView(this.f23953v);
                    this.f23954w.setWidth(-1);
                    dVar.getTheme().resolveAttribute(p054g.a.f22372b, typedValue, true);
                    this.f23953v.setContentHeight(TypedValue.complexToDimensionPixelSize(typedValue.data, dVar.getResources().getDisplayMetrics()));
                    this.f23954w.setHeight(-2);
                    this.f23955x = new d();
                } else {
                    ViewStubCompat viewStubCompat = (ViewStubCompat) this.f23907B.findViewById(p054g.f.f22484h);
                    if (viewStubCompat != null) {
                        viewStubCompat.setLayoutInflater(LayoutInflater.from(m0()));
                        this.f23953v = (ActionBarContextView) viewStubCompat.a();
                    }
                }
            }
            if (this.f23953v != null) {
                h0();
                this.f23953v.k();
                p099l.e eVar = new p099l.e(this.f23953v.getContext(), this.f23953v, aVar, this.f23954w == null);
                if (aVar.a(eVar, eVar.e())) {
                    eVar.k();
                    this.f23953v.h(eVar);
                    this.f23951u = eVar;
                    if (S0()) {
                        this.f23953v.setAlpha(0.0f);
                        S sB = I.c(this.f23953v).b(1.0f);
                        this.f23956y = sB;
                        sB.g(new e());
                    } else {
                        this.f23953v.setAlpha(1.0f);
                        this.f23953v.setVisibility(0);
                        if (this.f23953v.getParent() instanceof View) {
                            I.F((View) this.f23953v.getParent());
                        }
                    }
                    if (this.f23954w != null) {
                        this.f23933l.getDecorView().post(this.f23955x);
                    }
                } else {
                    this.f23951u = null;
                }
            }
        }
        p099l.b bVar2 = this.f23951u;
        if (bVar2 != null && (cVar = this.f23937n) != null) {
            cVar.e(bVar2);
        }
        b1();
        return this.f23951u;
    }

    public void X(androidx.appcompat.view.menu.e eVar) {
        if (this.f23917X) {
            return;
        }
        this.f23917X = true;
        this.f23945r.i();
        Window.Callback callbackT0 = t0();
        if (callbackT0 != null && !this.f23923d0) {
            callbackT0.onPanelClosed(108, eVar);
        }
        this.f23917X = false;
    }

    public final void X0() {
        if (this.f23906A) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    public final void Y() {
        n nVar = this.f23930j0;
        if (nVar != null) {
            nVar.a();
        }
        n nVar2 = this.f23932k0;
        if (nVar2 != null) {
            nVar2.a();
        }
    }

    public final p063h.b Y0() {
        for (Context baseContext = this.f23931k; baseContext != null; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof p063h.b) {
                return (p063h.b) baseContext;
            }
            if (!(baseContext instanceof ContextWrapper)) {
                break;
            }
        }
        return null;
    }

    public void Z(int i8) {
        a0(r0(i8, true), true);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void Z0(Configuration configuration) {
        Activity activity = (Activity) this.f23929j;
        if (activity instanceof InterfaceC1733p) {
            if (((InterfaceC1733p) activity).w().b().b(AbstractC1726i.b.CREATED)) {
                activity.onConfigurationChanged(configuration);
            }
        } else {
            if (!this.f23922c0 || this.f23923d0) {
                return;
            }
            activity.onConfigurationChanged(configuration);
        }
    }

    @Override // androidx.appcompat.view.menu.e.a
    public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
        q qVarK0;
        Window.Callback callbackT0 = t0();
        if (callbackT0 == null || this.f23923d0 || (qVarK0 = k0(eVar.D())) == null) {
            return false;
        }
        return callbackT0.onMenuItemSelected(qVarK0.f23980a, menuItem);
    }

    public void a0(q qVar, boolean z8) {
        ViewGroup viewGroup;
        F f8;
        if (z8 && qVar.f23980a == 0 && (f8 = this.f23945r) != null && f8.b()) {
            X(qVar.f23989j);
            return;
        }
        WindowManager windowManager = (WindowManager) this.f23931k.getSystemService("window");
        if (windowManager != null && qVar.f23994o && (viewGroup = qVar.f23986g) != null) {
            windowManager.removeView(viewGroup);
            if (z8) {
                W(qVar.f23980a, qVar, null);
            }
        }
        qVar.f23992m = false;
        qVar.f23993n = false;
        qVar.f23994o = false;
        qVar.f23987h = null;
        qVar.f23996q = true;
        if (this.f23919Z == qVar) {
            this.f23919Z = null;
        }
        if (qVar.f23980a == 0) {
            b1();
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x008c  */
    public final boolean a1(int i8, P1.g gVar, boolean z8) {
        boolean z9;
        Configuration configurationB0 = b0(this.f23931k, i8, gVar, null, false);
        int iN0 = n0(this.f23931k);
        Configuration configuration = this.f23924e0;
        if (configuration == null) {
            configuration = this.f23931k.getResources().getConfiguration();
        }
        int i9 = configuration.uiMode & 48;
        int i10 = configurationB0.uiMode & 48;
        P1.g gVarQ0 = q0(configuration);
        P1.g gVarQ1 = gVar == null ? null : q0(configurationB0);
        int i11 = i9 != i10 ? 512 : 0;
        if (gVarQ1 != null && !gVarQ0.equals(gVarQ1)) {
            i11 |= 8196;
        }
        boolean z10 = true;
        if (((~iN0) & i11) != 0 && z8 && this.f23921b0 && (f23905y0 || this.f23922c0)) {
            Object obj = this.f23929j;
            if (!(obj instanceof Activity) || ((Activity) obj).isChild()) {
                z9 = false;
            } else {
                if (Build.VERSION.SDK_INT >= 31 && (i11 & 8192) != 0) {
                    ((Activity) this.f23929j).getWindow().getDecorView().setLayoutDirection(configurationB0.getLayoutDirection());
                }
                H1.a.i((Activity) this.f23929j);
                z9 = true;
            }
        } else {
            z9 = false;
        }
        if (z9 || i11 == 0) {
            z10 = z9;
        } else {
            c1(i10, gVarQ1, (i11 & iN0) == i11, null);
        }
        if (z10) {
            Object obj2 = this.f23929j;
            if (obj2 instanceof p063h.b) {
                if ((i11 & 512) != 0) {
                    ((p063h.b) obj2).r0(i8);
                }
                if ((i11 & 4) != 0) {
                    ((p063h.b) this.f23929j).q0(gVar);
                }
            }
        }
        if (gVarQ1 != null) {
            R0(q0(this.f23931k.getResources().getConfiguration()));
        }
        return z10;
    }

    @Override // androidx.appcompat.view.menu.e.a
    public void b(androidx.appcompat.view.menu.e eVar) {
        O0(true);
    }

    public final Configuration b0(Context context, int i8, P1.g gVar, Configuration configuration, boolean z8) {
        int i9;
        if (i8 == 1) {
            i9 = 16;
        } else if (i8 != 2) {
            i9 = z8 ? 0 : context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
        } else {
            i9 = 32;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i9 | (configuration2.uiMode & (-49));
        if (gVar != null) {
            Q0(configuration2, gVar);
        }
        return configuration2;
    }

    public void b1() {
        OnBackInvokedCallback onBackInvokedCallback;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean zU0 = U0();
            if (zU0 && this.f23952u0 == null) {
                this.f23952u0 = k.b(this.f23950t0, this);
            } else {
                if (zU0 || (onBackInvokedCallback = this.f23952u0) == null) {
                    return;
                }
                k.c(this.f23950t0, onBackInvokedCallback);
                this.f23952u0 = null;
            }
        }
    }

    public final ViewGroup c0() {
        ViewGroup viewGroup;
        TypedArray typedArrayObtainStyledAttributes = this.f23931k.obtainStyledAttributes(p054g.j.f22765y0);
        if (!typedArrayObtainStyledAttributes.hasValue(p054g.j.f22553D0)) {
            typedArrayObtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p054g.j.f22589M0, false)) {
            F(1);
        } else if (typedArrayObtainStyledAttributes.getBoolean(p054g.j.f22553D0, false)) {
            F(108);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p054g.j.f22557E0, false)) {
            F(109);
        }
        if (typedArrayObtainStyledAttributes.getBoolean(p054g.j.f22561F0, false)) {
            F(10);
        }
        this.f23915V = typedArrayObtainStyledAttributes.getBoolean(p054g.j.f22770z0, false);
        typedArrayObtainStyledAttributes.recycle();
        j0();
        this.f23933l.getDecorView();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f23931k);
        if (this.f23916W) {
            viewGroup = this.f23914I ? (ViewGroup) layoutInflaterFrom.inflate(p054g.g.f22517o, (ViewGroup) null) : (ViewGroup) layoutInflaterFrom.inflate(p054g.g.f22516n, (ViewGroup) null);
        } else if (this.f23915V) {
            viewGroup = (ViewGroup) layoutInflaterFrom.inflate(p054g.g.f22508f, (ViewGroup) null);
            this.f23913H = false;
            this.f23912G = false;
        } else if (this.f23912G) {
            TypedValue typedValue = new TypedValue();
            this.f23931k.getTheme().resolveAttribute(p054g.a.f22377g, typedValue, true);
            viewGroup = (ViewGroup) LayoutInflater.from(typedValue.resourceId != 0 ? new p099l.d(this.f23931k, typedValue.resourceId) : this.f23931k).inflate(p054g.g.f22518p, (ViewGroup) null);
            F f8 = (F) viewGroup.findViewById(p054g.f.f22492p);
            this.f23945r = f8;
            f8.setWindowCallback(t0());
            if (this.f23913H) {
                this.f23945r.h(109);
            }
            if (this.f23910E) {
                this.f23945r.h(2);
            }
            if (this.f23911F) {
                this.f23945r.h(5);
            }
        } else {
            viewGroup = null;
        }
        if (viewGroup == null) {
            throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.f23912G + ", windowActionBarOverlay: " + this.f23913H + ", android:windowIsFloating: " + this.f23915V + ", windowActionModeOverlay: " + this.f23914I + ", windowNoTitle: " + this.f23916W + " }");
        }
        I.R(viewGroup, new b());
        if (this.f23945r == null) {
            this.f23908C = (TextView) viewGroup.findViewById(p054g.f.f22473L);
        }
        d0.c(viewGroup);
        ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(p054g.f.f22478b);
        ViewGroup viewGroup2 = (ViewGroup) this.f23933l.findViewById(R.id.content);
        if (viewGroup2 != null) {
            while (viewGroup2.getChildCount() > 0) {
                View childAt = viewGroup2.getChildAt(0);
                viewGroup2.removeViewAt(0);
                contentFrameLayout.addView(childAt);
            }
            viewGroup2.setId(-1);
            contentFrameLayout.setId(R.id.content);
            if (viewGroup2 instanceof FrameLayout) {
                ((FrameLayout) viewGroup2).setForeground(null);
            }
        }
        this.f23933l.setContentView(viewGroup);
        contentFrameLayout.setAttachListener(new c());
        return viewGroup;
    }

    public final void c1(int i8, P1.g gVar, boolean z8, Configuration configuration) {
        Resources resources = this.f23931k.getResources();
        Configuration configuration2 = new Configuration(resources.getConfiguration());
        if (configuration != null) {
            configuration2.updateFrom(configuration);
        }
        configuration2.uiMode = i8 | (resources.getConfiguration().uiMode & (-49));
        if (gVar != null) {
            Q0(configuration2, gVar);
        }
        resources.updateConfiguration(configuration2, null);
        int i9 = this.f23926g0;
        if (i9 != 0) {
            this.f23931k.setTheme(i9);
            this.f23931k.getTheme().applyStyle(this.f23926g0, true);
        }
        if (z8 && (this.f23929j instanceof Activity)) {
            Z0(configuration2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public View d0(View view, String str, Context context, AttributeSet attributeSet) {
        boolean z8;
        if (this.f23946r0 == null) {
            TypedArray typedArrayObtainStyledAttributes = this.f23931k.obtainStyledAttributes(p054g.j.f22765y0);
            String string = typedArrayObtainStyledAttributes.getString(p054g.j.f22548C0);
            typedArrayObtainStyledAttributes.recycle();
            if (string == null) {
                this.f23946r0 = new p063h.m();
            } else {
                try {
                    this.f23946r0 = (p063h.m) this.f23931k.getClassLoader().loadClass(string).getDeclaredConstructor(null).newInstance(null);
                } catch (Throwable th) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + string + ". Falling back to default.", th);
                    this.f23946r0 = new p063h.m();
                }
            }
        }
        boolean z9 = f23903w0;
        boolean zT0 = false;
        if (z9) {
            if (this.f23948s0 == null) {
                this.f23948s0 = new p063h.o();
            }
            if (this.f23948s0.a(attributeSet)) {
                z8 = true;
            } else {
                if (!(attributeSet instanceof XmlPullParser)) {
                    zT0 = T0((ViewParent) view);
                } else if (((XmlPullParser) attributeSet).getDepth() > 1) {
                    zT0 = true;
                }
                z8 = zT0;
            }
        } else {
            z8 = zT0;
        }
        return this.f23946r0.r(view, str, context, attributeSet, z8, z9, true, p117n.c0.c());
    }

    public final int d1(c0 c0Var, Rect rect) {
        int iL;
        boolean z8;
        boolean z9;
        if (c0Var != null) {
            iL = c0Var.l();
        } else {
            iL = rect != null ? rect.top : 0;
        }
        ActionBarContextView actionBarContextView = this.f23953v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            z8 = false;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f23953v.getLayoutParams();
            boolean z10 = true;
            if (this.f23953v.isShown()) {
                if (this.f23942p0 == null) {
                    this.f23942p0 = new Rect();
                    this.f23944q0 = new Rect();
                }
                Rect rect2 = this.f23942p0;
                Rect rect3 = this.f23944q0;
                if (c0Var == null) {
                    rect2.set(rect);
                } else {
                    rect2.set(c0Var.j(), c0Var.l(), c0Var.k(), c0Var.i());
                }
                d0.a(this.f23907B, rect2, rect3);
                int i8 = rect2.top;
                int i9 = rect2.left;
                int i10 = rect2.right;
                c0 c0VarR = I.r(this.f23907B);
                int iJ = c0VarR == null ? 0 : c0VarR.j();
                int iK = c0VarR == null ? 0 : c0VarR.k();
                if (marginLayoutParams.topMargin == i8 && marginLayoutParams.leftMargin == i9 && marginLayoutParams.rightMargin == i10) {
                    z9 = false;
                } else {
                    marginLayoutParams.topMargin = i8;
                    marginLayoutParams.leftMargin = i9;
                    marginLayoutParams.rightMargin = i10;
                    z9 = true;
                }
                if (i8 <= 0 || this.f23909D != null) {
                    View view = this.f23909D;
                    if (view != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
                        int i11 = marginLayoutParams2.height;
                        int i12 = marginLayoutParams.topMargin;
                        if (i11 != i12 || marginLayoutParams2.leftMargin != iJ || marginLayoutParams2.rightMargin != iK) {
                            marginLayoutParams2.height = i12;
                            marginLayoutParams2.leftMargin = iJ;
                            marginLayoutParams2.rightMargin = iK;
                            this.f23909D.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view2 = new View(this.f23931k);
                    this.f23909D = view2;
                    view2.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = iJ;
                    layoutParams.rightMargin = iK;
                    this.f23907B.addView(this.f23909D, -1, layoutParams);
                }
                View view3 = this.f23909D;
                z10 = view3 != null;
                if (z10 && view3.getVisibility() != 0) {
                    e1(this.f23909D);
                }
                if (!this.f23914I && z10) {
                    iL = 0;
                }
                z8 = z10;
                z10 = z9;
            } else if (marginLayoutParams.topMargin != 0) {
                marginLayoutParams.topMargin = 0;
                z8 = false;
            } else {
                z8 = false;
                z10 = false;
            }
            if (z10) {
                this.f23953v.setLayoutParams(marginLayoutParams);
            }
        }
        View view4 = this.f23909D;
        if (view4 != null) {
            view4.setVisibility(z8 ? 0 : 8);
        }
        return iL;
    }

    @Override // p063h.e
    public void e(View view, ViewGroup.LayoutParams layoutParams) {
        i0();
        ((ViewGroup) this.f23907B.findViewById(R.id.content)).addView(view, layoutParams);
        this.f23935m.c(this.f23933l.getCallback());
    }

    public void e0() {
        androidx.appcompat.view.menu.e eVar;
        F f8 = this.f23945r;
        if (f8 != null) {
            f8.i();
        }
        if (this.f23954w != null) {
            this.f23933l.getDecorView().removeCallbacks(this.f23955x);
            if (this.f23954w.isShowing()) {
                try {
                    this.f23954w.dismiss();
                } catch (IllegalArgumentException unused) {
                }
            }
            this.f23954w = null;
        }
        h0();
        q qVarR0 = r0(0, false);
        if (qVarR0 == null || (eVar = qVarR0.f23989j) == null) {
            return;
        }
        eVar.close();
    }

    public final void e1(View view) {
        view.setBackgroundColor((I.u(view) & 8192) != 0 ? I1.a.b(this.f23931k, p054g.c.f22399b) : I1.a.b(this.f23931k, p054g.c.f22398a));
    }

    public boolean f0(KeyEvent keyEvent) {
        View decorView;
        Object obj = this.f23929j;
        if (((obj instanceof AbstractC1652n.a) || (obj instanceof p063h.l)) && (decorView = this.f23933l.getDecorView()) != null && AbstractC1652n.a(decorView, keyEvent)) {
            return true;
        }
        if (keyEvent.getKeyCode() == 82 && this.f23935m.b(this.f23933l.getCallback(), keyEvent)) {
            return true;
        }
        int keyCode = keyEvent.getKeyCode();
        return keyEvent.getAction() == 0 ? C0(keyCode, keyEvent) : F0(keyCode, keyEvent);
    }

    @Override // p063h.e
    public Context g(Context context) {
        Context context2;
        this.f23921b0 = true;
        int iA0 = A0(context, V());
        if (p063h.e.u(context)) {
            p063h.e.O(context);
        }
        P1.g gVarU = U(context);
        if (context instanceof ContextThemeWrapper) {
            context2 = context;
            try {
                ((ContextThemeWrapper) context2).applyOverrideConfiguration(b0(context2, iA0, gVarU, null, false));
                return context2;
            } catch (IllegalStateException unused) {
            }
        } else {
            context2 = context;
        }
        if (context2 instanceof p099l.d) {
            try {
                ((p099l.d) context2).a(b0(context2, iA0, gVarU, null, false));
                return context2;
            } catch (IllegalStateException unused2) {
            }
        }
        if (!f23905y0) {
            return super.g(context2);
        }
        Configuration configuration = new Configuration();
        configuration.uiMode = -1;
        configuration.fontScale = 0.0f;
        Configuration configuration2 = context2.createConfigurationContext(configuration).getResources().getConfiguration();
        Configuration configuration3 = context2.getResources().getConfiguration();
        configuration2.uiMode = configuration3.uiMode;
        Configuration configurationB0 = b0(context2, iA0, gVarU, !configuration2.equals(configuration3) ? l0(configuration2, configuration3) : null, true);
        p099l.d dVar = new p099l.d(context2, p054g.i.f22535b);
        dVar.a(configurationB0);
        try {
            if (context2.getTheme() != null) {
                K1.h.f.a(dVar.getTheme());
            }
        } catch (NullPointerException unused3) {
        }
        return super.g(dVar);
    }

    public void g0(int i8) {
        q qVarR0;
        q qVarR1 = r0(i8, true);
        if (qVarR1.f23989j != null) {
            Bundle bundle = new Bundle();
            qVarR1.f23989j.R(bundle);
            if (bundle.size() > 0) {
                qVarR1.f23998s = bundle;
            }
            qVarR1.f23989j.e0();
            qVarR1.f23989j.clear();
        }
        qVarR1.f23997r = true;
        qVarR1.f23996q = true;
        if ((i8 != 108 && i8 != 0) || this.f23945r == null || (qVarR0 = r0(0, false)) == null) {
            return;
        }
        qVarR0.f23992m = false;
        N0(qVarR0, null);
    }

    public void h0() {
        S s8 = this.f23956y;
        if (s8 != null) {
            s8.c();
        }
    }

    public final void i0() {
        if (this.f23906A) {
            return;
        }
        this.f23907B = c0();
        CharSequence charSequenceS0 = s0();
        if (!TextUtils.isEmpty(charSequenceS0)) {
            F f8 = this.f23945r;
            if (f8 != null) {
                f8.setWindowTitle(charSequenceS0);
            } else if (L0() != null) {
                L0().s(charSequenceS0);
            } else {
                TextView textView = this.f23908C;
                if (textView != null) {
                    textView.setText(charSequenceS0);
                }
            }
        }
        S();
        J0(this.f23907B);
        this.f23906A = true;
        q qVarR0 = r0(0, false);
        if (this.f23923d0) {
            return;
        }
        if (qVarR0 == null || qVarR0.f23989j == null) {
            y0(108);
        }
    }

    @Override // p063h.e
    public View j(int i8) {
        i0();
        return this.f23933l.findViewById(i8);
    }

    public final void j0() {
        if (this.f23933l == null) {
            Object obj = this.f23929j;
            if (obj instanceof Activity) {
                T(((Activity) obj).getWindow());
            }
        }
        if (this.f23933l == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    public q k0(Menu menu) {
        q[] qVarArr = this.f23918Y;
        int length = qVarArr != null ? qVarArr.length : 0;
        for (int i8 = 0; i8 < length; i8++) {
            q qVar = qVarArr[i8];
            if (qVar != null && qVar.f23989j == menu) {
                return qVar;
            }
        }
        return null;
    }

    @Override // p063h.e
    public Context l() {
        return this.f23931k;
    }

    public final Context m0() {
        p063h.a aVarR = r();
        Context contextJ = aVarR != null ? aVarR.j() : null;
        return contextJ == null ? this.f23931k : contextJ;
    }

    @Override // p063h.e
    public int n() {
        return this.f23925f0;
    }

    public final int n0(Context context) {
        if (!this.f23928i0 && (this.f23929j instanceof Activity)) {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                return 0;
            }
            try {
                ActivityInfo activityInfo = packageManager.getActivityInfo(new ComponentName(context, this.f23929j.getClass()), Build.VERSION.SDK_INT >= 29 ? 269221888 : 786432);
                if (activityInfo != null) {
                    this.f23927h0 = activityInfo.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e8) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e8);
                this.f23927h0 = 0;
            }
        }
        this.f23928i0 = true;
        return this.f23927h0;
    }

    public final n o0(Context context) {
        if (this.f23932k0 == null) {
            this.f23932k0 = new m(context);
        }
        return this.f23932k0;
    }

    @Override // android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        return d0(view, str, context, attributeSet);
    }

    @Override // p063h.e
    public MenuInflater p() {
        if (this.f23941p == null) {
            u0();
            p063h.a aVar = this.f23939o;
            this.f23941p = new p099l.g(aVar != null ? aVar.j() : this.f23931k);
        }
        return this.f23941p;
    }

    public final n p0(Context context) {
        if (this.f23930j0 == null) {
            this.f23930j0 = new o(p063h.r.a(context));
        }
        return this.f23930j0;
    }

    public P1.g q0(Configuration configuration) {
        return i.b(configuration);
    }

    @Override // p063h.e
    public p063h.a r() {
        u0();
        return this.f23939o;
    }

    public q r0(int i8, boolean z8) {
        q[] qVarArr = this.f23918Y;
        if (qVarArr == null || qVarArr.length <= i8) {
            q[] qVarArr2 = new q[i8 + 1];
            if (qVarArr != null) {
                System.arraycopy(qVarArr, 0, qVarArr2, 0, qVarArr.length);
            }
            this.f23918Y = qVarArr2;
            qVarArr = qVarArr2;
        }
        q qVar = qVarArr[i8];
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(i8);
        qVarArr[i8] = qVar2;
        return qVar2;
    }

    @Override // p063h.e
    public void s() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f23931k);
        if (layoutInflaterFrom.getFactory() == null) {
            AbstractC1653o.a(layoutInflaterFrom, this);
        } else {
            if (layoutInflaterFrom.getFactory2() instanceof g) {
                return;
            }
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final CharSequence s0() {
        Object obj = this.f23929j;
        return obj instanceof Activity ? ((Activity) obj).getTitle() : this.f23943q;
    }

    @Override // p063h.e
    public void t() {
        if (L0() == null || r().k()) {
            return;
        }
        y0(0);
    }

    public final Window.Callback t0() {
        return this.f23933l.getCallback();
    }

    public final void u0() {
        i0();
        if (this.f23912G && this.f23939o == null) {
            Object obj = this.f23929j;
            if (obj instanceof Activity) {
                this.f23939o = new t((Activity) this.f23929j, this.f23913H);
            } else if (obj instanceof Dialog) {
                this.f23939o = new t((Dialog) this.f23929j);
            }
            p063h.a aVar = this.f23939o;
            if (aVar != null) {
                aVar.q(this.f23940o0);
            }
        }
    }

    @Override // p063h.e
    public void v(Configuration configuration) {
        p063h.a aVarR;
        if (this.f23912G && this.f23906A && (aVarR = r()) != null) {
            aVarR.l(configuration);
        }
        C2708j.b().g(this.f23931k);
        this.f23924e0 = new Configuration(this.f23931k.getResources().getConfiguration());
        Q(false, false);
    }

    public final boolean v0(q qVar) {
        View view = qVar.f23988i;
        if (view != null) {
            qVar.f23987h = view;
            return true;
        }
        if (qVar.f23989j == null) {
            return false;
        }
        if (this.f23949t == null) {
            this.f23949t = new r();
        }
        View view2 = (View) qVar.a(this.f23949t);
        qVar.f23987h = view2;
        return view2 != null;
    }

    @Override // p063h.e
    public void w(Bundle bundle) {
        String strC;
        this.f23921b0 = true;
        P(false);
        j0();
        Object obj = this.f23929j;
        if (obj instanceof Activity) {
            try {
                strC = H1.h.c((Activity) obj);
            } catch (IllegalArgumentException unused) {
                strC = null;
            }
            if (strC != null) {
                p063h.a aVarL0 = L0();
                if (aVarL0 == null) {
                    this.f23940o0 = true;
                } else {
                    aVarL0.q(true);
                }
            }
            p063h.e.d(this);
        }
        this.f23924e0 = new Configuration(this.f23931k.getResources().getConfiguration());
        this.f23922c0 = true;
    }

    public final boolean w0(q qVar) {
        qVar.d(m0());
        qVar.f23986g = new p(qVar.f23991l);
        qVar.f23982c = 81;
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0045  */
    @Override // p063h.e
    public void x() {
        if (this.f23929j instanceof Activity) {
            p063h.e.D(this);
        }
        if (this.f23934l0) {
            this.f23933l.getDecorView().removeCallbacks(this.f23938n0);
        }
        this.f23923d0 = true;
        if (this.f23925f0 != -100) {
            Object obj = this.f23929j;
            if ((obj instanceof Activity) && ((Activity) obj).isChangingConfigurations()) {
                f23902v0.put(this.f23929j.getClass().getName(), Integer.valueOf(this.f23925f0));
            } else {
                f23902v0.remove(this.f23929j.getClass().getName());
            }
        } else {
            f23902v0.remove(this.f23929j.getClass().getName());
        }
        p063h.a aVar = this.f23939o;
        if (aVar != null) {
            aVar.m();
        }
        Y();
    }

    public final boolean x0(q qVar) {
        Resources.Theme themeNewTheme;
        Context context = this.f23931k;
        int i8 = qVar.f23980a;
        if ((i8 == 0 || i8 == 108) && this.f23945r != null) {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = context.getTheme();
            theme.resolveAttribute(p054g.a.f22377g, typedValue, true);
            if (typedValue.resourceId != 0) {
                themeNewTheme = context.getResources().newTheme();
                themeNewTheme.setTo(theme);
                themeNewTheme.applyStyle(typedValue.resourceId, true);
                themeNewTheme.resolveAttribute(p054g.a.f22378h, typedValue, true);
            } else {
                theme.resolveAttribute(p054g.a.f22378h, typedValue, true);
                themeNewTheme = null;
            }
            if (typedValue.resourceId != 0) {
                if (themeNewTheme == null) {
                    themeNewTheme = context.getResources().newTheme();
                    themeNewTheme.setTo(theme);
                }
                themeNewTheme.applyStyle(typedValue.resourceId, true);
            }
            if (themeNewTheme != null) {
                p099l.d dVar = new p099l.d(context, 0);
                dVar.getTheme().setTo(themeNewTheme);
                context = dVar;
            }
        }
        androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
        eVar.S(this);
        qVar.c(eVar);
        return true;
    }

    @Override // p063h.e
    public void y(Bundle bundle) {
        i0();
    }

    public final void y0(int i8) {
        this.f23936m0 = (1 << i8) | this.f23936m0;
        if (this.f23934l0) {
            return;
        }
        I.D(this.f23933l.getDecorView(), this.f23938n0);
        this.f23934l0 = true;
    }

    @Override // p063h.e
    public void z() {
        p063h.a aVarR = r();
        if (aVarR != null) {
            aVarR.r(true);
        }
    }

    public boolean z0() {
        return this.f23957z;
    }

    public g(Dialog dialog, p063h.c cVar) {
        this(dialog.getContext(), dialog.getWindow(), cVar, dialog);
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    public g(Context context, Window window, p063h.c cVar, Object obj) {
        p063h.b bVarY0;
        this.f23956y = null;
        this.f23957z = true;
        this.f23925f0 = -100;
        this.f23938n0 = new a();
        this.f23931k = context;
        this.f23937n = cVar;
        this.f23929j = obj;
        if (this.f23925f0 == -100 && (obj instanceof Dialog) && (bVarY0 = Y0()) != null) {
            this.f23925f0 = bVarY0.l0().n();
        }
        if (this.f23925f0 == -100) {
            C c8 = f23902v0;
            Integer num = (Integer) c8.get(obj.getClass().getName());
            if (num != null) {
                this.f23925f0 = num.intValue();
                c8.remove(obj.getClass().getName());
            }
        }
        if (window != null) {
            T(window);
        }
        C2708j.h();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements ContentFrameLayout.a {
        public c() {
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void onDetachedFromWindow() {
            g.this.e0();
        }

        @Override // androidx.appcompat.widget.ContentFrameLayout.a
        public void a() {
        }
    }

    @Override // p063h.e
    public void A(Bundle bundle) {
    }

    public void J0(ViewGroup viewGroup) {
    }
}
