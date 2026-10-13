package p168t1;

import W6.n;

/* JADX INFO: renamed from: t1.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2999d implements I {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f34039b;

    public C2999d(int i8) {
        this.f34039b = i8;
    }

    @Override // p168t1.I
    public C c(C c8) {
        int i8 = this.f34039b;
        return (i8 == 0 || i8 == Integer.MAX_VALUE) ? c8 : new C(n.k(c8.s() + this.f34039b, 1, 1000));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2999d) && this.f34039b == ((C2999d) obj).f34039b;
    }

    public int hashCode() {
        return Integer.hashCode(this.f34039b);
    }

    public String toString() {
        return "AndroidFontResolveInterceptor(fontWeightAdjustment=" + this.f34039b + ')';
    }
}
