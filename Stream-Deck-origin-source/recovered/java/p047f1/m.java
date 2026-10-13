package p047f1;

import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m extends g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final c f21533a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3164l0 f21534b;

    public m(c cVar) {
        super(null);
        this.f21533a = cVar;
        this.f21534b = l1.e(null, null, 2, null);
    }

    @Override // p047f1.g
    public boolean a(c cVar) {
        return cVar == this.f21533a;
    }

    @Override // p047f1.g
    public Object b(c cVar) {
        if (cVar != this.f21533a) {
            throw new IllegalStateException("Check failed.");
        }
        Object objC = c();
        if (objC == null) {
            return null;
        }
        return objC;
    }

    public final Object c() {
        return this.f21534b.getValue();
    }

    public void d(c cVar, Object obj) {
        if (cVar != this.f21533a) {
            throw new IllegalStateException("Check failed.");
        }
        e(obj);
    }

    public final void e(Object obj) {
        this.f21534b.setValue(obj);
    }
}
