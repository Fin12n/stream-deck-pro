package M3;

import kotlin.jvm.internal.AbstractC2633k;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class c implements a {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f5134a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final d f5135b;

    /* JADX WARN: Multi-variable type inference failed */
    public c() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    @Override // M3.a
    public d a() {
        return this.f5135b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return kotlin.jvm.internal.t.c(this.f5134a, cVar.f5134a) && kotlin.jvm.internal.t.c(this.f5135b, cVar.f5135b);
    }

    @Override // M3.a
    public String getDescription() {
        return this.f5134a;
    }

    public int hashCode() {
        String str = this.f5134a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        d dVar = this.f5135b;
        return iHashCode + (dVar != null ? dVar.hashCode() : 0);
    }

    public String toString() {
        return "ClosedByServer(description=" + this.f5134a + ", error=" + this.f5135b + ")";
    }

    public c(String str, d dVar) {
        this.f5134a = str;
        this.f5135b = dVar;
    }

    public /* synthetic */ c(String str, d dVar, int i8, AbstractC2633k abstractC2633k) {
        this((i8 & 1) != 0 ? null : str, (i8 & 2) != 0 ? null : dVar);
    }
}
