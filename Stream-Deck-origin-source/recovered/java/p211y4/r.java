package p211y4;

import S4.l;
import com.google.android.gms.common.api.Status;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;
import p063h.s;
import p203x4.b;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f38418a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f38419b = Collections.synchronizedMap(new WeakHashMap());

    public final void b(l lVar, boolean z8) {
        this.f38419b.put(lVar, Boolean.valueOf(z8));
        lVar.a().b(new C3116q(this, lVar));
    }

    public final void c(int i8, String str) {
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i8 == 1) {
            sb.append(" due to service disconnection.");
        } else if (i8 == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        f(true, new Status(20, sb.toString()));
    }

    public final void d() {
        f(false, C3104e.f38358p);
    }

    public final boolean e() {
        return (this.f38418a.isEmpty() && this.f38419b.isEmpty()) ? false : true;
    }

    public final void f(boolean z8, Status status) {
        HashMap map;
        HashMap map2;
        synchronized (this.f38418a) {
            map = new HashMap(this.f38418a);
        }
        synchronized (this.f38419b) {
            map2 = new HashMap(this.f38419b);
        }
        for (Map.Entry entry : map.entrySet()) {
            if (z8 || ((Boolean) entry.getValue()).booleanValue()) {
                s.a(entry.getKey());
                throw null;
            }
        }
        for (Map.Entry entry2 : map2.entrySet()) {
            if (z8 || ((Boolean) entry2.getValue()).booleanValue()) {
                ((l) entry2.getKey()).d(new b(status));
            }
        }
    }
}
