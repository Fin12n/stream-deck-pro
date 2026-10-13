package p017b7;

/* JADX INFO: renamed from: b7.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1808s extends AbstractC1819x0 implements r {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC1810t f15980e;

    public C1808s(InterfaceC1810t interfaceC1810t) {
        this.f15980e = interfaceC1810t;
    }

    @Override // p017b7.InterfaceC1809s0
    public void a(Throwable th) {
        this.f15980e.p1(x());
    }

    @Override // p017b7.r
    public InterfaceC1815v0 getParent() {
        return x();
    }

    @Override // p017b7.r
    public boolean j(Throwable th) {
        return x().N(th);
    }
}
