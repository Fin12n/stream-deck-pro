package androidx.appcompat.widget;

import U1.I;
import U1.S;
import U1.U;
import android.R;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.appcompat.view.menu.i;
import p054g.e;
import p054g.f;
import p054g.h;
import p054g.j;
import p117n.G;
import p117n.X;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Toolbar f14061a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f14062b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public View f14063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public View f14064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Drawable f14065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Drawable f14066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Drawable f14067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f14068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public CharSequence f14069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public CharSequence f14070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public CharSequence f14071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Window.Callback f14072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public boolean f14073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public androidx.appcompat.widget.a f14074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public int f14075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f14076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public Drawable f14077q;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final p108m.a f14078a;

        public a() {
            this.f14078a = new p108m.a(d.this.f14061a.getContext(), 0, R.id.home, 0, 0, d.this.f14069i);
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            d dVar = d.this;
            Window.Callback callback = dVar.f14072l;
            if (callback == null || !dVar.f14073m) {
                return;
            }
            callback.onMenuItemSelected(0, this.f14078a);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends U {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f14080a = false;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f14081b;

        public b(int i8) {
            this.f14081b = i8;
        }

        @Override // U1.U, U1.T
        public void a(View view) {
            this.f14080a = true;
        }

        @Override // U1.U, U1.T
        public void b(View view) {
            if (this.f14080a) {
                return;
            }
            d.this.f14061a.setVisibility(this.f14081b);
        }

        @Override // U1.U, U1.T
        public void c(View view) {
            d.this.f14061a.setVisibility(0);
        }
    }

    public d(Toolbar toolbar, boolean z8) {
        this(toolbar, z8, h.f22522a, e.f22449n);
    }

    public void A(Drawable drawable) {
        this.f14067g = drawable;
        F();
    }

    public void B(CharSequence charSequence) {
        this.f14070j = charSequence;
        if ((this.f14062b & 8) != 0) {
            this.f14061a.setSubtitle(charSequence);
        }
    }

    public void C(CharSequence charSequence) {
        this.f14068h = true;
        D(charSequence);
    }

    public final void D(CharSequence charSequence) {
        this.f14069i = charSequence;
        if ((this.f14062b & 8) != 0) {
            this.f14061a.setTitle(charSequence);
            if (this.f14068h) {
                I.K(this.f14061a.getRootView(), charSequence);
            }
        }
    }

    public final void E() {
        if ((this.f14062b & 4) != 0) {
            if (TextUtils.isEmpty(this.f14071k)) {
                this.f14061a.setNavigationContentDescription(this.f14076p);
            } else {
                this.f14061a.setNavigationContentDescription(this.f14071k);
            }
        }
    }

    public final void F() {
        if ((this.f14062b & 4) == 0) {
            this.f14061a.setNavigationIcon((Drawable) null);
            return;
        }
        Toolbar toolbar = this.f14061a;
        Drawable drawable = this.f14067g;
        if (drawable == null) {
            drawable = this.f14077q;
        }
        toolbar.setNavigationIcon(drawable);
    }

    public final void G() {
        Drawable drawable;
        int i8 = this.f14062b;
        if ((i8 & 2) == 0) {
            drawable = null;
        } else if ((i8 & 1) == 0 || (drawable = this.f14066f) == null) {
            drawable = this.f14065e;
        }
        this.f14061a.setLogo(drawable);
    }

    @Override // p117n.G
    public void a(Menu menu, i.a aVar) {
        if (this.f14074n == null) {
            androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(this.f14061a.getContext());
            this.f14074n = aVar2;
            aVar2.p(f.f22483g);
        }
        this.f14074n.h(aVar);
        this.f14061a.M((androidx.appcompat.view.menu.e) menu, this.f14074n);
    }

    @Override // p117n.G
    public boolean b() {
        return this.f14061a.D();
    }

    @Override // p117n.G
    public void c() {
        this.f14073m = true;
    }

    @Override // p117n.G
    public void collapseActionView() {
        this.f14061a.f();
    }

    @Override // p117n.G
    public boolean d() {
        return this.f14061a.e();
    }

    @Override // p117n.G
    public boolean e() {
        return this.f14061a.C();
    }

    @Override // p117n.G
    public boolean f() {
        return this.f14061a.y();
    }

    @Override // p117n.G
    public boolean g() {
        return this.f14061a.R();
    }

    @Override // p117n.G
    public Context getContext() {
        return this.f14061a.getContext();
    }

    @Override // p117n.G
    public CharSequence getTitle() {
        return this.f14061a.getTitle();
    }

    @Override // p117n.G
    public void h() {
        this.f14061a.g();
    }

    @Override // p117n.G
    public void i(c cVar) {
        View view = this.f14063c;
        if (view != null) {
            ViewParent parent = view.getParent();
            Toolbar toolbar = this.f14061a;
            if (parent == toolbar) {
                toolbar.removeView(this.f14063c);
            }
        }
        this.f14063c = cVar;
        if (cVar == null || this.f14075o != 2) {
            return;
        }
        this.f14061a.addView(cVar, 0);
        Toolbar.g gVar = (Toolbar.g) this.f14063c.getLayoutParams();
        ((ViewGroup.MarginLayoutParams) gVar).width = -2;
        ((ViewGroup.MarginLayoutParams) gVar).height = -2;
        gVar.f23881a = 8388691;
        cVar.setAllowCollapse(true);
    }

    @Override // p117n.G
    public boolean j() {
        return this.f14061a.x();
    }

    @Override // p117n.G
    public void k(int i8) {
        View view;
        int i9 = this.f14062b ^ i8;
        this.f14062b = i8;
        if (i9 != 0) {
            if ((i9 & 4) != 0) {
                if ((i8 & 4) != 0) {
                    E();
                }
                F();
            }
            if ((i9 & 3) != 0) {
                G();
            }
            if ((i9 & 8) != 0) {
                if ((i8 & 8) != 0) {
                    this.f14061a.setTitle(this.f14069i);
                    this.f14061a.setSubtitle(this.f14070j);
                } else {
                    this.f14061a.setTitle((CharSequence) null);
                    this.f14061a.setSubtitle((CharSequence) null);
                }
            }
            if ((i9 & 16) == 0 || (view = this.f14064d) == null) {
                return;
            }
            if ((i8 & 16) != 0) {
                this.f14061a.addView(view);
            } else {
                this.f14061a.removeView(view);
            }
        }
    }

    @Override // p117n.G
    public void l(int i8) {
        x(i8 != 0 ? p072i.a.b(getContext(), i8) : null);
    }

    @Override // p117n.G
    public int m() {
        return this.f14075o;
    }

    @Override // p117n.G
    public S n(int i8, long j8) {
        return I.c(this.f14061a).b(i8 == 0 ? 1.0f : 0.0f).e(j8).g(new b(i8));
    }

    @Override // p117n.G
    public void o(int i8) {
        this.f14061a.setVisibility(i8);
    }

    @Override // p117n.G
    public int q() {
        return this.f14062b;
    }

    @Override // p117n.G
    public void r() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p117n.G
    public void s() {
        Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
    }

    @Override // p117n.G
    public void setIcon(int i8) {
        setIcon(i8 != 0 ? p072i.a.b(getContext(), i8) : null);
    }

    @Override // p117n.G
    public void setWindowCallback(Window.Callback callback) {
        this.f14072l = callback;
    }

    @Override // p117n.G
    public void setWindowTitle(CharSequence charSequence) {
        if (this.f14068h) {
            return;
        }
        D(charSequence);
    }

    @Override // p117n.G
    public void t(boolean z8) {
        this.f14061a.setCollapsible(z8);
    }

    public final int u() {
        if (this.f14061a.getNavigationIcon() == null) {
            return 11;
        }
        this.f14077q = this.f14061a.getNavigationIcon();
        return 15;
    }

    public void v(View view) {
        View view2 = this.f14064d;
        if (view2 != null && (this.f14062b & 16) != 0) {
            this.f14061a.removeView(view2);
        }
        this.f14064d = view;
        if (view == null || (this.f14062b & 16) == 0) {
            return;
        }
        this.f14061a.addView(view);
    }

    public void w(int i8) {
        if (i8 == this.f14076p) {
            return;
        }
        this.f14076p = i8;
        if (TextUtils.isEmpty(this.f14061a.getNavigationContentDescription())) {
            y(this.f14076p);
        }
    }

    public void x(Drawable drawable) {
        this.f14066f = drawable;
        G();
    }

    public void y(int i8) {
        z(i8 == 0 ? null : getContext().getString(i8));
    }

    public void z(CharSequence charSequence) {
        this.f14071k = charSequence;
        E();
    }

    public d(Toolbar toolbar, boolean z8, int i8, int i9) {
        Drawable drawable;
        this.f14075o = 0;
        this.f14076p = 0;
        this.f14061a = toolbar;
        this.f14069i = toolbar.getTitle();
        this.f14070j = toolbar.getSubtitle();
        this.f14068h = this.f14069i != null;
        this.f14067g = toolbar.getNavigationIcon();
        X xU = X.u(toolbar.getContext(), null, j.f22644a, p054g.a.f22373c, 0);
        this.f14077q = xU.f(j.f22699l);
        if (z8) {
            CharSequence charSequenceO = xU.o(j.f22729r);
            if (!TextUtils.isEmpty(charSequenceO)) {
                C(charSequenceO);
            }
            CharSequence charSequenceO2 = xU.o(j.f22719p);
            if (!TextUtils.isEmpty(charSequenceO2)) {
                B(charSequenceO2);
            }
            Drawable drawableF = xU.f(j.f22709n);
            if (drawableF != null) {
                x(drawableF);
            }
            Drawable drawableF2 = xU.f(j.f22704m);
            if (drawableF2 != null) {
                setIcon(drawableF2);
            }
            if (this.f14067g == null && (drawable = this.f14077q) != null) {
                A(drawable);
            }
            k(xU.j(j.f22679h, 0));
            int iM = xU.m(j.f22674g, 0);
            if (iM != 0) {
                v(LayoutInflater.from(this.f14061a.getContext()).inflate(iM, (ViewGroup) this.f14061a, false));
                k(this.f14062b | 16);
            }
            int iL = xU.l(j.f22689j, 0);
            if (iL > 0) {
                ViewGroup.LayoutParams layoutParams = this.f14061a.getLayoutParams();
                layoutParams.height = iL;
                this.f14061a.setLayoutParams(layoutParams);
            }
            int iD = xU.d(j.f22669f, -1);
            int iD2 = xU.d(j.f22664e, -1);
            if (iD >= 0 || iD2 >= 0) {
                this.f14061a.L(Math.max(iD, 0), Math.max(iD2, 0));
            }
            int iM2 = xU.m(j.f22734s, 0);
            if (iM2 != 0) {
                Toolbar toolbar2 = this.f14061a;
                toolbar2.O(toolbar2.getContext(), iM2);
            }
            int iM3 = xU.m(j.f22724q, 0);
            if (iM3 != 0) {
                Toolbar toolbar3 = this.f14061a;
                toolbar3.N(toolbar3.getContext(), iM3);
            }
            int iM4 = xU.m(j.f22714o, 0);
            if (iM4 != 0) {
                this.f14061a.setPopupTheme(iM4);
            }
        } else {
            this.f14062b = u();
        }
        xU.w();
        w(i8);
        this.f14071k = this.f14061a.getNavigationContentDescription();
        this.f14061a.setNavigationOnClickListener(new a());
    }

    @Override // p117n.G
    public void setIcon(Drawable drawable) {
        this.f14065e = drawable;
        G();
    }

    @Override // p117n.G
    public void p(boolean z8) {
    }
}
