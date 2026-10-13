package N4;

/* JADX INFO: renamed from: N4.y5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1357y5 implements p042e5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1357y5 f7389a = new C1357y5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p042e5.d f7390b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p042e5.d f7391c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042e5.d f7392d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p042e5.d f7393e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p042e5.d f7394f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p042e5.d f7395g;

    static {
        e5.d.b bVarA = p042e5.d.a("appName");
        M0 m8 = new M0();
        m8.a(1);
        f7390b = bVarA.b(m8.b()).a();
        e5.d.b bVarA2 = p042e5.d.a("sessionId");
        M0 m9 = new M0();
        m9.a(2);
        f7391c = bVarA2.b(m9.b()).a();
        e5.d.b bVarA3 = p042e5.d.a("startZoomLevel");
        M0 m10 = new M0();
        m10.a(3);
        f7392d = bVarA3.b(m10.b()).a();
        e5.d.b bVarA4 = p042e5.d.a("endZoomLevel");
        M0 m11 = new M0();
        m11.a(4);
        f7393e = bVarA4.b(m11.b()).a();
        e5.d.b bVarA5 = p042e5.d.a("durationMs");
        M0 m12 = new M0();
        m12.a(5);
        f7394f = bVarA5.b(m12.b()).a();
        e5.d.b bVarA6 = p042e5.d.a("predictedArea");
        M0 m13 = new M0();
        m13.a(6);
        f7395g = bVarA6.b(m13.b()).a();
    }

    @Override // p042e5.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        P8 p8 = (P8) obj;
        p042e5.f fVar = (p042e5.f) obj2;
        fVar.b(f7390b, p8.e());
        fVar.b(f7391c, p8.f());
        fVar.b(f7392d, p8.c());
        fVar.b(f7393e, p8.b());
        fVar.b(f7394f, p8.d());
        fVar.b(f7395g, p8.a());
    }
}
