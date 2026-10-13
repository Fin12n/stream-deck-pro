package M3;

import C6.G;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import p017b7.AbstractC1816w;
import p017b7.InterfaceC1812u;
import p135p0.Dyk.GOKsbdzhLhXAMt;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final p098k7.a f5158a = p098k7.c.b(false, 1, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AtomicInteger f5159b = new AtomicInteger(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Map f5160c = new LinkedHashMap();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5165e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f5166f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f5168h;

        public a(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5166f = obj;
            this.f5168h |= Integer.MIN_VALUE;
            return j.this.a(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5169a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5170b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5171c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5172d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f5173e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5175g;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5173e = obj;
            this.f5175g |= Integer.MIN_VALUE;
            return j.this.b(0, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5176a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5177b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5178c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f5179d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5181f;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5179d = obj;
            this.f5181f |= Integer.MIN_VALUE;
            return j.this.c(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5182a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5183b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5184c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5185d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f5186e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5188g;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5186e = obj;
            this.f5188g |= Integer.MIN_VALUE;
            return j.this.d(0, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Q6.o oVar, G6.d dVar) {
        a aVar;
        j jVar;
        InterfaceC1812u interfaceC1812u;
        p098k7.a aVar2;
        Q6.o oVar2;
        int i8;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i9 = aVar.f5168h;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                aVar.f5168h = i9 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f5166f;
        Object objF = H6.c.f();
        int i10 = aVar.f5168h;
        try {
            if (i10 == 0) {
                C6.r.b(obj);
                int andIncrement = this.f5159b.getAndIncrement();
                InterfaceC1812u interfaceC1812uB = AbstractC1816w.b(null, 1, null);
                p098k7.a aVar3 = this.f5158a;
                aVar.f5161a = this;
                aVar.f5162b = oVar;
                aVar.f5163c = interfaceC1812uB;
                aVar.f5164d = aVar3;
                aVar.f5165e = andIncrement;
                aVar.f5168h = 1;
                if (aVar3.b(null, aVar) != objF) {
                    jVar = this;
                    interfaceC1812u = interfaceC1812uB;
                    aVar2 = aVar3;
                    oVar2 = oVar;
                    i8 = andIncrement;
                }
            }
            if (i10 != 1) {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                InterfaceC1812u interfaceC1812u2 = (InterfaceC1812u) aVar.f5161a;
                C6.r.b(obj);
                return interfaceC1812u2;
            }
            i8 = aVar.f5165e;
            aVar2 = (p098k7.a) aVar.f5164d;
            interfaceC1812u = (InterfaceC1812u) aVar.f5163c;
            oVar2 = (Q6.o) aVar.f5162b;
            jVar = (j) aVar.f5161a;
            C6.r.b(obj);
            jVar.f5160c.put(I6.b.d(i8), interfaceC1812u);
            G g8 = G.f1419a;
            aVar2.e(null);
            Integer numD = I6.b.d(i8);
            aVar.f5161a = interfaceC1812u;
            aVar.f5162b = null;
            aVar.f5163c = null;
            aVar.f5164d = null;
            aVar.f5168h = 2;
            return oVar2.invoke(numD, aVar) == objF ? objF : interfaceC1812u;
        } catch (Throwable th) {
            aVar2.e(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(Throwable th, G6.d dVar) {
        c cVar;
        p098k7.a aVar;
        j jVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f5181f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f5181f = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f5179d;
        Object objF = H6.c.f();
        int i9 = cVar.f5181f;
        if (i9 == 0) {
            C6.r.b(obj);
            aVar = this.f5158a;
            cVar.f5176a = this;
            cVar.f5177b = th;
            cVar.f5178c = aVar;
            cVar.f5181f = 1;
            if (aVar.b(null, cVar) == objF) {
                return objF;
            }
            jVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p098k7.a aVar2 = (p098k7.a) cVar.f5178c;
            Throwable th2 = (Throwable) cVar.f5177b;
            jVar = (j) cVar.f5176a;
            C6.r.b(obj);
            aVar = aVar2;
            th = th2;
        }
        try {
            Iterator it = jVar.f5160c.keySet().iterator();
            while (it.hasNext()) {
                InterfaceC1812u interfaceC1812u = (InterfaceC1812u) jVar.f5160c.remove(I6.b.d(((Number) it.next()).intValue()));
                if (interfaceC1812u != null) {
                    I6.b.a(interfaceC1812u.v(th));
                }
            }
            G g8 = G.f1419a;
            return G.f1419a;
        } finally {
            aVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object d(int i8, Throwable th, G6.d dVar) {
        d dVar2;
        j jVar;
        Throwable th2;
        p098k7.a aVar;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i9 = dVar2.f5188g;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                dVar2.f5188g = i9 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f5186e;
        Object objF = H6.c.f();
        int i10 = dVar2.f5188g;
        if (i10 == 0) {
            C6.r.b(obj);
            p098k7.a aVar2 = this.f5158a;
            dVar2.f5182a = this;
            dVar2.f5183b = th;
            dVar2.f5184c = aVar2;
            dVar2.f5185d = i8;
            dVar2.f5188g = 1;
            if (aVar2.b(null, dVar2) == objF) {
                return objF;
            }
            jVar = this;
            th2 = th;
            aVar = aVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i8 = dVar2.f5185d;
            aVar = (p098k7.a) dVar2.f5184c;
            th2 = (Throwable) dVar2.f5183b;
            jVar = (j) dVar2.f5182a;
            C6.r.b(obj);
        }
        try {
            InterfaceC1812u interfaceC1812u = (InterfaceC1812u) jVar.f5160c.remove(I6.b.d(i8));
            aVar.e(null);
            if (interfaceC1812u != null) {
                I6.b.a(interfaceC1812u.v(th2));
            }
            return G.f1419a;
        } catch (Throwable th3) {
            aVar.e(null);
            throw th3;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(int i8, Object obj, G6.d dVar) {
        b bVar;
        j jVar;
        Object obj2;
        p098k7.a aVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i9 = bVar.f5175g;
            if ((i9 & Integer.MIN_VALUE) != 0) {
                bVar.f5175g = i9 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj3 = bVar.f5173e;
        Object objF = H6.c.f();
        int i10 = bVar.f5175g;
        if (i10 == 0) {
            C6.r.b(obj3);
            p098k7.a aVar2 = this.f5158a;
            bVar.f5169a = this;
            bVar.f5170b = obj;
            bVar.f5171c = aVar2;
            bVar.f5172d = i8;
            bVar.f5175g = 1;
            if (aVar2.b(null, bVar) == objF) {
                return objF;
            }
            jVar = this;
            obj2 = obj;
            aVar = aVar2;
        } else {
            if (i10 != 1) {
                throw new IllegalStateException(GOKsbdzhLhXAMt.BSufgyQSp);
            }
            i8 = bVar.f5172d;
            aVar = (p098k7.a) bVar.f5171c;
            obj2 = bVar.f5170b;
            jVar = (j) bVar.f5169a;
            C6.r.b(obj3);
        }
        try {
            InterfaceC1812u interfaceC1812u = (InterfaceC1812u) jVar.f5160c.remove(I6.b.d(i8));
            aVar.e(null);
            if (interfaceC1812u != null) {
                I6.b.a(interfaceC1812u.r1(obj2));
            }
            return G.f1419a;
        } catch (Throwable th) {
            aVar.e(null);
            throw th;
        }
    }
}
