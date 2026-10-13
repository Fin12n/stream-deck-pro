package io.sentry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: io.sentry.w, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2581w implements C {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f27791a = Collections.synchronizedMap(new WeakHashMap());

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final J2 f27792b;

    public C2581w(J2 j8) {
        this.f27792b = (J2) io.sentry.util.u.c(j8, "options are required");
    }

    public static List a(Throwable th) {
        ArrayList arrayList = new ArrayList();
        while (th.getCause() != null) {
            arrayList.add(th.getCause());
            th = th.getCause();
        }
        return arrayList;
    }

    public static boolean d(Map map, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            if (map.containsKey(it.next())) {
                return true;
            }
        }
        return false;
    }

    @Override // io.sentry.C
    public C2557s2 c(C2557s2 c2557s2, H h8) {
        if (!this.f27792b.isEnableDeduplication()) {
            this.f27792b.getLogger().c(EnumC2596z2.DEBUG, "Event deduplication is disabled.", new Object[0]);
            return c2557s2;
        }
        Throwable thO = c2557s2.O();
        if (thO == null) {
            return c2557s2;
        }
        if (this.f27791a.containsKey(thO) || d(this.f27791a, a(thO))) {
            this.f27792b.getLogger().c(EnumC2596z2.DEBUG, "Duplicate Exception detected. Event %s will be discarded.", c2557s2.G());
            return null;
        }
        this.f27791a.put(thO, null);
        return c2557s2;
    }
}
