package p028d0;

import A1.d;
import p037e0.G;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D implements G {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final r f19603a;

    public D(d dVar) {
        this.f19603a = new r(E.a(), dVar);
    }

    @Override // p037e0.G
    public float a() {
        return 0.0f;
    }

    @Override // p037e0.G
    public float b(long j8, float f8, float f9) {
        return this.f19603a.d(f9).b(j8 / 1000000);
    }

    @Override // p037e0.G
    public long c(float f8, float f9) {
        return this.f19603a.c(f9) * 1000000;
    }

    @Override // p037e0.G
    public float d(float f8, float f9) {
        return f8 + f(f9);
    }

    @Override // p037e0.G
    public float e(long j8, float f8, float f9) {
        return f8 + this.f19603a.d(f9).a(j8 / 1000000);
    }

    public final float f(float f8) {
        return this.f19603a.b(f8) * Math.signum(f8);
    }
}
