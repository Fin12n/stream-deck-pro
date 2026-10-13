package p037e0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class w0 implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20357a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20358b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f20359c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final r0 f20360d;

    public w0() {
        this(0, 0, null, 7, null);
    }

    @Override // p037e0.m0
    public AbstractC2221q c(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        return this.f20360d.c(j8, abstractC2221q, abstractC2221q2, abstractC2221q3);
    }

    @Override // p037e0.p0
    public int e() {
        return this.f20358b;
    }

    @Override // p037e0.p0
    public int f() {
        return this.f20357a;
    }

    @Override // p037e0.m0
    public AbstractC2221q g(long j8, AbstractC2221q abstractC2221q, AbstractC2221q abstractC2221q2, AbstractC2221q abstractC2221q3) {
        return this.f20360d.g(j8, abstractC2221q, abstractC2221q2, abstractC2221q3);
    }

    public w0(int i8, int i9, B b8) {
        this.f20357a = i8;
        this.f20358b = i9;
        this.f20359c = b8;
        this.f20360d = new r0(new I(f(), e(), b8));
    }

    public /* synthetic */ w0(int i8, int i9, B b8, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? RCHTTPStatusCodes.UNSUCCESSFUL : i8, (i10 & 2) != 0 ? 0 : i9, (i10 & 4) != 0 ? D.d() : b8);
    }
}
