package p038e1;

import A1.b;

/* JADX INFO: renamed from: e1.h, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2237h implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC2243n f20479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final EnumC2245p f20480b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final EnumC2246q f20481c;

    public C2237h(InterfaceC2243n interfaceC2243n, EnumC2245p enumC2245p, EnumC2246q enumC2246q) {
        this.f20479a = interfaceC2243n;
        this.f20480b = enumC2245p;
        this.f20481c = enumC2246q;
    }

    @Override // p038e1.InterfaceC2243n
    public int F(int i8) {
        return this.f20479a.F(i8);
    }

    @Override // p038e1.InterfaceC2243n
    public int G(int i8) {
        return this.f20479a.G(i8);
    }

    @Override // p038e1.G
    public a0 J(long j8) {
        if (this.f20481c == EnumC2246q.Width) {
            return new C2240k(this.f20480b == EnumC2245p.Max ? this.f20479a.G(b.m(j8)) : this.f20479a.F(b.m(j8)), b.i(j8) ? b.m(j8) : 32767);
        }
        return new C2240k(b.j(j8) ? b.n(j8) : 32767, this.f20480b == EnumC2245p.Max ? this.f20479a.g(b.n(j8)) : this.f20479a.W(b.n(j8)));
    }

    @Override // p038e1.InterfaceC2243n
    public int W(int i8) {
        return this.f20479a.W(i8);
    }

    @Override // p038e1.InterfaceC2243n
    public Object e() {
        return this.f20479a.e();
    }

    @Override // p038e1.InterfaceC2243n
    public int g(int i8) {
        return this.f20479a.g(i8);
    }
}
