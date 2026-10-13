package androidx.compose.ui.platform;

import C6.G;
import C6.InterfaceC0916e;
import J0.AbstractC1028k;
import R0.B0;
import R0.C1588g0;
import R0.pkXL.Oitvkwcwn;
import U1.C1639a;
import U1.I;
import U1.M;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStructure;
import android.view.ViewTreeObserver;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.AnimationUtils;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.translation.ViewTranslationCallback;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.semantics.EmptySemanticsElement;
import androidx.lifecycle.AbstractC1726i;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1733p;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p011b1.C1761i;
import p011b1.D;
import p011b1.InterfaceC1772u;
import p011b1.O;
import p011b1.w;
import p038e1.a0;
import p038e1.b0;
import p038e1.e0;
import p056g1.F;
import p056g1.H;
import p056g1.Q;
import p056g1.Z;
import p056g1.g0;
import p056g1.h0;
import p056g1.j0;
import p056g1.o0;
import p065h1.A;
import p065h1.AbstractC2407o0;
import p065h1.AbstractC2423x;
import p065h1.B;
import p065h1.C;
import p065h1.C2386e;
import p065h1.C2387e0;
import p065h1.C2388f;
import p065h1.C2414s0;
import p065h1.E;
import p065h1.H0;
import p065h1.J;
import p065h1.J0;
import p065h1.P;
import p065h1.R0;
import p065h1.S;
import p065h1.S0;
import p065h1.T;
import p065h1.W0;
import p065h1.X0;
import p065h1.Y0;
import p168t1.AbstractC3009n;
import p168t1.InterfaceC3008m;
import p168t1.r;
import p215z0.InterfaceC3164l0;
import p215z0.g1;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class AndroidComposeView extends ViewGroup implements h0, androidx.compose.ui.platform.i, O, DefaultLifecycleObserver {

    /* JADX INFO: renamed from: L0, reason: collision with root package name */
    public static final b f14757L0 = new b(null);

    /* JADX INFO: renamed from: M0, reason: collision with root package name */
    public static final int f14758M0 = 8;

    /* JADX INFO: renamed from: N0, reason: collision with root package name */
    public static Class f14759N0;

    /* JADX INFO: renamed from: O0, reason: collision with root package name */
    public static Method f14760O0;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public final C2388f f14761A;

    /* JADX INFO: renamed from: A0, reason: collision with root package name */
    public MotionEvent f14762A0;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final C2386e f14763B;

    /* JADX INFO: renamed from: B0, reason: collision with root package name */
    public long f14764B0;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final j0 f14765C;

    /* JADX INFO: renamed from: C0, reason: collision with root package name */
    public final W0 f14766C0;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f14767D;

    /* JADX INFO: renamed from: D0, reason: collision with root package name */
    public final B0.d f14768D0;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public P f14769E;

    /* JADX INFO: renamed from: E0, reason: collision with root package name */
    public final n f14770E0;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public C2387e0 f14771F;

    /* JADX INFO: renamed from: F0, reason: collision with root package name */
    public final Runnable f14772F0;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public A1.b f14773G;

    /* JADX INFO: renamed from: G0, reason: collision with root package name */
    public boolean f14774G0;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public boolean f14775H;

    /* JADX INFO: renamed from: H0, reason: collision with root package name */
    public final Function0 f14776H0;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final Q f14777I;

    /* JADX INFO: renamed from: I0, reason: collision with root package name */
    public final p065h1.Q f14778I0;

    /* JADX INFO: renamed from: J0, reason: collision with root package name */
    public boolean f14779J0;

    /* JADX INFO: renamed from: K0, reason: collision with root package name */
    public final w f14780K0;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public final R0 f14781V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public long f14782W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G6.g f14783a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public final int[] f14784a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f14785b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public final float[] f14786b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f14787c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public final float[] f14788c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final H f14789d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public final float[] f14790d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public A1.d f14791e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public long f14792e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final EmptySemanticsElement f14793f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public boolean f14794f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final P0.g f14795g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public long f14796g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final DragAndDropModifierOnDragListener f14797h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public boolean f14798h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final N0.c f14799i;

    /* JADX INFO: renamed from: i0, reason: collision with root package name */
    public final InterfaceC3164l0 f14800i0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final Y0 f14801j;

    /* JADX INFO: renamed from: j0, reason: collision with root package name */
    public final q1 f14802j0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final L0.i f14803k;

    /* JADX INFO: renamed from: k0, reason: collision with root package name */
    public Q6.k f14804k0;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final L0.i f14805l;

    /* JADX INFO: renamed from: l0, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f14806l0;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final C1588g0 f14807m;

    /* JADX INFO: renamed from: m0, reason: collision with root package name */
    public final ViewTreeObserver.OnScrollChangedListener f14808m0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final F f14809n;

    /* JADX INFO: renamed from: n0, reason: collision with root package name */
    public final ViewTreeObserver.OnTouchModeChangeListener f14810n0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final o0 f14811o;

    /* JADX INFO: renamed from: o0, reason: collision with root package name */
    public final p176u1.Q f14812o0;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final p110m1.q f14813p;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public final p176u1.O f14814p0;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final androidx.compose.ui.platform.g f14815q;

    /* JADX INFO: renamed from: q0, reason: collision with root package name */
    public final AtomicReference f14816q0;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final M0.i f14817r;

    /* JADX INFO: renamed from: r0, reason: collision with root package name */
    public final H0 f14818r0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final List f14819s;

    /* JADX INFO: renamed from: s0, reason: collision with root package name */
    public final InterfaceC3008m.a f14820s0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public List f14821t;

    /* JADX INFO: renamed from: t0, reason: collision with root package name */
    public final InterfaceC3164l0 f14822t0;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14823u;

    /* JADX INFO: renamed from: u0, reason: collision with root package name */
    public int f14824u0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public final C1761i f14825v;

    /* JADX INFO: renamed from: v0, reason: collision with root package name */
    public final InterfaceC3164l0 f14826v0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final D f14827w;

    /* JADX INFO: renamed from: w0, reason: collision with root package name */
    public final X0.a f14828w0;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public Q6.k f14829x;

    /* JADX INFO: renamed from: x0, reason: collision with root package name */
    public final Y0.c f14830x0;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final M0.a f14831y;

    /* JADX INFO: renamed from: y0, reason: collision with root package name */
    public final p047f1.f f14832y0;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f14833z;

    /* JADX INFO: renamed from: z0, reason: collision with root package name */
    public final J0 f14834z0;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements ViewTranslationCallback {
        public boolean onClearTranslation(View view) {
            t.e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).f14815q.G0();
            return true;
        }

        public boolean onHideTranslation(View view) {
            t.e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).f14815q.I0();
            return true;
        }

        public boolean onShowTranslation(View view) {
            t.e(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
            ((AndroidComposeView) view).f14815q.L0();
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {
        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        public final boolean b() {
            try {
                if (AndroidComposeView.f14759N0 == null) {
                    AndroidComposeView.f14759N0 = Class.forName(com.amazon.a.a.o.b.at);
                    Class cls = AndroidComposeView.f14759N0;
                    AndroidComposeView.f14760O0 = cls != null ? cls.getDeclaredMethod("getBoolean", String.class, Boolean.TYPE) : null;
                }
                Method method = AndroidComposeView.f14760O0;
                Object objInvoke = method != null ? method.invoke(null, Oitvkwcwn.Zdy, Boolean.FALSE) : null;
                Boolean bool = objInvoke instanceof Boolean ? (Boolean) objInvoke : null;
                if (bool != null) {
                    return bool.booleanValue();
                }
                return false;
            } catch (Exception unused) {
                return false;
            }
        }

        public b() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1733p f14835a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final p217z2.f f14836b;

        public c(InterfaceC1733p interfaceC1733p, p217z2.f fVar) {
            this.f14835a = interfaceC1733p;
            this.f14836b = fVar;
        }

        public final InterfaceC1733p a() {
            return this.f14835a;
        }

        public final p217z2.f b() {
            return this.f14836b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements Q6.k {
        public d() {
            super(1);
        }

        public final Boolean b(int i8) {
            boolean zRequestFocusFromTouch;
            Y0.a.C0304a c0304a = Y0.a.f12080b;
            if (Y0.a.f(i8, c0304a.b())) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode();
            } else if (Y0.a.f(i8, c0304a.a())) {
                zRequestFocusFromTouch = AndroidComposeView.this.isInTouchMode() ? AndroidComposeView.this.requestFocusFromTouch() : true;
            } else {
                zRequestFocusFromTouch = false;
            }
            return Boolean.valueOf(zRequestFocusFromTouch);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Y0.a) obj).i());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends C1639a {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ F f14839e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f14840f;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f14841a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke(F f8) {
                return Boolean.valueOf(f8.j0().r(Z.a(8)));
            }
        }

        public e(F f8, AndroidComposeView androidComposeView) {
            this.f14839e = f8;
            this.f14840f = androidComposeView;
        }

        /* JADX WARN: Code duplicated, block: B:12:0x003d  */
        @Override // U1.C1639a
        public void g(View view, V1.l lVar) {
            super.g(view, lVar);
            if (AndroidComposeView.this.f14815q.A0()) {
                lVar.F0(false);
            }
            F f8 = p110m1.p.f(this.f14839e, a.f14841a);
            Integer numValueOf = f8 != null ? Integer.valueOf(f8.o0()) : null;
            if (numValueOf != null) {
                if (numValueOf.intValue() == AndroidComposeView.this.getSemanticsOwner().a().n()) {
                    numValueOf = -1;
                }
            } else {
                numValueOf = -1;
            }
            lVar.p0(this.f14840f, numValueOf.intValue());
            int iO0 = this.f14839e.o0();
            Integer num = (Integer) AndroidComposeView.this.f14815q.k0().get(Integer.valueOf(iO0));
            if (num != null) {
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                AndroidComposeView androidComposeView2 = this.f14840f;
                int iIntValue = num.intValue();
                View viewD = AbstractC2423x.D(androidComposeView.getAndroidViewsHandler$ui_release(), num.intValue());
                if (viewD != null) {
                    lVar.C0(viewD);
                } else {
                    lVar.D0(androidComposeView2, iIntValue);
                }
                androidComposeView.P(iO0, lVar.G0(), androidComposeView.f14815q.i0());
            }
            Integer num2 = (Integer) AndroidComposeView.this.f14815q.j0().get(Integer.valueOf(iO0));
            if (num2 != null) {
                AndroidComposeView androidComposeView3 = AndroidComposeView.this;
                AndroidComposeView androidComposeView4 = this.f14840f;
                int iIntValue2 = num2.intValue();
                View viewD2 = AbstractC2423x.D(androidComposeView3.getAndroidViewsHandler$ui_release(), num2.intValue());
                if (viewD2 != null) {
                    lVar.A0(viewD2);
                } else {
                    lVar.B0(androidComposeView4, iIntValue2);
                }
                androidComposeView3.P(iO0, lVar.G0(), androidComposeView3.f14815q.h0());
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class g extends C2639q implements Q6.p {
        public g(Object obj) {
            super(3, obj, AndroidComposeView.class, "startDrag", "startDrag-12SF9DM(Landroidx/compose/ui/draganddrop/DragAndDropTransferData;JLkotlin/jvm/functions/Function1;)Z", 0);
        }

        public final Boolean h(N0.h hVar, long j8, Q6.k kVar) {
            return Boolean.valueOf(((AndroidComposeView) this.receiver).A0(hVar, j8, kVar));
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return h((N0.h) obj, ((Q0.l) obj2).m(), (Q6.k) obj3);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends u implements Q6.k {
        public h() {
            super(1);
        }

        public final void b(Function0 function0) {
            AndroidComposeView.this.r(function0);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Function0) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends u implements Q6.k {
        public i() {
            super(1);
        }

        public final Boolean b(KeyEvent keyEvent) {
            androidx.compose.ui.focus.c cVarX = AndroidComposeView.this.X(keyEvent);
            return (cVarX == null || !Z0.c.e(Z0.d.b(keyEvent), Z0.c.f12836a.a())) ? Boolean.FALSE : Boolean.valueOf(AndroidComposeView.this.getFocusOwner().i(cVarX.o()));
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            return b(((Z0.b) obj).f());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ boolean f14845a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AndroidComposeView f14846b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(boolean z8, AndroidComposeView androidComposeView) {
            super(0);
            this.f14845a = z8;
            this.f14846b = androidComposeView;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m85invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m85invoke() {
            if (this.f14845a) {
                this.f14846b.clearFocus();
            } else {
                this.f14846b.requestFocus();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k implements w {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public InterfaceC1772u f14847a = InterfaceC1772u.f15790a.a();

        public k() {
        }

        @Override // p011b1.w
        public void a(InterfaceC1772u interfaceC1772u) {
            if (interfaceC1772u == null) {
                interfaceC1772u = InterfaceC1772u.f15790a.a();
            }
            this.f14847a = interfaceC1772u;
            p065h1.D.f24089a.a(AndroidComposeView.this, interfaceC1772u);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends u implements Function0 {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ D1.c f14850b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(D1.c cVar) {
            super(0);
            this.f14850b = cVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m86invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m86invoke() {
            AndroidComposeView.this.getAndroidViewsHandler$ui_release().removeViewInLayout(this.f14850b);
            HashMap<F, D1.c> layoutNodeToHolder = AndroidComposeView.this.getAndroidViewsHandler$ui_release().getLayoutNodeToHolder();
            kotlin.jvm.internal.P.d(layoutNodeToHolder).remove(AndroidComposeView.this.getAndroidViewsHandler$ui_release().getHolderToLayoutNode().remove(this.f14850b));
            I.P(this.f14850b, 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m extends u implements Function0 {
        public m() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        public /* bridge */ /* synthetic */ Object invoke() {
            m87invoke();
            return G.f1419a;
        }

        /* JADX INFO: renamed from: invoke, reason: collision with other method in class */
        public final void m87invoke() {
            MotionEvent motionEvent = AndroidComposeView.this.f14762A0;
            if (motionEvent != null) {
                int actionMasked = motionEvent.getActionMasked();
                if (actionMasked == 7 || actionMasked == 9) {
                    AndroidComposeView.this.f14764B0 = SystemClock.uptimeMillis();
                    AndroidComposeView androidComposeView = AndroidComposeView.this;
                    androidComposeView.post(androidComposeView.f14770E0);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n implements Runnable {
        public n() {
        }

        @Override // java.lang.Runnable
        public void run() {
            AndroidComposeView.this.removeCallbacks(this);
            MotionEvent motionEvent = AndroidComposeView.this.f14762A0;
            if (motionEvent != null) {
                boolean z8 = motionEvent.getToolType(0) == 3;
                int actionMasked = motionEvent.getActionMasked();
                if (z8) {
                    if (actionMasked == 10 || actionMasked == 1) {
                        return;
                    }
                } else if (actionMasked == 1) {
                    return;
                }
                int i8 = 7;
                if (actionMasked != 7 && actionMasked != 9) {
                    i8 = 2;
                }
                AndroidComposeView androidComposeView = AndroidComposeView.this;
                androidComposeView.y0(motionEvent, i8, androidComposeView.f14764B0, false);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f14853a = new o();

        public o() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(p029d1.c cVar) {
            return Boolean.FALSE;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends u implements Q6.k {
        public p() {
            super(1);
        }

        public static final void d(Function0 function0) {
            function0.invoke();
        }

        public final void c(final Function0 function0) {
            Handler handler = AndroidComposeView.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                function0.invoke();
                return;
            }
            Handler handler2 = AndroidComposeView.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: h1.m
                    @Override // java.lang.Runnable
                    public final void run() {
                        AndroidComposeView.p.d(function0);
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
    public static final class q extends u implements Function0 {
        public q() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final c invoke() {
            return AndroidComposeView.this.get_viewTreeOwners();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AndroidComposeView(Context context, G6.g gVar) {
        super(context);
        this.f14783a = gVar;
        Q0.f.a aVar = Q0.f.f9082b;
        this.f14785b = aVar.b();
        this.f14787c = true;
        this.f14789d = new H(null, 1, 0 == true ? 1 : 0);
        this.f14791e = A1.a.a(context);
        EmptySemanticsElement emptySemanticsElement = EmptySemanticsElement.f15037b;
        this.f14793f = emptySemanticsElement;
        this.f14795g = new FocusOwnerImpl(new h());
        DragAndDropModifierOnDragListener dragAndDropModifierOnDragListener = new DragAndDropModifierOnDragListener(new g(this));
        this.f14797h = dragAndDropModifierOnDragListener;
        this.f14799i = dragAndDropModifierOnDragListener;
        this.f14801j = new Y0();
        L0.i.a aVar2 = L0.i.f4836a;
        L0.i iVarA = androidx.compose.ui.input.key.a.a(aVar2, new i());
        this.f14803k = iVarA;
        L0.i iVarA2 = androidx.compose.ui.input.rotary.a.a(aVar2, o.f14853a);
        this.f14805l = iVarA2;
        this.f14807m = new C1588g0();
        F f8 = new F(false, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
        f8.m(e0.f20464b);
        f8.l(getDensity());
        f8.j(aVar2.j(emptySemanticsElement).j(iVarA2).j(getFocusOwner().c()).j(iVarA).j(dragAndDropModifierOnDragListener.d()));
        this.f14809n = f8;
        this.f14811o = this;
        this.f14813p = new p110m1.q(getRoot());
        androidx.compose.ui.platform.g gVar2 = new androidx.compose.ui.platform.g(this);
        this.f14815q = gVar2;
        this.f14817r = new M0.i();
        this.f14819s = new ArrayList();
        this.f14825v = new C1761i();
        this.f14827w = new D(getRoot());
        this.f14829x = f.f14842a;
        this.f14831y = Q() ? new M0.a(this, getAutofillTree()) : null;
        this.f14761A = new C2388f(context);
        this.f14763B = new C2386e(context);
        this.f14765C = new j0(new p());
        this.f14777I = new Q(getRoot());
        this.f14781V = new p065h1.O(ViewConfiguration.get(context));
        this.f14782W = A1.o.a(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f14784a0 = new int[]{0, 0};
        float[] fArrC = B0.c(null, 1, null);
        this.f14786b0 = fArrC;
        this.f14788c0 = B0.c(null, 1, null);
        this.f14790d0 = B0.c(null, 1, null);
        this.f14792e0 = -1L;
        this.f14796g0 = aVar.a();
        this.f14798h0 = true;
        this.f14800i0 = l1.e(null, null, 2, null);
        this.f14802j0 = g1.d(new q());
        this.f14806l0 = new ViewTreeObserver.OnGlobalLayoutListener() { // from class: h1.i
            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                AndroidComposeView.Z(this.f24295a);
            }
        };
        this.f14808m0 = new ViewTreeObserver.OnScrollChangedListener() { // from class: h1.j
            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                AndroidComposeView.v0(this.f24296a);
            }
        };
        this.f14810n0 = new ViewTreeObserver.OnTouchModeChangeListener() { // from class: h1.k
            @Override // android.view.ViewTreeObserver.OnTouchModeChangeListener
            public final void onTouchModeChanged(boolean z8) {
                AndroidComposeView.B0(this.f24301a, z8);
            }
        };
        p176u1.Q q8 = new p176u1.Q(getView(), this);
        this.f14812o0 = q8;
        this.f14814p0 = new p176u1.O((p176u1.H) p065h1.F.f().invoke(q8));
        this.f14816q0 = L0.o.a();
        this.f14818r0 = new p065h1.Z(getTextInputService());
        this.f14820s0 = new p065h1.G(context);
        this.f14822t0 = g1.i(r.a(context), g1.o());
        this.f14824u0 = Y(context.getResources().getConfiguration());
        this.f14826v0 = l1.e(p065h1.F.e(context.getResources().getConfiguration()), null, 2, null);
        this.f14828w0 = new X0.c(this);
        this.f14830x0 = new Y0.c(isInTouchMode() ? Y0.a.f12080b.b() : Y0.a.f12080b.a(), new d(), null);
        this.f14832y0 = new p047f1.f(this);
        this.f14834z0 = new J(this);
        this.f14766C0 = new W0();
        this.f14768D0 = new B0.d(new Function0[16], 0);
        this.f14770E0 = new n();
        this.f14772F0 = new Runnable() { // from class: h1.l
            @Override // java.lang.Runnable
            public final void run() {
                AndroidComposeView.w0(this.f24304a);
            }
        };
        this.f14776H0 = new m();
        int i8 = Build.VERSION.SDK_INT;
        this.f14778I0 = i8 >= 29 ? new T() : new S(fArrC, null);
        setWillNotDraw(false);
        setFocusable(true);
        E.f24091a.a(this, 1, false);
        setFocusableInTouchMode(true);
        setClipChildren(false);
        I.I(this, gVar2);
        Q6.k kVarA = androidx.compose.ui.platform.i.f15018M.a();
        if (kVarA != null) {
            kVarA.invoke(this);
        }
        setOnDragListener(dragAndDropModifierOnDragListener);
        getRoot().t(this);
        if (i8 >= 29) {
            A.f24067a.a(this);
        }
        this.f14780K0 = new k();
    }

    public static final void B0(AndroidComposeView androidComposeView, boolean z8) {
        androidComposeView.f14830x0.b(z8 ? Y0.a.f12080b.b() : Y0.a.f12080b.a());
    }

    public static final void Z(AndroidComposeView androidComposeView) {
        androidComposeView.C0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final c get_viewTreeOwners() {
        return (c) this.f14800i0.getValue();
    }

    private void setFontFamilyResolver(AbstractC3009n.b bVar) {
        this.f14822t0.setValue(bVar);
    }

    private void setLayoutDirection(A1.t tVar) {
        this.f14826v0.setValue(tVar);
    }

    private final void set_viewTreeOwners(c cVar) {
        this.f14800i0.setValue(cVar);
    }

    public static /* synthetic */ void t0(AndroidComposeView androidComposeView, F f8, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = null;
        }
        androidComposeView.s0(f8);
    }

    public static final void v0(AndroidComposeView androidComposeView) {
        androidComposeView.C0();
    }

    public static final void w0(AndroidComposeView androidComposeView) {
        androidComposeView.f14774G0 = false;
        MotionEvent motionEvent = androidComposeView.f14762A0;
        t.d(motionEvent);
        if (motionEvent.getActionMasked() != 10) {
            throw new IllegalStateException("The ACTION_HOVER_EXIT event was not cleared.");
        }
        androidComposeView.x0(motionEvent);
    }

    public static /* synthetic */ void z0(AndroidComposeView androidComposeView, MotionEvent motionEvent, int i8, long j8, boolean z8, int i9, Object obj) {
        if ((i9 & 8) != 0) {
            z8 = true;
        }
        androidComposeView.y0(motionEvent, i8, j8, z8);
    }

    public final boolean A0(N0.h hVar, long j8, Q6.k kVar) {
        Resources resources = getContext().getResources();
        return B.f24069a.a(this, hVar, new N0.a(A1.f.a(resources.getDisplayMetrics().density, resources.getConfiguration().fontScale), j8, kVar, null));
    }

    public final void C0() {
        getLocationOnScreen(this.f14784a0);
        long j8 = this.f14782W;
        int iC = A1.n.c(j8);
        int iD = A1.n.d(j8);
        int[] iArr = this.f14784a0;
        boolean z8 = false;
        int i8 = iArr[0];
        if (iC != i8 || iD != iArr[1]) {
            this.f14782W = A1.o.a(i8, iArr[1]);
            if (iC != Integer.MAX_VALUE && iD != Integer.MAX_VALUE) {
                getRoot().T().F().H1();
                z8 = true;
            }
        }
        this.f14777I.c(z8);
    }

    public final void O(D1.c cVar, F f8) {
        getAndroidViewsHandler$ui_release().getHolderToLayoutNode().put(cVar, f8);
        getAndroidViewsHandler$ui_release().addView(cVar);
        getAndroidViewsHandler$ui_release().getLayoutNodeToHolder().put(f8, cVar);
        I.P(cVar, 1);
        I.I(cVar, new e(f8, this));
    }

    public final void P(int i8, AccessibilityNodeInfo accessibilityNodeInfo, String str) {
        Integer num;
        if (t.c(str, this.f14815q.i0())) {
            Integer num2 = (Integer) this.f14815q.k0().get(Integer.valueOf(i8));
            if (num2 != null) {
                accessibilityNodeInfo.getExtras().putInt(str, num2.intValue());
                return;
            }
            return;
        }
        if (!t.c(str, this.f14815q.h0()) || (num = (Integer) this.f14815q.j0().get(Integer.valueOf(i8))) == null) {
            return;
        }
        accessibilityNodeInfo.getExtras().putInt(str, num.intValue());
    }

    public final boolean Q() {
        return true;
    }

    public final Object R(G6.d dVar) {
        Object objO = this.f14815q.O(dVar);
        return objO == H6.c.f() ? objO : G.f1419a;
    }

    public final boolean S(F f8) {
        if (this.f14775H) {
            return true;
        }
        F fM0 = f8.m0();
        return (fM0 == null || fM0.M()) ? false : true;
    }

    public final void T(ViewGroup viewGroup) {
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if (childAt instanceof AndroidComposeView) {
                ((AndroidComposeView) childAt).s();
            } else if (childAt instanceof ViewGroup) {
                T((ViewGroup) childAt);
            }
        }
    }

    public final long U(int i8) {
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        if (mode == Integer.MIN_VALUE) {
            return l0(0, size);
        }
        if (mode == 0) {
            return l0(0, Integer.MAX_VALUE);
        }
        if (mode == 1073741824) {
            return l0(size, size);
        }
        throw new IllegalStateException();
    }

    public final void V(D1.c cVar, Canvas canvas) {
        getAndroidViewsHandler$ui_release().a(cVar, canvas);
    }

    public final View W(int i8, View view) throws NoSuchMethodException {
        if (Build.VERSION.SDK_INT < 29) {
            Method declaredMethod = View.class.getDeclaredMethod("getAccessibilityViewId", null);
            declaredMethod.setAccessible(true);
            if (t.c(declaredMethod.invoke(view, null), Integer.valueOf(i8))) {
                return view;
            }
            if (view instanceof ViewGroup) {
                ViewGroup viewGroup = (ViewGroup) view;
                int childCount = viewGroup.getChildCount();
                for (int i9 = 0; i9 < childCount; i9++) {
                    View viewW = W(i8, viewGroup.getChildAt(i9));
                    if (viewW != null) {
                        return viewW;
                    }
                }
            }
        }
        return null;
    }

    public androidx.compose.ui.focus.c X(KeyEvent keyEvent) {
        long jA = Z0.d.a(keyEvent);
        Z0.a.C0318a c0318a = Z0.a.f12684b;
        if (Z0.a.p(jA, c0318a.l())) {
            return androidx.compose.ui.focus.c.i(Z0.d.f(keyEvent) ? androidx.compose.ui.focus.c.f14597b.f() : androidx.compose.ui.focus.c.f14597b.e());
        }
        if (Z0.a.p(jA, c0318a.e())) {
            return androidx.compose.ui.focus.c.i(androidx.compose.ui.focus.c.f14597b.g());
        }
        if (Z0.a.p(jA, c0318a.d())) {
            return androidx.compose.ui.focus.c.i(androidx.compose.ui.focus.c.f14597b.d());
        }
        if (Z0.a.p(jA, c0318a.f()) ? true : Z0.a.p(jA, c0318a.k())) {
            return androidx.compose.ui.focus.c.i(androidx.compose.ui.focus.c.f14597b.h());
        }
        if (Z0.a.p(jA, c0318a.c()) ? true : Z0.a.p(jA, c0318a.j())) {
            return androidx.compose.ui.focus.c.i(androidx.compose.ui.focus.c.f14597b.a());
        }
        if (Z0.a.p(jA, c0318a.b()) ? true : Z0.a.p(jA, c0318a.g()) ? true : Z0.a.p(jA, c0318a.i())) {
            return androidx.compose.ui.focus.c.i(androidx.compose.ui.focus.c.f14597b.b());
        }
        if (Z0.a.p(jA, c0318a.a()) ? true : Z0.a.p(jA, c0318a.h())) {
            return androidx.compose.ui.focus.c.i(androidx.compose.ui.focus.c.f14597b.c());
        }
        return null;
    }

    public final int Y(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 31) {
            return configuration.fontWeightAdjustment;
        }
        return 0;
    }

    @Override // p056g1.h0
    public void a(boolean z8) {
        Function0 function0;
        if (this.f14777I.k() || this.f14777I.l()) {
            Trace.beginSection("AndroidOwner:measureAndLayout");
            if (z8) {
                try {
                    function0 = this.f14776H0;
                } finally {
                    Trace.endSection();
                }
            } else {
                function0 = null;
            }
            if (this.f14777I.p(function0)) {
                requestLayout();
            }
            Q.d(this.f14777I, false, 1, null);
            G g8 = G.f1419a;
        }
    }

    public final int a0(MotionEvent motionEvent) {
        removeCallbacks(this.f14770E0);
        try {
            n0(motionEvent);
            boolean z8 = true;
            this.f14794f0 = true;
            a(false);
            Trace.beginSection("AndroidOwner:onTouch");
            try {
                int actionMasked = motionEvent.getActionMasked();
                MotionEvent motionEvent2 = this.f14762A0;
                boolean z9 = motionEvent2 != null && motionEvent2.getToolType(0) == 3;
                if (motionEvent2 != null && c0(motionEvent, motionEvent2)) {
                    if (h0(motionEvent2)) {
                        this.f14827w.b();
                    } else if (motionEvent2.getActionMasked() != 10 && z9) {
                        z0(this, motionEvent2, 10, motionEvent2.getEventTime(), false, 8, null);
                    }
                }
                if (motionEvent.getToolType(0) != 3) {
                    z8 = false;
                }
                if (!z9 && z8 && actionMasked != 3 && actionMasked != 9 && i0(motionEvent)) {
                    z0(this, motionEvent, 9, motionEvent.getEventTime(), false, 8, null);
                }
                if (motionEvent2 != 0) {
                    motionEvent2.recycle();
                }
                this.f14762A0 = MotionEvent.obtainNoHistory(motionEvent);
                int iX0 = x0(motionEvent);
                Trace.endSection();
                this.f14794f0 = false;
                return iX0;
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        } catch (Throwable th2) {
            this.f14794f0 = false;
            throw th2;
        }
    }

    @Override // android.view.View
    public void autofill(SparseArray sparseArray) {
        M0.a aVar;
        if (!Q() || (aVar = this.f14831y) == null) {
            return;
        }
        M0.c.a(aVar, sparseArray);
    }

    @Override // p056g1.h0
    public void b(F f8, boolean z8) {
        this.f14777I.g(f8, z8);
    }

    public final boolean b0(MotionEvent motionEvent) {
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        float f8 = -motionEvent.getAxisValue(26);
        return getFocusOwner().m(new p029d1.c(M.h(viewConfiguration, getContext()) * f8, f8 * M.e(viewConfiguration, getContext()), motionEvent.getEventTime(), motionEvent.getDeviceId()));
    }

    public final boolean c0(MotionEvent motionEvent, MotionEvent motionEvent2) {
        return (motionEvent2.getSource() == motionEvent.getSource() && motionEvent2.getToolType(0) == motionEvent.getToolType(0)) ? false : true;
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i8) {
        return this.f14815q.R(false, i8, this.f14785b);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i8) {
        return this.f14815q.R(true, i8, this.f14785b);
    }

    public void d0() {
        e0(getRoot());
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        if (!isAttachedToWindow()) {
            e0(getRoot());
        }
        h0.m(this, false, 1, null);
        AbstractC1028k.f3974e.k();
        this.f14823u = true;
        C1588g0 c1588g0 = this.f14807m;
        Canvas canvasA = c1588g0.a().a();
        c1588g0.a().z(canvas);
        getRoot().A(c1588g0.a());
        c1588g0.a().z(canvasA);
        if (!this.f14819s.isEmpty()) {
            int size = this.f14819s.size();
            for (int i8 = 0; i8 < size; i8++) {
                ((g0) this.f14819s.get(i8)).j();
            }
        }
        if (androidx.compose.ui.platform.h.f14993p.b()) {
            int iSave = canvas.save();
            canvas.clipRect(0.0f, 0.0f, 0.0f, 0.0f);
            super.dispatchDraw(canvas);
            canvas.restoreToCount(iSave);
        }
        this.f14819s.clear();
        this.f14823u = false;
        List list = this.f14821t;
        if (list != null) {
            t.d(list);
            this.f14819s.addAll(list);
            list.clear();
        }
    }

    @Override // android.view.View
    public boolean dispatchGenericMotionEvent(MotionEvent motionEvent) {
        if (motionEvent.getActionMasked() != 8) {
            return super.dispatchGenericMotionEvent(motionEvent);
        }
        if (motionEvent.isFromSource(4194304)) {
            return b0(motionEvent);
        }
        return (g0(motionEvent) || !isAttachedToWindow()) ? super.dispatchGenericMotionEvent(motionEvent) : p011b1.P.c(a0(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchHoverEvent(MotionEvent motionEvent) {
        if (this.f14774G0) {
            removeCallbacks(this.f14772F0);
            this.f14772F0.run();
        }
        if (g0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        this.f14815q.Z(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked != 7) {
            if (actionMasked == 10 && i0(motionEvent)) {
                if (motionEvent.getToolType(0) == 3 && motionEvent.getButtonState() != 0) {
                    return false;
                }
                MotionEvent motionEvent2 = this.f14762A0;
                if (motionEvent2 != null) {
                    motionEvent2.recycle();
                }
                this.f14762A0 = MotionEvent.obtainNoHistory(motionEvent);
                this.f14774G0 = true;
                post(this.f14772F0);
                return false;
            }
        } else if (!j0(motionEvent)) {
            return false;
        }
        return p011b1.P.c(a0(motionEvent));
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        if (!isFocused()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        this.f14801j.a(p011b1.M.b(keyEvent.getMetaState()));
        return getFocusOwner().p(Z0.b.b(keyEvent)) || super.dispatchKeyEvent(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEventPreIme(KeyEvent keyEvent) {
        return (isFocused() && getFocusOwner().j(Z0.b.b(keyEvent))) || super.dispatchKeyEventPreIme(keyEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        if (this.f14774G0) {
            removeCallbacks(this.f14772F0);
            MotionEvent motionEvent2 = this.f14762A0;
            t.d(motionEvent2);
            if (motionEvent.getActionMasked() != 0 || c0(motionEvent, motionEvent2)) {
                this.f14772F0.run();
            } else {
                this.f14774G0 = false;
            }
        }
        if (g0(motionEvent) || !isAttachedToWindow()) {
            return false;
        }
        if (motionEvent.getActionMasked() == 2 && !j0(motionEvent)) {
            return false;
        }
        int iA0 = a0(motionEvent);
        if (p011b1.P.b(iA0)) {
            getParent().requestDisallowInterceptTouchEvent(true);
        }
        return p011b1.P.c(iA0);
    }

    public final void e0(F f8) {
        f8.D0();
        B0.d dVarU0 = f8.u0();
        int iS = dVarU0.s();
        if (iS > 0) {
            Object[] objArrR = dVarU0.r();
            int i8 = 0;
            do {
                e0((F) objArrR[i8]);
                i8++;
            } while (i8 < iS);
        }
    }

    @Override // p056g1.h0
    public long f(long j8) {
        m0();
        return B0.f(this.f14788c0, j8);
    }

    public final void f0(F f8) {
        int i8 = 0;
        Q.H(this.f14777I, f8, false, 2, null);
        B0.d dVarU0 = f8.u0();
        int iS = dVarU0.s();
        if (iS > 0) {
            Object[] objArrR = dVarU0.r();
            do {
                f0((F) objArrR[i8]);
                i8++;
            } while (i8 < iS);
        }
    }

    public final View findViewByAccessibilityIdTraversal(int i8) throws IllegalAccessException, InvocationTargetException {
        try {
            if (Build.VERSION.SDK_INT < 29) {
                return W(i8, this);
            }
            Method declaredMethod = View.class.getDeclaredMethod("findViewByAccessibilityIdTraversal", Integer.TYPE);
            declaredMethod.setAccessible(true);
            Object objInvoke = declaredMethod.invoke(this, Integer.valueOf(i8));
            if (objInvoke instanceof View) {
                return (View) objInvoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    @Override // p056g1.h0
    public long g(long j8) {
        m0();
        return B0.f(this.f14790d0, j8);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0044  */
    /* JADX WARN: Code duplicated, block: B:37:0x007f  */
    public final boolean g0(MotionEvent motionEvent) {
        boolean z8;
        float x8 = motionEvent.getX();
        if (Float.isInfinite(x8) || Float.isNaN(x8)) {
            z8 = true;
        } else {
            float y8 = motionEvent.getY();
            if (Float.isInfinite(y8) || Float.isNaN(y8)) {
                z8 = true;
            } else {
                float rawX = motionEvent.getRawX();
                if (Float.isInfinite(rawX) || Float.isNaN(rawX)) {
                    z8 = true;
                } else {
                    float rawY = motionEvent.getRawY();
                    if (Float.isInfinite(rawY) || Float.isNaN(rawY)) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
            }
        }
        if (!z8) {
            int pointerCount = motionEvent.getPointerCount();
            for (int i8 = 1; i8 < pointerCount; i8++) {
                float x9 = motionEvent.getX(i8);
                if (Float.isInfinite(x9) || Float.isNaN(x9)) {
                    z8 = true;
                } else {
                    float y9 = motionEvent.getY(i8);
                    if (Float.isInfinite(y9) || Float.isNaN(y9) || (Build.VERSION.SDK_INT >= 29 && !C2414s0.f24326a.a(motionEvent, i8))) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
                if (z8) {
                    break;
                }
            }
        }
        return z8;
    }

    public final P getAndroidViewsHandler$ui_release() {
        if (this.f14769E == null) {
            P p8 = new P(getContext());
            this.f14769E = p8;
            addView(p8);
        }
        P p9 = this.f14769E;
        t.d(p9);
        return p9;
    }

    @Override // p056g1.h0
    public M0.d getAutofill() {
        return this.f14831y;
    }

    @Override // p056g1.h0
    public M0.i getAutofillTree() {
        return this.f14817r;
    }

    public final Q6.k getConfigurationChangeObserver() {
        return this.f14829x;
    }

    @Override // p056g1.h0
    public G6.g getCoroutineContext() {
        return this.f14783a;
    }

    @Override // p056g1.h0
    public A1.d getDensity() {
        return this.f14791e;
    }

    @Override // p056g1.h0
    public N0.c getDragAndDropManager() {
        return this.f14799i;
    }

    @Override // p056g1.h0
    public P0.g getFocusOwner() {
        return this.f14795g;
    }

    @Override // android.view.View
    public void getFocusedRect(Rect rect) {
        G g8;
        Q0.h hVarH = getFocusOwner().h();
        if (hVarH != null) {
            rect.left = S6.c.d(hVarH.i());
            rect.top = S6.c.d(hVarH.l());
            rect.right = S6.c.d(hVarH.j());
            rect.bottom = S6.c.d(hVarH.e());
            g8 = G.f1419a;
        } else {
            g8 = null;
        }
        if (g8 == null) {
            super.getFocusedRect(rect);
        }
    }

    @Override // p056g1.h0
    public AbstractC3009n.b getFontFamilyResolver() {
        return (AbstractC3009n.b) this.f14822t0.getValue();
    }

    @Override // p056g1.h0
    public InterfaceC3008m.a getFontLoader() {
        return this.f14820s0;
    }

    @Override // p056g1.h0
    public X0.a getHapticFeedBack() {
        return this.f14828w0;
    }

    public boolean getHasPendingMeasureOrLayout() {
        return this.f14777I.k();
    }

    @Override // p056g1.h0
    public Y0.b getInputModeManager() {
        return this.f14830x0;
    }

    public final long getLastMatrixRecalculationAnimationTime$ui_release() {
        return this.f14792e0;
    }

    @Override // android.view.View, android.view.ViewParent, p056g1.h0
    public A1.t getLayoutDirection() {
        return (A1.t) this.f14826v0.getValue();
    }

    public long getMeasureIteration() {
        return this.f14777I.o();
    }

    @Override // p056g1.h0
    public p047f1.f getModifierLocalManager() {
        return this.f14832y0;
    }

    @Override // p056g1.h0
    public a0.a getPlacementScope() {
        return b0.b(this);
    }

    @Override // p056g1.h0
    public w getPointerIconService() {
        return this.f14780K0;
    }

    @Override // p056g1.h0
    public F getRoot() {
        return this.f14809n;
    }

    public o0 getRootForTest() {
        return this.f14811o;
    }

    public p110m1.q getSemanticsOwner() {
        return this.f14813p;
    }

    @Override // p056g1.h0
    public H getSharedDrawScope() {
        return this.f14789d;
    }

    @Override // p056g1.h0
    public boolean getShowLayoutBounds() {
        return this.f14767D;
    }

    @Override // p056g1.h0
    public j0 getSnapshotObserver() {
        return this.f14765C;
    }

    @Override // p056g1.h0
    public H0 getSoftwareKeyboardController() {
        return this.f14818r0;
    }

    @Override // p056g1.h0
    public p176u1.O getTextInputService() {
        return this.f14814p0;
    }

    @Override // p056g1.h0
    public J0 getTextToolbar() {
        return this.f14834z0;
    }

    @Override // p056g1.h0
    public R0 getViewConfiguration() {
        return this.f14781V;
    }

    public final c getViewTreeOwners() {
        return (c) this.f14802j0.getValue();
    }

    @Override // p056g1.h0
    public X0 getWindowInfo() {
        return this.f14801j;
    }

    @Override // p056g1.h0
    public void h(F f8, long j8) {
        Trace.beginSection("AndroidOwner:measureAndLayout");
        try {
            this.f14777I.q(f8, j8);
            if (!this.f14777I.k()) {
                Q.d(this.f14777I, false, 1, null);
            }
            G g8 = G.f1419a;
        } finally {
            Trace.endSection();
        }
    }

    public final boolean h0(MotionEvent motionEvent) {
        int actionMasked;
        return motionEvent.getButtonState() != 0 || (actionMasked = motionEvent.getActionMasked()) == 0 || actionMasked == 2 || actionMasked == 6;
    }

    @Override // p056g1.h0
    public void i(F f8) {
        this.f14777I.D(f8);
        t0(this, null, 1, null);
    }

    public final boolean i0(MotionEvent motionEvent) {
        float x8 = motionEvent.getX();
        float y8 = motionEvent.getY();
        return 0.0f <= x8 && x8 <= ((float) getWidth()) && 0.0f <= y8 && y8 <= ((float) getHeight());
    }

    public final boolean j0(MotionEvent motionEvent) {
        MotionEvent motionEvent2;
        return (motionEvent.getPointerCount() == 1 && (motionEvent2 = this.f14762A0) != null && motionEvent2.getPointerCount() == motionEvent.getPointerCount() && motionEvent.getRawX() == motionEvent2.getRawX() && motionEvent.getRawY() == motionEvent2.getRawY()) ? false : true;
    }

    @Override // p056g1.h0
    public g0 k(Q6.k kVar, Function0 function0) {
        g0 g0Var = (g0) this.f14766C0.b();
        if (g0Var != null) {
            g0Var.k(kVar, function0);
            return g0Var;
        }
        if (isHardwareAccelerated() && this.f14798h0) {
            try {
                return new p065h1.B0(this, kVar, function0);
            } catch (Throwable unused) {
                this.f14798h0 = false;
            }
        }
        if (this.f14771F == null) {
            androidx.compose.ui.platform.h.c cVar = androidx.compose.ui.platform.h.f14993p;
            if (!cVar.a()) {
                cVar.d(new View(getContext()));
            }
            C2387e0 c2387e0 = cVar.b() ? new C2387e0(getContext()) : new S0(getContext());
            this.f14771F = c2387e0;
            addView(c2387e0);
        }
        C2387e0 c2387e1 = this.f14771F;
        t.d(c2387e1);
        return new androidx.compose.ui.platform.h(this, c2387e1, kVar, function0);
    }

    public final void k0(g0 g0Var, boolean z8) {
        if (!z8) {
            if (this.f14823u) {
                return;
            }
            this.f14819s.remove(g0Var);
            List list = this.f14821t;
            if (list != null) {
                list.remove(g0Var);
                return;
            }
            return;
        }
        if (!this.f14823u) {
            this.f14819s.add(g0Var);
            return;
        }
        List arrayList = this.f14821t;
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f14821t = arrayList;
        }
        arrayList.add(g0Var);
    }

    @Override // p056g1.h0
    public void l(F f8) {
        this.f14815q.J0(f8);
    }

    public final long l0(int i8, int i9) {
        return C6.A.b(C6.A.b(i9) | C6.A.b(C6.A.b(i8) << 32));
    }

    public final void m0() {
        if (this.f14794f0) {
            return;
        }
        long jCurrentAnimationTimeMillis = AnimationUtils.currentAnimationTimeMillis();
        if (jCurrentAnimationTimeMillis != this.f14792e0) {
            this.f14792e0 = jCurrentAnimationTimeMillis;
            o0();
            ViewParent parent = getParent();
            View view = this;
            while (parent instanceof ViewGroup) {
                view = (View) parent;
                parent = ((ViewGroup) view).getParent();
            }
            view.getLocationOnScreen(this.f14784a0);
            int[] iArr = this.f14784a0;
            float f8 = iArr[0];
            float f9 = iArr[1];
            view.getLocationInWindow(iArr);
            int[] iArr2 = this.f14784a0;
            this.f14796g0 = Q0.g.a(f8 - iArr2[0], f9 - iArr2[1]);
        }
    }

    @Override // p056g1.h0
    public void n(F f8) {
        this.f14777I.t(f8);
        r0();
    }

    public final void n0(MotionEvent motionEvent) {
        this.f14792e0 = AnimationUtils.currentAnimationTimeMillis();
        o0();
        long jF = B0.f(this.f14788c0, Q0.g.a(motionEvent.getX(), motionEvent.getY()));
        this.f14796g0 = Q0.g.a(motionEvent.getRawX() - Q0.f.o(jF), motionEvent.getRawY() - Q0.f.p(jF));
    }

    @Override // p011b1.O
    public long o(long j8) {
        m0();
        long jF = B0.f(this.f14788c0, j8);
        return Q0.g.a(Q0.f.o(jF) + Q0.f.o(this.f14796g0), Q0.f.p(jF) + Q0.f.p(this.f14796g0));
    }

    public final void o0() {
        this.f14778I0.a(this, this.f14788c0);
        AbstractC2407o0.a(this.f14788c0, this.f14790d0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        InterfaceC1733p interfaceC1733pA;
        AbstractC1726i abstractC1726iW;
        M0.a aVar;
        super.onAttachedToWindow();
        f0(getRoot());
        e0(getRoot());
        getSnapshotObserver().k();
        if (Q() && (aVar = this.f14831y) != null) {
            M0.g.f5072a.a(aVar);
        }
        InterfaceC1733p interfaceC1733pA2 = androidx.lifecycle.T.a(this);
        p217z2.f fVarA = p217z2.g.a(this);
        c viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners == null || (interfaceC1733pA2 != null && fVarA != null && (interfaceC1733pA2 != viewTreeOwners.a() || fVarA != viewTreeOwners.a()))) {
            if (interfaceC1733pA2 == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagate ViewTreeLifecycleOwner!");
            }
            if (fVarA == null) {
                throw new IllegalStateException("Composed into the View which doesn't propagateViewTreeSavedStateRegistryOwner!");
            }
            if (viewTreeOwners != null && (interfaceC1733pA = viewTreeOwners.a()) != null && (abstractC1726iW = interfaceC1733pA.w()) != null) {
                abstractC1726iW.d(this);
            }
            interfaceC1733pA2.w().a(this);
            c cVar = new c(interfaceC1733pA2, fVarA);
            set_viewTreeOwners(cVar);
            Q6.k kVar = this.f14804k0;
            if (kVar != null) {
                kVar.invoke(cVar);
            }
            this.f14804k0 = null;
        }
        this.f14830x0.b(isInTouchMode() ? Y0.a.f12080b.b() : Y0.a.f12080b.a());
        c viewTreeOwners2 = getViewTreeOwners();
        t.d(viewTreeOwners2);
        viewTreeOwners2.a().w().a(this);
        c viewTreeOwners3 = getViewTreeOwners();
        t.d(viewTreeOwners3);
        viewTreeOwners3.a().w().a(this.f14815q);
        getViewTreeObserver().addOnGlobalLayoutListener(this.f14806l0);
        getViewTreeObserver().addOnScrollChangedListener(this.f14808m0);
        getViewTreeObserver().addOnTouchModeChangeListener(this.f14810n0);
        if (Build.VERSION.SDK_INT >= 31) {
            C.f24087a.b(this, new a());
        }
    }

    @Override // android.view.View
    public boolean onCheckIsTextEditor() {
        p065h1.I i8 = (p065h1.I) L0.o.c(this.f14816q0);
        return i8 == null ? this.f14812o0.q() : i8.b();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14791e = A1.a.a(getContext());
        if (Y(configuration) != this.f14824u0) {
            this.f14824u0 = Y(configuration);
            setFontFamilyResolver(r.a(getContext()));
        }
        this.f14829x.invoke(configuration);
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        p065h1.I i8 = (p065h1.I) L0.o.c(this.f14816q0);
        return i8 == null ? this.f14812o0.n(editorInfo) : i8.a(editorInfo);
    }

    @Override // android.view.View
    public void onCreateVirtualViewTranslationRequests(long[] jArr, int[] iArr, Consumer consumer) {
        this.f14815q.H0(jArr, iArr, consumer);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        M0.a aVar;
        InterfaceC1733p interfaceC1733pA;
        AbstractC1726i abstractC1726iW;
        InterfaceC1733p interfaceC1733pA2;
        AbstractC1726i abstractC1726iW2;
        super.onDetachedFromWindow();
        getSnapshotObserver().l();
        c viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null && (interfaceC1733pA2 = viewTreeOwners.a()) != null && (abstractC1726iW2 = interfaceC1733pA2.w()) != null) {
            abstractC1726iW2.d(this);
        }
        c viewTreeOwners2 = getViewTreeOwners();
        if (viewTreeOwners2 != null && (interfaceC1733pA = viewTreeOwners2.a()) != null && (abstractC1726iW = interfaceC1733pA.w()) != null) {
            abstractC1726iW.d(this.f14815q);
        }
        if (Q() && (aVar = this.f14831y) != null) {
            M0.g.f5072a.b(aVar);
        }
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f14806l0);
        getViewTreeObserver().removeOnScrollChangedListener(this.f14808m0);
        getViewTreeObserver().removeOnTouchModeChangeListener(this.f14810n0);
        if (Build.VERSION.SDK_INT >= 31) {
            C.f24087a.a(this);
        }
    }

    @Override // android.view.View
    public void onFocusChanged(boolean z8, int i8, Rect rect) {
        super.onFocusChanged(z8, i8, rect);
        Log.d("Compose Focus", "Owner FocusChanged(" + z8 + ')');
        P0.q qVarG = getFocusOwner().g();
        qVarG.f8860b.d(new j(z8, this));
        if (qVarG.f8861c) {
            if (z8) {
                getFocusOwner().d();
                return;
            } else {
                getFocusOwner().k();
                return;
            }
        }
        try {
            qVarG.f();
            if (z8) {
                getFocusOwner().d();
            } else {
                getFocusOwner().k();
            }
            G g8 = G.f1419a;
        } finally {
            qVarG.h();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) throws Throwable {
        this.f14777I.p(this.f14776H0);
        this.f14773G = null;
        C0();
        if (this.f14769E != null) {
            getAndroidViewsHandler$ui_release().layout(0, 0, i10 - i8, i11 - i9);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i8, int i9) {
        Trace.beginSection("AndroidOwner:onMeasure");
        try {
            if (!isAttachedToWindow()) {
                f0(getRoot());
            }
            long jU = U(i8);
            int iB = (int) C6.A.b(jU >>> 32);
            int iB2 = (int) C6.A.b(jU & 4294967295L);
            long jU2 = U(i9);
            long jA = A1.c.a(iB, iB2, (int) C6.A.b(jU2 >>> 32), (int) C6.A.b(4294967295L & jU2));
            A1.b bVar = this.f14773G;
            boolean zG = false;
            if (bVar == null) {
                this.f14773G = A1.b.b(jA);
                this.f14775H = false;
            } else {
                if (bVar != null) {
                    zG = A1.b.g(bVar.s(), jA);
                }
                if (!zG) {
                    this.f14775H = true;
                }
            }
            this.f14777I.I(jA);
            this.f14777I.r();
            setMeasuredDimension(getRoot().r0(), getRoot().N());
            if (this.f14769E != null) {
                getAndroidViewsHandler$ui_release().measure(View.MeasureSpec.makeMeasureSpec(getRoot().r0(), 1073741824), View.MeasureSpec.makeMeasureSpec(getRoot().N(), 1073741824));
            }
            G g8 = G.f1419a;
        } finally {
            Trace.endSection();
        }
    }

    @Override // android.view.View
    public void onProvideAutofillVirtualStructure(ViewStructure viewStructure, int i8) {
        M0.a aVar;
        if (!Q() || viewStructure == null || (aVar = this.f14831y) == null) {
            return;
        }
        M0.c.b(aVar, viewStructure);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(InterfaceC1733p interfaceC1733p) {
        setShowLayoutBounds(f14757L0.b());
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        if (this.f14787c) {
            A1.t tVarG = p065h1.F.g(i8);
            setLayoutDirection(tVarG);
            getFocusOwner().a(tVarG);
        }
    }

    @Override // android.view.View
    public void onVirtualViewTranslationResponses(LongSparseArray longSparseArray) {
        this.f14815q.M0(longSparseArray);
    }

    @Override // android.view.View
    public void onWindowFocusChanged(boolean z8) {
        boolean zB;
        this.f14801j.b(z8);
        this.f14779J0 = true;
        super.onWindowFocusChanged(z8);
        if (!z8 || getShowLayoutBounds() == (zB = f14757L0.b())) {
            return;
        }
        setShowLayoutBounds(zB);
        d0();
    }

    @Override // p056g1.h0
    public void p(F f8, boolean z8, boolean z9) {
        if (z8) {
            if (this.f14777I.z(f8, z9)) {
                t0(this, null, 1, null);
            }
        } else if (this.f14777I.E(f8, z9)) {
            t0(this, null, 1, null);
        }
    }

    public final boolean p0(g0 g0Var) {
        if (this.f14771F != null) {
            androidx.compose.ui.platform.h.f14993p.b();
        }
        this.f14766C0.c(g0Var);
        return true;
    }

    @Override // p011b1.O
    public void q(float[] fArr) {
        m0();
        B0.k(fArr, this.f14788c0);
        p065h1.F.i(fArr, Q0.f.o(this.f14796g0), Q0.f.p(this.f14796g0), this.f14786b0);
    }

    public final void q0(D1.c cVar) {
        r(new l(cVar));
    }

    @Override // p056g1.h0
    public void r(Function0 function0) {
        if (this.f14768D0.n(function0)) {
            return;
        }
        this.f14768D0.d(function0);
    }

    public final void r0() {
        this.f14833z = true;
    }

    @Override // p056g1.h0
    public void s() {
        if (this.f14833z) {
            getSnapshotObserver().b();
            this.f14833z = false;
        }
        P p8 = this.f14769E;
        if (p8 != null) {
            T(p8);
        }
        while (this.f14768D0.v()) {
            int iS = this.f14768D0.s();
            for (int i8 = 0; i8 < iS; i8++) {
                Function0 function0 = (Function0) this.f14768D0.r()[i8];
                this.f14768D0.G(i8, null);
                if (function0 != null) {
                    function0.invoke();
                }
            }
            this.f14768D0.E(0, iS);
        }
    }

    public final void s0(F f8) {
        if (isLayoutRequested() || !isAttachedToWindow()) {
            return;
        }
        if (f8 != null) {
            while (f8 != null && f8.e0() == F.g.InMeasureBlock && S(f8)) {
                f8 = f8.m0();
            }
            if (f8 == getRoot()) {
                requestLayout();
                return;
            }
        }
        if (getWidth() == 0 || getHeight() == 0) {
            requestLayout();
        } else {
            invalidate();
        }
    }

    public final void setConfigurationChangeObserver(Q6.k kVar) {
        this.f14829x = kVar;
    }

    public final void setLastMatrixRecalculationAnimationTime$ui_release(long j8) {
        this.f14792e0 = j8;
    }

    public final void setOnViewTreeOwnersAvailable(Q6.k kVar) {
        c viewTreeOwners = getViewTreeOwners();
        if (viewTreeOwners != null) {
            kVar.invoke(viewTreeOwners);
        }
        if (isAttachedToWindow()) {
            return;
        }
        this.f14804k0 = kVar;
    }

    @Override // p056g1.h0
    public void setShowLayoutBounds(boolean z8) {
        this.f14767D = z8;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // p056g1.h0
    public void t() {
        this.f14815q.K0();
    }

    @Override // p056g1.h0
    public void v(F f8, boolean z8, boolean z9, boolean z10) {
        if (z8) {
            if (this.f14777I.B(f8, z9) && z10) {
                s0(f8);
                return;
            }
            return;
        }
        if (this.f14777I.G(f8, z9) && z10) {
            s0(f8);
        }
    }

    @Override // p011b1.O
    public long w(long j8) {
        m0();
        return B0.f(this.f14790d0, Q0.g.a(Q0.f.o(j8) - Q0.f.o(this.f14796g0), Q0.f.p(j8) - Q0.f.p(this.f14796g0)));
    }

    public final int x0(MotionEvent motionEvent) {
        Object obj;
        if (this.f14779J0) {
            this.f14779J0 = false;
            this.f14801j.a(p011b1.M.b(motionEvent.getMetaState()));
        }
        p011b1.B bC = this.f14825v.c(motionEvent, this);
        if (bC == null) {
            this.f14827w.b();
            return p011b1.E.a(false, false);
        }
        List listB = bC.b();
        int size = listB.size() - 1;
        if (size < 0) {
            obj = null;
            break;
        }
        while (true) {
            int i8 = size - 1;
            obj = listB.get(size);
            if (((p011b1.C) obj).a()) {
                break;
            }
            if (i8 < 0) {
                obj = null;
                break;
            }
            size = i8;
        }
        p011b1.C c8 = (p011b1.C) obj;
        if (c8 != null) {
            this.f14785b = c8.f();
        }
        int iA = this.f14827w.a(bC, this, i0(motionEvent));
        int actionMasked = motionEvent.getActionMasked();
        if ((actionMasked == 0 || actionMasked == 5) && !p011b1.P.c(iA)) {
            this.f14825v.e(motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return iA;
    }

    public final void y0(MotionEvent motionEvent, int i8, long j8, boolean z8) {
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = -1;
        if (actionMasked != 1) {
            if (actionMasked == 6) {
                actionIndex = motionEvent.getActionIndex();
            }
        } else if (i8 != 9 && i8 != 10) {
            actionIndex = 0;
        }
        int pointerCount = motionEvent.getPointerCount() - (actionIndex >= 0 ? 1 : 0);
        if (pointerCount == 0) {
            return;
        }
        MotionEvent.PointerProperties[] pointerPropertiesArr = new MotionEvent.PointerProperties[pointerCount];
        for (int i9 = 0; i9 < pointerCount; i9++) {
            pointerPropertiesArr[i9] = new MotionEvent.PointerProperties();
        }
        MotionEvent.PointerCoords[] pointerCoordsArr = new MotionEvent.PointerCoords[pointerCount];
        for (int i10 = 0; i10 < pointerCount; i10++) {
            pointerCoordsArr[i10] = new MotionEvent.PointerCoords();
        }
        int i11 = 0;
        while (i11 < pointerCount) {
            int i12 = ((actionIndex < 0 || i11 < actionIndex) ? 0 : 1) + i11;
            motionEvent.getPointerProperties(i12, pointerPropertiesArr[i11]);
            MotionEvent.PointerCoords pointerCoords = pointerCoordsArr[i11];
            motionEvent.getPointerCoords(i12, pointerCoords);
            long jO = o(Q0.g.a(pointerCoords.x, pointerCoords.y));
            pointerCoords.x = Q0.f.o(jO);
            pointerCoords.y = Q0.f.p(jO);
            i11++;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent.getDownTime() == motionEvent.getEventTime() ? j8 : motionEvent.getDownTime(), j8, i8, pointerCount, pointerPropertiesArr, pointerCoordsArr, motionEvent.getMetaState(), z8 ? 0 : motionEvent.getButtonState(), motionEvent.getXPrecision(), motionEvent.getYPrecision(), motionEvent.getDeviceId(), motionEvent.getEdgeFlags(), motionEvent.getSource(), motionEvent.getFlags());
        p011b1.B bC = this.f14825v.c(motionEventObtain, this);
        t.d(bC);
        this.f14827w.a(bC, this, true);
        motionEventObtain.recycle();
    }

    @Override // p056g1.h0
    public C2386e getAccessibilityManager() {
        return this.f14763B;
    }

    @Override // p056g1.h0
    public C2388f getClipboardManager() {
        return this.f14761A;
    }

    @InterfaceC0916e
    public static /* synthetic */ void getFontLoader$annotations() {
    }

    public static /* synthetic */ void getLastMatrixRecalculationAnimationTime$ui_release$annotations() {
    }

    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }

    public View getView() {
        return this;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final f f14842a = new f();

        public f() {
            super(1);
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Configuration) obj);
            return G.f1419a;
        }

        public final void b(Configuration configuration) {
        }
    }

    @Override // p056g1.h0
    public void e(F f8) {
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }
}
