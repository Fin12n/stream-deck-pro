package androidx.appcompat.view.menu;

import U1.AbstractC1640b;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g implements N1.b {

    /* JADX INFO: renamed from: A, reason: collision with root package name */
    public View f13695A;

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public AbstractC1640b f13696B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public MenuItem.OnActionExpandListener f13697C;

    /* JADX INFO: renamed from: E, reason: collision with root package name */
    public ContextMenu.ContextMenuInfo f13699E;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f13700a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f13701b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f13702c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f13703d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f13704e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public CharSequence f13705f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public Intent f13706g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public char f13707h;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public char f13709j;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Drawable f13711l;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public e f13713n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public l f13714o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Runnable f13715p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f13716q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public CharSequence f13717r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public CharSequence f13718s;

    /* JADX INFO: renamed from: z, reason: collision with root package name */
    public int f13725z;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public int f13708i = 4096;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public int f13710k = 4096;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public int f13712m = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public ColorStateList f13719t = null;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public PorterDuff.Mode f13720u = null;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public boolean f13721v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public boolean f13722w = false;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    public boolean f13723x = false;

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    public int f13724y = 16;

    /* JADX INFO: renamed from: D, reason: collision with root package name */
    public boolean f13698D = false;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a implements AbstractC1640b.InterfaceC0283b {
        public a() {
        }

        @Override // U1.AbstractC1640b.InterfaceC0283b
        public void onActionProviderVisibilityChanged(boolean z8) {
            g gVar = g.this;
            gVar.f13713n.K(gVar);
        }
    }

    public g(e eVar, int i8, int i9, int i10, int i11, CharSequence charSequence, int i12) {
        this.f13713n = eVar;
        this.f13700a = i9;
        this.f13701b = i8;
        this.f13702c = i10;
        this.f13703d = i11;
        this.f13704e = charSequence;
        this.f13725z = i12;
    }

    public static void d(StringBuilder sb, int i8, int i9, String str) {
        if ((i8 & i9) == i9) {
            sb.append(str);
        }
    }

    public boolean A() {
        return this.f13713n.I() && g() != 0;
    }

    public boolean B() {
        return (this.f13725z & 4) == 4;
    }

    @Override // N1.b
    public N1.b a(AbstractC1640b abstractC1640b) {
        AbstractC1640b abstractC1640b2 = this.f13696B;
        if (abstractC1640b2 != null) {
            abstractC1640b2.h();
        }
        this.f13695A = null;
        this.f13696B = abstractC1640b;
        this.f13713n.L(true);
        AbstractC1640b abstractC1640b3 = this.f13696B;
        if (abstractC1640b3 != null) {
            abstractC1640b3.j(new a());
        }
        return this;
    }

    @Override // N1.b
    public AbstractC1640b b() {
        return this.f13696B;
    }

    public void c() {
        this.f13713n.J(this);
    }

    @Override // N1.b, android.view.MenuItem
    public boolean collapseActionView() {
        if ((this.f13725z & 8) == 0) {
            return false;
        }
        if (this.f13695A == null) {
            return true;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13697C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionCollapse(this)) {
            return this.f13713n.f(this);
        }
        return false;
    }

    public final Drawable e(Drawable drawable) {
        if (drawable != null && this.f13723x && (this.f13721v || this.f13722w)) {
            drawable = M1.a.i(drawable).mutate();
            if (this.f13721v) {
                M1.a.g(drawable, this.f13719t);
            }
            if (this.f13722w) {
                M1.a.h(drawable, this.f13720u);
            }
            this.f13723x = false;
        }
        return drawable;
    }

    @Override // N1.b, android.view.MenuItem
    public boolean expandActionView() {
        if (!j()) {
            return false;
        }
        MenuItem.OnActionExpandListener onActionExpandListener = this.f13697C;
        if (onActionExpandListener == null || onActionExpandListener.onMenuItemActionExpand(this)) {
            return this.f13713n.k(this);
        }
        return false;
    }

    public int f() {
        return this.f13703d;
    }

    public char g() {
        return this.f13713n.H() ? this.f13709j : this.f13707h;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
    }

    @Override // N1.b, android.view.MenuItem
    public View getActionView() {
        View view = this.f13695A;
        if (view != null) {
            return view;
        }
        AbstractC1640b abstractC1640b = this.f13696B;
        if (abstractC1640b == null) {
            return null;
        }
        View viewD = abstractC1640b.d(this);
        this.f13695A = viewD;
        return viewD;
    }

    @Override // N1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f13710k;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f13709j;
    }

    @Override // N1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f13717r;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f13701b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        Drawable drawable = this.f13711l;
        if (drawable != null) {
            return e(drawable);
        }
        if (this.f13712m == 0) {
            return null;
        }
        Drawable drawableB = p072i.a.b(this.f13713n.u(), this.f13712m);
        this.f13712m = 0;
        this.f13711l = drawableB;
        return e(drawableB);
    }

    @Override // N1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f13719t;
    }

    @Override // N1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f13720u;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f13706g;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f13700a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f13699E;
    }

    @Override // N1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f13708i;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f13707h;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f13702c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return this.f13714o;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f13704e;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f13705f;
        return charSequence != null ? charSequence : this.f13704e;
    }

    @Override // N1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f13718s;
    }

    public String h() {
        char cG = g();
        if (cG == 0) {
            return "";
        }
        Resources resources = this.f13713n.u().getResources();
        StringBuilder sb = new StringBuilder();
        if (ViewConfiguration.get(this.f13713n.u()).hasPermanentMenuKey()) {
            sb.append(resources.getString(p054g.h.f22532k));
        }
        int i8 = this.f13713n.H() ? this.f13710k : this.f13708i;
        d(sb, i8, 65536, resources.getString(p054g.h.f22528g));
        d(sb, i8, 4096, resources.getString(p054g.h.f22524c));
        d(sb, i8, 2, resources.getString(p054g.h.f22523b));
        d(sb, i8, 1, resources.getString(p054g.h.f22529h));
        d(sb, i8, 4, resources.getString(p054g.h.f22531j));
        d(sb, i8, 8, resources.getString(p054g.h.f22527f));
        if (cG == '\b') {
            sb.append(resources.getString(p054g.h.f22525d));
        } else if (cG == '\n') {
            sb.append(resources.getString(p054g.h.f22526e));
        } else if (cG != ' ') {
            sb.append(cG);
        } else {
            sb.append(resources.getString(p054g.h.f22530i));
        }
        return sb.toString();
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f13714o != null;
    }

    public CharSequence i(j.a aVar) {
        return (aVar == null || !aVar.c()) ? getTitle() : getTitleCondensed();
    }

    @Override // N1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f13698D;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f13724y & 1) == 1;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f13724y & 2) == 2;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f13724y & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        AbstractC1640b abstractC1640b = this.f13696B;
        if (abstractC1640b == null || !abstractC1640b.g()) {
            return (this.f13724y & 8) == 0;
        }
        return (this.f13724y & 8) == 0 && this.f13696B.b();
    }

    public boolean j() {
        AbstractC1640b abstractC1640b;
        if ((this.f13725z & 8) != 0) {
            if (this.f13695A == null && (abstractC1640b = this.f13696B) != null) {
                this.f13695A = abstractC1640b.d(this);
            }
            if (this.f13695A != null) {
                return true;
            }
        }
        return false;
    }

    public boolean k() {
        MenuItem.OnMenuItemClickListener onMenuItemClickListener = this.f13716q;
        if (onMenuItemClickListener != null && onMenuItemClickListener.onMenuItemClick(this)) {
            return true;
        }
        e eVar = this.f13713n;
        if (eVar.h(eVar, this)) {
            return true;
        }
        Runnable runnable = this.f13715p;
        if (runnable != null) {
            runnable.run();
            return true;
        }
        if (this.f13706g != null) {
            try {
                this.f13713n.u().startActivity(this.f13706g);
                return true;
            } catch (ActivityNotFoundException e8) {
                Log.e("MenuItemImpl", "Can't find activity to handle intent; ignoring", e8);
            }
        }
        AbstractC1640b abstractC1640b = this.f13696B;
        return abstractC1640b != null && abstractC1640b.e();
    }

    public boolean l() {
        return (this.f13724y & 32) == 32;
    }

    public boolean m() {
        return (this.f13724y & 4) != 0;
    }

    public boolean n() {
        return (this.f13725z & 1) == 1;
    }

    public boolean o() {
        return (this.f13725z & 2) == 2;
    }

    @Override // N1.b, android.view.MenuItem
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public N1.b setActionView(int i8) {
        Context contextU = this.f13713n.u();
        setActionView(LayoutInflater.from(contextU).inflate(i8, (ViewGroup) new LinearLayout(contextU), false));
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public N1.b setActionView(View view) {
        int i8;
        this.f13695A = view;
        this.f13696B = null;
        if (view != null && view.getId() == -1 && (i8 = this.f13700a) > 0) {
            view.setId(i8);
        }
        this.f13713n.J(this);
        return this;
    }

    public void r(boolean z8) {
        this.f13698D = z8;
        this.f13713n.L(false);
    }

    public void s(boolean z8) {
        int i8 = this.f13724y;
        int i9 = (z8 ? 2 : 0) | (i8 & (-3));
        this.f13724y = i9;
        if (i8 != i9) {
            this.f13713n.L(false);
        }
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        if (this.f13709j == c8) {
            return this;
        }
        this.f13709j = Character.toLowerCase(c8);
        this.f13713n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z8) {
        int i8 = this.f13724y;
        int i9 = (z8 ? 1 : 0) | (i8 & (-2));
        this.f13724y = i9;
        if (i8 != i9) {
            this.f13713n.L(false);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z8) {
        if ((this.f13724y & 4) != 0) {
            this.f13713n.U(this);
            return this;
        }
        s(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z8) {
        if (z8) {
            this.f13724y |= 16;
        } else {
            this.f13724y &= -17;
        }
        this.f13713n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f13712m = 0;
        this.f13711l = drawable;
        this.f13723x = true;
        this.f13713n.L(false);
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f13719t = colorStateList;
        this.f13721v = true;
        this.f13723x = true;
        this.f13713n.L(false);
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f13720u = mode;
        this.f13722w = true;
        this.f13723x = true;
        this.f13713n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f13706g = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        if (this.f13707h == c8) {
            return this;
        }
        this.f13707h = c8;
        this.f13713n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f13697C = onActionExpandListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f13716q = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f13707h = c8;
        this.f13709j = Character.toLowerCase(c9);
        this.f13713n.L(false);
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public void setShowAsAction(int i8) {
        int i9 = i8 & 3;
        if (i9 != 0 && i9 != 1 && i9 != 2) {
            throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
        }
        this.f13725z = i8;
        this.f13713n.J(this);
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f13704e = charSequence;
        this.f13713n.L(false);
        l lVar = this.f13714o;
        if (lVar != null) {
            lVar.setHeaderTitle(charSequence);
        }
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f13705f = charSequence;
        this.f13713n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z8) {
        if (y(z8)) {
            this.f13713n.K(this);
        }
        return this;
    }

    public void t(boolean z8) {
        this.f13724y = (z8 ? 4 : 0) | (this.f13724y & (-5));
    }

    public String toString() {
        CharSequence charSequence = this.f13704e;
        if (charSequence != null) {
            return charSequence.toString();
        }
        return null;
    }

    public void u(boolean z8) {
        if (z8) {
            this.f13724y |= 32;
        } else {
            this.f13724y &= -33;
        }
    }

    public void v(ContextMenu.ContextMenuInfo contextMenuInfo) {
        this.f13699E = contextMenuInfo;
    }

    @Override // N1.b, android.view.MenuItem
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public N1.b setShowAsActionFlags(int i8) {
        setShowAsAction(i8);
        return this;
    }

    public void x(l lVar) {
        this.f13714o = lVar;
        lVar.setHeaderTitle(getTitle());
    }

    public boolean y(boolean z8) {
        int i8 = this.f13724y;
        int i9 = (z8 ? 0 : 8) | (i8 & (-9));
        this.f13724y = i9;
        return i8 != i9;
    }

    public boolean z() {
        return this.f13713n.A();
    }

    @Override // android.view.MenuItem
    public N1.b setContentDescription(CharSequence charSequence) {
        this.f13717r = charSequence;
        this.f13713n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public N1.b setTooltipText(CharSequence charSequence) {
        this.f13718s = charSequence;
        this.f13713n.L(false);
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i8) {
        if (this.f13709j == c8 && this.f13710k == i8) {
            return this;
        }
        this.f13709j = Character.toLowerCase(c8);
        this.f13710k = KeyEvent.normalizeMetaState(i8);
        this.f13713n.L(false);
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i8) {
        if (this.f13707h == c8 && this.f13708i == i8) {
            return this;
        }
        this.f13707h = c8;
        this.f13708i = KeyEvent.normalizeMetaState(i8);
        this.f13713n.L(false);
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i8, int i9) {
        this.f13707h = c8;
        this.f13708i = KeyEvent.normalizeMetaState(i8);
        this.f13709j = Character.toLowerCase(c9);
        this.f13710k = KeyEvent.normalizeMetaState(i9);
        this.f13713n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f13711l = null;
        this.f13712m = i8;
        this.f13723x = true;
        this.f13713n.L(false);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        return setTitle(this.f13713n.u().getString(i8));
    }
}
