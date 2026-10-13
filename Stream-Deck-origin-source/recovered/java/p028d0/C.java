package p028d0;

import A1.d;
import p037e0.AbstractC2229z;
import p037e0.InterfaceC2227x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class C {
    public static final void b(float[] fArr, float[] fArr2, int i8) {
        float f8;
        float f9;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        float f16;
        float f17 = 0.0f;
        int i9 = 0;
        float f18 = 0.0f;
        while (true) {
            float f19 = 1.0f;
            if (i9 >= i8) {
                fArr2[i8] = 1.0f;
                fArr[i8] = 1.0f;
                return;
            }
            float f20 = i9 / i8;
            float f21 = 1.0f;
            while (true) {
                f8 = ((f21 - f17) / 2.0f) + f17;
                f9 = f19 - f8;
                f10 = f8 * 3.0f * f9;
                f11 = f8 * f8 * f8;
                float f22 = (((f9 * 0.175f) + (f8 * 0.35000002f)) * f10) + f11;
                f12 = f19;
                if (Math.abs(f22 - f20) < 1.0E-5d) {
                    break;
                }
                if (f22 > f20) {
                    f21 = f8;
                } else {
                    f17 = f8;
                }
                f19 = f12;
            }
            float f23 = 0.5f;
            fArr[i9] = (f10 * ((f9 * 0.5f) + f8)) + f11;
            float f24 = f12;
            while (true) {
                f13 = ((f24 - f18) / 2.0f) + f18;
                f14 = f12 - f13;
                f15 = f13 * 3.0f * f14;
                f16 = f13 * f13 * f13;
                float f25 = (((f14 * f23) + f13) * f15) + f16;
                float f26 = f20;
                if (Math.abs(f25 - f20) >= 1.0E-5d) {
                    if (f25 > f26) {
                        f24 = f13;
                    } else {
                        f18 = f13;
                    }
                    f20 = f26;
                    f23 = 0.5f;
                }
            }
            fArr2[i9] = (f15 * ((f14 * 0.175f) + (f13 * 0.35000002f))) + f16;
            i9++;
        }
    }

    public static final InterfaceC2227x c(d dVar) {
        return AbstractC2229z.a(new D(dVar));
    }
}
