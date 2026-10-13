package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.ActionMenuView;
import p117n.C;
import p117n.K;
import p117n.b0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ActionMenuItemView extends C implements j.a, View.OnClickListener, ActionMenuView.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public g f13568h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f13569i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Drawable f13570j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public e.b f13571k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public K f13572l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public b f13573m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13574n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f13575o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13576p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13577q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13578r;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends K {
        public a() {
            super(ActionMenuItemView.this);
        }

        @Override // p117n.K
        public p108m.f b() {
            b bVar = ActionMenuItemView.this.f13573m;
            if (bVar != null) {
                return bVar.a();
            }
            return null;
        }

        @Override // p117n.K
        public boolean c() {
            p108m.f fVarB;
            ActionMenuItemView actionMenuItemView = ActionMenuItemView.this;
            e.b bVar = actionMenuItemView.f13571k;
            return bVar != null && bVar.a(actionMenuItemView.f13568h) && (fVarB = b()) != null && fVarB.a();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class b {
        public abstract p108m.f a();
    }

    public ActionMenuItemView(Context context) {
        this(context, null);
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean a() {
        return s();
    }

    @Override // androidx.appcompat.widget.ActionMenuView.a
    public boolean b() {
        return s() && this.f13568h.getIcon() == null;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public boolean c() {
        return true;
    }

    @Override // androidx.appcompat.view.menu.j.a
    public void d(g gVar, int i8) {
        this.f13568h = gVar;
        setIcon(gVar.getIcon());
        setTitle(gVar.i(this));
        setId(gVar.getItemId());
        setVisibility(gVar.isVisible() ? 0 : 8);
        setEnabled(gVar.isEnabled());
        if (gVar.hasSubMenu() && this.f13572l == null) {
            this.f13572l = new a();
        }
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // androidx.appcompat.view.menu.j.a
    public g getItemData() {
        return this.f13568h;
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        e.b bVar = this.f13571k;
        if (bVar != null) {
            bVar.a(this.f13568h);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f13574n = t();
        u();
    }

    @Override // p117n.C, android.widget.TextView, android.view.View
    public void onMeasure(int i8, int i9) {
        int i10;
        boolean zS = s();
        if (zS && (i10 = this.f13577q) >= 0) {
            super.setPadding(i10, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i8, i9);
        int mode = View.MeasureSpec.getMode(i8);
        int size = View.MeasureSpec.getSize(i8);
        int measuredWidth = getMeasuredWidth();
        int iMin = mode == Integer.MIN_VALUE ? Math.min(size, this.f13576p) : this.f13576p;
        if (mode != 1073741824 && this.f13576p > 0 && measuredWidth < iMin) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(iMin, 1073741824), i9);
        }
        if (zS || this.f13570j == null) {
            return;
        }
        super.setPadding((getMeasuredWidth() - this.f13570j.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
    }

    @Override // android.widget.TextView, android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        K k8;
        if (this.f13568h.hasSubMenu() && (k8 = this.f13572l) != null && k8.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public boolean s() {
        return !TextUtils.isEmpty(getText());
    }

    public void setExpandedFormat(boolean z8) {
        if (this.f13575o != z8) {
            this.f13575o = z8;
            g gVar = this.f13568h;
            if (gVar != null) {
                gVar.c();
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.f13570j = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i8 = this.f13578r;
            if (intrinsicWidth > i8) {
                intrinsicHeight = (int) (intrinsicHeight * (i8 / intrinsicWidth));
                intrinsicWidth = i8;
            }
            if (intrinsicHeight > i8) {
                intrinsicWidth = (int) (intrinsicWidth * (i8 / intrinsicHeight));
            } else {
                i8 = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i8);
        }
        setCompoundDrawables(drawable, null, null, null);
        u();
    }

    public void setItemInvoker(e.b bVar) {
        this.f13571k = bVar;
    }

    @Override // android.widget.TextView, android.view.View
    public void setPadding(int i8, int i9, int i10, int i11) {
        this.f13577q = i8;
        super.setPadding(i8, i9, i10, i11);
    }

    public void setPopupCallback(b bVar) {
        this.f13573m = bVar;
    }

    public void setTitle(CharSequence charSequence) {
        this.f13569i = charSequence;
        u();
    }

    public final boolean t() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i8 = configuration.screenWidthDp;
        int i9 = configuration.screenHeightDp;
        if (i8 < 480) {
            return (i8 >= 640 && i9 >= 480) || configuration.orientation == 2;
        }
        return true;
    }

    public final void u() {
        boolean z8 = true;
        boolean z9 = !TextUtils.isEmpty(this.f13569i);
        if (this.f13570j != null && (!this.f13568h.B() || (!this.f13574n && !this.f13575o))) {
            z8 = false;
        }
        boolean z10 = z9 & z8;
        setText(z10 ? this.f13569i : null);
        CharSequence contentDescription = this.f13568h.getContentDescription();
        if (TextUtils.isEmpty(contentDescription)) {
            setContentDescription(z10 ? null : this.f13568h.getTitle());
        } else {
            setContentDescription(contentDescription);
        }
        CharSequence tooltipText = this.f13568h.getTooltipText();
        if (TextUtils.isEmpty(tooltipText)) {
            b0.a(this, z10 ? null : this.f13568h.getTitle());
        } else {
            b0.a(this, tooltipText);
        }
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ActionMenuItemView(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        Resources resources = context.getResources();
        this.f13574n = t();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, p054g.j.f22749v, i8, 0);
        this.f13576p = typedArrayObtainStyledAttributes.getDimensionPixelSize(p054g.j.f22754w, 0);
        typedArrayObtainStyledAttributes.recycle();
        this.f13578r = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.f13577q = -1;
        setSaveEnabled(false);
    }

    public void setCheckable(boolean z8) {
    }

    public void setChecked(boolean z8) {
    }
}
