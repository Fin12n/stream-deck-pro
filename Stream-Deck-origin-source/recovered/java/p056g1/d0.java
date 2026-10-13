package p056g1;

import L0.i;
import kotlin.jvm.functions.Function0;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class d0 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(i.c cVar, Function0 function0) {
        e0 e0VarG1 = cVar.G1();
        if (e0VarG1 == null) {
            e0VarG1 = new e0((c0) cVar);
            cVar.Y1(e0VarG1);
        }
        AbstractC2347k.l(cVar).getSnapshotObserver().i(e0VarG1, e0.f23586b.a(), function0);
    }
}
