package S0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f9599a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f9600b;

    public C(float f8, float f9) {
        this.f9599a = f8;
        this.f9600b = f9;
    }

    public final float a() {
        return this.f9599a;
    }

    public final float b() {
        return this.f9600b;
    }

    public final float[] c() {
        float f8 = this.f9599a;
        float f9 = this.f9600b;
        return new float[]{f8 / f9, 1.0f, ((1.0f - f8) - f9) / f9};
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c8 = (C) obj;
        return Float.compare(this.f9599a, c8.f9599a) == 0 && Float.compare(this.f9600b, c8.f9600b) == 0;
    }

    public int hashCode() {
        return (Float.hashCode(this.f9599a) * 31) + Float.hashCode(this.f9600b);
    }

    public String toString() {
        return "WhitePoint(x=" + this.f9599a + ", y=" + this.f9600b + ')';
    }

    public C(float f8, float f9, float f10) {
        this(f8, f9, f10, f8 + f9 + f10);
    }

    public C(float f8, float f9, float f10, float f11) {
        this(f8 / f11, f9 / f11);
    }
}
