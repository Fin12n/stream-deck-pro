package X2;

import V2.b;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.t;
import p063h.s;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final a f11657a = new a();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final R2.a f11658b = new R2.a();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f11659c = R2.a.f9486b;

    public final void a(b navigator) {
        t.g(navigator, "navigator");
        R2.a aVar = (R2.a) f11658b.remove(navigator.i());
        if (aVar != null) {
            Iterator it = aVar.entrySet().iterator();
            if (it.hasNext()) {
                s.a(((Map.Entry) it.next()).getValue());
                throw null;
            }
        }
    }
}
