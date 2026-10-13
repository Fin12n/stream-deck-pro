package com.elgato.streamdeck.vsd2;

import C6.G;
import C6.r;
import I6.l;
import P2.Lsk.mHPawN;
import P3.i;
import Q6.o;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$createOrUpdateDevice$settings$1", f = "AppSettingsStore.kt", l = {260, 271}, m = "invokeSuspend")
public final class AppSettingsStore$createOrUpdateDevice$settings$1 extends l implements o {
    final /* synthetic */ KnownHost.Device $default;
    final /* synthetic */ String $deviceID;
    final /* synthetic */ o $updater;
    final /* synthetic */ String $workstationID;
    int I$0;
    int I$1;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSettingsStore$createOrUpdateDevice$settings$1(o oVar, String str, String str2, KnownHost.Device device, G6.d<? super AppSettingsStore$createOrUpdateDevice$settings$1> dVar) {
        super(2, dVar);
        this.$updater = oVar;
        this.$deviceID = str;
        this.$workstationID = str2;
        this.$default = device;
    }

    @Override // I6.a
    public final G6.d<G> create(Object obj, G6.d<?> dVar) {
        AppSettingsStore$createOrUpdateDevice$settings$1 appSettingsStore$createOrUpdateDevice$settings$1 = new AppSettingsStore$createOrUpdateDevice$settings$1(this.$updater, this.$deviceID, this.$workstationID, this.$default, dVar);
        appSettingsStore$createOrUpdateDevice$settings$1.L$0 = obj;
        return appSettingsStore$createOrUpdateDevice$settings$1;
    }

    @Override // Q6.o
    public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
        return ((AppSettingsStore$createOrUpdateDevice$settings$1) create(appSettings, dVar)).invokeSuspend(G.f1419a);
    }

    @Override // I6.a
    public final Object invokeSuspend(Object obj) {
        int iIntValue;
        AppSettings appSettings;
        int i8;
        KnownHost knownHost;
        Timestamp timestamp;
        KnownHost knownHost2;
        int i9;
        AppSettings appSettings2;
        Timestamp timestamp2;
        Object objF = H6.c.f();
        int i10 = this.label;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    i8 = this.I$0;
                    timestamp = (Timestamp) this.L$2;
                    knownHost = (KnownHost) this.L$1;
                    appSettings = (AppSettings) this.L$0;
                    r.b(obj);
                    GeneratedMessageLite generatedMessageLiteBuild = ((AppSettings.Builder) appSettings.toBuilder()).setKnownHosts(i8, ((KnownHost.Builder) knownHost.toBuilder()).addDevices((KnownHost.Device) ((KnownHost.Device.Builder) ((KnownHost.Device) obj).toBuilder()).setRawID(this.$deviceID).setRawWorkstationID(this.$workstationID).setCreatedAt(timestamp).setUpdatedAt(timestamp).build())).build();
                    t.d(generatedMessageLiteBuild);
                    return (AppSettings) generatedMessageLiteBuild;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i9 = this.I$1;
            iIntValue = this.I$0;
            timestamp2 = (Timestamp) this.L$2;
            knownHost2 = (KnownHost) this.L$1;
            appSettings2 = (AppSettings) this.L$0;
            r.b(obj);
            GeneratedMessageLite generatedMessageLiteBuild2 = ((AppSettings.Builder) appSettings2.toBuilder()).setKnownHosts(iIntValue, ((KnownHost.Builder) knownHost2.toBuilder()).setDevices(i9, (KnownHost.Device) ((KnownHost.Device.Builder) ((KnownHost.Device) obj).toBuilder()).setRawID(this.$deviceID).setRawWorkstationID(this.$workstationID).setUpdatedAt(timestamp2).build())).build();
            t.d(generatedMessageLiteBuild2);
            return (AppSettings) generatedMessageLiteBuild2;
        }
        r.b(obj);
        AppSettings appSettings3 = (AppSettings) this.L$0;
        List<KnownHost> knownHostsList = appSettings3.getKnownHostsList();
        t.f(knownHostsList, "getKnownHostsList(...)");
        String str = this.$workstationID;
        Iterator<KnownHost> it = knownHostsList.iterator();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (it.hasNext()) {
                KnownHost next = it.next();
                t.d(next);
                if (i.d(P3.f.f(next), str)) {
                    break;
                }
                i12++;
            } else {
                i12 = -1;
                break;
            }
        }
        Integer numD = I6.b.d(i12);
        if (numD.intValue() < 0) {
            numD = null;
        }
        if (numD != null) {
            iIntValue = numD.intValue();
            KnownHost knownHost3 = appSettings3.getKnownHostsList().get(iIntValue);
            List<KnownHost.Device> devicesList = knownHost3.getDevicesList();
            t.f(devicesList, mHPawN.uhIKuhYZlIZUXbC);
            String str2 = this.$deviceID;
            Iterator<KnownHost.Device> it2 = devicesList.iterator();
            while (true) {
                if (it2.hasNext()) {
                    KnownHost.Device next2 = it2.next();
                    t.d(next2);
                    if (P3.b.d(P3.f.e(next2), str2)) {
                        break;
                    }
                    i11++;
                } else {
                    i11 = -1;
                    break;
                }
            }
            Timestamp timestampD = P3.f.d();
            if (i11 >= 0) {
                o oVar = this.$updater;
                KnownHost.Device device = knownHost3.getDevicesList().get(i11);
                t.f(device, "get(...)");
                this.L$0 = appSettings3;
                this.L$1 = knownHost3;
                this.L$2 = timestampD;
                this.I$0 = iIntValue;
                this.I$1 = i11;
                this.label = 1;
                Object objInvoke = oVar.invoke(device, this);
                if (objInvoke != objF) {
                    knownHost2 = knownHost3;
                    i9 = i11;
                    appSettings2 = appSettings3;
                    obj = objInvoke;
                    timestamp2 = timestampD;
                    GeneratedMessageLite generatedMessageLiteBuild3 = ((AppSettings.Builder) appSettings2.toBuilder()).setKnownHosts(iIntValue, ((KnownHost.Builder) knownHost2.toBuilder()).setDevices(i9, (KnownHost.Device) ((KnownHost.Device.Builder) ((KnownHost.Device) obj).toBuilder()).setRawID(this.$deviceID).setRawWorkstationID(this.$workstationID).setUpdatedAt(timestamp2).build())).build();
                    t.d(generatedMessageLiteBuild3);
                    return (AppSettings) generatedMessageLiteBuild3;
                }
            } else {
                o oVar2 = this.$updater;
                KnownHost.Device device2 = this.$default;
                this.L$0 = appSettings3;
                this.L$1 = knownHost3;
                this.L$2 = timestampD;
                this.I$0 = iIntValue;
                this.label = 2;
                Object objInvoke2 = oVar2.invoke(device2, this);
                if (objInvoke2 != objF) {
                    appSettings = appSettings3;
                    i8 = iIntValue;
                    obj = objInvoke2;
                    knownHost = knownHost3;
                    timestamp = timestampD;
                    GeneratedMessageLite generatedMessageLiteBuild4 = ((AppSettings.Builder) appSettings.toBuilder()).setKnownHosts(i8, ((KnownHost.Builder) knownHost.toBuilder()).addDevices((KnownHost.Device) ((KnownHost.Device.Builder) ((KnownHost.Device) obj).toBuilder()).setRawID(this.$deviceID).setRawWorkstationID(this.$workstationID).setCreatedAt(timestamp).setUpdatedAt(timestamp).build())).build();
                    t.d(generatedMessageLiteBuild4);
                    return (AppSettings) generatedMessageLiteBuild4;
                }
            }
            return objF;
        }
        return appSettings3;
    }
}
