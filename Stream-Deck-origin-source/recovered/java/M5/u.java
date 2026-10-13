package M5;

import C6.G;
import X5.P;
import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1823z0;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.U;
import p115m6.C2691a;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final b f5752d = new b(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2691a f5753e = new C2691a("TimeoutPlugin");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Long f5754a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Long f5755b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Long f5756c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public static final C0210a f5757d = new C0210a(null);

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public static final C2691a f5758e = new C2691a("TimeoutConfiguration");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Long f5759a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Long f5760b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Long f5761c;

        /* JADX INFO: renamed from: M5.u$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0210a {
            public /* synthetic */ C0210a(AbstractC2633k abstractC2633k) {
                this();
            }

            public C0210a() {
            }
        }

        public /* synthetic */ a(Long l8, Long l9, Long l10, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? null : l8, (i8 & 2) != 0 ? null : l9, (i8 & 4) != 0 ? null : l10);
        }

        public final u a() {
            return new u(d(), c(), e(), null);
        }

        public final Long b(Long l8) {
            if (l8 == null || l8.longValue() > 0) {
                return l8;
            }
            throw new IllegalArgumentException("Only positive timeout values are allowed, for infinite timeout use HttpTimeout.INFINITE_TIMEOUT_MS");
        }

        public final Long c() {
            return this.f5760b;
        }

        public final Long d() {
            return this.f5759a;
        }

        public final Long e() {
            return this.f5761c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || a.class != obj.getClass()) {
                return false;
            }
            a aVar = (a) obj;
            return kotlin.jvm.internal.t.c(this.f5759a, aVar.f5759a) && kotlin.jvm.internal.t.c(this.f5760b, aVar.f5760b) && kotlin.jvm.internal.t.c(this.f5761c, aVar.f5761c);
        }

        public final void f(Long l8) {
            this.f5760b = b(l8);
        }

        public final void g(Long l8) {
            this.f5759a = b(l8);
        }

        public final void h(Long l8) {
            this.f5761c = b(l8);
        }

        public int hashCode() {
            Long l8 = this.f5759a;
            int iHashCode = (l8 != null ? l8.hashCode() : 0) * 31;
            Long l9 = this.f5760b;
            int iHashCode2 = (iHashCode + (l9 != null ? l9.hashCode() : 0)) * 31;
            Long l10 = this.f5761c;
            return iHashCode2 + (l10 != null ? l10.hashCode() : 0);
        }

        public a(Long l8, Long l9, Long l10) {
            this.f5759a = 0L;
            this.f5760b = 0L;
            this.f5761c = 0L;
            g(l8);
            f(l9);
            h(l10);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements k, J5.e {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5762a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5763b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f5764c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ u f5765d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ G5.a f5766e;

            /* JADX INFO: renamed from: M5.u$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0211a extends kotlin.jvm.internal.u implements Q6.k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1815v0 f5767a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0211a(InterfaceC1815v0 interfaceC1815v0) {
                    super(1);
                    this.f5767a = interfaceC1815v0;
                }

                public final void b(Throwable th) {
                    InterfaceC1815v0.a.a(this.f5767a, null, 1, null);
                }

                @Override // Q6.k
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    b((Throwable) obj);
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(u uVar, G5.a aVar, G6.d dVar) {
                super(3, dVar);
                this.f5765d = uVar;
                this.f5766e = aVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A a8, T5.d dVar, G6.d dVar2) {
                a aVar = new a(this.f5765d, this.f5766e, dVar2);
                aVar.f5763b = a8;
                aVar.f5764c = dVar;
                return aVar.invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f5762a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        C6.r.b(obj);
                        return obj;
                    }
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                    return obj;
                }
                C6.r.b(obj);
                A a8 = (A) this.f5763b;
                T5.d dVar = (T5.d) this.f5764c;
                if (P.b(dVar.i().o()) || (dVar.d() instanceof T5.a)) {
                    this.f5763b = null;
                    this.f5762a = 1;
                    Object objA = a8.a(dVar, this);
                    if (objA != objF) {
                        return objA;
                    }
                } else {
                    b bVar = u.f5752d;
                    a aVar = (a) dVar.f(bVar);
                    if (aVar == null && this.f5765d.f()) {
                        a aVar2 = new a(null, null, null, 7, null);
                        dVar.l(bVar, aVar2);
                        aVar = aVar2;
                    }
                    if (aVar != null) {
                        u uVar = this.f5765d;
                        G5.a aVar3 = this.f5766e;
                        Long lC = aVar.c();
                        if (lC == null) {
                            lC = uVar.f5755b;
                        }
                        aVar.f(lC);
                        Long lE = aVar.e();
                        if (lE == null) {
                            lE = uVar.f5756c;
                        }
                        aVar.h(lE);
                        Long lD = aVar.d();
                        if (lD == null) {
                            lD = uVar.f5754a;
                        }
                        aVar.g(lD);
                        Long lD2 = aVar.d();
                        if (lD2 == null) {
                            lD2 = uVar.f5754a;
                        }
                        if (lD2 != null && lD2.longValue() != Long.MAX_VALUE) {
                            dVar.g().H0(new C0211a(AbstractC1789i.d(aVar3, null, null, new C0212b(lD2, dVar, dVar.g(), null), 3, null)));
                        }
                    }
                    this.f5763b = null;
                    this.f5762a = 2;
                    Object objA2 = a8.a(dVar, this);
                    if (objA2 != objF) {
                        return objA2;
                    }
                }
                return objF;
            }

            /* JADX INFO: renamed from: M5.u$b$a$b, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0212b extends I6.l implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f5768a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ Long f5769b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ T5.d f5770c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ InterfaceC1815v0 f5771d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0212b(Long l8, T5.d dVar, InterfaceC1815v0 interfaceC1815v0, G6.d dVar2) {
                    super(2, dVar2);
                    this.f5769b = l8;
                    this.f5770c = dVar;
                    this.f5771d = interfaceC1815v0;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    return new C0212b(this.f5769b, this.f5770c, this.f5771d, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, G6.d dVar) {
                    return ((C0212b) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f5768a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            C6.r.b(obj);
                        } else {
                            throw new IllegalStateException(cFAYKUlMj.DvriPcE);
                        }
                    } else {
                        C6.r.b(obj);
                        long jLongValue = this.f5769b.longValue();
                        this.f5768a = 1;
                        if (U.a(jLongValue, this) == objF) {
                            return objF;
                        }
                    }
                    s sVar = new s(this.f5770c);
                    v.f5772a.b("Request timeout: " + this.f5770c.i());
                    InterfaceC1815v0 interfaceC1815v0 = this.f5771d;
                    String message = sVar.getMessage();
                    kotlin.jvm.internal.t.d(message);
                    AbstractC1823z0.d(interfaceC1815v0, message, sVar);
                    return G.f1419a;
                }
            }
        }

        public /* synthetic */ b(AbstractC2633k abstractC2633k) {
            this();
        }

        @Override // M5.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public u b(Q6.k block) {
            kotlin.jvm.internal.t.g(block, "block");
            a aVar = new a(null, null, null, 7, null);
            block.invoke(aVar);
            return aVar.a();
        }

        @Override // M5.k
        public C2691a getKey() {
            return u.f5753e;
        }

        public b() {
        }

        @Override // M5.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(u uVar, G5.a scope) {
            kotlin.jvm.internal.t.g(uVar, RaiWHuj.czizD);
            kotlin.jvm.internal.t.g(scope, "scope");
            ((t) l.b(scope, t.f5732c)).d(new a(uVar, scope, null));
        }
    }

    public /* synthetic */ u(Long l8, Long l9, Long l10, AbstractC2633k abstractC2633k) {
        this(l8, l9, l10);
    }

    public final boolean f() {
        return (this.f5754a == null && this.f5755b == null && this.f5756c == null) ? false : true;
    }

    public u(Long l8, Long l9, Long l10) {
        this.f5754a = l8;
        this.f5755b = l9;
        this.f5756c = l10;
    }
}
