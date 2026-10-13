package p159s0;

import C6.G;
import C6.r;
import I6.l;
import L0.i;
import Q6.k;
import Q6.o;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.u;
import p011b1.AbstractC1767o;
import p011b1.AbstractC1770s;
import p011b1.C1766n;
import p011b1.I;
import p011b1.InterfaceC1755c;
import p011b1.N;
import p011b1.S;
import p011b1.z;
import p055g0.AbstractC2335p;
import p055g0.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class v {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f32819a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f32820b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f32821c;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f32820b = obj;
            this.f32821c |= Integer.MIN_VALUE;
            return v.d(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f32822a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f32823b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f32824c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f32825d;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f32824c = obj;
            this.f32825d |= Integer.MIN_VALUE;
            return v.g(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2887i f32826a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC2887i interfaceC2887i) {
            super(1);
            this.f32826a = interfaceC2887i;
        }

        public final void b(z zVar) {
            if (this.f32826a.b(zVar.i())) {
                zVar.a();
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((z) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2887i f32827a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ t f32828b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC2887i interfaceC2887i, t tVar) {
            super(1);
            this.f32827a = interfaceC2887i;
            this.f32828b = tVar;
        }

        public final void b(z zVar) {
            if (this.f32827a.c(zVar.i(), this.f32828b)) {
                zVar.a();
            }
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((z) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32829a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f32830b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2887i f32831c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p143q0.G f32832d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.k implements o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f32833b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f32834c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2887i f32835d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ C2882d f32836e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ p143q0.G f32837f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC2887i interfaceC2887i, C2882d c2882d, p143q0.G g8, G6.d dVar) {
                super(2, dVar);
                this.f32835d = interfaceC2887i;
                this.f32836e = c2882d;
                this.f32837f = g8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f32835d, this.f32836e, this.f32837f, dVar);
                aVar.f32834c = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
                return ((a) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:26:0x0074, code lost:
            
                if (p159s0.v.g(r1, r2, r4, r10, r9) == r0) goto L32;
             */
            /* JADX WARN: Code restructure failed: missing block: B:31:0x0087, code lost:
            
                if (p159s0.v.i(r1, r3, r10, r9) == r0) goto L32;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                InterfaceC1755c interfaceC1755c;
                Object objF = H6.c.f();
                int i8 = this.f32833b;
                if (i8 == 0) {
                    r.b(obj);
                    interfaceC1755c = (InterfaceC1755c) this.f32834c;
                    this.f32834c = interfaceC1755c;
                    this.f32833b = 1;
                    obj = v.d(interfaceC1755c, this);
                    if (obj != objF) {
                    }
                    return objF;
                }
                if (i8 == 1) {
                    interfaceC1755c = (InterfaceC1755c) this.f32834c;
                    r.b(obj);
                } else {
                    if (i8 != 2 && i8 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
                C1766n c1766n = (C1766n) obj;
                if (v.f(c1766n) && AbstractC1770s.b(c1766n.b())) {
                    List listC = c1766n.c();
                    int size = listC.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size) {
                            InterfaceC2887i interfaceC2887i = this.f32835d;
                            C2882d c2882d = this.f32836e;
                            this.f32834c = null;
                            this.f32833b = 2;
                        } else {
                            if (((z) listC.get(i9)).q()) {
                                break;
                            }
                            i9++;
                        }
                    }
                }
                if (!v.f(c1766n)) {
                    p143q0.G g8 = this.f32837f;
                    this.f32834c = null;
                    this.f32833b = 3;
                }
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC2887i interfaceC2887i, p143q0.G g8, G6.d dVar) {
            super(2, dVar);
            this.f32831c = interfaceC2887i;
            this.f32832d = g8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            e eVar = new e(this.f32831c, this.f32832d, dVar);
            eVar.f32830b = obj;
            return eVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i8, G6.d dVar) {
            return ((e) create(i8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f32829a;
            if (i8 == 0) {
                r.b(obj);
                I i9 = (I) this.f32830b;
                a aVar = new a(this.f32831c, new C2882d(i9.getViewConfiguration()), this.f32832d, null);
                this.f32829a = 1;
                if (x.c(i9, aVar, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f32838a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f32839b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f32840c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f32841d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f32842e;

        public f(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f32841d = obj;
            this.f32842e |= Integer.MIN_VALUE;
            return v.i(null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ p143q0.G f32843a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(p143q0.G g8) {
            super(1);
            this.f32843a = g8;
        }

        public final void b(z zVar) {
            this.f32843a.e(AbstractC1767o.g(zVar));
            zVar.a();
        }

        @Override // Q6.k
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((z) obj);
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f32844a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f32845b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f32846c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.k implements o {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f32847b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f32848c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ k f32849d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, G6.d dVar) {
                super(2, dVar);
                this.f32849d = kVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f32849d, dVar);
                aVar.f32848c = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC1755c interfaceC1755c, G6.d dVar) {
                return ((a) create(interfaceC1755c, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:11:0x002f A[RETURN] */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002d -> B:12:0x0030). Please report as a decompilation issue!!! */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002f
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // I6.a
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    java.lang.Object r0 = H6.c.f()
                    int r1 = r4.f32847b
                    r2 = 1
                    if (r1 == 0) goto L1b
                    if (r1 != r2) goto L13
                    java.lang.Object r1 = r4.f32848c
                    b1.c r1 = (p011b1.InterfaceC1755c) r1
                    C6.r.b(r5)
                    goto L30
                L13:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L1b:
                    C6.r.b(r5)
                    java.lang.Object r5 = r4.f32848c
                    b1.c r5 = (p011b1.InterfaceC1755c) r5
                    r1 = r5
                L23:
                    b1.p r5 = p011b1.EnumC1768p.Initial
                    r4.f32848c = r1
                    r4.f32847b = r2
                    java.lang.Object r5 = r1.e1(r5, r4)
                    if (r5 != r0) goto L30
                    return r0
                L30:
                    b1.n r5 = (p011b1.C1766n) r5
                    Q6.k r3 = r4.f32849d
                    boolean r5 = p159s0.v.f(r5)
                    r5 = r5 ^ r2
                    java.lang.Boolean r5 = I6.b.a(r5)
                    r3.invoke(r5)
                    goto L23
                */
                throw new UnsupportedOperationException("Method not decompiled: s0.v.h.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(k kVar, G6.d dVar) {
            super(2, dVar);
            this.f32846c = kVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            h hVar = new h(this.f32846c, dVar);
            hVar.f32845b = obj;
            return hVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I i8, G6.d dVar) {
            return ((h) create(i8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f32844a;
            if (i8 == 0) {
                r.b(obj);
                I i9 = (I) this.f32845b;
                a aVar = new a(this.f32846c, null);
                this.f32844a = 1;
                if (i9.a1(aVar, this) == objF) {
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

    /* JADX WARN: Code duplicated, block: B:17:0x0044 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:20:0x0052  */
    /* JADX WARN: Code duplicated, block: B:23:0x005f A[LOOP:0: B:19:0x0050->B:23:0x005f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:26:0x0038 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0042 -> B:18:0x0045). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object d(p011b1.InterfaceC1755c r7, G6.d r8) {
        /*
            boolean r0 = r8 instanceof s0.v.a
            if (r0 == 0) goto L13
            r0 = r8
            s0.v$a r0 = (s0.v.a) r0
            int r1 = r0.f32821c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f32821c = r1
            goto L18
        L13:
            s0.v$a r0 = new s0.v$a
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f32820b
            java.lang.Object r1 = H6.c.f()
            int r2 = r0.f32821c
            r3 = 1
            if (r2 == 0) goto L35
            if (r2 != r3) goto L2d
            java.lang.Object r7 = r0.f32819a
            b1.c r7 = (p011b1.InterfaceC1755c) r7
            C6.r.b(r8)
            goto L45
        L2d:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L35:
            C6.r.b(r8)
        L38:
            b1.p r8 = p011b1.EnumC1768p.Main
            r0.f32819a = r7
            r0.f32821c = r3
            java.lang.Object r8 = r7.e1(r8, r0)
            if (r8 != r1) goto L45
            return r1
        L45:
            b1.n r8 = (p011b1.C1766n) r8
            java.util.List r2 = r8.c()
            int r4 = r2.size()
            r5 = 0
        L50:
            if (r5 >= r4) goto L62
            java.lang.Object r6 = r2.get(r5)
            b1.z r6 = (p011b1.z) r6
            boolean r6 = p011b1.AbstractC1767o.b(r6)
            if (r6 != 0) goto L5f
            goto L38
        L5f:
            int r5 = r5 + 1
            goto L50
        L62:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p159s0.v.d(b1.c, G6.d):java.lang.Object");
    }

    public static final boolean e(InterfaceC1755c interfaceC1755c, long j8, long j9) {
        return Q0.f.m(Q0.f.s(j8, j9)) < interfaceC1755c.getViewConfiguration().f();
    }

    public static final boolean f(C1766n c1766n) {
        List listC = c1766n.c();
        int size = listC.size();
        for (int i8 = 0; i8 < size; i8++) {
            if (!N.g(((z) listC.get(i8)).o(), N.f15698a.b())) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007f, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e7, code lost:
    
        if (r11 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e9, code lost:
    
        return r1;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object g(InterfaceC1755c interfaceC1755c, InterfaceC2887i interfaceC2887i, C2882d c2882d, C1766n c1766n, G6.d dVar) {
        b bVar;
        t tVarL;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f32825d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f32825d = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objE = bVar.f32824c;
        Object objF = H6.c.f();
        int i9 = bVar.f32825d;
        int i10 = 0;
        if (i9 == 0) {
            r.b(objE);
            c2882d.d(c1766n);
            z zVar = (z) c1766n.c().get(0);
            if (!K.a(c1766n)) {
                int iA = c2882d.a();
                if (iA != 1) {
                    tVarL = iA != 2 ? t.f32803a.m() : t.f32803a.n();
                } else {
                    tVarL = t.f32803a.l();
                }
                if (interfaceC2887i.a(zVar.i(), tVarL)) {
                    long jG = zVar.g();
                    d dVar2 = new d(interfaceC2887i, tVarL);
                    bVar.f32822a = interfaceC1755c;
                    bVar.f32823b = interfaceC2887i;
                    bVar.f32825d = 2;
                    objE = AbstractC2335p.e(interfaceC1755c, jG, dVar2, bVar);
                }
            } else if (interfaceC2887i.e(zVar.i())) {
                long jG2 = zVar.g();
                c cVar = new c(interfaceC2887i);
                bVar.f32822a = interfaceC1755c;
                bVar.f32823b = interfaceC2887i;
                bVar.f32825d = 1;
                objE = AbstractC2335p.e(interfaceC1755c, jG2, cVar, bVar);
            }
        } else if (i9 == 1) {
            interfaceC2887i = (InterfaceC2887i) bVar.f32823b;
            interfaceC1755c = (InterfaceC1755c) bVar.f32822a;
            r.b(objE);
            if (((Boolean) objE).booleanValue()) {
                List listC = interfaceC1755c.E().c();
                int size = listC.size();
                while (i10 < size) {
                    z zVar2 = (z) listC.get(i10);
                    if (AbstractC1767o.c(zVar2)) {
                        zVar2.a();
                    }
                    i10++;
                }
            }
            interfaceC2887i.d();
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2887i = (InterfaceC2887i) bVar.f32823b;
            interfaceC1755c = (InterfaceC1755c) bVar.f32822a;
            r.b(objE);
            if (((Boolean) objE).booleanValue()) {
                List listC2 = interfaceC1755c.E().c();
                int size2 = listC2.size();
                while (i10 < size2) {
                    z zVar3 = (z) listC2.get(i10);
                    if (AbstractC1767o.c(zVar3)) {
                        zVar3.a();
                    }
                    i10++;
                }
            }
            interfaceC2887i.d();
        }
        return G.f1419a;
    }

    public static final i h(i iVar, InterfaceC2887i interfaceC2887i, p143q0.G g8) {
        return S.d(iVar, interfaceC2887i, g8, new e(interfaceC2887i, g8, null));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00a3, code lost:
    
        if (r12 == r1) goto L32;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object i(InterfaceC1755c interfaceC1755c, p143q0.G g8, C1766n c1766n, G6.d dVar) {
        f fVar;
        z zVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i8 = fVar.f32842e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                fVar.f32842e = i8 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object objC = fVar.f32841d;
        Object objF = H6.c.f();
        int i9 = fVar.f32842e;
        try {
            if (i9 == 0) {
                r.b(objC);
                zVar = (z) D6.z.i0(c1766n.c());
                long jG = zVar.g();
                fVar.f32838a = interfaceC1755c;
                fVar.f32839b = g8;
                fVar.f32840c = zVar;
                fVar.f32842e = 1;
                objC = AbstractC2335p.c(interfaceC1755c, jG, fVar);
                if (objC == objF) {
                }
                return objF;
            }
            if (i9 == 1) {
                z zVar2 = (z) fVar.f32840c;
                g8 = (p143q0.G) fVar.f32839b;
                InterfaceC1755c interfaceC1755c2 = (InterfaceC1755c) fVar.f32838a;
                r.b(objC);
                zVar = zVar2;
                interfaceC1755c = interfaceC1755c2;
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g8 = (p143q0.G) fVar.f32839b;
                interfaceC1755c = (InterfaceC1755c) fVar.f32838a;
                r.b(objC);
            }
            if (((Boolean) objC).booleanValue()) {
                List listC = interfaceC1755c.E().c();
                int size = listC.size();
                for (int i10 = 0; i10 < size; i10++) {
                    z zVar3 = (z) listC.get(i10);
                    if (AbstractC1767o.c(zVar3)) {
                        zVar3.a();
                    }
                }
                g8.c();
            } else {
                g8.onCancel();
            }
            return G.f1419a;
            z zVar4 = (z) objC;
            if (zVar4 != null && e(interfaceC1755c, zVar.i(), zVar4.i())) {
                g8.b(zVar4.i());
                long jG2 = zVar4.g();
                g gVar = new g(g8);
                fVar.f32838a = interfaceC1755c;
                fVar.f32839b = g8;
                fVar.f32840c = null;
                fVar.f32842e = 2;
                objC = AbstractC2335p.e(interfaceC1755c, jG2, gVar, fVar);
            }
            return G.f1419a;
        } catch (CancellationException e8) {
            g8.onCancel();
            throw e8;
        }
    }

    public static final i j(i iVar, k kVar) {
        return S.c(iVar, 8675309, new h(kVar, null));
    }
}
