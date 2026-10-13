package Q3;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f9206a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f9207b;

    public e(int i8, int i9) {
        this.f9206a = i8;
        this.f9207b = i9;
    }

    public final int a() {
        return this.f9207b;
    }

    public final boolean b() {
        return this.f9206a > 1;
    }

    public final int c() {
        return this.f9206a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f9206a == eVar.f9206a && this.f9207b == eVar.f9207b;
    }

    public int hashCode() {
        return (Integer.hashCode(this.f9206a) * 31) + Integer.hashCode(this.f9207b);
    }

    public String toString() {
        return "PageInfo(totalPages=" + this.f9206a + ", currentPage=" + this.f9207b + ")";
    }
}
