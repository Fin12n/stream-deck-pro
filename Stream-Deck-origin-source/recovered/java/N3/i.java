package N3;

import C6.G;
import D6.z;
import P2.Lsk.mHPawN;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.streamdeck.vsd2.Values;
import com.elgato.vsd2.Messages;
import com.google.protobuf.GeneratedMessageLite;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p017b7.Q;
import p044e7.AbstractC2262h;
import p044e7.D;
import p044e7.H;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p044e7.w;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N3.f f6020a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final AppSettingsStore f6021b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T3.a f6022c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f6023d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f6024e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final w f6025f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final M f6026g;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {

        /* JADX INFO: renamed from: N3.i$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0226a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0226a f6027a = new C0226a();

            public C0226a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0226a);
            }

            public int hashCode() {
                return 873633209;
            }

            public String toString() {
                return "DismissVirtualDeviceSettings";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6028a;

            public /* synthetic */ b(String str, AbstractC2633k abstractC2633k) {
                this(str);
            }

            public final String a() {
                return this.f6028a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && P3.i.d(this.f6028a, ((b) obj).f6028a);
            }

            public int hashCode() {
                return P3.i.e(this.f6028a);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String workstationID) {
                super(null);
                t.g(workstationID, "workstationID");
                this.f6028a = workstationID;
            }

            public String toString() {
                return "NewDevice(workstationID=" + P3.i.f(this.f6028a) + mHPawN.cje;
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final N3.f.e f6029a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public c(N3.f.e state) {
                super(null);
                t.g(state, "state");
                this.f6029a = state;
            }

            public final N3.f.e a() {
                return this.f6029a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.c(this.f6029a, ((c) obj).f6029a);
            }

            public int hashCode() {
                return this.f6029a.hashCode();
            }

            public String toString() {
                return "ServiceUpdate(state=" + this.f6029a + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class d extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6030a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f6031b;

            public /* synthetic */ d(String str, String str2, AbstractC2633k abstractC2633k) {
                this(str, str2);
            }

            public final String a() {
                return this.f6031b;
            }

            public final String b() {
                return this.f6030a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return P3.i.d(this.f6030a, dVar.f6030a) && P3.b.d(this.f6031b, dVar.f6031b);
            }

            public int hashCode() {
                return (P3.i.e(this.f6030a) * 31) + P3.b.e(this.f6031b);
            }

            public String toString() {
                return "ShowDeviceInfo(workstationID=" + P3.i.f(this.f6030a) + ", deviceID=" + P3.b.f(this.f6031b) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public d(String workstationID, String deviceID) {
                super(null);
                t.g(workstationID, "workstationID");
                t.g(deviceID, "deviceID");
                this.f6030a = workstationID;
                this.f6031b = deviceID;
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f6032a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final String f6033b;

        public b(String hostname, String fingerprint) {
            t.g(hostname, "hostname");
            t.g(fingerprint, "fingerprint");
            this.f6032a = hostname;
            this.f6033b = fingerprint;
        }

        public final String a() {
            return this.f6033b;
        }

        public final String b() {
            return this.f6032a;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return t.c(this.f6032a, bVar.f6032a) && t.c(this.f6033b, bVar.f6033b);
        }

        public int hashCode() {
            return (this.f6032a.hashCode() * 31) + this.f6033b.hashCode();
        }

        public String toString() {
            return "PairingDialogParams(hostname=" + this.f6032a + ", fingerprint=" + this.f6033b + ")";
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class c {

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6034a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final String f6035b;

            public /* synthetic */ a(String str, String str2, AbstractC2633k abstractC2633k) {
                this(str, str2);
            }

            @Override // N3.i.c
            public String a() {
                return this.f6034a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return P3.i.d(this.f6034a, aVar.f6034a) && P3.b.d(this.f6035b, aVar.f6035b);
            }

            public int hashCode() {
                return (P3.i.e(this.f6034a) * 31) + P3.b.e(this.f6035b);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String workstationID, String deviceID) {
                super(null);
                t.g(workstationID, "workstationID");
                t.g(deviceID, "deviceID");
                this.f6034a = workstationID;
                this.f6035b = deviceID;
            }

            public String toString() {
                return "ExistingDevice(workstationID=" + P3.i.f(this.f6034a) + hJroAgFztiMK.ZJj + P3.b.f(this.f6035b) + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends c {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final String f6036a;

            public /* synthetic */ b(String str, AbstractC2633k abstractC2633k) {
                this(str);
            }

            @Override // N3.i.c
            public String a() {
                return this.f6036a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && P3.i.d(this.f6036a, ((b) obj).f6036a);
            }

            public int hashCode() {
                return P3.i.e(this.f6036a);
            }

            public String toString() {
                return "NewDevice(workstationID=" + P3.i.f(this.f6036a) + ")";
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(String workstationID) {
                super(null);
                t.g(workstationID, "workstationID");
                this.f6036a = workstationID;
            }
        }

        public /* synthetic */ c(AbstractC2633k abstractC2633k) {
            this();
        }

        public abstract String a();

        public c() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final List f6037a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final List f6038b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f6039c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final String f6040d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final String f6041e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final String f6042f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public final c f6043g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public final Throwable f6044h;

        public /* synthetic */ d(List list, List list2, b bVar, String str, String str2, String str3, c cVar, Throwable th, AbstractC2633k abstractC2633k) {
            this(list, list2, bVar, str, str2, str3, cVar, th);
        }

        public static /* synthetic */ d b(d dVar, List list, List list2, b bVar, String str, String str2, String str3, c cVar, Throwable th, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                list = dVar.f6037a;
            }
            if ((i8 & 2) != 0) {
                list2 = dVar.f6038b;
            }
            if ((i8 & 4) != 0) {
                bVar = dVar.f6039c;
            }
            if ((i8 & 8) != 0) {
                str = dVar.f6040d;
            }
            if ((i8 & 16) != 0) {
                str2 = dVar.f6041e;
            }
            if ((i8 & 32) != 0) {
                str3 = dVar.f6042f;
            }
            if ((i8 & 64) != 0) {
                cVar = dVar.f6043g;
            }
            if ((i8 & 128) != 0) {
                th = dVar.f6044h;
            }
            c cVar2 = cVar;
            Throwable th2 = th;
            String str4 = str2;
            String str5 = str3;
            return dVar.a(list, list2, bVar, str, str4, str5, cVar2, th2);
        }

        public final d a(List knownHosts, List unknownHosts, b bVar, String str, String str2, String minStreamDeckDesktopVersion, c cVar, Throwable th) {
            t.g(knownHosts, "knownHosts");
            t.g(unknownHosts, "unknownHosts");
            t.g(minStreamDeckDesktopVersion, "minStreamDeckDesktopVersion");
            return new d(knownHosts, unknownHosts, bVar, str, str2, minStreamDeckDesktopVersion, cVar, th, null);
        }

        public final Throwable c() {
            return this.f6044h;
        }

        public final List d() {
            return this.f6037a;
        }

        public final String e() {
            return this.f6042f;
        }

        /* JADX WARN: Code duplicated, block: B:21:0x0037  */
        /* JADX WARN: Code duplicated, block: B:31:0x004d  */
        public boolean equals(Object obj) {
            boolean zD;
            boolean zD2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            if (!t.c(this.f6037a, dVar.f6037a) || !t.c(this.f6038b, dVar.f6038b) || !t.c(this.f6039c, dVar.f6039c)) {
                return false;
            }
            String str = this.f6040d;
            String str2 = dVar.f6040d;
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
            if (!zD) {
                return false;
            }
            String str3 = this.f6041e;
            String str4 = dVar.f6041e;
            if (str3 == null) {
                if (str4 == null) {
                    zD2 = true;
                } else {
                    zD2 = false;
                }
            } else if (str4 == null) {
                zD2 = false;
            } else {
                zD2 = P3.i.d(str3, str4);
            }
            return zD2 && t.c(this.f6042f, dVar.f6042f) && t.c(this.f6043g, dVar.f6043g) && t.c(this.f6044h, dVar.f6044h);
        }

        public final String f() {
            return this.f6040d;
        }

        public final b g() {
            return this.f6039c;
        }

        public final String h() {
            return this.f6041e;
        }

        public int hashCode() {
            int iHashCode = ((this.f6037a.hashCode() * 31) + this.f6038b.hashCode()) * 31;
            b bVar = this.f6039c;
            int iHashCode2 = (iHashCode + (bVar == null ? 0 : bVar.hashCode())) * 31;
            String str = this.f6040d;
            int iE = (iHashCode2 + (str == null ? 0 : P3.b.e(str))) * 31;
            String str2 = this.f6041e;
            int iE2 = (((iE + (str2 == null ? 0 : P3.i.e(str2))) * 31) + this.f6042f.hashCode()) * 31;
            c cVar = this.f6043g;
            int iHashCode3 = (iE2 + (cVar == null ? 0 : cVar.hashCode())) * 31;
            Throwable th = this.f6044h;
            return iHashCode3 + (th != null ? th.hashCode() : 0);
        }

        public final c i() {
            return this.f6043g;
        }

        public final List j() {
            return this.f6038b;
        }

        public String toString() {
            List list = this.f6037a;
            List list2 = this.f6038b;
            b bVar = this.f6039c;
            String str = this.f6040d;
            String strF = str == null ? "null" : P3.b.f(str);
            String str2 = this.f6041e;
            return "ViewState(knownHosts=" + list + ", unknownHosts=" + list2 + ", pairingDialogParams=" + bVar + ", openRequestDeviceId=" + strF + ", pairingRequestHostId=" + (str2 != null ? P3.i.f(str2) : "null") + ", minStreamDeckDesktopVersion=" + this.f6042f + ", showVirtualDeviceSettings=" + this.f6043g + ", error=" + this.f6044h + ")";
        }

        public d(List knownHosts, List unknownHosts, b bVar, String str, String str2, String minStreamDeckDesktopVersion, c cVar, Throwable th) {
            t.g(knownHosts, "knownHosts");
            t.g(unknownHosts, "unknownHosts");
            t.g(minStreamDeckDesktopVersion, "minStreamDeckDesktopVersion");
            this.f6037a = knownHosts;
            this.f6038b = unknownHosts;
            this.f6039c = bVar;
            this.f6040d = str;
            this.f6041e = str2;
            this.f6042f = minStreamDeckDesktopVersion;
            this.f6043g = cVar;
            this.f6044h = th;
        }

        public /* synthetic */ d(List list, List list2, b bVar, String str, String str2, String str3, c cVar, Throwable th, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? D6.r.n() : list, (i8 & 2) != 0 ? D6.r.n() : list2, (i8 & 4) != 0 ? null : bVar, (i8 & 8) != 0 ? null : str, (i8 & 16) != 0 ? null : str2, str3, (i8 & 64) != 0 ? null : cVar, (i8 & 128) != 0 ? null : th, null);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f6045a;

        static {
            int[] iArr = new int[Messages.Error.b.values().length];
            try {
                iArr[Messages.Error.b.AuthenticationRejected.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Messages.Error.b.Cancelled.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f6045a = iArr;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6046a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ N3.f.b f6048c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f6049a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f6050b;

            public a(G6.d dVar) {
                super(2, dVar);
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(dVar);
                aVar.f6050b = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(KnownHost knownHost, G6.d dVar) {
                return ((a) create(knownHost, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f6049a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                KnownHost.Builder builder = (KnownHost.Builder) ((KnownHost) this.f6050b).toBuilder();
                builder.clearDeletedAt();
                GeneratedMessageLite generatedMessageLiteBuild = builder.build();
                t.f(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(N3.f.b bVar, G6.d dVar) {
            super(2, dVar);
            this.f6048c = bVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return i.this.new f(this.f6048c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f6046a;
            if (i8 == 0) {
                C6.r.b(obj);
                AppSettingsStore appSettingsStore = i.this.f6021b;
                String strJ = this.f6048c.j();
                a aVar = new a(null);
                this.f6046a = 1;
                if (appSettingsStore.m97createOrUpdateKnownHostKF776PU(strJ, aVar, this) == objF) {
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
    public static final class g extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6051a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ N3.f.b f6053c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends I6.l implements Q6.o {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public int f6054a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public /* synthetic */ Object f6055b;

            public a(G6.d dVar) {
                super(2, dVar);
            }

            @Override // I6.a
            public final G6.d create(Object obj, G6.d dVar) {
                a aVar = new a(dVar);
                aVar.f6055b = obj;
                return aVar;
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
            public final Object invoke(KnownHost knownHost, G6.d dVar) {
                return ((a) create(knownHost, dVar)).invokeSuspend(G.f1419a);
            }

            @Override // I6.a
            public final Object invokeSuspend(Object obj) {
                H6.c.f();
                if (this.f6054a != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
                KnownHost.Builder builder = (KnownHost.Builder) ((KnownHost) this.f6055b).toBuilder();
                builder.setDeletedAt(P3.f.d());
                GeneratedMessageLite generatedMessageLiteBuild = builder.build();
                t.f(generatedMessageLiteBuild, "build(...)");
                return generatedMessageLiteBuild;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(N3.f.b bVar, G6.d dVar) {
            super(2, dVar);
            this.f6053c = bVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return i.this.new g(this.f6053c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((g) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004e, code lost:
        
            if (r7.m100deleteStaticHostByIDZDYjOP8(r1, r6) == r0) goto L15;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f6051a;
            if (i8 != 0) {
                if (i8 == 1) {
                    C6.r.b(obj);
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C6.r.b(obj);
                }
                return G.f1419a;
            }
            C6.r.b(obj);
            AppSettingsStore appSettingsStore = i.this.f6021b;
            String strJ = this.f6053c.j();
            a aVar = new a(null);
            this.f6051a = 1;
            if (appSettingsStore.m97createOrUpdateKnownHostKF776PU(strJ, aVar, this) != objF) {
            }
            return objF;
            AppSettingsStore appSettingsStore2 = i.this.f6021b;
            String strJ2 = this.f6053c.j();
            this.f6051a = 2;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6056a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f6058c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(KnownHost.Device device, G6.d dVar) {
            super(2, dVar);
            this.f6058c = device;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return i.this.new h(this.f6058c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((h) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f6056a;
            if (i8 == 0) {
                C6.r.b(obj);
                Q qL = i.this.f6020a.L(this.f6058c);
                this.f6056a = 1;
                if (qL.Q0(this) == objF) {
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

    /* JADX INFO: renamed from: N3.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0227i implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f6059a;

        /* JADX INFO: renamed from: N3.i$i$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f6060a;

            /* JADX INFO: renamed from: N3.i$i$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0228a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f6061a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f6062b;

                public C0228a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f6061a = obj;
                    this.f6062b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f6060a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0228a c0228a;
                if (dVar instanceof C0228a) {
                    c0228a = (C0228a) dVar;
                    int i8 = c0228a.f6062b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0228a.f6062b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0228a = new C0228a(dVar);
                    }
                } else {
                    c0228a = new C0228a(dVar);
                }
                Object obj2 = c0228a.f6061a;
                Object objF = H6.c.f();
                int i9 = c0228a.f6062b;
                if (i9 == 0) {
                    C6.r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f6060a;
                    a.c cVar = new a.c((N3.f.e) obj);
                    c0228a.f6062b = 1;
                    if (interfaceC2261g.emit(cVar, c0228a) == objF) {
                        return objF;
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

        public C0227i(InterfaceC2260f interfaceC2260f) {
            this.f6059a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f6059a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends I6.l implements Q6.p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6064a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f6065b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f6066c;

        public j(G6.d dVar) {
            super(3, dVar);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, a aVar, G6.d dVar2) {
            j jVar = i.this.new j(dVar2);
            jVar.f6065b = dVar;
            jVar.f6066c = aVar;
            return jVar.invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f6064a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C6.r.b(obj);
            d dVar = (d) this.f6065b;
            a aVar = (a) this.f6066c;
            if (aVar instanceof a.c) {
                return i.this.e(dVar, ((a.c) aVar).a());
            }
            AbstractC2633k abstractC2633k = null;
            if (aVar instanceof a.d) {
                a.d dVar2 = (a.d) aVar;
                if (N3.j.b(dVar.d(), dVar2.b())) {
                    i.this.f6022c.c(dVar2.b(), dVar2.a());
                    return d.b(dVar, null, null, null, null, null, null, new c.a(dVar2.b(), dVar2.a(), abstractC2633k), null, 191, null);
                }
            } else {
                if (!(aVar instanceof a.b)) {
                    if (t.c(aVar, a.C0226a.f6027a)) {
                        return d.b(dVar, null, null, null, null, null, null, null, null, 191, null);
                    }
                    throw new C6.m();
                }
                a.b bVar = (a.b) aVar;
                if (N3.j.b(dVar.d(), bVar.a())) {
                    i.this.f6022c.d(bVar.a());
                    return d.b(dVar, null, null, null, null, null, null, new c.b(bVar.a(), abstractC2633k), null, 191, null);
                }
            }
            return dVar;
        }
    }

    public i(N3.f discoveryService, AppSettingsStore appSettingsStore, T3.a virtualDeviceEditor, J coroutineScope) {
        t.g(discoveryService, "discoveryService");
        t.g(appSettingsStore, "appSettingsStore");
        t.g(virtualDeviceEditor, "virtualDeviceEditor");
        t.g(coroutineScope, "coroutineScope");
        this.f6020a = discoveryService;
        this.f6021b = appSettingsStore;
        this.f6022c = virtualDeviceEditor;
        this.f6023d = coroutineScope;
        this.f6024e = Values.Versions.STREAM_DECK_VERSION;
        w wVarB = D.b(0, 1, null, 5, null);
        this.f6025f = wVarB;
        this.f6026g = AbstractC2262h.T(AbstractC2262h.R(AbstractC2262h.K(wVarB, new C0227i(discoveryService.C())), k(), new j(null)), coroutineScope, H.a.b(H.f20929a, 1000L, 0L, 2, null), k());
    }

    /* JADX WARN: Code duplicated, block: B:63:0x00c4  */
    public final d e(d dVar, N3.f.e eVar) {
        Throwable th;
        c cVarI;
        c cVar;
        Throwable th2;
        M3.m.C1037b c1037b;
        N3.f.e.c cVar2 = eVar instanceof N3.f.e.c ? (N3.f.e.c) eVar : null;
        if (cVar2 == null) {
            return new d(null, null, null, null, null, this.f6024e, null, null, 223, null);
        }
        N3.f.c cVarB = cVar2.b();
        if (cVarB == null || !N3.h.j(cVarB)) {
            cVarB = null;
        }
        boolean z8 = cVarB instanceof N3.f.c.d;
        N3.f.c.d dVar2 = z8 ? (N3.f.c.d) cVarB : null;
        b bVar = dVar2 != null ? new b(dVar2.e(), dVar2.d()) : null;
        N3.f.c.C0219c c0219c = cVarB instanceof N3.f.c.C0219c ? (N3.f.c.C0219c) cVarB : null;
        String strB = c0219c != null ? c0219c.b() : null;
        N3.f.c.d dVar3 = z8 ? (N3.f.c.d) cVarB : null;
        String strF = dVar3 != null ? dVar3.f() : null;
        N3.f.c cVarB2 = cVar2.b();
        N3.f.d dVarA = cVarB2 != null ? cVarB2.a() : null;
        N3.f.d.a aVar = dVarA instanceof N3.f.d.a ? (N3.f.d.a) dVarA : null;
        Throwable thA = aVar != null ? aVar.a() : null;
        if (!(thA instanceof M3.m.C1037b)) {
            if (thA instanceof IllegalStateException) {
                th2 = thA;
                th = null;
            }
            List listI0 = z.I0(cVar2.a());
            cVarI = dVar.i();
            if (cVarI == null && N3.j.b(listI0, cVarI.a())) {
                cVar = cVarI;
            } else {
                cVar = null;
            }
            return dVar.a(listI0, cVar2.c(), bVar, strB, strF, this.f6024e, cVar, th);
        }
        c1037b = (M3.m.C1037b) thA;
        int i8 = e.f6045a[c1037b.a().ordinal()];
        if (i8 == 1 || i8 == 2) {
            th2 = c1037b;
            th2 = null;
        }
        th2 = thA;
        th2 = c1037b;
        th = th2;
        List listI1 = z.I0(cVar2.a());
        cVarI = dVar.i();
        if (cVarI == null) {
            cVar = null;
        } else {
            cVar = null;
        }
        return dVar.a(listI1, cVar2.c(), bVar, strB, strF, this.f6024e, cVar, th);
    }

    public final Q f(N3.f.b host) {
        t.g(host, "host");
        KnownHost knownHostM = host.m();
        return (knownHostM == null || !knownHostM.hasDeletedAt()) ? this.f6020a.w(host) : AbstractC1789i.b(this.f6023d, null, null, new f(host, null), 3, null);
    }

    public final void g() {
        this.f6020a.x();
    }

    public final void h(N3.f.b host) {
        t.g(host, "host");
        Z2.j.a aVar = Z2.j.f12858c;
        String str = "deleteHost: " + P3.i.f(host.j());
        String strC = aVar.c();
        Z2.p pVar = Z2.p.Info;
        if (aVar.a().a().compareTo(pVar) <= 0) {
            aVar.b(pVar, strC, null, str);
        }
        AbstractC1789i.d(this.f6023d, null, null, new g(host, null), 3, null);
    }

    public final void i() {
        this.f6025f.d(a.C0226a.f6027a);
    }

    public final void j() {
        this.f6020a.A();
    }

    public final d k() {
        return e(new d(null, null, null, null, null, this.f6024e, null, null, 223, null), this.f6020a.B());
    }

    public final M l() {
        return this.f6026g;
    }

    public final void m(N3.f.b host) {
        t.g(host, "host");
        this.f6025f.d(new a.b(host.j(), null));
    }

    public final InterfaceC1815v0 n(KnownHost.Device device) {
        t.g(device, "device");
        return AbstractC1789i.d(this.f6023d, null, null, new h(device, null), 3, null);
    }

    public final void o(N3.f.b host, KnownHost.Device device) {
        t.g(host, "host");
        t.g(device, "device");
        this.f6025f.d(new a.d(host.j(), P3.f.e(device), null));
    }
}
