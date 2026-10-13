package p037e0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class H implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float f20003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final float f20004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final float f20005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Y f20006d;

    public H() {
        this(0.0f, 0.0f, 0.0f, 7, null);
    }

    @Override // p037e0.F
    public float b(long j8, float f8, float f9, float f10) {
        this.f20006d.e(f9);
        return Q.c(this.f20006d.g(f8, f10, j8 / 1000000));
    }

    @Override // p037e0.F
    public long c(float f8, float f9, float f10) {
        float fB = this.f20006d.b();
        float fA = this.f20006d.a();
        float f11 = f8 - f9;
        float f12 = this.f20005c;
        return X.b(fB, fA, f10 / f12, f11 / f12, 1.0f) * 1000000;
    }

    @Override // p037e0.F
    public float d(float f8, float f9, float f10) {
        return 0.0f;
    }

    @Override // p037e0.F
    public float e(long j8, float f8, float f9, float f10) {
        this.f20006d.e(f9);
        return Q.b(this.f20006d.g(f8, f10, j8 / 1000000));
    }

    public H(float f8, float f9, float f10) {
        this.f20003a = f8;
        this.f20004b = f9;
        this.f20005c = f10;
        Y y8 = new Y(1.0f);
        y8.d(f8);
        y8.f(f9);
        this.f20006d = y8;
    }

    public /* synthetic */ H(float f8, float f9, float f10, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? 1.0f : f8, (i8 & 2) != 0 ? 1500.0f : f9, (i8 & 4) != 0 ? 0.01f : f10);
    }
}
