package U1;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ContentInfo;
import android.view.KeyEvent;
import android.view.OnReceiveContentListener;
import android.view.View;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.contentcapture.ContentCaptureSession;
import java.lang.reflect.Field;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static WeakHashMap f10024a = null;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Field f10025b = null;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static boolean f10026c = false;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f10027d = {G1.d.f2631b, G1.d.f2632c, G1.d.f2643n, G1.d.f2654y, G1.d.f2613B, G1.d.f2614C, G1.d.f2615D, G1.d.f2616E, G1.d.f2617F, G1.d.f2618G, G1.d.f2633d, G1.d.f2634e, G1.d.f2635f, G1.d.f2636g, G1.d.f2637h, G1.d.f2638i, G1.d.f2639j, G1.d.f2640k, G1.d.f2641l, G1.d.f2642m, G1.d.f2644o, G1.d.f2645p, G1.d.f2646q, G1.d.f2647r, G1.d.f2648s, G1.d.f2649t, G1.d.f2650u, G1.d.f2651v, G1.d.f2652w, G1.d.f2653x, G1.d.f2655z, G1.d.f2612A};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final A f10028e = new A() { // from class: U1.H
        @Override // U1.A
        public final C1642d a(C1642d c1642d) {
            return I.a(c1642d);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final e f10029f = new e();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends f {
        public a(int i8, Class cls, int i9) {
            super(i8, cls, i9);
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(j.d(view));
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            j.j(view, bool.booleanValue());
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends f {
        public b(int i8, Class cls, int i9, int i10) {
            super(i8, cls, i9, i10);
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return j.b(view);
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            j.h(view, charSequence);
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c extends f {
        public c(int i8, Class cls, int i9, int i10) {
            super(i8, cls, i9, i10);
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public CharSequence c(View view) {
            return l.b(view);
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, CharSequence charSequence) {
            l.e(view, charSequence);
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(CharSequence charSequence, CharSequence charSequence2) {
            return !TextUtils.equals(charSequence, charSequence2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d extends f {
        public d(int i8, Class cls, int i9) {
            super(i8, cls, i9);
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public Boolean c(View view) {
            return Boolean.valueOf(j.c(view));
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
        public void d(View view, Boolean bool) {
            j.g(view, bool.booleanValue());
        }

        @Override // U1.I.f
        /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
        public boolean g(Boolean bool, Boolean bool2) {
            return !a(bool, bool2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int f10031a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final Class f10032b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f10033c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final int f10034d;

        public f(int i8, Class cls, int i9) {
            this(i8, cls, 0, i9);
        }

        public boolean a(Boolean bool, Boolean bool2) {
            return (bool != null && bool.booleanValue()) == (bool2 != null && bool2.booleanValue());
        }

        public final boolean b() {
            return Build.VERSION.SDK_INT >= this.f10033c;
        }

        public abstract Object c(View view);

        public abstract void d(View view, Object obj);

        public Object e(View view) {
            if (b()) {
                return c(view);
            }
            Object tag = view.getTag(this.f10031a);
            if (this.f10032b.isInstance(tag)) {
                return tag;
            }
            return null;
        }

        public void f(View view, Object obj) {
            if (b()) {
                d(view, obj);
            } else if (g(e(view), obj)) {
                I.g(view);
                view.setTag(this.f10031a, obj);
                I.z(view, this.f10034d);
            }
        }

        public abstract boolean g(Object obj, Object obj2);

        public f(int i8, Class cls, int i9, int i10) {
            this.f10031a = i8;
            this.f10032b = cls;
            this.f10034d = i9;
            this.f10033c = i10;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class g {
        public static WindowInsets a(View view, WindowInsets windowInsets) {
            return view.dispatchApplyWindowInsets(windowInsets);
        }

        public static WindowInsets b(View view, WindowInsets windowInsets) {
            return view.onApplyWindowInsets(windowInsets);
        }

        public static void c(View view) {
            view.requestApplyInsets();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class h {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements View.OnApplyWindowInsetsListener {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public c0 f10035a = null;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ View f10036b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1662y f10037c;

            public a(View view, InterfaceC1662y interfaceC1662y) {
                this.f10036b = view;
                this.f10037c = interfaceC1662y;
            }

            @Override // android.view.View.OnApplyWindowInsetsListener
            public WindowInsets onApplyWindowInsets(View view, WindowInsets windowInsets) {
                c0 c0VarX = c0.x(windowInsets, view);
                int i8 = Build.VERSION.SDK_INT;
                if (i8 < 30) {
                    h.a(windowInsets, this.f10036b);
                    if (c0VarX.equals(this.f10035a)) {
                        return this.f10037c.a(view, c0VarX).v();
                    }
                }
                this.f10035a = c0VarX;
                c0 c0VarA = this.f10037c.a(view, c0VarX);
                if (i8 >= 30) {
                    return c0VarA.v();
                }
                I.F(view);
                return c0VarA.v();
            }
        }

        public static void a(WindowInsets windowInsets, View view) {
            View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener) view.getTag(G1.d.f2629R);
            if (onApplyWindowInsetsListener != null) {
                onApplyWindowInsetsListener.onApplyWindowInsets(view, windowInsets);
            }
        }

        public static c0 b(View view, c0 c0Var, Rect rect) {
            WindowInsets windowInsetsV = c0Var.v();
            if (windowInsetsV != null) {
                return c0.x(view.computeSystemWindowInsets(windowInsetsV, rect), view);
            }
            rect.setEmpty();
            return c0Var;
        }

        public static boolean c(View view, float f8, float f9, boolean z8) {
            return view.dispatchNestedFling(f8, f9, z8);
        }

        public static boolean d(View view, float f8, float f9) {
            return view.dispatchNestedPreFling(f8, f9);
        }

        public static boolean e(View view, int i8, int i9, int[] iArr, int[] iArr2) {
            return view.dispatchNestedPreScroll(i8, i9, iArr, iArr2);
        }

        public static boolean f(View view, int i8, int i9, int i10, int i11, int[] iArr) {
            return view.dispatchNestedScroll(i8, i9, i10, i11, iArr);
        }

        public static ColorStateList g(View view) {
            return view.getBackgroundTintList();
        }

        public static PorterDuff.Mode h(View view) {
            return view.getBackgroundTintMode();
        }

        public static float i(View view) {
            return view.getElevation();
        }

        public static c0 j(View view) {
            return c0.a.a(view);
        }

        public static String k(View view) {
            return view.getTransitionName();
        }

        public static float l(View view) {
            return view.getTranslationZ();
        }

        public static float m(View view) {
            return view.getZ();
        }

        public static boolean n(View view) {
            return view.hasNestedScrollingParent();
        }

        public static boolean o(View view) {
            return view.isImportantForAccessibility();
        }

        public static boolean p(View view) {
            return view.isNestedScrollingEnabled();
        }

        public static void q(View view, ColorStateList colorStateList) {
            view.setBackgroundTintList(colorStateList);
        }

        public static void r(View view, PorterDuff.Mode mode) {
            view.setBackgroundTintMode(mode);
        }

        public static void s(View view, float f8) {
            view.setElevation(f8);
        }

        public static void t(View view, boolean z8) {
            view.setNestedScrollingEnabled(z8);
        }

        public static void u(View view, InterfaceC1662y interfaceC1662y) {
            if (Build.VERSION.SDK_INT < 30) {
                view.setTag(G1.d.f2623L, interfaceC1662y);
            }
            if (interfaceC1662y == null) {
                view.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener) view.getTag(G1.d.f2629R));
            } else {
                view.setOnApplyWindowInsetsListener(new a(view, interfaceC1662y));
            }
        }

        public static void v(View view, String str) {
            view.setTransitionName(str);
        }

        public static void w(View view, float f8) {
            view.setTranslationZ(f8);
        }

        public static void x(View view, float f8) {
            view.setZ(f8);
        }

        public static boolean y(View view, int i8) {
            return view.startNestedScroll(i8);
        }

        public static void z(View view) {
            view.stopNestedScroll();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class i {
        public static c0 a(View view) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            if (rootWindowInsets == null) {
                return null;
            }
            c0 c0VarW = c0.w(rootWindowInsets);
            c0VarW.t(c0VarW);
            c0VarW.d(view.getRootView());
            return c0VarW;
        }

        public static int b(View view) {
            return view.getScrollIndicators();
        }

        public static void c(View view, int i8) {
            view.setScrollIndicators(i8);
        }

        public static void d(View view, int i8, int i9) {
            view.setScrollIndicators(i8, i9);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class j {
        public static void a(View view, final o oVar) {
            p010b0.C c8 = (p010b0.C) view.getTag(G1.d.f2628Q);
            if (c8 == null) {
                c8 = new p010b0.C();
                view.setTag(G1.d.f2628Q, c8);
            }
            Objects.requireNonNull(oVar);
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener = new View.OnUnhandledKeyEventListener(oVar) { // from class: U1.J
                @Override // android.view.View.OnUnhandledKeyEventListener
                public final boolean onUnhandledKeyEvent(View view2, KeyEvent keyEvent) {
                    throw null;
                }
            };
            c8.put(oVar, onUnhandledKeyEventListener);
            view.addOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static CharSequence b(View view) {
            return view.getAccessibilityPaneTitle();
        }

        public static boolean c(View view) {
            return view.isAccessibilityHeading();
        }

        public static boolean d(View view) {
            return view.isScreenReaderFocusable();
        }

        public static void e(View view, o oVar) {
            View.OnUnhandledKeyEventListener onUnhandledKeyEventListener;
            p010b0.C c8 = (p010b0.C) view.getTag(G1.d.f2628Q);
            if (c8 == null || (onUnhandledKeyEventListener = (View.OnUnhandledKeyEventListener) c8.get(oVar)) == null) {
                return;
            }
            view.removeOnUnhandledKeyEventListener(onUnhandledKeyEventListener);
        }

        public static <T> T f(View view, int i8) {
            return (T) view.requireViewById(i8);
        }

        public static void g(View view, boolean z8) {
            view.setAccessibilityHeading(z8);
        }

        public static void h(View view, CharSequence charSequence) {
            view.setAccessibilityPaneTitle(charSequence);
        }

        public static void i(View view, X1.a aVar) {
            view.setAutofillId(null);
        }

        public static void j(View view, boolean z8) {
            view.setScreenReaderFocusable(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class k {
        public static View.AccessibilityDelegate a(View view) {
            return view.getAccessibilityDelegate();
        }

        public static ContentCaptureSession b(View view) {
            return view.getContentCaptureSession();
        }

        public static List<Rect> c(View view) {
            return view.getSystemGestureExclusionRects();
        }

        public static void d(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i8, int i9) {
            view.saveAttributeDataForStyleable(context, iArr, attributeSet, typedArray, i8, i9);
        }

        public static void e(View view, Y1.a aVar) {
            view.setContentCaptureSession(null);
        }

        public static void f(View view, List<Rect> list) {
            view.setSystemGestureExclusionRects(list);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class l {
        public static int a(View view) {
            return view.getImportantForContentCapture();
        }

        public static CharSequence b(View view) {
            return view.getStateDescription();
        }

        public static boolean c(View view) {
            return view.isImportantForContentCapture();
        }

        public static void d(View view, int i8) {
            view.setImportantForContentCapture(i8);
        }

        public static void e(View view, CharSequence charSequence) {
            view.setStateDescription(charSequence);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m {
        public static String[] a(View view) {
            return view.getReceiveContentMimeTypes();
        }

        public static C1642d b(View view, C1642d c1642d) {
            ContentInfo contentInfoH = c1642d.h();
            ContentInfo contentInfoPerformReceiveContent = view.performReceiveContent(contentInfoH);
            if (contentInfoPerformReceiveContent == null) {
                return null;
            }
            return contentInfoPerformReceiveContent == contentInfoH ? c1642d : C1642d.i(contentInfoPerformReceiveContent);
        }

        public static void c(View view, String[] strArr, InterfaceC1663z interfaceC1663z) {
            if (interfaceC1663z == null) {
                view.setOnReceiveContentListener(strArr, null);
            } else {
                view.setOnReceiveContentListener(strArr, new n(interfaceC1663z));
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n implements OnReceiveContentListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final InterfaceC1663z f10038a;

        public n(InterfaceC1663z interfaceC1663z) {
            this.f10038a = interfaceC1663z;
        }

        public ContentInfo onReceiveContent(View view, ContentInfo contentInfo) {
            C1642d c1642dI = C1642d.i(contentInfo);
            C1642d c1642dA = this.f10038a.a(view, c1642dI);
            if (c1642dA == null) {
                return null;
            }
            return c1642dA == c1642dI ? contentInfo : c1642dA.h();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface o {
    }

    public static c0 A(View view, c0 c0Var) {
        WindowInsets windowInsetsV = c0Var.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsB = g.b(view, windowInsetsV);
            if (!windowInsetsB.equals(windowInsetsV)) {
                return c0.x(windowInsetsB, view);
            }
        }
        return c0Var;
    }

    public static f B() {
        return new b(G1.d.f2622K, CharSequence.class, 8, 28);
    }

    public static C1642d C(View view, C1642d c1642d) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Log.d("ViewCompat", "performReceiveContent: " + c1642d + ", view=" + view.getClass().getSimpleName() + "[" + view.getId() + "]");
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return m.b(view, c1642d);
        }
        InterfaceC1663z interfaceC1663z = (InterfaceC1663z) view.getTag(G1.d.f2624M);
        if (interfaceC1663z == null) {
            return n(view).a(c1642d);
        }
        C1642d c1642dA = interfaceC1663z.a(view, c1642d);
        if (c1642dA == null) {
            return null;
        }
        return n(view).a(c1642dA);
    }

    public static void D(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void E(View view, Runnable runnable, long j8) {
        view.postOnAnimationDelayed(runnable, j8);
    }

    public static void F(View view) {
        g.c(view);
    }

    public static void G(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i8, int i9) {
        if (Build.VERSION.SDK_INT >= 29) {
            k.d(view, context, iArr, attributeSet, typedArray, i8, i9);
        }
    }

    public static f H() {
        return new a(G1.d.f2626O, Boolean.class, 28);
    }

    public static void I(View view, C1639a c1639a) {
        if (c1639a == null && (i(view) instanceof C1639a.C0282a)) {
            c1639a = new C1639a();
        }
        Q(view);
        view.setAccessibilityDelegate(c1639a == null ? null : c1639a.d());
    }

    public static void J(View view, boolean z8) {
        b().f(view, Boolean.valueOf(z8));
    }

    public static void K(View view, CharSequence charSequence) {
        B().f(view, charSequence);
        if (charSequence != null) {
            f10029f.a(view);
        } else {
            f10029f.c(view);
        }
    }

    public static void L(View view, Drawable drawable) {
        view.setBackground(drawable);
    }

    public static void M(View view, ColorStateList colorStateList) {
        h.q(view, colorStateList);
    }

    public static void N(View view, PorterDuff.Mode mode) {
        h.r(view, mode);
    }

    public static void O(View view, float f8) {
        h.s(view, f8);
    }

    public static void P(View view, int i8) {
        view.setImportantForAccessibility(i8);
    }

    public static void Q(View view) {
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
    }

    public static void R(View view, InterfaceC1662y interfaceC1662y) {
        h.u(view, interfaceC1662y);
    }

    public static void S(View view, boolean z8) {
        H().f(view, Boolean.valueOf(z8));
    }

    public static void T(View view, int i8, int i9) {
        i.d(view, i8, i9);
    }

    public static void U(View view, String str) {
        h.v(view, str);
    }

    public static void V(View view, X.b bVar) {
        X.c(view, bVar);
    }

    public static f W() {
        return new c(G1.d.f2627P, CharSequence.class, 64, 30);
    }

    public static void X(View view) {
        h.z(view);
    }

    public static f b() {
        return new d(G1.d.f2621J, Boolean.class, 28);
    }

    public static S c(View view) {
        if (f10024a == null) {
            f10024a = new WeakHashMap();
        }
        S s8 = (S) f10024a.get(view);
        if (s8 != null) {
            return s8;
        }
        S s9 = new S(view);
        f10024a.put(view, s9);
        return s9;
    }

    public static c0 d(View view, c0 c0Var, Rect rect) {
        return h.b(view, c0Var, rect);
    }

    public static c0 e(View view, c0 c0Var) {
        WindowInsets windowInsetsV = c0Var.v();
        if (windowInsetsV != null) {
            WindowInsets windowInsetsA = g.a(view, windowInsetsV);
            if (!windowInsetsA.equals(windowInsetsV)) {
                return c0.x(windowInsetsA, view);
            }
        }
        return c0Var;
    }

    public static boolean f(View view, KeyEvent keyEvent) {
        return false;
    }

    public static void g(View view) {
        C1639a c1639aH = h(view);
        if (c1639aH == null) {
            c1639aH = new C1639a();
        }
        I(view, c1639aH);
    }

    public static C1639a h(View view) {
        View.AccessibilityDelegate accessibilityDelegateI = i(view);
        if (accessibilityDelegateI == null) {
            return null;
        }
        return accessibilityDelegateI instanceof C1639a.C0282a ? ((C1639a.C0282a) accessibilityDelegateI).f10084a : new C1639a(accessibilityDelegateI);
    }

    public static View.AccessibilityDelegate i(View view) {
        return Build.VERSION.SDK_INT >= 29 ? k.a(view) : j(view);
    }

    public static View.AccessibilityDelegate j(View view) {
        if (f10026c) {
            return null;
        }
        if (f10025b == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                f10025b = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                f10026c = true;
                return null;
            }
        }
        try {
            Object obj = f10025b.get(view);
            if (obj instanceof View.AccessibilityDelegate) {
                return (View.AccessibilityDelegate) obj;
            }
            return null;
        } catch (Throwable unused2) {
            f10026c = true;
            return null;
        }
    }

    public static CharSequence k(View view) {
        return (CharSequence) B().e(view);
    }

    public static ColorStateList l(View view) {
        return h.g(view);
    }

    public static PorterDuff.Mode m(View view) {
        return h.h(view);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static A n(View view) {
        return view instanceof A ? (A) view : f10028e;
    }

    public static int o(View view) {
        return view.getMinimumHeight();
    }

    public static String[] p(View view) {
        return Build.VERSION.SDK_INT >= 31 ? m.a(view) : (String[]) view.getTag(G1.d.f2625N);
    }

    public static ViewParent q(View view) {
        return view.getParentForAccessibility();
    }

    public static c0 r(View view) {
        return i.a(view);
    }

    public static CharSequence s(View view) {
        return (CharSequence) W().e(view);
    }

    public static String t(View view) {
        return h.k(view);
    }

    public static int u(View view) {
        return view.getWindowSystemUiVisibility();
    }

    public static boolean v(View view) {
        Boolean bool = (Boolean) b().e(view);
        return bool != null && bool.booleanValue();
    }

    public static boolean w(View view) {
        return view.isAttachedToWindow();
    }

    public static boolean x(View view) {
        return view.isLaidOut();
    }

    public static boolean y(View view) {
        Boolean bool = (Boolean) H().e(view);
        return bool != null && bool.booleanValue();
    }

    public static void z(View view, int i8) {
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (accessibilityManager.isEnabled()) {
            boolean z8 = k(view) != null && view.isShown() && view.getWindowVisibility() == 0;
            if (view.getAccessibilityLiveRegion() != 0 || z8) {
                AccessibilityEvent accessibilityEventObtain = AccessibilityEvent.obtain();
                accessibilityEventObtain.setEventType(z8 ? 32 : 2048);
                accessibilityEventObtain.setContentChangeTypes(i8);
                if (z8) {
                    accessibilityEventObtain.getText().add(k(view));
                    Q(view);
                }
                view.sendAccessibilityEventUnchecked(accessibilityEventObtain);
                return;
            }
            if (i8 == 32) {
                AccessibilityEvent accessibilityEventObtain2 = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.setEventType(32);
                accessibilityEventObtain2.setContentChangeTypes(i8);
                accessibilityEventObtain2.setSource(view);
                view.onPopulateAccessibilityEvent(accessibilityEventObtain2);
                accessibilityEventObtain2.getText().add(k(view));
                accessibilityManager.sendAccessibilityEvent(accessibilityEventObtain2);
                return;
            }
            if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i8);
                } catch (AbstractMethodError e8) {
                    Log.e("ViewCompat", view.getParent().getClass().getSimpleName() + " does not fully implement ViewParent", e8);
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e implements ViewTreeObserver.OnGlobalLayoutListener, View.OnAttachStateChangeListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final WeakHashMap f10030a = new WeakHashMap();

        public void a(View view) {
            this.f10030a.put(view, Boolean.valueOf(view.isShown() && view.getWindowVisibility() == 0));
            view.addOnAttachStateChangeListener(this);
            if (view.isAttachedToWindow()) {
                b(view);
            }
        }

        public final void b(View view) {
            view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        }

        public void c(View view) {
            this.f10030a.remove(view);
            view.removeOnAttachStateChangeListener(this);
            d(view);
        }

        public final void d(View view) {
            view.getViewTreeObserver().removeOnGlobalLayoutListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            b(view);
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    public static /* synthetic */ C1642d a(C1642d c1642d) {
        return c1642d;
    }
}
