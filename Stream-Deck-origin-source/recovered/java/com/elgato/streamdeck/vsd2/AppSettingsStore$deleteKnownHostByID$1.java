package com.elgato.streamdeck.vsd2;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore", f = "AppSettingsStore.kt", l = {136, 149}, m = "deleteKnownHostByID-ZDYjOP8")
public final class AppSettingsStore$deleteKnownHostByID$1 extends I6.d {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ AppSettingsStore this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSettingsStore$deleteKnownHostByID$1(AppSettingsStore appSettingsStore, G6.d<? super AppSettingsStore$deleteKnownHostByID$1> dVar) {
        super(dVar);
        this.this$0 = appSettingsStore;
    }

    @Override // I6.a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m99deleteKnownHostByIDZDYjOP8(null, this);
    }
}
