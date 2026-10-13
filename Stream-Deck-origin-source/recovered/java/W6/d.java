package W6;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class d implements e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f11503a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f11504b;

    public d(float f8, float f9) {
        this.f11503a = f8;
        this.f11504b = f9;
    }

    @Override // W6.f
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float o() {
        return Float.valueOf(this.f11504b);
    }

    @Override // W6.f
    /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
    public Float c() {
        return Float.valueOf(this.f11503a);
    }

    public boolean d(float f8, float f9) {
        return f8 <= f9;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        if (isEmpty() && ((d) obj).isEmpty()) {
            return true;
        }
        d dVar = (d) obj;
        return this.f11503a == dVar.f11503a && this.f11504b == dVar.f11504b;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (Float.hashCode(this.f11503a) * 31) + Float.hashCode(this.f11504b);
    }

    @Override // W6.e, W6.f
    public boolean isEmpty() {
        return this.f11503a > this.f11504b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // W6.e
    public /* bridge */ /* synthetic */ boolean m(Comparable comparable, Comparable comparable2) {
        return d(((Number) comparable).floatValue(), ((Number) comparable2).floatValue());
    }

    public String toString() {
        return this.f11503a + ".." + this.f11504b;
    }
}
