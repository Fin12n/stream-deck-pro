package androidx.appcompat.widget;

import U1.AbstractC1651m;
import U1.C1655q;
import U1.I;
import U1.InterfaceC1654p;
import U1.InterfaceC1656s;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.l;
import com.revenuecat.purchases.common.UtilsKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import p054g.j;
import p117n.C;
import p117n.C2713o;
import p117n.C2715q;
import p117n.G;
import p117n.Q;
import p117n.X;
import p117n.b0;
import p117n.d0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class Toolbar extends ViewGroup implements InterfaceC1654p {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public ColorStateList f13933A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public boolean f13934B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public boolean f13935C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final ArrayList f13936D;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public final ArrayList f13937E;

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public final int[] f13938F;

    /* JADX INFO: renamed from: G, reason: collision with root package name */
    public final C1655q f13939G;

    /* JADX INFO: renamed from: H, reason: collision with root package name */
    public ArrayList f13940H;

    /* JADX INFO: renamed from: I, reason: collision with root package name */
    public final ActionMenuView.e f13941I;

    /* JADX INFO: renamed from: V, reason: collision with root package name */
    public androidx.appcompat.widget.d f13942V;

    /* JADX INFO: renamed from: W, reason: collision with root package name */
    public androidx.appcompat.widget.a f13943W;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public ActionMenuView f13944a;

    /* JADX INFO: renamed from: a0, reason: collision with root package name */
    public f f13945a0;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public TextView f13946b;

    /* JADX INFO: renamed from: b0, reason: collision with root package name */
    public androidx.appcompat.view.menu.i.a f13947b0;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public TextView f13948c;

    /* JADX INFO: renamed from: c0, reason: collision with root package name */
    public androidx.appcompat.view.menu.e.a f13949c0;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ImageButton f13950d;

    /* JADX INFO: renamed from: d0, reason: collision with root package name */
    public boolean f13951d0;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ImageView f13952e;

    /* JADX INFO: renamed from: e0, reason: collision with root package name */
    public OnBackInvokedCallback f13953e0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f13954f;

    /* JADX INFO: renamed from: f0, reason: collision with root package name */
    public OnBackInvokedDispatcher f13955f0;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public CharSequence f13956g;

    /* JADX INFO: renamed from: g0, reason: collision with root package name */
    public boolean f13957g0;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public ImageButton f13958h;

    /* JADX INFO: renamed from: h0, reason: collision with root package name */
    public final Runnable f13959h0;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public View f13960i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public Context f13961j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13962k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public int f13963l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13964m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13965n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f13966o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f13967p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13968q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f13969r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13970s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public Q f13971t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13972u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public int f13973v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f13974w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public CharSequence f13975x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public CharSequence f13976y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public ColorStateList f13977z;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements ActionMenuView.e {
        public a() {
        }

        @Override // androidx.appcompat.widget.ActionMenuView.e
        public boolean onMenuItemClick(MenuItem menuItem) {
            if (Toolbar.this.f13939G.d(menuItem)) {
                return true;
            }
            Toolbar.this.getClass();
            return false;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            Toolbar.this.R();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements androidx.appcompat.view.menu.e.a {
        public c() {
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(androidx.appcompat.view.menu.e eVar, MenuItem menuItem) {
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.f13949c0;
            return aVar != null && aVar.a(eVar, menuItem);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(androidx.appcompat.view.menu.e eVar) {
            if (!Toolbar.this.f13944a.F()) {
                Toolbar.this.f13939G.e(eVar);
            }
            androidx.appcompat.view.menu.e.a aVar = Toolbar.this.f13949c0;
            if (aVar != null) {
                aVar.b(eVar);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements View.OnClickListener {
        public d() {
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Toolbar.this.f();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class e {
        public static OnBackInvokedDispatcher a(View view) {
            return view.findOnBackInvokedDispatcher();
        }

        public static OnBackInvokedCallback b(final Runnable runnable) {
            Objects.requireNonNull(runnable);
            return new OnBackInvokedCallback() { // from class: n.a0
                public final void onBackInvoked() {
                    runnable.run();
                }
            };
        }

        public static void c(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).registerOnBackInvokedCallback(UtilsKt.MICROS_MULTIPLIER, (OnBackInvokedCallback) obj2);
        }

        public static void d(Object obj, Object obj2) {
            ((OnBackInvokedDispatcher) obj).unregisterOnBackInvokedCallback((OnBackInvokedCallback) obj2);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface h {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class i extends p030d2.a {
        public static final Parcelable.Creator<i> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f13986c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f13987d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements Parcelable.ClassLoaderCreator {
            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel) {
                return new i(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public i createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new i(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public i[] newArray(int i8) {
                return new i[i8];
            }
        }

        public i(Parcel parcel) {
            this(parcel, null);
        }

        @Override // p030d2.a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i8) {
            super.writeToParcel(parcel, i8);
            parcel.writeInt(this.f13986c);
            parcel.writeInt(this.f13987d ? 1 : 0);
        }

        public i(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f13986c = parcel.readInt();
            this.f13987d = parcel.readInt() != 0;
        }

        public i(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public Toolbar(Context context) {
        this(context, null);
    }

    private ArrayList<MenuItem> getCurrentMenuItems() {
        ArrayList<MenuItem> arrayList = new ArrayList<>();
        Menu menu = getMenu();
        for (int i8 = 0; i8 < menu.size(); i8++) {
            arrayList.add(menu.getItem(i8));
        }
        return arrayList;
    }

    private MenuInflater getMenuInflater() {
        return new p099l.g(getContext());
    }

    public void A() {
        Iterator it = this.f13940H.iterator();
        while (it.hasNext()) {
            getMenu().removeItem(((MenuItem) it.next()).getItemId());
        }
        I();
    }

    public final boolean B(View view) {
        return view.getParent() == this || this.f13937E.contains(view);
    }

    public boolean C() {
        ActionMenuView actionMenuView = this.f13944a;
        return actionMenuView != null && actionMenuView.E();
    }

    public boolean D() {
        ActionMenuView actionMenuView = this.f13944a;
        return actionMenuView != null && actionMenuView.F();
    }

    public final int E(View view, int i8, int[] iArr, int i9) {
        g gVar = (g) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - iArr[0];
        int iMax = i8 + Math.max(0, i10);
        iArr[0] = Math.max(0, -i10);
        int iR = r(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax, iR, iMax + measuredWidth, view.getMeasuredHeight() + iR);
        return iMax + measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).rightMargin;
    }

    public final int F(View view, int i8, int[] iArr, int i9) {
        g gVar = (g) view.getLayoutParams();
        int i10 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - iArr[1];
        int iMax = i8 - Math.max(0, i10);
        iArr[1] = Math.max(0, -i10);
        int iR = r(view, i9);
        int measuredWidth = view.getMeasuredWidth();
        view.layout(iMax - measuredWidth, iR, iMax, view.getMeasuredHeight() + iR);
        return iMax - (measuredWidth + ((ViewGroup.MarginLayoutParams) gVar).leftMargin);
    }

    public final int G(View view, int i8, int i9, int i10, int i11, int[] iArr) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i12 = marginLayoutParams.leftMargin - iArr[0];
        int i13 = marginLayoutParams.rightMargin - iArr[1];
        int iMax = Math.max(0, i12) + Math.max(0, i13);
        iArr[0] = Math.max(0, -i12);
        iArr[1] = Math.max(0, -i13);
        view.measure(ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + iMax + i9, marginLayoutParams.width), ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height));
        return view.getMeasuredWidth() + iMax;
    }

    public final void H(View view, int i8, int i9, int i10, int i11, int i12) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i8, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i9, marginLayoutParams.width);
        int childMeasureSpec2 = ViewGroup.getChildMeasureSpec(i10, getPaddingTop() + getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i11, marginLayoutParams.height);
        int mode = View.MeasureSpec.getMode(childMeasureSpec2);
        if (mode != 1073741824 && i12 >= 0) {
            if (mode != 0) {
                i12 = Math.min(View.MeasureSpec.getSize(childMeasureSpec2), i12);
            }
            childMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(i12, 1073741824);
        }
        view.measure(childMeasureSpec, childMeasureSpec2);
    }

    public final void I() {
        Menu menu = getMenu();
        ArrayList<MenuItem> currentMenuItems = getCurrentMenuItems();
        this.f13939G.b(menu, getMenuInflater());
        ArrayList<MenuItem> currentMenuItems2 = getCurrentMenuItems();
        currentMenuItems2.removeAll(currentMenuItems);
        this.f13940H = currentMenuItems2;
    }

    public final void J() {
        removeCallbacks(this.f13959h0);
        post(this.f13959h0);
    }

    public void K() {
        for (int childCount = getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = getChildAt(childCount);
            if (((g) childAt.getLayoutParams()).f13985b != 2 && childAt != this.f13944a) {
                removeViewAt(childCount);
                this.f13937E.add(childAt);
            }
        }
    }

    public void L(int i8, int i9) {
        i();
        this.f13971t.g(i8, i9);
    }

    public void M(androidx.appcompat.view.menu.e eVar, androidx.appcompat.widget.a aVar) {
        if (eVar == null && this.f13944a == null) {
            return;
        }
        l();
        androidx.appcompat.view.menu.e eVarJ = this.f13944a.J();
        if (eVarJ == eVar) {
            return;
        }
        if (eVarJ != null) {
            eVarJ.P(this.f13943W);
            eVarJ.P(this.f13945a0);
        }
        if (this.f13945a0 == null) {
            this.f13945a0 = new f();
        }
        aVar.G(true);
        if (eVar != null) {
            eVar.c(aVar, this.f13961j);
            eVar.c(this.f13945a0, this.f13961j);
        } else {
            aVar.i(this.f13961j, null);
            this.f13945a0.i(this.f13961j, null);
            aVar.d(true);
            this.f13945a0.d(true);
        }
        this.f13944a.setPopupTheme(this.f13962k);
        this.f13944a.setPresenter(aVar);
        this.f13943W = aVar;
        S();
    }

    public void N(Context context, int i8) {
        this.f13964m = i8;
        TextView textView = this.f13948c;
        if (textView != null) {
            textView.setTextAppearance(context, i8);
        }
    }

    public void O(Context context, int i8) {
        this.f13963l = i8;
        TextView textView = this.f13946b;
        if (textView != null) {
            textView.setTextAppearance(context, i8);
        }
    }

    public final boolean P() {
        if (!this.f13951d0) {
            return false;
        }
        int childCount = getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (Q(childAt) && childAt.getMeasuredWidth() > 0 && childAt.getMeasuredHeight() > 0) {
                return false;
            }
        }
        return true;
    }

    public final boolean Q(View view) {
        return (view == null || view.getParent() != this || view.getVisibility() == 8) ? false : true;
    }

    public boolean R() {
        ActionMenuView actionMenuView = this.f13944a;
        return actionMenuView != null && actionMenuView.L();
    }

    public void S() {
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        if (Build.VERSION.SDK_INT >= 33) {
            OnBackInvokedDispatcher onBackInvokedDispatcherA = e.a(this);
            boolean z8 = x() && onBackInvokedDispatcherA != null && isAttachedToWindow() && this.f13957g0;
            if (z8 && this.f13955f0 == null) {
                if (this.f13953e0 == null) {
                    this.f13953e0 = e.b(new Runnable() { // from class: n.Y
                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f30342a.f();
                        }
                    });
                }
                e.c(onBackInvokedDispatcherA, this.f13953e0);
                this.f13955f0 = onBackInvokedDispatcherA;
                return;
            }
            if (z8 || (onBackInvokedDispatcher = this.f13955f0) == null) {
                return;
            }
            e.d(onBackInvokedDispatcher, this.f13953e0);
            this.f13955f0 = null;
        }
    }

    public void a() {
        for (int size = this.f13937E.size() - 1; size >= 0; size--) {
            addView((View) this.f13937E.get(size));
        }
        this.f13937E.clear();
    }

    public final void b(List list, int i8) {
        boolean z8 = getLayoutDirection() == 1;
        int childCount = getChildCount();
        int iA = AbstractC1651m.a(i8, getLayoutDirection());
        list.clear();
        if (!z8) {
            for (int i9 = 0; i9 < childCount; i9++) {
                View childAt = getChildAt(i9);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f13985b == 0 && Q(childAt) && q(gVar.f23881a) == iA) {
                    list.add(childAt);
                }
            }
            return;
        }
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            View childAt2 = getChildAt(i10);
            g gVar2 = (g) childAt2.getLayoutParams();
            if (gVar2.f13985b == 0 && Q(childAt2) && q(gVar2.f23881a) == iA) {
                list.add(childAt2);
            }
        }
    }

    public final void c(View view, boolean z8) {
        g gVarGenerateLayoutParams;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            gVarGenerateLayoutParams = generateDefaultLayoutParams();
        } else {
            gVarGenerateLayoutParams = !checkLayoutParams(layoutParams) ? generateLayoutParams(layoutParams) : (g) layoutParams;
        }
        gVarGenerateLayoutParams.f13985b = 1;
        if (!z8 || this.f13960i == null) {
            addView(view, gVarGenerateLayoutParams);
        } else {
            view.setLayoutParams(gVarGenerateLayoutParams);
            this.f13937E.add(view);
        }
    }

    @Override // android.view.ViewGroup
    public boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof g);
    }

    @Override // U1.InterfaceC1654p
    public void d(InterfaceC1656s interfaceC1656s) {
        this.f13939G.a(interfaceC1656s);
    }

    public boolean e() {
        ActionMenuView actionMenuView;
        return getVisibility() == 0 && (actionMenuView = this.f13944a) != null && actionMenuView.G();
    }

    public void f() {
        f fVar = this.f13945a0;
        androidx.appcompat.view.menu.g gVar = fVar == null ? null : fVar.f13983b;
        if (gVar != null) {
            gVar.collapseActionView();
        }
    }

    public void g() {
        ActionMenuView actionMenuView = this.f13944a;
        if (actionMenuView != null) {
            actionMenuView.x();
        }
    }

    public CharSequence getCollapseContentDescription() {
        ImageButton imageButton = this.f13958h;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getCollapseIcon() {
        ImageButton imageButton = this.f13958h;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public int getContentInsetEnd() {
        Q q8 = this.f13971t;
        if (q8 != null) {
            return q8.a();
        }
        return 0;
    }

    public int getContentInsetEndWithActions() {
        int i8 = this.f13973v;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetEnd();
    }

    public int getContentInsetLeft() {
        Q q8 = this.f13971t;
        if (q8 != null) {
            return q8.b();
        }
        return 0;
    }

    public int getContentInsetRight() {
        Q q8 = this.f13971t;
        if (q8 != null) {
            return q8.c();
        }
        return 0;
    }

    public int getContentInsetStart() {
        Q q8 = this.f13971t;
        if (q8 != null) {
            return q8.d();
        }
        return 0;
    }

    public int getContentInsetStartWithNavigation() {
        int i8 = this.f13972u;
        return i8 != Integer.MIN_VALUE ? i8 : getContentInsetStart();
    }

    public int getCurrentContentInsetEnd() {
        androidx.appcompat.view.menu.e eVarJ;
        ActionMenuView actionMenuView = this.f13944a;
        return (actionMenuView == null || (eVarJ = actionMenuView.J()) == null || !eVarJ.hasVisibleItems()) ? getContentInsetEnd() : Math.max(getContentInsetEnd(), Math.max(this.f13973v, 0));
    }

    public int getCurrentContentInsetLeft() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetEnd() : getCurrentContentInsetStart();
    }

    public int getCurrentContentInsetRight() {
        return getLayoutDirection() == 1 ? getCurrentContentInsetStart() : getCurrentContentInsetEnd();
    }

    public int getCurrentContentInsetStart() {
        return getNavigationIcon() != null ? Math.max(getContentInsetStart(), Math.max(this.f13972u, 0)) : getContentInsetStart();
    }

    public Drawable getLogo() {
        ImageView imageView = this.f13952e;
        if (imageView != null) {
            return imageView.getDrawable();
        }
        return null;
    }

    public CharSequence getLogoDescription() {
        ImageView imageView = this.f13952e;
        if (imageView != null) {
            return imageView.getContentDescription();
        }
        return null;
    }

    public Menu getMenu() {
        k();
        return this.f13944a.getMenu();
    }

    public View getNavButtonView() {
        return this.f13950d;
    }

    public CharSequence getNavigationContentDescription() {
        ImageButton imageButton = this.f13950d;
        if (imageButton != null) {
            return imageButton.getContentDescription();
        }
        return null;
    }

    public Drawable getNavigationIcon() {
        ImageButton imageButton = this.f13950d;
        if (imageButton != null) {
            return imageButton.getDrawable();
        }
        return null;
    }

    public androidx.appcompat.widget.a getOuterActionMenuPresenter() {
        return this.f13943W;
    }

    public Drawable getOverflowIcon() {
        k();
        return this.f13944a.getOverflowIcon();
    }

    public Context getPopupContext() {
        return this.f13961j;
    }

    public int getPopupTheme() {
        return this.f13962k;
    }

    public CharSequence getSubtitle() {
        return this.f13976y;
    }

    public final TextView getSubtitleTextView() {
        return this.f13948c;
    }

    public CharSequence getTitle() {
        return this.f13975x;
    }

    public int getTitleMarginBottom() {
        return this.f13970s;
    }

    public int getTitleMarginEnd() {
        return this.f13968q;
    }

    public int getTitleMarginStart() {
        return this.f13967p;
    }

    public int getTitleMarginTop() {
        return this.f13969r;
    }

    public final TextView getTitleTextView() {
        return this.f13946b;
    }

    public G getWrapper() {
        if (this.f13942V == null) {
            this.f13942V = new androidx.appcompat.widget.d(this, true);
        }
        return this.f13942V;
    }

    public void h() {
        if (this.f13958h == null) {
            C2713o c2713o = new C2713o(getContext(), null, p054g.a.f22369O);
            this.f13958h = c2713o;
            c2713o.setImageDrawable(this.f13954f);
            this.f13958h.setContentDescription(this.f13956g);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f23881a = (this.f13965n & 112) | 8388611;
            gVarGenerateDefaultLayoutParams.f13985b = 2;
            this.f13958h.setLayoutParams(gVarGenerateDefaultLayoutParams);
            this.f13958h.setOnClickListener(new d());
        }
    }

    public final void i() {
        if (this.f13971t == null) {
            this.f13971t = new Q();
        }
    }

    public final void j() {
        if (this.f13952e == null) {
            this.f13952e = new C2715q(getContext());
        }
    }

    public final void k() {
        l();
        if (this.f13944a.J() == null) {
            androidx.appcompat.view.menu.e eVar = (androidx.appcompat.view.menu.e) this.f13944a.getMenu();
            if (this.f13945a0 == null) {
                this.f13945a0 = new f();
            }
            this.f13944a.setExpandedActionViewsExclusive(true);
            eVar.c(this.f13945a0, this.f13961j);
            S();
        }
    }

    public final void l() {
        if (this.f13944a == null) {
            ActionMenuView actionMenuView = new ActionMenuView(getContext());
            this.f13944a = actionMenuView;
            actionMenuView.setPopupTheme(this.f13962k);
            this.f13944a.setOnMenuItemClickListener(this.f13941I);
            this.f13944a.K(this.f13947b0, new c());
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f23881a = (this.f13965n & 112) | 8388613;
            this.f13944a.setLayoutParams(gVarGenerateDefaultLayoutParams);
            c(this.f13944a, false);
        }
    }

    public final void m() {
        if (this.f13950d == null) {
            this.f13950d = new C2713o(getContext(), null, p054g.a.f22369O);
            g gVarGenerateDefaultLayoutParams = generateDefaultLayoutParams();
            gVarGenerateDefaultLayoutParams.f23881a = (this.f13965n & 112) | 8388611;
            this.f13950d.setLayoutParams(gVarGenerateDefaultLayoutParams);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        S();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        removeCallbacks(this.f13959h0);
        S();
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 9) {
            this.f13935C = false;
        }
        if (!this.f13935C) {
            boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
            if (actionMasked == 9 && !zOnHoverEvent) {
                this.f13935C = true;
            }
        }
        if (actionMasked == 10 || actionMasked == 3) {
            this.f13935C = false;
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0280  */
    /* JADX WARN: Code duplicated, block: B:102:0x0283  */
    /* JADX WARN: Code duplicated, block: B:105:0x0297 A[LOOP:0: B:104:0x0295->B:105:0x0297, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:108:0x02b5 A[LOOP:1: B:107:0x02b3->B:108:0x02b5, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:112:0x02dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x02df  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:117:0x02ec A[LOOP:2: B:116:0x02ea->B:117:0x02ec, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:19:0x0060 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:20:0x0062  */
    /* JADX WARN: Code duplicated, block: B:21:0x0069  */
    /* JADX WARN: Code duplicated, block: B:24:0x0077 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:25:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:30:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:31:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:34:0x00cb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:35:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:36:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:39:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:40:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:42:0x0104  */
    /* JADX WARN: Code duplicated, block: B:43:0x011d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0127 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:49:0x0129  */
    /* JADX WARN: Code duplicated, block: B:50:0x012c  */
    /* JADX WARN: Code duplicated, block: B:52:0x0130  */
    /* JADX WARN: Code duplicated, block: B:53:0x0133  */
    /* JADX WARN: Code duplicated, block: B:56:0x0145  */
    /* JADX WARN: Code duplicated, block: B:58:0x014d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:65:0x0166  */
    /* JADX WARN: Code duplicated, block: B:67:0x016a  */
    /* JADX WARN: Code duplicated, block: B:69:0x017d  */
    /* JADX WARN: Code duplicated, block: B:70:0x0180  */
    /* JADX WARN: Code duplicated, block: B:72:0x018c  */
    /* JADX WARN: Code duplicated, block: B:74:0x0198  */
    /* JADX WARN: Code duplicated, block: B:75:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:77:0x01af A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:79:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:82:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:83:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x0212  */
    /* JADX WARN: Code duplicated, block: B:88:0x0215  */
    /* JADX WARN: Code duplicated, block: B:90:0x021e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:91:0x0220  */
    /* JADX WARN: Code duplicated, block: B:93:0x0224  */
    /* JADX WARN: Code duplicated, block: B:96:0x0238  */
    /* JADX WARN: Code duplicated, block: B:97:0x025b  */
    /* JADX WARN: Code duplicated, block: B:99:0x025e  */
    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z8, int i8, int i9, int i10, int i11) {
        int iE;
        int iF;
        int iMax;
        int iMin;
        boolean zQ;
        boolean zQ2;
        int measuredHeight;
        TextView textView;
        TextView textView2;
        g gVar;
        g gVar2;
        int i12;
        boolean z9;
        int i13;
        int i14;
        int paddingTop;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int iMax2;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int size;
        int iE2;
        int i27;
        int size2;
        int i28;
        int i29;
        int i30;
        int size3;
        boolean z10 = getLayoutDirection() == 1;
        int width = getWidth();
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingRight = getPaddingRight();
        int paddingTop2 = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int i31 = width - paddingRight;
        int[] iArr = this.f13938F;
        iArr[1] = 0;
        iArr[0] = 0;
        int iO = I.o(this);
        int iMin2 = iO >= 0 ? Math.min(iO, i11 - i9) : 0;
        if (Q(this.f13950d)) {
            if (z10) {
                iF = F(this.f13950d, i31, iArr, iMin2);
                iE = paddingLeft;
            } else {
                iE = E(this.f13950d, paddingLeft, iArr, iMin2);
            }
            if (Q(this.f13958h)) {
                if (z10) {
                    iF = F(this.f13958h, iF, iArr, iMin2);
                } else {
                    iE = E(this.f13958h, iE, iArr, iMin2);
                }
            }
            if (Q(this.f13944a)) {
                if (z10) {
                    iE = E(this.f13944a, iE, iArr, iMin2);
                } else {
                    iF = F(this.f13944a, iF, iArr, iMin2);
                }
            }
            int currentContentInsetLeft = getCurrentContentInsetLeft();
            int currentContentInsetRight = getCurrentContentInsetRight();
            iArr[0] = Math.max(0, currentContentInsetLeft - iE);
            iArr[1] = Math.max(0, currentContentInsetRight - (i31 - iF));
            iMax = Math.max(iE, currentContentInsetLeft);
            iMin = Math.min(iF, i31 - currentContentInsetRight);
            if (Q(this.f13960i)) {
                if (z10) {
                    iMin = F(this.f13960i, iMin, iArr, iMin2);
                } else {
                    iMax = E(this.f13960i, iMax, iArr, iMin2);
                }
            }
            if (Q(this.f13952e)) {
                if (z10) {
                    iMin = F(this.f13952e, iMin, iArr, iMin2);
                } else {
                    iMax = E(this.f13952e, iMax, iArr, iMin2);
                }
            }
            zQ = Q(this.f13946b);
            zQ2 = Q(this.f13948c);
            if (zQ) {
                g gVar3 = (g) this.f13946b.getLayoutParams();
                measuredHeight = ((ViewGroup.MarginLayoutParams) gVar3).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar3).topMargin + this.f13946b.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
            if (zQ2) {
                g gVar4 = (g) this.f13948c.getLayoutParams();
                measuredHeight += ((ViewGroup.MarginLayoutParams) gVar4).topMargin + this.f13948c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar4).bottomMargin;
            }
            if (!zQ || zQ2) {
                if (zQ) {
                    textView = this.f13946b;
                } else {
                    textView = this.f13948c;
                }
                if (zQ2) {
                    textView2 = this.f13948c;
                } else {
                    textView2 = this.f13946b;
                }
                gVar = (g) textView.getLayoutParams();
                gVar2 = (g) textView2.getLayoutParams();
                i12 = measuredHeight;
                z9 = (!zQ && this.f13946b.getMeasuredWidth() > 0) || (zQ2 && this.f13948c.getMeasuredWidth() > 0);
                i13 = this.f13974w & 112;
                i14 = iMax;
                if (i13 == 48) {
                    paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f13969r;
                } else if (i13 != 80) {
                    iMax2 = (((height - paddingTop2) - paddingBottom) - i12) / 2;
                    i22 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                    i23 = this.f13969r;
                    if (iMax2 < i22 + i23) {
                        iMax2 = i22 + i23;
                    } else {
                        i24 = (((height - paddingBottom) - i12) - iMax2) - paddingTop2;
                        i25 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                        i26 = this.f13970s;
                        if (i24 < i25 + i26) {
                            iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i26) - i24));
                        }
                    }
                    paddingTop = paddingTop2 + iMax2;
                } else {
                    paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f13970s) - i12;
                }
                if (z10) {
                    if (z9) {
                        i19 = this.f13967p;
                    } else {
                        i19 = 0;
                    }
                    int i32 = i19 - iArr[1];
                    iMin -= Math.max(0, i32);
                    iArr[1] = Math.max(0, -i32);
                    if (zQ) {
                        g gVar5 = (g) this.f13946b.getLayoutParams();
                        int measuredWidth = iMin - this.f13946b.getMeasuredWidth();
                        int measuredHeight2 = this.f13946b.getMeasuredHeight() + paddingTop;
                        this.f13946b.layout(measuredWidth, paddingTop, iMin, measuredHeight2);
                        i20 = measuredWidth - this.f13968q;
                        paddingTop = measuredHeight2 + ((ViewGroup.MarginLayoutParams) gVar5).bottomMargin;
                    } else {
                        i20 = iMin;
                    }
                    if (zQ2) {
                        int i33 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f13948c.getLayoutParams())).topMargin;
                        this.f13948c.layout(iMin - this.f13948c.getMeasuredWidth(), i33, iMin, this.f13948c.getMeasuredHeight() + i33);
                        i21 = iMin - this.f13968q;
                    } else {
                        i21 = iMin;
                    }
                    if (z9) {
                        iMin = Math.min(i20, i21);
                    }
                    iMax = i14;
                    i16 = 0;
                } else {
                    if (z9) {
                        i15 = this.f13967p;
                    } else {
                        i15 = 0;
                    }
                    i16 = 0;
                    int i34 = i15 - iArr[0];
                    iMax = i14 + Math.max(0, i34);
                    iArr[0] = Math.max(0, -i34);
                    if (zQ) {
                        g gVar6 = (g) this.f13946b.getLayoutParams();
                        int measuredWidth2 = this.f13946b.getMeasuredWidth() + iMax;
                        int measuredHeight3 = this.f13946b.getMeasuredHeight() + paddingTop;
                        this.f13946b.layout(iMax, paddingTop, measuredWidth2, measuredHeight3);
                        i17 = measuredWidth2 + this.f13968q;
                        paddingTop = measuredHeight3 + ((ViewGroup.MarginLayoutParams) gVar6).bottomMargin;
                    } else {
                        i17 = iMax;
                    }
                    if (zQ2) {
                        int i35 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f13948c.getLayoutParams())).topMargin;
                        int measuredWidth3 = this.f13948c.getMeasuredWidth() + iMax;
                        this.f13948c.layout(iMax, i35, measuredWidth3, this.f13948c.getMeasuredHeight() + i35);
                        i18 = measuredWidth3 + this.f13968q;
                    } else {
                        i18 = iMax;
                    }
                    if (z9) {
                        iMax = Math.max(i17, i18);
                    }
                }
            } else {
                i16 = 0;
            }
            b(this.f13936D, 3);
            size = this.f13936D.size();
            iE2 = iMax;
            for (i27 = i16; i27 < size; i27++) {
                iE2 = E((View) this.f13936D.get(i27), iE2, iArr, iMin2);
            }
            b(this.f13936D, 5);
            size2 = this.f13936D.size();
            for (i28 = i16; i28 < size2; i28++) {
                iMin = F((View) this.f13936D.get(i28), iMin, iArr, iMin2);
            }
            b(this.f13936D, 1);
            int iW = w(this.f13936D, iArr);
            i29 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iW / 2);
            i30 = iW + i29;
            if (i29 >= iE2) {
                if (i30 > iMin) {
                    iE2 = i29 - (i30 - iMin);
                } else {
                    iE2 = i29;
                }
            }
            size3 = this.f13936D.size();
            while (i16 < size3) {
                iE2 = E((View) this.f13936D.get(i16), iE2, iArr, iMin2);
                i16++;
            }
            this.f13936D.clear();
        }
        iE = paddingLeft;
        iF = i31;
        if (Q(this.f13958h)) {
            if (z10) {
                iF = F(this.f13958h, iF, iArr, iMin2);
            } else {
                iE = E(this.f13958h, iE, iArr, iMin2);
            }
        }
        if (Q(this.f13944a)) {
            if (z10) {
                iE = E(this.f13944a, iE, iArr, iMin2);
            } else {
                iF = F(this.f13944a, iF, iArr, iMin2);
            }
        }
        int currentContentInsetLeft2 = getCurrentContentInsetLeft();
        int currentContentInsetRight2 = getCurrentContentInsetRight();
        iArr[0] = Math.max(0, currentContentInsetLeft2 - iE);
        iArr[1] = Math.max(0, currentContentInsetRight2 - (i31 - iF));
        iMax = Math.max(iE, currentContentInsetLeft2);
        iMin = Math.min(iF, i31 - currentContentInsetRight2);
        if (Q(this.f13960i)) {
            if (z10) {
                iMin = F(this.f13960i, iMin, iArr, iMin2);
            } else {
                iMax = E(this.f13960i, iMax, iArr, iMin2);
            }
        }
        if (Q(this.f13952e)) {
            if (z10) {
                iMin = F(this.f13952e, iMin, iArr, iMin2);
            } else {
                iMax = E(this.f13952e, iMax, iArr, iMin2);
            }
        }
        zQ = Q(this.f13946b);
        zQ2 = Q(this.f13948c);
        if (zQ) {
            g gVar7 = (g) this.f13946b.getLayoutParams();
            measuredHeight = ((ViewGroup.MarginLayoutParams) gVar7).bottomMargin + ((ViewGroup.MarginLayoutParams) gVar7).topMargin + this.f13946b.getMeasuredHeight();
        } else {
            measuredHeight = 0;
        }
        if (zQ2) {
            g gVar8 = (g) this.f13948c.getLayoutParams();
            measuredHeight += ((ViewGroup.MarginLayoutParams) gVar8).topMargin + this.f13948c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar8).bottomMargin;
        }
        if (zQ) {
            if (zQ) {
                textView = this.f13946b;
            } else {
                textView = this.f13948c;
            }
            if (zQ2) {
                textView2 = this.f13948c;
            } else {
                textView2 = this.f13946b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i12 = measuredHeight;
            if (zQ) {
            }
            i13 = this.f13974w & 112;
            i14 = iMax;
            if (i13 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f13969r;
            } else if (i13 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i12) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i23 = this.f13969r;
                if (iMax2 < i22 + i23) {
                    iMax2 = i22 + i23;
                } else {
                    i24 = (((height - paddingBottom) - i12) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i26 = this.f13970s;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f13970s) - i12;
            }
            if (z10) {
                if (z9) {
                    i19 = this.f13967p;
                } else {
                    i19 = 0;
                }
                int i36 = i19 - iArr[1];
                iMin -= Math.max(0, i36);
                iArr[1] = Math.max(0, -i36);
                if (zQ) {
                    g gVar9 = (g) this.f13946b.getLayoutParams();
                    int measuredWidth4 = iMin - this.f13946b.getMeasuredWidth();
                    int measuredHeight4 = this.f13946b.getMeasuredHeight() + paddingTop;
                    this.f13946b.layout(measuredWidth4, paddingTop, iMin, measuredHeight4);
                    i20 = measuredWidth4 - this.f13968q;
                    paddingTop = measuredHeight4 + ((ViewGroup.MarginLayoutParams) gVar9).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zQ2) {
                    int i37 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f13948c.getLayoutParams())).topMargin;
                    this.f13948c.layout(iMin - this.f13948c.getMeasuredWidth(), i37, iMin, this.f13948c.getMeasuredHeight() + i37);
                    i21 = iMin - this.f13968q;
                } else {
                    i21 = iMin;
                }
                if (z9) {
                    iMin = Math.min(i20, i21);
                }
                iMax = i14;
                i16 = 0;
            } else {
                if (z9) {
                    i15 = this.f13967p;
                } else {
                    i15 = 0;
                }
                i16 = 0;
                int i38 = i15 - iArr[0];
                iMax = i14 + Math.max(0, i38);
                iArr[0] = Math.max(0, -i38);
                if (zQ) {
                    g gVar10 = (g) this.f13946b.getLayoutParams();
                    int measuredWidth5 = this.f13946b.getMeasuredWidth() + iMax;
                    int measuredHeight5 = this.f13946b.getMeasuredHeight() + paddingTop;
                    this.f13946b.layout(iMax, paddingTop, measuredWidth5, measuredHeight5);
                    i17 = measuredWidth5 + this.f13968q;
                    paddingTop = measuredHeight5 + ((ViewGroup.MarginLayoutParams) gVar10).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zQ2) {
                    int i39 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f13948c.getLayoutParams())).topMargin;
                    int measuredWidth6 = this.f13948c.getMeasuredWidth() + iMax;
                    this.f13948c.layout(iMax, i39, measuredWidth6, this.f13948c.getMeasuredHeight() + i39);
                    i18 = measuredWidth6 + this.f13968q;
                } else {
                    i18 = iMax;
                }
                if (z9) {
                    iMax = Math.max(i17, i18);
                }
            }
        } else {
            if (zQ) {
                textView = this.f13946b;
            } else {
                textView = this.f13948c;
            }
            if (zQ2) {
                textView2 = this.f13948c;
            } else {
                textView2 = this.f13946b;
            }
            gVar = (g) textView.getLayoutParams();
            gVar2 = (g) textView2.getLayoutParams();
            i12 = measuredHeight;
            if (zQ) {
            }
            i13 = this.f13974w & 112;
            i14 = iMax;
            if (i13 == 48) {
                paddingTop = getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + this.f13969r;
            } else if (i13 != 80) {
                iMax2 = (((height - paddingTop2) - paddingBottom) - i12) / 2;
                i22 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
                i23 = this.f13969r;
                if (iMax2 < i22 + i23) {
                    iMax2 = i22 + i23;
                } else {
                    i24 = (((height - paddingBottom) - i12) - iMax2) - paddingTop2;
                    i25 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
                    i26 = this.f13970s;
                    if (i24 < i25 + i26) {
                        iMax2 = Math.max(0, iMax2 - ((((ViewGroup.MarginLayoutParams) gVar2).bottomMargin + i26) - i24));
                    }
                }
                paddingTop = paddingTop2 + iMax2;
            } else {
                paddingTop = (((height - paddingBottom) - ((ViewGroup.MarginLayoutParams) gVar2).bottomMargin) - this.f13970s) - i12;
            }
            if (z10) {
                if (z9) {
                    i19 = this.f13967p;
                } else {
                    i19 = 0;
                }
                int i310 = i19 - iArr[1];
                iMin -= Math.max(0, i310);
                iArr[1] = Math.max(0, -i310);
                if (zQ) {
                    g gVar11 = (g) this.f13946b.getLayoutParams();
                    int measuredWidth7 = iMin - this.f13946b.getMeasuredWidth();
                    int measuredHeight6 = this.f13946b.getMeasuredHeight() + paddingTop;
                    this.f13946b.layout(measuredWidth7, paddingTop, iMin, measuredHeight6);
                    i20 = measuredWidth7 - this.f13968q;
                    paddingTop = measuredHeight6 + ((ViewGroup.MarginLayoutParams) gVar11).bottomMargin;
                } else {
                    i20 = iMin;
                }
                if (zQ2) {
                    int i311 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f13948c.getLayoutParams())).topMargin;
                    this.f13948c.layout(iMin - this.f13948c.getMeasuredWidth(), i311, iMin, this.f13948c.getMeasuredHeight() + i311);
                    i21 = iMin - this.f13968q;
                } else {
                    i21 = iMin;
                }
                if (z9) {
                    iMin = Math.min(i20, i21);
                }
                iMax = i14;
                i16 = 0;
            } else {
                if (z9) {
                    i15 = this.f13967p;
                } else {
                    i15 = 0;
                }
                i16 = 0;
                int i312 = i15 - iArr[0];
                iMax = i14 + Math.max(0, i312);
                iArr[0] = Math.max(0, -i312);
                if (zQ) {
                    g gVar12 = (g) this.f13946b.getLayoutParams();
                    int measuredWidth8 = this.f13946b.getMeasuredWidth() + iMax;
                    int measuredHeight7 = this.f13946b.getMeasuredHeight() + paddingTop;
                    this.f13946b.layout(iMax, paddingTop, measuredWidth8, measuredHeight7);
                    i17 = measuredWidth8 + this.f13968q;
                    paddingTop = measuredHeight7 + ((ViewGroup.MarginLayoutParams) gVar12).bottomMargin;
                } else {
                    i17 = iMax;
                }
                if (zQ2) {
                    int i313 = paddingTop + ((ViewGroup.MarginLayoutParams) ((g) this.f13948c.getLayoutParams())).topMargin;
                    int measuredWidth9 = this.f13948c.getMeasuredWidth() + iMax;
                    this.f13948c.layout(iMax, i313, measuredWidth9, this.f13948c.getMeasuredHeight() + i313);
                    i18 = measuredWidth9 + this.f13968q;
                } else {
                    i18 = iMax;
                }
                if (z9) {
                    iMax = Math.max(i17, i18);
                }
            }
        }
        b(this.f13936D, 3);
        size = this.f13936D.size();
        iE2 = iMax;
        while (i27 < size) {
            iE2 = E((View) this.f13936D.get(i27), iE2, iArr, iMin2);
        }
        b(this.f13936D, 5);
        size2 = this.f13936D.size();
        while (i28 < size2) {
            iMin = F((View) this.f13936D.get(i28), iMin, iArr, iMin2);
        }
        b(this.f13936D, 1);
        int iW2 = w(this.f13936D, iArr);
        i29 = (paddingLeft + (((width - paddingLeft) - paddingRight) / 2)) - (iW2 / 2);
        i30 = iW2 + i29;
        if (i29 >= iE2) {
            if (i30 > iMin) {
                iE2 = i29 - (i30 - iMin);
            } else {
                iE2 = i29;
            }
        }
        size3 = this.f13936D.size();
        while (i16 < size3) {
            iE2 = E((View) this.f13936D.get(i16), iE2, iArr, iMin2);
            i16++;
        }
        this.f13936D.clear();
    }

    @Override // android.view.View
    public void onMeasure(int i8, int i9) {
        int measuredWidth;
        int iMax;
        int iCombineMeasuredStates;
        int measuredWidth2;
        int[] iArr;
        int iMax2;
        int iCombineMeasuredStates2;
        int measuredHeight;
        int[] iArr2 = this.f13938F;
        boolean zB = d0.b(this);
        int i10 = !zB ? 1 : 0;
        if (Q(this.f13950d)) {
            H(this.f13950d, i8, 0, i9, 0, this.f13966o);
            measuredWidth = this.f13950d.getMeasuredWidth() + u(this.f13950d);
            iMax = Math.max(0, this.f13950d.getMeasuredHeight() + v(this.f13950d));
            iCombineMeasuredStates = View.combineMeasuredStates(0, this.f13950d.getMeasuredState());
        } else {
            measuredWidth = 0;
            iMax = 0;
            iCombineMeasuredStates = 0;
        }
        if (Q(this.f13958h)) {
            H(this.f13958h, i8, 0, i9, 0, this.f13966o);
            measuredWidth = this.f13958h.getMeasuredWidth() + u(this.f13958h);
            iMax = Math.max(iMax, this.f13958h.getMeasuredHeight() + v(this.f13958h));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f13958h.getMeasuredState());
        }
        int currentContentInsetStart = getCurrentContentInsetStart();
        int iMax3 = Math.max(currentContentInsetStart, measuredWidth);
        iArr2[zB ? 1 : 0] = Math.max(0, currentContentInsetStart - measuredWidth);
        if (Q(this.f13944a)) {
            H(this.f13944a, i8, iMax3, i9, 0, this.f13966o);
            measuredWidth2 = this.f13944a.getMeasuredWidth() + u(this.f13944a);
            iMax = Math.max(iMax, this.f13944a.getMeasuredHeight() + v(this.f13944a));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f13944a.getMeasuredState());
        } else {
            measuredWidth2 = 0;
        }
        int currentContentInsetEnd = getCurrentContentInsetEnd();
        int iMax4 = iMax3 + Math.max(currentContentInsetEnd, measuredWidth2);
        iArr2[i10] = Math.max(0, currentContentInsetEnd - measuredWidth2);
        if (Q(this.f13960i)) {
            iArr = iArr2;
            iMax4 += G(this.f13960i, i8, iMax4, i9, 0, iArr);
            iMax = Math.max(iMax, this.f13960i.getMeasuredHeight() + v(this.f13960i));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f13960i.getMeasuredState());
        } else {
            iArr = iArr2;
        }
        if (Q(this.f13952e)) {
            iMax4 += G(this.f13952e, i8, iMax4, i9, 0, iArr);
            iMax = Math.max(iMax, this.f13952e.getMeasuredHeight() + v(this.f13952e));
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, this.f13952e.getMeasuredState());
        }
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (((g) childAt.getLayoutParams()).f13985b == 0 && Q(childAt)) {
                iMax4 += G(childAt, i8, iMax4, i9, 0, iArr);
                int iMax5 = Math.max(iMax, childAt.getMeasuredHeight() + v(childAt));
                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, childAt.getMeasuredState());
                iMax = iMax5;
            } else {
                iMax4 = iMax4;
            }
        }
        int i12 = iMax4;
        int i13 = this.f13969r + this.f13970s;
        int i14 = this.f13967p + this.f13968q;
        if (Q(this.f13946b)) {
            G(this.f13946b, i8, i12 + i14, i9, i13, iArr);
            int measuredWidth3 = this.f13946b.getMeasuredWidth() + u(this.f13946b);
            int measuredHeight2 = this.f13946b.getMeasuredHeight() + v(this.f13946b);
            iMax2 = measuredWidth3;
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f13946b.getMeasuredState());
            measuredHeight = measuredHeight2;
        } else {
            iMax2 = 0;
            iCombineMeasuredStates2 = iCombineMeasuredStates;
            measuredHeight = 0;
        }
        if (Q(this.f13948c)) {
            iMax2 = Math.max(iMax2, G(this.f13948c, i8, i12 + i14, i9, i13 + measuredHeight, iArr));
            measuredHeight += this.f13948c.getMeasuredHeight() + v(this.f13948c);
            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, this.f13948c.getMeasuredState());
        }
        setMeasuredDimension(View.resolveSizeAndState(Math.max(i12 + iMax2 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i8, (-16777216) & iCombineMeasuredStates2), P() ? 0 : View.resolveSizeAndState(Math.max(Math.max(iMax, measuredHeight) + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i9, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        MenuItem menuItemFindItem;
        if (!(parcelable instanceof i)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        i iVar = (i) parcelable;
        super.onRestoreInstanceState(iVar.a());
        ActionMenuView actionMenuView = this.f13944a;
        androidx.appcompat.view.menu.e eVarJ = actionMenuView != null ? actionMenuView.J() : null;
        int i8 = iVar.f13986c;
        if (i8 != 0 && this.f13945a0 != null && eVarJ != null && (menuItemFindItem = eVarJ.findItem(i8)) != null) {
            menuItemFindItem.expandActionView();
        }
        if (iVar.f13987d) {
            J();
        }
    }

    @Override // android.view.View
    public void onRtlPropertiesChanged(int i8) {
        super.onRtlPropertiesChanged(i8);
        i();
        this.f13971t.f(i8 == 1);
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        androidx.appcompat.view.menu.g gVar;
        i iVar = new i(super.onSaveInstanceState());
        f fVar = this.f13945a0;
        if (fVar != null && (gVar = fVar.f13983b) != null) {
            iVar.f13986c = gVar.getItemId();
        }
        iVar.f13987d = D();
        return iVar;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f13934B = false;
        }
        if (!this.f13934B) {
            boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
            if (actionMasked == 0 && !zOnTouchEvent) {
                this.f13934B = true;
            }
        }
        if (actionMasked == 1 || actionMasked == 3) {
            this.f13934B = false;
        }
        return true;
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        if (layoutParams instanceof p063h.a.C0553a) {
            return new g((p063h.a.C0553a) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    public final int q(int i8) {
        int layoutDirection = getLayoutDirection();
        int iA = AbstractC1651m.a(i8, layoutDirection) & 7;
        if (iA == 1 || iA == 3 || iA == 5) {
            return iA;
        }
        return layoutDirection == 1 ? 5 : 3;
    }

    public final int r(View view, int i8) {
        g gVar = (g) view.getLayoutParams();
        int measuredHeight = view.getMeasuredHeight();
        int i9 = i8 > 0 ? (measuredHeight - i8) / 2 : 0;
        int iT = t(gVar.f23881a);
        if (iT == 48) {
            return getPaddingTop() - i9;
        }
        if (iT == 80) {
            return (((getHeight() - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) - i9;
        }
        int paddingTop = getPaddingTop();
        int paddingBottom = getPaddingBottom();
        int height = getHeight();
        int iMax = (((height - paddingTop) - paddingBottom) - measuredHeight) / 2;
        int i10 = ((ViewGroup.MarginLayoutParams) gVar).topMargin;
        if (iMax < i10) {
            iMax = i10;
        } else {
            int i11 = (((height - paddingBottom) - measuredHeight) - iMax) - paddingTop;
            int i12 = ((ViewGroup.MarginLayoutParams) gVar).bottomMargin;
            if (i11 < i12) {
                iMax = Math.max(0, iMax - (i12 - i11));
            }
        }
        return paddingTop + iMax;
    }

    @Override // U1.InterfaceC1654p
    public void s(InterfaceC1656s interfaceC1656s) {
        this.f13939G.f(interfaceC1656s);
    }

    public void setBackInvokedCallbackEnabled(boolean z8) {
        if (this.f13957g0 != z8) {
            this.f13957g0 = z8;
            S();
        }
    }

    public void setCollapseContentDescription(int i8) {
        setCollapseContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setCollapseIcon(int i8) {
        setCollapseIcon(p072i.a.b(getContext(), i8));
    }

    public void setCollapsible(boolean z8) {
        this.f13951d0 = z8;
        requestLayout();
    }

    public void setContentInsetEndWithActions(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.f13973v) {
            this.f13973v = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setContentInsetStartWithNavigation(int i8) {
        if (i8 < 0) {
            i8 = Integer.MIN_VALUE;
        }
        if (i8 != this.f13972u) {
            this.f13972u = i8;
            if (getNavigationIcon() != null) {
                requestLayout();
            }
        }
    }

    public void setLogo(int i8) {
        setLogo(p072i.a.b(getContext(), i8));
    }

    public void setLogoDescription(int i8) {
        setLogoDescription(getContext().getText(i8));
    }

    public void setNavigationContentDescription(int i8) {
        setNavigationContentDescription(i8 != 0 ? getContext().getText(i8) : null);
    }

    public void setNavigationIcon(int i8) {
        setNavigationIcon(p072i.a.b(getContext(), i8));
    }

    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        m();
        this.f13950d.setOnClickListener(onClickListener);
    }

    public void setOverflowIcon(Drawable drawable) {
        k();
        this.f13944a.setOverflowIcon(drawable);
    }

    public void setPopupTheme(int i8) {
        if (this.f13962k != i8) {
            this.f13962k = i8;
            if (i8 == 0) {
                this.f13961j = getContext();
            } else {
                this.f13961j = new ContextThemeWrapper(getContext(), i8);
            }
        }
    }

    public void setSubtitle(int i8) {
        setSubtitle(getContext().getText(i8));
    }

    public void setSubtitleTextColor(int i8) {
        setSubtitleTextColor(ColorStateList.valueOf(i8));
    }

    public void setTitle(int i8) {
        setTitle(getContext().getText(i8));
    }

    public void setTitleMarginBottom(int i8) {
        this.f13970s = i8;
        requestLayout();
    }

    public void setTitleMarginEnd(int i8) {
        this.f13968q = i8;
        requestLayout();
    }

    public void setTitleMarginStart(int i8) {
        this.f13967p = i8;
        requestLayout();
    }

    public void setTitleMarginTop(int i8) {
        this.f13969r = i8;
        requestLayout();
    }

    public void setTitleTextColor(int i8) {
        setTitleTextColor(ColorStateList.valueOf(i8));
    }

    public final int t(int i8) {
        int i9 = i8 & 112;
        return (i9 == 16 || i9 == 48 || i9 == 80) ? i9 : this.f13974w & 112;
    }

    public final int u(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.getMarginStart() + marginLayoutParams.getMarginEnd();
    }

    public final int v(View view) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        return marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
    }

    public final int w(List list, int[] iArr) {
        int i8 = iArr[0];
        int i9 = iArr[1];
        int size = list.size();
        int i10 = 0;
        int measuredWidth = 0;
        while (i10 < size) {
            View view = (View) list.get(i10);
            g gVar = (g) view.getLayoutParams();
            int i11 = ((ViewGroup.MarginLayoutParams) gVar).leftMargin - i8;
            int i12 = ((ViewGroup.MarginLayoutParams) gVar).rightMargin - i9;
            int iMax = Math.max(0, i11);
            int iMax2 = Math.max(0, i12);
            int iMax3 = Math.max(0, -i11);
            int iMax4 = Math.max(0, -i12);
            measuredWidth += iMax + view.getMeasuredWidth() + iMax2;
            i10++;
            i9 = iMax4;
            i8 = iMax3;
        }
        return measuredWidth;
    }

    public boolean x() {
        f fVar = this.f13945a0;
        return (fVar == null || fVar.f13983b == null) ? false : true;
    }

    public boolean y() {
        ActionMenuView actionMenuView = this.f13944a;
        return actionMenuView != null && actionMenuView.D();
    }

    public void z(int i8) {
        getMenuInflater().inflate(i8, getMenu());
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class g extends p063h.a.C0553a {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f13985b;

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f13985b = 0;
        }

        public void a(ViewGroup.MarginLayoutParams marginLayoutParams) {
            ((ViewGroup.MarginLayoutParams) this).leftMargin = marginLayoutParams.leftMargin;
            ((ViewGroup.MarginLayoutParams) this).topMargin = marginLayoutParams.topMargin;
            ((ViewGroup.MarginLayoutParams) this).rightMargin = marginLayoutParams.rightMargin;
            ((ViewGroup.MarginLayoutParams) this).bottomMargin = marginLayoutParams.bottomMargin;
        }

        public g(int i8, int i9) {
            super(i8, i9);
            this.f13985b = 0;
            this.f23881a = 8388627;
        }

        public g(int i8, int i9, int i10) {
            super(i8, i9);
            this.f13985b = 0;
            this.f23881a = i10;
        }

        public g(int i8) {
            this(-2, -1, i8);
        }

        public g(g gVar) {
            super((p063h.a.C0553a) gVar);
            this.f13985b = 0;
            this.f13985b = gVar.f13985b;
        }

        public g(p063h.a.C0553a c0553a) {
            super(c0553a);
            this.f13985b = 0;
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f13985b = 0;
            a(marginLayoutParams);
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f13985b = 0;
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, p054g.a.f22370P);
    }

    public void setCollapseContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            h();
        }
        ImageButton imageButton = this.f13958h;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
        }
    }

    public void setCollapseIcon(Drawable drawable) {
        if (drawable != null) {
            h();
            this.f13958h.setImageDrawable(drawable);
        } else {
            ImageButton imageButton = this.f13958h;
            if (imageButton != null) {
                imageButton.setImageDrawable(this.f13954f);
            }
        }
    }

    public void setLogo(Drawable drawable) {
        if (drawable != null) {
            j();
            if (!B(this.f13952e)) {
                c(this.f13952e, true);
            }
        } else {
            ImageView imageView = this.f13952e;
            if (imageView != null && B(imageView)) {
                removeView(this.f13952e);
                this.f13937E.remove(this.f13952e);
            }
        }
        ImageView imageView2 = this.f13952e;
        if (imageView2 != null) {
            imageView2.setImageDrawable(drawable);
        }
    }

    public void setLogoDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            j();
        }
        ImageView imageView = this.f13952e;
        if (imageView != null) {
            imageView.setContentDescription(charSequence);
        }
    }

    public void setNavigationContentDescription(CharSequence charSequence) {
        if (!TextUtils.isEmpty(charSequence)) {
            m();
        }
        ImageButton imageButton = this.f13950d;
        if (imageButton != null) {
            imageButton.setContentDescription(charSequence);
            b0.a(this.f13950d, charSequence);
        }
    }

    public void setNavigationIcon(Drawable drawable) {
        if (drawable != null) {
            m();
            if (!B(this.f13950d)) {
                c(this.f13950d, true);
            }
        } else {
            ImageButton imageButton = this.f13950d;
            if (imageButton != null && B(imageButton)) {
                removeView(this.f13950d);
                this.f13937E.remove(this.f13950d);
            }
        }
        ImageButton imageButton2 = this.f13950d;
        if (imageButton2 != null) {
            imageButton2.setImageDrawable(drawable);
        }
    }

    public void setSubtitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f13948c;
            if (textView != null && B(textView)) {
                removeView(this.f13948c);
                this.f13937E.remove(this.f13948c);
            }
        } else {
            if (this.f13948c == null) {
                Context context = getContext();
                C c8 = new C(context);
                this.f13948c = c8;
                c8.setSingleLine();
                this.f13948c.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.f13964m;
                if (i8 != 0) {
                    this.f13948c.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.f13933A;
                if (colorStateList != null) {
                    this.f13948c.setTextColor(colorStateList);
                }
            }
            if (!B(this.f13948c)) {
                c(this.f13948c, true);
            }
        }
        TextView textView2 = this.f13948c;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f13976y = charSequence;
    }

    public void setSubtitleTextColor(ColorStateList colorStateList) {
        this.f13933A = colorStateList;
        TextView textView = this.f13948c;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public void setTitle(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            TextView textView = this.f13946b;
            if (textView != null && B(textView)) {
                removeView(this.f13946b);
                this.f13937E.remove(this.f13946b);
            }
        } else {
            if (this.f13946b == null) {
                Context context = getContext();
                C c8 = new C(context);
                this.f13946b = c8;
                c8.setSingleLine();
                this.f13946b.setEllipsize(TextUtils.TruncateAt.END);
                int i8 = this.f13963l;
                if (i8 != 0) {
                    this.f13946b.setTextAppearance(context, i8);
                }
                ColorStateList colorStateList = this.f13977z;
                if (colorStateList != null) {
                    this.f13946b.setTextColor(colorStateList);
                }
            }
            if (!B(this.f13946b)) {
                c(this.f13946b, true);
            }
        }
        TextView textView2 = this.f13946b;
        if (textView2 != null) {
            textView2.setText(charSequence);
        }
        this.f13975x = charSequence;
    }

    public void setTitleTextColor(ColorStateList colorStateList) {
        this.f13977z = colorStateList;
        TextView textView = this.f13946b;
        if (textView != null) {
            textView.setTextColor(colorStateList);
        }
    }

    public Toolbar(Context context, AttributeSet attributeSet, int i8) {
        super(context, attributeSet, i8);
        this.f13974w = 8388627;
        this.f13936D = new ArrayList();
        this.f13937E = new ArrayList();
        this.f13938F = new int[2];
        this.f13939G = new C1655q(new Runnable() { // from class: n.Z
            @Override // java.lang.Runnable
            public final void run() {
                this.f30343a.A();
            }
        });
        this.f13940H = new ArrayList();
        this.f13941I = new a();
        this.f13959h0 = new b();
        X xU = X.u(getContext(), attributeSet, j.f22599O2, i8, 0);
        I.G(this, context, j.f22599O2, attributeSet, xU.q(), i8, 0);
        this.f13963l = xU.m(j.f22728q3, 0);
        this.f13964m = xU.m(j.f22683h3, 0);
        this.f13974w = xU.k(j.f22603P2, this.f13974w);
        this.f13965n = xU.k(j.f22607Q2, 48);
        int iD = xU.d(j.f22698k3, 0);
        iD = xU.r(j.f22723p3) ? xU.d(j.f22723p3, iD) : iD;
        this.f13970s = iD;
        this.f13969r = iD;
        this.f13968q = iD;
        this.f13967p = iD;
        int iD2 = xU.d(j.f22713n3, -1);
        if (iD2 >= 0) {
            this.f13967p = iD2;
        }
        int iD3 = xU.d(j.f22708m3, -1);
        if (iD3 >= 0) {
            this.f13968q = iD3;
        }
        int iD4 = xU.d(j.f22718o3, -1);
        if (iD4 >= 0) {
            this.f13969r = iD4;
        }
        int iD5 = xU.d(j.f22703l3, -1);
        if (iD5 >= 0) {
            this.f13970s = iD5;
        }
        this.f13966o = xU.e(j.f22653b3, -1);
        int iD6 = xU.d(j.f22635X2, Integer.MIN_VALUE);
        int iD7 = xU.d(j.f22619T2, Integer.MIN_VALUE);
        int iE = xU.e(j.f22627V2, 0);
        int iE2 = xU.e(j.f22631W2, 0);
        i();
        this.f13971t.e(iE, iE2);
        if (iD6 != Integer.MIN_VALUE || iD7 != Integer.MIN_VALUE) {
            this.f13971t.g(iD6, iD7);
        }
        this.f13972u = xU.d(j.f22639Y2, Integer.MIN_VALUE);
        this.f13973v = xU.d(j.f22623U2, Integer.MIN_VALUE);
        this.f13954f = xU.f(j.f22615S2);
        this.f13956g = xU.o(j.f22611R2);
        CharSequence charSequenceO = xU.o(j.f22693j3);
        if (!TextUtils.isEmpty(charSequenceO)) {
            setTitle(charSequenceO);
        }
        CharSequence charSequenceO2 = xU.o(j.f22678g3);
        if (!TextUtils.isEmpty(charSequenceO2)) {
            setSubtitle(charSequenceO2);
        }
        this.f13961j = getContext();
        setPopupTheme(xU.m(j.f22673f3, 0));
        Drawable drawableF = xU.f(j.f22668e3);
        if (drawableF != null) {
            setNavigationIcon(drawableF);
        }
        CharSequence charSequenceO3 = xU.o(j.f22663d3);
        if (!TextUtils.isEmpty(charSequenceO3)) {
            setNavigationContentDescription(charSequenceO3);
        }
        Drawable drawableF2 = xU.f(j.f22643Z2);
        if (drawableF2 != null) {
            setLogo(drawableF2);
        }
        CharSequence charSequenceO4 = xU.o(j.f22648a3);
        if (!TextUtils.isEmpty(charSequenceO4)) {
            setLogoDescription(charSequenceO4);
        }
        if (xU.r(j.f22733r3)) {
            setTitleTextColor(xU.c(j.f22733r3));
        }
        if (xU.r(j.f22688i3)) {
            setSubtitleTextColor(xU.c(j.f22688i3));
        }
        if (xU.r(j.f22658c3)) {
            z(xU.m(j.f22658c3, 0));
        }
        xU.w();
    }

    public void setOnMenuItemClickListener(h hVar) {
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class f implements androidx.appcompat.view.menu.i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public androidx.appcompat.view.menu.e f13982a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public androidx.appcompat.view.menu.g f13983b;

        public f() {
        }

        @Override // androidx.appcompat.view.menu.i
        public void d(boolean z8) {
            if (this.f13983b != null) {
                androidx.appcompat.view.menu.e eVar = this.f13982a;
                if (eVar != null) {
                    int size = eVar.size();
                    for (int i8 = 0; i8 < size; i8++) {
                        if (this.f13982a.getItem(i8) == this.f13983b) {
                            return;
                        }
                    }
                }
                f(this.f13982a, this.f13983b);
            }
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean e() {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean f(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            KeyEvent.Callback callback = Toolbar.this.f13960i;
            if (callback instanceof p099l.c) {
                ((p099l.c) callback).onActionViewCollapsed();
            }
            Toolbar toolbar = Toolbar.this;
            toolbar.removeView(toolbar.f13960i);
            Toolbar toolbar2 = Toolbar.this;
            toolbar2.removeView(toolbar2.f13958h);
            Toolbar toolbar3 = Toolbar.this;
            toolbar3.f13960i = null;
            toolbar3.a();
            this.f13983b = null;
            Toolbar.this.requestLayout();
            gVar.r(false);
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean g(androidx.appcompat.view.menu.e eVar, androidx.appcompat.view.menu.g gVar) {
            Toolbar.this.h();
            ViewParent parent = Toolbar.this.f13958h.getParent();
            Toolbar toolbar = Toolbar.this;
            if (parent != toolbar) {
                if (parent instanceof ViewGroup) {
                    ((ViewGroup) parent).removeView(toolbar.f13958h);
                }
                Toolbar toolbar2 = Toolbar.this;
                toolbar2.addView(toolbar2.f13958h);
            }
            Toolbar.this.f13960i = gVar.getActionView();
            this.f13983b = gVar;
            ViewParent parent2 = Toolbar.this.f13960i.getParent();
            Toolbar toolbar3 = Toolbar.this;
            if (parent2 != toolbar3) {
                if (parent2 instanceof ViewGroup) {
                    ((ViewGroup) parent2).removeView(toolbar3.f13960i);
                }
                g gVarGenerateDefaultLayoutParams = Toolbar.this.generateDefaultLayoutParams();
                Toolbar toolbar4 = Toolbar.this;
                gVarGenerateDefaultLayoutParams.f23881a = (toolbar4.f13965n & 112) | 8388611;
                gVarGenerateDefaultLayoutParams.f13985b = 2;
                toolbar4.f13960i.setLayoutParams(gVarGenerateDefaultLayoutParams);
                Toolbar toolbar5 = Toolbar.this;
                toolbar5.addView(toolbar5.f13960i);
            }
            Toolbar.this.K();
            Toolbar.this.requestLayout();
            gVar.r(true);
            KeyEvent.Callback callback = Toolbar.this.f13960i;
            if (callback instanceof p099l.c) {
                ((p099l.c) callback).onActionViewExpanded();
            }
            Toolbar.this.S();
            return true;
        }

        @Override // androidx.appcompat.view.menu.i
        public void i(Context context, androidx.appcompat.view.menu.e eVar) {
            androidx.appcompat.view.menu.g gVar;
            androidx.appcompat.view.menu.e eVar2 = this.f13982a;
            if (eVar2 != null && (gVar = this.f13983b) != null) {
                eVar2.f(gVar);
            }
            this.f13982a = eVar;
        }

        @Override // androidx.appcompat.view.menu.i
        public boolean k(l lVar) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.i
        public void c(androidx.appcompat.view.menu.e eVar, boolean z8) {
        }
    }
}
