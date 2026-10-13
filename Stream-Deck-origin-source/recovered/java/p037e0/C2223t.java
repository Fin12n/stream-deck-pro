package p037e0;

/* JADX INFO: renamed from: e0.t, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2223t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public double f20330a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f20331b;

    public C2223t(double d8, double d9) {
        this.f20330a = d8;
        this.f20331b = d9;
    }

    public final double e() {
        return this.f20331b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2223t)) {
            return false;
        }
        C2223t c2223t = (C2223t) obj;
        return Double.compare(this.f20330a, c2223t.f20330a) == 0 && Double.compare(this.f20331b, c2223t.f20331b) == 0;
    }

    public final double f() {
        return this.f20330a;
    }

    public int hashCode() {
        return (Double.hashCode(this.f20330a) * 31) + Double.hashCode(this.f20331b);
    }

    public String toString() {
        return "ComplexDouble(_real=" + this.f20330a + ", _imaginary=" + this.f20331b + ')';
    }
}
