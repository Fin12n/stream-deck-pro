package p130o3;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f30897a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f30898b;

    public d(float f8, float f9) {
        this.f30897a = f8;
        this.f30898b = f9;
    }

    public boolean a(float f8, float f9) {
        return this.f30897a == f8 && this.f30898b == f9;
    }

    public float b() {
        return this.f30897a;
    }

    public float c() {
        return this.f30898b;
    }

    public void d(float f8, float f9) {
        this.f30897a = f8;
        this.f30898b = f9;
    }

    public String toString() {
        return b() + "x" + c();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
