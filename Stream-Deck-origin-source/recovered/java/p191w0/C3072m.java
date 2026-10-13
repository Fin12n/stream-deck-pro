package p191w0;

import R0.C1598l0;
import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: w0.m, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3072m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final long f36221a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final long f36222b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f36223c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final long f36224d;

    public /* synthetic */ C3072m(long j8, long j9, long j10, long j11, AbstractC2633k abstractC2633k) {
        this(j8, j9, j10, j11);
    }

    public final long a(boolean z8) {
        return z8 ? this.f36221a : this.f36223c;
    }

    public final long b(boolean z8) {
        return z8 ? this.f36222b : this.f36224d;
    }

    public final C3072m c(long j8, long j9, long j10, long j11) {
        C1598l0.a aVar = C1598l0.f9405b;
        if (j8 == aVar.e()) {
            j8 = this.f36221a;
        }
        return new C3072m(j8, j9 != aVar.e() ? j9 : this.f36222b, j10 != aVar.e() ? j10 : this.f36223c, j11 != aVar.e() ? j11 : this.f36224d, null);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof C3072m)) {
            return false;
        }
        C3072m c3072m = (C3072m) obj;
        return C1598l0.q(this.f36221a, c3072m.f36221a) && C1598l0.q(this.f36222b, c3072m.f36222b) && C1598l0.q(this.f36223c, c3072m.f36223c) && C1598l0.q(this.f36224d, c3072m.f36224d);
    }

    public int hashCode() {
        return (((((C1598l0.w(this.f36221a) * 31) + C1598l0.w(this.f36222b)) * 31) + C1598l0.w(this.f36223c)) * 31) + C1598l0.w(this.f36224d);
    }

    public C3072m(long j8, long j9, long j10, long j11) {
        this.f36221a = j8;
        this.f36222b = j9;
        this.f36223c = j10;
        this.f36224d = j11;
    }
}
