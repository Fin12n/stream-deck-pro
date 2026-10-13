package com.amazon.device.iap.internal;

import android.content.Context;
import android.content.Intent;
import com.amazon.device.iap.model.FulfillmentResult;
import com.amazon.device.iap.model.RequestId;
import com.amazon.device.iap.model.UserDataRequest;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface e {
    void a(Context context, Intent intent);

    void a(RequestId requestId, UserDataRequest userDataRequest);

    void a(RequestId requestId, String str);

    void a(RequestId requestId, String str, FulfillmentResult fulfillmentResult);

    void a(RequestId requestId, Set<String> set);

    void a(RequestId requestId, boolean z8);
}
