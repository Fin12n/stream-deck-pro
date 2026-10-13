package G;

import A.InterfaceC0880k0;
import E4.JFpq.XRlnZWSrAFn;
import Q.C1571u;
import android.util.Size;
import java.util.List;

/* JADX INFO: renamed from: G.b, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0943b extends C0960t.c {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Size f2528f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final int f2529g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final List f2530h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final boolean f2531i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final F f2532j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final C1571u f2533k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final C1571u f2534l;

    public C0943b(Size size, int i8, List list, boolean z8, InterfaceC0880k0 interfaceC0880k0, F f8, C1571u c1571u, C1571u c1571u2) {
        if (size == null) {
            throw new NullPointerException("Null size");
        }
        this.f2528f = size;
        this.f2529g = i8;
        if (list == null) {
            throw new NullPointerException("Null outputFormats");
        }
        this.f2530h = list;
        this.f2531i = z8;
        this.f2532j = f8;
        if (c1571u == null) {
            throw new NullPointerException("Null requestEdge");
        }
        this.f2533k = c1571u;
        if (c1571u2 == null) {
            throw new NullPointerException("Null errorEdge");
        }
        this.f2534l = c1571u2;
    }

    @Override // G.C0960t.c
    public C1571u b() {
        return this.f2534l;
    }

    @Override // G.C0960t.c
    public InterfaceC0880k0 c() {
        return null;
    }

    @Override // G.C0960t.c
    public int d() {
        return this.f2529g;
    }

    @Override // G.C0960t.c
    public List e() {
        return this.f2530h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C0960t.c) {
            C0960t.c cVar = (C0960t.c) obj;
            if (this.f2528f.equals(cVar.k()) && this.f2529g == cVar.d() && this.f2530h.equals(cVar.e()) && this.f2531i == cVar.m()) {
                cVar.c();
                F f8 = this.f2532j;
                if (f8 != null ? f8.equals(cVar.f()) : cVar.f() == null) {
                    if (this.f2533k.equals(cVar.h()) && this.f2534l.equals(cVar.b())) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // G.C0960t.c
    public F f() {
        return this.f2532j;
    }

    @Override // G.C0960t.c
    public C1571u h() {
        return this.f2533k;
    }

    public int hashCode() {
        int iHashCode = (((((((this.f2528f.hashCode() ^ 1000003) * 1000003) ^ this.f2529g) * 1000003) ^ this.f2530h.hashCode()) * 1000003) ^ (this.f2531i ? 1231 : 1237)) * (-721379959);
        F f8 = this.f2532j;
        return ((((iHashCode ^ (f8 == null ? 0 : f8.hashCode())) * 1000003) ^ this.f2533k.hashCode()) * 1000003) ^ this.f2534l.hashCode();
    }

    @Override // G.C0960t.c
    public Size k() {
        return this.f2528f;
    }

    @Override // G.C0960t.c
    public boolean m() {
        return this.f2531i;
    }

    public String toString() {
        return "In{size=" + this.f2528f + ", inputFormat=" + this.f2529g + ", outputFormats=" + this.f2530h + ", virtualCamera=" + this.f2531i + XRlnZWSrAFn.OMm + ((Object) null) + ", postviewSettings=" + this.f2532j + ", requestEdge=" + this.f2533k + ", errorEdge=" + this.f2534l + "}";
    }
}
