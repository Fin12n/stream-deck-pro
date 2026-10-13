package p100l0;

import D6.z;
import p038e1.c0;
import p109m0.InterfaceC2674l;

/* JADX INFO: renamed from: l0.g, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2646g implements InterfaceC2674l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final G f28975a;

    public C2646g(G g8) {
        this.f28975a = g8;
    }

    @Override // p109m0.InterfaceC2674l
    public int d() {
        return this.f28975a.p().a();
    }

    @Override // p109m0.InterfaceC2674l
    public int e() {
        return ((k) z.t0(this.f28975a.p().b())).getIndex();
    }

    @Override // p109m0.InterfaceC2674l
    public void f() {
        c0 c0VarW = this.f28975a.w();
        if (c0VarW != null) {
            c0VarW.i();
        }
    }

    @Override // p109m0.InterfaceC2674l
    public boolean g() {
        return !this.f28975a.p().b().isEmpty();
    }

    @Override // p109m0.InterfaceC2674l
    public int h() {
        return this.f28975a.m();
    }
}
