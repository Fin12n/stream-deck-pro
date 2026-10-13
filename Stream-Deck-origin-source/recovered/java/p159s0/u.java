package p159s0;

import C6.j;
import C6.k;
import C6.l;
import kotlin.jvm.functions.Function0;
import p128o1.E;
import p128o1.G;
import p143q0.C;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class u {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2891m f32812a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32813b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f32814c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ z f32815d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ j f32816e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C2891m c2891m, int i8, int i9, z zVar, j jVar) {
            super(0);
            this.f32812a = c2891m;
            this.f32813b = i8;
            this.f32814c = i9;
            this.f32815d = zVar;
            this.f32816e = jVar;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final C2892n.a invoke() {
            return u.k(this.f32812a, u.m(this.f32816e), this.f32813b, this.f32814c, this.f32815d.a(), this.f32815d.h() == EnumC2883e.CROSSED);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends kotlin.jvm.internal.u implements Function0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ C2891m f32817a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f32818b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C2891m c2891m, int i8) {
            super(0);
            this.f32817a = c2891m;
            this.f32818b = i8;
        }

        @Override // kotlin.jvm.functions.Function0
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Integer invoke() {
            return Integer.valueOf(this.f32817a.k().q(this.f32818b));
        }
    }

    public static final C2892n e(z zVar, InterfaceC2881c interfaceC2881c) {
        boolean z8 = zVar.h() == EnumC2883e.CROSSED;
        return new C2892n(f(zVar.i(), z8, true, zVar.j(), interfaceC2881c), f(zVar.g(), z8, false, zVar.f(), interfaceC2881c), z8);
    }

    public static final C2892n.a f(C2891m c2891m, boolean z8, boolean z9, int i8, InterfaceC2881c interfaceC2881c) {
        int iG = z9 ? c2891m.g() : c2891m.e();
        if (i8 != c2891m.i()) {
            return c2891m.a(iG);
        }
        long jA = interfaceC2881c.a(c2891m, iG);
        return c2891m.a(z8 ^ z9 ? G.n(jA) : G.i(jA));
    }

    public static final C2892n.a g(C2892n.a aVar, C2891m c2891m, int i8) {
        return C2892n.a.b(aVar, c2891m.k().c(i8), i8, 0L, 4, null);
    }

    public static final C2892n h(C2892n c2892n, z zVar) {
        if (A.d(c2892n, zVar)) {
            return (zVar.k() > 1 || zVar.c() == null || zVar.b().c().length() == 0) ? c2892n : i(c2892n, zVar);
        }
        return c2892n;
    }

    public static final C2892n i(C2892n c2892n, z zVar) {
        C2891m c2891mB = zVar.b();
        String strC = c2891mB.c();
        int iG = c2891mB.g();
        int length = strC.length();
        if (iG == 0) {
            int iA = C.a(strC, 0);
            return zVar.a() ? C2892n.b(c2892n, g(c2892n.e(), c2891mB, iA), null, true, 2, null) : C2892n.b(c2892n, null, g(c2892n.c(), c2891mB, iA), false, 1, null);
        }
        if (iG == length) {
            int iB = C.b(strC, length);
            return zVar.a() ? C2892n.b(c2892n, g(c2892n.e(), c2891mB, iB), null, false, 2, null) : C2892n.b(c2892n, null, g(c2892n.c(), c2891mB, iB), true, 1, null);
        }
        C2892n c2892nC = zVar.c();
        boolean z8 = c2892nC != null && c2892nC.d();
        int iB2 = zVar.a() ^ z8 ? C.b(strC, iG) : C.a(strC, iG);
        return zVar.a() ? C2892n.b(c2892n, g(c2892n.e(), c2891mB, iB2), null, z8, 2, null) : C2892n.b(c2892n, null, g(c2892n.c(), c2891mB, iB2), z8, 1, null);
    }

    public static final boolean j(C2891m c2891m, int i8, boolean z8) {
        if (c2891m.f() == -1) {
            return true;
        }
        if (i8 == c2891m.f()) {
            return false;
        }
        if (z8 ^ (c2891m.d() == EnumC2883e.CROSSED)) {
            return i8 < c2891m.f();
        }
        return i8 > c2891m.f();
    }

    public static final C2892n.a k(C2891m c2891m, int i8, int i9, int i10, boolean z8, boolean z9) {
        int iU;
        int iP;
        long jC = c2891m.k().C(i9);
        if (c2891m.k().q(G.n(jC)) == i8) {
            iU = G.n(jC);
        } else {
            iU = i8 >= c2891m.k().n() ? c2891m.k().u(c2891m.k().n() - 1) : c2891m.k().u(i8);
        }
        if (c2891m.k().q(G.i(jC)) == i8) {
            iP = G.i(jC);
        } else {
            iP = i8 >= c2891m.k().n() ? E.p(c2891m.k(), c2891m.k().n() - 1, false, 2, null) : E.p(c2891m.k(), i8, false, 2, null);
        }
        if (iU == i10) {
            return c2891m.a(iP);
        }
        if (iP == i10) {
            return c2891m.a(iU);
        }
        if (!(z8 ^ z9) ? i9 >= iU : i9 > iP) {
            iU = iP;
        }
        return c2891m.a(iU);
    }

    public static final C2892n.a l(z zVar, C2891m c2891m, C2892n.a aVar) {
        int iG = zVar.a() ? c2891m.g() : c2891m.e();
        if ((zVar.a() ? zVar.j() : zVar.f()) != c2891m.i()) {
            return c2891m.a(iG);
        }
        l lVar = l.NONE;
        j jVarA = k.a(lVar, new b(c2891m, iG));
        j jVarA2 = k.a(lVar, new a(c2891m, iG, zVar.a() ? c2891m.e() : c2891m.g(), zVar, jVarA));
        if (c2891m.h() != aVar.d()) {
            return n(jVarA2);
        }
        int iF = c2891m.f();
        if (iG == iF) {
            return aVar;
        }
        if (m(jVarA) != c2891m.k().q(iF)) {
            return n(jVarA2);
        }
        int iC = aVar.c();
        long jC = c2891m.k().C(iC);
        if (j(c2891m, iG, zVar.a())) {
            return (iC == G.n(jC) || iC == G.i(jC)) ? n(jVarA2) : c2891m.a(iG);
        }
        return c2891m.a(iG);
    }

    public static final int m(j jVar) {
        return ((Number) jVar.getValue()).intValue();
    }

    public static final C2892n.a n(j jVar) {
        return (C2892n.a) jVar.getValue();
    }
}
