package p037e0;

import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i0 implements A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f20266a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final int f20267b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final B f20268c;

    public i0() {
        this(0, 0, null, 7, null);
    }

    public boolean equals(Object obj) {
        if (obj instanceof i0) {
            i0 i0Var = (i0) obj;
            if (i0Var.f20266a == this.f20266a && i0Var.f20267b == this.f20267b && t.c(i0Var.f20268c, this.f20268c)) {
                return true;
            }
        }
        return false;
    }

    @Override // p037e0.A, p037e0.InterfaceC2213i
    /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
    public w0 a(j0 j0Var) {
        return new w0(this.f20266a, this.f20267b, this.f20268c);
    }

    public int hashCode() {
        return (((this.f20266a * 31) + this.f20268c.hashCode()) * 31) + this.f20267b;
    }

    public i0(int i8, int i9, B b8) {
        this.f20266a = i8;
        this.f20267b = i9;
        this.f20268c = b8;
    }

    public /* synthetic */ i0(int i8, int i9, B b8, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? RCHTTPStatusCodes.UNSUCCESSFUL : i8, (i10 & 2) != 0 ? 0 : i9, (i10 & 4) != 0 ? D.d() : b8);
    }
}
