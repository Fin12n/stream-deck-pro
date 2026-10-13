package N4;

/* JADX INFO: renamed from: N4.w3, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C1333w3 implements p042e5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C1333w3 f7362a = new C1333w3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p042e5.d f7363b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p042e5.d f7364c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042e5.d f7365d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p042e5.d f7366e;

    static {
        e5.d.b bVarA = p042e5.d.a("imageFormat");
        M0 m8 = new M0();
        m8.a(1);
        f7363b = bVarA.b(m8.b()).a();
        e5.d.b bVarA2 = p042e5.d.a("originalImageSize");
        M0 m9 = new M0();
        m9.a(2);
        f7364c = bVarA2.b(m9.b()).a();
        e5.d.b bVarA3 = p042e5.d.a("compressedImageSize");
        M0 m10 = new M0();
        m10.a(3);
        f7365d = bVarA3.b(m10.b()).a();
        e5.d.b bVarA4 = p042e5.d.a("isOdmlImage");
        M0 m11 = new M0();
        m11.a(4);
        f7366e = bVarA4.b(m11.b()).a();
    }

    @Override // p042e5.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        G6 g8 = (G6) obj;
        p042e5.f fVar = (p042e5.f) obj2;
        fVar.b(f7363b, g8.a());
        fVar.b(f7364c, g8.b());
        fVar.b(f7365d, null);
        fVar.b(f7366e, null);
    }
}
