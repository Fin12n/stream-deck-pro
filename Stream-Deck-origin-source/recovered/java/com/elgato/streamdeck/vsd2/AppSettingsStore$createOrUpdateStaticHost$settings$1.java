package com.elgato.streamdeck.vsd2;

import C6.G;
import C6.r;
import I6.l;
import P3.i;
import Q6.o;
import com.google.protobuf.GeneratedMessageLite;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$createOrUpdateStaticHost$settings$1", f = "AppSettingsStore.kt", l = {191, RCHTTPStatusCodes.CREATED}, m = "invokeSuspend")
public final class AppSettingsStore$createOrUpdateStaticHost$settings$1 extends l implements o {
    final /* synthetic */ o $updater;
    final /* synthetic */ String $workstationID;
    int I$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSettingsStore$createOrUpdateStaticHost$settings$1(o oVar, String str, G6.d<? super AppSettingsStore$createOrUpdateStaticHost$settings$1> dVar) {
        super(2, dVar);
        this.$updater = oVar;
        this.$workstationID = str;
    }

    @Override // I6.a
    public final G6.d<G> create(Object obj, G6.d<?> dVar) {
        AppSettingsStore$createOrUpdateStaticHost$settings$1 appSettingsStore$createOrUpdateStaticHost$settings$1 = new AppSettingsStore$createOrUpdateStaticHost$settings$1(this.$updater, this.$workstationID, dVar);
        appSettingsStore$createOrUpdateStaticHost$settings$1.L$0 = obj;
        return appSettingsStore$createOrUpdateStaticHost$settings$1;
    }

    @Override // Q6.o
    public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
        return ((AppSettingsStore$createOrUpdateStaticHost$settings$1) create(appSettings, dVar)).invokeSuspend(G.f1419a);
    }

    @Override // I6.a
    public final Object invokeSuspend(Object obj) {
        int i8;
        AppSettings appSettings;
        int i9;
        AppSettings appSettings2;
        Object objF = H6.c.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 == 1) {
                i9 = this.I$0;
                appSettings2 = (AppSettings) this.L$0;
                r.b(obj);
                GeneratedMessageLite generatedMessageLiteBuild = ((AppSettings.Builder) appSettings2.toBuilder()).setStaticHost(i9, (StaticHost) ((StaticHost.Builder) ((StaticHost) obj).toBuilder()).setRawID(this.$workstationID).setUpdatedAt(P3.f.d()).build()).build();
                t.d(generatedMessageLiteBuild);
                return (AppSettings) generatedMessageLiteBuild;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appSettings = (AppSettings) this.L$0;
            r.b(obj);
            GeneratedMessageLite generatedMessageLiteBuild2 = ((AppSettings.Builder) appSettings.toBuilder()).addStaticHost((StaticHost) ((StaticHost.Builder) ((StaticHost) obj).toBuilder()).setRawID(this.$workstationID).setCreatedAt(P3.f.d()).setUpdatedAt(P3.f.d()).build()).build();
            t.d(generatedMessageLiteBuild2);
            return (AppSettings) generatedMessageLiteBuild2;
        }
        r.b(obj);
        AppSettings appSettings3 = (AppSettings) this.L$0;
        List<StaticHost> staticHostList = appSettings3.getStaticHostList();
        t.f(staticHostList, "getStaticHostList(...)");
        String str = this.$workstationID;
        Iterator<StaticHost> it = staticHostList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            }
            StaticHost next = it.next();
            t.d(next);
            if (i.d(P3.f.g(next), str)) {
                i8 = i11;
                break;
            }
            i11++;
        }
        if (i8 >= 0) {
            o oVar = this.$updater;
            StaticHost staticHost = appSettings3.getStaticHostList().get(i8);
            t.f(staticHost, "get(...)");
            this.L$0 = appSettings3;
            this.I$0 = i8;
            this.label = 1;
            Object objInvoke = oVar.invoke(staticHost, this);
            if (objInvoke != objF) {
                i9 = i8;
                appSettings2 = appSettings3;
                obj = objInvoke;
                GeneratedMessageLite generatedMessageLiteBuild3 = ((AppSettings.Builder) appSettings2.toBuilder()).setStaticHost(i9, (StaticHost) ((StaticHost.Builder) ((StaticHost) obj).toBuilder()).setRawID(this.$workstationID).setUpdatedAt(P3.f.d()).build()).build();
                t.d(generatedMessageLiteBuild3);
                return (AppSettings) generatedMessageLiteBuild3;
            }
        } else {
            o oVar2 = this.$updater;
            StaticHost defaultInstance = StaticHost.getDefaultInstance();
            t.f(defaultInstance, "getDefaultInstance(...)");
            this.L$0 = appSettings3;
            this.label = 2;
            Object objInvoke2 = oVar2.invoke(defaultInstance, this);
            if (objInvoke2 != objF) {
                appSettings = appSettings3;
                obj = objInvoke2;
                GeneratedMessageLite generatedMessageLiteBuild4 = ((AppSettings.Builder) appSettings.toBuilder()).addStaticHost((StaticHost) ((StaticHost.Builder) ((StaticHost) obj).toBuilder()).setRawID(this.$workstationID).setCreatedAt(P3.f.d()).setUpdatedAt(P3.f.d()).build()).build();
                t.d(generatedMessageLiteBuild4);
                return (AppSettings) generatedMessageLiteBuild4;
            }
        }
        return objF;
    }
}
