package L;

import A.InterfaceC0870f0;
import H.InterfaceC1014y;
import H.m1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements InterfaceC0870f0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC1014y f4744a;

    public c(InterfaceC1014y interfaceC1014y) {
        this.f4744a = interfaceC1014y;
    }

    @Override // A.InterfaceC0870f0
    public long a() {
        return this.f4744a.a();
    }

    @Override // A.InterfaceC0870f0
    public m1 b() {
        return this.f4744a.b();
    }

    @Override // A.InterfaceC0870f0
    public int c() {
        return this.f4744a.c().b();
    }

    @Override // A.InterfaceC0870f0
    public void d(I.h.b bVar) {
        this.f4744a.d(bVar);
    }

    @Override // A.InterfaceC0870f0
    public int e() {
        return 0;
    }

    public InterfaceC1014y f() {
        return this.f4744a;
    }
}
