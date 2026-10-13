package C6;

import java.io.Serializable;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes2.dex */
public final class u implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f1452a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f1453b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public final Object f1454c;

    public u(Object obj, Object obj2, Object obj3) {
        this.f1452a = obj;
        this.f1453b = obj2;
        this.f1454c = obj3;
    }

    public final Object a() {
        return this.f1452a;
    }

    public final Object b() {
        return this.f1453b;
    }

    public final Object c() {
        return this.f1454c;
    }

    public final Object d() {
        return this.f1452a;
    }

    public final Object e() {
        return this.f1453b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return kotlin.jvm.internal.t.c(this.f1452a, uVar.f1452a) && kotlin.jvm.internal.t.c(this.f1453b, uVar.f1453b) && kotlin.jvm.internal.t.c(this.f1454c, uVar.f1454c);
    }

    public final Object f() {
        return this.f1454c;
    }

    public int hashCode() {
        Object obj = this.f1452a;
        int iHashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        Object obj2 = this.f1453b;
        int iHashCode2 = (iHashCode + (obj2 == null ? 0 : obj2.hashCode())) * 31;
        Object obj3 = this.f1454c;
        return iHashCode2 + (obj3 != null ? obj3.hashCode() : 0);
    }

    public String toString() {
        return '(' + this.f1452a + ", " + this.f1453b + ", " + this.f1454c + ')';
    }
}
