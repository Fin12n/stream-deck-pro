package p122n4;

import java.util.Map;
import p147q4.a;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final a f30570a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f30571b;

    public b(a aVar, Map map) {
        if (aVar == null) {
            throw new NullPointerException("Null clock");
        }
        this.f30570a = aVar;
        if (map == null) {
            throw new NullPointerException("Null values");
        }
        this.f30571b = map;
    }

    @Override // p122n4.f
    public a e() {
        return this.f30570a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof f) {
            f fVar = (f) obj;
            if (this.f30570a.equals(fVar.e()) && this.f30571b.equals(fVar.h())) {
                return true;
            }
        }
        return false;
    }

    @Override // p122n4.f
    public Map h() {
        return this.f30571b;
    }

    public int hashCode() {
        return ((this.f30570a.hashCode() ^ 1000003) * 1000003) ^ this.f30571b.hashCode();
    }

    public String toString() {
        return "SchedulerConfig{clock=" + this.f30570a + ", values=" + this.f30571b + "}";
    }
}
