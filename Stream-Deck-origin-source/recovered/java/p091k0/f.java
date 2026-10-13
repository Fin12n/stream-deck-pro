package p091k0;

import D6.z;
import p038e1.c0;
import p109m0.InterfaceC2674l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class f implements InterfaceC2674l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f28403a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f28404b;

    public f(y yVar, int i8) {
        this.f28403a = yVar;
        this.f28404b = i8;
    }

    @Override // p109m0.InterfaceC2674l
    public int d() {
        return this.f28403a.u().a();
    }

    @Override // p109m0.InterfaceC2674l
    public int e() {
        return Math.min(d() - 1, ((l) z.t0(this.f28403a.u().b())).getIndex() + this.f28404b);
    }

    @Override // p109m0.InterfaceC2674l
    public void f() {
        c0 c0VarA = this.f28403a.A();
        if (c0VarA != null) {
            c0VarA.i();
        }
    }

    @Override // p109m0.InterfaceC2674l
    public boolean g() {
        return !this.f28403a.u().b().isEmpty();
    }

    @Override // p109m0.InterfaceC2674l
    public int h() {
        return Math.max(0, this.f28403a.p() - this.f28404b);
    }
}
