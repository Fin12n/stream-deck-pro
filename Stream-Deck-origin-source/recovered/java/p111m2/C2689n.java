package p111m2;

import D6.iIQ.BmWxZhjGfw;
import U1.I;
import U1.c0;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p102l2.c;

/* JADX INFO: renamed from: m2.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2689n extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f29937a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f29938b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View.OnApplyWindowInsetsListener f29939c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f29940d;

    /* JADX INFO: renamed from: m2.n$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f29941a = new a();

        public final WindowInsets a(View.OnApplyWindowInsetsListener onApplyWindowInsetsListener, View v8, WindowInsets insets) {
            t.g(onApplyWindowInsetsListener, "onApplyWindowInsetsListener");
            t.g(v8, "v");
            t.g(insets, "insets");
            WindowInsets windowInsetsOnApplyWindowInsets = onApplyWindowInsetsListener.onApplyWindowInsets(v8, insets);
            t.f(windowInsetsOnApplyWindowInsets, "onApplyWindowInsetsListe…lyWindowInsets(v, insets)");
            return windowInsetsOnApplyWindowInsets;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C2689n(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        t.g(context, "context");
    }

    public final void a(View view) {
        if (this.f29938b.contains(view)) {
            this.f29937a.add(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public WindowInsets dispatchApplyWindowInsets(WindowInsets insets) {
        c0 c0VarA;
        t.g(insets, "insets");
        c0 c0VarW = c0.w(insets);
        t.f(c0VarW, "toWindowInsetsCompat(insets)");
        View.OnApplyWindowInsetsListener onApplyWindowInsetsListener = this.f29939c;
        if (onApplyWindowInsetsListener != null) {
            a aVar = a.f29941a;
            t.d(onApplyWindowInsetsListener);
            c0VarA = c0.w(aVar.a(onApplyWindowInsetsListener, this, insets));
        } else {
            c0VarA = I.A(this, c0VarW);
        }
        t.f(c0VarA, "if (applyWindowInsetsLis…, insetsCompat)\n        }");
        if (!c0VarA.o()) {
            int childCount = getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                I.e(getChildAt(i8), c0VarA);
            }
        }
        return insets;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        t.g(canvas, "canvas");
        if (this.f29940d) {
            Iterator it = this.f29937a.iterator();
            while (it.hasNext()) {
                super.drawChild(canvas, (View) it.next(), getDrawingTime());
            }
        }
        super.dispatchDraw(canvas);
    }

    @Override // android.view.ViewGroup
    public boolean drawChild(Canvas canvas, View child, long j8) {
        t.g(canvas, "canvas");
        t.g(child, "child");
        if (this.f29940d && !this.f29937a.isEmpty() && this.f29937a.contains(child)) {
            return false;
        }
        return super.drawChild(canvas, child, j8);
    }

    @Override // android.view.ViewGroup
    public void endViewTransition(View view) {
        t.g(view, "view");
        this.f29938b.remove(view);
        if (this.f29937a.remove(view)) {
            this.f29940d = true;
        }
        super.endViewTransition(view);
    }

    public final <F extends ComponentCallbacksC2681f> F getFragment() {
        return (F) y.h0(this).e0(getId());
    }

    @Override // android.view.View
    public WindowInsets onApplyWindowInsets(WindowInsets insets) {
        t.g(insets, "insets");
        return insets;
    }

    @Override // android.view.ViewGroup
    public void removeAllViewsInLayout() {
        int childCount = getChildCount();
        while (true) {
            childCount--;
            if (-1 >= childCount) {
                super.removeAllViewsInLayout();
                return;
            } else {
                View view = getChildAt(childCount);
                t.f(view, "view");
                a(view);
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        t.g(view, "view");
        a(view);
        super.removeView(view);
    }

    @Override // android.view.ViewGroup
    public void removeViewAt(int i8) {
        View view = getChildAt(i8);
        t.f(view, "view");
        a(view);
        super.removeViewAt(i8);
    }

    @Override // android.view.ViewGroup
    public void removeViewInLayout(View view) {
        t.g(view, "view");
        a(view);
        super.removeViewInLayout(view);
    }

    @Override // android.view.ViewGroup
    public void removeViews(int i8, int i9) {
        int i10 = i8 + i9;
        for (int i11 = i8; i11 < i10; i11++) {
            View view = getChildAt(i11);
            t.f(view, "view");
            a(view);
        }
        super.removeViews(i8, i9);
    }

    @Override // android.view.ViewGroup
    public void removeViewsInLayout(int i8, int i9) {
        int i10 = i8 + i9;
        for (int i11 = i8; i11 < i10; i11++) {
            View view = getChildAt(i11);
            t.f(view, "view");
            a(view);
        }
        super.removeViewsInLayout(i8, i9);
    }

    public final void setDrawDisappearingViewsLast(boolean z8) {
        this.f29940d = z8;
    }

    @Override // android.view.ViewGroup
    public void setLayoutTransition(LayoutTransition layoutTransition) {
        throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
    }

    @Override // android.view.View
    public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener listener) {
        t.g(listener, "listener");
        this.f29939c = listener;
    }

    @Override // android.view.ViewGroup
    public void startViewTransition(View view) {
        t.g(view, "view");
        if (view.getParent() == this) {
            this.f29938b.add(view);
        }
        super.startViewTransition(view);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2689n(Context context) {
        super(context);
        t.g(context, "context");
        this.f29937a = new ArrayList();
        this.f29938b = new ArrayList();
        this.f29940d = true;
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        t.g(view, BmWxZhjGfw.oQPRAPgwIgFcoJE);
        if (y.y0(view) != null) {
            super.addView(view, i8, layoutParams);
            return;
        }
        throw new IllegalStateException(("Views added to a FragmentContainerView must be associated with a Fragment. View " + view + " is not associated with a Fragment.").toString());
    }

    public /* synthetic */ C2689n(Context context, AttributeSet attributeSet, int i8, int i9, AbstractC2633k abstractC2633k) {
        this(context, attributeSet, (i9 & 4) != 0 ? 0 : i8);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2689n(Context context, AttributeSet attributeSet, int i8) {
        String str;
        super(context, attributeSet, i8);
        t.g(context, "context");
        this.f29937a = new ArrayList();
        this.f29938b = new ArrayList();
        this.f29940d = true;
        if (attributeSet != null) {
            String classAttribute = attributeSet.getClassAttribute();
            int[] FragmentContainerView = c.f29143e;
            t.f(FragmentContainerView, "FragmentContainerView");
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, FragmentContainerView, 0, 0);
            if (classAttribute == null) {
                classAttribute = typedArrayObtainStyledAttributes.getString(c.f29144f);
                str = "android:name";
            } else {
                str = "class";
            }
            typedArrayObtainStyledAttributes.recycle();
            if (classAttribute == null || isInEditMode()) {
                return;
            }
            throw new UnsupportedOperationException("FragmentContainerView must be within a FragmentActivity to use " + str + "=\"" + classAttribute + '\"');
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2689n(Context context, AttributeSet attrs, y fm) {
        String str;
        super(context, attrs);
        t.g(context, "context");
        t.g(attrs, "attrs");
        t.g(fm, "fm");
        this.f29937a = new ArrayList();
        this.f29938b = new ArrayList();
        this.f29940d = true;
        String classAttribute = attrs.getClassAttribute();
        int[] FragmentContainerView = c.f29143e;
        t.f(FragmentContainerView, "FragmentContainerView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attrs, FragmentContainerView, 0, 0);
        classAttribute = classAttribute == null ? typedArrayObtainStyledAttributes.getString(c.f29144f) : classAttribute;
        String string = typedArrayObtainStyledAttributes.getString(c.f29145g);
        typedArrayObtainStyledAttributes.recycle();
        int id = getId();
        ComponentCallbacksC2681f componentCallbacksC2681fE0 = fm.e0(id);
        if (classAttribute != null && componentCallbacksC2681fE0 == null) {
            if (id == -1) {
                if (string != null) {
                    str = " with tag " + string;
                } else {
                    str = "";
                }
                throw new IllegalStateException("FragmentContainerView must have an android:id to add Fragment " + classAttribute + str);
            }
            ComponentCallbacksC2681f componentCallbacksC2681fA = fm.p0().a(context.getClassLoader(), classAttribute);
            t.f(componentCallbacksC2681fA, "fm.fragmentFactory.insta…ontext.classLoader, name)");
            componentCallbacksC2681fA.z0(context, attrs, null);
            fm.m().m(true).c(this, componentCallbacksC2681fA, string).i();
        }
        fm.P0(this);
    }
}
