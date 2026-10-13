package Z0;

import L0.i;
import Q6.k;
import android.view.KeyEvent;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f extends i.c implements e {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f12840n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f12841o;

    public f(k kVar, k kVar2) {
        this.f12840n = kVar;
        this.f12841o = kVar2;
    }

    @Override // Z0.e
    public boolean W(KeyEvent keyEvent) {
        k kVar = this.f12840n;
        if (kVar != null) {
            return ((Boolean) kVar.invoke(b.a(keyEvent))).booleanValue();
        }
        return false;
    }

    public final void d2(k kVar) {
        this.f12840n = kVar;
    }

    public final void e2(k kVar) {
        this.f12841o = kVar;
    }

    @Override // Z0.e
    public boolean y(KeyEvent keyEvent) {
        k kVar = this.f12841o;
        if (kVar != null) {
            return ((Boolean) kVar.invoke(b.a(keyEvent))).booleanValue();
        }
        return false;
    }
}
