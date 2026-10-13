package com.amazon.device.iap.internal.a.b;

import P2.Lsk.mHPawN;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.a.e;
import com.amazon.device.iap.internal.a.f;
import com.amazon.device.iap.internal.model.PurchaseUpdatesResponseBuilder;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.model.PurchaseUpdatesResponse;
import com.amazon.device.iap.model.Receipt;
import io.sentry.exception.uXy.SZCvugJaXc;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f17081d = "d";

    private List<Receipt> a(String str, String str2, String str3) {
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArray = new JSONArray(str2);
        for (int i8 = 0; i8 < jSONArray.length(); i8++) {
            try {
                arrayList.add(com.amazon.device.iap.internal.util.c.a(jSONArray.getJSONObject(i8), str, str3));
            } catch (e e8) {
                com.amazon.device.iap.internal.util.b.b(f17081d, "fail to parse receipt, requestId:" + e8.a());
            } catch (f e9) {
                com.amazon.device.iap.internal.util.b.b(f17081d, "fail to verify receipt, requestId:" + e9.a());
            } catch (Throwable th) {
                com.amazon.device.iap.internal.util.b.b(f17081d, "fail to verify receipt, requestId:" + th.getMessage());
            }
        }
        return arrayList;
    }

    public d(com.amazon.device.iap.internal.a.c cVar, boolean z8) {
        super(cVar, mHPawN.ujfbLZj, z8);
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(f17081d, "data: " + mapB);
        String str = (String) mapB.get("userId");
        String str2 = (String) mapB.get(com.amazon.a.a.o.b.f16738m);
        List<Receipt> listA = a(str, (String) mapB.get(com.amazon.a.a.o.b.f16706G), (String) mapB.get(com.amazon.a.a.o.b.f16701B));
        String str3 = (String) mapB.get(SZCvugJaXc.JntpGD);
        boolean zBooleanValue = Boolean.valueOf((String) mapB.get(com.amazon.a.a.o.b.f16734i)).booleanValue();
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        PurchaseUpdatesResponse purchaseUpdatesResponseBuild = new PurchaseUpdatesResponseBuilder().setRequestId(cVar.d()).setRequestStatus(PurchaseUpdatesResponse.RequestStatus.SUCCESSFUL).setUserData(new UserDataBuilder().setUserId(str).setMarketplace(str2).build()).setReceipts(listA).setHasMore(zBooleanValue).build();
        cVar.a().a(com.amazon.a.a.o.b.ap, str3);
        cVar.a().a(purchaseUpdatesResponseBuild);
        return true;
    }
}
