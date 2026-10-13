package R0;

import java.util.Arrays;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final a f9291b = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final float[] f9292a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ B0(float[] fArr) {
        this.f9292a = fArr;
    }

    public static final /* synthetic */ B0 a(float[] fArr) {
        return new B0(fArr);
    }

    public static /* synthetic */ float[] c(float[] fArr, int i8, AbstractC2633k abstractC2633k) {
        if ((i8 & 1) != 0) {
            fArr = new float[]{1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f, 0.0f, 0.0f, 0.0f, 0.0f, 1.0f};
        }
        return b(fArr);
    }

    public static boolean d(float[] fArr, Object obj) {
        return (obj instanceof B0) && kotlin.jvm.internal.t.c(fArr, ((B0) obj).o());
    }

    public static int e(float[] fArr) {
        return Arrays.hashCode(fArr);
    }

    public static final long f(float[] fArr, long j8) {
        float fO = Q0.f.o(j8);
        float fP = Q0.f.p(j8);
        float f8 = 1 / (((fArr[3] * fO) + (fArr[7] * fP)) + fArr[15]);
        if (Float.isInfinite(f8) || Float.isNaN(f8)) {
            f8 = 0.0f;
        }
        return Q0.g.a(((fArr[0] * fO) + (fArr[4] * fP) + fArr[12]) * f8, f8 * ((fArr[1] * fO) + (fArr[5] * fP) + fArr[13]));
    }

    public static final void g(float[] fArr, Q0.d dVar) {
        long jF = f(fArr, Q0.g.a(dVar.b(), dVar.d()));
        long jF2 = f(fArr, Q0.g.a(dVar.b(), dVar.a()));
        long jF3 = f(fArr, Q0.g.a(dVar.c(), dVar.d()));
        long jF4 = f(fArr, Q0.g.a(dVar.c(), dVar.a()));
        dVar.i(Math.min(Math.min(Q0.f.o(jF), Q0.f.o(jF2)), Math.min(Q0.f.o(jF3), Q0.f.o(jF4))));
        dVar.k(Math.min(Math.min(Q0.f.p(jF), Q0.f.p(jF2)), Math.min(Q0.f.p(jF3), Q0.f.p(jF4))));
        dVar.j(Math.max(Math.max(Q0.f.o(jF), Q0.f.o(jF2)), Math.max(Q0.f.o(jF3), Q0.f.o(jF4))));
        dVar.h(Math.max(Math.max(Q0.f.p(jF), Q0.f.p(jF2)), Math.max(Q0.f.p(jF3), Q0.f.p(jF4))));
    }

    public static final void h(float[] fArr) {
        int i8 = 0;
        while (i8 < 4) {
            int i9 = 0;
            while (i9 < 4) {
                fArr[(i9 * 4) + i8] = i8 == i9 ? 1.0f : 0.0f;
                i9++;
            }
            i8++;
        }
    }

    public static final void i(float[] fArr, float f8) {
        double d8 = (((double) f8) * 3.141592653589793d) / 180.0d;
        float fCos = (float) Math.cos(d8);
        float fSin = (float) Math.sin(d8);
        float f9 = fArr[0];
        float f10 = fArr[4];
        float f11 = (fCos * f9) + (fSin * f10);
        float f12 = -fSin;
        float f13 = fArr[1];
        float f14 = fArr[5];
        float f15 = (fCos * f13) + (fSin * f14);
        float f16 = fArr[2];
        float f17 = fArr[6];
        float f18 = (fCos * f16) + (fSin * f17);
        float f19 = fArr[3];
        float f20 = fArr[7];
        fArr[0] = f11;
        fArr[1] = f15;
        fArr[2] = f18;
        fArr[3] = (fCos * f19) + (fSin * f20);
        fArr[4] = (f9 * f12) + (f10 * fCos);
        fArr[5] = (f13 * f12) + (f14 * fCos);
        fArr[6] = (f16 * f12) + (f17 * fCos);
        fArr[7] = (f12 * f19) + (fCos * f20);
    }

    public static final void j(float[] fArr, float f8, float f9, float f10) {
        fArr[0] = fArr[0] * f8;
        fArr[1] = fArr[1] * f8;
        fArr[2] = fArr[2] * f8;
        fArr[3] = fArr[3] * f8;
        fArr[4] = fArr[4] * f9;
        fArr[5] = fArr[5] * f9;
        fArr[6] = fArr[6] * f9;
        fArr[7] = fArr[7] * f9;
        fArr[8] = fArr[8] * f10;
        fArr[9] = fArr[9] * f10;
        fArr[10] = fArr[10] * f10;
        fArr[11] = fArr[11] * f10;
    }

    public static final void k(float[] fArr, float[] fArr2) {
        float fB = C0.b(fArr, 0, fArr2, 0);
        float fB2 = C0.b(fArr, 0, fArr2, 1);
        float fB3 = C0.b(fArr, 0, fArr2, 2);
        float fB4 = C0.b(fArr, 0, fArr2, 3);
        float fB5 = C0.b(fArr, 1, fArr2, 0);
        float fB6 = C0.b(fArr, 1, fArr2, 1);
        float fB7 = C0.b(fArr, 1, fArr2, 2);
        float fB8 = C0.b(fArr, 1, fArr2, 3);
        float fB9 = C0.b(fArr, 2, fArr2, 0);
        float fB10 = C0.b(fArr, 2, fArr2, 1);
        float fB11 = C0.b(fArr, 2, fArr2, 2);
        float fB12 = C0.b(fArr, 2, fArr2, 3);
        float fB13 = C0.b(fArr, 3, fArr2, 0);
        float fB14 = C0.b(fArr, 3, fArr2, 1);
        float fB15 = C0.b(fArr, 3, fArr2, 2);
        float fB16 = C0.b(fArr, 3, fArr2, 3);
        fArr[0] = fB;
        fArr[1] = fB2;
        fArr[2] = fB3;
        fArr[3] = fB4;
        fArr[4] = fB5;
        fArr[5] = fB6;
        fArr[6] = fB7;
        fArr[7] = fB8;
        fArr[8] = fB9;
        fArr[9] = fB10;
        fArr[10] = fB11;
        fArr[11] = fB12;
        fArr[12] = fB13;
        fArr[13] = fB14;
        fArr[14] = fB15;
        fArr[15] = fB16;
    }

    public static String l(float[] fArr) {
        return Z6.o.f("\n            |" + fArr[0] + ' ' + fArr[1] + ' ' + fArr[2] + ' ' + fArr[3] + "|\n            |" + fArr[4] + ' ' + fArr[5] + ' ' + fArr[6] + ' ' + fArr[7] + "|\n            |" + fArr[8] + ' ' + fArr[9] + ' ' + fArr[10] + ' ' + fArr[11] + "|\n            |" + fArr[12] + ' ' + fArr[13] + ' ' + fArr[14] + ' ' + fArr[15] + "|\n        ");
    }

    public static final void m(float[] fArr, float f8, float f9, float f10) {
        float f11 = (fArr[0] * f8) + (fArr[4] * f9) + (fArr[8] * f10) + fArr[12];
        float f12 = (fArr[1] * f8) + (fArr[5] * f9) + (fArr[9] * f10) + fArr[13];
        float f13 = (fArr[2] * f8) + (fArr[6] * f9) + (fArr[10] * f10) + fArr[14];
        float f14 = (fArr[3] * f8) + (fArr[7] * f9) + (fArr[11] * f10) + fArr[15];
        fArr[12] = f11;
        fArr[13] = f12;
        fArr[14] = f13;
        fArr[15] = f14;
    }

    public static /* synthetic */ void n(float[] fArr, float f8, float f9, float f10, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            f8 = 0.0f;
        }
        if ((i8 & 2) != 0) {
            f9 = 0.0f;
        }
        if ((i8 & 4) != 0) {
            f10 = 0.0f;
        }
        m(fArr, f8, f9, f10);
    }

    public boolean equals(Object obj) {
        return d(this.f9292a, obj);
    }

    public int hashCode() {
        return e(this.f9292a);
    }

    public final /* synthetic */ float[] o() {
        return this.f9292a;
    }

    public String toString() {
        return l(this.f9292a);
    }

    public static float[] b(float[] fArr) {
        return fArr;
    }
}
