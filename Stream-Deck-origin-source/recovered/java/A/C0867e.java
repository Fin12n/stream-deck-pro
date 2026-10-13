package A;

/* JADX INFO: renamed from: A.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0867e extends AbstractC0902w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AbstractC0902w.b f266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AbstractC0902w.a f267b;

    public C0867e(AbstractC0902w.b bVar, AbstractC0902w.a aVar) {
        if (bVar == null) {
            throw new NullPointerException("Null type");
        }
        this.f266a = bVar;
        this.f267b = aVar;
    }

    @Override // A.AbstractC0902w
    public AbstractC0902w.a c() {
        return this.f267b;
    }

    @Override // A.AbstractC0902w
    public AbstractC0902w.b d() {
        return this.f266a;
    }

    public boolean equals(Object obj) {
        AbstractC0902w.a aVar;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0902w) {
            AbstractC0902w abstractC0902w = (AbstractC0902w) obj;
            if (this.f266a.equals(abstractC0902w.d()) && ((aVar = this.f267b) != null ? aVar.equals(abstractC0902w.c()) : abstractC0902w.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = (this.f266a.hashCode() ^ 1000003) * 1000003;
        AbstractC0902w.a aVar = this.f267b;
        return iHashCode ^ (aVar == null ? 0 : aVar.hashCode());
    }

    public String toString() {
        return "CameraState{type=" + this.f266a + ", error=" + this.f267b + "}";
    }
}
