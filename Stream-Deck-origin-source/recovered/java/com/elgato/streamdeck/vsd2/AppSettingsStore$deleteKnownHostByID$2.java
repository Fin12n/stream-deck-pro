package com.elgato.streamdeck.vsd2;

import C6.G;
import C6.r;
import I6.l;
import P3.i;
import Q6.o;
import com.google.protobuf.GeneratedMessageLite;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;
import p017b7.InterfaceC1812u;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$deleteKnownHostByID$2", f = "AppSettingsStore.kt", l = {}, m = "invokeSuspend")
public final class AppSettingsStore$deleteKnownHostByID$2 extends l implements o {
    final /* synthetic */ InterfaceC1812u $deferred;
    final /* synthetic */ String $id;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSettingsStore$deleteKnownHostByID$2(InterfaceC1812u interfaceC1812u, String str, G6.d<? super AppSettingsStore$deleteKnownHostByID$2> dVar) {
        super(2, dVar);
        this.$deferred = interfaceC1812u;
        this.$id = str;
    }

    @Override // I6.a
    public final G6.d<G> create(Object obj, G6.d<?> dVar) {
        AppSettingsStore$deleteKnownHostByID$2 appSettingsStore$deleteKnownHostByID$2 = new AppSettingsStore$deleteKnownHostByID$2(this.$deferred, this.$id, dVar);
        appSettingsStore$deleteKnownHostByID$2.L$0 = obj;
        return appSettingsStore$deleteKnownHostByID$2;
    }

    @Override // Q6.o
    public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
        return ((AppSettingsStore$deleteKnownHostByID$2) create(appSettings, dVar)).invokeSuspend(G.f1419a);
    }

    @Override // I6.a
    public final Object invokeSuspend(Object obj) {
        H6.c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(obj);
        AppSettings appSettings = (AppSettings) this.L$0;
        List<KnownHost> knownHostsList = appSettings.getKnownHostsList();
        t.f(knownHostsList, "getKnownHostsList(...)");
        String str = this.$id;
        Iterator<KnownHost> it = knownHostsList.iterator();
        int i8 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            }
            KnownHost next = it.next();
            t.d(next);
            if (i.d(P3.f.f(next), str)) {
                break;
            }
            i8++;
        }
        if (i8 < 0) {
            this.$deferred.r1(null);
            return appSettings;
        }
        this.$deferred.r1(appSettings.getKnownHostsList().get(i8));
        GeneratedMessageLite generatedMessageLiteBuild = ((AppSettings.Builder) appSettings.toBuilder()).removeKnownHosts(i8).build();
        t.d(generatedMessageLiteBuild);
        return (AppSettings) generatedMessageLiteBuild;
    }
}
