package H;

import A.AbstractC0890p0;
import android.app.Service;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class Y0 implements p142q.a {

    /* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
    public static class a extends Service {
    }

    public static W0 b(Context context, Bundle bundle) {
        boolean z8 = bundle.getBoolean("androidx.camera.core.quirks.DEFAULT_QUIRK_ENABLED", true);
        String[] strArrC = c(context, bundle, "androidx.camera.core.quirks.FORCE_ENABLED");
        String[] strArrC2 = c(context, bundle, "androidx.camera.core.quirks.FORCE_DISABLED");
        AbstractC0890p0.a("QuirkSettingsLoader", "Loaded quirk settings from metadata:");
        AbstractC0890p0.a("QuirkSettingsLoader", "  KEY_DEFAULT_QUIRK_ENABLED = " + z8);
        AbstractC0890p0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_ENABLED = " + Arrays.toString(strArrC));
        AbstractC0890p0.a("QuirkSettingsLoader", "  KEY_QUIRK_FORCE_DISABLED = " + Arrays.toString(strArrC2));
        return new W0.b().d(z8).c(e(strArrC)).b(e(strArrC2)).a();
    }

    public static String[] c(Context context, Bundle bundle, String str) {
        if (!bundle.containsKey(str)) {
            return new String[0];
        }
        int i8 = bundle.getInt(str, -1);
        if (i8 == -1) {
            AbstractC0890p0.l("QuirkSettingsLoader", "Resource ID not found for key: " + str);
            return new String[0];
        }
        try {
            return context.getResources().getStringArray(i8);
        } catch (Resources.NotFoundException e8) {
            AbstractC0890p0.m("QuirkSettingsLoader", "Quirk class names resource not found: " + i8, e8);
            return new String[0];
        }
    }

    public static Class d(String str) {
        try {
            Class<?> cls = Class.forName(str);
            if (V0.class.isAssignableFrom(cls)) {
                return cls;
            }
            AbstractC0890p0.l("QuirkSettingsLoader", str + " does not implement the Quirk interface.");
            return null;
        } catch (ClassNotFoundException e8) {
            AbstractC0890p0.m("QuirkSettingsLoader", "Class not found: " + str, e8);
            return null;
        }
    }

    public static Set e(String[] strArr) {
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            Class clsD = d(str);
            if (clsD != null) {
                hashSet.add(clsD);
            }
        }
        return hashSet;
    }

    @Override // p142q.a
    /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
    public W0 apply(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) a.class), 640).metaData;
            if (bundle != null) {
                return b(context, bundle);
            }
            AbstractC0890p0.l("QuirkSettingsLoader", "No metadata in MetadataHolderService.");
            return null;
        } catch (PackageManager.NameNotFoundException unused) {
            AbstractC0890p0.a("QuirkSettingsLoader", "QuirkSettings$MetadataHolderService is not found.");
            return null;
        }
    }
}
