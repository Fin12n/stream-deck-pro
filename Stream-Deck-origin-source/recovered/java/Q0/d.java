package Q0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f9078a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f9079b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f9080c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f9081d;

    public d(float f8, float f9, float f10, float f11) {
        this.f9078a = f8;
        this.f9079b = f9;
        this.f9080c = f10;
        this.f9081d = f11;
    }

    public final float a() {
        return this.f9081d;
    }

    public final float b() {
        return this.f9078a;
    }

    public final float c() {
        return this.f9080c;
    }

    public final float d() {
        return this.f9079b;
    }

    public final void e(float f8, float f9, float f10, float f11) {
        this.f9078a = Math.max(f8, this.f9078a);
        this.f9079b = Math.max(f9, this.f9079b);
        this.f9080c = Math.min(f10, this.f9080c);
        this.f9081d = Math.min(f11, this.f9081d);
    }

    public final boolean f() {
        return this.f9078a >= this.f9080c || this.f9079b >= this.f9081d;
    }

    public final void g(float f8, float f9, float f10, float f11) {
        this.f9078a = f8;
        this.f9079b = f9;
        this.f9080c = f10;
        this.f9081d = f11;
    }

    public final void h(float f8) {
        this.f9081d = f8;
    }

    public final void i(float f8) {
        this.f9078a = f8;
    }

    public final void j(float f8) {
        this.f9080c = f8;
    }

    public final void k(float f8) {
        this.f9079b = f8;
    }

    public String toString() {
        return "MutableRect(" + c.a(this.f9078a, 1) + ", " + c.a(this.f9079b, 1) + ", " + c.a(this.f9080c, 1) + ", " + c.a(this.f9081d, 1) + ')';
    }
}
