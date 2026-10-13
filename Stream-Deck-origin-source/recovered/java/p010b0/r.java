package p010b0;

import D6.C0933m;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r extends i {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public int f15635e;

    public r() {
        this(0, 1, null);
    }

    public final void e() {
        this.f15635e = z.a(b()) - this.f15610d;
    }

    public final void f(int i8) {
        long[] jArr;
        if (i8 == 0) {
            jArr = z.f15651a;
        } else {
            long[] jArr2 = new long[((i8 + 15) & (-8)) >> 3];
            C0933m.v(jArr2, -9187201950435737472L, 0, 0, 6, null);
            jArr = jArr2;
        }
        this.f15607a = jArr;
        int i9 = i8 >> 3;
        long j8 = 255 << ((i8 & 7) << 3);
        jArr[i9] = (jArr[i9] & (~j8)) | j8;
        e();
    }

    public final void g(int i8) {
        int iMax = i8 > 0 ? Math.max(7, z.d(i8)) : 0;
        this.f15609c = iMax;
        f(iMax);
        this.f15608b = new int[iMax];
    }

    public /* synthetic */ r(int i8, int i9, AbstractC2633k abstractC2633k) {
        this((i9 & 1) != 0 ? 6 : i8);
    }

    public r(int i8) {
        super(null);
        if (i8 >= 0) {
            g(z.e(i8));
            return;
        }
        throw new IllegalArgumentException("Capacity must be a positive value.");
    }
}
