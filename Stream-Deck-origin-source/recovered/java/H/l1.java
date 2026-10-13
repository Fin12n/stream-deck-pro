package H;

import R0.pkXL.Oitvkwcwn;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class l1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Map f3116a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3117b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f3118c;

    public final Map a() {
        return this.f3116a;
    }

    public final Map b() {
        return this.f3117b;
    }

    public final int c() {
        return this.f3118c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1)) {
            return false;
        }
        l1 l1Var = (l1) obj;
        return kotlin.jvm.internal.t.c(this.f3116a, l1Var.f3116a) && kotlin.jvm.internal.t.c(this.f3117b, l1Var.f3117b) && this.f3118c == l1Var.f3118c;
    }

    public int hashCode() {
        return (((this.f3116a.hashCode() * 31) + this.f3117b.hashCode()) * 31) + Integer.hashCode(this.f3118c);
    }

    public String toString() {
        return "SurfaceStreamSpecQueryResult(useCaseStreamSpecs=" + this.f3116a + ", attachedSurfaceStreamSpecs=" + this.f3117b + ", maxSupportedFrameRate=" + this.f3118c + ')';
    }

    public l1(Map<u1, ? extends g1> map, Map<AbstractC0977f, ? extends g1> attachedSurfaceStreamSpecs, int i8) {
        kotlin.jvm.internal.t.g(map, Oitvkwcwn.lScIqWIG);
        kotlin.jvm.internal.t.g(attachedSurfaceStreamSpecs, "attachedSurfaceStreamSpecs");
        this.f3116a = map;
        this.f3117b = attachedSurfaceStreamSpecs;
        this.f3118c = i8;
    }
}
