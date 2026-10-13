package U1;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: renamed from: U1.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class C1655q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Runnable f10154a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CopyOnWriteArrayList f10155b = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f10156c = new HashMap();

    public C1655q(Runnable runnable) {
        this.f10154a = runnable;
    }

    public void a(InterfaceC1656s interfaceC1656s) {
        this.f10155b.add(interfaceC1656s);
        this.f10154a.run();
    }

    public void b(Menu menu, MenuInflater menuInflater) {
        Iterator it = this.f10155b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1656s) it.next()).c(menu, menuInflater);
        }
    }

    public void c(Menu menu) {
        Iterator it = this.f10155b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1656s) it.next()).b(menu);
        }
    }

    public boolean d(MenuItem menuItem) {
        Iterator it = this.f10155b.iterator();
        while (it.hasNext()) {
            if (((InterfaceC1656s) it.next()).a(menuItem)) {
                return true;
            }
        }
        return false;
    }

    public void e(Menu menu) {
        Iterator it = this.f10155b.iterator();
        while (it.hasNext()) {
            ((InterfaceC1656s) it.next()).d(menu);
        }
    }

    public void f(InterfaceC1656s interfaceC1656s) {
        this.f10155b.remove(interfaceC1656s);
        p063h.s.a(this.f10156c.remove(interfaceC1656s));
        this.f10154a.run();
    }
}
