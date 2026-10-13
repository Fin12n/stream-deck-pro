package p048f2;

import C6.C0918g;
import C6.G;
import C6.r;
import G6.d;
import I6.l;
import Q6.k;
import Q6.o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import kotlin.jvm.internal.t;

/* JADX INFO: renamed from: f2.i, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2306i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f21581a = new a(null);

    /* JADX INFO: renamed from: f2.i$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {

        /* JADX INFO: renamed from: f2.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0508a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21582a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f21583b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ List f21584c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0508a(List list, d dVar) {
                super(2, dVar);
                this.f21584c = list;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                C0508a c0508a = new C0508a(this.f21584c, dVar);
                c0508a.f21583b = obj;
                return c0508a;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(t tVar, d dVar) {
                return ((C0508a) create(tVar, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f21582a;
                if (i8 == 0) {
                    r.b(obj);
                    t tVar = (t) this.f21583b;
                    a aVar = C2306i.f21581a;
                    List list = this.f21584c;
                    this.f21582a = 1;
                    if (aVar.c(list, tVar, this) == objF) {
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

        /* JADX INFO: renamed from: f2.i$a$b */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f21585a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f21586b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f21587c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f21589e;

            public b(d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21587c = obj;
                this.f21589e |= Integer.MIN_VALUE;
                return a.this.c(null, null, this);
            }
        }

        /* JADX INFO: renamed from: f2.i$a$c */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f21590a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f21591b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public Object f21592c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public int f21593d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public /* synthetic */ Object f21594e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ List f21595f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            public final /* synthetic */ List f21596g;

            /* JADX INFO: renamed from: f2.i$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0509a extends l implements k {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f21597a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2305h f21598b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0509a(InterfaceC2305h interfaceC2305h, d dVar) {
                    super(1, dVar);
                    this.f21598b = interfaceC2305h;
                }

                @Override // I6.a
                public final d create(d dVar) {
                    return new C0509a(this.f21598b, dVar);
                }

                @Override // Q6.k
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(d dVar) {
                    return ((C0509a) create(dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f21597a;
                    if (i8 == 0) {
                        r.b(obj);
                        InterfaceC2305h interfaceC2305h = this.f21598b;
                        this.f21597a = 1;
                        if (interfaceC2305h.cleanUp(this) == objF) {
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
            public c(List list, List list2, d dVar) {
                super(2, dVar);
                this.f21595f = list;
                this.f21596g = list2;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                c cVar = new c(this.f21595f, this.f21596g, dVar);
                cVar.f21594e = obj;
                return cVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Object obj, d dVar) {
                return ((c) create(obj, dVar)).invokeSuspend(G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:13:0x004a  */
            /* JADX WARN: Code duplicated, block: B:16:0x0061  */
            /* JADX WARN: Code duplicated, block: B:19:0x006e  */
            /* JADX WARN: Code duplicated, block: B:22:0x0088  */
            /* JADX WARN: Code duplicated, block: B:23:0x008a  */
            /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
                jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
                	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
                	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
                	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
                */
            @Override // I6.a
            public final java.lang.Object invokeSuspend(java.lang.Object r10) {
                /*
                    r9 = this;
                    java.lang.Object r0 = H6.c.f()
                    int r1 = r9.f21593d
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L37
                    if (r1 == r3) goto L22
                    if (r1 != r2) goto L1a
                    java.lang.Object r1 = r9.f21590a
                    java.util.Iterator r1 = (java.util.Iterator) r1
                    java.lang.Object r4 = r9.f21594e
                    java.util.List r4 = (java.util.List) r4
                    C6.r.b(r10)
                    goto L44
                L1a:
                    java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r10.<init>(r0)
                    throw r10
                L22:
                    java.lang.Object r1 = r9.f21592c
                    java.lang.Object r4 = r9.f21591b
                    f2.h r4 = (p048f2.InterfaceC2305h) r4
                    java.lang.Object r5 = r9.f21590a
                    java.util.Iterator r5 = (java.util.Iterator) r5
                    java.lang.Object r6 = r9.f21594e
                    java.util.List r6 = (java.util.List) r6
                    C6.r.b(r10)
                    r8 = r6
                    r6 = r4
                    r4 = r8
                    goto L66
                L37:
                    C6.r.b(r10)
                    java.lang.Object r10 = r9.f21594e
                    java.util.List r1 = r9.f21595f
                    java.util.List r4 = r9.f21596g
                    java.util.Iterator r1 = r1.iterator()
                L44:
                    boolean r5 = r1.hasNext()
                    if (r5 == 0) goto L8c
                    java.lang.Object r5 = r1.next()
                    f2.h r5 = (p048f2.InterfaceC2305h) r5
                    r9.f21594e = r4
                    r9.f21590a = r1
                    r9.f21591b = r5
                    r9.f21592c = r10
                    r9.f21593d = r3
                    java.lang.Object r6 = r5.shouldMigrate(r10, r9)
                    if (r6 != r0) goto L61
                    goto L87
                L61:
                    r8 = r1
                    r1 = r10
                    r10 = r6
                    r6 = r5
                    r5 = r8
                L66:
                    java.lang.Boolean r10 = (java.lang.Boolean) r10
                    boolean r10 = r10.booleanValue()
                    if (r10 == 0) goto L8a
                    f2.i$a$c$a r10 = new f2.i$a$c$a
                    r7 = 0
                    r10.<init>(r6, r7)
                    r4.add(r10)
                    r9.f21594e = r4
                    r9.f21590a = r5
                    r9.f21591b = r7
                    r9.f21592c = r7
                    r9.f21593d = r2
                    java.lang.Object r10 = r6.migrate(r1, r9)
                    if (r10 != r0) goto L88
                L87:
                    return r0
                L88:
                    r1 = r5
                    goto L44
                L8a:
                    r10 = r1
                    goto L88
                L8c:
                    return r10
                */
                throw new UnsupportedOperationException("Method not decompiled: p048f2.C2306i.a.c.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final o b(List migrations) {
            t.g(migrations, "migrations");
            return new C0508a(migrations, null);
        }

        /* JADX WARN: Code duplicated, block: B:27:0x006f  */
        /* JADX WARN: Code duplicated, block: B:37:0x0098  */
        /* JADX WARN: Code duplicated, block: B:39:0x009b  */
        /* JADX WARN: Code duplicated, block: B:43:0x0081 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:45:? A[LOOP:0: B:25:0x0069->B:45:?, LOOP_END, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0086 -> B:25:0x0069). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0089 -> B:25:0x0069). Please report as a decompilation issue!!! */
        public final Object c(List list, t tVar, d dVar) throws Throwable {
            b bVar;
            List list2;
            J j8;
            Iterator it;
            Throwable th;
            k kVar;
            if (dVar instanceof b) {
                bVar = (b) dVar;
                int i8 = bVar.f21589e;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    bVar.f21589e = i8 - Integer.MIN_VALUE;
                } else {
                    bVar = new b(dVar);
                }
            } else {
                bVar = new b(dVar);
            }
            Object obj = bVar.f21587c;
            Object objF = H6.c.f();
            int i9 = bVar.f21589e;
            if (i9 == 0) {
                r.b(obj);
                ArrayList arrayList = new ArrayList();
                o cVar = new c(list, arrayList, null);
                bVar.f21585a = arrayList;
                bVar.f21589e = 1;
                if (tVar.b(cVar, bVar) != objF) {
                    list2 = arrayList;
                }
                return objF;
            }
            if (i9 == 1) {
                list2 = (List) bVar.f21585a;
                r.b(obj);
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                it = (Iterator) bVar.f21586b;
                j8 = (J) bVar.f21585a;
                try {
                    r.b(obj);
                } catch (Throwable th2) {
                    Object obj2 = j8.f28779a;
                    if (obj2 == null) {
                        j8.f28779a = th2;
                    } else {
                        t.d(obj2);
                        C0918g.a((Throwable) obj2, th2);
                    }
                }
            }
            while (it.hasNext()) {
                kVar = (k) it.next();
                bVar.f21585a = j8;
                bVar.f21586b = it;
                bVar.f21589e = 2;
                if (kVar.invoke(bVar) == objF) {
                    return objF;
                }
            }
            th = (Throwable) j8.f28779a;
            if (th == null) {
                return G.f1419a;
            }
            throw th;
            j8 = new J();
            it = list2.iterator();
            while (it.hasNext()) {
                kVar = (k) it.next();
                bVar.f21585a = j8;
                bVar.f21586b = it;
                bVar.f21589e = 2;
                if (kVar.invoke(bVar) == objF) {
                    return objF;
                }
            }
            th = (Throwable) j8.f28779a;
            if (th == null) {
                return G.f1419a;
            }
            throw th;
        }

        public a() {
        }
    }
}
