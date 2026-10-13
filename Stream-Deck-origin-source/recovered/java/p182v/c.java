package p182v;

import A.J;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public abstract class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final Map f34930a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Map f34931b;

    static {
        HashMap map = new HashMap();
        f34930a = map;
        HashMap map2 = new HashMap();
        f34931b = map2;
        J j8 = J.f88d;
        map.put(1L, j8);
        map2.put(j8, Collections.singletonList(1L));
        map.put(2L, J.f90f);
        map2.put((J) map.get(2L), Collections.singletonList(2L));
        J j9 = J.f91g;
        map.put(4L, j9);
        map2.put(j9, Collections.singletonList(4L));
        J j10 = J.f92h;
        map.put(8L, j10);
        map2.put(j10, Collections.singletonList(8L));
        List listAsList = Arrays.asList(64L, 128L, 16L, 32L);
        Iterator it = listAsList.iterator();
        while (it.hasNext()) {
            f34930a.put((Long) it.next(), J.f93i);
        }
        f34931b.put(J.f93i, listAsList);
        List listAsList2 = Arrays.asList(1024L, 2048L, 256L, 512L);
        Iterator it2 = listAsList2.iterator();
        while (it2.hasNext()) {
            f34930a.put((Long) it2.next(), J.f94j);
        }
        f34931b.put(J.f94j, listAsList2);
    }

    public static Long a(J j8, DynamicRangeProfiles dynamicRangeProfiles) {
        List<Long> list = (List) f34931b.get(j8);
        if (list == null) {
            return null;
        }
        Set<Long> supportedProfiles = dynamicRangeProfiles.getSupportedProfiles();
        for (Long l8 : list) {
            if (supportedProfiles.contains(l8)) {
                return l8;
            }
        }
        return null;
    }

    public static J b(long j8) {
        return (J) f34930a.get(Long.valueOf(j8));
    }
}
