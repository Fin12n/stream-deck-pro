package p056g1;

/* JADX INFO: renamed from: g1.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2350n {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2349m f23642a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C2349m f23643b;

    public C2350n(boolean z8) {
        this.f23642a = new C2349m(z8);
        this.f23643b = new C2349m(z8);
    }

    public final void c(F f8, boolean z8) {
        if (z8) {
            this.f23642a.a(f8);
        } else {
            if (this.f23642a.b(f8)) {
                return;
            }
            this.f23643b.a(f8);
        }
    }

    public final boolean d(F f8) {
        return this.f23642a.b(f8) || this.f23643b.b(f8);
    }

    public final boolean e(F f8, boolean z8) {
        boolean zB = this.f23642a.b(f8);
        if (z8) {
            return zB;
        }
        return zB || this.f23643b.b(f8);
    }

    public final boolean f() {
        return this.f23643b.d() && this.f23642a.d();
    }

    public final boolean g(boolean z8) {
        return (z8 ? this.f23642a : this.f23643b).d();
    }

    public final boolean h() {
        return !f();
    }

    public final boolean i(F f8) {
        return this.f23643b.f(f8) || this.f23642a.f(f8);
    }
}
