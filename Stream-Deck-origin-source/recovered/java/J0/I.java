package J0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class I {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public int f3930a = p.H().f();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public I f3931b;

    public abstract void c(I i8);

    public abstract I d();

    public final I e() {
        return this.f3931b;
    }

    public final int f() {
        return this.f3930a;
    }

    public final void g(I i8) {
        this.f3931b = i8;
    }

    public final void h(int i8) {
        this.f3930a = i8;
    }
}
