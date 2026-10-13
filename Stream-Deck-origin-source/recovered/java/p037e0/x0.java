package p037e0;

import A1.j;
import A1.n;
import A1.r;
import C6.o;
import C6.v;
import D6.M;
import Q0.f;
import Q0.g;
import Q0.h;
import Q0.l;
import Q0.m;
import java.util.Map;
import kotlin.jvm.internal.C2635m;
import kotlin.jvm.internal.s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class x0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final h f20361a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f20362b;

    static {
        Float fValueOf = Float.valueOf(0.5f);
        f20361a = new h(0.5f, 0.5f, 0.5f, 0.5f);
        j0 j0VarJ = l0.j(s.f28815a);
        Float fValueOf2 = Float.valueOf(1.0f);
        o oVarA = v.a(j0VarJ, fValueOf2);
        o oVarA2 = v.a(l0.e(r.f455b), fValueOf2);
        o oVarA3 = v.a(l0.d(n.f446b), fValueOf2);
        o oVarA4 = v.a(l0.i(C2635m.f28814a), Float.valueOf(0.01f));
        o oVarA5 = v.a(l0.g(h.f9087e), fValueOf);
        o oVarA6 = v.a(l0.h(l.f9103b), fValueOf);
        o oVarA7 = v.a(l0.f(f.f9082b), fValueOf);
        j0 j0VarB = l0.b(A1.h.f432b);
        Float fValueOf3 = Float.valueOf(0.1f);
        f20362b = M.j(oVarA, oVarA2, oVarA3, oVarA4, oVarA5, oVarA6, oVarA7, v.a(j0VarB, fValueOf3), v.a(l0.c(j.f437b), fValueOf3));
    }

    public static final float a(A1.h.a aVar) {
        return A1.h.m(0.1f);
    }

    public static final int b(s sVar) {
        return 1;
    }

    public static final long c(n.a aVar) {
        return A1.o.a(1, 1);
    }

    public static final long d(r.a aVar) {
        return A1.s.a(1, 1);
    }

    public static final long e(f.a aVar) {
        return g.a(0.5f, 0.5f);
    }

    public static final long f(l.a aVar) {
        return m.a(0.5f, 0.5f);
    }

    public static final h g(h.a aVar) {
        return f20361a;
    }

    public static final Map h() {
        return f20362b;
    }
}
