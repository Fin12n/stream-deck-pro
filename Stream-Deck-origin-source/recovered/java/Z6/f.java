package Z6;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f12957a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W6.i f12958b;

    public f(String value, W6.i range) {
        kotlin.jvm.internal.t.g(value, "value");
        kotlin.jvm.internal.t.g(range, "range");
        this.f12957a = value;
        this.f12958b = range;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return kotlin.jvm.internal.t.c(this.f12957a, fVar.f12957a) && kotlin.jvm.internal.t.c(this.f12958b, fVar.f12958b);
    }

    public int hashCode() {
        return (this.f12957a.hashCode() * 31) + this.f12958b.hashCode();
    }

    public String toString() {
        return "MatchGroup(value=" + this.f12957a + ", range=" + this.f12958b + ')';
    }
}
