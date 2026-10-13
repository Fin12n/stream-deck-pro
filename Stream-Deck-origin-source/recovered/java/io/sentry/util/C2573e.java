package io.sentry.util;

import io.sentry.C2557s2;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: io.sentry.util.e, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class C2573e {
    public static boolean a(List list, C2557s2 c2557s2) {
        if (c2557s2 != null && list != null && !list.isEmpty()) {
            HashSet hashSet = new HashSet();
            io.sentry.protocol.j jVarR0 = c2557s2.r0();
            if (jVarR0 != null) {
                String strE = jVarR0.e();
                if (strE != null) {
                    hashSet.add(strE);
                }
                String strD = jVarR0.d();
                if (strD != null) {
                    hashSet.add(strD);
                }
            }
            Throwable thO = c2557s2.O();
            if (thO != null) {
                hashSet.add(thO.toString());
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (hashSet.contains(((io.sentry.F) it.next()).a())) {
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                io.sentry.F f8 = (io.sentry.F) it2.next();
                Iterator it3 = hashSet.iterator();
                while (it3.hasNext()) {
                    if (f8.b((String) it3.next())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
