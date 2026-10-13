package p108m;

import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import p010b0.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f29273a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public C f29274b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public C f29275c;

    public b(Context context) {
        this.f29273a = context;
    }

    public final MenuItem c(MenuItem menuItem) {
        if (!(menuItem instanceof N1.b)) {
            return menuItem;
        }
        N1.b bVar = (N1.b) menuItem;
        if (this.f29274b == null) {
            this.f29274b = new C();
        }
        MenuItem menuItem2 = (MenuItem) this.f29274b.get(bVar);
        if (menuItem2 != null) {
            return menuItem2;
        }
        c cVar = new c(this.f29273a, bVar);
        this.f29274b.put(bVar, cVar);
        return cVar;
    }

    public final void e() {
        C c8 = this.f29274b;
        if (c8 != null) {
            c8.clear();
        }
        C c9 = this.f29275c;
        if (c9 != null) {
            c9.clear();
        }
    }

    public final void f(int i8) {
        if (this.f29274b == null) {
            return;
        }
        int i9 = 0;
        while (i9 < this.f29274b.size()) {
            if (((N1.b) this.f29274b.f(i9)).getGroupId() == i8) {
                this.f29274b.h(i9);
                i9--;
            }
            i9++;
        }
    }

    public final void g(int i8) {
        if (this.f29274b == null) {
            return;
        }
        for (int i9 = 0; i9 < this.f29274b.size(); i9++) {
            if (((N1.b) this.f29274b.f(i9)).getItemId() == i8) {
                this.f29274b.h(i9);
                return;
            }
        }
    }

    public final SubMenu d(SubMenu subMenu) {
        return subMenu;
    }
}
