package N3;

import C6.v;
import com.elgato.streamdeck.vsd2.KnownHost;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class h {
    public static final V3.h.a a(f.a eventAuthenticateSucceeded, String workstationID) {
        t.g(eventAuthenticateSucceeded, "$this$eventAuthenticateSucceeded");
        t.g(workstationID, "workstationID");
        return new V3.h.a(V3.c.b.SUCCEEDED_AUTHENTICATION.b(), new C6.o[]{v.a("workstation_id", workstationID)}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a b(f.a eventAuthenticateWithWorkstation, String workstationID) {
        t.g(eventAuthenticateWithWorkstation, "$this$eventAuthenticateWithWorkstation");
        t.g(workstationID, "workstationID");
        return new V3.h.a(V3.c.b.REQUESTED_AUTHENTICATION.b(), new C6.o[]{v.a("workstation_id", workstationID)}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a c(f.a eventCancelAuthenticate, String workstationID) {
        t.g(eventCancelAuthenticate, "$this$eventCancelAuthenticate");
        t.g(workstationID, "workstationID");
        return new V3.h.a(V3.c.b.CANCELLED_AUTHENTICATION.b(), new C6.o[]{v.a("workstation_id", workstationID)}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a d(f.a eventCreateDefaultVirtualDevice, String str) {
        t.g(eventCreateDefaultVirtualDevice, "$this$eventCreateDefaultVirtualDevice");
        String strB = V3.c.b.CREATE_DEFAULT_VIRTUAL_DEVICE.b();
        if (str == null) {
            str = "-1";
        }
        return new V3.h.a(strB, new C6.o[]{v.a("workstation_id", str)}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a e(f.a eventCreateVirtualDevice, String str) {
        t.g(eventCreateVirtualDevice, "$this$eventCreateVirtualDevice");
        String strB = V3.c.b.CREATE_VIRTUAL_DEVICE.b();
        if (str == null) {
            str = "-1";
        }
        return new V3.h.a(strB, new C6.o[]{v.a("workstation_id", str)}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a f(f.a aVar) {
        t.g(aVar, "<this>");
        return new V3.h.a(V3.c.b.DISCOVERY_START.b(), new C6.o[]{v.a("screen_name", V3.c.d.DISCOVERY.b())}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a g(f.a aVar, List hosts) {
        t.g(aVar, "<this>");
        t.g(hosts, "hosts");
        ArrayList arrayList = new ArrayList();
        for (Object obj : hosts) {
            if (((f.b) obj).m() != null) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : hosts) {
            f.b bVar = (f.b) obj2;
            if (bVar.m() != null && bVar.t()) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj3 : hosts) {
            if (((f.b) obj3).m() == null) {
                arrayList3.add(obj3);
            }
        }
        Iterator it = arrayList.iterator();
        int size = 0;
        int size2 = 0;
        while (it.hasNext()) {
            size2 += ((f.b) it.next()).d().size();
        }
        String strB = V3.c.b.DISCOVERY_STOP.b();
        C6.o oVarA = v.a("screen_name", V3.c.d.DISCOVERY.b());
        C6.o oVarA2 = v.a("number_of_known_hosts", String.valueOf(arrayList.size()));
        C6.o oVarA3 = v.a("total_number_of_virtual_devices", String.valueOf(size2));
        C6.o oVarA4 = v.a("number_of_reachable_known_hosts", String.valueOf(arrayList2.size()));
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            size += ((f.b) it2.next()).d().size();
        }
        return new V3.h.a(strB, new C6.o[]{oVarA, oVarA2, oVarA3, oVarA4, v.a("total_number_of_reachable_virtual_devices", String.valueOf(size)), v.a("number_of_unknown_hosts", String.valueOf(arrayList3.size()))}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a h(f.a aVar, KnownHost.Device device) {
        t.g(aVar, "<this>");
        t.g(device, "device");
        String strB = V3.c.b.OPEN_VIRTUAL_DEVICE.b();
        String strH = P3.f.h(device);
        if (strH == null) {
            strH = "-1";
        }
        C6.o oVarA = v.a("device_id", strH);
        String strJ = P3.f.j(device);
        return new V3.h.a(strB, new C6.o[]{oVarA, v.a("workstation_id", strJ != null ? strJ : "-1")}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final V3.h.a i(f.a eventRejectedAuthenticate, String workstationID) {
        t.g(eventRejectedAuthenticate, "$this$eventRejectedAuthenticate");
        t.g(workstationID, "workstationID");
        return new V3.h.a(V3.c.b.REJECTED_AUTHENTICATION.b(), new C6.o[]{v.a("workstation_id", workstationID)}, (V3.a) null, 4, (AbstractC2633k) null);
    }

    public static final boolean j(f.c cVar) {
        return t.c(cVar != null ? cVar.a() : null, f.d.b.f5880a);
    }
}
