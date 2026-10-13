package N4;

import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public abstract class K implements InterfaceC1319v0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public transient Set f6325a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public transient Map f6326b;

    @Override // N4.InterfaceC1319v0
    public final Set c() {
        Set set = this.f6325a;
        if (set != null) {
            return set;
        }
        Set setF = f();
        this.f6325a = setF;
        return setF;
    }

    @Override // N4.InterfaceC1319v0
    public final Map d() {
        Map map = this.f6326b;
        if (map != null) {
            return map;
        }
        Map mapE = e();
        this.f6326b = mapE;
        return mapE;
    }

    public abstract Map e();

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof InterfaceC1319v0) {
            return d().equals(((InterfaceC1319v0) obj).d());
        }
        return false;
    }

    public abstract Set f();

    public final int hashCode() {
        return d().hashCode();
    }

    public final String toString() {
        return d().toString();
    }
}
