package p044e7;

import C6.G;
import C6.r;
import Q6.o;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.J;
import p053f7.C2319a;
import p053f7.p;
import p053f7.t;

/* JADX INFO: renamed from: e7.s, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2272s {

    /* JADX INFO: renamed from: e7.s$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2261g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f21128a;

        public a(J j8) {
            this.f21128a = j8;
        }

        @Override // p044e7.InterfaceC2261g
        public Object emit(Object obj, G6.d dVar) {
            this.f21128a.f28779a = obj;
            throw new C2319a(this);
        }
    }

    /* JADX INFO: renamed from: e7.s$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2261g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f21129a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f21130b;

        /* JADX INFO: renamed from: e7.s$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f21131a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f21132b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f21133c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f21135e;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21132b = obj;
                this.f21133c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(o oVar, J j8) {
            this.f21129a = oVar;
            this.f21130b = j8;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p044e7.InterfaceC2261g
        public Object emit(Object obj, G6.d dVar) {
            a aVar;
            b bVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21133c;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21133c = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objInvoke = aVar.f21132b;
            Object objF = H6.c.f();
            int i9 = aVar.f21133c;
            if (i9 == 0) {
                r.b(objInvoke);
                o oVar = this.f21129a;
                aVar.f21131a = this;
                aVar.f21135e = obj;
                aVar.f21133c = 1;
                kotlin.jvm.internal.r.a(6);
                objInvoke = oVar.invoke(obj, aVar);
                kotlin.jvm.internal.r.a(7);
                if (objInvoke == objF) {
                    return objF;
                }
                bVar = this;
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f21135e;
                bVar = (b) aVar.f21131a;
                r.b(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return G.f1419a;
            }
            bVar.f21130b.f28779a = obj;
            throw new C2319a(bVar);
        }
    }

    /* JADX INFO: renamed from: e7.s$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21136a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21137b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21138c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21139d;

        public c(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21138c = obj;
            this.f21139d |= Integer.MIN_VALUE;
            return AbstractC2262h.x(null, this);
        }
    }

    /* JADX INFO: renamed from: e7.s$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21140a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21141b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f21142c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f21143d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f21144e;

        public d(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21143d = obj;
            this.f21144e |= Integer.MIN_VALUE;
            return AbstractC2262h.y(null, null, this);
        }
    }

    /* JADX INFO: renamed from: e7.s$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements InterfaceC2261g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ J f21145a;

        public e(J j8) {
            this.f21145a = j8;
        }

        @Override // p044e7.InterfaceC2261g
        public Object emit(Object obj, G6.d dVar) {
            this.f21145a.f28779a = obj;
            throw new C2319a(this);
        }
    }

    /* JADX INFO: renamed from: e7.s$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements InterfaceC2261g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f21146a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ J f21147b;

        /* JADX INFO: renamed from: e7.s$f$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f21148a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f21149b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f21150c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f21152e;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21149b = obj;
                this.f21150c |= Integer.MIN_VALUE;
                return f.this.emit(null, this);
            }
        }

        public f(o oVar, J j8) {
            this.f21146a = oVar;
            this.f21147b = j8;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p044e7.InterfaceC2261g
        public Object emit(Object obj, G6.d dVar) {
            a aVar;
            f fVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21150c;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21150c = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objInvoke = aVar.f21149b;
            Object objF = H6.c.f();
            int i9 = aVar.f21150c;
            if (i9 == 0) {
                r.b(objInvoke);
                o oVar = this.f21146a;
                aVar.f21148a = this;
                aVar.f21152e = obj;
                aVar.f21150c = 1;
                kotlin.jvm.internal.r.a(6);
                objInvoke = oVar.invoke(obj, aVar);
                kotlin.jvm.internal.r.a(7);
                if (objInvoke == objF) {
                    return objF;
                }
                fVar = this;
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                obj = aVar.f21152e;
                fVar = (f) aVar.f21148a;
                r.b(objInvoke);
            }
            if (!((Boolean) objInvoke).booleanValue()) {
                return G.f1419a;
            }
            fVar.f21147b.f28779a = obj;
            throw new C2319a(fVar);
        }
    }

    /* JADX INFO: renamed from: e7.s$g */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21153a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21154b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21155c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21156d;

        public g(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21155c = obj;
            this.f21156d |= Integer.MIN_VALUE;
            return AbstractC2262h.z(null, this);
        }
    }

    /* JADX INFO: renamed from: e7.s$h */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f21157a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f21158b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f21159c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f21160d;

        public h(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f21159c = obj;
            this.f21160d |= Integer.MIN_VALUE;
            return AbstractC2262h.A(null, null, this);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object a(InterfaceC2260f interfaceC2260f, G6.d dVar) {
        c cVar;
        J j8;
        C2319a e8;
        InterfaceC2261g interfaceC2261g;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i8 = cVar.f21139d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                cVar.f21139d = i8 - Integer.MIN_VALUE;
            } else {
                cVar = new c(dVar);
            }
        } else {
            cVar = new c(dVar);
        }
        Object obj = cVar.f21138c;
        Object objF = H6.c.f();
        int i9 = cVar.f21139d;
        if (i9 == 0) {
            r.b(obj);
            J j9 = new J();
            j9.f28779a = t.f22340a;
            InterfaceC2261g aVar = new a(j9);
            try {
                cVar.f21136a = j9;
                cVar.f21137b = aVar;
                cVar.f21139d = 1;
                if (interfaceC2260f.collect(aVar, cVar) == objF) {
                    return objF;
                }
                j8 = j9;
            } catch (C2319a e9) {
                j8 = j9;
                e8 = e9;
                interfaceC2261g = aVar;
                p.a(e8, interfaceC2261g);
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2261g = (a) cVar.f21137b;
            j8 = (J) cVar.f21136a;
            try {
                r.b(obj);
            } catch (C2319a e10) {
                e8 = e10;
                p.a(e8, interfaceC2261g);
            }
        }
        Object obj2 = j8.f28779a;
        if (obj2 != t.f22340a) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object b(InterfaceC2260f interfaceC2260f, o oVar, G6.d dVar) {
        d dVar2;
        o oVar2;
        J j8;
        C2319a e8;
        InterfaceC2261g interfaceC2261g;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i8 = dVar2.f21144e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                dVar2.f21144e = i8 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(dVar);
            }
        } else {
            dVar2 = new d(dVar);
        }
        Object obj = dVar2.f21143d;
        Object objF = H6.c.f();
        int i9 = dVar2.f21144e;
        if (i9 == 0) {
            r.b(obj);
            J j9 = new J();
            j9.f28779a = t.f22340a;
            InterfaceC2261g bVar = new b(oVar, j9);
            try {
                dVar2.f21140a = oVar;
                dVar2.f21141b = j9;
                dVar2.f21142c = bVar;
                dVar2.f21144e = 1;
                if (interfaceC2260f.collect(bVar, dVar2) == objF) {
                    return objF;
                }
                oVar2 = oVar;
                j8 = j9;
            } catch (C2319a e9) {
                oVar2 = oVar;
                j8 = j9;
                e8 = e9;
                interfaceC2261g = bVar;
                p.a(e8, interfaceC2261g);
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2261g = (b) dVar2.f21142c;
            j8 = (J) dVar2.f21141b;
            oVar2 = (o) dVar2.f21140a;
            try {
                r.b(obj);
            } catch (C2319a e10) {
                e8 = e10;
                p.a(e8, interfaceC2261g);
            }
        }
        Object obj2 = j8.f28779a;
        if (obj2 != t.f22340a) {
            return obj2;
        }
        throw new NoSuchElementException("Expected at least one element matching the predicate " + oVar2);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object c(InterfaceC2260f interfaceC2260f, G6.d dVar) {
        g gVar;
        J j8;
        C2319a e8;
        InterfaceC2261g interfaceC2261g;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i8 = gVar.f21156d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                gVar.f21156d = i8 - Integer.MIN_VALUE;
            } else {
                gVar = new g(dVar);
            }
        } else {
            gVar = new g(dVar);
        }
        Object obj = gVar.f21155c;
        Object objF = H6.c.f();
        int i9 = gVar.f21156d;
        if (i9 == 0) {
            r.b(obj);
            J j9 = new J();
            InterfaceC2261g eVar = new e(j9);
            try {
                gVar.f21153a = j9;
                gVar.f21154b = eVar;
                gVar.f21156d = 1;
                if (interfaceC2260f.collect(eVar, gVar) == objF) {
                    return objF;
                }
                j8 = j9;
            } catch (C2319a e9) {
                j8 = j9;
                e8 = e9;
                interfaceC2261g = eVar;
                p.a(e8, interfaceC2261g);
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2261g = (e) gVar.f21154b;
            j8 = (J) gVar.f21153a;
            try {
                r.b(obj);
            } catch (C2319a e10) {
                e8 = e10;
                p.a(e8, interfaceC2261g);
            }
        }
        return j8.f28779a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object d(InterfaceC2260f interfaceC2260f, o oVar, G6.d dVar) {
        h hVar;
        J j8;
        C2319a e8;
        InterfaceC2261g interfaceC2261g;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i8 = hVar.f21160d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                hVar.f21160d = i8 - Integer.MIN_VALUE;
            } else {
                hVar = new h(dVar);
            }
        } else {
            hVar = new h(dVar);
        }
        Object obj = hVar.f21159c;
        Object objF = H6.c.f();
        int i9 = hVar.f21160d;
        if (i9 == 0) {
            r.b(obj);
            J j9 = new J();
            InterfaceC2261g fVar = new f(oVar, j9);
            try {
                hVar.f21157a = j9;
                hVar.f21158b = fVar;
                hVar.f21160d = 1;
                if (interfaceC2260f.collect(fVar, hVar) == objF) {
                    return objF;
                }
                j8 = j9;
            } catch (C2319a e9) {
                j8 = j9;
                e8 = e9;
                interfaceC2261g = fVar;
                p.a(e8, interfaceC2261g);
            }
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC2261g = (f) hVar.f21158b;
            j8 = (J) hVar.f21157a;
            try {
                r.b(obj);
            } catch (C2319a e10) {
                e8 = e10;
                p.a(e8, interfaceC2261g);
            }
        }
        return j8.f28779a;
    }
}
