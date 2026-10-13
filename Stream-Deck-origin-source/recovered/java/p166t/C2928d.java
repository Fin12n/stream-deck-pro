package p166t;

import H.c1;
import H.g1;
import H.u1;
import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: t.d, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C2928d extends T.k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f33633a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Class f33634b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final c1 f33635c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final u1 f33636d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f33637e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final g1 f33638f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final List f33639g;

    public C2928d(String str, Class cls, c1 c1Var, u1 u1Var, Size size, g1 g1Var, List list) {
        if (str == null) {
            throw new NullPointerException("Null useCaseId");
        }
        this.f33633a = str;
        if (cls == null) {
            throw new NullPointerException("Null useCaseType");
        }
        this.f33634b = cls;
        if (c1Var == null) {
            throw new NullPointerException("Null sessionConfig");
        }
        this.f33635c = c1Var;
        if (u1Var == null) {
            throw new NullPointerException("Null useCaseConfig");
        }
        this.f33636d = u1Var;
        this.f33637e = size;
        this.f33638f = g1Var;
        this.f33639g = list;
    }

    @Override // t.T.k
    public List c() {
        return this.f33639g;
    }

    @Override // t.T.k
    public c1 d() {
        return this.f33635c;
    }

    @Override // t.T.k
    public g1 e() {
        return this.f33638f;
    }

    public boolean equals(Object obj) {
        Size size;
        g1 g1Var;
        List list;
        if (obj == this) {
            return true;
        }
        if (obj instanceof T.k) {
            T.k kVar = (T.k) obj;
            if (this.f33633a.equals(kVar.h()) && this.f33634b.equals(kVar.i()) && this.f33635c.equals(kVar.d()) && this.f33636d.equals(kVar.g()) && ((size = this.f33637e) != null ? size.equals(kVar.f()) : kVar.f() == null) && ((g1Var = this.f33638f) != null ? g1Var.equals(kVar.e()) : kVar.e() == null) && ((list = this.f33639g) != null ? list.equals(kVar.c()) : kVar.c() == null)) {
                return true;
            }
        }
        return false;
    }

    @Override // t.T.k
    public Size f() {
        return this.f33637e;
    }

    @Override // t.T.k
    public u1 g() {
        return this.f33636d;
    }

    @Override // t.T.k
    public String h() {
        return this.f33633a;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f33633a.hashCode() ^ 1000003) * 1000003) ^ this.f33634b.hashCode()) * 1000003) ^ this.f33635c.hashCode()) * 1000003) ^ this.f33636d.hashCode()) * 1000003;
        Size size = this.f33637e;
        int iHashCode2 = (iHashCode ^ (size == null ? 0 : size.hashCode())) * 1000003;
        g1 g1Var = this.f33638f;
        int iHashCode3 = (iHashCode2 ^ (g1Var == null ? 0 : g1Var.hashCode())) * 1000003;
        List list = this.f33639g;
        return iHashCode3 ^ (list != null ? list.hashCode() : 0);
    }

    @Override // t.T.k
    public Class i() {
        return this.f33634b;
    }

    public String toString() {
        return "UseCaseInfo{useCaseId=" + this.f33633a + ", useCaseType=" + this.f33634b + ", sessionConfig=" + this.f33635c + ", useCaseConfig=" + this.f33636d + ", surfaceResolution=" + this.f33637e + ", streamSpec=" + this.f33638f + ", captureTypes=" + this.f33639g + "}";
    }
}
