package p065h1;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class N0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final String f24145a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f24146b;

    public N0(String str, Object obj) {
        this.f24145a = str;
        this.f24146b = obj;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof N0)) {
            return false;
        }
        N0 n8 = (N0) obj;
        return t.c(this.f24145a, n8.f24145a) && t.c(this.f24146b, n8.f24146b);
    }

    public int hashCode() {
        int iHashCode = this.f24145a.hashCode() * 31;
        Object obj = this.f24146b;
        return iHashCode + (obj == null ? 0 : obj.hashCode());
    }

    public String toString() {
        return "ValueElement(name=" + this.f24145a + ", value=" + this.f24146b + ')';
    }
}
