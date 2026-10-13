package p174u;

import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.params.StreamConfigurationMap;
import android.os.Build;
import java.util.HashMap;
import java.util.Map;
import p198x.m;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class n {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final a f34322b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final String f34323c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f34321a = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public y f34324d = null;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public interface a {
        CameraCharacteristics a();

        Object b(CameraCharacteristics.Key key);
    }

    public n(CameraCharacteristics cameraCharacteristics, String str) {
        this.f34322b = new i(cameraCharacteristics);
        this.f34323c = str;
    }

    public static n k(CameraCharacteristics cameraCharacteristics, String str) {
        return new n(cameraCharacteristics, str);
    }

    public Object a(CameraCharacteristics.Key key) {
        if (g(key)) {
            return this.f34322b.b(key);
        }
        synchronized (this) {
            try {
                Object obj = this.f34321a.get(key);
                if (obj != null) {
                    return obj;
                }
                Object objB = this.f34322b.b(key);
                if (objB != null) {
                    this.f34321a.put(key, objB);
                }
                return objB;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String b() {
        return this.f34323c;
    }

    public int c() {
        Integer num = (!f() || Build.VERSION.SDK_INT < 35) ? null : (Integer) a(CameraCharacteristics.FLASH_TORCH_STRENGTH_DEFAULT_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public int d() {
        Integer num = (!f() || Build.VERSION.SDK_INT < 35) ? null : (Integer) a(CameraCharacteristics.FLASH_TORCH_STRENGTH_MAX_LEVEL);
        if (num == null) {
            return 1;
        }
        return num.intValue();
    }

    public y e() {
        if (this.f34324d == null) {
            try {
                StreamConfigurationMap streamConfigurationMap = (StreamConfigurationMap) a(CameraCharacteristics.SCALER_STREAM_CONFIGURATION_MAP);
                if (streamConfigurationMap == null) {
                    throw new IllegalArgumentException("StreamConfigurationMap is null!");
                }
                this.f34324d = y.h(streamConfigurationMap, new m(this.f34323c));
            } catch (AssertionError | NullPointerException e8) {
                throw new IllegalArgumentException(e8.getMessage());
            }
        }
        return this.f34324d;
    }

    public final boolean f() {
        Boolean bool = (Boolean) a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        return bool != null && bool.booleanValue();
    }

    public final boolean g(CameraCharacteristics.Key key) {
        return key.equals(CameraCharacteristics.SENSOR_ORIENTATION);
    }

    public boolean h() {
        return f() && Build.VERSION.SDK_INT >= 35 && d() > 1;
    }

    public boolean i() {
        int[] iArr;
        if (Build.VERSION.SDK_INT >= 34 && (iArr = (int[]) this.f34322b.b(CameraCharacteristics.CONTROL_AVAILABLE_SETTINGS_OVERRIDES)) != null) {
            for (int i8 : iArr) {
                if (i8 == 1) {
                    return true;
                }
            }
        }
        return false;
    }

    public CameraCharacteristics j() {
        return this.f34322b.a();
    }
}
