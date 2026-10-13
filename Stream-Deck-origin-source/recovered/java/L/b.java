package L;

import A.T0;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Collection f4734a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Collection f4735b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f4736c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f4737d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final List f4738e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final U.g f4739f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final T0 f4740g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f4741h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final l f4742i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final l f4743j;

    public b(Collection<? extends T0> appUseCases, Collection<? extends T0> cameraUseCases, List<? extends T0> cameraUseCasesToAttach, List<? extends T0> cameraUseCasesToKeep, List<? extends T0> cameraUseCasesToDetach, U.g gVar, T0 t8, Map<T0, ? extends f.b> useCaseConfigs, l primaryStreamSpecResult, l lVar) {
        t.g(appUseCases, "appUseCases");
        t.g(cameraUseCases, "cameraUseCases");
        t.g(cameraUseCasesToAttach, "cameraUseCasesToAttach");
        t.g(cameraUseCasesToKeep, "cameraUseCasesToKeep");
        t.g(cameraUseCasesToDetach, "cameraUseCasesToDetach");
        t.g(useCaseConfigs, "useCaseConfigs");
        t.g(primaryStreamSpecResult, "primaryStreamSpecResult");
        this.f4734a = appUseCases;
        this.f4735b = cameraUseCases;
        this.f4736c = cameraUseCasesToAttach;
        this.f4737d = cameraUseCasesToKeep;
        this.f4738e = cameraUseCasesToDetach;
        this.f4739f = gVar;
        this.f4740g = t8;
        this.f4741h = useCaseConfigs;
        this.f4742i = primaryStreamSpecResult;
        this.f4743j = lVar;
    }

    public final Collection a() {
        return this.f4734a;
    }

    public final Collection b() {
        return this.f4735b;
    }

    public final List c() {
        return this.f4736c;
    }

    public final List d() {
        return this.f4738e;
    }

    public final List e() {
        return this.f4737d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return t.c(this.f4734a, bVar.f4734a) && t.c(this.f4735b, bVar.f4735b) && t.c(this.f4736c, bVar.f4736c) && t.c(this.f4737d, bVar.f4737d) && t.c(this.f4738e, bVar.f4738e) && t.c(this.f4739f, bVar.f4739f) && t.c(this.f4740g, bVar.f4740g) && t.c(this.f4741h, bVar.f4741h) && t.c(this.f4742i, bVar.f4742i) && t.c(this.f4743j, bVar.f4743j);
    }

    public final T0 f() {
        return this.f4740g;
    }

    public final l g() {
        return this.f4742i;
    }

    public final l h() {
        return this.f4743j;
    }

    public int hashCode() {
        int iHashCode = ((((((((this.f4734a.hashCode() * 31) + this.f4735b.hashCode()) * 31) + this.f4736c.hashCode()) * 31) + this.f4737d.hashCode()) * 31) + this.f4738e.hashCode()) * 31;
        U.g gVar = this.f4739f;
        int iHashCode2 = (iHashCode + (gVar == null ? 0 : gVar.hashCode())) * 31;
        T0 t8 = this.f4740g;
        int iHashCode3 = (((((iHashCode2 + (t8 == null ? 0 : t8.hashCode())) * 31) + this.f4741h.hashCode()) * 31) + this.f4742i.hashCode()) * 31;
        l lVar = this.f4743j;
        return iHashCode3 + (lVar != null ? lVar.hashCode() : 0);
    }

    public final U.g i() {
        return this.f4739f;
    }

    public final Map j() {
        return this.f4741h;
    }

    public String toString() {
        return "CalculatedUseCaseInfo(appUseCases=" + this.f4734a + ", cameraUseCases=" + this.f4735b + ", cameraUseCasesToAttach=" + this.f4736c + ", cameraUseCasesToKeep=" + this.f4737d + ", cameraUseCasesToDetach=" + this.f4738e + ", streamSharing=" + this.f4739f + ", placeholderForExtensions=" + this.f4740g + ", useCaseConfigs=" + this.f4741h + ", primaryStreamSpecResult=" + this.f4742i + ", secondaryStreamSpecResult=" + this.f4743j + ')';
    }
}
