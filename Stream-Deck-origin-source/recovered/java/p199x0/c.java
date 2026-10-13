package p199x0;

import Q0.h;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final h f37180a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f37181b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final boolean f37182c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public final boolean f37183d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public final boolean f37184e;

    public c(h hVar, boolean z8, boolean z9, boolean z10, boolean z11) {
        this.f37180a = hVar;
        this.f37181b = z8;
        this.f37182c = z9;
        this.f37183d = z10;
        this.f37184e = z11;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return t.c(this.f37180a, cVar.f37180a) && this.f37181b == cVar.f37181b && this.f37182c == cVar.f37182c && this.f37183d == cVar.f37183d && this.f37184e == cVar.f37184e;
    }

    public int hashCode() {
        return (((((((this.f37180a.hashCode() * 31) + Boolean.hashCode(this.f37181b)) * 31) + Boolean.hashCode(this.f37182c)) * 31) + Boolean.hashCode(this.f37183d)) * 31) + Boolean.hashCode(this.f37184e);
    }

    public String toString() {
        return "HingeInfo(bounds=" + this.f37180a + ", isFlat=" + this.f37181b + ", isVertical=" + this.f37182c + ", isSeparating=" + this.f37183d + ", isOccluding=" + this.f37184e + ')';
    }
}
