package p028d0;

/* JADX INFO: renamed from: d0.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2199a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2199a f19611a = new C2199a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f19612b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final float[] f19613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f19614d;

    /* JADX INFO: renamed from: d0.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0454a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final float f19615a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final float f19616b;

        public C0454a(float f8, float f9) {
            this.f19615a = f8;
            this.f19616b = f9;
        }

        public final float a() {
            return this.f19615a;
        }

        public final float b() {
            return this.f19616b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0454a)) {
                return false;
            }
            C0454a c0454a = (C0454a) obj;
            return Float.compare(this.f19615a, c0454a.f19615a) == 0 && Float.compare(this.f19616b, c0454a.f19616b) == 0;
        }

        public int hashCode() {
            return (Float.hashCode(this.f19615a) * 31) + Float.hashCode(this.f19616b);
        }

        public String toString() {
            return "FlingResult(distanceCoefficient=" + this.f19615a + ", velocityCoefficient=" + this.f19616b + ')';
        }
    }

    static {
        float[] fArr = new float[101];
        f19612b = fArr;
        float[] fArr2 = new float[101];
        f19613c = fArr2;
        C.b(fArr, fArr2, 100);
        f19614d = 8;
    }

    public final double a(float f8, float f9) {
        return Math.log(((double) (Math.abs(f8) * 0.35f)) / ((double) f9));
    }

    public final C0454a b(float f8) {
        float f9;
        float f10;
        float f11 = 100;
        int i8 = (int) (f11 * f8);
        if (i8 < 100) {
            float f12 = i8 / f11;
            int i9 = i8 + 1;
            float f13 = i9 / f11;
            float[] fArr = f19612b;
            float f14 = fArr[i8];
            f10 = (fArr[i9] - f14) / (f13 - f12);
            f9 = f14 + ((f8 - f12) * f10);
        } else {
            f9 = 1.0f;
            f10 = 0.0f;
        }
        return new C0454a(f9, f10);
    }
}
