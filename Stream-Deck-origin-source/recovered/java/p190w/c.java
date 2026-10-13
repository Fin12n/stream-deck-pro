package p190w;

import Z6.v;
import android.os.Build;
import java.util.Locale;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final c f35188a = new c();

    public static final boolean d() {
        if (Build.VERSION.SDK_INT < 31 || !v.v("Spreadtrum", Build.SOC_MANUFACTURER, true)) {
            String HARDWARE = Build.HARDWARE;
            t.f(HARDWARE, "HARDWARE");
            Locale locale = Locale.ROOT;
            String lowerCase = HARDWARE.toLowerCase(locale);
            t.f(lowerCase, "toLowerCase(...)");
            if (!v.H(lowerCase, "ums", false, 2, null)) {
                if (f35188a.c()) {
                    t.f(HARDWARE, "HARDWARE");
                    String lowerCase2 = HARDWARE.toLowerCase(locale);
                    t.f(lowerCase2, "toLowerCase(...)");
                    if (v.H(lowerCase2, "sp", false, 2, null)) {
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean a(String str, String str2) {
        return v.v(str, str2, true);
    }

    public final boolean b(String str) {
        String MANUFACTURER = Build.MANUFACTURER;
        t.f(MANUFACTURER, "MANUFACTURER");
        if (a(MANUFACTURER, str)) {
            return true;
        }
        String BRAND = Build.BRAND;
        t.f(BRAND, "BRAND");
        return a(BRAND, str);
    }

    public final boolean c() {
        return b("Itel");
    }
}
