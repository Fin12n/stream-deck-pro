package androidx.appcompat.view.menu;

import U1.AbstractC1651m;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Handler;
import android.os.SystemClock;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import p117n.M;
import p117n.N;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends p108m.d implements i, View.OnKeyListener, PopupWindow.OnDismissListener {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public static final int f13610B = p054g.g.f22507e;

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f13611A;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f13612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13614d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13615e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f13616f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Handler f13617g;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public View f13625o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public View f13626p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13628r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f13629s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13630t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public int f13631u;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13633w;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public i.a f13634x;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public ViewTreeObserver f13635y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public PopupWindow.OnDismissListener f13636z;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f13618h = new ArrayList();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final List f13619i = new ArrayList();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f13620j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f13621k = new ViewOnAttachStateChangeListenerC0341b();

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M f13622l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13623m = 0;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public int f13624n = 0;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13632v = false;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public int f13627q = D();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!b.this.a() || b.this.f13619i.size() <= 0 || ((d) b.this.f13619i.get(0)).f13644a.x()) {
                return;
            }
            View view = b.this.f13626p;
            if (view == null || !view.isShown()) {
                b.this.dismiss();
                return;
            }
            Iterator it = b.this.f13619i.iterator();
            while (it.hasNext()) {
                ((d) it.next()).f13644a.b();
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements M {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public class a implements Runnable {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ d f13640a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ MenuItem f13641b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ e f13642c;

            public a(d dVar, MenuItem menuItem, e eVar) {
                this.f13640a = dVar;
                this.f13641b = menuItem;
                this.f13642c = eVar;
            }

            @Override // java.lang.Runnable
            public void run() {
                d dVar = this.f13640a;
                if (dVar != null) {
                    b.this.f13611A = true;
                    dVar.f13645b.e(false);
                    b.this.f13611A = false;
                }
                if (this.f13641b.isEnabled() && this.f13641b.hasSubMenu()) {
                    this.f13642c.M(this.f13641b, 4);
                }
            }
        }

        public c() {
        }

        @Override // p117n.M
        public void d(e eVar, MenuItem menuItem) {
            b.this.f13617g.removeCallbacksAndMessages(null);
            int size = b.this.f13619i.size();
            int i8 = 0;
            while (true) {
                if (i8 >= size) {
                    i8 = -1;
                    break;
                } else if (eVar == ((d) b.this.f13619i.get(i8)).f13645b) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 == -1) {
                return;
            }
            int i9 = i8 + 1;
            b.this.f13617g.postAtTime(new a(i9 < b.this.f13619i.size() ? (d) b.this.f13619i.get(i9) : null, menuItem, eVar), eVar, SystemClock.uptimeMillis() + 200);
        }

        @Override // p117n.M
        public void g(e eVar, MenuItem menuItem) {
            b.this.f13617g.removeCallbacksAndMessages(eVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final N f13644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final e f13645b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final int f13646c;

        public d(N n8, e eVar, int i8) {
            this.f13644a = n8;
            this.f13645b = eVar;
            this.f13646c = i8;
        }

        public ListView a() {
            return this.f13644a.j();
        }
    }

    public b(Context context, View view, int i8, int i9, boolean z8) {
        this.f13612b = context;
        this.f13625o = view;
        this.f13614d = i8;
        this.f13615e = i9;
        this.f13616f = z8;
        Resources resources = context.getResources();
        this.f13613c = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p054g.d.f22409d));
        this.f13617g = new Handler();
    }

    public final int A(e eVar) {
        int size = this.f13619i.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (eVar == ((d) this.f13619i.get(i8)).f13645b) {
                return i8;
            }
        }
        return -1;
    }

    public final MenuItem B(e eVar, e eVar2) {
        int size = eVar.size();
        for (int i8 = 0; i8 < size; i8++) {
            MenuItem item = eVar.getItem(i8);
            if (item.hasSubMenu() && eVar2 == item.getSubMenu()) {
                return item;
            }
        }
        return null;
    }

    public final View C(d dVar, e eVar) {
        androidx.appcompat.view.menu.d dVar2;
        int headersCount;
        int firstVisiblePosition;
        MenuItem menuItemB = B(dVar.f13645b, eVar);
        if (menuItemB == null) {
            return null;
        }
        ListView listViewA = dVar.a();
        ListAdapter adapter = listViewA.getAdapter();
        int i8 = 0;
        if (adapter instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter headerViewListAdapter = (HeaderViewListAdapter) adapter;
            headersCount = headerViewListAdapter.getHeadersCount();
            dVar2 = (androidx.appcompat.view.menu.d) headerViewListAdapter.getWrappedAdapter();
        } else {
            dVar2 = (androidx.appcompat.view.menu.d) adapter;
            headersCount = 0;
        }
        int count = dVar2.getCount();
        while (true) {
            if (i8 >= count) {
                i8 = -1;
                break;
            }
            if (menuItemB == dVar2.getItem(i8)) {
                break;
            }
            i8++;
        }
        if (i8 != -1 && (firstVisiblePosition = (i8 + headersCount) - listViewA.getFirstVisiblePosition()) >= 0 && firstVisiblePosition < listViewA.getChildCount()) {
            return listViewA.getChildAt(firstVisiblePosition);
        }
        return null;
    }

    public final int D() {
        return this.f13625o.getLayoutDirection() == 1 ? 0 : 1;
    }

    public final int E(int i8) {
        List list = this.f13619i;
        ListView listViewA = ((d) list.get(list.size() - 1)).a();
        int[] iArr = new int[2];
        listViewA.getLocationOnScreen(iArr);
        Rect rect = new Rect();
        this.f13626p.getWindowVisibleDisplayFrame(rect);
        if (this.f13627q == 1) {
            return (iArr[0] + listViewA.getWidth()) + i8 > rect.right ? 0 : 1;
        }
        return iArr[0] - i8 < 0 ? 1 : 0;
    }

    public final void F(e eVar) {
        d dVar;
        View viewC;
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f13612b);
        androidx.appcompat.view.menu.d dVar2 = new androidx.appcompat.view.menu.d(eVar, layoutInflaterFrom, this.f13616f, f13610B);
        if (!a() && this.f13632v) {
            dVar2.d(true);
        } else if (a()) {
            dVar2.d(p108m.d.x(eVar));
        }
        int iO = p108m.d.o(dVar2, null, this.f13612b, this.f13613c);
        N nZ = z();
        nZ.p(dVar2);
        nZ.B(iO);
        nZ.C(this.f13624n);
        if (this.f13619i.size() > 0) {
            List list = this.f13619i;
            dVar = (d) list.get(list.size() - 1);
            viewC = C(dVar, eVar);
        } else {
            dVar = null;
            viewC = null;
        }
        if (viewC != null) {
            nZ.Q(false);
            nZ.N(null);
            int iE = E(iO);
            boolean z8 = iE == 1;
            this.f13627q = iE;
            nZ.z(viewC);
            if ((this.f13624n & 5) != 5) {
                iO = z8 ? viewC.getWidth() : 0 - iO;
            } else if (!z8) {
                iO = 0 - viewC.getWidth();
            }
            nZ.e(iO);
            nZ.I(true);
            nZ.l(0);
        } else {
            if (this.f13628r) {
                nZ.e(this.f13630t);
            }
            if (this.f13629s) {
                nZ.l(this.f13631u);
            }
            nZ.D(n());
        }
        this.f13619i.add(new d(nZ, eVar, this.f13627q));
        nZ.b();
        ListView listViewJ = nZ.j();
        listViewJ.setOnKeyListener(this);
        if (dVar == null && this.f13633w && eVar.x() != null) {
            FrameLayout frameLayout = (FrameLayout) layoutInflaterFrom.inflate(p054g.g.f22514l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            frameLayout.setEnabled(false);
            textView.setText(eVar.x());
            listViewJ.addHeaderView(frameLayout, null, false);
            nZ.b();
        }
    }

    @Override // p108m.f
    public boolean a() {
        return this.f13619i.size() > 0 && ((d) this.f13619i.get(0)).f13644a.a();
    }

    @Override // p108m.f
    public void b() {
        if (a()) {
            return;
        }
        Iterator it = this.f13618h.iterator();
        while (it.hasNext()) {
            F((e) it.next());
        }
        this.f13618h.clear();
        View view = this.f13625o;
        this.f13626p = view;
        if (view != null) {
            boolean z8 = this.f13635y == null;
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            this.f13635y = viewTreeObserver;
            if (z8) {
                viewTreeObserver.addOnGlobalLayoutListener(this.f13620j);
            }
            this.f13626p.addOnAttachStateChangeListener(this.f13621k);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(e eVar, boolean z8) {
        int iA = A(eVar);
        if (iA < 0) {
            return;
        }
        int i8 = iA + 1;
        if (i8 < this.f13619i.size()) {
            ((d) this.f13619i.get(i8)).f13645b.e(false);
        }
        d dVar = (d) this.f13619i.remove(iA);
        dVar.f13645b.P(this);
        if (this.f13611A) {
            dVar.f13644a.O(null);
            dVar.f13644a.A(0);
        }
        dVar.f13644a.dismiss();
        int size = this.f13619i.size();
        if (size > 0) {
            this.f13627q = ((d) this.f13619i.get(size - 1)).f13646c;
        } else {
            this.f13627q = D();
        }
        if (size != 0) {
            if (z8) {
                ((d) this.f13619i.get(0)).f13645b.e(false);
                return;
            }
            return;
        }
        dismiss();
        i.a aVar = this.f13634x;
        if (aVar != null) {
            aVar.c(eVar, true);
        }
        ViewTreeObserver viewTreeObserver = this.f13635y;
        if (viewTreeObserver != null) {
            if (viewTreeObserver.isAlive()) {
                this.f13635y.removeGlobalOnLayoutListener(this.f13620j);
            }
            this.f13635y = null;
        }
        this.f13626p.removeOnAttachStateChangeListener(this.f13621k);
        this.f13636z.onDismiss();
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(boolean z8) {
        Iterator it = this.f13619i.iterator();
        while (it.hasNext()) {
            p108m.d.y(((d) it.next()).a().getAdapter()).notifyDataSetChanged();
        }
    }

    @Override // p108m.f
    public void dismiss() {
        int size = this.f13619i.size();
        if (size > 0) {
            d[] dVarArr = (d[]) this.f13619i.toArray(new d[size]);
            for (int i8 = size - 1; i8 >= 0; i8--) {
                d dVar = dVarArr[i8];
                if (dVar.f13644a.a()) {
                    dVar.f13644a.dismiss();
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void h(i.a aVar) {
        this.f13634x = aVar;
    }

    @Override // p108m.f
    public ListView j() {
        if (this.f13619i.isEmpty()) {
            return null;
        }
        List list = this.f13619i;
        return ((d) list.get(list.size() - 1)).a();
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean k(l lVar) {
        for (d dVar : this.f13619i) {
            if (lVar == dVar.f13645b) {
                dVar.a().requestFocus();
                return true;
            }
        }
        if (!lVar.hasVisibleItems()) {
            return false;
        }
        l(lVar);
        i.a aVar = this.f13634x;
        if (aVar != null) {
            aVar.d(lVar);
        }
        return true;
    }

    @Override // p108m.d
    public void l(e eVar) {
        eVar.c(this, this.f13612b);
        if (a()) {
            F(eVar);
        } else {
            this.f13618h.add(eVar);
        }
    }

    @Override // p108m.d
    public boolean m() {
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        d dVar;
        int size = this.f13619i.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                dVar = null;
                break;
            }
            dVar = (d) this.f13619i.get(i8);
            if (!dVar.f13644a.a()) {
                break;
            } else {
                i8++;
            }
        }
        if (dVar != null) {
            dVar.f13645b.e(false);
        }
    }

    @Override // android.view.View.OnKeyListener
    public boolean onKey(View view, int i8, KeyEvent keyEvent) {
        if (keyEvent.getAction() != 1 || i8 != 82) {
            return false;
        }
        dismiss();
        return true;
    }

    @Override // p108m.d
    public void p(View view) {
        if (this.f13625o != view) {
            this.f13625o = view;
            this.f13624n = AbstractC1651m.a(this.f13623m, view.getLayoutDirection());
        }
    }

    @Override // p108m.d
    public void r(boolean z8) {
        this.f13632v = z8;
    }

    @Override // p108m.d
    public void s(int i8) {
        if (this.f13623m != i8) {
            this.f13623m = i8;
            this.f13624n = AbstractC1651m.a(i8, this.f13625o.getLayoutDirection());
        }
    }

    @Override // p108m.d
    public void t(int i8) {
        this.f13628r = true;
        this.f13630t = i8;
    }

    @Override // p108m.d
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f13636z = onDismissListener;
    }

    @Override // p108m.d
    public void v(boolean z8) {
        this.f13633w = z8;
    }

    @Override // p108m.d
    public void w(int i8) {
        this.f13629s = true;
        this.f13631u = i8;
    }

    public final N z() {
        N n8 = new N(this.f13612b, null, this.f13614d, this.f13615e);
        n8.P(this.f13622l);
        n8.H(this);
        n8.G(this);
        n8.z(this.f13625o);
        n8.C(this.f13624n);
        n8.F(true);
        n8.E(2);
        return n8;
    }

    /* JADX INFO: renamed from: androidx.appcompat.view.menu.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class ViewOnAttachStateChangeListenerC0341b implements View.OnAttachStateChangeListener {
        public ViewOnAttachStateChangeListenerC0341b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = b.this.f13635y;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    b.this.f13635y = view.getViewTreeObserver();
                }
                b bVar = b.this;
                bVar.f13635y.removeGlobalOnLayoutListener(bVar.f13620j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }
}
