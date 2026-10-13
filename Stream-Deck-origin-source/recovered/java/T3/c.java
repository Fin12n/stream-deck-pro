package T3;

import C6.G;
import C6.r;
import I6.l;
import Q6.k;
import Q6.o;
import Q6.p;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.KnownHost;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2639q;
import kotlin.jvm.internal.t;
import p017b7.AbstractC1789i;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements T3.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f9866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f9867b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppSettingsStore f9868c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f9869d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final InterfaceC2260f f9870e;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a extends l implements p {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9871a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f9872b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f9873c;

        public a(G6.d dVar) {
            super(3, dVar);
        }

        public final Object g(KnownHost knownHost, boolean z8, G6.d dVar) {
            a aVar = c.this.new a(dVar);
            aVar.f9872b = knownHost;
            aVar.f9873c = z8;
            return aVar.invokeSuspend(G.f1419a);
        }

        @Override // Q6.p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return g((KnownHost) obj, ((Boolean) obj2).booleanValue(), (G6.d) obj3);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object next;
            H6.c.f();
            if (this.f9871a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            KnownHost knownHost = (KnownHost) this.f9872b;
            boolean z8 = this.f9873c;
            if (knownHost == null) {
                return null;
            }
            List<KnownHost.Device> devicesList = knownHost.getDevicesList();
            t.f(devicesList, "getDevicesList(...)");
            c cVar = c.this;
            Iterator<T> it = devicesList.iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!t.c(((KnownHost.Device) next).getRawID(), cVar.f9867b));
            KnownHost.Device device = (KnownHost.Device) next;
            if (device == null) {
                return null;
            }
            return new T3.a.C0274a(knownHost, device, z8);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f9875a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ k f9877c;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class a extends C2639q implements o {
            public a(Object obj) {
                super(2, obj, t.a.class, "suspendConversion0", "invokeSuspend$suspendConversion0(Lkotlin/jvm/functions/Function1;Lcom/elgato/streamdeck/vsd2/KnownHost$Device;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", 0);
            }

            @Override // Q6.o
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final Object invoke(KnownHost.Device device, G6.d dVar) {
                return b.k((k) this.receiver, device, dVar);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(k kVar, G6.d dVar) {
            super(2, dVar);
            this.f9877c = kVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object k(k kVar, KnownHost.Device device, G6.d dVar) {
            return kVar.invoke(device);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return c.this.new b(this.f9877c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((b) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f9875a;
            if (i8 == 0) {
                r.b(obj);
                AppSettingsStore appSettingsStore = c.this.f9868c;
                String str = c.this.f9866a;
                String str2 = c.this.f9867b;
                a aVar = new a(this.f9877c);
                this.f9875a = 1;
                if (AppSettingsStore.m95createOrUpdateDeviceDUA0qnw$default(appSettingsStore, str, str2, null, aVar, this, 4, null) == objF) {
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

    public /* synthetic */ c(String str, String str2, AppSettingsStore appSettingsStore, S3.a aVar, J j8, AbstractC2633k abstractC2633k) {
        this(str, str2, appSettingsStore, aVar, j8);
    }

    @Override // T3.a.b
    public InterfaceC2260f a() {
        return this.f9870e;
    }

    @Override // T3.a.b
    public void b(k updater) {
        t.g(updater, "updater");
        AbstractC1789i.d(this.f9869d, null, null, new b(updater, null), 3, null);
    }

    public c(String workstationID, String deviceID, AppSettingsStore settingsStore, S3.a isProUser, J scope) {
        t.g(workstationID, "workstationID");
        t.g(deviceID, "deviceID");
        t.g(settingsStore, "settingsStore");
        t.g(isProUser, "isProUser");
        t.g(scope, "scope");
        this.f9866a = workstationID;
        this.f9867b = deviceID;
        this.f9868c = settingsStore;
        this.f9869d = scope;
        this.f9870e = AbstractC2262h.w(AbstractC2262h.k(settingsStore.m103getKnownHostByIDjCyGMI4(workstationID), isProUser.d(), new a(null)));
    }
}
