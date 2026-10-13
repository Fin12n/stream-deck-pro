package p215z0;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r1 extends B0 {
    public r1(Function0 function0) {
        super(function0);
    }

    @Override // p215z0.AbstractC3180u
    public q1 b(Object obj, q1 q1Var) {
        return (q1Var == null || !t.c(q1Var.getValue(), obj)) ? new s1(obj) : q1Var;
    }
}
