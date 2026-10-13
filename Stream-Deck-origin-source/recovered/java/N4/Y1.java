package N4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class Y1 implements p042e5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Y1 f6639a = new Y1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p042e5.d f6640b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p042e5.d f6641c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042e5.d f6642d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final p042e5.d f6643e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final p042e5.d f6644f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final p042e5.d f6645g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final p042e5.d f6646h;

    static {
        e5.d.b bVarA = p042e5.d.a("errorCode");
        M0 m8 = new M0();
        m8.a(1);
        f6640b = bVarA.b(m8.b()).a();
        e5.d.b bVarA2 = p042e5.d.a("hasResult");
        M0 m9 = new M0();
        m9.a(2);
        f6641c = bVarA2.b(m9.b()).a();
        e5.d.b bVarA3 = p042e5.d.a("isColdCall");
        M0 m10 = new M0();
        m10.a(3);
        f6642d = bVarA3.b(m10.b()).a();
        e5.d.b bVarA4 = p042e5.d.a("imageInfo");
        M0 m11 = new M0();
        m11.a(4);
        f6643e = bVarA4.b(m11.b()).a();
        e5.d.b bVarA5 = p042e5.d.a("options");
        M0 m12 = new M0();
        m12.a(5);
        f6644f = bVarA5.b(m12.b()).a();
        e5.d.b bVarA6 = p042e5.d.a("detectedBarcodeFormats");
        M0 m13 = new M0();
        m13.a(6);
        f6645g = bVarA6.b(m13.b()).a();
        e5.d.b bVarA7 = p042e5.d.a("detectedBarcodeValueTypes");
        M0 m14 = new M0();
        m14.a(7);
        f6646h = bVarA7.b(m14.b()).a();
    }

    @Override // p042e5.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1136f1 c1136f1 = (C1136f1) obj;
        p042e5.f fVar = (p042e5.f) obj2;
        fVar.b(f6640b, c1136f1.c());
        fVar.b(f6641c, null);
        fVar.b(f6642d, c1136f1.e());
        fVar.b(f6643e, null);
        fVar.b(f6644f, c1136f1.d());
        fVar.b(f6645g, c1136f1.a());
        fVar.b(f6646h, c1136f1.b());
    }
}
