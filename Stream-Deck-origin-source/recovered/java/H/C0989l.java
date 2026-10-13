package H;

/* JADX INFO: renamed from: H.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0989l extends f1.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Throwable f3114a;

    public C0989l(Throwable th) {
        if (th == null) {
            throw new NullPointerException("Null error");
        }
        this.f3114a = th;
    }

    @Override // H.f1.a
    public Throwable a() {
        return this.f3114a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f1.a) {
            return this.f3114a.equals(((f1.a) obj).a());
        }
        return false;
    }

    public int hashCode() {
        return this.f3114a.hashCode() ^ 1000003;
    }

    public String toString() {
        return "ErrorWrapper{error=" + this.f3114a + "}";
    }
}
