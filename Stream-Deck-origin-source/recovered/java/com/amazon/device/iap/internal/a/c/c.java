package com.amazon.device.iap.internal.a.c;

import com.amazon.a.a.o.f;
import com.amazon.d.a.j;
import com.amazon.device.iap.internal.model.UserDataBuilder;
import com.amazon.device.iap.internal.model.UserDataResponseBuilder;
import com.amazon.device.iap.model.UserData;
import com.amazon.device.iap.model.UserDataResponse;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c extends b {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final String f17090d = "c";

    public c(com.amazon.device.iap.internal.a.c cVar) {
        super(cVar, "1.0");
    }

    @Override // com.amazon.a.a.n.a.h
    public boolean b(j jVar) {
        String str = f17090d;
        com.amazon.device.iap.internal.util.b.a(str, "onSuccessInternal: result = " + jVar);
        Map mapB = jVar.b();
        com.amazon.device.iap.internal.util.b.a(str, "data: " + mapB);
        String str2 = (String) mapB.get("userId");
        com.amazon.device.iap.internal.a.c cVar = (com.amazon.device.iap.internal.a.c) j();
        if (f.a(str2)) {
            cVar.a().a(new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.FAILED).build());
            return false;
        }
        UserData userDataBuild = new UserDataBuilder().setUserId(str2).setMarketplace(b.f17089c).build();
        UserDataResponse userDataResponseBuild = new UserDataResponseBuilder().setRequestId(cVar.d()).setRequestStatus(UserDataResponse.RequestStatus.SUCCESSFUL).setUserData(userDataBuild).build();
        cVar.a().a("userId", userDataBuild.getUserId());
        cVar.a().a(userDataResponseBuild);
        return true;
    }
}
