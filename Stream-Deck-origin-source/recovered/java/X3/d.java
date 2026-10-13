package X3;

import D6.C0934n;
import D6.L;
import D6.z;
import Z6.u;
import Z6.w;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;
import p211y4.vJ.RaiWHuj;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final a f11688r = new a(null);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f11689a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final String f11690b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f11691c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final int f11692d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final int f11693e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final String f11694f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final String f11695g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final String f11696h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final String f11697i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final String f11698j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final int f11699k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final int f11700l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final String f11701m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final String f11702n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public final int f11703o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final String f11704p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public final String f11705q;

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static final class a {
        public /* synthetic */ a(AbstractC2633k abstractC2633k) {
            this();
        }

        public final d a(Context context) {
            Integer numM;
            Integer numM2;
            Integer numM3;
            t.g(context, "context");
            String RELEASE = Build.VERSION.RELEASE;
            t.f(RELEASE, "RELEASE");
            List listA0 = w.A0(RELEASE, new String[]{"."}, false, 0, 6, null);
            Object systemService = context.getSystemService("window");
            t.e(systemService, "null cannot be cast to non-null type android.view.WindowManager");
            DisplayMetrics displayMetrics = new DisplayMetrics();
            ((WindowManager) systemService).getDefaultDisplay().getRealMetrics(displayMetrics);
            Object systemService2 = context.getSystemService("activity");
            t.e(systemService2, "null cannot be cast to non-null type android.app.ActivityManager");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ((ActivityManager) systemService2).getMemoryInfo(memoryInfo);
            int iIntValue = 0;
            boolean z8 = (context.getResources().getConfiguration().screenLayout & 15) >= 3;
            t.f(RELEASE, "RELEASE");
            String str = (String) z.l0(listA0, 0);
            int iIntValue2 = (str == null || (numM3 = u.m(str)) == null) ? 0 : numM3.intValue();
            String str2 = (String) z.l0(listA0, 1);
            int iIntValue3 = (str2 == null || (numM2 = u.m(str2)) == null) ? 0 : numM2.intValue();
            String str3 = (String) z.l0(listA0, 2);
            if (str3 != null && (numM = u.m(str3)) != null) {
                iIntValue = numM.intValue();
            }
            String DISPLAY = Build.DISPLAY;
            t.f(DISPLAY, "DISPLAY");
            String MODEL = Build.MODEL;
            t.f(MODEL, "MODEL");
            String MANUFACTURER = Build.MANUFACTURER;
            t.f(MANUFACTURER, "MANUFACTURER");
            String HARDWARE = Build.HARDWARE;
            t.f(HARDWARE, "HARDWARE");
            String strValueOf = String.valueOf(memoryInfo.totalMem / ((long) 1048576));
            int i8 = displayMetrics.widthPixels;
            int i9 = displayMetrics.heightPixels;
            String str4 = z8 ? "Tablet" : "Phone";
            String[] SUPPORTED_ABIS = Build.SUPPORTED_ABIS;
            t.f(SUPPORTED_ABIS, "SUPPORTED_ABIS");
            String str5 = (String) C0934n.O(SUPPORTED_ABIS);
            if (str5 == null) {
                str5 = "unknown";
            }
            String str6 = str5;
            int iAvailableProcessors = Runtime.getRuntime().availableProcessors();
            String string = Locale.getDefault().toString();
            t.f(string, "toString(...)");
            String id = TimeZone.getDefault().getID();
            t.f(id, "getID(...)");
            return new d("Android", RELEASE, iIntValue2, iIntValue3, iIntValue, DISPLAY, MODEL, MANUFACTURER, HARDWARE, strValueOf, i8, i9, str4, str6, iAvailableProcessors, string, id);
        }

        public a() {
        }
    }

    public d(String osName, String str, int i8, int i9, int i10, String osBuild, String model, String manufacturer, String processorName, String ramCapacity, int i11, int i12, String systemType, String cpuArchitecture, int i13, String locale, String timezone) {
        t.g(osName, "osName");
        t.g(str, RaiWHuj.NKiIICeLa);
        t.g(osBuild, "osBuild");
        t.g(model, "model");
        t.g(manufacturer, "manufacturer");
        t.g(processorName, "processorName");
        t.g(ramCapacity, "ramCapacity");
        t.g(systemType, "systemType");
        t.g(cpuArchitecture, "cpuArchitecture");
        t.g(locale, "locale");
        t.g(timezone, "timezone");
        this.f11689a = osName;
        this.f11690b = str;
        this.f11691c = i8;
        this.f11692d = i9;
        this.f11693e = i10;
        this.f11694f = osBuild;
        this.f11695g = model;
        this.f11696h = manufacturer;
        this.f11697i = processorName;
        this.f11698j = ramCapacity;
        this.f11699k = i11;
        this.f11700l = i12;
        this.f11701m = systemType;
        this.f11702n = cpuArchitecture;
        this.f11703o = i13;
        this.f11704p = locale;
        this.f11705q = timezone;
    }

    public final Map a() {
        Map mapC = L.c();
        i.b bVar = i.Companion;
        mapC.put("$os", bVar.g(this.f11689a));
        mapC.put("$os_version", bVar.g(this.f11690b));
        mapC.put("os_version_major", bVar.d(this.f11691c));
        mapC.put("os_version_minor", bVar.d(this.f11692d));
        mapC.put("os_version_patch", bVar.d(this.f11693e));
        mapC.put("os_build", bVar.g(this.f11694f));
        mapC.put("$model", bVar.g(this.f11695g));
        mapC.put("$manufacturer", bVar.g(this.f11696h));
        mapC.put("processor_name", bVar.g(this.f11697i));
        mapC.put("ram_capacity", bVar.g(this.f11698j));
        mapC.put("$screen_width", bVar.d(this.f11699k));
        mapC.put("$screen_height", bVar.d(this.f11700l));
        mapC.put("system_type", bVar.g(this.f11701m));
        mapC.put("cpu_architecture", bVar.g(this.f11702n));
        mapC.put("cpu_core_count", bVar.d(this.f11703o));
        mapC.put("locale", bVar.g(this.f11704p));
        mapC.put("timezone", bVar.g(this.f11705q));
        return L.b(mapC);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return t.c(this.f11689a, dVar.f11689a) && t.c(this.f11690b, dVar.f11690b) && this.f11691c == dVar.f11691c && this.f11692d == dVar.f11692d && this.f11693e == dVar.f11693e && t.c(this.f11694f, dVar.f11694f) && t.c(this.f11695g, dVar.f11695g) && t.c(this.f11696h, dVar.f11696h) && t.c(this.f11697i, dVar.f11697i) && t.c(this.f11698j, dVar.f11698j) && this.f11699k == dVar.f11699k && this.f11700l == dVar.f11700l && t.c(this.f11701m, dVar.f11701m) && t.c(this.f11702n, dVar.f11702n) && this.f11703o == dVar.f11703o && t.c(this.f11704p, dVar.f11704p) && t.c(this.f11705q, dVar.f11705q);
    }

    public int hashCode() {
        return (((((((((((((((((((((((((((((((this.f11689a.hashCode() * 31) + this.f11690b.hashCode()) * 31) + Integer.hashCode(this.f11691c)) * 31) + Integer.hashCode(this.f11692d)) * 31) + Integer.hashCode(this.f11693e)) * 31) + this.f11694f.hashCode()) * 31) + this.f11695g.hashCode()) * 31) + this.f11696h.hashCode()) * 31) + this.f11697i.hashCode()) * 31) + this.f11698j.hashCode()) * 31) + Integer.hashCode(this.f11699k)) * 31) + Integer.hashCode(this.f11700l)) * 31) + this.f11701m.hashCode()) * 31) + this.f11702n.hashCode()) * 31) + Integer.hashCode(this.f11703o)) * 31) + this.f11704p.hashCode()) * 31) + this.f11705q.hashCode();
    }

    public String toString() {
        return "DeviceContext(osName=" + this.f11689a + ", osVersion=" + this.f11690b + ", osVersionMajor=" + this.f11691c + ", osVersionMinor=" + this.f11692d + ", osVersionPatch=" + this.f11693e + ", osBuild=" + this.f11694f + ", model=" + this.f11695g + ", manufacturer=" + this.f11696h + ", processorName=" + this.f11697i + ", ramCapacity=" + this.f11698j + ", screenWidth=" + this.f11699k + ", screenHeight=" + this.f11700l + ", systemType=" + this.f11701m + ", cpuArchitecture=" + this.f11702n + ", cpuCoreCount=" + this.f11703o + ", locale=" + this.f11704p + ", timezone=" + this.f11705q + ")";
    }
}
