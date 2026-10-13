package p065h1;

import D1.c;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.util.HashMap;
import java.util.Iterator;
import p056g1.F;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class P extends ViewGroup {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final HashMap f24149a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final HashMap f24150b;

    public P(Context context) {
        super(context);
        setClipChildren(false);
        this.f24149a = new HashMap();
        this.f24150b = new HashMap();
    }

    public final void a(c cVar, Canvas canvas) {
        cVar.draw(canvas);
    }

    public Void b(int[] iArr, Rect rect) {
        return null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        return true;
    }

    public final HashMap<c, F> getHolderToLayoutNode() {
        return this.f24149a;
    }

    public final HashMap<F, c> getLayoutNodeToHolder() {
        return this.f24150b;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public /* bridge */ /* synthetic */ ViewParent invalidateChildInParent(int[] iArr, Rect rect) {
        return (ViewParent) b(iArr, rect);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        for (c cVar : this.f24149a.keySet()) {
            cVar.layout(cVar.getLeft(), cVar.getTop(), cVar.getRight(), cVar.getBottom());
        }
    }

    @Override // android.view.View
    public void onMeasure(int i8, int i9) {
        if (View.MeasureSpec.getMode(i8) != 1073741824) {
            throw new IllegalArgumentException("widthMeasureSpec should be EXACTLY");
        }
        if (View.MeasureSpec.getMode(i9) != 1073741824) {
            throw new IllegalArgumentException("heightMeasureSpec should be EXACTLY");
        }
        setMeasuredDimension(View.MeasureSpec.getSize(i8), View.MeasureSpec.getSize(i9));
        Iterator it = this.f24149a.keySet().iterator();
        while (it.hasNext()) {
            ((c) it.next()).u();
        }
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        cleanupLayoutState(this);
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            F f8 = (F) this.f24149a.get(childAt);
            if (childAt.isLayoutRequested() && f8 != null) {
                F.m1(f8, false, false, 3, null);
            }
        }
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View view, View view2) {
    }
}
