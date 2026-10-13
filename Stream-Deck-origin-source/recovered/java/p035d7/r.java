package p035d7;

import C6.C0918g;
import C6.G;
import G6.d;
import Q6.k;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.K;
import p062g7.P;
import p062g7.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public class r extends e {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final int f19952m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final d f19953n;

    public /* synthetic */ r(int i8, d dVar, k kVar, int i9, AbstractC2633k abstractC2633k) {
        this(i8, dVar, (i9 & 4) != 0 ? null : kVar);
    }

    public static /* synthetic */ Object e1(r rVar, Object obj, d dVar) throws Throwable {
        P pD;
        Object objG1 = rVar.g1(obj, true);
        if (!(objG1 instanceof k.a)) {
            return G.f1419a;
        }
        k.e(objG1);
        k kVar = rVar.f19895b;
        if (kVar == null || (pD = y.d(kVar, obj, null, 2, null)) == null) {
            throw rVar.a0();
        }
        C0918g.a(pD, rVar.a0());
        throw pD;
    }

    public final Object f1(Object obj, boolean z8) {
        k kVar;
        P pD;
        Object objM = super.m(obj);
        if (k.i(objM) || k.h(objM)) {
            return objM;
        }
        if (!z8 || (kVar = this.f19895b) == null || (pD = y.d(kVar, obj, null, 2, null)) == null) {
            return k.f19942b.c(G.f1419a);
        }
        throw pD;
    }

    public final Object g1(Object obj, boolean z8) {
        return this.f19953n == d.DROP_LATEST ? f1(obj, z8) : U0(obj);
    }

    @Override // p035d7.e, p035d7.y
    public Object i(Object obj, d dVar) {
        return e1(this, obj, dVar);
    }

    @Override // p035d7.e, p035d7.y
    public Object m(Object obj) {
        return g1(obj, false);
    }

    @Override // p035d7.e
    public boolean o0() {
        return this.f19953n == d.DROP_OLDEST;
    }

    public r(int i8, d dVar, k kVar) {
        super(i8, kVar);
        this.f19952m = i8;
        this.f19953n = dVar;
        if (dVar == d.SUSPEND) {
            throw new IllegalArgumentException(("This implementation does not support suspension for senders, use " + K.b(e.class).d() + " instead").toString());
        }
        if (i8 >= 1) {
            return;
        }
        throw new IllegalArgumentException(("Buffered channel capacity must be at least 1, but " + i8 + " was specified").toString());
    }
}
