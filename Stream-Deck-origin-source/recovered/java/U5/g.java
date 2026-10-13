package U5;

import C6.G;
import C6.r;
import I6.l;
import M5.k;
import Q6.o;
import io.ktor.utils.io.i;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1815v0;
import p017b7.InterfaceC1818x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final T5.d f10226a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G5.a f10227b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10228a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10229b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f10231d;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f10229b = obj;
            this.f10231d |= Integer.MIN_VALUE;
            return g.this.b(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f10232a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f10233b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f10234c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f10236e;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f10234c = obj;
            this.f10236e |= Integer.MIN_VALUE;
            return g.this.d(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f10237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f10238b;

        public c(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            c cVar = new c(dVar);
            cVar.f10238b = obj;
            return cVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(U5.c cVar, G6.d dVar) {
            return ((c) create(cVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f10237a;
            if (i8 == 0) {
                r.b(obj);
                H5.b bVarG1 = ((U5.c) this.f10238b).g1();
                this.f10237a = 1;
                obj = H5.d.a(bVarG1, this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            return ((H5.b) obj).g();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public /* synthetic */ Object f10239a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f10241c;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f10239a = obj;
            this.f10241c |= Integer.MIN_VALUE;
            return g.this.e(this);
        }
    }

    public g(T5.d builder, G5.a client) {
        t.g(builder, "builder");
        t.g(client, "client");
        this.f10226a = builder;
        this.f10227b = client;
        a();
    }

    public final void a() {
        Set setKeySet;
        Map map = (Map) this.f10226a.c().e(J5.f.a());
        if (map == null || (setKeySet = map.keySet()) == null) {
            return;
        }
        ArrayList<k> arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            if (obj instanceof k) {
                arrayList.add(obj);
            }
        }
        for (k kVar : arrayList) {
            if (M5.l.c(this.f10227b, kVar) == null) {
                throw new IllegalArgumentException(("Consider installing " + kVar + " plugin because the request requires it to be installed").toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(U5.c cVar, G6.d dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i8 = aVar.f10231d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                aVar.f10231d = i8 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f10229b;
        Object objF = H6.c.f();
        int i9 = aVar.f10231d;
        if (i9 == 0) {
            r.b(obj);
            G6.g.b bVarA = cVar.getCoroutineContext().A(InterfaceC1815v0.f15985O);
            t.d(bVarA);
            InterfaceC1818x interfaceC1818x = (InterfaceC1818x) bVarA;
            interfaceC1818x.i1();
            try {
                i.a(cVar.b());
            } catch (Throwable unused) {
            }
            aVar.f10228a = interfaceC1818x;
            aVar.f10231d = 1;
            if (interfaceC1818x.i0(aVar) == objF) {
                return objF;
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
        }
        return G.f1419a;
    }

    public final Object c(G6.d dVar) {
        return d(new c(null), dVar);
    }

    /* JADX WARN: Code duplicated, block: B:44:0x0095  */
    /* JADX WARN: Code duplicated, block: B:45:0x0096 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a2, code lost:
    
        if (r2.b(r11, r0) == r1) goto L49;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(o oVar, G6.d dVar) throws Throwable {
        b bVar;
        g gVar;
        U5.c cVar;
        U5.c cVar2;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f10236e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f10236e = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object objE = bVar.f10234c;
        Object objF = H6.c.f();
        int i9 = bVar.f10236e;
        try {
            try {
                if (i9 == 0) {
                    r.b(objE);
                    bVar.f10232a = this;
                    bVar.f10233b = oVar;
                    bVar.f10236e = 1;
                    objE = e(bVar);
                    if (objE != objF) {
                        gVar = this;
                    }
                    return objF;
                }
                if (i9 == 1) {
                    oVar = (o) bVar.f10233b;
                    gVar = (g) bVar.f10232a;
                    r.b(objE);
                } else {
                    if (i9 != 2) {
                        if (i9 == 3) {
                            Object obj = bVar.f10232a;
                            r.b(objE);
                            return obj;
                        }
                        if (i9 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        th = (Throwable) bVar.f10232a;
                        r.b(objE);
                        throw th;
                    }
                    cVar2 = (U5.c) bVar.f10233b;
                    gVar = (g) bVar.f10232a;
                    try {
                        r.b(objE);
                        bVar.f10232a = objE;
                        bVar.f10233b = null;
                        bVar.f10236e = 3;
                        if (gVar.b(cVar2, bVar) != objF) {
                            return objF;
                        }
                        return objE;
                    } catch (Throwable th) {
                        cVar = cVar2;
                        th = th;
                        bVar.f10232a = th;
                        bVar.f10233b = null;
                        bVar.f10236e = 4;
                    }
                }
                bVar.f10232a = gVar;
                bVar.f10233b = cVar;
                bVar.f10236e = 2;
                Object objInvoke = oVar.invoke(cVar, bVar);
                if (objInvoke != objF) {
                    objE = objInvoke;
                    cVar2 = cVar;
                    bVar.f10232a = objE;
                    bVar.f10233b = null;
                    bVar.f10236e = 3;
                    if (gVar.b(cVar2, bVar) != objF) {
                        return objE;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                bVar.f10232a = th;
                bVar.f10233b = null;
                bVar.f10236e = 4;
            }
            cVar = (U5.c) objE;
            return objF;
        } catch (CancellationException e8) {
            throw V5.e.a(e8);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(G6.d dVar) throws Throwable {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f10241c;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f10241c = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object objJ = dVar2.f10239a;
        Object objF = H6.c.f();
        int i9 = dVar2.f10241c;
        try {
            if (i9 == 0) {
                r.b(objJ);
                T5.d dVarP = new T5.d().p(this.f10226a);
                G5.a aVar = this.f10227b;
                dVar2.f10241c = 1;
                objJ = aVar.j(dVarP, dVar2);
                if (objJ == objF) {
                    return objF;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(objJ);
            }
            return ((H5.b) objJ).g();
        } catch (CancellationException e8) {
            throw V5.e.a(e8);
        }
    }

    public String toString() {
        return "HttpStatement[" + this.f10226a.i() + ']';
    }
}
