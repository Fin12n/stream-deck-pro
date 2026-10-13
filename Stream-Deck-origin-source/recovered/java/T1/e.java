package T1;

/* JADX INFO: compiled from: r8-map-id-d2b8b817bee19149903c97665668e348829d773948801672ae9b3443593db2ce */
/* JADX INFO: loaded from: classes.dex */
public class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final Object f9823a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public final Object f9824b;

    public e(Object obj, Object obj2) {
        this.f9823a = obj;
        this.f9824b = obj2;
    }

    public static e a(Object obj, Object obj2) {
        return new e(obj, obj2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return d.a(eVar.f9823a, this.f9823a) && d.a(eVar.f9824b, this.f9824b);
    }

    public int hashCode() {
        Object obj = this.f9823a;
        int iHashCode = obj == null ? 0 : obj.hashCode();
        Object obj2 = this.f9824b;
        return iHashCode ^ (obj2 != null ? obj2.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + this.f9823a + " " + this.f9824b + "}";
    }
}
