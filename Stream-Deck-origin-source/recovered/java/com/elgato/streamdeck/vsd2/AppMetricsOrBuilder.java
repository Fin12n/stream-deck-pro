package com.elgato.streamdeck.vsd2;

import com.google.protobuf.AbstractC2097h;
import com.google.protobuf.T;
import com.google.protobuf.Timestamp;
import com.google.protobuf.U;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public interface AppMetricsOrBuilder extends U {
    long getConnectionDurationSeconds();

    @Override // com.google.protobuf.U
    /* synthetic */ T getDefaultInstanceForType();

    Timestamp getInstalledAt();

    Timestamp getLastReviewRequest();

    String getLastReviewRequestVersion();

    AbstractC2097h getLastReviewRequestVersionBytes();

    String getLastSeenOnboardingVersion();

    AbstractC2097h getLastSeenOnboardingVersionBytes();

    boolean hasInstalledAt();

    boolean hasLastReviewRequest();

    boolean hasLastReviewRequestVersion();

    boolean hasLastSeenOnboardingVersion();

    @Override // com.google.protobuf.U
    /* synthetic */ boolean isInitialized();
}
