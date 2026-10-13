package p140p5;

import F4.g;
import P2.Lsk.mHPawN;
import android.content.Context;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import java.util.Locale;
import p219z4.C3200i;

/* JADX INFO: renamed from: p5.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class AbstractC2793c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C3200i f31251a = new C3200i(mHPawN.KYQLkg, "");

    public static String a(Context context) {
        try {
            return String.valueOf(context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode);
        } catch (PackageManager.NameNotFoundException e8) {
            f31251a.c("CommonUtils", "Exception thrown when trying to get app version ".concat(e8.toString()));
            return "";
        }
    }

    public static String b(Locale locale) {
        if (g.d()) {
            return locale.toLanguageTag();
        }
        StringBuilder sb = new StringBuilder(locale.getLanguage());
        if (!TextUtils.isEmpty(locale.getCountry())) {
            sb.append("-");
            sb.append(locale.getCountry());
        }
        if (!TextUtils.isEmpty(locale.getVariant())) {
            sb.append("-");
            sb.append(locale.getVariant());
        }
        return sb.toString();
    }
}
