package p029d1;

import L0.i;
import Q6.k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends i.c implements a {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public k f19737n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public k f19738o;

    public b(k kVar, k kVar2) {
        this.f19737n = kVar;
        this.f19738o = kVar2;
    }

    @Override // p029d1.a
    public boolean Q0(c cVar) {
        k kVar = this.f19738o;
        if (kVar != null) {
            return ((Boolean) kVar.invoke(cVar)).booleanValue();
        }
        return false;
    }

    public final void d2(k kVar) {
        this.f19737n = kVar;
    }

    public final void e2(k kVar) {
        this.f19738o = kVar;
    }

    @Override // p029d1.a
    public boolean q1(c cVar) {
        k kVar = this.f19737n;
        if (kVar != null) {
            return ((Boolean) kVar.invoke(cVar)).booleanValue();
        }
        return false;
    }
}
