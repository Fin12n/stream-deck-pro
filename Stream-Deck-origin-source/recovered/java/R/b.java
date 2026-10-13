package R;

import Q.N;
import V.ocy.SVzBK;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class b extends r.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f9234a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final N f9235b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final List f9236c;

    public b(N n8, N n9, List list) {
        if (n8 == null) {
            throw new NullPointerException("Null primarySurfaceEdge");
        }
        this.f9234a = n8;
        if (n9 == null) {
            throw new NullPointerException("Null secondarySurfaceEdge");
        }
        this.f9235b = n9;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f9236c = list;
    }

    @Override // R.r.b
    public List a() {
        return this.f9236c;
    }

    @Override // R.r.b
    public N b() {
        return this.f9234a;
    }

    @Override // R.r.b
    public N c() {
        return this.f9235b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof r.b) {
            r.b bVar = (r.b) obj;
            if (this.f9234a.equals(bVar.b()) && this.f9235b.equals(bVar.c()) && this.f9236c.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((this.f9234a.hashCode() ^ 1000003) * 1000003) ^ this.f9235b.hashCode()) * 1000003) ^ this.f9236c.hashCode();
    }

    public String toString() {
        return "In{primarySurfaceEdge=" + this.f9234a + ", secondarySurfaceEdge=" + this.f9235b + ", outConfigs=" + this.f9236c + SVzBK.tvJLtuZapCA;
    }
}
