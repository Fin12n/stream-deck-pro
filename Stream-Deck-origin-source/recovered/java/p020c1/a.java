package p020c1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public long f16030a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f16031b;

    public a(long j8, float f8) {
        this.f16030a = j8;
        this.f16031b = f8;
    }

    public final float a() {
        return this.f16031b;
    }

    public final long b() {
        return this.f16030a;
    }

    public final void c(float f8) {
        this.f16031b = f8;
    }

    public final void d(long j8) {
        this.f16030a = j8;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f16030a == aVar.f16030a && Float.compare(this.f16031b, aVar.f16031b) == 0;
    }

    public int hashCode() {
        return (Long.hashCode(this.f16030a) * 31) + Float.hashCode(this.f16031b);
    }

    public String toString() {
        return "DataPointAtTime(time=" + this.f16030a + ", dataPoint=" + this.f16031b + ')';
    }
}
