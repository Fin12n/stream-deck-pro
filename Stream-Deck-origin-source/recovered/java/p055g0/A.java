package p055g0;

import C6.G;
import C6.r;
import G6.d;
import H6.c;
import I6.k;
import I6.l;
import Q6.o;
import p002a1.e;
import p011b1.I;
import p011b1.InterfaceC1755c;
import p011b1.S;
import p017b7.J;
import p046f0.K;
import p056g1.AbstractC2348l;
import p056g1.InterfaceC2344h;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class A extends AbstractC2348l implements InterfaceC2344h {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final O f22774p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public F f22775q;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22777b;

        /* JADX INFO: renamed from: g0.A$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0522a extends k implements o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f22779b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f22780c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ A f22781d;

            /* JADX INFO: renamed from: g0.A$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0523a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22782a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ O f22783b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ long f22784c;

                /* JADX INFO: renamed from: g0.A$a$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0524a extends l implements o {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public int f22785a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public /* synthetic */ Object f22786b;

                    /* JADX INFO: renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ O f22787c;

                    /* JADX INFO: renamed from: d, reason: collision with root package name */
                    public final /* synthetic */ long f22788d;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C0524a(O o8, long j8, d dVar) {
                        super(2, dVar);
                        this.f22787c = o8;
                        this.f22788d = j8;
                    }

                    @Override // I6.a
                    public final d create(Object obj, d dVar) {
                        C0524a c0524a = new C0524a(this.f22787c, this.f22788d, dVar);
                        c0524a.f22786b = obj;
                        return c0524a;
                    }

                    @Override // Q6.o
                    /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                    public final Object invoke(I i8, d dVar) {
                        return ((C0524a) create(i8, dVar)).invokeSuspend(G.f1419a);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        c.f();
                        if (this.f22785a != 0) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                        this.f22787c.c((I) this.f22786b, this.f22788d, e.f13022a.c());
                        return G.f1419a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0523a(O o8, long j8, d dVar) {
                    super(2, dVar);
                    this.f22783b = o8;
                    this.f22784c = j8;
                }

                @Override // I6.a
                public final d create(Object obj, d dVar) {
                    return new C0523a(this.f22783b, this.f22784c, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(J j8, d dVar) {
                    return ((C0523a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = c.f();
                    int i8 = this.f22782a;
                    if (i8 == 0) {
                        r.b(obj);
                        M mE = this.f22783b.e();
                        K k8 = K.UserInput;
                        C0524a c0524a = new C0524a(this.f22783b, this.f22784c, null);
                        this.f22782a = 1;
                        if (mE.f(k8, c0524a, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj);
                    }
                    return G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0522a(A a8, d dVar) {
                super(2, dVar);
                this.f22781d = a8;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                C0522a c0522a = new C0522a(this.f22781d, dVar);
                c0522a.f22780c = obj;
                return c0522a;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC1755c interfaceC1755c, d dVar) {
                return ((C0522a) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:14:0x003c  */
            /* JADX WARN: Code duplicated, block: B:17:0x0049 A[LOOP:0: B:13:0x003a->B:17:0x0049, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:20:0x007e A[LOOP:1: B:19:0x007c->B:20:0x007e, LOOP_END] */
            /* JADX WARN: Code duplicated, block: B:21:0x004c A[SYNTHETIC] */
            /* JADX WARN: Code duplicated, block: B:22:0x0023 A[EDGE_INSN: B:22:0x0023->B:9:0x0023 BREAK  A[LOOP:0: B:13:0x003a->B:17:0x0049], SYNTHETIC] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002b -> B:12:0x002e). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // I6.a
            public final java.lang.Object invokeSuspend(java.lang.Object r15) {
                /*
                    r14 = this;
                    java.lang.Object r0 = H6.c.f()
                    int r1 = r14.f22779b
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r14.f22780c
                    b1.c r1 = (p011b1.InterfaceC1755c) r1
                    C6.r.b(r15)
                    goto L2e
                L13:
                    java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r15.<init>(r0)
                    throw r15
                L1b:
                    C6.r.b(r15)
                    java.lang.Object r15 = r14.f22780c
                    b1.c r15 = (p011b1.InterfaceC1755c) r15
                    r1 = r15
                L23:
                    r14.f22780c = r1
                    r14.f22779b = r2
                    java.lang.Object r15 = androidx.compose.foundation.gestures.a.a(r1, r14)
                    if (r15 != r0) goto L2e
                    return r0
                L2e:
                    b1.n r15 = (p011b1.C1766n) r15
                    java.util.List r3 = r15.c()
                    int r4 = r3.size()
                    r5 = 0
                    r6 = r5
                L3a:
                    if (r6 >= r4) goto L4c
                    java.lang.Object r7 = r3.get(r6)
                    b1.z r7 = (p011b1.z) r7
                    boolean r7 = r7.q()
                    if (r7 == 0) goto L49
                    goto L23
                L49:
                    int r6 = r6 + 1
                    goto L3a
                L4c:
                    g0.A r3 = r14.f22781d
                    g0.F r3 = r3.j2()
                    kotlin.jvm.internal.t.d(r3)
                    g0.A r4 = r14.f22781d
                    long r6 = r1.a()
                    long r6 = r3.a(r1, r15, r6)
                    g0.O r3 = p055g0.A.i2(r4)
                    b7.J r8 = r4.D1()
                    g0.A$a$a$a r11 = new g0.A$a$a$a
                    r4 = 0
                    r11.<init>(r3, r6, r4)
                    r12 = 3
                    r13 = 0
                    r9 = 0
                    r10 = 0
                    p017b7.AbstractC1785g.d(r8, r9, r10, r11, r12, r13)
                    java.util.List r15 = r15.c()
                    int r3 = r15.size()
                L7c:
                    if (r5 >= r3) goto L23
                    java.lang.Object r4 = r15.get(r5)
                    b1.z r4 = (p011b1.z) r4
                    r4.a()
                    int r5 = r5 + 1
                    goto L7c
                */
                throw new UnsupportedOperationException("Method not decompiled: g0.A.a.C0522a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            a aVar = A.this.new a(dVar);
            aVar.f22777b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i8, d dVar) {
            return ((a) create(i8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f22776a;
            if (i8 == 0) {
                r.b(obj);
                I i9 = (I) this.f22777b;
                C0522a c0522a = new C0522a(A.this, null);
                this.f22776a = 1;
                if (i9.a1(c0522a, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return G.f1419a;
        }
    }

    public A(O o8) {
        this.f22774p = o8;
        d2(S.a(new a(null)));
    }

    @Override // L0.i.c
    public void N1() {
        this.f22775q = AbstractC2327h.a(this);
    }

    public final F j2() {
        return this.f22775q;
    }
}
