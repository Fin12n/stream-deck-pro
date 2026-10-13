package p108m;

import U1.AbstractC1640b;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.widget.FrameLayout;
import java.lang.reflect.Method;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class c extends p108m.b implements MenuItem {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final N1.b f29276d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Method f29277e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class a extends AbstractC1640b implements ActionProvider.VisibilityListener {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public AbstractC1640b.InterfaceC0283b f29278d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final ActionProvider f29279e;

        public a(Context context, ActionProvider actionProvider) {
            super(context);
            this.f29279e = actionProvider;
        }

        @Override // U1.AbstractC1640b
        public boolean a() {
            return this.f29279e.hasSubMenu();
        }

        @Override // U1.AbstractC1640b
        public boolean b() {
            return this.f29279e.isVisible();
        }

        @Override // U1.AbstractC1640b
        public View c() {
            return this.f29279e.onCreateActionView();
        }

        @Override // U1.AbstractC1640b
        public View d(MenuItem menuItem) {
            return this.f29279e.onCreateActionView(menuItem);
        }

        @Override // U1.AbstractC1640b
        public boolean e() {
            return this.f29279e.onPerformDefaultAction();
        }

        @Override // U1.AbstractC1640b
        public void f(SubMenu subMenu) {
            this.f29279e.onPrepareSubMenu(c.this.d(subMenu));
        }

        @Override // U1.AbstractC1640b
        public boolean g() {
            return this.f29279e.overridesItemVisibility();
        }

        @Override // U1.AbstractC1640b
        public void j(AbstractC1640b.InterfaceC0283b interfaceC0283b) {
            this.f29278d = interfaceC0283b;
            this.f29279e.setVisibilityListener(interfaceC0283b != null ? this : null);
        }

        @Override // android.view.ActionProvider.VisibilityListener
        public void onActionProviderVisibilityChanged(boolean z8) {
            AbstractC1640b.InterfaceC0283b interfaceC0283b = this.f29278d;
            if (interfaceC0283b != null) {
                interfaceC0283b.onActionProviderVisibilityChanged(z8);
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class b extends FrameLayout implements p099l.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final CollapsibleActionView f29281a;

        /* JADX WARN: Multi-variable type inference failed */
        public b(View view) {
            super(view.getContext());
            this.f29281a = (CollapsibleActionView) view;
            addView(view);
        }

        public View a() {
            return (View) this.f29281a;
        }

        @Override // p099l.c
        public void onActionViewCollapsed() {
            this.f29281a.onActionViewCollapsed();
        }

        @Override // p099l.c
        public void onActionViewExpanded() {
            this.f29281a.onActionViewExpanded();
        }
    }

    /* JADX INFO: renamed from: m.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class MenuItemOnActionExpandListenerC0636c implements MenuItem.OnActionExpandListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnActionExpandListener f29282a;

        public MenuItemOnActionExpandListenerC0636c(MenuItem.OnActionExpandListener onActionExpandListener) {
            this.f29282a = onActionExpandListener;
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionCollapse(MenuItem menuItem) {
            return this.f29282a.onMenuItemActionCollapse(c.this.c(menuItem));
        }

        @Override // android.view.MenuItem.OnActionExpandListener
        public boolean onMenuItemActionExpand(MenuItem menuItem) {
            return this.f29282a.onMenuItemActionExpand(c.this.c(menuItem));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public class d implements MenuItem.OnMenuItemClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final MenuItem.OnMenuItemClickListener f29284a;

        public d(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
            this.f29284a = onMenuItemClickListener;
        }

        @Override // android.view.MenuItem.OnMenuItemClickListener
        public boolean onMenuItemClick(MenuItem menuItem) {
            return this.f29284a.onMenuItemClick(c.this.c(menuItem));
        }
    }

    public c(Context context, N1.b bVar) {
        super(context);
        if (bVar == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f29276d = bVar;
    }

    @Override // android.view.MenuItem
    public boolean collapseActionView() {
        return this.f29276d.collapseActionView();
    }

    @Override // android.view.MenuItem
    public boolean expandActionView() {
        return this.f29276d.expandActionView();
    }

    @Override // android.view.MenuItem
    public ActionProvider getActionProvider() {
        AbstractC1640b abstractC1640bB = this.f29276d.b();
        if (abstractC1640bB instanceof a) {
            return ((a) abstractC1640bB).f29279e;
        }
        return null;
    }

    @Override // android.view.MenuItem
    public View getActionView() {
        View actionView = this.f29276d.getActionView();
        return actionView instanceof b ? ((b) actionView).a() : actionView;
    }

    @Override // android.view.MenuItem
    public int getAlphabeticModifiers() {
        return this.f29276d.getAlphabeticModifiers();
    }

    @Override // android.view.MenuItem
    public char getAlphabeticShortcut() {
        return this.f29276d.getAlphabeticShortcut();
    }

    @Override // android.view.MenuItem
    public CharSequence getContentDescription() {
        return this.f29276d.getContentDescription();
    }

    @Override // android.view.MenuItem
    public int getGroupId() {
        return this.f29276d.getGroupId();
    }

    @Override // android.view.MenuItem
    public Drawable getIcon() {
        return this.f29276d.getIcon();
    }

    @Override // android.view.MenuItem
    public ColorStateList getIconTintList() {
        return this.f29276d.getIconTintList();
    }

    @Override // android.view.MenuItem
    public PorterDuff.Mode getIconTintMode() {
        return this.f29276d.getIconTintMode();
    }

    @Override // android.view.MenuItem
    public Intent getIntent() {
        return this.f29276d.getIntent();
    }

    @Override // android.view.MenuItem
    public int getItemId() {
        return this.f29276d.getItemId();
    }

    @Override // android.view.MenuItem
    public ContextMenu.ContextMenuInfo getMenuInfo() {
        return this.f29276d.getMenuInfo();
    }

    @Override // android.view.MenuItem
    public int getNumericModifiers() {
        return this.f29276d.getNumericModifiers();
    }

    @Override // android.view.MenuItem
    public char getNumericShortcut() {
        return this.f29276d.getNumericShortcut();
    }

    @Override // android.view.MenuItem
    public int getOrder() {
        return this.f29276d.getOrder();
    }

    @Override // android.view.MenuItem
    public SubMenu getSubMenu() {
        return d(this.f29276d.getSubMenu());
    }

    @Override // android.view.MenuItem
    public CharSequence getTitle() {
        return this.f29276d.getTitle();
    }

    @Override // android.view.MenuItem
    public CharSequence getTitleCondensed() {
        return this.f29276d.getTitleCondensed();
    }

    @Override // android.view.MenuItem
    public CharSequence getTooltipText() {
        return this.f29276d.getTooltipText();
    }

    public void h(boolean z8) {
        try {
            if (this.f29277e == null) {
                this.f29277e = this.f29276d.getClass().getDeclaredMethod("setExclusiveCheckable", Boolean.TYPE);
            }
            this.f29277e.invoke(this.f29276d, Boolean.valueOf(z8));
        } catch (Exception e8) {
            Log.w("MenuItemWrapper", "Error while calling setExclusiveCheckable", e8);
        }
    }

    @Override // android.view.MenuItem
    public boolean hasSubMenu() {
        return this.f29276d.hasSubMenu();
    }

    @Override // android.view.MenuItem
    public boolean isActionViewExpanded() {
        return this.f29276d.isActionViewExpanded();
    }

    @Override // android.view.MenuItem
    public boolean isCheckable() {
        return this.f29276d.isCheckable();
    }

    @Override // android.view.MenuItem
    public boolean isChecked() {
        return this.f29276d.isChecked();
    }

    @Override // android.view.MenuItem
    public boolean isEnabled() {
        return this.f29276d.isEnabled();
    }

    @Override // android.view.MenuItem
    public boolean isVisible() {
        return this.f29276d.isVisible();
    }

    @Override // android.view.MenuItem
    public MenuItem setActionProvider(ActionProvider actionProvider) {
        a aVar = new a(this.f29273a, actionProvider);
        N1.b bVar = this.f29276d;
        if (actionProvider == null) {
            aVar = null;
        }
        bVar.a(aVar);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(View view) {
        if (view instanceof CollapsibleActionView) {
            view = new b(view);
        }
        this.f29276d.setActionView(view);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8) {
        this.f29276d.setAlphabeticShortcut(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setCheckable(boolean z8) {
        this.f29276d.setCheckable(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setChecked(boolean z8) {
        this.f29276d.setChecked(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setContentDescription(CharSequence charSequence) {
        this.f29276d.setContentDescription(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setEnabled(boolean z8) {
        this.f29276d.setEnabled(z8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(Drawable drawable) {
        this.f29276d.setIcon(drawable);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintList(ColorStateList colorStateList) {
        this.f29276d.setIconTintList(colorStateList);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIconTintMode(PorterDuff.Mode mode) {
        this.f29276d.setIconTintMode(mode);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIntent(Intent intent) {
        this.f29276d.setIntent(intent);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8) {
        this.f29276d.setNumericShortcut(c8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener onActionExpandListener) {
        this.f29276d.setOnActionExpandListener(onActionExpandListener != null ? new MenuItemOnActionExpandListenerC0636c(onActionExpandListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener onMenuItemClickListener) {
        this.f29276d.setOnMenuItemClickListener(onMenuItemClickListener != null ? new d(onMenuItemClickListener) : null);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9) {
        this.f29276d.setShortcut(c8, c9);
        return this;
    }

    @Override // android.view.MenuItem
    public void setShowAsAction(int i8) {
        this.f29276d.setShowAsAction(i8);
    }

    @Override // android.view.MenuItem
    public MenuItem setShowAsActionFlags(int i8) {
        this.f29276d.setShowAsActionFlags(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(CharSequence charSequence) {
        this.f29276d.setTitle(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitleCondensed(CharSequence charSequence) {
        this.f29276d.setTitleCondensed(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTooltipText(CharSequence charSequence) {
        this.f29276d.setTooltipText(charSequence);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setVisible(boolean z8) {
        return this.f29276d.setVisible(z8);
    }

    @Override // android.view.MenuItem
    public MenuItem setAlphabeticShortcut(char c8, int i8) {
        this.f29276d.setAlphabeticShortcut(c8, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setIcon(int i8) {
        this.f29276d.setIcon(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setNumericShortcut(char c8, int i8) {
        this.f29276d.setNumericShortcut(c8, i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setShortcut(char c8, char c9, int i8, int i9) {
        this.f29276d.setShortcut(c8, c9, i8, i9);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setTitle(int i8) {
        this.f29276d.setTitle(i8);
        return this;
    }

    @Override // android.view.MenuItem
    public MenuItem setActionView(int i8) {
        this.f29276d.setActionView(i8);
        View actionView = this.f29276d.getActionView();
        if (actionView instanceof CollapsibleActionView) {
            this.f29276d.setActionView(new b(actionView));
        }
        return this;
    }
}
