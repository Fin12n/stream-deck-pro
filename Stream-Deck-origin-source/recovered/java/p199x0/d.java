package p199x0;

import D6.r;
import D6.z;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f37185a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f37186b;

    /* JADX WARN: Multi-variable type inference failed */
    public d() {
        this(false, null, 3, 0 == true ? 1 : 0);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f37185a == dVar.f37185a && t.c(this.f37186b, dVar.f37186b);
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f37185a) * 31) + this.f37186b.hashCode();
    }

    public String toString() {
        return "Posture(isTabletop=" + this.f37185a + ", hinges=[" + z.r0(this.f37186b, ", ", null, null, 0, null, null, 62, null) + "])";
    }

    public d(boolean z8, List<c> list) {
        this.f37185a = z8;
        this.f37186b = list;
    }

    public /* synthetic */ d(boolean z8, List list, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? r.n() : list);
    }
}
