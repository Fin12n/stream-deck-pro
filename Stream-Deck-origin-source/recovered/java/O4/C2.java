package O4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2 implements p042e5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2 f7601a = new C2();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p042e5.d f7602b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p042e5.d f7603c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042e5.d f7604d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p042e5.d f7605e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p042e5.d f7606f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p042e5.d f7607g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p042e5.d f7608h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final p042e5.d f7609i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final p042e5.d f7610j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final p042e5.d f7611k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final p042e5.d f7612l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final p042e5.d f7613m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final p042e5.d f7614n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final p042e5.d f7615o;

    static {
        e5.d.b bVarA = p042e5.d.a("appId");
        C1408f c1408f = new C1408f();
        c1408f.a(1);
        f7602b = bVarA.b(c1408f.b()).a();
        e5.d.b bVarA2 = p042e5.d.a("appVersion");
        C1408f c1408f2 = new C1408f();
        c1408f2.a(2);
        f7603c = bVarA2.b(c1408f2.b()).a();
        e5.d.b bVarA3 = p042e5.d.a("firebaseProjectId");
        C1408f c1408f3 = new C1408f();
        c1408f3.a(3);
        f7604d = bVarA3.b(c1408f3.b()).a();
        e5.d.b bVarA4 = p042e5.d.a("mlSdkVersion");
        C1408f c1408f4 = new C1408f();
        c1408f4.a(4);
        f7605e = bVarA4.b(c1408f4.b()).a();
        e5.d.b bVarA5 = p042e5.d.a("tfliteSchemaVersion");
        C1408f c1408f5 = new C1408f();
        c1408f5.a(5);
        f7606f = bVarA5.b(c1408f5.b()).a();
        e5.d.b bVarA6 = p042e5.d.a("gcmSenderId");
        C1408f c1408f6 = new C1408f();
        c1408f6.a(6);
        f7607g = bVarA6.b(c1408f6.b()).a();
        e5.d.b bVarA7 = p042e5.d.a("apiKey");
        C1408f c1408f7 = new C1408f();
        c1408f7.a(7);
        f7608h = bVarA7.b(c1408f7.b()).a();
        e5.d.b bVarA8 = p042e5.d.a("languages");
        C1408f c1408f8 = new C1408f();
        c1408f8.a(8);
        f7609i = bVarA8.b(c1408f8.b()).a();
        e5.d.b bVarA9 = p042e5.d.a("mlSdkInstanceId");
        C1408f c1408f9 = new C1408f();
        c1408f9.a(9);
        f7610j = bVarA9.b(c1408f9.b()).a();
        e5.d.b bVarA10 = p042e5.d.a("isClearcutClient");
        C1408f c1408f10 = new C1408f();
        c1408f10.a(10);
        f7611k = bVarA10.b(c1408f10.b()).a();
        e5.d.b bVarA11 = p042e5.d.a("isStandaloneMlkit");
        C1408f c1408f11 = new C1408f();
        c1408f11.a(11);
        f7612l = bVarA11.b(c1408f11.b()).a();
        e5.d.b bVarA12 = p042e5.d.a("isJsonLogging");
        C1408f c1408f12 = new C1408f();
        c1408f12.a(12);
        f7613m = bVarA12.b(c1408f12.b()).a();
        e5.d.b bVarA13 = p042e5.d.a("buildLevel");
        C1408f c1408f13 = new C1408f();
        c1408f13.a(13);
        f7614n = bVarA13.b(c1408f13.b()).a();
        e5.d.b bVarA14 = p042e5.d.a("optionalModuleVersion");
        C1408f c1408f14 = new C1408f();
        c1408f14.a(14);
        f7615o = bVarA14.b(c1408f14.b()).a();
    }

    @Override // p042e5.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        N4 n8 = (N4) obj;
        p042e5.f fVar = (p042e5.f) obj2;
        fVar.b(f7602b, n8.g());
        fVar.b(f7603c, n8.h());
        fVar.b(f7604d, null);
        fVar.b(f7605e, n8.j());
        fVar.b(f7606f, n8.k());
        fVar.b(f7607g, null);
        fVar.b(f7608h, null);
        fVar.b(f7609i, n8.a());
        fVar.b(f7610j, n8.i());
        fVar.b(f7611k, n8.b());
        fVar.b(f7612l, n8.d());
        fVar.b(f7613m, n8.c());
        fVar.b(f7614n, n8.e());
        fVar.b(f7615o, n8.f());
    }
}
