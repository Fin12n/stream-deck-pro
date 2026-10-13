package p037e0;

import W6.n;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class I implements F {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20007a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20008b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f20009c;

    public I() {
        this(0, 0, null, 7, null);
    }

    @Override // p037e0.F
    public float b(long j8, float f8, float f9, float f10) {
        long jF = f(j8 / 1000000);
        if (jF < 0) {
            return 0.0f;
        }
        if (jF == 0) {
            return f10;
        }
        return (e(jF * 1000000, f8, f9, f10) - e((jF - 1) * 1000000, f8, f9, f10)) * 1000.0f;
    }

    @Override // p037e0.F
    public long c(float f8, float f9, float f10) {
        return ((long) (this.f20008b + this.f20007a)) * 1000000;
    }

    @Override // p037e0.F
    public float e(long j8, float f8, float f9, float f10) {
        long jF = f(j8 / 1000000);
        int i8 = this.f20007a;
        return l0.k(f8, f9, this.f20009c.a(n.j(i8 == 0 ? 1.0f : jF / i8, 0.0f, 1.0f)));
    }

    public final long f(long j8) {
        return n.m(j8 - ((long) this.f20008b), 0L, this.f20007a);
    }

    public I(int i8, int i9, B b8) {
        this.f20007a = i8;
        this.f20008b = i9;
        this.f20009c = b8;
    }

    public /* synthetic */ I(int i8, int i9, B b8, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? RCHTTPStatusCodes.UNSUCCESSFUL : i8, (i10 & 2) != 0 ? 0 : i9, (i10 & 4) != 0 ? D.d() : b8);
    }
}
