package p053f7;

import C6.G;
import C6.r;
import G6.d;
import G6.g;
import G6.h;
import H6.c;
import I6.l;
import Q6.o;
import Q6.p;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.J;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.K;
import p017b7.L;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class i extends g {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final p f22287e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f22288a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f22289b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2261g f22291d;

        /* JADX INFO: renamed from: f7.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0517a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ J f22292a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ p017b7.J f22293b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ i f22294c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f22295d;

            /* JADX INFO: renamed from: f7.i$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0518a extends l implements o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f22296a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ i f22297b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f22298c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ Object f22299d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0518a(i iVar, InterfaceC2261g interfaceC2261g, Object obj, d dVar) {
                    super(2, dVar);
                    this.f22297b = iVar;
                    this.f22298c = interfaceC2261g;
                    this.f22299d = obj;
                }

                @Override // I6.a
                public final d create(Object obj, d dVar) {
                    return new C0518a(this.f22297b, this.f22298c, this.f22299d, dVar);
                }

                @Override // Q6.o
                /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
                public final Object invoke(p017b7.J j8, d dVar) {
                    return ((C0518a) create(j8, dVar)).invokeSuspend(G.f1419a);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = c.f();
                    int i8 = this.f22296a;
                    if (i8 == 0) {
                        r.b(obj);
                        p pVar = this.f22297b.f22287e;
                        InterfaceC2261g interfaceC2261g = this.f22298c;
                        Object obj2 = this.f22299d;
                        this.f22296a = 1;
                        if (pVar.invoke(interfaceC2261g, obj2, this) == objF) {
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

            /* JADX INFO: renamed from: f7.i$a$a$b */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class b extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f22300a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Object f22301b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f22302c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public /* synthetic */ Object f22303d;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public int f22305f;

                public b(d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f22303d = obj;
                    this.f22305f |= Integer.MIN_VALUE;
                    return C0517a.this.emit(null, this);
                }
            }

            public C0517a(J j8, p017b7.J j9, i iVar, InterfaceC2261g interfaceC2261g) {
                this.f22292a = j8;
                this.f22293b = j9;
                this.f22294c = iVar;
                this.f22295d = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, d dVar) {
                b bVar;
                C0517a c0517a;
                if (dVar instanceof b) {
                    bVar = (b) dVar;
                    int i8 = bVar.f22305f;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        bVar.f22305f = i8 - Integer.MIN_VALUE;
                    } else {
                        bVar = new b(dVar);
                    }
                } else {
                    bVar = new b(dVar);
                }
                Object obj2 = bVar.f22303d;
                Object objF = c.f();
                int i9 = bVar.f22305f;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC1815v0 interfaceC1815v0 = (InterfaceC1815v0) this.f22292a.f28779a;
                    if (interfaceC1815v0 != null) {
                        interfaceC1815v0.z(new k());
                        bVar.f22300a = this;
                        bVar.f22301b = obj;
                        bVar.f22302c = interfaceC1815v0;
                        bVar.f22305f = 1;
                        if (interfaceC1815v0.i0(bVar) == objF) {
                            return objF;
                        }
                    }
                    c0517a = this;
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    obj = bVar.f22301b;
                    c0517a = (C0517a) bVar.f22300a;
                    r.b(obj2);
                }
                c0517a.f22292a.f28779a = AbstractC1789i.d(c0517a.f22293b, null, L.UNDISPATCHED, new C0518a(c0517a.f22294c, c0517a.f22295d, obj, null), 1, null);
                return G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC2261g interfaceC2261g, d dVar) {
            super(2, dVar);
            this.f22291d = interfaceC2261g;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            a aVar = i.this.new a(this.f22291d, dVar);
            aVar.f22289b = obj;
            return aVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f22288a;
            if (i8 == 0) {
                r.b(obj);
                p017b7.J j8 = (p017b7.J) this.f22289b;
                J j9 = new J();
                i iVar = i.this;
                InterfaceC2260f interfaceC2260f = iVar.f22283d;
                C0517a c0517a = new C0517a(j9, j8, iVar, this.f22291d);
                this.f22288a = 1;
                if (interfaceC2260f.collect(c0517a, this) == objF) {
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

    public /* synthetic */ i(p pVar, InterfaceC2260f interfaceC2260f, g gVar, int i8, p035d7.d dVar, int i9, AbstractC2633k abstractC2633k) {
        this(pVar, interfaceC2260f, (i9 & 4) != 0 ? h.f2820a : gVar, (i9 & 8) != 0 ? -2 : i8, (i9 & 16) != 0 ? p035d7.d.SUSPEND : dVar);
    }

    @Override // p053f7.e
    public e i(g gVar, int i8, p035d7.d dVar) {
        return new i(this.f22287e, this.f22283d, gVar, i8, dVar);
    }

    @Override // p053f7.g
    public Object q(InterfaceC2261g interfaceC2261g, d dVar) {
        Object objF = K.f(new a(interfaceC2261g, null), dVar);
        return objF == c.f() ? objF : G.f1419a;
    }

    public i(p pVar, InterfaceC2260f interfaceC2260f, g gVar, int i8, p035d7.d dVar) {
        super(interfaceC2260f, gVar, i8, dVar);
        this.f22287e = pVar;
    }
}
