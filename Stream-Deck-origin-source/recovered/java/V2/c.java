package V2;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final boolean f10543a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final boolean f10544b;

    /* JADX WARN: Illegal instructions before constructor call */
    public c() {
        boolean z8 = false;
        this(z8, z8, 3, null);
    }

    public final boolean a() {
        return this.f10543a;
    }

    public final boolean b() {
        return this.f10544b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f10543a == cVar.f10543a && this.f10544b == cVar.f10544b;
    }

    public int hashCode() {
        return (Boolean.hashCode(this.f10543a) * 31) + Boolean.hashCode(this.f10544b);
    }

    public String toString() {
        return "NavigatorDisposeBehavior(disposeNestedNavigators=" + this.f10543a + ", disposeSteps=" + this.f10544b + ')';
    }

    public c(boolean z8, boolean z9) {
        this.f10543a = z8;
        this.f10544b = z9;
    }

    public /* synthetic */ c(boolean z8, boolean z9, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? true : z8, (i8 & 2) != 0 ? true : z9);
    }
}
