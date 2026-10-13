package V0;

import R0.AbstractC1582d0;
import R0.J0;
import R0.V0;
import R0.W0;
import java.util.List;
import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class r extends p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f10442a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final List f10443b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final int f10444c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final AbstractC1582d0 f10445d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final float f10446e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final AbstractC1582d0 f10447f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final float f10448g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public final float f10449h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public final int f10450i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public final int f10451j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public final float f10452k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public final float f10453l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public final float f10454m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public final float f10455n;

    public /* synthetic */ r(String str, List list, int i8, AbstractC1582d0 abstractC1582d0, float f8, AbstractC1582d0 abstractC1582d1, float f9, float f10, int i9, int i10, float f11, float f12, float f13, float f14, AbstractC2633k abstractC2633k) {
        this(str, list, i8, abstractC1582d0, f8, abstractC1582d1, f9, f10, i9, i10, f11, f12, f13, f14);
    }

    public final int A() {
        return this.f10450i;
    }

    public final int D() {
        return this.f10451j;
    }

    public final float E() {
        return this.f10452k;
    }

    public final float F() {
        return this.f10449h;
    }

    public final float G() {
        return this.f10454m;
    }

    public final float H() {
        return this.f10455n;
    }

    public final float I() {
        return this.f10453l;
    }

    public final AbstractC1582d0 c() {
        return this.f10445d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && r.class == obj.getClass()) {
            r rVar = (r) obj;
            return t.c(this.f10442a, rVar.f10442a) && t.c(this.f10445d, rVar.f10445d) && this.f10446e == rVar.f10446e && t.c(this.f10447f, rVar.f10447f) && this.f10448g == rVar.f10448g && this.f10449h == rVar.f10449h && V0.e(this.f10450i, rVar.f10450i) && W0.e(this.f10451j, rVar.f10451j) && this.f10452k == rVar.f10452k && this.f10453l == rVar.f10453l && this.f10454m == rVar.f10454m && this.f10455n == rVar.f10455n && J0.d(this.f10444c, rVar.f10444c) && t.c(this.f10443b, rVar.f10443b);
        }
        return false;
    }

    public int hashCode() {
        int iHashCode = ((this.f10442a.hashCode() * 31) + this.f10443b.hashCode()) * 31;
        AbstractC1582d0 abstractC1582d0 = this.f10445d;
        int iHashCode2 = (((iHashCode + (abstractC1582d0 != null ? abstractC1582d0.hashCode() : 0)) * 31) + Float.hashCode(this.f10446e)) * 31;
        AbstractC1582d0 abstractC1582d1 = this.f10447f;
        return ((((((((((((((((((iHashCode2 + (abstractC1582d1 != null ? abstractC1582d1.hashCode() : 0)) * 31) + Float.hashCode(this.f10448g)) * 31) + Float.hashCode(this.f10449h)) * 31) + V0.f(this.f10450i)) * 31) + W0.f(this.f10451j)) * 31) + Float.hashCode(this.f10452k)) * 31) + Float.hashCode(this.f10453l)) * 31) + Float.hashCode(this.f10454m)) * 31) + Float.hashCode(this.f10455n)) * 31) + J0.e(this.f10444c);
    }

    public final float m() {
        return this.f10446e;
    }

    public final String o() {
        return this.f10442a;
    }

    public final List s() {
        return this.f10443b;
    }

    public final int t() {
        return this.f10444c;
    }

    public final AbstractC1582d0 u() {
        return this.f10447f;
    }

    public final float y() {
        return this.f10448g;
    }

    public /* synthetic */ r(String str, List list, int i8, AbstractC1582d0 abstractC1582d0, float f8, AbstractC1582d0 abstractC1582d1, float f9, float f10, int i9, int i10, float f11, float f12, float f13, float f14, int i11, AbstractC2633k abstractC2633k) {
        this((i11 & 1) != 0 ? "" : str, list, i8, (i11 & 8) != 0 ? null : abstractC1582d0, (i11 & 16) != 0 ? 1.0f : f8, (i11 & 32) != 0 ? null : abstractC1582d1, (i11 & 64) != 0 ? 1.0f : f9, (i11 & 128) != 0 ? 0.0f : f10, (i11 & 256) != 0 ? o.c() : i9, (i11 & 512) != 0 ? o.d() : i10, (i11 & 1024) != 0 ? 4.0f : f11, (i11 & 2048) != 0 ? 0.0f : f12, (i11 & 4096) != 0 ? 1.0f : f13, (i11 & 8192) != 0 ? 0.0f : f14, null);
    }

    public r(String str, List list, int i8, AbstractC1582d0 abstractC1582d0, float f8, AbstractC1582d0 abstractC1582d1, float f9, float f10, int i9, int i10, float f11, float f12, float f13, float f14) {
        super(null);
        this.f10442a = str;
        this.f10443b = list;
        this.f10444c = i8;
        this.f10445d = abstractC1582d0;
        this.f10446e = f8;
        this.f10447f = abstractC1582d1;
        this.f10448g = f9;
        this.f10449h = f10;
        this.f10450i = i9;
        this.f10451j = i10;
        this.f10452k = f11;
        this.f10453l = f12;
        this.f10454m = f13;
        this.f10455n = f14;
    }
}
