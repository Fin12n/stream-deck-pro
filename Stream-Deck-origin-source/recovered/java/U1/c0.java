package U1;

import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final c0 f10088b;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f10089a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Field f10090a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Field f10091b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Field f10092c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f10093d;

        static {
            try {
                Field declaredField = View.class.getDeclaredField("mAttachInfo");
                f10090a = declaredField;
                declaredField.setAccessible(true);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                Field declaredField2 = cls.getDeclaredField("mStableInsets");
                f10091b = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = cls.getDeclaredField("mContentInsets");
                f10092c = declaredField3;
                declaredField3.setAccessible(true);
                f10093d = true;
            } catch (ReflectiveOperationException e8) {
                Log.w("WindowInsetsCompat", "Failed to get visible insets from AttachInfo " + e8.getMessage(), e8);
            }
        }

        public static c0 a(View view) {
            if (f10093d && view.isAttachedToWindow()) {
                try {
                    Object obj = f10090a.get(view.getRootView());
                    if (obj != null) {
                        Rect rect = (Rect) f10091b.get(obj);
                        Rect rect2 = (Rect) f10092c.get(obj);
                        if (rect != null && rect2 != null) {
                            c0 c0VarA = new b().c(L1.h.c(rect)).d(L1.h.c(rect2)).a();
                            c0VarA.t(c0VarA);
                            c0VarA.d(view.getRootView());
                            return c0VarA;
                        }
                    }
                } catch (IllegalAccessException e8) {
                    Log.w("WindowInsetsCompat", "Failed to get insets from AttachInfo. " + e8.getMessage(), e8);
                }
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e extends d {
        public e() {
        }

        @Override // U1.c0.f
        public void c(int i8, L1.h hVar) {
            this.f10101c.setInsets(n.a(i8), hVar.e());
        }

        public e(c0 c0Var) {
            super(c0Var);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f10102a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public L1.h[] f10103b;

        public f() {
            this(new c0((c0) null));
        }

        public final void a() {
            L1.h[] hVarArr = this.f10103b;
            if (hVarArr != null) {
                L1.h hVarF = hVarArr[m.d(1)];
                L1.h hVarF2 = this.f10103b[m.d(2)];
                if (hVarF2 == null) {
                    hVarF2 = this.f10102a.f(2);
                }
                if (hVarF == null) {
                    hVarF = this.f10102a.f(1);
                }
                g(L1.h.a(hVarF, hVarF2));
                L1.h hVar = this.f10103b[m.d(16)];
                if (hVar != null) {
                    f(hVar);
                }
                L1.h hVar2 = this.f10103b[m.d(32)];
                if (hVar2 != null) {
                    d(hVar2);
                }
                L1.h hVar3 = this.f10103b[m.d(64)];
                if (hVar3 != null) {
                    h(hVar3);
                }
            }
        }

        public abstract c0 b();

        public void c(int i8, L1.h hVar) {
            if (this.f10103b == null) {
                this.f10103b = new L1.h[9];
            }
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    this.f10103b[m.d(i9)] = hVar;
                }
            }
        }

        public abstract void e(L1.h hVar);

        public abstract void g(L1.h hVar);

        public f(c0 c0Var) {
            this.f10102a = c0Var;
        }

        public void d(L1.h hVar) {
        }

        public void f(L1.h hVar) {
        }

        public void h(L1.h hVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class i extends h {
        public i(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        @Override // U1.c0.l
        public c0 a() {
            return c0.w(this.f10109c.consumeDisplayCutout());
        }

        @Override // U1.c0.g, U1.c0.l
        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof i)) {
                return false;
            }
            i iVar = (i) obj;
            return Objects.equals(this.f10109c, iVar.f10109c) && Objects.equals(this.f10113g, iVar.f10113g);
        }

        @Override // U1.c0.l
        public C1650l f() {
            return C1650l.g(this.f10109c.getDisplayCutout());
        }

        @Override // U1.c0.l
        public int hashCode() {
            return this.f10109c.hashCode();
        }

        public i(c0 c0Var, i iVar) {
            super(c0Var, iVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class k extends j {

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        public static final c0 f10118q = c0.w(WindowInsets.CONSUMED);

        public k(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
        }

        @Override // U1.c0.g, U1.c0.l
        public L1.h g(int i8) {
            return L1.h.d(this.f10109c.getInsets(n.a(i8)));
        }

        @Override // U1.c0.g, U1.c0.l
        public L1.h h(int i8) {
            return L1.h.d(this.f10109c.getInsetsIgnoringVisibility(n.a(i8)));
        }

        @Override // U1.c0.g, U1.c0.l
        public boolean q(int i8) {
            return this.f10109c.isVisible(n.a(i8));
        }

        public k(c0 c0Var, k kVar) {
            super(c0Var, kVar);
        }

        @Override // U1.c0.g, U1.c0.l
        public final void d(View view) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class m {
        public static int a() {
            return 4;
        }

        public static int b() {
            return 128;
        }

        public static int c() {
            return 8;
        }

        public static int d(int i8) {
            if (i8 == 1) {
                return 0;
            }
            if (i8 == 2) {
                return 1;
            }
            if (i8 == 4) {
                return 2;
            }
            if (i8 == 8) {
                return 3;
            }
            if (i8 == 16) {
                return 4;
            }
            if (i8 == 32) {
                return 5;
            }
            if (i8 == 64) {
                return 6;
            }
            if (i8 == 128) {
                return 7;
            }
            if (i8 == 256) {
                return 8;
            }
            throw new IllegalArgumentException("type needs to be >= FIRST and <= LAST, type=" + i8);
        }

        public static int e() {
            return 32;
        }

        public static int f() {
            return 2;
        }

        public static int g() {
            return 1;
        }

        public static int h() {
            return 7;
        }

        public static int i() {
            return 16;
        }

        public static int j() {
            return 64;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n {
        public static int a(int i8) {
            int iStatusBars;
            int i9 = 0;
            for (int i10 = 1; i10 <= 256; i10 <<= 1) {
                if ((i8 & i10) != 0) {
                    if (i10 == 1) {
                        iStatusBars = WindowInsets.Type.statusBars();
                    } else if (i10 == 2) {
                        iStatusBars = WindowInsets.Type.navigationBars();
                    } else if (i10 == 4) {
                        iStatusBars = WindowInsets.Type.captionBar();
                    } else if (i10 == 8) {
                        iStatusBars = WindowInsets.Type.ime();
                    } else if (i10 == 16) {
                        iStatusBars = WindowInsets.Type.systemGestures();
                    } else if (i10 == 32) {
                        iStatusBars = WindowInsets.Type.mandatorySystemGestures();
                    } else if (i10 == 64) {
                        iStatusBars = WindowInsets.Type.tappableElement();
                    } else if (i10 == 128) {
                        iStatusBars = WindowInsets.Type.displayCutout();
                    }
                    i9 |= iStatusBars;
                }
            }
            return i9;
        }
    }

    static {
        if (Build.VERSION.SDK_INT >= 30) {
            f10088b = k.f10118q;
        } else {
            f10088b = l.f10119b;
        }
    }

    public c0(WindowInsets windowInsets) {
        int i8 = Build.VERSION.SDK_INT;
        if (i8 >= 30) {
            this.f10089a = new k(this, windowInsets);
        } else if (i8 >= 29) {
            this.f10089a = new j(this, windowInsets);
        } else {
            this.f10089a = new i(this, windowInsets);
        }
    }

    public static L1.h n(L1.h hVar, int i8, int i9, int i10, int i11) {
        int iMax = Math.max(0, hVar.f4939a - i8);
        int iMax2 = Math.max(0, hVar.f4940b - i9);
        int iMax3 = Math.max(0, hVar.f4941c - i10);
        int iMax4 = Math.max(0, hVar.f4942d - i11);
        return (iMax == i8 && iMax2 == i9 && iMax3 == i10 && iMax4 == i11) ? hVar : L1.h.b(iMax, iMax2, iMax3, iMax4);
    }

    public static c0 w(WindowInsets windowInsets) {
        return x(windowInsets, null);
    }

    public static c0 x(WindowInsets windowInsets, View view) {
        c0 c0Var = new c0((WindowInsets) T1.f.g(windowInsets));
        if (view != null && view.isAttachedToWindow()) {
            c0Var.t(I.r(view));
            c0Var.d(view.getRootView());
        }
        return c0Var;
    }

    public c0 a() {
        return this.f10089a.a();
    }

    public c0 b() {
        return this.f10089a.b();
    }

    public c0 c() {
        return this.f10089a.c();
    }

    public void d(View view) {
        this.f10089a.d(view);
    }

    public C1650l e() {
        return this.f10089a.f();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof c0) {
            return T1.d.a(this.f10089a, ((c0) obj).f10089a);
        }
        return false;
    }

    public L1.h f(int i8) {
        return this.f10089a.g(i8);
    }

    public L1.h g(int i8) {
        return this.f10089a.h(i8);
    }

    public L1.h h() {
        return this.f10089a.j();
    }

    public int hashCode() {
        l lVar = this.f10089a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    public int i() {
        return this.f10089a.l().f4942d;
    }

    public int j() {
        return this.f10089a.l().f4939a;
    }

    public int k() {
        return this.f10089a.l().f4941c;
    }

    public int l() {
        return this.f10089a.l().f4940b;
    }

    public c0 m(int i8, int i9, int i10, int i11) {
        return this.f10089a.n(i8, i9, i10, i11);
    }

    public boolean o() {
        return this.f10089a.o();
    }

    public boolean p(int i8) {
        return this.f10089a.q(i8);
    }

    public c0 q(int i8, int i9, int i10, int i11) {
        return new b(this).d(L1.h.b(i8, i9, i10, i11)).a();
    }

    public void r(L1.h[] hVarArr) {
        this.f10089a.r(hVarArr);
    }

    public void s(L1.h hVar) {
        this.f10089a.s(hVar);
    }

    public void t(c0 c0Var) {
        this.f10089a.t(c0Var);
    }

    public void u(L1.h hVar) {
        this.f10089a.u(hVar);
    }

    public WindowInsets v() {
        l lVar = this.f10089a;
        if (lVar instanceof g) {
            return ((g) lVar).f10109c;
        }
        return null;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends f {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static Field f10095e = null;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static boolean f10096f = false;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static Constructor f10097g = null;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f10098h = false;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public WindowInsets f10099c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public L1.h f10100d;

        public c() {
            this.f10099c = i();
        }

        private static WindowInsets i() {
            if (!f10096f) {
                try {
                    f10095e = WindowInsets.class.getDeclaredField("CONSUMED");
                } catch (ReflectiveOperationException e8) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets.CONSUMED field", e8);
                }
                f10096f = true;
            }
            Field field = f10095e;
            if (field != null) {
                try {
                    WindowInsets windowInsets = (WindowInsets) field.get(null);
                    if (windowInsets != null) {
                        return new WindowInsets(windowInsets);
                    }
                } catch (ReflectiveOperationException e9) {
                    Log.i("WindowInsetsCompat", "Could not get value from WindowInsets.CONSUMED field", e9);
                }
            }
            if (!f10098h) {
                try {
                    f10097g = WindowInsets.class.getConstructor(Rect.class);
                } catch (ReflectiveOperationException e10) {
                    Log.i("WindowInsetsCompat", "Could not retrieve WindowInsets(Rect) constructor", e10);
                }
                f10098h = true;
            }
            Constructor constructor = f10097g;
            if (constructor != null) {
                try {
                    return (WindowInsets) constructor.newInstance(new Rect());
                } catch (ReflectiveOperationException e11) {
                    Log.i("WindowInsetsCompat", "Could not invoke WindowInsets(Rect) constructor", e11);
                }
            }
            return null;
        }

        @Override // U1.c0.f
        public c0 b() {
            a();
            c0 c0VarW = c0.w(this.f10099c);
            c0VarW.r(this.f10103b);
            c0VarW.u(this.f10100d);
            return c0VarW;
        }

        @Override // U1.c0.f
        public void e(L1.h hVar) {
            this.f10100d = hVar;
        }

        @Override // U1.c0.f
        public void g(L1.h hVar) {
            WindowInsets windowInsets = this.f10099c;
            if (windowInsets != null) {
                this.f10099c = windowInsets.replaceSystemWindowInsets(hVar.f4939a, hVar.f4940b, hVar.f4941c, hVar.f4942d);
            }
        }

        public c(c0 c0Var) {
            super(c0Var);
            this.f10099c = c0Var.v();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d extends f {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets.Builder f10101c;

        public d() {
            this.f10101c = R1.f.a();
        }

        @Override // U1.c0.f
        public c0 b() {
            a();
            c0 c0VarW = c0.w(this.f10101c.build());
            c0VarW.r(this.f10103b);
            return c0VarW;
        }

        @Override // U1.c0.f
        public void d(L1.h hVar) {
            this.f10101c.setMandatorySystemGestureInsets(hVar.e());
        }

        @Override // U1.c0.f
        public void e(L1.h hVar) {
            this.f10101c.setStableInsets(hVar.e());
        }

        @Override // U1.c0.f
        public void f(L1.h hVar) {
            this.f10101c.setSystemGestureInsets(hVar.e());
        }

        @Override // U1.c0.f
        public void g(L1.h hVar) {
            this.f10101c.setSystemWindowInsets(hVar.e());
        }

        @Override // U1.c0.f
        public void h(L1.h hVar) {
            this.f10101c.setTappableElementInsets(hVar.e());
        }

        public d(c0 c0Var) {
            WindowInsets.Builder builderA;
            super(c0Var);
            WindowInsets windowInsetsV = c0Var.v();
            if (windowInsetsV != null) {
                builderA = d0.a(windowInsetsV);
            } else {
                builderA = R1.f.a();
            }
            this.f10101c = builderA;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class h extends g {

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        public L1.h f10114m;

        public h(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
            this.f10114m = null;
        }

        @Override // U1.c0.l
        public c0 b() {
            return c0.w(this.f10109c.consumeStableInsets());
        }

        @Override // U1.c0.l
        public c0 c() {
            return c0.w(this.f10109c.consumeSystemWindowInsets());
        }

        @Override // U1.c0.l
        public final L1.h j() {
            if (this.f10114m == null) {
                this.f10114m = L1.h.b(this.f10109c.getStableInsetLeft(), this.f10109c.getStableInsetTop(), this.f10109c.getStableInsetRight(), this.f10109c.getStableInsetBottom());
            }
            return this.f10114m;
        }

        @Override // U1.c0.l
        public boolean o() {
            return this.f10109c.isConsumed();
        }

        @Override // U1.c0.l
        public void u(L1.h hVar) {
            this.f10114m = hVar;
        }

        public h(c0 c0Var, h hVar) {
            super(c0Var, hVar);
            this.f10114m = null;
            this.f10114m = hVar.f10114m;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class g extends l {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static boolean f10104h = false;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static Method f10105i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public static Class f10106j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public static Field f10107k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public static Field f10108l;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final WindowInsets f10109c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public L1.h[] f10110d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public L1.h f10111e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public c0 f10112f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public L1.h f10113g;

        public g(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var);
            this.f10111e = null;
            this.f10109c = windowInsets;
        }

        private static void A() {
            try {
                f10105i = View.class.getDeclaredMethod("getViewRootImpl", null);
                Class<?> cls = Class.forName("android.view.View$AttachInfo");
                f10106j = cls;
                f10107k = cls.getDeclaredField("mVisibleInsets");
                f10108l = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
                f10107k.setAccessible(true);
                f10108l.setAccessible(true);
            } catch (ReflectiveOperationException e8) {
                Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
            }
            f10104h = true;
        }

        private L1.h v(int i8, boolean z8) {
            L1.h hVarA = L1.h.f4938e;
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0) {
                    hVarA = L1.h.a(hVarA, w(i9, z8));
                }
            }
            return hVarA;
        }

        private L1.h x() {
            c0 c0Var = this.f10112f;
            return c0Var != null ? c0Var.h() : L1.h.f4938e;
        }

        private L1.h y(View view) {
            if (Build.VERSION.SDK_INT >= 30) {
                throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
            }
            if (!f10104h) {
                A();
            }
            Method method = f10105i;
            if (method != null && f10106j != null && f10107k != null) {
                try {
                    Object objInvoke = method.invoke(view, null);
                    if (objInvoke == null) {
                        Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
                        return null;
                    }
                    Rect rect = (Rect) f10107k.get(f10108l.get(objInvoke));
                    if (rect != null) {
                        return L1.h.c(rect);
                    }
                    return null;
                } catch (ReflectiveOperationException e8) {
                    Log.e("WindowInsetsCompat", "Failed to get visible insets. (Reflection error). " + e8.getMessage(), e8);
                }
            }
            return null;
        }

        @Override // U1.c0.l
        public void d(View view) {
            L1.h hVarY = y(view);
            if (hVarY == null) {
                hVarY = L1.h.f4938e;
            }
            s(hVarY);
        }

        @Override // U1.c0.l
        public void e(c0 c0Var) {
            c0Var.t(this.f10112f);
            c0Var.s(this.f10113g);
        }

        @Override // U1.c0.l
        public boolean equals(Object obj) {
            if (super.equals(obj)) {
                return Objects.equals(this.f10113g, ((g) obj).f10113g);
            }
            return false;
        }

        @Override // U1.c0.l
        public L1.h g(int i8) {
            return v(i8, false);
        }

        @Override // U1.c0.l
        public L1.h h(int i8) {
            return v(i8, true);
        }

        @Override // U1.c0.l
        public final L1.h l() {
            if (this.f10111e == null) {
                this.f10111e = L1.h.b(this.f10109c.getSystemWindowInsetLeft(), this.f10109c.getSystemWindowInsetTop(), this.f10109c.getSystemWindowInsetRight(), this.f10109c.getSystemWindowInsetBottom());
            }
            return this.f10111e;
        }

        @Override // U1.c0.l
        public c0 n(int i8, int i9, int i10, int i11) {
            b bVar = new b(c0.w(this.f10109c));
            bVar.d(c0.n(l(), i8, i9, i10, i11));
            bVar.c(c0.n(j(), i8, i9, i10, i11));
            return bVar.a();
        }

        @Override // U1.c0.l
        public boolean p() {
            return this.f10109c.isRound();
        }

        @Override // U1.c0.l
        public boolean q(int i8) {
            for (int i9 = 1; i9 <= 256; i9 <<= 1) {
                if ((i8 & i9) != 0 && !z(i9)) {
                    return false;
                }
            }
            return true;
        }

        @Override // U1.c0.l
        public void r(L1.h[] hVarArr) {
            this.f10110d = hVarArr;
        }

        @Override // U1.c0.l
        public void s(L1.h hVar) {
            this.f10113g = hVar;
        }

        @Override // U1.c0.l
        public void t(c0 c0Var) {
            this.f10112f = c0Var;
        }

        public L1.h w(int i8, boolean z8) {
            L1.h hVarH;
            int i9;
            if (i8 == 1) {
                return z8 ? L1.h.b(0, Math.max(x().f4940b, l().f4940b), 0, 0) : L1.h.b(0, l().f4940b, 0, 0);
            }
            if (i8 == 2) {
                if (z8) {
                    L1.h hVarX = x();
                    L1.h hVarJ = j();
                    return L1.h.b(Math.max(hVarX.f4939a, hVarJ.f4939a), 0, Math.max(hVarX.f4941c, hVarJ.f4941c), Math.max(hVarX.f4942d, hVarJ.f4942d));
                }
                L1.h hVarL = l();
                c0 c0Var = this.f10112f;
                hVarH = c0Var != null ? c0Var.h() : null;
                int iMin = hVarL.f4942d;
                if (hVarH != null) {
                    iMin = Math.min(iMin, hVarH.f4942d);
                }
                return L1.h.b(hVarL.f4939a, 0, hVarL.f4941c, iMin);
            }
            if (i8 != 8) {
                if (i8 == 16) {
                    return k();
                }
                if (i8 == 32) {
                    return i();
                }
                if (i8 == 64) {
                    return m();
                }
                if (i8 != 128) {
                    return L1.h.f4938e;
                }
                c0 c0Var2 = this.f10112f;
                C1650l c1650lE = c0Var2 != null ? c0Var2.e() : f();
                return c1650lE != null ? L1.h.b(c1650lE.c(), c1650lE.e(), c1650lE.d(), c1650lE.b()) : L1.h.f4938e;
            }
            L1.h[] hVarArr = this.f10110d;
            hVarH = hVarArr != null ? hVarArr[m.d(8)] : null;
            if (hVarH != null) {
                return hVarH;
            }
            L1.h hVarL2 = l();
            L1.h hVarX2 = x();
            int i10 = hVarL2.f4942d;
            if (i10 > hVarX2.f4942d) {
                return L1.h.b(0, 0, 0, i10);
            }
            L1.h hVar = this.f10113g;
            return (hVar == null || hVar.equals(L1.h.f4938e) || (i9 = this.f10113g.f4942d) <= hVarX2.f4942d) ? L1.h.f4938e : L1.h.b(0, 0, 0, i9);
        }

        public boolean z(int i8) {
            if (i8 != 1 && i8 != 2) {
                if (i8 == 4) {
                    return false;
                }
                if (i8 != 8 && i8 != 128) {
                    return true;
                }
            }
            return !w(i8, false).equals(L1.h.f4938e);
        }

        public g(c0 c0Var, g gVar) {
            this(c0Var, new WindowInsets(gVar.f10109c));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class j extends i {

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        public L1.h f10115n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        public L1.h f10116o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        public L1.h f10117p;

        public j(c0 c0Var, WindowInsets windowInsets) {
            super(c0Var, windowInsets);
            this.f10115n = null;
            this.f10116o = null;
            this.f10117p = null;
        }

        @Override // U1.c0.l
        public L1.h i() {
            if (this.f10116o == null) {
                this.f10116o = L1.h.d(this.f10109c.getMandatorySystemGestureInsets());
            }
            return this.f10116o;
        }

        @Override // U1.c0.l
        public L1.h k() {
            if (this.f10115n == null) {
                this.f10115n = L1.h.d(this.f10109c.getSystemGestureInsets());
            }
            return this.f10115n;
        }

        @Override // U1.c0.l
        public L1.h m() {
            if (this.f10117p == null) {
                this.f10117p = L1.h.d(this.f10109c.getTappableElementInsets());
            }
            return this.f10117p;
        }

        @Override // U1.c0.g, U1.c0.l
        public c0 n(int i8, int i9, int i10, int i11) {
            return c0.w(this.f10109c.inset(i8, i9, i10, i11));
        }

        public j(c0 c0Var, j jVar) {
            super(c0Var, jVar);
            this.f10115n = null;
            this.f10116o = null;
            this.f10117p = null;
        }

        @Override // U1.c0.h, U1.c0.l
        public void u(L1.h hVar) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final f f10094a;

        public b() {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                this.f10094a = new e();
            } else if (i8 >= 29) {
                this.f10094a = new d();
            } else {
                this.f10094a = new c();
            }
        }

        public c0 a() {
            return this.f10094a.b();
        }

        public b b(int i8, L1.h hVar) {
            this.f10094a.c(i8, hVar);
            return this;
        }

        public b c(L1.h hVar) {
            this.f10094a.e(hVar);
            return this;
        }

        public b d(L1.h hVar) {
            this.f10094a.g(hVar);
            return this;
        }

        public b(c0 c0Var) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                this.f10094a = new e(c0Var);
            } else if (i8 >= 29) {
                this.f10094a = new d(c0Var);
            } else {
                this.f10094a = new c(c0Var);
            }
        }
    }

    public c0(c0 c0Var) {
        if (c0Var != null) {
            l lVar = c0Var.f10089a;
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30 && (lVar instanceof k)) {
                this.f10089a = new k(this, (k) lVar);
            } else if (i8 >= 29 && (lVar instanceof j)) {
                this.f10089a = new j(this, (j) lVar);
            } else if (lVar instanceof i) {
                this.f10089a = new i(this, (i) lVar);
            } else if (lVar instanceof h) {
                this.f10089a = new h(this, (h) lVar);
            } else if (lVar instanceof g) {
                this.f10089a = new g(this, (g) lVar);
            } else {
                this.f10089a = new l(this);
            }
            lVar.e(this);
            return;
        }
        this.f10089a = new l(this);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class l {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static final c0 f10119b = new b().a().a().b().c();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final c0 f10120a;

        public l(c0 c0Var) {
            this.f10120a = c0Var;
        }

        public c0 a() {
            return this.f10120a;
        }

        public c0 b() {
            return this.f10120a;
        }

        public c0 c() {
            return this.f10120a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof l)) {
                return false;
            }
            l lVar = (l) obj;
            return p() == lVar.p() && o() == lVar.o() && T1.d.a(l(), lVar.l()) && T1.d.a(j(), lVar.j()) && T1.d.a(f(), lVar.f());
        }

        public C1650l f() {
            return null;
        }

        public L1.h g(int i8) {
            return L1.h.f4938e;
        }

        public L1.h h(int i8) {
            if ((i8 & 8) == 0) {
                return L1.h.f4938e;
            }
            throw new IllegalArgumentException("Unable to query the maximum insets for IME");
        }

        public int hashCode() {
            return T1.d.b(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
        }

        public L1.h i() {
            return l();
        }

        public L1.h j() {
            return L1.h.f4938e;
        }

        public L1.h k() {
            return l();
        }

        public L1.h l() {
            return L1.h.f4938e;
        }

        public L1.h m() {
            return l();
        }

        public c0 n(int i8, int i9, int i10, int i11) {
            return f10119b;
        }

        public boolean o() {
            return false;
        }

        public boolean p() {
            return false;
        }

        public boolean q(int i8) {
            return true;
        }

        public void d(View view) {
        }

        public void e(c0 c0Var) {
        }

        public void r(L1.h[] hVarArr) {
        }

        public void s(L1.h hVar) {
        }

        public void t(c0 c0Var) {
        }

        public void u(L1.h hVar) {
        }
    }
}
