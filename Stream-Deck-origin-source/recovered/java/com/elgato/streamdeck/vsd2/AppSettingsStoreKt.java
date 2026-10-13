package com.elgato.streamdeck.vsd2;

import com.google.protobuf.GeneratedMessageLite;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class AppSettingsStoreKt {
    private static final KnownHost.Device DEFAULT_DEVICE;

    static {
        KnownHost.Device.Builder builderNewBuilder = KnownHost.Device.newBuilder();
        t.f(builderNewBuilder, "newBuilder(...)");
        GeneratedMessageLite generatedMessageLiteBuild = P3.f.o(builderNewBuilder).build();
        t.f(generatedMessageLiteBuild, "build(...)");
        DEFAULT_DEVICE = (KnownHost.Device) generatedMessageLiteBuild;
    }
}
