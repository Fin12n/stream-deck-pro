package N3;

import C6.G;
import D6.w;
import D6.z;
import com.elgato.streamdeck.vsd2.Endpoint;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.H;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f[] f5831a;

        /* JADX INFO: renamed from: N3.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0216a extends u implements Function0 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f[] f5832a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0216a(InterfaceC2260f[] interfaceC2260fArr) {
                super(0);
                this.f5832a = interfaceC2260fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new List[this.f5832a.length];
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5833a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5834b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f5835c;

            public b(G6.d dVar) {
                super(3, dVar);
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2261g interfaceC2261g, Object[] objArr, G6.d dVar) {
                b bVar = new b(dVar);
                bVar.f5834b = interfaceC2261g;
                bVar.f5835c = objArr;
                return bVar.invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f5833a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f5834b;
                    List listD = c.d((List[]) ((Object[]) this.f5835c));
                    this.f5833a = 1;
                    if (interfaceC2261g.emit(listD, this) == objF) {
                        return objF;
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

        public a(InterfaceC2260f[] interfaceC2260fArr) {
            this.f5831a = interfaceC2260fArr;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            InterfaceC2260f[] interfaceC2260fArr = this.f5831a;
            Object objA = p053f7.l.a(interfaceC2261g, interfaceC2260fArr, new C0216a(interfaceC2260fArr), new b(null), dVar);
            return objA == H6.c.f() ? objA : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f5836a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f5837a;

            /* JADX INFO: renamed from: N3.c$b$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0217a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f5838a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f5839b;

                public C0217a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f5838a = obj;
                    this.f5839b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f5837a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0217a c0217a;
                if (dVar instanceof C0217a) {
                    c0217a = (C0217a) dVar;
                    int i8 = c0217a.f5839b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0217a.f5839b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0217a = new C0217a(dVar);
                    }
                } else {
                    c0217a = new C0217a(dVar);
                }
                Object obj2 = c0217a.f5838a;
                Object objF = H6.c.f();
                int i9 = c0217a.f5839b;
                if (i9 == 0) {
                    C6.r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f5837a;
                    if (!((List) obj).isEmpty()) {
                        c0217a.f5839b = 1;
                        if (interfaceC2261g.emit(obj, c0217a) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj2);
                }
                return G.f1419a;
            }
        }

        public b(InterfaceC2260f interfaceC2260f) {
            this.f5836a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f5836a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: renamed from: N3.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0218c extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5841a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5842b;

        public C0218c(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            C0218c c0218c = new C0218c(dVar);
            c0218c.f5842b = obj;
            return c0218c;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            return ((C0218c) create(interfaceC2261g, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5841a;
            if (i8 == 0) {
                C6.r.b(obj);
                InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f5842b;
                List listN = D6.r.n();
                this.f5841a = 1;
                if (interfaceC2261g.emit(listN, this) == objF) {
                    return objF;
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

    public static final N3.b a(J scope, InterfaceC2260f... sources) {
        t.g(scope, "scope");
        t.g(sources, "sources");
        ArrayList arrayList = new ArrayList(sources.length);
        for (InterfaceC2260f interfaceC2260f : sources) {
            arrayList.add(AbstractC2262h.N(interfaceC2260f, new C0218c(null)));
        }
        return new N3.b(AbstractC2262h.S(new b(new a((InterfaceC2260f[]) z.R0(arrayList).toArray(new InterfaceC2260f[0]))), scope, H.a.b(H.f20929a, 1000L, 0L, 2, null), 1));
    }

    public static final p c(p pVar, p pVar2) {
        String strD;
        String strF = pVar.f();
        List listE = pVar.e();
        if (listE != null && listE.isEmpty()) {
            strD = pVar2.d();
            break;
        }
        Iterator it = listE.iterator();
        while (true) {
            if (!it.hasNext()) {
                strD = pVar2.d();
                break;
            }
            if (((Endpoint) it.next()).getSource() == Endpoint.Source.BONJOUR) {
                strD = pVar.d();
                break;
            }
        }
        List listU0 = z.U0(pVar.e());
        for (Endpoint endpoint : pVar2.e()) {
            if (listU0 == null || !listU0.isEmpty()) {
                Iterator it2 = listU0.iterator();
                do {
                    if (it2.hasNext()) {
                    }
                } while (!t.c(((Endpoint) it2.next()).getHost(), endpoint.getHost()));
            }
            listU0.add(endpoint);
        }
        return new p(strF, strD, listU0, null);
    }

    public static final List d(List[] listArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList<p> arrayList = new ArrayList();
        for (List list : listArr) {
            w.D(arrayList, z.Z(list));
        }
        for (p pVar : arrayList) {
            p pVar2 = (p) linkedHashMap.get(P3.i.a(pVar.f()));
            if (pVar2 == null) {
                linkedHashMap.put(P3.i.a(pVar.f()), pVar);
            } else {
                linkedHashMap.put(P3.i.a(pVar.f()), c(pVar2, pVar));
            }
        }
        return z.R0(linkedHashMap.values());
    }
}
