package A1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f429a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f430b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B1.a f431c;

    public g(float f8, float f9, B1.a aVar) {
        this.f429a = f8;
        this.f430b = f9;
        this.f431c = aVar;
    }

    @Override // A1.l
    public long H(float f8) {
        return w.e(this.f431c.a(f8));
    }

    @Override // A1.l
    public float T(long j8) {
        if (x.g(v.g(j8), x.f466b.b())) {
            return h.m(this.f431c.b(v.h(j8)));
        }
        throw new IllegalStateException("Only Sp can convert to Px");
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return Float.compare(this.f429a, gVar.f429a) == 0 && Float.compare(this.f430b, gVar.f430b) == 0 && kotlin.jvm.internal.t.c(this.f431c, gVar.f431c);
    }

    @Override // A1.d
    public float getDensity() {
        return this.f429a;
    }

    public int hashCode() {
        return (((Float.hashCode(this.f429a) * 31) + Float.hashCode(this.f430b)) * 31) + this.f431c.hashCode();
    }

    public String toString() {
        return "DensityWithConverter(density=" + this.f429a + ", fontScale=" + this.f430b + ", converter=" + this.f431c + ')';
    }

    @Override // A1.l
    public float x0() {
        return this.f430b;
    }
}
