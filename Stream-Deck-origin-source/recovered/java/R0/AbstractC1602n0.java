package R0;

import S0.AbstractC1627b;
import S0.AbstractC1628c;

/* JADX INFO: renamed from: R0.n0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1602n0 {
    public static final long a(float f8, float f9, float f10, float f11, AbstractC1628c abstractC1628c) {
        float f12 = abstractC1628c.f(0);
        if (f8 <= abstractC1628c.e(0) && f12 <= f8) {
            float f13 = abstractC1628c.f(1);
            if (f9 <= abstractC1628c.e(1) && f13 <= f9) {
                float f14 = abstractC1628c.f(2);
                if (f10 <= abstractC1628c.e(2) && f14 <= f10 && 0.0f <= f11 && f11 <= 1.0f) {
                    if (abstractC1628c.i()) {
                        return C1598l0.l(C6.A.b(C6.A.b(C6.A.b((((((int) ((f8 * 255.0f) + 0.5f)) << 16) | (((int) ((f11 * 255.0f) + 0.5f)) << 24)) | (((int) ((f9 * 255.0f) + 0.5f)) << 8)) | ((int) ((f10 * 255.0f) + 0.5f))) & 4294967295L) << 32));
                    }
                    if (abstractC1628c.c() != 3) {
                        throw new IllegalArgumentException("Color only works with ColorSpaces with 3 components");
                    }
                    int iD = abstractC1628c.d();
                    if (iD == -1) {
                        throw new IllegalArgumentException("Unknown color space, please use a color space in ColorSpaces");
                    }
                    short sA = AbstractC1617v0.a(f8);
                    return C1598l0.l(C6.A.b(C6.A.b(C6.A.b(C6.A.b(C6.A.b(C6.A.b(C6.A.b(AbstractC1617v0.a(f9)) & 65535) << 32) | C6.A.b(C6.A.b(C6.A.b(sA) & 65535) << 48)) | C6.A.b(C6.A.b(C6.A.b(AbstractC1617v0.a(f10)) & 65535) << 16)) | C6.A.b(C6.A.b(C6.A.b((int) ((Math.max(0.0f, Math.min(f11, 1.0f)) * 1023.0f) + 0.5f)) & 1023) << 6)) | C6.A.b(C6.A.b(iD) & 63)));
                }
            }
        }
        throw new IllegalArgumentException(("red = " + f8 + ", green = " + f9 + ", blue = " + f10 + ", alpha = " + f11 + " outside the range for " + abstractC1628c).toString());
    }

    public static final long b(int i8) {
        return C1598l0.l(C6.A.b(C6.A.b(i8) << 32));
    }

    public static final long c(int i8, int i9, int i10, int i11) {
        return b(((i8 & 255) << 16) | ((i11 & 255) << 24) | ((i9 & 255) << 8) | (i10 & 255));
    }

    public static final long d(long j8) {
        return C1598l0.l(C6.A.b(C6.A.b(C6.A.b(j8) & 4294967295L) << 32));
    }

    public static /* synthetic */ long e(int i8, int i9, int i10, int i11, int i12, Object obj) {
        if ((i12 & 8) != 0) {
            i11 = 255;
        }
        return c(i8, i9, i10, i11);
    }

    public static final long f(long j8, long j9) {
        long jM = C1598l0.m(j8, C1598l0.t(j9));
        float fR = C1598l0.r(j9);
        float fR2 = C1598l0.r(jM);
        float f8 = 1.0f - fR2;
        float f9 = (fR * f8) + fR2;
        return a(f9 == 0.0f ? 0.0f : ((C1598l0.v(jM) * fR2) + ((C1598l0.v(j9) * fR) * f8)) / f9, f9 == 0.0f ? 0.0f : ((C1598l0.u(jM) * fR2) + ((C1598l0.u(j9) * fR) * f8)) / f9, f9 != 0.0f ? ((C1598l0.s(jM) * fR2) + ((C1598l0.s(j9) * fR) * f8)) / f9 : 0.0f, f9, C1598l0.t(j9));
    }

    public static final long g(long j8, long j9, float f8) {
        AbstractC1628c abstractC1628cT = S0.g.f9615a.t();
        long jM = C1598l0.m(j8, abstractC1628cT);
        long jM2 = C1598l0.m(j9, abstractC1628cT);
        float fR = C1598l0.r(jM);
        float fV = C1598l0.v(jM);
        float fU = C1598l0.u(jM);
        float fS = C1598l0.s(jM);
        float fR2 = C1598l0.r(jM2);
        float fV2 = C1598l0.v(jM2);
        float fU2 = C1598l0.u(jM2);
        float fS2 = C1598l0.s(jM2);
        return C1598l0.m(a(C1.b.a(fV, fV2, f8), C1.b.a(fU, fU2, f8), C1.b.a(fS, fS2, f8), C1.b.a(fR, fR2, f8), abstractC1628cT), C1598l0.t(j9));
    }

    public static final float h(long j8) {
        AbstractC1628c abstractC1628cT = C1598l0.t(j8);
        if (!AbstractC1627b.e(abstractC1628cT.g(), AbstractC1627b.f9606a.b())) {
            throw new IllegalArgumentException(("The specified color must be encoded in an RGB color space. The supplied color space is " + ((Object) AbstractC1627b.h(abstractC1628cT.g()))).toString());
        }
        kotlin.jvm.internal.t.e(abstractC1628cT, "null cannot be cast to non-null type androidx.compose.ui.graphics.colorspace.Rgb");
        S0.i iVarQ = ((S0.A) abstractC1628cT).Q();
        return i((float) ((iVarQ.a(C1598l0.v(j8)) * 0.2126d) + (iVarQ.a(C1598l0.u(j8)) * 0.7152d) + (iVarQ.a(C1598l0.s(j8)) * 0.0722d)));
    }

    public static final float i(float f8) {
        if (f8 <= 0.0f) {
            return 0.0f;
        }
        if (f8 >= 1.0f) {
            return 1.0f;
        }
        return f8;
    }

    public static final int j(long j8) {
        return (int) C6.A.b(C1598l0.m(j8, S0.g.f9615a.w()) >>> 32);
    }
}
