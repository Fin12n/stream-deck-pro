package p058g3;

import T1.e;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public Object f23720a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Object f23721b;

    public static boolean a(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public void b(Object obj, Object obj2) {
        this.f23720a = obj;
        this.f23721b = obj2;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return a(eVar.f9823a, this.f23720a) && a(eVar.f9824b, this.f23721b);
    }

    public int hashCode() {
        Object obj = this.f23720a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f23721b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f23720a + " " + this.f23721b + "}";
    }
}
