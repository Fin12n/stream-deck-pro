package io.sentry.util;

import P2.Lsk.mHPawN;
import R0.pkXL.Oitvkwcwn;
import io.sentry.EnumC2596z2;
import io.sentry.J2;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;

/* JADX INFO: renamed from: io.sentry.util.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2572d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static String f27725a = "sentry-debug-meta.properties";

    public static void b(J2 j8, List list) {
        if (j8.getProguardUuid() == null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String strD = d((Properties) it.next());
                if (strD != null) {
                    j8.getLogger().c(EnumC2596z2.DEBUG, "Proguard UUID found: %s", strD);
                    j8.setProguardUuid(strD);
                    return;
                }
            }
        }
    }

    public static void c(J2 j8, List list) {
        if (list != null) {
            a(j8, list);
            b(j8, list);
        }
    }

    public static String d(Properties properties) {
        return properties.getProperty(mHPawN.IHLYvgVukkQ);
    }

    public static void a(J2 j8, List list) {
        if (j8.getBundleIds().isEmpty()) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                String property = ((Properties) it.next()).getProperty("io.sentry.bundle-ids");
                j8.getLogger().c(EnumC2596z2.DEBUG, Oitvkwcwn.xfJe, property);
                if (property != null) {
                    for (String str : property.split(com.amazon.a.a.o.b.f.f16777a, -1)) {
                        j8.addBundleId(str);
                    }
                }
            }
        }
    }
}
