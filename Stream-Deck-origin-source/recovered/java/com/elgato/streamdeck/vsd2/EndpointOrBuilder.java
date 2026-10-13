package com.elgato.streamdeck.vsd2;

import com.google.protobuf.AbstractC2097h;
import com.google.protobuf.T;
import com.google.protobuf.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface EndpointOrBuilder extends U {
    @Override // com.google.protobuf.U
    /* synthetic */ T getDefaultInstanceForType();

    String getHost();

    AbstractC2097h getHostBytes();

    int getPort();

    Endpoint.Source getSource();

    int getSourceValue();

    @Override // com.google.protobuf.U
    /* synthetic */ boolean isInitialized();
}
