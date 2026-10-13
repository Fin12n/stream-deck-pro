package p065h1;

import A1.t;
import Q6.k;
import R0.B0;
import android.content.res.Configuration;
import kotlin.jvm.internal.u;
import p176u1.H;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static k f24098a = a.f24099a;

    public static final float d(float[] fArr, int i8, float[] fArr2, int i9) {
        int i10 = i8 * 4;
        return (fArr[i10] * fArr2[i9]) + (fArr[i10 + 1] * fArr2[4 + i9]) + (fArr[i10 + 2] * fArr2[8 + i9]) + (fArr[i10 + 3] * fArr2[12 + i9]);
    }

    public static final t e(Configuration configuration) {
        return g(configuration.getLayoutDirection());
    }

    public static final k f() {
        return f24098a;
    }

    public static final t g(int i8) {
        if (i8 != 0) {
            return i8 != 1 ? t.Ltr : t.Rtl;
        }
        return t.Ltr;
    }

    public static final void h(float[] fArr, float[] fArr2) {
        float fD = d(fArr2, 0, fArr, 0);
        float fD2 = d(fArr2, 0, fArr, 1);
        float fD3 = d(fArr2, 0, fArr, 2);
        float fD4 = d(fArr2, 0, fArr, 3);
        float fD5 = d(fArr2, 1, fArr, 0);
        float fD6 = d(fArr2, 1, fArr, 1);
        float fD7 = d(fArr2, 1, fArr, 2);
        float fD8 = d(fArr2, 1, fArr, 3);
        float fD9 = d(fArr2, 2, fArr, 0);
        float fD10 = d(fArr2, 2, fArr, 1);
        float fD11 = d(fArr2, 2, fArr, 2);
        float fD12 = d(fArr2, 2, fArr, 3);
        float fD13 = d(fArr2, 3, fArr, 0);
        float fD14 = d(fArr2, 3, fArr, 1);
        float fD15 = d(fArr2, 3, fArr, 2);
        float fD16 = d(fArr2, 3, fArr, 3);
        fArr[0] = fD;
        fArr[1] = fD2;
        fArr[2] = fD3;
        fArr[3] = fD4;
        fArr[4] = fD5;
        fArr[5] = fD6;
        fArr[6] = fD7;
        fArr[7] = fD8;
        fArr[8] = fD9;
        fArr[9] = fD10;
        fArr[10] = fD11;
        fArr[11] = fD12;
        fArr[12] = fD13;
        fArr[13] = fD14;
        fArr[14] = fD15;
        fArr[15] = fD16;
    }

    public static final void i(float[] fArr, float f8, float f9, float[] fArr2) {
        B0.h(fArr2);
        B0.n(fArr2, f8, f9, 0.0f, 4, null);
        h(fArr, fArr2);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f24099a = new a();

        public a() {
            super(1);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final H invoke(H h8) {
            return h8;
        }
    }
}
