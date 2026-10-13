package androidx.appcompat.widget;

import U1.AbstractC1640b;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.view.menu.ActionMenuItemView;
import androidx.appcompat.view.menu.g;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.i;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.l;
import java.util.ArrayList;
import p117n.C2715q;
import p117n.K;
import p117n.b0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a extends androidx.appcompat.view.menu.a implements AbstractC1640b.a {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public c f13992A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public b f13993B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final f f13994C;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public int f13995D;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public d f13996k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f13997l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f13998m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public boolean f13999n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public boolean f14000o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14001p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f14002q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public int f14003r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f14004s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f14005t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f14006u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f14007v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public int f14008w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public final SparseBooleanArray f14009x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public e f14010y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public C0342a f14011z;

    /* JADX INFO: renamed from: androidx.appcompat.widget.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class C0342a extends h {
        public C0342a(Context context, l lVar, View view) {
            super(context, lVar, view, false, p054g.a.f22383m);
            if (!((g) lVar.getItem()).l()) {
                View view2 = a.this.f13996k;
                f(view2 == null ? (View) a.this.f13608i : view2);
            }
            j(a.this.f13994C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            a aVar = a.this;
            aVar.f14011z = null;
            aVar.f13995D = 0;
            super.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends ActionMenuItemView.b {
        public b() {
        }

        @Override // androidx.appcompat.view.menu.ActionMenuItemView.b
        public p108m.f a() {
            C0342a c0342a = a.this.f14011z;
            if (c0342a != null) {
                return c0342a.c();
            }
            return null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public e f14014a;

        public c(e eVar) {
            this.f14014a = eVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (a.this.f13602c != null) {
                a.this.f13602c.d();
            }
            View view = (View) a.this.f13608i;
            if (view != null && view.getWindowToken() != null && this.f14014a.m()) {
                a.this.f14010y = this.f14014a;
            }
            a.this.f13992A = null;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d extends C2715q implements ActionMenuView.a {

        /* JADX INFO: renamed from: androidx.appcompat.widget.a$d$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class C0343a extends K {

            /* JADX INFO: renamed from: j, reason: collision with root package name */
            public final /* synthetic */ a f14017j;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0343a(View view, a aVar) {
                super(view);
                this.f14017j = aVar;
            }

            @Override // p117n.K
            public p108m.f b() {
                e eVar = a.this.f14010y;
                if (eVar == null) {
                    return null;
                }
                return eVar.c();
            }

            @Override // p117n.K
            public boolean c() {
                a.this.K();
                return true;
            }

            @Override // p117n.K
            public boolean d() {
                a aVar = a.this;
                if (aVar.f13992A != null) {
                    return false;
                }
                aVar.B();
                return true;
            }
        }

        public d(Context context) {
            super(context, null, p054g.a.f22382l);
            setClickable(true);
            setFocusable(true);
            setVisibility(0);
            setEnabled(true);
            b0.a(this, getContentDescription());
            setOnTouchListener(new C0343a(this, a.this));
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean a() {
            return false;
        }

        @Override // androidx.appcompat.widget.ActionMenuView.a
        public boolean b() {
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            if (super.performClick()) {
                return true;
            }
            playSoundEffect(0);
            a.this.K();
            return true;
        }

        @Override // android.widget.ImageView
        public boolean setFrame(int i8, int i9, int i10, int i11) {
            boolean frame = super.setFrame(i8, i9, i10, i11);
            Drawable drawable = getDrawable();
            Drawable background = getBackground();
            if (drawable != null && background != null) {
                int width = getWidth();
                int height = getHeight();
                int iMax = Math.max(width, height) / 2;
                int paddingLeft = (width + (getPaddingLeft() - getPaddingRight())) / 2;
                int paddingTop = (height + (getPaddingTop() - getPaddingBottom())) / 2;
                M1.a.d(background, paddingLeft - iMax, paddingTop - iMax, paddingLeft + iMax, paddingTop + iMax);
            }
            return frame;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class e extends h {
        public e(Context context, androidx.appcompat.view.menu.e eVar, View view, boolean z8) {
            super(context, eVar, view, z8, p054g.a.f22383m);
            h(8388613);
            j(a.this.f13994C);
        }

        @Override // androidx.appcompat.view.menu.h
        public void e() {
            if (a.this.f13602c != null) {
                a.this.f13602c.close();
            }
            a.this.f14010y = null;
            super.e();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class f implements i.a {
        public f() {
        }

        @Override // androidx.appcompat.view.menu.i.a
        public void c(androidx.appcompat.view.menu.e eVar, boolean z8) {
            if (eVar instanceof l) {
                eVar.D().e(false);
            }
            i.a aVarM = a.this.m();
            if (aVarM != null) {
                aVarM.c(eVar, z8);
            }
        }

        @Override // androidx.appcompat.view.menu.i.a
        public boolean d(androidx.appcompat.view.menu.e eVar) {
            if (eVar == a.this.f13602c) {
                return false;
            }
            a.this.f13995D = ((l) eVar).getItem().getItemId();
            i.a aVarM = a.this.m();
            if (aVarM != null) {
                return aVarM.d(eVar);
            }
            return false;
        }
    }

    public a(Context context) {
        super(context, p054g.g.f22505c, p054g.g.f22504b);
        this.f14009x = new SparseBooleanArray();
        this.f13994C = new f();
    }

    public Drawable A() {
        d dVar = this.f13996k;
        if (dVar != null) {
            return dVar.getDrawable();
        }
        if (this.f13998m) {
            return this.f13997l;
        }
        return null;
    }

    public boolean B() {
        Object obj;
        c cVar = this.f13992A;
        if (cVar != null && (obj = this.f13608i) != null) {
            ((View) obj).removeCallbacks(cVar);
            this.f13992A = null;
            return true;
        }
        e eVar = this.f14010y;
        if (eVar == null) {
            return false;
        }
        eVar.b();
        return true;
    }

    public boolean C() {
        C0342a c0342a = this.f14011z;
        if (c0342a == null) {
            return false;
        }
        c0342a.b();
        return true;
    }

    public boolean D() {
        return this.f13992A != null || E();
    }

    public boolean E() {
        e eVar = this.f14010y;
        return eVar != null && eVar.d();
    }

    public void F(Configuration configuration) {
        if (!this.f14004s) {
            this.f14003r = p099l.a.b(this.f13601b).d();
        }
        androidx.appcompat.view.menu.e eVar = this.f13602c;
        if (eVar != null) {
            eVar.L(true);
        }
    }

    public void G(boolean z8) {
        this.f14007v = z8;
    }

    public void H(ActionMenuView actionMenuView) {
        this.f13608i = actionMenuView;
        actionMenuView.b(this.f13602c);
    }

    public void I(Drawable drawable) {
        d dVar = this.f13996k;
        if (dVar != null) {
            dVar.setImageDrawable(drawable);
        } else {
            this.f13998m = true;
            this.f13997l = drawable;
        }
    }

    public void J(boolean z8) {
        this.f13999n = z8;
        this.f14000o = true;
    }

    public boolean K() {
        androidx.appcompat.view.menu.e eVar;
        if (!this.f13999n || E() || (eVar = this.f13602c) == null || this.f13608i == null || this.f13992A != null || eVar.z().isEmpty()) {
            return false;
        }
        c cVar = new c(new e(this.f13601b, this.f13602c, this.f13996k, true));
        this.f13992A = cVar;
        ((View) this.f13608i).post(cVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public void b(g gVar, j.a aVar) {
        aVar.d(gVar, 0);
        ActionMenuItemView actionMenuItemView = (ActionMenuItemView) aVar;
        actionMenuItemView.setItemInvoker((ActionMenuView) this.f13608i);
        if (this.f13993B == null) {
            this.f13993B = new b();
        }
        actionMenuItemView.setPopupCallback(this.f13993B);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void c(androidx.appcompat.view.menu.e eVar, boolean z8) {
        y();
        super.c(eVar, z8);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void d(boolean z8) {
        super.d(z8);
        ((View) this.f13608i).requestLayout();
        androidx.appcompat.view.menu.e eVar = this.f13602c;
        boolean z9 = false;
        if (eVar != null) {
            ArrayList arrayListS = eVar.s();
            int size = arrayListS.size();
            for (int i8 = 0; i8 < size; i8++) {
                AbstractC1640b abstractC1640bB = ((g) arrayListS.get(i8)).b();
                if (abstractC1640bB != null) {
                    abstractC1640bB.i(this);
                }
            }
        }
        androidx.appcompat.view.menu.e eVar2 = this.f13602c;
        ArrayList arrayListZ = eVar2 != null ? eVar2.z() : null;
        if (this.f13999n && arrayListZ != null) {
            int size2 = arrayListZ.size();
            if (size2 == 1) {
                z9 = !((g) arrayListZ.get(0)).isActionViewExpanded();
            } else if (size2 > 0) {
                z9 = true;
            }
        }
        if (z9) {
            if (this.f13996k == null) {
                this.f13996k = new d(this.f13600a);
            }
            ViewGroup viewGroup = (ViewGroup) this.f13996k.getParent();
            if (viewGroup != this.f13608i) {
                if (viewGroup != null) {
                    viewGroup.removeView(this.f13996k);
                }
                ActionMenuView actionMenuView = (ActionMenuView) this.f13608i;
                actionMenuView.addView(this.f13996k, actionMenuView.B());
            }
        } else {
            d dVar = this.f13996k;
            if (dVar != null) {
                Object parent = dVar.getParent();
                Object obj = this.f13608i;
                if (parent == obj) {
                    ((ViewGroup) obj).removeView(this.f13996k);
                }
            }
        }
        ((ActionMenuView) this.f13608i).setOverflowReserved(this.f13999n);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.appcompat.widget.a] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /* JADX WARN: Type inference failed for: r0v9 */
    /* JADX WARN: Type inference failed for: r15v1, types: [androidx.appcompat.view.menu.g] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v12 */
    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean e() {
        ArrayList arrayListE;
        int size;
        int i8;
        int iH;
        ?? r8;
        a aVar = this;
        androidx.appcompat.view.menu.e eVar = aVar.f13602c;
        View view = null;
        ?? r9 = 0;
        if (eVar != null) {
            arrayListE = eVar.E();
            size = arrayListE.size();
        } else {
            arrayListE = null;
            size = 0;
        }
        int i9 = aVar.f14003r;
        int i10 = aVar.f14002q;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) aVar.f13608i;
        boolean z8 = false;
        int i11 = 0;
        int i12 = 0;
        for (int i13 = 0; i13 < size; i13++) {
            g gVar = (g) arrayListE.get(i13);
            if (gVar.o()) {
                i11++;
            } else if (gVar.n()) {
                i12++;
            } else {
                z8 = true;
            }
            if (aVar.f14007v && gVar.isActionViewExpanded()) {
                i9 = 0;
            }
        }
        if (aVar.f13999n && (z8 || i12 + i11 > i9)) {
            i9--;
        }
        int i14 = i9 - i11;
        SparseBooleanArray sparseBooleanArray = aVar.f14009x;
        sparseBooleanArray.clear();
        if (aVar.f14005t) {
            int i15 = aVar.f14008w;
            iH = i10 / i15;
            i8 = i15 + ((i10 % i15) / iH);
        } else {
            i8 = 0;
            iH = 0;
        }
        int i16 = 0;
        int i17 = 0;
        ?? r10 = aVar;
        while (i16 < size) {
            ?? r15 = (g) arrayListE.get(i16);
            if (r15.o()) {
                View viewN = r10.n(r15, view, viewGroup);
                if (r10.f14005t) {
                    iH -= ActionMenuView.H(viewN, i8, iH, iMakeMeasureSpec, r9);
                } else {
                    viewN.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                }
                int measuredWidth = viewN.getMeasuredWidth();
                i10 -= measuredWidth;
                if (i17 == 0) {
                    i17 = measuredWidth;
                }
                int groupId = r15.getGroupId();
                if (groupId != 0) {
                    sparseBooleanArray.put(groupId, true);
                }
                r15.u(true);
                r8 = r9;
            } else if (r15.n()) {
                int groupId2 = r15.getGroupId();
                boolean z9 = sparseBooleanArray.get(groupId2);
                boolean z10 = (i14 > 0 || z9) && i10 > 0 && (!r10.f14005t || iH > 0);
                boolean z11 = z10;
                if (z10) {
                    View viewN2 = r10.n(r15, null, viewGroup);
                    if (r10.f14005t) {
                        int iH2 = ActionMenuView.H(viewN2, i8, iH, iMakeMeasureSpec, 0);
                        iH -= iH2;
                        if (iH2 == 0) {
                            z11 = false;
                        }
                    } else {
                        viewN2.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                    }
                    boolean z12 = z11;
                    int measuredWidth2 = viewN2.getMeasuredWidth();
                    i10 -= measuredWidth2;
                    if (i17 == 0) {
                        i17 = measuredWidth2;
                    }
                    z10 = z12 & (!r10.f14005t ? i10 + i17 <= 0 : i10 < 0);
                }
                if (z10 && groupId2 != 0) {
                    sparseBooleanArray.put(groupId2, true);
                } else if (z9) {
                    sparseBooleanArray.put(groupId2, false);
                    for (int i18 = 0; i18 < i16; i18++) {
                        g gVar2 = (g) arrayListE.get(i18);
                        if (gVar2.getGroupId() == groupId2) {
                            if (gVar2.l()) {
                                i14++;
                            }
                            gVar2.u(false);
                        }
                    }
                }
                if (z10) {
                    i14--;
                }
                r15.u(z10);
                r8 = 0;
            } else {
                r8 = r9;
                r15.u(r8);
            }
            i16++;
            r9 = r8;
            size = size;
            view = null;
            r10 = this;
        }
        return true;
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public void i(Context context, androidx.appcompat.view.menu.e eVar) {
        super.i(context, eVar);
        Resources resources = context.getResources();
        p099l.a aVarB = p099l.a.b(context);
        if (!this.f14000o) {
            this.f13999n = aVarB.h();
        }
        if (!this.f14006u) {
            this.f14001p = aVarB.c();
        }
        if (!this.f14004s) {
            this.f14003r = aVarB.d();
        }
        int measuredWidth = this.f14001p;
        if (this.f13999n) {
            if (this.f13996k == null) {
                d dVar = new d(this.f13600a);
                this.f13996k = dVar;
                if (this.f13998m) {
                    dVar.setImageDrawable(this.f13997l);
                    this.f13997l = null;
                    this.f13998m = false;
                }
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                this.f13996k.measure(iMakeMeasureSpec, iMakeMeasureSpec);
            }
            measuredWidth -= this.f13996k.getMeasuredWidth();
        } else {
            this.f13996k = null;
        }
        this.f14002q = measuredWidth;
        this.f14008w = (int) (resources.getDisplayMetrics().density * 56.0f);
    }

    @Override // androidx.appcompat.view.menu.a, androidx.appcompat.view.menu.i
    public boolean k(l lVar) {
        boolean z8 = false;
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l lVar2 = lVar;
        while (lVar2.f0() != this.f13602c) {
            lVar2 = (l) lVar2.f0();
        }
        View viewZ = z(lVar2.getItem());
        if (viewZ == null) {
            return false;
        }
        this.f13995D = lVar.getItem().getItemId();
        int size = lVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = lVar.getItem(i8);
            if (item.isVisible() && item.getIcon() != null) {
                z8 = true;
                break;
            }
        }
        C0342a c0342a = new C0342a(this.f13601b, lVar, viewZ);
        this.f14011z = c0342a;
        c0342a.g(z8);
        this.f14011z.k();
        super.k(lVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean l(ViewGroup viewGroup, int i8) {
        if (viewGroup.getChildAt(i8) == this.f13996k) {
            return false;
        }
        return super.l(viewGroup, i8);
    }

    @Override // androidx.appcompat.view.menu.a
    public View n(g gVar, View view, ViewGroup viewGroup) {
        View actionView = gVar.getActionView();
        if (actionView == null || gVar.j()) {
            actionView = super.n(gVar, view, viewGroup);
        }
        actionView.setVisibility(gVar.isActionViewExpanded() ? 8 : 0);
        ActionMenuView actionMenuView = (ActionMenuView) viewGroup;
        ViewGroup.LayoutParams layoutParams = actionView.getLayoutParams();
        if (!actionMenuView.checkLayoutParams(layoutParams)) {
            actionView.setLayoutParams(actionMenuView.generateLayoutParams(layoutParams));
        }
        return actionView;
    }

    @Override // androidx.appcompat.view.menu.a
    public j o(ViewGroup viewGroup) {
        j jVar = this.f13608i;
        j jVarO = super.o(viewGroup);
        if (jVar != jVarO) {
            ((ActionMenuView) jVarO).setPresenter(this);
        }
        return jVarO;
    }

    @Override // androidx.appcompat.view.menu.a
    public boolean q(int i8, g gVar) {
        return gVar.l();
    }

    public boolean y() {
        return B() | C();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final View z(MenuItem menuItem) {
        ViewGroup viewGroup = (ViewGroup) this.f13608i;
        if (viewGroup == null) {
            return null;
        }
        int childCount = viewGroup.getChildCount();
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = viewGroup.getChildAt(i8);
            if ((childAt instanceof j.a) && ((j.a) childAt).getItemData() == menuItem) {
                return childAt;
            }
        }
        return null;
    }
}
