package p038e1;

/* JADX INFO: renamed from: e1.j, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2239j implements InterfaceC2235f {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20504b;

    public C2239j(float f8) {
        this.f20504b = f8;
    }

    @Override // p038e1.InterfaceC2235f
    public long a(long j8, long j9) {
        float f8 = this.f20504b;
        return g0.a(f8, f8);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2239j) && Float.compare(this.f20504b, ((C2239j) obj).f20504b) == 0;
    }

    public int hashCode() {
        return Float.hashCode(this.f20504b);
    }

    public String toString() {
        return "FixedScale(value=" + this.f20504b + ')';
    }
}
