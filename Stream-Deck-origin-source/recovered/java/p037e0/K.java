package p037e0;

import C6.InterfaceC0916e;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class K implements InterfaceC2213i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f20010d = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final A f20011a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final W f20012b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final long f20013c;

    public /* synthetic */ K(A a8, W w8, long j8, AbstractC2633k abstractC2633k) {
        this(a8, w8, j8);
    }

    @Override // p037e0.InterfaceC2213i
    public m0 a(j0 j0Var) {
        return new t0(this.f20011a.a(j0Var), this.f20012b, this.f20013c, (AbstractC2633k) null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof K) {
            K k8 = (K) obj;
            if (t.c(k8.f20011a, this.f20011a) && k8.f20012b == this.f20012b && b0.d(k8.f20013c, this.f20013c)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f20011a.hashCode() * 31) + this.f20012b.hashCode()) * 31) + b0.e(this.f20013c);
    }

    public K(A a8, W w8, long j8) {
        this.f20011a = a8;
        this.f20012b = w8;
        this.f20013c = j8;
    }

    public /* synthetic */ K(A a8, W w8, long j8, int i8, AbstractC2633k abstractC2633k) {
        this(a8, (i8 & 2) != 0 ? W.Restart : w8, (i8 & 4) != 0 ? b0.c(0, 0, 2, null) : j8, (AbstractC2633k) null);
    }

    public /* synthetic */ K(A a8, W w8, int i8, AbstractC2633k abstractC2633k) {
        this(a8, (i8 & 2) != 0 ? W.Restart : w8);
    }

    @InterfaceC0916e
    public /* synthetic */ K(A a8, W w8) {
        this(a8, w8, b0.c(0, 0, 2, null), (AbstractC2633k) null);
    }
}
