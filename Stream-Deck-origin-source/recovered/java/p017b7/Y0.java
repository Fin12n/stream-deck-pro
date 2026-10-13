package p017b7;

import G6.g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y0 extends F {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Y0 f15931c = new Y0();

    @Override // p017b7.F
    public void L0(g gVar, Runnable runnable) {
        c1 c1Var = (c1) gVar.A(c1.f15942c);
        if (c1Var == null) {
            throw new UnsupportedOperationException("Dispatchers.Unconfined.dispatch function can only be used by the yield function. If you wrap Unconfined dispatcher in your code, make sure you properly delegate isDispatchNeeded and dispatch calls.");
        }
        c1Var.f15943b = true;
    }

    @Override // p017b7.F
    public boolean g1(g gVar) {
        return false;
    }

    @Override // p017b7.F
    public F k1(int i8) {
        throw new UnsupportedOperationException("limitedParallelism is not supported for Dispatchers.Unconfined");
    }

    @Override // p017b7.F
    public String toString() {
        return "Dispatchers.Unconfined";
    }
}
