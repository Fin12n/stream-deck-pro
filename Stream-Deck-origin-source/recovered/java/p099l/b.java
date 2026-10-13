package p099l;

import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f28820a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public boolean f28821b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        boolean a(b bVar, Menu menu);

        boolean b(b bVar, Menu menu);

        void c(b bVar);

        boolean d(b bVar, MenuItem menuItem);
    }

    public abstract void c();

    public abstract View d();

    public abstract Menu e();

    public abstract MenuInflater f();

    public abstract CharSequence g();

    public Object h() {
        return this.f28820a;
    }

    public abstract CharSequence i();

    public boolean j() {
        return this.f28821b;
    }

    public abstract void k();

    public boolean l() {
        return false;
    }

    public abstract void m(View view);

    public abstract void n(int i8);

    public abstract void o(CharSequence charSequence);

    public void p(Object obj) {
        this.f28820a = obj;
    }

    public abstract void q(int i8);

    public abstract void r(CharSequence charSequence);

    public void s(boolean z8) {
        this.f28821b = z8;
    }
}
