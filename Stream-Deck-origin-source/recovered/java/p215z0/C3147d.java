package p215z0;

/* JADX INFO: renamed from: z0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3147d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f38738a;

    public C3147d(int i8) {
        this.f38738a = i8;
    }

    public final int a() {
        return this.f38738a;
    }

    public final boolean b() {
        return this.f38738a != Integer.MIN_VALUE;
    }

    public final void c(int i8) {
        this.f38738a = i8;
    }

    public final int d(T0 t8) {
        return t8.m(this);
    }

    public final int e(W0 w8) {
        return w8.G(this);
    }

    public String toString() {
        return super.toString() + "{ location = " + this.f38738a + " }";
    }
}
