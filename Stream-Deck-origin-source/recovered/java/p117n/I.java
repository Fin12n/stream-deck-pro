package p117n;

import H.FL.dCqzKmEghGTQ;
import U1.S;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class I extends ListView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Rect f30204a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f30205b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f30206c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30207d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30208e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30209f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public d f30210g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f30211h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30212i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f30213j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public S f30214k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public p003a2.f f30215l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public f f30216m;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a {
        public static void a(View view, float f8, float f9) {
            view.drawableHotspotChanged(f8, f9);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static Method f30217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public static Method f30218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public static Method f30219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static boolean f30220d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f30217a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f30218b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f30219c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f30220d = true;
            } catch (NoSuchMethodException e8) {
                e8.printStackTrace();
            }
        }

        public static boolean a() {
            return f30220d;
        }

        public static void b(I i8, int i9, View view) {
            try {
                f30217a.invoke(i8, Integer.valueOf(i9), view, Boolean.FALSE, -1, -1);
                f30218b.invoke(i8, Integer.valueOf(i9));
                f30219c.invoke(i8, Integer.valueOf(i9));
            } catch (IllegalAccessException e8) {
                e8.printStackTrace();
            } catch (InvocationTargetException e9) {
                e9.printStackTrace();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        public static void b(AbsListView absListView, boolean z8) {
            absListView.setSelectedChildViewEnabled(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d extends p081j.a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f30221b;

        public d(Drawable drawable) {
            super(drawable);
            this.f30221b = true;
        }

        public void b(boolean z8) {
            this.f30221b = z8;
        }

        @Override // p081j.a, android.graphics.drawable.Drawable
        public void draw(Canvas canvas) {
            if (this.f30221b) {
                super.draw(canvas);
            }
        }

        @Override // p081j.a, android.graphics.drawable.Drawable
        public void setHotspot(float f8, float f9) {
            if (this.f30221b) {
                super.setHotspot(f8, f9);
            }
        }

        @Override // p081j.a, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i8, int i9, int i10, int i11) {
            if (this.f30221b) {
                super.setHotspotBounds(i8, i9, i10, i11);
            }
        }

        @Override // p081j.a, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f30221b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // p081j.a, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z8, boolean z9) {
            if (this.f30221b) {
                return super.setVisible(z8, z9);
            }
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final Field f30222a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField(dCqzKmEghGTQ.KvIRVXw);
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e8) {
                e8.printStackTrace();
            }
            f30222a = declaredField;
        }

        public static boolean a(AbsListView absListView) {
            Field field = f30222a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e8) {
                e8.printStackTrace();
                return false;
            }
        }

        public static void b(AbsListView absListView, boolean z8) {
            Field field = f30222a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z8));
                } catch (IllegalAccessException e8) {
                    e8.printStackTrace();
                }
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class f implements Runnable {
        public f() {
        }

        public void a() {
            I i8 = I.this;
            i8.f30216m = null;
            i8.removeCallbacks(this);
        }

        public void b() {
            I.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            I i8 = I.this;
            i8.f30216m = null;
            i8.drawableStateChanged();
        }
    }

    public I(Context context, boolean z8) {
        super(context, null, p054g.a.f22356B);
        this.f30204a = new Rect();
        this.f30205b = 0;
        this.f30206c = 0;
        this.f30207d = 0;
        this.f30208e = 0;
        this.f30212i = z8;
        setCacheColorHint(0);
    }

    public final void a() {
        this.f30213j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f30209f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        S s8 = this.f30214k;
        if (s8 != null) {
            s8.c();
            this.f30214k = null;
        }
    }

    public final void b(View view, int i8) {
        performItemClick(view, i8, getItemIdAtPosition(i8));
    }

    public final void c(Canvas canvas) {
        Drawable selector;
        if (this.f30204a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f30204a);
        selector.draw(canvas);
    }

    public int d(int i8, int i9, int i10, int i11, int i12) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        View view = null;
        while (i13 < count) {
            int itemViewType = adapter.getItemViewType(i13);
            if (itemViewType != i14) {
                view = null;
                i14 = itemViewType;
            }
            view = adapter.getView(i13, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i16 = layoutParams.height;
            view.measure(i8, i16 > 0 ? View.MeasureSpec.makeMeasureSpec(i16, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i13 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i11) {
                return (i12 < 0 || i13 <= i12 || i15 <= 0 || measuredHeight == i11) ? i11 : i15;
            }
            if (i12 >= 0 && i13 >= i12) {
                i15 = measuredHeight;
            }
            i13++;
        }
        return measuredHeight;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    public void drawableStateChanged() {
        if (this.f30216m != null) {
            return;
        }
        super.drawableStateChanged();
        j(true);
        n();
    }

    /* JADX WARN: Code duplicated, block: B:23:0x004a  */
    /* JADX WARN: Code duplicated, block: B:25:0x004f  */
    /* JADX WARN: Code duplicated, block: B:27:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0065  */
    /* JADX WARN: Code duplicated, block: B:32:0x0069  */
    /* JADX WARN: Code duplicated, block: B:9:0x0011  */
    public boolean e(MotionEvent motionEvent, int i8) {
        boolean z8;
        boolean z9;
        p003a2.f fVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z8 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z8 = true;
                    z9 = false;
                } else {
                    z9 = false;
                    z8 = false;
                }
                if (z8 || z9) {
                    a();
                }
                if (z8) {
                    fVar = this.f30215l;
                    if (fVar != null) {
                        fVar.m(false);
                    }
                    return z8;
                }
                if (this.f30215l == null) {
                    this.f30215l = new p003a2.f(this);
                }
                this.f30215l.m(true);
                this.f30215l.onTouch(this, motionEvent);
                return z8;
            }
            z8 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i8);
        if (iFindPointerIndex < 0) {
            z9 = false;
            z8 = false;
        } else {
            int x8 = (int) motionEvent.getX(iFindPointerIndex);
            int y8 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x8, y8);
            if (iPointToPosition == -1) {
                z9 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                i(childAt, iPointToPosition, x8, y8);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z8 = true;
                z9 = false;
            }
        }
        if (z8) {
            a();
        } else {
            a();
        }
        if (z8) {
            fVar = this.f30215l;
            if (fVar != null) {
                fVar.m(false);
            }
            return z8;
        }
        if (this.f30215l == null) {
            this.f30215l = new p003a2.f(this);
        }
        this.f30215l.m(true);
        this.f30215l.onTouch(this, motionEvent);
        return z8;
    }

    public final void f(int i8, View view) {
        Rect rect = this.f30204a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f30205b;
        rect.top -= this.f30206c;
        rect.right += this.f30207d;
        rect.bottom += this.f30208e;
        boolean zK = k();
        if (view.isEnabled() != zK) {
            l(!zK);
            if (i8 != -1) {
                refreshDrawableState();
            }
        }
    }

    public final void g(int i8, View view) {
        Drawable selector = getSelector();
        boolean z8 = (selector == null || i8 == -1) ? false : true;
        if (z8) {
            selector.setVisible(false, false);
        }
        f(i8, view);
        if (z8) {
            Rect rect = this.f30204a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            M1.a.c(selector, fExactCenterX, fExactCenterY);
        }
    }

    public final void h(int i8, View view, float f8, float f9) {
        g(i8, view);
        Drawable selector = getSelector();
        if (selector == null || i8 == -1) {
            return;
        }
        M1.a.c(selector, f8, f9);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f30212i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f30212i || super.hasWindowFocus();
    }

    public final void i(View view, int i8, float f8, float f9) {
        View childAt;
        this.f30213j = true;
        a.a(this, f8, f9);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i9 = this.f30209f;
        if (i9 != -1 && (childAt = getChildAt(i9 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f30209f = i8;
        a.a(view, f8 - view.getLeft(), f9 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        h(i8, view, f8, f9);
        j(false);
        refreshDrawableState();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f30212i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f30212i && this.f30211h) || super.isInTouchMode();
    }

    public final void j(boolean z8) {
        d dVar = this.f30210g;
        if (dVar != null) {
            dVar.b(z8);
        }
    }

    public final boolean k() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    public final void l(boolean z8) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z8);
        } else {
            e.b(this, z8);
        }
    }

    public final boolean m() {
        return this.f30213j;
    }

    public final void n() {
        Drawable selector = getSelector();
        if (selector != null && m() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.f30216m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int i8 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f30216m == null) {
            f fVar = new f();
            this.f30216m = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i8 < 30 || !b.a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, iPointToPosition, childAt);
                }
            }
            n();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f30209f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f30216m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setListSelectionHidden(boolean z8) {
        this.f30211h = z8;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f30210g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f30205b = rect.left;
        this.f30206c = rect.top;
        this.f30207d = rect.right;
        this.f30208e = rect.bottom;
    }
}
