package p037e0;

/* JADX INFO: renamed from: e0.p, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2220p extends AbstractC2221q {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f20315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public float f20316b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public float f20317c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public float f20318d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f20319e;

    public C2220p(float f8, float f9, float f10, float f11) {
        super(null);
        this.f20315a = f8;
        this.f20316b = f9;
        this.f20317c = f10;
        this.f20318d = f11;
        this.f20319e = 4;
    }

    @Override // p037e0.AbstractC2221q
    public float a(int i8) {
        if (i8 == 0) {
            return this.f20315a;
        }
        if (i8 == 1) {
            return this.f20316b;
        }
        if (i8 == 2) {
            return this.f20317c;
        }
        if (i8 != 3) {
            return 0.0f;
        }
        return this.f20318d;
    }

    @Override // p037e0.AbstractC2221q
    public int b() {
        return this.f20319e;
    }

    @Override // p037e0.AbstractC2221q
    public void d() {
        this.f20315a = 0.0f;
        this.f20316b = 0.0f;
        this.f20317c = 0.0f;
        this.f20318d = 0.0f;
    }

    @Override // p037e0.AbstractC2221q
    public void e(int i8, float f8) {
        if (i8 == 0) {
            this.f20315a = f8;
            return;
        }
        if (i8 == 1) {
            this.f20316b = f8;
        } else if (i8 == 2) {
            this.f20317c = f8;
        } else {
            if (i8 != 3) {
                return;
            }
            this.f20318d = f8;
        }
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C2220p)) {
            return false;
        }
        C2220p c2220p = (C2220p) obj;
        return c2220p.f20315a == this.f20315a && c2220p.f20316b == this.f20316b && c2220p.f20317c == this.f20317c && c2220p.f20318d == this.f20318d;
    }

    public final float f() {
        return this.f20315a;
    }

    public final float g() {
        return this.f20316b;
    }

    public final float h() {
        return this.f20317c;
    }

    public int hashCode() {
        return (((((Float.hashCode(this.f20315a) * 31) + Float.hashCode(this.f20316b)) * 31) + Float.hashCode(this.f20317c)) * 31) + Float.hashCode(this.f20318d);
    }

    public final float i() {
        return this.f20318d;
    }

    @Override // p037e0.AbstractC2221q
    /* JADX INFO: renamed from: j, reason: merged with bridge method [inline-methods] */
    public C2220p c() {
        return new C2220p(0.0f, 0.0f, 0.0f, 0.0f);
    }

    public String toString() {
        return "AnimationVector4D: v1 = " + this.f20315a + ", v2 = " + this.f20316b + ", v3 = " + this.f20317c + ", v4 = " + this.f20318d;
    }
}
