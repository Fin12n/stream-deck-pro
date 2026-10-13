package p037e0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class X {
    public static final long a(double d8, double d9, double d10, double d11, double d12) {
        double dSqrt = 2.0d * d9 * Math.sqrt(d8);
        double d13 = (dSqrt * dSqrt) - (d8 * 4.0d);
        double d14 = -dSqrt;
        C2223t c2223tA = AbstractC2224u.a(d13);
        c2223tA.f20330a += d14;
        c2223tA.f20330a *= 0.5d;
        c2223tA.f20331b *= 0.5d;
        C2223t c2223tA2 = AbstractC2224u.a(d13);
        double d15 = -1;
        c2223tA2.f20330a *= d15;
        c2223tA2.f20331b *= d15;
        c2223tA2.f20330a += d14;
        c2223tA2.f20330a *= 0.5d;
        c2223tA2.f20331b *= 0.5d;
        return d(c2223tA, c2223tA2, d9, d10, d11, d12);
    }

    public static final long b(float f8, float f9, float f10, float f11, float f12) {
        return a(f8, f9, f10, f11, f12);
    }

    public static final double c(C2223t c2223t, double d8, double d9, double d10) {
        double d11 = d10;
        double dF = c2223t.f();
        double d12 = dF * d8;
        double d13 = d9 - d12;
        double dLog = Math.log(Math.abs(d11 / d8)) / dF;
        double dLog2 = Math.log(Math.abs(d11 / d13));
        double dLog3 = dLog2;
        for (int i8 = 0; i8 < 6; i8++) {
            dLog3 = dLog2 - Math.log(Math.abs(dLog3 / dF));
        }
        double d14 = dLog3 / dF;
        if (!((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true)) {
            dLog = d14;
        } else if ((Double.isInfinite(d14) || Double.isNaN(d14)) ? false : true) {
            dLog = Math.max(dLog, d14);
        }
        double d15 = (-(d12 + d13)) / (dF * d13);
        double d16 = dF * d15;
        double dExp = (Math.exp(d16) * d8) + (d13 * d15 * Math.exp(d16));
        if (Double.isNaN(d15) || d15 <= 0.0d) {
            d11 = -d11;
        } else if (d15 <= 0.0d || (-dExp) >= d11) {
            dLog = (-(2.0d / dF)) - (d8 / d13);
        } else {
            if (d13 < 0.0d && d8 > 0.0d) {
                dLog = 0.0d;
            }
            d11 = -d11;
        }
        double dAbs = Double.MAX_VALUE;
        int i9 = 0;
        while (dAbs > 0.001d && i9 < 100) {
            i9++;
            double d17 = dF * dLog;
            double d18 = d11;
            double dExp2 = dLog - ((((d8 + (d13 * dLog)) * Math.exp(d17)) + d11) / ((((((double) 1) + d17) * d13) + d12) * Math.exp(d17)));
            dAbs = Math.abs(dLog - dExp2);
            dLog = dExp2;
            d11 = d18;
        }
        return dLog;
    }

    public static final long d(C2223t c2223t, C2223t c2223t2, double d8, double d9, double d10, double d11) {
        double dG;
        if (d10 == 0.0d && d9 == 0.0d) {
            return 0L;
        }
        if (d10 < 0.0d) {
            d9 = -d9;
        }
        double d12 = d9;
        double dAbs = Math.abs(d10);
        if (d8 > 1.0d) {
            dG = e(c2223t, c2223t2, dAbs, d12, d11);
        } else {
            dG = d8 < 1.0d ? g(c2223t, dAbs, d12, d11) : c(c2223t, dAbs, d12, d11);
        }
        return (long) (dG * 1000.0d);
    }

    public static final double e(C2223t c2223t, C2223t c2223t2, double d8, double d9, double d10) {
        double d11 = d10;
        double dF = c2223t.f();
        double dF2 = c2223t2.f();
        double d12 = dF - dF2;
        double d13 = ((dF * d8) - d9) / d12;
        double d14 = d8 - d13;
        double dLog = Math.log(Math.abs(d11 / d14)) / dF;
        double dLog2 = Math.log(Math.abs(d11 / d13)) / dF2;
        if ((Double.isInfinite(dLog) || Double.isNaN(dLog)) ? false : true) {
            if ((Double.isInfinite(dLog2) || Double.isNaN(dLog2)) ? false : true) {
                dLog = Math.max(dLog, dLog2);
            }
            dLog2 = dLog;
        }
        double d15 = d14 * dF;
        double dLog3 = Math.log(d15 / ((-d13) * dF2)) / (dF2 - dF);
        if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
            d11 = -d11;
        } else if (dLog3 <= 0.0d || (-f(d14, dF, dLog3, d13, dF2)) >= d11) {
            dLog2 = Math.log((-((d13 * dF2) * dF2)) / (d15 * dF)) / d12;
        } else {
            if (d13 > 0.0d && d14 < 0.0d) {
                dLog2 = 0.0d;
            }
            d11 = -d11;
        }
        double d16 = d13 * dF2;
        if (Math.abs((Math.exp(dF * dLog2) * d15) + (Math.exp(dF2 * dLog2) * d16)) < 1.0E-4d) {
            return dLog2;
        }
        double d17 = Double.MAX_VALUE;
        double d18 = d11;
        int i8 = 0;
        while (d17 > 0.001d && i8 < 100) {
            i8++;
            double d19 = dF * dLog2;
            double d20 = dF2 * dLog2;
            double dExp = dLog2 - ((((Math.exp(d19) * d14) + (Math.exp(d20) * d13)) + d18) / ((Math.exp(d19) * d15) + (Math.exp(d20) * d16)));
            double dAbs = Math.abs(dLog2 - dExp);
            dLog2 = dExp;
            d17 = dAbs;
        }
        return dLog2;
    }

    public static final double f(double d8, double d9, double d10, double d11, double d12) {
        return (d8 * Math.exp(d9 * d10)) + (d11 * Math.exp(d12 * d10));
    }

    public static final double g(C2223t c2223t, double d8, double d9, double d10) {
        double dF = c2223t.f();
        double dE = (d9 - (dF * d8)) / c2223t.e();
        return Math.log(d10 / Math.sqrt((d8 * d8) + (dE * dE))) / dF;
    }
}
