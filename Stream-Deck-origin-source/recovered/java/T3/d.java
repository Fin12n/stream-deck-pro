package T3;

import P3.f;
import Q6.k;
import Q6.q;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2623a;
import kotlin.jvm.internal.t;
import p044e7.AbstractC2262h;
import p044e7.InterfaceC2260f;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d implements T3.a.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final x f9878a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final InterfaceC2260f f9879b;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a extends C2623a implements q {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public static final a f9880h = new a();

        public a() {
            super(4, T3.a.C0274a.class, "<init>", "<init>(Lcom/elgato/streamdeck/vsd2/KnownHost;Lcom/elgato/streamdeck/vsd2/KnownHost$Device;Z)V", 4);
        }

        public final Object b(KnownHost knownHost, KnownHost.Device device, boolean z8, G6.d dVar) {
            return d.d(knownHost, device, z8, dVar);
        }

        @Override // Q6.q
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            return b((KnownHost) obj, (KnownHost.Device) obj2, ((Boolean) obj3).booleanValue(), (G6.d) obj4);
        }
    }

    public /* synthetic */ d(String str, AppSettingsStore appSettingsStore, S3.a aVar, AbstractC2633k abstractC2633k) {
        this(str, appSettingsStore, aVar);
    }

    public static final /* synthetic */ Object d(KnownHost knownHost, KnownHost.Device device, boolean z8, G6.d dVar) {
        return new T3.a.C0274a(knownHost, device, z8);
    }

    @Override // T3.a.b
    public InterfaceC2260f a() {
        return this.f9879b;
    }

    @Override // T3.a.b
    public void b(k updater) {
        t.g(updater, "updater");
        x xVar = this.f9878a;
        Object value = xVar.getValue();
        t.f(value, "<get-value>(...)");
        xVar.setValue(updater.invoke(value));
    }

    public d(String workstationID, AppSettingsStore settingsStore, S3.a isProUser) {
        t.g(workstationID, "workstationID");
        t.g(settingsStore, "settingsStore");
        t.g(isProUser, "isProUser");
        KnownHost.Device.Builder builderNewBuilder = KnownHost.Device.newBuilder();
        t.f(builderNewBuilder, "newBuilder(...)");
        x xVarA = O.a(f.o(builderNewBuilder).setRawWorkstationID(workstationID).build());
        this.f9878a = xVarA;
        this.f9879b = AbstractC2262h.l(AbstractC2262h.w(settingsStore.m103getKnownHostByIDjCyGMI4(workstationID)), xVarA, isProUser.d(), a.f9880h);
    }
}
