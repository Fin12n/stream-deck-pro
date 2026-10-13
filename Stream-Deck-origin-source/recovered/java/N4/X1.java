package N4;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class X1 implements p042e5.e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final X1 f6624a = new X1();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final p042e5.d f6625b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final p042e5.d f6626c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final p042e5.d f6627d;

    static {
        e5.d.b bVarA = p042e5.d.a("logEventKey");
        M0 m8 = new M0();
        m8.a(1);
        f6625b = bVarA.b(m8.b()).a();
        e5.d.b bVarA2 = p042e5.d.a("eventCount");
        M0 m9 = new M0();
        m9.a(2);
        f6626c = bVarA2.b(m9.b()).a();
        e5.d.b bVarA3 = p042e5.d.a("inferenceDurationStats");
        M0 m10 = new M0();
        m10.a(3);
        f6627d = bVarA3.b(m10.b()).a();
    }

    @Override // p042e5.b
    public final /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
        C1160h1 c1160h1 = (C1160h1) obj;
        p042e5.f fVar = (p042e5.f) obj2;
        fVar.b(f6625b, c1160h1.a());
        fVar.b(f6626c, c1160h1.c());
        fVar.b(f6627d, c1160h1.b());
    }
}
