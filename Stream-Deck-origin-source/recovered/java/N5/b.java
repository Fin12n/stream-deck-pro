package N5;

import C6.G;
import C6.r;
import D6.U;
import D6.z;
import I6.l;
import M5.k;
import Q6.p;
import X5.AbstractC1687p;
import X5.AbstractC1691u;
import X5.C1685n;
import X5.C1688q;
import X5.C1692v;
import X5.C1693w;
import X5.InterfaceC1684m;
import X5.InterfaceC1690t;
import X5.Q;
import X5.T;
import X5.x;
import X5.y;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1815v0;
import p115m6.C2691a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final a f7442g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final C2691a f7443h = new C2691a("HttpCache");

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final W5.a f7444i = new W5.a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final O5.h f7445a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final O5.h f7446b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final O5.a f7447c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final O5.a f7448d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f7449e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f7450f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements k {

        /* JADX INFO: renamed from: N5.b$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0237a extends l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f7451a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f7452b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f7453c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f7454d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ G5.a f7455e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0237a(b bVar, G5.a aVar, G6.d dVar) {
                super(3, dVar);
                this.f7454d = bVar;
                this.f7455e = aVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, Object obj, G6.d dVar) {
                C0237a c0237a = new C0237a(this.f7454d, this.f7455e, dVar);
                c0237a.f7452b = eVar;
                c0237a.f7453c = obj;
                return c0237a.invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:38:0x00b2  */
            /* JADX WARN: Code duplicated, block: B:40:0x00fd  */
            /* JADX WARN: Code duplicated, block: B:45:0x0131  */
            /* JADX WARN: Code duplicated, block: B:47:0x0147  */
            /* JADX WARN: Code duplicated, block: B:52:0x017c  */
            /* JADX WARN: Code duplicated, block: B:54:0x0180  */
            /* JADX WARN: Code duplicated, block: B:59:0x019d  */
            /* JADX WARN: Code duplicated, block: B:61:0x01af  */
            /* JADX WARN: Code duplicated, block: B:64:0x01f2  */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x0090, code lost:
            
                if (N5.f.g(r1, r14.f7454d, (p007a6.c) r15, r3, r14) == r0) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:41:0x012b, code lost:
            
                if (r15.h(r9, r1, r14) == r0) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:48:0x0176, code lost:
            
                if (r1.g(r9, r2, r15, r14) == r0) goto L56;
             */
            /* JADX WARN: Code restructure failed: missing block: B:55:0x0197, code lost:
            
                if (r8.i(r9, r10, r11, r12, r14) == r0) goto L56;
             */
            /* JADX WARN: Instruction removed from duplicated block: B:38:0x00b2, please report this as an issue */
            /* JADX WARN: Instruction removed from duplicated block: B:40:0x00fd, please report this as an issue */
            /* JADX WARN: Instruction removed from duplicated block: B:61:0x01af, please report this as an issue */
            /* JADX WARN: Instruction removed from duplicated block: B:64:0x01f2, please report this as an issue */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                p173t6.e eVar;
                p173t6.e eVar2;
                O5.b bVar;
                N5.i iVarD;
                C1688q c1688q;
                String strD;
                String strD2;
                Object objF = H6.c.f();
                int i8 = this.f7451a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        r.b(obj);
                        return G.f1419a;
                    }
                    if (i8 != 2) {
                        if (i8 == 3) {
                            r.b(obj);
                            return G.f1419a;
                        }
                        if (i8 == 4) {
                            r.b(obj);
                            return G.f1419a;
                        }
                        if (i8 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        return G.f1419a;
                    }
                    eVar = (p173t6.e) this.f7452b;
                    r.b(obj);
                    eVar2 = eVar;
                    bVar = (O5.b) obj;
                    if (bVar == null) {
                        N5.e.c().b("No cached response for " + ((T5.d) eVar2.d()).i() + " found");
                        if (AbstractC1687p.c(((T5.d) eVar2.d()).a().i(C1688q.f11910a.f())).contains(N5.a.f7436a.d())) {
                            N5.e.c().b("No cache found and \"only-if-cached\" set for " + ((T5.d) eVar2.d()).i());
                            a aVar = b.f7442g;
                            G5.a aVar2 = this.f7455e;
                            this.f7452b = null;
                            this.f7451a = 3;
                        }
                        return G.f1419a;
                    }
                    iVarD = N5.d.d(bVar.c(), bVar.d(), (T5.d) eVar2.d());
                    if (iVarD == N5.i.ShouldNotValidate) {
                        H5.b bVarG1 = O5.i.a(bVar, this.f7455e, new N5.h(((T5.d) eVar2.d()).b()), ((T5.d) eVar2.d()).g()).g1();
                        a aVar3 = b.f7442g;
                        G5.a aVar4 = this.f7455e;
                        this.f7452b = null;
                        this.f7451a = 4;
                    } else {
                        if (iVarD == N5.i.ShouldWarn) {
                            InterfaceC1684m interfaceC1684mD = bVar.d();
                            c1688q = C1688q.f11910a;
                            strD = interfaceC1684mD.d(c1688q.m());
                            if (strD != null) {
                                N5.e.c().b("Adding If-None-Match=" + strD + " for " + ((T5.d) eVar2.d()).i());
                                T5.k.b((InterfaceC1690t) eVar2.d(), c1688q.r(), strD);
                            }
                            strD2 = bVar.d().d(c1688q.t());
                            if (strD2 != null) {
                                N5.e.c().b("Adding If-Modified-Since=" + strD2 + " for " + ((T5.d) eVar2.d()).i());
                                T5.k.b((InterfaceC1690t) eVar2.d(), c1688q.q(), strD2);
                            }
                            return G.f1419a;
                        }
                        a aVar5 = b.f7442g;
                        G5.a aVar6 = this.f7455e;
                        InterfaceC1815v0 interfaceC1815v0G = ((T5.d) eVar2.d()).g();
                        this.f7452b = null;
                        this.f7451a = 5;
                    }
                    return objF;
                }
                r.b(obj);
                eVar = (p173t6.e) this.f7452b;
                Object obj2 = this.f7453c;
                if (!(obj2 instanceof a6.c.b)) {
                    return G.f1419a;
                }
                if (!t.c(((T5.d) eVar.d()).h(), C1692v.f11962b.b()) || !N5.e.b(((T5.d) eVar.d()).i().o())) {
                    return G.f1419a;
                }
                if (this.f7454d.f7449e) {
                    G5.a aVar7 = this.f7455e;
                    this.f7452b = null;
                    this.f7451a = 1;
                } else {
                    this.f7452b = eVar;
                    this.f7451a = 2;
                    obj = this.f7454d.k((T5.d) eVar.d(), (p007a6.c) obj2, this);
                    if (obj != objF) {
                        eVar2 = eVar;
                        bVar = (O5.b) obj;
                        if (bVar == null) {
                            N5.e.c().b("No cached response for " + ((T5.d) eVar2.d()).i() + " found");
                            if (AbstractC1687p.c(((T5.d) eVar2.d()).a().i(C1688q.f11910a.f())).contains(N5.a.f7436a.d())) {
                                N5.e.c().b("No cache found and \"only-if-cached\" set for " + ((T5.d) eVar2.d()).i());
                                a aVar8 = b.f7442g;
                                G5.a aVar9 = this.f7455e;
                                this.f7452b = null;
                                this.f7451a = 3;
                            }
                            return G.f1419a;
                        }
                        iVarD = N5.d.d(bVar.c(), bVar.d(), (T5.d) eVar2.d());
                        if (iVarD == N5.i.ShouldNotValidate) {
                            H5.b bVarG2 = O5.i.a(bVar, this.f7455e, new N5.h(((T5.d) eVar2.d()).b()), ((T5.d) eVar2.d()).g()).g1();
                            a aVar10 = b.f7442g;
                            G5.a aVar11 = this.f7455e;
                            this.f7452b = null;
                            this.f7451a = 4;
                        } else {
                            if (iVarD == N5.i.ShouldWarn) {
                                InterfaceC1684m interfaceC1684mD2 = bVar.d();
                                c1688q = C1688q.f11910a;
                                strD = interfaceC1684mD2.d(c1688q.m());
                                if (strD != null) {
                                    N5.e.c().b("Adding If-None-Match=" + strD + " for " + ((T5.d) eVar2.d()).i());
                                    T5.k.b((InterfaceC1690t) eVar2.d(), c1688q.r(), strD);
                                }
                                strD2 = bVar.d().d(c1688q.t());
                                if (strD2 != null) {
                                    N5.e.c().b("Adding If-Modified-Since=" + strD2 + " for " + ((T5.d) eVar2.d()).i());
                                    T5.k.b((InterfaceC1690t) eVar2.d(), c1688q.q(), strD2);
                                }
                                return G.f1419a;
                            }
                            a aVar12 = b.f7442g;
                            G5.a aVar13 = this.f7455e;
                            InterfaceC1815v0 interfaceC1815v0G2 = ((T5.d) eVar2.d()).g();
                            this.f7452b = null;
                            this.f7451a = 5;
                        }
                    }
                }
                return objF;
            }
        }

        /* JADX INFO: renamed from: N5.b$a$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0238b extends l implements p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f7456a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f7457b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f7458c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ b f7459d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ G5.a f7460e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0238b(b bVar, G5.a aVar, G6.d dVar) {
                super(3, dVar);
                this.f7459d = bVar;
                this.f7460e = aVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, U5.c cVar, G6.d dVar) {
                C0238b c0238b = new C0238b(this.f7459d, this.f7460e, dVar);
                c0238b.f7457b = eVar;
                c0238b.f7458c = cVar;
                return c0238b.invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:35:0x00ce  */
            /* JADX WARN: Code duplicated, block: B:40:0x00ed  */
            /* JADX WARN: Code duplicated, block: B:43:0x00fe  */
            /* JADX WARN: Code duplicated, block: B:46:0x0141  */
            /* JADX WARN: Code duplicated, block: B:49:0x0148  */
            /* JADX WARN: Code duplicated, block: B:52:0x0164  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
            
                if (N5.f.f(r12, r1, r2, r3, r11) == r0) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:36:0x00e6, code lost:
            
                if (r5.h(r12, r11) == r0) goto L51;
             */
            /* JADX WARN: Code restructure failed: missing block: B:50:0x0161, code lost:
            
                if (r3.h(r12, r11) == r0) goto L51;
             */
            /* JADX WARN: Instruction removed from duplicated block: B:43:0x00fe, please report this as an issue */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                p173t6.e eVar;
                U5.c cVar;
                p173t6.e eVar2;
                Object objI;
                p173t6.e eVar3;
                O5.b bVar;
                U5.c cVar2;
                Object objF = H6.c.f();
                int i8 = this.f7456a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        r.b(obj);
                        return G.f1419a;
                    }
                    if (i8 != 2) {
                        if (i8 == 3) {
                            r.b(obj);
                            return G.f1419a;
                        }
                        if (i8 == 4) {
                            cVar = (U5.c) this.f7458c;
                            eVar3 = (p173t6.e) this.f7457b;
                            r.b(obj);
                            cVar2 = (U5.c) obj;
                            if (cVar2 != null) {
                                throw new N5.g(cVar.g1().f().o());
                            }
                            this.f7460e.y().a(b.f7442g.d(), cVar2);
                            this.f7457b = null;
                            this.f7458c = null;
                            this.f7456a = 5;
                        } else {
                            if (i8 != 5) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            r.b(obj);
                        }
                        return G.f1419a;
                    }
                    cVar = (U5.c) this.f7458c;
                    eVar2 = (p173t6.e) this.f7457b;
                    r.b(obj);
                    bVar = (O5.b) obj;
                    if (bVar != null) {
                        eVar = eVar2;
                        if (t.c(cVar.g(), x.f11997c.z())) {
                            N5.e.c().b("Not modified response for " + cVar.g1().f().o() + ", replying from cache");
                            U5.e.c(cVar);
                            b bVar2 = this.f7459d;
                            T5.c cVarF = cVar.g1().f();
                            this.f7457b = eVar;
                            this.f7458c = cVar;
                            this.f7456a = 4;
                            objI = bVar2.i(cVarF, cVar, this);
                            if (objI != objF) {
                                eVar3 = eVar;
                                obj = objI;
                                cVar2 = (U5.c) obj;
                                if (cVar2 != null) {
                                    throw new N5.g(cVar.g1().f().o());
                                }
                                this.f7460e.y().a(b.f7442g.d(), cVar2);
                                this.f7457b = null;
                                this.f7458c = null;
                                this.f7456a = 5;
                            }
                        }
                        return G.f1419a;
                    }
                    U5.c cVarA = O5.i.a(bVar, this.f7460e, U5.e.d(cVar), cVar.getCoroutineContext());
                    this.f7457b = null;
                    this.f7458c = null;
                    this.f7456a = 3;
                    return objF;
                }
                r.b(obj);
                eVar = (p173t6.e) this.f7457b;
                cVar = (U5.c) this.f7458c;
                if (!t.c(cVar.g1().f().L0(), C1692v.f11962b.b())) {
                    return G.f1419a;
                }
                if (this.f7459d.f7449e) {
                    b bVar3 = this.f7459d;
                    G5.a aVar = this.f7460e;
                    this.f7457b = null;
                    this.f7456a = 1;
                } else {
                    if (!y.b(cVar.g())) {
                        if (t.c(cVar.g(), x.f11997c.z())) {
                            N5.e.c().b("Not modified response for " + cVar.g1().f().o() + ", replying from cache");
                            U5.e.c(cVar);
                            b bVar4 = this.f7459d;
                            T5.c cVarF2 = cVar.g1().f();
                            this.f7457b = eVar;
                            this.f7458c = cVar;
                            this.f7456a = 4;
                            objI = bVar4.i(cVarF2, cVar, this);
                            if (objI != objF) {
                                eVar3 = eVar;
                                obj = objI;
                                cVar2 = (U5.c) obj;
                                if (cVar2 != null) {
                                    throw new N5.g(cVar.g1().f().o());
                                }
                                this.f7460e.y().a(b.f7442g.d(), cVar2);
                                this.f7457b = null;
                                this.f7458c = null;
                                this.f7456a = 5;
                            }
                        }
                        return G.f1419a;
                    }
                    N5.e.c().b("Caching response for " + cVar.g1().f().o());
                    b bVar5 = this.f7459d;
                    this.f7457b = eVar;
                    this.f7458c = cVar;
                    this.f7456a = 2;
                    Object objH = bVar5.h(cVar, this);
                    if (objH != objF) {
                        eVar2 = eVar;
                        obj = objH;
                        bVar = (O5.b) obj;
                        if (bVar != null) {
                            eVar = eVar2;
                            if (t.c(cVar.g(), x.f11997c.z())) {
                                N5.e.c().b("Not modified response for " + cVar.g1().f().o() + ", replying from cache");
                                U5.e.c(cVar);
                                b bVar6 = this.f7459d;
                                T5.c cVarF3 = cVar.g1().f();
                                this.f7457b = eVar;
                                this.f7458c = cVar;
                                this.f7456a = 4;
                                objI = bVar6.i(cVarF3, cVar, this);
                                if (objI != objF) {
                                    eVar3 = eVar;
                                    obj = objI;
                                    cVar2 = (U5.c) obj;
                                    if (cVar2 != null) {
                                        throw new N5.g(cVar.g1().f().o());
                                    }
                                    this.f7460e.y().a(b.f7442g.d(), cVar2);
                                    this.f7457b = null;
                                    this.f7458c = null;
                                    this.f7456a = 5;
                                }
                            }
                            return G.f1419a;
                        }
                        U5.c cVarA2 = O5.i.a(bVar, this.f7460e, U5.e.d(cVar), cVar.getCoroutineContext());
                        this.f7457b = null;
                        this.f7458c = null;
                        this.f7456a = 3;
                    }
                }
                return objF;
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final W5.a d() {
            return b.f7444i;
        }

        @Override // M5.k
        /* JADX INFO: renamed from: e, reason: merged with bridge method [inline-methods] */
        public void a(b plugin, G5.a scope) throws p173t6.b {
            t.g(plugin, "plugin");
            t.g(scope, "scope");
            p173t6.h hVar = new p173t6.h("Cache");
            scope.i0().j(T5.i.f9925h.c(), hVar);
            scope.i0().l(hVar, new C0237a(plugin, scope, null));
            scope.z().l(U5.b.f10209h.b(), new C0238b(plugin, scope, null));
        }

        @Override // M5.k
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public b b(Q6.k block) {
            t.g(block, "block");
            C0239b c0239b = new C0239b();
            block.invoke(c0239b);
            return new b(c0239b.c(), c0239b.a(), c0239b.d(), c0239b.b(), c0239b.e(), c0239b.f(), null);
        }

        public final Object g(p173t6.e eVar, G5.a aVar, H5.b bVar, G6.d dVar) {
            eVar.b();
            aVar.y().a(d(), bVar.g());
            Object objH = eVar.h(bVar, dVar);
            return objH == H6.c.f() ? objH : G.f1419a;
        }

        @Override // M5.k
        public C2691a getKey() {
            return b.f7443h;
        }

        public final Object h(p173t6.e eVar, G5.a aVar, G6.d dVar) {
            eVar.b();
            T5.e eVarB = ((T5.d) eVar.d()).b();
            Object objH = eVar.h(new H5.b(aVar, eVarB, new T5.h(x.f11997c.k(), p141p6.a.c(null, 1, null), InterfaceC1684m.f11856a.a(), C1693w.f11972d.c(), io.ktor.utils.io.d.a(new byte[0]), eVarB.d())), dVar);
            return objH == H6.c.f() ? objH : G.f1419a;
        }

        public final Object i(p173t6.e eVar, O5.b bVar, G5.a aVar, G6.g gVar, G6.d dVar) {
            T5.e eVarB = ((T5.d) eVar.d()).b();
            x xVarG = bVar.g();
            p141p6.c cVarE = bVar.e();
            InterfaceC1684m.a aVar2 = InterfaceC1684m.f11856a;
            C1685n c1685n = new C1685n(0, 1, null);
            c1685n.d(bVar.d());
            c1685n.f(C1688q.f11910a.F(), "110");
            G g8 = G.f1419a;
            H5.b bVar2 = new H5.b(aVar, eVarB, new T5.h(xVarG, cVarE, c1685n.o(), bVar.j(), io.ktor.utils.io.d.a(bVar.b()), gVar));
            eVar.b();
            aVar.y().a(d(), bVar2.g());
            Object objH = eVar.h(bVar2, dVar);
            return objH == H6.c.f() ? objH : G.f1419a;
        }

        public a() {
        }
    }

    /* JADX INFO: renamed from: N5.b$b, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0239b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public O5.a f7461a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public O5.a f7462b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f7463c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public boolean f7464d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public O5.h f7465e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public O5.h f7466f;

        public C0239b() {
            O5.a.C0241a c0241a = O5.a.f8688a;
            this.f7461a = (O5.a) c0241a.a().invoke();
            this.f7462b = (O5.a) c0241a.a().invoke();
            O5.h.b bVar = O5.h.f8793a;
            this.f7465e = (O5.h) bVar.a().invoke();
            this.f7466f = (O5.h) bVar.a().invoke();
        }

        public final O5.h a() {
            return this.f7466f;
        }

        public final O5.a b() {
            return this.f7462b;
        }

        public final O5.h c() {
            return this.f7465e;
        }

        public final O5.a d() {
            return this.f7461a;
        }

        public final boolean e() {
            return this.f7463c;
        }

        public final boolean f() {
            return this.f7464d;
        }

        public final void g(O5.a storage) {
            t.g(storage, "storage");
            this.f7461a = storage;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f7467a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f7468b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f7469c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f7470d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f7471e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f7472f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f7474h;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f7472f = obj;
            this.f7474h |= Integer.MIN_VALUE;
            return b.this.i(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements Comparator {
        @Override // java.util.Comparator
        public final int compare(Object obj, Object obj2) {
            return F6.a.a(((O5.b) obj2).f(), ((O5.b) obj).f());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f7475a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f7476b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f7478d;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f7476b = obj;
            this.f7478d |= Integer.MIN_VALUE;
            return b.this.j(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f7479a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f7480b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f7481c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f7482d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f7484f;

        public f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f7482d = obj;
            this.f7484f |= Integer.MIN_VALUE;
            return b.this.k(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class g extends C2639q implements Q6.k {
        public g(Object obj) {
            super(1, obj, C1685n.class, com.amazon.a.a.o.b.au, "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p8) {
            t.g(p8, "p0");
            return ((C1685n) this.receiver).i(p8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class h extends C2639q implements Q6.k {
        public h(Object obj) {
            super(1, obj, C1685n.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final List invoke(String p8) {
            t.g(p8, "p0");
            return ((C1685n) this.receiver).c(p8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class i extends C2639q implements Q6.k {
        public i(Object obj) {
            super(1, obj, InterfaceC1684m.class, com.amazon.a.a.o.b.au, "get(Ljava/lang/String;)Ljava/lang/String;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final String invoke(String p8) {
            t.g(p8, "p0");
            return ((InterfaceC1684m) this.receiver).d(p8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class j extends C2639q implements Q6.k {
        public j(Object obj) {
            super(1, obj, InterfaceC1684m.class, "getAll", "getAll(Ljava/lang/String;)Ljava/util/List;", 0);
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final List invoke(String p8) {
            t.g(p8, "p0");
            return ((InterfaceC1684m) this.receiver).c(p8);
        }
    }

    public /* synthetic */ b(O5.h hVar, O5.h hVar2, O5.a aVar, O5.a aVar2, boolean z8, boolean z9, AbstractC2633k abstractC2633k) {
        this(hVar, hVar2, aVar, aVar2, z8, z9);
    }

    public final Object h(U5.c cVar, G6.d dVar) {
        T5.c cVarF = cVar.g1().f();
        List listA = AbstractC1691u.a(cVar);
        List listA2 = AbstractC1691u.a(cVarF);
        N5.a aVar = N5.a.f7436a;
        boolean zContains = listA.contains(aVar.e());
        if (zContains && this.f7450f) {
            return null;
        }
        O5.a aVar2 = zContains ? this.f7448d : this.f7447c;
        if (listA.contains(aVar.c()) || listA2.contains(aVar.c())) {
            return null;
        }
        return O5.i.b(aVar2, cVar, N5.d.e(cVar), this.f7450f, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public final Object i(T5.c cVar, U5.c cVar2, G6.d dVar) {
        c cVar3;
        U5.c cVar4;
        O5.a aVar;
        Map mapI;
        T5.c cVar5;
        b bVar;
        O5.b bVar2;
        U5.c cVar6;
        T5.c cVar7;
        if (dVar instanceof c) {
            cVar3 = (c) dVar;
            int i8 = cVar3.f7474h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar3.f7474h = i8 - Integer.MIN_VALUE;
            } else {
                cVar3 = new c(dVar);
            }
        } else {
            cVar3 = new c(dVar);
        }
        c cVar8 = cVar3;
        Object objJ = cVar8.f7472f;
        Object objF = H6.c.f();
        int i9 = cVar8.f7474h;
        if (i9 != 0) {
            if (i9 == 1) {
                mapI = (Map) cVar8.f7471e;
                aVar = (O5.a) cVar8.f7470d;
                cVar4 = (U5.c) cVar8.f7469c;
                cVar5 = (T5.c) cVar8.f7468b;
                bVar = (b) cVar8.f7467a;
                r.b(objJ);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                bVar2 = (O5.b) cVar8.f7469c;
                cVar6 = (U5.c) cVar8.f7468b;
                cVar7 = (T5.c) cVar8.f7467a;
                r.b(objJ);
            }
            return O5.i.a(bVar2, cVar7.g1().d(), cVar7, cVar6.getCoroutineContext());
        }
        r.b(objJ);
        T tO = cVar2.g1().f().o();
        boolean zContains = AbstractC1691u.a(cVar2).contains(N5.a.f7436a.e());
        if (zContains && this.f7450f) {
            return null;
        }
        O5.a aVar2 = zContains ? this.f7448d : this.f7447c;
        Map mapE = N5.d.e(cVar2);
        cVar8.f7467a = this;
        cVar8.f7468b = cVar;
        cVar8.f7469c = cVar2;
        cVar8.f7470d = aVar2;
        cVar8.f7471e = mapE;
        cVar8.f7474h = 1;
        O5.a aVar3 = aVar2;
        objJ = j(aVar3, mapE, tO, cVar, cVar8);
        if (objJ != objF) {
            cVar4 = cVar2;
            aVar = aVar3;
            mapI = mapE;
            cVar5 = cVar;
            bVar = this;
        }
        return objF;
        O5.b bVar3 = (O5.b) objJ;
        if (bVar3 == null) {
            return null;
        }
        if (mapI.isEmpty()) {
            mapI = bVar3.i();
        }
        T tO2 = cVar5.o();
        O5.b bVarA = bVar3.a(mapI, N5.d.c(cVar4, bVar.f7450f, null, 2, null));
        cVar8.f7467a = cVar5;
        cVar8.f7468b = cVar4;
        cVar8.f7469c = bVar3;
        cVar8.f7470d = null;
        cVar8.f7471e = null;
        cVar8.f7474h = 2;
        if (aVar.c(tO2, bVarA, cVar8) != objF) {
            bVar2 = bVar3;
            cVar6 = cVar4;
            cVar7 = cVar5;
            return O5.i.a(bVar2, cVar7.g1().d(), cVar7, cVar6.getCoroutineContext());
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object j(O5.a aVar, Map map, T t8, T5.c cVar, G6.d dVar) {
        e eVar;
        Q6.k kVar;
        Object next;
        Map.Entry entry;
        String str;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f7478d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f7478d = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objB = eVar.f7476b;
        Object objF = H6.c.f();
        int i9 = eVar.f7478d;
        if (i9 == 0) {
            r.b(objB);
            if (map.isEmpty()) {
                Q6.k kVarD = N5.e.d(cVar.T0(), new i(cVar.a()), new j(cVar.a()));
                eVar.f7475a = kVarD;
                eVar.f7478d = 2;
                objB = aVar.b(t8, eVar);
                if (objB != objF) {
                    kVar = kVarD;
                }
            } else {
                eVar.f7478d = 1;
                Object objA = aVar.a(t8, map, eVar);
                if (objA != objF) {
                    return objA;
                }
            }
            return objF;
        }
        if (i9 == 1) {
            r.b(objB);
            return objB;
        }
        if (i9 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        kVar = (Q6.k) eVar.f7475a;
        r.b(objB);
        Iterator it = z.J0((Iterable) objB, new d()).iterator();
        while (it.hasNext()) {
            next = it.next();
            Map mapI = ((O5.b) next).i();
            if (!mapI.isEmpty()) {
                Iterator it2 = mapI.entrySet().iterator();
                do {
                    if (it2.hasNext()) {
                        entry = (Map.Entry) it2.next();
                        str = (String) entry.getKey();
                    }
                } while (t.c(kVar.invoke(str), (String) entry.getValue()));
            }
            return (O5.b) next;
        }
        next = null;
        return (O5.b) next;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:35:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:42:0x00ec A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:43:0x00c0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:? A[LOOP:0: B:25:0x00a4->B:44:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:1: B:33:0x00c9->B:45:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object k(T5.d dVar, p007a6.c cVar, G6.d dVar2) {
        f fVar;
        Q6.k kVarD;
        T t8;
        b bVar;
        Q6.k kVar;
        Set set;
        Map mapI;
        String str;
        if (dVar2 instanceof f) {
            fVar = (f) dVar2;
            int i8 = fVar.f7484f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f7484f = i8 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar2);
            }
        } else {
            fVar = new f(dVar2);
        }
        Object obj = fVar.f7482d;
        Object objF = H6.c.f();
        int i9 = fVar.f7484f;
        if (i9 == 0) {
            r.b(obj);
            T tC = Q.c(dVar.i());
            kVarD = N5.e.d(cVar, new g(dVar.a()), new h(dVar.a()));
            O5.a aVar = this.f7448d;
            fVar.f7479a = this;
            fVar.f7480b = tC;
            fVar.f7481c = kVarD;
            fVar.f7484f = 1;
            Object objB = aVar.b(tC, fVar);
            if (objB != objF) {
                obj = objB;
                t8 = tC;
                bVar = this;
            }
            return objF;
        }
        if (i9 == 1) {
            kVarD = (Q6.k) fVar.f7481c;
            t8 = (T) fVar.f7480b;
            bVar = (b) fVar.f7479a;
            r.b(obj);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            set = (Set) fVar.f7480b;
            kVar = (Q6.k) fVar.f7479a;
            r.b(obj);
        }
        for (O5.b bVar2 : U.i(set, (Iterable) obj)) {
            mapI = bVar2.i();
            if (mapI.isEmpty()) {
                if (mapI.isEmpty()) {
                    return bVar2;
                }
                for (Map.Entry entry : mapI.entrySet()) {
                    str = (String) entry.getKey();
                    if (!t.c(kVar.invoke(str), (String) entry.getValue())) {
                    }
                }
            }
            return bVar2;
        }
        return null;
        Set set2 = (Set) obj;
        O5.a aVar2 = bVar.f7447c;
        fVar.f7479a = kVarD;
        fVar.f7480b = set2;
        fVar.f7481c = null;
        fVar.f7484f = 2;
        Object objB2 = aVar2.b(t8, fVar);
        if (objB2 != objF) {
            kVar = kVarD;
            set = set2;
            obj = objB2;
            while (r9.hasNext()) {
                mapI = bVar2.i();
                if (mapI.isEmpty()) {
                    if (mapI.isEmpty()) {
                        return bVar2;
                    }
                    while (r0.hasNext()) {
                        str = (String) entry.getKey();
                        if (!t.c(kVar.invoke(str), (String) entry.getValue())) {
                        }
                    }
                }
                return bVar2;
            }
            return null;
        }
        return objF;
    }

    public final O5.h l() {
        return this.f7446b;
    }

    public final O5.h m() {
        return this.f7445a;
    }

    public final boolean n() {
        return this.f7450f;
    }

    public b(O5.h hVar, O5.h hVar2, O5.a aVar, O5.a aVar2, boolean z8, boolean z9) {
        this.f7445a = hVar;
        this.f7446b = hVar2;
        this.f7447c = aVar;
        this.f7448d = aVar2;
        this.f7449e = z8;
        this.f7450f = z9;
    }
}
