package G;

import Q.C1571u;
import java.util.List;

/* JADX INFO: renamed from: G.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0945d extends P.a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final C1571u f2547a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final C1571u f2548b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f2549c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final List f2550d;

    public C0945d(C1571u c1571u, C1571u c1571u2, int i8, List list) {
        if (c1571u == null) {
            throw new NullPointerException("Null edge");
        }
        this.f2547a = c1571u;
        if (c1571u2 == null) {
            throw new NullPointerException("Null postviewEdge");
        }
        this.f2548b = c1571u2;
        this.f2549c = i8;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f2550d = list;
    }

    @Override // G.P.a
    public C1571u a() {
        return this.f2547a;
    }

    @Override // G.P.a
    public int b() {
        return this.f2549c;
    }

    @Override // G.P.a
    public List c() {
        return this.f2550d;
    }

    @Override // G.P.a
    public C1571u d() {
        return this.f2548b;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof P.a) {
            P.a aVar = (P.a) obj;
            if (this.f2547a.equals(aVar.a()) && this.f2548b.equals(aVar.d()) && this.f2549c == aVar.b() && this.f2550d.equals(aVar.c())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((((((this.f2547a.hashCode() ^ 1000003) * 1000003) ^ this.f2548b.hashCode()) * 1000003) ^ this.f2549c) * 1000003) ^ this.f2550d.hashCode();
    }

    public String toString() {
        return "In{edge=" + this.f2547a + ", postviewEdge=" + this.f2548b + ", inputFormat=" + this.f2549c + ", outputFormats=" + this.f2550d + "}";
    }
}
