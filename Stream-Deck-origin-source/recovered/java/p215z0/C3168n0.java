package p215z0;

import C6.C0920i;

/* JADX INFO: renamed from: z0.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3168n0 implements InterfaceC3149e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3149e f38874a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f38875b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public int f38876c;

    public C3168n0(InterfaceC3149e interfaceC3149e, int i8) {
        this.f38874a = interfaceC3149e;
        this.f38875b = i8;
    }

    @Override // p215z0.InterfaceC3149e
    public void a(int i8, int i9) {
        this.f38874a.a(i8 + (this.f38876c == 0 ? this.f38875b : 0), i9);
    }

    @Override // p215z0.InterfaceC3149e
    public Object b() {
        return this.f38874a.b();
    }

    @Override // p215z0.InterfaceC3149e
    public void c(int i8, Object obj) {
        this.f38874a.c(i8 + (this.f38876c == 0 ? this.f38875b : 0), obj);
    }

    @Override // p215z0.InterfaceC3149e
    public void clear() {
        AbstractC3169o.v("Clear is not valid on OffsetApplier");
        throw new C0920i();
    }

    @Override // p215z0.InterfaceC3149e
    public void d(Object obj) {
        this.f38876c++;
        this.f38874a.d(obj);
    }

    @Override // p215z0.InterfaceC3149e
    public void f(int i8, int i9, int i10) {
        int i11 = this.f38876c == 0 ? this.f38875b : 0;
        this.f38874a.f(i8 + i11, i9 + i11, i10);
    }

    @Override // p215z0.InterfaceC3149e
    public void g() {
        int i8 = this.f38876c;
        if (!(i8 > 0)) {
            AbstractC3169o.v("OffsetApplier up called with no corresponding down");
            throw new C0920i();
        }
        this.f38876c = i8 - 1;
        this.f38874a.g();
    }

    @Override // p215z0.InterfaceC3149e
    public void h(int i8, Object obj) {
        this.f38874a.h(i8 + (this.f38876c == 0 ? this.f38875b : 0), obj);
    }
}
