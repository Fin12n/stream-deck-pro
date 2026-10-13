package p117n;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Handler;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import java.lang.reflect.Method;
import p054g.j;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class L implements p108m.f {

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public static Method f30235G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public static Method f30236H;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public Runnable f30237A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final Handler f30238B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final Rect f30239C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public Rect f30240D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public boolean f30241E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public PopupWindow f30242F;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f30243a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public ListAdapter f30244b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public I f30245c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public int f30246d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f30247e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public int f30248f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f30249g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f30250h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public boolean f30251i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public boolean f30252j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public boolean f30253k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f30254l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f30255m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f30256n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f30257o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f30258p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f30259q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public DataSetObserver f30260r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public View f30261s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Drawable f30262t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public AdapterView.OnItemClickListener f30263u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public AdapterView.OnItemSelectedListener f30264v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public final i f30265w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final h f30266x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public final g f30267y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public final e f30268z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewT = L.this.t();
            if (viewT == null || viewT.getWindowToken() == null) {
                return;
            }
            L.this.b();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class c {
        public static int a(PopupWindow popupWindow, View view, int i8, boolean z8) {
            return popupWindow.getMaxAvailableHeight(view, i8, z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {
        public static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        public static void b(PopupWindow popupWindow, boolean z8) {
            popupWindow.setIsClippedToScreen(z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class e implements Runnable {
        public e() {
        }

        @Override // java.lang.Runnable
        public void run() {
            L.this.r();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class f extends DataSetObserver {
        public f() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (L.this.a()) {
                L.this.b();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            L.this.dismiss();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class h implements View.OnTouchListener {
        public h() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x8 = (int) motionEvent.getX();
            int y8 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = L.this.f30242F) != null && popupWindow.isShowing() && x8 >= 0 && x8 < L.this.f30242F.getWidth() && y8 >= 0 && y8 < L.this.f30242F.getHeight()) {
                L l8 = L.this;
                l8.f30238B.postDelayed(l8.f30265w, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            L l9 = L.this;
            l9.f30238B.removeCallbacks(l9.f30265w);
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            I i8 = L.this.f30245c;
            if (i8 == null || !i8.isAttachedToWindow() || L.this.f30245c.getCount() <= L.this.f30245c.getChildCount()) {
                return;
            }
            int childCount = L.this.f30245c.getChildCount();
            L l8 = L.this;
            if (childCount <= l8.f30257o) {
                l8.f30242F.setInputMethodMode(2);
                L.this.b();
            }
        }
    }

    static {
        if (Build.VERSION.SDK_INT <= 28) {
            try {
                f30235G = PopupWindow.class.getDeclaredMethod("setClipToScreenEnabled", Boolean.TYPE);
            } catch (NoSuchMethodException unused) {
                Log.i("ListPopupWindow", "Could not find method setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
            try {
                f30236H = PopupWindow.class.getDeclaredMethod("setEpicenterBounds", Rect.class);
            } catch (NoSuchMethodException unused2) {
                Log.i("ListPopupWindow", "Could not find method setEpicenterBounds(Rect) on PopupWindow. Oh well.");
            }
        }
    }

    public L(Context context) {
        this(context, null, p054g.a.f22360F);
    }

    public void A(int i8) {
        this.f30242F.setAnimationStyle(i8);
    }

    public void B(int i8) {
        Drawable background = this.f30242F.getBackground();
        if (background == null) {
            M(i8);
            return;
        }
        background.getPadding(this.f30239C);
        Rect rect = this.f30239C;
        this.f30247e = rect.left + rect.right + i8;
    }

    public void C(int i8) {
        this.f30254l = i8;
    }

    public void D(Rect rect) {
        this.f30240D = rect != null ? new Rect(rect) : null;
    }

    public void E(int i8) {
        this.f30242F.setInputMethodMode(i8);
    }

    public void F(boolean z8) {
        this.f30241E = z8;
        this.f30242F.setFocusable(z8);
    }

    public void G(PopupWindow.OnDismissListener onDismissListener) {
        this.f30242F.setOnDismissListener(onDismissListener);
    }

    public void H(AdapterView.OnItemClickListener onItemClickListener) {
        this.f30263u = onItemClickListener;
    }

    public void I(boolean z8) {
        this.f30253k = true;
        this.f30252j = z8;
    }

    public final void J(boolean z8) {
        if (Build.VERSION.SDK_INT > 28) {
            d.b(this.f30242F, z8);
            return;
        }
        Method method = f30235G;
        if (method != null) {
            try {
                method.invoke(this.f30242F, Boolean.valueOf(z8));
            } catch (Exception unused) {
                Log.i("ListPopupWindow", "Could not call setClipToScreenEnabled() on PopupWindow. Oh well.");
            }
        }
    }

    public void K(int i8) {
        this.f30259q = i8;
    }

    public void L(int i8) {
        I i9 = this.f30245c;
        if (!a() || i9 == null) {
            return;
        }
        i9.setListSelectionHidden(false);
        i9.setSelection(i8);
        if (i9.getChoiceMode() != 0) {
            i9.setItemChecked(i8, true);
        }
    }

    public void M(int i8) {
        this.f30247e = i8;
    }

    @Override // p108m.f
    public boolean a() {
        return this.f30242F.isShowing();
    }

    @Override // p108m.f
    public void b() {
        int iQ = q();
        boolean zW = w();
        p003a2.g.b(this.f30242F, this.f30250h);
        if (this.f30242F.isShowing()) {
            if (t().isAttachedToWindow()) {
                int width = this.f30247e;
                if (width == -1) {
                    width = -1;
                } else if (width == -2) {
                    width = t().getWidth();
                }
                int i8 = this.f30246d;
                if (i8 == -1) {
                    if (!zW) {
                        iQ = -1;
                    }
                    if (zW) {
                        this.f30242F.setWidth(this.f30247e == -1 ? -1 : 0);
                        this.f30242F.setHeight(0);
                    } else {
                        this.f30242F.setWidth(this.f30247e == -1 ? -1 : 0);
                        this.f30242F.setHeight(-1);
                    }
                } else if (i8 != -2) {
                    iQ = i8;
                }
                this.f30242F.setOutsideTouchable((this.f30256n || this.f30255m) ? false : true);
                this.f30242F.update(t(), this.f30248f, this.f30249g, width < 0 ? -1 : width, iQ < 0 ? -1 : iQ);
                return;
            }
            return;
        }
        int width2 = this.f30247e;
        if (width2 == -1) {
            width2 = -1;
        } else if (width2 == -2) {
            width2 = t().getWidth();
        }
        int i9 = this.f30246d;
        if (i9 == -1) {
            iQ = -1;
        } else if (i9 != -2) {
            iQ = i9;
        }
        this.f30242F.setWidth(width2);
        this.f30242F.setHeight(iQ);
        J(true);
        this.f30242F.setOutsideTouchable((this.f30256n || this.f30255m) ? false : true);
        this.f30242F.setTouchInterceptor(this.f30266x);
        if (this.f30253k) {
            p003a2.g.a(this.f30242F, this.f30252j);
        }
        if (Build.VERSION.SDK_INT <= 28) {
            Method method = f30236H;
            if (method != null) {
                try {
                    method.invoke(this.f30242F, this.f30240D);
                } catch (Exception e8) {
                    Log.e("ListPopupWindow", "Could not invoke setEpicenterBounds on PopupWindow", e8);
                }
            }
        } else {
            d.a(this.f30242F, this.f30240D);
        }
        p003a2.g.c(this.f30242F, t(), this.f30248f, this.f30249g, this.f30254l);
        this.f30245c.setSelection(-1);
        if (!this.f30241E || this.f30245c.isInTouchMode()) {
            r();
        }
        if (this.f30241E) {
            return;
        }
        this.f30238B.post(this.f30268z);
    }

    public int c() {
        return this.f30248f;
    }

    @Override // p108m.f
    public void dismiss() {
        this.f30242F.dismiss();
        y();
        this.f30242F.setContentView(null);
        this.f30245c = null;
        this.f30238B.removeCallbacks(this.f30265w);
    }

    public void e(int i8) {
        this.f30248f = i8;
    }

    public Drawable h() {
        return this.f30242F.getBackground();
    }

    @Override // p108m.f
    public ListView j() {
        return this.f30245c;
    }

    public void k(Drawable drawable) {
        this.f30242F.setBackgroundDrawable(drawable);
    }

    public void l(int i8) {
        this.f30249g = i8;
        this.f30251i = true;
    }

    public int o() {
        if (this.f30251i) {
            return this.f30249g;
        }
        return 0;
    }

    public void p(ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f30260r;
        if (dataSetObserver == null) {
            this.f30260r = new f();
        } else {
            ListAdapter listAdapter2 = this.f30244b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f30244b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f30260r);
        }
        I i8 = this.f30245c;
        if (i8 != null) {
            i8.setAdapter(this.f30244b);
        }
    }

    public final int q() {
        int measuredHeight;
        int i8;
        int iMakeMeasureSpec;
        View view;
        int i9;
        if (this.f30245c == null) {
            Context context = this.f30243a;
            this.f30237A = new a();
            I iS = s(context, !this.f30241E);
            this.f30245c = iS;
            Drawable drawable = this.f30262t;
            if (drawable != null) {
                iS.setSelector(drawable);
            }
            this.f30245c.setAdapter(this.f30244b);
            this.f30245c.setOnItemClickListener(this.f30263u);
            this.f30245c.setFocusable(true);
            this.f30245c.setFocusableInTouchMode(true);
            this.f30245c.setOnItemSelectedListener(new b());
            this.f30245c.setOnScrollListener(this.f30267y);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.f30264v;
            if (onItemSelectedListener != null) {
                this.f30245c.setOnItemSelectedListener(onItemSelectedListener);
            }
            I i10 = this.f30245c;
            View view2 = this.f30258p;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i11 = this.f30259q;
                if (i11 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(i10, layoutParams);
                } else if (i11 != 1) {
                    Log.e("ListPopupWindow", "Invalid hint position " + this.f30259q);
                } else {
                    linearLayout.addView(i10, layoutParams);
                    linearLayout.addView(view2);
                }
                int i12 = this.f30247e;
                if (i12 >= 0) {
                    i9 = Integer.MIN_VALUE;
                } else {
                    i12 = 0;
                    i9 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i12, i9), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = i10;
            }
            this.f30242F.setContentView(view);
        } else {
            View view3 = this.f30258p;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f30242F.getBackground();
        if (background != null) {
            background.getPadding(this.f30239C);
            Rect rect = this.f30239C;
            int i13 = rect.top;
            i8 = rect.bottom + i13;
            if (!this.f30251i) {
                this.f30249g = -i13;
            }
        } else {
            this.f30239C.setEmpty();
            i8 = 0;
        }
        int iU = u(t(), this.f30249g, this.f30242F.getInputMethodMode() == 2);
        if (this.f30255m || this.f30246d == -1) {
            return iU + i8;
        }
        int i14 = this.f30247e;
        if (i14 == -2) {
            int i15 = this.f30243a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f30239C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i14 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
        } else {
            int i16 = this.f30243a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f30239C;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect3.left + rect3.right), 1073741824);
        }
        int iD = this.f30245c.d(iMakeMeasureSpec, 0, -1, iU - measuredHeight, -1);
        if (iD > 0) {
            measuredHeight += i8 + this.f30245c.getPaddingTop() + this.f30245c.getPaddingBottom();
        }
        return iD + measuredHeight;
    }

    public void r() {
        I i8 = this.f30245c;
        if (i8 != null) {
            i8.setListSelectionHidden(true);
            i8.requestLayout();
        }
    }

    public I s(Context context, boolean z8) {
        return new I(context, z8);
    }

    public View t() {
        return this.f30261s;
    }

    public final int u(View view, int i8, boolean z8) {
        return c.a(this.f30242F, view, i8, z8);
    }

    public int v() {
        return this.f30247e;
    }

    public boolean w() {
        return this.f30242F.getInputMethodMode() == 2;
    }

    public boolean x() {
        return this.f30241E;
    }

    public final void y() {
        View view = this.f30258p;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f30258p);
            }
        }
    }

    public void z(View view) {
        this.f30261s = view;
    }

    public L(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p054g.a.f22360F);
    }

    public L(Context context, AttributeSet attributeSet, int i8) {
        this(context, attributeSet, i8, 0);
    }

    public L(Context context, AttributeSet attributeSet, int i8, int i9) {
        this.f30246d = -2;
        this.f30247e = -2;
        this.f30250h = 1002;
        this.f30254l = 0;
        this.f30255m = false;
        this.f30256n = false;
        this.f30257o = Integer.MAX_VALUE;
        this.f30259q = 0;
        this.f30265w = new i();
        this.f30266x = new h();
        this.f30267y = new g();
        this.f30268z = new e();
        this.f30239C = new Rect();
        this.f30243a = context;
        this.f30238B = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, j.f22701l1, i8, i9);
        this.f30248f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f22706m1, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(j.f22711n1, 0);
        this.f30249g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f30251i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        C2716s c2716s = new C2716s(context, attributeSet, i8, i9);
        this.f30242F = c2716s;
        c2716s.setInputMethodMode(1);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements AdapterView.OnItemSelectedListener {
        public b() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView adapterView, View view, int i8, long j8) {
            I i9;
            if (i8 == -1 || (i9 = L.this.f30245c) == null) {
                return;
            }
            i9.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView adapterView) {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class g implements AbsListView.OnScrollListener {
        public g() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i8) {
            if (i8 != 1 || L.this.w() || L.this.f30242F.getContentView() == null) {
                return;
            }
            L l8 = L.this;
            l8.f30238B.removeCallbacks(l8.f30265w);
            L.this.f30265w.run();
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i8, int i9, int i10) {
        }
    }
}
