package p215z0;

import G6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A0 implements InterfaceC3191z0, InterfaceC3164l0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final g f38502a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final /* synthetic */ InterfaceC3164l0 f38503b;

    public A0(InterfaceC3164l0 interfaceC3164l0, g gVar) {
        this.f38502a = gVar;
        this.f38503b = interfaceC3164l0;
    }

    @Override // p017b7.J
    public g getCoroutineContext() {
        return this.f38502a;
    }

    @Override // p215z0.InterfaceC3164l0, p215z0.q1
    public Object getValue() {
        return this.f38503b.getValue();
    }

    @Override // p215z0.InterfaceC3164l0
    public void setValue(Object obj) {
        this.f38503b.setValue(obj);
    }
}
