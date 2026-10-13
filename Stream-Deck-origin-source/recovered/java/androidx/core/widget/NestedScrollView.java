package androidx.core.widget;

import T0.Vl.PCRzgdeK;
import U1.AbstractC1657t;
import U1.C1639a;
import U1.C1648j;
import U1.C1658u;
import U1.C1661x;
import U1.I;
import U1.InterfaceC1649k;
import U1.InterfaceC1660w;
import V1.l;
import V1.n;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class NestedScrollView extends FrameLayout implements InterfaceC1660w, ScrollingView {

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public static final float f15064D = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final a f15065E = new a();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final int[] f15066F = {R.attr.fillViewport};

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public d f15067A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final c f15068B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public C1648j f15069C;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f15070a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public long f15071b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Rect f15072c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public OverScroller f15073d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public EdgeEffect f15074e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public EdgeEffect f15075f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f15076g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f15077h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f15078i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public View f15079j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f15080k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public VelocityTracker f15081l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f15082m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f15083n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f15084o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f15085p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f15086q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f15087r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public final int[] f15088s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public final int[] f15089t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f15090u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f15091v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public e f15092w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final C1661x f15093x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final C1658u f15094y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public float f15095z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends C1639a {
        @Override // U1.C1639a
        public void f(View view, AccessibilityEvent accessibilityEvent) {
            super.f(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            n.a(accessibilityEvent, nestedScrollView.getScrollX());
            n.b(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // U1.C1639a
        public void g(View view, l lVar) {
            int scrollRange;
            super.g(view, lVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            lVar.X(ScrollView.class.getName());
            if (!nestedScrollView.isEnabled() || (scrollRange = nestedScrollView.getScrollRange()) <= 0) {
                return;
            }
            lVar.u0(true);
            if (nestedScrollView.getScrollY() > 0) {
                lVar.b(l.a.f10496q);
                lVar.b(l.a.f10463B);
            }
            if (nestedScrollView.getScrollY() < scrollRange) {
                lVar.b(l.a.f10495p);
                lVar.b(l.a.f10465D);
            }
        }

        @Override // U1.C1639a
        public boolean k(View view, int i8, Bundle bundle) {
            if (super.k(view, i8, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i8 != 4096) {
                if (i8 == 8192 || i8 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.W(0, iMax, true);
                    return true;
                }
                if (i8 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.W(0, iMin, true);
            return true;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {
        public static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements InterfaceC1649k {
        public c() {
        }

        @Override // U1.InterfaceC1649k
        public boolean a(float f8) {
            if (f8 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.v((int) f8);
            return true;
        }

        @Override // U1.InterfaceC1649k
        public float b() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // U1.InterfaceC1649k
        public void c() {
            NestedScrollView.this.f15073d.abortAnimation();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface d {
        void a(NestedScrollView nestedScrollView, int i8, int i9, int i10, int i11);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e extends View.BaseSavedState {
        public static final Parcelable.Creator<e> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f15097a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public e createFromParcel(Parcel parcel) {
                return new e(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public e[] newArray(int i8) {
                return new e[i8];
            }
        }

        public e(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f15097a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f15097a);
        }

        public e(Parcel parcel) {
            super(parcel);
            this.f15097a = parcel.readInt();
        }
    }

    public NestedScrollView(Context context) {
        this(context, null);
    }

    public static boolean F(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && F((View) parent, view2);
    }

    public static int f(int i8, int i9, int i10) {
        if (i9 >= i10 || i8 < 0) {
            return 0;
        }
        return i9 + i8 > i10 ? i10 - i9 : i8;
    }

    public final void A() {
        VelocityTracker velocityTracker = this.f15081l;
        if (velocityTracker == null) {
            this.f15081l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    public final void B() {
        this.f15073d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f15084o = viewConfiguration.getScaledTouchSlop();
        this.f15085p = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f15086q = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    public final void C() {
        if (this.f15081l == null) {
            this.f15081l = VelocityTracker.obtain();
        }
    }

    public final void D(int i8, int i9) {
        this.f15076g = i8;
        this.f15087r = i9;
        X(2, 0);
    }

    public final boolean E(View view) {
        return !G(view, 0, getHeight());
    }

    public final boolean G(View view, int i8, int i9) {
        view.getDrawingRect(this.f15072c);
        offsetDescendantRectToMyCoords(view, this.f15072c);
        return this.f15072c.bottom + i8 >= getScrollY() && this.f15072c.top - i8 <= getScrollY() + i9;
    }

    public final void H(int i8, int i9, int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i8);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f15094y.d(0, scrollY2, 0, i8 - scrollY2, null, i9, iArr);
    }

    public final void I(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f15087r) {
            int i8 = actionIndex == 0 ? 1 : 0;
            this.f15076g = (int) motionEvent.getY(i8);
            this.f15087r = motionEvent.getPointerId(i8);
            VelocityTracker velocityTracker = this.f15081l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    public boolean J(int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, boolean z8) {
        boolean z9;
        boolean z10;
        int i16;
        int overScrollMode = getOverScrollMode();
        boolean z11 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z12 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z13 = overScrollMode == 0 || (overScrollMode == 1 && z11);
        boolean z14 = overScrollMode == 0 || (overScrollMode == 1 && z12);
        int i17 = i10 + i8;
        int i18 = !z13 ? 0 : i14;
        int i19 = i11 + i9;
        int i20 = !z14 ? 0 : i15;
        int i21 = -i18;
        int i22 = i18 + i12;
        int i23 = -i20;
        int i24 = i20 + i13;
        if (i17 > i22) {
            i17 = i22;
            z9 = true;
        } else if (i17 < i21) {
            z9 = true;
            i17 = i21;
        } else {
            z9 = false;
        }
        if (i19 > i24) {
            i19 = i24;
            z10 = true;
        } else if (i19 < i23) {
            z10 = true;
            i19 = i23;
        } else {
            z10 = false;
        }
        if (!z10 || y(1)) {
            i16 = i17;
        } else {
            int i25 = i17;
            this.f15073d.springBack(i25, i19, 0, 0, 0, getScrollRange());
            i16 = i25;
        }
        onOverScrolled(i16, i19, z9, z10);
        return z9 || z10;
    }

    public boolean K(int i8) {
        boolean z8 = i8 == 130;
        int height = getHeight();
        if (z8) {
            this.f15072c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f15072c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f15072c.top = getScrollY() - height;
            Rect rect2 = this.f15072c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f15072c;
        int i9 = rect3.top;
        int i10 = height + i9;
        rect3.bottom = i10;
        return O(i8, i9, i10);
    }

    public final void L() {
        VelocityTracker velocityTracker = this.f15081l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f15081l = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0060  */
    public final int M(int i8, float f8) {
        float fD;
        int iRound;
        float width = f8 / getWidth();
        float height = i8 / getHeight();
        float f9 = 0.0f;
        if (p003a2.d.b(this.f15074e) == 0.0f) {
            if (p003a2.d.b(this.f15075f) != 0.0f) {
                fD = p003a2.d.d(this.f15075f, height, 1.0f - width);
                if (p003a2.d.b(this.f15075f) == 0.0f) {
                    this.f15075f.onRelease();
                }
            }
            iRound = Math.round(f9 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fD = -p003a2.d.d(this.f15074e, -height, width);
        if (p003a2.d.b(this.f15074e) == 0.0f) {
            this.f15074e.onRelease();
        }
        f9 = fD;
        iRound = Math.round(f9 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    public final void N(boolean z8) {
        if (z8) {
            X(2, 1);
        } else {
            Z(1);
        }
        this.f15091v = getScrollY();
        postInvalidateOnAnimation();
    }

    public final boolean O(int i8, int i9, int i10) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i11 = height + scrollY;
        boolean z8 = false;
        boolean z9 = i8 == 33;
        View viewU = u(z9, i9, i10);
        if (viewU == null) {
            viewU = this;
        }
        if (i9 < scrollY || i10 > i11) {
            P(z9 ? i9 - scrollY : i10 - i11, 0, 1, true);
            z8 = true;
        }
        if (viewU != findFocus()) {
            viewU.requestFocus(i8);
        }
        return z8;
    }

    public final int P(int i8, int i9, int i10, boolean z8) {
        int i11;
        int i12;
        VelocityTracker velocityTracker;
        if (i10 == 1) {
            X(2, i10);
        }
        boolean z9 = false;
        if (i(0, i8, this.f15089t, this.f15088s, i10)) {
            int i13 = i8 - this.f15089t[1];
            i12 = this.f15088s[1];
            i11 = i13;
        } else {
            i11 = i8;
            i12 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z10 = d() && !z8;
        int i14 = i11;
        boolean z11 = J(0, i11, 0, scrollY, 0, scrollRange, 0, 0, true) && !y(i10);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f15089t;
        iArr[1] = 0;
        p(0, scrollY2, 0, i14 - scrollY2, this.f15088s, i10, iArr);
        int i15 = i12 + this.f15088s[1];
        int i16 = i14 - this.f15089t[1];
        int i17 = scrollY + i16;
        if (i17 < 0) {
            if (z10) {
                p003a2.d.d(this.f15074e, (-i16) / getHeight(), i9 / getWidth());
                if (!this.f15075f.isFinished()) {
                    this.f15075f.onRelease();
                }
            }
        } else if (i17 > scrollRange && z10) {
            p003a2.d.d(this.f15075f, i16 / getHeight(), 1.0f - (i9 / getWidth()));
            if (!this.f15074e.isFinished()) {
                this.f15074e.onRelease();
            }
        }
        if (this.f15074e.isFinished() && this.f15075f.isFinished()) {
            z9 = z11;
        } else {
            postInvalidateOnAnimation();
        }
        if (z9 && i10 == 0 && (velocityTracker = this.f15081l) != null) {
            velocityTracker.clear();
        }
        if (i10 == 1) {
            Z(i10);
            this.f15074e.onRelease();
            this.f15075f.onRelease();
        }
        return i15;
    }

    public final void Q(View view) {
        view.getDrawingRect(this.f15072c);
        offsetDescendantRectToMyCoords(view, this.f15072c);
        int iG = g(this.f15072c);
        if (iG != 0) {
            scrollBy(0, iG);
        }
    }

    public final boolean R(Rect rect, boolean z8) {
        int iG = g(rect);
        boolean z9 = iG != 0;
        if (z9) {
            if (z8) {
                scrollBy(0, iG);
                return z9;
            }
            T(0, iG);
        }
        return z9;
    }

    public final boolean S(EdgeEffect edgeEffect, int i8) {
        if (i8 > 0) {
            return true;
        }
        return x(-i8) < p003a2.d.b(edgeEffect) * ((float) getHeight());
    }

    public final void T(int i8, int i9) {
        U(i8, i9, 250, false);
    }

    public final void U(int i8, int i9, int i10, boolean z8) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f15071b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f15073d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i9 + scrollY, Math.max(0, height - height2))) - scrollY, i10);
            N(z8);
        } else {
            if (!this.f15073d.isFinished()) {
                a();
            }
            scrollBy(i8, i9);
        }
        this.f15071b = AnimationUtils.currentAnimationTimeMillis();
    }

    public void V(int i8, int i9, int i10, boolean z8) {
        U(i8 - getScrollX(), i9 - getScrollY(), i10, z8);
    }

    public void W(int i8, int i9, boolean z8) {
        V(i8, i9, 250, z8);
    }

    public boolean X(int i8, int i9) {
        return this.f15094y.m(i8, i9);
    }

    public final boolean Y(MotionEvent motionEvent) {
        boolean z8;
        if (p003a2.d.b(this.f15074e) != 0.0f) {
            p003a2.d.d(this.f15074e, 0.0f, motionEvent.getX() / getWidth());
            z8 = true;
        } else {
            z8 = false;
        }
        if (p003a2.d.b(this.f15075f) == 0.0f) {
            return z8;
        }
        p003a2.d.d(this.f15075f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    public void Z(int i8) {
        this.f15094y.n(i8);
    }

    public final void a() {
        this.f15073d.abortAnimation();
        Z(1);
    }

    @Override // android.view.ViewGroup
    public void addView(View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException(PCRzgdeK.JYCcAx);
        }
        super.addView(view);
    }

    public boolean c(int i8) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i8);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !G(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i8 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i8 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i8 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            P(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f15072c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f15072c);
            P(g(this.f15072c), 0, 1, true);
            viewFindNextFocus.requestFocus(i8);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && E(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f15073d.isFinished()) {
            return;
        }
        this.f15073d.computeScrollOffset();
        int currY = this.f15073d.getCurrY();
        int iH = h(currY - this.f15091v);
        this.f15091v = currY;
        int[] iArr = this.f15089t;
        iArr[1] = 0;
        i(0, iH, iArr, null, 1);
        int i8 = iH - this.f15089t[1];
        int scrollRange = getScrollRange();
        if (i8 != 0) {
            int scrollY = getScrollY();
            J(0, i8, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i9 = i8 - scrollY2;
            int[] iArr2 = this.f15089t;
            iArr2[1] = 0;
            p(0, scrollY2, 0, i9, this.f15088s, 1, iArr2);
            i8 = i9 - this.f15089t[1];
        }
        if (i8 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i8 < 0) {
                    if (this.f15074e.isFinished()) {
                        this.f15074e.onAbsorb((int) this.f15073d.getCurrVelocity());
                    }
                } else if (this.f15075f.isFinished()) {
                    this.f15075f.onAbsorb((int) this.f15073d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f15073d.isFinished()) {
            Z(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        return scrollY > iMax ? bottom + (scrollY - iMax) : bottom;
    }

    public final boolean d() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || t(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchNestedFling(float f8, float f9, boolean z8) {
        return this.f15094y.a(f8, f9, z8);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreFling(float f8, float f9) {
        return this.f15094y.b(f8, f9);
    }

    @Override // android.view.View
    public boolean dispatchNestedPreScroll(int i8, int i9, int[] iArr, int[] iArr2) {
        return i(i8, i9, iArr, iArr2, 0);
    }

    @Override // android.view.View
    public boolean dispatchNestedScroll(int i8, int i9, int i10, int i11, int[] iArr) {
        return this.f15094y.e(i8, i9, i10, i11, iArr);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f15074e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f15074e.setSize(width, height);
            if (this.f15074e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f15075f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f15075f.setSize(width2, height2);
        if (this.f15075f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    public final boolean e() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    public int g(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i8 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i9 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i8 - verticalFadingEdgeLength : i8;
        int i10 = rect.bottom;
        if (i10 > i9 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i9, (childAt.getBottom() + layoutParams.bottomMargin) - i8);
        }
        if (rect.top >= scrollY || i10 >= i9) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i9 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // android.view.View
    public float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.f15093x.a();
    }

    public int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    public float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public float getVerticalScrollFactorCompat() {
        if (this.f15095z == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f15095z = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f15095z;
    }

    public int h(int i8) {
        int height = getHeight();
        if (i8 > 0 && p003a2.d.b(this.f15074e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * p003a2.d.d(this.f15074e, ((-i8) * 4.0f) / height, 0.5f));
            if (iRound != i8) {
                this.f15074e.finish();
            }
            return i8 - iRound;
        }
        if (i8 >= 0 || p003a2.d.b(this.f15075f) == 0.0f) {
            return i8;
        }
        float f8 = height;
        int iRound2 = Math.round((f8 / 4.0f) * p003a2.d.d(this.f15075f, (i8 * 4.0f) / f8, 0.5f));
        if (iRound2 != i8) {
            this.f15075f.finish();
        }
        return i8 - iRound2;
    }

    @Override // android.view.View
    public boolean hasNestedScrollingParent() {
        return y(0);
    }

    public boolean i(int i8, int i9, int[] iArr, int[] iArr2, int i10) {
        return this.f15094y.c(i8, i9, iArr, iArr2, i10);
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.f15094y.j();
    }

    @Override // U1.InterfaceC1660w
    public void j(View view, int i8, int i9, int i10, int i11, int i12, int[] iArr) {
        H(i11, i12, iArr);
    }

    @Override // U1.InterfaceC1659v
    public void k(View view, int i8, int i9, int i10, int i11, int i12) {
        H(i11, i12, null);
    }

    @Override // U1.InterfaceC1659v
    public boolean l(View view, View view2, int i8, int i9) {
        return (i8 & 2) != 0;
    }

    @Override // U1.InterfaceC1659v
    public void m(View view, View view2, int i8, int i9) {
        this.f15093x.c(view, view2, i8, i9);
        X(2, i9);
    }

    @Override // android.view.ViewGroup
    public void measureChild(View view, int i8, int i9) {
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    public void measureChildWithMargins(View view, int i8, int i9, int i10, int i11) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // U1.InterfaceC1659v
    public void n(View view, int i8) {
        this.f15093x.d(view, i8);
        Z(i8);
    }

    @Override // U1.InterfaceC1659v
    public void o(View view, int i8, int i9, int[] iArr, int i10) {
        i(i8, i9, iArr, null, i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f15078i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(MotionEvent motionEvent) {
        int i8;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f15080k) {
            if (AbstractC1657t.a(motionEvent, 2)) {
                i8 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (AbstractC1657t.a(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i8 = 26;
                axisValue = axisValue2;
            } else {
                i8 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                P(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, AbstractC1657t.a(motionEvent, 8194));
                if (i8 != 0) {
                    this.f15069C.g(motionEvent, i8);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:31:0x007e  */
    /* JADX WARN: Code duplicated, block: B:33:0x009c  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        boolean z8 = true;
        if (action == 2 && this.f15080k) {
            return true;
        }
        int i8 = action & 255;
        if (i8 == 0) {
            int y8 = (int) motionEvent.getY();
            if (z((int) motionEvent.getX(), y8)) {
                this.f15076g = y8;
                this.f15087r = motionEvent.getPointerId(0);
                A();
                this.f15081l.addMovement(motionEvent);
                this.f15073d.computeScrollOffset();
                if (!Y(motionEvent) && this.f15073d.isFinished()) {
                    z8 = false;
                }
                this.f15080k = z8;
                X(2, 0);
            } else {
                if (!Y(motionEvent) && this.f15073d.isFinished()) {
                    z8 = false;
                }
                this.f15080k = z8;
                L();
            }
        } else if (i8 == 1) {
            this.f15080k = false;
            this.f15087r = -1;
            L();
            if (this.f15073d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else if (i8 == 2) {
            int i9 = this.f15087r;
            if (i9 != -1) {
                int iFindPointerIndex = motionEvent.findPointerIndex(i9);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + i9 + " in onInterceptTouchEvent");
                } else {
                    int y9 = (int) motionEvent.getY(iFindPointerIndex);
                    if (Math.abs(y9 - this.f15076g) > this.f15084o && (2 & getNestedScrollAxes()) == 0) {
                        this.f15080k = true;
                        this.f15076g = y9;
                        C();
                        this.f15081l.addMovement(motionEvent);
                        this.f15090u = 0;
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                }
            }
        } else if (i8 == 3) {
            this.f15080k = false;
            this.f15087r = -1;
            L();
            if (this.f15073d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            Z(0);
        } else if (i8 == 6) {
            I(motionEvent);
        }
        return this.f15080k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        super.onLayout(z8, i8, i9, i10, i11);
        int measuredHeight = 0;
        this.f15077h = false;
        View view = this.f15079j;
        if (view != null && F(view, this)) {
            Q(this.f15079j);
        }
        this.f15079j = null;
        if (!this.f15078i) {
            if (this.f15092w != null) {
                scrollTo(getScrollX(), this.f15092w.f15097a);
                this.f15092w = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iF = f(scrollY, paddingTop, measuredHeight);
            if (iF != scrollY) {
                scrollTo(getScrollX(), iF);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f15078i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i8, int i9) {
        super.onMeasure(i8, i9);
        if (this.f15082m && View.MeasureSpec.getMode(i9) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View view, float f8, float f9, boolean z8) {
        if (z8) {
            return false;
        }
        dispatchNestedFling(0.0f, f9, true);
        v((int) f9);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View view, float f8, float f9) {
        return dispatchNestedPreFling(f8, f9);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedPreScroll(View view, int i8, int i9, int[] iArr) {
        o(view, i8, i9, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScroll(View view, int i8, int i9, int i10, int i11) {
        H(i11, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onNestedScrollAccepted(View view, View view2, int i8) {
        m(view, view2, i8, 0);
    }

    @Override // android.view.View
    public void onOverScrolled(int i8, int i9, boolean z8, boolean z9) {
        super.scrollTo(i8, i9);
    }

    @Override // android.view.ViewGroup
    public boolean onRequestFocusInDescendants(int i8, Rect rect) {
        if (i8 == 2) {
            i8 = 130;
        } else if (i8 == 1) {
            i8 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i8) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i8);
        if (viewFindNextFocus == null || E(viewFindNextFocus)) {
            return false;
        }
        return viewFindNextFocus.requestFocus(i8, rect);
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof e)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        e eVar = (e) parcelable;
        super.onRestoreInstanceState(eVar.getSuperState());
        this.f15092w = eVar;
        requestLayout();
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        e eVar = new e(super.onSaveInstanceState());
        eVar.f15097a = getScrollY();
        return eVar;
    }

    @Override // android.view.View
    public void onScrollChanged(int i8, int i9, int i10, int i11) {
        super.onScrollChanged(i8, i9, i10, i11);
        d dVar = this.f15067A;
        if (dVar != null) {
            dVar.a(this, i8, i9, i10, i11);
        }
    }

    @Override // android.view.View
    public void onSizeChanged(int i8, int i9, int i10, int i11) {
        super.onSizeChanged(i8, i9, i10, i11);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !G(viewFindFocus, 0, i11)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f15072c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f15072c);
        q(g(this.f15072c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onStartNestedScroll(View view, View view2, int i8) {
        return l(view, view2, i8, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onStopNestedScroll(View view) {
        n(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        ViewParent parent;
        C();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f15090u = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f15090u);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f15081l;
                velocityTracker.computeCurrentVelocity(1000, this.f15086q);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f15087r);
                if (Math.abs(yVelocity) >= this.f15085p) {
                    if (!r(yVelocity)) {
                        int i8 = -yVelocity;
                        float f8 = i8;
                        if (!dispatchNestedPreFling(0.0f, f8)) {
                            dispatchNestedFling(0.0f, f8, true);
                            v(i8);
                        }
                    }
                } else if (this.f15073d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f15087r);
                if (iFindPointerIndex == -1) {
                    Log.e("NestedScrollView", "Invalid pointerId=" + this.f15087r + " in onTouchEvent");
                } else {
                    int y8 = (int) motionEvent.getY(iFindPointerIndex);
                    int i9 = this.f15076g - y8;
                    int iM = i9 - M(i9, motionEvent.getX(iFindPointerIndex));
                    if (!this.f15080k && Math.abs(iM) > this.f15084o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f15080k = true;
                        iM = iM > 0 ? iM - this.f15084o : iM + this.f15084o;
                    }
                    if (this.f15080k) {
                        int iP = P(iM, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f15076g = y8 - iP;
                        this.f15090u += iP;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f15080k && getChildCount() > 0 && this.f15073d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                s();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f15076g = (int) motionEvent.getY(actionIndex);
                this.f15087r = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                I(motionEvent);
                this.f15076g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f15087r));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f15080k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f15073d.isFinished()) {
                a();
            }
            D((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f15081l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    public void p(int i8, int i9, int i10, int i11, int[] iArr, int i12, int[] iArr2) {
        this.f15094y.d(i8, i9, i10, i11, iArr, i12, iArr2);
    }

    public final void q(int i8) {
        if (i8 != 0) {
            if (this.f15083n) {
                T(0, i8);
            } else {
                scrollBy(0, i8);
            }
        }
    }

    public final boolean r(int i8) {
        if (p003a2.d.b(this.f15074e) != 0.0f) {
            if (S(this.f15074e, i8)) {
                this.f15074e.onAbsorb(i8);
                return true;
            }
            v(-i8);
            return true;
        }
        if (p003a2.d.b(this.f15075f) == 0.0f) {
            return false;
        }
        int i9 = -i8;
        if (S(this.f15075f, i9)) {
            this.f15075f.onAbsorb(i9);
            return true;
        }
        v(i9);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f15077h) {
            this.f15079j = view2;
        } else {
            Q(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z8) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return R(rect, z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z8) {
        if (z8) {
            L();
        }
        super.requestDisallowInterceptTouchEvent(z8);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f15077h = true;
        super.requestLayout();
    }

    public final void s() {
        this.f15087r = -1;
        this.f15080k = false;
        L();
        Z(0);
        this.f15074e.onRelease();
        this.f15075f.onRelease();
    }

    @Override // android.view.View
    public void scrollTo(int i8, int i9) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iF = f(i8, width, width2);
            int iF2 = f(i9, height, height2);
            if (iF == getScrollX() && iF2 == getScrollY()) {
                return;
            }
            super.scrollTo(iF, iF2);
        }
    }

    public void setFillViewport(boolean z8) {
        if (z8 != this.f15082m) {
            this.f15082m = z8;
            requestLayout();
        }
    }

    @Override // android.view.View
    public void setNestedScrollingEnabled(boolean z8) {
        this.f15094y.k(z8);
    }

    public void setOnScrollChangeListener(d dVar) {
        this.f15067A = dVar;
    }

    public void setSmoothScrollingEnabled(boolean z8) {
        this.f15083n = z8;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View
    public boolean startNestedScroll(int i8) {
        return X(i8, 0);
    }

    @Override // android.view.View
    public void stopNestedScroll() {
        Z(0);
    }

    public boolean t(KeyEvent keyEvent) {
        this.f15072c.setEmpty();
        if (!e()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? w(33) : c(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? w(130) : c(130);
            }
            if (keyCode == 62) {
                K(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return w(33);
            }
            if (keyCode == 93) {
                return w(130);
            }
            if (keyCode == 122) {
                K(33);
                return false;
            }
            if (keyCode == 123) {
                K(130);
                return false;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x004f  */
    public final View u(boolean z8, int i8, int i9) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z9 = false;
        for (int i10 = 0; i10 < size; i10++) {
            View view2 = focusables.get(i10);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i8 < bottom && top < i9) {
                boolean z10 = i8 < top && bottom < i9;
                if (view == null) {
                    view = view2;
                    z9 = z10;
                } else {
                    boolean z11 = (z8 && top < view.getTop()) || (!z8 && bottom > view.getBottom());
                    if (z9) {
                        if (z10 && z11) {
                            view = view2;
                        }
                    } else if (z10) {
                        view = view2;
                        z9 = true;
                    } else if (z11) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    public void v(int i8) {
        if (getChildCount() > 0) {
            this.f15073d.fling(getScrollX(), getScrollY(), 0, i8, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            N(true);
        }
    }

    public boolean w(int i8) {
        int childCount;
        boolean z8 = i8 == 130;
        int height = getHeight();
        Rect rect = this.f15072c;
        rect.top = 0;
        rect.bottom = height;
        if (z8 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f15072c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f15072c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f15072c;
        return O(i8, rect3.top, rect3.bottom);
    }

    public final float x(int i8) {
        double dLog = Math.log((Math.abs(i8) * 0.35f) / (this.f15070a * 0.015f));
        float f8 = f15064D;
        return (float) (((double) (this.f15070a * 0.015f)) * Math.exp((((double) f8) / (((double) f8) - 1.0d)) * dLog));
    }

    public boolean y(int i8) {
        return this.f15094y.i(i8);
    }

    public final boolean z(int i8, int i9) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i9 >= childAt.getTop() - scrollY && i9 < childAt.getBottom() - scrollY && i8 >= childAt.getLeft() && i8 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    public NestedScrollView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, G1.a.f2606c);
    }

    public NestedScrollView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f15072c = new Rect();
        this.f15077h = true;
        this.f15078i = false;
        this.f15079j = null;
        this.f15080k = false;
        this.f15083n = true;
        this.f15087r = -1;
        this.f15088s = new int[2];
        this.f15089t = new int[2];
        c cVar = new c();
        this.f15068B = cVar;
        this.f15069C = new C1648j(getContext(), cVar);
        this.f15074e = p003a2.d.a(context, attributeSet);
        this.f15075f = p003a2.d.a(context, attributeSet);
        this.f15070a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        B();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f15066F, i8, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f15093x = new C1661x(this);
        this.f15094y = new C1658u(this);
        setNestedScrollingEnabled(true);
        I.I(this, f15065E);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8) {
        if (getChildCount() <= 0) {
            super.addView(view, i8);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i8, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i8, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}
