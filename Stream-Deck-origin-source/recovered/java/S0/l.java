package S0;

import R0.AbstractC1602n0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l extends AbstractC1628c {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final a f9664e = new a(null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final float[] f9665f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final float[] f9666g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final float[] f9667h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final float[] f9668i;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    static {
        float[] fArrB = AbstractC1626a.f9601b.a().b();
        j jVar = j.f9652a;
        float[] fArrK = AbstractC1629d.k(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC1629d.e(fArrB, jVar.b().c(), jVar.e().c()));
        f9665f = fArrK;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f9666g = fArr;
        f9667h = AbstractC1629d.j(fArrK);
        f9668i = AbstractC1629d.j(fArr);
    }

    public l(String str, int i8) {
        super(str, AbstractC1627b.f9606a.a(), i8, null);
    }

    @Override // S0.AbstractC1628c
    public float[] b(float[] fArr) {
        AbstractC1629d.m(f9665f, fArr);
        double d8 = 0.33333334f;
        fArr[0] = Math.signum(fArr[0]) * ((float) Math.pow(Math.abs(fArr[0]), d8));
        fArr[1] = Math.signum(fArr[1]) * ((float) Math.pow(Math.abs(fArr[1]), d8));
        fArr[2] = Math.signum(fArr[2]) * ((float) Math.pow(Math.abs(fArr[2]), d8));
        AbstractC1629d.m(f9666g, fArr);
        return fArr;
    }

    @Override // S0.AbstractC1628c
    public float e(int i8) {
        return i8 == 0 ? 1.0f : 0.5f;
    }

    @Override // S0.AbstractC1628c
    public float f(int i8) {
        return i8 == 0 ? 0.0f : -0.5f;
    }

    @Override // S0.AbstractC1628c
    public long j(float f8, float f9, float f10) {
        float fJ = W6.n.j(f8, 0.0f, 1.0f);
        float fJ2 = W6.n.j(f9, -0.5f, 0.5f);
        float fJ3 = W6.n.j(f10, -0.5f, 0.5f);
        float[] fArr = f9668i;
        float fN = AbstractC1629d.n(fArr, fJ, fJ2, fJ3);
        float fO = AbstractC1629d.o(fArr, fJ, fJ2, fJ3);
        float fP = AbstractC1629d.p(fArr, fJ, fJ2, fJ3);
        float f11 = fN * fN * fN;
        float f12 = fO * fO * fO;
        float f13 = fP * fP * fP;
        float[] fArr2 = f9667h;
        float fN2 = AbstractC1629d.n(fArr2, f11, f12, f13);
        float fO2 = AbstractC1629d.o(fArr2, f11, f12, f13);
        return (((long) Float.floatToRawIntBits(fN2)) << 32) | (((long) Float.floatToRawIntBits(fO2)) & 4294967295L);
    }

    @Override // S0.AbstractC1628c
    public float[] l(float[] fArr) {
        fArr[0] = W6.n.j(fArr[0], 0.0f, 1.0f);
        fArr[1] = W6.n.j(fArr[1], -0.5f, 0.5f);
        fArr[2] = W6.n.j(fArr[2], -0.5f, 0.5f);
        AbstractC1629d.m(f9668i, fArr);
        float f8 = fArr[0];
        fArr[0] = f8 * f8 * f8;
        float f9 = fArr[1];
        fArr[1] = f9 * f9 * f9;
        float f10 = fArr[2];
        fArr[2] = f10 * f10 * f10;
        AbstractC1629d.m(f9667h, fArr);
        return fArr;
    }

    @Override // S0.AbstractC1628c
    public float m(float f8, float f9, float f10) {
        float fJ = W6.n.j(f8, 0.0f, 1.0f);
        float fJ2 = W6.n.j(f9, -0.5f, 0.5f);
        float fJ3 = W6.n.j(f10, -0.5f, 0.5f);
        float[] fArr = f9668i;
        float fN = AbstractC1629d.n(fArr, fJ, fJ2, fJ3);
        float fO = AbstractC1629d.o(fArr, fJ, fJ2, fJ3);
        float fP = AbstractC1629d.p(fArr, fJ, fJ2, fJ3);
        float f11 = fP * fP * fP;
        return AbstractC1629d.p(f9667h, fN * fN * fN, fO * fO * fO, f11);
    }

    @Override // S0.AbstractC1628c
    public long n(float f8, float f9, float f10, float f11, AbstractC1628c abstractC1628c) {
        float[] fArr = f9665f;
        float fN = AbstractC1629d.n(fArr, f8, f9, f10);
        float fO = AbstractC1629d.o(fArr, f8, f9, f10);
        float fP = AbstractC1629d.p(fArr, f8, f9, f10);
        double d8 = 0.33333334f;
        float fSignum = Math.signum(fN) * ((float) Math.pow(Math.abs(fN), d8));
        float fSignum2 = Math.signum(fO) * ((float) Math.pow(Math.abs(fO), d8));
        float fSignum3 = Math.signum(fP) * ((float) Math.pow(Math.abs(fP), d8));
        float[] fArr2 = f9666g;
        return AbstractC1602n0.a(AbstractC1629d.n(fArr2, fSignum, fSignum2, fSignum3), AbstractC1629d.o(fArr2, fSignum, fSignum2, fSignum3), AbstractC1629d.p(fArr2, fSignum, fSignum2, fSignum3), f11, abstractC1628c);
    }
}
