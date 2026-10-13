package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public TypedValue f13850a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TypedValue f13851b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TypedValue f13852c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public TypedValue f13853d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public TypedValue f13854e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public TypedValue f13855f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Rect f13856g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public a f13857h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        void a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    public void a(int i8, int i9, int i10, int i11) {
        this.f13856g.set(i8, i9, i10, i11);
        if (isLaidOut()) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f13854e == null) {
            this.f13854e = new TypedValue();
        }
        return this.f13854e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f13855f == null) {
            this.f13855f = new TypedValue();
        }
        return this.f13855f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f13852c == null) {
            this.f13852c = new TypedValue();
        }
        return this.f13852c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f13853d == null) {
            this.f13853d = new TypedValue();
        }
        return this.f13853d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f13850a == null) {
            this.f13850a = new TypedValue();
        }
        return this.f13850a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f13851b == null) {
            this.f13851b = new TypedValue();
        }
        return this.f13851b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.f13857h;
        if (aVar != null) {
            aVar.a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        a aVar = this.f13857h;
        if (aVar != null) {
            aVar.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Code duplicated, block: B:21:0x004a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0086  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00db  */
    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i8, int i9) {
        boolean z8;
        int i10;
        int i11;
        float fraction;
        int i12;
        int i13;
        float fraction2;
        int i14;
        int i15;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z9 = true;
        boolean z10 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i8);
        int mode2 = View.MeasureSpec.getMode(i9);
        if (mode != Integer.MIN_VALUE) {
            z8 = false;
        } else {
            TypedValue typedValue = z10 ? this.f13853d : this.f13852c;
            if (typedValue == null || (i14 = typedValue.type) == 0) {
                z8 = false;
            } else {
                if (i14 == 5) {
                    fraction3 = typedValue.getDimension(displayMetrics);
                } else {
                    if (i14 == 6) {
                        int i16 = displayMetrics.widthPixels;
                        fraction3 = typedValue.getFraction(i16, i16);
                    } else {
                        i15 = 0;
                    }
                    if (i15 > 0) {
                        Rect rect = this.f13856g;
                        i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect.left + rect.right), View.MeasureSpec.getSize(i8)), 1073741824);
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                }
                i15 = (int) fraction3;
                if (i15 > 0) {
                    Rect rect2 = this.f13856g;
                    i8 = View.MeasureSpec.makeMeasureSpec(Math.min(i15 - (rect2.left + rect2.right), View.MeasureSpec.getSize(i8)), 1073741824);
                    z8 = true;
                } else {
                    z8 = false;
                }
            }
        }
        if (mode2 == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z10 ? this.f13854e : this.f13855f;
            if (typedValue2 != null && (i12 = typedValue2.type) != 0) {
                if (i12 == 5) {
                    fraction2 = typedValue2.getDimension(displayMetrics);
                } else {
                    if (i12 == 6) {
                        int i17 = displayMetrics.heightPixels;
                        fraction2 = typedValue2.getFraction(i17, i17);
                    } else {
                        i13 = 0;
                    }
                    if (i13 > 0) {
                        Rect rect3 = this.f13856g;
                        i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i13 - (rect3.top + rect3.bottom), View.MeasureSpec.getSize(i9)), 1073741824);
                    }
                }
                i13 = (int) fraction2;
                if (i13 > 0) {
                    Rect rect4 = this.f13856g;
                    i9 = View.MeasureSpec.makeMeasureSpec(Math.min(i13 - (rect4.top + rect4.bottom), View.MeasureSpec.getSize(i9)), 1073741824);
                }
            }
        }
        super.onMeasure(i8, i9);
        int measuredWidth = getMeasuredWidth();
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (z8 || mode != Integer.MIN_VALUE) {
            z9 = false;
        } else {
            TypedValue typedValue3 = z10 ? this.f13851b : this.f13850a;
            if (typedValue3 == null || (i10 = typedValue3.type) == 0) {
                z9 = false;
            } else {
                if (i10 == 5) {
                    fraction = typedValue3.getDimension(displayMetrics);
                } else {
                    if (i10 == 6) {
                        int i18 = displayMetrics.widthPixels;
                        fraction = typedValue3.getFraction(i18, i18);
                    } else {
                        i11 = 0;
                    }
                    if (i11 > 0) {
                        Rect rect5 = this.f13856g;
                        i11 -= rect5.left + rect5.right;
                    }
                    if (measuredWidth < i11) {
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                    } else {
                        z9 = false;
                    }
                }
                i11 = (int) fraction;
                if (i11 > 0) {
                    Rect rect6 = this.f13856g;
                    i11 -= rect6.left + rect6.right;
                }
                if (measuredWidth < i11) {
                    iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i11, 1073741824);
                } else {
                    z9 = false;
                }
            }
        }
        if (z9) {
            super.onMeasure(iMakeMeasureSpec, i9);
        }
    }

    public void setAttachListener(a aVar) {
        this.f13857h = aVar;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f13856g = new Rect();
    }
}
