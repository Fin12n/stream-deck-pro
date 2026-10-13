package N3;

import C6.G;
import Z6.w;
import com.elgato.streamdeck.vsd2.KnownHost;
import com.elgato.vsd2.Messages;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.C2623a;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.J;
import p017b7.Q;
import p044e7.AbstractC2262h;
import p044e7.H;
import p044e7.M;
import p044e7.O;
import p044e7.x;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final J f6175a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N3.f f6176b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T3.a f6177c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final x f6178d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public KnownHost.Device f6179e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final M f6180f;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static abstract class a {

        /* JADX INFO: renamed from: N3.r$a$a, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0235a extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final C0235a f6181a = new C0235a();

            public C0235a() {
                super(null);
            }

            public boolean equals(Object obj) {
                return this == obj || (obj instanceof C0235a);
            }

            public int hashCode() {
                return -1356123994;
            }

            public String toString() {
                return "ConfirmDelete";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class b extends a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final b f6182a;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(b error) {
                super(null);
                t.g(error, "error");
                this.f6182a = error;
            }

            public final b a() {
                return this.f6182a;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && t.c(this.f6182a, ((b) obj).f6182a);
            }

            public int hashCode() {
                return this.f6182a.hashCode();
            }

            public String toString() {
                return "ErrorAlert(error=" + this.f6182a + ")";
            }
        }

        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public a() {
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f6183a = a.f6184a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ a f6184a = new a();

            public final b a(Throwable throwable) {
                t.g(throwable, "throwable");
                return throwable instanceof M3.m.C1037b ? new C0236b((M3.m.C1037b) throwable) : new c(throwable);
            }
        }

        /* JADX INFO: renamed from: N3.r$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class C0236b implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final M3.m.C1037b f6185b;

            public C0236b(M3.m.C1037b throwable) {
                t.g(throwable, "throwable");
                this.f6185b = throwable;
            }

            @Override // N3.r.b
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public M3.m.C1037b a() {
                return this.f6185b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C0236b) && t.c(this.f6185b, ((C0236b) obj).f6185b);
            }

            public int hashCode() {
                return this.f6185b.hashCode();
            }

            public String toString() {
                return "ProtocolError(throwable=" + this.f6185b + ")";
            }
        }

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class c implements b {

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            public final Throwable f6186b;

            public c(Throwable throwable) {
                t.g(throwable, "throwable");
                this.f6186b = throwable;
            }

            @Override // N3.r.b
            public Throwable a() {
                return this.f6186b;
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && t.c(this.f6186b, ((c) obj).f6186b);
            }

            public int hashCode() {
                return this.f6186b.hashCode();
            }

            public String toString() {
                return "Unknown(throwable=" + this.f6186b + ")";
            }
        }

        Throwable a();
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final boolean f6187a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final a f6188b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f6189c;

        public c() {
            this(false, null, null, 7, null);
        }

        public static /* synthetic */ c b(c cVar, boolean z8, a aVar, b bVar, int i8, Object obj) {
            if ((i8 & 1) != 0) {
                z8 = cVar.f6187a;
            }
            if ((i8 & 2) != 0) {
                aVar = cVar.f6188b;
            }
            if ((i8 & 4) != 0) {
                bVar = cVar.f6189c;
            }
            return cVar.a(z8, aVar, bVar);
        }

        public final c a(boolean z8, a aVar, b bVar) {
            return new c(z8, aVar, bVar);
        }

        public final b c() {
            return this.f6189c;
        }

        public final boolean d() {
            return this.f6187a;
        }

        public final a e() {
            return this.f6188b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f6187a == cVar.f6187a && t.c(this.f6188b, cVar.f6188b) && t.c(this.f6189c, cVar.f6189c);
        }

        public int hashCode() {
            int iHashCode = Boolean.hashCode(this.f6187a) * 31;
            a aVar = this.f6188b;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b bVar = this.f6189c;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "UIState(shouldDismiss=" + this.f6187a + ", showAlert=" + this.f6188b + ", inlineError=" + this.f6189c + ")";
        }

        public c(boolean z8, a aVar, b bVar) {
            this.f6187a = z8;
            this.f6188b = aVar;
            this.f6189c = bVar;
        }

        public /* synthetic */ c(boolean z8, a aVar, b bVar, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? null : aVar, (i8 & 4) != 0 ? null : bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d {

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public static final a f6190g = new a(null);

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T3.a.C0274a f6191a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f6192b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final boolean f6193c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public final boolean f6194d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public final a f6195e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public final b f6196f;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final d a() {
                return new d(null, false, false, false, null, null, 63, null);
            }

            public a() {
            }
        }

        public d() {
            this(null, false, false, false, null, null, 63, null);
        }

        public final boolean a() {
            return this.f6193c;
        }

        public final boolean b() {
            return this.f6192b;
        }

        public final T3.a.C0274a c() {
            return this.f6191a;
        }

        public final b d() {
            return this.f6196f;
        }

        public final boolean e() {
            return this.f6194d;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return t.c(this.f6191a, dVar.f6191a) && this.f6192b == dVar.f6192b && this.f6193c == dVar.f6193c && this.f6194d == dVar.f6194d && t.c(this.f6195e, dVar.f6195e) && t.c(this.f6196f, dVar.f6196f);
        }

        public final a f() {
            return this.f6195e;
        }

        public int hashCode() {
            T3.a.C0274a c0274a = this.f6191a;
            int iHashCode = (((((((c0274a == null ? 0 : c0274a.hashCode()) * 31) + Boolean.hashCode(this.f6192b)) * 31) + Boolean.hashCode(this.f6193c)) * 31) + Boolean.hashCode(this.f6194d)) * 31;
            a aVar = this.f6195e;
            int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b bVar = this.f6196f;
            return iHashCode2 + (bVar != null ? bVar.hashCode() : 0);
        }

        public String toString() {
            return "ViewState(deviceEditorState=" + this.f6191a + ", canDelete=" + this.f6192b + ", canCreate=" + this.f6193c + ", shouldDismiss=" + this.f6194d + ", showAlert=" + this.f6195e + ", inlineError=" + this.f6196f + ")";
        }

        public d(T3.a.C0274a c0274a, boolean z8, boolean z9, boolean z10, a aVar, b bVar) {
            this.f6191a = c0274a;
            this.f6192b = z8;
            this.f6193c = z9;
            this.f6194d = z10;
            this.f6195e = aVar;
            this.f6196f = bVar;
        }

        public /* synthetic */ d(T3.a.C0274a c0274a, boolean z8, boolean z9, boolean z10, a aVar, b bVar, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? null : c0274a, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? false : z9, (i8 & 8) != 0 ? false : z10, (i8 & 16) != 0 ? null : aVar, (i8 & 32) != 0 ? null : bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6197a;

        public e(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return r.this.new e(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((e) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x004a, code lost:
        
            if (r9 == r0) goto L15;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object objF = H6.c.f();
            int i8 = this.f6197a;
            if (i8 == 0) {
                C6.r.b(obj);
                M mE = r.this.f6177c.e();
                this.f6197a = 1;
                obj = AbstractC2262h.x(mE, this);
                if (obj != objF) {
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
            N3.f.c.a aVar = (N3.f.c.a) obj;
            N3.f.d dVarA = aVar.a();
            if (t.c(dVarA, N3.f.d.c.f5881a)) {
                x xVar = r.this.f6178d;
                do {
                    value = xVar.getValue();
                } while (!xVar.b(value, c.b((c) value, true, null, null, 6, null)));
            } else if (dVarA instanceof N3.f.d.a) {
                r.this.m(((N3.f.d.a) aVar.a()).a());
            }
            return G.f1419a;
            Q qY = r.this.f6176b.y(((T3.a.C0274a) obj).a());
            this.f6197a = 2;
            obj = qY.Q0(this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class f extends I6.l implements Q6.o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f6199a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ KnownHost.Device f6201c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(KnownHost.Device device, G6.d dVar) {
            super(2, dVar);
            this.f6201c = device;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return r.this.new f(this.f6201c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object value;
            Object value2;
            Object objF = H6.c.f();
            int i8 = this.f6199a;
            if (i8 == 0) {
                C6.r.b(obj);
                Q qZ = r.this.f6176b.z(this.f6201c);
                this.f6199a = 1;
                obj = qZ.Q0(this);
                if (obj == objF) {
                    return objF;
                }
            } else {
                if (i8 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C6.r.b(obj);
            }
            N3.f.c.b bVar = (N3.f.c.b) obj;
            N3.f.d dVarA = bVar.a();
            if (t.c(dVarA, N3.f.d.c.f5881a)) {
                x xVar = r.this.f6178d;
                do {
                    value2 = xVar.getValue();
                } while (!xVar.b(value2, ((c) value2).a(true, null, null)));
            } else if (dVarA instanceof N3.f.d.a) {
                x xVar2 = r.this.f6178d;
                do {
                    value = xVar2.getValue();
                } while (!xVar2.b(value, c.b((c) value, false, new a.b(b.f6183a.a(((N3.f.d.a) bVar.a()).a())), null, 5, null)));
            }
            return G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class g extends u implements Q6.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ String f6202a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str) {
            super(1);
            this.f6202a = str;
        }

        @Override // Q6.k
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final KnownHost.Device.Builder invoke(KnownHost.Device.Builder it) {
            t.g(it, "it");
            KnownHost.Device.Builder displayName = it.setDisplayName(this.f6202a);
            t.f(displayName, "setDisplayName(...)");
            return displayName;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class h extends C2623a implements Q6.p {
        public h(Object obj) {
            super(3, obj, r.class, "combineStates", "combineStates(Lcom/elgato/streamdeck/vsd2/settings/DeviceSettingsEditor$State;Lcom/elgato/streamdeck/vsd2/discovery/VirtualDeviceSettingsViewModel$UIState;)Lcom/elgato/streamdeck/vsd2/discovery/VirtualDeviceSettingsViewModel$ViewState;", 4);
        }

        @Override // Q6.p
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(T3.a.C0274a c0274a, c cVar, G6.d dVar) {
            return r.p((r) this.f28792a, c0274a, cVar, dVar);
        }
    }

    public r(J coroutineScope, N3.f discoveryService, T3.a deviceSettingsEditor) {
        t.g(coroutineScope, "coroutineScope");
        t.g(discoveryService, "discoveryService");
        t.g(deviceSettingsEditor, "deviceSettingsEditor");
        this.f6175a = coroutineScope;
        this.f6176b = discoveryService;
        this.f6177c = deviceSettingsEditor;
        x xVarA = O.a(new c(false, null, null, 7, null));
        this.f6178d = xVarA;
        this.f6180f = AbstractC2262h.T(AbstractC2262h.p(AbstractC2262h.k(deviceSettingsEditor.e(), xVarA, new h(this))), coroutineScope, H.a.b(H.f20929a, 1000L, 0L, 2, null), d.f6190g.a());
    }

    public static final /* synthetic */ Object p(r rVar, T3.a.C0274a c0274a, c cVar, G6.d dVar) {
        return rVar.f(c0274a, cVar);
    }

    public final d f(T3.a.C0274a c0274a, c cVar) {
        this.f6179e = c0274a.a();
        String displayName = c0274a.a().getDisplayName();
        boolean z8 = (displayName == null || w.b0(displayName) || cVar.c() != null) ? false : true;
        String rawID = c0274a.a().getRawID();
        return new d(c0274a, !(rawID == null || w.b0(rawID)), z8, cVar.d(), cVar.e(), cVar.c());
    }

    public final void g() {
        AbstractC1789i.d(this.f6175a, null, null, new e(null), 3, null);
    }

    public final void h() {
        Object value;
        KnownHost.Device device = this.f6179e;
        if (device != null) {
            V3.f.a(s.e(P3.f.h(device), P3.f.j(device)));
        }
        x xVar = this.f6178d;
        do {
            value = xVar.getValue();
        } while (!xVar.b(value, c.b((c) value, false, a.C0235a.f6181a, null, 5, null)));
    }

    public final void i() {
        Object value;
        KnownHost.Device device = this.f6179e;
        String strH = device != null ? P3.f.h(device) : null;
        KnownHost.Device device2 = this.f6179e;
        V3.f.a(s.d(strH, device2 != null ? P3.f.j(device2) : null));
        x xVar = this.f6178d;
        do {
            value = xVar.getValue();
        } while (!xVar.b(value, c.b((c) value, false, null, null, 5, null)));
        KnownHost.Device device3 = this.f6179e;
        if (device3 != null) {
            AbstractC1789i.d(this.f6175a, null, null, new f(device3, null), 3, null);
        }
    }

    public final void j() {
        Object value;
        x xVar = this.f6178d;
        do {
            value = xVar.getValue();
        } while (!xVar.b(value, c.b((c) value, false, null, null, 6, null)));
    }

    public final void k() {
        Object value;
        x xVar = this.f6178d;
        do {
            value = xVar.getValue();
        } while (!xVar.b(value, c.b((c) value, false, null, null, 5, null)));
    }

    public final M l() {
        return this.f6180f;
    }

    public final void m(Throwable th) {
        Object value;
        Object value2;
        V3.f.b(s.f(th, P3.f.i(((T3.a.C0274a) this.f6177c.e().getValue()).b())));
        if (th instanceof M3.m.C1037b) {
            x xVar = this.f6178d;
            do {
                value2 = xVar.getValue();
            } while (!xVar.b(value2, c.b((c) value2, false, null, new b.C0236b((M3.m.C1037b) th), 3, null)));
        } else {
            x xVar2 = this.f6178d;
            do {
                value = xVar2.getValue();
            } while (!xVar2.b(value, c.b((c) value, false, null, new b.c(th), 3, null)));
        }
    }

    public final void n(KnownHost.Device.Appearance appearance) {
        t.g(appearance, "appearance");
        this.f6177c.h(appearance);
    }

    public final void o(String nuName) {
        Object value;
        t.g(nuName, "nuName");
        this.f6177c.k(new g(nuName));
        b bVarC = ((c) this.f6178d.getValue()).c();
        b.C0236b c0236b = bVarC instanceof b.C0236b ? (b.C0236b) bVarC : null;
        if (c0236b == null || c0236b.a().a() != Messages.Error.b.DeviceNameAlreadyTaken) {
            return;
        }
        x xVar = this.f6178d;
        do {
            value = xVar.getValue();
        } while (!xVar.b(value, c.b((c) value, false, null, null, 3, null)));
    }
}
