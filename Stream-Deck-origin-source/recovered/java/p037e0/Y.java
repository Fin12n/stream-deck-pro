package p037e0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class Y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public float f20081a;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f20083c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public double f20084d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public double f20085e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public double f20086f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public double f20082b = Math.sqrt(50.0d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public float f20087g = 1.0f;

    public Y(float f8) {
        this.f20081a = f8;
    }

    public final float a() {
        return this.f20087g;
    }

    public final float b() {
        double d8 = this.f20082b;
        return (float) (d8 * d8);
    }

    public final void c() {
        if (this.f20083c) {
            return;
        }
        if (this.f20081a == Z.b()) {
            throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
        }
        float f8 = this.f20087g;
        double d8 = ((double) f8) * ((double) f8);
        if (f8 > 1.0f) {
            double d9 = this.f20082b;
            double d10 = d8 - ((double) 1);
            this.f20084d = (((double) (-f8)) * d9) + (d9 * Math.sqrt(d10));
            double d11 = -this.f20087g;
            double d12 = this.f20082b;
            this.f20085e = (d11 * d12) - (d12 * Math.sqrt(d10));
        } else if (f8 >= 0.0f && f8 < 1.0f) {
            this.f20086f = this.f20082b * Math.sqrt(((double) 1) - d8);
        }
        this.f20083c = true;
    }

    public final void d(float f8) {
        if (f8 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f20087g = f8;
        this.f20083c = false;
    }

    public final void e(float f8) {
        this.f20081a = f8;
    }

    public final void f(float f8) {
        if (b() <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f20082b = Math.sqrt(f8);
        this.f20083c = false;
    }

    public final long g(float f8, float f9, long j8) {
        double dCos;
        double dExp;
        c();
        float f10 = f8 - this.f20081a;
        double d8 = j8 / 1000.0d;
        float f11 = this.f20087g;
        if (f11 > 1.0f) {
            double d9 = f10;
            double d10 = this.f20085e;
            double d11 = f9;
            double d12 = this.f20084d;
            double d13 = d9 - (((d10 * d9) - d11) / (d10 - d12));
            double d14 = ((d9 * d10) - d11) / (d10 - d12);
            dExp = (Math.exp(d10 * d8) * d13) + (Math.exp(this.f20084d * d8) * d14);
            double d15 = this.f20085e;
            double dExp2 = d13 * d15 * Math.exp(d15 * d8);
            double d16 = this.f20084d;
            dCos = dExp2 + (d14 * d16 * Math.exp(d16 * d8));
        } else if (f11 == 1.0f) {
            double d17 = this.f20082b;
            double d18 = f10;
            double d19 = ((double) f9) + (d17 * d18);
            double d20 = d18 + (d19 * d8);
            double dExp3 = Math.exp((-d17) * d8) * d20;
            double dExp4 = d20 * Math.exp((-this.f20082b) * d8);
            double d21 = this.f20082b;
            dCos = (dExp4 * (-d21)) + (d19 * Math.exp((-d21) * d8));
            dExp = dExp3;
        } else {
            double d22 = ((double) 1) / this.f20086f;
            double d23 = this.f20082b;
            double d24 = f10;
            double d25 = d22 * ((((double) f11) * d23 * d24) + ((double) f9));
            double dExp5 = Math.exp(((double) (-f11)) * d23 * d8) * ((Math.cos(this.f20086f * d8) * d24) + (Math.sin(this.f20086f * d8) * d25));
            double d26 = this.f20082b;
            float f12 = this.f20087g;
            double d27 = (-d26) * dExp5 * ((double) f12);
            double dExp6 = Math.exp(((double) (-f12)) * d26 * d8);
            double d28 = this.f20086f;
            double dSin = (-d28) * d24 * Math.sin(d28 * d8);
            double d29 = this.f20086f;
            dCos = d27 + (dExp6 * (dSin + (d25 * d29 * Math.cos(d29 * d8))));
            dExp = dExp5;
        }
        return Z.a((float) (dExp + ((double) this.f20081a)), (float) dCos);
    }
}
