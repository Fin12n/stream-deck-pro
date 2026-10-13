package Z5;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f12938a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public int f12939b;

    public f(int i8, int i9) {
        this.f12938a = i8;
        this.f12939b = i9;
    }

    public final int a() {
        return this.f12939b;
    }

    public final int b() {
        return this.f12938a;
    }

    public final void c(int i8) {
        this.f12939b = i8;
    }

    public final void d(int i8) {
        this.f12938a = i8;
    }

    public String toString() {
        return "MutableRange(start=" + this.f12938a + ", end=" + this.f12939b + ')';
    }
}
