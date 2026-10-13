package p174u;

import I.m;
import android.content.Context;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CameraDevice;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Handler;
import android.util.ArrayMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f34328a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f34329b = new ArrayMap(4);

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        static a e(Context context, Handler handler) {
            int i8 = Build.VERSION.SDK_INT;
            if (i8 >= 30) {
                return new w(context);
            }
            return i8 >= 29 ? new v(context) : u.i(context);
        }

        CameraManager a();

        void b(Executor executor, CameraManager.AvailabilityCallback availabilityCallback);

        void c(CameraManager.AvailabilityCallback availabilityCallback);

        CameraCharacteristics d(String str);

        Set f();

        void g(String str, Executor executor, CameraDevice.StateCallback stateCallback);

        String[] h();
    }

    public t(a aVar) {
        this.f34328a = aVar;
    }

    public static t a(Context context) {
        return b(context, m.a());
    }

    public static t b(Context context, Handler handler) {
        return new t(a.e(context, handler));
    }

    public n c(String str) {
        n nVarK;
        synchronized (this.f34329b) {
            nVarK = (n) this.f34329b.get(str);
            if (nVarK == null) {
                try {
                    nVarK = n.k(this.f34328a.d(str), str);
                    this.f34329b.put(str, nVarK);
                } catch (AssertionError e8) {
                    throw new e(10002, e8.getMessage(), e8);
                }
            }
        }
        return nVarK;
    }

    public String[] d() {
        return this.f34328a.h();
    }

    public Set e() {
        return this.f34328a.f();
    }

    public void f(String str, Executor executor, CameraDevice.StateCallback stateCallback) {
        this.f34328a.g(str, executor, stateCallback);
    }

    public void g(Executor executor, CameraManager.AvailabilityCallback availabilityCallback) {
        this.f34328a.b(executor, availabilityCallback);
    }

    public void h(CameraManager.AvailabilityCallback availabilityCallback) {
        this.f34328a.c(availabilityCallback);
    }

    public CameraManager i() {
        return this.f34328a.a();
    }
}
