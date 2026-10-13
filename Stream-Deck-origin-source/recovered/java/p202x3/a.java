package p202x3;

import C6.G;
import C6.r;
import G3.h;
import G6.d;
import H6.c;
import I6.l;
import M3.f;
import M3.i;
import M3.m;
import M3.o;
import N3.b;
import Q6.q;
import Z6.w;
import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.connection.CryptoBox;
import com.elgato.vsd2.Messages;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a implements o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Context f37194a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final G5.a f37195b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final AppSettingsStore f37196c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final b f37197d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final CryptoBox f37198e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Function0 f37199f;

    /* JADX INFO: renamed from: x3.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0824a extends l implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f37200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f37201b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ Object f37202c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f37203d;

        public C0824a(d dVar) {
            super(4, dVar);
        }

        @Override // Q6.q
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object i(N3.o oVar, f fVar, Q6.o oVar2, d dVar) {
            C0824a c0824a = a.this.new C0824a(dVar);
            c0824a.f37201b = oVar;
            c0824a.f37202c = fVar;
            c0824a.f37203d = oVar2;
            return c0824a.invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x007f, code lost:
        
            if (M3.u.a(r3, r4, r5, r6, r7, r8, r10) == r0) goto L17;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            N3.o oVar;
            Q6.o oVar2;
            f fVar;
            Object objF = c.f();
            int i8 = this.f37200a;
            if (i8 != 0) {
                if (i8 == 1) {
                    oVar2 = (Q6.o) this.f37203d;
                    f fVar2 = (f) this.f37202c;
                    oVar = (N3.o) this.f37201b;
                    r.b(obj);
                    fVar = fVar2;
                } else {
                    if (i8 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    r.b(obj);
                }
                return G.f1419a;
            }
            r.b(obj);
            oVar = (N3.o) this.f37201b;
            f fVar3 = (f) this.f37202c;
            oVar2 = (Q6.o) this.f37203d;
            AppSettingsStore appSettingsStore = a.this.f37196c;
            this.f37201b = oVar;
            this.f37202c = fVar3;
            this.f37203d = oVar2;
            this.f37200a = 1;
            Object objKeyPair = appSettingsStore.keyPair(this);
            if (objKeyPair != objF) {
                fVar = fVar3;
                obj = objKeyPair;
            }
            return objF;
            Q6.o oVar3 = oVar2;
            G5.a aVar = a.this.f37195b;
            N3.o oVar4 = oVar;
            String strA = oVar4.a();
            int iC = oVar4.c();
            com.elgato.streamdeck.vsd2.connection.a aVar2 = new com.elgato.streamdeck.vsd2.connection.a(a.this.f37198e, (CryptoBox.KeyPair) obj);
            this.f37201b = null;
            this.f37202c = null;
            this.f37203d = null;
            this.f37200a = 2;
        }
    }

    public a(Context context, G5.a httpClient, AppSettingsStore store, b discoveryFlow, CryptoBox cryptoBox, Function0 iconDecompressorFactory) {
        t.g(context, "context");
        t.g(httpClient, "httpClient");
        t.g(store, "store");
        t.g(discoveryFlow, "discoveryFlow");
        t.g(cryptoBox, "cryptoBox");
        t.g(iconDecompressorFactory, "iconDecompressorFactory");
        this.f37194a = context;
        this.f37195b = httpClient;
        this.f37196c = store;
        this.f37197d = discoveryFlow;
        this.f37198e = cryptoBox;
        this.f37199f = iconDecompressorFactory;
    }

    @Override // M3.o
    public m a(String workstationID, String str) {
        t.g(workstationID, "workstationID");
        Messages.ClientInformation clientInformation = (Messages.ClientInformation) Messages.ClientInformation.newBuilder().g(e()).l("StreamDeckAndroid/2.0").f(Build.MODEL).k(2).h("Android").i(Build.VERSION.RELEASE).build();
        t.d(clientInformation);
        return new m(workstationID, str, false, null, clientInformation, N3.l.d(this.f37197d, workstationID), this.f37196c, new C0824a(null), (i) this.f37199f.invoke(), null, 520, null);
    }

    public final String e() {
        String strF = h.a() ? f() : Settings.Global.getString(this.f37194a.getContentResolver(), "device_name");
        if (strF != null) {
            return strF;
        }
        String MODEL = Build.MODEL;
        t.f(MODEL, "MODEL");
        return MODEL;
    }

    public final String f() {
        String string = Settings.Secure.getString(this.f37194a.getContentResolver(), "bluetooth_name");
        if (string == null || w.b0(string)) {
            string = null;
        }
        return string == null ? Settings.Global.getString(this.f37194a.getContentResolver(), "device_name") : string;
    }
}
