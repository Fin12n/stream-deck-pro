package p037e0;

/* JADX INFO: renamed from: e0.o, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2219o extends AbstractC2221q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f20311a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f20312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f20313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f20314d;

    public C2219o(float f8, float f9, float f10) {
        super(null);
        this.f20311a = f8;
        this.f20312b = f9;
        this.f20313c = f10;
        this.f20314d = 3;
    }

    @Override // p037e0.AbstractC2221q
    public float a(int i8) {
        if (i8 == 0) {
            return this.f20311a;
        }
        if (i8 == 1) {
            return this.f20312b;
        }
        if (i8 != 2) {
            return 0.0f;
        }
        return this.f20313c;
    }

    @Override // p037e0.AbstractC2221q
    public int b() {
        return this.f20314d;
    }

    @Override // p037e0.AbstractC2221q
    public void d() {
        this.f20311a = 0.0f;
        this.f20312b = 0.0f;
        this.f20313c = 0.0f;
    }

    @Override // p037e0.AbstractC2221q
    public void e(int i8, float f8) {
        if (i8 == 0) {
            this.f20311a = f8;
        } else if (i8 == 1) {
            this.f20312b = f8;
        } else {
            if (i8 != 2) {
                return;
            }
            this.f20313c = f8;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2219o)) {
            return false;
        }
        C2219o c2219o = (C2219o) obj;
        return c2219o.f20311a == this.f20311a && c2219o.f20312b == this.f20312b && c2219o.f20313c == this.f20313c;
    }

    @Override // p037e0.AbstractC2221q
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public C2219o c() {
        return new C2219o(0.0f, 0.0f, 0.0f);
    }

    public int hashCode() {
        return (((Float.hashCode(this.f20311a) * 31) + Float.hashCode(this.f20312b)) * 31) + Float.hashCode(this.f20313c);
    }

    public String toString() {
        return "AnimationVector3D: v1 = " + this.f20311a + ", v2 = " + this.f20312b + ", v3 = " + this.f20313c;
    }
}
