package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import p054g.f;
import p054g.j;
import p117n.C2700b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13765a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public View f13766b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f13767c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f13768d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f13769e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f13770f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f13771g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13772h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f13773i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f13774j;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    public final int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    public final boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f13769e;
        if (drawable != null && drawable.isStateful()) {
            this.f13769e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f13770f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f13770f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f13771g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f13771g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f13766b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f13769e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f13770f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f13771g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f13767c = findViewById(f.f22477a);
        this.f13768d = findViewById(f.f22482f);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f13765a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0049 A[PHI: r1
      0x0049: PHI (r1v8 boolean) = (r1v1 boolean), (r1v1 boolean), (r1v0 boolean) binds: [B:31:0x00a6, B:33:0x00aa, B:15:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        Drawable drawable;
        super.onLayout(z8, i8, i9, i10, i11);
        View view = this.f13766b;
        boolean z9 = true;
        boolean z10 = false;
        boolean z11 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i12 = layoutParams.bottomMargin;
            view.layout(i8, measuredHeight2 - i12, i10, measuredHeight - i12);
        }
        if (this.f13772h) {
            Drawable drawable2 = this.f13771g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z9 = z10;
            }
        } else {
            if (this.f13769e != null) {
                if (this.f13767c.getVisibility() == 0) {
                    this.f13769e.setBounds(this.f13767c.getLeft(), this.f13767c.getTop(), this.f13767c.getRight(), this.f13767c.getBottom());
                } else {
                    View view2 = this.f13768d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f13769e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f13769e.setBounds(this.f13768d.getLeft(), this.f13768d.getTop(), this.f13768d.getRight(), this.f13768d.getBottom());
                    }
                }
                z10 = true;
            }
            this.f13773i = z11;
            if (!z11 || (drawable = this.f13770f) == null) {
                z9 = z10;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z9) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i8, int i9) {
        int iA;
        int i10;
        if (this.f13767c == null && View.MeasureSpec.getMode(i9) == Integer.MIN_VALUE && (i10 = this.f13774j) >= 0) {
            i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i10, View.MeasureSpec.getSize(i9)), Integer.MIN_VALUE);
        }
        super.onMeasure(i8, i9);
        if (this.f13767c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i9);
        View view = this.f13766b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f13767c)) {
            iA = !b(this.f13768d) ? a(this.f13768d) : 0;
        } else {
            iA = a(this.f13767c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f13766b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i9) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f13769e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f13769e);
        }
        this.f13769e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f13767c;
            if (view != null) {
                this.f13769e.setBounds(view.getLeft(), this.f13767c.getTop(), this.f13767c.getRight(), this.f13767c.getBottom());
            }
        }
        boolean z8 = false;
        if (!this.f13772h ? !(this.f13769e != null || this.f13770f != null) : this.f13771g == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f13771g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f13771g);
        }
        this.f13771g = drawable;
        boolean z8 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f13772h && (drawable2 = this.f13771g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f13772h ? !(this.f13769e != null || this.f13770f != null) : this.f13771g == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f13770f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f13770f);
        }
        this.f13770f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f13773i && (drawable2 = this.f13770f) != null) {
                drawable2.setBounds(this.f13766b.getLeft(), this.f13766b.getTop(), this.f13766b.getRight(), this.f13766b.getBottom());
            }
        }
        boolean z8 = false;
        if (!this.f13772h ? !(this.f13769e != null || this.f13770f != null) : this.f13771g == null) {
            z8 = true;
        }
        setWillNotDraw(z8);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(c cVar) {
        View view = this.f13766b;
        if (view != null) {
            removeView(view);
        }
        this.f13766b = cVar;
        if (cVar != null) {
            addView(cVar);
            ViewGroup.LayoutParams layoutParams = cVar.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            cVar.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z8) {
        this.f13765a = z8;
        setDescendantFocusability(z8 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i8) {
        super.setVisibility(i8);
        boolean z8 = i8 == 0;
        Drawable drawable = this.f13769e;
        if (drawable != null) {
            drawable.setVisible(z8, false);
        }
        Drawable drawable2 = this.f13770f;
        if (drawable2 != null) {
            drawable2.setVisible(z8, false);
        }
        Drawable drawable3 = this.f13771g;
        if (drawable3 != null) {
            drawable3.setVisible(z8, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    public boolean verifyDrawable(Drawable drawable) {
        if (drawable == this.f13769e && !this.f13772h) {
            return true;
        }
        if (drawable == this.f13770f && this.f13773i) {
            return true;
        }
        return (drawable == this.f13771g && this.f13772h) || super.verifyDrawable(drawable);
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new C2700b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f22644a);
        this.f13769e = typedArrayObtainStyledAttributes.getDrawable(j.f22649b);
        this.f13770f = typedArrayObtainStyledAttributes.getDrawable(j.f22659d);
        this.f13774j = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f22689j, -1);
        boolean z8 = true;
        if (getId() == f.f22468G) {
            this.f13772h = true;
            this.f13771g = typedArrayObtainStyledAttributes.getDrawable(j.f22654c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f13772h ? this.f13769e != null || this.f13770f != null : this.f13771g != null) {
            z8 = false;
        }
        setWillNotDraw(z8);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i8) {
        if (i8 != 0) {
            return super.startActionModeForChild(view, callback, i8);
        }
        return null;
    }
}
