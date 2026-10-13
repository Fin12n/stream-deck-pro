package H;

import android.util.Size;
import java.util.Map;
import p201x2.vAk.kDsnNkYbBsI;

/* JADX INFO: renamed from: H.n, reason: case insensitive filesystem */
/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class C0993n extends k1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Size f3137a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Map f3138b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Size f3139c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final Map f3140d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final Size f3141e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final Map f3142f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final Map f3143g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final Map f3144h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final Map f3145i;

    @Override // H.k1
    public Size b() {
        return this.f3137a;
    }

    @Override // H.k1
    public Map d() {
        return this.f3144h;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof k1) {
            k1 k1Var = (k1) obj;
            if (this.f3137a.equals(k1Var.b()) && this.f3138b.equals(k1Var.n()) && this.f3139c.equals(k1Var.i()) && this.f3140d.equals(k1Var.l()) && this.f3141e.equals(k1Var.j()) && this.f3142f.equals(k1Var.h()) && this.f3143g.equals(k1Var.f()) && this.f3144h.equals(k1Var.d()) && this.f3145i.equals(k1Var.p())) {
                return true;
            }
        }
        return false;
    }

    @Override // H.k1
    public Map f() {
        return this.f3143g;
    }

    @Override // H.k1
    public Map h() {
        return this.f3142f;
    }

    public int hashCode() {
        return ((((((((((((((((this.f3137a.hashCode() ^ 1000003) * 1000003) ^ this.f3138b.hashCode()) * 1000003) ^ this.f3139c.hashCode()) * 1000003) ^ this.f3140d.hashCode()) * 1000003) ^ this.f3141e.hashCode()) * 1000003) ^ this.f3142f.hashCode()) * 1000003) ^ this.f3143g.hashCode()) * 1000003) ^ this.f3144h.hashCode()) * 1000003) ^ this.f3145i.hashCode();
    }

    @Override // H.k1
    public Size i() {
        return this.f3139c;
    }

    @Override // H.k1
    public Size j() {
        return this.f3141e;
    }

    @Override // H.k1
    public Map l() {
        return this.f3140d;
    }

    @Override // H.k1
    public Map n() {
        return this.f3138b;
    }

    @Override // H.k1
    public Map p() {
        return this.f3145i;
    }

    public String toString() {
        return "SurfaceSizeDefinition{analysisSize=" + this.f3137a + ", s720pSizeMap=" + this.f3138b + ", previewSize=" + this.f3139c + ", s1440pSizeMap=" + this.f3140d + ", recordSize=" + this.f3141e + ", maximumSizeMap=" + this.f3142f + ", maximum4x3SizeMap=" + this.f3143g + ", maximum16x9SizeMap=" + this.f3144h + ", ultraMaximumSizeMap=" + this.f3145i + "}";
    }

    public C0993n(Size size, Map map, Size size2, Map map2, Size size3, Map map3, Map map4, Map map5, Map map6) {
        if (size != null) {
            this.f3137a = size;
            if (map != null) {
                this.f3138b = map;
                if (size2 != null) {
                    this.f3139c = size2;
                    if (map2 != null) {
                        this.f3140d = map2;
                        if (size3 != null) {
                            this.f3141e = size3;
                            if (map3 != null) {
                                this.f3142f = map3;
                                if (map4 != null) {
                                    this.f3143g = map4;
                                    if (map5 != null) {
                                        this.f3144h = map5;
                                        if (map6 != null) {
                                            this.f3145i = map6;
                                            return;
                                        }
                                        throw new NullPointerException("Null ultraMaximumSizeMap");
                                    }
                                    throw new NullPointerException(kDsnNkYbBsI.VfiOpiVvEwPDurZ);
                                }
                                throw new NullPointerException("Null maximum4x3SizeMap");
                            }
                            throw new NullPointerException("Null maximumSizeMap");
                        }
                        throw new NullPointerException("Null recordSize");
                    }
                    throw new NullPointerException("Null s1440pSizeMap");
                }
                throw new NullPointerException("Null previewSize");
            }
            throw new NullPointerException("Null s720pSizeMap");
        }
        throw new NullPointerException("Null analysisSize");
    }
}
