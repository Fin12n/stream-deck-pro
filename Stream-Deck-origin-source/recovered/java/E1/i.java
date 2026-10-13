package E1;

import A1.r;
import A1.s;
import A1.t;
import C6.G;
import J0.z;
import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.u;
import p038e1.AbstractC2248t;
import p038e1.InterfaceC2247s;
import p065h1.AbstractC2378a;
import p065h1.V0;
import p215z0.AbstractC3169o;
import p215z0.AbstractC3173q;
import p215z0.F0;
import p215z0.InterfaceC3163l;
import p215z0.InterfaceC3164l0;
import p215z0.P0;
import p215z0.g1;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i extends AbstractC2378a implements V0 {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final c f2114B = new c(null);

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public static final int f2115C = 8;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final Q6.k f2116D = b.f2136a;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final int[] f2117A;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public Function0 f2118i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public o f2119j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public String f2120k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final View f2121l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final k f2122m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final WindowManager f2123n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final WindowManager.LayoutParams f2124o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public n f2125p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public t f2126q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final InterfaceC3164l0 f2127r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final InterfaceC3164l0 f2128s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public A1.p f2129t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public final q1 f2130u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final float f2131v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final Rect f2132w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final z f2133x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final InterfaceC3164l0 f2134y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f2135z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f2136a = new b();

        public b() {
            super(1);
        }

        public final void b(i iVar) {
            if (iVar.isAttachedToWindow()) {
                iVar.v();
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((i) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {
        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.o {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f2138b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(int i8) {
            super(2);
            this.f2138b = i8;
        }

        public final void b(InterfaceC3163l interfaceC3163l, int i8) {
            i.this.a(interfaceC3163l, F0.a(this.f2138b | 1));
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            b((InterfaceC3163l) obj, ((Number) obj2).intValue());
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2139a;

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
            f2139a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Function0 {
        public f() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.valueOf((i.this.getParentLayoutCoordinates() == null || i.this.m54getPopupContentSizebOM6tXw() == null) ? false : true);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Q6.k {
        public g() {
            super(1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void d(Function0 function0) {
            function0.invoke();
        }

        public final void c(final Function0 function0) {
            Handler handler = i.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                function0.invoke();
                return;
            }
            Handler handler2 = i.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: E1.j
                    @Override // java.lang.Runnable
                    public final void run() {
                        i.g.d(function0);
                    }
                });
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            c((Function0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ I f2142a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ i f2143b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ A1.p f2144c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f2145d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ long f2146e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(I i8, i iVar, A1.p pVar, long j8, long j9) {
            super(0);
            this.f2142a = i8;
            this.f2143b = iVar;
            this.f2144c = pVar;
            this.f2145d = j8;
            this.f2146e = j9;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m56invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m56invoke() {
            this.f2142a.f28778a = this.f2143b.getPositionProvider().a(this.f2144c, this.f2145d, this.f2143b.getParentLayoutDirection(), this.f2146e);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ i(Function0 function0, o oVar, String str, View view, A1.d dVar, n nVar, UUID uuid, k kVar, int i8, AbstractC2633k abstractC2633k) {
        k lVar;
        if ((i8 & 128) != 0) {
            lVar = Build.VERSION.SDK_INT >= 29 ? new l() : new m();
        } else {
            lVar = kVar;
        }
        this(function0, oVar, str, view, dVar, nVar, uuid, lVar);
    }

    private final Q6.o getContent() {
        return (Q6.o) this.f2134y.getValue();
    }

    private final int getDisplayHeight() {
        return S6.c.d(getContext().getResources().getConfiguration().screenHeightDp * getContext().getResources().getDisplayMetrics().density);
    }

    private final int getDisplayWidth() {
        return S6.c.d(getContext().getResources().getConfiguration().screenWidthDp * getContext().getResources().getDisplayMetrics().density);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC2247s getParentLayoutCoordinates() {
        return (InterfaceC2247s) this.f2128s.getValue();
    }

    private final void r(t tVar) {
        int i8 = e.f2139a[tVar.ordinal()];
        int i9 = 1;
        if (i8 == 1) {
            i9 = 0;
        } else if (i8 != 2) {
            throw new C6.m();
        }
        super.setLayoutDirection(i9);
    }

    private final void setClippingEnabled(boolean z8) {
        l(z8 ? this.f2124o.flags & (-513) : this.f2124o.flags | 512);
    }

    private final void setContent(Q6.o oVar) {
        this.f2134y.setValue(oVar);
    }

    private final void setIsFocusable(boolean z8) {
        l(!z8 ? this.f2124o.flags | 8 : this.f2124o.flags & (-9));
    }

    private final void setParentLayoutCoordinates(InterfaceC2247s interfaceC2247s) {
        this.f2128s.setValue(interfaceC2247s);
    }

    private final void setSecurePolicy(p pVar) {
        l(q.a(pVar, E1.b.e(this.f2121l)) ? this.f2124o.flags | 8192 : this.f2124o.flags & (-8193));
    }

    @Override // p065h1.AbstractC2378a
    public void a(InterfaceC3163l interfaceC3163l, int i8) {
        InterfaceC3163l interfaceC3163lP = interfaceC3163l.p(-857613600);
        if (AbstractC3169o.K()) {
            AbstractC3169o.W(-857613600, i8, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:475)");
        }
        getContent().invoke(interfaceC3163lP, 0);
        if (AbstractC3169o.K()) {
            AbstractC3169o.V();
        }
        P0 p0V = interfaceC3163lP.v();
        if (p0V != null) {
            p0V.a(new d(i8));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4 && this.f2119j.b()) {
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
                Function0 function0 = this.f2118i;
                if (function0 != null) {
                    function0.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // p065h1.AbstractC2378a
    public void g(boolean z8, int i8, int i9, int i10, int i11) {
        View childAt;
        super.g(z8, i8, i9, i10, i11);
        if (this.f2119j.g() || (childAt = getChildAt(0)) == null) {
            return;
        }
        this.f2124o.width = childAt.getMeasuredWidth();
        this.f2124o.height = childAt.getMeasuredHeight();
        this.f2122m.a(this.f2123n, this, this.f2124o);
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.f2130u.getValue()).booleanValue();
    }

    public final WindowManager.LayoutParams getParams$ui_release() {
        return this.f2124o;
    }

    public final t getParentLayoutDirection() {
        return this.f2126q;
    }

    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final r m54getPopupContentSizebOM6tXw() {
        return (r) this.f2127r.getValue();
    }

    public final n getPositionProvider() {
        return this.f2125p;
    }

    @Override // p065h1.AbstractC2378a
    public boolean getShouldCreateCompositionOnAttachedToWindow() {
        return this.f2135z;
    }

    public final String getTestTag() {
        return this.f2120k;
    }

    @Override // p065h1.V0
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return super.getViewRoot();
    }

    @Override // p065h1.AbstractC2378a
    public void h(int i8, int i9) {
        if (this.f2119j.g()) {
            super.h(i8, i9);
        } else {
            super.h(View.MeasureSpec.makeMeasureSpec(getDisplayWidth(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(getDisplayHeight(), Integer.MIN_VALUE));
        }
    }

    public final void l(int i8) {
        WindowManager.LayoutParams layoutParams = this.f2124o;
        layoutParams.flags = i8;
        this.f2122m.a(this.f2123n, this, layoutParams);
    }

    public final WindowManager.LayoutParams m() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = (layoutParams.flags & (-8552473)) | 262144;
        layoutParams.type = 1002;
        layoutParams.token = this.f2121l.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.f2121l.getContext().getResources().getString(L0.m.f4892b));
        return layoutParams;
    }

    public final void n() {
        T.b(this, null);
        this.f2123n.removeViewImmediate(this);
    }

    public final void o() {
        int[] iArr = this.f2117A;
        int i8 = iArr[0];
        int i9 = iArr[1];
        this.f2121l.getLocationOnScreen(iArr);
        int[] iArr2 = this.f2117A;
        if (i8 == iArr2[0] && i9 == iArr2[1]) {
            return;
        }
        t();
    }

    @Override // p065h1.AbstractC2378a, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f2133x.s();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f2133x.t();
        this.f2133x.j();
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f2119j.c()) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Function0 function0 = this.f2118i;
            if (function0 != null) {
                function0.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        Function0 function1 = this.f2118i;
        if (function1 != null) {
            function1.invoke();
        }
        return true;
    }

    public final void p(AbstractC3173q abstractC3173q, Q6.o oVar) {
        setParentCompositionContext(abstractC3173q);
        setContent(oVar);
        this.f2135z = true;
    }

    public final void q() {
        this.f2123n.addView(this, this.f2124o);
    }

    public final void s(Function0 function0, o oVar, String str, t tVar) {
        this.f2118i = function0;
        if (oVar.g() && !this.f2119j.g()) {
            WindowManager.LayoutParams layoutParams = this.f2124o;
            layoutParams.width = -2;
            layoutParams.height = -2;
            this.f2122m.a(this.f2123n, this, layoutParams);
        }
        this.f2119j = oVar;
        this.f2120k = str;
        setIsFocusable(oVar.e());
        setSecurePolicy(oVar.f());
        setClippingEnabled(oVar.a());
        r(tVar);
    }

    public final void setParentLayoutDirection(t tVar) {
        this.f2126q = tVar;
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m55setPopupContentSizefhxjrPA(r rVar) {
        this.f2127r.setValue(rVar);
    }

    public final void setPositionProvider(n nVar) {
        this.f2125p = nVar;
    }

    public final void setTestTag(String str) {
        this.f2120k = str;
    }

    public final void t() {
        InterfaceC2247s parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates == null) {
            return;
        }
        long jA = parentLayoutCoordinates.a();
        long jF = AbstractC2248t.f(parentLayoutCoordinates);
        A1.p pVarA = A1.q.a(A1.o.a(S6.c.d(Q0.f.o(jF)), S6.c.d(Q0.f.p(jF))), jA);
        if (kotlin.jvm.internal.t.c(pVarA, this.f2129t)) {
            return;
        }
        this.f2129t = pVarA;
        v();
    }

    public final void u(InterfaceC2247s interfaceC2247s) {
        setParentLayoutCoordinates(interfaceC2247s);
        t();
    }

    public final void v() {
        r rVarM54getPopupContentSizebOM6tXw;
        A1.p pVar = this.f2129t;
        if (pVar == null || (rVarM54getPopupContentSizebOM6tXw = m54getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long j8 = rVarM54getPopupContentSizebOM6tXw.j();
        Rect rect = this.f2132w;
        this.f2122m.c(this.f2121l, rect);
        A1.p pVarF = E1.b.f(rect);
        long jA = s.a(pVarF.g(), pVarF.c());
        I i8 = new I();
        i8.f28778a = A1.n.f446b.a();
        this.f2133x.o(this, f2116D, new h(i8, this, pVar, jA, j8));
        this.f2124o.x = A1.n.j(i8.f28778a);
        this.f2124o.y = A1.n.k(i8.f28778a);
        if (this.f2119j.d()) {
            this.f2122m.b(this, r.g(jA), r.f(jA));
        }
        this.f2122m.a(this.f2123n, this, this.f2124o);
    }

    public i(Function0 function0, o oVar, String str, View view, A1.d dVar, n nVar, UUID uuid, k kVar) {
        super(view.getContext(), null, 0, 6, null);
        this.f2118i = function0;
        this.f2119j = oVar;
        this.f2120k = str;
        this.f2121l = view;
        this.f2122m = kVar;
        Object systemService = view.getContext().getSystemService("window");
        kotlin.jvm.internal.t.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        this.f2123n = (WindowManager) systemService;
        this.f2124o = m();
        this.f2125p = nVar;
        this.f2126q = t.Ltr;
        this.f2127r = l1.e(null, null, 2, null);
        this.f2128s = l1.e(null, null, 2, null);
        this.f2130u = g1.d(new f());
        float fM = A1.h.m(8);
        this.f2131v = fM;
        this.f2132w = new Rect();
        this.f2133x = new z(new g());
        setId(R.id.content);
        T.b(this, T.a(view));
        U.b(this, U.a(view));
        p217z2.g.b(this, p217z2.g.a(view));
        setTag(L0.l.f4860H, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.E0(fM));
        setOutlineProvider(new a());
        this.f2134y = l1.e(E1.e.f2092a.a(), null, 2, null);
        this.f2117A = new int[2];
    }

    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    @Override // p065h1.V0
    public AbstractC2378a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int i8) {
    }
}
