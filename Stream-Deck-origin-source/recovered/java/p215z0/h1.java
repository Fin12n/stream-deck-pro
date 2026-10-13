package p215z0;

import B0.d;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class h1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final m1 f38768a = new m1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m1 f38769b = new m1();

    public static final d b() {
        m1 m1Var = f38769b;
        d dVar = (d) m1Var.a();
        if (dVar != null) {
            return dVar;
        }
        d dVar2 = new d(new F[0], 0);
        m1Var.b(dVar2);
        return dVar2;
    }

    public static final q1 c(Function0 function0) {
        return new D(function0, null);
    }

    public static final q1 d(f1 f1Var, Function0 function0) {
        return new D(function0, f1Var);
    }
}
