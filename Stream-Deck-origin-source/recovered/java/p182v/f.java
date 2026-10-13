package p182v;

import A.AbstractC0890p0;
import A.J;
import android.hardware.camera2.params.DynamicRangeProfiles;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class f implements e.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final DynamicRangeProfiles f34933a;

    public f(Object obj) {
        this.f34933a = (DynamicRangeProfiles) obj;
    }

    public static Set e(Set set) {
        if (set.isEmpty()) {
            return Collections.EMPTY_SET;
        }
        HashSet hashSet = new HashSet(set.size());
        Iterator it = set.iterator();
        while (it.hasNext()) {
            J jF = f(((Long) it.next()).longValue());
            if (jF != null) {
                hashSet.add(jF);
            }
        }
        return Collections.unmodifiableSet(hashSet);
    }

    public static J f(long j8) {
        J jB = c.b(j8);
        if (jB == null) {
            AbstractC0890p0.l("DynamicRangesCompatApi33Impl", "Dynamic range profile cannot be converted to a DynamicRange object: " + j8);
        }
        return jB;
    }

    @Override // v.e.a
    public DynamicRangeProfiles a() {
        return this.f34933a;
    }

    @Override // v.e.a
    public Set b(J j8) {
        Long lD = d(j8);
        T1.f.b(lD != null, "DynamicRange is not supported: " + j8);
        return e(this.f34933a.getProfileCaptureRequestConstraints(lD.longValue()));
    }

    @Override // v.e.a
    public Set c() {
        return e(this.f34933a.getSupportedProfiles());
    }

    public final Long d(J j8) {
        return c.a(j8, this.f34933a);
    }
}
