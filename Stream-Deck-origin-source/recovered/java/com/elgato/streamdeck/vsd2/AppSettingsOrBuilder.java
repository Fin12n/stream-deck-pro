package com.elgato.streamdeck.vsd2;

import com.google.protobuf.AbstractC2097h;
import com.google.protobuf.T;
import com.google.protobuf.U;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface AppSettingsOrBuilder extends U {
    AppMetrics getAppMetrics();

    AppUpdates getAppUpdates();

    @Override // com.google.protobuf.U
    /* synthetic */ T getDefaultInstanceForType();

    boolean getIsForcedProUser();

    boolean getIsProUser();

    KnownHost getKnownHosts(int i8);

    int getKnownHostsCount();

    List<KnownHost> getKnownHostsList();

    String getLastOpenedDeviceRawID();

    AbstractC2097h getLastOpenedDeviceRawIDBytes();

    AbstractC2097h getPublicKey();

    AbstractC2097h getSecretKey();

    StaticHost getStaticHost(int i8);

    int getStaticHostCount();

    List<StaticHost> getStaticHostList();

    boolean hasAppMetrics();

    boolean hasAppUpdates();

    boolean hasIsForcedProUser();

    boolean hasLastOpenedDeviceRawID();

    @Override // com.google.protobuf.U
    /* synthetic */ boolean isInitialized();
}
