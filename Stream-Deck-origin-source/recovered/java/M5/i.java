package M5;

import C6.G;
import com.amazon.a.a.b.a.dXIE.uYOhHhTXuF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC2633k;
import p115m6.C2691a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final a f5639d = new a(null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final C2691a f5640e = new C2691a("HttpResponseValidator");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f5641a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f5642b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f5643c;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements k {

        /* JADX INFO: renamed from: M5.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0205a extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5644a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5645b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f5646c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ i f5647d;

            /* JADX INFO: renamed from: M5.i$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0206a extends kotlin.jvm.internal.u implements Function0 {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ i f5648a;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0206a(i iVar) {
                    super(0);
                    this.f5648a = iVar;
                }

                @Override // kotlin.jvm.functions.Function0
                /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Boolean invoke() {
                    return Boolean.valueOf(this.f5648a.f5643c);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0205a(i iVar, G6.d dVar) {
                super(3, dVar);
                this.f5647d = iVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, Object obj, G6.d dVar) {
                C0205a c0205a = new C0205a(this.f5647d, dVar);
                c0205a.f5645b = eVar;
                c0205a.f5646c = obj;
                return c0205a.invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x0052, code lost:
            
                if (r9 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0072, code lost:
            
                return r0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [t6.e] */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v8 */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = H6.c.f();
                ?? r8 = this.f5644a;
                try {
                    if (r8 == 0) {
                        C6.r.b(obj);
                        p173t6.e eVar = (p173t6.e) this.f5645b;
                        Object obj2 = this.f5646c;
                        ((T5.d) eVar.d()).c().c(j.e(), new C0206a(this.f5647d));
                        this.f5645b = eVar;
                        this.f5644a = 1;
                        Object objH = eVar.h(obj2, this);
                        r8 = eVar;
                    } else {
                        if (r8 != 1) {
                            if (r8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) this.f5645b;
                            C6.r.b(obj);
                            throw th;
                        }
                        p173t6.e eVar2 = (p173t6.e) this.f5645b;
                        C6.r.b(obj);
                        r8 = eVar2;
                    }
                    return G.f1419a;
                } catch (Throwable th2) {
                    Throwable thA = V5.e.a(th2);
                    i iVar = this.f5647d;
                    j.a aVarA = j.a((T5.d) r8.d());
                    this.f5645b = thA;
                    this.f5644a = 2;
                    if (iVar.e(thA, aVarA, this) != objF) {
                        throw thA;
                    }
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5649a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5650b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f5651c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ i f5652d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(i iVar, G6.d dVar) {
                super(3, dVar);
                this.f5652d = iVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p173t6.e eVar, U5.d dVar, G6.d dVar2) {
                b bVar = new b(this.f5652d, dVar2);
                bVar.f5650b = eVar;
                bVar.f5651c = dVar;
                return bVar.invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
            
                if (r5 == r0) goto L22;
             */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x005c, code lost:
            
                return r0;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v1, types: [t6.e] */
            /* JADX WARN: Type inference failed for: r1v11 */
            /* JADX WARN: Type inference failed for: r1v12 */
            /* JADX WARN: Type inference failed for: r1v8 */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objF = H6.c.f();
                ?? r8 = this.f5649a;
                try {
                    if (r8 == 0) {
                        C6.r.b(obj);
                        p173t6.e eVar = (p173t6.e) this.f5650b;
                        U5.d dVar = (U5.d) this.f5651c;
                        this.f5650b = eVar;
                        this.f5649a = 1;
                        Object objH = eVar.h(dVar, this);
                        r8 = eVar;
                    } else {
                        if (r8 != 1) {
                            if (r8 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th = (Throwable) this.f5650b;
                            C6.r.b(obj);
                            throw th;
                        }
                        p173t6.e eVar2 = (p173t6.e) this.f5650b;
                        C6.r.b(obj);
                        r8 = eVar2;
                    }
                    return G.f1419a;
                } catch (Throwable th2) {
                    Throwable thA = V5.e.a(th2);
                    i iVar = this.f5652d;
                    T5.c cVarF = ((H5.b) r8.d()).f();
                    this.f5650b = thA;
                    this.f5649a = 2;
                    if (iVar.e(thA, cVarF, this) != objF) {
                        throw thA;
                    }
                }
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        @Override // M5.k
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public void a(i plugin, G5.a scope) throws p173t6.b {
            kotlin.jvm.internal.t.g(plugin, "plugin");
            kotlin.jvm.internal.t.g(scope, "scope");
            scope.A().l(T5.g.f9911h.a(), new C0205a(plugin, null));
            p173t6.h hVar = new p173t6.h("BeforeReceive");
            scope.Y().k(U5.f.f10219h.b(), hVar);
            scope.Y().l(hVar, new b(plugin, null));
            ((t) l.b(scope, t.f5732c)).d(new c(plugin, null));
        }

        @Override // M5.k
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public i b(Q6.k block) {
            kotlin.jvm.internal.t.g(block, "block");
            b bVar = new b();
            block.invoke(bVar);
            return new i(D6.z.D0(bVar.c()), D6.z.D0(bVar.b()), bVar.a());
        }

        @Override // M5.k
        public C2691a getKey() {
            return i.f5640e;
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5653a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5654b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f5655c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ i f5656d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(i iVar, G6.d dVar) {
                super(3, dVar);
                this.f5656d = iVar;
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(A a8, T5.d dVar, G6.d dVar2) {
                c cVar = new c(this.f5656d, dVar2);
                cVar.f5654b = a8;
                cVar.f5655c = dVar;
                return cVar.invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f5653a;
                if (i8 != 0) {
                    if (i8 != 1) {
                        if (i8 == 2) {
                            H5.b bVar = (H5.b) this.f5654b;
                            C6.r.b(obj);
                            return bVar;
                        }
                        throw new IllegalStateException(uYOhHhTXuF.nKQf);
                    }
                    C6.r.b(obj);
                } else {
                    C6.r.b(obj);
                    A a8 = (A) this.f5654b;
                    T5.d dVar = (T5.d) this.f5655c;
                    this.f5654b = null;
                    this.f5653a = 1;
                    obj = a8.a(dVar, this);
                    if (obj != objF) {
                    }
                    return objF;
                }
                H5.b bVar2 = (H5.b) obj;
                i iVar = this.f5656d;
                U5.c cVarG = bVar2.g();
                this.f5654b = bVar2;
                this.f5653a = 2;
                if (iVar.f(cVarG, this) == objF) {
                    return objF;
                }
                return bVar2;
            }
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f5657a = new ArrayList();

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f5658b = new ArrayList();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public boolean f5659c = true;

        public final boolean a() {
            return this.f5659c;
        }

        public final List b() {
            return this.f5658b;
        }

        public final List c() {
            return this.f5657a;
        }

        public final void d(boolean z8) {
            this.f5659c = z8;
        }

        public final void e(Q6.o block) {
            kotlin.jvm.internal.t.g(block, "block");
            this.f5657a.add(block);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5660a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5661b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5662c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f5663d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5665f;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5663d = obj;
            this.f5665f |= Integer.MIN_VALUE;
            return i.this.e(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5666a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5667b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f5668c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5670e;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5668c = obj;
            this.f5670e |= Integer.MIN_VALUE;
            return i.this.f(null, this);
        }
    }

    public i(List<? extends Q6.o> responseValidators, List<? extends h> callExceptionHandlers, boolean z8) {
        kotlin.jvm.internal.t.g(responseValidators, "responseValidators");
        kotlin.jvm.internal.t.g(callExceptionHandlers, "callExceptionHandlers");
        this.f5641a = responseValidators;
        this.f5642b = callExceptionHandlers;
        this.f5643c = z8;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0078  */
    /* JADX WARN: Code duplicated, block: B:26:0x009c  */
    /* JADX WARN: Code duplicated, block: B:36:0x00a0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:17:0x0072->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object e(java.lang.Throwable r8, T5.c r9, G6.d r10) {
        /*
            r7 = this;
            boolean r0 = r10 instanceof M5.i.c
            if (r0 == 0) goto L13
            r0 = r10
            M5.i$c r0 = (M5.i.c) r0
            int r1 = r0.f5665f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f5665f = r1
            goto L18
        L13:
            M5.i$c r0 = new M5.i$c
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.f5663d
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f5665f
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L31
            if (r2 != r3) goto L29
            goto L31
        L29:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r9)
            throw r8
        L31:
            java.lang.Object r8 = r0.f5662c
            java.util.Iterator r8 = (java.util.Iterator) r8
            java.lang.Object r9 = r0.f5661b
            T5.c r9 = (T5.c) r9
            java.lang.Object r2 = r0.f5660a
            java.lang.Throwable r2 = (java.lang.Throwable) r2
            C6.r.b(r10)
            goto L99
        L41:
            C6.r.b(r10)
            L7.a r10 = M5.j.d()
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Processing exception "
            r2.append(r5)
            r2.append(r8)
            java.lang.String r5 = " for request "
            r2.append(r5)
            X5.T r5 = r9.o()
            r2.append(r5)
            java.lang.String r2 = r2.toString()
            r10.b(r2)
            java.util.List r10 = r7.f5642b
            java.util.Iterator r10 = r10.iterator()
            r6 = r9
            r9 = r8
            r8 = r10
            r10 = r6
        L72:
            boolean r2 = r8.hasNext()
            if (r2 == 0) goto Lb5
            java.lang.Object r2 = r8.next()
            M5.h r2 = (M5.h) r2
            boolean r5 = r2 instanceof M5.g
            if (r5 == 0) goto L9c
            M5.g r2 = (M5.g) r2
            Q6.o r2 = r2.a()
            r0.f5660a = r9
            r0.f5661b = r10
            r0.f5662c = r8
            r0.f5665f = r4
            java.lang.Object r2 = r2.invoke(r9, r0)
            if (r2 != r1) goto L97
            goto Lb4
        L97:
            r2 = r9
            r9 = r10
        L99:
            r10 = r9
            r9 = r2
            goto L72
        L9c:
            boolean r5 = r2 instanceof M5.x
            if (r5 == 0) goto L72
            M5.x r2 = (M5.x) r2
            Q6.p r2 = r2.a()
            r0.f5660a = r9
            r0.f5661b = r10
            r0.f5662c = r8
            r0.f5665f = r3
            java.lang.Object r2 = r2.invoke(r9, r10, r0)
            if (r2 != r1) goto L97
        Lb4:
            return r1
        Lb5:
            C6.G r8 = C6.G.f1419a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: M5.i.e(java.lang.Throwable, T5.c, G6.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object f(U5.c cVar, G6.d dVar) {
        d dVar2;
        U5.c cVar2;
        Iterator it;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f5670e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f5670e = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f5668c;
        Object objF = H6.c.f();
        int i9 = dVar2.f5670e;
        if (i9 == 0) {
            C6.r.b(obj);
            j.f5671a.b("Validating response for request " + cVar.g1().f().o());
            cVar2 = cVar;
            it = this.f5641a.iterator();
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) dVar2.f5667b;
            U5.c cVar3 = (U5.c) dVar2.f5666a;
            C6.r.b(obj);
            cVar2 = cVar3;
        }
        while (it.hasNext()) {
            Q6.o oVar = (Q6.o) it.next();
            dVar2.f5666a = cVar2;
            dVar2.f5667b = it;
            dVar2.f5670e = 1;
            if (oVar.invoke(cVar2, dVar2) == objF) {
                return objF;
            }
        }
        return G.f1419a;
    }
}
