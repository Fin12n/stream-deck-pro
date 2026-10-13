package M3;

import D6.C0938s;
import I0.mIk.efuWFSeiT;
import com.amazon.device.simplesignin.a.a.d.mW.yOZfxp;
import com.elgato.streamdeck.vsd2.AppMetrics;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.Endpoint;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.streamdeck.vsd2.StaticHost;
import com.elgato.vsd2.Messages;
import com.google.protobuf.GeneratedMessageLite;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import kotlin.jvm.internal.AbstractC2633k;
import p017b7.AbstractC1785g;
import p017b7.AbstractC1789i;
import p017b7.AbstractC1816w;
import p017b7.InterfaceC1812u;
import p017b7.InterfaceC1815v0;
import p017b7.J0;
import p017b7.Q;
import p017b7.S0;
import p017b7.V0;
import p017b7.X0;
import p017b7.Z;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p044e7.O;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m implements p017b7.J {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final C1036a f5189o = new C1036a(null);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final Z2.j f5190p = Z2.j.f12858c.d("StreamDeckConnection");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5191a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final f f5192b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Messages.ClientInformation f5193c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final InterfaceC2260f f5194d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final AppSettingsStore f5195e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Q6.q f5196f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final i f5197g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final G6.g f5198h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final p098k7.a f5199i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final j f5200j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final p044e7.x f5201k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final M f5202l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public k f5203m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public Q6.o f5204n;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class A extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5205a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5206b;

        public A(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            A a8 = m.this.new A(dVar);
            a8.f5206b = obj;
            return a8;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(StaticHost staticHost, G6.d dVar) {
            return ((A) create(staticHost, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f5205a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            GeneratedMessageLite generatedMessageLiteBuild = ((StaticHost.Builder) ((StaticHost) this.f5206b).toBuilder()).clearEndpoint().addAllEndpoint(((C1038c) m.this.K().getValue()).c()).build();
            kotlin.jvm.internal.t.f(generatedMessageLiteBuild, "build(...)");
            return generatedMessageLiteBuild;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class B extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5208a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f5210c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(String str, G6.d dVar) {
            super(2, dVar);
            this.f5210c = str;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new B(this.f5210c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((B) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:23:0x005a, code lost:
        
            if (r8.B(null, r1, r7) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0068, code lost:
        
            if (r1.U(r8, r7) == r0) goto L32;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x007a, code lost:
        
            if (r1.B(null, r3, r7) == r0) goto L32;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5208a;
            try {
                if (i8 == 0) {
                    C6.r.b(obj);
                    InterfaceC2260f interfaceC2260fM101getDeviceByIDqOAwsH0 = m.this.f5195e.m101getDeviceByIDqOAwsH0(this.f5210c);
                    this.f5208a = 1;
                    obj = AbstractC2262h.z(interfaceC2260fM101getDeviceByIDqOAwsH0, this);
                    if (obj != objF) {
                    }
                    return objF;
                }
                if (i8 != 1) {
                    if (i8 == 2) {
                        C6.r.b(obj);
                        return C6.G.f1419a;
                    }
                    if (i8 == 3) {
                        C6.r.b(obj);
                    } else {
                        if (i8 != 4) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                    }
                    return C6.G.f1419a;
                }
                C6.r.b(obj);
                KnownHost.Device device = (KnownHost.Device) obj;
                if (device == null) {
                    m mVar = m.this;
                    d.g gVar = new d.g("device not found in settings store", null, 2, null);
                    this.f5208a = 2;
                } else {
                    m mVar2 = m.this;
                    this.f5208a = 3;
                }
            } catch (Throwable th) {
                m mVar3 = m.this;
                d.g gVar2 = new d.g("error opening virtual device", th);
                this.f5208a = 4;
            }
            return objF;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5212b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f5213c;

        public C(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new C(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((C) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:28:0x0081 A[Catch: all -> 0x001f, TRY_LEAVE, TryCatch #1 {all -> 0x001f, blocks: (B:7:0x0019, B:26:0x007d, B:28:0x0081, B:35:0x00a5, B:37:0x00d3), top: B:44:0x0019 }] */
        /* JADX WARN: Code duplicated, block: B:30:0x0094  */
        @Override // I6.a
        public final Object invokeSuspend(Object obj) throws Throwable {
            p098k7.a aVar;
            m mVar;
            p098k7.a aVar2;
            Object objZ;
            m mVar2;
            Q3.b bVarF;
            KnownHost.Device device;
            Object objF = H6.c.f();
            int i8 = this.f5213c;
            try {
                if (i8 == 0) {
                    C6.r.b(obj);
                    p098k7.a aVar3 = m.this.f5199i;
                    m mVar3 = m.this;
                    this.f5211a = aVar3;
                    this.f5212b = mVar3;
                    this.f5213c = 1;
                    if (aVar3.b(null, this) != objF) {
                        aVar = aVar3;
                        mVar = mVar3;
                    }
                    return objF;
                }
                if (i8 != 1) {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    mVar2 = (m) this.f5212b;
                    aVar2 = (p098k7.a) this.f5211a;
                    try {
                        C6.r.b(obj);
                        objZ = obj;
                        device = (KnownHost.Device) objZ;
                        if (device != null) {
                            bVarF = new Q3.b(null, null, device.getKeypadRows(), device.getKeypadColumns(), 3, null);
                        } else {
                            aVar = aVar2;
                            mVar = mVar2;
                            bVarF = mVar.J().f();
                            mVar2 = mVar;
                            aVar2 = aVar;
                        }
                        mVar2.f5201k.setValue(C1038c.b((C1038c) mVar2.f5201k.getValue(), null, null, g.b.f5152a, null, bVarF, null, null, 0, null, null, null, null, 4075, null));
                        mVar2.X();
                        C6.G g8 = C6.G.f1419a;
                        aVar2.e(null);
                        return C6.G.f1419a;
                    } catch (Throwable th) {
                        th = th;
                        aVar2.e(null);
                        throw th;
                    }
                }
                mVar = (m) this.f5212b;
                aVar = (p098k7.a) this.f5211a;
                C6.r.b(obj);
                if (mVar.J().d() instanceof g.d) {
                    String strE = mVar.J().e();
                    if (strE != null) {
                        InterfaceC2260f interfaceC2260fM101getDeviceByIDqOAwsH0 = mVar.f5195e.m101getDeviceByIDqOAwsH0(strE);
                        this.f5211a = aVar;
                        this.f5212b = mVar;
                        this.f5213c = 2;
                        objZ = AbstractC2262h.z(interfaceC2260fM101getDeviceByIDqOAwsH0, this);
                        if (objZ != objF) {
                            mVar2 = mVar;
                            aVar2 = aVar;
                            device = (KnownHost.Device) objZ;
                            if (device != null) {
                                bVarF = new Q3.b(null, null, device.getKeypadRows(), device.getKeypadColumns(), 3, null);
                            } else {
                                aVar = aVar2;
                                mVar = mVar2;
                                bVarF = mVar.J().f();
                                mVar2 = mVar;
                                aVar2 = aVar;
                            }
                        }
                        return objF;
                    }
                    bVarF = mVar.J().f();
                    mVar2 = mVar;
                    aVar2 = aVar;
                    mVar2.f5201k.setValue(C1038c.b((C1038c) mVar2.f5201k.getValue(), null, null, g.b.f5152a, null, bVarF, null, null, 0, null, null, null, null, 4075, null));
                    mVar2.X();
                } else {
                    aVar2 = aVar;
                }
                C6.G g9 = C6.G.f1419a;
                aVar2.e(null);
                return C6.G.f1419a;
            } catch (Throwable th2) {
                th = th2;
                aVar2 = aVar;
                aVar2.e(null);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class D extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5215a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5216b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5217c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5218d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f5219e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f5220f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f5222h;

        public D(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5220f = obj;
            this.f5222h |= Integer.MIN_VALUE;
            return m.this.U(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class E extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5223a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f5225c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f5226d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5227a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f5228b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f5229c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ KnownHost.Device f5230d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, k kVar, KnownHost.Device device, G6.d dVar) {
                super(2, dVar);
                this.f5228b = mVar;
                this.f5229c = kVar;
                this.f5230d = device;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f5228b, this.f5229c, this.f5230d, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p017b7.J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
            
                if (r8 == r0) goto L15;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f5227a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        C6.r.b(obj);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                    }
                    kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type com.elgato.vsd2.Messages.VirtualDevice");
                    return (Messages.VirtualDevice) obj;
                }
                C6.r.b(obj);
                j jVar = this.f5228b.f5200j;
                C0187a c0187a = new C0187a(this.f5229c, this.f5230d, null);
                this.f5227a = 1;
                obj = jVar.a(c0187a, this);
                if (obj != objF) {
                }
                return objF;
                this.f5227a = 2;
                obj = ((Q) obj).Q0(this);
            }

            /* JADX INFO: renamed from: M3.m$E$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0187a extends I6.l implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f5231a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ int f5232b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ k f5233c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ KnownHost.Device f5234d;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0187a(k kVar, KnownHost.Device device, G6.d dVar) {
                    super(2, dVar);
                    this.f5233c = kVar;
                    this.f5234d = device;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    C0187a c0187a = new C0187a(this.f5233c, this.f5234d, dVar);
                    c0187a.f5232b = ((Number) obj).intValue();
                    return c0187a;
                }

                public final Object g(int i8, G6.d dVar) {
                    return ((C0187a) create(Integer.valueOf(i8), dVar)).invokeSuspend(C6.G.f1419a);
                }

                @Override // Q6.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return g(((Number) obj).intValue(), (G6.d) obj2);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f5231a;
                    if (i8 != 0) {
                        if (i8 == 1) {
                            C6.r.b(obj);
                        } else {
                            throw new IllegalStateException(efuWFSeiT.GJp);
                        }
                    } else {
                        C6.r.b(obj);
                        int i9 = this.f5232b;
                        k kVar = this.f5233c;
                        Messages.ClientMessage.a aVarP = Messages.ClientMessage.newBuilder().p(Messages.OpenVirtualDevice.newBuilder().h(i9).f(P3.f.e(this.f5234d)).g(P3.f.m(this.f5234d)));
                        kotlin.jvm.internal.t.f(aVarP, "setOpenVirtualDevice(...)");
                        this.f5231a = 1;
                        if (M3.l.a(kVar, aVarP, this) == objF) {
                            return objF;
                        }
                    }
                    return C6.G.f1419a;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(k kVar, KnownHost.Device device, G6.d dVar) {
            super(2, dVar);
            this.f5225c = kVar;
            this.f5226d = device;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new E(this.f5225c, this.f5226d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((E) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5223a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                return obj;
            }
            C6.r.b(obj);
            p008a7.a.C0338a c0338a = p008a7.a.f13446b;
            long jS = p008a7.c.s(30, p008a7.d.SECONDS);
            a aVar = new a(m.this, this.f5225c, this.f5226d, null);
            this.f5223a = 1;
            Object objD = X0.d(jS, aVar, this);
            return objD == objF ? objF : objD;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class F extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5235a;

        public F(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new F(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((F) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            if (M3.l.a(r5, r1, r4) == r0) goto L17;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5235a;
            if (i8 == 0) {
                C6.r.b(obj);
                m mVar = m.this;
                this.f5235a = 1;
                if (M3.n.e(mVar, this) != objF) {
                }
                return objF;
            }
            if (i8 == 1) {
                C6.r.b(obj);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return C6.G.f1419a;
            k kVar = m.this.f5203m;
            if (kVar != null) {
                Messages.ClientMessage.a aVarQ = Messages.ClientMessage.newBuilder().q(Messages.PreviousPage.getDefaultInstance());
                kotlin.jvm.internal.t.f(aVarQ, "setPreviousPage(...)");
                this.f5235a = 2;
            }
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class G extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5237a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5238b;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends kotlin.jvm.internal.u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ long f5240a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(long j8) {
                super(1);
                this.f5240a = j8;
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AppMetrics.Builder invoke(AppMetrics.Builder it) {
                kotlin.jvm.internal.t.g(it, "it");
                return P3.a.a(it, this.f5240a);
            }
        }

        public G(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            G g8 = m.this.new G(dVar);
            g8.f5238b = obj;
            return g8;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C1038c c1038c, G6.d dVar) {
            return ((G) create(c1038c, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5237a;
            if (i8 == 0) {
                C6.r.b(obj);
                M3.r rVarD = M3.r.f5491p.d((C1038c) this.f5238b);
                V3.f.a(M3.q.a(m.f5189o, rVarD));
                long jA = rVarD.a() / ((long) 1000);
                if (jA > 0) {
                    AppSettingsStore appSettingsStore = m.this.f5195e;
                    a aVar = new a(jA);
                    this.f5237a = 1;
                    if (appSettingsStore.updateAppMetrics(aVar, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class H extends G6.a implements p017b7.G {
        public H(b7.G.a aVar) {
            super(aVar);
        }

        @Override // p017b7.G
        public void R1(G6.g gVar, Throwable th) {
            System.out.println((Object) ("Caught coroutine exception " + th + " in " + gVar));
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class I extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5241a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5242b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5243c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5244d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5246a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5247b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ N3.o f5248c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(N3.o oVar, G6.d dVar) {
                super(2, dVar);
                this.f5248c = oVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f5248c, dVar);
                aVar.f5247b = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                return ((a) create(interfaceC2261g, dVar)).invokeSuspend(C6.G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f5246a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    InterfaceC2261g interfaceC2261g = (InterfaceC2261g) this.f5247b;
                    N3.o oVar = this.f5248c;
                    if (oVar != null) {
                        this.f5246a = 1;
                        if (interfaceC2261g.emit(oVar, this) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
                return C6.G.f1419a;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5249a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5250b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f5251c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.H f5252d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.F f5253e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            public final /* synthetic */ kotlin.jvm.internal.J f5254f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(m mVar, kotlin.jvm.internal.H h8, kotlin.jvm.internal.F f8, kotlin.jvm.internal.J j8, G6.d dVar) {
                super(2, dVar);
                this.f5251c = mVar;
                this.f5252d = h8;
                this.f5253e = f8;
                this.f5254f = j8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                b bVar = new b(this.f5251c, this.f5252d, this.f5253e, this.f5254f, dVar);
                bVar.f5250b = obj;
                return bVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(N3.o oVar, G6.d dVar) {
                return ((b) create(oVar, dVar)).invokeSuspend(C6.G.f1419a);
            }

            /* JADX WARN: Code duplicated, block: B:30:0x00cb A[Catch: all -> 0x002e, TryCatch #0 {all -> 0x002e, blocks: (B:11:0x002a, B:28:0x009f, B:30:0x00cb, B:31:0x00ce, B:16:0x0035, B:25:0x0082, B:19:0x0041, B:21:0x0068, B:22:0x006b), top: B:53:0x000d }] */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v0, types: [int] */
            /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object] */
            /* JADX WARN: Type inference failed for: r1v15 */
            /* JADX WARN: Type inference failed for: r1v16 */
            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Throwable th;
                N3.o oVar;
                Z2.j jVar;
                String str;
                String strC;
                Z2.p pVar;
                Object objF = H6.c.f();
                N3.o oVar2 = this.f5249a;
                try {
                    if (oVar2 == 0) {
                        C6.r.b(obj);
                        N3.o oVar3 = (N3.o) this.f5250b;
                        Z2.j jVar2 = m.f5190p;
                        String str2 = "Connecting to " + oVar3;
                        String strC2 = jVar2.c();
                        Z2.p pVar2 = Z2.p.Debug;
                        if (jVar2.a().a().compareTo(pVar2) <= 0) {
                            jVar2.b(pVar2, strC2, null, str2);
                        }
                        m mVar = this.f5251c;
                        e.h[] hVarArr = {new e.a(oVar3)};
                        this.f5250b = oVar3;
                        this.f5249a = 1;
                        oVar = oVar3;
                        if (mVar.Y(hVarArr, this) == objF) {
                        }
                        return objF;
                    }
                    if (oVar2 == 1) {
                        N3.o oVar4 = (N3.o) this.f5250b;
                        C6.r.b(obj);
                        oVar = oVar4;
                    } else {
                        if (oVar2 != 2) {
                            if (oVar2 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            th = (Throwable) this.f5250b;
                            C6.r.b(obj);
                            this.f5254f.f28779a = th;
                            if (Integer.compareUnsigned(this.f5252d.f28777a, this.f5251c.I().a()) >= 0) {
                                return I6.b.a(false);
                            }
                            return I6.b.a(!(th instanceof M3.d.a ? true : th instanceof M3.d.b ? true : th instanceof M3.d.c));
                        }
                        N3.o oVar5 = (N3.o) this.f5250b;
                        C6.r.b(obj);
                        oVar2 = oVar5;
                    }
                    jVar = m.f5190p;
                    str = "Connecting to " + ((Object) oVar2) + " succeeded";
                    strC = jVar.c();
                    pVar = Z2.p.Debug;
                    if (jVar.a().a().compareTo(pVar) <= 0) {
                        jVar.b(pVar, strC, null, str);
                    }
                    this.f5253e.f28775a = true;
                    return I6.b.a(false);
                    kotlin.jvm.internal.H h8 = this.f5252d;
                    h8.f28777a = C6.y.b(h8.f28777a + 1);
                    Q qD = this.f5251c.D(oVar);
                    this.f5250b = oVar;
                    this.f5249a = 2;
                    oVar2 = oVar;
                    if (qD.Q0(this) == objF) {
                        return objF;
                    }
                    jVar = m.f5190p;
                    str = "Connecting to " + ((Object) oVar2) + " succeeded";
                    strC = jVar.c();
                    pVar = Z2.p.Debug;
                    if (jVar.a().a().compareTo(pVar) <= 0) {
                        jVar.b(pVar, strC, null, str);
                    }
                    this.f5253e.f28775a = true;
                    return I6.b.a(false);
                } catch (Throwable th2) {
                    Z2.j jVar3 = m.f5190p;
                    String str3 = "Connecting to " + oVar2 + " failed";
                    String strC3 = jVar3.c();
                    Z2.p pVar3 = Z2.p.Debug;
                    if (jVar3.a().a().compareTo(pVar3) <= 0) {
                        jVar3.b(pVar3, strC3, th2, str3);
                    }
                    m mVar2 = this.f5251c;
                    e.h[] hVarArr2 = {new e.b(oVar2, th2)};
                    this.f5250b = th2;
                    this.f5249a = 3;
                    if (mVar2.Y(hVarArr2, this) != objF) {
                        th = th2;
                    }
                    return objF;
                }
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends I6.l implements Q6.p {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5255a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5256b;

            public c(G6.d dVar) {
                super(3, dVar);
            }

            @Override // Q6.p
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC2261g interfaceC2261g, Throwable th, G6.d dVar) {
                c cVar = new c(dVar);
                cVar.f5256b = th;
                return cVar.invokeSuspend(C6.G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) throws Throwable {
                H6.c.f();
                if (this.f5255a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                Throwable th = (Throwable) this.f5256b;
                if (th instanceof V0) {
                    return C6.G.f1419a;
                }
                throw th;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d implements InterfaceC2260f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f5257a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f5258b;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f5259a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ m f5260b;

                /* JADX INFO: renamed from: M3.m$I$d$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0188a extends I6.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f5261a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f5262b;

                    public C0188a(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f5261a = obj;
                        this.f5262b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC2261g interfaceC2261g, m mVar) {
                    this.f5259a = interfaceC2261g;
                    this.f5260b = mVar;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    C0188a c0188a;
                    if (dVar instanceof C0188a) {
                        c0188a = (C0188a) dVar;
                        int i8 = c0188a.f5262b;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0188a.f5262b = i8 - Integer.MIN_VALUE;
                        } else {
                            c0188a = new C0188a(dVar);
                        }
                    } else {
                        c0188a = new C0188a(dVar);
                    }
                    Object obj2 = c0188a.f5261a;
                    Object objF = H6.c.f();
                    int i9 = c0188a.f5262b;
                    if (i9 == 0) {
                        C6.r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.f5259a;
                        if (P3.i.d(((N3.o) obj).b(), this.f5260b.L())) {
                            c0188a.f5262b = 1;
                            if (interfaceC2261g.emit(obj, c0188a) == objF) {
                                return objF;
                            }
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj2);
                    }
                    return C6.G.f1419a;
                }
            }

            public d(InterfaceC2260f interfaceC2260f, m mVar) {
                this.f5257a = interfaceC2260f;
                this.f5258b = mVar;
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = this.f5257a.collect(new a(interfaceC2261g, this.f5258b), dVar);
                return objCollect == H6.c.f() ? objCollect : C6.G.f1419a;
            }
        }

        public I(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new I(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((I) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        /* JADX WARN: Code duplicated, block: B:11:0x004b A[PHI: r2 r6 r7 r8
          0x004b: PHI (r2v6 kotlin.jvm.internal.H) = (r2v3 kotlin.jvm.internal.H), (r2v19 kotlin.jvm.internal.H) binds: [B:18:0x00b0, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x004b: PHI (r6v4 kotlin.jvm.internal.J) = (r6v1 kotlin.jvm.internal.J), (r6v15 kotlin.jvm.internal.J) binds: [B:18:0x00b0, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x004b: PHI (r7v5 kotlin.jvm.internal.F) = (r7v2 kotlin.jvm.internal.F), (r7v9 kotlin.jvm.internal.F) binds: [B:18:0x00b0, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]
          0x004b: PHI (r8v6 java.lang.Object) = (r8v5 java.lang.Object), (r8v8 java.lang.Object) binds: [B:18:0x00b0, B:10:0x003a] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:22:0x00b8  */
        /* JADX WARN: Code duplicated, block: B:25:0x00dd  */
        /* JADX WARN: Code duplicated, block: B:29:0x012b  */
        /* JADX WARN: Code duplicated, block: B:33:0x0146  */
        /* JADX WARN: Code duplicated, block: B:36:0x014b  */
        /* JADX WARN: Code duplicated, block: B:38:0x014e  */
        /* JADX WARN: Code duplicated, block: B:40:0x0154  */
        /* JADX WARN: Code duplicated, block: B:45:0x0167  */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x0161, code lost:
        
            if (r3.B(null, r2, r21) == r1) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0179, code lost:
        
            if (r2.B(null, r3, r21) == r1) goto L47;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            kotlin.jvm.internal.J j8;
            kotlin.jvm.internal.F f8;
            kotlin.jvm.internal.H h8;
            Object objX;
            kotlin.jvm.internal.J j9;
            kotlin.jvm.internal.F f9;
            KnownHost knownHost;
            N3.o oVar;
            InterfaceC2260f interfaceC2260fF;
            kotlin.jvm.internal.F f10;
            kotlin.jvm.internal.J j10;
            Endpoint lastEndpoint;
            m mVar;
            e.h[] hVarArr;
            kotlin.jvm.internal.F f11;
            Throwable th;
            Object objF = H6.c.f();
            switch (this.f5244d) {
                case 0:
                    C6.r.b(obj);
                    kotlin.jvm.internal.F f12 = new kotlin.jvm.internal.F();
                    j8 = new kotlin.jvm.internal.J();
                    kotlin.jvm.internal.H h9 = new kotlin.jvm.internal.H();
                    h9.f28777a = 0;
                    m mVar2 = m.this;
                    e.h[] hVarArr2 = {new e.g()};
                    this.f5241a = f12;
                    this.f5242b = j8;
                    this.f5243c = h9;
                    this.f5244d = 1;
                    if (mVar2.Y(hVarArr2, this) != objF) {
                        f8 = f12;
                        h8 = h9;
                        InterfaceC2260f interfaceC2260fM103getKnownHostByIDjCyGMI4 = m.this.f5195e.m103getKnownHostByIDjCyGMI4(m.this.L());
                        this.f5241a = f8;
                        this.f5242b = j8;
                        this.f5243c = h8;
                        this.f5244d = 2;
                        objX = AbstractC2262h.x(interfaceC2260fM103getKnownHostByIDjCyGMI4, this);
                        if (objX != objF) {
                            kotlin.jvm.internal.H h10 = h8;
                            j9 = j8;
                            f9 = f8;
                            knownHost = (KnownHost) objX;
                            if (knownHost != null || (lastEndpoint = knownHost.getLastEndpoint()) == null) {
                                oVar = null;
                            } else {
                                String strL = m.this.L();
                                String host = lastEndpoint.getHost();
                                kotlin.jvm.internal.t.f(host, "getHost(...)");
                                oVar = new N3.o(strL, host, lastEndpoint.getPort(), Endpoint.Source.CACHE, null);
                            }
                            interfaceC2260fF = AbstractC2262h.f(AbstractC2262h.U(AbstractC2262h.V(P3.d.a(AbstractC2262h.N(new d(m.this.f5194d, m.this), new a(oVar, null))), m.this.I().c()), new b(m.this, h10, f9, j9, null)), new c(null));
                            this.f5241a = f9;
                            this.f5242b = j9;
                            this.f5243c = null;
                            this.f5244d = 3;
                            if (AbstractC2262h.i(interfaceC2260fF, this) != objF) {
                                f10 = f9;
                                j10 = j9;
                                mVar = m.this;
                                hVarArr = new e.h[]{new e.f()};
                                this.f5241a = f10;
                                this.f5242b = j10;
                                this.f5244d = 4;
                                if (mVar.Y(hVarArr, this) != objF) {
                                    f11 = f10;
                                    if (f11.f28775a) {
                                        return C6.G.f1419a;
                                    }
                                    th = (Throwable) j10.f28779a;
                                    if (th != null) {
                                        m mVar3 = m.this;
                                        M3.d.C0184d c0184d = new M3.d.C0184d();
                                        this.f5241a = null;
                                        this.f5242b = null;
                                        this.f5244d = 6;
                                    } else {
                                        m mVar4 = m.this;
                                        this.f5241a = null;
                                        this.f5242b = null;
                                        this.f5244d = 5;
                                    }
                                }
                            }
                        }
                        break;
                    }
                    return objF;
                case 1:
                    h8 = (kotlin.jvm.internal.H) this.f5243c;
                    j8 = (kotlin.jvm.internal.J) this.f5242b;
                    f8 = (kotlin.jvm.internal.F) this.f5241a;
                    C6.r.b(obj);
                    InterfaceC2260f interfaceC2260fM103getKnownHostByIDjCyGMI5 = m.this.f5195e.m103getKnownHostByIDjCyGMI4(m.this.L());
                    this.f5241a = f8;
                    this.f5242b = j8;
                    this.f5243c = h8;
                    this.f5244d = 2;
                    objX = AbstractC2262h.x(interfaceC2260fM103getKnownHostByIDjCyGMI5, this);
                    if (objX != objF) {
                        kotlin.jvm.internal.H h11 = h8;
                        j9 = j8;
                        f9 = f8;
                        knownHost = (KnownHost) objX;
                        if (knownHost != null) {
                            oVar = null;
                        } else {
                            oVar = null;
                        }
                        interfaceC2260fF = AbstractC2262h.f(AbstractC2262h.U(AbstractC2262h.V(P3.d.a(AbstractC2262h.N(new d(m.this.f5194d, m.this), new a(oVar, null))), m.this.I().c()), new b(m.this, h11, f9, j9, null)), new c(null));
                        this.f5241a = f9;
                        this.f5242b = j9;
                        this.f5243c = null;
                        this.f5244d = 3;
                        if (AbstractC2262h.i(interfaceC2260fF, this) != objF) {
                            f10 = f9;
                            j10 = j9;
                            mVar = m.this;
                            hVarArr = new e.h[]{new e.f()};
                            this.f5241a = f10;
                            this.f5242b = j10;
                            this.f5244d = 4;
                            if (mVar.Y(hVarArr, this) != objF) {
                                f11 = f10;
                                if (f11.f28775a) {
                                    return C6.G.f1419a;
                                }
                                th = (Throwable) j10.f28779a;
                                if (th != null) {
                                    m mVar5 = m.this;
                                    M3.d.C0184d c0184d2 = new M3.d.C0184d();
                                    this.f5241a = null;
                                    this.f5242b = null;
                                    this.f5244d = 6;
                                } else {
                                    m mVar6 = m.this;
                                    this.f5241a = null;
                                    this.f5242b = null;
                                    this.f5244d = 5;
                                }
                            }
                        }
                        break;
                    }
                    return objF;
                case 2:
                    h8 = (kotlin.jvm.internal.H) this.f5243c;
                    j8 = (kotlin.jvm.internal.J) this.f5242b;
                    f8 = (kotlin.jvm.internal.F) this.f5241a;
                    C6.r.b(obj);
                    objX = obj;
                    kotlin.jvm.internal.H h12 = h8;
                    j9 = j8;
                    f9 = f8;
                    knownHost = (KnownHost) objX;
                    if (knownHost != null) {
                        oVar = null;
                    } else {
                        oVar = null;
                    }
                    interfaceC2260fF = AbstractC2262h.f(AbstractC2262h.U(AbstractC2262h.V(P3.d.a(AbstractC2262h.N(new d(m.this.f5194d, m.this), new a(oVar, null))), m.this.I().c()), new b(m.this, h12, f9, j9, null)), new c(null));
                    this.f5241a = f9;
                    this.f5242b = j9;
                    this.f5243c = null;
                    this.f5244d = 3;
                    if (AbstractC2262h.i(interfaceC2260fF, this) != objF) {
                        f10 = f9;
                        j10 = j9;
                        mVar = m.this;
                        hVarArr = new e.h[]{new e.f()};
                        this.f5241a = f10;
                        this.f5242b = j10;
                        this.f5244d = 4;
                        if (mVar.Y(hVarArr, this) != objF) {
                            f11 = f10;
                            if (f11.f28775a) {
                                return C6.G.f1419a;
                            }
                            th = (Throwable) j10.f28779a;
                            if (th != null) {
                                m mVar7 = m.this;
                                M3.d.C0184d c0184d3 = new M3.d.C0184d();
                                this.f5241a = null;
                                this.f5242b = null;
                                this.f5244d = 6;
                            } else {
                                m mVar8 = m.this;
                                this.f5241a = null;
                                this.f5242b = null;
                                this.f5244d = 5;
                            }
                        }
                        break;
                    }
                    return objF;
                case 3:
                    j10 = (kotlin.jvm.internal.J) this.f5242b;
                    f10 = (kotlin.jvm.internal.F) this.f5241a;
                    C6.r.b(obj);
                    mVar = m.this;
                    hVarArr = new e.h[]{new e.f()};
                    this.f5241a = f10;
                    this.f5242b = j10;
                    this.f5244d = 4;
                    if (mVar.Y(hVarArr, this) != objF) {
                        f11 = f10;
                        if (f11.f28775a) {
                            return C6.G.f1419a;
                        }
                        th = (Throwable) j10.f28779a;
                        if (th != null) {
                            m mVar9 = m.this;
                            M3.d.C0184d c0184d4 = new M3.d.C0184d();
                            this.f5241a = null;
                            this.f5242b = null;
                            this.f5244d = 6;
                        } else {
                            m mVar10 = m.this;
                            this.f5241a = null;
                            this.f5242b = null;
                            this.f5244d = 5;
                        }
                        break;
                    }
                    return objF;
                case 4:
                    j10 = (kotlin.jvm.internal.J) this.f5242b;
                    f11 = (kotlin.jvm.internal.F) this.f5241a;
                    C6.r.b(obj);
                    if (f11.f28775a) {
                        return C6.G.f1419a;
                    }
                    th = (Throwable) j10.f28779a;
                    if (th != null) {
                        m mVar11 = m.this;
                        this.f5241a = null;
                        this.f5242b = null;
                        this.f5244d = 5;
                        break;
                    } else {
                        m mVar12 = m.this;
                        M3.d.C0184d c0184d5 = new M3.d.C0184d();
                        this.f5241a = null;
                        this.f5242b = null;
                        this.f5244d = 6;
                        break;
                    }
                    return objF;
                case 5:
                    C6.r.b(obj);
                    return C6.G.f1419a;
                case 6:
                    C6.r.b(obj);
                    return C6.G.f1419a;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class J extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5264a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5265b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5266c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f5267d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f5269f;

        public J(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5267d = obj;
            this.f5269f |= Integer.MIN_VALUE;
            return m.this.Y(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class K extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5270a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public boolean f5271b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f5272c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5274e;

        public K(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5272c = obj;
            this.f5274e |= Integer.MIN_VALUE;
            return m.this.a0(false, this);
        }
    }

    /* JADX INFO: renamed from: M3.m$a, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1036a {
        public /* synthetic */ C1036a(AbstractC2633k abstractC2633k) {
            this();
        }

        public C1036a() {
        }
    }

    /* JADX INFO: renamed from: M3.m$b, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1037b extends Exception {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final Messages.Error.b f5275a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5276b;

        public /* synthetic */ C1037b(Messages.Error.b bVar, String str, int i8, AbstractC2633k abstractC2633k) {
            this(bVar, (i8 & 2) != 0 ? null : str);
        }

        public final Messages.Error.b a() {
            return this.f5275a;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1037b(Messages.Error.b code, String str) {
            super("RPC error (code: " + code + ", reason: " + str + ")");
            kotlin.jvm.internal.t.g(code, "code");
            this.f5275a = code;
            this.f5276b = str;
        }
    }

    /* JADX INFO: renamed from: M3.m$c, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1038c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f5277a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f5278b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final g f5279c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final N3.o f5280d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final Q3.b f5281e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f5282f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final String f5283g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final int f5284h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public final String f5285i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        public final String f5286j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        public final List f5287k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        public final e f5288l;

        public /* synthetic */ C1038c(String str, String str2, g gVar, N3.o oVar, Q3.b bVar, String str3, String str4, int i8, String str5, String str6, List list, e eVar, AbstractC2633k abstractC2633k) {
            this(str, str2, gVar, oVar, bVar, str3, str4, i8, str5, str6, list, eVar);
        }

        public static /* synthetic */ C1038c b(C1038c c1038c, String str, String str2, g gVar, N3.o oVar, Q3.b bVar, String str3, String str4, int i8, String str5, String str6, List list, e eVar, int i9, Object obj) {
            if ((i9 & 1) != 0) {
                str = c1038c.f5277a;
            }
            if ((i9 & 2) != 0) {
                str2 = c1038c.f5278b;
            }
            if ((i9 & 4) != 0) {
                gVar = c1038c.f5279c;
            }
            if ((i9 & 8) != 0) {
                oVar = c1038c.f5280d;
            }
            if ((i9 & 16) != 0) {
                bVar = c1038c.f5281e;
            }
            if ((i9 & 32) != 0) {
                str3 = c1038c.f5282f;
            }
            if ((i9 & 64) != 0) {
                str4 = c1038c.f5283g;
            }
            if ((i9 & 128) != 0) {
                i8 = c1038c.f5284h;
            }
            if ((i9 & 256) != 0) {
                str5 = c1038c.f5285i;
            }
            if ((i9 & 512) != 0) {
                str6 = c1038c.f5286j;
            }
            if ((i9 & 1024) != 0) {
                list = c1038c.f5287k;
            }
            if ((i9 & 2048) != 0) {
                eVar = c1038c.f5288l;
            }
            List list2 = list;
            e eVar2 = eVar;
            String str7 = str5;
            String str8 = str6;
            String str9 = str4;
            int i10 = i8;
            Q3.b bVar2 = bVar;
            String str10 = str3;
            return c1038c.a(str, str2, gVar, oVar, bVar2, str10, str9, i10, str7, str8, list2, eVar2);
        }

        public final C1038c a(String workstationID, String str, g connectionState, N3.o oVar, Q3.b keypad, String str2, String str3, int i8, String str4, String str5, List availableEndpoints, e logbook) {
            kotlin.jvm.internal.t.g(workstationID, "workstationID");
            kotlin.jvm.internal.t.g(connectionState, "connectionState");
            kotlin.jvm.internal.t.g(keypad, "keypad");
            kotlin.jvm.internal.t.g(availableEndpoints, "availableEndpoints");
            kotlin.jvm.internal.t.g(logbook, "logbook");
            return new C1038c(workstationID, str, connectionState, oVar, keypad, str2, str3, i8, str4, str5, availableEndpoints, logbook, null);
        }

        public final List c() {
            return this.f5287k;
        }

        public final g d() {
            return this.f5279c;
        }

        public final String e() {
            return this.f5278b;
        }

        /* JADX WARN: Code duplicated, block: B:15:0x0021  */
        public boolean equals(Object obj) {
            boolean zD;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1038c)) {
                return false;
            }
            C1038c c1038c = (C1038c) obj;
            if (!P3.i.d(this.f5277a, c1038c.f5277a)) {
                return false;
            }
            String str = this.f5278b;
            String str2 = c1038c.f5278b;
            if (str == null) {
                if (str2 == null) {
                    zD = true;
                } else {
                    zD = false;
                }
            } else if (str2 == null) {
                zD = false;
            } else {
                zD = P3.b.d(str, str2);
            }
            return zD && kotlin.jvm.internal.t.c(this.f5279c, c1038c.f5279c) && kotlin.jvm.internal.t.c(this.f5280d, c1038c.f5280d) && kotlin.jvm.internal.t.c(this.f5281e, c1038c.f5281e) && kotlin.jvm.internal.t.c(this.f5282f, c1038c.f5282f) && kotlin.jvm.internal.t.c(this.f5283g, c1038c.f5283g) && this.f5284h == c1038c.f5284h && kotlin.jvm.internal.t.c(this.f5285i, c1038c.f5285i) && kotlin.jvm.internal.t.c(this.f5286j, c1038c.f5286j) && kotlin.jvm.internal.t.c(this.f5287k, c1038c.f5287k) && kotlin.jvm.internal.t.c(this.f5288l, c1038c.f5288l);
        }

        public final Q3.b f() {
            return this.f5281e;
        }

        public final e g() {
            return this.f5288l;
        }

        public final String h() {
            return this.f5282f;
        }

        public int hashCode() {
            int iE = P3.i.e(this.f5277a) * 31;
            String str = this.f5278b;
            int iE2 = (((iE + (str == null ? 0 : P3.b.e(str))) * 31) + this.f5279c.hashCode()) * 31;
            N3.o oVar = this.f5280d;
            int iHashCode = (((iE2 + (oVar == null ? 0 : oVar.hashCode())) * 31) + this.f5281e.hashCode()) * 31;
            String str2 = this.f5282f;
            int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.f5283g;
            int iHashCode3 = (((iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31) + Integer.hashCode(this.f5284h)) * 31;
            String str4 = this.f5285i;
            int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.f5286j;
            return ((((iHashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31) + this.f5287k.hashCode()) * 31) + this.f5288l.hashCode();
        }

        public final String i() {
            return this.f5285i;
        }

        public final String j() {
            return this.f5286j;
        }

        public final int k() {
            return this.f5284h;
        }

        public final String l() {
            return this.f5283g;
        }

        public final String m() {
            return this.f5277a;
        }

        public final C1038c n(e.h... entries) {
            kotlin.jvm.internal.t.g(entries, "entries");
            return b(this, null, null, null, null, null, null, null, 0, null, null, null, this.f5288l.c((e.h[]) Arrays.copyOf(entries, entries.length)), 2047, null);
        }

        public C1038c(String workstationID, String str, g connectionState, N3.o oVar, Q3.b keypad, String str2, String str3, int i8, String str4, String str5, List availableEndpoints, e logbook) {
            kotlin.jvm.internal.t.g(workstationID, "workstationID");
            kotlin.jvm.internal.t.g(connectionState, "connectionState");
            kotlin.jvm.internal.t.g(keypad, "keypad");
            kotlin.jvm.internal.t.g(availableEndpoints, "availableEndpoints");
            kotlin.jvm.internal.t.g(logbook, "logbook");
            this.f5277a = workstationID;
            this.f5278b = str;
            this.f5279c = connectionState;
            this.f5280d = oVar;
            this.f5281e = keypad;
            this.f5282f = str2;
            this.f5283g = str3;
            this.f5284h = i8;
            this.f5285i = str4;
            this.f5286j = str5;
            this.f5287k = availableEndpoints;
            this.f5288l = logbook;
        }

        public String toString() {
            String strF = P3.i.f(this.f5277a);
            String str = this.f5278b;
            return "State(workstationID=" + strF + ", deviceID=" + (str == null ? "null" : P3.b.f(str)) + ", connectionState=" + this.f5279c + ", endpoint=" + this.f5280d + ", keypad=" + this.f5281e + ", serverHostname=" + this.f5282f + ", serverVersion=" + this.f5283g + ", serverProtocolVersion=" + this.f5284h + ", serverOSName=" + this.f5285i + ", serverOSVersion=" + this.f5286j + ", availableEndpoints=" + this.f5287k + ", logbook=" + this.f5288l + yOZfxp.FzlJjnzmsoGfbsB;
        }

        public /* synthetic */ C1038c(String str, String str2, g gVar, N3.o oVar, Q3.b bVar, String str3, String str4, int i8, String str5, String str6, List list, e eVar, int i9, AbstractC2633k abstractC2633k) {
            this(str, (i9 & 2) != 0 ? null : str2, (i9 & 4) != 0 ? g.d.f5154a : gVar, (i9 & 8) != 0 ? null : oVar, (i9 & 16) != 0 ? new Q3.b(null, null, 0, 0, 15, null) : bVar, (i9 & 32) != 0 ? null : str3, (i9 & 64) != 0 ? null : str4, (i9 & 128) != 0 ? 1 : i8, (i9 & 256) != 0 ? null : str5, (i9 & 512) != 0 ? null : str6, (i9 & 1024) != 0 ? D6.r.n() : list, (i9 & 2048) != 0 ? new e(null, 1, null) : eVar, null);
        }
    }

    /* JADX INFO: renamed from: M3.m$d, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class C1039d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f5289a;

        static {
            int[] iArr = new int[Messages.ServerMessage.b.values().length];
            try {
                iArr[Messages.ServerMessage.b.ICON.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Messages.ServerMessage.b.VIRTUALDEVICELIST.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Messages.ServerMessage.b.CONTEXT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Messages.ServerMessage.b.CONTEXTUPDATE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Messages.ServerMessage.b.SHORTCUTS.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Messages.ServerMessage.b.SHORTCUTSUPDATE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[Messages.ServerMessage.b.OK.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[Messages.ServerMessage.b.ERROR.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[Messages.ServerMessage.b.VIRTUALDEVICEOPENED.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            f5289a = iArr;
        }
    }

    /* JADX INFO: renamed from: M3.m$e, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1040e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5290a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5291b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5293d;

        public C1040e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5291b = obj;
            this.f5293d |= Integer.MIN_VALUE;
            return m.this.x(this);
        }
    }

    /* JADX INFO: renamed from: M3.m$f, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1041f extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ int f5295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f5296c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1041f(k kVar, G6.d dVar) {
            super(2, dVar);
            this.f5296c = kVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            C1041f c1041f = new C1041f(this.f5296c, dVar);
            c1041f.f5295b = ((Number) obj).intValue();
            return c1041f;
        }

        public final Object g(int i8, G6.d dVar) {
            return ((C1041f) create(Integer.valueOf(i8), dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // Q6.o
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return g(((Number) obj).intValue(), (G6.d) obj2);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5294a;
            if (i8 == 0) {
                C6.r.b(obj);
                int i9 = this.f5295b;
                k kVar = this.f5296c;
                Messages.ClientMessage.a aVarF = Messages.ClientMessage.newBuilder().f(Messages.Authenticate.newBuilder().f(i9));
                kotlin.jvm.internal.t.f(aVarF, "setAuthenticate(...)");
                this.f5294a = 1;
                if (M3.l.a(kVar, aVarF, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: M3.m$g, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1042g extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5297a;

        /* JADX INFO: renamed from: M3.m$g$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2260f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f5299a;

            /* JADX INFO: renamed from: M3.m$g$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0189a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f5300a;

                /* JADX INFO: renamed from: M3.m$g$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0190a extends I6.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f5301a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f5302b;

                    public C0190a(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f5301a = obj;
                        this.f5302b |= Integer.MIN_VALUE;
                        return C0189a.this.emit(null, this);
                    }
                }

                public C0189a(InterfaceC2261g interfaceC2261g) {
                    this.f5300a = interfaceC2261g;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    C0190a c0190a;
                    if (dVar instanceof C0190a) {
                        c0190a = (C0190a) dVar;
                        int i8 = c0190a.f5302b;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0190a.f5302b = i8 - Integer.MIN_VALUE;
                        } else {
                            c0190a = new C0190a(dVar);
                        }
                    } else {
                        c0190a = new C0190a(dVar);
                    }
                    Object obj2 = c0190a.f5301a;
                    Object objF = H6.c.f();
                    int i9 = c0190a.f5302b;
                    if (i9 == 0) {
                        C6.r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.f5300a;
                        if (!(((g) obj) instanceof g.f)) {
                            c0190a.f5302b = 1;
                            if (interfaceC2261g.emit(obj, c0190a) == objF) {
                                return objF;
                            }
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj2);
                    }
                    return C6.G.f1419a;
                }
            }

            public a(InterfaceC2260f interfaceC2260f) {
                this.f5299a = interfaceC2260f;
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = this.f5299a.collect(new C0189a(interfaceC2261g), dVar);
                return objCollect == H6.c.f() ? objCollect : C6.G.f1419a;
            }
        }

        public C1042g(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new C1042g(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((C1042g) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5297a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                return obj;
            }
            C6.r.b(obj);
            a aVar = new a(M3.n.f(m.this));
            p008a7.a.C0338a c0338a = p008a7.a.f13446b;
            InterfaceC2260f interfaceC2260fV = AbstractC2262h.V(aVar, p008a7.c.s(20, p008a7.d.SECONDS));
            this.f5297a = 1;
            Object objX = AbstractC2262h.x(interfaceC2260fV, this);
            return objX == objF ? objF : objX;
        }
    }

    /* JADX INFO: renamed from: M3.m$i, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1044i extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5310a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f5312c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1044i(String str, G6.d dVar) {
            super(2, dVar);
            this.f5312c = str;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new C1044i(this.f5312c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((C1044i) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5310a;
            if (i8 == 0) {
                C6.r.b(obj);
                m mVar = m.this;
                String str = this.f5312c;
                this.f5310a = 1;
                if (m.C(mVar, str, null, this, 2, null) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: M3.m$j, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1045j extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5313a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5314b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5315c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5316d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f5317e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f5319g;

        public C1045j(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5317e = obj;
            this.f5319g |= Integer.MIN_VALUE;
            return m.this.B(null, null, this);
        }
    }

    /* JADX INFO: renamed from: M3.m$k, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1046k extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5320a;

        public C1046k(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new C1046k(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((C1046k) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5320a;
            if (i8 == 0) {
                C6.r.b(obj);
                Q6.o oVar = m.this.f5204n;
                if (oVar != null) {
                    C1038c c1038cJ = m.this.J();
                    this.f5320a = 1;
                    if (oVar.invoke(c1038cJ, this) == objF) {
                        return objF;
                    }
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            m.this.f5204n = null;
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5322a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ N3.o f5324c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InterfaceC1812u f5325d;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5326a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f5327b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f5328c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ N3.o f5329d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ InterfaceC1812u f5330e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, N3.o oVar, InterfaceC1812u interfaceC1812u, G6.d dVar) {
                super(2, dVar);
                this.f5328c = mVar;
                this.f5329d = oVar;
                this.f5330e = interfaceC1812u;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f5328c, this.f5329d, this.f5330e, dVar);
                aVar.f5327b = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(k kVar, G6.d dVar) {
                return ((a) create(kVar, dVar)).invokeSuspend(C6.G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:29:0x0069, code lost:
            
                if (r9.O(r1, r7, r8) == r0) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:32:0x0076, code lost:
            
                if (r1.B(null, r9, r8) == r0) goto L36;
             */
            /* JADX WARN: Code restructure failed: missing block: B:35:0x0096, code lost:
            
                if (r1.Y(r4, r8) == r0) goto L36;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                k kVar;
                Object objF = H6.c.f();
                int i8 = this.f5326a;
                try {
                    try {
                        if (i8 == 0) {
                            C6.r.b(obj);
                            kVar = (k) this.f5327b;
                            this.f5328c.f5203m = kVar;
                            m mVar = this.f5328c;
                            N3.o oVar = this.f5329d;
                            this.f5327b = kVar;
                            this.f5326a = 1;
                            if (mVar.M(kVar, oVar, this) == objF) {
                            }
                            return objF;
                        }
                        if (i8 == 1) {
                            kVar = (k) this.f5327b;
                            C6.r.b(obj);
                        } else if (i8 == 2) {
                            C6.r.b(obj);
                        } else if (i8 == 3) {
                            C6.r.b(obj);
                            this.f5328c.X();
                        } else {
                            if (i8 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            C6.r.b(obj);
                        }
                        return C6.G.f1419a;
                        this.f5330e.r1(C6.G.f1419a);
                        m mVar2 = this.f5328c;
                        N3.o oVar2 = this.f5329d;
                        this.f5327b = null;
                        this.f5326a = 2;
                    } catch (Throwable th) {
                        this.f5328c.f5203m = null;
                        this.f5330e.v(th);
                        return C6.G.f1419a;
                    }
                } catch (d.f e8) {
                    m mVar3 = this.f5328c;
                    e.h[] hVarArr = {new e.C0185e(this.f5329d, e8), new e.i()};
                    this.f5327b = null;
                    this.f5326a = 3;
                } catch (Throwable th2) {
                    m mVar4 = this.f5328c;
                    this.f5327b = null;
                    this.f5326a = 4;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(N3.o oVar, InterfaceC1812u interfaceC1812u, G6.d dVar) {
            super(2, dVar);
            this.f5324c = oVar;
            this.f5325d = interfaceC1812u;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new l(this.f5324c, this.f5325d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((l) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5322a;
            try {
                if (i8 == 0) {
                    C6.r.b(obj);
                    Q6.q qVar = m.this.f5196f;
                    N3.o oVar = this.f5324c;
                    f fVarI = m.this.I();
                    a aVar = new a(m.this, this.f5324c, this.f5325d, null);
                    this.f5322a = 1;
                    if (qVar.i(oVar, fVarI, aVar, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
            } catch (Throwable th) {
                this.f5325d.v(th);
            }
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: renamed from: M3.m$m, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0191m extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5331a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5332b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5333c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5334d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f5335e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public /* synthetic */ Object f5336f;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f5338h;

        public C0191m(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5336f = obj;
            this.f5338h |= Integer.MIN_VALUE;
            return m.this.E(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class n extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5339a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5340b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Messages.VirtualDevice f5341c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f5342d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(Messages.VirtualDevice virtualDevice, KnownHost.Device device, G6.d dVar) {
            super(2, dVar);
            this.f5341c = virtualDevice;
            this.f5342d = device;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            n nVar = new n(this.f5341c, this.f5342d, dVar);
            nVar.f5340b = obj;
            return nVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(KnownHost.Device device, G6.d dVar) {
            return ((n) create(device, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f5339a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            KnownHost.Device.Builder lastCustomKeypadColumns = ((KnownHost.Device.Builder) ((KnownHost.Device) this.f5340b).toBuilder()).setDisplayName(this.f5341c.getName()).setAppearance(this.f5342d.getAppearance()).setKeypadRotation(this.f5342d.getKeypadRotation()).setKeypadRows(this.f5342d.getKeypadRows()).setKeypadColumns(this.f5342d.getKeypadColumns()).setLastCustomKeypadRows(this.f5342d.getLastCustomKeypadRows()).setLastCustomKeypadColumns(this.f5342d.getLastCustomKeypadColumns());
            KnownHost.Device device = this.f5342d;
            if (device.hasCustomFaceplate()) {
                lastCustomKeypadColumns.setCustomFaceplate(device.getCustomFaceplate());
            }
            if (device.hasDefaultFaceplate()) {
                lastCustomKeypadColumns.setDefaultFaceplate(device.getDefaultFaceplate());
            }
            GeneratedMessageLite generatedMessageLiteBuild = lastCustomKeypadColumns.setLastOpenedAt(P3.f.d()).build();
            kotlin.jvm.internal.t.f(generatedMessageLiteBuild, "build(...)");
            return generatedMessageLiteBuild;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class o extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5343a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5344b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5345c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5346d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f5347e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public boolean f5348f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f5349g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f5351i;

        public o(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5349g = obj;
            this.f5351i |= Integer.MIN_VALUE;
            return m.this.F(null, false, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class p extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5352a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f5354c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f5355d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final /* synthetic */ boolean f5356e;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5357a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f5358b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f5359c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            public final /* synthetic */ KnownHost.Device f5360d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            public final /* synthetic */ boolean f5361e;

            /* JADX INFO: renamed from: M3.m$p$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0192a extends I6.l implements Q6.o {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public int f5362a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public /* synthetic */ int f5363b;

                /* JADX INFO: renamed from: c, reason: collision with root package name */
                public final /* synthetic */ k f5364c;

                /* JADX INFO: renamed from: d, reason: collision with root package name */
                public final /* synthetic */ KnownHost.Device f5365d;

                /* JADX INFO: renamed from: e, reason: collision with root package name */
                public final /* synthetic */ boolean f5366e;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C0192a(k kVar, KnownHost.Device device, boolean z8, G6.d dVar) {
                    super(2, dVar);
                    this.f5364c = kVar;
                    this.f5365d = device;
                    this.f5366e = z8;
                }

                @Override // I6.a
                public final G6.d create(Object obj, G6.d dVar) {
                    C0192a c0192a = new C0192a(this.f5364c, this.f5365d, this.f5366e, dVar);
                    c0192a.f5363b = ((Number) obj).intValue();
                    return c0192a;
                }

                public final Object g(int i8, G6.d dVar) {
                    return ((C0192a) create(Integer.valueOf(i8), dVar)).invokeSuspend(C6.G.f1419a);
                }

                @Override // Q6.o
                public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                    return g(((Number) obj).intValue(), (G6.d) obj2);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    Object objF = H6.c.f();
                    int i8 = this.f5362a;
                    if (i8 == 0) {
                        C6.r.b(obj);
                        int i9 = this.f5363b;
                        k kVar = this.f5364c;
                        Messages.ClientMessage.a aVarI = Messages.ClientMessage.newBuilder().i(Messages.CreateVirtualDevice.newBuilder().h(i9).g(this.f5365d.getDisplayName()).i(this.f5366e).f(P3.f.m(this.f5365d)));
                        kotlin.jvm.internal.t.f(aVarI, "setCreateVirtualDevice(...)");
                        this.f5362a = 1;
                        if (M3.l.a(kVar, aVarI, this) == objF) {
                            return objF;
                        }
                    } else {
                        if (i8 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                    }
                    return C6.G.f1419a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, k kVar, KnownHost.Device device, boolean z8, G6.d dVar) {
                super(2, dVar);
                this.f5358b = mVar;
                this.f5359c = kVar;
                this.f5360d = device;
                this.f5361e = z8;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f5358b, this.f5359c, this.f5360d, this.f5361e, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p017b7.J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x0044, code lost:
            
                if (r9 == r0) goto L15;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f5357a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        C6.r.b(obj);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                    }
                    kotlin.jvm.internal.t.e(obj, "null cannot be cast to non-null type com.elgato.vsd2.Messages.VirtualDevice");
                    return (Messages.VirtualDevice) obj;
                }
                C6.r.b(obj);
                j jVar = this.f5358b.f5200j;
                C0192a c0192a = new C0192a(this.f5359c, this.f5360d, this.f5361e, null);
                this.f5357a = 1;
                obj = jVar.a(c0192a, this);
                if (obj != objF) {
                }
                return objF;
                this.f5357a = 2;
                obj = ((Q) obj).Q0(this);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(k kVar, KnownHost.Device device, boolean z8, G6.d dVar) {
            super(2, dVar);
            this.f5354c = kVar;
            this.f5355d = device;
            this.f5356e = z8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new p(this.f5354c, this.f5355d, this.f5356e, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((p) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5352a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                return obj;
            }
            C6.r.b(obj);
            p008a7.a.C0338a c0338a = p008a7.a.f13446b;
            long jS = p008a7.c.s(30, p008a7.d.SECONDS);
            a aVar = new a(m.this, this.f5354c, this.f5355d, this.f5356e, null);
            this.f5352a = 1;
            Object objD = X0.d(jS, aVar, this);
            return objD == objF ? objF : objD;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class q extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5367a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5368b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5370d;

        public q(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5368b = obj;
            this.f5370d |= Integer.MIN_VALUE;
            return m.this.H(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class r extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final /* synthetic */ k f5372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ m f5373c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5374a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ k f5375b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ m f5376c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, m mVar, G6.d dVar) {
                super(2, dVar);
                this.f5375b = kVar;
                this.f5376c = mVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f5375b, this.f5376c, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(p017b7.J j8, G6.d dVar) {
                return ((a) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x004b, code lost:
            
                if (M3.n.a(r6, r5) == r0) goto L15;
             */
            @Override // I6.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f5374a;
                if (i8 != 0) {
                    if (i8 == 1) {
                        C6.r.b(obj);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                    }
                    return C6.G.f1419a;
                }
                C6.r.b(obj);
                k kVar = this.f5375b;
                Messages.ClientMessage.a aVarK = Messages.ClientMessage.newBuilder().k((Messages.DeleteVirtualDevice) Messages.DeleteVirtualDevice.newBuilder().build());
                kotlin.jvm.internal.t.f(aVarK, "setDeleteVirtualDevice(...)");
                this.f5374a = 1;
                if (M3.l.a(kVar, aVarK, this) != objF) {
                }
                return objF;
                m mVar = this.f5376c;
                this.f5374a = 2;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(k kVar, m mVar, G6.d dVar) {
            super(2, dVar);
            this.f5372b = kVar;
            this.f5373c = mVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return new r(this.f5372b, this.f5373c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((r) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5371a;
            if (i8 == 0) {
                C6.r.b(obj);
                p008a7.a.C0338a c0338a = p008a7.a.f13446b;
                long jS = p008a7.c.s(30, p008a7.d.SECONDS);
                a aVar = new a(this.f5372b, this.f5373c, null);
                this.f5371a = 1;
                if (X0.d(jS, aVar, this) == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class s extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5377a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5378b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5379c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5380d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f5381e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f5382f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f5383g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f5385i;

        public s(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5383g = obj;
            this.f5385i |= Integer.MIN_VALUE;
            return m.this.M(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class t extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5386a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ int f5388c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ boolean f5389d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(int i8, boolean z8, G6.d dVar) {
            super(2, dVar);
            this.f5388c = i8;
            this.f5389d = z8;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new t(this.f5388c, this.f5389d, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((t) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0057, code lost:
        
            if (M3.l.a(r6, r1, r5) == r0) goto L17;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5386a;
            if (i8 == 0) {
                C6.r.b(obj);
                m mVar = m.this;
                this.f5386a = 1;
                if (M3.n.e(mVar, this) != objF) {
                }
                return objF;
            }
            if (i8 == 1) {
                C6.r.b(obj);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return C6.G.f1419a;
            k kVar = m.this.f5203m;
            if (kVar != null) {
                Messages.ClientMessage.a aVarM = Messages.ClientMessage.newBuilder().m(Messages.KeyPress.newBuilder().f(this.f5388c).g(this.f5389d));
                kotlin.jvm.internal.t.f(aVarM, "setKeyPress(...)");
                this.f5386a = 2;
            }
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class u extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5390a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5391b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5392c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public Object f5393d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public Object f5394e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public Object f5395f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public /* synthetic */ Object f5396g;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public int f5398i;

        public u(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5396g = obj;
            this.f5398i |= Integer.MIN_VALUE;
            return m.this.O(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class v extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5399a;

        public v(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new v(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((v) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x004b, code lost:
        
            if (M3.l.a(r5, r1, r4) == r0) goto L17;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5399a;
            if (i8 == 0) {
                C6.r.b(obj);
                m mVar = m.this;
                this.f5399a = 1;
                if (M3.n.e(mVar, this) != objF) {
                }
                return objF;
            }
            if (i8 == 1) {
                C6.r.b(obj);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            return C6.G.f1419a;
            k kVar = m.this.f5203m;
            if (kVar != null) {
                Messages.ClientMessage.a aVarN = Messages.ClientMessage.newBuilder().n(Messages.NextPage.getDefaultInstance());
                kotlin.jvm.internal.t.f(aVarN, "setNextPage(...)");
                this.f5399a = 2;
            }
            return C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class w extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5401a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5402b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f5403c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f5404d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public /* synthetic */ Object f5405e;

        public w(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            w wVar = m.this.new w(dVar);
            wVar.f5405e = obj;
            return wVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Messages.UpdateKeypadConfig updateKeypadConfig, G6.d dVar) {
            return ((w) create(updateKeypadConfig, dVar)).invokeSuspend(C6.G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x00ba, code lost:
        
            if (M3.l.a(r2, r4, r24) == r0) goto L19;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Messages.UpdateKeypadConfig updateKeypadConfig;
            Messages.Size layoutCrop;
            m mVar;
            p098k7.a aVar;
            Object objF = H6.c.f();
            int i8 = this.f5404d;
            try {
                if (i8 != 0) {
                    if (i8 == 1) {
                        aVar = (p098k7.a) this.f5403c;
                        mVar = (m) this.f5402b;
                        layoutCrop = (Messages.Size) this.f5401a;
                        updateKeypadConfig = (Messages.UpdateKeypadConfig) this.f5405e;
                        C6.r.b(obj);
                    } else {
                        if (i8 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C6.r.b(obj);
                    }
                    return C6.G.f1419a;
                }
                C6.r.b(obj);
                updateKeypadConfig = (Messages.UpdateKeypadConfig) this.f5405e;
                layoutCrop = updateKeypadConfig.getLayoutCrop();
                m mVar2 = m.this;
                p098k7.a aVar2 = mVar2.f5199i;
                this.f5405e = updateKeypadConfig;
                this.f5401a = layoutCrop;
                this.f5402b = mVar2;
                this.f5403c = aVar2;
                this.f5404d = 1;
                if (aVar2.b(null, this) != objF) {
                    mVar = mVar2;
                    aVar = aVar2;
                }
                return objF;
                p044e7.x xVar = mVar.f5201k;
                C1038c c1038c = (C1038c) mVar.f5201k.getValue();
                xVar.setValue(C1038c.b(c1038c, null, null, null, null, c1038c.f().i(layoutCrop.getHeight(), layoutCrop.getWidth()), null, null, 0, null, null, null, null, 4079, null));
                C6.G g8 = C6.G.f1419a;
                aVar.e(null);
                k kVar = m.this.f5203m;
                if (kVar != null) {
                    Messages.ClientMessage.a aVarR = Messages.ClientMessage.newBuilder().r(updateKeypadConfig);
                    kotlin.jvm.internal.t.f(aVarR, "setUpdateKeypadConfig(...)");
                    this.f5405e = null;
                    this.f5401a = null;
                    this.f5402b = null;
                    this.f5403c = null;
                    this.f5404d = 2;
                }
                return C6.G.f1419a;
            } catch (Throwable th) {
                aVar.e(null);
                throw th;
            }
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class x implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f5407a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f5408a;

            /* JADX INFO: renamed from: M3.m$x$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0193a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f5409a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f5410b;

                public C0193a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f5409a = obj;
                    this.f5410b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f5408a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0193a c0193a;
                if (dVar instanceof C0193a) {
                    c0193a = (C0193a) dVar;
                    int i8 = c0193a.f5410b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0193a.f5410b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0193a = new C0193a(dVar);
                    }
                } else {
                    c0193a = new C0193a(dVar);
                }
                Object obj2 = c0193a.f5409a;
                Object objF = H6.c.f();
                int i9 = c0193a.f5410b;
                if (i9 == 0) {
                    C6.r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f5408a;
                    KnownHost.Device device = (KnownHost.Device) obj;
                    Messages.UpdateKeypadConfig updateKeypadConfigN = device != null ? P3.f.n(device) : null;
                    if (updateKeypadConfigN != null) {
                        c0193a.f5410b = 1;
                        if (interfaceC2261g.emit(updateKeypadConfigN, c0193a) == objF) {
                            return objF;
                        }
                    }
                } else {
                    if (i9 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj2);
                }
                return C6.G.f1419a;
            }
        }

        public x(InterfaceC2260f interfaceC2260f) {
            this.f5407a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f5407a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : C6.G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class y extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f5412a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f5413b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f5414c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f5416e;

        public y(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f5414c = obj;
            this.f5416e |= Integer.MIN_VALUE;
            return m.this.R(null, null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class z extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5417a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f5418b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final /* synthetic */ N3.o f5420d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(N3.o oVar, G6.d dVar) {
            super(2, dVar);
            this.f5420d = oVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            z zVar = m.this.new z(this.f5420d, dVar);
            zVar.f5418b = obj;
            return zVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(KnownHost knownHost, G6.d dVar) {
            return ((z) create(knownHost, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f5417a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            KnownHost knownHost = (KnownHost) this.f5418b;
            KnownHost.Builder builder = (KnownHost.Builder) knownHost.toBuilder();
            String strH = m.this.J().h();
            if (strH == null) {
                strH = knownHost.getDisplayName();
            }
            GeneratedMessageLite generatedMessageLiteBuild = builder.setDisplayName(strH).setLastEndpoint(this.f5420d.d()).setIsAuthenticated(true).build();
            kotlin.jvm.internal.t.f(generatedMessageLiteBuild, "build(...)");
            return generatedMessageLiteBuild;
        }
    }

    public /* synthetic */ m(String str, String str2, boolean z8, f fVar, Messages.ClientInformation clientInformation, InterfaceC2260f interfaceC2260f, AppSettingsStore appSettingsStore, Q6.q qVar, i iVar, G6.g gVar, AbstractC2633k abstractC2633k) {
        this(str, str2, z8, fVar, clientInformation, interfaceC2260f, appSettingsStore, qVar, iVar, gVar);
    }

    public static /* synthetic */ void A(m mVar, String str, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = null;
        }
        mVar.z(str);
    }

    public static /* synthetic */ Object C(m mVar, String str, Throwable th, G6.d dVar, int i8, Object obj) {
        if ((i8 & 1) != 0) {
            str = null;
        }
        if ((i8 & 2) != 0) {
            th = null;
        }
        return mVar.B(str, th, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:76:0x0197 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:22:0x004f, B:83:0x01b1, B:85:0x01c1, B:86:0x01c4, B:27:0x0068, B:74:0x0193, B:76:0x0197, B:78:0x019b, B:80:0x019f), top: B:95:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x019b A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:22:0x004f, B:83:0x01b1, B:85:0x01c1, B:86:0x01c4, B:27:0x0068, B:74:0x0193, B:76:0x0197, B:78:0x019b, B:80:0x019f), top: B:95:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:79:0x019e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:82:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:83:0x01b1 A[Catch: all -> 0x0054, PHI: r4 r6
      0x01b1: PHI (r4v8 ??) = (r4v16 ??), (r4v17 ??), (r4v18 ??) binds: [B:75:0x0195, B:81:0x01ae, B:22:0x004f] A[DONT_GENERATE, DONT_INLINE]
      0x01b1: PHI (r6v13 M3.m) = (r6v11 M3.m), (r6v11 M3.m), (r6v16 M3.m) binds: [B:75:0x0195, B:81:0x01ae, B:22:0x004f] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0054, blocks: (B:22:0x004f, B:83:0x01b1, B:85:0x01c1, B:86:0x01c4, B:27:0x0068, B:74:0x0193, B:76:0x0197, B:78:0x019b, B:80:0x019f), top: B:95:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:85:0x01c1 A[Catch: all -> 0x0054, TryCatch #0 {all -> 0x0054, blocks: (B:22:0x004f, B:83:0x01b1, B:85:0x01c1, B:86:0x01c4, B:27:0x0068, B:74:0x0193, B:76:0x0197, B:78:0x019b, B:80:0x019f), top: B:95:0x0029 }] */
    /* JADX WARN: Code duplicated, block: B:89:0x01dd  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [k7.a] */
    /* JADX WARN: Type inference failed for: r4v0, types: [int] */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v16 */
    /* JADX WARN: Type inference failed for: r4v17 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v8, types: [java.lang.Object] */
    public final Object B(String str, Throwable th, G6.d dVar) throws Throwable {
        C1045j c1045j;
        ?? r8;
        String str2;
        Throwable th2;
        p098k7.a aVar;
        m mVar;
        a bVar;
        Object objPrevious;
        Throwable th3;
        m mVar2;
        String str3;
        p098k7.a aVar2;
        p098k7.a aVar3;
        m mVar3;
        k kVar;
        d dVar2;
        InterfaceC1815v0 interfaceC1815v0;
        J0 j8;
        C1046k c1046k;
        if (dVar instanceof C1045j) {
            c1045j = (C1045j) dVar;
            int i8 = c1045j.f5319g;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1045j.f5319g = i8 - Integer.MIN_VALUE;
            } else {
                c1045j = new C1045j(dVar);
            }
        } else {
            c1045j = new C1045j(dVar);
        }
        Object obj = c1045j.f5317e;
        Object objF = H6.c.f();
        ?? r9 = c1045j.f5319g;
        try {
            try {
                if (r9 == 0) {
                    C6.r.b(obj);
                    p098k7.a aVar4 = this.f5199i;
                    c1045j.f5313a = this;
                    str2 = str;
                    c1045j.f5314b = str2;
                    th2 = th;
                    c1045j.f5315c = th2;
                    c1045j.f5316d = aVar4;
                    c1045j.f5319g = 1;
                    if (aVar4.b(null, c1045j) != objF) {
                        aVar = aVar4;
                        mVar = this;
                    }
                    return objF;
                }
                if (r9 != 1) {
                    if (r9 != 2) {
                        if (r9 != 3) {
                            if (r9 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            r8 = (p098k7.a) c1045j.f5313a;
                            try {
                                C6.r.b(obj);
                                r8 = r8;
                                C6.G g8 = C6.G.f1419a;
                                r8.e(null);
                                return C6.G.f1419a;
                            } catch (Throwable th4) {
                                th = th4;
                                r8.e(null);
                                throw th;
                            }
                        }
                        p098k7.a aVar5 = (p098k7.a) c1045j.f5314b;
                        mVar2 = (m) c1045j.f5313a;
                        C6.r.b(obj);
                        r9 = aVar5;
                        mVar2.f5203m = null;
                        interfaceC1815v0 = (InterfaceC1815v0) mVar2.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                        if (interfaceC1815v0 != null) {
                            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                        }
                        j8 = J0.f15902b;
                        c1046k = mVar2.new C1046k(null);
                        c1045j.f5313a = r9;
                        c1045j.f5314b = null;
                        c1045j.f5315c = null;
                        c1045j.f5316d = null;
                        c1045j.f5319g = 4;
                        if (AbstractC1785g.g(j8, c1046k, c1045j) != objF) {
                            r8 = r9;
                            C6.G g9 = C6.G.f1419a;
                            r8.e(null);
                            return C6.G.f1419a;
                        }
                        return objF;
                    }
                    p098k7.a aVar6 = (p098k7.a) c1045j.f5316d;
                    th3 = (Throwable) c1045j.f5315c;
                    str3 = (String) c1045j.f5314b;
                    mVar3 = (m) c1045j.f5313a;
                    C6.r.b(obj);
                    aVar3 = aVar6;
                    mVar2 = mVar3;
                    aVar2 = aVar3;
                    kVar = mVar2.f5203m;
                    r9 = aVar2;
                    if (kVar == null) {
                        mVar2.f5203m = null;
                        interfaceC1815v0 = (InterfaceC1815v0) mVar2.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                        if (interfaceC1815v0 != null) {
                            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                        }
                        j8 = J0.f15902b;
                        c1046k = mVar2.new C1046k(null);
                        c1045j.f5313a = r9;
                        c1045j.f5314b = null;
                        c1045j.f5315c = null;
                        c1045j.f5316d = null;
                        c1045j.f5319g = 4;
                        if (AbstractC1785g.g(j8, c1046k, c1045j) != objF) {
                            r8 = r9;
                            C6.G g10 = C6.G.f1419a;
                            r8.e(null);
                            return C6.G.f1419a;
                        }
                    } else {
                        if (th3 instanceof d) {
                            dVar2 = (d) th3;
                        } else {
                            dVar2 = null;
                        }
                        c1045j.f5313a = mVar2;
                        c1045j.f5314b = aVar2;
                        c1045j.f5315c = null;
                        c1045j.f5316d = null;
                        c1045j.f5319g = 3;
                        r9 = aVar2;
                        if (kVar.D1(str3, dVar2, c1045j) != objF) {
                            mVar2.f5203m = null;
                            interfaceC1815v0 = (InterfaceC1815v0) mVar2.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                            if (interfaceC1815v0 != null) {
                                InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                            }
                            j8 = J0.f15902b;
                            c1046k = mVar2.new C1046k(null);
                            c1045j.f5313a = r9;
                            c1045j.f5314b = null;
                            c1045j.f5315c = null;
                            c1045j.f5316d = null;
                            c1045j.f5319g = 4;
                            if (AbstractC1785g.g(j8, c1046k, c1045j) != objF) {
                                r8 = r9;
                                C6.G g11 = C6.G.f1419a;
                                r8.e(null);
                                return C6.G.f1419a;
                            }
                        }
                    }
                    return objF;
                }
                p098k7.a aVar7 = (p098k7.a) c1045j.f5316d;
                th2 = (Throwable) c1045j.f5315c;
                String str4 = (String) c1045j.f5314b;
                mVar = (m) c1045j.f5313a;
                C6.r.b(obj);
                aVar = aVar7;
                str2 = str4;
                if (!(mVar.J().d() instanceof g.a)) {
                    if (th2 == null) {
                        bVar = new b(str2, null, 2, null);
                    } else if (th2 instanceof d.a) {
                        bVar = ((d.a) th2).a();
                    } else {
                        bVar = th2 instanceof d ? new b(str2, (d) th2) : new b(str2, new d.b(th2));
                    }
                    p044e7.x xVar = mVar.f5201k;
                    C1038c c1038c = (C1038c) mVar.f5201k.getValue();
                    List listB = c1038c.g().b();
                    ListIterator listIterator = listB.listIterator(listB.size());
                    do {
                        if (!listIterator.hasPrevious()) {
                            objPrevious = null;
                            break;
                        }
                        objPrevious = listIterator.previous();
                    } while (!(((e.h) objPrevious) instanceof e.a));
                    e.h hVar = (e.h) objPrevious;
                    N3.o oVarB = hVar != null ? ((e.a) hVar).b() : null;
                    xVar.setValue(C1038c.b(c1038c, null, null, new g.a(bVar), null, null, null, null, 0, null, null, null, (oVarB == null || (D6.z.u0(c1038c.g().b()) instanceof e.C0185e)) ? c1038c.g() : c1038c.g().c(new e.d(oVarB, bVar)), 2043, null));
                    if (th2 != null) {
                        j jVar = mVar.f5200j;
                        c1045j.f5313a = mVar;
                        c1045j.f5314b = str2;
                        c1045j.f5315c = th2;
                        c1045j.f5316d = aVar;
                        c1045j.f5319g = 2;
                        if (jVar.c(th2, c1045j) != objF) {
                            th3 = th2;
                            str3 = str2;
                            aVar3 = aVar;
                            mVar3 = mVar;
                            mVar2 = mVar3;
                            aVar2 = aVar3;
                            kVar = mVar2.f5203m;
                            r9 = aVar2;
                            if (kVar == null) {
                                mVar2.f5203m = null;
                                interfaceC1815v0 = (InterfaceC1815v0) mVar2.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                                if (interfaceC1815v0 != null) {
                                    InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                                }
                                j8 = J0.f15902b;
                                c1046k = mVar2.new C1046k(null);
                                c1045j.f5313a = r9;
                                c1045j.f5314b = null;
                                c1045j.f5315c = null;
                                c1045j.f5316d = null;
                                c1045j.f5319g = 4;
                                if (AbstractC1785g.g(j8, c1046k, c1045j) != objF) {
                                    r8 = r9;
                                }
                            } else {
                                if (th3 instanceof d) {
                                    dVar2 = (d) th3;
                                } else {
                                    dVar2 = null;
                                }
                                c1045j.f5313a = mVar2;
                                c1045j.f5314b = aVar2;
                                c1045j.f5315c = null;
                                c1045j.f5316d = null;
                                c1045j.f5319g = 3;
                                r9 = aVar2;
                                if (kVar.D1(str3, dVar2, c1045j) != objF) {
                                    mVar2.f5203m = null;
                                    interfaceC1815v0 = (InterfaceC1815v0) mVar2.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                                    if (interfaceC1815v0 != null) {
                                        InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                                    }
                                    j8 = J0.f15902b;
                                    c1046k = mVar2.new C1046k(null);
                                    c1045j.f5313a = r9;
                                    c1045j.f5314b = null;
                                    c1045j.f5315c = null;
                                    c1045j.f5316d = null;
                                    c1045j.f5319g = 4;
                                    if (AbstractC1785g.g(j8, c1046k, c1045j) != objF) {
                                        r8 = r9;
                                    }
                                }
                            }
                        }
                    } else {
                        th3 = th2;
                        mVar2 = mVar;
                        str3 = str2;
                        aVar2 = aVar;
                        kVar = mVar2.f5203m;
                        r9 = aVar2;
                        if (kVar == null) {
                            mVar2.f5203m = null;
                            interfaceC1815v0 = (InterfaceC1815v0) mVar2.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                            if (interfaceC1815v0 != null) {
                                InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                            }
                            j8 = J0.f15902b;
                            c1046k = mVar2.new C1046k(null);
                            c1045j.f5313a = r9;
                            c1045j.f5314b = null;
                            c1045j.f5315c = null;
                            c1045j.f5316d = null;
                            c1045j.f5319g = 4;
                            if (AbstractC1785g.g(j8, c1046k, c1045j) != objF) {
                                r8 = r9;
                            }
                        } else {
                            if (th3 instanceof d) {
                                dVar2 = (d) th3;
                            } else {
                                dVar2 = null;
                            }
                            c1045j.f5313a = mVar2;
                            c1045j.f5314b = aVar2;
                            c1045j.f5315c = null;
                            c1045j.f5316d = null;
                            c1045j.f5319g = 3;
                            r9 = aVar2;
                            if (kVar.D1(str3, dVar2, c1045j) != objF) {
                                mVar2.f5203m = null;
                                interfaceC1815v0 = (InterfaceC1815v0) mVar2.getCoroutineContext().A(InterfaceC1815v0.f15985O);
                                if (interfaceC1815v0 != null) {
                                    InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
                                }
                                j8 = J0.f15902b;
                                c1046k = mVar2.new C1046k(null);
                                c1045j.f5313a = r9;
                                c1045j.f5314b = null;
                                c1045j.f5315c = null;
                                c1045j.f5316d = null;
                                c1045j.f5319g = 4;
                                if (AbstractC1785g.g(j8, c1046k, c1045j) != objF) {
                                    r8 = r9;
                                }
                            }
                        }
                    }
                    return objF;
                }
                r8 = aVar;
                C6.G g12 = C6.G.f1419a;
                r8.e(null);
                return C6.G.f1419a;
            } catch (Throwable th5) {
                th = th5;
                r8 = aVar;
                r8.e(null);
                throw th;
            }
        } catch (Throwable th6) {
            th = th6;
            r8 = r9;
        }
    }

    public final Q D(N3.o oVar) {
        InterfaceC1812u interfaceC1812uB = AbstractC1816w.b(null, 1, null);
        AbstractC1789i.d(this, null, null, new l(oVar, interfaceC1812uB, null), 3, null);
        return interfaceC1812uB;
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    public final Object E(KnownHost.Device device, Messages.VirtualDevice virtualDevice, G6.d dVar) {
        C0191m c0191m;
        m mVar;
        String str;
        KnownHost.Device defaultInstance;
        p098k7.a aVar;
        m mVar2;
        String str2;
        KnownHost.Device device2;
        if (dVar instanceof C0191m) {
            c0191m = (C0191m) dVar;
            int i8 = c0191m.f5338h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c0191m.f5338h = i8 - Integer.MIN_VALUE;
            } else {
                c0191m = new C0191m(dVar);
            }
        } else {
            c0191m = new C0191m(dVar);
        }
        C0191m c0191m2 = c0191m;
        Object objM96createOrUpdateDeviceDUA0qnw = c0191m2.f5336f;
        Object objF = H6.c.f();
        int i9 = c0191m2.f5338h;
        if (i9 == 0) {
            C6.r.b(objM96createOrUpdateDeviceDUA0qnw);
            String id = virtualDevice.getId();
            kotlin.jvm.internal.t.f(id, "getId(...)");
            String strB = P3.b.b(id);
            AppSettingsStore appSettingsStore = this.f5195e;
            String str3 = this.f5191a;
            n nVar = new n(virtualDevice, device, null);
            c0191m2.f5331a = this;
            c0191m2.f5332b = strB;
            c0191m2.f5338h = 1;
            objM96createOrUpdateDeviceDUA0qnw = appSettingsStore.m96createOrUpdateDeviceDUA0qnw(str3, strB, device, nVar, c0191m2);
            if (objM96createOrUpdateDeviceDUA0qnw != objF) {
                mVar = this;
                str = strB;
            }
            return objF;
        }
        if (i9 == 1) {
            String str4 = (String) c0191m2.f5332b;
            mVar = (m) c0191m2.f5331a;
            C6.r.b(objM96createOrUpdateDeviceDUA0qnw);
            str = str4;
        } else {
            if (i9 == 2) {
                aVar = (p098k7.a) c0191m2.f5335e;
                mVar = (m) c0191m2.f5334d;
                KnownHost.Device device3 = (KnownHost.Device) c0191m2.f5333c;
                str = (String) c0191m2.f5332b;
                mVar2 = (m) c0191m2.f5331a;
                C6.r.b(objM96createOrUpdateDeviceDUA0qnw);
                defaultInstance = device3;
                str2 = str;
                try {
                    mVar.f5201k.setValue(C1038c.b((C1038c) mVar.f5201k.getValue(), null, str2, g.C0186g.f5157a, null, null, null, null, 0, null, null, null, null, 4089, null));
                    C6.G g8 = C6.G.f1419a;
                    aVar.e(null);
                    c0191m2.f5331a = defaultInstance;
                    c0191m2.f5332b = null;
                    c0191m2.f5333c = null;
                    c0191m2.f5334d = null;
                    c0191m2.f5335e = null;
                    c0191m2.f5338h = 3;
                    if (mVar2.Q(str2, c0191m2) != objF) {
                        device2 = defaultInstance;
                    }
                    return objF;
                } catch (Throwable th) {
                    aVar.e(null);
                    throw th;
                }
            }
            if (i9 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            device2 = (KnownHost.Device) c0191m2.f5331a;
            C6.r.b(objM96createOrUpdateDeviceDUA0qnw);
        }
        kotlin.jvm.internal.t.d(device2);
        return device2;
        defaultInstance = (KnownHost.Device) objM96createOrUpdateDeviceDUA0qnw;
        if (defaultInstance == null) {
            defaultInstance = KnownHost.Device.getDefaultInstance();
        }
        aVar = mVar.f5199i;
        c0191m2.f5331a = mVar;
        c0191m2.f5332b = str;
        c0191m2.f5333c = defaultInstance;
        c0191m2.f5334d = mVar;
        c0191m2.f5335e = aVar;
        c0191m2.f5338h = 2;
        if (aVar.b(null, c0191m2) != objF) {
            mVar2 = mVar;
            str2 = str;
            mVar.f5201k.setValue(C1038c.b((C1038c) mVar.f5201k.getValue(), null, str2, g.C0186g.f5157a, null, null, null, null, 0, null, null, null, null, 4089, null));
            C6.G g9 = C6.G.f1419a;
            aVar.e(null);
            c0191m2.f5331a = defaultInstance;
            c0191m2.f5332b = null;
            c0191m2.f5333c = null;
            c0191m2.f5334d = null;
            c0191m2.f5335e = null;
            c0191m2.f5338h = 3;
            if (mVar2.Q(str2, c0191m2) != objF) {
                device2 = defaultInstance;
                kotlin.jvm.internal.t.d(device2);
                return device2;
            }
        }
        return objF;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0128  */
    /* JADX WARN: Code duplicated, block: B:40:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object F(KnownHost.Device device, boolean z8, G6.d dVar) {
        o oVar;
        KnownHost.Device device2;
        boolean z9;
        m mVar;
        k kVar;
        KnownHost.Device device3;
        m mVar2;
        p098k7.a aVar;
        KnownHost.Device device4;
        m mVar3;
        Object objE;
        if (dVar instanceof o) {
            oVar = (o) dVar;
            int i8 = oVar.f5351i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                oVar.f5351i = i8 - Integer.MIN_VALUE;
            } else {
                oVar = new o(dVar);
            }
        } else {
            oVar = new o(dVar);
        }
        Object objG = oVar.f5349g;
        Object objF = H6.c.f();
        int i9 = oVar.f5351i;
        if (i9 == 0) {
            C6.r.b(objG);
            oVar.f5343a = this;
            device2 = device;
            oVar.f5344b = device2;
            z9 = z8;
            oVar.f5348f = z9;
            oVar.f5351i = 1;
            if (M3.n.b(this, oVar) != objF) {
                mVar = this;
            }
            return objF;
        }
        if (i9 == 1) {
            z9 = oVar.f5348f;
            KnownHost.Device device5 = (KnownHost.Device) oVar.f5344b;
            m mVar4 = (m) oVar.f5343a;
            C6.r.b(objG);
            device2 = device5;
            mVar = mVar4;
        } else {
            if (i9 == 2) {
                z9 = oVar.f5348f;
                aVar = (p098k7.a) oVar.f5347e;
                mVar = (m) oVar.f5346d;
                kVar = (k) oVar.f5345c;
                KnownHost.Device device6 = (KnownHost.Device) oVar.f5344b;
                m mVar5 = (m) oVar.f5343a;
                C6.r.b(objG);
                device3 = device6;
                mVar2 = mVar5;
                boolean z10 = z9;
                k kVar2 = kVar;
                try {
                    mVar.f5201k.setValue(C1038c.b((C1038c) mVar.f5201k.getValue(), null, null, null, null, new Q3.b(null, null, device3.getKeypadRows(), device3.getKeypadColumns(), 3, null), null, null, 0, null, null, null, null, 4079, null));
                    C6.G g8 = C6.G.f1419a;
                    aVar.e(null);
                    p017b7.F fK1 = Z.a().k1(1);
                    p pVar = mVar2.new p(kVar2, device3, z10, null);
                    device4 = device3;
                    oVar.f5343a = mVar2;
                    oVar.f5344b = device4;
                    oVar.f5345c = null;
                    oVar.f5346d = null;
                    oVar.f5347e = null;
                    oVar.f5351i = 3;
                    objG = AbstractC1785g.g(fK1, pVar, oVar);
                    if (objG != objF) {
                        mVar3 = mVar2;
                    }
                    return objF;
                } catch (Throwable th) {
                    aVar.e(null);
                    throw th;
                }
            }
            if (i9 != 3) {
                if (i9 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(objG);
                return objG;
            }
            device4 = (KnownHost.Device) oVar.f5344b;
            mVar3 = (m) oVar.f5343a;
            C6.r.b(objG);
        }
        oVar.f5343a = null;
        oVar.f5344b = null;
        oVar.f5351i = 4;
        objE = mVar3.E(device4, (Messages.VirtualDevice) objG, oVar);
        if (objE != objF) {
            return objF;
        }
        return objE;
        kVar = mVar.f5203m;
        if (kVar == null) {
            throw new IllegalStateException("BUG: Client must not be null at this point.");
        }
        p098k7.a aVar2 = mVar.f5199i;
        oVar.f5343a = mVar;
        oVar.f5344b = device2;
        oVar.f5345c = kVar;
        oVar.f5346d = mVar;
        oVar.f5347e = aVar2;
        oVar.f5348f = z9;
        oVar.f5351i = 2;
        if (aVar2.b(null, oVar) != objF) {
            device3 = device2;
            mVar2 = mVar;
            aVar = aVar2;
            boolean z11 = z9;
            k kVar3 = kVar;
            mVar.f5201k.setValue(C1038c.b((C1038c) mVar.f5201k.getValue(), null, null, null, null, new Q3.b(null, null, device3.getKeypadRows(), device3.getKeypadColumns(), 3, null), null, null, 0, null, null, null, null, 4079, null));
            C6.G g9 = C6.G.f1419a;
            aVar.e(null);
            p017b7.F fK2 = Z.a().k1(1);
            p pVar2 = mVar2.new p(kVar3, device3, z11, null);
            device4 = device3;
            oVar.f5343a = mVar2;
            oVar.f5344b = device4;
            oVar.f5345c = null;
            oVar.f5346d = null;
            oVar.f5347e = null;
            oVar.f5351i = 3;
            objG = AbstractC1785g.g(fK2, pVar2, oVar);
            if (objG != objF) {
                mVar3 = mVar2;
                oVar.f5343a = null;
                oVar.f5344b = null;
                oVar.f5351i = 4;
                objE = mVar3.E(device4, (Messages.VirtualDevice) objG, oVar);
                if (objE != objF) {
                    return objE;
                }
            }
        }
        return objF;
    }

    public final Object G(String str, boolean z8, G6.d dVar) {
        KnownHost.Device.Builder builderNewBuilder = KnownHost.Device.newBuilder();
        kotlin.jvm.internal.t.f(builderNewBuilder, "newBuilder(...)");
        GeneratedMessageLite generatedMessageLiteBuild = P3.f.o(builderNewBuilder).setDisplayName(str).build();
        kotlin.jvm.internal.t.f(generatedMessageLiteBuild, "build(...)");
        return F((KnownHost.Device) generatedMessageLiteBuild, z8, dVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0065, code lost:
    
        if (p017b7.AbstractC1785g.g(r4, r5, r0) == r1) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object H(G6.d dVar) {
        q qVar;
        m mVar;
        if (dVar instanceof q) {
            qVar = (q) dVar;
            int i8 = qVar.f5370d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                qVar.f5370d = i8 - Integer.MIN_VALUE;
            } else {
                qVar = new q(dVar);
            }
        } else {
            qVar = new q(dVar);
        }
        Object obj = qVar.f5368b;
        Object objF = H6.c.f();
        int i9 = qVar.f5370d;
        if (i9 == 0) {
            C6.r.b(obj);
            qVar.f5367a = this;
            qVar.f5370d = 1;
            if (M3.n.e(this, qVar) != objF) {
                mVar = this;
            }
            return objF;
        }
        if (i9 == 1) {
            mVar = (m) qVar.f5367a;
            C6.r.b(obj);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
        }
        return C6.G.f1419a;
        k kVar = mVar.f5203m;
        if (kVar == null) {
            throw new IllegalStateException("BUG: Client must not be null at this point.");
        }
        p017b7.F fK1 = Z.a().k1(1);
        r rVar = new r(kVar, mVar, null);
        qVar.f5367a = null;
        qVar.f5370d = 2;
    }

    public final f I() {
        return this.f5192b;
    }

    public final C1038c J() {
        return (C1038c) this.f5201k.getValue();
    }

    public final M K() {
        return this.f5202l;
    }

    public final String L() {
        return this.f5191a;
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0072 A[PHI: r0 r3 r7 r8
      0x0072: PHI (r0v9 java.lang.Object) = (r0v8 java.lang.Object), (r0v1 java.lang.Object) binds: [B:31:0x0143, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r3v12 N3.o) = (r3v9 N3.o), (r3v16 N3.o) binds: [B:31:0x0143, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r7v9 M3.k) = (r7v6 M3.k), (r7v13 M3.k) binds: [B:31:0x0143, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]
      0x0072: PHI (r8v17 M3.m) = (r8v14 M3.m), (r8v22 M3.m) binds: [B:31:0x0143, B:17:0x0063] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:29:0x012f  */
    /* JADX WARN: Code duplicated, block: B:35:0x014f  */
    /* JADX WARN: Code duplicated, block: B:38:0x016b  */
    /* JADX WARN: Code duplicated, block: B:40:0x016d  */
    /* JADX WARN: Code duplicated, block: B:43:0x018c  */
    /* JADX WARN: Code duplicated, block: B:50:0x01ac A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:51:0x01ae A[Catch: all -> 0x0206, TRY_ENTER, TryCatch #1 {all -> 0x0206, blocks: (B:44:0x018f, B:52:0x01b3, B:53:0x01e3, B:55:0x01e9, B:58:0x0209, B:51:0x01ae, B:71:0x0276, B:72:0x027b), top: B:80:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:55:0x01e9 A[Catch: all -> 0x0206, LOOP:0: B:53:0x01e3->B:55:0x01e9, LOOP_END, TryCatch #1 {all -> 0x0206, blocks: (B:44:0x018f, B:52:0x01b3, B:53:0x01e3, B:55:0x01e9, B:58:0x0209, B:51:0x01ae, B:71:0x0276, B:72:0x027b), top: B:80:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:61:0x0230  */
    /* JADX WARN: Code duplicated, block: B:66:0x0251  */
    /* JADX WARN: Code duplicated, block: B:71:0x0276 A[Catch: all -> 0x0206, TRY_ENTER, TryCatch #1 {all -> 0x0206, blocks: (B:44:0x018f, B:52:0x01b3, B:53:0x01e3, B:55:0x01e9, B:58:0x0209, B:51:0x01ae, B:71:0x0276, B:72:0x027b), top: B:80:0x018f }] */
    /* JADX WARN: Code duplicated, block: B:81:0x01a4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0248, code lost:
    
        if (M3.k.a.a(r10, null, null, r6, 3, null) == r2) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0270, code lost:
    
        if (r11.Y(r3, r6) == r2) goto L68;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(k kVar, N3.o oVar, G6.d dVar) throws Throwable {
        s sVar;
        p098k7.a aVar;
        k kVar2;
        N3.o oVar2;
        m mVar;
        m mVar2;
        Messages.ClientMessage.a aVarL;
        N3.o oVar3;
        m mVar3;
        k kVar3;
        N3.o oVar4;
        k kVar4;
        m mVar4;
        Messages.ServerMessage serverMessage;
        Messages.HelloFromServer hello;
        p098k7.a aVar2;
        k kVar5;
        m mVar5;
        p098k7.a aVar3;
        d.e eVar;
        Object obj;
        C1038c c1038c;
        boolean clientNeedsAuthentication;
        g gVarD;
        ArrayList arrayList;
        if (dVar instanceof s) {
            sVar = (s) dVar;
            int i8 = sVar.f5385i;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                sVar.f5385i = i8 - Integer.MIN_VALUE;
            } else {
                sVar = new s(dVar);
            }
        } else {
            sVar = new s(dVar);
        }
        s sVar2 = sVar;
        Object objL = sVar2.f5383g;
        Object objF = H6.c.f();
        switch (sVar2.f5385i) {
            case 0:
                C6.r.b(objL);
                aVar = this.f5199i;
                sVar2.f5377a = this;
                kVar2 = kVar;
                sVar2.f5378b = kVar2;
                oVar2 = oVar;
                sVar2.f5379c = oVar2;
                sVar2.f5380d = this;
                sVar2.f5381e = aVar;
                sVar2.f5385i = 1;
                if (aVar.b(null, sVar2) != objF) {
                    mVar = this;
                    mVar2 = mVar;
                    try {
                        mVar.f5201k.setValue(C1038c.b((C1038c) mVar.f5201k.getValue(), null, null, g.c.f5153a, null, null, null, null, 0, null, null, null, null, 4091, null));
                        C6.G g8 = C6.G.f1419a;
                        aVar.e(null);
                        aVarL = Messages.ClientMessage.newBuilder().l(Messages.HelloFromClient.newBuilder().f(((Messages.ClientInformation.a) mVar2.f5193c.toBuilder()).k(2)));
                        kotlin.jvm.internal.t.f(aVarL, "setHello(...)");
                        sVar2.f5377a = mVar2;
                        sVar2.f5378b = kVar2;
                        sVar2.f5379c = oVar2;
                        sVar2.f5380d = null;
                        sVar2.f5381e = null;
                        sVar2.f5385i = 2;
                        if (M3.l.a(kVar2, aVarL, sVar2) != objF) {
                            oVar3 = oVar2;
                            mVar3 = mVar2;
                            kVar3 = kVar2;
                            p035d7.x xVarC = kVar3.c();
                            sVar2.f5377a = mVar3;
                            sVar2.f5378b = kVar3;
                            sVar2.f5379c = oVar3;
                            sVar2.f5385i = 3;
                            objL = xVarC.l(sVar2);
                            if (objL != objF) {
                                oVar4 = oVar3;
                                kVar4 = kVar3;
                                mVar4 = mVar3;
                                serverMessage = (Messages.ServerMessage) objL;
                                if (!serverMessage.hasHello()) {
                                    hello = serverMessage.getHello();
                                    aVar2 = mVar4.f5199i;
                                    sVar2.f5377a = mVar4;
                                    sVar2.f5378b = kVar4;
                                    sVar2.f5379c = oVar4;
                                    sVar2.f5380d = hello;
                                    sVar2.f5381e = mVar4;
                                    sVar2.f5382f = aVar2;
                                    sVar2.f5385i = 5;
                                    if (aVar2.b(null, sVar2) != objF) {
                                        kVar5 = kVar4;
                                        mVar5 = mVar4;
                                        aVar3 = aVar2;
                                        try {
                                            p044e7.x xVar = mVar4.f5201k;
                                            c1038c = (C1038c) mVar4.f5201k.getValue();
                                            clientNeedsAuthentication = hello.getClientNeedsAuthentication();
                                            if (clientNeedsAuthentication) {
                                                try {
                                                    gVarD = g.f.f5156a;
                                                } catch (Throwable th) {
                                                    th = th;
                                                    obj = null;
                                                    aVar3.e(obj);
                                                    throw th;
                                                }
                                            } else {
                                                if (clientNeedsAuthentication) {
                                                    throw new C6.m();
                                                }
                                                gVarD = c1038c.d();
                                            }
                                            g gVar = gVarD;
                                            String hostname = hello.getHostname();
                                            String version = hello.getVersion();
                                            int protocolVersion = hello.getProtocolVersion();
                                            String osName = hello.getOsName();
                                            String osVersion = hello.getOsVersion();
                                            List<String> addressesList = hello.getEndpoints().getAddressesList();
                                            kotlin.jvm.internal.t.f(addressesList, "getAddressesList(...)");
                                            arrayList = new ArrayList(C0938s.y(addressesList, 10));
                                            for (String str : addressesList) {
                                                kotlin.jvm.internal.t.d(str);
                                                arrayList.add(P3.f.a(str, hello.getEndpoints().getPort(), Endpoint.Source.STATIC));
                                            }
                                            xVar.setValue(C1038c.b(c1038c, null, null, gVar, null, null, hostname, version, protocolVersion, osName, osVersion, arrayList, null, 2075, null));
                                            C6.G g9 = C6.G.f1419a;
                                            aVar3.e(null);
                                            if (!kotlin.jvm.internal.t.c(hello.getWorkstationID(), mVar5.f5191a)) {
                                                e.h[] hVarArr = {new e.c(oVar4)};
                                                sVar2.f5377a = null;
                                                sVar2.f5378b = null;
                                                sVar2.f5379c = null;
                                                sVar2.f5380d = null;
                                                sVar2.f5381e = null;
                                                sVar2.f5382f = null;
                                                sVar2.f5385i = 7;
                                            } else {
                                                sVar2.f5377a = null;
                                                sVar2.f5378b = null;
                                                sVar2.f5379c = null;
                                                sVar2.f5380d = null;
                                                sVar2.f5381e = null;
                                                sVar2.f5382f = null;
                                                sVar2.f5385i = 6;
                                            }
                                        } catch (Throwable th2) {
                                            th = th2;
                                            obj = null;
                                        }
                                    }
                                } else {
                                    eVar = new d.e("HelloFromServer message expected");
                                    sVar2.f5377a = eVar;
                                    sVar2.f5378b = null;
                                    sVar2.f5379c = null;
                                    sVar2.f5385i = 4;
                                    if (k.a.a(kVar4, null, eVar, sVar2, 1, null) != objF) {
                                        throw eVar;
                                    }
                                }
                            }
                        }
                    } catch (Throwable th3) {
                        aVar.e(null);
                        throw th3;
                    }
                    break;
                }
                return objF;
            case 1:
                aVar = (p098k7.a) sVar2.f5381e;
                m mVar6 = (m) sVar2.f5380d;
                N3.o oVar5 = (N3.o) sVar2.f5379c;
                k kVar6 = (k) sVar2.f5378b;
                mVar2 = (m) sVar2.f5377a;
                C6.r.b(objL);
                mVar = mVar6;
                oVar2 = oVar5;
                kVar2 = kVar6;
                mVar.f5201k.setValue(C1038c.b((C1038c) mVar.f5201k.getValue(), null, null, g.c.f5153a, null, null, null, null, 0, null, null, null, null, 4091, null));
                C6.G g10 = C6.G.f1419a;
                aVar.e(null);
                aVarL = Messages.ClientMessage.newBuilder().l(Messages.HelloFromClient.newBuilder().f(((Messages.ClientInformation.a) mVar2.f5193c.toBuilder()).k(2)));
                kotlin.jvm.internal.t.f(aVarL, "setHello(...)");
                sVar2.f5377a = mVar2;
                sVar2.f5378b = kVar2;
                sVar2.f5379c = oVar2;
                sVar2.f5380d = null;
                sVar2.f5381e = null;
                sVar2.f5385i = 2;
                if (M3.l.a(kVar2, aVarL, sVar2) != objF) {
                    oVar3 = oVar2;
                    mVar3 = mVar2;
                    kVar3 = kVar2;
                    p035d7.x xVarC2 = kVar3.c();
                    sVar2.f5377a = mVar3;
                    sVar2.f5378b = kVar3;
                    sVar2.f5379c = oVar3;
                    sVar2.f5385i = 3;
                    objL = xVarC2.l(sVar2);
                    if (objL != objF) {
                        oVar4 = oVar3;
                        kVar4 = kVar3;
                        mVar4 = mVar3;
                        serverMessage = (Messages.ServerMessage) objL;
                        if (!serverMessage.hasHello()) {
                            hello = serverMessage.getHello();
                            aVar2 = mVar4.f5199i;
                            sVar2.f5377a = mVar4;
                            sVar2.f5378b = kVar4;
                            sVar2.f5379c = oVar4;
                            sVar2.f5380d = hello;
                            sVar2.f5381e = mVar4;
                            sVar2.f5382f = aVar2;
                            sVar2.f5385i = 5;
                            if (aVar2.b(null, sVar2) != objF) {
                                kVar5 = kVar4;
                                mVar5 = mVar4;
                                aVar3 = aVar2;
                                p044e7.x xVar2 = mVar4.f5201k;
                                c1038c = (C1038c) mVar4.f5201k.getValue();
                                clientNeedsAuthentication = hello.getClientNeedsAuthentication();
                                if (clientNeedsAuthentication) {
                                    gVarD = g.f.f5156a;
                                } else {
                                    if (clientNeedsAuthentication) {
                                        throw new C6.m();
                                    }
                                    gVarD = c1038c.d();
                                }
                                g gVar2 = gVarD;
                                String hostname2 = hello.getHostname();
                                String version2 = hello.getVersion();
                                int protocolVersion2 = hello.getProtocolVersion();
                                String osName2 = hello.getOsName();
                                String osVersion2 = hello.getOsVersion();
                                List<String> addressesList2 = hello.getEndpoints().getAddressesList();
                                kotlin.jvm.internal.t.f(addressesList2, "getAddressesList(...)");
                                arrayList = new ArrayList(C0938s.y(addressesList2, 10));
                                while (r7.hasNext()) {
                                    kotlin.jvm.internal.t.d(str);
                                    arrayList.add(P3.f.a(str, hello.getEndpoints().getPort(), Endpoint.Source.STATIC));
                                }
                                xVar2.setValue(C1038c.b(c1038c, null, null, gVar2, null, null, hostname2, version2, protocolVersion2, osName2, osVersion2, arrayList, null, 2075, null));
                                C6.G g11 = C6.G.f1419a;
                                aVar3.e(null);
                                if (!kotlin.jvm.internal.t.c(hello.getWorkstationID(), mVar5.f5191a)) {
                                    sVar2.f5377a = null;
                                    sVar2.f5378b = null;
                                    sVar2.f5379c = null;
                                    sVar2.f5380d = null;
                                    sVar2.f5381e = null;
                                    sVar2.f5382f = null;
                                    sVar2.f5385i = 6;
                                } else {
                                    e.h[] hVarArr2 = {new e.c(oVar4)};
                                    sVar2.f5377a = null;
                                    sVar2.f5378b = null;
                                    sVar2.f5379c = null;
                                    sVar2.f5380d = null;
                                    sVar2.f5381e = null;
                                    sVar2.f5382f = null;
                                    sVar2.f5385i = 7;
                                }
                            }
                        } else {
                            eVar = new d.e("HelloFromServer message expected");
                            sVar2.f5377a = eVar;
                            sVar2.f5378b = null;
                            sVar2.f5379c = null;
                            sVar2.f5385i = 4;
                            if (k.a.a(kVar4, null, eVar, sVar2, 1, null) != objF) {
                                throw eVar;
                            }
                        }
                    }
                    break;
                }
                return objF;
            case 2:
                oVar3 = (N3.o) sVar2.f5379c;
                kVar3 = (k) sVar2.f5378b;
                mVar3 = (m) sVar2.f5377a;
                C6.r.b(objL);
                p035d7.x xVarC3 = kVar3.c();
                sVar2.f5377a = mVar3;
                sVar2.f5378b = kVar3;
                sVar2.f5379c = oVar3;
                sVar2.f5385i = 3;
                objL = xVarC3.l(sVar2);
                if (objL != objF) {
                    oVar4 = oVar3;
                    kVar4 = kVar3;
                    mVar4 = mVar3;
                    serverMessage = (Messages.ServerMessage) objL;
                    if (!serverMessage.hasHello()) {
                        hello = serverMessage.getHello();
                        aVar2 = mVar4.f5199i;
                        sVar2.f5377a = mVar4;
                        sVar2.f5378b = kVar4;
                        sVar2.f5379c = oVar4;
                        sVar2.f5380d = hello;
                        sVar2.f5381e = mVar4;
                        sVar2.f5382f = aVar2;
                        sVar2.f5385i = 5;
                        if (aVar2.b(null, sVar2) != objF) {
                            kVar5 = kVar4;
                            mVar5 = mVar4;
                            aVar3 = aVar2;
                            p044e7.x xVar3 = mVar4.f5201k;
                            c1038c = (C1038c) mVar4.f5201k.getValue();
                            clientNeedsAuthentication = hello.getClientNeedsAuthentication();
                            if (clientNeedsAuthentication) {
                                gVarD = g.f.f5156a;
                            } else {
                                if (clientNeedsAuthentication) {
                                    throw new C6.m();
                                }
                                gVarD = c1038c.d();
                            }
                            g gVar3 = gVarD;
                            String hostname3 = hello.getHostname();
                            String version3 = hello.getVersion();
                            int protocolVersion3 = hello.getProtocolVersion();
                            String osName3 = hello.getOsName();
                            String osVersion3 = hello.getOsVersion();
                            List<String> addressesList3 = hello.getEndpoints().getAddressesList();
                            kotlin.jvm.internal.t.f(addressesList3, "getAddressesList(...)");
                            arrayList = new ArrayList(C0938s.y(addressesList3, 10));
                            while (r7.hasNext()) {
                                kotlin.jvm.internal.t.d(str);
                                arrayList.add(P3.f.a(str, hello.getEndpoints().getPort(), Endpoint.Source.STATIC));
                            }
                            xVar3.setValue(C1038c.b(c1038c, null, null, gVar3, null, null, hostname3, version3, protocolVersion3, osName3, osVersion3, arrayList, null, 2075, null));
                            C6.G g12 = C6.G.f1419a;
                            aVar3.e(null);
                            if (!kotlin.jvm.internal.t.c(hello.getWorkstationID(), mVar5.f5191a)) {
                                sVar2.f5377a = null;
                                sVar2.f5378b = null;
                                sVar2.f5379c = null;
                                sVar2.f5380d = null;
                                sVar2.f5381e = null;
                                sVar2.f5382f = null;
                                sVar2.f5385i = 6;
                            } else {
                                e.h[] hVarArr3 = {new e.c(oVar4)};
                                sVar2.f5377a = null;
                                sVar2.f5378b = null;
                                sVar2.f5379c = null;
                                sVar2.f5380d = null;
                                sVar2.f5381e = null;
                                sVar2.f5382f = null;
                                sVar2.f5385i = 7;
                            }
                        }
                    } else {
                        eVar = new d.e("HelloFromServer message expected");
                        sVar2.f5377a = eVar;
                        sVar2.f5378b = null;
                        sVar2.f5379c = null;
                        sVar2.f5385i = 4;
                        if (k.a.a(kVar4, null, eVar, sVar2, 1, null) != objF) {
                            throw eVar;
                        }
                    }
                    break;
                }
                return objF;
            case 3:
                oVar3 = (N3.o) sVar2.f5379c;
                kVar3 = (k) sVar2.f5378b;
                mVar3 = (m) sVar2.f5377a;
                C6.r.b(objL);
                oVar4 = oVar3;
                kVar4 = kVar3;
                mVar4 = mVar3;
                serverMessage = (Messages.ServerMessage) objL;
                if (!serverMessage.hasHello()) {
                    hello = serverMessage.getHello();
                    aVar2 = mVar4.f5199i;
                    sVar2.f5377a = mVar4;
                    sVar2.f5378b = kVar4;
                    sVar2.f5379c = oVar4;
                    sVar2.f5380d = hello;
                    sVar2.f5381e = mVar4;
                    sVar2.f5382f = aVar2;
                    sVar2.f5385i = 5;
                    if (aVar2.b(null, sVar2) != objF) {
                        kVar5 = kVar4;
                        mVar5 = mVar4;
                        aVar3 = aVar2;
                        p044e7.x xVar4 = mVar4.f5201k;
                        c1038c = (C1038c) mVar4.f5201k.getValue();
                        clientNeedsAuthentication = hello.getClientNeedsAuthentication();
                        if (clientNeedsAuthentication) {
                            gVarD = g.f.f5156a;
                        } else {
                            if (clientNeedsAuthentication) {
                                throw new C6.m();
                            }
                            gVarD = c1038c.d();
                        }
                        g gVar4 = gVarD;
                        String hostname4 = hello.getHostname();
                        String version4 = hello.getVersion();
                        int protocolVersion4 = hello.getProtocolVersion();
                        String osName4 = hello.getOsName();
                        String osVersion4 = hello.getOsVersion();
                        List<String> addressesList4 = hello.getEndpoints().getAddressesList();
                        kotlin.jvm.internal.t.f(addressesList4, "getAddressesList(...)");
                        arrayList = new ArrayList(C0938s.y(addressesList4, 10));
                        while (r7.hasNext()) {
                            kotlin.jvm.internal.t.d(str);
                            arrayList.add(P3.f.a(str, hello.getEndpoints().getPort(), Endpoint.Source.STATIC));
                        }
                        xVar4.setValue(C1038c.b(c1038c, null, null, gVar4, null, null, hostname4, version4, protocolVersion4, osName4, osVersion4, arrayList, null, 2075, null));
                        C6.G g13 = C6.G.f1419a;
                        aVar3.e(null);
                        if (!kotlin.jvm.internal.t.c(hello.getWorkstationID(), mVar5.f5191a)) {
                            sVar2.f5377a = null;
                            sVar2.f5378b = null;
                            sVar2.f5379c = null;
                            sVar2.f5380d = null;
                            sVar2.f5381e = null;
                            sVar2.f5382f = null;
                            sVar2.f5385i = 6;
                        } else {
                            e.h[] hVarArr4 = {new e.c(oVar4)};
                            sVar2.f5377a = null;
                            sVar2.f5378b = null;
                            sVar2.f5379c = null;
                            sVar2.f5380d = null;
                            sVar2.f5381e = null;
                            sVar2.f5382f = null;
                            sVar2.f5385i = 7;
                        }
                    }
                    break;
                } else {
                    eVar = new d.e("HelloFromServer message expected");
                    sVar2.f5377a = eVar;
                    sVar2.f5378b = null;
                    sVar2.f5379c = null;
                    sVar2.f5385i = 4;
                    if (k.a.a(kVar4, null, eVar, sVar2, 1, null) != objF) {
                        throw eVar;
                    }
                }
                return objF;
            case 4:
                d.e eVar2 = (d.e) sVar2.f5377a;
                C6.r.b(objL);
                throw eVar2;
            case 5:
                aVar3 = (p098k7.a) sVar2.f5382f;
                mVar4 = (m) sVar2.f5381e;
                hello = (Messages.HelloFromServer) sVar2.f5380d;
                oVar4 = (N3.o) sVar2.f5379c;
                kVar5 = (k) sVar2.f5378b;
                mVar5 = (m) sVar2.f5377a;
                C6.r.b(objL);
                p044e7.x xVar5 = mVar4.f5201k;
                c1038c = (C1038c) mVar4.f5201k.getValue();
                clientNeedsAuthentication = hello.getClientNeedsAuthentication();
                if (clientNeedsAuthentication) {
                    gVarD = g.f.f5156a;
                    break;
                } else {
                    if (clientNeedsAuthentication) {
                        throw new C6.m();
                    }
                    gVarD = c1038c.d();
                }
                g gVar5 = gVarD;
                String hostname5 = hello.getHostname();
                String version5 = hello.getVersion();
                int protocolVersion5 = hello.getProtocolVersion();
                String osName5 = hello.getOsName();
                String osVersion5 = hello.getOsVersion();
                List<String> addressesList5 = hello.getEndpoints().getAddressesList();
                kotlin.jvm.internal.t.f(addressesList5, "getAddressesList(...)");
                arrayList = new ArrayList(C0938s.y(addressesList5, 10));
                while (r7.hasNext()) {
                    kotlin.jvm.internal.t.d(str);
                    arrayList.add(P3.f.a(str, hello.getEndpoints().getPort(), Endpoint.Source.STATIC));
                }
                xVar5.setValue(C1038c.b(c1038c, null, null, gVar5, null, null, hostname5, version5, protocolVersion5, osName5, osVersion5, arrayList, null, 2075, null));
                C6.G g14 = C6.G.f1419a;
                aVar3.e(null);
                if (!kotlin.jvm.internal.t.c(hello.getWorkstationID(), mVar5.f5191a)) {
                    e.h[] hVarArr5 = {new e.c(oVar4)};
                    sVar2.f5377a = null;
                    sVar2.f5378b = null;
                    sVar2.f5379c = null;
                    sVar2.f5380d = null;
                    sVar2.f5381e = null;
                    sVar2.f5382f = null;
                    sVar2.f5385i = 7;
                    break;
                } else {
                    sVar2.f5377a = null;
                    sVar2.f5378b = null;
                    sVar2.f5379c = null;
                    sVar2.f5380d = null;
                    sVar2.f5381e = null;
                    sVar2.f5382f = null;
                    sVar2.f5385i = 6;
                    break;
                }
                return objF;
            case 6:
                C6.r.b(objL);
                throw new d.h();
            case 7:
                C6.r.b(objL);
                return C6.G.f1419a;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    public final void N(int i8, boolean z8) {
        AbstractC1789i.d(this, null, null, new t(i8, z8, null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:104:0x03d0  */
    /* JADX WARN: Code duplicated, block: B:107:0x03ee  */
    /* JADX WARN: Code duplicated, block: B:110:0x0415  */
    /* JADX WARN: Code duplicated, block: B:111:0x0418 A[Catch: all -> 0x0488, TryCatch #3 {all -> 0x0488, blocks: (B:108:0x03f4, B:112:0x0456, B:111:0x0418), top: B:126:0x03f4 }] */
    /* JADX WARN: Code duplicated, block: B:118:0x048d  */
    /* JADX WARN: Code duplicated, block: B:29:0x0124  */
    /* JADX WARN: Code duplicated, block: B:32:0x0137  */
    /* JADX WARN: Code duplicated, block: B:34:0x0143  */
    /* JADX WARN: Code duplicated, block: B:35:0x0145  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x03c3 -> B:114:0x0485). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x01ac -> B:44:0x01b0). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0212 -> B:45:0x01b2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:71:0x02b8 -> B:114:0x0485). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object O(M3.k r29, N3.o r30, G6.d r31) {
        /*
            Method dump skipped, instruction units count: 1216
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: M3.m.O(M3.k, N3.o, G6.d):java.lang.Object");
    }

    public final void P() {
        AbstractC1789i.d(this, null, null, new v(null), 3, null);
    }

    public final Object Q(String str, G6.d dVar) {
        return AbstractC2262h.H(AbstractC2262h.M(AbstractC2262h.r(AbstractC2262h.p(new x(this.f5195e.m101getDeviceByIDqOAwsH0(str))), 1), new w(null)), this);
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0099  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object R(N3.o oVar, List list, G6.d dVar) {
        y yVar;
        m mVar;
        List list2;
        m mVar2;
        AppSettingsStore appSettingsStore;
        String str;
        A a8;
        m mVar3;
        String strE;
        k kVar;
        if (dVar instanceof y) {
            yVar = (y) dVar;
            int i8 = yVar.f5416e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                yVar.f5416e = i8 - Integer.MIN_VALUE;
            } else {
                yVar = new y(dVar);
            }
        } else {
            yVar = new y(dVar);
        }
        Object obj = yVar.f5414c;
        Object objF = H6.c.f();
        int i9 = yVar.f5416e;
        if (i9 == 0) {
            C6.r.b(obj);
            AppSettingsStore appSettingsStore2 = this.f5195e;
            String str2 = this.f5191a;
            z zVar = new z(oVar, null);
            yVar.f5412a = this;
            yVar.f5413b = list;
            yVar.f5416e = 1;
            if (appSettingsStore2.m97createOrUpdateKnownHostKF776PU(str2, zVar, yVar) != objF) {
                mVar = this;
                list2 = list;
            }
            return objF;
        }
        if (i9 == 1) {
            list2 = (List) yVar.f5413b;
            mVar = (m) yVar.f5412a;
            C6.r.b(obj);
        } else {
            if (i9 == 2) {
                mVar2 = (m) yVar.f5412a;
                C6.r.b(obj);
                appSettingsStore = mVar2.f5195e;
                str = mVar2.f5191a;
                a8 = mVar2.new A(null);
                yVar.f5412a = mVar2;
                yVar.f5416e = 3;
                if (appSettingsStore.m98createOrUpdateStaticHostKF776PU(str, a8, yVar) != objF) {
                    mVar3 = mVar2;
                }
                return objF;
            }
            if (i9 != 3) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            mVar3 = (m) yVar.f5412a;
            C6.r.b(obj);
        }
        mVar3.f5201k.setValue(C1038c.b((C1038c) mVar3.f5201k.getValue(), null, null, g.e.f5155a, null, null, null, null, 0, null, null, null, null, 4091, null));
        strE = mVar3.J().e();
        if (strE != null && (kVar = mVar3.f5203m) != null) {
            AbstractC1789i.d(kVar, null, null, mVar3.new B(strE, null), 3, null);
        }
        return C6.G.f1419a;
        AppSettingsStore appSettingsStore3 = mVar.f5195e;
        String str3 = mVar.f5191a;
        yVar.f5412a = mVar;
        yVar.f5413b = null;
        yVar.f5416e = 2;
        if (appSettingsStore3.m105updateDeviceListKF776PU$vsd2(str3, list2, yVar) != objF) {
            mVar2 = mVar;
            appSettingsStore = mVar2.f5195e;
            str = mVar2.f5191a;
            a8 = mVar2.new A(null);
            yVar.f5412a = mVar2;
            yVar.f5416e = 3;
            if (appSettingsStore.m98createOrUpdateStaticHostKF776PU(str, a8, yVar) != objF) {
                mVar3 = mVar2;
                mVar3.f5201k.setValue(C1038c.b((C1038c) mVar3.f5201k.getValue(), null, null, g.e.f5155a, null, null, null, null, 0, null, null, null, null, 4091, null));
                strE = mVar3.J().e();
                if (strE != null) {
                    AbstractC1789i.d(kVar, null, null, mVar3.new B(strE, null), 3, null);
                }
                return C6.G.f1419a;
            }
        }
        return objF;
    }

    public final void T() throws d.a {
        g gVarD = J().d();
        if (gVarD instanceof g.d) {
            AbstractC1789i.d(this, null, null, new C(null), 3, null);
        } else if (gVarD instanceof g.a) {
            throw new d.a(((g.a) gVarD).a());
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0113  */
    /* JADX WARN: Code duplicated, block: B:39:0x0123 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object U(KnownHost.Device device, G6.d dVar) {
        D d8;
        KnownHost.Device device2;
        m mVar;
        p098k7.a aVar;
        KnownHost.Device device3;
        k kVar;
        m mVar2;
        m mVar3;
        Object objE;
        if (dVar instanceof D) {
            d8 = (D) dVar;
            int i8 = d8.f5222h;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                d8.f5222h = i8 - Integer.MIN_VALUE;
            } else {
                d8 = new D(dVar);
            }
        } else {
            d8 = new D(dVar);
        }
        Object objG = d8.f5220f;
        Object objF = H6.c.f();
        int i9 = d8.f5222h;
        if (i9 == 0) {
            C6.r.b(objG);
            d8.f5215a = this;
            device2 = device;
            d8.f5216b = device2;
            d8.f5222h = 1;
            if (M3.n.b(this, d8) != objF) {
                mVar = this;
            }
            return objF;
        }
        if (i9 == 1) {
            KnownHost.Device device4 = (KnownHost.Device) d8.f5216b;
            mVar = (m) d8.f5215a;
            C6.r.b(objG);
            device2 = device4;
        } else {
            if (i9 == 2) {
                p098k7.a aVar2 = (p098k7.a) d8.f5219e;
                mVar2 = (m) d8.f5218d;
                k kVar2 = (k) d8.f5217c;
                KnownHost.Device device5 = (KnownHost.Device) d8.f5216b;
                m mVar4 = (m) d8.f5215a;
                C6.r.b(objG);
                aVar = aVar2;
                device3 = device5;
                kVar = kVar2;
                mVar = mVar4;
                try {
                    mVar2.f5201k.setValue(C1038c.b((C1038c) mVar2.f5201k.getValue(), null, null, null, null, new Q3.b(null, null, device3.getKeypadRows(), device3.getKeypadColumns(), 3, null), null, null, 0, null, null, null, null, 4079, null));
                    C6.G g8 = C6.G.f1419a;
                    aVar.e(null);
                    p017b7.F fK1 = Z.a().k1(1);
                    E e8 = mVar.new E(kVar, device3, null);
                    d8.f5215a = mVar;
                    d8.f5216b = device3;
                    d8.f5217c = null;
                    d8.f5218d = null;
                    d8.f5219e = null;
                    d8.f5222h = 3;
                    objG = AbstractC1785g.g(fK1, e8, d8);
                    if (objG != objF) {
                        mVar3 = mVar;
                    }
                    return objF;
                } catch (Throwable th) {
                    aVar.e(null);
                    throw th;
                }
            }
            if (i9 != 3) {
                if (i9 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(objG);
                return objG;
            }
            device3 = (KnownHost.Device) d8.f5216b;
            mVar3 = (m) d8.f5215a;
            C6.r.b(objG);
        }
        d8.f5215a = null;
        d8.f5216b = null;
        d8.f5222h = 4;
        objE = mVar3.E(device3, (Messages.VirtualDevice) objG, d8);
        if (objE != objF) {
            return objF;
        }
        return objE;
        k kVar3 = mVar.f5203m;
        if (kVar3 == null) {
            throw new IllegalStateException("BUG: Client must not be null at this point.");
        }
        aVar = mVar.f5199i;
        d8.f5215a = mVar;
        d8.f5216b = device2;
        d8.f5217c = kVar3;
        d8.f5218d = mVar;
        d8.f5219e = aVar;
        d8.f5222h = 2;
        if (aVar.b(null, d8) != objF) {
            device3 = device2;
            kVar = kVar3;
            mVar2 = mVar;
            mVar2.f5201k.setValue(C1038c.b((C1038c) mVar2.f5201k.getValue(), null, null, null, null, new Q3.b(null, null, device3.getKeypadRows(), device3.getKeypadColumns(), 3, null), null, null, 0, null, null, null, null, 4079, null));
            C6.G g9 = C6.G.f1419a;
            aVar.e(null);
            p017b7.F fK2 = Z.a().k1(1);
            E e9 = mVar.new E(kVar, device3, null);
            d8.f5215a = mVar;
            d8.f5216b = device3;
            d8.f5217c = null;
            d8.f5218d = null;
            d8.f5219e = null;
            d8.f5222h = 3;
            objG = AbstractC1785g.g(fK2, e9, d8);
            if (objG != objF) {
                mVar3 = mVar;
                d8.f5215a = null;
                d8.f5216b = null;
                d8.f5222h = 4;
                objE = mVar3.E(device3, (Messages.VirtualDevice) objG, d8);
                if (objE != objF) {
                    return objE;
                }
            }
        }
        return objF;
    }

    public final void V() {
        AbstractC1789i.d(this, null, null, new F(null), 3, null);
    }

    public final void W() {
        this.f5204n = new G(null);
    }

    public final void X() {
        Z2.j jVar = f5190p;
        String str = "Starting discovery for workstation " + P3.i.f(this.f5191a);
        String strC = jVar.c();
        Z2.p pVar = Z2.p.Debug;
        if (jVar.a().a().compareTo(pVar) <= 0) {
            jVar.b(pVar, strC, null, str);
        }
        AbstractC1789i.d(this, null, null, new I(null), 3, null);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object Y(e.h[] hVarArr, G6.d dVar) {
        J j8;
        p098k7.a aVar;
        m mVar;
        if (dVar instanceof J) {
            j8 = (J) dVar;
            int i8 = j8.f5269f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                j8.f5269f = i8 - Integer.MIN_VALUE;
            } else {
                j8 = new J(dVar);
            }
        } else {
            j8 = new J(dVar);
        }
        Object obj = j8.f5267d;
        Object objF = H6.c.f();
        int i9 = j8.f5269f;
        if (i9 == 0) {
            C6.r.b(obj);
            aVar = this.f5199i;
            j8.f5264a = hVarArr;
            j8.f5265b = this;
            j8.f5266c = aVar;
            j8.f5269f = 1;
            if (aVar.b(null, j8) == objF) {
                return objF;
            }
            mVar = this;
        } else {
            if (i9 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            p098k7.a aVar2 = (p098k7.a) j8.f5266c;
            mVar = (m) j8.f5265b;
            e.h[] hVarArr2 = (e.h[]) j8.f5264a;
            C6.r.b(obj);
            aVar = aVar2;
            hVarArr = hVarArr2;
        }
        try {
            mVar.f5201k.setValue(((C1038c) mVar.f5201k.getValue()).n((e.h[]) Arrays.copyOf(hVarArr, hVarArr.length)));
            C6.G g8 = C6.G.f1419a;
            return C6.G.f1419a;
        } finally {
            aVar.e(null);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0088, code lost:
    
        if (r7.k1(r6, r0) == r1) goto L28;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a0(boolean z8, G6.d dVar) {
        K k8;
        m mVar;
        if (dVar instanceof K) {
            k8 = (K) dVar;
            int i8 = k8.f5274e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                k8.f5274e = i8 - Integer.MIN_VALUE;
            } else {
                k8 = new K(dVar);
            }
        } else {
            k8 = new K(dVar);
        }
        Object obj = k8.f5272c;
        Object objF = H6.c.f();
        int i9 = k8.f5274e;
        if (i9 == 0) {
            C6.r.b(obj);
            k8.f5270a = this;
            k8.f5271b = z8;
            k8.f5274e = 1;
            if (M3.n.e(this, k8) != objF) {
                mVar = this;
            }
            return objF;
        }
        if (i9 == 1) {
            z8 = k8.f5271b;
            mVar = (m) k8.f5270a;
            C6.r.b(obj);
        } else {
            if (i9 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
        }
        return C6.G.f1419a;
        if (mVar.J().k() < 3) {
            return C6.G.f1419a;
        }
        Messages.ClientCapabilities.a aVarNewBuilder = Messages.ClientCapabilities.newBuilder();
        aVarNewBuilder.f(z8);
        Messages.ClientMessage clientMessage = (Messages.ClientMessage) Messages.ClientMessage.newBuilder().h((Messages.ClientCapabilities) aVarNewBuilder.build()).build();
        k kVar = mVar.f5203m;
        if (kVar == null) {
            return C6.G.f1419a;
        }
        kotlin.jvm.internal.t.d(clientMessage);
        k8.f5270a = null;
        k8.f5274e = 2;
    }

    @Override // p017b7.J
    public G6.g getCoroutineContext() {
        return this.f5198h;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0089 A[PHI: r2
      0x0089: PHI (r2v4 M3.m) = (r2v3 M3.m), (r2v10 M3.m) binds: [B:32:0x0086, B:17:0x003c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x009e, code lost:
    
        if (p017b7.AbstractC1785g.g(r11, r4, r0) == r1) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(G6.d dVar) {
        C1040e c1040e;
        m mVar;
        if (dVar instanceof C1040e) {
            c1040e = (C1040e) dVar;
            int i8 = c1040e.f5293d;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                c1040e.f5293d = i8 - Integer.MIN_VALUE;
            } else {
                c1040e = new C1040e(dVar);
            }
        } else {
            c1040e = new C1040e(dVar);
        }
        Object objA = c1040e.f5291b;
        Object objF = H6.c.f();
        int i9 = c1040e.f5293d;
        if (i9 == 0) {
            C6.r.b(objA);
            c1040e.f5290a = this;
            c1040e.f5293d = 1;
            if (M3.n.c(this, c1040e) != objF) {
                mVar = this;
            }
            return objF;
        }
        if (i9 == 1) {
            mVar = (m) c1040e.f5290a;
            C6.r.b(objA);
        } else {
            if (i9 == 2) {
                mVar = (m) c1040e.f5290a;
                C6.r.b(objA);
                c1040e.f5290a = mVar;
                c1040e.f5293d = 3;
                if (((Q) objA).Q0(c1040e) != objF) {
                    p017b7.F fK1 = Z.a().k1(1);
                    C1042g c1042g = mVar.new C1042g(null);
                    c1040e.f5290a = null;
                    c1040e.f5293d = 4;
                }
                return objF;
            }
            if (i9 == 3) {
                mVar = (m) c1040e.f5290a;
                C6.r.b(objA);
                p017b7.F fK2 = Z.a().k1(1);
                C1042g c1042g2 = mVar.new C1042g(null);
                c1040e.f5290a = null;
                c1040e.f5293d = 4;
            } else {
                if (i9 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(objA);
            }
        }
        return C6.G.f1419a;
        k kVar = mVar.f5203m;
        if (kVar == null) {
            return C6.G.f1419a;
        }
        j jVar = mVar.f5200j;
        C1041f c1041f = new C1041f(kVar, null);
        c1040e.f5290a = mVar;
        c1040e.f5293d = 2;
        objA = jVar.a(c1041f, c1040e);
        if (objA != objF) {
            c1040e.f5290a = mVar;
            c1040e.f5293d = 3;
            if (((Q) objA).Q0(c1040e) != objF) {
                p017b7.F fK3 = Z.a().k1(1);
                C1042g c1042g3 = mVar.new C1042g(null);
                c1040e.f5290a = null;
                c1040e.f5293d = 4;
            }
        }
        return objF;
    }

    public final Object y(G6.d dVar) {
        k kVar = this.f5203m;
        if (kVar == null) {
            return C6.G.f1419a;
        }
        p008a7.a.C0338a c0338a = p008a7.a.f13446b;
        Object objD = X0.d(p008a7.c.s(30, p008a7.d.SECONDS), new C1043h(kVar, null), dVar);
        return objD == H6.c.f() ? objD : C6.G.f1419a;
    }

    public final void z(String str) {
        AbstractC1789i.d(this, null, null, new C1044i(str, null), 3, null);
    }

    /* JADX INFO: renamed from: M3.m$h, reason: case insensitive filesystem */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C1043h extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f5304a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f5306c;

        /* JADX INFO: renamed from: M3.m$h$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f5307a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ int f5308b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            public final /* synthetic */ k f5309c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(k kVar, G6.d dVar) {
                super(2, dVar);
                this.f5309c = kVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(this.f5309c, dVar);
                aVar.f5308b = ((Number) obj).intValue();
                return aVar;
            }

            public final Object g(int i8, G6.d dVar) {
                return ((a) create(Integer.valueOf(i8), dVar)).invokeSuspend(C6.G.f1419a);
            }

            @Override // Q6.o
            public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
                return g(((Number) obj).intValue(), (G6.d) obj2);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                Object objF = H6.c.f();
                int i8 = this.f5307a;
                if (i8 == 0) {
                    C6.r.b(obj);
                    int i9 = this.f5308b;
                    k kVar = this.f5309c;
                    Messages.ClientMessage.a aVarG = Messages.ClientMessage.newBuilder().g(Messages.CancelAuthenticate.newBuilder().f(i9));
                    kotlin.jvm.internal.t.f(aVarG, "setCancelAuthenticate(...)");
                    this.f5307a = 1;
                    if (M3.l.a(kVar, aVarG, this) == objF) {
                        return objF;
                    }
                } else {
                    if (i8 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
                return C6.G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C1043h(k kVar, G6.d dVar) {
            super(2, dVar);
            this.f5306c = kVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new C1043h(this.f5306c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(p017b7.J j8, G6.d dVar) {
            return ((C1043h) create(j8, dVar)).invokeSuspend(C6.G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f5304a;
            if (i8 != 0) {
                if (i8 != 1) {
                    if (i8 == 2) {
                        C6.r.b(obj);
                        return obj;
                    }
                    throw new IllegalStateException(hJroAgFztiMK.xoYhjYC);
                }
                C6.r.b(obj);
            } else {
                C6.r.b(obj);
                j jVar = m.this.f5200j;
                a aVar = new a(this.f5306c, null);
                this.f5304a = 1;
                obj = jVar.a(aVar, this);
                if (obj != objF) {
                }
                return objF;
            }
            this.f5304a = 2;
            Object objQ0 = ((Q) obj).Q0(this);
            if (objQ0 == objF) {
                return objF;
            }
            return objQ0;
        }
    }

    public m(String workstationID, String str, boolean z8, f options, Messages.ClientInformation clientInformation, InterfaceC2260f discoveryFlow, AppSettingsStore store, Q6.q clientFactory, i iconDecompressor, G6.g coroutineContext) throws d.a {
        kotlin.jvm.internal.t.g(workstationID, "workstationID");
        kotlin.jvm.internal.t.g(options, "options");
        kotlin.jvm.internal.t.g(clientInformation, "clientInformation");
        kotlin.jvm.internal.t.g(discoveryFlow, "discoveryFlow");
        kotlin.jvm.internal.t.g(store, "store");
        kotlin.jvm.internal.t.g(clientFactory, "clientFactory");
        kotlin.jvm.internal.t.g(iconDecompressor, "iconDecompressor");
        kotlin.jvm.internal.t.g(coroutineContext, "coroutineContext");
        this.f5191a = workstationID;
        this.f5192b = options;
        this.f5193c = clientInformation;
        this.f5194d = discoveryFlow;
        this.f5195e = store;
        this.f5196f = clientFactory;
        this.f5197g = iconDecompressor;
        this.f5198h = coroutineContext.P1(S0.a((InterfaceC1815v0) coroutineContext.A(InterfaceC1815v0.f15985O))).P1(new p017b7.I("StreamDeckConnection")).P1(new H(p017b7.G.f15897N));
        this.f5199i = p098k7.c.b(false, 1, null);
        this.f5200j = new j();
        p044e7.x xVarA = O.a(new C1038c(workstationID, str, null, null, null, null, null, 0, null, null, null, null, 4092, null));
        this.f5201k = xVarA;
        this.f5202l = AbstractC2262h.b(xVarA);
        if (z8) {
            T();
        }
    }

    public /* synthetic */ m(String str, String str2, boolean z8, f fVar, Messages.ClientInformation clientInformation, InterfaceC2260f interfaceC2260f, AppSettingsStore appSettingsStore, Q6.q qVar, i iVar, G6.g gVar, int i8, AbstractC2633k abstractC2633k) {
        this(str, (i8 & 2) != 0 ? null : str2, (i8 & 4) != 0 ? false : z8, (i8 & 8) != 0 ? new f(0L, 0L, 0L, 0, 15, null) : fVar, clientInformation, interfaceC2260f, appSettingsStore, qVar, iVar, (i8 & 512) != 0 ? Z.b() : gVar, null);
    }
}
