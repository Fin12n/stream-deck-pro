package B1;

import C6.G;
import p010b0.D;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f907a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float[] f908b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static volatile D f909c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Object[] f910d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f911e;

    static {
        b bVar = new b();
        f907a = bVar;
        f908b = new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f};
        f909c = new D(0, 1, null);
        Object[] objArr = new Object[0];
        f910d = objArr;
        synchronized (objArr) {
            bVar.h(f909c, 1.15f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{9.2f, 11.5f, 13.8f, 16.4f, 19.8f, 21.8f, 25.2f, 30.0f, 100.0f}));
            bVar.h(f909c, 1.3f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{10.4f, 13.0f, 15.6f, 18.8f, 21.6f, 23.6f, 26.4f, 30.0f, 100.0f}));
            bVar.h(f909c, 1.5f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{12.0f, 15.0f, 18.0f, 22.0f, 24.0f, 26.0f, 28.0f, 30.0f, 100.0f}));
            bVar.h(f909c, 1.8f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{14.4f, 18.0f, 21.6f, 24.4f, 27.6f, 30.8f, 32.8f, 34.8f, 100.0f}));
            bVar.h(f909c, 2.0f, new c(new float[]{8.0f, 10.0f, 12.0f, 14.0f, 18.0f, 20.0f, 24.0f, 30.0f, 100.0f}, new float[]{16.0f, 20.0f, 24.0f, 26.0f, 30.0f, 34.0f, 36.0f, 38.0f, 100.0f}));
            G g8 = G.f1419a;
        }
        if (bVar.e(f909c.h(0)) - 0.01f <= 1.03f) {
            throw new IllegalStateException("You should only apply non-linear scaling to font scales > 1");
        }
        f911e = 8;
    }

    public final a a(a aVar, a aVar2, float f8) {
        float[] fArr = f908b;
        float[] fArr2 = new float[fArr.length];
        int length = fArr.length;
        for (int i8 = 0; i8 < length; i8++) {
            float f9 = f908b[i8];
            fArr2[i8] = d.f916a.b(aVar.b(f9), aVar2.b(f9), f8);
        }
        return new c(f908b, fArr2);
    }

    public final a b(float f8) {
        a cVar;
        if (!f(f8)) {
            return null;
        }
        a aVarC = f907a.c(f8);
        if (aVarC != null) {
            return aVarC;
        }
        int iG = f909c.g(d(f8));
        if (iG >= 0) {
            return (a) f909c.l(iG);
        }
        int i8 = -(iG + 1);
        int i9 = i8 - 1;
        float fE = 1.0f;
        if (i8 >= f909c.k()) {
            c cVar2 = new c(new float[]{1.0f}, new float[]{f8});
            g(f8, cVar2);
            return cVar2;
        }
        if (i9 < 0) {
            float[] fArr = f908b;
            cVar = new c(fArr, fArr);
        } else {
            fE = e(f909c.h(i9));
            cVar = (a) f909c.l(i9);
        }
        a aVarA = a(cVar, (a) f909c.l(i8), d.f916a.a(0.0f, 1.0f, fE, e(f909c.h(i8)), f8));
        g(f8, aVarA);
        return aVarA;
    }

    public final a c(float f8) {
        return (a) f909c.f(d(f8));
    }

    public final int d(float f8) {
        return (int) (f8 * 100.0f);
    }

    public final float e(int i8) {
        return i8 / 100.0f;
    }

    public final boolean f(float f8) {
        return f8 >= 1.03f;
    }

    public final void g(float f8, a aVar) {
        synchronized (f910d) {
            D dClone = f909c.clone();
            f907a.h(dClone, f8, aVar);
            f909c = dClone;
            G g8 = G.f1419a;
        }
    }

    public final void h(D d8, float f8, a aVar) {
        d8.i(d(f8), aVar);
    }
}
