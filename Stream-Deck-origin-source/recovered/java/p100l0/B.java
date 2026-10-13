package p100l0;

import D6.C0934n;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import kotlin.jvm.internal.AbstractC2633k;
import p109m0.r;
import p109m0.x;
import p215z0.InterfaceC3160j0;
import p215z0.X0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final InterfaceC3160j0 f28892a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC3160j0 f28893b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public boolean f28894c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public Object f28895d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final x f28896e;

    /* JADX WARN: Illegal instructions before constructor call */
    public B() {
        int i8 = 0;
        this(i8, i8, 3, null);
    }

    public final int a() {
        return this.f28892a.f();
    }

    public final x b() {
        return this.f28896e;
    }

    public final int c() {
        return this.f28893b.f();
    }

    public final void d(int i8, int i9) {
        g(i8, i9);
        this.f28895d = null;
    }

    public final void e(int i8) {
        this.f28892a.p(i8);
    }

    public final void f(int i8) {
        this.f28893b.p(i8);
    }

    public final void g(int i8, int i9) {
        if (i8 >= 0.0f) {
            e(i8);
            this.f28896e.o(i8);
            f(i9);
        } else {
            throw new IllegalArgumentException(("Index should be non-negative (" + i8 + ')').toString());
        }
    }

    public final void h(v vVar) {
        w[] wVarArrB;
        w wVar;
        w[] wVarArrB2;
        w wVar2;
        y yVarJ = vVar.j();
        this.f28895d = (yVarJ == null || (wVarArrB2 = yVarJ.b()) == null || (wVar2 = (w) C0934n.O(wVarArrB2)) == null) ? null : wVar2.g();
        if (this.f28894c || vVar.a() > 0) {
            this.f28894c = true;
            int iK = vVar.k();
            if (iK >= 0.0f) {
                y yVarJ2 = vVar.j();
                g((yVarJ2 == null || (wVarArrB = yVarJ2.b()) == null || (wVar = (w) C0934n.O(wVarArrB)) == null) ? 0 : wVar.getIndex(), iK);
            } else {
                throw new IllegalStateException(("scrollOffset should be non-negative (" + iK + ')').toString());
            }
        }
    }

    public final void i(int i8) {
        if (i8 >= 0.0f) {
            f(i8);
            return;
        }
        throw new IllegalStateException(("scrollOffset should be non-negative (" + i8 + ')').toString());
    }

    public final int j(n nVar, int i8) {
        int iA = r.a(nVar, this.f28895d, i8);
        if (i8 != iA) {
            e(iA);
            this.f28896e.o(i8);
        }
        return iA;
    }

    public B(int i8, int i9) {
        this.f28892a = X0.a(i8);
        this.f28893b = X0.a(i9);
        this.f28896e = new x(i8, 90, RCHTTPStatusCodes.SUCCESS);
    }

    public /* synthetic */ B(int i8, int i9, int i10, AbstractC2633k abstractC2633k) {
        this((i10 & 1) != 0 ? 0 : i8, (i10 & 2) != 0 ? 0 : i9);
    }
}
