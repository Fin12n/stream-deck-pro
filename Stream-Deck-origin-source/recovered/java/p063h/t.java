package p063h;

import U1.I;
import U1.S;
import U1.T;
import U1.U;
import U1.V;
import android.R;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.Interpolator;
import androidx.appcompat.view.menu.e;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import p054g.f;
import p054g.j;
import p099l.g;
import p099l.h;
import p117n.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class t extends p063h.a implements ActionBarOverlayLayout.d {

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public static final Interpolator f24027E = new AccelerateInterpolator();

    /* JADX INFO: renamed from: F, reason: collision with root package name */
    public static final Interpolator f24028F = new DecelerateInterpolator();

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public boolean f24029A;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Context f24033a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Context f24034b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Activity f24035c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public ActionBarOverlayLayout f24036d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public ActionBarContainer f24037e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public G f24038f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public ActionBarContextView f24039g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public View f24040h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public androidx.appcompat.widget.c f24041i;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public boolean f24044l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public d f24045m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public p099l.b f24046n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l.b.a f24047o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f24048p;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f24050r;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public boolean f24053u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f24054v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f24055w;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public h f24057y;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public boolean f24058z;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public ArrayList f24042j = new ArrayList();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f24043k = -1;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public ArrayList f24049q = new ArrayList();

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public int f24051s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public boolean f24052t = true;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f24056x = true;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public final T f24030B = new a();

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public final T f24031C = new b();

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public final V f24032D = new c();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends U {
        public a() {
        }

        @Override // U1.U, U1.T
        public void b(View view) {
            View view2;
            t tVar = t.this;
            if (tVar.f24052t && (view2 = tVar.f24040h) != null) {
                view2.setTranslationY(0.0f);
                t.this.f24037e.setTranslationY(0.0f);
            }
            t.this.f24037e.setVisibility(8);
            t.this.f24037e.setTransitioning(false);
            t tVar2 = t.this;
            tVar2.f24057y = null;
            tVar2.w();
            ActionBarOverlayLayout actionBarOverlayLayout = t.this.f24036d;
            if (actionBarOverlayLayout != null) {
                I.F(actionBarOverlayLayout);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class b extends U {
        public b() {
        }

        @Override // U1.U, U1.T
        public void b(View view) {
            t tVar = t.this;
            tVar.f24057y = null;
            tVar.f24037e.requestLayout();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class c implements V {
        public c() {
        }

        @Override // U1.V
        public void a(View view) {
            ((View) t.this.f24037e.getParent()).invalidate();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d extends p099l.b implements e.a {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final Context f24062c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final e f24063d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public l.b.a f24064e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public WeakReference f24065f;

        public d(Context context, l.b.a aVar) {
            this.f24062c = context;
            this.f24064e = aVar;
            e eVarT = new e(context).T(1);
            this.f24063d = eVarT;
            eVarT.S(this);
        }

        @Override // androidx.appcompat.view.menu.e.a
        public boolean a(e eVar, MenuItem menuItem) {
            l.b.a aVar = this.f24064e;
            if (aVar != null) {
                return aVar.d(this, menuItem);
            }
            return false;
        }

        @Override // androidx.appcompat.view.menu.e.a
        public void b(e eVar) {
            if (this.f24064e == null) {
                return;
            }
            k();
            t.this.f24039g.l();
        }

        @Override // p099l.b
        public void c() {
            t tVar = t.this;
            if (tVar.f24045m != this) {
                return;
            }
            if (t.v(tVar.f24053u, tVar.f24054v, false)) {
                this.f24064e.c(this);
            } else {
                t tVar2 = t.this;
                tVar2.f24046n = this;
                tVar2.f24047o = this.f24064e;
            }
            this.f24064e = null;
            t.this.u(false);
            t.this.f24039g.g();
            t tVar3 = t.this;
            tVar3.f24036d.setHideOnContentScrollEnabled(tVar3.f24029A);
            t.this.f24045m = null;
        }

        @Override // p099l.b
        public View d() {
            WeakReference weakReference = this.f24065f;
            if (weakReference != null) {
                return (View) weakReference.get();
            }
            return null;
        }

        @Override // p099l.b
        public Menu e() {
            return this.f24063d;
        }

        @Override // p099l.b
        public MenuInflater f() {
            return new g(this.f24062c);
        }

        @Override // p099l.b
        public CharSequence g() {
            return t.this.f24039g.getSubtitle();
        }

        @Override // p099l.b
        public CharSequence i() {
            return t.this.f24039g.getTitle();
        }

        @Override // p099l.b
        public void k() {
            if (t.this.f24045m != this) {
                return;
            }
            this.f24063d.e0();
            try {
                this.f24064e.b(this, this.f24063d);
            } finally {
                this.f24063d.d0();
            }
        }

        @Override // p099l.b
        public boolean l() {
            return t.this.f24039g.j();
        }

        @Override // p099l.b
        public void m(View view) {
            t.this.f24039g.setCustomView(view);
            this.f24065f = new WeakReference(view);
        }

        @Override // p099l.b
        public void n(int i8) {
            o(t.this.f24033a.getResources().getString(i8));
        }

        @Override // p099l.b
        public void o(CharSequence charSequence) {
            t.this.f24039g.setSubtitle(charSequence);
        }

        @Override // p099l.b
        public void q(int i8) {
            r(t.this.f24033a.getResources().getString(i8));
        }

        @Override // p099l.b
        public void r(CharSequence charSequence) {
            t.this.f24039g.setTitle(charSequence);
        }

        @Override // p099l.b
        public void s(boolean z8) {
            super.s(z8);
            t.this.f24039g.setTitleOptional(z8);
        }

        public boolean t() {
            this.f24063d.e0();
            try {
                return this.f24064e.a(this, this.f24063d);
            } finally {
                this.f24063d.d0();
            }
        }
    }

    public t(Activity activity, boolean z8) {
        this.f24035c = activity;
        View decorView = activity.getWindow().getDecorView();
        C(decorView);
        if (z8) {
            return;
        }
        this.f24040h = decorView.findViewById(R.id.content);
    }

    public static boolean v(boolean z8, boolean z9, boolean z10) {
        if (z10) {
            return true;
        }
        return (z8 || z9) ? false : true;
    }

    public int A() {
        return this.f24038f.m();
    }

    public final void B() {
        if (this.f24055w) {
            this.f24055w = false;
            ActionBarOverlayLayout actionBarOverlayLayout = this.f24036d;
            if (actionBarOverlayLayout != null) {
                actionBarOverlayLayout.setShowingForActionMode(false);
            }
            L(false);
        }
    }

    public final void C(View view) {
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(f.f22492p);
        this.f24036d = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        this.f24038f = z(view.findViewById(f.f22477a));
        this.f24039g = (ActionBarContextView) view.findViewById(f.f22482f);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(f.f22479c);
        this.f24037e = actionBarContainer;
        G g8 = this.f24038f;
        if (g8 == null || this.f24039g == null || actionBarContainer == null) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with a compatible window decor layout");
        }
        this.f24033a = g8.getContext();
        boolean z8 = (this.f24038f.q() & 4) != 0;
        if (z8) {
            this.f24044l = true;
        }
        p099l.a aVarB = p099l.a.b(this.f24033a);
        I(aVarB.a() || z8);
        G(aVarB.g());
        TypedArray typedArrayObtainStyledAttributes = this.f24033a.obtainStyledAttributes(null, j.f22644a, p054g.a.f22373c, 0);
        if (typedArrayObtainStyledAttributes.getBoolean(j.f22694k, false)) {
            H(true);
        }
        int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(j.f22684i, 0);
        if (dimensionPixelSize != 0) {
            F(dimensionPixelSize);
        }
        typedArrayObtainStyledAttributes.recycle();
    }

    public void D(boolean z8) {
        E(z8 ? 4 : 0, 4);
    }

    public void E(int i8, int i9) {
        int iQ = this.f24038f.q();
        if ((i9 & 4) != 0) {
            this.f24044l = true;
        }
        this.f24038f.k((i8 & i9) | ((~i9) & iQ));
    }

    public void F(float f8) {
        I.O(this.f24037e, f8);
    }

    public final void G(boolean z8) {
        this.f24050r = z8;
        if (z8) {
            this.f24037e.setTabContainer(null);
            this.f24038f.i(this.f24041i);
        } else {
            this.f24038f.i(null);
            this.f24037e.setTabContainer(this.f24041i);
        }
        boolean z9 = A() == 2;
        androidx.appcompat.widget.c cVar = this.f24041i;
        if (cVar != null) {
            if (z9) {
                cVar.setVisibility(0);
                ActionBarOverlayLayout actionBarOverlayLayout = this.f24036d;
                if (actionBarOverlayLayout != null) {
                    I.F(actionBarOverlayLayout);
                }
            } else {
                cVar.setVisibility(8);
            }
        }
        this.f24038f.t(!this.f24050r && z9);
        this.f24036d.setHasNonEmbeddedTabs(!this.f24050r && z9);
    }

    public void H(boolean z8) {
        if (z8 && !this.f24036d.x()) {
            throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
        this.f24029A = z8;
        this.f24036d.setHideOnContentScrollEnabled(z8);
    }

    public void I(boolean z8) {
        this.f24038f.p(z8);
    }

    public final boolean J() {
        return this.f24037e.isLaidOut();
    }

    public final void K() {
        if (this.f24055w) {
            return;
        }
        this.f24055w = true;
        ActionBarOverlayLayout actionBarOverlayLayout = this.f24036d;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setShowingForActionMode(true);
        }
        L(false);
    }

    public final void L(boolean z8) {
        if (v(this.f24053u, this.f24054v, this.f24055w)) {
            if (this.f24056x) {
                return;
            }
            this.f24056x = true;
            y(z8);
            return;
        }
        if (this.f24056x) {
            this.f24056x = false;
            x(z8);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void a() {
        if (this.f24054v) {
            this.f24054v = false;
            L(true);
        }
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void c(boolean z8) {
        this.f24052t = z8;
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void d() {
        if (this.f24054v) {
            return;
        }
        this.f24054v = true;
        L(true);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void e() {
        h hVar = this.f24057y;
        if (hVar != null) {
            hVar.a();
            this.f24057y = null;
        }
    }

    @Override // p063h.a
    public boolean g() {
        G g8 = this.f24038f;
        if (g8 == null || !g8.j()) {
            return false;
        }
        this.f24038f.collapseActionView();
        return true;
    }

    @Override // p063h.a
    public void h(boolean z8) {
        if (z8 == this.f24048p) {
            return;
        }
        this.f24048p = z8;
        if (this.f24049q.size() <= 0) {
            return;
        }
        s.a(this.f24049q.get(0));
        throw null;
    }

    @Override // p063h.a
    public int i() {
        return this.f24038f.q();
    }

    @Override // p063h.a
    public Context j() {
        if (this.f24034b == null) {
            TypedValue typedValue = new TypedValue();
            this.f24033a.getTheme().resolveAttribute(p054g.a.f22378h, typedValue, true);
            int i8 = typedValue.resourceId;
            if (i8 != 0) {
                this.f24034b = new ContextThemeWrapper(this.f24033a, i8);
            } else {
                this.f24034b = this.f24033a;
            }
        }
        return this.f24034b;
    }

    @Override // p063h.a
    public void l(Configuration configuration) {
        G(p099l.a.b(this.f24033a).g());
    }

    @Override // p063h.a
    public boolean n(int i8, KeyEvent keyEvent) {
        Menu menuE;
        d dVar = this.f24045m;
        if (dVar == null || (menuE = dVar.e()) == null) {
            return false;
        }
        menuE.setQwertyMode(KeyCharacterMap.load(keyEvent != null ? keyEvent.getDeviceId() : -1).getKeyboardType() != 1);
        return menuE.performShortcut(i8, keyEvent, 0);
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void onWindowVisibilityChanged(int i8) {
        this.f24051s = i8;
    }

    @Override // p063h.a
    public void q(boolean z8) {
        if (this.f24044l) {
            return;
        }
        D(z8);
    }

    @Override // p063h.a
    public void r(boolean z8) {
        h hVar;
        this.f24058z = z8;
        if (z8 || (hVar = this.f24057y) == null) {
            return;
        }
        hVar.a();
    }

    @Override // p063h.a
    public void s(CharSequence charSequence) {
        this.f24038f.setWindowTitle(charSequence);
    }

    @Override // p063h.a
    public p099l.b t(l.b.a aVar) {
        d dVar = this.f24045m;
        if (dVar != null) {
            dVar.c();
        }
        this.f24036d.setHideOnContentScrollEnabled(false);
        this.f24039g.k();
        d dVar2 = new d(this.f24039g.getContext(), aVar);
        if (!dVar2.t()) {
            return null;
        }
        this.f24045m = dVar2;
        dVar2.k();
        this.f24039g.h(dVar2);
        u(true);
        return dVar2;
    }

    public void u(boolean z8) {
        S sN;
        S sF;
        if (z8) {
            K();
        } else {
            B();
        }
        if (!J()) {
            if (z8) {
                this.f24038f.o(4);
                this.f24039g.setVisibility(0);
                return;
            } else {
                this.f24038f.o(0);
                this.f24039g.setVisibility(8);
                return;
            }
        }
        if (z8) {
            sF = this.f24038f.n(4, 100L);
            sN = this.f24039g.f(0, 200L);
        } else {
            sN = this.f24038f.n(0, 200L);
            sF = this.f24039g.f(8, 100L);
        }
        h hVar = new h();
        hVar.d(sF, sN);
        hVar.h();
    }

    public void w() {
        l.b.a aVar = this.f24047o;
        if (aVar != null) {
            aVar.c(this.f24046n);
            this.f24046n = null;
            this.f24047o = null;
        }
    }

    public void x(boolean z8) {
        View view;
        h hVar = this.f24057y;
        if (hVar != null) {
            hVar.a();
        }
        if (this.f24051s != 0 || (!this.f24058z && !z8)) {
            this.f24030B.b(null);
            return;
        }
        this.f24037e.setAlpha(1.0f);
        this.f24037e.setTransitioning(true);
        h hVar2 = new h();
        float f8 = -this.f24037e.getHeight();
        if (z8) {
            int[] iArr = {0, 0};
            this.f24037e.getLocationInWindow(iArr);
            f8 -= iArr[1];
        }
        S sL = I.c(this.f24037e).l(f8);
        sL.j(this.f24032D);
        hVar2.c(sL);
        if (this.f24052t && (view = this.f24040h) != null) {
            hVar2.c(I.c(view).l(f8));
        }
        hVar2.f(f24027E);
        hVar2.e(250L);
        hVar2.g(this.f24030B);
        this.f24057y = hVar2;
        hVar2.h();
    }

    public void y(boolean z8) {
        View view;
        View view2;
        h hVar = this.f24057y;
        if (hVar != null) {
            hVar.a();
        }
        this.f24037e.setVisibility(0);
        if (this.f24051s == 0 && (this.f24058z || z8)) {
            this.f24037e.setTranslationY(0.0f);
            float f8 = -this.f24037e.getHeight();
            if (z8) {
                int[] iArr = {0, 0};
                this.f24037e.getLocationInWindow(iArr);
                f8 -= iArr[1];
            }
            this.f24037e.setTranslationY(f8);
            h hVar2 = new h();
            S sL = I.c(this.f24037e).l(0.0f);
            sL.j(this.f24032D);
            hVar2.c(sL);
            if (this.f24052t && (view2 = this.f24040h) != null) {
                view2.setTranslationY(f8);
                hVar2.c(I.c(this.f24040h).l(0.0f));
            }
            hVar2.f(f24028F);
            hVar2.e(250L);
            hVar2.g(this.f24031C);
            this.f24057y = hVar2;
            hVar2.h();
        } else {
            this.f24037e.setAlpha(1.0f);
            this.f24037e.setTranslationY(0.0f);
            if (this.f24052t && (view = this.f24040h) != null) {
                view.setTranslationY(0.0f);
            }
            this.f24031C.b(null);
        }
        ActionBarOverlayLayout actionBarOverlayLayout = this.f24036d;
        if (actionBarOverlayLayout != null) {
            I.F(actionBarOverlayLayout);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final G z(View view) {
        if (view instanceof G) {
            return (G) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't make a decor toolbar out of ");
        sb.append(view != 0 ? view.getClass().getSimpleName() : "null");
        throw new IllegalStateException(sb.toString());
    }

    public t(Dialog dialog) {
        C(dialog.getWindow().getDecorView());
    }

    @Override // androidx.appcompat.widget.ActionBarOverlayLayout.d
    public void b() {
    }

    public t(View view) {
        C(view);
    }
}
