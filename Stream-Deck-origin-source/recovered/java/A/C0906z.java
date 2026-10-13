package A;

import H.C0973d;
import H.v1;

/* JADX INFO: renamed from: A.z, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0906z implements InterfaceC0905y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final H.Y f341a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final B.a f342b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final v1 f343c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final L.m f344d;

    public C0906z(H.Y cameraRepository, B.a cameraCoordinator, v1 useCaseConfigFactory, L.m streamSpecsCalculator) {
        kotlin.jvm.internal.t.g(cameraRepository, "cameraRepository");
        kotlin.jvm.internal.t.g(cameraCoordinator, "cameraCoordinator");
        kotlin.jvm.internal.t.g(useCaseConfigFactory, "useCaseConfigFactory");
        kotlin.jvm.internal.t.g(streamSpecsCalculator, "streamSpecsCalculator");
        this.f341a = cameraRepository;
        this.f342b = cameraCoordinator;
        this.f343c = useCaseConfigFactory;
        this.f344d = streamSpecsCalculator;
    }

    public static /* synthetic */ L.f d(C0906z c0906z, H.J j8, H.J j9, C0973d c0973d, C0973d c0973d2, I i8, I i9, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j9 = null;
        }
        if ((i10 & 8) != 0) {
            c0973d2 = null;
        }
        if ((i10 & 16) != 0) {
            i8 = I.f78d;
        }
        if ((i10 & 32) != 0) {
            i9 = I.f78d;
        }
        return c0906z.c(j8, j9, c0973d, c0973d2, i8, i9);
    }

    @Override // A.InterfaceC0905y
    public L.f a(H.J camera, H.J j8, C0973d adapterCameraInfo, C0973d c0973d, I compositionSettings, I secondaryCompositionSettings) {
        kotlin.jvm.internal.t.g(camera, "camera");
        kotlin.jvm.internal.t.g(adapterCameraInfo, "adapterCameraInfo");
        kotlin.jvm.internal.t.g(compositionSettings, "compositionSettings");
        kotlin.jvm.internal.t.g(secondaryCompositionSettings, "secondaryCompositionSettings");
        return c(camera, j8, adapterCameraInfo, c0973d, compositionSettings, secondaryCompositionSettings);
    }

    @Override // A.InterfaceC0905y
    public L.f b(String cameraId) {
        kotlin.jvm.internal.t.g(cameraId, "cameraId");
        H.J jL = this.f341a.l(cameraId);
        kotlin.jvm.internal.t.f(jL, "getCamera(...)");
        return d(this, jL, null, new C0973d(jL.r(), H.E.a()), null, null, null, 58, null);
    }

    public final L.f c(H.J j8, H.J j9, C0973d c0973d, C0973d c0973d2, I i8, I i9) {
        return new L.f(j8, j9, c0973d, c0973d2, i8, i9, this.f342b, this.f344d, this.f343c);
    }
}
