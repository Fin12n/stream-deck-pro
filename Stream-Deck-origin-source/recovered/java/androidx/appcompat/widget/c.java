package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import android.widget.HorizontalScrollView;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import p117n.C;
import p117n.C2715q;
import p117n.C2723z;
import p117n.X;
import p117n.b0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c extends HorizontalScrollView implements AdapterView.OnItemSelectedListener {

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final Interpolator f14036l = new DecelerateInterpolator();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Runnable f14037a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ViewOnClickListenerC0344c f14038b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public androidx.appcompat.widget.b f14039c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Spinner f14040d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public boolean f14041e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f14042f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f14043g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f14044h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f14045i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ViewPropertyAnimator f14046j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final e f14047k;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ View f14048a;

        public a(View view) {
            this.f14048a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.smoothScrollTo(this.f14048a.getLeft() - ((c.this.getWidth() - this.f14048a.getWidth()) / 2), 0);
            c.this.f14037a = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends BaseAdapter {
        public b() {
        }

        @Override // android.widget.Adapter
        public int getCount() {
            return c.this.f14039c.getChildCount();
        }

        @Override // android.widget.Adapter
        public Object getItem(int i8) {
            return ((d) c.this.f14039c.getChildAt(i8)).b();
        }

        @Override // android.widget.Adapter
        public long getItemId(int i8) {
            return i8;
        }

        @Override // android.widget.Adapter
        public View getView(int i8, View view, ViewGroup viewGroup) {
            if (view == null) {
                return c.this.d((h.a.b) getItem(i8), true);
            }
            ((d) view).a((h.a.b) getItem(i8));
            return view;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.widget.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class ViewOnClickListenerC0344c implements View.OnClickListener {
        public ViewOnClickListenerC0344c() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            ((d) view).b().e();
            int childCount = c.this.f14039c.getChildCount();
            for (int i8 = 0; i8 < childCount; i8++) {
                View childAt = c.this.f14039c.getChildAt(i8);
                childAt.setSelected(childAt == view);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d extends LinearLayout {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final int[] f14052a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public h.a.b f14053b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public TextView f14054c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public ImageView f14055d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public View f14056e;

        public d(Context context, h.a.b bVar, boolean z8) {
            super(context, null, p054g.a.f22375e);
            int[] iArr = {R.attr.background};
            this.f14052a = iArr;
            this.f14053b = bVar;
            X xU = X.u(context, null, iArr, p054g.a.f22375e, 0);
            if (xU.r(0)) {
                setBackgroundDrawable(xU.f(0));
            }
            xU.w();
            if (z8) {
                setGravity(8388627);
            }
            c();
        }

        public void a(h.a.b bVar) {
            this.f14053b = bVar;
            c();
        }

        public h.a.b b() {
            return this.f14053b;
        }

        public void c() {
            h.a.b bVar = this.f14053b;
            View viewB = bVar.b();
            if (viewB != null) {
                ViewParent parent = viewB.getParent();
                if (parent != this) {
                    if (parent != null) {
                        ((ViewGroup) parent).removeView(viewB);
                    }
                    addView(viewB);
                }
                this.f14056e = viewB;
                TextView textView = this.f14054c;
                if (textView != null) {
                    textView.setVisibility(8);
                }
                ImageView imageView = this.f14055d;
                if (imageView != null) {
                    imageView.setVisibility(8);
                    this.f14055d.setImageDrawable(null);
                    return;
                }
                return;
            }
            View view = this.f14056e;
            if (view != null) {
                removeView(view);
                this.f14056e = null;
            }
            Drawable drawableC = bVar.c();
            CharSequence charSequenceD = bVar.d();
            if (drawableC != null) {
                if (this.f14055d == null) {
                    C2715q c2715q = new C2715q(getContext());
                    LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams.gravity = 16;
                    c2715q.setLayoutParams(layoutParams);
                    addView(c2715q, 0);
                    this.f14055d = c2715q;
                }
                this.f14055d.setImageDrawable(drawableC);
                this.f14055d.setVisibility(0);
            } else {
                ImageView imageView2 = this.f14055d;
                if (imageView2 != null) {
                    imageView2.setVisibility(8);
                    this.f14055d.setImageDrawable(null);
                }
            }
            boolean zIsEmpty = TextUtils.isEmpty(charSequenceD);
            if (zIsEmpty) {
                TextView textView2 = this.f14054c;
                if (textView2 != null) {
                    textView2.setVisibility(8);
                    this.f14054c.setText((CharSequence) null);
                }
            } else {
                if (this.f14054c == null) {
                    C c8 = new C(getContext(), null, p054g.a.f22376f);
                    c8.setEllipsize(TextUtils.TruncateAt.END);
                    LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-2, -2);
                    layoutParams2.gravity = 16;
                    c8.setLayoutParams(layoutParams2);
                    addView(c8);
                    this.f14054c = c8;
                }
                this.f14054c.setText(charSequenceD);
                this.f14054c.setVisibility(0);
            }
            ImageView imageView3 = this.f14055d;
            if (imageView3 != null) {
                imageView3.setContentDescription(bVar.a());
            }
            b0.a(this, zIsEmpty ? bVar.a() : null);
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.view.View
        public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
            super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
            accessibilityNodeInfo.setClassName("androidx.appcompat.app.ActionBar$Tab");
        }

        @Override // android.widget.LinearLayout, android.view.View
        public void onMeasure(int i8, int i9) {
            super.onMeasure(i8, i9);
            if (c.this.f14042f > 0) {
                int measuredWidth = getMeasuredWidth();
                int i10 = c.this.f14042f;
                if (measuredWidth > i10) {
                    super.onMeasure(View.MeasureSpec.makeMeasureSpec(i10, 1073741824), i9);
                }
            }
        }

        @Override // android.view.View
        public void setSelected(boolean z8) {
            boolean z9 = isSelected() != z8;
            super.setSelected(z8);
            if (z9 && z8) {
                sendAccessibilityEvent(4);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class e extends AnimatorListenerAdapter {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14058a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f14059b;

        public e() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f14058a = true;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            if (this.f14058a) {
                return;
            }
            c cVar = c.this;
            cVar.f14046j = null;
            cVar.setVisibility(this.f14059b);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            c.this.setVisibility(0);
            this.f14058a = false;
        }
    }

    public c(Context context) {
        super(context);
        this.f14047k = new e();
        setHorizontalScrollBarEnabled(false);
        p099l.a aVarB = p099l.a.b(context);
        setContentHeight(aVarB.f());
        this.f14043g = aVarB.e();
        androidx.appcompat.widget.b bVarC = c();
        this.f14039c = bVarC;
        addView(bVarC, new ViewGroup.LayoutParams(-2, -1));
    }

    public void a(int i8) {
        View childAt = this.f14039c.getChildAt(i8);
        Runnable runnable = this.f14037a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
        a aVar = new a(childAt);
        this.f14037a = aVar;
        post(aVar);
    }

    public final Spinner b() {
        C2723z c2723z = new C2723z(getContext(), null, p054g.a.f22379i);
        c2723z.setLayoutParams(new androidx.appcompat.widget.b.a(-2, -1));
        c2723z.setOnItemSelectedListener(this);
        return c2723z;
    }

    public final androidx.appcompat.widget.b c() {
        androidx.appcompat.widget.b bVar = new androidx.appcompat.widget.b(getContext(), null, p054g.a.f22374d);
        bVar.setMeasureWithLargestChildEnabled(true);
        bVar.setGravity(17);
        bVar.setLayoutParams(new androidx.appcompat.widget.b.a(-2, -1));
        return bVar;
    }

    public d d(h.a.b bVar, boolean z8) {
        d dVar = new d(getContext(), bVar, z8);
        if (z8) {
            dVar.setBackgroundDrawable(null);
            dVar.setLayoutParams(new AbsListView.LayoutParams(-1, this.f14044h));
            return dVar;
        }
        dVar.setFocusable(true);
        if (this.f14038b == null) {
            this.f14038b = new ViewOnClickListenerC0344c();
        }
        dVar.setOnClickListener(this.f14038b);
        return dVar;
    }

    public final boolean e() {
        Spinner spinner = this.f14040d;
        return spinner != null && spinner.getParent() == this;
    }

    public final void f() {
        if (e()) {
            return;
        }
        if (this.f14040d == null) {
            this.f14040d = b();
        }
        removeView(this.f14039c);
        addView(this.f14040d, new ViewGroup.LayoutParams(-2, -1));
        if (this.f14040d.getAdapter() == null) {
            this.f14040d.setAdapter((SpinnerAdapter) new b());
        }
        Runnable runnable = this.f14037a;
        if (runnable != null) {
            removeCallbacks(runnable);
            this.f14037a = null;
        }
        this.f14040d.setSelection(this.f14045i);
    }

    public final boolean g() {
        if (!e()) {
            return false;
        }
        removeView(this.f14040d);
        addView(this.f14039c, new ViewGroup.LayoutParams(-2, -1));
        setTabSelected(this.f14040d.getSelectedItemPosition());
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        Runnable runnable = this.f14037a;
        if (runnable != null) {
            post(runnable);
        }
    }

    @Override // android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        p099l.a aVarB = p099l.a.b(getContext());
        setContentHeight(aVarB.f());
        this.f14043g = aVarB.e();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        Runnable runnable = this.f14037a;
        if (runnable != null) {
            removeCallbacks(runnable);
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onItemSelected(AdapterView adapterView, View view, int i8, long j8) {
        ((d) view).b().e();
    }

    @Override // android.widget.HorizontalScrollView, android.widget.FrameLayout, android.view.View
    public void onMeasure(int i8, int i9) {
        int mode = View.MeasureSpec.getMode(i8);
        boolean z8 = mode == 1073741824;
        setFillViewport(z8);
        int childCount = this.f14039c.getChildCount();
        if (childCount <= 1 || !(mode == 1073741824 || mode == Integer.MIN_VALUE)) {
            this.f14042f = -1;
        } else {
            if (childCount > 2) {
                this.f14042f = (int) (View.MeasureSpec.getSize(i8) * 0.4f);
            } else {
                this.f14042f = View.MeasureSpec.getSize(i8) / 2;
            }
            this.f14042f = Math.min(this.f14042f, this.f14043g);
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(this.f14044h, 1073741824);
        if (z8 || !this.f14041e) {
            g();
        } else {
            this.f14039c.measure(0, iMakeMeasureSpec);
            if (this.f14039c.getMeasuredWidth() > View.MeasureSpec.getSize(i8)) {
                f();
            } else {
                g();
            }
        }
        int measuredWidth = getMeasuredWidth();
        super.onMeasure(i8, iMakeMeasureSpec);
        int measuredWidth2 = getMeasuredWidth();
        if (!z8 || measuredWidth == measuredWidth2) {
            return;
        }
        setTabSelected(this.f14045i);
    }

    public void setAllowCollapse(boolean z8) {
        this.f14041e = z8;
    }

    public void setContentHeight(int i8) {
        this.f14044h = i8;
        requestLayout();
    }

    public void setTabSelected(int i8) {
        this.f14045i = i8;
        int childCount = this.f14039c.getChildCount();
        int i9 = 0;
        while (i9 < childCount) {
            View childAt = this.f14039c.getChildAt(i9);
            boolean z8 = i9 == i8;
            childAt.setSelected(z8);
            if (z8) {
                a(i8);
            }
            i9++;
        }
        Spinner spinner = this.f14040d;
        if (spinner == null || i8 < 0) {
            return;
        }
        spinner.setSelection(i8);
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public void onNothingSelected(AdapterView adapterView) {
    }
}
