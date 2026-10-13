package M5;

import p115m6.C2691a;
import p115m6.InterfaceC2692b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class l {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final C2691a f5678a = new C2691a("ApplicationPluginRegistry");

    public static final C2691a a() {
        return f5678a;
    }

    public static final Object b(G5.a aVar, k plugin) {
        kotlin.jvm.internal.t.g(aVar, "<this>");
        kotlin.jvm.internal.t.g(plugin, "plugin");
        Object objC = c(aVar, plugin);
        if (objC != null) {
            return objC;
        }
        throw new IllegalStateException("Plugin " + plugin + " is not installed. Consider using `install(" + plugin.getKey() + ")` in client config first.");
    }

    public static final Object c(G5.a aVar, k plugin) {
        kotlin.jvm.internal.t.g(aVar, "<this>");
        kotlin.jvm.internal.t.g(plugin, "plugin");
        InterfaceC2692b interfaceC2692b = (InterfaceC2692b) aVar.getAttributes().e(f5678a);
        if (interfaceC2692b != null) {
            return interfaceC2692b.e(plugin.getKey());
        }
        return null;
    }
}
