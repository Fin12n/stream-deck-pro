package com.android.billingclient.api;

import android.os.Bundle;
import com.google.android.gms.internal.play_billing.B;
import java.util.ArrayList;
import p138p3.m0;
import p201x2.vAk.hJroAgFztiMK;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class q {
    public static m0 a(Bundle bundle, String str, String str2) {
        d dVar = j.f17482j;
        if (bundle == null) {
            B.j("BillingClient", String.format("%s got null owned items list", str2));
            return new m0(dVar, 54);
        }
        int iB = B.b(bundle, "BillingClient");
        String strF = B.f(bundle, "BillingClient");
        d.a aVarC = d.c();
        aVarC.c(iB);
        aVarC.b(strF);
        d dVarA = aVarC.a();
        if (iB != 0) {
            B.j("BillingClient", String.format("%s failed. Response code: %s", str2, Integer.valueOf(iB)));
            return new m0(dVarA, 23);
        }
        String str3 = hJroAgFztiMK.TdqCFPeWRBKhXI;
        if (!bundle.containsKey(str3) || !bundle.containsKey("INAPP_PURCHASE_DATA_LIST") || !bundle.containsKey("INAPP_DATA_SIGNATURE_LIST")) {
            B.j("BillingClient", String.format("Bundle returned from %s doesn't contain required fields.", str2));
            return new m0(dVar, 55);
        }
        ArrayList<String> stringArrayList = bundle.getStringArrayList(str3);
        ArrayList<String> stringArrayList2 = bundle.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
        ArrayList<String> stringArrayList3 = bundle.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
        if (stringArrayList == null) {
            B.j("BillingClient", String.format("Bundle returned from %s contains null SKUs list.", str2));
            return new m0(dVar, 56);
        }
        if (stringArrayList2 == null) {
            B.j("BillingClient", String.format("Bundle returned from %s contains null purchases list.", str2));
            return new m0(dVar, 57);
        }
        if (stringArrayList3 != null) {
            return new m0(j.f17484l, 1);
        }
        B.j("BillingClient", String.format("Bundle returned from %s contains null signatures list.", str2));
        return new m0(dVar, 58);
    }
}
