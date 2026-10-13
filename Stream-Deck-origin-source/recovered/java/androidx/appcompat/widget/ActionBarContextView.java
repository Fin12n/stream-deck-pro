package androidx.appcompat.widget;

import U1.I;
import U1.S;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.view.menu.e;
import p054g.f;
import p054g.g;
import p054g.j;
import p117n.AbstractC2699a;
import p117n.X;
import p117n.d0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC2699a {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f13775i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f13776j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public View f13777k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public View f13778l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f13779m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public LinearLayout f13780n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public TextView f13781o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public TextView f13782p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13783q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13784r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13785s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13786t;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p099l.b f13787a;

        public a(p099l.b bVar) {
            this.f13787a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f13787a.c();
        }
    }

    public ActionBarContextView(Context context) {
        this(context, null);
    }

    @Override // p117n.AbstractC2699a
    public /* bridge */ /* synthetic */ S f(int i8, long j8) {
        return super.f(i8, j8);
    }

    public void g() {
        if (this.f13777k == null) {
            k();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // p117n.AbstractC2699a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // p117n.AbstractC2699a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f13776j;
    }

    public CharSequence getTitle() {
        return this.f13775i;
    }

    public void h(p099l.b bVar) {
        View view = this.f13777k;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f13786t, (ViewGroup) this, false);
            this.f13777k = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f13777k);
        }
        View viewFindViewById = this.f13777k.findViewById(f.f22485i);
        this.f13778l = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        e eVar = (e) bVar.e();
        androidx.appcompat.widget.a aVar = this.f30347d;
        if (aVar != null) {
            aVar.y();
        }
        androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(getContext());
        this.f30347d = aVar2;
        aVar2.J(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        eVar.c(this.f30347d, this.f30345b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f30347d.o(this);
        this.f30346c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f30346c, layoutParams);
    }

    public final void i() {
        if (this.f13780n == null) {
            LayoutInflater.from(getContext()).inflate(g.f22503a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f13780n = linearLayout;
            this.f13781o = (TextView) linearLayout.findViewById(f.f22481e);
            this.f13782p = (TextView) this.f13780n.findViewById(f.f22480d);
            if (this.f13783q != 0) {
                this.f13781o.setTextAppearance(getContext(), this.f13783q);
            }
            if (this.f13784r != 0) {
                this.f13782p.setTextAppearance(getContext(), this.f13784r);
            }
        }
        this.f13781o.setText(this.f13775i);
        this.f13782p.setText(this.f13776j);
        boolean zIsEmpty = TextUtils.isEmpty(this.f13775i);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f13776j);
        this.f13782p.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f13780n.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f13780n.getParent() == null) {
            addView(this.f13780n);
        }
    }

    public boolean j() {
        return this.f13785s;
    }

    public void k() {
        removeAllViews();
        this.f13779m = null;
        this.f30346c = null;
        this.f30347d = null;
        View view = this.f13778l;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public boolean l() {
        androidx.appcompat.widget.a aVar = this.f30347d;
        if (aVar != null) {
            return aVar.K();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.f30347d;
        if (aVar != null) {
            aVar.B();
            this.f30347d.C();
        }
    }

    @Override // p117n.AbstractC2699a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        boolean zB = d0.b(this);
        int paddingRight = zB ? (i10 - i8) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i11 - i9) - getPaddingTop()) - getPaddingBottom();
        View view = this.f13777k;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13777k.getLayoutParams();
            int i12 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i13 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iD = AbstractC2699a.d(paddingRight, i12, zB);
            paddingRight = AbstractC2699a.d(iD + e(this.f13777k, iD, paddingTop, paddingTop2, zB), i13, zB);
        }
        int iE = paddingRight;
        LinearLayout linearLayout = this.f13780n;
        if (linearLayout != null && this.f13779m == null && linearLayout.getVisibility() != 8) {
            iE += e(this.f13780n, iE, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f13779m;
        if (view2 != null) {
            e(view2, iE, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i10 - i8) - getPaddingRight();
        ActionMenuView actionMenuView = this.f30346c;
        if (actionMenuView != null) {
            e(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i8, int i9) {
        if (View.MeasureSpec.getMode(i8) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i9) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i8);
        int size2 = this.f30348e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i9);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f13777k;
        if (view != null) {
            int iC = c(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f13777k.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f30346c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = c(this.f30346c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f13780n;
        if (linearLayout != null && this.f13779m == null) {
            if (this.f13785s) {
                this.f13780n.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f13780n.getMeasuredWidth();
                boolean z8 = measuredWidth <= paddingLeft;
                if (z8) {
                    paddingLeft -= measuredWidth;
                }
                this.f13780n.setVisibility(z8 ? 0 : 8);
            } else {
                paddingLeft = c(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f13779m;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i10 = layoutParams.width;
            int i11 = i10 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i10 >= 0) {
                paddingLeft = Math.min(i10, paddingLeft);
            }
            int i12 = layoutParams.height;
            int i13 = i12 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i12 >= 0) {
                iMin = Math.min(i12, iMin);
            }
            this.f13779m.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i11), View.MeasureSpec.makeMeasureSpec(iMin, i13));
        }
        if (this.f30348e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i14 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            int measuredHeight = getChildAt(i15).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i14) {
                i14 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i14);
    }

    @Override // p117n.AbstractC2699a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    @Override // p117n.AbstractC2699a
    public void setContentHeight(int i8) {
        this.f30348e = i8;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f13779m;
        if (view2 != null) {
            removeView(view2);
        }
        this.f13779m = view;
        if (view != null && (linearLayout = this.f13780n) != null) {
            removeView(linearLayout);
            this.f13780n = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f13776j = charSequence;
        i();
    }

    public void setTitle(CharSequence charSequence) {
        this.f13775i = charSequence;
        i();
        I.K(this, charSequence);
    }

    public void setTitleOptional(boolean z8) {
        if (z8 != this.f13785s) {
            requestLayout();
        }
        this.f13785s = z8;
    }

    @Override // p117n.AbstractC2699a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i8) {
        super.setVisibility(i8);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p054g.a.f22381k);
    }

    public ActionBarContextView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        X xU = X.u(context, attributeSet, j.f22764y, i8, 0);
        setBackground(xU.f(j.f22769z));
        this.f13783q = xU.m(j.f22552D, 0);
        this.f13784r = xU.m(j.f22547C, 0);
        this.f30348e = xU.l(j.f22542B, 0);
        this.f13786t = xU.m(j.f22537A, g.f22506d);
        xU.w();
    }
}
