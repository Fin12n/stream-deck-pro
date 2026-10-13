package p037e0;

import C6.InterfaceC0916e;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t0 implements m0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p0 f20332a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f20333b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20334c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f20335d;

    public /* synthetic */ t0(p0 p0Var, W w8, long j8, AbstractC2633k abstractC2633k) {
        this(p0Var, w8, j8);
    }

    @Override // p037e0.m0
    public boolean a() {
        return true;
    }

    @Override // p037e0.m0
    public long b(AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        return Long.MAX_VALUE;
    }

    @Override // p037e0.m0
    public AbstractC2221q c(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        return this.f20332a.c(h(j8), abstractC2221q, abstractC2221q2, i(j8, abstractC2221q, abstractC2221q3, abstractC2221q2));
    }

    @Override // p037e0.m0
    public AbstractC2221q g(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        return this.f20332a.g(h(j8), abstractC2221q, abstractC2221q2, i(j8, abstractC2221q, abstractC2221q3, abstractC2221q2));
    }

    public final long h(long j8) {
        long j9 = this.f20335d;
        if (j8 + j9 <= 0) {
            return 0L;
        }
        long j10 = j8 + j9;
        long j11 = this.f20334c;
        long j12 = j10 / j11;
        return (this.f20333b == W.Restart || j12 % ((long) 2) == 0) ? j10 - (j12 * j11) : ((j12 + 1) * j11) - j10;
    }

    public final AbstractC2221q i(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        long j9 = this.f20335d;
        long j10 = j8 + j9;
        long j11 = this.f20334c;
        return j10 > j11 ? this.f20332a.g(j11 - j9, abstractC2221q, abstractC2221q3, abstractC2221q2) : abstractC2221q2;
    }

    public t0(p0 p0Var, W w8, long j8) {
        this.f20332a = p0Var;
        this.f20333b = w8;
        this.f20334c = ((long) (p0Var.e() + p0Var.f())) * 1000000;
        this.f20335d = j8 * 1000000;
    }

    public /* synthetic */ t0(p0 p0Var, W w8, long j8, int i8, AbstractC2633k abstractC2633k) {
        this(p0Var, (i8 & 2) != 0 ? W.Restart : w8, (i8 & 4) != 0 ? b0.c(0, 0, 2, null) : j8, (AbstractC2633k) null);
    }

    public /* synthetic */ t0(p0 p0Var, W w8, int i8, AbstractC2633k abstractC2633k) {
        this(p0Var, (i8 & 2) != 0 ? W.Restart : w8);
    }

    @InterfaceC0916e
    public /* synthetic */ t0(p0 p0Var, W w8) {
        this(p0Var, w8, b0.c(0, 0, 2, null), (AbstractC2633k) null);
    }
}
