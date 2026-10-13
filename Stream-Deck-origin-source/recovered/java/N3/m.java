package N3;

import C6.G;
import C6.InterfaceC0919h;
import D6.z;
import X5.Q;
import X5.T;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.streamdeck.vsd2.PermissionRepository;
import com.elgato.streamdeck.vsd2.PermissionState;
import com.elgato.streamdeck.vsd2.StaticHost;
import com.elgato.streamdeck.vsd2.Values;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Map;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.InterfaceC2636n;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.V0;
import p017b7.X0;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p044e7.O;
import p044e7.x;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class m {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f6097i = new a(null);

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final Z2.j f6098j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final PermissionRepository f6099a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N3.a f6100b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final N3.f f6101c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AppSettingsStore f6102d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final J f6103e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1815v0 f6104f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f6105g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M f6106h;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public enum b {
        None,
        Request,
        Rationale,
        OpenSettings;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ J6.a f6112f = J6.b.a(a());
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class c {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f6113a = new a();

            public a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public int hashCode() {
                return 692118794;
            }

            public String toString() {
                return "InvalidQueryParams";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final b f6114a = new b();

            public b() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public int hashCode() {
                return 252324435;
            }

            public String toString() {
                return "InvalidUrlHost";
            }
        }

        /* JADX INFO: renamed from: N3.m$c$c, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0230c extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0230c f6115a = new C0230c();

            public C0230c() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0230c);
            }

            public int hashCode() {
                return 1713177646;
            }

            public String toString() {
                return "Timeout";
            }
        }

        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f6116a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final b f6117b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6118c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final c f6119d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final boolean f6120e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f6121f;

        public d() {
            this(false, null, false, null, false, null, 63, null);
        }

        public static /* synthetic */ d b(d dVar, boolean z8, b bVar, boolean z9, c cVar, boolean z10, String str, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z8 = dVar.f6116a;
            }
            if ((i8 & 2) != 0) {
                bVar = dVar.f6117b;
            }
            if ((i8 & 4) != 0) {
                z9 = dVar.f6118c;
            }
            if ((i8 & 8) != 0) {
                cVar = dVar.f6119d;
            }
            if ((i8 & 16) != 0) {
                z10 = dVar.f6120e;
            }
            if ((i8 & 32) != 0) {
                str = dVar.f6121f;
            }
            boolean z11 = z10;
            String str2 = str;
            return dVar.a(z8, bVar, z9, cVar, z11, str2);
        }

        public final d a(boolean z8, b permissionAction, boolean z9, c cVar, boolean z10, String minVersionString) {
            t.g(permissionAction, "permissionAction");
            t.g(minVersionString, "minVersionString");
            return new d(z8, permissionAction, z9, cVar, z10, minVersionString);
        }

        public final boolean c() {
            return this.f6118c;
        }

        public final c d() {
            return this.f6119d;
        }

        public final String e() {
            return this.f6121f;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return this.f6116a == dVar.f6116a && this.f6117b == dVar.f6117b && this.f6118c == dVar.f6118c && t.c(this.f6119d, dVar.f6119d) && this.f6120e == dVar.f6120e && t.c(this.f6121f, dVar.f6121f);
        }

        public final b f() {
            return this.f6117b;
        }

        public final boolean g() {
            return this.f6116a;
        }

        public final boolean h() {
            return this.f6120e;
        }

        public int hashCode() {
            int iHashCode = ((((Boolean.hashCode(this.f6116a) * 31) + this.f6117b.hashCode()) * 31) + Boolean.hashCode(this.f6118c)) * 31;
            c cVar = this.f6119d;
            return ((((iHashCode + (cVar == null ? 0 : cVar.hashCode())) * 31) + Boolean.hashCode(this.f6120e)) * 31) + this.f6121f.hashCode();
        }

        public String toString() {
            return "ViewState(startCamera=" + this.f6116a + ", permissionAction=" + this.f6117b + ", dismiss=" + this.f6118c + ", error=" + this.f6119d + ", isLoading=" + this.f6120e + ", minVersionString=" + this.f6121f + ")";
        }

        public d(boolean z8, b permissionAction, boolean z9, c cVar, boolean z10, String minVersionString) {
            t.g(permissionAction, "permissionAction");
            t.g(minVersionString, "minVersionString");
            this.f6116a = z8;
            this.f6117b = permissionAction;
            this.f6118c = z9;
            this.f6119d = cVar;
            this.f6120e = z10;
            this.f6121f = minVersionString;
        }

        public /* synthetic */ d(boolean z8, b bVar, boolean z9, c cVar, boolean z10, String str, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? b.None : bVar, (i8 & 4) != 0 ? false : z9, (i8 & 8) != 0 ? null : cVar, (i8 & 16) != 0 ? false : z10, (i8 & 32) != 0 ? Values.Versions.STREAM_DECK_VERSION : str);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f6122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f6123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public Object f6124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f6125d;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public int f6127f;

        public e(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f6125d = obj;
            this.f6127f |= Integer.MIN_VALUE;
            return m.this.g(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6128a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6129b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ P3.e f6130c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(P3.e eVar, G6.d dVar) {
            super(2, dVar);
            this.f6130c = eVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            f fVar = new f(this.f6130c, dVar);
            fVar.f6129b = obj;
            return fVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(StaticHost staticHost, G6.d dVar) {
            return ((f) create(staticHost, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f6128a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            GeneratedMessageLite.b builder = ((StaticHost) this.f6129b).toBuilder();
            StaticHost.Builder builder2 = (StaticHost.Builder) builder;
            builder2.clearDeletedAt();
            t.f(builder, "apply(...)");
            return P3.g.a(builder2, this.f6130c);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6131a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6132b;

        public g(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            g gVar = new g(dVar);
            gVar.f6132b = obj;
            return gVar;
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(KnownHost knownHost, G6.d dVar) {
            return ((g) create(knownHost, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f6131a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            KnownHost.Builder builder = (KnownHost.Builder) ((KnownHost) this.f6132b).toBuilder();
            builder.clearDeletedAt();
            GeneratedMessageLite generatedMessageLiteBuild = builder.build();
            t.f(generatedMessageLiteBuild, "build(...)");
            return generatedMessageLiteBuild;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6133a;

        public h(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new h(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((h) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f6133a;
            if (i8 == 0) {
                C6.r.b(obj);
                m mVar = m.this;
                this.f6133a = 1;
                if (mVar.m(this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class i extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6135a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a implements InterfaceC2261g, InterfaceC2636n {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ m f6137a;

            public a(m mVar) {
                this.f6137a = mVar;
            }

            @Override // kotlin.jvm.internal.InterfaceC2636n
            public final InterfaceC0919h a() {
                return new C2639q(2, this.f6137a, m.class, "updatePermissionState", "updatePermissionState(Lcom/elgato/streamdeck/vsd2/PermissionState;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC2261g) && (obj instanceof InterfaceC2636n)) {
                    return t.c(a(), ((InterfaceC2636n) obj).a());
                }
                return false;
            }

            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
            public final Object emit(PermissionState permissionState, G6.d dVar) {
                Object objP = this.f6137a.p(permissionState, dVar);
                return objP == H6.c.f() ? objP : G.f1419a;
            }

            public final int hashCode() {
                return a().hashCode();
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b implements InterfaceC2260f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f6138a;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f6139a;

                /* JADX INFO: renamed from: N3.m$i$b$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0231a extends I6.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f6140a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f6141b;

                    public C0231a(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f6140a = obj;
                        this.f6141b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC2261g interfaceC2261g) {
                    this.f6139a = interfaceC2261g;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    C0231a c0231a;
                    if (dVar instanceof C0231a) {
                        c0231a = (C0231a) dVar;
                        int i8 = c0231a.f6141b;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0231a.f6141b = i8 - Integer.MIN_VALUE;
                        } else {
                            c0231a = new C0231a(dVar);
                        }
                    } else {
                        c0231a = new C0231a(dVar);
                    }
                    Object obj2 = c0231a.f6140a;
                    Object objF = H6.c.f();
                    int i9 = c0231a.f6141b;
                    if (i9 == 0) {
                        C6.r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.f6139a;
                        Object obj3 = ((Map) obj).get(PermissionRepository.Permission.CAMERA);
                        c0231a.f6141b = 1;
                        if (interfaceC2261g.emit(obj3, c0231a) == objF) {
                            return objF;
                        }
                    } else {
                        if (i9 != 1) {
                            throw new IllegalStateException(kDsnNkYbBsI.HAWnRhttsBLlk);
                        }
                        C6.r.b(obj2);
                    }
                    return G.f1419a;
                }
            }

            public b(InterfaceC2260f interfaceC2260f) {
                this.f6138a = interfaceC2260f;
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = this.f6138a.collect(new a(interfaceC2261g), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        }

        public i(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new i(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((i) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f6135a;
            if (i8 == 0) {
                C6.r.b(obj);
                b bVar = new b(m.this.f6099a.getPermissions());
                a aVar = new a(m.this);
                this.f6135a = 1;
                if (bVar.collect(aVar, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6143a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f6145a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ m f6146b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(m mVar, G6.d dVar) {
                super(2, dVar);
                this.f6146b = mVar;
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                return new a(this.f6146b, dVar);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, G6.d dVar) {
                return ((a) create(str, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f6145a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                return I6.b.a(!((d) this.f6146b.i().getValue()).h());
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class b extends C2639q implements Q6.o {
            public b(Object obj) {
                super(2, obj, m.class, "analyzeQrCodeUrl", "analyzeQrCodeUrl(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final Object invoke(String str, G6.d dVar) {
                return ((m) this.receiver).g(str, dVar);
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c implements InterfaceC2260f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f6147a;

            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f6148a;

                /* JADX INFO: renamed from: N3.m$j$c$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0232a extends I6.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f6149a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f6150b;

                    public C0232a(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f6149a = obj;
                        this.f6150b |= Integer.MIN_VALUE;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC2261g interfaceC2261g) {
                    this.f6148a = interfaceC2261g;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    C0232a c0232a;
                    if (dVar instanceof C0232a) {
                        c0232a = (C0232a) dVar;
                        int i8 = c0232a.f6150b;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0232a.f6150b = i8 - Integer.MIN_VALUE;
                        } else {
                            c0232a = new C0232a(dVar);
                        }
                    } else {
                        c0232a = new C0232a(dVar);
                    }
                    Object obj2 = c0232a.f6149a;
                    Object objF = H6.c.f();
                    int i9 = c0232a.f6150b;
                    if (i9 == 0) {
                        C6.r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.f6148a;
                        if (((String) obj).length() > 0) {
                            c0232a.f6150b = 1;
                            if (interfaceC2261g.emit(obj, c0232a) == objF) {
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

            public c(InterfaceC2260f interfaceC2260f) {
                this.f6147a = interfaceC2260f;
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = this.f6147a.collect(new a(interfaceC2261g), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        }

        public j(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new j(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((j) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f6143a;
            if (i8 == 0) {
                C6.r.b(obj);
                InterfaceC2260f interfaceC2260fU = AbstractC2262h.U(new c(m.this.f6100b.b()), new a(m.this, null));
                b bVar = new b(m.this);
                this.f6143a = 1;
                if (AbstractC2262h.j(interfaceC2260fU, bVar, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class k extends I6.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public Object f6152a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public Object f6153b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f6154c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f6156e;

        public k(G6.d dVar) {
            super(dVar);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            this.f6154c = obj;
            this.f6156e |= Integer.MIN_VALUE;
            return m.this.p(null, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class l extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6157a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ StaticHost f6159c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2260f {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2260f f6160a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final /* synthetic */ StaticHost f6161b;

            /* JADX INFO: renamed from: N3.m$l$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0233a implements InterfaceC2261g {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public final /* synthetic */ InterfaceC2261g f6162a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public final /* synthetic */ StaticHost f6163b;

                /* JADX INFO: renamed from: N3.m$l$a$a$a, reason: collision with other inner class name */
                /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
                public static final class C0234a extends I6.d {

                    /* JADX INFO: renamed from: a, reason: collision with root package name */
                    public /* synthetic */ Object f6164a;

                    /* JADX INFO: renamed from: b, reason: collision with root package name */
                    public int f6165b;

                    public C0234a(G6.d dVar) {
                        super(dVar);
                    }

                    @Override // I6.a
                    public final Object invokeSuspend(Object obj) {
                        this.f6164a = obj;
                        this.f6165b |= Integer.MIN_VALUE;
                        return C0233a.this.emit(null, this);
                    }
                }

                public C0233a(InterfaceC2261g interfaceC2261g, StaticHost staticHost) {
                    this.f6162a = interfaceC2261g;
                    this.f6163b = staticHost;
                }

                /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                @Override // p044e7.InterfaceC2261g
                public final Object emit(Object obj, G6.d dVar) {
                    C0234a c0234a;
                    if (dVar instanceof C0234a) {
                        c0234a = (C0234a) dVar;
                        int i8 = c0234a.f6165b;
                        if ((i8 & Integer.MIN_VALUE) != 0) {
                            c0234a.f6165b = i8 - Integer.MIN_VALUE;
                        } else {
                            c0234a = new C0234a(dVar);
                        }
                    } else {
                        c0234a = new C0234a(dVar);
                    }
                    Object obj2 = c0234a.f6164a;
                    Object objF = H6.c.f();
                    int i9 = c0234a.f6165b;
                    if (i9 == 0) {
                        C6.r.b(obj2);
                        InterfaceC2261g interfaceC2261g = this.f6162a;
                        N3.f.e eVar = (N3.f.e) obj;
                        Object obj3 = null;
                        if (eVar instanceof N3.f.e.c) {
                            N3.f.e.c cVar = (N3.f.e.c) eVar;
                            for (Object obj4 : z.B0(cVar.c(), cVar.a())) {
                                N3.f.b bVar = (N3.f.b) obj4;
                                if (P3.i.d(bVar.j(), P3.f.g(this.f6163b)) && bVar.t()) {
                                    obj3 = obj4;
                                    break;
                                }
                            }
                            obj3 = (N3.f.b) obj3;
                        }
                        if (obj3 != null) {
                            c0234a.f6165b = 1;
                            if (interfaceC2261g.emit(obj3, c0234a) == objF) {
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

            public a(InterfaceC2260f interfaceC2260f, StaticHost staticHost) {
                this.f6160a = interfaceC2260f;
                this.f6161b = staticHost;
            }

            @Override // p044e7.InterfaceC2260f
            public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
                Object objCollect = this.f6160a.collect(new C0233a(interfaceC2261g, this.f6161b), dVar);
                return objCollect == H6.c.f() ? objCollect : G.f1419a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(StaticHost staticHost, G6.d dVar) {
            super(2, dVar);
            this.f6159c = staticHost;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return m.this.new l(this.f6159c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((l) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f6157a;
            if (i8 != 0) {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                return obj;
            }
            C6.r.b(obj);
            a aVar = new a(m.this.f6101c.C(), this.f6159c);
            this.f6157a = 1;
            Object objX = AbstractC2262h.x(aVar, this);
            return objX == objF ? objF : objX;
        }
    }

    static {
        Z2.j.a aVar = Z2.j.f12858c;
        String simpleName = m.class.getSimpleName();
        t.f(simpleName, "getSimpleName(...)");
        f6098j = aVar.d(simpleName);
    }

    public m(PermissionRepository permissionRepository, N3.a qrCodeSource, N3.f discoveryService, AppSettingsStore appSettingsStore, J externalScope) {
        t.g(permissionRepository, "permissionRepository");
        t.g(qrCodeSource, "qrCodeSource");
        t.g(discoveryService, "discoveryService");
        t.g(appSettingsStore, "appSettingsStore");
        t.g(externalScope, "externalScope");
        this.f6099a = permissionRepository;
        this.f6100b = qrCodeSource;
        this.f6101c = discoveryService;
        this.f6102d = appSettingsStore;
        this.f6103e = externalScope;
        x xVarA = O.a(new d(false, null, false, null, false, null, 63, null));
        this.f6105g = xVarA;
        this.f6106h = AbstractC2262h.b(xVarA);
    }

    /* JADX WARN: Code duplicated, block: B:53:0x0151  */
    /* JADX WARN: Code duplicated, block: B:60:0x0177  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x0166, code lost:
    
        if (r8.m97createOrUpdateKnownHostKF776PU(r1, r10, r2) == r3) goto L59;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, G6.d dVar) {
        e eVar;
        Object value;
        StaticHost staticHostA;
        m mVar;
        P3.e eVar2;
        Object value2;
        Object value3;
        m mVar2;
        KnownHost knownHost;
        m mVar3;
        m mVar4;
        x xVar;
        Object value4;
        x xVar2;
        Object value5;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i8 = eVar.f6127f;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                eVar.f6127f = i8 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objZ = eVar.f6125d;
        Object objF = H6.c.f();
        int i9 = eVar.f6127f;
        if (i9 == 0) {
            C6.r.b(objZ);
            T tD = Q.d(str);
            if (!t.c(tD.g(), "streamdeck.elgato.com")) {
                x xVar3 = this.f6105g;
                do {
                    value3 = xVar3.getValue();
                } while (!xVar3.b(value3, d.b((d) value3, false, null, false, c.b.f6114a, false, null, 55, null)));
                return G.f1419a;
            }
            P3.e eVarC = P3.g.c(tD);
            if (eVarC == null) {
                x xVar4 = this.f6105g;
                do {
                    value2 = xVar4.getValue();
                } while (!xVar4.b(value2, d.b((d) value2, false, null, false, c.a.f6113a, false, null, 55, null)));
                return G.f1419a;
            }
            if (((d) this.f6106h.getValue()).h()) {
                return G.f1419a;
            }
            V3.f.a(n.a(f6097i, eVarC.b()));
            x xVar5 = this.f6105g;
            do {
                value = xVar5.getValue();
            } while (!xVar5.b(value, d.b((d) value, false, null, false, null, true, null, 47, null)));
            this.f6100b.stop();
            StaticHost.Builder builderNewBuilder = StaticHost.newBuilder();
            t.f(builderNewBuilder, "newBuilder(...)");
            staticHostA = P3.g.a(builderNewBuilder, eVarC);
            AppSettingsStore appSettingsStore = this.f6102d;
            String strB = eVarC.b();
            f fVar = new f(eVarC, null);
            eVar.f6122a = this;
            eVar.f6123b = eVarC;
            eVar.f6124c = staticHostA;
            eVar.f6127f = 1;
            if (appSettingsStore.m98createOrUpdateStaticHostKF776PU(strB, fVar, eVar) != objF) {
                mVar = this;
                eVar2 = eVarC;
            }
            return objF;
        }
        if (i9 == 1) {
            staticHostA = (StaticHost) eVar.f6124c;
            eVar2 = (P3.e) eVar.f6123b;
            mVar = (m) eVar.f6122a;
            C6.r.b(objZ);
        } else {
            if (i9 == 2) {
                staticHostA = (StaticHost) eVar.f6123b;
                mVar2 = (m) eVar.f6122a;
                C6.r.b(objZ);
                knownHost = (KnownHost) objZ;
                if (knownHost != null) {
                    AppSettingsStore appSettingsStore2 = mVar2.f6102d;
                    String strF = P3.f.f(knownHost);
                    g gVar = new g(null);
                    eVar.f6122a = mVar2;
                    eVar.f6123b = staticHostA;
                    eVar.f6127f = 3;
                }
                mVar3 = mVar2;
                eVar.f6122a = mVar3;
                eVar.f6123b = null;
                eVar.f6127f = 4;
                objZ = mVar3.q(staticHostA, eVar);
                if (objZ != objF) {
                    mVar4 = mVar3;
                    N3.f.b bVar = (N3.f.b) objZ;
                    xVar2 = mVar4.f6105g;
                    do {
                        value5 = xVar2.getValue();
                    } while (!xVar2.b(value5, d.b((d) value5, false, null, true, null, false, null, 43, null)));
                    mVar4.f6101c.w(bVar);
                    return G.f1419a;
                }
                return objF;
            }
            if (i9 != 3) {
                if (i9 != 4) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                mVar4 = (m) eVar.f6122a;
                try {
                    C6.r.b(objZ);
                    N3.f.b bVar2 = (N3.f.b) objZ;
                    xVar2 = mVar4.f6105g;
                    do {
                        value5 = xVar2.getValue();
                    } while (!xVar2.b(value5, d.b((d) value5, false, null, true, null, false, null, 43, null)));
                    mVar4.f6101c.w(bVar2);
                } catch (V0 unused) {
                    xVar = mVar4.f6105g;
                    do {
                        value4 = xVar.getValue();
                    } while (!xVar.b(value4, d.b((d) value4, false, null, false, c.C0230c.f6115a, false, null, 39, null)));
                }
                return G.f1419a;
            }
            staticHostA = (StaticHost) eVar.f6123b;
            mVar3 = (m) eVar.f6122a;
            C6.r.b(objZ);
            try {
                eVar.f6122a = mVar3;
                eVar.f6123b = null;
                eVar.f6127f = 4;
                objZ = mVar3.q(staticHostA, eVar);
                if (objZ != objF) {
                    mVar4 = mVar3;
                    N3.f.b bVar3 = (N3.f.b) objZ;
                    xVar2 = mVar4.f6105g;
                    do {
                        value5 = xVar2.getValue();
                    } while (!xVar2.b(value5, d.b((d) value5, false, null, true, null, false, null, 43, null)));
                    mVar4.f6101c.w(bVar3);
                    return G.f1419a;
                }
                return objF;
            } catch (V0 unused2) {
                mVar4 = mVar3;
                xVar = mVar4.f6105g;
                do {
                    value4 = xVar.getValue();
                } while (!xVar.b(value4, d.b((d) value4, false, null, false, c.C0230c.f6115a, false, null, 39, null)));
            }
        }
        InterfaceC2260f interfaceC2260fM103getKnownHostByIDjCyGMI4 = mVar.f6102d.m103getKnownHostByIDjCyGMI4(eVar2.b());
        eVar.f6122a = mVar;
        eVar.f6123b = staticHostA;
        eVar.f6124c = null;
        eVar.f6127f = 2;
        objZ = AbstractC2262h.z(interfaceC2260fM103getKnownHostByIDjCyGMI4, eVar);
        if (objZ != objF) {
            mVar2 = mVar;
            knownHost = (KnownHost) objZ;
            if (knownHost != null) {
                AppSettingsStore appSettingsStore3 = mVar2.f6102d;
                String strF2 = P3.f.f(knownHost);
                g gVar2 = new g(null);
                eVar.f6122a = mVar2;
                eVar.f6123b = staticHostA;
                eVar.f6127f = 3;
            }
            mVar3 = mVar2;
            eVar.f6122a = mVar3;
            eVar.f6123b = null;
            eVar.f6127f = 4;
            objZ = mVar3.q(staticHostA, eVar);
            if (objZ != objF) {
                mVar4 = mVar3;
                N3.f.b bVar4 = (N3.f.b) objZ;
                xVar2 = mVar4.f6105g;
                do {
                    value5 = xVar2.getValue();
                } while (!xVar2.b(value5, d.b((d) value5, false, null, true, null, false, null, 43, null)));
                mVar4.f6101c.w(bVar4);
                return G.f1419a;
            }
        }
        return objF;
    }

    public final void h() {
        Object value;
        x xVar = this.f6105g;
        do {
            value = xVar.getValue();
        } while (!xVar.b(value, d.b((d) value, false, null, false, null, false, null, 55, null)));
        AbstractC1789i.d(this.f6103e, null, null, new h(null), 3, null);
    }

    public final M i() {
        return this.f6106h;
    }

    public final void j() {
        Object value;
        x xVar = this.f6105g;
        do {
            value = xVar.getValue();
        } while (!xVar.b(value, d.b((d) value, false, b.None, false, null, false, null, 60, null)));
    }

    public final void k() {
        Object value;
        x xVar = this.f6105g;
        do {
            value = xVar.getValue();
        } while (!xVar.b(value, d.b((d) value, false, b.Request, false, null, false, null, 60, null)));
    }

    public final Object l(G6.d dVar) {
        this.f6099a.recheckPermissions();
        AbstractC1789i.d(this.f6103e, null, null, new i(null), 3, null);
        return G.f1419a;
    }

    public final Object m(G6.d dVar) {
        this.f6104f = AbstractC1789i.d(this.f6103e, null, null, new j(null), 3, null);
        this.f6100b.start();
        return G.f1419a;
    }

    public final void n() {
        this.f6100b.stop();
        InterfaceC1815v0 interfaceC1815v0 = this.f6104f;
        if (interfaceC1815v0 != null) {
            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        }
    }

    public final void o(PermissionRepository.Permission permission, PermissionState permissionState) {
        t.g(permission, "permission");
        t.g(permissionState, "permissionState");
        this.f6099a.onPermissionResult(permission, permissionState);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:42:0x00be  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object p(PermissionState permissionState, G6.d dVar) {
        k kVar;
        b bVar;
        m mVar;
        b bVar2;
        b bVar3;
        x xVar;
        Object value;
        d dVar2;
        boolean z8;
        if (dVar instanceof k) {
            kVar = (k) dVar;
            int i8 = kVar.f6156e;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                kVar.f6156e = i8 - Integer.MIN_VALUE;
            } else {
                kVar = new k(dVar);
            }
        } else {
            kVar = new k(dVar);
        }
        Object obj = kVar.f6154c;
        Object objF = H6.c.f();
        int i9 = kVar.f6156e;
        if (i9 == 0) {
            C6.r.b(obj);
            Z2.j jVar = f6098j;
            String str = "Permission result: " + permissionState;
            Z2.p pVar = Z2.p.Debug;
            if (jVar.a().a().compareTo(pVar) <= 0) {
                jVar.b(pVar, "ScanningViewModel", null, str);
            }
            if (permissionState == null) {
                throw new IllegalStateException("Permission result must not be null.");
            }
            PermissionState.Granted granted = PermissionState.Granted.INSTANCE;
            if (t.c(permissionState, granted)) {
                bVar = b.None;
            } else if (t.c(permissionState, PermissionState.Rejected.INSTANCE)) {
                bVar = b.Request;
            } else if (t.c(permissionState, PermissionState.Rationale.INSTANCE)) {
                bVar = b.Rationale;
            } else {
                if (!t.c(permissionState, PermissionState.Denied.INSTANCE)) {
                    throw new C6.m();
                }
                bVar = b.OpenSettings;
            }
            if (t.c(permissionState, granted)) {
                kVar.f6152a = this;
                kVar.f6153b = bVar;
                kVar.f6156e = 1;
                if (m(kVar) == objF) {
                    return objF;
                }
                mVar = this;
                bVar3 = bVar;
            } else {
                n();
                mVar = this;
                bVar2 = bVar;
            }
            xVar = mVar.f6105g;
            do {
                value = xVar.getValue();
                dVar2 = (d) value;
                if (bVar2 == b.None) {
                    z8 = true;
                } else {
                    z8 = false;
                }
            } while (!xVar.b(value, d.b(dVar2, z8, bVar2, false, null, false, null, 60, null)));
            return G.f1419a;
        }
        if (i9 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        bVar3 = (b) kVar.f6153b;
        mVar = (m) kVar.f6152a;
        C6.r.b(obj);
        bVar2 = bVar3;
        xVar = mVar.f6105g;
        do {
            value = xVar.getValue();
            dVar2 = (d) value;
            if (bVar2 == b.None) {
                z8 = true;
            } else {
                z8 = false;
            }
        } while (!xVar.b(value, d.b(dVar2, z8, bVar2, false, null, false, null, 60, null)));
        return G.f1419a;
    }

    public final Object q(StaticHost staticHost, G6.d dVar) {
        return X0.c(5000L, new l(staticHost, null), dVar);
    }
}
