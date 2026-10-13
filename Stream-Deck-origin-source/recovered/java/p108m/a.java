package p108m;

import N1.b;
import U1.AbstractC1640b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class a implements b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f29253a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f29254b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f29255c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public CharSequence f29256d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public CharSequence f29257e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Intent f29258f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public char f29259g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public char f29261i;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public Drawable f29263k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public Context f29264l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public MenuItem.OnMenuItemClickListener f29265m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public CharSequence f29266n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public CharSequence f29267o;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public int f29260h = 4096;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public int f29262j = 4096;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public ColorStateList f29268p = null;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public PorterDuff.Mode f29269q = null;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public boolean f29270r = false;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public boolean f29271s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public int f29272t = 16;

    public a(Context context, int i8, int i9, int i10, int i11, CharSequence charSequence) {
        this.f29264l = context;
        this.f29253a = i9;
        this.f29254b = i8;
        this.f29255c = i11;
        this.f29256d = charSequence;
    }

    @Override // N1.b
    public b a(AbstractC1640b abstractC1640b) {
        throw new UnsupportedOperationException();
    }

    @Override // N1.b
    public AbstractC1640b b() {
        return null;
    }

    public final void c() {
        Drawable drawable = this.f29263k;
        if (drawable != null) {
            if (this.f29270r || this.f29271s) {
                Drawable drawableI = M1.a.i(drawable);
                this.f29263k = drawableI;
                Drawable drawableMutate = drawableI.mutate();
                this.f29263k = drawableMutate;
                if (this.f29270r) {
                    M1.a.g(drawableMutate, this.f29268p);
                }
                if (this.f29271s) {
                    M1.a.h(this.f29263k, this.f29269q);
                }
            }
        }
    }

    @Override // N1.b, android.view.MenuItem
    public boolean collapseActionView() {
        return false;
    }

    @Override // N1.b, android.view.MenuItem
    /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
    public b setActionView(int i8) {
        throw new UnsupportedOperationException();
    }

    @Override // N1.b, android.view.MenuItem
    /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
    public b setActionView(View view) {
        throw new UnsupportedOperationException();
    }

    @Override // N1.b, android.view.MenuItem
    public boolean expandActionView() {
        return false;
    }

    @Override // N1.b, android.view.MenuItem
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public b setShowAsActionFlags(int i8) {
        setShowAsAction(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        throw new UnsupportedOperationException();
    }

    @Override // N1.b, android.view.MenuItem
    public View getActionView() {
        return null;
    }

    @Override // N1.b, android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f29262j;
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f29261i;
    }

    @Override // N1.b, android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f29266n;
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f29254b;
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f29263k;
    }

    @Override // N1.b, android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f29268p;
    }

    @Override // N1.b, android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f29269q;
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f29258f;
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f29253a;
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return null;
    }

    @Override // N1.b, android.view.MenuItem
    public int getNumericModifiers() {
        return this.f29260h;
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f29259g;
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f29255c;
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return null;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f29256d;
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        CharSequence charSequence = this.f29257e;
        return charSequence != null ? charSequence : this.f29256d;
    }

    @Override // N1.b, android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f29267o;
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return false;
    }

    @Override // N1.b, android.view.MenuItem
    public boolean isActionViewExpanded() {
        return false;
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return (this.f29272t & 1) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return (this.f29272t & 2) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return (this.f29272t & 16) != 0;
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return (this.f29272t & 8) == 0;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        this.f29261i = Character.toLowerCase(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z8) {
        this.f29272t = (z8 ? 1 : 0) | (this.f29272t & (-2));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z8) {
        this.f29272t = (z8 ? 2 : 0) | (this.f29272t & (-3));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z8) {
        this.f29272t = (z8 ? 16 : 0) | (this.f29272t & (-17));
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f29263k = drawable;
        c();
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f29268p = colorStateList;
        this.f29270r = true;
        c();
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f29269q = mode;
        this.f29271s = true;
        c();
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f29258f = intent;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        this.f29259g = c8;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        throw new UnsupportedOperationException();
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f29265m = onMenuItemClickListener;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f29259g = c8;
        this.f29261i = Character.toLowerCase(c9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f29256d = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f29257e = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z8) {
        this.f29272t = (this.f29272t & 8) | (z8 ? 0 : 8);
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i8) {
        this.f29261i = Character.toLowerCase(c8);
        this.f29262j = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public b setContentDescription(CharSequence charSequence) {
        this.f29266n = charSequence;
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i8) {
        this.f29259g = c8;
        this.f29260h = KeyEvent.normalizeMetaState(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        this.f29256d = this.f29264l.getResources().getString(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public b setTooltipText(CharSequence charSequence) {
        this.f29267o = charSequence;
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f29263k = I1.a.d(this.f29264l, i8);
        c();
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i8, int i9) {
        this.f29259g = c8;
        this.f29260h = KeyEvent.normalizeMetaState(i8);
        this.f29261i = Character.toLowerCase(c9);
        this.f29262j = KeyEvent.normalizeMetaState(i9);
        return this;
    }

    @Override // N1.b, android.view.MenuItem
    public void setShowAsAction(int i8) {
    }
}
