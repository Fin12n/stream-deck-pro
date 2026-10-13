package U1;

import android.content.Context;
import android.util.Log;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;

/* JADX INFO: renamed from: U1.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1640b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f10085a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public a f10086b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC0283b f10087c;

    /* JADX INFO: renamed from: U1.b$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
    }

    /* JADX INFO: renamed from: U1.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface InterfaceC0283b {
        void onActionProviderVisibilityChanged(boolean z8);
    }

    public AbstractC1640b(Context context) {
        this.f10085a = context;
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return true;
    }

    public abstract View c();

    public View d(MenuItem menuItem) {
        return c();
    }

    public boolean e() {
        return false;
    }

    public boolean g() {
        return false;
    }

    public void h() {
        this.f10087c = null;
        this.f10086b = null;
    }

    public void i(a aVar) {
        this.f10086b = aVar;
    }

    public void j(InterfaceC0283b interfaceC0283b) {
        if (this.f10087c != null && interfaceC0283b != null) {
            Log.w("ActionProvider(support)", "setVisibilityListener: Setting a new ActionProvider.VisibilityListener when one is already set. Are you reusing this " + getClass().getSimpleName() + " instance while it is still in use somewhere else?");
        }
        this.f10087c = interfaceC0283b;
    }

    public void f(SubMenu subMenu) {
    }
}
