package p020c1;

import Q0.f;
import androidx.startup.TrZh.ZWZaxQrCHfNe;
import java.util.List;
import p011b1.AbstractC1767o;
import p011b1.C1758f;
import p011b1.z;
import p215z0.InterfaceC3164l0;
import p215z0.l1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC3164l0 f16050a = l1.e(Boolean.FALSE, null, 2, null);

    public static final void c(d dVar, z zVar) {
        if (h()) {
            e(dVar, zVar);
        } else {
            d(dVar, zVar);
        }
    }

    public static final void d(d dVar, z zVar) {
        if (AbstractC1767o.b(zVar)) {
            dVar.f(zVar.i());
            dVar.e();
        }
        long jL = zVar.l();
        List listF = zVar.f();
        int size = listF.size();
        int i8 = 0;
        while (i8 < size) {
            C1758f c1758f = (C1758f) listF.get(i8);
            long jS = f.s(c1758f.b(), jL);
            long jB = c1758f.b();
            dVar.f(f.t(dVar.c(), jS));
            dVar.a(c1758f.c(), dVar.c());
            i8++;
            jL = jB;
        }
        dVar.f(f.t(dVar.c(), f.s(zVar.i(), jL)));
        dVar.a(zVar.p(), dVar.c());
    }

    public static final void e(d dVar, z zVar) {
        if (AbstractC1767o.b(zVar)) {
            dVar.e();
        }
        if (!AbstractC1767o.d(zVar)) {
            List listF = zVar.f();
            int size = listF.size();
            for (int i8 = 0; i8 < size; i8++) {
                C1758f c1758f = (C1758f) listF.get(i8);
                dVar.a(c1758f.c(), c1758f.a());
            }
            dVar.a(zVar.p(), zVar.h());
        }
        if (AbstractC1767o.d(zVar) && zVar.p() - dVar.d() > 40) {
            dVar.e();
        }
        dVar.g(zVar.p());
    }

    public static final float f(float[] fArr, float[] fArr2, int i8, boolean z8) {
        float fAbs = 0.0f;
        if (i8 < 2) {
            return 0.0f;
        }
        if (i8 == 2) {
            float f8 = fArr2[0];
            float f9 = fArr2[1];
            if (f8 == f9) {
                return 0.0f;
            }
            return (z8 ? fArr[0] : fArr[0] - fArr[1]) / (f8 - f9);
        }
        int i9 = i8 - 1;
        for (int i10 = i9; i10 > 0; i10--) {
            int i11 = i10 - 1;
            if (fArr2[i10] != fArr2[i11]) {
                float fSignum = Math.signum(fAbs) * ((float) Math.sqrt(2 * Math.abs(fAbs)));
                float f10 = (z8 ? -fArr[i11] : fArr[i10] - fArr[i11]) / (fArr2[i10] - fArr2[i11]);
                fAbs += (f10 - fSignum) * Math.abs(f10);
                if (i10 == i9) {
                    fAbs *= 0.5f;
                }
            }
        }
        return Math.signum(fAbs) * ((float) Math.sqrt(2 * Math.abs(fAbs)));
    }

    public static final float g(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f8 = 0.0f;
        for (int i8 = 0; i8 < length; i8++) {
            f8 += fArr[i8] * fArr2[i8];
        }
        return f8;
    }

    public static final boolean h() {
        return ((Boolean) f16050a.getValue()).booleanValue();
    }

    public static final void j(a[] aVarArr, int i8, long j8, float f8) {
        a aVar = aVarArr[i8];
        if (aVar == null) {
            aVarArr[i8] = new a(j8, f8);
        } else {
            aVar.d(j8);
            aVar.c(f8);
        }
    }

    public static final float[] i(float[] fArr, float[] fArr2, int i8, int i9, float[] fArr3) {
        int i10 = i9;
        if (i10 < 1) {
            throw new IllegalArgumentException(ZWZaxQrCHfNe.yuxBtCzAGFJj);
        }
        if (i8 == 0) {
            throw new IllegalArgumentException("At least one point must be provided");
        }
        if (i10 >= i8) {
            i10 = i8 - 1;
        }
        int i11 = i10 + 1;
        float[][] fArr4 = new float[i11][];
        for (int i12 = 0; i12 < i11; i12++) {
            fArr4[i12] = new float[i8];
        }
        for (int i13 = 0; i13 < i8; i13++) {
            fArr4[0][i13] = 1.0f;
            for (int i14 = 1; i14 < i11; i14++) {
                fArr4[i14][i13] = fArr4[i14 - 1][i13] * fArr[i13];
            }
        }
        float[][] fArr5 = new float[i11][];
        for (int i15 = 0; i15 < i11; i15++) {
            fArr5[i15] = new float[i8];
        }
        float[][] fArr6 = new float[i11][];
        for (int i16 = 0; i16 < i11; i16++) {
            fArr6[i16] = new float[i11];
        }
        int i17 = 0;
        while (i17 < i11) {
            float[] fArr7 = fArr5[i17];
            float[] fArr8 = fArr4[i17];
            for (int i18 = 0; i18 < i8; i18++) {
                fArr7[i18] = fArr8[i18];
            }
            for (int i19 = 0; i19 < i17; i19++) {
                float[] fArr9 = fArr5[i19];
                float fG = g(fArr7, fArr9);
                for (int i20 = 0; i20 < i8; i20++) {
                    fArr7[i20] = fArr7[i20] - (fArr9[i20] * fG);
                }
            }
            float fSqrt = (float) Math.sqrt(g(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                throw new IllegalArgumentException("Vectors are linearly dependent or zero so no solution. TODO(shepshapard), actually determine what this means");
            }
            float f8 = 1.0f / fSqrt;
            for (int i21 = 0; i21 < i8; i21++) {
                fArr7[i21] = fArr7[i21] * f8;
            }
            float[] fArr10 = fArr6[i17];
            int i22 = 0;
            while (i22 < i11) {
                fArr10[i22] = i22 < i17 ? 0.0f : g(fArr7, fArr4[i22]);
                i22++;
            }
            i17++;
        }
        for (int i23 = i10; -1 < i23; i23--) {
            fArr3[i23] = g(fArr5[i23], fArr2);
            int i24 = i23 + 1;
            if (i24 <= i10) {
                int i25 = i10;
                while (true) {
                    fArr3[i23] = fArr3[i23] - (fArr6[i23][i25] * fArr3[i25]);
                    if (i25 != i24) {
                        i25--;
                    }
                }
            }
            fArr3[i23] = fArr3[i23] / fArr6[i23][i23];
        }
        return fArr3;
    }
}
