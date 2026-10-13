package N4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class W3 implements p042e5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final W3 f6612a = new W3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p042e5.d f6613b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p042e5.d f6614c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042e5.d f6615d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p042e5.d f6616e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p042e5.d f6617f;

    static {
        e5.d.b bVarA = p042e5.d.a("inferenceCommonLogEvent");
        M0 m8 = new M0();
        m8.a(1);
        f6613b = bVarA.b(m8.b()).a();
        e5.d.b bVarA2 = p042e5.d.a("options");
        M0 m9 = new M0();
        m9.a(2);
        f6614c = bVarA2.b(m9.b()).a();
        e5.d.b bVarA3 = p042e5.d.a("detectedBarcodeFormats");
        M0 m10 = new M0();
        m10.a(3);
        f6615d = bVarA3.b(m10.b()).a();
        e5.d.b bVarA4 = p042e5.d.a("detectedBarcodeValueTypes");
        M0 m11 = new M0();
        m11.a(4);
        f6616e = bVarA4.b(m11.b()).a();
        e5.d.b bVarA5 = p042e5.d.a("imageInfo");
        M0 m12 = new M0();
        m12.a(5);
        f6617f = bVarA5.b(m12.b()).a();
    }

    @Override // p042e5.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1250o7 c1250o7 = (C1250o7) obj;
        p042e5.f fVar = (p042e5.f) obj2;
        fVar.b(f6613b, c1250o7.d());
        fVar.b(f6614c, c1250o7.e());
        fVar.b(f6615d, c1250o7.a());
        fVar.b(f6616e, c1250o7.b());
        fVar.b(f6617f, c1250o7.c());
    }
}
