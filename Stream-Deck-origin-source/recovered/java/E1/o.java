package E1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2148a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2149b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f2150c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final p f2151d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2152e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public final boolean f2153f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public final boolean f2154g;

    public o() {
        this(false, false, false, null, false, false, false, 127, null);
    }

    public final boolean a() {
        return this.f2153f;
    }

    public final boolean b() {
        return this.f2149b;
    }

    public final boolean c() {
        return this.f2150c;
    }

    public final boolean d() {
        return this.f2152e;
    }

    public final boolean e() {
        return this.f2148a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f2148a == oVar.f2148a && this.f2149b == oVar.f2149b && this.f2150c == oVar.f2150c && this.f2151d == oVar.f2151d && this.f2152e == oVar.f2152e && this.f2153f == oVar.f2153f && this.f2154g == oVar.f2154g;
    }

    public final p f() {
        return this.f2151d;
    }

    public final boolean g() {
        return this.f2154g;
    }

    public int hashCode() {
        return (((((((((((((Boolean.hashCode(this.f2149b) * 31) + Boolean.hashCode(this.f2148a)) * 31) + Boolean.hashCode(this.f2149b)) * 31) + Boolean.hashCode(this.f2150c)) * 31) + this.f2151d.hashCode()) * 31) + Boolean.hashCode(this.f2152e)) * 31) + Boolean.hashCode(this.f2153f)) * 31) + Boolean.hashCode(this.f2154g);
    }

    public o(boolean z8, boolean z9, boolean z10, p pVar, boolean z11, boolean z12, boolean z13) {
        this.f2148a = z8;
        this.f2149b = z9;
        this.f2150c = z10;
        this.f2151d = pVar;
        this.f2152e = z11;
        this.f2153f = z12;
        this.f2154g = z13;
    }

    public /* synthetic */ o(boolean z8, boolean z9, boolean z10, p pVar, boolean z11, boolean z12, boolean z13, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? true : z9, (i8 & 4) != 0 ? true : z10, (i8 & 8) != 0 ? p.f2155a : pVar, (i8 & 16) != 0 ? true : z11, (i8 & 32) != 0 ? true : z12, (i8 & 64) != 0 ? false : z13);
    }

    public /* synthetic */ o(boolean z8, boolean z9, boolean z10, p pVar, boolean z11, boolean z12, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8, (i8 & 2) != 0 ? true : z9, (i8 & 4) != 0 ? true : z10, (i8 & 8) != 0 ? p.f2155a : pVar, (i8 & 16) != 0 ? true : z11, (i8 & 32) != 0 ? true : z12);
    }

    public o(boolean z8, boolean z9, boolean z10, p pVar, boolean z11, boolean z12) {
        this(z8, z9, z10, pVar, z11, z12, false);
    }
}
