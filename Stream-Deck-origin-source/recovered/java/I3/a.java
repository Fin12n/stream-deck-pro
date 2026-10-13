package I3;

import com.amazon.device.simplesignin.a.LSJS.cFAYKUlMj;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f3771a = new a();

    public final String a(String hostname) {
        t.g(hostname, "hostname");
        return "virtual_device_add_(" + hostname + ")";
    }

    public final String b(String name) {
        t.g(name, "name");
        return "card_knownHost_" + name;
    }

    public final String c(String name) {
        t.g(name, "name");
        return "known_host_collapse_toggle(" + name + ")";
    }

    public final String e(String name) {
        t.g(name, "name");
        return "virtual_device(" + name + ")";
    }

    public final String f(String hostname, String deviceName) {
        t.g(hostname, "hostname");
        t.g(deviceName, "deviceName");
        return "virtual_device_info_(" + hostname + ")_(" + deviceName + ")";
    }

    public final String d(String name) {
        t.g(name, "name");
        return "unknown_host(" + name + cFAYKUlMj.fzqEROwlTQAcIfq;
    }
}
