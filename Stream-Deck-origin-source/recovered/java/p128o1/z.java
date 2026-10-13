package p128o1;

import kotlin.jvm.internal.AbstractC2633k;
import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class z {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final y f30866a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final x f30867b;

    public /* synthetic */ z(int i8, AbstractC2633k abstractC2633k) {
        this(i8);
    }

    public final x a() {
        return this.f30867b;
    }

    public final y b() {
        return this.f30866a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z)) {
            return false;
        }
        z zVar = (z) obj;
        return t.c(this.f30867b, zVar.f30867b) && t.c(this.f30866a, zVar.f30866a);
    }

    public int hashCode() {
        y yVar = this.f30866a;
        int iHashCode = (yVar != null ? yVar.hashCode() : 0) * 31;
        x xVar = this.f30867b;
        return iHashCode + (xVar != null ? xVar.hashCode() : 0);
    }

    public String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f30866a + ", paragraphSyle=" + this.f30867b + ')';
    }

    public z(y yVar, x xVar) {
        this.f30866a = yVar;
        this.f30867b = xVar;
    }

    public /* synthetic */ z(boolean z8, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? false : z8);
    }

    public z(boolean z8) {
        this((y) null, new x(z8));
    }

    public z(int i8) {
        this((y) null, new x(i8, (AbstractC2633k) null));
    }
}
