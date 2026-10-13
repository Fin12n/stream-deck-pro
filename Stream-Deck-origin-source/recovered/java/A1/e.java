package A1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e implements d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f427a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f428b;

    public e(float f8, float f9) {
        this.f427a = f8;
        this.f428b = f9;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return Float.compare(this.f427a, eVar.f427a) == 0 && Float.compare(this.f428b, eVar.f428b) == 0;
    }

    @Override // A1.d
    public float getDensity() {
        return this.f427a;
    }

    public int hashCode() {
        return (Float.hashCode(this.f427a) * 31) + Float.hashCode(this.f428b);
    }

    public String toString() {
        return "DensityImpl(density=" + this.f427a + ", fontScale=" + this.f428b + ')';
    }

    @Override // A1.l
    public float x0() {
        return this.f428b;
    }
}
