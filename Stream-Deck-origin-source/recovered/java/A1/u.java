package A1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class u implements B1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f461a;

    public u(float f8) {
        this.f461a = f8;
    }

    @Override // B1.a
    public float a(float f8) {
        return f8 / this.f461a;
    }

    @Override // B1.a
    public float b(float f8) {
        return f8 * this.f461a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof u) && Float.compare(this.f461a, ((u) obj).f461a) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f461a);
    }

    public String toString() {
        return "LinearFontScaleConverter(fontScale=" + this.f461a + ')';
    }
}
