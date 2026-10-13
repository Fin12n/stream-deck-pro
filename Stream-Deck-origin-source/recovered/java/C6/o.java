package C6;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1439a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1440b;

    public o(Object obj, Object obj2) {
        this.f1439a = obj;
        this.f1440b = obj2;
    }

    public final Object a() {
        return this.f1439a;
    }

    public final Object b() {
        return this.f1440b;
    }

    public final Object c() {
        return this.f1439a;
    }

    public final Object d() {
        return this.f1440b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return kotlin.jvm.internal.t.c(this.f1439a, oVar.f1439a) && kotlin.jvm.internal.t.c(this.f1440b, oVar.f1440b);
    }

    public int hashCode() {
        Object obj = this.f1439a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1440b;
        return iHashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f1439a + ", " + this.f1440b + ')';
    }
}
