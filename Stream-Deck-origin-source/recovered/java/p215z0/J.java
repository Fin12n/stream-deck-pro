package p215z0;

import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class J extends B0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f1 f38624b;

    public J(f1 f1Var, Function0 function0) {
        super(function0);
        this.f38624b = f1Var;
    }

    @Override // p215z0.AbstractC3180u
    public q1 b(Object obj, q1 q1Var) {
        if (q1Var == null || !(q1Var instanceof InterfaceC3164l0)) {
            return g1.i(obj, this.f38624b);
        }
        ((InterfaceC3164l0) q1Var).setValue(obj);
        return q1Var;
    }
}
