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

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$createOrUpdateKnownHost$settings$1", f = "AppSettingsStore.kt", l = {159, 169}, m = "invokeSuspend")
public final class AppSettingsStore$createOrUpdateKnownHost$settings$1 extends l implements o {
    final /* synthetic */ String $id;
    final /* synthetic */ o $updater;
    int I$0;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSettingsStore$createOrUpdateKnownHost$settings$1(o oVar, String str, G6.d<? super AppSettingsStore$createOrUpdateKnownHost$settings$1> dVar) {
        super(2, dVar);
        this.$updater = oVar;
        this.$id = str;
    }

    @Override // I6.a
    public final G6.d<G> create(Object obj, G6.d<?> dVar) {
        AppSettingsStore$createOrUpdateKnownHost$settings$1 appSettingsStore$createOrUpdateKnownHost$settings$1 = new AppSettingsStore$createOrUpdateKnownHost$settings$1(this.$updater, this.$id, dVar);
        appSettingsStore$createOrUpdateKnownHost$settings$1.L$0 = obj;
        return appSettingsStore$createOrUpdateKnownHost$settings$1;
    }

    @Override // Q6.o
    public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
        return ((AppSettingsStore$createOrUpdateKnownHost$settings$1) create(appSettings, dVar)).invokeSuspend(G.f1419a);
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
                GeneratedMessageLite generatedMessageLiteBuild = ((AppSettings.Builder) appSettings2.toBuilder()).setKnownHosts(i9, (KnownHost) ((KnownHost.Builder) ((KnownHost) obj).toBuilder()).setRawID(this.$id).setUpdatedAt(P3.f.d()).build()).build();
                t.d(generatedMessageLiteBuild);
                return (AppSettings) generatedMessageLiteBuild;
            }
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            appSettings = (AppSettings) this.L$0;
            r.b(obj);
            GeneratedMessageLite generatedMessageLiteBuild2 = ((AppSettings.Builder) appSettings.toBuilder()).addKnownHosts((KnownHost) ((KnownHost.Builder) ((KnownHost) obj).toBuilder()).setRawID(this.$id).setCreatedAt(P3.f.d()).setUpdatedAt(P3.f.d()).build()).build();
            t.d(generatedMessageLiteBuild2);
            return (AppSettings) generatedMessageLiteBuild2;
        }
        r.b(obj);
        AppSettings appSettings3 = (AppSettings) this.L$0;
        List<KnownHost> knownHostsList = appSettings3.getKnownHostsList();
        t.f(knownHostsList, "getKnownHostsList(...)");
        String str = this.$id;
        Iterator<KnownHost> it = knownHostsList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i8 = -1;
                break;
            }
            KnownHost next = it.next();
            t.d(next);
            if (i.d(P3.f.f(next), str)) {
                i8 = i11;
                break;
            }
            i11++;
        }
        if (i8 >= 0) {
            o oVar = this.$updater;
            KnownHost knownHost = appSettings3.getKnownHostsList().get(i8);
            t.f(knownHost, "get(...)");
            this.L$0 = appSettings3;
            this.I$0 = i8;
            this.label = 1;
            Object objInvoke = oVar.invoke(knownHost, this);
            if (objInvoke != objF) {
                i9 = i8;
                appSettings2 = appSettings3;
                obj = objInvoke;
                GeneratedMessageLite generatedMessageLiteBuild3 = ((AppSettings.Builder) appSettings2.toBuilder()).setKnownHosts(i9, (KnownHost) ((KnownHost.Builder) ((KnownHost) obj).toBuilder()).setRawID(this.$id).setUpdatedAt(P3.f.d()).build()).build();
                t.d(generatedMessageLiteBuild3);
                return (AppSettings) generatedMessageLiteBuild3;
            }
        } else {
            o oVar2 = this.$updater;
            KnownHost defaultInstance = KnownHost.getDefaultInstance();
            t.f(defaultInstance, "getDefaultInstance(...)");
            this.L$0 = appSettings3;
            this.label = 2;
            Object objInvoke2 = oVar2.invoke(defaultInstance, this);
            if (objInvoke2 != objF) {
                appSettings = appSettings3;
                obj = objInvoke2;
                GeneratedMessageLite generatedMessageLiteBuild4 = ((AppSettings.Builder) appSettings.toBuilder()).addKnownHosts((KnownHost) ((KnownHost.Builder) ((KnownHost) obj).toBuilder()).setRawID(this.$id).setCreatedAt(P3.f.d()).setUpdatedAt(P3.f.d()).build()).build();
                t.d(generatedMessageLiteBuild4);
                return (AppSettings) generatedMessageLiteBuild4;
            }
        }
        return objF;
    }
}
