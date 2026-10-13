package Q;

import java.util.List;

/* JADX INFO: renamed from: Q.c, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C1554c extends W.b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final N f9009a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f9010b;

    public C1554c(N n8, List list) {
        if (n8 == null) {
            throw new NullPointerException("Null surfaceEdge");
        }
        this.f9009a = n8;
        if (list == null) {
            throw new NullPointerException("Null outConfigs");
        }
        this.f9010b = list;
    }

    @Override // Q.W.b
    public List a() {
        return this.f9010b;
    }

    @Override // Q.W.b
    public N b() {
        return this.f9009a;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof W.b) {
            W.b bVar = (W.b) obj;
            if (this.f9009a.equals(bVar.b()) && this.f9010b.equals(bVar.a())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.f9009a.hashCode() ^ 1000003) * 1000003) ^ this.f9010b.hashCode();
    }

    public String toString() {
        return "In{surfaceEdge=" + this.f9009a + ", outConfigs=" + this.f9010b + "}";
    }
}
