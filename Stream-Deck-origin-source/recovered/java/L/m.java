package L;

import H.B;
import H.G;
import H.I;
import android.util.Range;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface m {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final b f4780a = b.f4782a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final m f4781b = new a();

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a implements m {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // L.m
        public l a(int i8, I cameraInfoInternal, List newUseCases, List attachedUseCases, B cameraConfig, int i9, Range targetFrameRate, boolean z8, boolean z9) {
            t.g(cameraInfoInternal, "cameraInfoInternal");
            t.g(newUseCases, "newUseCases");
            t.g(attachedUseCases, "attachedUseCases");
            t.g(cameraConfig, "cameraConfig");
            t.g(targetFrameRate, "targetFrameRate");
            return new l(null, 0, 3, 0 == true ? 1 : 0);
        }
    }

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ b f4782a = new b();
    }

    l a(int i8, I i9, List list, List list2, B b8, int i10, Range range, boolean z8, boolean z9);

    default void b(G cameraDeviceSurfaceManager) {
        t.g(cameraDeviceSurfaceManager, "cameraDeviceSurfaceManager");
    }
}
