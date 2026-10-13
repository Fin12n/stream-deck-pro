package io.sentry.android.core.internal.util;

import io.sentry.InterfaceC2480b0;
import io.sentry.util.C2569a;
import io.sentry.util.C2576h;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final g f26419c = new g();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C2569a f26420a = new C2569a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f26421b = new ArrayList();

    public static g a() {
        return f26419c;
    }

    public String b() {
        return "/sys/devices/system/cpu";
    }

    public List c() {
        InterfaceC2480b0 interfaceC2480b0A = this.f26420a.a();
        try {
            if (!this.f26421b.isEmpty()) {
                List list = this.f26421b;
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return list;
            }
            File[] fileArrListFiles = new File(b()).listFiles();
            if (fileArrListFiles == null) {
                ArrayList arrayList = new ArrayList();
                if (interfaceC2480b0A != null) {
                    interfaceC2480b0A.close();
                }
                return arrayList;
            }
            for (File file : fileArrListFiles) {
                if (file.getName().matches("cpu[0-9]+")) {
                    File file2 = new File(file, "cpufreq/cpuinfo_max_freq");
                    if (file2.exists() && file2.canRead()) {
                        try {
                            String strC = C2576h.c(file2);
                            if (strC != null) {
                                this.f26421b.add(Integer.valueOf((int) (Long.parseLong(strC.trim()) / 1000)));
                            }
                        } catch (IOException | NumberFormatException unused) {
                        }
                    }
                }
            }
            List list2 = this.f26421b;
            if (interfaceC2480b0A != null) {
                interfaceC2480b0A.close();
            }
            return list2;
        } catch (Throwable th) {
            if (interfaceC2480b0A != null) {
                try {
                    interfaceC2480b0A.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
            }
            throw th;
        }
    }
}
