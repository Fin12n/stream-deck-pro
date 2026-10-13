package p037e0;

/* JADX INFO: renamed from: e0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2217m extends AbstractC2221q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f20304a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20305b;

    public C2217m(float f8) {
        super(null);
        this.f20304a = f8;
        this.f20305b = 1;
    }

    @Override // p037e0.AbstractC2221q
    public float a(int i8) {
        if (i8 == 0) {
            return this.f20304a;
        }
        return 0.0f;
    }

    @Override // p037e0.AbstractC2221q
    public int b() {
        return this.f20305b;
    }

    @Override // p037e0.AbstractC2221q
    public void d() {
        this.f20304a = 0.0f;
    }

    @Override // p037e0.AbstractC2221q
    public void e(int i8, float f8) {
        if (i8 == 0) {
            this.f20304a = f8;
        }
    }

    public boolean equals(Object obj) {
        return (obj instanceof C2217m) && ((C2217m) obj).f20304a == this.f20304a;
    }

    public final float f() {
        return this.f20304a;
    }

    @Override // p037e0.AbstractC2221q
    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
    public C2217m c() {
        return new C2217m(0.0f);
    }

    public int hashCode() {
        return Float.hashCode(this.f20304a);
    }

    public String toString() {
        return "AnimationVector1D: value = " + this.f20304a;
    }
}
