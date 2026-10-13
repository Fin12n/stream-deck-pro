package B3;

import C6.G;
import C6.m;
import C6.r;
import I6.l;
import M3.p;
import Q6.o;
import Q6.q;
import android.os.Build;
import com.elgato.streamdeck.vsd2.AppMetrics;
import com.elgato.streamdeck.vsd2.AppSettings;
import com.elgato.streamdeck.vsd2.AppSettingsStore;
import com.elgato.streamdeck.vsd2.KnownHost;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import kotlin.jvm.internal.u;
import p017b7.AbstractC1789i;
import p017b7.InterfaceC1815v0;
import p017b7.J;
import p044e7.AbstractC2262h;
import p044e7.H;
import p044e7.InterfaceC2260f;
import p044e7.InterfaceC2261g;
import p044e7.M;
import p215z0.InterfaceC3164l0;
import p215z0.l1;
import p215z0.q1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class i {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f1143i = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final AppSettingsStore f1144a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final p f1145b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final T3.a f1146c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final J f1147d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final String f1148e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final InterfaceC3164l0 f1149f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final q1 f1150g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final M f1151h;

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
        DEFAULT,
        ACTIVE,
        INACTIVE;


        /* JADX INFO: renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ J6.a f1157f = J6.b.a(a());

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f1152a = new a(null);

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a {
            public /* synthetic */ a(AbstractC2633k abstractC2633k) {
                this();
            }

            public final b a(Boolean bool) {
                if (t.c(bool, Boolean.TRUE)) {
                    return b.ACTIVE;
                }
                if (t.c(bool, Boolean.FALSE)) {
                    return b.INACTIVE;
                }
                if (bool == null) {
                    return b.DEFAULT;
                }
                throw new m();
            }

            public a() {
            }
        }

        /* JADX INFO: renamed from: B3.i$b$b, reason: collision with other inner class name */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public /* synthetic */ class C0043b {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f1158a;

            static {
                int[] iArr = new int[b.values().length];
                try {
                    iArr[b.DEFAULT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[b.ACTIVE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[b.INACTIVE.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f1158a = iArr;
            }
        }

        public final Boolean b() {
            int i8 = C0043b.f1158a[ordinal()];
            if (i8 == 1) {
                return null;
            }
            if (i8 == 2) {
                return Boolean.TRUE;
            }
            if (i8 == 3) {
                return Boolean.FALSE;
            }
            throw new m();
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final T3.a.C0274a f1159a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public final boolean f1160b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final b f1161c;

        public c() {
            this(null, false, null, 7, null);
        }

        public final int a() {
            return 117;
        }

        public final String b() {
            return "2.1.2";
        }

        public final T3.a.C0274a c() {
            return this.f1159a;
        }

        public final String d() {
            return Build.MODEL + ", Android " + Build.VERSION.RELEASE + " (API " + Build.VERSION.SDK_INT + ")";
        }

        public final boolean e() {
            return this.f1160b;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return t.c(this.f1159a, cVar.f1159a) && this.f1160b == cVar.f1160b && this.f1161c == cVar.f1161c;
        }

        public int hashCode() {
            T3.a.C0274a c0274a = this.f1159a;
            return ((((c0274a == null ? 0 : c0274a.hashCode()) * 31) + Boolean.hashCode(this.f1160b)) * 31) + this.f1161c.hashCode();
        }

        public String toString() {
            return "ViewState(deviceEditorState=" + this.f1159a + ", isProUser=" + this.f1160b + ", forcedProUser=" + this.f1161c + ")";
        }

        public c(T3.a.C0274a c0274a, boolean z8, b forcedProUser) {
            t.g(forcedProUser, "forcedProUser");
            this.f1159a = c0274a;
            this.f1160b = z8;
            this.f1161c = forcedProUser;
        }

        public /* synthetic */ c(T3.a.C0274a c0274a, boolean z8, b bVar, int i8, AbstractC2633k abstractC2633k) {
            this((i8 & 1) != 0 ? null : c0274a, (i8 & 2) != 0 ? false : z8, (i8 & 4) != 0 ? b.DEFAULT : bVar);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class d extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1162a;

        public d(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return i.this.new d(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((d) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x004b, code lost:
        
            if (r5 == r0) goto L19;
         */
        @Override // I6.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f1162a;
            if (i8 == 0) {
                r.b(obj);
                AppSettingsStore appSettingsStore = i.this.f1144a;
                this.f1162a = 1;
                obj = appSettingsStore.get(this);
                if (obj != objF) {
                }
                return objF;
            }
            if (i8 == 1) {
                r.b(obj);
            } else {
                if (i8 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                r.b(obj);
            }
            KnownHost.Device device = (KnownHost.Device) obj;
            if (device == null) {
                return G.f1419a;
            }
            V3.f.b(B3.j.a(i.f1143i, P3.f.j(device), P3.f.h(device)));
            return G.f1419a;
            String strB = P3.a.b((AppSettings) obj);
            if (strB == null) {
                return G.f1419a;
            }
            InterfaceC2260f interfaceC2260fM101getDeviceByIDqOAwsH0 = i.this.f1144a.m101getDeviceByIDqOAwsH0(strB);
            this.f1162a = 2;
            obj = AbstractC2262h.x(interfaceC2260fM101getDeviceByIDqOAwsH0, this);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class e extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1164a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public final /* synthetic */ b f1166c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(b bVar, G6.d dVar) {
            super(2, dVar);
            this.f1166c = bVar;
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return i.this.new e(this.f1166c, dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((e) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f1164a;
            if (i8 == 0) {
                r.b(obj);
                AppSettingsStore appSettingsStore = i.this.f1144a;
                Boolean boolB = this.f1166c.b();
                this.f1164a = 1;
                if (appSettingsStore.updateIsForcedProUser(boolB, this) == objF) {
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
    public static final class f extends l implements o {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1167a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a extends u implements Q6.k {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final a f1169a = new a();

            public a() {
                super(1);
            }

            @Override // Q6.k
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AppMetrics.Builder invoke(AppMetrics.Builder it) {
                t.g(it, "it");
                AppMetrics.Builder lastSeenOnboardingVersion = it.setLastSeenOnboardingVersion("2.1.2");
                t.f(lastSeenOnboardingVersion, "setLastSeenOnboardingVersion(...)");
                return lastSeenOnboardingVersion;
            }
        }

        public f(G6.d dVar) {
            super(2, dVar);
        }

        @Override // I6.a
        public final G6.d create(Object obj, G6.d dVar) {
            return i.this.new f(dVar);
        }

        @Override // Q6.o
        /* JADX INFO: renamed from: g, reason: merged with bridge method [inline-methods] */
        public final Object invoke(J j8, G6.d dVar) {
            return ((f) create(j8, dVar)).invokeSuspend(G.f1419a);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            Object objF = H6.c.f();
            int i8 = this.f1167a;
            if (i8 == 0) {
                r.b(obj);
                AppSettingsStore appSettingsStore = i.this.f1144a;
                a aVar = a.f1169a;
                this.f1167a = 1;
                if (appSettingsStore.updateAppMetrics(aVar, this) == objF) {
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
    public static final class g implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f1170a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f1171a;

            /* JADX INFO: renamed from: B3.i$g$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0044a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f1172a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f1173b;

                public C0044a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f1172a = obj;
                    this.f1173b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f1171a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0044a c0044a;
                if (dVar instanceof C0044a) {
                    c0044a = (C0044a) dVar;
                    int i8 = c0044a.f1173b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0044a.f1173b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0044a = new C0044a(dVar);
                    }
                } else {
                    c0044a = new C0044a(dVar);
                }
                Object obj2 = c0044a.f1172a;
                Object objF = H6.c.f();
                int i9 = c0044a.f1173b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f1171a;
                    T3.a.C0274a c0274a = (T3.a.C0274a) obj;
                    if (P3.f.l(c0274a.a())) {
                        c0274a = null;
                    }
                    c0044a.f1173b = 1;
                    if (interfaceC2261g.emit(c0274a, c0044a) == objF) {
                        return objF;
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

        public g(InterfaceC2260f interfaceC2260f) {
            this.f1170a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f1170a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class h implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f1175a;

        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f1176a;

            /* JADX INFO: renamed from: B3.i$h$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0045a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f1177a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f1178b;

                public C0045a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f1177a = obj;
                    this.f1178b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f1176a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0045a c0045a;
                if (dVar instanceof C0045a) {
                    c0045a = (C0045a) dVar;
                    int i8 = c0045a.f1178b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0045a.f1178b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0045a = new C0045a(dVar);
                    }
                } else {
                    c0045a = new C0045a(dVar);
                }
                Object obj2 = c0045a.f1177a;
                Object objF = H6.c.f();
                int i9 = c0045a.f1178b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f1176a;
                    AppSettings appSettings = (AppSettings) obj;
                    Boolean boolA = appSettings.hasIsForcedProUser() ? I6.b.a(appSettings.getIsForcedProUser()) : null;
                    c0045a.f1178b = 1;
                    if (interfaceC2261g.emit(boolA, c0045a) == objF) {
                        return objF;
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

        public h(InterfaceC2260f interfaceC2260f) {
            this.f1175a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f1175a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: renamed from: B3.i$i, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class C0046i implements InterfaceC2260f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final /* synthetic */ InterfaceC2260f f1180a;

        /* JADX INFO: renamed from: B3.i$i$a */
        /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
        public static final class a implements InterfaceC2261g {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public final /* synthetic */ InterfaceC2261g f1181a;

            /* JADX INFO: renamed from: B3.i$i$a$a, reason: collision with other inner class name */
            /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
            public static final class C0047a extends I6.d {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                public /* synthetic */ Object f1182a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                public int f1183b;

                public C0047a(G6.d dVar) {
                    super(dVar);
                }

                @Override // I6.a
                public final Object invokeSuspend(Object obj) {
                    this.f1182a = obj;
                    this.f1183b |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC2261g interfaceC2261g) {
                this.f1181a = interfaceC2261g;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // p044e7.InterfaceC2261g
            public final Object emit(Object obj, G6.d dVar) {
                C0047a c0047a;
                if (dVar instanceof C0047a) {
                    c0047a = (C0047a) dVar;
                    int i8 = c0047a.f1183b;
                    if ((i8 & Integer.MIN_VALUE) != 0) {
                        c0047a.f1183b = i8 - Integer.MIN_VALUE;
                    } else {
                        c0047a = new C0047a(dVar);
                    }
                } else {
                    c0047a = new C0047a(dVar);
                }
                Object obj2 = c0047a.f1182a;
                Object objF = H6.c.f();
                int i9 = c0047a.f1183b;
                if (i9 == 0) {
                    r.b(obj2);
                    InterfaceC2261g interfaceC2261g = this.f1181a;
                    b bVarA = b.f1152a.a((Boolean) obj);
                    c0047a.f1183b = 1;
                    if (interfaceC2261g.emit(bVarA, c0047a) == objF) {
                        return objF;
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

        public C0046i(InterfaceC2260f interfaceC2260f) {
            this.f1180a = interfaceC2260f;
        }

        @Override // p044e7.InterfaceC2260f
        public Object collect(InterfaceC2261g interfaceC2261g, G6.d dVar) {
            Object objCollect = this.f1180a.collect(new a(interfaceC2261g), dVar);
            return objCollect == H6.c.f() ? objCollect : G.f1419a;
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class j extends l implements q {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f1185a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public /* synthetic */ Object f1186b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public /* synthetic */ boolean f1187c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public /* synthetic */ Object f1188d;

        public j(G6.d dVar) {
            super(4, dVar);
        }

        public final Object g(T3.a.C0274a c0274a, boolean z8, b bVar, G6.d dVar) {
            j jVar = new j(dVar);
            jVar.f1186b = c0274a;
            jVar.f1187c = z8;
            jVar.f1188d = bVar;
            return jVar.invokeSuspend(G.f1419a);
        }

        @Override // Q6.q
        public /* bridge */ /* synthetic */ Object i(Object obj, Object obj2, Object obj3, Object obj4) {
            return g((T3.a.C0274a) obj, ((Boolean) obj2).booleanValue(), (b) obj3, (G6.d) obj4);
        }

        @Override // I6.a
        public final Object invokeSuspend(Object obj) {
            H6.c.f();
            if (this.f1185a != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            r.b(obj);
            return new c((T3.a.C0274a) this.f1186b, this.f1187c, (b) this.f1188d);
        }
    }

    public i(AppSettingsStore appSettingsStore, p connectionHolder, A3.p purchaseViewModel, T3.a deviceSettingsEditor, J coroutineScope) {
        t.g(appSettingsStore, "appSettingsStore");
        t.g(connectionHolder, "connectionHolder");
        t.g(purchaseViewModel, "purchaseViewModel");
        t.g(deviceSettingsEditor, "deviceSettingsEditor");
        t.g(coroutineScope, "coroutineScope");
        this.f1144a = appSettingsStore;
        this.f1145b = connectionHolder;
        this.f1146c = deviceSettingsEditor;
        this.f1147d = coroutineScope;
        this.f1148e = purchaseViewModel.g();
        InterfaceC3164l0 interfaceC3164l0E = l1.e(Boolean.FALSE, null, 2, null);
        this.f1149f = interfaceC3164l0E;
        this.f1150g = interfaceC3164l0E;
        this.f1151h = AbstractC2262h.T(AbstractC2262h.l(new g(deviceSettingsEditor.e()), purchaseViewModel.k(), new C0046i(AbstractC2262h.p(new h(appSettingsStore.getData()))), new j(null)), coroutineScope, H.a.b(H.f20929a, 1000L, 0L, 2, null), new c(null, false, null, 7, null));
    }

    public final void b() {
        AbstractC1789i.d(this.f1147d, null, null, new d(null), 3, null);
        e();
        this.f1145b.c();
    }

    public final String c() {
        return this.f1148e;
    }

    public final M d() {
        return this.f1151h;
    }

    public final void e() {
        this.f1149f.setValue(Boolean.FALSE);
    }

    public final q1 f() {
        return this.f1150g;
    }

    public final void g(KnownHost.Device.Appearance appearance) {
        t.g(appearance, "appearance");
        V3.f.a(B3.j.b(defpackage.a.d(appearance), P3.f.h(((T3.a.C0274a) this.f1146c.e().getValue()).a()), P3.f.j(((T3.a.C0274a) this.f1146c.e().getValue()).a())));
        this.f1146c.h(appearance);
    }

    public final void h(b selection) {
        t.g(selection, "selection");
        AbstractC1789i.d(this.f1147d, null, null, new e(selection, null), 3, null);
    }

    public final InterfaceC1815v0 i() {
        return AbstractC1789i.d(this.f1147d, null, null, new f(null), 3, null);
    }

    public final void j() {
        this.f1149f.setValue(Boolean.TRUE);
    }
}
