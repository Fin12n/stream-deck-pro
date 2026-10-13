package p215z0;

import kotlin.jvm.internal.t;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public final class V {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f38682a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f38683b;

    public V(Object obj, Object obj2) {
        this.f38682a = obj;
        this.f38683b = obj2;
    }

    public final Object a() {
        return this.f38682a;
    }

    public final Object b() {
        return this.f38683b;
    }

    public final int c(Object obj) {
        if (obj instanceof Enum) {
            return ((Enum) obj).ordinal();
        }
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V)) {
            return false;
        }
        V v8 = (V) obj;
        return t.c(this.f38682a, v8.f38682a) && t.c(this.f38683b, v8.f38683b);
    }

    public int hashCode() {
        return (c(this.f38682a) * 31) + c(this.f38683b);
    }

    public String toString() {
        return "JoinedKey(left=" + this.f38682a + ", right=" + this.f38683b + ')';
    }
}
