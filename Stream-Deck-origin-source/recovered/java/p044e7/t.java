package p044e7;

import C6.G;
import C6.r;
import G6.d;
import G6.h;
import H6.c;
import I6.l;
import Q6.o;
import W6.n;
import p017b7.AbstractC1785g;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.L;
import p035d7.g;
import p053f7.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract /* synthetic */ class t {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f21161a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ H f21162b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f21163c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ w f21164d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Object f21165e;

        /* JADX INFO: renamed from: e7.t$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0492a extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21166a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ int f21167b;

            public C0492a(d dVar) {
                super(2, dVar);
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                C0492a c0492a = new C0492a(dVar);
                c0492a.f21167b = ((Number) obj).intValue();
                return c0492a;
            }

            public final Object g(int i8, d dVar) {
                return ((C0492a) create(Integer.valueOf(i8), dVar)).invokeSuspend(G.f1419a);
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return g(((Number) obj).intValue(), (d) obj2);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                c.f();
                if (this.f21166a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
                return I6.b.a(this.f21167b > 0);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends l implements o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f21168a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f21169b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f21170c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ w f21171d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ Object f21172e;

            /* JADX INFO: renamed from: e7.t$a$b$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public /* synthetic */ class C0493a {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public static final /* synthetic */ int[] f21173a;

                static {
                    int[] iArr = new int[F.values().length];
                    try {
                        iArr[F.START.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[F.STOP.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[F.STOP_AND_RESET_REPLAY_CACHE.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    f21173a = iArr;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(InterfaceC2260f interfaceC2260f, w wVar, Object obj, d dVar) {
                super(2, dVar);
                this.f21170c = interfaceC2260f;
                this.f21171d = wVar;
                this.f21172e = obj;
            }

            @Override // I6.a
            public final d create(Object obj, d dVar) {
                b bVar = new b(this.f21170c, this.f21171d, this.f21172e, dVar);
                bVar.f21169b = obj;
                return bVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(F f8, d dVar) {
                return ((b) create(f8, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = c.f();
                int i8 = this.f21168a;
                if (i8 == 0) {
                    r.b(obj);
                    int i9 = C0493a.f21173a[((F) this.f21169b).ordinal()];
                    if (i9 == 1) {
                        InterfaceC2260f interfaceC2260f = this.f21170c;
                        w wVar = this.f21171d;
                        this.f21168a = 1;
                        if (interfaceC2260f.collect(wVar, this) == objF) {
                            return objF;
                        }
                    } else if (i9 == 3) {
                        Object obj2 = this.f21172e;
                        if (obj2 == D.f20917a) {
                            this.f21171d.c();
                        } else {
                            this.f21171d.d(obj2);
                        }
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
        public a(H h8, InterfaceC2260f interfaceC2260f, w wVar, Object obj, d dVar) {
            super(2, dVar);
            this.f21162b = h8;
            this.f21163c = interfaceC2260f;
            this.f21164d = wVar;
            this.f21165e = obj;
        }

        @Override // I6.a
        public final d create(Object obj, d dVar) {
            return new a(this.f21162b, this.f21163c, this.f21164d, this.f21165e, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x003c, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:24:0x0066, code lost:
        
            if (r8.collect(r1, r7) == r0) goto L28;
         */
        /* JADX WARN: Code restructure failed: missing block: B:27:0x008a, code lost:
        
            if (p044e7.AbstractC2262h.j(r8, r1, r7) == r0) goto L28;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = c.f();
            int i8 = this.f21161a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        r.b(obj);
                        InterfaceC2260f interfaceC2260f = this.f21163c;
                        w wVar = this.f21164d;
                        this.f21161a = 3;
                    } else if (i8 != 3 && i8 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                r.b(obj);
                return G.f1419a;
            }
            r.b(obj);
            H h8 = this.f21162b;
            H.a aVar = H.f20929a;
            if (h8 != aVar.c()) {
                if (this.f21162b == aVar.d()) {
                    M mE = this.f21164d.e();
                    C0492a c0492a = new C0492a(null);
                    this.f21161a = 2;
                    if (AbstractC2262h.y(mE, c0492a, this) != objF) {
                        InterfaceC2260f interfaceC2260f2 = this.f21163c;
                        w wVar2 = this.f21164d;
                        this.f21161a = 3;
                    }
                } else {
                    InterfaceC2260f interfaceC2260fP = AbstractC2262h.p(this.f21162b.a(this.f21164d.e()));
                    b bVar = new b(this.f21163c, this.f21164d, this.f21165e, null);
                    this.f21161a = 4;
                }
                return objF;
            }
            InterfaceC2260f interfaceC2260f3 = this.f21163c;
            w wVar3 = this.f21164d;
            this.f21161a = 1;
        }
    }

    public static final M a(x xVar) {
        return new z(xVar, null);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x002f  */
    public static final G b(InterfaceC2260f interfaceC2260f, int i8) {
        e eVar;
        InterfaceC2260f interfaceC2260fJ;
        int iD = n.d(i8, g.f19938P.a()) - i8;
        if (!(interfaceC2260f instanceof e) || (interfaceC2260fJ = (eVar = (e) interfaceC2260f).j()) == null) {
            return new G(interfaceC2260f, iD, p035d7.d.SUSPEND, h.f2820a);
        }
        int i9 = eVar.f22274b;
        if (i9 != -3 && i9 != -2 && i9 != 0) {
            iD = i9;
        } else if (eVar.f22275c == p035d7.d.SUSPEND) {
            if (i9 == 0) {
                iD = 0;
            }
        } else if (i8 == 0) {
            iD = 1;
        } else {
            iD = 0;
        }
        return new G(interfaceC2260fJ, iD, eVar.f22275c, eVar.f22273a);
    }

    public static final InterfaceC1815v0 c(J j8, G6.g gVar, InterfaceC2260f interfaceC2260f, w wVar, H h8, Object obj) {
        return AbstractC1785g.c(j8, gVar, kotlin.jvm.internal.t.c(h8, H.f20929a.c()) ? L.DEFAULT : L.UNDISPATCHED, new a(h8, interfaceC2260f, wVar, obj, null));
    }

    public static final B d(InterfaceC2260f interfaceC2260f, J j8, H h8, int i8) {
        G gB = b(interfaceC2260f, i8);
        w wVarA = D.a(i8, gB.f20926b, gB.f20927c);
        return new y(wVarA, c(j8, gB.f20928d, gB.f20925a, wVarA, h8, D.f20917a));
    }

    public static final M e(InterfaceC2260f interfaceC2260f, J j8, H h8, Object obj) {
        G gB = b(interfaceC2260f, 1);
        x xVarA = O.a(obj);
        return new z(xVarA, c(j8, gB.f20928d, gB.f20925a, xVarA, h8, obj));
    }
}
