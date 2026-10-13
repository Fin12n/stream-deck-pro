package p128o1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: renamed from: o1.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2738c {
    public static final z a(y yVar, x xVar) {
        return new z(yVar, xVar);
    }

    public static final x b(x xVar, x xVar2, float f8) {
        return xVar.c() == xVar2.c() ? xVar : new x(((C2742g) C.d(C2742g.c(xVar.b()), C2742g.c(xVar2.b()), f8)).i(), ((Boolean) C.d(Boolean.valueOf(xVar.c()), Boolean.valueOf(xVar2.c()), f8)).booleanValue(), (AbstractC2633k) null);
    }

    public static final y c(y yVar, y yVar2, float f8) {
        return yVar;
    }
}
