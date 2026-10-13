package com.amazon.device.simplesignin;

import com.amazon.device.simplesignin.model.response.GetUserAndLinksResponse;
import com.amazon.device.simplesignin.model.response.LinkUserAccountResponse;
import com.amazon.device.simplesignin.model.response.RecordMetricsEventResponse;
import com.amazon.device.simplesignin.model.response.ShowLoginSelectionResponse;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface ISimpleSignInResponseHandler {
    void onGetUserAndLinksResponse(GetUserAndLinksResponse getUserAndLinksResponse);

    void onLinkUserAccountResponse(LinkUserAccountResponse linkUserAccountResponse);

    void onRecordMetricsEventResponse(RecordMetricsEventResponse recordMetricsEventResponse);

    void onShowLoginSelectionResponse(ShowLoginSelectionResponse showLoginSelectionResponse);
}
