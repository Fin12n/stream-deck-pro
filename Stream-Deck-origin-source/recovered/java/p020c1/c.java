package p020c1;

import C6.m;
import D6.C0933m;
import W6.n;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f16034a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f16035b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f16036c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p020c1.a[] f16037d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f16038e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final float[] f16039f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float[] f16040g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float[] f16041h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum a {
        Lsq2,
        Impulse
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f16045a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                iArr[a.Impulse.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[a.Lsq2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f16045a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public final void a(long j8, float f8) {
        int i8 = (this.f16038e + 1) % 20;
        this.f16038e = i8;
        e.j(this.f16037d, i8, j8, f8);
    }

    public final float b(float[] fArr, float[] fArr2, int i8) {
        try {
            return e.i(fArr2, fArr, i8, 2, this.f16041h)[1];
        } catch (IllegalArgumentException unused) {
            return 0.0f;
        }
    }

    public final float c() {
        float f8;
        float[] fArr = this.f16039f;
        float[] fArr2 = this.f16040g;
        int i8 = this.f16038e;
        p020c1.a aVar = this.f16037d[i8];
        if (aVar == null) {
            return 0.0f;
        }
        int i9 = 0;
        p020c1.a aVar2 = aVar;
        while (true) {
            p020c1.a aVar3 = this.f16037d[i8];
            if (aVar3 == null) {
                break;
            }
            float fB = aVar.b() - aVar3.b();
            float fAbs = Math.abs(aVar3.b() - aVar2.b());
            if (fB > 100.0f || fAbs > 40.0f) {
                break;
            }
            fArr[i9] = aVar3.a();
            fArr2[i9] = -fB;
            if (i8 == 0) {
                i8 = 20;
            }
            i8--;
            i9++;
            if (i9 >= 20) {
                break;
            }
            aVar2 = aVar3;
        }
        if (i9 < this.f16036c) {
            return 0.0f;
        }
        int i10 = b.f16045a[this.f16035b.ordinal()];
        if (i10 == 1) {
            f8 = e.f(fArr, fArr2, i9, this.f16034a);
        } else {
            if (i10 != 2) {
                throw new m();
            }
            f8 = b(fArr, fArr2, i9);
        }
        return f8 * 1000;
    }

    public final float d(float f8) {
        if (f8 > 0.0f) {
            float fC = c();
            if (fC == 0.0f) {
                return 0.0f;
            }
            return fC > 0.0f ? n.f(fC, f8) : n.c(fC, -f8);
        }
        throw new IllegalStateException(("maximumVelocity should be a positive value. You specified=" + f8).toString());
    }

    public final void e() {
        C0933m.w(this.f16037d, null, 0, 0, 6, null);
        this.f16038e = 0;
    }

    public c(boolean z8, a aVar) {
        this.f16034a = z8;
        this.f16035b = aVar;
        if (z8 && aVar.equals(a.Lsq2)) {
            throw new IllegalStateException("Lsq2 not (yet) supported for differential axes");
        }
        int i8 = b.f16045a[aVar.ordinal()];
        int i9 = 2;
        if (i8 != 1) {
            if (i8 != 2) {
                throw new m();
            }
            i9 = 3;
        }
        this.f16036c = i9;
        this.f16037d = new p020c1.a[20];
        this.f16039f = new float[20];
        this.f16040g = new float[20];
        this.f16041h = new float[3];
    }

    public /* synthetic */ c(boolean z8, a aVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? a.Lsq2 : aVar);
    }

    public c(boolean z8) {
        this(z8, a.Impulse);
    }
}
