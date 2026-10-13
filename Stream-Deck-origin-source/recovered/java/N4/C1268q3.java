package N4;

/* JADX INFO: renamed from: N4.q3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1268q3 implements p042e5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1268q3 f7270a = new C1268q3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p042e5.d f7271b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p042e5.d f7272c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042e5.d f7273d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p042e5.d f7274e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p042e5.d f7275f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p042e5.d f7276g;

    static {
        e5.d.b bVarA = p042e5.d.a("maxMs");
        M0 m8 = new M0();
        m8.a(1);
        f7271b = bVarA.b(m8.b()).a();
        e5.d.b bVarA2 = p042e5.d.a("minMs");
        M0 m9 = new M0();
        m9.a(2);
        f7272c = bVarA2.b(m9.b()).a();
        e5.d.b bVarA3 = p042e5.d.a("avgMs");
        M0 m10 = new M0();
        m10.a(3);
        f7273d = bVarA3.b(m10.b()).a();
        e5.d.b bVarA4 = p042e5.d.a("firstQuartileMs");
        M0 m11 = new M0();
        m11.a(4);
        f7274e = bVarA4.b(m11.b()).a();
        e5.d.b bVarA5 = p042e5.d.a("medianMs");
        M0 m12 = new M0();
        m12.a(5);
        f7275f = bVarA5.b(m12.b()).a();
        e5.d.b bVarA6 = p042e5.d.a("thirdQuartileMs");
        M0 m13 = new M0();
        m13.a(6);
        f7276g = bVarA6.b(m13.b()).a();
    }

    @Override // p042e5.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1369z6 c1369z6 = (C1369z6) obj;
        p042e5.f fVar = (p042e5.f) obj2;
        fVar.b(f7271b, c1369z6.c());
        fVar.b(f7272c, c1369z6.e());
        fVar.b(f7273d, c1369z6.a());
        fVar.b(f7274e, c1369z6.b());
        fVar.b(f7275f, c1369z6.d());
        fVar.b(f7276g, c1369z6.f());
    }
}
