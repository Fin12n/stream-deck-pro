package S0;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: S0.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1629d {
    public static final double a(double d8, double d9, double d10, double d11, double d12, double d13) {
        return Math.copySign(q(d8 < 0.0d ? -d8 : d8, d9, d10, d11, d12, d13), d8);
    }

    public static final double b(double d8, double d9, double d10, double d11, double d12, double d13) {
        return Math.copySign(s(d8 < 0.0d ? -d8 : d8, d9, d10, d11, d12, d13), d8);
    }

    public static final AbstractC1628c c(AbstractC1628c abstractC1628c, C c8, AbstractC1626a abstractC1626a) {
        if (AbstractC1627b.e(abstractC1628c.g(), AbstractC1627b.f9606a.b())) {
            kotlin.jvm.internal.t.e(abstractC1628c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
            A a8 = (A) abstractC1628c;
            if (!f(a8.Z(), c8)) {
                return new A(a8, k(e(abstractC1626a.b(), a8.Z().c(), c8.c()), a8.Y()), c8);
            }
        }
        return abstractC1628c;
    }

    public static /* synthetic */ AbstractC1628c d(AbstractC1628c abstractC1628c, C c8, AbstractC1626a abstractC1626a, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            abstractC1626a = AbstractC1626a.f9601b.a();
        }
        return c(abstractC1628c, c8, abstractC1626a);
    }

    public static final float[] e(float[] fArr, float[] fArr2, float[] fArr3) {
        float[] fArrM = m(fArr, fArr2);
        float[] fArrM2 = m(fArr, fArr3);
        return k(j(fArr), l(new float[]{fArrM2[0] / fArrM[0], fArrM2[1] / fArrM[1], fArrM2[2] / fArrM[2]}, fArr));
    }

    public static final boolean f(C c8, C c9) {
        if (c8 == c9) {
            return true;
        }
        return Math.abs(c8.a() - c9.a()) < 0.001f && Math.abs(c8.b() - c9.b()) < 0.001f;
    }

    public static final boolean g(float[] fArr, float[] fArr2) {
        if (fArr == fArr2) {
            return true;
        }
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            if (Float.compare(fArr[i8], fArr2[i8]) != 0 && Math.abs(fArr[i8] - fArr2[i8]) > 0.001f) {
                return false;
            }
        }
        return true;
    }

    public static final h h(AbstractC1628c abstractC1628c, AbstractC1628c abstractC1628c2, int i8) {
        g gVar = g.f9615a;
        if (abstractC1628c == gVar.w()) {
            if (abstractC1628c2 == gVar.w()) {
                return h.f9639g.d();
            }
            if (abstractC1628c2 == gVar.t() && m.e(i8, m.f9669a.b())) {
                return h.f9639g.e();
            }
        } else if (abstractC1628c == gVar.t() && abstractC1628c2 == gVar.w() && m.e(i8, m.f9669a.b())) {
            return h.f9639g.c();
        }
        if (abstractC1628c == abstractC1628c2) {
            return h.f9639g.f(abstractC1628c);
        }
        long jG = abstractC1628c.g();
        AbstractC1627b.a aVar = AbstractC1627b.f9606a;
        AbstractC2633k abstractC2633k = null;
        if (!AbstractC1627b.e(jG, aVar.b()) || !AbstractC1627b.e(abstractC1628c2.g(), aVar.b())) {
            return new h(abstractC1628c, abstractC1628c2, i8, abstractC2633k);
        }
        kotlin.jvm.internal.t.e(abstractC1628c, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        kotlin.jvm.internal.t.e(abstractC1628c2, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        return new h.b((A) abstractC1628c, (A) abstractC1628c2, i8, abstractC2633k);
    }

    public static /* synthetic */ h i(AbstractC1628c abstractC1628c, AbstractC1628c abstractC1628c2, int i8, int i9, Object obj) {
        if ((i9 & 1) != 0) {
            abstractC1628c2 = g.f9615a.w();
        }
        if ((i9 & 2) != 0) {
            i8 = m.f9669a.b();
        }
        return h(abstractC1628c, abstractC1628c2, i8);
    }

    public static final float[] j(float[] fArr) {
        float f8 = fArr[0];
        float f9 = fArr[3];
        float f10 = fArr[6];
        float f11 = fArr[1];
        float f12 = fArr[4];
        float f13 = fArr[7];
        float f14 = fArr[2];
        float f15 = fArr[5];
        float f16 = fArr[8];
        float f17 = (f12 * f16) - (f13 * f15);
        float f18 = (f13 * f14) - (f11 * f16);
        float f19 = (f11 * f15) - (f12 * f14);
        float f20 = (f8 * f17) + (f9 * f18) + (f10 * f19);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f17 / f20;
        fArr2[1] = f18 / f20;
        fArr2[2] = f19 / f20;
        fArr2[3] = ((f10 * f15) - (f9 * f16)) / f20;
        fArr2[4] = ((f16 * f8) - (f10 * f14)) / f20;
        fArr2[5] = ((f14 * f9) - (f15 * f8)) / f20;
        fArr2[6] = ((f9 * f13) - (f10 * f12)) / f20;
        fArr2[7] = ((f10 * f11) - (f13 * f8)) / f20;
        fArr2[8] = ((f8 * f12) - (f9 * f11)) / f20;
        return fArr2;
    }

    public static final float[] k(float[] fArr, float[] fArr2) {
        float f8 = fArr[0];
        float f9 = fArr2[0];
        float f10 = fArr[3];
        float f11 = fArr2[1];
        float f12 = fArr[6];
        float f13 = fArr2[2];
        float f14 = (f8 * f9) + (f10 * f11) + (f12 * f13);
        float f15 = fArr[1];
        float f16 = fArr[4];
        float f17 = fArr[7];
        float f18 = (f15 * f9) + (f16 * f11) + (f17 * f13);
        float f19 = fArr[2];
        float f20 = fArr[5];
        float f21 = fArr[8];
        float f22 = (f9 * f19) + (f11 * f20) + (f13 * f21);
        float f23 = fArr2[3];
        float f24 = fArr2[4];
        float f25 = fArr2[5];
        float f26 = (f8 * f23) + (f10 * f24) + (f12 * f25);
        float f27 = (f15 * f23) + (f16 * f24) + (f17 * f25);
        float f28 = (f23 * f19) + (f24 * f20) + (f25 * f21);
        float f29 = fArr2[6];
        float f30 = fArr2[7];
        float f31 = (f8 * f29) + (f10 * f30);
        float f32 = fArr2[8];
        return new float[]{f14, f18, f22, f26, f27, f28, f31 + (f12 * f32), (f15 * f29) + (f16 * f30) + (f17 * f32), (f19 * f29) + (f20 * f30) + (f21 * f32)};
    }

    public static final float[] l(float[] fArr, float[] fArr2) {
        float f8 = fArr[0];
        float f9 = fArr2[0] * f8;
        float f10 = fArr[1];
        float f11 = fArr2[1] * f10;
        float f12 = fArr[2];
        return new float[]{f9, f11, fArr2[2] * f12, fArr2[3] * f8, fArr2[4] * f10, fArr2[5] * f12, f8 * fArr2[6], f10 * fArr2[7], f12 * fArr2[8]};
    }

    public static final float[] m(float[] fArr, float[] fArr2) {
        float f8 = fArr2[0];
        float f9 = fArr2[1];
        float f10 = fArr2[2];
        fArr2[0] = (fArr[0] * f8) + (fArr[3] * f9) + (fArr[6] * f10);
        fArr2[1] = (fArr[1] * f8) + (fArr[4] * f9) + (fArr[7] * f10);
        fArr2[2] = (fArr[2] * f8) + (fArr[5] * f9) + (fArr[8] * f10);
        return fArr2;
    }

    public static final float n(float[] fArr, float f8, float f9, float f10) {
        return (fArr[0] * f8) + (fArr[3] * f9) + (fArr[6] * f10);
    }

    public static final float o(float[] fArr, float f8, float f9, float f10) {
        return (fArr[1] * f8) + (fArr[4] * f9) + (fArr[7] * f10);
    }

    public static final float p(float[] fArr, float f8, float f9, float f10) {
        return (fArr[2] * f8) + (fArr[5] * f9) + (fArr[8] * f10);
    }

    public static final double q(double d8, double d9, double d10, double d11, double d12, double d13) {
        return d8 >= d12 * d11 ? (Math.pow(d8, 1.0d / d13) - d10) / d9 : d8 / d11;
    }

    public static final double r(double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        return d8 >= d12 * d11 ? (Math.pow(d8 - d13, 1.0d / d15) - d10) / d9 : (d8 - d14) / d11;
    }

    public static final double s(double d8, double d9, double d10, double d11, double d12, double d13) {
        return d8 >= d12 ? Math.pow((d9 * d8) + d10, d13) : d11 * d8;
    }

    public static final double t(double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15) {
        return d8 >= d12 ? Math.pow((d9 * d8) + d10, d15) + d13 : (d11 * d8) + d14;
    }
}
