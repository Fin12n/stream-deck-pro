package p046f0;

import A1.y;
import C6.G;
import G6.d;
import H6.c;
import L0.i;
import Q0.f;
import Q6.k;
import Q6.o;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class O implements S {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final O f21336a = new O();

    @Override // p046f0.S
    public i a() {
        return i.f4836a;
    }

    @Override // p046f0.S
    public boolean b() {
        return false;
    }

    @Override // p046f0.S
    public long c(long j8, int i8, k kVar) {
        return ((f) kVar.invoke(f.d(j8))).x();
    }

    @Override // p046f0.S
    public Object d(long j8, o oVar, d dVar) {
        Object objInvoke = oVar.invoke(y.b(j8), dVar);
        return objInvoke == c.f() ? objInvoke : G.f1419a;
    }
}
