package androidx.appcompat.widget;

import L1.h;
import U1.C1661x;
import U1.I;
import U1.InterfaceC1659v;
import U1.InterfaceC1660w;
import U1.c0;
import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.view.menu.i;
import p117n.F;
import p117n.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarOverlayLayout extends ViewGroup implements F, InterfaceC1659v, InterfaceC1660w {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static final int[] f13789G = {p054g.a.f22372b, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static final c0 f13790H = new c0.b().d(h.b(0, 1, 0, 1)).a();

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public static final Rect f13791I = new Rect();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ViewPropertyAnimator f13792A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final AnimatorListenerAdapter f13793B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Runnable f13794C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final Runnable f13795D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final C1661x f13796E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final f f13797F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f13798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f13799b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public ContentFrameLayout f13800c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarContainer f13801d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public G f13802e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f13803f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public boolean f13804g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13805h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13806i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f13807j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13808k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13809l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final Rect f13810m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final Rect f13811n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final Rect f13812o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Rect f13813p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final Rect f13814q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public final Rect f13815r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final Rect f13816s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final Rect f13817t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public c0 f13818u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public c0 f13819v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public c0 f13820w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public c0 f13821x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public d f13822y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public OverScroller f13823z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends AnimatorListenerAdapter {
        public a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13792A = null;
            actionBarOverlayLayout.f13807j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13792A = null;
            actionBarOverlayLayout.f13807j = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13792A = actionBarOverlayLayout.f13801d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f13793B);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements Runnable {
        public c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.v();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f13792A = actionBarOverlayLayout.f13801d.animate().translationY(-ActionBarOverlayLayout.this.f13801d.getHeight()).setListener(ActionBarOverlayLayout.this.f13793B);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {
        void a();

        void b();

        void c(boolean z8);

        void d();

        void e();

        void onWindowVisibilityChanged(int i8);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i8, int i9) {
            super(i8, i9);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends View {
        public f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(Context context) {
        this(context, null);
    }

    public void A() {
        if (this.f13800c == null) {
            this.f13800c = (ContentFrameLayout) findViewById(p054g.f.f22478b);
            this.f13801d = (ActionBarContainer) findViewById(p054g.f.f22479c);
            this.f13802e = u(findViewById(p054g.f.f22477a));
        }
    }

    public final void B() {
        v();
        this.f13794C.run();
    }

    public final boolean C(float f8) {
        this.f13823z.fling(0, 0, 0, (int) f8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f13823z.getFinalY() > this.f13801d.getHeight();
    }

    @Override // p117n.F
    public void a(Menu menu, i.a aVar) {
        A();
        this.f13802e.a(menu, aVar);
    }

    @Override // p117n.F
    public boolean b() {
        A();
        return this.f13802e.b();
    }

    @Override // p117n.F
    public void c() {
        A();
        this.f13802e.c();
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // p117n.F
    public boolean d() {
        A();
        return this.f13802e.d();
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (this.f13803f != null) {
            int bottom = this.f13801d.getVisibility() == 0 ? (int) (this.f13801d.getBottom() + this.f13801d.getTranslationY() + 0.5f) : 0;
            this.f13803f.setBounds(0, bottom, getWidth(), this.f13803f.getIntrinsicHeight() + bottom);
            this.f13803f.draw(canvas);
        }
    }

    @Override // p117n.F
    public boolean e() {
        A();
        return this.f13802e.e();
    }

    @Override // p117n.F
    public boolean f() {
        A();
        return this.f13802e.f();
    }

    @Override // android.view.View
    public boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // p117n.F
    public boolean g() {
        A();
        return this.f13802e.g();
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f13801d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f13796E.a();
    }

    public CharSequence getTitle() {
        A();
        return this.f13802e.getTitle();
    }

    @Override // p117n.F
    public void h(int i8) {
        A();
        if (i8 == 2) {
            this.f13802e.r();
        } else if (i8 == 5) {
            this.f13802e.s();
        } else {
            if (i8 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // p117n.F
    public void i() {
        A();
        this.f13802e.h();
    }

    @Override // U1.InterfaceC1660w
    public void j(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        k(view, i8, i9, i10, i11, i12);
    }

    @Override // U1.InterfaceC1659v
    public void k(View view, int i8, int i9, int i10, int i11, int i12) {
        if (i12 == 0) {
            onNestedScroll(view, i8, i9, i10, i11);
        }
    }

    @Override // U1.InterfaceC1659v
    public boolean l(View view, View view2, int i8, int i9) {
        return i9 == 0 && onStartNestedScroll(view, view2, i8);
    }

    @Override // U1.InterfaceC1659v
    public void m(View view, View view2, int i8, int i9) {
        if (i9 == 0) {
            onNestedScrollAccepted(view, view2, i8);
        }
    }

    @Override // U1.InterfaceC1659v
    public void n(View view, int i8) {
        if (i8 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // U1.InterfaceC1659v
    public void o(View view, int i8, int i9, int[] iArr, int i10) {
        if (i10 == 0) {
            onNestedPreScroll(view, i8, i9, iArr);
        }
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets windowInsets) {
        A();
        c0 c0VarX = c0.x(windowInsets, this);
        boolean zQ = q(this.f13801d, new Rect(c0VarX.j(), c0VarX.l(), c0VarX.k(), c0VarX.i()), true, true, false, true);
        I.d(this, c0VarX, this.f13810m);
        Rect rect = this.f13810m;
        c0 c0VarM = c0VarX.m(rect.left, rect.top, rect.right, rect.bottom);
        this.f13818u = c0VarM;
        boolean z8 = true;
        if (!this.f13819v.equals(c0VarM)) {
            this.f13819v = this.f13818u;
            zQ = true;
        }
        if (this.f13811n.equals(this.f13810m)) {
            z8 = zQ;
        } else {
            this.f13811n.set(this.f13810m);
        }
        if (z8) {
            requestLayout();
        }
        return c0VarX.a().c().b().v();
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        w(getContext());
        I.F(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        v();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i13 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i14 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i13, i14, measuredWidth + i13, measuredHeight + i14);
            }
        }
    }

    @Override // android.view.View
    public void onMeasure(int i8, int i9) {
        int measuredHeight;
        A();
        measureChildWithMargins(this.f13801d, i8, 0, i9, 0);
        e eVar = (e) this.f13801d.getLayoutParams();
        int iMax = Math.max(0, this.f13801d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f13801d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f13801d.getMeasuredState());
        boolean z8 = (I.u(this) & 256) != 0;
        if (z8) {
            measuredHeight = this.f13798a;
            if (this.f13805h && this.f13801d.getTabContainer() != null) {
                measuredHeight += this.f13798a;
            }
        } else {
            measuredHeight = this.f13801d.getVisibility() != 8 ? this.f13801d.getMeasuredHeight() : 0;
        }
        this.f13812o.set(this.f13810m);
        this.f13820w = this.f13818u;
        if (this.f13804g || z8 || !r()) {
            this.f13820w = new c0.b(this.f13820w).d(h.b(this.f13820w.j(), this.f13820w.l() + measuredHeight, this.f13820w.k(), this.f13820w.i())).a();
        } else {
            Rect rect = this.f13812o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f13820w = this.f13820w.m(0, measuredHeight, 0, 0);
        }
        q(this.f13800c, this.f13812o, true, true, true, true);
        if (!this.f13821x.equals(this.f13820w)) {
            c0 c0Var = this.f13820w;
            this.f13821x = c0Var;
            I.e(this.f13800c, c0Var);
        }
        measureChildWithMargins(this.f13800c, i8, 0, i9, 0);
        e eVar2 = (e) this.f13800c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f13800c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f13800c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f13800c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i8, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z8) {
        if (!this.f13806i || !z8) {
            return false;
        }
        if (C(f9)) {
            p();
        } else {
            B();
        }
        this.f13807j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        int i12 = this.f13808k + i9;
        this.f13808k = i12;
        setActionBarHideOffset(i12);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i8) {
        this.f13796E.b(view, view2, i8);
        this.f13808k = getActionBarHideOffset();
        v();
        d dVar = this.f13822y;
        if (dVar != null) {
            dVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i8) {
        if ((i8 & 2) == 0 || this.f13801d.getVisibility() != 0) {
            return false;
        }
        return this.f13806i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        if (this.f13806i && !this.f13807j) {
            if (this.f13808k <= this.f13801d.getHeight()) {
                z();
            } else {
                y();
            }
        }
        d dVar = this.f13822y;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    public void onWindowSystemUiVisibilityChanged(int i8) {
        super.onWindowSystemUiVisibilityChanged(i8);
        A();
        int i9 = this.f13809l ^ i8;
        this.f13809l = i8;
        boolean z8 = (i8 & 4) == 0;
        boolean z9 = (i8 & 256) != 0;
        d dVar = this.f13822y;
        if (dVar != null) {
            dVar.c(!z9);
            if (z8 || !z9) {
                this.f13822y.a();
            } else {
                this.f13822y.d();
            }
        }
        if ((i9 & 256) == 0 || this.f13822y == null) {
            return;
        }
        I.F(this);
    }

    @Override // android.view.View
    public void onWindowVisibilityChanged(int i8) {
        super.onWindowVisibilityChanged(i8);
        this.f13799b = i8;
        d dVar = this.f13822y;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i8);
        }
    }

    public final void p() {
        v();
        this.f13795D.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final boolean q(View view, Rect rect, boolean z8, boolean z9, boolean z10, boolean z11) {
        boolean z12;
        e eVar = (e) view.getLayoutParams();
        if (z8) {
            int i8 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i9 = rect.left;
            if (i8 != i9) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i9;
                z12 = true;
            } else {
                z12 = false;
            }
        } else {
            z12 = false;
        }
        if (z9) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i11 = rect.top;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i11;
                z12 = true;
            }
        }
        if (z11) {
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i13 = rect.right;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i13;
                z12 = true;
            }
        }
        if (z10) {
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i15 = rect.bottom;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i15;
                return true;
            }
        }
        return z12;
    }

    public final boolean r() {
        I.d(this.f13797F, f13790H, this.f13813p);
        return !this.f13813p.equals(f13791I);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: s, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    public void setActionBarHideOffset(int i8) {
        v();
        this.f13801d.setTranslationY(-Math.max(0, Math.min(i8, this.f13801d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f13822y = dVar;
        if (getWindowToken() != null) {
            this.f13822y.onWindowVisibilityChanged(this.f13799b);
            int i8 = this.f13809l;
            if (i8 != 0) {
                onWindowSystemUiVisibilityChanged(i8);
                I.F(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z8) {
        this.f13805h = z8;
    }

    public void setHideOnContentScrollEnabled(boolean z8) {
        if (z8 != this.f13806i) {
            this.f13806i = z8;
            if (z8) {
                return;
            }
            v();
            setActionBarHideOffset(0);
        }
    }

    public void setIcon(int i8) {
        A();
        this.f13802e.setIcon(i8);
    }

    public void setLogo(int i8) {
        A();
        this.f13802e.l(i8);
    }

    public void setOverlayMode(boolean z8) {
        this.f13804g = z8;
    }

    @Override // p117n.F
    public void setWindowCallback(Window.Callback callback) {
        A();
        this.f13802e.setWindowCallback(callback);
    }

    @Override // p117n.F
    public void setWindowTitle(CharSequence charSequence) {
        A();
        this.f13802e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: t, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final G u(View view) {
        if (view instanceof G) {
            return (G) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public void v() {
        removeCallbacks(this.f13794C);
        removeCallbacks(this.f13795D);
        ViewPropertyAnimator viewPropertyAnimator = this.f13792A;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public final void w(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f13789G);
        this.f13798a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f13803f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f13823z = new OverScroller(context);
    }

    public boolean x() {
        return this.f13804g;
    }

    public final void y() {
        v();
        postDelayed(this.f13795D, 600L);
    }

    public final void z() {
        v();
        postDelayed(this.f13794C, 600L);
    }

    public ActionBarOverlayLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13799b = 0;
        this.f13810m = new Rect();
        this.f13811n = new Rect();
        this.f13812o = new Rect();
        this.f13813p = new Rect();
        this.f13814q = new Rect();
        this.f13815r = new Rect();
        this.f13816s = new Rect();
        this.f13817t = new Rect();
        c0 c0Var = c0.f10088b;
        this.f13818u = c0Var;
        this.f13819v = c0Var;
        this.f13820w = c0Var;
        this.f13821x = c0Var;
        this.f13793B = new a();
        this.f13794C = new b();
        this.f13795D = new c();
        w(context);
        this.f13796E = new C1661x(this);
        f fVar = new f(context);
        this.f13797F = fVar;
        addView(fVar);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    public void setIcon(Drawable drawable) {
        A();
        this.f13802e.setIcon(drawable);
    }

    public void setShowingForActionMode(boolean z8) {
    }

    public void setUiOptions(int i8) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
    }
}
