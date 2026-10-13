package p056g1;

import A1.t;
import G6.g;
import M0.d;
import M0.i;
import N0.c;
import Q6.k;
import kotlin.jvm.functions.Function0;
import p011b1.w;
import p038e1.a0;
import p047f1.f;
import p065h1.H0;
import p065h1.InterfaceC2382c;
import p065h1.J0;
import p065h1.R0;
import p065h1.U;
import p065h1.X0;
import p168t1.AbstractC3009n;
import p168t1.InterfaceC3008m;
import p176u1.O;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface h0 {

    /* JADX INFO: renamed from: R, reason: collision with root package name */
    public static final a f23615R = a.f23616a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f23616a = new a();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static boolean f23617b;

        public final boolean a() {
            return f23617b;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        void b();
    }

    static /* synthetic */ void c(h0 h0Var, F f8, boolean z8, boolean z9, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestRelayout");
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        if ((i8 & 4) != 0) {
            z9 = false;
        }
        h0Var.p(f8, z8, z9);
    }

    static /* synthetic */ void d(h0 h0Var, F f8, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: forceMeasureTheSubtree");
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        h0Var.b(f8, z8);
    }

    static /* synthetic */ void m(h0 h0Var, boolean z8, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: measureAndLayout");
        }
        if ((i8 & 1) != 0) {
            z8 = true;
        }
        h0Var.a(z8);
    }

    static /* synthetic */ void u(h0 h0Var, F f8, boolean z8, boolean z9, boolean z10, int i8, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onRequestMeasure");
        }
        if ((i8 & 2) != 0) {
            z8 = false;
        }
        if ((i8 & 4) != 0) {
            z9 = false;
        }
        if ((i8 & 8) != 0) {
            z10 = true;
        }
        h0Var.v(f8, z8, z9, z10);
    }

    void a(boolean z8);

    void b(F f8, boolean z8);

    void e(F f8);

    long f(long j8);

    long g(long j8);

    InterfaceC2382c getAccessibilityManager();

    d getAutofill();

    i getAutofillTree();

    U getClipboardManager();

    g getCoroutineContext();

    A1.d getDensity();

    c getDragAndDropManager();

    P0.g getFocusOwner();

    AbstractC3009n.b getFontFamilyResolver();

    InterfaceC3008m.a getFontLoader();

    X0.a getHapticFeedBack();

    Y0.b getInputModeManager();

    t getLayoutDirection();

    f getModifierLocalManager();

    a0.a getPlacementScope();

    w getPointerIconService();

    F getRoot();

    H getSharedDrawScope();

    boolean getShowLayoutBounds();

    j0 getSnapshotObserver();

    H0 getSoftwareKeyboardController();

    O getTextInputService();

    J0 getTextToolbar();

    R0 getViewConfiguration();

    X0 getWindowInfo();

    void h(F f8, long j8);

    void i(F f8);

    g0 k(k kVar, Function0 function0);

    void l(F f8);

    void n(F f8);

    void p(F f8, boolean z8, boolean z9);

    void r(Function0 function0);

    boolean requestFocus();

    void s();

    void setShowLayoutBounds(boolean z8);

    void t();

    void v(F f8, boolean z8, boolean z9, boolean z10);
}
