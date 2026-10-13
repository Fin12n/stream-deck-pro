package V3;

import D6.C0934n;
import D6.r;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final e f10671a = new e();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static List f10672b = r.n();

    public final void a(List list) {
        t.g(list, "<set-?>");
        f10672b = list;
    }

    public final void b(i event) {
        t.g(event, "event");
        for (k kVar : f10672b) {
            Iterator it = event.a().iterator();
            while (it.hasNext()) {
                kVar.a((j) it.next());
            }
        }
    }

    public final void c(j... events) {
        t.g(events, "events");
        b(new i((List<? extends j>) C0934n.r0(events)));
    }
}
