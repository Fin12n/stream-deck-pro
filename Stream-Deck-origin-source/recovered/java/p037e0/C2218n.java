package p037e0;

/* JADX INFO: renamed from: e0.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2218n extends AbstractC2221q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f20306a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f20307b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f20308c;

    public C2218n(float f8, float f9) {
        super(null);
        this.f20306a = f8;
        this.f20307b = f9;
        this.f20308c = 2;
    }

    @Override // p037e0.AbstractC2221q
    public float a(int i8) {
        if (i8 == 0) {
            return this.f20306a;
        }
        if (i8 != 1) {
            return 0.0f;
        }
        return this.f20307b;
    }

    @Override // p037e0.AbstractC2221q
    public int b() {
        return this.f20308c;
    }

    @Override // p037e0.AbstractC2221q
    public void d() {
        this.f20306a = 0.0f;
        this.f20307b = 0.0f;
    }

    @Override // p037e0.AbstractC2221q
    public void e(int i8, float f8) {
        if (i8 == 0) {
            this.f20306a = f8;
        } else {
            if (i8 != 1) {
                return;
            }
            this.f20307b = f8;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2218n)) {
            return false;
        }
        C2218n c2218n = (C2218n) obj;
        return c2218n.f20306a == this.f20306a && c2218n.f20307b == this.f20307b;
    }

    public final float f() {
        return this.f20306a;
    }

    public final float g() {
        return this.f20307b;
    }

    @Override // p037e0.AbstractC2221q
    /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
    public C2218n c() {
        return new C2218n(0.0f, 0.0f);
    }

    public int hashCode() {
        return (Float.hashCode(this.f20306a) * 31) + Float.hashCode(this.f20307b);
    }

    public String toString() {
        return "AnimationVector2D: v1 = " + this.f20306a + ", v2 = " + this.f20307b;
    }
}
