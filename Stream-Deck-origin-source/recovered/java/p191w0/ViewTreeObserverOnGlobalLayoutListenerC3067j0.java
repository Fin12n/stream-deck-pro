package p191w0;

import A1.t;
import C6.G;
import L0.l;
import L0.m;
import Q6.o;
import android.R;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.u;
import p065h1.AbstractC2378a;
import p065h1.V0;
import p116m7.kKPq.toqHM;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.P0;
import p215z0.l1;
import p217z2.g;

/* JADX INFO: renamed from: w0.j0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class ViewTreeObserverOnGlobalLayoutListenerC3067j0 extends AbstractC2378a implements ViewTreeObserver.OnGlobalLayoutListener, V0 {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final C3063h0 f35990i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Function0 f35991j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View f35992k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Object f35993l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final WindowManager f35994m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WindowManager.LayoutParams f35995n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final InterfaceC3164l0 f35996o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f35997p;

    /* JADX INFO: renamed from: w0.j0$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f35998a = new a();

        public static final OnBackInvokedCallback b(final Function0 function0) {
            return new OnBackInvokedCallback() { // from class: w0.i0
                public final void onBackInvoked() {
                    ViewTreeObserverOnGlobalLayoutListenerC3067j0.a.c(function0);
                }
            };
        }

        public static final void c(Function0 function0) {
            function0.invoke();
        }

        public static final void d(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, (OnBackInvokedCallback) obj);
        }

        public static final void e(View view, Object obj) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(obj instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj);
        }
    }

    /* JADX INFO: renamed from: w0.j0$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f36000b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(int i8) {
            super(2);
            this.f36000b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            ViewTreeObserverOnGlobalLayoutListenerC3067j0.this.a(interfaceC3163l, F0.a(this.f36000b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: w0.j0$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f36001a;

        static {
            int[] iArr = new int[t.values().length];
            try {
                iArr[t.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[t.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f36001a = iArr;
        }
    }

    public ViewTreeObserverOnGlobalLayoutListenerC3067j0(C3063h0 c3063h0, Function0 function0, View view, UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        this.f35990i = c3063h0;
        this.f35991j = function0;
        this.f35992k = view;
        setId(R.id.content);
        T.b(this, T.a(view));
        U.b(this, U.a(view));
        g.b(this, g.a(view));
        setTag(l.f4860H, "Popup:" + uuid);
        setClipChildren(false);
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.t.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f35994m = (WindowManager) systemService;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388691;
        layoutParams.type = 1000;
        layoutParams.width = getDisplayWidth();
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(m.f4892b));
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.flags = (layoutParams.flags & (-163841)) | 512;
        if (AbstractC3069k0.o(c3063h0.a(), AbstractC3069k0.l(view))) {
            layoutParams.flags |= 8192;
        } else {
            layoutParams.flags &= -8193;
        }
        if (c3063h0.c()) {
            layoutParams.flags &= -9;
        } else {
            layoutParams.flags |= 8;
        }
        this.f35995n = layoutParams;
        this.f35996o = l1.e(C3096z.f36716a.b(), null, 2, null);
    }

    private final void setContent(o oVar) {
        this.f35996o.setValue(oVar);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f35990i.b()) {
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.f35991j.invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    public final o getContent() {
        return (o) this.f35996o.getValue();
    }

    public final int getDisplayWidth() {
        return getContext().getResources().getDisplayMetrics().widthPixels;
    }

    @Override // p065h1.AbstractC2378a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f35997p;
    }

    public final void k() {
        T.b(this, null);
        g.b(this, null);
        this.f35992k.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        this.f35994m.removeViewImmediate(this);
    }

    public final void l() {
        if (!this.f35990i.b() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f35993l == null) {
            this.f35993l = a.b(this.f35991j);
        }
        a.d(this, this.f35993l);
    }

    public final void m() {
        if (Build.VERSION.SDK_INT >= 33) {
            a.e(this, this.f35993l);
        }
        this.f35993l = null;
    }

    public final void n(AbstractC3173q abstractC3173q, o oVar) {
        if (abstractC3173q != null) {
            setParentCompositionContext(abstractC3173q);
        }
        setContent(oVar);
        this.f35997p = true;
    }

    public final void o() {
        this.f35994m.addView(this, this.f35995n);
    }

    @Override // p065h1.AbstractC2378a, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        l();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        m();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public void onGlobalLayout() {
    }

    public final void p(t tVar) {
        int i8 = c.f36001a[tVar.ordinal()];
        int i9 = 1;
        if (i8 == 1) {
            i9 = 0;
        } else if (i8 != 2) {
            throw new C6.m();
        }
        super.setLayoutDirection(i9);
    }

    @Override // android.view.View
    public void setLayoutDirection(int i8) {
    }

    @Override // p065h1.AbstractC2378a
    public void a(InterfaceC3163l interfaceC3163l, int i8) {
        int i9;
        int i10;
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-463309699);
        if ((i8 & 6) == 0) {
            if (interfaceC3163lP.l(this)) {
                i10 = 4;
            } else {
                i10 = 2;
            }
            i9 = i10 | i8;
        } else {
            i9 = i8;
        }
        if ((i9 & 3) == 2 && interfaceC3163lP.s()) {
            interfaceC3163lP.z();
        } else {
            if (AbstractC3169o.K()) {
                AbstractC3169o.W(-463309699, i9, -1, toqHM.IlMUxEJoKQrdwqE);
            }
            getContent().invoke(interfaceC3163lP, 0);
            if (AbstractC3169o.K()) {
                AbstractC3169o.V();
            }
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new b(i8));
        }
    }
}
