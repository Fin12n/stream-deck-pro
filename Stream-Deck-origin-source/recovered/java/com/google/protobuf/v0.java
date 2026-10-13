package com.google.protobuf;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class v0 {
    public abstract void a(Object obj, int i8, int i9);

    public abstract void b(Object obj, int i8, long j8);

    public abstract void c(Object obj, int i8, Object obj2);

    public abstract void d(Object obj, int i8, AbstractC2097h abstractC2097h);

    public abstract void e(Object obj, int i8, long j8);

    public abstract Object f(Object obj);

    public abstract Object g(Object obj);

    public abstract int h(Object obj);

    public abstract int i(Object obj);

    public abstract void j(Object obj);

    public abstract Object k(Object obj, Object obj2);

    public final void l(Object obj, m0 m0Var) {
        while (m0Var.B() != Integer.MAX_VALUE && m(obj, m0Var)) {
        }
    }

    public final boolean m(Object obj, m0 m0Var) throws B {
        int iU = m0Var.u();
        int iA = C0.a(iU);
        int iB = C0.b(iU);
        if (iB == 0) {
            e(obj, iA, m0Var.N());
            return true;
        }
        if (iB == 1) {
            b(obj, iA, m0Var.c());
            return true;
        }
        if (iB == 2) {
            d(obj, iA, m0Var.G());
            return true;
        }
        if (iB != 3) {
            if (iB == 4) {
                return false;
            }
            if (iB != 5) {
                throw B.e();
            }
            a(obj, iA, m0Var.j());
            return true;
        }
        Object objN = n();
        int iC = C0.c(iA, 4);
        l(objN, m0Var);
        if (iC != m0Var.u()) {
            throw B.b();
        }
        c(obj, iA, r(objN));
        return true;
    }

    public abstract Object n();

    public abstract void o(Object obj, Object obj2);

    public abstract void p(Object obj, Object obj2);

    public abstract boolean q(m0 m0Var);

    public abstract Object r(Object obj);

    public abstract void s(Object obj, D0 d8);

    public abstract void t(Object obj, D0 d8);
}
