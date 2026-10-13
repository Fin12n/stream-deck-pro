package G;

/* JADX INFO: renamed from: G.a, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0942a extends C0948g.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q.B f2524a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2525b;

    public C0942a(Q.B b8, int i8) {
        if (b8 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f2524a = b8;
        this.f2525b = i8;
    }

    @Override // G.C0948g.b
    public int a() {
        return this.f2525b;
    }

    @Override // G.C0948g.b
    public Q.B b() {
        return this.f2524a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0948g.b) {
            C0948g.b bVar = (C0948g.b) obj;
            if (this.f2524a.equals(bVar.b()) && this.f2525b == bVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2524a.hashCode() ^ 1000003) * 1000003) ^ this.f2525b;
    }

    public String toString() {
        return "In{packet=" + this.f2524a + ", jpegQuality=" + this.f2525b + "}";
    }
}
