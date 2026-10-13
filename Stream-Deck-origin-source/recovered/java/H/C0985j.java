package H;

/* JADX INFO: renamed from: H.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0985j extends AbstractC1009v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f3056a;

    public C0985j(Object obj) {
        if (obj == null) {
            throw new NullPointerException("Null value");
        }
        this.f3056a = obj;
    }

    @Override // H.AbstractC1009v0
    public Object b() {
        return this.f3056a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC1009v0) {
            return this.f3056a.equals(((AbstractC1009v0) obj).b());
        }
        return false;
    }

    public int hashCode() {
        return this.f3056a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "Identifier{value=" + this.f3056a + "}";
    }
}
