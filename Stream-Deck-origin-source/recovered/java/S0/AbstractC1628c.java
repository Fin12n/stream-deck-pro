package S0;

import R0.AbstractC1602n0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: S0.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC1628c {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f9611d = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9612a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f9613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f9614c;

    /* JADX INFO: renamed from: S0.c$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    public /* synthetic */ AbstractC1628c(String str, long j8, int i8, AbstractC2633k abstractC2633k) {
        this(str, j8, i8);
    }

    public final float[] a(float f8, float f9, float f10) {
        float[] fArr = new float[AbstractC1627b.f(this.f9613b)];
        fArr[0] = f8;
        fArr[1] = f9;
        fArr[2] = f10;
        return b(fArr);
    }

    public abstract float[] b(float[] fArr);

    public final int c() {
        return AbstractC1627b.f(this.f9613b);
    }

    public final int d() {
        return this.f9614c;
    }

    public abstract float e(int i8);

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AbstractC1628c abstractC1628c = (AbstractC1628c) obj;
        if (this.f9614c == abstractC1628c.f9614c && kotlin.jvm.internal.t.c(this.f9612a, abstractC1628c.f9612a)) {
            return AbstractC1627b.e(this.f9613b, abstractC1628c.f9613b);
        }
        return false;
    }

    public abstract float f(int i8);

    public final long g() {
        return this.f9613b;
    }

    public final String h() {
        return this.f9612a;
    }

    public int hashCode() {
        return (((this.f9612a.hashCode() * 31) + AbstractC1627b.g(this.f9613b)) * 31) + this.f9614c;
    }

    public boolean i() {
        return false;
    }

    public long j(float f8, float f9, float f10) {
        float[] fArrK = k(f8, f9, f10);
        float f11 = fArrK[0];
        float f12 = fArrK[1];
        return (((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f12)) & 4294967295L);
    }

    public final float[] k(float f8, float f9, float f10) {
        return l(new float[]{f8, f9, f10});
    }

    public abstract float[] l(float[] fArr);

    public float m(float f8, float f9, float f10) {
        return k(f8, f9, f10)[2];
    }

    public long n(float f8, float f9, float f10, float f11, AbstractC1628c abstractC1628c) {
        float[] fArrA = a(f8, f9, f10);
        return AbstractC1602n0.a(fArrA[0], fArrA[1], fArrA[2], f11, abstractC1628c);
    }

    public String toString() {
        return this.f9612a + " (id=" + this.f9614c + ", model=" + ((Object) AbstractC1627b.h(this.f9613b)) + ')';
    }

    public /* synthetic */ AbstractC1628c(String str, long j8, AbstractC2633k abstractC2633k) {
        this(str, j8);
    }

    public AbstractC1628c(String str, long j8, int i8) {
        this.f9612a = str;
        this.f9613b = j8;
        this.f9614c = i8;
        if (str.length() == 0) {
            throw new IllegalArgumentException("The name of a color space cannot be null and must contain at least 1 character");
        }
        if (i8 < -1 || i8 > 63) {
            throw new IllegalArgumentException("The id must be between -1 and 63");
        }
    }

    public AbstractC1628c(String str, long j8) {
        this(str, j8, -1, null);
    }
}
