package G;

/* JADX INFO: renamed from: G.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0946e extends P.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q f2553a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final androidx.camera.core.d f2554b;

    public C0946e(Q q8, androidx.camera.core.d dVar) {
        if (q8 == null) {
            throw new NullPointerException("Null processingRequest");
        }
        this.f2553a = q8;
        if (dVar == null) {
            throw new NullPointerException("Null imageProxy");
        }
        this.f2554b = dVar;
    }

    @Override // G.P.b
    public androidx.camera.core.d a() {
        return this.f2554b;
    }

    @Override // G.P.b
    public Q b() {
        return this.f2553a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof P.b) {
            P.b bVar = (P.b) obj;
            if (this.f2553a.equals(bVar.b()) && this.f2554b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2553a.hashCode() ^ 1000003) * 1000003) ^ this.f2554b.hashCode();
    }

    public String toString() {
        return "InputPacket{processingRequest=" + this.f2553a + ", imageProxy=" + this.f2554b + "}";
    }
}
