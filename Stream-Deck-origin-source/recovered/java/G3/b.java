package G3;

import com.elgato.streamdeck.vsd2.PermissionRepository;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class b {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f2717a;

        static {
            int[] iArr = new int[PermissionRepository.Permission.values().length];
            try {
                iArr[PermissionRepository.Permission.CAMERA.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PermissionRepository.Permission.LOCATION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f2717a = iArr;
        }
    }

    public static final String a(PermissionRepository.Permission permission) {
        t.g(permission, "<this>");
        int i8 = a.f2717a[permission.ordinal()];
        if (i8 == 1) {
            return "android.permission.CAMERA";
        }
        if (i8 == 2) {
            return "android.permission.ACCESS_FINE_LOCATION";
        }
        throw new C6.m();
    }
}
