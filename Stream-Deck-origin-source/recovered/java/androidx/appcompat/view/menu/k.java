package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;
import android.widget.PopupWindow;
import android.widget.TextView;
import p117n.N;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k extends p108m.d implements PopupWindow.OnDismissListener, AdapterView.OnItemClickListener, i, View.OnKeyListener {

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f13740v = p054g.g.f22515m;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Context f13741b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final e f13742c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final d f13743d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f13744e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final int f13745f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f13746g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final int f13747h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final N f13748i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public PopupWindow.OnDismissListener f13751l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public View f13752m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public View f13753n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public i.a f13754o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ViewTreeObserver f13755p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public boolean f13756q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f13757r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f13758s;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f13760u;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final ViewTreeObserver.OnGlobalLayoutListener f13749j = new a();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final View.OnAttachStateChangeListener f13750k = new b();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f13759t = 0;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            if (!k.this.a() || k.this.f13748i.x()) {
                return;
            }
            View view = k.this.f13753n;
            if (view == null || !view.isShown()) {
                k.this.dismiss();
            } else {
                k.this.f13748i.b();
            }
        }
    }

    public k(Context context, e eVar, View view, int i8, int i9, boolean z8) {
        this.f13741b = context;
        this.f13742c = eVar;
        this.f13744e = z8;
        this.f13743d = new d(eVar, LayoutInflater.from(context), z8, f13740v);
        this.f13746g = i8;
        this.f13747h = i9;
        Resources resources = context.getResources();
        this.f13745f = Math.max(resources.getDisplayMetrics().widthPixels / 2, resources.getDimensionPixelSize(p054g.d.f22409d));
        this.f13752m = view;
        this.f13748i = new N(context, null, i8, i9);
        eVar.c(this, context);
    }

    @Override // p108m.f
    public boolean a() {
        return !this.f13756q && this.f13748i.a();
    }

    @Override // p108m.f
    public void b() {
        if (!z()) {
            throw new IllegalStateException("StandardMenuPopup cannot be used without an anchor");
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void c(e eVar, boolean z8) {
        if (eVar != this.f13742c) {
            return;
        }
        dismiss();
        i.a aVar = this.f13754o;
        if (aVar != null) {
            aVar.c(eVar, z8);
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public void d(boolean z8) {
        this.f13757r = false;
        d dVar = this.f13743d;
        if (dVar != null) {
            dVar.notifyDataSetChanged();
        }
    }

    @Override // p108m.f
    public void dismiss() {
        if (a()) {
            this.f13748i.dismiss();
        }
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.i
    public void h(i.a aVar) {
        this.f13754o = aVar;
    }

    @Override // p108m.f
    public ListView j() {
        return this.f13748i.j();
    }

    @Override // androidx.appcompat.view.menu.i
    public boolean k(l lVar) {
        if (lVar.hasVisibleItems()) {
            h hVar = new h(this.f13741b, lVar, this.f13753n, this.f13744e, this.f13746g, this.f13747h);
            hVar.j(this.f13754o);
            hVar.g(p108m.d.x(lVar));
            hVar.i(this.f13751l);
            this.f13751l = null;
            this.f13742c.e(false);
            int iC = this.f13748i.c();
            int iO = this.f13748i.o();
            if ((Gravity.getAbsoluteGravity(this.f13759t, this.f13752m.getLayoutDirection()) & 7) == 5) {
                iC += this.f13752m.getWidth();
            }
            if (hVar.n(iC, iO)) {
                i.a aVar = this.f13754o;
                if (aVar == null) {
                    return true;
                }
                aVar.d(lVar);
                return true;
            }
        }
        return false;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public void onDismiss() {
        this.f13756q = true;
        this.f13742c.close();
        ViewTreeObserver viewTreeObserver = this.f13755p;
        if (viewTreeObserver != null) {
            if (!viewTreeObserver.isAlive()) {
                this.f13755p = this.f13753n.getViewTreeObserver();
            }
            this.f13755p.removeGlobalOnLayoutListener(this.f13749j);
            this.f13755p = null;
        }
        this.f13753n.removeOnAttachStateChangeListener(this.f13750k);
        PopupWindow.OnDismissListener onDismissListener = this.f13751l;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
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
        this.f13752m = view;
    }

    @Override // p108m.d
    public void r(boolean z8) {
        this.f13743d.d(z8);
    }

    @Override // p108m.d
    public void s(int i8) {
        this.f13759t = i8;
    }

    @Override // p108m.d
    public void t(int i8) {
        this.f13748i.e(i8);
    }

    @Override // p108m.d
    public void u(PopupWindow.OnDismissListener onDismissListener) {
        this.f13751l = onDismissListener;
    }

    @Override // p108m.d
    public void v(boolean z8) {
        this.f13760u = z8;
    }

    @Override // p108m.d
    public void w(int i8) {
        this.f13748i.l(i8);
    }

    public final boolean z() {
        View view;
        if (a()) {
            return true;
        }
        if (this.f13756q || (view = this.f13752m) == null) {
            return false;
        }
        this.f13753n = view;
        this.f13748i.G(this);
        this.f13748i.H(this);
        this.f13748i.F(true);
        View view2 = this.f13753n;
        boolean z8 = this.f13755p == null;
        ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
        this.f13755p = viewTreeObserver;
        if (z8) {
            viewTreeObserver.addOnGlobalLayoutListener(this.f13749j);
        }
        view2.addOnAttachStateChangeListener(this.f13750k);
        this.f13748i.z(view2);
        this.f13748i.C(this.f13759t);
        if (!this.f13757r) {
            this.f13758s = p108m.d.o(this.f13743d, null, this.f13741b, this.f13745f);
            this.f13757r = true;
        }
        this.f13748i.B(this.f13758s);
        this.f13748i.E(2);
        this.f13748i.D(n());
        this.f13748i.b();
        ListView listViewJ = this.f13748i.j();
        listViewJ.setOnKeyListener(this);
        if (this.f13760u && this.f13742c.x() != null) {
            FrameLayout frameLayout = (FrameLayout) LayoutInflater.from(this.f13741b).inflate(p054g.g.f22514l, (ViewGroup) listViewJ, false);
            TextView textView = (TextView) frameLayout.findViewById(R.id.title);
            if (textView != null) {
                textView.setText(this.f13742c.x());
            }
            frameLayout.setEnabled(false);
            listViewJ.addHeaderView(frameLayout, null, false);
        }
        this.f13748i.p(this.f13743d);
        this.f13748i.b();
        return true;
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b implements View.OnAttachStateChangeListener {
        public b() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            ViewTreeObserver viewTreeObserver = k.this.f13755p;
            if (viewTreeObserver != null) {
                if (!viewTreeObserver.isAlive()) {
                    k.this.f13755p = view.getViewTreeObserver();
                }
                k kVar = k.this;
                kVar.f13755p.removeGlobalOnLayoutListener(kVar.f13749j);
            }
            view.removeOnAttachStateChangeListener(this);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
        }
    }

    @Override // p108m.d
    public void l(e eVar) {
    }
}
