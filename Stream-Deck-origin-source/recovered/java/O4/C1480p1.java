package O4;

/* JADX INFO: renamed from: O4.p1, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1480p1 implements p042e5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1480p1 f8391a = new C1480p1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p042e5.d f8392b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p042e5.d f8393c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042e5.d f8394d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p042e5.d f8395e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p042e5.d f8396f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p042e5.d f8397g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p042e5.d f8398h;

    static {
        e5.d.b bVarA = p042e5.d.a("durationMs");
        C1408f c1408f = new C1408f();
        c1408f.a(1);
        f8392b = bVarA.b(c1408f.b()).a();
        e5.d.b bVarA2 = p042e5.d.a("imageSource");
        C1408f c1408f2 = new C1408f();
        c1408f2.a(2);
        f8393c = bVarA2.b(c1408f2.b()).a();
        e5.d.b bVarA3 = p042e5.d.a("imageFormat");
        C1408f c1408f3 = new C1408f();
        c1408f3.a(3);
        f8394d = bVarA3.b(c1408f3.b()).a();
        e5.d.b bVarA4 = p042e5.d.a("imageByteSize");
        C1408f c1408f4 = new C1408f();
        c1408f4.a(4);
        f8395e = bVarA4.b(c1408f4.b()).a();
        e5.d.b bVarA5 = p042e5.d.a("imageWidth");
        C1408f c1408f5 = new C1408f();
        c1408f5.a(5);
        f8396f = bVarA5.b(c1408f5.b()).a();
        e5.d.b bVarA6 = p042e5.d.a("imageHeight");
        C1408f c1408f6 = new C1408f();
        c1408f6.a(6);
        f8397g = bVarA6.b(c1408f6.b()).a();
        e5.d.b bVarA7 = p042e5.d.a("rotationDegrees");
        C1408f c1408f7 = new C1408f();
        c1408f7.a(7);
        f8398h = bVarA7.b(c1408f7.b()).a();
    }

    @Override // p042e5.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        A3 a8 = (A3) obj;
        p042e5.f fVar = (p042e5.f) obj2;
        fVar.b(f8392b, a8.g());
        fVar.b(f8393c, a8.b());
        fVar.b(f8394d, a8.a());
        fVar.b(f8395e, a8.c());
        fVar.b(f8396f, a8.e());
        fVar.b(f8397g, a8.d());
        fVar.b(f8398h, a8.f());
    }
}
