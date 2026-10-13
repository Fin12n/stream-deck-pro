package p202x3;

import C6.G;
import C6.r;
import C6.v;
import I6.d;
import I6.l;
import M3.m;
import M3.p;
import Q6.k;
import Q6.o;
import V3.f;
import V3.h;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p090k.zI.jULK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f37295b;

        /* JADX INFO: renamed from: x3.g$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0829a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0829a f37296a = new C0829a();

            public C0829a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M3.g invoke(m.C1038c c1038c) {
                if (c1038c != null) {
                    return c1038c.d();
                }
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c implements InterfaceC2260f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f37298a;

            /* JADX INFO: renamed from: x3.g$a$c$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0830a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f37299a;

                /* JADX INFO: renamed from: x3.g$a$c$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0831a extends d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f37300a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f37301b;

                    public C0831a(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f37300a = obj;
                        this.f37301b |= Integer.MIN_VALUE;
                        return C0830a.this.emit(null, this);
                    }
                }

                public C0830a(InterfaceC2261g interfaceC2261g) {
                    this.f37299a = interfaceC2261g;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    C0831a c0831a;
                    if (dVar instanceof C0831a) {
                        c0831a = (C0831a) dVar;
                        int i8 = c0831a.f37301b;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0831a.f37301b = i8 - Integer.MIN_VALUE;
                        } else {
                            c0831a = new C0831a(dVar);
                        }
                    } else {
                        c0831a = new C0831a(dVar);
                    }
                    Object obj2 = c0831a.f37300a;
                    Object objF = H6.c.f();
                    int i9 = c0831a.f37301b;
                    if (i9 == 0) {
                        r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.f37299a;
                        m.C1038c c1038c = (m.C1038c) obj;
                        if ((c1038c != null ? c1038c.d() : null) instanceof M3.g.C0186g) {
                            c0831a.f37301b = 1;
                            if (interfaceC2261g.emit(obj, c0831a) == objF) {
                                return objF;
                            }
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

            public c(InterfaceC2260f interfaceC2260f) {
                this.f37298a = interfaceC2260f;
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = this.f37298a.collect(new C0830a(interfaceC2261g), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(p pVar, G6.d dVar) {
            super(2, dVar);
            this.f37295b = pVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new a(this.f37295b, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((a) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f37294a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2260f interfaceC2260fW = AbstractC2262h.w(new c(AbstractC2262h.q(this.f37295b.e(), C0829a.f37296a)));
                b bVar = b.f37297a;
                this.f37294a = 1;
                if (interfaceC2260fW.collect(bVar, this) == objF) {
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

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f37297a = new b();

            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(m.C1038c c1038c, G6.d dVar) {
                String strM = c1038c.m();
                String strE = c1038c.e();
                if (strE == null) {
                    return G.f1419a;
                }
                f.b(new h.a(V3.c.b.VIRTUAL_DEVICE_OPENED.b(), new C6.o[]{v.a("device_id", strE), v.a(jULK.zBu, strM)}, (V3.a) null, 4, (AbstractC2633k) null));
                return G.f1419a;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37303a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ p f37304b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AppSettingsStore f37305c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ C3.f f37306d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ G3.k f37307e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f37308a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final M3.g invoke(m.C1038c c1038c) {
                if (c1038c != null) {
                    return c1038c.d();
                }
                return null;
            }
        }

        /* JADX INFO: renamed from: x3.g$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0832b extends u implements k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0832b f37309a = new C0832b();

            public C0832b() {
                super(1);
            }

            public final String b(m.C1038c c1038c) {
                if (c1038c != null) {
                    return c1038c.e();
                }
                return null;
            }

            @Override // Q6.k
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                String strB = b((m.C1038c) obj);
                if (strB != null) {
                    return P3.b.a(strB);
                }
                return null;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ AppSettingsStore f37310a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ C3.f f37311b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ G3.k f37312c;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public Object f37313a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public Object f37314b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public Object f37315c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public int f37316d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public int f37317e;

                /* JADX INFO: renamed from: f, reason: collision with root package name */
                public /* synthetic */ Object f37318f;

                /* JADX INFO: renamed from: h, reason: collision with root package name */
                public int f37320h;

                public a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f37318f = obj;
                    this.f37320h |= Integer.MIN_VALUE;
                    return c.this.emit(null, this);
                }
            }

            public c(AppSettingsStore appSettingsStore, C3.f fVar, G3.k kVar) {
                this.f37310a = appSettingsStore;
                this.f37311b = fVar;
                this.f37312c = kVar;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0017  */
            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(m.C1038c c1038c, G6.d dVar) {
                a aVar;
                String strM;
                int iF;
                String str;
                int i8;
                c cVar;
                if (dVar instanceof a) {
                    aVar = (a) dVar;
                    int i9 = aVar.f37320h;
                    if ((i9 & Integer.MIN_VALUE) != 0) {
                        aVar.f37320h = i9 - Integer.MIN_VALUE;
                    } else {
                        aVar = new a(dVar);
                    }
                } else {
                    aVar = new a(dVar);
                }
                Object obj = aVar.f37318f;
                Object objF = H6.c.f();
                int i10 = aVar.f37320h;
                if (i10 == 0) {
                    r.b(obj);
                    strM = c1038c.m();
                    String strE = c1038c.e();
                    if (strE == null) {
                        return G.f1419a;
                    }
                    iF = c1038c.f().c().f();
                    int iD = c1038c.f().c().d();
                    InterfaceC2260f interfaceC2260fM101getDeviceByIDqOAwsH0 = this.f37310a.m101getDeviceByIDqOAwsH0(strE);
                    aVar.f37313a = this;
                    aVar.f37314b = strM;
                    aVar.f37315c = strE;
                    aVar.f37316d = iF;
                    aVar.f37317e = iD;
                    aVar.f37320h = 1;
                    Object objZ = AbstractC2262h.z(interfaceC2260fM101getDeviceByIDqOAwsH0, aVar);
                    if (objZ == objF) {
                        return objF;
                    }
                    str = strE;
                    obj = objZ;
                    i8 = iD;
                    cVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i8 = aVar.f37317e;
                    iF = aVar.f37316d;
                    str = (String) aVar.f37315c;
                    strM = (String) aVar.f37314b;
                    cVar = (c) aVar.f37313a;
                    r.b(obj);
                }
                KnownHost.Device device = (KnownHost.Device) obj;
                if (device == null) {
                    return G.f1419a;
                }
                String strC = defpackage.a.c(device);
                String strA = p186v3.b.a((C3.b) cVar.f37311b.j().getValue());
                KnownHost.Device.KeypadOrientationOption keypadRotation = device.getKeypadRotation();
                t.f(keypadRotation, "getKeypadRotation(...)");
                String strE2 = defpackage.a.e(keypadRotation);
                KnownHost.Device.Appearance appearance = device.getAppearance();
                t.f(appearance, "getAppearance(...)");
                f.a(V3.d.c(V3.c.f10602a, V3.c.d.KEYPAD, v.a("device_id", str), v.a("workstation_id", strM), v.a("rows", String.valueOf(iF)), v.a("columns", String.valueOf(i8)), v.a("keypad_layout", strC), v.a("faceplate", strA), v.a("orientation", strE2), v.a("appearance", defpackage.a.d(appearance)), v.a("scene_id", cVar.f37312c.a().toString())));
                return G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d implements InterfaceC2260f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f37321a;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f37322a;

                /* JADX INFO: renamed from: x3.g$b$d$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0833a extends I6.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f37323a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f37324b;

                    public C0833a(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f37323a = obj;
                        this.f37324b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC2261g interfaceC2261g) {
                    this.f37322a = interfaceC2261g;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    C0833a c0833a;
                    if (dVar instanceof C0833a) {
                        c0833a = (C0833a) dVar;
                        int i8 = c0833a.f37324b;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0833a.f37324b = i8 - Integer.MIN_VALUE;
                        } else {
                            c0833a = new C0833a(dVar);
                        }
                    } else {
                        c0833a = new C0833a(dVar);
                    }
                    Object obj2 = c0833a.f37323a;
                    Object objF = H6.c.f();
                    int i9 = c0833a.f37324b;
                    if (i9 == 0) {
                        r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.f37322a;
                        m.C1038c c1038c = (m.C1038c) obj;
                        if ((c1038c != null ? c1038c.d() : null) instanceof M3.g.C0186g) {
                            c0833a.f37324b = 1;
                            if (interfaceC2261g.emit(obj, c0833a) == objF) {
                                return objF;
                            }
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

            public d(InterfaceC2260f interfaceC2260f) {
                this.f37321a = interfaceC2260f;
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = this.f37321a.collect(new a(interfaceC2261g), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(p pVar, AppSettingsStore appSettingsStore, C3.f fVar, G3.k kVar, G6.d dVar) {
            super(2, dVar);
            this.f37304b = pVar;
            this.f37305c = appSettingsStore;
            this.f37306d = fVar;
            this.f37307e = kVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new b(this.f37304b, this.f37305c, this.f37306d, this.f37307e, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f37303a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2260f interfaceC2260fW = AbstractC2262h.w(AbstractC2262h.q(new d(AbstractC2262h.q(this.f37304b.e(), a.f37308a)), C0832b.f37309a));
                c cVar = new c(this.f37305c, this.f37306d, this.f37307e);
                this.f37303a = 1;
                if (interfaceC2260fW.collect(cVar, this) == objF) {
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

    public g(p connectionHolder, AppSettingsStore appSettingsStore, C3.f faceplateManager, G3.k sceneIdentifier, J coroutineScope) {
        t.g(connectionHolder, "connectionHolder");
        t.g(appSettingsStore, "appSettingsStore");
        t.g(faceplateManager, "faceplateManager");
        t.g(sceneIdentifier, "sceneIdentifier");
        t.g(coroutineScope, "coroutineScope");
        AbstractC1789i.d(coroutineScope, null, null, new a(connectionHolder, null), 3, null);
        AbstractC1789i.d(coroutineScope, null, null, new b(connectionHolder, appSettingsStore, faceplateManager, sceneIdentifier, null), 3, null);
    }
}
