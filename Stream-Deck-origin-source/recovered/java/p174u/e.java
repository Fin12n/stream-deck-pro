package p174u;

import android.hardware.camera2.CameraAccessException;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e extends Exception {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final Set f34313c = Collections.unmodifiableSet(new HashSet(Arrays.asList(4, 5, 1, 2, 3)));

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final Set f34314d = Collections.unmodifiableSet(new HashSet(Arrays.asList(10001, 10002)));

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final int f34315a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final CameraAccessException f34316b;

    public e(int i8) {
        super(b(i8));
        this.f34315a = i8;
        this.f34316b = f34313c.contains(Integer.valueOf(i8)) ? new CameraAccessException(i8) : null;
    }

    public static String a(int i8, String str) {
        return String.format("%s (%d): %s", c(i8), Integer.valueOf(i8), str);
    }

    public static String b(int i8) {
        if (i8 == 1) {
            return "The camera is disabled due to a device policy, and cannot be opened.";
        }
        if (i8 == 2) {
            return "The camera device is removable and has been disconnected from the Android device, or the camera service has shut down the connection due to a higher-priority access request for the camera device.";
        }
        if (i8 == 3) {
            return "The camera device is currently in the error state; no further calls to it will succeed.";
        }
        if (i8 == 4) {
            return "The camera device is in use already";
        }
        if (i8 == 5) {
            return "The system-wide limit for number of open cameras has been reached, and more camera devices cannot be opened until previous instances are closed.";
        }
        if (i8 == 10001) {
            return "Some API 28 devices cannot access the camera when the device is in \"Do Not Disturb\" mode. The camera will not be accessible until \"Do Not Disturb\" mode is disabled.";
        }
        if (i8 != 10002) {
            return null;
        }
        return "Failed to create CameraCharacteristics.";
    }

    public static String c(int i8) {
        if (i8 == 1) {
            return "CAMERA_DISABLED";
        }
        if (i8 == 2) {
            return "CAMERA_DISCONNECTED";
        }
        if (i8 == 3) {
            return "CAMERA_ERROR";
        }
        if (i8 == 4) {
            return "CAMERA_IN_USE";
        }
        if (i8 == 5) {
            return "MAX_CAMERAS_IN_USE";
        }
        if (i8 == 1000) {
            return "CAMERA_DEPRECATED_HAL";
        }
        if (i8 != 10001) {
            return i8 != 10002 ? "<UNKNOWN ERROR>" : "CAMERA_CHARACTERISTICS_CREATION_ERROR";
        }
        return "CAMERA_UNAVAILABLE_DO_NOT_DISTURB";
    }

    public static e e(CameraAccessException cameraAccessException) {
        if (cameraAccessException != null) {
            return new e(cameraAccessException);
        }
        throw new NullPointerException("cameraAccessException should not be null");
    }

    public final int d() {
        return this.f34315a;
    }

    public e(int i8, String str) {
        super(a(i8, str));
        this.f34315a = i8;
        this.f34316b = f34313c.contains(Integer.valueOf(i8)) ? new CameraAccessException(i8, str) : null;
    }

    public e(int i8, String str, Throwable th) {
        super(a(i8, str), th);
        this.f34315a = i8;
        this.f34316b = f34313c.contains(Integer.valueOf(i8)) ? new CameraAccessException(i8, str, th) : null;
    }

    public e(int i8, Throwable th) {
        super(b(i8), th);
        this.f34315a = i8;
        this.f34316b = f34313c.contains(Integer.valueOf(i8)) ? new CameraAccessException(i8, null, th) : null;
    }

    public e(CameraAccessException cameraAccessException) {
        super(cameraAccessException.getMessage(), cameraAccessException.getCause());
        this.f34315a = cameraAccessException.getReason();
        this.f34316b = cameraAccessException;
    }
}
