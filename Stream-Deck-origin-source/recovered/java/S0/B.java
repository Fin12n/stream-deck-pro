package S0;

import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final double f9592a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final double f9593b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final double f9594c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final double f9595d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final double f9596e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final double f9597f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final double f9598g;

    public B(double d8, double d9, double d10, double d11, double d12, double d13, double d14) {
        this.f9592a = d8;
        this.f9593b = d9;
        this.f9594c = d10;
        this.f9595d = d11;
        this.f9596e = d12;
        this.f9597f = d13;
        this.f9598g = d14;
        if (Double.isNaN(d9) || Double.isNaN(d10) || Double.isNaN(d11) || Double.isNaN(d12) || Double.isNaN(d13) || Double.isNaN(d14) || Double.isNaN(d8)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d12 < 0.0d || d12 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d12);
        }
        if (d12 == 0.0d && (d9 == 0.0d || d8 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d12 >= 1.0d && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d9 == 0.0d || d8 == 0.0d) && d11 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d11 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d9 < 0.0d || d8 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }

    public final double a() {
        return this.f9593b;
    }

    public final double b() {
        return this.f9594c;
    }

    public final double c() {
        return this.f9595d;
    }

    public final double d() {
        return this.f9596e;
    }

    public final double e() {
        return this.f9597f;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof B)) {
            return false;
        }
        B b8 = (B) obj;
        return Double.compare(this.f9592a, b8.f9592a) == 0 && Double.compare(this.f9593b, b8.f9593b) == 0 && Double.compare(this.f9594c, b8.f9594c) == 0 && Double.compare(this.f9595d, b8.f9595d) == 0 && Double.compare(this.f9596e, b8.f9596e) == 0 && Double.compare(this.f9597f, b8.f9597f) == 0 && Double.compare(this.f9598g, b8.f9598g) == 0;
    }

    public final double f() {
        return this.f9598g;
    }

    public final double g() {
        return this.f9592a;
    }

    public int hashCode() {
        return (((((((((((Double.hashCode(this.f9592a) * 31) + Double.hashCode(this.f9593b)) * 31) + Double.hashCode(this.f9594c)) * 31) + Double.hashCode(this.f9595d)) * 31) + Double.hashCode(this.f9596e)) * 31) + Double.hashCode(this.f9597f)) * 31) + Double.hashCode(this.f9598g);
    }

    public String toString() {
        return "TransferParameters(gamma=" + this.f9592a + cFAYKUlMj.jnBAQlNwehCOG + this.f9593b + ", b=" + this.f9594c + ", c=" + this.f9595d + ", d=" + this.f9596e + ", e=" + this.f9597f + ", f=" + this.f9598g + ')';
    }

    public /* synthetic */ B(double d8, double d9, double d10, double d11, double d12, double d13, double d14, int i8, AbstractC2633k abstractC2633k) {
        this(d8, d9, d10, d11, d12, (i8 & 32) != 0 ? 0.0d : d13, (i8 & 64) != 0 ? 0.0d : d14);
    }
}
