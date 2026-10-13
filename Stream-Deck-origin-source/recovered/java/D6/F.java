package D6;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f1925a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1926b;

    public F(int i8, Object obj) {
        this.f1925a = i8;
        this.f1926b = obj;
    }

    public final int a() {
        return this.f1925a;
    }

    public final Object b() {
        return this.f1926b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof F)) {
            return false;
        }
        F f8 = (F) obj;
        return this.f1925a == f8.f1925a && kotlin.jvm.internal.t.c(this.f1926b, f8.f1926b);
    }

    public int hashCode() {
        int iHashCode = Integer.hashCode(this.f1925a) * 31;
        Object obj = this.f1926b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "IndexedValue(index=" + this.f1925a + ", value=" + this.f1926b + ')';
    }
}
