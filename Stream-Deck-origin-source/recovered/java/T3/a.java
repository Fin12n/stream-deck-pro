package T3;

import C6.G;
import C6.r;
import H.FL.dCqzKmEghGTQ;
import I6.l;
import M3.p;
import Q6.k;
import Q6.o;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppSettingsStore f9825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f9826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final S3.a f9827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f9828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public b f9829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public InterfaceC1815v0 f9830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final x f9831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M f9832h;

    /* JADX INFO: renamed from: T3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0274a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final KnownHost f9833a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final KnownHost.Device f9834b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f9835c;

        public C0274a() {
            this(null, null, false, 7, null);
        }

        public final KnownHost.Device a() {
            return this.f9834b;
        }

        public final KnownHost b() {
            return this.f9833a;
        }

        public final boolean c() {
            return this.f9835c;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C0274a)) {
                return false;
            }
            C0274a c0274a = (C0274a) obj;
            return t.c(this.f9833a, c0274a.f9833a) && t.c(this.f9834b, c0274a.f9834b) && this.f9835c == c0274a.f9835c;
        }

        public int hashCode() {
            return (((this.f9833a.hashCode() * 31) + this.f9834b.hashCode()) * 31) + Boolean.hashCode(this.f9835c);
        }

        public C0274a(KnownHost host, KnownHost.Device device, boolean z8) {
            t.g(host, "host");
            t.g(device, "device");
            this.f9833a = host;
            this.f9834b = device;
            this.f9835c = z8;
        }

        public String toString() {
            return dCqzKmEghGTQ.JZueganUUmjDqZ + this.f9833a + ", device=" + this.f9834b + ", isProUser=" + this.f9835c + ")";
        }

        /* JADX WARN: Illegal instructions before constructor call */
        public /* synthetic */ C0274a(KnownHost knownHost, KnownHost.Device device, boolean z8, int i8, AbstractC2633k abstractC2633k) {
            if ((i8 & 1) != 0) {
                knownHost = KnownHost.getDefaultInstance();
                t.f(knownHost, "getDefaultInstance(...)");
            }
            if ((i8 & 2) != 0) {
                device = KnownHost.Device.getDefaultInstance();
                t.f(device, "getDefaultInstance(...)");
            }
            this(knownHost, device, (i8 & 4) != 0 ? false : z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {
        InterfaceC2260f a();

        void b(k kVar);
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9836a;

        /* JADX INFO: renamed from: T3.a$c$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0275a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ a f9838a;

            public C0275a(a aVar) {
                this.f9838a = aVar;
            }

            @Override // p044e7.InterfaceC2261g
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Object emit(C0274a c0274a, G6.d dVar) {
                this.f9838a.f9831g.setValue(c0274a);
                return G.f1419a;
            }
        }

        public c(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return a.this.new c(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((c) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f9836a;
            if (i8 == 0) {
                r.b(obj);
                InterfaceC2260f interfaceC2260fA = a.this.f().a();
                C0275a c0275a = new C0275a(a.this);
                this.f9836a = 1;
                if (interfaceC2260fA.collect(c0275a, this) == objF) {
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

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device.Appearance f9839a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(KnownHost.Device.Appearance appearance) {
            super(1);
            this.f9839a = appearance;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KnownHost.Device.Builder invoke(KnownHost.Device.Builder it) {
            t.g(it, "it");
            KnownHost.Device.Builder appearance = it.setAppearance(this.f9839a);
            t.f(appearance, "setAppearance(...)");
            return appearance;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device.KeypadOrientationOption f9840a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(KnownHost.Device.KeypadOrientationOption keypadOrientationOption) {
            super(1);
            this.f9840a = keypadOrientationOption;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KnownHost.Device.Builder invoke(KnownHost.Device.Builder it) {
            t.g(it, "it");
            KnownHost.Device.Builder keypadRotation = it.setKeypadRotation(this.f9840a);
            t.f(keypadRotation, "setKeypadRotation(...)");
            return keypadRotation;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends u implements k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ k f9841a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(k kVar) {
            super(1);
            this.f9841a = kVar;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KnownHost.Device invoke(KnownHost.Device it) {
            t.g(it, "it");
            k kVar = this.f9841a;
            GeneratedMessageLite.b builder = it.toBuilder();
            t.f(builder, "toBuilder(...)");
            GeneratedMessageLite generatedMessageLiteBuild = ((KnownHost.Device.Builder) kVar.invoke(builder)).build();
            t.f(generatedMessageLiteBuild, "build(...)");
            return (KnownHost.Device) generatedMessageLiteBuild;
        }
    }

    public final void b() {
        j(new T3.b(this.f9825a, this.f9826b, this.f9827c, this.f9828d));
    }

    public final void c(String workstationID, String deviceID) {
        t.g(workstationID, "workstationID");
        t.g(deviceID, "deviceID");
        j(new T3.c(workstationID, deviceID, this.f9825a, this.f9827c, this.f9828d, null));
    }

    public final void d(String workstationID) {
        t.g(workstationID, "workstationID");
        j(new T3.d(workstationID, this.f9825a, this.f9827c, null));
    }

    public final M e() {
        return this.f9832h;
    }

    public final b f() {
        return this.f9829e;
    }

    public final void g() {
        InterfaceC1815v0 interfaceC1815v0 = this.f9830f;
        if (interfaceC1815v0 != null) {
            InterfaceC1815v0.a.a(interfaceC1815v0, null, 1, null);
        }
        this.f9831g.setValue(new C0274a(null, null, false, 7, null));
        this.f9830f = AbstractC1789i.d(this.f9828d, null, null, new c(null), 3, null);
    }

    public final void h(KnownHost.Device.Appearance appearance) {
        t.g(appearance, "appearance");
        k(new d(appearance));
    }

    public final void i(KnownHost.Device.KeypadOrientationOption orientation) {
        t.g(orientation, "orientation");
        k(new e(orientation));
    }

    public final void j(b value) {
        t.g(value, "value");
        this.f9829e = value;
        g();
    }

    public final void k(k updater) {
        t.g(updater, "updater");
        this.f9829e.b(new f(updater));
    }

    public a(AppSettingsStore settingsStore, p pVar, S3.a isProUser, J scope) {
        t.g(settingsStore, "settingsStore");
        t.g(pVar, dCqzKmEghGTQ.BsMdLK);
        t.g(isProUser, "isProUser");
        t.g(scope, "scope");
        this.f9825a = settingsStore;
        this.f9826b = pVar;
        this.f9827c = isProUser;
        this.f9828d = scope;
        this.f9829e = new T3.b(settingsStore, pVar, isProUser, scope);
        x xVarA = O.a(new C0274a(null, null, false, 7, null));
        this.f9831g = xVarA;
        this.f9832h = AbstractC2262h.b(xVarA);
        g();
    }
}
