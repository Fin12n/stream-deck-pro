package G;

/* JADX INFO: renamed from: G.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0944c extends C0963w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Q.B f2543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f2544b;

    public C0944c(Q.B b8, int i8) {
        if (b8 == null) {
            throw new NullPointerException("Null packet");
        }
        this.f2543a = b8;
        this.f2544b = i8;
    }

    @Override // G.C0963w.a
    public int a() {
        return this.f2544b;
    }

    @Override // G.C0963w.a
    public Q.B b() {
        return this.f2543a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0963w.a) {
            C0963w.a aVar = (C0963w.a) obj;
            if (this.f2543a.equals(aVar.b()) && this.f2544b == aVar.a()) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f2543a.hashCode() ^ 1000003) * 1000003) ^ this.f2544b;
    }

    public String toString() {
        return "In{packet=" + this.f2543a + ", jpegQuality=" + this.f2544b + "}";
    }
}
