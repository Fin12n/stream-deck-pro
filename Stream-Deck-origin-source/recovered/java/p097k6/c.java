package p097k6;

import C6.G;
import C6.r;
import I6.l;
import Q6.o;
import X5.AbstractC1676e;
import X5.C1674c;
import io.ktor.utils.io.g;
import java.nio.charset.Charset;
import java.util.List;
import kotlin.jvm.internal.t;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p116m7.h;
import p116m7.j;
import p205x6.k;
import p205x6.p;
import p205x6.y;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class c implements p088j6.c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f28695a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f28696b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f28697a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Charset f28698b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ p181u6.a f28699c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ g f28700d;

        /* JADX INFO: renamed from: k6.c$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0624a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f28701a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ Charset f28702b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ p181u6.a f28703c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ g f28704d;

            /* JADX INFO: renamed from: k6.c$a$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0625a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f28705a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f28706b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f28707c;

                public C0625a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f28705a = obj;
                    this.f28706b |= Integer.MIN_VALUE;
                    return C0624a.this.emit(null, this);
                }
            }

            public C0624a(InterfaceC2261g interfaceC2261g, Charset charset, p181u6.a aVar, g gVar) {
                this.f28701a = interfaceC2261g;
                this.f28702b = charset;
                this.f28703c = aVar;
                this.f28704d = gVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0060, code lost:
            
                if (r9.emit(r10, r0) == r1) goto L22;
             */
            @Override // p044e7.InterfaceC2261g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, G6.d dVar) {
                C0625a c0625a;
                InterfaceC2261g interfaceC2261g;
                if (dVar instanceof C0625a) {
                    c0625a = (C0625a) dVar;
                    int i8 = c0625a.f28706b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0625a.f28706b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0625a = new C0625a(dVar);
                    }
                } else {
                    c0625a = new C0625a(dVar);
                }
                Object obj2 = c0625a.f28705a;
                Object objF = H6.c.f();
                int i9 = c0625a.f28706b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        interfaceC2261g = (InterfaceC2261g) c0625a.f28707c;
                        r.b(obj2);
                    } else {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj2);
                    }
                    return G.f1419a;
                }
                r.b(obj2);
                InterfaceC2261g interfaceC2261g2 = this.f28701a;
                Charset charset = this.f28702b;
                p181u6.a aVar = this.f28703c;
                g gVar = this.f28704d;
                c0625a.f28707c = interfaceC2261g2;
                c0625a.f28706b = 1;
                Object objA = ((p097k6.e) obj).a(charset, aVar, gVar, c0625a);
                if (objA != objF) {
                    obj2 = objA;
                    interfaceC2261g = interfaceC2261g2;
                }
                return objF;
                c0625a.f28707c = null;
                c0625a.f28706b = 2;
            }
        }

        public a(InterfaceC2260f interfaceC2260f, Charset charset, p181u6.a aVar, g gVar) {
            this.f28697a = interfaceC2260f;
            this.f28698b = charset;
            this.f28699c = aVar;
            this.f28700d = gVar;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f28697a.collect(new C0624a(interfaceC2261g, this.f28698b, this.f28699c, this.f28700d), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f28709a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f28710b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28711c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f28712d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f28713e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f28715g;

        public b(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f28713e = obj;
            this.f28715g |= Integer.MIN_VALUE;
            return c.this.a(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: k6.c$c, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0626c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28716a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f28717b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ g f28718c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0626c(g gVar, G6.d dVar) {
            super(2, dVar);
            this.f28718c = gVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            C0626c c0626c = new C0626c(this.f28718c, dVar);
            c0626c.f28717b = obj;
            return c0626c;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, G6.d dVar) {
            return ((C0626c) create(obj, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f28716a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return I6.b.a(this.f28717b != null || this.f28718c.J());
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f28719a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C1674c f28720b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Charset f28721c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ p181u6.a f28722d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f28723e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f28724a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C1674c f28725b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Charset f28726c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ p181u6.a f28727d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Object f28728e;

            /* JADX INFO: renamed from: k6.c$d$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0627a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f28729a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f28730b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f28731c;

                public C0627a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f28729a = obj;
                    this.f28730b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g, C1674c c1674c, Charset charset, p181u6.a aVar, Object obj) {
                this.f28724a = interfaceC2261g;
                this.f28725b = c1674c;
                this.f28726c = charset;
                this.f28727d = aVar;
                this.f28728e = obj;
            }

            /* JADX WARN: Code duplicated, block: B:8:0x0014  */
            /* JADX WARN: Code restructure failed: missing block: B:22:0x0066, code lost:
            
                if (r10.emit(r11, r6) == r0) goto L23;
             */
            @Override // p044e7.InterfaceC2261g
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object emit(Object obj, G6.d dVar) {
                C0627a c0627a;
                InterfaceC2261g interfaceC2261g;
                if (dVar instanceof C0627a) {
                    c0627a = (C0627a) dVar;
                    int i8 = c0627a.f28730b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0627a.f28730b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0627a = new C0627a(dVar);
                    }
                } else {
                    c0627a = new C0627a(dVar);
                }
                C0627a c0627a2 = c0627a;
                Object obj2 = c0627a2.f28729a;
                Object objF = H6.c.f();
                int i9 = c0627a2.f28730b;
                if (i9 != 0) {
                    if (i9 == 1) {
                        interfaceC2261g = (InterfaceC2261g) c0627a2.f28731c;
                        r.b(obj2);
                    } else {
                        if (i9 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        r.b(obj2);
                    }
                    return G.f1419a;
                }
                r.b(obj2);
                InterfaceC2261g interfaceC2261g2 = this.f28724a;
                C1674c c1674c = this.f28725b;
                Charset charset = this.f28726c;
                p181u6.a aVar = this.f28727d;
                Object obj3 = this.f28728e;
                c0627a2.f28731c = interfaceC2261g2;
                c0627a2.f28730b = 1;
                Object objB = ((p097k6.e) obj).b(c1674c, charset, aVar, obj3, c0627a2);
                if (objB != objF) {
                    obj2 = objB;
                    interfaceC2261g = interfaceC2261g2;
                }
                return objF;
                c0627a2.f28731c = null;
                c0627a2.f28730b = 2;
            }
        }

        public d(InterfaceC2260f interfaceC2260f, C1674c c1674c, Charset charset, p181u6.a aVar, Object obj) {
            this.f28719a = interfaceC2260f;
            this.f28720b = c1674c;
            this.f28721c = charset;
            this.f28722d = aVar;
            this.f28723e = obj;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f28719a.collect(new a(interfaceC2261g, this.f28720b, this.f28721c, this.f28722d, this.f28723e), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f28733a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f28734b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f28735c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f28736d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f28737e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f28738f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f28740h;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f28738f = obj;
            this.f28740h |= Integer.MIN_VALUE;
            return c.this.b(null, null, null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f28741a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f28742b;

        public f(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            f fVar = new f(dVar);
            fVar.f28742b = obj;
            return fVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p007a6.c cVar, G6.d dVar) {
            return ((f) create(cVar, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f28741a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return I6.b.a(((p007a6.c) this.f28742b) != null);
        }
    }

    public c(h format) {
        t.g(format, "format");
        this.f28695a = format;
        this.f28696b = p097k6.b.a(format);
        if (format instanceof p116m7.o) {
            return;
        }
        throw new IllegalArgumentException(("Only binary and string formats are supported, " + format + " is not supported.").toString());
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00be A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:32:0x00b8, B:34:0x00be, B:38:0x00cd, B:39:0x00ec), top: B:42:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00cd A[Catch: all -> 0x00ca, TryCatch #0 {all -> 0x00ca, blocks: (B:32:0x00b8, B:34:0x00be, B:38:0x00cd, B:39:0x00ec), top: B:42:0x00b8 }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00cd, please report this as an issue */
    @Override // p088j6.c
    public Object a(Charset charset, p181u6.a aVar, g gVar, G6.d dVar) throws p088j6.e {
        b bVar;
        g gVar2;
        c cVar;
        Charset charset2;
        p116m7.b bVar2;
        k kVar;
        h hVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i8 = bVar.f28715g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.f28715g = i8 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        b bVar3 = bVar;
        Object objA = bVar3.f28713e;
        Object objF = H6.c.f();
        int i9 = bVar3.f28715g;
        if (i9 == 0) {
            r.b(objA);
            a aVar2 = new a(AbstractC2262h.a(this.f28696b), charset, aVar, gVar);
            C0626c c0626c = new C0626c(gVar, null);
            bVar3.f28709a = this;
            bVar3.f28710b = charset;
            bVar3.f28711c = aVar;
            bVar3.f28712d = gVar;
            bVar3.f28715g = 1;
            objA = AbstractC2262h.A(aVar2, c0626c, bVar3);
            if (objA != objF) {
                gVar2 = gVar;
                cVar = this;
            }
            return objF;
        }
        if (i9 == 1) {
            g gVar3 = (g) bVar3.f28712d;
            aVar = (p181u6.a) bVar3.f28711c;
            charset = (Charset) bVar3.f28710b;
            c cVar2 = (c) bVar3.f28709a;
            r.b(objA);
            gVar2 = gVar3;
            cVar = cVar2;
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar2 = (p116m7.b) bVar3.f28711c;
            charset2 = (Charset) bVar3.f28710b;
            cVar = (c) bVar3.f28709a;
            r.b(objA);
        }
        kVar = (k) objA;
        try {
            hVar = cVar.f28695a;
            if (hVar instanceof p116m7.o) {
                return ((p116m7.o) hVar).b(bVar2, y.e(kVar, charset2, 0, 2, null));
            }
            p.a(kVar);
            throw new IllegalStateException(("Unsupported format " + cVar.f28695a).toString());
        } catch (Throwable th) {
            throw new p088j6.e("Illegal input: " + th.getMessage(), th);
        }
        if (!cVar.f28696b.isEmpty() && (objA != null || gVar2.J())) {
            return objA;
        }
        p116m7.b bVarD = g.d(cVar.f28695a.a(), aVar);
        bVar3.f28709a = cVar;
        bVar3.f28710b = charset;
        bVar3.f28711c = bVarD;
        bVar3.f28712d = null;
        bVar3.f28715g = 2;
        objA = g.b.a(gVar2, 0L, bVar3, 1, null);
        if (objA != objF) {
            charset2 = charset;
            bVar2 = bVarD;
            kVar = (k) objA;
            hVar = cVar.f28695a;
            if (hVar instanceof p116m7.o) {
                return ((p116m7.o) hVar).b(bVar2, y.e(kVar, charset2, 0, 2, null));
            }
            p.a(kVar);
            throw new IllegalStateException(("Unsupported format " + cVar.f28695a).toString());
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // p088j6.c
    public Object b(C1674c c1674c, Charset charset, p181u6.a aVar, Object obj, G6.d dVar) {
        e eVar;
        C1674c c1674c2;
        Charset charset2;
        c cVar;
        p181u6.a aVar2;
        Object obj2;
        p116m7.b bVarB;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f28740h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f28740h = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objA = eVar.f28738f;
        Object objF = H6.c.f();
        int i9 = eVar.f28740h;
        if (i9 == 0) {
            r.b(objA);
            c1674c2 = c1674c;
            charset2 = charset;
            d dVar2 = new d(AbstractC2262h.a(this.f28696b), c1674c2, charset2, aVar, obj);
            f fVar = new f(null);
            eVar.f28733a = this;
            eVar.f28734b = c1674c2;
            eVar.f28735c = charset2;
            eVar.f28736d = aVar;
            eVar.f28737e = obj;
            eVar.f28740h = 1;
            objA = AbstractC2262h.A(dVar2, fVar, eVar);
            if (objA == objF) {
                return objF;
            }
            cVar = this;
            aVar2 = aVar;
            obj2 = obj;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Object obj3 = eVar.f28737e;
            aVar2 = (p181u6.a) eVar.f28736d;
            Charset charset3 = (Charset) eVar.f28735c;
            C1674c c1674c3 = (C1674c) eVar.f28734b;
            c cVar2 = (c) eVar.f28733a;
            r.b(objA);
            c1674c2 = c1674c3;
            charset2 = charset3;
            obj2 = obj3;
            cVar = cVar2;
        }
        p007a6.c cVar3 = (p007a6.c) objA;
        if (cVar3 != null) {
            return cVar3;
        }
        try {
            bVarB = g.d(cVar.f28695a.a(), aVar2);
        } catch (j unused) {
            bVarB = g.b(obj2, cVar.f28695a.a());
        }
        return cVar.c(bVarB, cVar.f28695a, obj2, c1674c2, charset2);
    }

    public final a6.c.a c(p116m7.b bVar, h hVar, Object obj, C1674c c1674c, Charset charset) {
        if (hVar instanceof p116m7.o) {
            t.e(bVar, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>");
            return new p007a6.d(((p116m7.o) hVar).c(bVar, obj), AbstractC1676e.c(c1674c, charset), null, 4, null);
        }
        throw new IllegalStateException(("Unsupported format " + hVar).toString());
    }
}
