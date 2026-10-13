package p168t1;

import C6.r;
import G6.d;
import G6.g;
import G6.h;
import I6.l;
import Q6.k;
import Q6.o;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1789i;
import p017b7.G;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.K;
import p017b7.L;
import p017b7.S0;

/* JADX INFO: renamed from: t1.u, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C3015u {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final a f34100c = new a(null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int f34101d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final x f34102e = new x();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final G f34103f = new c(G.f15897N);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C3003h f34104a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public J f34105b;

    /* JADX INFO: renamed from: t1.u$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: t1.u$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f34106a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C3002g f34107b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C3002g c3002g, d dVar) {
            super(2, dVar);
            this.f34107b = c3002g;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new b(this.f34107b, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f34106a;
            if (i8 == 0) {
                r.b(obj);
                C3002g c3002g = this.f34107b;
                this.f34106a = 1;
                if (c3002g.o(this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C3015u() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public U a(S s8, H h8, k kVar, k kVar2) {
        if (!(s8.c() instanceof C3014t)) {
            return null;
        }
        C6.o oVarB = v.b(f34102e.a(((C3014t) s8.c()).u(), s8.f(), s8.d()), s8, this.f34104a, h8, kVar2);
        List list = (List) oVarB.a();
        Object objB = oVarB.b();
        if (list == null) {
            return new U.b(objB, false, 2, null);
        }
        C3002g c3002g = new C3002g(list, objB, s8, this.f34104a, kVar, h8);
        AbstractC1789i.d(this.f34105b, null, L.UNDISPATCHED, new b(c3002g, null), 1, null);
        return new U.a(c3002g);
    }

    public C3015u(C3003h c3003h, g gVar) {
        this.f34104a = c3003h;
        this.f34105b = K.a(f34103f.P1(p192w1.k.a()).P1(gVar).P1(S0.a((InterfaceC1815v0) gVar.A(InterfaceC1815v0.f15985O))));
    }

    public /* synthetic */ C3015u(C3003h c3003h, g gVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? new C3003h() : c3003h, (i8 & 2) != 0 ? h.f2820a : gVar);
    }

    /* JADX INFO: renamed from: t1.u$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends G6.a implements G {
        public c(G.a aVar) {
            super(aVar);
        }

        @Override // p017b7.G
        public void R1(g gVar, Throwable th) {
        }
    }
}
