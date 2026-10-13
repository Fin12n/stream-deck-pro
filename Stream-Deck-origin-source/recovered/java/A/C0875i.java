package A;

/* JADX INFO: renamed from: A.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0875i extends G0.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f285a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G0 f286b;

    public C0875i(int i8, G0 g8) {
        this.f285a = i8;
        if (g8 == null) {
            throw new NullPointerException("Null surfaceOutput");
        }
        this.f286b = g8;
    }

    @Override // A.G0.b
    public int a() {
        return this.f285a;
    }

    @Override // A.G0.b
    public G0 b() {
        return this.f286b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof G0.b) {
            G0.b bVar = (G0.b) obj;
            if (this.f285a == bVar.a() && this.f286b.equals(bVar.b())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f285a ^ 1000003) * 1000003) ^ this.f286b.hashCode();
    }

    public String toString() {
        return "Event{eventCode=" + this.f285a + ", surfaceOutput=" + this.f286b + "}";
    }
}
