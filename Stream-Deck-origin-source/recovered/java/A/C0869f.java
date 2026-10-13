package A;

/* JADX INFO: renamed from: A.f, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0869f extends AbstractC0902w.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f269a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Throwable f270b;

    public C0869f(int i8, Throwable th) {
        this.f269a = i8;
        this.f270b = th;
    }

    @Override // A.AbstractC0902w.a
    public Throwable c() {
        return this.f270b;
    }

    @Override // A.AbstractC0902w.a
    public int d() {
        return this.f269a;
    }

    public boolean equals(Object obj) {
        Throwable th;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC0902w.a) {
            AbstractC0902w.a aVar = (AbstractC0902w.a) obj;
            if (this.f269a == aVar.d() && ((th = this.f270b) != null ? th.equals(aVar.c()) : aVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i8 = (this.f269a ^ 1000003) * 1000003;
        Throwable th = this.f270b;
        return i8 ^ (th == null ? 0 : th.hashCode());
    }

    public String toString() {
        return "StateError{code=" + this.f269a + ", cause=" + this.f270b + "}";
    }
}
