package E1;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f2101a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f2102b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final p f2103c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f2104d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f2105e;

    public g() {
        this(false, false, null, false, false, 31, null);
    }

    public final boolean a() {
        return this.f2105e;
    }

    public final boolean b() {
        return this.f2101a;
    }

    public final boolean c() {
        return this.f2102b;
    }

    public final p d() {
        return this.f2103c;
    }

    public final boolean e() {
        return this.f2104d;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f2101a == gVar.f2101a && this.f2102b == gVar.f2102b && this.f2103c == gVar.f2103c && this.f2104d == gVar.f2104d && this.f2105e == gVar.f2105e;
    }

    public int hashCode() {
        return (((((((Boolean.hashCode(this.f2101a) * 31) + Boolean.hashCode(this.f2102b)) * 31) + this.f2103c.hashCode()) * 31) + Boolean.hashCode(this.f2104d)) * 31) + Boolean.hashCode(this.f2105e);
    }

    public g(boolean z8, boolean z9, p pVar, boolean z10, boolean z11) {
        this.f2101a = z8;
        this.f2102b = z9;
        this.f2103c = pVar;
        this.f2104d = z10;
        this.f2105e = z11;
    }

    public /* synthetic */ g(boolean z8, boolean z9, p pVar, boolean z10, boolean z11, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? true : z8, (i8 & 2) != 0 ? true : z9, (i8 & 4) != 0 ? p.f2155a : pVar, (i8 & 8) != 0 ? true : z10, (i8 & 16) != 0 ? true : z11);
    }

    public /* synthetic */ g(boolean z8, boolean z9, p pVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? true : z8, (i8 & 2) != 0 ? true : z9, (i8 & 4) != 0 ? p.f2155a : pVar);
    }

    public g(boolean z8, boolean z9, p pVar) {
        this(z8, z9, pVar, true, true);
    }
}
