package androidx.appcompat.widget;

import U1.AbstractC1651m;
import U1.I;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import p054g.j;
import p117n.X;
import p117n.d0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class b extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f14021a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14022b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f14023c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f14024d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f14025e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14026f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f14027g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14028h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int[] f14029i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int[] f14030j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f14031k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f14032l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f14033m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f14034n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14035o;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends LinearLayout.LayoutParams {
        public a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public a(int i8, int i9) {
            super(i8, i9);
        }

        public a(int i8, int i9, float f8) {
            super(i8, i9, f8);
        }

        public a(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    public b(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    private void h(int i8, int i9) {
        int i10;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i11 = 0;
        while (i11 < i8) {
            View viewO = o(i11);
            if (viewO.getVisibility() != 8) {
                a aVar = (a) viewO.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).width == -1) {
                    int i12 = ((LinearLayout.LayoutParams) aVar).height;
                    ((LinearLayout.LayoutParams) aVar).height = viewO.getMeasuredHeight();
                    i10 = i9;
                    measureChildWithMargins(viewO, iMakeMeasureSpec, 0, i10, 0);
                    ((LinearLayout.LayoutParams) aVar).height = i12;
                } else {
                    i10 = i9;
                }
            } else {
                i10 = i9;
            }
            i11++;
            i9 = i10;
        }
    }

    private void w(View view, int i8, int i9, int i10, int i11) {
        view.layout(i8, i9, i10 + i8, i11 + i9);
    }

    public void c(Canvas canvas) {
        int right;
        int left;
        int i8;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = d0.b(this);
        for (int i9 = 0; i9 < virtualChildCount; i9++) {
            View viewO = o(i9);
            if (viewO != null && viewO.getVisibility() != 8 && p(i9)) {
                a aVar = (a) viewO.getLayoutParams();
                f(canvas, zB ? viewO.getRight() + ((LinearLayout.LayoutParams) aVar).rightMargin : (viewO.getLeft() - ((LinearLayout.LayoutParams) aVar).leftMargin) - this.f14032l);
            }
        }
        if (p(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            if (viewO2 != null) {
                a aVar2 = (a) viewO2.getLayoutParams();
                if (zB) {
                    left = viewO2.getLeft() - ((LinearLayout.LayoutParams) aVar2).leftMargin;
                    i8 = this.f14032l;
                    right = left - i8;
                } else {
                    right = viewO2.getRight() + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i8 = this.f14032l;
                right = left - i8;
            }
            f(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof a;
    }

    public void d(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i8 = 0; i8 < virtualChildCount; i8++) {
            View viewO = o(i8);
            if (viewO != null && viewO.getVisibility() != 8 && p(i8)) {
                e(canvas, (viewO.getTop() - ((LinearLayout.LayoutParams) ((a) viewO.getLayoutParams())).topMargin) - this.f14033m);
            }
        }
        if (p(virtualChildCount)) {
            View viewO2 = o(virtualChildCount - 1);
            e(canvas, viewO2 == null ? (getHeight() - getPaddingBottom()) - this.f14033m : viewO2.getBottom() + ((LinearLayout.LayoutParams) ((a) viewO2.getLayoutParams())).bottomMargin);
        }
    }

    public void e(Canvas canvas, int i8) {
        this.f14031k.setBounds(getPaddingLeft() + this.f14035o, i8, (getWidth() - getPaddingRight()) - this.f14035o, this.f14033m + i8);
        this.f14031k.draw(canvas);
    }

    public void f(Canvas canvas, int i8) {
        this.f14031k.setBounds(i8, getPaddingTop() + this.f14035o, this.f14032l + i8, (getHeight() - getPaddingBottom()) - this.f14035o);
        this.f14031k.draw(canvas);
    }

    /* JADX WARN: Code duplicated, block: B:9:0x0036  */
    public final void g(int i8, int i9) {
        int i10;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i11 = 0;
        while (i11 < i8) {
            View viewO = o(i11);
            if (viewO.getVisibility() != 8) {
                a aVar = (a) viewO.getLayoutParams();
                if (((LinearLayout.LayoutParams) aVar).height == -1) {
                    int i12 = ((LinearLayout.LayoutParams) aVar).width;
                    ((LinearLayout.LayoutParams) aVar).width = viewO.getMeasuredWidth();
                    i10 = i9;
                    measureChildWithMargins(viewO, i10, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) aVar).width = i12;
                } else {
                    i10 = i9;
                }
            } else {
                i10 = i9;
            }
            i11++;
            i9 = i10;
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i8;
        if (this.f14022b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i9 = this.f14022b;
        if (childCount <= i9) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i9);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f14022b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f14023c;
        if (this.f14024d == 1 && (i8 = this.f14025e & 112) != 48) {
            if (i8 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f14026f) / 2;
            } else if (i8 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f14026f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((a) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f14022b;
    }

    public Drawable getDividerDrawable() {
        return this.f14031k;
    }

    public int getDividerPadding() {
        return this.f14035o;
    }

    public int getDividerWidth() {
        return this.f14032l;
    }

    public int getGravity() {
        return this.f14025e;
    }

    public int getOrientation() {
        return this.f14024d;
    }

    public int getShowDividers() {
        return this.f14034n;
    }

    public int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f14027g;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: i, reason: merged with bridge method [inline-methods] */
    public a generateDefaultLayoutParams() {
        int i8 = this.f14024d;
        if (i8 == 0) {
            return new a(-2, -2);
        }
        if (i8 == 1) {
            return new a(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(AttributeSet attributeSet) {
        return new a(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
    public a generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof a) {
            return new a((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new a((ViewGroup.MarginLayoutParams) layoutParams) : new a(layoutParams);
    }

    public int l(View view, int i8) {
        return 0;
    }

    public int m(View view) {
        return 0;
    }

    public int n(View view) {
        return 0;
    }

    public View o(int i8) {
        return getChildAt(i8);
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        if (this.f14031k == null) {
            return;
        }
        if (this.f14024d == 1) {
            d(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        if (this.f14024d == 1) {
            r(i8, i9, i10, i11);
        } else {
            q(i8, i9, i10, i11);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i8, int i9) {
        if (this.f14024d == 1) {
            v(i8, i9);
        } else {
            t(i8, i9);
        }
    }

    public boolean p(int i8) {
        if (i8 == 0) {
            return (this.f14034n & 1) != 0;
        }
        if (i8 == getChildCount()) {
            return (this.f14034n & 4) != 0;
        }
        if ((this.f14034n & 2) != 0) {
            for (int i9 = i8 - 1; i9 >= 0; i9--) {
                if (getChildAt(i9).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:32:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:41:0x00df  */
    /* JADX WARN: Code duplicated, block: B:43:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:44:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:47:0x0100  */
    /* JADX WARN: Code duplicated, block: B:48:0x0105  */
    public void q(int i8, int i9, int i10, int i11) {
        int paddingLeft;
        int i12;
        int i13;
        char c8;
        char c9;
        int i14;
        int iL;
        int i15;
        int baseline;
        int i16;
        int i17;
        int i18;
        int measuredHeight;
        int i19;
        boolean zB = d0.b(this);
        int paddingTop = getPaddingTop();
        int i20 = i11 - i9;
        int paddingBottom = i20 - getPaddingBottom();
        int paddingBottom2 = (i20 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i21 = this.f14025e;
        int i22 = i21 & 112;
        boolean z8 = this.f14021a;
        int[] iArr = this.f14029i;
        int[] iArr2 = this.f14030j;
        int iA = AbstractC1651m.a(8388615 & i21, getLayoutDirection());
        char c10 = 2;
        char c11 = 1;
        if (iA != 1) {
            paddingLeft = iA != 5 ? getPaddingLeft() : ((getPaddingLeft() + i10) - i8) - this.f14026f;
        } else {
            paddingLeft = getPaddingLeft() + (((i10 - i8) - this.f14026f) / 2);
        }
        if (zB) {
            i12 = virtualChildCount - 1;
            i13 = -1;
        } else {
            i12 = 0;
            i13 = 1;
        }
        int i23 = 0;
        while (i23 < virtualChildCount) {
            int i24 = i12 + (i13 * i23);
            int i25 = i23;
            View viewO = o(i24);
            if (viewO == null) {
                paddingLeft += u(i24);
                iL = i25;
                i14 = paddingTop;
                c8 = c10;
                c9 = c11;
            } else {
                c8 = c10;
                c9 = c11;
                if (viewO.getVisibility() != 8) {
                    int measuredWidth = viewO.getMeasuredWidth();
                    int measuredHeight2 = viewO.getMeasuredHeight();
                    a aVar = (a) viewO.getLayoutParams();
                    int i26 = paddingLeft;
                    if (z8) {
                        i15 = measuredHeight2;
                        baseline = ((LinearLayout.LayoutParams) aVar).height != -1 ? viewO.getBaseline() : -1;
                        i16 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i16 < 0) {
                            i16 = i22;
                        }
                        i17 = i16 & 112;
                        i14 = paddingTop;
                        if (i17 != 16) {
                            if (i17 != 48) {
                                i18 = i14 + ((LinearLayout.LayoutParams) aVar).topMargin;
                                if (baseline != -1) {
                                    i18 += iArr[c9] - baseline;
                                }
                            } else if (i17 != 80) {
                                i18 = i14;
                            } else {
                                i18 = (paddingBottom - i15) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c8] - (viewO.getMeasuredHeight() - baseline);
                                }
                            }
                            if (p(i24)) {
                                i19 = i26 + this.f14032l;
                            } else {
                                i19 = i26;
                            }
                            int i27 = ((LinearLayout.LayoutParams) aVar).leftMargin + i19;
                            w(viewO, m(viewO) + i27, i18, measuredWidth, i15);
                            int iN = i27 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + n(viewO);
                            iL = l(viewO, i24) + i25;
                            paddingLeft = iN;
                        } else {
                            i18 = i14 + ((paddingBottom2 - i15) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                        }
                        i18 -= measuredHeight;
                        if (p(i24)) {
                            i19 = i26 + this.f14032l;
                        } else {
                            i19 = i26;
                        }
                        int i28 = ((LinearLayout.LayoutParams) aVar).leftMargin + i19;
                        w(viewO, m(viewO) + i28, i18, measuredWidth, i15);
                        int iN2 = i28 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + n(viewO);
                        iL = l(viewO, i24) + i25;
                        paddingLeft = iN2;
                    } else {
                        i15 = measuredHeight2;
                    }
                    i16 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i16 < 0) {
                        i16 = i22;
                    }
                    i17 = i16 & 112;
                    i14 = paddingTop;
                    if (i17 != 16) {
                        if (i17 != 48) {
                            i18 = i14 + ((LinearLayout.LayoutParams) aVar).topMargin;
                            if (baseline != -1) {
                                i18 += iArr[c9] - baseline;
                            }
                        } else if (i17 != 80) {
                            i18 = i14;
                        } else {
                            i18 = (paddingBottom - i15) - ((LinearLayout.LayoutParams) aVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c8] - (viewO.getMeasuredHeight() - baseline);
                            }
                        }
                        if (p(i24)) {
                            i19 = i26 + this.f14032l;
                        } else {
                            i19 = i26;
                        }
                        int i29 = ((LinearLayout.LayoutParams) aVar).leftMargin + i19;
                        w(viewO, m(viewO) + i29, i18, measuredWidth, i15);
                        int iN3 = i29 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + n(viewO);
                        iL = l(viewO, i24) + i25;
                        paddingLeft = iN3;
                    } else {
                        i18 = i14 + ((paddingBottom2 - i15) / 2) + ((LinearLayout.LayoutParams) aVar).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    }
                    i18 -= measuredHeight;
                    if (p(i24)) {
                        i19 = i26 + this.f14032l;
                    } else {
                        i19 = i26;
                    }
                    int i210 = ((LinearLayout.LayoutParams) aVar).leftMargin + i19;
                    w(viewO, m(viewO) + i210, i18, measuredWidth, i15);
                    int iN4 = i210 + ((LinearLayout.LayoutParams) aVar).rightMargin + measuredWidth + n(viewO);
                    iL = l(viewO, i24) + i25;
                    paddingLeft = iN4;
                } else {
                    i14 = paddingTop;
                    iL = i25;
                }
            }
            i23 = iL + 1;
            c10 = c8;
            c11 = c9;
            paddingTop = i14;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x0099  */
    public void r(int i8, int i9, int i10, int i11) {
        int paddingTop;
        int i12;
        int i13;
        int i14;
        int paddingLeft = getPaddingLeft();
        int i15 = i10 - i8;
        int paddingRight = i15 - getPaddingRight();
        int paddingRight2 = (i15 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i16 = this.f14025e;
        int i17 = i16 & 112;
        int i18 = i16 & 8388615;
        if (i17 != 16) {
            paddingTop = i17 != 80 ? getPaddingTop() : ((getPaddingTop() + i11) - i9) - this.f14026f;
        } else {
            paddingTop = getPaddingTop() + (((i11 - i9) - this.f14026f) / 2);
        }
        int iL = 0;
        while (iL < virtualChildCount) {
            View viewO = o(iL);
            if (viewO == null) {
                paddingTop += u(iL);
            } else {
                if (viewO.getVisibility() != 8) {
                    int measuredWidth = viewO.getMeasuredWidth();
                    int measuredHeight = viewO.getMeasuredHeight();
                    a aVar = (a) viewO.getLayoutParams();
                    int i19 = ((LinearLayout.LayoutParams) aVar).gravity;
                    if (i19 < 0) {
                        i19 = i18;
                    }
                    int iA = AbstractC1651m.a(i19, getLayoutDirection()) & 7;
                    if (iA != 1) {
                        if (iA != 5) {
                            i14 = ((LinearLayout.LayoutParams) aVar).leftMargin + paddingLeft;
                        } else {
                            i12 = paddingRight - measuredWidth;
                            i13 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                        }
                        int i20 = i14;
                        if (p(iL)) {
                            paddingTop += this.f14033m;
                        }
                        int i21 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                        w(viewO, i20, i21 + m(viewO), measuredWidth, measuredHeight);
                        paddingTop = i21 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + n(viewO);
                        iL += l(viewO, iL);
                    } else {
                        i12 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) aVar).leftMargin;
                        i13 = ((LinearLayout.LayoutParams) aVar).rightMargin;
                    }
                    i14 = i12 - i13;
                    int i22 = i14;
                    if (p(iL)) {
                        paddingTop += this.f14033m;
                    }
                    int i23 = paddingTop + ((LinearLayout.LayoutParams) aVar).topMargin;
                    w(viewO, i22, i23 + m(viewO), measuredWidth, measuredHeight);
                    paddingTop = i23 + measuredHeight + ((LinearLayout.LayoutParams) aVar).bottomMargin + n(viewO);
                    iL += l(viewO, iL);
                }
                iL++;
            }
            iL++;
        }
    }

    public void s(View view, int i8, int i9, int i10, int i11, int i12) {
        measureChildWithMargins(view, i9, i10, i11, i12);
    }

    public void setBaselineAligned(boolean z8) {
        this.f14021a = z8;
    }

    public void setBaselineAlignedChildIndex(int i8) {
        if (i8 >= 0 && i8 < getChildCount()) {
            this.f14022b = i8;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f14031k) {
            return;
        }
        this.f14031k = drawable;
        if (drawable != null) {
            this.f14032l = drawable.getIntrinsicWidth();
            this.f14033m = drawable.getIntrinsicHeight();
        } else {
            this.f14032l = 0;
            this.f14033m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i8) {
        this.f14035o = i8;
    }

    public void setGravity(int i8) {
        if (this.f14025e != i8) {
            if ((8388615 & i8) == 0) {
                i8 |= 8388611;
            }
            if ((i8 & 112) == 0) {
                i8 |= 48;
            }
            this.f14025e = i8;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i8) {
        int i9 = i8 & 8388615;
        int i10 = this.f14025e;
        if ((8388615 & i10) != i9) {
            this.f14025e = i9 | ((-8388616) & i10);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z8) {
        this.f14028h = z8;
    }

    public void setOrientation(int i8) {
        if (this.f14024d != i8) {
            this.f14024d = i8;
            requestLayout();
        }
    }

    public void setShowDividers(int i8) {
        if (i8 != this.f14034n) {
            requestLayout();
        }
        this.f14034n = i8;
    }

    public void setVerticalGravity(int i8) {
        int i9 = i8 & 112;
        int i10 = this.f14025e;
        if ((i10 & 112) != i9) {
            this.f14025e = i9 | (i10 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f8) {
        this.f14027g = Math.max(0.0f, f8);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0461  */
    public void t(int i8, int i9) {
        int i10;
        int i11;
        float f8;
        int i12;
        int i13;
        int i14;
        int i15;
        int iMax;
        int i16;
        int baseline;
        int i17;
        int i18;
        byte b8;
        int i19;
        int i20;
        int i21;
        boolean z8;
        View view;
        boolean z9;
        int baseline2;
        this.f14026f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        if (this.f14029i == null || this.f14030j == null) {
            this.f14029i = new int[4];
            this.f14030j = new int[4];
        }
        int[] iArr = this.f14029i;
        int[] iArr2 = this.f14030j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z10 = this.f14021a;
        boolean z11 = this.f14028h;
        int i22 = 1073741824;
        boolean z12 = mode == 1073741824;
        boolean z13 = z11;
        int iL = 0;
        int i23 = 0;
        int iMax2 = 0;
        boolean z14 = false;
        int iCombineMeasuredStates = 0;
        boolean z15 = false;
        boolean z16 = true;
        float f9 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i10 = i23;
            if (iL >= virtualChildCount) {
                break;
            }
            boolean z17 = z10;
            View viewO = o(iL);
            if (viewO == null) {
                this.f14026f += u(iL);
            } else {
                if (viewO.getVisibility() == 8) {
                    iL += l(viewO, iL);
                } else {
                    if (p(iL)) {
                        this.f14026f += this.f14032l;
                    }
                    a aVar = (a) viewO.getLayoutParams();
                    float f10 = ((LinearLayout.LayoutParams) aVar).weight;
                    float f11 = f9 + f10;
                    if (mode == i22 && ((LinearLayout.LayoutParams) aVar).width == 0 && f10 > 0.0f) {
                        if (z12) {
                            this.f14026f += ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin;
                        } else {
                            int i24 = this.f14026f;
                            this.f14026f = Math.max(i24, ((LinearLayout.LayoutParams) aVar).leftMargin + i24 + ((LinearLayout.LayoutParams) aVar).rightMargin);
                        }
                        if (z17) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewO.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z14 = true;
                        }
                        i20 = i10;
                        i21 = 1073741824;
                        z8 = z13;
                        view = viewO;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar).width != 0 || f10 <= 0.0f) {
                            b8 = -2;
                            i19 = Integer.MIN_VALUE;
                        } else {
                            b8 = -2;
                            ((LinearLayout.LayoutParams) aVar).width = -2;
                            i19 = 0;
                        }
                        virtualChildCount = virtualChildCount;
                        mode = mode;
                        iArr = iArr;
                        i20 = i10;
                        i21 = 1073741824;
                        z8 = z13;
                        iArr2 = iArr2;
                        int i25 = i19;
                        s(viewO, iL, i8, f11 == 0.0f ? this.f14026f : 0, i9, 0);
                        view = viewO;
                        if (i25 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar).width = i25;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        if (z12) {
                            this.f14026f += ((LinearLayout.LayoutParams) aVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) aVar).rightMargin + n(view);
                        } else {
                            int i26 = this.f14026f;
                            this.f14026f = Math.max(i26, i26 + measuredWidth + ((LinearLayout.LayoutParams) aVar).leftMargin + ((LinearLayout.LayoutParams) aVar).rightMargin + n(view));
                        }
                        if (z8) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    if (mode2 == i21 || ((LinearLayout.LayoutParams) aVar).height != -1) {
                        z9 = false;
                    } else {
                        z9 = true;
                        z15 = true;
                    }
                    int i27 = ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin;
                    int measuredHeight = view.getMeasuredHeight() + i27;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z17 && (baseline2 = view.getBaseline()) != -1) {
                        int i28 = ((LinearLayout.LayoutParams) aVar).gravity;
                        if (i28 < 0) {
                            i28 = this.f14025e;
                        }
                        int i29 = (((i28 & 112) >> 4) & (-2)) >> 1;
                        iArr[i29] = Math.max(iArr[i29], baseline2);
                        iArr2[i29] = Math.max(iArr2[i29], measuredHeight - baseline2);
                    }
                    int iMax5 = Math.max(i20, measuredHeight);
                    z16 = z16 && ((LinearLayout.LayoutParams) aVar).height == -1;
                    if (((LinearLayout.LayoutParams) aVar).weight > 0.0f) {
                        if (!z9) {
                            i27 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i27);
                    } else {
                        if (z9 == 0) {
                            i27 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i27);
                    }
                    iL += l(view, iL);
                    i23 = iMax5;
                    f9 = f11;
                }
                iL++;
                z13 = z8;
                iArr2 = iArr2;
                z10 = z17;
                mode = mode;
                iArr = iArr;
                virtualChildCount = virtualChildCount;
                i22 = 1073741824;
            }
            virtualChildCount = virtualChildCount;
            mode = mode;
            iArr = iArr;
            iArr2 = iArr2;
            i23 = i10;
            z8 = z13;
            iL++;
            z13 = z8;
            iArr2 = iArr2;
            z10 = z17;
            mode = mode;
            iArr = iArr;
            virtualChildCount = virtualChildCount;
            i22 = 1073741824;
        }
        boolean z18 = z10;
        int i30 = virtualChildCount;
        int i31 = mode;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i32 = iCombineMeasuredStates;
        boolean z19 = z13;
        if (this.f14026f > 0) {
            i11 = i30;
            if (p(i11)) {
                this.f14026f += this.f14032l;
            }
        } else {
            i11 = i30;
        }
        int i33 = iArr3[1];
        int iMax6 = (i33 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? i10 : Math.max(i10, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i33, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
        if (z19) {
            i12 = i31;
            if (i12 == Integer.MIN_VALUE || i12 == 0) {
                this.f14026f = 0;
                int iL2 = 0;
                while (iL2 < i11) {
                    View viewO2 = o(iL2);
                    if (viewO2 == null) {
                        this.f14026f += u(iL2);
                    } else {
                        if (viewO2.getVisibility() == 8) {
                            iL2 += l(viewO2, iL2);
                        } else {
                            a aVar2 = (a) viewO2.getLayoutParams();
                            if (z12) {
                                this.f14026f += ((LinearLayout.LayoutParams) aVar2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) aVar2).rightMargin + n(viewO2);
                            } else {
                                f9 = f9;
                                int i34 = this.f14026f;
                                this.f14026f = Math.max(i34, i34 + iMax2 + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin + n(viewO2));
                            }
                        }
                        iL2++;
                        f9 = f9;
                        iMax6 = iMax6;
                    }
                    iL2++;
                    f9 = f9;
                    iMax6 = iMax6;
                }
            }
            f8 = f9;
        } else {
            f8 = f9;
            i12 = i31;
        }
        int iMax7 = iMax6;
        int paddingLeft = this.f14026f + getPaddingLeft() + getPaddingRight();
        this.f14026f = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i8, 0);
        int i35 = (16777215 & iResolveSizeAndState) - this.f14026f;
        if (z14 || (i35 != 0 && f8 > 0.0f)) {
            float f12 = this.f14027g;
            if (f12 > 0.0f) {
                f8 = f12;
            }
            iArr3[3] = -1;
            iArr3[2] = -1;
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[3] = -1;
            iArr4[2] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            this.f14026f = 0;
            int iCombineMeasuredStates2 = i32;
            int iMax8 = -1;
            int i36 = 0;
            while (i36 < i11) {
                View viewO3 = o(i36);
                if (viewO3 == null || viewO3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    a aVar3 = (a) viewO3.getLayoutParams();
                    float f13 = ((LinearLayout.LayoutParams) aVar3).weight;
                    if (f13 > 0.0f) {
                        int i37 = (int) ((i35 * f13) / f8);
                        f8 -= f13;
                        i35 -= i37;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin, ((LinearLayout.LayoutParams) aVar3).height);
                        if (((LinearLayout.LayoutParams) aVar3).width == 0) {
                            i18 = 1073741824;
                            if (i12 == 1073741824) {
                                if (i37 <= 0) {
                                    i37 = 0;
                                }
                                viewO3.measure(View.MeasureSpec.makeMeasureSpec(i37, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewO3.getMeasuredState() & (-16777216));
                        } else {
                            i18 = 1073741824;
                        }
                        int measuredWidth2 = viewO3.getMeasuredWidth() + i37;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewO3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i18), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewO3.getMeasuredState() & (-16777216));
                    }
                    if (z12) {
                        this.f14026f += viewO3.getMeasuredWidth() + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + n(viewO3);
                    } else {
                        int i38 = this.f14026f;
                        this.f14026f = Math.max(i38, viewO3.getMeasuredWidth() + i38 + ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin + n(viewO3));
                    }
                    boolean z20 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == -1;
                    int i39 = ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin;
                    int measuredHeight2 = viewO3.getMeasuredHeight() + i39;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z20) {
                        i39 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax3, i39);
                    if (z16) {
                        i16 = -1;
                        boolean z21 = ((LinearLayout.LayoutParams) aVar3).height == -1;
                        if (z18 && (baseline = viewO3.getBaseline()) != i16) {
                            i17 = ((LinearLayout.LayoutParams) aVar3).gravity;
                            if (i17 < 0) {
                                i17 = this.f14025e;
                            }
                            int i40 = (((i17 & 112) >> 4) & (-2)) >> 1;
                            iArr3[i40] = Math.max(iArr3[i40], baseline);
                            iArr4[i40] = Math.max(iArr4[i40], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax9;
                        z16 = z21;
                    } else {
                        i16 = -1;
                    }
                    if (z18) {
                        i17 = ((LinearLayout.LayoutParams) aVar3).gravity;
                        if (i17 < 0) {
                            i17 = this.f14025e;
                        }
                        int i41 = (((i17 & 112) >> 4) & (-2)) >> 1;
                        iArr3[i41] = Math.max(iArr3[i41], baseline);
                        iArr4[i41] = Math.max(iArr4[i41], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax9;
                    z16 = z21;
                }
                i36++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i13 = iResolveSizeAndState;
            i14 = -16777216;
            this.f14026f += getPaddingLeft() + getPaddingRight();
            int i42 = iArr3[1];
            iMax7 = (i42 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i42, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
            i15 = iCombineMeasuredStates2;
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z19 && i12 != 1073741824) {
                for (int i43 = 0; i43 < i11; i43++) {
                    View viewO4 = o(i43);
                    if (viewO4 != null && viewO4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewO4.getLayoutParams())).weight > 0.0f) {
                        viewO4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(viewO4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i13 = iResolveSizeAndState;
            i15 = i32;
            i14 = -16777216;
        }
        if (z16 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(i13 | (i15 & i14), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, i15 << 16));
        if (z15) {
            g(i11, i8);
        }
    }

    public int u(int i8) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0156 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0159  */
    /* JADX WARN: Code duplicated, block: B:68:0x0160 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x0163  */
    public void v(int i8, int i9) {
        int i10;
        int iMax;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        View view;
        boolean z8;
        int iMax2;
        boolean z9;
        int iMax3;
        int i20;
        this.f14026f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        int i21 = this.f14022b;
        boolean z10 = this.f14028h;
        int iL = 0;
        int i22 = 0;
        int iMax4 = 0;
        int i23 = 0;
        int i24 = 0;
        int iMax5 = 0;
        boolean z11 = false;
        boolean z12 = false;
        float f8 = 0.0f;
        boolean z13 = true;
        while (true) {
            int i25 = 8;
            if (iL >= virtualChildCount) {
                float f9 = f8;
                int i26 = i22;
                int i27 = virtualChildCount;
                int i28 = mode2;
                boolean z14 = z10;
                int i29 = iMax4;
                int iMax6 = i23;
                int iCombineMeasuredStates = i24;
                if (this.f14026f > 0) {
                    i10 = i27;
                    if (p(i10)) {
                        this.f14026f += this.f14033m;
                    }
                } else {
                    i10 = i27;
                }
                int i30 = i28;
                if (z14 && (i30 == Integer.MIN_VALUE || i30 == 0)) {
                    this.f14026f = 0;
                    int iL2 = 0;
                    while (iL2 < i10) {
                        View viewO = o(iL2);
                        if (viewO == null) {
                            this.f14026f += u(iL2);
                        } else if (viewO.getVisibility() == i25) {
                            iL2 += l(viewO, iL2);
                        } else {
                            a aVar = (a) viewO.getLayoutParams();
                            int i31 = this.f14026f;
                            this.f14026f = Math.max(i31, i31 + i29 + ((LinearLayout.LayoutParams) aVar).topMargin + ((LinearLayout.LayoutParams) aVar).bottomMargin + n(viewO));
                        }
                        iL2++;
                        i25 = 8;
                    }
                }
                int paddingTop = this.f14026f + getPaddingTop() + getPaddingBottom();
                this.f14026f = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i9, 0);
                int i32 = (16777215 & iResolveSizeAndState) - this.f14026f;
                if (z11 || (i32 != 0 && f9 > 0.0f)) {
                    float f10 = this.f14027g;
                    if (f10 <= 0.0f) {
                        f10 = f9;
                    }
                    this.f14026f = 0;
                    float f11 = f10;
                    int i33 = i32;
                    int i34 = 0;
                    while (i34 < i10) {
                        View viewO2 = o(i34);
                        if (viewO2.getVisibility() == 8) {
                            i30 = i30;
                            i34 = i34;
                        } else {
                            a aVar2 = (a) viewO2.getLayoutParams();
                            float f12 = ((LinearLayout.LayoutParams) aVar2).weight;
                            if (f12 > 0.0f) {
                                int i35 = (int) ((i33 * f12) / f11);
                                f11 -= f12;
                                i33 -= i35;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin, ((LinearLayout.LayoutParams) aVar2).width);
                                if (((LinearLayout.LayoutParams) aVar2).height == 0) {
                                    i12 = 1073741824;
                                    if (i30 == 1073741824) {
                                        viewO2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i35 > 0 ? i35 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewO2.getMeasuredState() & (-256));
                                } else {
                                    i12 = 1073741824;
                                }
                                int measuredHeight = viewO2.getMeasuredHeight() + i35;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewO2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i12));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewO2.getMeasuredState() & (-256));
                            } else {
                                i30 = i30;
                            }
                            int i36 = ((LinearLayout.LayoutParams) aVar2).leftMargin + ((LinearLayout.LayoutParams) aVar2).rightMargin;
                            int measuredWidth = viewO2.getMeasuredWidth() + i36;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i11 = -1;
                                if (((LinearLayout.LayoutParams) aVar2).width == -1) {
                                    measuredWidth = i36;
                                }
                            } else {
                                i11 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z15 = z13 && ((LinearLayout.LayoutParams) aVar2).width == i11;
                            int i37 = this.f14026f;
                            this.f14026f = Math.max(i37, i37 + viewO2.getMeasuredHeight() + ((LinearLayout.LayoutParams) aVar2).topMargin + ((LinearLayout.LayoutParams) aVar2).bottomMargin + n(viewO2));
                            iMax5 = iMax7;
                            z13 = z15;
                        }
                        i34++;
                        i30 = i30;
                    }
                    this.f14026f += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i26);
                    if (z14 && i30 != 1073741824) {
                        for (int i38 = 0; i38 < i10; i38++) {
                            View viewO3 = o(i38);
                            if (viewO3 != null && viewO3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((a) viewO3.getLayoutParams())).weight > 0.0f) {
                                viewO3.measure(View.MeasureSpec.makeMeasureSpec(viewO3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i29, 1073741824));
                            }
                        }
                    }
                }
                if (!z13 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i8, iCombineMeasuredStates), iResolveSizeAndState);
                if (z12) {
                    h(i10, i9);
                    return;
                }
                return;
            }
            float f13 = f8;
            View viewO4 = o(iL);
            if (viewO4 == null) {
                this.f14026f += u(iL);
            } else {
                if (viewO4.getVisibility() == 8) {
                    iL += l(viewO4, iL);
                } else {
                    if (p(iL)) {
                        this.f14026f += this.f14033m;
                    }
                    a aVar3 = (a) viewO4.getLayoutParams();
                    float f14 = ((LinearLayout.LayoutParams) aVar3).weight;
                    float f15 = f13 + f14;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) aVar3).height == 0 && f14 > 0.0f) {
                        int i39 = this.f14026f;
                        this.f14026f = Math.max(i39, ((LinearLayout.LayoutParams) aVar3).topMargin + i39 + ((LinearLayout.LayoutParams) aVar3).bottomMargin);
                        iMax2 = i22;
                        i16 = virtualChildCount;
                        i17 = mode2;
                        z11 = true;
                        i19 = i23;
                        i18 = i24;
                        z8 = z10;
                    } else {
                        if (((LinearLayout.LayoutParams) aVar3).height != 0 || f14 <= 0.0f) {
                            i13 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) aVar3).height = -2;
                            i13 = 0;
                        }
                        if (f15 == 0.0f) {
                            int i40 = i24;
                            i15 = this.f14026f;
                            i14 = i40;
                        } else {
                            i14 = i24;
                            i15 = 0;
                        }
                        int i41 = iMax4;
                        i16 = virtualChildCount;
                        i17 = mode2;
                        i18 = i14;
                        i19 = i23;
                        view = viewO4;
                        z8 = z10;
                        iMax2 = i22;
                        s(view, iL, i8, 0, i9, i15);
                        if (i13 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) aVar3).height = i13;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i42 = this.f14026f;
                        this.f14026f = Math.max(i42, i42 + measuredHeight2 + ((LinearLayout.LayoutParams) aVar3).topMargin + ((LinearLayout.LayoutParams) aVar3).bottomMargin + n(view));
                        iMax4 = z8 ? Math.max(measuredHeight2, i41) : i41;
                    }
                    if (i21 >= 0 && i21 == iL + 1) {
                        view = viewO4;
                        this.f14023c = this.f14026f;
                    }
                    if (iL < i21 && ((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) aVar3).width != -1) {
                        z9 = false;
                    } else {
                        z9 = true;
                        z12 = true;
                    }
                    int i43 = ((LinearLayout.LayoutParams) aVar3).leftMargin + ((LinearLayout.LayoutParams) aVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i43;
                    iMax3 = Math.max(i19, measuredWidth2);
                    int i44 = iMax4;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i18, view.getMeasuredState());
                    if (z13) {
                        i20 = iCombineMeasuredStates2;
                        z13 = ((LinearLayout.LayoutParams) aVar3).width == -1;
                        if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                            if (!z9) {
                                i43 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i43);
                        } else {
                            if (!z9) {
                                i43 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i43);
                        }
                        iL += l(view, iL);
                        f8 = f15;
                        iMax4 = i44;
                        i24 = i20;
                    } else {
                        i20 = iCombineMeasuredStates2;
                    }
                    if (((LinearLayout.LayoutParams) aVar3).weight > 0.0f) {
                        if (!z9) {
                            i43 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i43);
                    } else {
                        if (!z9) {
                            i43 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i43);
                    }
                    iL += l(view, iL);
                    f8 = f15;
                    iMax4 = i44;
                    i24 = i20;
                }
                iL++;
                i23 = iMax3;
                i22 = iMax2;
                z10 = z8;
                mode2 = i17;
                virtualChildCount = i16;
            }
            iMax2 = i22;
            i16 = virtualChildCount;
            i17 = mode2;
            z8 = z10;
            f8 = f13;
            iMax3 = i23;
            iL++;
            i23 = iMax3;
            i22 = iMax2;
            z10 = z8;
            mode2 = i17;
            virtualChildCount = i16;
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public b(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f14021a = true;
        this.f14022b = -1;
        this.f14023c = 0;
        this.f14025e = 8388659;
        X xU = X.u(context, attributeSet, j.f22646a1, i8, 0);
        I.G(this, context, j.f22646a1, attributeSet, xU.q(), i8, 0);
        int iJ = xU.j(j.f22656c1, -1);
        if (iJ >= 0) {
            setOrientation(iJ);
        }
        int iJ2 = xU.j(j.f22651b1, -1);
        if (iJ2 >= 0) {
            setGravity(iJ2);
        }
        boolean zA = xU.a(j.f22661d1, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f14027g = xU.h(j.f22671f1, -1.0f);
        this.f14022b = xU.j(j.f22666e1, -1);
        this.f14028h = xU.a(j.f22686i1, false);
        setDividerDrawable(xU.f(j.f22676g1));
        this.f14034n = xU.j(j.f22691j1, 0);
        this.f14035o = xU.e(j.f22681h1, 0);
        xU.w();
    }
}
