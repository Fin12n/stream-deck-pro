package S0;

import R0.AbstractC1602n0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class k extends AbstractC1628c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9663e = new a(null);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public k(String str, int i8) {
        super(str, AbstractC1627b.f9606a.a(), i8, null);
    }

    @Override // S0.AbstractC1628c
    public float[] b(float[] fArr) {
        float f8 = fArr[0];
        j jVar = j.f9652a;
        float f9 = f8 / jVar.c()[0];
        float f10 = fArr[1] / jVar.c()[1];
        float f11 = fArr[2] / jVar.c()[2];
        float fPow = f9 > 0.008856452f ? (float) Math.pow(f9, 0.33333334f) : (f9 * 7.787037f) + 0.13793103f;
        float fPow2 = f10 > 0.008856452f ? (float) Math.pow(f10, 0.33333334f) : (f10 * 7.787037f) + 0.13793103f;
        float fPow3 = f11 > 0.008856452f ? (float) Math.pow(f11, 0.33333334f) : (f11 * 7.787037f) + 0.13793103f;
        fArr[0] = W6.n.j((116.0f * fPow2) - 16.0f, 0.0f, 100.0f);
        fArr[1] = W6.n.j((fPow - fPow2) * 500.0f, -128.0f, 128.0f);
        fArr[2] = W6.n.j((fPow2 - fPow3) * 200.0f, -128.0f, 128.0f);
        return fArr;
    }

    @Override // S0.AbstractC1628c
    public float e(int i8) {
        return i8 == 0 ? 100.0f : 128.0f;
    }

    @Override // S0.AbstractC1628c
    public float f(int i8) {
        return i8 == 0 ? 0.0f : -128.0f;
    }

    @Override // S0.AbstractC1628c
    public long j(float f8, float f9, float f10) {
        float fJ = (W6.n.j(f8, 0.0f, 100.0f) + 16.0f) / 116.0f;
        float fJ2 = (W6.n.j(f9, -128.0f, 128.0f) * 0.002f) + fJ;
        float f11 = fJ2 > 0.20689656f ? fJ2 * fJ2 * fJ2 : (fJ2 - 0.13793103f) * 0.12841855f;
        float f12 = fJ > 0.20689656f ? fJ * fJ * fJ : (fJ - 0.13793103f) * 0.12841855f;
        j jVar = j.f9652a;
        float f13 = f11 * jVar.c()[0];
        return (((long) Float.floatToRawIntBits(f12 * jVar.c()[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f13)) << 32);
    }

    @Override // S0.AbstractC1628c
    public float[] l(float[] fArr) {
        fArr[0] = W6.n.j(fArr[0], 0.0f, 100.0f);
        fArr[1] = W6.n.j(fArr[1], -128.0f, 128.0f);
        float fJ = W6.n.j(fArr[2], -128.0f, 128.0f);
        fArr[2] = fJ;
        float f8 = (fArr[0] + 16.0f) / 116.0f;
        float f9 = (fArr[1] * 0.002f) + f8;
        float f10 = f8 - (fJ * 0.005f);
        float f11 = f9 > 0.20689656f ? f9 * f9 * f9 : (f9 - 0.13793103f) * 0.12841855f;
        float f12 = f8 > 0.20689656f ? f8 * f8 * f8 : (f8 - 0.13793103f) * 0.12841855f;
        float f13 = f10 > 0.20689656f ? f10 * f10 * f10 : (f10 - 0.13793103f) * 0.12841855f;
        j jVar = j.f9652a;
        fArr[0] = f11 * jVar.c()[0];
        fArr[1] = f12 * jVar.c()[1];
        fArr[2] = f13 * jVar.c()[2];
        return fArr;
    }

    @Override // S0.AbstractC1628c
    public float m(float f8, float f9, float f10) {
        float fJ = ((W6.n.j(f8, 0.0f, 100.0f) + 16.0f) / 116.0f) - (W6.n.j(f10, -128.0f, 128.0f) * 0.005f);
        return (fJ > 0.20689656f ? fJ * fJ * fJ : 0.12841855f * (fJ - 0.13793103f)) * j.f9652a.c()[2];
    }

    @Override // S0.AbstractC1628c
    public long n(float f8, float f9, float f10, float f11, AbstractC1628c abstractC1628c) {
        j jVar = j.f9652a;
        float f12 = f8 / jVar.c()[0];
        float f13 = f9 / jVar.c()[1];
        float f14 = f10 / jVar.c()[2];
        float fPow = f12 > 0.008856452f ? (float) Math.pow(f12, 0.33333334f) : (f12 * 7.787037f) + 0.13793103f;
        float fPow2 = f13 > 0.008856452f ? (float) Math.pow(f13, 0.33333334f) : (f13 * 7.787037f) + 0.13793103f;
        return AbstractC1602n0.a(W6.n.j((116.0f * fPow2) - 16.0f, 0.0f, 100.0f), W6.n.j((fPow - fPow2) * 500.0f, -128.0f, 128.0f), W6.n.j((fPow2 - (f14 > 0.008856452f ? (float) Math.pow(f14, 0.33333334f) : (f14 * 7.787037f) + 0.13793103f)) * 200.0f, -128.0f, 128.0f), f11, abstractC1628c);
    }
}
