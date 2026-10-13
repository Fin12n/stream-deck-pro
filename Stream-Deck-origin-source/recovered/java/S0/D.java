package S0;

import R0.AbstractC1602n0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class D extends AbstractC1628c {
    public D(String str, int i8) {
        super(str, AbstractC1627b.f9606a.c(), i8, null);
    }

    @Override // S0.AbstractC1628c
    public float[] b(float[] fArr) {
        fArr[0] = o(fArr[0]);
        fArr[1] = o(fArr[1]);
        fArr[2] = o(fArr[2]);
        return fArr;
    }

    @Override // S0.AbstractC1628c
    public float e(int i8) {
        return 2.0f;
    }

    @Override // S0.AbstractC1628c
    public float f(int i8) {
        return -2.0f;
    }

    @Override // S0.AbstractC1628c
    public long j(float f8, float f9, float f10) {
        float fO = o(f8);
        return (((long) Float.floatToRawIntBits(o(f9))) & 4294967295L) | (Float.floatToRawIntBits(fO) << 32);
    }

    @Override // S0.AbstractC1628c
    public float[] l(float[] fArr) {
        fArr[0] = o(fArr[0]);
        fArr[1] = o(fArr[1]);
        fArr[2] = o(fArr[2]);
        return fArr;
    }

    @Override // S0.AbstractC1628c
    public float m(float f8, float f9, float f10) {
        return o(f10);
    }

    @Override // S0.AbstractC1628c
    public long n(float f8, float f9, float f10, float f11, AbstractC1628c abstractC1628c) {
        return AbstractC1602n0.a(o(f8), o(f9), o(f10), f11, abstractC1628c);
    }

    public final float o(float f8) {
        return W6.n.j(f8, -2.0f, 2.0f);
    }
}
