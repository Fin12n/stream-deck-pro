package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import p117n.d0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuView extends androidx.appcompat.widget.b implements androidx.appcompat.view.menu.e.b, j {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public e f13827A;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public androidx.appcompat.view.menu.e f13828p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Context f13829q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13830r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13831s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public androidx.appcompat.widget.a f13832t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public i.a f13833u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public androidx.appcompat.view.menu.e.a f13834v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13835w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public int f13836x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13837y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13838z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        boolean a();

        boolean b();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c extends androidx.appcompat.widget.b.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f13839a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13840b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13841c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13842d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public boolean f13843e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f13844f;

        public c(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public c(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public c(c cVar) {
            super((ViewGroup.LayoutParams) cVar);
            this.f13839a = cVar.f13839a;
        }

        public c(int i8, int i9) {
            super(i8, i9);
            this.f13839a = false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements androidx.appcompat.view.menu.e.a {
        public d() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            e eVar2 = ActionMenuView.this.f13827A;
            return eVar2 != null && eVar2.onMenuItemClick(menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.e.a aVar = ActionMenuView.this.f13834v;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface e {
        boolean onMenuItemClick(MenuItem menuItem);
    }

    public ActionMenuView(Context context) {
        this(context, null);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004c  */
    public static int H(View view, int i8, int i9, int i10, int i11) {
        int i12;
        c cVar = (c) view.getLayoutParams();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10) - i11, View.MeasureSpec.getMode(i10));
        ActionMenuItemView actionMenuItemView = view instanceof ActionMenuItemView ? (ActionMenuItemView) view : null;
        boolean z8 = false;
        boolean z9 = actionMenuItemView != null && actionMenuItemView.s();
        if (i9 > 0) {
            i12 = 2;
            if (!z9 || i9 >= 2) {
                view.measure(View.MeasureSpec.makeMeasureSpec(i9 * i8, Integer.MIN_VALUE), iMakeMeasureSpec);
                int measuredWidth = view.getMeasuredWidth();
                int i13 = measuredWidth / i8;
                if (measuredWidth % i8 != 0) {
                    i13++;
                }
                if (!z9 || i13 >= 2) {
                    i12 = i13;
                }
            } else {
                i12 = 0;
            }
        } else {
            i12 = 0;
        }
        if (!cVar.f13839a && z9) {
            z8 = true;
        }
        cVar.f13842d = z8;
        cVar.f13840b = i12;
        view.measure(View.MeasureSpec.makeMeasureSpec(i8 * i12, 1073741824), iMakeMeasureSpec);
        return i12;
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: A, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams == null) {
            return generateDefaultLayoutParams();
        }
        c cVar = layoutParams instanceof c ? new c((c) layoutParams) : new c(layoutParams);
        if (((LinearLayout.LayoutParams) cVar).gravity <= 0) {
            ((LinearLayout.LayoutParams) cVar).gravity = 16;
        }
        return cVar;
    }

    public c B() {
        c cVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
        cVarGenerateDefaultLayoutParams.f13839a = true;
        return cVarGenerateDefaultLayoutParams;
    }

    public boolean C(int i8) {
        boolean zA = false;
        if (i8 == 0) {
            return false;
        }
        KeyEvent.Callback childAt = getChildAt(i8 - 1);
        KeyEvent.Callback childAt2 = getChildAt(i8);
        if (i8 < getChildCount() && (childAt instanceof a)) {
            zA = ((a) childAt).a();
        }
        return (i8 <= 0 || !(childAt2 instanceof a)) ? zA : ((a) childAt2).b() | zA;
    }

    public boolean D() {
        androidx.appcompat.widget.a aVar = this.f13832t;
        return aVar != null && aVar.B();
    }

    public boolean E() {
        androidx.appcompat.widget.a aVar = this.f13832t;
        return aVar != null && aVar.D();
    }

    public boolean F() {
        androidx.appcompat.widget.a aVar = this.f13832t;
        return aVar != null && aVar.E();
    }

    public boolean G() {
        return this.f13831s;
    }

    /* JADX WARN: Type inference failed for: r3v33 */
    /* JADX WARN: Type inference failed for: r3v34, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v48 */
    public final void I(int i8, int i9) {
        long j8;
        int i10;
        boolean z8;
        ?? r8;
        int i11;
        int mode = View.MeasureSpec.getMode(i9);
        int size = View.MeasureSpec.getSize(i8);
        int size2 = View.MeasureSpec.getSize(i9);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i9, paddingTop, -2);
        int i12 = size - paddingLeft;
        int i13 = this.f13837y;
        int i14 = i12 / i13;
        int i15 = i12 % i13;
        if (i14 == 0) {
            setMeasuredDimension(i12, 0);
            return;
        }
        int i16 = i13 + (i15 / i14);
        int childCount = getChildCount();
        int iMax = 0;
        int i17 = 0;
        boolean z9 = false;
        int i18 = 0;
        int iMax2 = 0;
        int i19 = 0;
        long j9 = 0;
        while (i17 < childCount) {
            View childAt = getChildAt(i17);
            int i20 = size2;
            if (childAt.getVisibility() == 8) {
                i11 = i16;
            } else {
                boolean z10 = childAt instanceof ActionMenuItemView;
                i18++;
                if (z10) {
                    int i21 = this.f13838z;
                    r8 = 0;
                    childAt.setPadding(i21, 0, i21, 0);
                } else {
                    r8 = 0;
                }
                c cVar = (c) childAt.getLayoutParams();
                cVar.f13844f = r8;
                cVar.f13841c = r8;
                cVar.f13840b = r8;
                cVar.f13842d = r8;
                ((LinearLayout.LayoutParams) cVar).leftMargin = r8;
                ((LinearLayout.LayoutParams) cVar).rightMargin = r8;
                cVar.f13843e = z10 && ((ActionMenuItemView) childAt).s();
                int iH = H(childAt, i16, cVar.f13839a ? 1 : i14, childMeasureSpec, paddingTop);
                iMax2 = Math.max(iMax2, iH);
                i11 = i16;
                if (cVar.f13842d) {
                    i19++;
                }
                if (cVar.f13839a) {
                    z9 = true;
                }
                i14 -= iH;
                iMax = Math.max(iMax, childAt.getMeasuredHeight());
                if (iH == 1) {
                    j9 |= (long) (1 << i17);
                }
            }
            i17++;
            size2 = i20;
            i16 = i11;
        }
        int i22 = size2;
        int i23 = i16;
        char c8 = 2;
        boolean z11 = z9 && i18 == 2;
        boolean z12 = false;
        while (true) {
            if (i19 <= 0 || i14 <= 0) {
                j8 = 1;
                break;
            }
            int i24 = Integer.MAX_VALUE;
            long j10 = 0;
            char c9 = c8;
            int i25 = 0;
            int i26 = 0;
            j8 = 1;
            while (i26 < childCount) {
                c cVar2 = (c) getChildAt(i26).getLayoutParams();
                boolean z13 = z11;
                if (cVar2.f13842d) {
                    int i27 = cVar2.f13840b;
                    if (i27 < i24) {
                        j10 = 1 << i26;
                        i24 = i27;
                        i25 = 1;
                    } else if (i27 == i24) {
                        j10 |= 1 << i26;
                        i25++;
                    }
                }
                i26++;
                z11 = z13;
            }
            boolean z14 = z11;
            j9 |= j10;
            if (i25 > i14) {
                break;
            }
            int i28 = i24 + 1;
            int i29 = 0;
            while (i29 < childCount) {
                View childAt2 = getChildAt(i29);
                c cVar3 = (c) childAt2.getLayoutParams();
                long j11 = 1 << i29;
                if ((j10 & j11) == 0) {
                    if (cVar3.f13840b == i28) {
                        j9 |= j11;
                    }
                    i29 = i29;
                } else {
                    if (!z14 || !cVar3.f13843e) {
                        z8 = true;
                    } else if (i14 == 1) {
                        int i30 = this.f13838z;
                        z8 = true;
                        childAt2.setPadding(i30 + i23, 0, i30, 0);
                    } else {
                        z8 = true;
                    }
                    cVar3.f13840b++;
                    cVar3.f13844f = z8;
                    i14--;
                }
                i29++;
            }
            c8 = c9;
            z11 = z14;
            z12 = true;
        }
        boolean z15 = !z9 && i18 == 1;
        if (i14 <= 0 || j9 == 0 || (i14 >= i18 - 1 && !z15 && iMax2 <= 1)) {
            i10 = 0;
        } else {
            float fBitCount = Long.bitCount(j9);
            if (z15) {
                i10 = 0;
            } else {
                if ((j9 & j8) != 0) {
                    i10 = 0;
                    if (!((c) getChildAt(0).getLayoutParams()).f13843e) {
                        fBitCount -= 0.5f;
                    }
                } else {
                    i10 = 0;
                }
                int i31 = childCount - 1;
                if ((j9 & ((long) (1 << i31))) != 0 && !((c) getChildAt(i31).getLayoutParams()).f13843e) {
                    fBitCount -= 0.5f;
                }
            }
            int i32 = fBitCount > 0.0f ? (int) ((i14 * i23) / fBitCount) : i10;
            boolean z16 = z12;
            for (int i33 = i10; i33 < childCount; i33++) {
                if ((j9 & ((long) (1 << i33))) != 0) {
                    View childAt3 = getChildAt(i33);
                    c cVar4 = (c) childAt3.getLayoutParams();
                    if (childAt3 instanceof ActionMenuItemView) {
                        cVar4.f13841c = i32;
                        cVar4.f13844f = true;
                        if (i33 == 0 && !cVar4.f13843e) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = (-i32) / 2;
                        }
                        z16 = true;
                    } else if (cVar4.f13839a) {
                        cVar4.f13841c = i32;
                        cVar4.f13844f = true;
                        ((LinearLayout.LayoutParams) cVar4).rightMargin = (-i32) / 2;
                        z16 = true;
                    } else {
                        if (i33 != 0) {
                            ((LinearLayout.LayoutParams) cVar4).leftMargin = i32 / 2;
                        }
                        if (i33 != childCount - 1) {
                            ((LinearLayout.LayoutParams) cVar4).rightMargin = i32 / 2;
                        }
                    }
                }
            }
            z12 = z16;
        }
        if (z12) {
            for (int i34 = i10; i34 < childCount; i34++) {
                View childAt4 = getChildAt(i34);
                c cVar5 = (c) childAt4.getLayoutParams();
                if (cVar5.f13844f) {
                    childAt4.measure(View.MeasureSpec.makeMeasureSpec((cVar5.f13840b * i23) + cVar5.f13841c, 1073741824), childMeasureSpec);
                }
            }
        }
        setMeasuredDimension(i12, mode != 1073741824 ? iMax : i22);
    }

    public androidx.appcompat.view.menu.e J() {
        return this.f13828p;
    }

    public void K(i.a aVar, androidx.appcompat.view.menu.e.a aVar2) {
        this.f13833u = aVar;
        this.f13834v = aVar2;
    }

    public boolean L() {
        androidx.appcompat.widget.a aVar = this.f13832t;
        return aVar != null && aVar.K();
    }

    @Override // androidx.appcompat.view.menu.e.b
    public boolean a(g gVar) {
        return this.f13828p.M(gVar, 0);
    }

    @Override // androidx.appcompat.view.menu.j
    public void b(androidx.appcompat.view.menu.e eVar) {
        this.f13828p = eVar;
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof c;
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        return false;
    }

    public Menu getMenu() {
        if (this.f13828p == null) {
            Context context = getContext();
            androidx.appcompat.view.menu.e eVar = new androidx.appcompat.view.menu.e(context);
            this.f13828p = eVar;
            eVar.S(new d());
            androidx.appcompat.widget.a aVar = new androidx.appcompat.widget.a(context);
            this.f13832t = aVar;
            aVar.J(true);
            androidx.appcompat.widget.a aVar2 = this.f13832t;
            i.a bVar = this.f13833u;
            if (bVar == null) {
                bVar = new b();
            }
            aVar2.h(bVar);
            this.f13828p.c(this.f13832t, this.f13829q);
            this.f13832t.H(this);
        }
        return this.f13828p;
    }

    public Drawable getOverflowIcon() {
        getMenu();
        return this.f13832t.A();
    }

    public int getPopupTheme() {
        return this.f13830r;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        androidx.appcompat.widget.a aVar = this.f13832t;
        if (aVar != null) {
            aVar.d(false);
            if (this.f13832t.E()) {
                this.f13832t.B();
                this.f13832t.K();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        x();
    }

    @Override // androidx.appcompat.widget.b, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int width;
        int paddingLeft;
        if (!this.f13835w) {
            super.onLayout(z8, i8, i9, i10, i11);
            return;
        }
        int childCount = getChildCount();
        int i12 = (i11 - i9) / 2;
        int dividerWidth = getDividerWidth();
        int i13 = i10 - i8;
        int paddingRight = (i13 - getPaddingRight()) - getPaddingLeft();
        boolean zB = d0.b(this);
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                c cVar = (c) childAt.getLayoutParams();
                if (cVar.f13839a) {
                    int measuredWidth = childAt.getMeasuredWidth();
                    if (C(i16)) {
                        measuredWidth += dividerWidth;
                    }
                    int measuredHeight = childAt.getMeasuredHeight();
                    if (zB) {
                        paddingLeft = getPaddingLeft() + ((LinearLayout.LayoutParams) cVar).leftMargin;
                        width = paddingLeft + measuredWidth;
                    } else {
                        width = (getWidth() - getPaddingRight()) - ((LinearLayout.LayoutParams) cVar).rightMargin;
                        paddingLeft = width - measuredWidth;
                    }
                    int i17 = i12 - (measuredHeight / 2);
                    childAt.layout(paddingLeft, i17, width, measuredHeight + i17);
                    paddingRight -= measuredWidth;
                    i14 = 1;
                } else {
                    paddingRight -= (childAt.getMeasuredWidth() + ((LinearLayout.LayoutParams) cVar).leftMargin) + ((LinearLayout.LayoutParams) cVar).rightMargin;
                    C(i16);
                    i15++;
                }
            }
        }
        if (childCount == 1 && i14 == 0) {
            View childAt2 = getChildAt(0);
            int measuredWidth2 = childAt2.getMeasuredWidth();
            int measuredHeight2 = childAt2.getMeasuredHeight();
            int i18 = (i13 / 2) - (measuredWidth2 / 2);
            int i19 = i12 - (measuredHeight2 / 2);
            childAt2.layout(i18, i19, measuredWidth2 + i18, measuredHeight2 + i19);
            return;
        }
        int i20 = i15 - (i14 ^ 1);
        int iMax = Math.max(0, i20 > 0 ? paddingRight / i20 : 0);
        if (zB) {
            int width2 = getWidth() - getPaddingRight();
            for (int i21 = 0; i21 < childCount; i21++) {
                View childAt3 = getChildAt(i21);
                c cVar2 = (c) childAt3.getLayoutParams();
                if (childAt3.getVisibility() != 8 && !cVar2.f13839a) {
                    int i22 = width2 - ((LinearLayout.LayoutParams) cVar2).rightMargin;
                    int measuredWidth3 = childAt3.getMeasuredWidth();
                    int measuredHeight3 = childAt3.getMeasuredHeight();
                    int i23 = i12 - (measuredHeight3 / 2);
                    childAt3.layout(i22 - measuredWidth3, i23, i22, measuredHeight3 + i23);
                    width2 = i22 - ((measuredWidth3 + ((LinearLayout.LayoutParams) cVar2).leftMargin) + iMax);
                }
            }
            return;
        }
        int paddingLeft2 = getPaddingLeft();
        for (int i24 = 0; i24 < childCount; i24++) {
            View childAt4 = getChildAt(i24);
            c cVar3 = (c) childAt4.getLayoutParams();
            if (childAt4.getVisibility() != 8 && !cVar3.f13839a) {
                int i25 = paddingLeft2 + ((LinearLayout.LayoutParams) cVar3).leftMargin;
                int measuredWidth4 = childAt4.getMeasuredWidth();
                int measuredHeight4 = childAt4.getMeasuredHeight();
                int i26 = i12 - (measuredHeight4 / 2);
                childAt4.layout(i25, i26, i25 + measuredWidth4, measuredHeight4 + i26);
                paddingLeft2 = i25 + measuredWidth4 + ((LinearLayout.LayoutParams) cVar3).rightMargin + iMax;
            }
        }
    }

    @Override // androidx.appcompat.widget.b, android.view.View
    public void onMeasure(int i8, int i9) {
        androidx.appcompat.view.menu.e eVar;
        boolean z8 = this.f13835w;
        boolean z9 = View.MeasureSpec.getMode(i8) == 1073741824;
        this.f13835w = z9;
        if (z8 != z9) {
            this.f13836x = 0;
        }
        int size = View.MeasureSpec.getSize(i8);
        if (this.f13835w && (eVar = this.f13828p) != null && size != this.f13836x) {
            this.f13836x = size;
            eVar.L(true);
        }
        int childCount = getChildCount();
        if (this.f13835w && childCount > 0) {
            I(i8, i9);
            return;
        }
        for (int i10 = 0; i10 < childCount; i10++) {
            c cVar = (c) getChildAt(i10).getLayoutParams();
            ((LinearLayout.LayoutParams) cVar).rightMargin = 0;
            ((LinearLayout.LayoutParams) cVar).leftMargin = 0;
        }
        super.onMeasure(i8, i9);
    }

    public void setExpandedActionViewsExclusive(boolean z8) {
        this.f13832t.G(z8);
    }

    public void setOnMenuItemClickListener(e eVar) {
        this.f13827A = eVar;
    }

    public void setOverflowIcon(Drawable drawable) {
        getMenu();
        this.f13832t.I(drawable);
    }

    public void setOverflowReserved(boolean z8) {
        this.f13831s = z8;
    }

    public void setPopupTheme(int i8) {
        if (this.f13830r != i8) {
            this.f13830r = i8;
            if (i8 == 0) {
                this.f13829q = getContext();
            } else {
                this.f13829q = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setPresenter(androidx.appcompat.widget.a aVar) {
        this.f13832t = aVar;
        aVar.H(this);
    }

    public void x() {
        androidx.appcompat.widget.a aVar = this.f13832t;
        if (aVar != null) {
            aVar.y();
        }
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public c generateDefaultLayoutParams() {
        c cVar = new c(-2, -2);
        ((LinearLayout.LayoutParams) cVar).gravity = 16;
        return cVar;
    }

    @Override // androidx.appcompat.widget.b
    /* JADX INFO: renamed from: z, reason: merged with bridge method [inline-methods] */
    public c generateLayoutParams(AttributeSet attributeSet) {
        return new c(getContext(), attributeSet);
    }

    public ActionMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBaselineAligned(false);
        float f8 = context.getResources().getDisplayMetrics().density;
        this.f13837y = (int) (56.0f * f8);
        this.f13838z = (int) (f8 * 4.0f);
        this.f13829q = context;
        this.f13830r = 0;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b implements i.a {
        @Override // androidx.appcompat.view.menu.i.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z8) {
        }
    }
}
