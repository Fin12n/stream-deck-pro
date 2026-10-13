package H;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface B extends a1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final InterfaceC0984i0.a f2825a = InterfaceC0984i0.a.a("camerax.core.camera.useCaseConfigFactory", v1.class);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final InterfaceC0984i0.a f2826b = InterfaceC0984i0.a.a("camerax.core.camera.compatibilityId", AbstractC1009v0.class);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final InterfaceC0984i0.a f2827c = InterfaceC0984i0.a.a("camerax.core.camera.useCaseCombinationRequiredRule", Integer.class);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final InterfaceC0984i0.a f2828d = InterfaceC0984i0.a.a("camerax.core.camera.SessionProcessor", e1.class);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final InterfaceC0984i0.a f2829e = InterfaceC0984i0.a.a("camerax.core.camera.isZslDisabled", Boolean.class);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final InterfaceC0984i0.a f2830f = InterfaceC0984i0.a.a("camerax.core.camera.isPostviewSupported", Boolean.class);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final InterfaceC0984i0.a f2831g = InterfaceC0984i0.a.a("camerax.core.camera.PostviewFormatSelector", a.class);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final InterfaceC0984i0.a f2832h = InterfaceC0984i0.a.a("camerax.core.camera.isCaptureProcessProgressSupported", Boolean.class);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final a f2833i = new a() { // from class: H.A
    };

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
    }

    default boolean C() {
        return ((Boolean) f(f2830f, Boolean.FALSE)).booleanValue();
    }

    default int I() {
        return ((Integer) f(f2827c, 0)).intValue();
    }

    default e1 M(e1 e1Var) {
        p063h.s.a(f(f2828d, e1Var));
        return null;
    }

    AbstractC1009v0 Y();

    default boolean Z() {
        return ((Boolean) f(f2832h, Boolean.FALSE)).booleanValue();
    }

    default v1 j() {
        return (v1) f(f2825a, v1.f3243a);
    }
}
