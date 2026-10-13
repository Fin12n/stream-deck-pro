package N4;

/* JADX INFO: renamed from: N4.z5, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1368z5 implements p042e5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1368z5 f7403a = new C1368z5();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p042e5.d f7404b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p042e5.d f7405c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042e5.d f7406d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p042e5.d f7407e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p042e5.d f7408f;

    static {
        e5.d.b bVarA = p042e5.d.a("xMin");
        M0 m8 = new M0();
        m8.a(1);
        f7404b = bVarA.b(m8.b()).a();
        e5.d.b bVarA2 = p042e5.d.a("yMin");
        M0 m9 = new M0();
        m9.a(2);
        f7405c = bVarA2.b(m9.b()).a();
        e5.d.b bVarA3 = p042e5.d.a("xMax");
        M0 m10 = new M0();
        m10.a(3);
        f7406d = bVarA3.b(m10.b()).a();
        e5.d.b bVarA4 = p042e5.d.a("yMax");
        M0 m11 = new M0();
        m11.a(4);
        f7407e = bVarA4.b(m11.b()).a();
        e5.d.b bVarA5 = p042e5.d.a("confidenceScore");
        M0 m12 = new M0();
        m12.a(5);
        f7408f = bVarA5.b(m12.b()).a();
    }

    @Override // p042e5.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        O8 o8 = (O8) obj;
        p042e5.f fVar = (p042e5.f) obj2;
        fVar.b(f7404b, o8.c());
        fVar.b(f7405c, o8.e());
        fVar.b(f7406d, o8.b());
        fVar.b(f7407e, o8.d());
        fVar.b(f7408f, o8.a());
    }
}
