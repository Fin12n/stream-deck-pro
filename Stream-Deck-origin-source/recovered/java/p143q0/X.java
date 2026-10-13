package p143q0;

import Q0.f;
import Q0.h;
import p038e1.InterfaceC2247s;
import p128o1.E;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class X {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final E f31546a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public InterfaceC2247s f31547b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public InterfaceC2247s f31548c;

    public X(E e8) {
        this.f31546a = e8;
    }

    public static /* synthetic */ int e(X x8, long j8, boolean z8, int i8, Object obj) {
        if ((i8 & 2) != 0) {
            z8 = true;
        }
        return x8.d(j8, z8);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001e  */
    public final long a(long j8) {
        h hVarA;
        InterfaceC2247s interfaceC2247s = this.f31547b;
        if (interfaceC2247s == null) {
            hVarA = h.f9087e.a();
        } else {
            if (interfaceC2247s.y()) {
                InterfaceC2247s interfaceC2247s2 = this.f31548c;
                hVarA = null;
                if (interfaceC2247s2 != null) {
                    hVarA = InterfaceC2247s.t(interfaceC2247s2, interfaceC2247s, false, 2, null);
                }
            } else {
                hVarA = h.f9087e.a();
            }
            if (hVarA == null) {
                hVarA = h.f9087e.a();
            }
        }
        return Y.b(j8, hVarA);
    }

    public final InterfaceC2247s b() {
        return this.f31548c;
    }

    public final InterfaceC2247s c() {
        return this.f31547b;
    }

    public final int d(long j8, boolean z8) {
        if (z8) {
            j8 = a(j8);
        }
        return this.f31546a.x(j(j8));
    }

    public final E f() {
        return this.f31546a;
    }

    public final boolean g(long j8) {
        long j9 = j(a(j8));
        int iR = this.f31546a.r(f.p(j9));
        return f.o(j9) >= this.f31546a.s(iR) && f.o(j9) <= this.f31546a.t(iR);
    }

    public final void h(InterfaceC2247s interfaceC2247s) {
        this.f31548c = interfaceC2247s;
    }

    public final void i(InterfaceC2247s interfaceC2247s) {
        this.f31547b = interfaceC2247s;
    }

    public final long j(long j8) {
        InterfaceC2247s interfaceC2247s;
        InterfaceC2247s interfaceC2247s2 = this.f31547b;
        if (interfaceC2247s2 == null) {
            return j8;
        }
        if (!interfaceC2247s2.y()) {
            interfaceC2247s2 = null;
        }
        if (interfaceC2247s2 == null || (interfaceC2247s = this.f31548c) == null) {
            return j8;
        }
        InterfaceC2247s interfaceC2247s3 = interfaceC2247s.y() ? interfaceC2247s : null;
        return interfaceC2247s3 == null ? j8 : interfaceC2247s2.o(interfaceC2247s3, j8);
    }

    public final long k(long j8) {
        InterfaceC2247s interfaceC2247s;
        InterfaceC2247s interfaceC2247s2 = this.f31547b;
        if (interfaceC2247s2 == null) {
            return j8;
        }
        if (!interfaceC2247s2.y()) {
            interfaceC2247s2 = null;
        }
        if (interfaceC2247s2 == null || (interfaceC2247s = this.f31548c) == null) {
            return j8;
        }
        InterfaceC2247s interfaceC2247s3 = interfaceC2247s.y() ? interfaceC2247s : null;
        return interfaceC2247s3 == null ? j8 : interfaceC2247s3.o(interfaceC2247s2, j8);
    }
}
