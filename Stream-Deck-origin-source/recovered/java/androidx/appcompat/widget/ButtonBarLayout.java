package androidx.appcompat.widget;

import U1.I;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import p054g.f;
import p054g.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ButtonBarLayout extends LinearLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f13847a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f13848b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f13849c;

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f13849c = -1;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f22593N0);
        I.G(this, context, j.f22593N0, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        this.f13847a = typedArrayObtainStyledAttributes.getBoolean(j.f22597O0, true);
        typedArrayObtainStyledAttributes.recycle();
        if (getOrientation() == 1) {
            setStacked(this.f13847a);
        }
    }

    private void setStacked(boolean z8) {
        if (this.f13848b != z8) {
            if (!z8 || this.f13847a) {
                this.f13848b = z8;
                setOrientation(z8 ? 1 : 0);
                setGravity(z8 ? 8388613 : 80);
                View viewFindViewById = findViewById(f.f22467F);
                if (viewFindViewById != null) {
                    viewFindViewById.setVisibility(z8 ? 8 : 4);
                }
                for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
                    bringChildToFront(getChildAt(childCount));
                }
            }
        }
    }

    public final int a(int i8) {
        int childCount = getChildCount();
        while (i8 < childCount) {
            if (getChildAt(i8).getVisibility() == 0) {
                return i8;
            }
            i8++;
        }
        return -1;
    }

    public final boolean b() {
        return this.f13848b;
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onMeasure(int i8, int i9) {
        int iMakeMeasureSpec;
        boolean z8;
        int size = View.MeasureSpec.getSize(i8);
        int paddingBottom = 0;
        if (this.f13847a) {
            if (size > this.f13849c && b()) {
                setStacked(false);
            }
            this.f13849c = size;
        }
        if (b() || View.MeasureSpec.getMode(i8) != 1073741824) {
            iMakeMeasureSpec = i8;
            z8 = false;
        } else {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size, Integer.MIN_VALUE);
            z8 = true;
        }
        super.onMeasure(iMakeMeasureSpec, i9);
        if (this.f13847a && !b() && (getMeasuredWidthAndState() & (-16777216)) == 16777216) {
            setStacked(true);
            z8 = true;
        }
        if (z8) {
            super.onMeasure(i8, i9);
        }
        int iA = a(0);
        if (iA >= 0) {
            View childAt = getChildAt(iA);
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            if (b()) {
                int iA2 = a(iA + 1);
                if (iA2 >= 0) {
                    paddingTop += getChildAt(iA2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                paddingBottom = paddingTop;
            } else {
                paddingBottom = paddingTop + getPaddingBottom();
            }
        }
        if (I.o(this) != paddingBottom) {
            setMinimumHeight(paddingBottom);
            if (i9 == 0) {
                super.onMeasure(i8, i9);
            }
        }
    }

    public void setAllowStacking(boolean z8) {
        if (this.f13847a != z8) {
            this.f13847a = z8;
            if (!z8 && b()) {
                setStacked(false);
            }
            requestLayout();
        }
    }
}
