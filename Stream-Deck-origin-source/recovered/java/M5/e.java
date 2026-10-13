package M5;

import C6.G;
import X5.AbstractC1691u;
import X5.C1674c;
import X5.C1685n;
import X5.C1688q;
import X5.C1692v;
import X5.InterfaceC1690t;
import io.ktor.utils.io.C;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.K;
import p017b7.AbstractC1823z0;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;
import p115m6.AbstractC2697g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final L7.a f5610a = p157r6.a.a("io.ktor.client.plugins.defaultTransformers");

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.l implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5611a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5612b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f5613c;

        /* JADX INFO: renamed from: M5.e$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0203a extends a6.c.a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final C1674c f5614a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final long f5615b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f5616c;

            public C0203a(C1674c c1674c, Object obj) {
                this.f5616c = obj;
                this.f5614a = c1674c == null ? C1674c.a.f11811a.b() : c1674c;
                this.f5615b = ((byte[]) obj).length;
            }

            @Override // p007a6.c
            public Long a() {
                return Long.valueOf(this.f5615b);
            }

            @Override // p007a6.c
            public C1674c b() {
                return this.f5614a;
            }

            @Override // a6.c.a
            public byte[] d() {
                return (byte[]) this.f5616c;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends a6.c.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final Long f5617a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final C1674c f5618b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f5619c;

            public b(p173t6.e eVar, C1674c c1674c, Object obj) {
                this.f5619c = obj;
                String strI = ((T5.d) eVar.d()).a().i(C1688q.f11910a.i());
                this.f5617a = strI != null ? Long.valueOf(Long.parseLong(strI)) : null;
                this.f5618b = c1674c == null ? C1674c.a.f11811a.b() : c1674c;
            }

            @Override // p007a6.c
            public Long a() {
                return this.f5617a;
            }

            @Override // p007a6.c
            public C1674c b() {
                return this.f5618b;
            }

            @Override // a6.c.d
            public io.ktor.utils.io.g d() {
                return (io.ktor.utils.io.g) this.f5619c;
            }
        }

        public a(G6.d dVar) {
            super(3, dVar);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p173t6.e eVar, Object obj, G6.d dVar) {
            a aVar = new a(dVar);
            aVar.f5612b = eVar;
            aVar.f5613c = obj;
            return aVar.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            p007a6.c cVarA;
            Object objF = H6.c.f();
            int i8 = this.f5611a;
            if (i8 == 0) {
                C6.r.b(obj);
                p173t6.e eVar = (p173t6.e) this.f5612b;
                Object obj2 = this.f5613c;
                C1685n c1685nA = ((T5.d) eVar.d()).a();
                C1688q c1688q = C1688q.f11910a;
                if (c1685nA.i(c1688q.c()) == null) {
                    ((T5.d) eVar.d()).a().f(c1688q.c(), "*/*");
                }
                C1674c c1674cE = AbstractC1691u.e((InterfaceC1690t) eVar.d());
                if (obj2 instanceof String) {
                    String str = (String) obj2;
                    if (c1674cE == null) {
                        c1674cE = C1674c.C0302c.f11833a.a();
                    }
                    cVarA = new p007a6.d(str, c1674cE, null, 4, null);
                } else if (obj2 instanceof byte[]) {
                    cVarA = new C0203a(c1674cE, obj2);
                } else if (obj2 instanceof io.ktor.utils.io.g) {
                    cVarA = new b(eVar, c1674cE, obj2);
                } else {
                    cVarA = obj2 instanceof p007a6.c ? (p007a6.c) obj2 : f.a(c1674cE, (T5.d) eVar.d(), obj2);
                }
                if ((cVarA != null ? cVarA.b() : null) != null) {
                    ((T5.d) eVar.d()).a().k(c1688q.j());
                    e.f5610a.b("Transformed with default transformers request body for " + ((T5.d) eVar.d()).i() + " from " + K.b(obj2.getClass()));
                    this.f5612b = null;
                    this.f5611a = 1;
                    if (eVar.h(cVarA, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.l implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5620a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5621b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5622c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f5623d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f5624e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5625a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5626b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Object f5627c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ U5.c f5628d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Object obj, U5.c cVar, G6.d dVar) {
                super(2, dVar);
                this.f5627c = obj;
                this.f5628d = cVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f5627c, this.f5628d, dVar);
                aVar.f5626b = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(C c8, G6.d dVar) {
                return ((a) create(c8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f5625a;
                try {
                    if (i8 != 0) {
                        try {
                            if (i8 != 1) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C6.r.b(obj);
                        } catch (Throwable th) {
                            U5.e.c(this.f5628d);
                            throw th;
                        }
                    } else {
                        C6.r.b(obj);
                        C c8 = (C) this.f5626b;
                        io.ktor.utils.io.g gVar = (io.ktor.utils.io.g) this.f5627c;
                        io.ktor.utils.io.j jVarMo220e = c8.mo220e();
                        this.f5625a = 1;
                        if (io.ktor.utils.io.h.b(gVar, jVarMo220e, Long.MAX_VALUE, this) == objF) {
                            return objF;
                        }
                    }
                    U5.e.c(this.f5628d);
                    return G.f1419a;
                } catch (CancellationException e8) {
                    p017b7.K.d(this.f5628d, e8);
                    throw e8;
                } catch (Throwable th2) {
                    p017b7.K.c(this.f5628d, "Receive failed", th2);
                    throw th2;
                }
            }
        }

        /* JADX INFO: renamed from: M5.e$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0204b extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1818x f5629a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0204b(InterfaceC1818x interfaceC1818x) {
                super(1);
                this.f5629a = interfaceC1818x;
            }

            public final void b(Throwable th) {
                this.f5629a.i1();
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                b((Throwable) obj);
                return G.f1419a;
            }
        }

        public b(G6.d dVar) {
            super(3, dVar);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p173t6.e eVar, U5.d dVar, G6.d dVar2) {
            b bVar = new b(dVar2);
            bVar.f5623d = eVar;
            bVar.f5624e = dVar;
            return bVar.invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:36:0x015e  */
        /* JADX WARN: Code duplicated, block: B:51:0x01b4  */
        /* JADX WARN: Code duplicated, block: B:64:0x01f9  */
        /* JADX WARN: Code duplicated, block: B:73:0x022a  */
        /* JADX WARN: Code duplicated, block: B:76:0x022e  */
        /* JADX WARN: Code duplicated, block: B:81:0x0268  */
        /* JADX WARN: Code duplicated, block: B:98:0x02f1  */
        /* JADX WARN: Instruction removed from duplicated block: B:76:0x022e, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:98:0x02f1, please report this as an issue */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            p173t6.e eVar;
            p181u6.a aVarA;
            U5.c cVarG;
            Object objH;
            p173t6.e eVar2;
            Object objH2;
            Object objA;
            p173t6.e eVar3;
            Object objA2;
            p173t6.e eVar4;
            p173t6.e eVar5;
            p181u6.a aVar;
            Object objA3;
            p173t6.e eVar6;
            p173t6.e eVar7;
            Object objH3;
            Object objH4;
            p173t6.e eVar8;
            Object objH5;
            byte[] bArr;
            Long lC;
            boolean z8;
            Object objH6;
            Object objF = H6.c.f();
            U5.d dVar = null;
            switch (this.f5622c) {
                case 0:
                    C6.r.b(obj);
                    eVar = (p173t6.e) this.f5623d;
                    U5.d dVar2 = (U5.d) this.f5624e;
                    aVarA = dVar2.a();
                    Object objB = dVar2.b();
                    if (!(objB instanceof io.ktor.utils.io.g)) {
                        return G.f1419a;
                    }
                    cVarG = ((H5.b) eVar.d()).g();
                    X6.d dVarB = aVarA.b();
                    if (kotlin.jvm.internal.t.c(dVarB, K.b(G.class))) {
                        io.ktor.utils.io.i.a((io.ktor.utils.io.g) objB);
                        U5.d dVar3 = new U5.d(aVarA, G.f1419a);
                        this.f5623d = eVar;
                        this.f5624e = aVarA;
                        this.f5622c = 1;
                        objH3 = eVar.h(dVar3, this);
                        if (objH3 != objF) {
                            eVar2 = eVar;
                            dVar = (U5.d) objH3;
                            eVar = eVar2;
                            if (dVar != null) {
                                e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                            }
                            return G.f1419a;
                        }
                    } else if (kotlin.jvm.internal.t.c(dVarB, K.b(Integer.TYPE))) {
                        this.f5623d = eVar;
                        this.f5624e = aVarA;
                        this.f5620a = eVar;
                        this.f5621b = aVarA;
                        this.f5622c = 2;
                        objA3 = io.ktor.utils.io.g.b.a((io.ktor.utils.io.g) objB, 0L, this, 1, null);
                        if (objA3 != objF) {
                            eVar6 = eVar;
                            eVar7 = eVar6;
                            aVar = aVarA;
                            U5.d dVar4 = new U5.d(aVarA, I6.b.d(Integer.parseInt(p205x6.n.X1((p205x6.n) objA3, 0, 0, 3, null))));
                            this.f5623d = eVar7;
                            this.f5624e = aVar;
                            this.f5620a = null;
                            this.f5621b = null;
                            this.f5622c = 3;
                            objH4 = eVar6.h(dVar4, this);
                            if (objH4 != objF) {
                                eVar8 = eVar7;
                                dVar = (U5.d) objH4;
                                eVar = eVar8;
                                aVarA = aVar;
                                if (dVar != null) {
                                    e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                                }
                                return G.f1419a;
                            }
                        }
                    } else {
                        if (kotlin.jvm.internal.t.c(dVarB, K.b(p205x6.k.class)) ? true : kotlin.jvm.internal.t.c(dVarB, K.b(p205x6.n.class))) {
                            this.f5623d = eVar;
                            this.f5624e = aVarA;
                            this.f5620a = eVar;
                            this.f5621b = aVarA;
                            this.f5622c = 4;
                            objA2 = io.ktor.utils.io.g.b.a((io.ktor.utils.io.g) objB, 0L, this, 1, null);
                            if (objA2 != objF) {
                                eVar4 = eVar;
                                eVar5 = eVar4;
                                aVar = aVarA;
                                U5.d dVar5 = new U5.d(aVarA, objA2);
                                this.f5623d = eVar5;
                                this.f5624e = aVar;
                                this.f5620a = null;
                                this.f5621b = null;
                                this.f5622c = 5;
                                objH5 = eVar4.h(dVar5, this);
                                if (objH5 != objF) {
                                    eVar8 = eVar5;
                                    dVar = (U5.d) objH5;
                                    eVar = eVar8;
                                    aVarA = aVar;
                                    if (dVar != null) {
                                        e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                                    }
                                    return G.f1419a;
                                }
                            }
                        } else if (kotlin.jvm.internal.t.c(dVarB, K.b(byte[].class))) {
                            this.f5623d = eVar;
                            this.f5624e = aVarA;
                            this.f5620a = cVarG;
                            this.f5622c = 6;
                            objA = AbstractC2697g.a((io.ktor.utils.io.g) objB, this);
                            if (objA != objF) {
                                eVar3 = eVar;
                                bArr = (byte[]) objA;
                                lC = AbstractC1691u.c(cVarG);
                                if (p115m6.z.f30119a.a() && cVarG.a().d(C1688q.f11910a.h()) == null) {
                                    z8 = true;
                                } else {
                                    z8 = false;
                                }
                                boolean zC = kotlin.jvm.internal.t.c(((H5.b) eVar3.d()).f().L0(), C1692v.f11962b.c());
                                if (z8 && !zC && lC != null && lC.longValue() > 0) {
                                    if (!(bArr.length == ((int) lC.longValue()))) {
                                        throw new IllegalStateException(("Expected " + lC + ", actual " + bArr.length).toString());
                                    }
                                }
                                U5.d dVar6 = new U5.d(aVarA, bArr);
                                this.f5623d = eVar3;
                                this.f5624e = aVarA;
                                this.f5620a = null;
                                this.f5622c = 7;
                                objH6 = eVar3.h(dVar6, this);
                                if (objH6 != objF) {
                                    eVar2 = eVar3;
                                    dVar = (U5.d) objH6;
                                    eVar = eVar2;
                                    if (dVar != null) {
                                        e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                                    }
                                    return G.f1419a;
                                }
                            }
                        } else {
                            if (!kotlin.jvm.internal.t.c(dVarB, K.b(io.ktor.utils.io.g.class))) {
                                if (kotlin.jvm.internal.t.c(dVarB, K.b(X5.x.class))) {
                                    io.ktor.utils.io.i.a((io.ktor.utils.io.g) objB);
                                    U5.d dVar7 = new U5.d(aVarA, cVarG.g());
                                    this.f5623d = eVar;
                                    this.f5624e = aVarA;
                                    this.f5622c = 9;
                                    objH = eVar.h(dVar7, this);
                                    if (objH != objF) {
                                        eVar2 = eVar;
                                        dVar = (U5.d) objH;
                                        eVar = eVar2;
                                    }
                                }
                                if (dVar != null) {
                                    e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                                }
                                return G.f1419a;
                            }
                            InterfaceC1818x interfaceC1818xA = AbstractC1823z0.a((InterfaceC1815v0) cVarG.getCoroutineContext().A(InterfaceC1815v0.f15985O));
                            io.ktor.utils.io.B bG = io.ktor.utils.io.q.g(eVar, cVarG.getCoroutineContext(), false, new a(objB, cVarG, null), 2, null);
                            bG.H0(new C0204b(interfaceC1818xA));
                            U5.d dVar8 = new U5.d(aVarA, bG.mo219e());
                            this.f5623d = eVar;
                            this.f5624e = aVarA;
                            this.f5622c = 8;
                            objH2 = eVar.h(dVar8, this);
                            if (objH2 != objF) {
                                eVar2 = eVar;
                                dVar = (U5.d) objH2;
                                eVar = eVar2;
                                if (dVar != null) {
                                    e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                                }
                                return G.f1419a;
                            }
                        }
                    }
                    return objF;
                case 1:
                    p181u6.a aVar2 = (p181u6.a) this.f5624e;
                    eVar2 = (p173t6.e) this.f5623d;
                    C6.r.b(obj);
                    aVarA = aVar2;
                    objH3 = obj;
                    dVar = (U5.d) objH3;
                    eVar = eVar2;
                    if (dVar != null) {
                        e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                    }
                    return G.f1419a;
                case 2:
                    p181u6.a aVar3 = (p181u6.a) this.f5621b;
                    eVar6 = (p173t6.e) this.f5620a;
                    aVar = (p181u6.a) this.f5624e;
                    eVar7 = (p173t6.e) this.f5623d;
                    C6.r.b(obj);
                    aVarA = aVar3;
                    objA3 = obj;
                    U5.d dVar9 = new U5.d(aVarA, I6.b.d(Integer.parseInt(p205x6.n.X1((p205x6.n) objA3, 0, 0, 3, null))));
                    this.f5623d = eVar7;
                    this.f5624e = aVar;
                    this.f5620a = null;
                    this.f5621b = null;
                    this.f5622c = 3;
                    objH4 = eVar6.h(dVar9, this);
                    if (objH4 != objF) {
                        eVar8 = eVar7;
                        dVar = (U5.d) objH4;
                        eVar = eVar8;
                        aVarA = aVar;
                        if (dVar != null) {
                            e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                        }
                        return G.f1419a;
                    }
                    return objF;
                case 3:
                    p181u6.a aVar4 = (p181u6.a) this.f5624e;
                    eVar8 = (p173t6.e) this.f5623d;
                    C6.r.b(obj);
                    aVar = aVar4;
                    objH4 = obj;
                    dVar = (U5.d) objH4;
                    eVar = eVar8;
                    aVarA = aVar;
                    if (dVar != null) {
                        e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                    }
                    return G.f1419a;
                case 4:
                    p181u6.a aVar5 = (p181u6.a) this.f5621b;
                    eVar4 = (p173t6.e) this.f5620a;
                    aVar = (p181u6.a) this.f5624e;
                    eVar5 = (p173t6.e) this.f5623d;
                    C6.r.b(obj);
                    aVarA = aVar5;
                    objA2 = obj;
                    U5.d dVar10 = new U5.d(aVarA, objA2);
                    this.f5623d = eVar5;
                    this.f5624e = aVar;
                    this.f5620a = null;
                    this.f5621b = null;
                    this.f5622c = 5;
                    objH5 = eVar4.h(dVar10, this);
                    if (objH5 != objF) {
                        eVar8 = eVar5;
                        dVar = (U5.d) objH5;
                        eVar = eVar8;
                        aVarA = aVar;
                        if (dVar != null) {
                            e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                        }
                        return G.f1419a;
                    }
                    return objF;
                case 5:
                    p181u6.a aVar6 = (p181u6.a) this.f5624e;
                    eVar8 = (p173t6.e) this.f5623d;
                    C6.r.b(obj);
                    aVar = aVar6;
                    objH5 = obj;
                    dVar = (U5.d) objH5;
                    eVar = eVar8;
                    aVarA = aVar;
                    if (dVar != null) {
                        e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                    }
                    return G.f1419a;
                case 6:
                    U5.c cVar = (U5.c) this.f5620a;
                    p181u6.a aVar7 = (p181u6.a) this.f5624e;
                    eVar3 = (p173t6.e) this.f5623d;
                    C6.r.b(obj);
                    aVarA = aVar7;
                    cVarG = cVar;
                    objA = obj;
                    bArr = (byte[]) objA;
                    lC = AbstractC1691u.c(cVarG);
                    if (p115m6.z.f30119a.a()) {
                        z8 = false;
                    } else {
                        z8 = false;
                    }
                    boolean zC2 = kotlin.jvm.internal.t.c(((H5.b) eVar3.d()).f().L0(), C1692v.f11962b.c());
                    if (z8) {
                        if (!(bArr.length == ((int) lC.longValue()))) {
                            throw new IllegalStateException(("Expected " + lC + ", actual " + bArr.length).toString());
                        }
                    }
                    U5.d dVar11 = new U5.d(aVarA, bArr);
                    this.f5623d = eVar3;
                    this.f5624e = aVarA;
                    this.f5620a = null;
                    this.f5622c = 7;
                    objH6 = eVar3.h(dVar11, this);
                    if (objH6 != objF) {
                        eVar2 = eVar3;
                        dVar = (U5.d) objH6;
                        eVar = eVar2;
                        if (dVar != null) {
                            e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                        }
                        return G.f1419a;
                    }
                    return objF;
                case 7:
                    p181u6.a aVar8 = (p181u6.a) this.f5624e;
                    eVar2 = (p173t6.e) this.f5623d;
                    C6.r.b(obj);
                    aVarA = aVar8;
                    objH6 = obj;
                    dVar = (U5.d) objH6;
                    eVar = eVar2;
                    if (dVar != null) {
                        e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                    }
                    return G.f1419a;
                case 8:
                    p181u6.a aVar9 = (p181u6.a) this.f5624e;
                    eVar2 = (p173t6.e) this.f5623d;
                    C6.r.b(obj);
                    aVarA = aVar9;
                    objH2 = obj;
                    dVar = (U5.d) objH2;
                    eVar = eVar2;
                    if (dVar != null) {
                        e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                    }
                    return G.f1419a;
                case 9:
                    p181u6.a aVar10 = (p181u6.a) this.f5624e;
                    eVar2 = (p173t6.e) this.f5623d;
                    C6.r.b(obj);
                    aVarA = aVar10;
                    objH = obj;
                    dVar = (U5.d) objH;
                    eVar = eVar2;
                    if (dVar != null) {
                        e.f5610a.b("Transformed with default transformers response body for " + ((H5.b) eVar.d()).f().o() + " to " + aVarA.b());
                    }
                    return G.f1419a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    public static final void b(G5.a aVar) {
        kotlin.jvm.internal.t.g(aVar, "<this>");
        aVar.A().l(T5.g.f9911h.b(), new a(null));
        aVar.Y().l(U5.f.f10219h.a(), new b(null));
        f.b(aVar);
    }
}
