package p174u;

import android.content.Context;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class u extends x {
    public u(Context context) {
        super(context, null);
    }

    public static u i(Context context) {
        return new u(context);
    }

    public static boolean k(Throwable th) {
        StackTraceElement[] stackTrace;
        if (!th.getClass().equals(RuntimeException.class) || (stackTrace = th.getStackTrace()) == null || stackTrace.length < 0) {
            return false;
        }
        return "_enableShutterSound".equals(stackTrace[0].getMethodName());
    }

    @Override // u.t.a
    public void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f34330a.registerAvailabilityCallback(executor, availabilityCallback);
    }

    @Override // u.t.a
    public void c(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f34330a.unregisterAvailabilityCallback(availabilityCallback);
    }

    @Override // p174u.x, u.t.a
    public CameraCharacteristics d(String str) throws e {
        try {
            return super.d(str);
        } catch (RuntimeException e8) {
            if (j(e8)) {
                l(e8);
            }
            throw e8;
        }
    }

    @Override // u.t.a
    public void g(String str, Executor executor, CameraDevice.StateCallback stateCallback) throws e {
        try {
            this.f34330a.openCamera(str, executor, stateCallback);
        } catch (CameraAccessException e8) {
            throw e.e(e8);
        } catch (IllegalArgumentException e9) {
        } catch (SecurityException e10) {
            throw e10;
        } catch (RuntimeException e11) {
            if (j(e11)) {
                l(e11);
            }
            throw e11;
        }
    }

    public final boolean j(Throwable th) {
        return Build.VERSION.SDK_INT == 28 && k(th);
    }

    public final void l(Throwable th) throws e {
        throw new e(10001, th);
    }
}
