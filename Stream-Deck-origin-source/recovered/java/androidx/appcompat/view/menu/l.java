package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import com.revenuecat.purchases.common.Constants;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class l extends e implements SubMenu {

    /* JADX INFO: renamed from: B, reason: collision with root package name */
    public e f13763B;

    /* JADX INFO: renamed from: C, reason: collision with root package name */
    public g f13764C;

    public l(Context context, e eVar, g gVar) {
        super(context);
        this.f13763B = eVar;
        this.f13764C = gVar;
    }

    @Override // androidx.appcompat.view.menu.e
    public e D() {
        return this.f13763B.D();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean G() {
        return this.f13763B.G();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean H() {
        return this.f13763B.H();
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean I() {
        return this.f13763B.I();
    }

    @Override // androidx.appcompat.view.menu.e
    public void S(e.a aVar) {
        this.f13763B.S(aVar);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean f(g gVar) {
        return this.f13763B.f(gVar);
    }

    public Menu f0() {
        return this.f13763B;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.f13764C;
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean h(e eVar, MenuItem menuItem) {
        return super.h(eVar, menuItem) || this.f13763B.h(eVar, menuItem);
    }

    @Override // androidx.appcompat.view.menu.e
    public boolean k(g gVar) {
        return this.f13763B.k(gVar);
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setGroupDividerEnabled(boolean z8) {
        this.f13763B.setGroupDividerEnabled(z8);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.W(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.Z(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.a0(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.f13764C.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.e, android.view.Menu
    public void setQwertyMode(boolean z8) {
        this.f13763B.setQwertyMode(z8);
    }

    @Override // androidx.appcompat.view.menu.e
    public String t() {
        g gVar = this.f13764C;
        int itemId = gVar != null ? gVar.getItemId() : 0;
        if (itemId == 0) {
            return null;
        }
        return super.t() + Constants.SUBS_ID_BASE_PLAN_ID_SEPARATOR + itemId;
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i8) {
        return (SubMenu) super.V(i8);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i8) {
        return (SubMenu) super.Y(i8);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i8) {
        this.f13764C.setIcon(i8);
        return this;
    }
}
