package R;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a extends d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final S.f f9232a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final S.f f9233b;

    public a(S.f fVar, S.f fVar2) {
        if (fVar == null) {
            throw new NullPointerException("Null primaryOutConfig");
        }
        this.f9232a = fVar;
        if (fVar2 == null) {
            throw new NullPointerException("Null secondaryOutConfig");
        }
        this.f9233b = fVar2;
    }

    @Override // R.d
    public S.f a() {
        return this.f9232a;
    }

    @Override // R.d
    public S.f b() {
        return this.f9233b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof d) {
            d dVar = (d) obj;
            if (this.f9232a.equals(dVar.a()) && this.f9233b.equals(dVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9232a.hashCode() ^ 1000003) * 1000003) ^ this.f9233b.hashCode();
    }

    public String toString() {
        return "DualOutConfig{primaryOutConfig=" + this.f9232a + ", secondaryOutConfig=" + this.f9233b + "}";
    }
}
