package p028d0;

import A1.d;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f19726a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f19727b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f19728c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f19729a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f19730b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final long f19731c;

        public a(float f8, float f9, long j8) {
            this.f19729a = f8;
            this.f19730b = f9;
            this.f19731c = j8;
        }

        public final float a(long j8) {
            long j9 = this.f19731c;
            return this.f19730b * Math.signum(this.f19729a) * C2199a.f19611a.b(j9 > 0 ? j8 / j9 : 1.0f).a();
        }

        public final float b(long j8) {
            long j9 = this.f19731c;
            return (((C2199a.f19611a.b(j9 > 0 ? j8 / j9 : 1.0f).b() * Math.signum(this.f19729a)) * this.f19730b) / this.f19731c) * 1000.0f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.f19729a, aVar.f19729a) == 0 && Float.compare(this.f19730b, aVar.f19730b) == 0 && this.f19731c == aVar.f19731c;
        }

        public int hashCode() {
            return (((Float.hashCode(this.f19729a) * 31) + Float.hashCode(this.f19730b)) * 31) + Long.hashCode(this.f19731c);
        }

        public String toString() {
            return "FlingInfo(initialVelocity=" + this.f19729a + ", distance=" + this.f19730b + ", duration=" + this.f19731c + ')';
        }
    }

    public r(float f8, d dVar) {
        this.f19726a = f8;
        this.f19727b = dVar;
        this.f19728c = a(dVar);
    }

    public final float a(d dVar) {
        return s.c(0.84f, dVar.getDensity());
    }

    public final float b(float f8) {
        return (float) (((double) (this.f19726a * this.f19728c)) * Math.exp((((double) s.f19732a) / (((double) s.f19732a) - 1.0d)) * e(f8)));
    }

    public final long c(float f8) {
        return (long) (Math.exp(e(f8) / (((double) s.f19732a) - 1.0d)) * 1000.0d);
    }

    public final a d(float f8) {
        double dE = e(f8);
        double d8 = ((double) s.f19732a) - 1.0d;
        return new a(f8, (float) (((double) (this.f19726a * this.f19728c)) * Math.exp((((double) s.f19732a) / d8) * dE)), (long) (Math.exp(dE / d8) * 1000.0d));
    }

    public final double e(float f8) {
        return C2199a.f19611a.a(f8, this.f19726a * this.f19728c);
    }
}
