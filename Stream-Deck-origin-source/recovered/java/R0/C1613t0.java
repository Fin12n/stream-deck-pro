package R0;

import S0.AbstractC1628c;
import android.graphics.ColorSpace;
import java.util.function.DoubleUnaryOperator;

/* JADX INFO: renamed from: R0.t0, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1613t0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1613t0 f9426a = new C1613t0();

    public static final ColorSpace e(AbstractC1628c abstractC1628c) {
        S0.g gVar = S0.g.f9615a;
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.w())) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.e())) {
            return ColorSpace.get(ColorSpace.Named.ACES);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.f())) {
            return ColorSpace.get(ColorSpace.Named.ACESCG);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.g())) {
            return ColorSpace.get(ColorSpace.Named.ADOBE_RGB);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.h())) {
            return ColorSpace.get(ColorSpace.Named.BT2020);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.i())) {
            return ColorSpace.get(ColorSpace.Named.BT709);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.j())) {
            return ColorSpace.get(ColorSpace.Named.CIE_LAB);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.k())) {
            return ColorSpace.get(ColorSpace.Named.CIE_XYZ);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.m())) {
            return ColorSpace.get(ColorSpace.Named.DCI_P3);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.n())) {
            return ColorSpace.get(ColorSpace.Named.DISPLAY_P3);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.o())) {
            return ColorSpace.get(ColorSpace.Named.EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.p())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_EXTENDED_SRGB);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.q())) {
            return ColorSpace.get(ColorSpace.Named.LINEAR_SRGB);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.r())) {
            return ColorSpace.get(ColorSpace.Named.NTSC_1953);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.u())) {
            return ColorSpace.get(ColorSpace.Named.PRO_PHOTO_RGB);
        }
        if (kotlin.jvm.internal.t.c(abstractC1628c, gVar.v())) {
            return ColorSpace.get(ColorSpace.Named.SMPTE_C);
        }
        if (!(abstractC1628c instanceof S0.A)) {
            return ColorSpace.get(ColorSpace.Named.SRGB);
        }
        S0.A a8 = (S0.A) abstractC1628c;
        float[] fArrC = a8.Z().c();
        S0.B bX = a8.X();
        ColorSpace.Rgb.TransferParameters transferParameters = bX != null ? new ColorSpace.Rgb.TransferParameters(bX.a(), bX.b(), bX.c(), bX.d(), bX.e(), bX.f(), bX.g()) : null;
        if (transferParameters != null) {
            return new ColorSpace.Rgb(abstractC1628c.h(), a8.W(), fArrC, transferParameters);
        }
        String strH = abstractC1628c.h();
        float[] fArrW = a8.W();
        final Q6.k kVarT = a8.T();
        DoubleUnaryOperator doubleUnaryOperator = new DoubleUnaryOperator() { // from class: R0.p0
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d8) {
                return C1613t0.f(kVarT, d8);
            }
        };
        final Q6.k kVarP = a8.P();
        return new ColorSpace.Rgb(strH, fArrW, fArrC, doubleUnaryOperator, new DoubleUnaryOperator() { // from class: R0.q0
            @Override // java.util.function.DoubleUnaryOperator
            public final double applyAsDouble(double d8) {
                return C1613t0.g(kVarP, d8);
            }
        }, abstractC1628c.f(0), abstractC1628c.e(0));
    }

    public static final double f(Q6.k kVar, double d8) {
        return ((Number) kVar.invoke(Double.valueOf(d8))).doubleValue();
    }

    public static final double g(Q6.k kVar, double d8) {
        return ((Number) kVar.invoke(Double.valueOf(d8))).doubleValue();
    }

    public static final AbstractC1628c h(final ColorSpace colorSpace) {
        int id = colorSpace.getId();
        if (id == ColorSpace.Named.SRGB.ordinal()) {
            return S0.g.f9615a.w();
        }
        if (id == ColorSpace.Named.ACES.ordinal()) {
            return S0.g.f9615a.e();
        }
        if (id == ColorSpace.Named.ACESCG.ordinal()) {
            return S0.g.f9615a.f();
        }
        if (id == ColorSpace.Named.ADOBE_RGB.ordinal()) {
            return S0.g.f9615a.g();
        }
        if (id == ColorSpace.Named.BT2020.ordinal()) {
            return S0.g.f9615a.h();
        }
        if (id == ColorSpace.Named.BT709.ordinal()) {
            return S0.g.f9615a.i();
        }
        if (id == ColorSpace.Named.CIE_LAB.ordinal()) {
            return S0.g.f9615a.j();
        }
        if (id == ColorSpace.Named.CIE_XYZ.ordinal()) {
            return S0.g.f9615a.k();
        }
        if (id == ColorSpace.Named.DCI_P3.ordinal()) {
            return S0.g.f9615a.m();
        }
        if (id == ColorSpace.Named.DISPLAY_P3.ordinal()) {
            return S0.g.f9615a.n();
        }
        if (id == ColorSpace.Named.EXTENDED_SRGB.ordinal()) {
            return S0.g.f9615a.o();
        }
        if (id == ColorSpace.Named.LINEAR_EXTENDED_SRGB.ordinal()) {
            return S0.g.f9615a.p();
        }
        if (id == ColorSpace.Named.LINEAR_SRGB.ordinal()) {
            return S0.g.f9615a.q();
        }
        if (id == ColorSpace.Named.NTSC_1953.ordinal()) {
            return S0.g.f9615a.r();
        }
        if (id == ColorSpace.Named.PRO_PHOTO_RGB.ordinal()) {
            return S0.g.f9615a.u();
        }
        if (id == ColorSpace.Named.SMPTE_C.ordinal()) {
            return S0.g.f9615a.v();
        }
        if (!(colorSpace instanceof ColorSpace.Rgb)) {
            return S0.g.f9615a.w();
        }
        ColorSpace.Rgb rgb = (ColorSpace.Rgb) colorSpace;
        ColorSpace.Rgb.TransferParameters transferParameters = rgb.getTransferParameters();
        return new S0.A(rgb.getName(), rgb.getPrimaries(), rgb.getWhitePoint().length == 3 ? new S0.C(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1], rgb.getWhitePoint()[2]) : new S0.C(rgb.getWhitePoint()[0], rgb.getWhitePoint()[1]), rgb.getTransform(), new S0.i() { // from class: R0.r0
            @Override // S0.i
            public final double a(double d8) {
                return C1613t0.i(colorSpace, d8);
            }
        }, new S0.i() { // from class: R0.s0
            @Override // S0.i
            public final double a(double d8) {
                return C1613t0.j(colorSpace, d8);
            }
        }, colorSpace.getMinValue(0), colorSpace.getMaxValue(0), transferParameters != null ? new S0.B(transferParameters.g, transferParameters.a, transferParameters.b, transferParameters.c, transferParameters.d, transferParameters.e, transferParameters.f) : null, rgb.getId());
    }

    public static final double i(ColorSpace colorSpace, double d8) {
        return ((ColorSpace.Rgb) colorSpace).getOetf().applyAsDouble(d8);
    }

    public static final double j(ColorSpace colorSpace, double d8) {
        return ((ColorSpace.Rgb) colorSpace).getEotf().applyAsDouble(d8);
    }
}
