package com.elgato.streamdeck.vsd2;

import C6.G;
import C6.r;
import I6.l;
import Q6.o;
import com.google.protobuf.GeneratedMessageLite;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$updateLastOpenedDeviceID$2", f = "AppSettingsStore.kt", l = {}, m = "invokeSuspend")
public final class AppSettingsStore$updateLastOpenedDeviceID$2 extends l implements o {
    final /* synthetic */ String $deviceID;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSettingsStore$updateLastOpenedDeviceID$2(String str, G6.d<? super AppSettingsStore$updateLastOpenedDeviceID$2> dVar) {
        super(2, dVar);
        this.$deviceID = str;
    }

    @Override // I6.a
    public final G6.d<G> create(Object obj, G6.d<?> dVar) {
        AppSettingsStore$updateLastOpenedDeviceID$2 appSettingsStore$updateLastOpenedDeviceID$2 = new AppSettingsStore$updateLastOpenedDeviceID$2(this.$deviceID, dVar);
        appSettingsStore$updateLastOpenedDeviceID$2.L$0 = obj;
        return appSettingsStore$updateLastOpenedDeviceID$2;
    }

    @Override // Q6.o
    public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
        return ((AppSettingsStore$updateLastOpenedDeviceID$2) create(appSettings, dVar)).invokeSuspend(G.f1419a);
    }

    @Override // I6.a
    public final Object invokeSuspend(Object obj) {
        H6.c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(obj);
        GeneratedMessageLite.b builder = ((AppSettings) this.L$0).toBuilder();
        String str = this.$deviceID;
        AppSettings.Builder builder2 = (AppSettings.Builder) builder;
        if (str == null) {
            builder2.clearLastOpenedDeviceRawID();
        } else {
            builder2.setLastOpenedDeviceRawID(str);
        }
        GeneratedMessageLite generatedMessageLiteBuild = builder2.build();
        t.f(generatedMessageLiteBuild, "build(...)");
        return generatedMessageLiteBuild;
    }
}
