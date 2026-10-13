package V0;

import R0.H0;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final float[] f10408a = new float[0];

    public static final void a(H0 h8, double d8, double d9, double d10, double d11, double d12, double d13, double d14, double d15, double d16) {
        double d17 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d16 * d17) / 3.141592653589793d));
        double dCos = Math.cos(d14);
        double dSin = Math.sin(d14);
        double dCos2 = Math.cos(d15);
        double dSin2 = Math.sin(d15);
        double d18 = -d10;
        double d19 = d18 * dCos;
        double d20 = d11 * dSin;
        double d21 = (d19 * dSin2) - (d20 * dCos2);
        double d22 = d18 * dSin;
        double d23 = d11 * dCos;
        double d24 = (dSin2 * d22) + (dCos2 * d23);
        double d25 = d16 / ((double) iCeil);
        double d26 = d24;
        double d27 = d21;
        int i8 = 0;
        double d28 = d12;
        double d29 = d13;
        double d30 = d15;
        while (i8 < iCeil) {
            double d31 = d30 + d25;
            double dSin3 = Math.sin(d31);
            double dCos3 = Math.cos(d31);
            int i9 = i8;
            double d32 = (d8 + ((d10 * dCos) * dCos3)) - (d20 * dSin3);
            double d33 = d17;
            double d34 = d9 + (d10 * dSin * dCos3) + (d23 * dSin3);
            double d35 = (d19 * dSin3) - (d20 * dCos3);
            double d36 = (dSin3 * d22) + (dCos3 * d23);
            double d37 = d31 - d30;
            int i10 = iCeil;
            double dTan = Math.tan(d37 / ((double) 2));
            double dSin4 = (Math.sin(d37) * (Math.sqrt(d33 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            h8.k((float) (d28 + (d27 * dSin4)), (float) (d29 + (d26 * dSin4)), (float) (d32 - (dSin4 * d35)), (float) (d34 - (dSin4 * d36)), (float) d32, (float) d34);
            dSin = dSin;
            d25 = d25;
            d28 = d32;
            d29 = d34;
            i8 = i9 + 1;
            d30 = d31;
            d26 = d36;
            iCeil = i10;
            d27 = d35;
            dCos = dCos;
            d17 = d33;
        }
    }

    public static final void b(H0 h8, double d8, double d9, double d10, double d11, double d12, double d13, double d14, boolean z8, boolean z9) {
        double d15;
        double d16;
        double d17 = (d14 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d17);
        double dSin = Math.sin(d17);
        double d18 = ((d8 * dCos) + (d9 * dSin)) / d12;
        double d19 = (((-d8) * dSin) + (d9 * dCos)) / d13;
        double d20 = ((d10 * dCos) + (d11 * dSin)) / d12;
        double d21 = (((-d10) * dSin) + (d11 * dCos)) / d13;
        double d22 = d18 - d20;
        double d23 = d19 - d21;
        double d24 = 2;
        double d25 = (d18 + d20) / d24;
        double d26 = (d19 + d21) / d24;
        double d27 = (d22 * d22) + (d23 * d23);
        if (d27 == 0.0d) {
            return;
        }
        double d28 = (1.0d / d27) - 0.25d;
        if (d28 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d27) / 1.99999d);
            b(h8, d8, d9, d10, d11, d12 * dSqrt, d13 * dSqrt, d14, z8, z9);
            return;
        }
        double dSqrt2 = Math.sqrt(d28);
        double d29 = d22 * dSqrt2;
        double d30 = dSqrt2 * d23;
        if (z8 == z9) {
            d15 = d25 - d30;
            d16 = d26 + d29;
        } else {
            d15 = d25 + d30;
            d16 = d26 - d29;
        }
        double dAtan2 = Math.atan2(d19 - d16, d18 - d15);
        double dAtan3 = Math.atan2(d21 - d16, d20 - d15) - dAtan2;
        if (z9 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d31 = d15 * d12;
        double d32 = d16 * d13;
        a(h8, (d31 * dCos) - (d32 * dSin), (d31 * dSin) + (d32 * dCos), d12, d13, d8, d9, d17, dAtan2, dAtan3);
    }

    public static final H0 c(List list, H0 h8) {
        float f8;
        float f9;
        float fC;
        float fD;
        float f10;
        float f11;
        float f12;
        float f13;
        float fC2;
        float fE;
        float f14;
        List list2 = list;
        H0 h9 = h8;
        int iG = h9.g();
        h9.l();
        h9.f(iG);
        h hVar = list2.isEmpty() ? h.b.f10354c : (h) list2.get(0);
        int size = list2.size();
        float f15 = 0.0f;
        int i8 = 0;
        float fC3 = 0.0f;
        float fD2 = 0.0f;
        float f16 = 0.0f;
        float f17 = 0.0f;
        float fC4 = 0.0f;
        float fD3 = 0.0f;
        while (i8 < size) {
            h hVar2 = (h) list2.get(i8);
            if (hVar2 instanceof h.b) {
                h9.close();
                h9.j(f16, f17);
                fC3 = f16;
                fC4 = fC3;
                fD2 = f17;
                fD3 = fD2;
            } else if (hVar2 instanceof h.n) {
                h.n nVar = (h.n) hVar2;
                fC4 += nVar.c();
                fD3 += nVar.d();
                h9.b(nVar.c(), nVar.d());
                f16 = fC4;
                f17 = fD3;
            } else if (hVar2 instanceof h.f) {
                h.f fVar = (h.f) hVar2;
                float fC5 = fVar.c();
                float fD4 = fVar.d();
                h9.j(fVar.c(), fVar.d());
                f16 = fC5;
                fC4 = f16;
                f17 = fD4;
                fD3 = f17;
            } else {
                if (hVar2 instanceof h.m) {
                    h.m mVar = (h.m) hVar2;
                    h9.o(mVar.c(), mVar.d());
                    fC4 += mVar.c();
                    f11 = mVar.d();
                } else {
                    if (hVar2 instanceof h.e) {
                        h.e eVar = (h.e) hVar2;
                        h9.r(eVar.c(), eVar.d());
                        fD = eVar.c();
                        f10 = eVar.d();
                    } else if (hVar2 instanceof h.l) {
                        h.l lVar = (h.l) hVar2;
                        h9.o(lVar.c(), f15);
                        fC4 += lVar.c();
                    } else if (hVar2 instanceof h.d) {
                        h.d dVar = (h.d) hVar2;
                        h9.r(dVar.c(), fD3);
                        fC4 = dVar.c();
                    } else if (hVar2 instanceof h.r) {
                        h.r rVar = (h.r) hVar2;
                        h9.o(f15, rVar.c());
                        f11 = rVar.c();
                    } else if (hVar2 instanceof h.s) {
                        h.s sVar = (h.s) hVar2;
                        h9.r(fC4, sVar.c());
                        fD3 = sVar.c();
                    } else {
                        if (hVar2 instanceof h.k) {
                            h.k kVar = (h.k) hVar2;
                            h9.c(kVar.c(), kVar.f(), kVar.d(), kVar.g(), kVar.e(), kVar.h());
                            fC2 = kVar.d() + fC4;
                            fE = kVar.g() + fD3;
                            fC4 += kVar.e();
                            f14 = kVar.h();
                        } else {
                            if (hVar2 instanceof h.c) {
                                h.c cVar = (h.c) hVar2;
                                h8.k(cVar.c(), cVar.f(), cVar.d(), cVar.g(), cVar.e(), cVar.h());
                                float fD5 = cVar.d();
                                float fG = cVar.g();
                                float fE2 = cVar.e();
                                float fH = cVar.h();
                                fC4 = fE2;
                                fD3 = fH;
                                size = size;
                                f15 = f15;
                                i8 = i8;
                                hVar2 = hVar2;
                                fC3 = fD5;
                                fD2 = fG;
                            } else if (hVar2 instanceof h.p) {
                                if (hVar.a()) {
                                    float f18 = fC4 - fC3;
                                    f13 = fD3 - fD2;
                                    f12 = f18;
                                } else {
                                    f12 = f15;
                                    f13 = f12;
                                }
                                h.p pVar = (h.p) hVar2;
                                h8.c(f12, f13, pVar.c(), pVar.e(), pVar.d(), pVar.f());
                                fC2 = pVar.c() + fC4;
                                fE = pVar.e() + fD3;
                                fC4 += pVar.d();
                                f14 = pVar.f();
                            } else {
                                if (hVar2 instanceof h.C0287h) {
                                    if (hVar.a()) {
                                        float f19 = 2;
                                        fC4 = (fC4 * f19) - fC3;
                                        fD3 = (f19 * fD3) - fD2;
                                    }
                                    h.C0287h c0287h = (h.C0287h) hVar2;
                                    h8.k(fC4, fD3, c0287h.c(), c0287h.e(), c0287h.d(), c0287h.f());
                                    fC = c0287h.c();
                                    float fE3 = c0287h.e();
                                    float fD6 = c0287h.d();
                                    float f20 = c0287h.f();
                                    fC4 = fD6;
                                    fD3 = f20;
                                    fD2 = fE3;
                                } else if (hVar2 instanceof h.o) {
                                    h.o oVar = (h.o) hVar2;
                                    h8.e(oVar.c(), oVar.e(), oVar.d(), oVar.f());
                                    fC3 = oVar.c() + fC4;
                                    fD2 = oVar.e() + fD3;
                                    fC4 += oVar.d();
                                    f11 = oVar.f();
                                } else if (hVar2 instanceof h.g) {
                                    h.g gVar = (h.g) hVar2;
                                    h8.d(gVar.c(), gVar.e(), gVar.d(), gVar.f());
                                    fC3 = gVar.c();
                                    fD2 = gVar.e();
                                    fD = gVar.d();
                                    f10 = gVar.f();
                                } else if (hVar2 instanceof h.q) {
                                    if (hVar.b()) {
                                        f8 = fC4 - fC3;
                                        f9 = fD3 - fD2;
                                    } else {
                                        f8 = f15;
                                        f9 = f8;
                                    }
                                    h.q qVar = (h.q) hVar2;
                                    h8.e(f8, f9, qVar.c(), qVar.d());
                                    fC = f8 + fC4;
                                    float f21 = f9 + fD3;
                                    fC4 += qVar.c();
                                    fD3 += qVar.d();
                                    fD2 = f21;
                                } else if (hVar2 instanceof h.i) {
                                    if (hVar.b()) {
                                        float f22 = 2;
                                        fC4 = (fC4 * f22) - fC3;
                                        fD3 = (f22 * fD3) - fD2;
                                    }
                                    h.i iVar = (h.i) hVar2;
                                    h8.d(fC4, fD3, iVar.c(), iVar.d());
                                    float f23 = fC4;
                                    fC4 = iVar.c();
                                    fC3 = f23;
                                    size = size;
                                    f15 = f15;
                                    i8 = i8;
                                    fD2 = fD3;
                                    hVar2 = hVar2;
                                    fD3 = iVar.d();
                                } else if (hVar2 instanceof h.j) {
                                    h.j jVar = (h.j) hVar2;
                                    float fC6 = jVar.c() + fC4;
                                    float fD7 = jVar.d() + fD3;
                                    f15 = f15;
                                    i8 = i8;
                                    hVar2 = hVar2;
                                    size = size;
                                    b(h8, fC4, fD3, fC6, fD7, jVar.e(), jVar.g(), jVar.f(), jVar.h(), jVar.i());
                                    f16 = f16;
                                    f17 = f17;
                                    fD2 = fD7;
                                    fD3 = fD2;
                                    fC3 = fC6;
                                    fC4 = fC3;
                                } else {
                                    size = size;
                                    f15 = f15;
                                    i8 = i8;
                                    float f24 = f16;
                                    float f25 = f17;
                                    hVar2 = hVar2;
                                    if (hVar2 instanceof h.a) {
                                        h.a aVar = (h.a) hVar2;
                                        b(h8, fC4, fD3, aVar.c(), aVar.d(), aVar.e(), aVar.g(), aVar.f(), aVar.h(), aVar.i());
                                        fC3 = aVar.c();
                                        fC4 = fC3;
                                        fD2 = aVar.d();
                                        fD3 = fD2;
                                    }
                                    f16 = f24;
                                    f17 = f25;
                                }
                                fC3 = fC;
                            }
                            i8++;
                            h9 = h8;
                            hVar = hVar2;
                            size = size;
                            f15 = f15;
                            list2 = list;
                        }
                        fD3 += f14;
                        fC3 = fC2;
                        fD2 = fE;
                    }
                    fD3 = f10;
                    fC4 = fD;
                }
                fD3 += f11;
            }
            hVar2 = hVar2;
            i8++;
            h9 = h8;
            hVar = hVar2;
            size = size;
            f15 = f15;
            list2 = list;
        }
        return h8;
    }
}
