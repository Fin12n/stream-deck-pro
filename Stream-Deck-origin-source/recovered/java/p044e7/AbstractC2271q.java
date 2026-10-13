package p044e7;

import C6.G;
import C6.r;
import Q6.o;
import kotlin.jvm.internal.F;
import kotlin.jvm.internal.H;
import p053f7.C2319a;
import p053f7.p;

/* JADX INFO: renamed from: e7.q, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC2271q {

    /* JADX INFO: renamed from: e7.q$a */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21079a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f21080b;

        public a(InterfaceC2260f interfaceC2260f, int i8) {
            this.f21079a = interfaceC2260f;
            this.f21080b = i8;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f21079a.collect(new b(new H(), this.f21080b, interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: renamed from: e7.q$b */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b implements InterfaceC2261g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ H f21081a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ int f21082b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f21083c;

        /* JADX INFO: renamed from: e7.q$b$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f21084a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f21086c;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21084a = obj;
                this.f21086c |= Integer.MIN_VALUE;
                return b.this.emit(null, this);
            }
        }

        public b(H h8, int i8, InterfaceC2261g interfaceC2261g) {
            this.f21081a = h8;
            this.f21082b = i8;
            this.f21083c = interfaceC2261g;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p044e7.InterfaceC2261g
        public final Object emit(Object obj, G6.d dVar) {
            a aVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21086c;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21086c = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj2 = aVar.f21084a;
            Object objF = H6.c.f();
            int i9 = aVar.f21086c;
            if (i9 == 0) {
                r.b(obj2);
                H h8 = this.f21081a;
                int i10 = h8.f28777a;
                if (i10 < this.f21082b) {
                    h8.f28777a = i10 + 1;
                    return G.f1419a;
                }
                InterfaceC2261g interfaceC2261g = this.f21083c;
                aVar.f21086c = 1;
                if (interfaceC2261g.emit(obj, aVar) == objF) {
                    return objF;
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj2);
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: e7.q$c */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21087a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f21088b;

        public c(InterfaceC2260f interfaceC2260f, o oVar) {
            this.f21087a = interfaceC2260f;
            this.f21088b = oVar;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f21087a.collect(new d(new F(), interfaceC2261g, this.f21088b), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: renamed from: e7.q$d */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements InterfaceC2261g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ F f21089a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f21090b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ o f21091c;

        /* JADX INFO: renamed from: e7.q$d$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f21092a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public Object f21093b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public /* synthetic */ Object f21094c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public int f21096e;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21094c = obj;
                this.f21096e |= Integer.MIN_VALUE;
                return d.this.emit(null, this);
            }
        }

        public d(F f8, InterfaceC2261g interfaceC2261g, o oVar) {
            this.f21089a = f8;
            this.f21090b = interfaceC2261g;
            this.f21091c = oVar;
        }

        /* JADX WARN: Code duplicated, block: B:31:0x0074  */
        /* JADX WARN: Code duplicated, block: B:36:0x008b  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:21:0x0056, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        /* JADX WARN: Code restructure failed: missing block: B:32:0x0085, code lost:
        
            if (r8.emit(r7, r0) == r1) goto L33;
         */
        @Override // p044e7.InterfaceC2261g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, G6.d dVar) {
            a aVar;
            d dVar2;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21096e;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21096e = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object objInvoke = aVar.f21094c;
            Object objF = H6.c.f();
            int i9 = aVar.f21096e;
            if (i9 != 0) {
                if (i9 == 1) {
                    r.b(objInvoke);
                    return G.f1419a;
                }
                if (i9 == 2) {
                    obj = aVar.f21093b;
                    dVar2 = (d) aVar.f21092a;
                    r.b(objInvoke);
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return G.f1419a;
                    }
                    dVar2.f21089a.f28775a = true;
                    InterfaceC2261g interfaceC2261g = dVar2.f21090b;
                    aVar.f21092a = null;
                    aVar.f21093b = null;
                    aVar.f21096e = 3;
                } else {
                    if (i9 != 3) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(objInvoke);
                }
                return G.f1419a;
            }
            r.b(objInvoke);
            if (this.f21089a.f28775a) {
                InterfaceC2261g interfaceC2261g2 = this.f21090b;
                aVar.f21096e = 1;
            } else {
                o oVar = this.f21091c;
                aVar.f21092a = this;
                aVar.f21093b = obj;
                aVar.f21096e = 2;
                objInvoke = oVar.invoke(obj, aVar);
                if (objInvoke != objF) {
                    dVar2 = this;
                    if (!((Boolean) objInvoke).booleanValue()) {
                        return G.f1419a;
                    }
                    dVar2.f21089a.f28775a = true;
                    InterfaceC2261g interfaceC2261g3 = dVar2.f21090b;
                    aVar.f21092a = null;
                    aVar.f21093b = null;
                    aVar.f21096e = 3;
                }
            }
            return objF;
        }
    }

    /* JADX INFO: renamed from: e7.q$e */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21097a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ o f21098b;

        /* JADX INFO: renamed from: e7.q$e$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public /* synthetic */ Object f21099a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public int f21100b;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public Object f21102d;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21099a = obj;
                this.f21100b |= Integer.MIN_VALUE;
                return e.this.collect(null, this);
            }
        }

        public e(InterfaceC2260f interfaceC2260f, o oVar) {
            this.f21097a = interfaceC2260f;
            this.f21098b = oVar;
        }

        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            a aVar;
            f fVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21100b;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21100b = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj = aVar.f21099a;
            Object objF = H6.c.f();
            int i9 = aVar.f21100b;
            if (i9 == 0) {
                r.b(obj);
                InterfaceC2260f interfaceC2260f = this.f21097a;
                f fVar2 = new f(this.f21098b, interfaceC2261g);
                try {
                    aVar.f21102d = fVar2;
                    aVar.f21100b = 1;
                    if (interfaceC2260f.collect(fVar2, aVar) == objF) {
                        return objF;
                    }
                } catch (C2319a e8) {
                    e = e8;
                    fVar = fVar2;
                    p.a(e, fVar);
                }
            } else {
                if (i9 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (f) aVar.f21102d;
                try {
                    r.b(obj);
                } catch (C2319a e9) {
                    e = e9;
                    p.a(e, fVar);
                }
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: renamed from: e7.q$f */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f implements InterfaceC2261g {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ o f21103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f21104b;

        /* JADX INFO: renamed from: e7.q$f$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.d {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public Object f21105a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f21106b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public int f21107c;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public Object f21109e;

            public a(G6.d dVar) {
                super(dVar);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                this.f21106b = obj;
                this.f21107c |= Integer.MIN_VALUE;
                return f.this.emit(null, this);
            }
        }

        public f(o oVar, InterfaceC2261g interfaceC2261g) {
            this.f21103a = oVar;
            this.f21104b = interfaceC2261g;
        }

        /* JADX WARN: Code duplicated, block: B:27:0x007e  */
        /* JADX WARN: Code duplicated, block: B:29:0x0081  */
        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0078, code lost:
        
            if (r2.emit(r9, r0) == r1) goto L24;
         */
        @Override // p044e7.InterfaceC2261g
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public Object emit(Object obj, G6.d dVar) {
            a aVar;
            Object obj2;
            Object obj3;
            f fVar;
            if (dVar instanceof a) {
                aVar = (a) dVar;
                int i8 = aVar.f21107c;
                if ((i8 & Integer.MIN_VALUE) != 0) {
                    aVar.f21107c = i8 - Integer.MIN_VALUE;
                } else {
                    aVar = new a(dVar);
                }
            } else {
                aVar = new a(dVar);
            }
            Object obj4 = aVar.f21106b;
            Object objF = H6.c.f();
            int i9 = aVar.f21107c;
            boolean z8 = true;
            if (i9 == 0) {
                r.b(obj4);
                o oVar = this.f21103a;
                aVar.f21105a = this;
                aVar.f21109e = obj;
                aVar.f21107c = 1;
                kotlin.jvm.internal.r.a(6);
                Object objInvoke = oVar.invoke(obj, aVar);
                kotlin.jvm.internal.r.a(7);
                if (objInvoke != objF) {
                    obj2 = objInvoke;
                    obj3 = obj;
                    fVar = this;
                }
                return objF;
            }
            if (i9 == 1) {
                Object obj5 = aVar.f21109e;
                f fVar2 = (f) aVar.f21105a;
                r.b(obj4);
                obj3 = obj5;
                fVar = fVar2;
                obj2 = obj4;
            } else {
                if (i9 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fVar = (f) aVar.f21105a;
                r.b(obj4);
            }
            if (z8) {
                return G.f1419a;
            }
            throw new C2319a(fVar);
            if (((Boolean) obj2).booleanValue()) {
                InterfaceC2261g interfaceC2261g = fVar.f21104b;
                aVar.f21105a = fVar;
                aVar.f21109e = null;
                aVar.f21107c = 2;
            } else {
                z8 = false;
            }
            if (z8) {
                return G.f1419a;
            }
            throw new C2319a(fVar);
        }
    }

    public static final InterfaceC2260f a(InterfaceC2260f interfaceC2260f, int i8) {
        if (i8 >= 0) {
            return new a(interfaceC2260f, i8);
        }
        throw new IllegalArgumentException(("Drop count should be non-negative, but had " + i8).toString());
    }

    public static final InterfaceC2260f b(InterfaceC2260f interfaceC2260f, o oVar) {
        return new c(interfaceC2260f, oVar);
    }

    public static final InterfaceC2260f c(InterfaceC2260f interfaceC2260f, o oVar) {
        return new e(interfaceC2260f, oVar);
    }
}
