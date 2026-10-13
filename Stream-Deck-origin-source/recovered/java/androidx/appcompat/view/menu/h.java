package androidx.appcompat.view.menu;

import U1.AbstractC1651m;
import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class h {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f13727a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final e f13728b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f13729c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13730d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f13731e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public View f13732f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public int f13733g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public boolean f13734h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public i.a f13735i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public p108m.d f13736j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public PopupWindow.OnDismissListener f13737k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final PopupWindow.OnDismissListener f13738l;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements PopupWindow.OnDismissListener {
        public a() {
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            h.this.e();
        }
    }

    public h(Context context, e eVar) {
        this(context, eVar, null, false, p054g.a.f22362H, 0);
    }

    public final p108m.d a() {
        Display defaultDisplay = ((WindowManager) this.f13727a.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        p108m.d bVar = Math.min(point.x, point.y) >= this.f13727a.getResources().getDimensionPixelSize(p054g.d.f22408c) ? new b(this.f13727a, this.f13732f, this.f13730d, this.f13731e, this.f13729c) : new k(this.f13727a, this.f13728b, this.f13732f, this.f13730d, this.f13731e, this.f13729c);
        bVar.l(this.f13728b);
        bVar.u(this.f13738l);
        bVar.p(this.f13732f);
        bVar.h(this.f13735i);
        bVar.r(this.f13734h);
        bVar.s(this.f13733g);
        return bVar;
    }

    public void b() {
        if (d()) {
            this.f13736j.dismiss();
        }
    }

    public p108m.d c() {
        if (this.f13736j == null) {
            this.f13736j = a();
        }
        return this.f13736j;
    }

    public boolean d() {
        p108m.d dVar = this.f13736j;
        return dVar != null && dVar.a();
    }

    public void e() {
        this.f13736j = null;
        PopupWindow.OnDismissListener onDismissListener = this.f13737k;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public void f(View view) {
        this.f13732f = view;
    }

    public void g(boolean z8) {
        this.f13734h = z8;
        p108m.d dVar = this.f13736j;
        if (dVar != null) {
            dVar.r(z8);
        }
    }

    public void h(int i8) {
        this.f13733g = i8;
    }

    public void i(PopupWindow.OnDismissListener onDismissListener) {
        this.f13737k = onDismissListener;
    }

    public void j(i.a aVar) {
        this.f13735i = aVar;
        p108m.d dVar = this.f13736j;
        if (dVar != null) {
            dVar.h(aVar);
        }
    }

    public void k() {
        if (!m()) {
            throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
        }
    }

    public final void l(int i8, int i9, boolean z8, boolean z9) {
        p108m.d dVarC = c();
        dVarC.v(z9);
        if (z8) {
            if ((AbstractC1651m.a(this.f13733g, this.f13732f.getLayoutDirection()) & 7) == 5) {
                i8 -= this.f13732f.getWidth();
            }
            dVarC.t(i8);
            dVarC.w(i9);
            int i10 = (int) ((this.f13727a.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            dVarC.q(new Rect(i8 - i10, i9 - i10, i8 + i10, i9 + i10));
        }
        dVarC.b();
    }

    public boolean m() {
        if (d()) {
            return true;
        }
        if (this.f13732f == null) {
            return false;
        }
        l(0, 0, false, false);
        return true;
    }

    public boolean n(int i8, int i9) {
        if (d()) {
            return true;
        }
        if (this.f13732f == null) {
            return false;
        }
        l(i8, i9, true, true);
        return true;
    }

    public h(Context context, e eVar, View view) {
        this(context, eVar, view, false, p054g.a.f22362H, 0);
    }

    public h(Context context, e eVar, View view, boolean z8, int i8) {
        this(context, eVar, view, z8, i8, 0);
    }

    public h(Context context, e eVar, View view, boolean z8, int i8, int i9) {
        this.f13733g = 8388611;
        this.f13738l = new a();
        this.f13727a = context;
        this.f13728b = eVar;
        this.f13732f = view;
        this.f13729c = z8;
        this.f13730d = i8;
        this.f13731e = i9;
    }
}
