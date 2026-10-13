package p083j1;

import Q0.h;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Function0 f28123a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public h f28124b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0 f28125c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Function0 f28126d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public Function0 f28127e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public Function0 f28128f;

    public c() {
        this(null, null, null, null, null, null, 63, null);
    }

    public final void a(Menu menu, b bVar) {
        menu.add(0, bVar.b(), bVar.c(), bVar.d()).setShowAsAction(1);
    }

    public final void b(Menu menu, b bVar, Function0 function0) {
        if (function0 != null && menu.findItem(bVar.b()) == null) {
            a(menu, bVar);
        } else {
            if (function0 != null || menu.findItem(bVar.b()) == null) {
                return;
            }
            menu.removeItem(bVar.b());
        }
    }

    public final h c() {
        return this.f28124b;
    }

    public final boolean d(ActionMode actionMode, MenuItem menuItem) {
        t.d(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == b.Copy.b()) {
            Function0 function0 = this.f28125c;
            if (function0 != null) {
                function0.invoke();
            }
        } else if (itemId == b.Paste.b()) {
            Function0 function1 = this.f28126d;
            if (function1 != null) {
                function1.invoke();
            }
        } else if (itemId == b.Cut.b()) {
            Function0 function2 = this.f28127e;
            if (function2 != null) {
                function2.invoke();
            }
        } else {
            if (itemId != b.SelectAll.b()) {
                return false;
            }
            Function0 function3 = this.f28128f;
            if (function3 != null) {
                function3.invoke();
            }
        }
        if (actionMode == null) {
            return true;
        }
        actionMode.finish();
        return true;
    }

    public final boolean e(ActionMode actionMode, Menu menu) {
        if (menu == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null menu");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("onCreateActionMode requires a non-null mode");
        }
        if (this.f28125c != null) {
            a(menu, b.Copy);
        }
        if (this.f28126d != null) {
            a(menu, b.Paste);
        }
        if (this.f28127e != null) {
            a(menu, b.Cut);
        }
        if (this.f28128f == null) {
            return true;
        }
        a(menu, b.SelectAll);
        return true;
    }

    public final void f() {
        Function0 function0 = this.f28123a;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final boolean g(ActionMode actionMode, Menu menu) {
        if (actionMode == null || menu == null) {
            return false;
        }
        m(menu);
        return true;
    }

    public final void h(Function0 function0) {
        this.f28125c = function0;
    }

    public final void i(Function0 function0) {
        this.f28127e = function0;
    }

    public final void j(Function0 function0) {
        this.f28126d = function0;
    }

    public final void k(Function0 function0) {
        this.f28128f = function0;
    }

    public final void l(h hVar) {
        this.f28124b = hVar;
    }

    public final void m(Menu menu) {
        b(menu, b.Copy, this.f28125c);
        b(menu, b.Paste, this.f28126d);
        b(menu, b.Cut, this.f28127e);
        b(menu, b.SelectAll, this.f28128f);
    }

    public c(Function0 function0, h hVar, Function0 function1, Function0 function2, Function0 function3, Function0 function4) {
        this.f28123a = function0;
        this.f28124b = hVar;
        this.f28125c = function1;
        this.f28126d = function2;
        this.f28127e = function3;
        this.f28128f = function4;
    }

    public /* synthetic */ c(Function0 function0, h hVar, Function0 function1, Function0 function2, Function0 function3, Function0 function4, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : function0, (i8 & 2) != 0 ? h.f9087e.a() : hVar, (i8 & 4) != 0 ? null : function1, (i8 & 8) != 0 ? null : function2, (i8 & 16) != 0 ? null : function3, (i8 & 32) != 0 ? null : function4);
    }
}
