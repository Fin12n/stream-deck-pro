package K2;

import D6.z;
import java.util.List;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class j {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final List f4597a;

    public j(List<? extends a> displayFeatures) {
        t.g(displayFeatures, "displayFeatures");
        this.f4597a = displayFeatures;
    }

    public final List a() {
        return this.f4597a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !t.c(j.class, obj.getClass())) {
            return false;
        }
        return t.c(this.f4597a, ((j) obj).f4597a);
    }

    public int hashCode() {
        return this.f4597a.hashCode();
    }

    public String toString() {
        return z.r0(this.f4597a, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, null, null, 56, null);
    }
}
