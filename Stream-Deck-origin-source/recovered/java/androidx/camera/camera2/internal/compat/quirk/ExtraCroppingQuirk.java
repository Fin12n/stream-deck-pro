package androidx.camera.camera2.internal.compat.quirk;

import H.V0;
import H.j1;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class ExtraCroppingQuirk implements V0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f14088a;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f14089a;

        static {
            int[] iArr = new int[j1.d.values().length];
            f14089a = iArr;
            try {
                iArr[j1.d.PRIV.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f14089a[j1.d.YUV.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f14089a[j1.d.JPEG.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    static {
        HashMap map = new HashMap();
        f14088a = map;
        map.put("SM-T580", null);
        map.put("SM-J710MN", new Range(21, 26));
        map.put("SM-A320FL", null);
        map.put("SM-G570M", null);
        map.put("SM-G610F", null);
        map.put("SM-G610M", new Range(21, 26));
    }

    public static boolean e() {
        if (!"samsung".equalsIgnoreCase(Build.BRAND)) {
            return false;
        }
        Map map = f14088a;
        String str = Build.MODEL;
        Locale locale = Locale.US;
        if (!map.containsKey(str.toUpperCase(locale))) {
            return false;
        }
        Range range = (Range) map.get(str.toUpperCase(locale));
        if (range == null) {
            return true;
        }
        return range.contains(Integer.valueOf(Build.VERSION.SDK_INT));
    }

    public static boolean f() {
        return e();
    }

    public Size d(j1.d dVar) {
        if (!e()) {
            return null;
        }
        int i8 = a.f14089a[dVar.ordinal()];
        if (i8 == 1) {
            return new Size(1920, 1080);
        }
        if (i8 == 2) {
            return new Size(1280, 720);
        }
        if (i8 != 3) {
            return null;
        }
        return new Size(3264, 1836);
    }
}
