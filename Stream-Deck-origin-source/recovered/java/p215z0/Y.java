package p215z0;

import G6.g;
import Q6.o;
import p017b7.AbstractC1789i;
import p017b7.B0;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Y implements L0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final o f38722a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J f38723b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC1815v0 f38724c;

    public Y(g gVar, o oVar) {
        this.f38722a = oVar;
        this.f38723b = K.a(gVar);
    }

    @Override // p215z0.L0
    public void b() {
        InterfaceC1815v0 interfaceC1815v0 = this.f38724c;
        if (interfaceC1815v0 != null) {
            interfaceC1815v0.z(new C3142a0());
        }
        this.f38724c = null;
    }

    @Override // p215z0.L0
    public void c() {
        InterfaceC1815v0 interfaceC1815v0 = this.f38724c;
        if (interfaceC1815v0 != null) {
            interfaceC1815v0.z(new C3142a0());
        }
        this.f38724c = null;
    }

    @Override // p215z0.L0
    public void d() {
        InterfaceC1815v0 interfaceC1815v0 = this.f38724c;
        if (interfaceC1815v0 != null) {
            B0.f(interfaceC1815v0, "Old job was still running!", null, 2, null);
        }
        this.f38724c = AbstractC1789i.d(this.f38723b, null, null, this.f38722a, 3, null);
    }
}
