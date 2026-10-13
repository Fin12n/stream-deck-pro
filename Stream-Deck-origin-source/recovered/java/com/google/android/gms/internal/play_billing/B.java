package com.google.android.gms.internal.play_billing;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import p138p3.C2776k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class B {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f18730a = Runtime.getRuntime().availableProcessors();

    public static int a(Intent intent, String str) {
        if (intent != null) {
            return l(intent.getExtras(), "ProxyBillingActivity");
        }
        j("ProxyBillingActivity", "Got null intent!");
        return 0;
    }

    public static int b(Bundle bundle, String str) {
        if (bundle == null) {
            j(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            i(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        }
        if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        }
        j(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
        return 6;
    }

    public static Bundle c(boolean z8, boolean z9, boolean z10, boolean z11, String str) {
        Bundle bundle = new Bundle();
        bundle.putString("playBillingLibraryVersion", str);
        if (z8 && z10) {
            bundle.putBoolean(com.amazon.a.a.o.b.ac, true);
        }
        if (z9 && z11) {
            bundle.putBoolean("enablePendingPurchaseForSubscriptions", true);
        }
        return bundle;
    }

    public static com.android.billingclient.api.d d(Intent intent, String str) {
        if (intent != null) {
            com.android.billingclient.api.d.a aVarC = com.android.billingclient.api.d.c();
            aVarC.c(b(intent.getExtras(), str));
            aVarC.b(f(intent.getExtras(), str));
            return aVarC.a();
        }
        j("BillingHelper", "Got null intent!");
        com.android.billingclient.api.d.a aVarC2 = com.android.billingclient.api.d.c();
        aVarC2.c(6);
        aVarC2.b("An internal error occurred.");
        return aVarC2.a();
    }

    public static C2776k e(Bundle bundle, String str) {
        return bundle == null ? new C2776k(0, null) : new C2776k(l(bundle, "BillingClient"), bundle.getString("IN_APP_MESSAGE_PURCHASE_TOKEN"));
    }

    public static String f(Bundle bundle, String str) {
        if (bundle == null) {
            j(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            i(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        }
        if (obj instanceof String) {
            return (String) obj;
        }
        j(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
        return "";
    }

    public static String g(int i8) {
        return EnumC1991a.a(i8).toString();
    }

    public static List h(Bundle bundle) {
        ArrayList<String> stringArrayList = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        ArrayList arrayList = new ArrayList();
        if (stringArrayList == null || stringArrayList2 == null) {
            Purchase purchaseM = m(bundle.getString("INAPP_PURCHASE_DATA"), bundle.getString("INAPP_DATA_SIGNATURE"));
            if (purchaseM == null) {
                i("BillingHelper", "Couldn't find single purchase data as well.");
                return null;
            }
            arrayList.add(purchaseM);
            return arrayList;
        }
        i("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
        for (int i8 = 0; i8 < stringArrayList.size() && i8 < stringArrayList2.size(); i8++) {
            Purchase purchaseM2 = m(stringArrayList.get(i8), stringArrayList2.get(i8));
            if (purchaseM2 != null) {
                arrayList.add(purchaseM2);
            }
        }
        return arrayList;
    }

    public static void i(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (str2.isEmpty()) {
                Log.v(str, str2);
                return;
            }
            int i8 = 40000;
            while (!str2.isEmpty() && i8 > 0) {
                int iMin = Math.min(str2.length(), Math.min(4000, i8));
                Log.v(str, str2.substring(0, iMin));
                str2 = str2.substring(iMin);
                i8 -= iMin;
            }
        }
    }

    public static void j(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void k(String str, String str2, Throwable th) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2, th);
        }
    }

    public static int l(Bundle bundle, String str) {
        if (bundle != null) {
            return bundle.getInt("IN_APP_MESSAGE_RESPONSE_CODE", 0);
        }
        j(str, "Unexpected null bundle received!");
        return 0;
    }

    public static Purchase m(String str, String str2) {
        if (str == null || str2 == null) {
            i("BillingHelper", "Received a null purchase data.");
            return null;
        }
        try {
            return new Purchase(str, str2);
        } catch (JSONException e8) {
            j("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e8.toString()));
            return null;
        }
    }
}
