package p213y6;

import kotlin.jvm.internal.t;
import p205x6.j;
import p205x6.k;
import p205x6.n;
import p205x6.s;
import p205x6.w;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final byte[] f38455a = new byte[0];

    public static final void a(n nVar, a current) {
        t.g(nVar, "<this>");
        t.g(current, "current");
        if (current == nVar) {
            return;
        }
        if (current.k() <= current.i()) {
            nVar.r0(current);
        } else if (current.f() - current.g() < 8) {
            nVar.L0(current);
        } else {
            nVar.c2(current.i());
        }
    }

    public static final a b(n nVar, int i8) {
        t.g(nVar, "<this>");
        return nVar.K1(i8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final a c(n nVar, a current) {
        t.g(nVar, "<this>");
        t.g(current, "current");
        if (current != nVar) {
            return nVar.A0(current);
        }
        if (nVar.t()) {
            return (a) nVar;
        }
        return null;
    }

    public static final a d(s sVar, int i8, a aVar) {
        t.g(sVar, "<this>");
        if (aVar != null) {
            sVar.c();
        }
        return sVar.Q0(i8);
    }

    public static final int e(k kVar, j builder) {
        t.g(kVar, "<this>");
        t.g(builder, "builder");
        int iP1 = builder.P1();
        a aVarA1 = builder.a1();
        if (aVarA1 == null) {
            return 0;
        }
        if (iP1 <= w.a() && aVarA1.C() == null && kVar.h2(aVarA1)) {
            builder.b();
            return iP1;
        }
        kVar.c(aVarA1);
        return iP1;
    }
}
