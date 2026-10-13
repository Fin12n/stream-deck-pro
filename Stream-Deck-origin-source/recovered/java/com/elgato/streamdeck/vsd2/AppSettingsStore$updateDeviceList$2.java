package com.elgato.streamdeck.vsd2;

import C6.G;
import C6.r;
import D6.U;
import D6.z;
import I6.l;
import P3.i;
import Q6.o;
import com.elgato.vsd2.Messages;
import com.google.mlkit.common.internal.ckI.WqXA;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Timestamp;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
@I6.f(c = "com.elgato.streamdeck.vsd2.AppSettingsStore$updateDeviceList$2", f = "AppSettingsStore.kt", l = {}, m = "invokeSuspend")
public final class AppSettingsStore$updateDeviceList$2 extends l implements o {
    final /* synthetic */ List<Messages.VirtualDevice> $list;
    final /* synthetic */ String $workstationID;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppSettingsStore$updateDeviceList$2(List<Messages.VirtualDevice> list, String str, G6.d<? super AppSettingsStore$updateDeviceList$2> dVar) {
        super(2, dVar);
        this.$list = list;
        this.$workstationID = str;
    }

    @Override // I6.a
    public final G6.d<G> create(Object obj, G6.d<?> dVar) {
        AppSettingsStore$updateDeviceList$2 appSettingsStore$updateDeviceList$2 = new AppSettingsStore$updateDeviceList$2(this.$list, this.$workstationID, dVar);
        appSettingsStore$updateDeviceList$2.L$0 = obj;
        return appSettingsStore$updateDeviceList$2;
    }

    @Override // Q6.o
    public final Object invoke(AppSettings appSettings, G6.d<? super AppSettings> dVar) {
        return ((AppSettingsStore$updateDeviceList$2) create(appSettings, dVar)).invokeSuspend(G.f1419a);
    }

    @Override // I6.a
    public final Object invokeSuspend(Object obj) {
        Messages.VirtualDevice virtualDevice;
        Messages.VirtualDevice virtualDevice2;
        H6.c.f();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        r.b(obj);
        AppSettings appSettings = (AppSettings) this.L$0;
        List<KnownHost> knownHostsList = appSettings.getKnownHostsList();
        t.f(knownHostsList, "getKnownHostsList(...)");
        String str = this.$workstationID;
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
        Integer numD = I6.b.d(i8);
        if (numD.intValue() < 0) {
            numD = null;
        }
        if (numD == null) {
            return appSettings;
        }
        int iIntValue = numD.intValue();
        KnownHost knownHost = appSettings.getKnownHostsList().get(iIntValue);
        List<Messages.VirtualDevice> list = this.$list;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it2 = list.iterator();
        while (it2.hasNext()) {
            linkedHashSet.add(((Messages.VirtualDevice) it2.next()).getId());
        }
        List<KnownHost.Device> devicesList = knownHost.getDevicesList();
        String str2 = WqXA.txe;
        t.f(devicesList, str2);
        LinkedHashSet linkedHashSet2 = new LinkedHashSet();
        for (KnownHost.Device device : devicesList) {
            t.d(device);
            linkedHashSet2.add(P3.f.e(device));
        }
        Set<String> setH = U.h(linkedHashSet, linkedHashSet2);
        Set<String> setN0 = z.n0(linkedHashSet2, linkedHashSet);
        Set<String> setH2 = U.h(linkedHashSet2, linkedHashSet);
        KnownHost.Builder builder = (KnownHost.Builder) knownHost.toBuilder();
        Timestamp timestampD = P3.f.d();
        for (String str3 : setH) {
            Iterator<T> it3 = this.$list.iterator();
            do {
                if (!it3.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                virtualDevice2 = (Messages.VirtualDevice) it3.next();
            } while (!t.c(virtualDevice2.getId(), str3));
            KnownHost.Device.Builder builderNewBuilder = KnownHost.Device.newBuilder();
            t.f(builderNewBuilder, "newBuilder(...)");
            builder.addDevices(P3.f.o(builderNewBuilder).setRawID(str3).setRawWorkstationID(this.$workstationID).setCreatedAt(timestampD).setUpdatedAt(timestampD).setDisplayName(virtualDevice2.getName()));
        }
        for (String str4 : setN0) {
            Iterator<T> it4 = this.$list.iterator();
            do {
                if (!it4.hasNext()) {
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                virtualDevice = (Messages.VirtualDevice) it4.next();
            } while (!t.c(virtualDevice.getId(), str4));
            List<KnownHost.Device> devicesList2 = builder.getDevicesList();
            t.f(devicesList2, str2);
            Iterator<KnownHost.Device> it5 = devicesList2.iterator();
            int i9 = 0;
            while (true) {
                if (!it5.hasNext()) {
                    i9 = -1;
                    break;
                }
                if (t.c(it5.next().getRawID(), str4)) {
                    break;
                }
                i9++;
            }
            if (!t.c(builder.getDevicesList().get(i9).getDisplayName(), virtualDevice.getName())) {
                builder.setDevices(i9, (KnownHost.Device) ((KnownHost.Device.Builder) builder.getDevicesList().get(i9).toBuilder()).setDisplayName(virtualDevice.getName()).setUpdatedAt(timestampD).build());
            }
        }
        for (String str5 : setH2) {
            List<KnownHost.Device> devicesList3 = builder.getDevicesList();
            t.f(devicesList3, str2);
            Iterator<KnownHost.Device> it6 = devicesList3.iterator();
            int i10 = 0;
            while (true) {
                if (!it6.hasNext()) {
                    i10 = -1;
                    break;
                }
                if (t.c(it6.next().getRawID(), str5)) {
                    break;
                }
                i10++;
            }
            Integer numD2 = I6.b.d(i10);
            if (numD2.intValue() < 0) {
                numD2 = null;
            }
            if (numD2 != null) {
                builder.removeDevices(numD2.intValue());
            }
        }
        GeneratedMessageLite generatedMessageLiteBuild = ((AppSettings.Builder) appSettings.toBuilder()).setKnownHosts(iIntValue, builder).build();
        t.f(generatedMessageLiteBuild, "build(...)");
        return generatedMessageLiteBuild;
    }
}
