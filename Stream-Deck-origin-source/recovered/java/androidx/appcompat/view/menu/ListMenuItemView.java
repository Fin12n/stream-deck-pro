package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import p117n.X;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements j.a, AbsListView.SelectionBoundsAdjuster {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public g f13583a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ImageView f13584b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public RadioButton f13585c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TextView f13586d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CheckBox f13587e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TextView f13588f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ImageView f13589g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageView f13590h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public LinearLayout f13591i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f13592j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13593k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f13594l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13595m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Drawable f13596n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13597o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public LayoutInflater f13598p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13599q;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p054g.a.f22359E);
    }

    private LayoutInflater getInflater() {
        if (this.f13598p == null) {
            this.f13598p = LayoutInflater.from(getContext());
        }
        return this.f13598p;
    }

    private void setSubMenuArrowVisible(boolean z8) {
        ImageView imageView = this.f13589g;
        if (imageView != null) {
            imageView.setVisibility(z8 ? 0 : 8);
        }
    }

    public final void a(View view) {
        b(view, -1);
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.f13590h;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13590h.getLayoutParams();
        rect.top += this.f13590h.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final void b(View view, int i8) {
        LinearLayout linearLayout = this.f13591i;
        if (linearLayout != null) {
            linearLayout.addView(view, i8);
        } else {
            addView(view, i8);
        }
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void d(g gVar, int i8) {
        this.f13583a = gVar;
        setVisibility(gVar.isVisible() ? 0 : 8);
        setTitle(gVar.i(this));
        setCheckable(gVar.isCheckable());
        h(gVar.A(), gVar.g());
        setIcon(gVar.getIcon());
        setEnabled(gVar.isEnabled());
        setSubMenuArrowVisible(gVar.hasSubMenu());
        setContentDescription(gVar.getContentDescription());
    }

    public final void e() {
        CheckBox checkBox = (CheckBox) getInflater().inflate(p054g.g.f22510h, (ViewGroup) this, false);
        this.f13587e = checkBox;
        a(checkBox);
    }

    public final void f() {
        ImageView imageView = (ImageView) getInflater().inflate(p054g.g.f22511i, (ViewGroup) this, false);
        this.f13584b = imageView;
        b(imageView, 0);
    }

    public final void g() {
        RadioButton radioButton = (RadioButton) getInflater().inflate(p054g.g.f22513k, (ViewGroup) this, false);
        this.f13585c = radioButton;
        a(radioButton);
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f13583a;
    }

    public void h(boolean z8, char c8) {
        int i8 = (z8 && this.f13583a.A()) ? 0 : 8;
        if (i8 == 0) {
            this.f13588f.setText(this.f13583a.h());
        }
        if (this.f13588f.getVisibility() != i8) {
            this.f13588f.setVisibility(i8);
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.f13592j);
        TextView textView = (TextView) findViewById(p054g.f.f22473L);
        this.f13586d = textView;
        int i8 = this.f13593k;
        if (i8 != -1) {
            textView.setTextAppearance(this.f13594l, i8);
        }
        this.f13588f = (TextView) findViewById(p054g.f.f22466E);
        ImageView imageView = (ImageView) findViewById(p054g.f.f22469H);
        this.f13589g = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.f13596n);
        }
        this.f13590h = (ImageView) findViewById(p054g.f.f22494r);
        this.f13591i = (LinearLayout) findViewById(p054g.f.f22488l);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i8, int i9) {
        if (this.f13584b != null && this.f13595m) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.f13584b.getLayoutParams();
            int i10 = layoutParams.height;
            if (i10 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i10;
            }
        }
        super.onMeasure(i8, i9);
    }

    public void setCheckable(boolean z8) {
        CompoundButton compoundButton;
        View view;
        if (!z8 && this.f13585c == null && this.f13587e == null) {
            return;
        }
        if (this.f13583a.m()) {
            if (this.f13585c == null) {
                g();
            }
            compoundButton = this.f13585c;
            view = this.f13587e;
        } else {
            if (this.f13587e == null) {
                e();
            }
            compoundButton = this.f13587e;
            view = this.f13585c;
        }
        if (z8) {
            compoundButton.setChecked(this.f13583a.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view == null || view.getVisibility() == 8) {
                return;
            }
            view.setVisibility(8);
            return;
        }
        CheckBox checkBox = this.f13587e;
        if (checkBox != null) {
            checkBox.setVisibility(8);
        }
        RadioButton radioButton = this.f13585c;
        if (radioButton != null) {
            radioButton.setVisibility(8);
        }
    }

    public void setChecked(boolean z8) {
        CompoundButton compoundButton;
        if (this.f13583a.m()) {
            if (this.f13585c == null) {
                g();
            }
            compoundButton = this.f13585c;
        } else {
            if (this.f13587e == null) {
                e();
            }
            compoundButton = this.f13587e;
        }
        compoundButton.setChecked(z8);
    }

    public void setForceShowIcon(boolean z8) {
        this.f13599q = z8;
        this.f13595m = z8;
    }

    public void setGroupDividerEnabled(boolean z8) {
        ImageView imageView = this.f13590h;
        if (imageView != null) {
            imageView.setVisibility((this.f13597o || !z8) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        boolean z8 = this.f13583a.z() || this.f13599q;
        if (z8 || this.f13595m) {
            ImageView imageView = this.f13584b;
            if (imageView == null && drawable == null && !this.f13595m) {
                return;
            }
            if (imageView == null) {
                f();
            }
            if (drawable == null && !this.f13595m) {
                this.f13584b.setVisibility(8);
                return;
            }
            ImageView imageView2 = this.f13584b;
            if (!z8) {
                drawable = null;
            }
            imageView2.setImageDrawable(drawable);
            if (this.f13584b.getVisibility() != 0) {
                this.f13584b.setVisibility(0);
            }
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (charSequence == null) {
            if (this.f13586d.getVisibility() != 8) {
                this.f13586d.setVisibility(8);
            }
        } else {
            this.f13586d.setText(charSequence);
            if (this.f13586d.getVisibility() != 0) {
                this.f13586d.setVisibility(0);
            }
        }
    }

    public ListMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet);
        X xU = X.u(getContext(), attributeSet, p054g.j.f22618T1, i8, 0);
        this.f13592j = xU.f(p054g.j.f22626V1);
        this.f13593k = xU.m(p054g.j.f22622U1, -1);
        this.f13595m = xU.a(p054g.j.f22630W1, false);
        this.f13594l = context;
        this.f13596n = xU.f(p054g.j.f22634X1);
        TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{R.attr.divider}, p054g.a.f22356B, 0);
        this.f13597o = typedArrayObtainStyledAttributes.hasValue(0);
        xU.w();
        typedArrayObtainStyledAttributes.recycle();
    }
}
