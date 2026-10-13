package com.elgato.streamdeck.vsd2;

import com.google.protobuf.AbstractC2097h;
import com.google.protobuf.T;
import com.google.protobuf.Timestamp;
import com.google.protobuf.U;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface KnownHostOrBuilder extends U {
    Timestamp getCreatedAt();

    @Override // com.google.protobuf.U
    /* synthetic */ T getDefaultInstanceForType();

    Timestamp getDeletedAt();

    KnownHost.Device getDevices(int i8);

    int getDevicesCount();

    List<KnownHost.Device> getDevicesList();

    String getDisplayName();

    AbstractC2097h getDisplayNameBytes();

    boolean getIsAuthenticated();

    Endpoint getLastEndpoint();

    String getRawID();

    AbstractC2097h getRawIDBytes();

    Timestamp getUpdatedAt();

    boolean hasCreatedAt();

    boolean hasDeletedAt();

    boolean hasLastEndpoint();

    boolean hasUpdatedAt();

    @Override // com.google.protobuf.U
    /* synthetic */ boolean isInitialized();
}
