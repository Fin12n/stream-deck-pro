package p219z4;

import F4.e;
import G4.c;
import android.R;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.elgato.streamdeck.vsd2.KnownHost;
import java.util.Locale;
import p010b0.C;
import p187v4.b;
import p195w4.i;
import p195w4.l;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class A {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C f39083a = new C();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static Locale f39084b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            return c.a(context).b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    public static String b(Context context, int i8) {
        Resources resources = context.getResources();
        if (i8 == 1) {
            return resources.getString(b.f35113d);
        }
        if (i8 != 2) {
            return i8 != 3 ? resources.getString(R.string.ok) : resources.getString(b.f35110a);
        }
        return resources.getString(b.f35119j);
    }

    public static String c(Context context, int i8) {
        Resources resources = context.getResources();
        String strA = a(context);
        if (i8 == 1) {
            return resources.getString(b.f35114e, strA);
        }
        if (i8 == 2) {
            return e.c(context) ? resources.getString(b.f35123n) : resources.getString(b.f35120k, strA);
        }
        if (i8 == 3) {
            return resources.getString(b.f35111b, strA);
        }
        if (i8 == 5) {
            return g(context, "common_google_play_services_invalid_account_text", strA);
        }
        if (i8 == 7) {
            return g(context, "common_google_play_services_network_error_text", strA);
        }
        if (i8 == 9) {
            return resources.getString(b.f35118i, strA);
        }
        if (i8 == 20) {
            return g(context, "common_google_play_services_restricted_profile_text", strA);
        }
        switch (i8) {
            case 16:
                return g(context, "common_google_play_services_api_unavailable_text", strA);
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                return g(context, "common_google_play_services_sign_in_failed_text", strA);
            case 18:
                return resources.getString(b.f35122m, strA);
            default:
                return resources.getString(l.f37107a, strA);
        }
    }

    public static String d(Context context, int i8) {
        return (i8 == 6 || i8 == 19) ? g(context, "common_google_play_services_resolution_required_text", a(context)) : c(context, i8);
    }

    public static String e(Context context, int i8) {
        String strH = i8 == 6 ? h(context, "common_google_play_services_resolution_required_title") : f(context, i8);
        return strH == null ? context.getResources().getString(b.f35117h) : strH;
    }

    public static String f(Context context, int i8) {
        Resources resources = context.getResources();
        switch (i8) {
            case 1:
                return resources.getString(b.f35115f);
            case 2:
                return resources.getString(b.f35121l);
            case 3:
                return resources.getString(b.f35112c);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return h(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return h(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case KnownHost.Device.ISCUSTOMLAYOUT_FIELD_NUMBER /* 13 */:
            case KnownHost.Device.KEYPADROTATION_FIELD_NUMBER /* 14 */:
            case KnownHost.Device.APPEARANCE_FIELD_NUMBER /* 15 */:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i8);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case KnownHost.Device.CUSTOMFACEPLATE_FIELD_NUMBER /* 17 */:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return h(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return h(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String g(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String strH = h(context, str);
        if (strH == null) {
            strH = resources.getString(l.f37107a);
        }
        return String.format(resources.getConfiguration().locale, strH, str2);
    }

    public static String h(Context context, String str) {
        C c8 = f39083a;
        synchronized (c8) {
            try {
                Locale localeC = P1.e.a(context.getResources().getConfiguration()).c(0);
                if (!localeC.equals(f39084b)) {
                    c8.clear();
                    f39084b = localeC;
                }
                String str2 = (String) c8.get(str);
                if (str2 != null) {
                    return str2;
                }
                Resources resourcesC = i.c(context);
                if (resourcesC == null) {
                    return null;
                }
                int identifier = resourcesC.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    Log.w("GoogleApiAvailability", "Missing resource: " + str);
                    return null;
                }
                String string = resourcesC.getString(identifier);
                if (!TextUtils.isEmpty(string)) {
                    c8.put(str, string);
                    return string;
                }
                Log.w("GoogleApiAvailability", "Got empty resource: " + str);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
